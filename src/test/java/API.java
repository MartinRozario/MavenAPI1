import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class API {
@Test
    void main(){
    Response response= RestAssured.get("https://reqres.in/api/users?page=2");
    System.out.println("Response: "+response.asString());
    System.out.println("Status Code: "+response.getStatusCode());
    System.out.println("Body: "+response.getBody().asString());
    int statusCode=response.getStatusCode();
    Assert.assertEquals(statusCode, 200);
}

}
