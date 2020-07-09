package xyz.muscaestar.muscacafebarista.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.muscaestar.muscacafebarista.web.model.CustomerDto;
import xyz.muscaestar.muscacafebarista.web.service.CustomerService;

import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable("id")UUID id) {
        return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer" + savedCustomer.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity handlePut(@PathVariable UUID id, @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(id, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID id) {
        customerService.deleteById(id);
    }
}
