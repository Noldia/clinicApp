package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
