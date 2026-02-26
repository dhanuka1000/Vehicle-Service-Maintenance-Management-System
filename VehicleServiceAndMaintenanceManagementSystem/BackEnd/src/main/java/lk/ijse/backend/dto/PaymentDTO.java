package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PaymentDTO {

    private Long paymentId;
    private String paymentMethod;
    private Date paymentDate;
    private String discountDetails;
    private Double discountAmount;
    private Double totalAmount;
}
