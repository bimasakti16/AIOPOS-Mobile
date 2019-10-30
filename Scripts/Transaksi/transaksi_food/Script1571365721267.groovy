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

//Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Pesanan'), 0)

Mobile.tapAtPosition(552, 302)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - '), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 -  (1)'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Order'), 0)

//Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Pesanan (1)'), 0)

Mobile.tapAtPosition(552, 494)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - '), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 -  (1)'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - -'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Order'), 0)

//Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Pesanan (2)'), 0)

Mobile.tapAtPosition(552, 686)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Order'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Lanjutkan'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transaksi POS/android.widget.TextView0 - Dine In'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Bayar Pesanan'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Pilih'), 0)

Mobile.setText(findTestObject('Transaksi POS/android.widget.EditText0 - Jumlah Lain'), '300000', 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Bayar Sekarang'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Selesai'), 0)

Mobile.closeApplication()

