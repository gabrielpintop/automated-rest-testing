<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
	<description></description>
    <name>GetStudents</name>
    <tag></tag>
    <elementGuidId>2744c6ab-0004-4dc9-94c9-04bb45d5046a</elementGuidId>
    <selectorMethod>BASIC</selectorMethod>
    <useRalativeImagePath>false</useRalativeImagePath>
  	<followRedirects>false</followRedirects>
    <httpBody></httpBody>
    <httpBodyContent></httpBodyContent>
  	<httpBodyType>text</httpBodyType>
  	<httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   	</httpHeaderProperties>
  	<migratedVersion>5.4.1</migratedVersion>
	<restRequestMethod>GET</restRequestMethod>
   	<restUrl>https://miso4202-apitest.herokuapp.com/api/v1/students</restUrl>
   	<serviceType>RESTful</serviceType>
   	<soapBody></soapBody>
   	<soapHeader></soapHeader>
   	<soapRequestMethod></soapRequestMethod>
   	<soapServiceFunction></soapServiceFunction>
   	<verificationScript>
   		import com.kms.katalon.core.testobject.RequestObject
		import com.kms.katalon.core.testobject.ResponseObject
		import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
		import com.kms.katalon.core.webservice.verification.WSResponseManager
		RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
		ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
   	</verificationScript>
   	<wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>