/**
 * Created by bepe14 on 2017-01-27.
 */
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.*;


public class LinklistView extends JFrame {
    private JTextField url = new JTextField(10);
    private JTextField urls = new JTextField(20);
    private JButton search = new JButton("Search links");

    public LinklistView() {
        super("linkview");
        JPanel linkpanel = new JPanel();
        Dimension dim = new Dimension(300 , 200);
        setPreferredSize(dim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 200);
        linkpanel.add(urls);
        linkpanel.add(url);
        linkpanel.add(search);
        this.add(linkpanel);
        this.pack();
        }
    }

