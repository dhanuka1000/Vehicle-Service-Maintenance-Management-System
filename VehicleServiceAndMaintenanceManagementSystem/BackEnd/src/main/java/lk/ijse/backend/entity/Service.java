package lk.ijse.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private String vehicleId;
    private String mechanicId;
    private String serviceType;
    private Date serviceDate;
    private Integer mileage;
    private String description;
    private Date nextServiceDate;
    private Integer nextServiceMileage;
    private Double totalCost;
}
