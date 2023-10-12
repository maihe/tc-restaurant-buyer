package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.UserDTO;
import br.com.tc.restaurantbuyer.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

//TODO add logger lib @sl4j
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    //Construtor para testar sugestao de boas praticas de injecao
    @Autowired
    public UserService(UserRepository userRepository) {
        log.info("");
        Assert.notNull(userRepository, "UserRepository must not be null!");
        this.userRepository = userRepository;
    }

    public List<UserDTO> listAllUsersFromRole(String role) {
        userRepository.findAllByRole(role);
        //construir mapper
        return new ArrayList<UserDTO>();
    }

    public UserDTO createUser(UserDTO user) {
        log.info("Creating User");
        try {

        } catch (Exception e) {
            log.error("Error saving new User {}", e.getCause());
            throw e;
        }
        return user;
    }
}
