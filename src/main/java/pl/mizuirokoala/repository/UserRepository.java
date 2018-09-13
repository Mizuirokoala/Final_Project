package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mizuirokoala.role.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
