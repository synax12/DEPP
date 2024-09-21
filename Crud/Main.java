import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create a new user
        User newUser = new User(0, "John Doe", "john@example.com", "USA");
        userDAO.createUser(newUser);

        // Read all users
        List<User> users = userDAO.readAllUsers();
        System.out.println("Users in database:");
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName() + " - " + user.getEmail() + " - " + user.getCountry());
        }

        // Update a user
        User updateUser = new User(1, "Jane Doe", "jane@example.com", "Canada");
        userDAO.updateUser(updateUser);

        // Delete a user by ID
        userDAO.deleteUser(1);
    }
}

