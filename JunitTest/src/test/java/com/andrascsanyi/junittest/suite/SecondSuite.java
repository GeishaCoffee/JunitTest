package com.andrascsanyi.junittest.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Second test suite")
@SelectClasses({
    SecondSuiteSecondTests.class
})
public class SecondSuite {
}
