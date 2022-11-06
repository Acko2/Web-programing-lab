package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Balloon;
import mk.ukim.finki.wp.lab.repository.BalloonRepository;
import mk.ukim.finki.wp.lab.service.BalloonService;

import java.util.List;

public class BalloonServiceImpl implements BalloonService {
    BalloonRepository repository;

    public BalloonServiceImpl (BalloonRepository repository){
        this.repository = repository;
    }
    @Override
    public List<Balloon> listAll() {
        return repository.listAll();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return repository.searchByNameOrDescription(text);
    }
}
