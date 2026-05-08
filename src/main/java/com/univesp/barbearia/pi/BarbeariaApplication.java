package com.univesp.barbearia.pi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarbeariaApplication {

    public static void main(String[] args) {
        //SpringApplication.run(BarbeariaApplication.class, args);
        SpringApplication app = new SpringApplication(BarbeariaApplication.class);
        app.run(args);
    }

}
