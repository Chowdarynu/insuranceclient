package com.example.insuranceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
public class InsuranceController {

   @Autowired
   private RestTemplate restTemplate;

   @Value("${insurance.provider.url}")
   private String uri;

   @GetMapping("/getPlans")
   public List<String> getAllPlans() {

      return restTemplate.getForObject(uri, List.class);

   }
}
