package kz.iitu.csse241.burkutbayeva.service;

import kz.iitu.csse241.burkutbayeva.database.Users;
import kz.iitu.csse241.burkutbayeva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users registerUser(Users user) {
        return userRepository.save(user);
    }
}

