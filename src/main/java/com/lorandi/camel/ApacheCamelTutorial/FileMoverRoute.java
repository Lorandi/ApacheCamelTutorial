package com.lorandi.camel.ApacheCamelTutorial;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://temp/in")
                .log("Moving file ${file:name}")
                .log("${headers}")
                .log("${body}")
                .to("file://temp/out");
    }
}
