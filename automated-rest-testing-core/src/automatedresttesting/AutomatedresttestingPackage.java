/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see automatedresttesting.AutomatedresttestingFactory
 * @model kind="package"
 * @generated
 */
public interface AutomatedresttestingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "automatedresttesting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/automatedrestesting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "automatedtesttesting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomatedresttestingPackage eINSTANCE = automatedresttesting.impl.AutomatedresttestingPackageImpl.init();

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.AutomatedRestTestingImpl <em>Automated Rest Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.AutomatedRestTestingImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAutomatedRestTesting()
	 * @generated
	 */
	int AUTOMATED_REST_TESTING = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING__URL = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING__TESTS = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Data Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING__DATA_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Automated Rest Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Automated Rest Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATED_REST_TESTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.ElementImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_ARRAY = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.EntityImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_ARRAY = ELEMENT__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_ATTRIBUTES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.RestServiceImpl <em>Rest Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.RestServiceImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRestService()
	 * @generated
	 */
	int REST_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__URI = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.AttributeImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ARRAY = ELEMENT__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RESTRICTIONS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.RestrictionImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 4;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__VALID = 0;

	/**
	 * The feature id for the '<em><b>Mock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MOCK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.AssertionImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Data To Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DATA_TO_TEST = 1;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.DomainAttributeImpl <em>Domain Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.DomainAttributeImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getDomainAttribute()
	 * @generated
	 */
	int DOMAIN_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__IS_ARRAY = ATTRIBUTE__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__VALUE = ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__RESTRICTIONS = ATTRIBUTE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.ParameterImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ARRAY = ATTRIBUTE__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RESTRICTIONS = ATTRIBUTE__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAM_TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.TestImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ASSERTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.ExpressionImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPECTED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RELATIONAL_OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.SimpleEntityImpl <em>Simple Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.SimpleEntityImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSimpleEntity()
	 * @generated
	 */
	int SIMPLE_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY__IS_ARRAY = ELEMENT__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY__ENTITY_ATTRIBUTES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.AttributeType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 12;

	/**
	 * The meta object id for the '{@link automatedresttesting.MockTypes <em>Mock Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.MockTypes
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMockTypes()
	 * @generated
	 */
	int MOCK_TYPES = 13;

	/**
	 * The meta object id for the '{@link automatedresttesting.MethodType <em>Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.MethodType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 14;

	/**
	 * The meta object id for the '{@link automatedresttesting.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.ParameterType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 15;

	/**
	 * The meta object id for the '{@link automatedresttesting.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.RelationalOperator
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 16;


	/**
	 * Returns the meta object for class '{@link automatedresttesting.AutomatedRestTesting <em>Automated Rest Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automated Rest Testing</em>'.
	 * @see automatedresttesting.AutomatedRestTesting
	 * @generated
	 */
	EClass getAutomatedRestTesting();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.AutomatedRestTesting#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see automatedresttesting.AutomatedRestTesting#getUrl()
	 * @see #getAutomatedRestTesting()
	 * @generated
	 */
	EAttribute getAutomatedRestTesting_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.AutomatedRestTesting#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see automatedresttesting.AutomatedRestTesting#getTests()
	 * @see #getAutomatedRestTesting()
	 * @generated
	 */
	EReference getAutomatedRestTesting_Tests();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.AutomatedRestTesting#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see automatedresttesting.AutomatedRestTesting#getServices()
	 * @see #getAutomatedRestTesting()
	 * @generated
	 */
	EReference getAutomatedRestTesting_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.AutomatedRestTesting#getDataElements <em>Data Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Elements</em>'.
	 * @see automatedresttesting.AutomatedRestTesting#getDataElements()
	 * @see #getAutomatedRestTesting()
	 * @generated
	 */
	EReference getAutomatedRestTesting_DataElements();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see automatedresttesting.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.Entity#getEntityAttributes <em>Entity Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Attributes</em>'.
	 * @see automatedresttesting.Entity#getEntityAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityAttributes();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.RestService <em>Rest Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service</em>'.
	 * @see automatedresttesting.RestService
	 * @generated
	 */
	EClass getRestService();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.RestService#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see automatedresttesting.RestService#getUri()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Uri();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.RestService#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see automatedresttesting.RestService#getMethod()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Method();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.RestService#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see automatedresttesting.RestService#getResponse()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_Response();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.RestService#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see automatedresttesting.RestService#getRequest()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.RestService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see automatedresttesting.RestService#getParameters()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.RestService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see automatedresttesting.RestService#getName()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Name();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see automatedresttesting.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automatedresttesting.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.Attribute#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see automatedresttesting.Attribute#getRestrictions()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see automatedresttesting.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see automatedresttesting.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Restriction#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see automatedresttesting.Restriction#isValid()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Valid();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Restriction#getMockType <em>Mock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mock Type</em>'.
	 * @see automatedresttesting.Restriction#getMockType()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_MockType();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see automatedresttesting.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link automatedresttesting.Assertion#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see automatedresttesting.Assertion#getCondition()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Condition();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.Assertion#getDataToTest <em>Data To Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data To Test</em>'.
	 * @see automatedresttesting.Assertion#getDataToTest()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_DataToTest();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.DomainAttribute <em>Domain Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Attribute</em>'.
	 * @see automatedresttesting.DomainAttribute
	 * @generated
	 */
	EClass getDomainAttribute();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.DomainAttribute#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see automatedresttesting.DomainAttribute#isPrimaryKey()
	 * @see #getDomainAttribute()
	 * @generated
	 */
	EAttribute getDomainAttribute_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see automatedresttesting.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Parameter#getParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Type</em>'.
	 * @see automatedresttesting.Parameter#getParamType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParamType();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see automatedresttesting.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Test#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see automatedresttesting.Test#getDescription()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.Test#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see automatedresttesting.Test#getAssertions()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Assertions();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see automatedresttesting.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.Test#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see automatedresttesting.Test#getService()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Service();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see automatedresttesting.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see automatedresttesting.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Element#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see automatedresttesting.Element#isIsArray()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsArray();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see automatedresttesting.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see automatedresttesting.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Expression#getExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Value</em>'.
	 * @see automatedresttesting.Expression#getExpectedValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpectedValue();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Expression#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relational Operator</em>'.
	 * @see automatedresttesting.Expression#getRelationalOperator()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_RelationalOperator();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.SimpleEntity <em>Simple Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Entity</em>'.
	 * @see automatedresttesting.SimpleEntity
	 * @generated
	 */
	EClass getSimpleEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.SimpleEntity#getEntityAttributes <em>Entity Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Attributes</em>'.
	 * @see automatedresttesting.SimpleEntity#getEntityAttributes()
	 * @see #getSimpleEntity()
	 * @generated
	 */
	EReference getSimpleEntity_EntityAttributes();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see automatedresttesting.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.MockTypes <em>Mock Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mock Types</em>'.
	 * @see automatedresttesting.MockTypes
	 * @generated
	 */
	EEnum getMockTypes();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type</em>'.
	 * @see automatedresttesting.MethodType
	 * @generated
	 */
	EEnum getMethodType();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see automatedresttesting.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see automatedresttesting.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutomatedresttestingFactory getAutomatedresttestingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.AutomatedRestTestingImpl <em>Automated Rest Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.AutomatedRestTestingImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAutomatedRestTesting()
		 * @generated
		 */
		EClass AUTOMATED_REST_TESTING = eINSTANCE.getAutomatedRestTesting();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATED_REST_TESTING__URL = eINSTANCE.getAutomatedRestTesting_Url();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATED_REST_TESTING__TESTS = eINSTANCE.getAutomatedRestTesting_Tests();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATED_REST_TESTING__SERVICES = eINSTANCE.getAutomatedRestTesting_Services();

		/**
		 * The meta object literal for the '<em><b>Data Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATED_REST_TESTING__DATA_ELEMENTS = eINSTANCE.getAutomatedRestTesting_DataElements();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.EntityImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_ATTRIBUTES = eINSTANCE.getEntity_EntityAttributes();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.RestServiceImpl <em>Rest Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.RestServiceImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRestService()
		 * @generated
		 */
		EClass REST_SERVICE = eINSTANCE.getRestService();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__URI = eINSTANCE.getRestService_Uri();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__METHOD = eINSTANCE.getRestService_Method();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__RESPONSE = eINSTANCE.getRestService_Response();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__REQUEST = eINSTANCE.getRestService_Request();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__PARAMETERS = eINSTANCE.getRestService_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__NAME = eINSTANCE.getRestService_Name();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.AttributeImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RESTRICTIONS = eINSTANCE.getAttribute_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.RestrictionImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__VALID = eINSTANCE.getRestriction_Valid();

		/**
		 * The meta object literal for the '<em><b>Mock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__MOCK_TYPE = eINSTANCE.getRestriction_MockType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.AssertionImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__CONDITION = eINSTANCE.getAssertion_Condition();

		/**
		 * The meta object literal for the '<em><b>Data To Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__DATA_TO_TEST = eINSTANCE.getAssertion_DataToTest();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.DomainAttributeImpl <em>Domain Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.DomainAttributeImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getDomainAttribute()
		 * @generated
		 */
		EClass DOMAIN_ATTRIBUTE = eINSTANCE.getDomainAttribute();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ATTRIBUTE__PRIMARY_KEY = eINSTANCE.getDomainAttribute_PrimaryKey();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.ParameterImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Param Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAM_TYPE = eINSTANCE.getParameter_ParamType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.TestImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DESCRIPTION = eINSTANCE.getTest_Description();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ASSERTIONS = eINSTANCE.getTest_Assertions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__SERVICE = eINSTANCE.getTest_Service();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.ElementImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_ARRAY = eINSTANCE.getElement_IsArray();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.ExpressionImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Expected Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPECTED_VALUE = eINSTANCE.getExpression_ExpectedValue();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getExpression_RelationalOperator();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.SimpleEntityImpl <em>Simple Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.SimpleEntityImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSimpleEntity()
		 * @generated
		 */
		EClass SIMPLE_ENTITY = eINSTANCE.getSimpleEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ENTITY__ENTITY_ATTRIBUTES = eINSTANCE.getSimpleEntity_EntityAttributes();

		/**
		 * The meta object literal for the '{@link automatedresttesting.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.AttributeType
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.MockTypes <em>Mock Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.MockTypes
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMockTypes()
		 * @generated
		 */
		EEnum MOCK_TYPES = eINSTANCE.getMockTypes();

		/**
		 * The meta object literal for the '{@link automatedresttesting.MethodType <em>Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.MethodType
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMethodType()
		 * @generated
		 */
		EEnum METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.ParameterType
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.RelationalOperator
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

	}

} //AutomatedresttestingPackage