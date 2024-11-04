package nbc_final.matching_service.repository;

import nbc_final.matching_service.entity.Matching;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchingRepository extends JpaRepository<Matching, Long> {
}
