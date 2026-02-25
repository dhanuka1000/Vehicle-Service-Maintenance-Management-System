package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SparePartsDTO {

    private Long sparePartsId;
    private String sparePartsName;
    private String sparePartsDescription;
    private String supplier;
    private String recordLevel;
    private Double buyingPrice;
    private Double sellingPrice;
}
