package com.coffee.demo.service;

import com.coffee.demo.dao.UserRepository;
import com.coffee.demo.dao.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public void saveUser(UserEntity userEntity) {
        UserEntity user = repository.save(userEntity);
        log.debug("User stored, {}", user);
    }
}
