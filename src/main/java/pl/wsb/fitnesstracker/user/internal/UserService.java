package pl.wsb.fitnesstracker.user.internal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Serwis hermetyzujący logikę biznesową dla encji User.
 */
@Service
@RequiredArgsConstructor
class UserService {

    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User with ID " + id + " not found"));
    }

    public List<User> findUsersByEmail(String emailFragment) {
        return userRepository.findByEmailContainingIgnoreCase(emailFragment);
    }

    public List<User> findUsersOlderThan(LocalDate date) {
        return userRepository.findByBirthdateBefore(date);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteUser(String email) {

        if(email!=null){
            List<User> userList = userRepository.findByEmailContainingIgnoreCase(email);
            if(userList.size() > 0 ) {

            userRepository.delete(userList.get(0));
        }
        }

    }


    public User updateUser(Long id, User updatedUserData) {
        User existingUser = findUserById(id);
        existingUser.setFirstName(updatedUserData.getFirstName());
        existingUser.setLastName(updatedUserData.getLastName());
        existingUser.setBirthdate(updatedUserData.getBirthdate());
        existingUser.setEmail(updatedUserData.getEmail());

        return userRepository.save(existingUser);
    }
}