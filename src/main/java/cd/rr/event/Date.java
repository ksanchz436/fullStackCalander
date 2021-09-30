package cd.rr.event;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Date {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private  String month;
    @Column
    private int day;
    @Column
    private int year;
}
