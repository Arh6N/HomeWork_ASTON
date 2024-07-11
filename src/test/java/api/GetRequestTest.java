package api;

import com.specification.Specifications;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetRequestTest {
    @Test
    public void getWoopsRequestTest(){
        Specifications.installSpecification(Specifications.requestSpecification(ContentType.JSON), Specifications.responseSpecificationOK200());
        given()
                .when()
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().all()
                .assertThat()
                .body("args.foo1", equalTo("bar1"))
                .and().body("args.foo2", equalTo("bar2"))
                .and().body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
                .and().body("headers", notNullValue());
    }
}
