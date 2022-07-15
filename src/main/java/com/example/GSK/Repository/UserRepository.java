package com.example.GSK.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GSK.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
      User findByEmail (String email);

}
