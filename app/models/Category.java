package models;

import play.db.jpa.JPA;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

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
    @OneToMany(mappedBy = "category", fetch = LAZY)
    public List<Word> words;

    public static List<Category> getAll(){
        TypedQuery<Category> query = JPA.em().createQuery("SELECT p FROM Category p", Category.class);
        return query.getResultList();
    }
}
