package com.etrinitye.implementacaorestapi.repositories;

import com.etrinitye.implementacaorestapi.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
