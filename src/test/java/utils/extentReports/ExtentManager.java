package utils.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public static String localDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        return (dtf.format(now));
    }

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/QA_APP_report-" + localDate() + ".html");
        reporter.config().setReportName("Test App - Login tests");
        reporter.config().setTheme(Theme.DARK);
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Author", "Oluwatimilehin Babatunde");
        extentReports.setSystemInfo("Platform", "Android");
        extentReports.setSystemInfo("Platform Version", "13.0");
        return extentReports;
    }
}
