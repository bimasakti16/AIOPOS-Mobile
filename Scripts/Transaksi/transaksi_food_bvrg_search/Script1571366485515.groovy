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

Mobile.tap(findTestObject('Transaksi POS/tab_food'), 0)

searchProduct('burger', 2, 4)

Mobile.tap(findTestObject('Transaksi POS/tab_beverage'), 0)

searchProduct('coke', 1, 3)

Mobile.tap(findTestObject('Transaksi POS/tab_food'), 0)

searchProduct('spa', 2, 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Lanjutkan (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transaksi POS/android.widget.TextView0 - Dine In (1)'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Bayar Pesanan (1)'), 0)

if (Mobile.verifyElementNotVisible(findTestObject('Transaksi POS/android.widget.Switch0 - OFF (1)'), 3, FailureHandling.CONTINUE_ON_FAILURE)) {
} else {
    Mobile.tap(findTestObject('Transaksi POS/android.widget.Switch0 - OFF (1)'), 0)
}

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Pilih (1)'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Uang Pas'), 0)

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Bayar Sekarang (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Selesai (1)'), 0)

void searchProduct(String _productName, int _addClick, int _substractClick) {
    Mobile.tap(findTestObject('Transaksi POS/btn_search'), 0)

    Mobile.setText(findTestObject('Transaksi POS/android.widget.EditText0 -    Nama Produk'), _productName, 3)

    if (Mobile.verifyElementExist(findTestObject('Transaksi POS/hasil_search_2'), 3) == true) {
        Mobile.tapAtPosition(552, 298)

        for (int i = 0; i < _addClick; i++) {
            Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 -  (2)'), 0)
        }
        
        for (int j = 0; j < _substractClick; j++) {
            Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - - (1)'), 0)
        }
        
        Mobile.tap(findTestObject('Transaksi POS/android.widget.Button0 - Order (1)'), 0)
    }
    
    Mobile.tap(findTestObject('Transaksi POS/btn_clear_search_text'), 2)
}

