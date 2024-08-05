package gift.repository;

import gift.model.point.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point,Long> {
}
