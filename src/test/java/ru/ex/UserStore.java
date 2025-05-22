package ru.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is invalid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username is too short, must be at least 3 symbols long");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Ivan Ivanov", true),
                new User("pv", true),
                new User("Vitya", false)};
        try {
            User user = findUser(users, "pv");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
        }
    }
}