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


suiteProperties.put('id', 'Test Suites/android/Android Test Suite')

suiteProperties.put('name', 'Android Test Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/buenaanda/Documents/mobile-automation-katalon/Reports/android/Android Test Suite/20181126_151226/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/android/Android Test Suite', suiteProperties, [new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_01', 'Test Cases/android/Send Money Branch/SMB_01',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_07', 'Test Cases/android/Send Money Branch/SMB_07',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_02', 'Test Cases/android/Send Money Branch/SMB_02',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_03', 'Test Cases/android/Send Money Branch/SMB_03',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_04', 'Test Cases/android/Send Money Branch/SMB_04',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_05', 'Test Cases/android/Send Money Branch/SMB_05',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_06', 'Test Cases/android/Send Money Branch/SMB_06',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_08', 'Test Cases/android/Send Money Branch/SMB_08',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_09', 'Test Cases/android/Send Money Branch/SMB_09',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_17', 'Test Cases/android/Send Money Branch/SMB_17',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_18', 'Test Cases/android/Send Money Branch/SMB_18',  null), new TestCaseBinding('Test Cases/android/Send Money Branch/SMB_19', 'Test Cases/android/Send Money Branch/SMB_19',  null)])
