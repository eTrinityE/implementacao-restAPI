package com.etrinitye.implementacaorestapi.repositories;

import com.etrinitye.implementacaorestapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
