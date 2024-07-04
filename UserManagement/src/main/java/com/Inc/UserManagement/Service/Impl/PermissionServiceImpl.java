package com.Inc.UserManagement.Service.Impl;

import com.Inc.UserManagement.Service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionService permissionService;

}
