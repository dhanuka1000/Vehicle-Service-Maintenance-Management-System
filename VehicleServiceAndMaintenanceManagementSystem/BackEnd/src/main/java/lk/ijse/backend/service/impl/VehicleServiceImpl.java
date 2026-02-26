package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.VehicleDTO;
import lk.ijse.backend.entity.Vehicle;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.VehicleRepository;
import lk.ijse.backend.service.custom.VehicleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final ModelMapper modelMapper;

    @Override
    public VehicleDTO save(VehicleDTO vehicleDTO) {

        if (vehicleDTO == null) throw new CustomException("VehicleDTO is null");

        vehicleDTO.setVehicleId(null);

        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);

        Vehicle saved = vehicleRepository.save(vehicle);

        return modelMapper.map(saved, VehicleDTO.class);
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
