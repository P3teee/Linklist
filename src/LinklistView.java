/**
 * Created by bepe14 on 2017-01-27.
 */
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class LinklistView extends JFrame {
    public static JTextField url = new JTextField(10);
    public JTextField countUrls = new JTextField(20);
    public JButton linkSearch = new JButton("Search links");


    public LinklistView() {
        super("linkview");
        JPanel linkpanel = new JPanel();
        Dimension dim = new Dimension(300, 200);
        setPreferredSize(dim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 200);
        linkpanel.add(countUrls);
        linkpanel.add(url);
        linkpanel.add(linkSearch);
        this.add(linkpanel);
        this.pack();
    }




     public static String getURL() {
        return url.getText();
    }

    public static String setURL() {
        return url.getText();
    }

    public int getCount() {
        return Integer.parseInt(linkSearch.getText());
    }


    public void setUrls(int urls) {
        countUrls.setText(Integer.toString(urls));
    }

    void addSearchListener(ActionListener listenForSearchButton) {
        linkSearch.addActionListener(listenForSearchButton);
    }



}