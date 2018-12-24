package com.wissensalt.tgf.web.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created on Sep 12, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
public class WebAdmin /*implements CommandLineRunner*/ {

    public static void main(String [] args){
        SpringApplication.run(WebAdmin.class, args);
    }

    /*@Autowired
    private FeignBuilderFactory feignBuilderFactory;

    @Override
    public void run(String... strings) throws Exception {
        ICityClient client = feignBuilderFactory.createClient(ICityClient.class);
        client.findAll("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1ZGllbmNlIjoid2ViIiwiY3JlYXRlZCI6MTUxODQwOTEzOTg0OCwiZXhwIjoxNTE4NDEwOTM5fQ.zpE2UUjp2NYDoaDRxC6tzAq0P8gOhF7ISxKGR2IHjahqpWHURwf5uk6MK7krkRXxHAESrnSYzSos3NYQzE99HQ", "130004");
    }*/
}
