package it.sistinf.helloworld.rest;

import it.sistinf.helloworld.model.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloRest {

    @Value("${server.name}")
    private String serverName;

    @GetMapping("/hello")
    public Hello helloWorld() {
        return new Hello(serverName);
    }

}
