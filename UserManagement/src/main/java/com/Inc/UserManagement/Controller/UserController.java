package com.Inc.UserManagement.Controller;

import com.Inc.UserManagement.Model.User;
import com.Inc.UserManagement.Response.GenericResponse;
import com.Inc.UserManagement.SSO.ResponseModel;
import com.Inc.UserManagement.Service.Impl.UserServiceImpl;
import com.Inc.UserManagement.Service.UserService;
import com.Inc.UserManagement.Utils.LogMessageConstant;
import com.Inc.UserManagement.Utils.ResponseCodeConstant;
import com.Inc.UserManagement.Utils.ResponseMessageConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
     UserServiceImpl userServiceImpl;

    //Method-1
    // To get the list of users
    @GetMapping(value = "/listUser/", produces = "application/json")
  public List<User> listUser1() {
    LOG.info(LogMessageConstant.FETCHING_ALL_USERS);
      List<User> users = userService.listUser();
    if (users == null || users.isEmpty()) {

        return users;
          }else {
        return null;
    }
  }


  // Method-2
   // To get the list of users
  @GetMapping(value = "/listUser/", produces = "application/json")
  public ResponseEntity<?> listUser() {
    LOG.info(LogMessageConstant.FETCHING_ALL_USERS);

    try {
      // Fetch the list of users from the service
      List<User> users = userService.listUser();

      // Check if the list is empty or null and return appropriate response
      if (users == null || users.isEmpty()) {
        return new ResponseEntity<>(
            new ResponseModel(
                new GenericResponse(
                    ResponseMessageConstant.FAILURE_STATUS_CODE,
                    ResponseMessageConstant.FAILURE_RESULT_CODE,
                    ResponseCodeConstant.SOME_ERROR_OCCURED,
                    ResponseMessageConstant.USER_NOT_FOUND_MESSAGE),
                null,
                null),
            HttpStatus.BAD_REQUEST);
      }

      // Return the list of users with HTTP status OK
      return new ResponseEntity<>(users, HttpStatus.OK);

    } catch (Exception e) {
      return new ResponseEntity<>(
          new ResponseModel(
              new GenericResponse(ResponseMessageConstant.FAILURE_STATUS_CODE,
                  ResponseMessageConstant.FAILURE_RESULT_CODE,
                  ResponseCodeConstant.SOME_ERROR_OCCURED, ResponseMessageConstant.AN_ERROR_OCCURED_WHILE_FETCHING_ERROR),
              null,
              null),
          HttpStatus.INTERNAL_SERVER_ERROR);
    }
 }

}
