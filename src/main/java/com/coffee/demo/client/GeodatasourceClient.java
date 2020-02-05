package com.coffee.demo.client;

import com.coffee.demo.model.response.DataSource;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "geodatasourceClient", url = "${geodatasource.url}")
public interface GeodatasourceClient {

    @GetMapping(value = "/city", produces = MediaType.APPLICATION_JSON_VALUE)
    DataSource geodatasource(@RequestParam("key") String key,
                             @RequestParam("lat") Double lat,
                             @RequestParam("lng") Double lng);
}
