/**
 * Created by bepe14 on 2017-01-27.
 */
import java.net.*;
import java.io.*;

public class LinklistModel {

    private String url;

    public void urlReader() throws Exception{

        URL urlwww = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(urlwww.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
            in.close();
        }

    }
}
