package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/*
 * Task*/
@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllTask",
            query = "SELECT t FROM Task AS t ORDER BY t.id DESC"
            ),
    @NamedQuery(
            name = "getTasksCount",
            query = "SELECT COUNT(t) FROM Task AS t"
            )
})
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content", length = 255, nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at_change", nullable = false)
    private Timestamp updated_at_change;

    public void setId(Integer id){
        this.id = id;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setCreated_at(Timestamp created_at){
        this.created_at = created_at;
    }

    public void setUpdated_at_change(Timestamp created_at_change){
        this.updated_at_change = created_at_change;
    }

    public Integer getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public Timestamp getCreated_at(){
        return created_at;
    }

    public Timestamp getUpdated_at_change(){
        return updated_at_change;
    }
}
