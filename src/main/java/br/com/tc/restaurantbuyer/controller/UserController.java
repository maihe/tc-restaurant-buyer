package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.dto.UserDTO;
import br.com.tc.restaurantbuyer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        Assert.notNull(userService, "UserService must not be null!");
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> listAllUsersWithParams(@RequestParam(required = false) String role) {
        //List<UserDTO> exampleUsers = new ArrayList<>();
        //UserDTO userDTO = new UserDTO("Manoel", "mano_el", "admin");
        //exampleUsers.add(userDTO);
        //return exampleUsers;
        log.debug("Find all users");
        return userService.listAllUser(role);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }
}
