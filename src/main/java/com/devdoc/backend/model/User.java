package com.devdoc.backend.model;

import jakarta.persistence.*;
// import java.util.List;                                         // user_id 삭제

@Entity
@Table(name = "UUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<Resume> resumes;                                // user_id 삭제

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public List<Resume> getResumes() {                               // user_id 삭제
    //     return resumes;
    // }

    // public void setResumes(List<Resume> resumes) {
    //     this.resumes = resumes;
    // }
}
