package Swagger;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class AppTest {
    //Test for Post Request

    @Test
    public void sendUserDetails(){
        SendUserDetails sendData=new SendUserDetails();
        sendData.setId(1);
        sendData.setUsername("suchi");
        sendData.setFirstName("suchismita");
        sendData.setLastname("pal");
        sendData.setEmail("suchi@testmail.com");
        sendData.setPassword("abcdef");
        sendData.setPhone("123456");
        sendData.setUserStatus(100);

    //Created a java Object and sending it to the POST request and checking the response code of 200

        GetUserResponse postResponse=
                given().contentType(ContentType.JSON).body(sendData).log().body().
                        when().post("https://petstore.swagger.io/v2/user").as(GetUserResponse.class);
        postResponse.printResponse();

    }
    @Test
    public void sendMultipleUsers(){
        //sending two user details
        SendUserDetails sendData1=new SendUserDetails();
        sendData1.setId(1);
        sendData1.setUsername("suchi");
        sendData1.setFirstName("suchismita");
        sendData1.setLastname("pal");
        sendData1.setEmail("suchi@testmail.com");
        sendData1.setPassword("abcdef");
        sendData1.setPhone("123456");
        sendData1.setUserStatus(100);

        SendUserDetails sendData2=new SendUserDetails();
        sendData2.setId(2);
        sendData2.setUsername("sas");
        sendData2.setFirstName("sasmita");
        sendData2.setLastname("pal");
        sendData2.setEmail("sas@testmail.com");
        sendData2.setPassword("a1b1c1d1e1f1");
        sendData2.setPhone("123456");
        sendData2.setUserStatus(100);

        //adding both the user details to an array
        List<SendUserDetails> sendJsonArray=new ArrayList<>();
        sendJsonArray.add(sendData1);
        sendJsonArray.add(sendData2);

        GetUserResponse postResponse=
                given().contentType(ContentType.JSON).body(sendJsonArray).log().body().
                        when().post("https://petstore.swagger.io/v2/user/createWithArray").as(GetUserResponse.class);
        //printing the response
        postResponse.printResponse();
        //Verifying the response code
        Assert.assertEquals(200,postResponse.getCode());

    }

}
