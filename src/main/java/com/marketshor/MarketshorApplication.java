package com.marketshor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import static javafx.scene.input.KeyCode.H;

@SpringBootApplication
public class MarketshorApplication {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MarketshorApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception{

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=NSE:DMART&interval=5min&apikey=5PO60LWWJ4WZIXOV";
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        HttpEntity<String> re = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(re);
    }*/

}
