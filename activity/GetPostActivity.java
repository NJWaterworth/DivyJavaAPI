package activity;

import activity.input.GetPostInput;
import activity.output.GetPostOutput;
import constants.TableNames;
import dbObjectModel.Post;
import dbObjectTranslator.PostTranslator;
import ddbService.TableClient;
import mapper.GetPostMapper;

public class GetPostActivity {

    GetPostMapper mapper;
    TableClient tableClient = new TableClient(TableNames.POST_TABLE, new PostTranslator());

    public GetPostOutput getPost(GetPostInput input) {
        validateInput(input);
        Post post = (Post) tableClient.getItem(input.id);
        return mapper.mapToOutput(post);
    }

    private void validateInput(GetPostInput input) {
        // TODO
    }
}
