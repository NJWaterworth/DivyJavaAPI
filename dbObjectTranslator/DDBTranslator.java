package dbObjectTranslator;

import dbObjectModel.DDBObject;
import dbObjectModel.Post;

public interface DDBTranslator {
    public DDBObject dynamoToInternal(Item item);

    public Item internalToDynamo(Post post);
}
