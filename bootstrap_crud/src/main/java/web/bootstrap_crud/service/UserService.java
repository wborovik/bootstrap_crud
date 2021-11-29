package web.bootstrap_crud.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.bootstrap_crud.model.Role;
import web.bootstrap_crud.model.User;

import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User readUser(Long id);

    void createUser(User user);

    void editUser(Long id, User user);

    void deleteUser(Long id);

    User getUserByEmail(String email);

    Set<Role> getRolesForSet(List<String> rolesId);
}
