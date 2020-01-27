package com.marketshor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/msr")
public class TestController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/stock")
    public List<Object> getStockDetails(){

        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=NSE:DMART&interval=5min&apikey=5PO60LWWJ4WZIXOV";
        //Object[] objects = restTemplate.getForObject(url, Object[].class);
        Object objects =restTemplate.getForObject(url, Object.class);
        //System.out.println("list::"+Arrays.asList(objects));

        return Arrays.asList(objects);
    }
    
	/*
	 * @GetMapping("/stock") public String getStockDetails(){
	 * 
	 * return "hello"; }
	 */
    
}
