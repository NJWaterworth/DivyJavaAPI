package ddbService;

import dbObjectModel.DDBObject;
import dbObjectTranslator.DDBTranslator;

public class TableClient {

    AmazonDynamoDB dynamoDB;
    DDBTranslator translator;
    String tableName;

    public TableClient(String tableName, DDBTranslator translator) {
        this.tableName = tableName;
        this.translator = translator;
    }

    public DDBObject getItem(String id) {
        // Get item from DDB
        Item item = new Item();
        return translator.dynamoToInternal(item);
    }

    public void postItem(DDBObject item) {
        // Post item
    }

    public void updateItem(DDBObject item) {
        // Update item
    }
}
