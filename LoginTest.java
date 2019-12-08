import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void before() {
        //启动Chrome浏览器
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test
    public void test(){

    }

    @Test
    public void testFDC(){

        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://sso.re.dingdongxiaoqu.com/index.php?r=site/login&app_id=2");

        //设置等待时间
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //用户名Input
        WebElement userNameInput = driver.findElement(By.id("LoginForm_username"));
        userNameInput.sendKeys("liuyan01@100.me");

        //设置等待时间
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //密码Input
        WebElement passwordInput = driver.findElement(By.id("LoginForm_password"));
        passwordInput.sendKeys("Mine77mine77");

        //提交按钮
        WebElement submitInput = driver.findElement(By.name(("yt0")));
        submitInput.click();
        System.out.println("点击登录");

        //打印判断是否成功
        System.out.println("成功登录！");

        //设置等待时间
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //立即更新（复合class名称）
        //WebElement Refresh = driver.findElement(By.cssSelector("[class='el-button el-button--default el-button--small el-button--primary ']"));
        //Refresh.click();

        //设置等待时间
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //打开损溢单
        WebElement SunYi = driver.findElement(By.xpath("//ul[@class='el-menu']/li[1]/ul/div/div[1]/li"));
        SunYi.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //driver.refresh();
        //新建损溢单
        WebElement CreateSunYi = driver.findElement(By.cssSelector("[class='el-button el-button--primary el-button--small']"));
        CreateSunYi.click();

        //打开仓库列表
        WebElement ChooseStore = driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div/div[1]/div/input"));
        ChooseStore.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //选择仓库
        WebElement Store = driver.findElement(By.xpath("//body/div[@class='el-select-dropdown el-popper']/div/div/ul/li[5]"));
        Store.click();

        //打开类型列表
        WebElement ChooseType = driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div/div[2]/div/input"));
        ChooseType.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //选择类型
        WebElement Type = driver.findElement(By.xpath("//body/div[@class='el-select-dropdown el-popper'][2]/div[1]/div[1]/ul/li[1]"));
        Type.click();

        //输入标题
        WebElement Title=driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div/div[3]/input"));
        Title.sendKeys("自动化测试损益单标题");

        //打开商品列表
        WebElement ChooseGoods=driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div[2]/span/div/div/input"));
        ChooseGoods.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //选择商品1
        WebElement Goods1=driver.findElement(By.xpath("//body/div[@class='el-select-dropdown el-popper'][3]/div[1]/div[1]/ul/li[1]"));
        Goods1.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //添加商品1
        WebElement AddGoods=driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div[2]/button"));
        AddGoods.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //输入商品1实出数量
        WebElement AddGoodsNum1=driver.findElement(By.xpath("//table[@class='scm_table']/tbody/tr[1]/td[4]/div/div/input"));
        AddGoodsNum1.sendKeys("10");

        //打开商品列表
        ChooseGoods.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //选择商品2
        WebElement Goods2=driver.findElement(By.xpath("//body/div[@class='el-select-dropdown el-popper'][3]/div[1]/div[1]/ul/li[10]"));
        Goods2.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //添加商品2
        AddGoods.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //输入商品2实出数量
        WebElement AddGoodsNum2=driver.findElement(By.xpath("//table[@class='scm_table']/tbody/tr[2]/td[4]/div/div/input"));
        AddGoodsNum2.sendKeys("88");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //删除已添加的商品
        WebElement DeleteGoods=driver.findElement(By.xpath("//table[@class='scm_table']/tbody/tr[2]/td[5]/button"));
        DeleteGoods.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        //保存损益单
        WebElement SaveSunYi=driver.findElement(By.xpath("//div[@class='el-dialog__body']/div/div[3]/button[1]"));
        SaveSunYi.click();

    }

    @Test
    public void TestClose() {
        //WebElement Refresh=driver.findElement(By.xpath("//span[text()='立即更新']"));
        //Refresh.click();
    }


//    @Test
//    public void TestFDC() {
//        //打开损益单
//        WebElement searchBox = driver.findElement(By.xpath("//ul[@class='el-menu']/li[1]/ul/div/div[1]/li"));
//        searchBox.click();
//    }


    @AfterClass
    public void after() {
        driver.quit();
    }

}
