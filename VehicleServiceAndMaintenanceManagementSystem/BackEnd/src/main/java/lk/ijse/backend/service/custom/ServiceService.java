package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.ServiceDTO;

import java.util.List;

public interface ServiceService {

    ServiceDTO save(ServiceDTO serviceDTO);
    ServiceDTO update(ServiceDTO serviceDTO);
    void delete(String sId);
    List<ServiceDTO> getAll();
    Long generateId();
}
