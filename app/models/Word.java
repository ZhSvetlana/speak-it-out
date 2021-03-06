package models;


import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String spelling;
    public String picture;
    public int level;
    @OneToMany(mappedBy = "word", fetch = FetchType.LAZY)
    public List<Answer> answers;
    @ManyToOne
    public Category category;

    public static List<Word> getAll(){
        TypedQuery<Word> query = JPA.em().createQuery("SELECT w FROM Word w", Word.class);
        return query.getResultList();
    }
}

