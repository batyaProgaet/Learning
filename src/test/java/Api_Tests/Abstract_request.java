/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api_Tests;


import static io.restassured.RestAssured.given;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author berestov
 */
public abstract class Abstract_request {

    protected Response post(String host, String path, JSONObject request_body, List<Header> list) {
        Headers header = new Headers(list);
        Response r = given()
                .headers(header)
                .baseUri(host)
                .contentType("application/json")
                .body(request_body.toString())
                .when()
                .post(path);

        return r;
    }

    protected Response post(String host, String path, JSONObject request_body) {
        Response r = given()
                .baseUri(host)
                .contentType("application/json")
                .body(request_body.toString())
                .when()
                .post(path);
        return r;
    }

    protected Response get(String host, String path, List<Header> list) {

        Headers header = new Headers(list);
        Response r = given()
                .headers(header)
                .baseUri(host)
                .contentType("application/json")
                .when()
                .get(path);
        return r;

    }

    protected Response get(String host, String path) {

        Response r = given()
                .baseUri(host)
                .contentType("application/json")
                .when()
                .get(path);
        return r;

    }

}
