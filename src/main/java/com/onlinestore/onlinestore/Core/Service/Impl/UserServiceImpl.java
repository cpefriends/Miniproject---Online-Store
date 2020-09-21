package com.onlinestore.onlinestore.Core.Service.Impl;

import com.onlinestore.onlinestore.Core.Service.UserService;
import com.onlinestore.onlinestore.Infrastructure.Entity.UserEntity;
import com.onlinestore.onlinestore.Infrastructure.Repository.UserRepository;
import com.onlinestore.onlinestore.Presentation.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void signUp(UserDTO userDTO) {
        UserEntity newUserEntity = createNewUserEntityToSave(userDTO);
        userRepository.save(newUserEntity);
    }

    private UserEntity createNewUserEntityToSave(UserDTO userDTO) {
        return UserEntity.builder()
                .username(userDTO.getUsername())
                .password(bCryptPasswordEncoder.encode(userDTO.getPassword()))
                .address(userDTO.getAddress())
                .email(userDTO.getEmail())
                .totalOrders(userDTO.getTotalOrders())
                .build();
    }
}
