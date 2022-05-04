package main.java.org.bits.businessobject;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

public class CreateTablesLoadData {

    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    static DynamoDB dynamoDB = new DynamoDB(client);

    static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    static String productCatalogTableName = "Products";


    public static void main(String[] args) throws Exception {

        try {
            loadSampleProducts(productCatalogTableName);
        }
        catch (Exception e) {
            System.err.println("Program failed:");
            System.err.println(e.getMessage());
        }
        System.out.println("Success.");
    }

    private static void loadSampleProducts(String tableName) {

        Table table = dynamoDB.getTable(tableName);

        try {

            System.out.println("Adding data to " + tableName);

            Item item = new Item().withPrimaryKey("Id", 101).withString("Title", "Book 101 Title")
                .withString("ISBN", "111-1111111111")
                .withStringSet("Authors", new HashSet<String>(Arrays.asList("Author1"))).withNumber("Price", 2)
                .withString("Dimensions", "8.5 x 11.0 x 0.5").withNumber("PageCount", 500)
                .withBoolean("InPublication", true).withString("ProductCategory", "Book");
            table.putItem(item);

            item = new Item().withPrimaryKey("Id", 205).withString("Title", "20-Bike-205")
                .withString("Description", "205 Description").withString("BicycleType", "Hybrid")
                .withString("Brand", "Brand-Company C").withNumber("Price", 500)
                .withStringSet("Color", new HashSet<String>(Arrays.asList("Red", "Black")))
                .withString("ProductCategory", "Bicycle");
            table.putItem(item);

        }
        catch (Exception e) {
            System.err.println("Failed to create item in " + tableName);
            System.err.println(e.getMessage());
        }

    }


}
