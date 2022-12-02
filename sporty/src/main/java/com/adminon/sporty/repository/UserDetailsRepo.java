package com.adminon.sporty.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.adminon.sporty.entity.UserDetails;
public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {

}
