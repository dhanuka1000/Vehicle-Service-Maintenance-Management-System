package lk.ijse.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mechanicId;
    private String mechanicName;
    private String mechanicPhoneNumber;
    private BigDecimal totalRevenueGenerated;
    private Integer completedService;
    private String specialization;
}