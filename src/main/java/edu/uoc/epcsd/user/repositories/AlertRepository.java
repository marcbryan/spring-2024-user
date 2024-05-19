package edu.uoc.epcsd.user.repositories;

import edu.uoc.epcsd.user.entities.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Long> {

    @Query("select a from Alert a where a.productId = ?1 and a.from <= ?2 and a.to >= ?2")
    List<Alert> findAlertsByProductIdAndInterval(Long productId, LocalDate availableOnDate);

    @Query("SELECT a FROM Alert a WHERE a.user.id = ?1 AND (a.from BETWEEN ?2 AND ?3 OR a.to BETWEEN ?2 AND ?3)")
    List<Alert> findAlertsByUserIdAndInterval(Long userId, LocalDate fromDate, LocalDate toDate);
}
