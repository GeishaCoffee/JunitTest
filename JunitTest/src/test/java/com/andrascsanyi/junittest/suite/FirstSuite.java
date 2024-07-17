package com.andrascsanyi.junittest.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("First test suite")
@SelectClasses({
    FirstSuiteFirstTests.class
})
public class FirstSuite {
}
