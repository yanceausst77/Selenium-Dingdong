//import sun.jvm.hotspot.utilities.Assert;
import org.testng.Assert;

public class AssertTest {
    public static void main(String[] args) throws InterruptedException{

        String actual="用户名密码不匹配";
        String expect="登录成功";
        Assert.assertEquals(actual,expect,"Expect message is "+ expect +".But actual message is "+actual);
        //Assert.assertEquals(actual,expect);
        //Assert.assertTrue(actual.equals(expect),"Expect message is "+expect+"But actual message is "+actual);
    }
}
