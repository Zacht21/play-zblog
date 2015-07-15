package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import play.modules.morphia.Model;

import javax.persistence.Lob;
import java.util.Date;

/**
 * Created by jhermosillo on 13/07/15.
 */
@Entity
public class Comentario extends Model{
    public String author;
    public Date postedAt;

    @Lob
    public String content;

    @Reference
    public Post post;

    public Comentario(String author, String content, Post post) {
        this.author = author;
        this.content = content;
        this.post = post;
        this.postedAt = new Date();
    }
}
