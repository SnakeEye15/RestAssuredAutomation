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
    public void Test_listResources(){

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

}
