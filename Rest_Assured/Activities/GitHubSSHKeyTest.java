package Activities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GitHubSSHKeyTest {

RequestSpecification requestSpec;
    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDnRGfw6h/moBXEMVK433iiSYJF8wkC0nPhIOFivhW2N"; // Replace with your actual SSH key
    int keyId;

    @BeforeClass
    public void setUp() {
        // Set up the request specification
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://api.github.com")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer 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") // Replace with your GitHub token
                .addHeader("X-GitHub-Api-Version", "2022-11-28")
                .build();
    }

    @Test(priority = 1)
    public void addSSHKey() {
        String reqBody = "{\n" +
                "    \"title\": \"TestAPIKey\",\n" +
                "    \"key\": \"" + sshKey + "\"\n" +
                "}";

        Response response = RestAssured
                .given()
                .spec(requestSpec)
                .body(reqBody)
                .when()
                .post("/user/keys");

        // Extract key ID
        keyId = response.then().extract().path("id");

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 201, "Status code should be 201");
        Reporter.log("POST Response: " + response.getBody().asString(), true);
        Reporter.log("SSH Key ID: " + keyId, true);
    }

    @Test(priority = 2, dependsOnMethods = {"addSSHKey"})
    public void getSSHKey() {
        Response response = RestAssured
                .given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .get("/user/keys/{keyId}");

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        Reporter.log("GET Response: " + response.getBody().asString(), true);
    }

    @Test(priority = 3, dependsOnMethods = {"addSSHKey"})
    public void deleteSSHKey() {
        Response response = RestAssured
                .given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .delete("/user/keys/{keyId}");

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 204, "Status code should be 204");
        Reporter.log("DELETE Response Status: " + response.getStatusCode(), true);
    }


}
