package software.ulpgc.kata2;

import java.io.IOException;
import java.io.InputStream;
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
        GZIPInputStream is2 = new GZIPInputStream(is1)
    }
}
