package com.practice;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableWIthList {
    private final String name;
    private final List<String> hobbies;

    public ImmutableWIthList(String name,List<String> hobbies){
        this.name=name;
        this.hobbies=new ArrayList<>(hobbies);
    }

    public String getName(){
        return name;
    }
    public List<String> getHobbies(){
        return new ArrayList<>(hobbies);
    }

    public static void main(String[] args) {
        List<String> lis=new ArrayList<>();
        lis.add("cricket");

        ImmutableWIthList im=new ImmutableWIthList("mith",lis);
        im.getHobbies().add("singing");
        System.out.println(im.getName());
        System.out.println(im.getHobbies());
    }
}
