package pl.wsb.fitnesstracker.user.internal;

import pl.wsb.fitnesstracker.user.api.User;

/**
 * Klasa narzędziowa odpowiadająca za mapowanie encji User na obiekty DTO i odwrotnie.
 */
class UserMapper {

    static UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getBirthdate(), user.getEmail());
    }

    static UserSimpleDto toSimpleDto(User user) {
        return new UserSimpleDto(user.getId(), user.getFirstName(), user.getLastName());
    }

    static UserEmailDto toEmailDto(User user) {
        return new UserEmailDto(user.getId(), user.getEmail());
    }

    static User toEntity(UserRequestDto request) {
        return new User(request.firstName(), request.lastName(), request.birthdate(), request.email());
    }
}