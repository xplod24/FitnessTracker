package pl.wsb.fitnesstracker.user.api;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Wyszukiwanie po emailu bez rozróżniania wielkości liter
    List<User> findByEmailContainingIgnoreCase(String emailFragment);

    // Wyszukiwanie użytkowników urodzonych przed daną datą
    List<User> findByBirthdateBefore(LocalDate date);

    void deleteByid(Long id);
}