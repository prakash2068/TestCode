package com.Inc.UserManagement.Repository;

import com.Inc.UserManagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // @Query(value = "SELECT * FROM User WHERE userId = ?0", nativeQuery = true)
    List<User> findByUserList(int userId);

    //@Query(value = "SELECT * FROM User WHERE userEmail = ?0", nativeQuery = true)
    User findByUserEmail(String userEmail);

   // @Query(value = "SELECT * FROM User WHERE userId = ?0", nativeQuery = true)
    User findById(int userId);

}
