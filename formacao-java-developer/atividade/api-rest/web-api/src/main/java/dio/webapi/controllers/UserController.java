package dio.webapi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.webapi.Repository.IUserRepository;
import dio.webapi.models.UserModel;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping()
    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{email}")
    public UserModel getByEmail(@PathVariable("email") String email) {
        return userRepository.findByEmail(email);
    }

    @DeleteMapping("/{UUID}")
    public void deleteById(@PathVariable("UUID") UUID UUID) {
        userRepository.deleteById(UUID);
    }

    @PostMapping()
    public UserModel save(@RequestBody UserModel user) {
        return userRepository.save(user);
    }
}
