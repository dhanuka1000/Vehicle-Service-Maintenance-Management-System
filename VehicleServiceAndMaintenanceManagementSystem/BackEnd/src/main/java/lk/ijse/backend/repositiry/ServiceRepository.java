package lk.ijse.backend.repositiry;

import lk.ijse.backend.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ServiceRepository extends JpaRepository<Services,Long> {
}
