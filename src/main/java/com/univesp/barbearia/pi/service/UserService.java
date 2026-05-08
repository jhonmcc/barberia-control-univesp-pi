package com.univesp.barbearia.pi.service;

import com.univesp.barbearia.pi.dto.UserDTO;
import com.univesp.barbearia.pi.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface UserService {

    UserEntity getInfoUserID(Long id);

    Boolean registerUser(UserDTO user);

}
