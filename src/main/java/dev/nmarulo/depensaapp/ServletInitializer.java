package dev.nmarulo.depensaapp;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        Integer.valueOf(3).compareTo(2)
        new Integer(3).compareTo(2)
        HashMap<URL, Integer> hits = new HashMap<>();
        for (HashMap.Entry<URL, Integer> e : hits) {
            // ... This can become very slow for larger hashmaps of URLS.
        }
        return application.sources(DespensaRestApiApplication.class);
    }

}
