package Utilities;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.util.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetFileName {
    public static String getFileNm () {
//        String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date()) + "_RegressionSuiteOneExAcct.log";
        String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmm").format(new Date()) + "_RegressionSuiteOneExAcct.log";
        Log.info("Date-Time stamp for regression suite test run: " + fileName);
        return fileName;
    }

    public static void copyLogFile (File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}
