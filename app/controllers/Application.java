package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

     public static void saveUser() {
        User usuarios= new User('Ivan','secret','userIvan');
        usuarios.save();
        render();
    }

    public static void findUser() {
        List<User> allUsers = User.find().fetch();
    }

    public static void saveRol() {
        Rol rol= new Rol('1','Admin');
        rol.save();
        render();
    }

    public static void findRol() {
        List<User> allRol = Rol.find().fetch();
    }

     public static void savePermiso() {
        Permiso rol= new Permiso('1','Admin');
        rol.save();
        render();
    }

    public static void findPermiso() {
        List<User> allPermiso = Permiso.find().fetch();
    }

}