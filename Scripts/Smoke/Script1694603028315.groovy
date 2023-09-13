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
/*//try {
//	// Attempt to tap on the element
//	Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Male'), 0)
//	
//	// If the tap is successful, continue with further actions
//	
//} catch (Exception e) {
//	// Handle the exception if the tap action fails
//	// You can print an error message or take appropriate actions here
//	println("Failed to tap on the element: ${e.message}")
//	
//	// Optionally, you can take recovery actions or log the error
//}
//Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Male'), 0)

//Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Home'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Categories'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - My Orders'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Community'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Account'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Home (1)'), 0)

WebUI.comment('full top to bottom')

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - CART'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.RelativeLayout'), 0)

WebUI.comment('')


Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Women'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Men'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Kids'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Electronics'), 0)

Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Home  Kitchen'), 0)

WebUI.comment('scroll top bottom,and bottom to top')

Mobile.closeApplication()*/

try {
  
	Mobile.tap(findTestObject('Object Repository/order/android.widget.TextView - Male'), 0)
	
	// If the tap is successful, continue with further actions
	
} catch (Exception e) {
	// Handle the exception if the tap action fails
	// You can print an error message or take appropriate actions here
	println("Failed to tap on the element: ${e.message}")
	
	// Optionally, you can take recovery actions or log the error
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Categories'), 0)
} catch (Exception e) {
	println("Failed to tap on Categories: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - My Orders'), 0)
} catch (Exception e) {
	println("Failed to tap on My Orders: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Community'), 0)
} catch (Exception e) {
	println("Failed to tap on Community: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Account'), 0)
} catch (Exception e) {
	println("Failed to tap on Account: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Home (1)'), 0)
} catch (Exception e) {
	println("Failed to tap on Home (1): ${e.message}")
}

try {
	   Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}

try {
	
	Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}


try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.FrameLayout'), 0)
} catch (Exception e) {
	println("Failed to tap on FrameLayout: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - CART'), 0)
} catch (Exception e) {
	println("Failed to tap on CART: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.ImageButton'), 0)
} catch (Exception e) {
	println("Failed to tap on ImageButton: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.RelativeLayout'), 0)
} catch (Exception e) {
	println("Failed to tap on RelativeLayout: ${e.message}")
}
try {
	   Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}

try {
	
	Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}


try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Women'), 0)
} catch (Exception e) {
	println("Failed to tap on Women: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Men'), 0)
} catch (Exception e) {
	println("Failed to tap on Men: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Kids'), 0)
} catch (Exception e) {
	println("Failed to tap on Kids: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Electronics'), 0)
} catch (Exception e) {
	println("Failed to tap on Electronics: ${e.message}")
}

try {
	Mobile.tap(findTestObject('Object Repository/functional checking/android.widget.TextView - Home  Kitchen'), 0)
} catch (Exception e) {
	println("Failed to tap on Home  Kitchen: ${e.message}")
}

try {
	   Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}

try {
	
	Mobile.swipe(findTestObject('Object Repository/android.view.View'), Mobile.SwipeDirection.DOWN)
   
} catch (Exception e) {
	println("An error occurred: " + e.getMessage())
}


// Close the mobile app
Mobile.closeApplication()


