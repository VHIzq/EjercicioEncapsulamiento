package com.company;

import com.company.Encapsulamiento.Person;

public class Main {

    public static void main(String[] args) {
        //instanciar la clase
        Person person= new Person("Santiago", 33, "102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());
    }
}

