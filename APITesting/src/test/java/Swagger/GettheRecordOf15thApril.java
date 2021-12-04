import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

public class GettheRecordOf15thApril {



    @Test
    public void testGettheRecordOf15thAprilAndValidateForStatusCode(){
        given().
                when().
                get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y").
                then().
                assertThat().
               // body("root.routes.route[1].color", equalTo("BEIGE"));
               // body("root.routes.route.routeID", hasItem("ROUTE 20")).
              //  body("root.routes.route.routeID", not(hasItem("ROUTE 0"))).
               // body("root.routes.route.number", hasItem(12));
                body("root.routes.route.color", hasItem("BEIGE"));

    }
}
