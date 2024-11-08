import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/span_ng nhpng k'))

WebUI.setText(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/input_S in thoi_username'), '0378507493')

WebUI.setEncryptedText(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/input_Mt khu_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/button_Thng tin ti khon'))

WebUI.click(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/h1_Thng tin khch hng'))

WebUI.click(findTestObject('Object Repository/TestOpsIntegration/Page_Kim Hair Salon/button_ng xut'))

WebUI.closeBrowser()

