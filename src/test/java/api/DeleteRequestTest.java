package api;

import com.specification.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class DeleteRequestTest {
    @Test
    public void deleteRequestTest() {
        Specifications.installSpecification(Specifications.requestSpecification(ContentType.JSON), Specifications.responseSpecificationOK200());
        given()
                .when()
                .delete("/delete")
                .then()
                .assertThat()
                .body("headers", notNullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
