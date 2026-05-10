package pl.wsb.fitnesstracker.user.internal;

import java.time.LocalDate;

/**
 * Główny obiekt transferu danych (DTO) dla użytkownika.
 */
record UserDto(Long id, String firstName, String lastName, LocalDate birthdate, String email) {
}