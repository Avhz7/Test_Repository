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
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil

//Cargar Data File
//def data = TestDataFactory.findTestData("Test_Data")
//int rows = data.getRowNumbers()


WebUI.openBrowser('')

'Maximize current window'
WebUI.maximizeWindow()

WebUI.navigateToUrl('www.bhdleon.com.do')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/a_Contctanos'), 20)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/a_Contctanos'))

//for(i=1; rows; i++){

//	data.Nombre = data.getValue("Nombre", i)
//	data.Apellido = data.getValue("Apellido", i)
//	data.Correo = data.getValue("Correo", i)
//	data.Mensaje = data.getValue("Mensaje", i)

KeywordUtil.markPassed("Se ingresó al formulario correctamente")

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/input_Nombre_Nombre'), Nombre)
//WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/input_Nombre_Nombre'), findTestData("Test_Data").getValue(1,i))

WebUI.click(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/div_Apellido_col-xs-12 col-sm-12 col-md-12 col-lg-7'))

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/input_Apellido_Apellido'), Apellido)
//WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/input_Apellido_Apellido'), findTestData("Test_Data").getValue(1,i))


WebUI.click(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/div_Email_col-xs-12 col-sm-12 col-md-12 col-lg-7'))

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/input_Email_Email'), Correo)


WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/textarea_Escrbe el mensaje_Mensaje'), 3)

WebUI.setText(findTestObject('Object Repository/Prueba1/Page_Banco BHD Len/textarea_Escrbe el mensaje_Mensaje'), Mensaje)

KeywordUtil.markPassed("Se completaron los datos del formulario correctamente")

WebUI.takeScreenshot()

WebUI.closeBrowser()

//}


/*if (elements.size() > 0)
{
//Mark Passed status after this step
KeywordUtil.markPassed("Element is Present")
}
else
{
//Mark Failed status after this step
KeywordUtil.markFailed("Element is not presebt")
}*/