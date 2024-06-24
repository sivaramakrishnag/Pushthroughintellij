//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class ExtentReports {
//
//    public ExtentSparkReporter htmlReporter;
//    public ExtentReports extent;
//    public ExtentTest test;
//
//
//    @BeforeTest
//    public void setReport() {
//        htmlReporter = new ExtentSparkReporter("./reports/extent.html");
//        htmlReporter.config().setEncoding("utf-8");
//        htmlReporter.config().setDocumentTitle("TestNGParameterization Extent Report");
//        htmlReporter.config().setReportName("TestNGParameterization Test Results");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//
//        extent = new ExtentReports();
//
//
//        extent.attachReporter(htmlReporter);
//
//
//        extent.setSystemInfo("QA Automation","RG");
//        extent.setSystemInfo("Build No", "1");
//        extent.setSystemInfo("Organization", "Wipro");
//
//    }
//
//    @Test(priority=0)
//    public void doLogin() {
//
//    test = extent.createTest("LoginTest");
//    test.info("Enter username as");
//    test.info("Enter Password as");
//    test.info("click on enter");
//    test.pass("Login Test Pass");
//
//    }
//
//    @Test(priority=1)
//    public void doRegistration() {
//      //  test = extent.createTest("user registration");
//        test.pass(" Test Pass");
//
//    }
//
//    @Test(priority=2)
//    public void composeEmail() {
//        //test = extent.createTest("Compose email test");
//        test.pass(" Test Pass");
//
//    }
//    @AfterMethod
//    public void updateResults(ITestResult result){
//        if(result.getStatus()==ITestResult.SUCCESS){
//            test.pass("");
//        }else if(result.getStatus()==ITestResult.FAILURE){
//            test.fail("");
//        }else if (result.getStatus()==ITestResult.SKIP){
//            test.skip("");
//        }
//
//    }
//
//    @AfterTest
//    public void endReport() {
//       extent.flush();
//    }
//
//}
