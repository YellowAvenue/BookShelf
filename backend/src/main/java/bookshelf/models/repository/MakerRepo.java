package bookshelf.models.repository;

import bookshelf.models.entities.Maker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Service interface for managing {@link bookshelf.models.entities.Maker}
 */
@Repository
public interface MakerRepo extends JpaRepository<Maker, Long> {
}
