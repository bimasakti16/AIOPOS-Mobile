import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.aio.pos')

Mobile.setText(findTestObject('Login/android.widget.EditText0 - kasir1'), 'kasir1', 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0'), 'admins', 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - Lewati'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0 (1)'), '500000', 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - Konfirmasi'), 0)

Mobile.closeApplication()

