package lk.ijse.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDTO {

    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private Integer loyalty;
}
