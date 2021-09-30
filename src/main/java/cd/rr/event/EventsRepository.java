package cd.rr.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.hibernate.cfg.JPAIndexHolder;

@Repository
public interface EventsRepository extends JpaRepository<Event, Byte> {


}
