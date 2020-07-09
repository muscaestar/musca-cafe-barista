package xyz.muscaestar.muscacafebarista.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.muscaestar.muscacafebarista.web.model.CoffeeDto;
import xyz.muscaestar.muscacafebarista.web.service.CoffeeService;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
@RequestMapping("/api/v1/coffee")
@RestController
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping("/{cfeId}")
    public ResponseEntity<CoffeeDto> getCoffee(@PathVariable("cfeId") UUID cfeId) {
        return new ResponseEntity<>(coffeeService.getCoffeeById(cfeId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CoffeeDto coffeeDto) {
        CoffeeDto savedCoffee = coffeeService.saveNewCoffee(coffeeDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/coffee/" + savedCoffee.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{cfeId}")
    public ResponseEntity handleUpdate(@PathVariable("cfeId") UUID cfeId, @RequestBody CoffeeDto coffeeDto) {
        coffeeService.updateCoffee(cfeId, coffeeDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{cfeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCoffee(@PathVariable("cfeId") UUID cfeId) {
        coffeeService.deleteById(cfeId);
    }
}
