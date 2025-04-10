package com.practice;

public final class ImmutableCode {
    private final String name;
    private final int age;

    public ImmutableCode(String name ,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        ImmutableCode code=new ImmutableCode("mith",30);

        System.out.println("Name :- "+code.getName());
        System.out.println("Age :- "+code.getAge());

//        code.name="mithilesh";  // we can not reassign the name and age because of immutability
//        code.age=32;

    }
}
