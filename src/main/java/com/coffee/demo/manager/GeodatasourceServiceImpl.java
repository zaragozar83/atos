package com.coffee.demo.manager;

import com.coffee.demo.client.GeodatasourceClient;
import com.coffee.demo.dao.entity.UserEntity;
import com.coffee.demo.model.User;
import com.coffee.demo.model.response.DataSource;
import com.coffee.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class GeodatasourceServiceImpl implements GeodatasourceService {

    private final GeodatasourceClient geodatasourceClient;
    private final static String KEY = "OMO1MUVUAFKV6BVI8JJQICO9UTQGWCDK";

    private final UserService service;

    @Override
    public void getGeoDataSource(User user) {

        log.debug("user {}", user);
        DataSource geodatasourceResponse = geodatasourceClient.geodatasource(KEY, user.getLatitude(), user.getLongitude());

        service.saveUser(getEntity(user, geodatasourceResponse));

    }

    private UserEntity getEntity(User user, DataSource dataSource) {

        Long id = Math.round(Math.random() * 100);
        return UserEntity.builder()
                .id(id.intValue())
                .city(dataSource.getCity())
                .country(dataSource.getCountry())
                .latitude(user.getLatitude())
                .longitude(user.getLongitude())
                .region(dataSource.getRegion())
                .build();
    }
}
