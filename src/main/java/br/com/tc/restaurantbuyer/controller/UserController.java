package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.dto.UserDTO;
import br.com.tc.restaurantbuyer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDTO> listAllUsersWithParams(@RequestParam String role) {
        List<UserDTO> exampleUsers = new ArrayList<>();
        UserDTO userDTO = new UserDTO("Manoel", "mano_el", "admin");
        exampleUsers.add(userDTO);
        return exampleUsers;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }
}
