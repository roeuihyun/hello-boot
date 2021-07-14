package roeuihyun.rest.store.logic;

import org.springframework.stereotype.Component;
import roeuihyun.rest.entity.User;
import roeuihyun.rest.store.UserStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class UserStoreLogic implements UserStore {

    //
    private Map<String, User> userMap;

    //
    public UserStoreLogic(){
        //
        this.userMap = new HashMap<>();
    }

    @Override
    public String create(User newUser) {
        //
        this.userMap.put(newUser.getId(), newUser);
        return newUser.getId();
    }

    @Override
    public void update(User newUser) {
        //
        this.userMap.put(newUser.getId(), newUser);
    }

    @Override
    public void delete(String id) {
        //
        this.userMap.remove(id);
    }

    @Override
    public User retrive(String id) {
        //
        return this.userMap.get(id);
    }

    @Override
    public List<User> retriveAll() {
        //
        return this.userMap.values().stream().collect(Collectors.toList());
    }
    //
}
