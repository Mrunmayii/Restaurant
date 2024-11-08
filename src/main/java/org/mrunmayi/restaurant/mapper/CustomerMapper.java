package org.mrunmayi.restaurant.mapper;

import org.mrunmayi.restaurant.dto.CustomerRequest;
import org.mrunmayi.restaurant.dto.CustomerResponse;
import org.mrunmayi.restaurant.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }

    public CustomerResponse toDto(Customer customer) {
        return new CustomerResponse(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail()
        );
    }
}