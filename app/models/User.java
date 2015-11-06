package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
 @MongoEntity("User")
public class User extends MongoModel {

    public String name;
    public String pass;
    public String user;
    
}