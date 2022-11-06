package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Balloon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BalloonRepository {
    List<Balloon> balloons;

    public BalloonRepository(){
        this.balloons = new ArrayList<Balloon>();
    }

    public List<Balloon> listAll(){
        return balloons;
    }

    public List<Balloon> searchByNameOrDescription(String text){
        return balloons.stream()
                .filter(balloon -> (balloon.getName().equals(text) || balloon.getDescription().equals(text)))
                .collect(Collectors.toList());
    }
}
