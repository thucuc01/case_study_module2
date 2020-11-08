
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class Person implements Serializable {
    String id;
    String name;
    byte age;
    String address;


    public Person() {
    }

    public Person(String id, String name, byte age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "  MSV= " + id + ",  Fullname= " + name + ",  age= " + age + ",  address= " + address +'.';
    }
    
}
