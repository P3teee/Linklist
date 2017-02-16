/**
 * Created by bepe14 on 2017-02-10.
 */
public class LinklistTest {
    public static void main(String[] args){
        LinklistView theView = new LinklistView();
        LinklistModel theModel = new LinklistModel();
        LinklistController theController = new LinklistController(theView,theModel);
        theView.setVisible(true);
    }
}
