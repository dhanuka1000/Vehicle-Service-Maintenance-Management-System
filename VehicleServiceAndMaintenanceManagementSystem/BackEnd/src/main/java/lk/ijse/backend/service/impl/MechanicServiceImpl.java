package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.MechanicDTO;
import lk.ijse.backend.entity.Mechanic;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.MechanicRepository;
import lk.ijse.backend.service.custom.MechanicService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class MechanicServiceImpl implements MechanicService {

    private final MechanicRepository mechanicRepository;
    private final ModelMapper modelMapper;

    @Override
    public MechanicDTO save(MechanicDTO mechanicDTO) {
        if(mechanicDTO == null) throw new CustomException("Mechanic cannot be null");

        mechanicDTO.setMechanicId(null);

        Mechanic mechanic =modelMapper.map(mechanicDTO, Mechanic.class);

        Mechanic saved = mechanicRepository.save(mechanic);

        return modelMapper.map(saved, MechanicDTO.class);
    }

    @Override
    public MechanicDTO update(MechanicDTO mechanicDTO) {
        return null;
    }

    @Override
    public void delete(Long mId) {

    }

    @Override
    public List<MechanicDTO> getAll() {
        return List.of();
    }

    @Override
    public Long generateNewId() {
        return 0L;
    }
}
