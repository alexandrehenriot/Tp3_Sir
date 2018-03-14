package maven;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import javax.persistence.*;
import java.util.List;

@Entity("articles")
public class Article {

    @Id
    private ObjectId id_article;

    private String name;

    private int stars;


    private List<Person> buyers;

    public Article(){

    }

    public ObjectId getId_article() {
        return id_article;
    }

    public void setId_article(ObjectId id_article) {
        this.id_article = id_article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @OneToMany(mappedBy = "articles", cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
    public List<Person> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Person> buyers) {
        this.buyers = buyers;
    }

}
