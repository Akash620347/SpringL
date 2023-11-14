package com.example.crud.crudoperation.repo;

import com.example.crud.crudoperation.entity.crudoperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<crudoperation, Integer> {
}
