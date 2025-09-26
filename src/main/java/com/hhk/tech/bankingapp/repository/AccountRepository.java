package com.hhk.tech.bankingapp.repository;

import com.hhk.tech.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
