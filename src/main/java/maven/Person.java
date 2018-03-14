package maven;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import javax.annotation.Generated;
import java.util.List;

@Entity("personne")
public class Person {

    @Id
    private ObjectId id_pers;

    private String name;


    private Address address;

    public Person(){

    }


    public ObjectId getId_pers() {
        return id_pers;
    }

    public void setId_pers(ObjectId id_pers) {
        this.id_pers = id_pers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
