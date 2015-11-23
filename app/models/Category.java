package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    public List<Word> words;
}
