package com.APSproject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.APSproject.demo.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario,Integer> {
}
