package xyz.muscaestar.muscacafebarista.service;

import xyz.muscaestar.muscacafebarista.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
public interface CustomerService {
    CustomerDto getById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteById(UUID id);
}
