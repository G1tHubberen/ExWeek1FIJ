package dat3.car;

import dat3.car.repositories.MemberRepository;
import dat3.car.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testSaveAndFindById() {
        Member member = new Member();
        member.setUsername("john_joe");

        memberRepository.save(member);

        Optional<Member> foundMember = memberRepository.findById(member.getUsername());
        Assertions.assertThat(foundMember).isPresent();
        Assertions.assertThat(foundMember.get().getUsername()).isEqualTo("john_joe");
    }

    @Test
    public void testFindAll() {
        Member member1 = new Member();
        member1.setUsername("john_doe");

        Member member2 = new Member();
        member2.setUsername("jane_doe");

        memberRepository.saveAll(List.of(member1, member2));

        List<Member> members = memberRepository.findAll();
        Assertions.assertThat(members).hasSize(2);
    }

    @Test
    public void testUpdate() {
        Member member = new Member();
        member.setUsername("john_doe");

        memberRepository.save(member);

        member.setUsername("new_username");

        memberRepository.save(member);

        Optional<Member> updatedMember = memberRepository.findById("new_username");
        Assertions.assertThat(updatedMember).isPresent();
        Assertions.assertThat(updatedMember.get().getUsername()).isEqualTo("new_username");
    }

    @Test
    public void testDelete() {
        Member member = new Member();
        member.setUsername("john_doe");
        // Set other properties as needed

        memberRepository.save(member);

        memberRepository.delete(member);

        Optional<Member> deletedMember = memberRepository.findById("john_doe");
        Assertions.assertThat(deletedMember).isEmpty();
    }
}
