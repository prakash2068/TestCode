package com.Inc.UserManagement.Service.Impl;

import com.Inc.UserManagement.Model.User;
import com.Inc.UserManagement.Repository.UserRepository;
import com.Inc.UserManagement.Response.GenericResponse;
import com.Inc.UserManagement.SSO.ResponseModel;
import com.Inc.UserManagement.Service.UserService;
import com.Inc.UserManagement.Utils.ResponseCodeConstant;
import com.Inc.UserManagement.Utils.ResponseMessageConstant;
import jakarta.persistence.EntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;


import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("userService")
public class UserServiceImpl implements UserService {

    final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    //  @PersistenceContext(type = PersistenceContextType.EXTENDED)
    @Autowired
    private EntityManagerFactory entityManager;

    @Autowired
    private UserService userService;

//    @Autowired
  //  private BCryptPasswordEncoder bCryptEncoder;

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> listUser() {
        try{

    List<User> list = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
        }catch (Exception e){

            return null;
    }
        }

    @Override
    public void delete(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User findByUserEmail(String userEmail) throws ResourceNotFoundException {
        User user = userRepository.findByUserEmail(userEmail);

        if (user==null) {
            throw new ResourceNotFoundException(ResponseMessageConstant.USER_NOT_FOUND_MESSAGE);
        }
        return user;
    }

    @Override
    public User findByUserId(int userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId);

        if (user==null) {
            throw new ResourceNotFoundException(ResponseMessageConstant.USER_NOT_FOUND_MESSAGE);
        }
        return user;
    }

    @Override
    public void update(User user) {
        userRepository.save(user);

    }

    @Override
    public void updatePassword(int userId, String newPassword) throws ResourceNotFoundException {

        User user = findByUserId(userId);
        //user.setPassword(bCryptEncoder.encode(newPassword));
        user.setPassword(newPassword);

        userRepository.save(user);
    }

}
