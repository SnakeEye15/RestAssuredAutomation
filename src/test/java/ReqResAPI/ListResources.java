package ReqResAPI;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListResources {
    @BeforeClass
    public void setUp(){
        baseURI="https://reqres.in";
    }
    @Test
    public void Test_listResources_all(){

        Response response=
                given()
                        .when()
                        .get("/api/unknown")
                        .then()
                        .statusCode(200)
                        .body("data",not(empty()))
                        .body("data[0].id",notNullValue())
                        .body("data[0].name", notNullValue())
                        .extract().response();

        System.out.println("Response:\n"+response.prettyPrint());

        int total=response.jsonPath().getInt("total");
        assertEquals(12,total);
    }
    @Test
    public void Test_SingleResource(){
        Response response=
                (Response) given()
                        .when()
                        .get("/api/unknown/2")
                        .then()
                        .statusCode(200)
                        .body("data.id",equalTo(2))
                        .body("data.name",equalTo("fuchsia rose"))
                        .extract().response();
        System.out.println("Response:\n"+response.prettyPrint());



    }
    @Test
    public void Test_ResourceNotFound(){
        Response response=
                given()
                        .when()
                        .get("/api/unknown/23")
                        .then()
                        .statusCode(404)
                        .extract().response();
    }

}
