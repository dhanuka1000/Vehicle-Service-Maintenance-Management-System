package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.ServiceDTO;
import lk.ijse.backend.entity.Services;
import lk.ijse.backend.exception.CustomException;
import lk.ijse.backend.repositiry.ServiceRepository;
import lk.ijse.backend.service.custom.ServiceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ModelMapper modelMapper;

    @Override
    public ServiceDTO save(ServiceDTO serviceDTO) {

        if (serviceDTO == null) throw new CustomException("Service cannot be null");

        serviceDTO.setServiceId(null);

        Services service = modelMapper.map(serviceDTO, Services.class);

        Services saves = serviceRepository.save(service);

        return modelMapper.map(saves, ServiceDTO.class);
    }

    @Override
    public ServiceDTO update(ServiceDTO serviceDTO) {
        return null;
    }

    @Override
    public void delete(String sId) {

    }

    @Override
    public List<ServiceDTO> getAll() {
        return List.of();
    }

    @Override
    public Long generateId() {
        return 0L;
    }
}
