package api;

import com.specification.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PutRequestTest {
    @Test
    public void testPutRequest() {
        Specifications.installSpecification(Specifications.requestSpecification(ContentType.JSON), Specifications.responseSpecificationOK200());
        given()
                .body("This is a put request")
                .when()
                .put("/put")
                .then().log().all()
                .assertThat()
                .body("data", equalTo("This is a put request"))
                .body("headers", notNullValue())
                .body("url", equalTo("https://postman-echo.com/put"));
    }
}
