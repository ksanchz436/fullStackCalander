package cd.rr.event;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.List;



@RestController
public class EventController {

    @Autowired
    private EventsRepository eventsRepository;

    @GetMapping("/")
    public String ping(){
        return "ping";
    }

    @GetMapping("/readEvent")
    public List<Event> read(){
        return eventsRepository.findAll();
    }

    @PostMapping("/createEvent")
    public Event create(@RequestBody Event event){
        return eventsRepository.save(event);
    }

    @PutMapping("/updateEvent")
    public Event update(@RequestBody Event event){
        return eventsRepository.save(event);
    }

    @DeleteMapping("/deleteEvent")
        public String delete(@RequestBody Event event){
            eventsRepository.delete(event);
            return "Success";
        }






}
