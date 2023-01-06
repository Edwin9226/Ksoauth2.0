package com.ks.springsecurityclient.repository;

import com.ks.springsecurityclient.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
Users findByEmail(String email);
}
