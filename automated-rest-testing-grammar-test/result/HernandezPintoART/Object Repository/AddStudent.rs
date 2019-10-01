<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
	<description></description>
    <name>AddStudent</name>
    <tag></tag>
    <elementGuidId>2744c6ab-0005-4dc9-94c9-04bb45d5046a</elementGuidId>
    <selectorMethod>BASIC</selectorMethod>
    <useRalativeImagePath>false</useRalativeImagePath>
  	<followRedirects>false</followRedirects>
    <httpBody></httpBody>
    <httpBodyContent>
    {
    &quot;text&quot;: &quot;{\n  \&quot;id&quot;: &quot;${id}&quot;,\n  \&quot;first_name&quot;: &quot;${first_name}&quot;,\n  \&quot;last_name&quot;: &quot;${last_name}&quot;,\n  \&quot;gender&quot;: &quot;${gender}&quot;,\n  \&quot;code&quot;: &quot;${code}&quot;,\n  \&quot;country&quot;: &quot;${country}&quot;,\n  \&quot;city&quot;: &quot;${city}&quot;,\n  \&quot;university&quot;: &quot;${university}&quot;\n}&quot;,
    &quot;contentType&quot;: &quot;application/json&quot;,
    &quot;charset&quot;: &quot;UTF-8&quot;
    }
    </httpBodyContent>
  	<httpBodyType>text</httpBodyType>
  	<httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   	</httpHeaderProperties>
  	<migratedVersion>5.4.1</migratedVersion>
	<restRequestMethod>POST</restRequestMethod>
   	<restUrl>https://miso4202-apitest.herokuapp.com/api/v1/students</restUrl>
   	<serviceType>RESTful</serviceType>
   	<soapBody></soapBody>
   	<soapHeader></soapHeader>
   	<soapRequestMethod></soapRequestMethod>
   	<soapServiceFunction></soapServiceFunction>
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0000-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>id</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0001-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>first_name</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0002-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>last_name</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0003-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>gender</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0004-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>code</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0005-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>country</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0006-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>city</name>
   	</variables>				
   	<variables>
      	<description></description>
      	<id>4744c6ab-0005-4dc9-0007-04bb45d5046a</id>
      	<masked>false</masked>
      	<name>university</name>
   	</variables>				
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