package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() throws IOException {

        Excel excel = new Excel();
        return excel.getRegistrationData("Users");

    }

}