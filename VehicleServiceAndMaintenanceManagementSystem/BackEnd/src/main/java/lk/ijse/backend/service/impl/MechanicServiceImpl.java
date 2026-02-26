package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.MechanicDTO;
import lk.ijse.backend.service.custom.MechanicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class MechanicServiceImpl implements MechanicService {
    @Override
    public MechanicDTO save(MechanicDTO mechanicDTO) {
        return null;
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
