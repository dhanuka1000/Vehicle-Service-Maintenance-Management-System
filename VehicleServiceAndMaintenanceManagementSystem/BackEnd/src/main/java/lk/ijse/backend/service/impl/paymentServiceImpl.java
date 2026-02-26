package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.PaymentDTO;
import lk.ijse.backend.entity.Payment;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.PaymentRepository;
import lk.ijse.backend.service.custom.PaymentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class paymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final ModelMapper modelMapper;

    @Override
    public PaymentDTO save(PaymentDTO paymentDTO) {

        if (paymentDTO == null) throw new CustomException("Invalid payment data");

        paymentDTO.setPaymentId(null);

        Payment payment = modelMapper.map(paymentDTO, Payment.class);

        Payment saved = paymentRepository.save(payment);

        return modelMapper.map(saved, PaymentDTO.class);

    }

    @Override
    public PaymentDTO update(PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public PaymentDTO delete(Long pId) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAll() {
        return List.of();
    }

    @Override
    public Long generateId() {
        return 0L;
    }
}
