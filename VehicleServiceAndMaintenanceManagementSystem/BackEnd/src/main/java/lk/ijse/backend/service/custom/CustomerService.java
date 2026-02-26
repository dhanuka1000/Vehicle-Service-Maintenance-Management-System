package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(Long cId);
    List<CustomerDTO> getAllCustomer();
    Long generateNewCustomerId();
}
