package web.bootstrap_crud.service;

import web.bootstrap_crud.model.Role;

import java.util.List;

public interface RoleService {

    Role getRoleByName(String role);

    List<Role> getAllRoles();

    Role getRoleById(long id);
}
