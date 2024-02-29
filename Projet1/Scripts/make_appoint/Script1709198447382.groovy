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

'ouvrir navigateur'
WebUI.openBrowser('')

'Naviger vers l\'URL'
WebUI.navigateToUrl(GlobalVariable.URL)

'Cliquer sur la nav-bar en haut a droite'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

'Cliquer sur le bouton login pour ouvrir la page d\'authentification'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

'Insesser le nom d\'utilisateur'
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), GlobalVariable.username)

'saisir le mot de pass'
WebUI.setMaskedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), GlobalVariable.password)

'cliquer sur login pour vous connecter'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_22'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'wsfdqsQSD')

'valider votre rendez-vous sur ce bouton'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')

'Cliquer sur "GO to homme page" pour revenir à la page home'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

'Cliquer sur la nav-bar en haut a droite'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

'cliquer logout pour vous déconnecter'
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Logout'))

