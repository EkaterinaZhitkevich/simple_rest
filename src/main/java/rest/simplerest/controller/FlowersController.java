package rest.simplerest.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.simplerest.entity.Flower;
import rest.simplerest.service.FlowerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/flowers")
public class FlowersController {

    private final FlowerService flowerService;

    @GetMapping
    public ResponseEntity<List<Flower>> getAllFlowers() {
        log.info("Method get all flowers in class {} started", getClass().getSimpleName());
        List<Flower> flowers = flowerService.getAllFlowers();
        log.info("Method get all flowers in class {} finished", getClass().getSimpleName());
        return ResponseEntity.ok(flowers);
    }

    @GetMapping("/{type}")
    public ResponseEntity<List<Flower>> getFlowersByType(String type) {
        log.info("Method get flowers by type in class {} started", getClass().getSimpleName());
        List<Flower> flowers = flowerService.getFlowersByType(type);
        log.info("Method get flowers by type in class {} started", getClass().getSimpleName());
        return ResponseEntity.ok(flowers);
    }

    @PostMapping
    public ResponseEntity<Void> saveFlower(Flower flower) {
        log.info("Method save flower in class {} started", getClass().getSimpleName());
        flowerService.saveFlower(flower);
        log.info("Method save flower in class {} finished", getClass().getSimpleName());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
