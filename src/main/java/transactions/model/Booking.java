package transactions.model;

import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullFields;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String name;

    public Booking(String name) {
        this.name = name;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
