package lk.ijse.backend.repositiry;

import lk.ijse.backend.entity.SpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SparePartsRepository extends JpaRepository<SpareParts, Long> {
}
