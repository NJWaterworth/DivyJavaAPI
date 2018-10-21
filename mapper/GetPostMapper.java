package mapper;

import activity.output.GetPostOutput;
import dbObjectModel.Post;

public class GetPostMapper {
    GetPostOutput output;
    public GetPostOutput mapToOutput(Post post) {
        output.post = post;
        return output;
    }
}
