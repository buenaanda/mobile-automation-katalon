import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String senderName = "Allen Pogi Crisostomo"
String receiverName = GlobalVariable.randomFirstName +" "+ GlobalVariable.randomMiddleName +" "+ GlobalVariable.randomLastName
String receiverMobileNumber = "66"+ GlobalVariable.randomMobileNumber
String serviceFee = GlobalVariable.internationalServiceFee
String sendAmount = GlobalVariable.randomAmount

TestObject Sender_Mobile_Number = findTestObject('iOS/Send Money screen/Generic text', [('label') : "639070405298"])
TestObject Sender_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : senderName])
TestObject Sender_Country = findTestObject('iOS/Send Money screen/Generic text', [('label') : "Philippines"])
TestObject Receiver_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : receiverName])
TestObject Receiver_Country = findTestObject('iOS/Send Money screen/Generic text', [('label') : "Thailand"])
TestObject Receiver_Mobile_Number = findTestObject('iOS/Send Money screen/Generic text', [('label') : receiverMobileNumber])
TestObject Send_Amount = findTestObject('iOS/Send Money screen/Generic text', [('label') : sendAmount])
TestObject Service_Fee = findTestObject('iOS/Send Money screen/Generic text', [('label') : serviceFee])
TestObject Message_Charge = findTestObject('iOS/Send Money screen/Generic text', [('label') : "0.00 PHP"])

CustomKeywords.'iOS.send_money_screen.tapViewDetails'()

CustomKeywords.'global.verify_element.exist'(Sender_Mobile_Number)

CustomKeywords.'global.verify_element.exist'(Sender_Name)

CustomKeywords.'global.verify_element.exist'(Sender_Country)

CustomKeywords.'global.verify_element.exist'(Receiver_Name)

CustomKeywords.'global.verify_element.exist'(Service_Fee)

CustomKeywords.'global.verify_element.exist'(Send_Amount)

CustomKeywords.'global.verify_element.exist'(Service_Fee)

CustomKeywords.'global.verify_element.exist'(Message_Charge)