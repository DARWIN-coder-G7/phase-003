package com.adminon.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminon.sporty.entity.Login;

public interface Loginrepo extends JpaRepository<Login, Long> {

}
