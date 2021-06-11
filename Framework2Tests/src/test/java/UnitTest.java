package com.pluralsoght;
import com.Pluralsight.Pages;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    public void canGoToHomepage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());

    }
}
