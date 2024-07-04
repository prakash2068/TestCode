package com.Inc.UserManagement.Service.Impl;

import com.Inc.UserManagement.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleService roleService;


}
