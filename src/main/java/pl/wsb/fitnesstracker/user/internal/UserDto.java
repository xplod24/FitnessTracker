package pl.wsb.fitnesstracker.user.internal;

import java.time.LocalDate;

record UserDto(Long id, String firstName, String lastName, LocalDate birthdate, String email) {
}