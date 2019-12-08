import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
    @BeforeMethod
    public void before(){
        System.out.println("开始流程");
    }
    @Test
    public void testProcess1(){
        System.out.println("开始测试流程1");
        //Assert.assertFalse(true);
    }

    @Test
    public void testProcess2(){
        System.out.println("开始测试流程2");
    }
    @AfterClass
    public void after(){
        System.out.println("结束流程");
    }

}
