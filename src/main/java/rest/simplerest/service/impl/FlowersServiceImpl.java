package rest.simplerest.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.simplerest.entity.Flower;
import rest.simplerest.repository.FlowerRepository;
import rest.simplerest.service.FlowerService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlowersServiceImpl implements FlowerService {

    private final FlowerRepository flowerRepository;

    @Override
    @Transactional
    public List<Flower> getAllFlowers() {
        log.info("Method get all flowers in class {} started", getClass().getSimpleName());
        List<Flower> flowers = flowerRepository.findAll();
        log.info("Method get all flowers in class {} finished", getClass().getSimpleName());
        return flowers;
    }


    @Override
    @Transactional
    public List<Flower> getFlowersByType(String type) {
        log.info("Method get flowers by type in class {} started", getClass().getSimpleName());
        List<Flower> flowers = flowerRepository.findFlowerByType(type);
        log.info("Method get flowers by type in class {} finished", getClass().getSimpleName());
        return flowers;
    }

    @Override
    @Transactional
    public void saveFlower(Flower flower) {
        log.info("Method save flower in class {} started", getClass().getSimpleName());
        flowerRepository.save(flower);
        log.info("Method save flower in class {} finished", getClass().getSimpleName());
    }
}
