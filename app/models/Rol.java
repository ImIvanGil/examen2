package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
 @MongoEntity("Rol")
public class Rol extends MongoModel {

    public String clave;
    public String descripcion;
    
}