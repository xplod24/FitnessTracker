package pl.wsb.fitnesstracker.user.internal;

import java.time.LocalDate;

/**
 * DTO wykorzystywane przy tworzeniu i aktualizacji (POST/PUT) użytkownika.
 */
record UserRequestDto(String firstName, String lastName, LocalDate birthdate, String email) {
}