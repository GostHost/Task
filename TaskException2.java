public class TaskException2 {
    public static void main(String[] args) {
            System.out.println(verify("login", "passssswwwoooooorddddd", "pass"));
            System.out.println(verify("login", "pass", "pass"));
    }

    public static boolean verify (String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new TaskException1("login more 20");
            }
            if(password.length() > 20 || !password.equals(confPassword)){
                throw new TaskException1("password more 20");
            }
        } catch (TaskException1 e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.printf("Login - %s, password - %s, confPassword - %s. \n", login, password, confPassword);
        }
        return true;
        }

}
