package com.barzykin.edu;

import com.barzykin.edu.builder.User;

public class BuilderDemo {
    public static void main(String[] args) {
        User alex = User.builder()
                .withId(3)
                .withName("Alex")
                .build();

        System.out.println(alex);
    }
}
