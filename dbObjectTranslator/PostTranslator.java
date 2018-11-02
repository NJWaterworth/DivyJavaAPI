package dbObjectTranslator;

import constants.AttributeNames;
import dbObjectModel.Post;
import org.dozer.DozerBeanMapper;
public class PostTranslator implements DDBTranslator {

    public Post dynamoToInternal(Item item) {
        // Post post = new Post();
        Post post = new DozerBeanMapper().map(item, Post.class);
        // etc
        // I think theres probably a more generic way to do this but I'm tired.
        // I'll keep thinking about it
        // Dozer????
        return post;
    }

    public Item internalToDynamo(Post post) {
        // Do this too
        Item item = new DozerBeanMapper().map(post, Item.class);
        return null;
    }
}
