package com.project.registration.repository;

import com.project.registration.model.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Integer>
{
    List<user> findByfirstname(String firstname);
}
