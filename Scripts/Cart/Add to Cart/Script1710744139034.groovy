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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Cart/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=automotive-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Add Cart/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'Brake')

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com  Brake/span_Front Brake Rotors and Pads Kit Compat_6632a7'))

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com Geekstop Front Brake Rotors_23f753/input_Shipping cost, delivery date, and ord_223673'))

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com Shopping Cart/input_Indonesia_a-button-input'))

WebUI.rightClick(findTestObject('Object Repository/Add Cart/Page_Amazon.com Shopping Cart/h1_Added to Cart'))

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com Shopping Cart/div_Added to Cart                          _039514'))

WebUI.click(findTestObject('Object Repository/Add Cart/Page_Amazon.com Shopping Cart/div_Added to Cart                          _039514_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Add Cart/Page_Amazon.com Shopping Cart/h1_Added to Cart'), 'Added to Cart')

WebUI.takeScreenshot()

WebUI.closeBrowser()

