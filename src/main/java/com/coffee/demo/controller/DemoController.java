package com.coffee.demo.controller;

import com.coffee.demo.manager.GeodatasourceService;
import com.coffee.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class DemoController {

    private final GeodatasourceService service;

    @PostMapping
    public void saveUser(@RequestBody User user) {

        service.getGeoDataSource(user);
    }
}
