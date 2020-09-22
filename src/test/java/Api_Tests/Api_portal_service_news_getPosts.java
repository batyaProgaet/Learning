package Api_Tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.Header;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Api_portal_service_news_getPosts extends Abstract_test {

    private static String Path_news = "/api/portal-service/news/getPosts?pageNumber=0&pageSize=1&state=ALL&sortDirection=ASC&searchString=&sortFields=id&type=NEWS";
    //private static String Path_afisha = "/api/portal-service/news/getPosts?pageNumber=0&pageSize=1&state=ALL&sortDirection=ASC&searchString=&sortFields=id&type=AFISHA";
    //private static String Path_createNews = "";

    @BeforeEach
    public void req() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("Cookie", token));
        response = get(baseUrl, Path_news, headers);
    }

    @Test
    @Order(1)
    public void Test_Shema() {
        //проверка схемы
        try {
            response.then()
                    .assertThat()
                    .body(matchesJsonSchemaInClasspath("Shemas/News_shema.json"));
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
        response = get(baseUrl, Path_news, headers);
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
        response = get(baseUrl, Path_news, headers);
        Assertions.assertEquals(response.getStatusCode(), 403, "Uncorrect status code");
    }

    
    
    
    @AfterEach// @AfterAll
    public void t2() {

    }
}
