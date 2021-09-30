package cd.rr.event;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Location {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   @Column
   private  String streetAddress;
   @Column
   private  String city;
   @Column
   private String state;




}
