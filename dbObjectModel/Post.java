package dbObjectModel;

import internal.PostTypeEnum;

import java.util.Date;
import java.util.List;

// Making these all public now rather than manual Getters/Setters
// We'll use Lombok eventually
public class Post implements DDBObject{
    public Integer id;
    public String caption;
    public List<Integer> commentIds;
    public List<Integer> embererIds;
    public List<Integer> flamerIds;
    public String image;
    public Date timeStamp;
    public PostTypeEnum type;
}
