/**
 * Created by bepe14 on 2017-01-27.
 */
import javax.swing.*;
import java.awt.event.*;

public class LinklistController {
    public LinklistView theView;
    public LinklistModel theModel;

    public LinklistController(LinklistView theView, LinklistModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addSearchListener(new SearchListener());
    }

    public void test() {
        theView.getURL();
    }

    public class SearchListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String url;

            try{
                url = theView.getURL();
                theModel.urlReader();
                theView.setUrls(theModel.getCount());
            }
            catch (Exception e1) {
                System.out.println(e1);
                e1.printStackTrace();
            }
        }
    }
}
