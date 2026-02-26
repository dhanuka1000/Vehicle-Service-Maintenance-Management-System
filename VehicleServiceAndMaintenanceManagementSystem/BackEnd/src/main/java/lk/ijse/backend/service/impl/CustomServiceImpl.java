package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CustomServiceImpl implements CustomerService {
    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(Long cId) {

    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return List.of();
    }

    @Override
    public Long generateNewCustomerId() {
        return 0L;
    }
}
