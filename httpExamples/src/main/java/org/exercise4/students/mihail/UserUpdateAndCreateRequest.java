package org.exercise4.students.mihail;

public class UserUpdateAndCreateRequest {
    private String name;
    private String job;

    // Constructor
    public UserUpdateAndCreateRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }
}