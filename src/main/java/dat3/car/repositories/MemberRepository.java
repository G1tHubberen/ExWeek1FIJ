package dat3.car.repositories;

import dat3.car.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Object> findById(UUID id);
    // You can add custom query methods here if needed
}
