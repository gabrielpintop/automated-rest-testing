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
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__URI = 4;

	/**
	 * The number of structural features of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Assertion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ASSERTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link automatedresttesting.impl.URLExpressionImpl <em>URL Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.URLExpressionImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURLExpression()
	 * @generated
	 */
	int URL_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXPRESSION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXPRESSION__IS_ARRAY = ELEMENT__IS_ARRAY;

	/**
	 * The number of structural features of the '<em>URL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXPRESSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>URL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXPRESSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

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
	int PARAMETER__NAME = URL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ARRAY = URL_EXPRESSION__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAM_TYPE = URL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = URL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = URL_EXPRESSION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__MAPPINGS = 4;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RELATIONAL_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Expected Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPECTED_VALUE = 2;

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
	 * The meta object id for the '{@link automatedresttesting.impl.MappingElementImpl <em>Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.MappingElementImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMappingElement()
	 * @generated
	 */
	int MAPPING_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.LiteralImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 13;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.StringLiteralImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.ElementLiteralImpl <em>Element Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.ElementLiteralImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getElementLiteral()
	 * @generated
	 */
	int ELEMENT_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.IntegerLiteralImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.URLImpl <em>URL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.URLImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURL()
	 * @generated
	 */
	int URL = 17;

	/**
	 * The feature id for the '<em><b>Urlexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__URLEXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.SeparatorImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__NAME = URL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__IS_ARRAY = URL_EXPRESSION__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Separator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__SEPARATOR_TYPE = URL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = URL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_OPERATION_COUNT = URL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.impl.URLTextImpl <em>URL Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.impl.URLTextImpl
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURLText()
	 * @generated
	 */
	int URL_TEXT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TEXT__NAME = URL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TEXT__IS_ARRAY = URL_EXPRESSION__IS_ARRAY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TEXT__TEXT = URL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TEXT_FEATURE_COUNT = URL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TEXT_OPERATION_COUNT = URL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link automatedresttesting.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.AttributeType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 21;

	/**
	 * The meta object id for the '{@link automatedresttesting.MockTypes <em>Mock Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.MockTypes
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMockTypes()
	 * @generated
	 */
	int MOCK_TYPES = 22;

	/**
	 * The meta object id for the '{@link automatedresttesting.MethodType <em>Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.MethodType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 23;

	/**
	 * The meta object id for the '{@link automatedresttesting.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.ParameterType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 24;

	/**
	 * The meta object id for the '{@link automatedresttesting.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.RelationalOperator
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link automatedresttesting.AssertionType <em>Assertion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.AssertionType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAssertionType()
	 * @generated
	 */
	int ASSERTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link automatedresttesting.SeparatorType <em>Separator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see automatedresttesting.SeparatorType
	 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSeparatorType()
	 * @generated
	 */
	int SEPARATOR_TYPE = 27;


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
	 * Returns the meta object for the containment reference '{@link automatedresttesting.RestService#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uri</em>'.
	 * @see automatedresttesting.RestService#getUri()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_Uri();

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
	 * Returns the meta object for the attribute '{@link automatedresttesting.Assertion#getAssertionType <em>Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assertion Type</em>'.
	 * @see automatedresttesting.Assertion#getAssertionType()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_AssertionType();

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
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.Test#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see automatedresttesting.Test#getMappings()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Mappings();

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
	 * Returns the meta object for the containment reference '{@link automatedresttesting.Expression#getExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Value</em>'.
	 * @see automatedresttesting.Expression#getExpectedValue()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExpectedValue();

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
	 * Returns the meta object for class '{@link automatedresttesting.MappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Element</em>'.
	 * @see automatedresttesting.MappingElement
	 * @generated
	 */
	EClass getMappingElement();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.MappingElement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see automatedresttesting.MappingElement#getParameter()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link automatedresttesting.MappingElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see automatedresttesting.MappingElement#getValue()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_Value();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see automatedresttesting.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see automatedresttesting.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automatedresttesting.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.ElementLiteral <em>Element Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Literal</em>'.
	 * @see automatedresttesting.ElementLiteral
	 * @generated
	 */
	EClass getElementLiteral();

	/**
	 * Returns the meta object for the reference '{@link automatedresttesting.ElementLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see automatedresttesting.ElementLiteral#getValue()
	 * @see #getElementLiteral()
	 * @generated
	 */
	EReference getElementLiteral_Value();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see automatedresttesting.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see automatedresttesting.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL</em>'.
	 * @see automatedresttesting.URL
	 * @generated
	 */
	EClass getURL();

	/**
	 * Returns the meta object for the containment reference list '{@link automatedresttesting.URL#getUrlexpression <em>Urlexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Urlexpression</em>'.
	 * @see automatedresttesting.URL#getUrlexpression()
	 * @see #getURL()
	 * @generated
	 */
	EReference getURL_Urlexpression();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.URLExpression <em>URL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Expression</em>'.
	 * @see automatedresttesting.URLExpression
	 * @generated
	 */
	EClass getURLExpression();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see automatedresttesting.Separator
	 * @generated
	 */
	EClass getSeparator();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.Separator#getSeparatorType <em>Separator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator Type</em>'.
	 * @see automatedresttesting.Separator#getSeparatorType()
	 * @see #getSeparator()
	 * @generated
	 */
	EAttribute getSeparator_SeparatorType();

	/**
	 * Returns the meta object for class '{@link automatedresttesting.URLText <em>URL Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Text</em>'.
	 * @see automatedresttesting.URLText
	 * @generated
	 */
	EClass getURLText();

	/**
	 * Returns the meta object for the attribute '{@link automatedresttesting.URLText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see automatedresttesting.URLText#getText()
	 * @see #getURLText()
	 * @generated
	 */
	EAttribute getURLText_Text();

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
	 * Returns the meta object for enum '{@link automatedresttesting.AssertionType <em>Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Type</em>'.
	 * @see automatedresttesting.AssertionType
	 * @generated
	 */
	EEnum getAssertionType();

	/**
	 * Returns the meta object for enum '{@link automatedresttesting.SeparatorType <em>Separator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Separator Type</em>'.
	 * @see automatedresttesting.SeparatorType
	 * @generated
	 */
	EEnum getSeparatorType();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__NAME = eINSTANCE.getRestService_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__URI = eINSTANCE.getRestService_Uri();

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
		 * The meta object literal for the '<em><b>Assertion Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__ASSERTION_TYPE = eINSTANCE.getAssertion_AssertionType();

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
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__MAPPINGS = eINSTANCE.getTest_Mappings();

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
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getExpression_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Expected Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPECTED_VALUE = eINSTANCE.getExpression_ExpectedValue();

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
		 * The meta object literal for the '{@link automatedresttesting.impl.MappingElementImpl <em>Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.MappingElementImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getMappingElement()
		 * @generated
		 */
		EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__PARAMETER = eINSTANCE.getMappingElement_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__VALUE = eINSTANCE.getMappingElement_Value();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.LiteralImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.StringLiteralImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.ElementLiteralImpl <em>Element Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.ElementLiteralImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getElementLiteral()
		 * @generated
		 */
		EClass ELEMENT_LITERAL = eINSTANCE.getElementLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_LITERAL__VALUE = eINSTANCE.getElementLiteral_Value();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.IntegerLiteralImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.URLImpl <em>URL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.URLImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURL()
		 * @generated
		 */
		EClass URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em><b>Urlexpression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL__URLEXPRESSION = eINSTANCE.getURL_Urlexpression();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.URLExpressionImpl <em>URL Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.URLExpressionImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURLExpression()
		 * @generated
		 */
		EClass URL_EXPRESSION = eINSTANCE.getURLExpression();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.SeparatorImpl <em>Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.SeparatorImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSeparator()
		 * @generated
		 */
		EClass SEPARATOR = eINSTANCE.getSeparator();

		/**
		 * The meta object literal for the '<em><b>Separator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATOR__SEPARATOR_TYPE = eINSTANCE.getSeparator_SeparatorType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.impl.URLTextImpl <em>URL Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.impl.URLTextImpl
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getURLText()
		 * @generated
		 */
		EClass URL_TEXT = eINSTANCE.getURLText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TEXT__TEXT = eINSTANCE.getURLText_Text();

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

		/**
		 * The meta object literal for the '{@link automatedresttesting.AssertionType <em>Assertion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.AssertionType
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getAssertionType()
		 * @generated
		 */
		EEnum ASSERTION_TYPE = eINSTANCE.getAssertionType();

		/**
		 * The meta object literal for the '{@link automatedresttesting.SeparatorType <em>Separator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see automatedresttesting.SeparatorType
		 * @see automatedresttesting.impl.AutomatedresttestingPackageImpl#getSeparatorType()
		 * @generated
		 */
		EEnum SEPARATOR_TYPE = eINSTANCE.getSeparatorType();

	}

} //AutomatedresttestingPackage
