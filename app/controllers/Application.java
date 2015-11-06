package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

     public static void save() {
        User usuarios= new User('Ivan','secret','userIvan');
        usuarios.save();
        render();
    }

    public static void findUser() {
        List<User> allUsers = User.find().fetch();
    }

    

}