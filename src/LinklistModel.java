/**
 * Created by bepe14 on 2017-01-27.
 */
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinklistModel {




    public String setURL() {
        return LinklistView.getURL();
    }

    private String url = LinklistView.getURL();

    int count = 0;



    /**
     * Söker igenom hemsidan
     * @throws Exception
     */
    public void urlReader() throws Exception{


        URL urlwww = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(urlwww.openStream()));

        String inputLine;



        while ((inputLine = in.readLine()) != null) {
            Pattern p = Pattern.compile("/a>");
            Matcher m = p.matcher(inputLine);


            while (m.find()){
                count+=1;
            }



        }

        System.out.println(count);

        in.close();

    }
    public int getCount() {
        return count;
    }


}
