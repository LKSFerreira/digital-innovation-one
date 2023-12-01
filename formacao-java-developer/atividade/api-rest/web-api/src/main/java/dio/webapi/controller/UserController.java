package dio.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.webapi.Repository.IUserRepository;
import dio.webapi.models.UserModel;

@RestController
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/users")
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }
}
