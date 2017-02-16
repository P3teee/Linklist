/**
 * Created by bepe14 on 2017-01-27.
 */
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;

/**
 * Sätter upp en View och Model från de två olika klasserna
 */
public class LinklistController {
    public LinklistView theView;
    public LinklistModel theModel;

    /**
     *
     * @param theView Linkar till LinklistModel
     * @param theModel Linkar till LinklistView
     */
    public LinklistController(LinklistView theView, LinklistModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addSearchListener(new SearchListener());
    }


    /**
     * Knappen som söker igenom TheModel för att ta reda på hur många länker det var
     * Som sedan skrivs utt i TheView som kommer ut på skärmen
     */
    public class SearchListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String url;
            theModel.count = 0;
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
