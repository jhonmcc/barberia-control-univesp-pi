package com.univesp.barbearia.pi.service.impl;

import com.univesp.barbearia.pi.dto.UserDTO;
import com.univesp.barbearia.pi.entity.UserEntity;
import com.univesp.barbearia.pi.repository.UserRepository;
import com.univesp.barbearia.pi.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getInfoUserID(Long id) {
        try{
            return userRepository.findFirstById(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public Boolean registerUser(UserDTO user) {
        try{
            userRepository.save(new UserEntity(null, user.getName(), user.getPhone(), user.getUserType()));
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }
}
