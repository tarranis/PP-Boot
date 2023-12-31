package CrudApp.FrirstCRUDAppBoot.service;



import CrudApp.FrirstCRUDAppBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User update(User user);

    void save(User user);

    void delete(User user);

    User findById(Long id);

}
