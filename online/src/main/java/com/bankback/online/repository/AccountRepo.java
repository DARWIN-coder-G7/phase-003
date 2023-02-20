package com.bankback.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankback.online.entity.AccountData;

public interface AccountRepo extends JpaRepository<AccountData,Long> {

}
