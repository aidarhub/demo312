package com.example.demo.service;

import com.example.demo.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> listRole();

    Role getRoleById(Long id);

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRole(Role role);

    Role getRoleByName(String role);
}
