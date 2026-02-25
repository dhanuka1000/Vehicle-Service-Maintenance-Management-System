package lk.ijse.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class SpareParts {
    @Id
    private Long sparePartsId;
    private String sparePartsName;
    private String sparePartsDescription;
    private String supplier;
    private String recordLevel;
    private Double buyingPrice;
    private Double sellingPrice;
}
