package software.ulpgc.kata2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class RemoteMovieReader implements MovieReader, Closeable {
    private static final String remoteURL = "https://datasets.imdbws.com/title.basics.tsv.gz";
    private final BufferedReader reader;

    public RemoteMovieReader() throws IOException {
        URL url = new URL("https://datasets.imdbws.com/title.basics.tsv.gz");
        URLConnection connection = url.openConnection();
        connection.connect();
        this.reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new BufferedInputStream(connection.getInputStream()))));
    }

    @Override
    public List<Movie> readall() {
        while(true){
            Movie movie = readMovie();
            if(movie == null) break;
            list.addmovie
        }
    }

    private void readMovie() {
        try {
            String line = reader.readLine();
            return line == null ? :;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void close() throws IOException {
        
    }
}
