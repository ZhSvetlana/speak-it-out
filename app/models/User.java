package models;


import play.db.jpa.JPA;

import javax.persistence.*;


import java.util.Date;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String firstName;
    public String secondName;
    public Date birthDate;
    public char gender;
    public String email;
    public String password;
    public int level;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<GameSession> gameSessions;


    public static User find(int id) {
        TypedQuery<User> query = JPA.em().createQuery("SELECT p FROM User p WHERE p.id = :id", User.class);
        query.setParameter("id", id);

        List results = query.getResultList();
        if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();
    }

    public static User find(String email) {
        TypedQuery<User> query = JPA.em().createQuery("SELECT p FROM User p WHERE p.email = :email", User.class);
        query.setParameter("email", email);

        List results = query.getResultList();
        if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();
    }

    public void save() {
        JPA.em().persist(this);
    }


    public static User authenticate(String email, String password) {

        System.out.println("Hello");
        TypedQuery<User> query = JPA.em().createQuery("SELECT p FROM User p WHERE p.email = :email AND p.password = :password", User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        System.out.println("Hello2");
        List results = query.getResultList();
        if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();
    }
}

