import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/android/Login/Login')

suiteProperties.put('name', 'Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/buenaanda/Katalon Studio/mobile-automation-katalon/Reports/android/Login/Login/20181119_193930/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/android/Login/Login', suiteProperties, [new TestCaseBinding('Test Cases/android/Login/LOG_01', 'Test Cases/android/Login/LOG_01',  null), new TestCaseBinding('Test Cases/android/Login/LOG_02', 'Test Cases/android/Login/LOG_02',  null), new TestCaseBinding('Test Cases/android/Login/LOG_03', 'Test Cases/android/Login/LOG_03',  null), new TestCaseBinding('Test Cases/android/Login/LOG_04', 'Test Cases/android/Login/LOG_04',  null), new TestCaseBinding('Test Cases/android/Login/LOG_05', 'Test Cases/android/Login/LOG_05',  null), new TestCaseBinding('Test Cases/android/Login/LOG_06', 'Test Cases/android/Login/LOG_06',  null), new TestCaseBinding('Test Cases/android/Login/LOG_07', 'Test Cases/android/Login/LOG_07',  null), new TestCaseBinding('Test Cases/android/Login/LOG_08', 'Test Cases/android/Login/LOG_08',  null), new TestCaseBinding('Test Cases/android/Login/LOG_09', 'Test Cases/android/Login/LOG_09',  null), new TestCaseBinding('Test Cases/android/Login/LOG_10', 'Test Cases/android/Login/LOG_10',  null), new TestCaseBinding('Test Cases/android/Login/LOG_11', 'Test Cases/android/Login/LOG_11',  null), new TestCaseBinding('Test Cases/android/Login/LOG_12', 'Test Cases/android/Login/LOG_12',  null), new TestCaseBinding('Test Cases/android/Login/LOG_13', 'Test Cases/android/Login/LOG_13',  null), new TestCaseBinding('Test Cases/android/Login/LOG_14', 'Test Cases/android/Login/LOG_14',  null), new TestCaseBinding('Test Cases/android/Login/LOG_20', 'Test Cases/android/Login/LOG_20',  null)])
