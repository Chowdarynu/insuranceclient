package com.example.insuranceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
public class InsuranceclientApplication {

   public static void main(String[] args) {
      SpringApplication.run(InsuranceclientApplication.class, args);
   }

   @Bean
   public RestTemplate restTemplate(){
      return  new RestTemplate();
   }

}
