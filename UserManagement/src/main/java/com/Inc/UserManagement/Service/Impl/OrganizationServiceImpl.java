package com.Inc.UserManagement.Service.Impl;

import com.Inc.UserManagement.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
     private OrganizationService organizationService;

}
