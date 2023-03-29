package com.etrinitye.implementacaorestapi.service;

import com.etrinitye.implementacaorestapi.models.User;
import com.etrinitye.implementacaorestapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        if (!user.getFirstName().isBlank() && !user.getLastName().isBlank()) {
            return userRepository.save(user);
        }
        return null;
    }

    public User update(User user) {
        var dbUser = userRepository.findById(user.getId());
        if (dbUser.isPresent()) {
            return userRepository.save(user);
        }
        return null;
    }

    public String delete(Long id) {
        var dbUser = userRepository.findById(id);
        if (dbUser.isPresent()) {
            userRepository.deleteById(id);
            return "Usuário do ID " + id + " foi deletado";
        } else {
            return "ID " + id + " não encontrado";
        }
    }
}
