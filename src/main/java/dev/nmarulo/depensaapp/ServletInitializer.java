package dev.nmarulo.depensaapp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // This expression can be simplified to directly compare the primitive values instead.
        Integer.valueOf(3).compareTo(2)
        
        // or
        new Integer(3).compareTo(2)
        return application.sources(DespensaRestApiApplication.class);
    }

}
