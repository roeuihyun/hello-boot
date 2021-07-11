package roeuihyun.rest.entity;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class User {
    //
    private String id;
    private String name;
    private String email;

    //
    public User(){
        this.id = UUID.randomUUID().toString();
    }

    public User(String name, String email){
        //
        this();
        this.name = name;
        this.email = email;
    }

    public static User sample(){
        //
        return new User("roeuihyun", "roeuihyun@gmail.com");
    }

    public static void main(String[] args) {
        //
        User user = new User("kim","kim@naver.com;");
        System.out.println(new Gson().toJson(user));
    }

}
