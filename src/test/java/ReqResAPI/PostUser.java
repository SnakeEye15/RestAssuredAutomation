package ReqResAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostUser {
    @Test
    public void Test_postOneUser(){

       /** Map<String,Object> map= new HashMap();
        map.put("Name","Dheeraj");
        map.put("job","Engineer");
        System.out.println(map);
        JSONObject request=new JSONObject(map);
        System.out.println(request);**/

       JSONObject req=new JSONObject();
        req.put("Name","Dheeraj");
        req.put("job","Engineer");
        System.out.println(req.toJSONString());

        baseURI="https://reqres.in/api";

        given().
                header("x-api-key","reqres-free-v1") .
                body(req.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).log().all();
    }

    @Test
    public void Register_user_successfully_Test(){

        baseURI="https://reqres.in";

        JSONObject data=new JSONObject();
        data.put("email","eve.holt@reqres.in");
        data.put("password","pistol");

        given()
                .header("Content-Type", "application/json")
                .header("x-api-key","reqres-free-v1")
                .body(data.toJSONString())
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body("id", notNullValue())
                .body("token", notNullValue())
                .log().all();
    }
    @Test
    public void Register_user_unsuccessfully_Test(){
        baseURI="https://reqres.in";

        JSONObject data=new JSONObject();
        data.put("email","sydney@fife");

        given()
                .header("Content-Type","application/json")
                .header("x-api-key","reqres-free-v1")
                .body(data.toJSONString()).
        when()
                .post("/api/register").
        then()
                .statusCode(400)
                .log().all();
    }
    @Test
    public void Login_user_Successfully_Test(){
        baseURI="https://reqres.in";

        JSONObject data= new JSONObject();
        data.put("email","eve.holt@reqres.in");
        data.put("password","cityslicka");

        given()
                .header("Content-Type","application/json")
                .header("x-api-key","reqres-free-v1")
                .body(data.toJSONString()).
        when()
                .post("/api/login").
        then()
                .statusCode(200)
                .body("token", notNullValue())
                .log().all();
    }
    @Test
    public void Login_user_unsuccessfully_Test(){
        baseURI="https://reqres.in";

        JSONObject data= new JSONObject();
        data.put("email","peter@klaven");

        given()
                .header("Content-Type","application/json")
                .header("x-api-key","reqres-free-v1")
                .body(data.toJSONString()).
                when()
                .post("/api/login").
                then()
                .statusCode(400)
                .body("error",equalTo("Missing password"))
                .log().all();
    }



}
