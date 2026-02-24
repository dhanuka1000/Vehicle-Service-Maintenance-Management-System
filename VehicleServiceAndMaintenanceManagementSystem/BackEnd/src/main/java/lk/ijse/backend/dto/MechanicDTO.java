package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MechanicDTO {
    private Long mechanicId;
    private String mechanicName;
    private String mechanicPhoneNumber;
    private BigDecimal totalRevenueGenerated;
    private Integer completedService;
    private String specialization;
}
