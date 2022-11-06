package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Balloon;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public interface BalloonService {
    List<Balloon> listAll();
    List<Balloon> searchByNameOrDescription(String text);
}
