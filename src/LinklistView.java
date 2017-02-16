/**
 * Created by bepe14 on 2017-01-27.
 */
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Sätter upp JFrame saker som ska vara med.
 */
public class LinklistView extends JFrame {
    public static JTextField url = new JTextField(20);
    public JTextArea countUrls = new JTextArea();
    public JButton linkSearch = new JButton("Search links");

    /**
     * Denna metod rittar upp sedan alla saker i en JPanel
     */
    public LinklistView() {
        super("linkview");
        JPanel linkpanel = new JPanel();
        Dimension dim = new Dimension(300, 200);
        setPreferredSize(dim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 200);
        linkpanel.add(url);
        linkpanel.add(linkSearch);
        linkpanel.add(countUrls);
        this.add(linkpanel);
        this.pack();
    }


    /**
     *
     * @return returnerar vad som är skrivet i text rutan
     */

     public static String getURL() {

        return url.getText();

    }



    /**
     * Denna del skriver ut en text och sedan hur många urls som finns
     *
     * @param urls Hur många urls som finns
     */
    public void setUrls(int urls) {
        countUrls.setText("Det finns så här många länkar:  " + Integer.toString(urls));
    }

    /**
     * Väntar på knapp tyrck
     * @param listenForSearchButton Lyssnar efter knapp tryck på knappen "SearchButton"
     */

    void addSearchListener(ActionListener listenForSearchButton) {
        linkSearch.addActionListener(listenForSearchButton);
    }



}