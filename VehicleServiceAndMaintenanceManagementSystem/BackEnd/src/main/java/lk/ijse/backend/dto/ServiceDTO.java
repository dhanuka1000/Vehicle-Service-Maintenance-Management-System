package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ServiceDTO {

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
