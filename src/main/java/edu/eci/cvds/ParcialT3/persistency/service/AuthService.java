package edu.eci.cvds.ParcialT3.persistency.service;

import edu.eci.cvds.ParcialT3.persistency.entity.User;
import edu.eci.cvds.ParcialT3.persistency.repository.UserRepository;
import edu.eci.cvds.ParcialT3.persistency.security.CustomPasswordEncoder;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final CustomPasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(UserRepository userRepository, CustomPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean authenticate(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isEmpty()) {
            return false; // Usuario no encontrado
        }

        User user = optionalUser.get();
        return passwordEncoder.matches(password, user.getPassword()); // Ahora se usa correctamente la instancia
    }
}
