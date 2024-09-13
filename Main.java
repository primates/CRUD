public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create a new user
        User user = new User("exampleUser", "examplePassword", true);
        userDAO.addUser(user);

        // Read user
        User retrievedUser = userDAO.getUser("exampleUser");
        if (retrievedUser != null) {
            System.out.println("Retrieved User: " + retrievedUser.getUsername() + ", Active: " + retrievedUser.isActive());
        }

        // Update user
        if (retrievedUser != null) {
            retrievedUser.setPassword("newPassword");
            retrievedUser.setActive(false);
            userDAO.updateUser(retrievedUser);
        }

        // Delete user
        userDAO.deleteUser("exampleUser");
    }
}
