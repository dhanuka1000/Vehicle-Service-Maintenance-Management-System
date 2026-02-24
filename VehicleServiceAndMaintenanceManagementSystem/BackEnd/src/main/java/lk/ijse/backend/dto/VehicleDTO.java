package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VehicleDTO {

    private Long vehicleId;
    private String customerId;
    private String vehicleNumber;
    private String vehicleBrand;
    private String vehicleModel;
    private Integer vehicleYear;
    private Integer vehicleMileage;
}
