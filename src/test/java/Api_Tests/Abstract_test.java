/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api_Tests;

import io.restassured.http.Header;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class Abstract_test extends Abstract_request {

    public static final String baseUrl = "https://ucso-test.opencode.su";
    private static final String path_login = "/api/oauth/token";
    public static String token = ""; // положим сюды токен

    private Response x;
    protected Response response;

    @BeforeEach//@BeforeAll

    protected void login() { // авторизация
        JSONObject requestParams = new JSONObject();
        requestParams.put("grant_type", "password");
        requestParams.put("scope", "ui");
        requestParams.put("username", "admin1");
        requestParams.put("password", "1");

        List<Header> list = new ArrayList<Header>();
        list.add(new Header("Authorization", "Basic YnJvd3NlcjoxMjM0"));

        x = post(baseUrl, path_login, requestParams, list);
        token = x.header("Set-Cookie").split(";")[0];

   
        //System.out.println(token);
    }

}
