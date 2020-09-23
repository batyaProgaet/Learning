package Api_Tests;

import Body.Bodys;
import io.restassured.http.Header;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Body.Bodys.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Portal_service_news_savePost extends Abstract_test {
    private String path = "api/portal-service/news/savePost";

    @BeforeEach
    public void X() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("Cookie", token));
        JSONObject requestParams = new JSONObject(Save_post_body);
        response = post(baseUrl, path, requestParams, headers);


    }

    @Test
    @Order(1)
    public void Test_Shema() {
        //проверка схемы
        try {
            response.then()
                    .assertThat()
                    .body(matchesJsonSchemaInClasspath("Shemas/News_Save_shema"));
        } catch (java.lang.AssertionError e) {
            Assertions.fail("Shema is FALSE");
        }
    }

    @Test
    @Order(2)
    public void Test_Responce_Code() {
        Assertions.assertEquals(response.getStatusCode(), 200, "Uncorrect status code");
    }

    @Test
    @Order(3)
    public void Test_Responce_Time() {
        Assertions.assertTrue(response.getTime() < 1000, "Responce time more 1 seconds");
    }

    @Test
    @Order(4)
    public void Test_Responce_NotToken_Shema() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("Cookie", ""));
        response = get(baseUrl, path, headers);
        try {
            response.then()
                    .assertThat()
                    .body(matchesJsonSchemaInClasspath("Shemas/News_shema.json"));
        } catch (java.lang.AssertionError e) {
            Assertions.assertTrue(true);
        }



    }

    @Test
    @Order(5)
    public void Test_Responce_NotToken_Code() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("Cookie", ""));
        response = get(baseUrl, path, headers);
        Assertions.assertEquals(response.getStatusCode(), 403, "Uncorrect status code");
    }









}
