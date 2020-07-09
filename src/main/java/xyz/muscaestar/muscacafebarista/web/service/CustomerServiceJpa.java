package xyz.muscaestar.muscacafebarista.web.service;

import org.springframework.stereotype.Service;
import xyz.muscaestar.muscacafebarista.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
@Service
public class CustomerServiceJpa implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Rika")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        // todo

    }

    @Override
    public void deleteById(UUID id) {

        // todo
    }
}
