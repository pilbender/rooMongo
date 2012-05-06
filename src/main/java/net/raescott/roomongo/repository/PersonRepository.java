package net.raescott.roomongo.repository;

import java.util.List;
import net.raescott.roomongo.model.Person;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Person.class)
public interface PersonRepository {

    List<net.raescott.roomongo.model.Person> findAll();
}
