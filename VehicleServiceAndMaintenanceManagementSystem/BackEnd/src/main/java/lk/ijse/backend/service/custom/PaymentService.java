package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    PaymentDTO save(PaymentDTO paymentDTO);
    PaymentDTO update(PaymentDTO paymentDTO);
    PaymentDTO delete(Long pId);
    List<PaymentDTO> getAll();
    Long generateId();
}
