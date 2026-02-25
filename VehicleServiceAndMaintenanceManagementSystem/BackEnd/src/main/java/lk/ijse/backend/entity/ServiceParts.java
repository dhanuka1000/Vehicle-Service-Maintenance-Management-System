package lk.ijse.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ServiceParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicePartId;
    private String sparePartsId;
    private String serviceId;
    private Integer quantity;
    private Double price;
}
