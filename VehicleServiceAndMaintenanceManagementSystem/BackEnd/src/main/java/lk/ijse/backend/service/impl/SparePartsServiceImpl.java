package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.SparePartsDTO;
import lk.ijse.backend.service.custom.SparePartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SparePartsServiceImpl implements SparePartService {
    @Override
    public SparePartsDTO save(SparePartsDTO sparePartsDTO) {
        return null;
    }

    @Override
    public SparePartsDTO update(SparePartsDTO sparePartsDTO) {
        return null;
    }

    @Override
    public void delete(SparePartsDTO sparePartsDTO) {

    }

    @Override
    public List<SparePartsDTO> getAll() {
        return List.of();
    }

    @Override
    public Long generateId() {
        return 0L;
    }
}
