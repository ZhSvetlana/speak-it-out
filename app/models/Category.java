package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Svetlana on 22.11.2015.
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    public List<Word> words;

    public static List<Category> getAll(){
        TypedQuery<Category> query = JPA.em().createQuery("SELECT p FROM Category p", Category.class);
        return query.getResultList();
    }
}
