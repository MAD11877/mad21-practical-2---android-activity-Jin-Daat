package com.example.practical2;

public class User {
    String name;
    String description;
    int id;
    boolean followed;
//    Constructor
    public User (String userName, String userDesc, int userId, boolean userFollow){
        name = userName;
        description = userDesc;
        id = userId;
        followed = userFollow;
    }
}
