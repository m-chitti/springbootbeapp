package com.incomm.pcf.ui.pcfuidemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class PcfuidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcfuidemoApplication.class, args);
    }

    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            String response = restTemplate.getForObject("http://10.42.81.163:9000/cxf/v1/apisecurity/partners", String.class);
            System.out.println("Response from FSAPI :: "+response);
        };
    }*/
}
