package models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
public class User{
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
}

