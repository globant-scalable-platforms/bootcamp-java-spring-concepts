package springbootcamp.springdatajpa.repositories.entities;

import javax.persistence.*;

@Table
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String userName;

    private String emailAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
