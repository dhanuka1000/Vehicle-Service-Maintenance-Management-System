package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.entity.Customer;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.CustomerRepository;
import lk.ijse.backend.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CustomServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        if (customerDTO==null) throw new CustomException("Customer cannot be null");

        customerDTO.setId(null);

        //convert DTO to Entity From ModelMapper(less boilerPlate Code)
        Customer customer = modelMapper.map(customerDTO, Customer.class);

        //talk to DB (generate sql behind the scenes)
        Customer saved = customerRepository.save(customer);

        //When saved data return Entity converting to DTO
        return modelMapper.map(saved, CustomerDTO.class);
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {

        /** frontEnd eken data enne customerDto ekak widiyata. eke data natnam update wenna widiyak na. ema weddi system eka
        crash wenna puluwa. ema nowenna error ekak through karanawa. **/

        if (customerDTO==null) throw new CustomException("Customer cannot be null");

        /** frontEnd eka customer Id eken data base eke customer hoyanawa.
         ema hoyaddi customer kenek nati unoth return customer kenek nane. eke ena error ek through karanawa methanin.**/
        Customer existingCustomer = customerRepository.findById(customerDTO.getId())
                .orElseThrow(() -> new CustomException("Customer not found"));

        /** customer kenek innawanam eyala me aluth value tika set karanawa. old data tika me data tiken replace wenawa. **/
        existingCustomer.setName(customerDTO.getName());
        existingCustomer.setPhoneNumber(customerDTO.getPhoneNumber());
        existingCustomer.setEmail(customerDTO.getEmail());
        existingCustomer.setAddress(customerDTO.getAddress());
        existingCustomer.setLoyalty(customerDTO.getLoyalty());

        /** Spring Boot wala id eken save() eka call unoth ethanadi wenne update ekak. eka nisa methanadi update wenawa. **/
        Customer updatedCustomer = customerRepository.save(existingCustomer);

        /** Entity Data tika DTO ekata convert karala return karanawa.**/
        return modelMapper.map(updatedCustomer, CustomerDTO.class);
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
