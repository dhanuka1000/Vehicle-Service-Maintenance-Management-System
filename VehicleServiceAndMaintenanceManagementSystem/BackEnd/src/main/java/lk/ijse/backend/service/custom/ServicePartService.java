package lk.ijse.backend.service.custom;

import lk.ijse.backend.dto.ServicePartDTO;

import java.util.List;

public interface ServicePartService {

    ServicePartDTO save(ServicePartDTO servicePartDTO);
    ServicePartDTO update(ServicePartDTO servicePartDTO);
    void delete(ServicePartDTO servicePartDTO);
    List<ServicePartDTO> getAll();
    Long generateId();
}
