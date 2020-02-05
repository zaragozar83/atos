package com.coffee.demo.service;

import com.coffee.demo.dao.UserRepository;
import com.coffee.demo.dao.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public void saveUser(UserEntity userEntity) {
        repository.save(userEntity);
    }
}
