package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.ServiceDTO;
import lk.ijse.backend.service.custom.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ServiceServiceImpl implements ServiceService {
    @Override
    public ServiceDTO save(ServiceDTO serviceDTO) {
        return null;
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
