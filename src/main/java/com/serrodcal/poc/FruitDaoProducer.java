package com.serrodcal.poc;

import com.datastax.oss.quarkus.runtime.api.session.QuarkusCqlSession;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class FruitDaoProducer {

    private final FruitDao fruitDao;

    @Inject
    public FruitDaoProducer(QuarkusCqlSession session) {
        FruitMapper mapper = new FruitMapperBuilder(session).build();
        fruitDao = mapper.fruitDao();
    }

    @Produces
    @ApplicationScoped
    FruitDao produceFruitDao() {
        return fruitDao;
    }

}
