package lk.ijse.backend.repositiry;

import lk.ijse.backend.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ServicePartRepository extends JpaRepository<Service,Long> {
}
