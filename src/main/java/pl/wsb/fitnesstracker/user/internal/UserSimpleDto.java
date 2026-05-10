package pl.wsb.fitnesstracker.user.internal;

/**
 * Uproszczone DTO zwracające tylko identyfikator oraz imię i nazwisko.
 */
record UserSimpleDto(Long id, String firstName, String lastName) {
}