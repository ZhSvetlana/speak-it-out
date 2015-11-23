package models;

import javax.persistence.*;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String audio;
    public String spelling;
    @ManyToOne
    public GameSession gameSession;
    @ManyToOne
    public Word word;
}

