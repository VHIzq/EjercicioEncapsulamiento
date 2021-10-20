package com.company.Encapsulamiento;
//Se crea la clase
public class Person {
    //definen los atributos en privado
    private  String name;
    private  int age;
    private String id;
        //constructor
    public  Person ( String name, int age, String id ){
        this.setName(name);
        this.setAge(age);
        this.setId(id);
    }
    public  String getName(){
        return  name;
    }
    public int getAge(){
       return  age;
    }
    public  String getId(){
        return  id;
    }
    public  void setName(String name ){
        this.name = name;
    }
    public  void setAge(int age){
        this.age  = age;
    }
    public  void setId(String id){
        this.id = id;
    }


}
