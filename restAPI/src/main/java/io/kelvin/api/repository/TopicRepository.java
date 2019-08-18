package io.kelvin.api.repository;

import io.kelvin.api.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
