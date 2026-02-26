package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.ServicePartDTO;
import lk.ijse.backend.entity.ServiceParts;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.ServicePartRepository;
import lk.ijse.backend.service.custom.ServicePartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class ServicePartServiceImpl implements ServicePartService {

    private final ServicePartRepository servicePartRepository;
    private final ModelMapper modelMapper;

    @Override
    public ServicePartDTO save(ServicePartDTO servicePartDTO) {

        if (servicePartDTO == null) throw new CustomException("Service part can't be null");

        servicePartDTO.setServicePartId(null);

        ServiceParts serviceParts = modelMapper.map(servicePartDTO, ServiceParts.class);

        ServiceParts saved = servicePartRepository.save(serviceParts);

        return modelMapper.map(saved, ServicePartDTO.class);
    }

    @Override
    public ServicePartDTO update(ServicePartDTO servicePartDTO) {
        return null;
    }

    @Override
    public void delete(ServicePartDTO servicePartDTO) {

    }

    @Override
    public List<ServicePartDTO> getAll() {
        return List.of();
    }

    @Override
    public Long generateId() {
        return 0L;
    }
}
