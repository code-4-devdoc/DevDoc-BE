package com.devdoc.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "RResume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @ManyToOne(fetch = FetchType.LAZY)                    // user_id 삭제
    // @JoinColumn(name = "user_id", nullable = false)
    // private User user;

    private String title;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Skill> skills;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Career> careers;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Project> projects;

    public Resume() {}

    // public Resume(User user, String title) {              // user_id 삭제
    public Resume(String title) {
        // this.user = user;                                 // user_id 삭제
        this.title = title;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public User getUser() {                               // user_id 삭제
    //     return user;
    // }

    // public void setUser(User user) {                      // user_id 삭제
    //     this.user = user;
    // }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Career> getCareers() {
        return careers;
    }

    public void setCareers(List<Career> careers) {
        this.careers = careers;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
