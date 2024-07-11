package api;

import com.specification.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PostFormDataTest {
    @Test
    public void postFormDataTest() {
        Specifications.installSpecification(Specifications.requestSpecification(ContentType.TEXT), Specifications.responseSpecificationOK200());
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then().log().all() // Логирование запроса и ответа
                .assertThat()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers", notNullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
