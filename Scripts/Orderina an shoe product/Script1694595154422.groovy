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
Mobile.tap(findTestObject('Object Repository/order/android.widget.EditText - Search by Keyword or Product ID (2)'), 0)


WebUI.delay(3)
try {
	// Attempt to tap on the element
	Mobile.tap(findTestObject('Object Repository/order/android.widget.LinearLayout'), 0)
	
	// If the tap is successful, continue with further actions
	
} catch (Exception e) {
	// Handle the exception if the tap action fails
	// You can print an error message or take appropriate actions here
	println("Failed to tap on the element: ${e.message}")
	
	// Optionally, you can take recovery actions or log the error
}
//Mobile.tap(findTestObject('Object Repository/order/android.widget.LinearLayout'), 0)


//Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Male'), 0)

//Mobile.tap(findTestObject('Object Repository/order/android.widget.EditText - Search by Keyword or Product ID'), 0)
//
//Mobile.pressBack()
//
//Mobile.pressBack()

Mobile.sendKeys(findTestObject('Object Repository/order/android.widget.EditText - Search by Keyword or Product ID (1)'), 
    'Shoes')

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - shoes'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Done'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Sort'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.RadioButton - New Arrivals'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Relaxed Trendy Men Formal Shoes'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Buy Now'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.CompoundButton - IND-7'), 0)

Mobile.tap(findTestObject('Object Repository/order/android.widget.Button - Buy Now (1)'), 0)

Mobile.closeApplication()

