package com.Inc.UserManagement.Service;

import com.Inc.UserManagement.Model.User;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface UserService {


    List<User> listUser();

    void delete(int userId);

    User findByUserEmail(String userEmail) throws ResourceNotFoundException;

    User findByUserId(int userId) throws ResourceNotFoundException;

//    User update(String id, UpdateUserDto updateUserDto) throws ResourceNotFoundException;

    void update(User user);

   // User updatePassword(String id, UpdatePasswordDto updatePasswordDto) throws ResourceNotFoundException;

    void updatePassword(int userId, String newPassword) throws ResourceNotFoundException;

    //void confirm(int userId) throws ResourceNotFoundException;
}
