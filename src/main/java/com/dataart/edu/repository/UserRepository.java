package com.dataart.edu.repository;

import com.dataart.edu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by akuzmenko on 3/2/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
