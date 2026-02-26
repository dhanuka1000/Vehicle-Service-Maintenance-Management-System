package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.SparePartsDTO;
import lk.ijse.backend.entity.SpareParts;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.SparePartsRepository;
import lk.ijse.backend.service.custom.SparePartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SparePartsServiceImpl implements SparePartService {

    private final SparePartsRepository sparePartsRepository;
    private final ModelMapper modelMapper;

    @Override
    public SparePartsDTO save(SparePartsDTO sparePartsDTO) {

        if (sparePartsDTO == null) throw  new CustomException("SparePartsDTO is null");

        SpareParts spareParts = modelMapper.map(sparePartsDTO, SpareParts.class);

        SpareParts saved = sparePartsRepository.save(spareParts);

        return modelMapper.map(saved, SparePartsDTO.class);
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
