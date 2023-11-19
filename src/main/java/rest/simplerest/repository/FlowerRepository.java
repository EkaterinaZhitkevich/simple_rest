package rest.simplerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rest.simplerest.entity.Flower;

import java.util.List;

public interface FlowerRepository extends JpaRepository<Flower, Long> {

    @Query("from Flower f where f.type = :type")
    List<Flower> findFlowerByType(String type);
}
