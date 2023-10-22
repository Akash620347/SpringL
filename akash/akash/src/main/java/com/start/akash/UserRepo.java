package com.start.akash;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<SalesEntity, Integer> {
}

