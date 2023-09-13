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

Mobile.startExistingApplication('com.meesho.supply')

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Add Address'), 0)

WebUI.acceptAlert()

Mobile.startExistingApplication('com.meesho.supply')

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.Image'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText (1)'), 'Abcd , karnataka')

Mobile.hideKeyboard()

Mobile.hideKeyboard()

Mobile.startExistingApplication('com.meesho.supply')

Mobile.tap(findTestObject('Object Repository/order/android.view.View - Road Name  Area  Colony'), 0)

Mobile.startExistingApplication('com.meesho.supply')

Mobile.tap(findTestObject('Object Repository/order/android.widget.EditText (2)'), 0)

Mobile.sendKeys(findTestObject(''), 'cord road')

Mobile.tap(findTestObject('Object Repository/order/android.view.View - Pincode'), 0)

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText (3)'), '560021')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/order/android.view.View - City'), 0)

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText (4)'), 'bengaluru')

Mobile.tap(findTestObject('Object Repository/order/android.view.View - State'), 0)

Mobile.scrollToText('Karnataka')

Mobile.scrollToText('Karnataka')

Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Karnataka'), 0)

Mobile.startExistingApplication('com.meesho.supply')

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText (5)'), 'Harthick SM')

Mobile.startExistingApplication('com.meesho.supply')

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText (6)'), '7760875373')

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Save Address and Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Continue'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/order/android.widget.Button - Continue'), 'Continue')

Mobile.delay(0)

