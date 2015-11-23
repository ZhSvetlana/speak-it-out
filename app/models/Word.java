package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
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
}

