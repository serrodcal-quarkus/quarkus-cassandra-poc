package com.serrodcal.poc;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FruitResource {

    private static final String STORE_NAME = "acme";

    @Inject
    FruitService fruitService;

    @Route(path = "/api/v1/fruit", methods = HttpMethod.GET)
    void getAll(RoutingContext rc){

    }

    @Route(path = "/api/v1/fruit/:storeId", methods = HttpMethod.GET)
    void getFruit(RoutingContext rc){

    }

    @Route(path = "/api/v1/fruit", methods = HttpMethod.POST)
    void add(RoutingContext rc) {

    }

    private Fruit covertFromDto(FruitDto fruitDto) {
        return new Fruit(STORE_NAME, fruitDto.getName(), fruitDto.getDescription());
    }

}