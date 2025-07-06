package com.example.temporal_example.repository;

import com.example.temporal_example.model.Account;
import org.springframework.data.repository.ListCrudRepository;

public interface AccountRepository extends ListCrudRepository<Account, Long> {}
