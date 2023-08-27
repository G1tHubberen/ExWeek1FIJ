package dat3.car.repositories;

import dat3.car.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
    // You can add custom query methods here if needed
}
