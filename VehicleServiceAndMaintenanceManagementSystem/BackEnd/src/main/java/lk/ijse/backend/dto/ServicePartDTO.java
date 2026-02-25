package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ServicePartDTO {

    private Long servicePartId;
    private String sparePartsId;
    private String serviceId;
    private Integer quantity;
    private Double price;
}
