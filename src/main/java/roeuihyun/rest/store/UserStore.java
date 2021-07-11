package roeuihyun.rest.store;

import roeuihyun.rest.entity.User;

import java.util.List;

public interface UserStore {
    //
    String create (User newUser);
    void update (User newUser);
    void delete (String id);

    User retrive (String id);
    List<User> retriveAll();
}
