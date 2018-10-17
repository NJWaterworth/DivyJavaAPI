package dbObjectTranslator;

import constants.AttributeNames;
import dbObjectModel.Post;

public class PostTranslator implements DDBTranslator {

    public Post dynamoToInternal(Item item) {
        Post post = new Post();
        post.caption = item.getString(AttributeNames.CAPTION);
        // etc
        // I think theres probably a more generic way to do this but I'm tired.
        // I'll keep thinking about it
        // Dozer????
    }

    public Item internalToDynamo(Post post) {
        // Do this too
    }
}
