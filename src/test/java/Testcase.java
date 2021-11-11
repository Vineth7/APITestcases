import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testcase {
    public static void main(String[] args){

        String payload = "{
        ""parent_id"": 62,
                ""category_description"": [
        {
            ""name"": ""Laptops"",
                ""meta_title"": ""Laptops"",
                ""description"": ""Description of the Laptops""
        }
  ]
    }"
    Response response = RestAssured.given().header("Content-Type","application/json").body(payload)
            .when().post("\n" +
                    "http://rest-api.upskills.in/index.php?route=rest/customer_admin/customers&filter_date_added_from={added_from}&filter_date_added_to={added_to}");
    response.prettyPrint();

    }

}
