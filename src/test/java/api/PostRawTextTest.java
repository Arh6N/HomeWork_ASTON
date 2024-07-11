package api;

import com.specification.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PostRawTextTest {
    @Test
    public void postRawTextTest() {
        Specifications.installSpecification(Specifications.requestSpecification(ContentType.TEXT), Specifications.responseSpecificationOK200());

        given()
        .body("This is a raw text")
                .when()
                .post("/post")
                .then().log().all()
                .assertThat().body("data", equalTo("This is a raw text"))
                .body("headers", notNullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }

}
