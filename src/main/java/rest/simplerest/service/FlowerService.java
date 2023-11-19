package rest.simplerest.service;

import rest.simplerest.entity.Flower;

import java.util.List;

public interface FlowerService {

    List<Flower> getAllFlowers();

    List<Flower> getFlowersByType(String type);

    void saveFlower(Flower flower);
}
