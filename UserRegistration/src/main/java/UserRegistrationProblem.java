import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public boolean matchName(String name) {
        return (Pattern.matches("^[A-Z][a-z]{2,}$", name));
    }
    
    public static void main(String[] args) {
        UserRegistrationProblem user = new UserRegistrationProblem();
        System.out.println(user.matchName("Akshita"));
        System.out.println(user.matchName("Aks"));
        System.out.println(user.matchMail("abcxyz@bl.co.co.in"));
        System.out.println(user.matchNumber("09046371890"));
        System.out.println(user.matchPassword("wUf@9fabcdeeee"));
    }
}
