package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.UserDTO;
import br.com.tc.restaurantbuyer.entities.UserClient;
import br.com.tc.restaurantbuyer.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {
    private static final String DEFAULT_PWD = "234";
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        log.info("");
        Assert.notNull(userRepository, "UserRepository must not be null!");
        this.userRepository = userRepository;
    }

    public List<UserDTO> listAllUser(String role) {
        log.info("Find all users with parameters {}", role);
        List<UserClient> usersLists;
        if (null != role) {
            usersLists = userRepository.findAllByRole(role);

        } else {
            usersLists = userRepository.findAll();
        }
        return usersLists
                .stream()
                .map(this::toUserClientDTO)
                .collect(Collectors.toList());
    }


    public UserDTO createUser(UserDTO userDTO) {
        log.info("Creating User {} ", userDTO.toString());
        try {
            UserClient userClient = userRepository.save(toUserClient(userDTO));
            userDTO = toUserClientDTO(userClient);
        } catch (Exception e) {
            log.error("Error saving new User {}", e.getCause());
            throw e;
        }
        return userDTO;
    }


    /*----------------------- MAPPERS -----------------------*/
    private UserDTO toUserClientDTO(UserClient userClient) {
        return new UserDTO(
                userClient.getId(),
                userClient.getLogin(),
                userClient.getRole(),
                userClient.getCustomer() != null ? userClient.getCustomer().getName() : null);
    }

    private UserClient toUserClient(UserDTO userDTO) {
        return new UserClient(
                userDTO.login(),
                userDTO.role(),
                DEFAULT_PWD);
    }
}

