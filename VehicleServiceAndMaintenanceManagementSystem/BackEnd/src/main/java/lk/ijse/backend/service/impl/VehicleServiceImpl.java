package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.VehicleDTO;
import lk.ijse.backend.service.custom.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class VehicleServiceImpl implements VehicleService {
    @Override
    public VehicleDTO save(VehicleDTO vehicleDTO) {
        return null;
    }

    @Override
    public VehicleDTO update(VehicleDTO vehicleDTO) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAll() {
        return List.of();
    }

    @Override
    public void deleteAll(Long vid) {

    }

    @Override
    public Long generateId() {
        return 0L;
    }
}
