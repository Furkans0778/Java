package com.furkan.deneme1;

public class persons {
    String name;
    String secondName;
    int age;
    int id;

    public persons(String name, String secondName, int age, int id) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.id = id;
    }
    public static void main(String [] args){
        
        //------------------
        
        persons furkan = new persons("furkan","simsek",17,0); //furkan created :)
        
        //--------------------
        
        System.out.println("id: "+furkan.id);
        System.out.println("name: "+furkan.name);
        System.out.println("secondName: "+furkan.secondName);
        System.out.println("age: "+furkan.age);
    }
   
}
