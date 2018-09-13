package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
