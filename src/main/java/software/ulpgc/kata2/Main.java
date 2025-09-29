package software.ulpgc.kata2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://datasets.imdbws.com/title.basics.tsv.gz");
        URLConnection connection = url.openConnection();
        connection.connect();
        InputStream is1 = connection.getInputStream();
        BufferedInputStream is2 = new BufferedInputStream(is1);
        GZIPInputStream is3 = new GZIPInputStream(is2);
        InputStreamReader reader1 = new InputStreamReader(is3);
        BufferedReader reader2 = new BufferedReader(reader1);
        while(true){
            String line = reader2.readLine();
            if(line == null) break;
            System.out.println(line);
        }

    }
}
