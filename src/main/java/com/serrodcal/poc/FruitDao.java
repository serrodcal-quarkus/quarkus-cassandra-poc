package com.serrodcal.poc;

import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;
import com.datastax.oss.quarkus.runtime.api.reactive.mapper.MutinyMappedReactiveResultSet;
import io.smallrye.mutiny.Uni;

@Dao
public interface FruitDao {

    @Update
    Uni<Void> update(Fruit fruit);

    @Select
    MutinyMappedReactiveResultSet<Fruit> findById(String storeId);

}
