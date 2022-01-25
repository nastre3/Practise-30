import org.junit.jupiter.api.Test;

public class ApiTest {

    String url = "https://openweathermap.org/data/2.5/weather?q=Vladivostok&appid=d2fb8cae86cdd9c83785422b1ae87126";

    @Test
    public void apiTest() {
        given().when().get(url).then().log().all().statusCode(200);
    }
}
