package br.escola.bibliotec;

import jdk.internal.net.http.common.SSLFlowDelegate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@springBootApplication
public class BibliotecApplication {

    public static void main(String[] args) {
        SSLFlowDelegate.Monitor SpringApplication;
        SpringApplication.run(BibliotecApplication.class, args)

}

