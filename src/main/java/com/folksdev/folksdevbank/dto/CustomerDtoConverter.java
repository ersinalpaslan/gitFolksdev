package com.folksdev.folksdevbank.dto;

import com.folksdev.folksdevbank.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public CustomerDto convert(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setAddress(customer.getAddress());
        customerDto.setName(customer.getName());
        customerDto.setCity(CityDto.valueOf(customer.getCity().name()));
        customerDto.setDateOfBirth(customer.getDateOfBirth());

        return customerDto;
    }
}
