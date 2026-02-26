package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.SparePartsDTO;

import java.util.List;

public interface SparePartService {

    SparePartsDTO save(SparePartsDTO sparePartsDTO);
    SparePartsDTO update(SparePartsDTO sparePartsDTO);
    void delete(SparePartsDTO sparePartsDTO);
    List<SparePartsDTO> getAll();
    Long generateId();
}
