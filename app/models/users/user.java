package models.users;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class user extends Model {

    @Id
    private String email;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String password;

    @Constraints.Required
    private String name;



    public User()
    {

    }

    public static Finder<String,User> find = new Finder<String,User>(user.class);
    public static List<User> findAll() {
        return User.find.all()}
    public static User authenticate(String email,String password) {
        return find.where().eq("password", password).findUnique();
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


