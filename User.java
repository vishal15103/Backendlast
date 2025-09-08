package org.example.model;



import jakarta.persistence.*;



@Entity

@Table(name = "users")

public class User {



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @Column(unique = true, nullable = false)

    private String userId;



    @Column(nullable = false)

    private String password;



    @Column(nullable = false)

    private String role;



    public User() {}



    public User(Long id, String userId, String password, String role) {

        this.id = id;

        this.userId = userId;

        this.password = password;

        this.role = role;

    }



    // Getters and setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }



    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }



    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }



    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

}
