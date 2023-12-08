import org.junit.*;
import org.junit.Test;
public class UserRegistrationProblemTest {
    @Test
    public void firstNameTest()
    {
        UserRegistrationProblem firstName = new UserRegistrationProblem();
        Assert.assertTrue("The name is valid",firstName.matchName("Akshita"));
        Assert.assertFalse("The name is valid",firstName.matchName("akshita"));
        Assert.assertFalse("The name is valid",firstName.matchName("Ak"));
        Assert.assertFalse("The name is valid",firstName.matchName("Akshita4"));
    }
    @Test
    public void lastNameTest()
    {
        UserRegistrationProblem lastName = new UserRegistrationProblem();
        Assert.assertTrue("The name is valid",lastName.matchName("Sah"));
        Assert.assertFalse("The name is valid",lastName.matchName("Sa4"));
        Assert.assertFalse("The name is valid",lastName.matchName("sah"));
    }
    @Test
    public void MailTest()
    {
        UserRegistrationProblem mail = new UserRegistrationProblem();
        Assert.assertTrue("The mail is valid",mail.matchMail("xyz.abc@gmail.com"));
        Assert.assertFalse("The mail is valid",mail.matchMail("xyz.abc@gmail.com.com"));
        Assert.assertFalse("The mail is valid",mail.matchMail("xyz.abc.abc@gmail.com.in"));
    }
    @Test
    public void MobileTest()
    {
        UserRegistrationProblem number = new UserRegistrationProblem();
        Assert.assertTrue("The number is valid",number.matchNumber("91 9876543210"));
        Assert.assertFalse("The number is valid",number.matchNumber("+91 9876543210"));
        Assert.assertFalse("The number is valid",number.matchNumber("919876543210"));
    }
    @Test
    public void passwordTest()
    {
        UserRegistrationProblem password = new UserRegistrationProblem();
        Assert.assertTrue("The password is valid",password.matchPassword("w9E3+4q5u"));
        Assert.assertFalse("The password is valid",password.matchPassword("w9E34q5u"));
        Assert.assertFalse("The password is valid",password.matchPassword("w9E3+4"));
    }

}