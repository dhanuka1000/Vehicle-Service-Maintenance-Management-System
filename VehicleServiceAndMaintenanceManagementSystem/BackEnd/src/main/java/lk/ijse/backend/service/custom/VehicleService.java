package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {

    VehicleDTO save(VehicleDTO vehicleDTO);
    VehicleDTO update(VehicleDTO vehicleDTO);
    List<VehicleDTO> getAll();
    void deleteAll(Long vid);
    Long generateId();

}
