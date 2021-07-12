package roeuihyun.rest.service.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import roeuihyun.rest.entity.User;
import roeuihyun.rest.service.UserService;
import roeuihyun.rest.store.UserStore;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceLogic implements UserService {

    // Injection 방식
    // 1. Autowired Annotation 사용
    // 2. 생성자를 통한 주입
    // 3. lombok의 RequiredArgsConstructor

    // 1번 타입
//    @Autowired
//    private UserStore userStore;

    // 2번 타입
//    public UserServiceLogic(UserStore userStore){
//        this.userStore = userStore;
//    }
    // 3번 타입
    private final UserStore userStore;

    @Override
    public String register(User newUser) {
        //
        return this.userStore.create(newUser);
    }

    @Override
    public void modify(User newUser) {
        //
        this.userStore.update(newUser);
    }

    @Override
    public void remove(String id) {
        //
        this.userStore.delete(id);
    }

    @Override
    public User find(String id) {
        //
        return this.userStore.retrive(id);
    }

    @Override
    public List<User> findAll() {
        //
        return this.userStore.retriveAll();
    }
}
