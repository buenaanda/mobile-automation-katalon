import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!23')
CustomKeywords.'iOS.registration_screen.tapNext'()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/First Name field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Middle Name field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Last Name field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Birthday field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Male button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Female button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Country field'))
CustomKeywords.'global.scroll_to_element.down'(findTestObject('iOS/Registration screen/Nationality field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Nationality field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Email field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Landline field'))