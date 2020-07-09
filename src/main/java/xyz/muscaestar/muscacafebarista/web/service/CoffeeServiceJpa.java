package xyz.muscaestar.muscacafebarista.web.service;

import org.springframework.stereotype.Service;
import xyz.muscaestar.muscacafebarista.web.model.CoffeeDto;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
@Service
public class CoffeeServiceJpa implements CoffeeService {
    @Override
    public CoffeeDto getCoffeeById(UUID cfeId) {
        return CoffeeDto.builder().id(UUID.randomUUID())
                .cfeName("Black Eye")
                .cfeStyle("Espresso")
                .build();
    }

    @Override
    public CoffeeDto saveNewCoffee(CoffeeDto coffeeDto) {
        return CoffeeDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCoffee(UUID cfeId, CoffeeDto coffeeDto) {
        // todo
    }

    @Override
    public void deleteById(UUID cfeId) {
        // todo
    }
}
