package cd.rr.event;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Data
@Entity
@Table

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationID", referencedColumnName = "id")
    private Location location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dateID", referencedColumnName = "id")
    private Date date;

    @Column
    private String priorityColor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personID", referencedColumnName = "id")
    private Person host;


}
