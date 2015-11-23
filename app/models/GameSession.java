package models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public int sequenceNumber;
    public Date date;
    public int correctAnswers;
    @ManyToOne
    //@JoinColumn(name="user_id")
    public User user;
    @OneToMany(mappedBy = "gameSession", fetch = FetchType.LAZY)
    public List<Answer> answers;
}
