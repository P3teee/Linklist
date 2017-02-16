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


    /**
     *
     * @return Läser in texten som är skriven i text rutan
     */

    public String returnURL() {
        return LinklistView.getURL();
    }

    int count = 0;


    /**
     * Den läser in en URL som den sedan läser igenom varje rad och söker efter "/a"
     * för att få reda på hur många länkar som finns på sidan (I alla fall man kan klicka på)
     *
     *
     * @throws Exception Kastar bort problem som handlar om att det inte finns någon URL
     */
    public void urlReader() throws Exception{


        URL urlwww = new URL(returnURL());
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

    /**
     *
     * @return returnar nummret av "/a" taggar
     */
    public int getCount() {
        return count;
    }


}
