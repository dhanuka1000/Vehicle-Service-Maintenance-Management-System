package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.MechanicDTO;

import java.util.List;

public interface MechanicService {

    MechanicDTO save(MechanicDTO mechanicDTO);
    MechanicDTO update(MechanicDTO mechanicDTO);
    void delete(Long mId);
    List<MechanicDTO> getAll();
    Long generateNewId();
}
