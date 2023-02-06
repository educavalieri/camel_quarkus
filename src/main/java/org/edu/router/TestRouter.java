package org.edu.router;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class TestRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("timer:test?period=1000")
                .to("direct:test");

        from("direct:test")
                .log("log:test");


    }
}
