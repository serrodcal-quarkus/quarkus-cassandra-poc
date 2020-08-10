package com.serrodcal.poc;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FruitService {

    @Inject
    FruitDao fruitDao;

    public Uni<Void> add(Fruit fruit) {
        return fruitDao.update(fruit);
    }

    public Multi<Fruit> get(String id) {
        return fruitDao.findById(id);
    }

}
