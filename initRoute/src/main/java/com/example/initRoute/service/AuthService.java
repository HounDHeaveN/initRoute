package com.example.initRoute.service;





import com.example.initRoute.model.User;
import com.example.initRoute.repository.UserRepository;
import com.example.initRoute.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String authenticate(String username, String password) throws Exception {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new Exception("User not found"));
        if (passwordEncoder.matches(password, user.getPassword())) {
            return jwtUtil.generateToken(username);
        } else {
            throw new Exception("Invalid credentials");
        }
    }

    public void register(String username, String password) throws Exception {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new Exception("User already exists");
        }
        String encodedPassword = passwordEncoder.encode(password);
        User newUser = new User(username, encodedPassword);
        userRepository.save(newUser);
    }

}


