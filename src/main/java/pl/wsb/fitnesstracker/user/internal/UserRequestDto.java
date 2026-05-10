package pl.wsb.fitnesstracker.user.internal;

import java.time.LocalDate;

record UserRequestDto(String firstName, String lastName, LocalDate birthdate, String email) {
}