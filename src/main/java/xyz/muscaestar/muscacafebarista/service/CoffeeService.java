package xyz.muscaestar.muscacafebarista.service;

import xyz.muscaestar.muscacafebarista.web.model.CoffeeDto;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
public interface CoffeeService {
    CoffeeDto getCoffeeById(UUID cfeId);

    CoffeeDto saveNewCoffee(CoffeeDto coffeeDto);

    void updateCoffee(UUID cfeId, CoffeeDto coffeeDto);

    void deleteById(UUID cfeId);
}
