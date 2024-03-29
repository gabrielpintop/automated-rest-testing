/**
 */
package automatedresttesting.impl;

import automatedresttesting.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomatedresttestingFactoryImpl extends EFactoryImpl implements AutomatedresttestingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutomatedresttestingFactory init() {
		try {
			AutomatedresttestingFactory theAutomatedresttestingFactory = (AutomatedresttestingFactory)EPackage.Registry.INSTANCE.getEFactory(AutomatedresttestingPackage.eNS_URI);
			if (theAutomatedresttestingFactory != null) {
				return theAutomatedresttestingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutomatedresttestingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatedresttestingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING: return createAutomatedRestTesting();
			case AutomatedresttestingPackage.ENTITY: return createEntity();
			case AutomatedresttestingPackage.REST_SERVICE: return createRestService();
			case AutomatedresttestingPackage.ATTRIBUTE: return createAttribute();
			case AutomatedresttestingPackage.RESTRICTION: return createRestriction();
			case AutomatedresttestingPackage.ASSERTION: return createAssertion();
			case AutomatedresttestingPackage.DOMAIN_ATTRIBUTE: return createDomainAttribute();
			case AutomatedresttestingPackage.PARAMETER: return createParameter();
			case AutomatedresttestingPackage.TEST: return createTest();
			case AutomatedresttestingPackage.EXPRESSION: return createExpression();
			case AutomatedresttestingPackage.SIMPLE_ENTITY: return createSimpleEntity();
			case AutomatedresttestingPackage.MAPPING_ELEMENT: return createMappingElement();
			case AutomatedresttestingPackage.STRING_LITERAL: return createStringLiteral();
			case AutomatedresttestingPackage.ELEMENT_LITERAL: return createElementLiteral();
			case AutomatedresttestingPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case AutomatedresttestingPackage.URL: return createURL();
			case AutomatedresttestingPackage.URL_EXPRESSION: return createURLExpression();
			case AutomatedresttestingPackage.SEPARATOR: return createSeparator();
			case AutomatedresttestingPackage.URL_TEXT: return createURLText();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AutomatedresttestingPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.MOCK_TYPES:
				return createMockTypesFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.METHOD_TYPE:
				return createMethodTypeFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.ASSERTION_TYPE:
				return createAssertionTypeFromString(eDataType, initialValue);
			case AutomatedresttestingPackage.SEPARATOR_TYPE:
				return createSeparatorTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AutomatedresttestingPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.MOCK_TYPES:
				return convertMockTypesToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.METHOD_TYPE:
				return convertMethodTypeToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.ASSERTION_TYPE:
				return convertAssertionTypeToString(eDataType, instanceValue);
			case AutomatedresttestingPackage.SEPARATOR_TYPE:
				return convertSeparatorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutomatedRestTesting createAutomatedRestTesting() {
		AutomatedRestTestingImpl automatedRestTesting = new AutomatedRestTestingImpl();
		return automatedRestTesting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestService createRestService() {
		RestServiceImpl restService = new RestServiceImpl();
		return restService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAttribute createDomainAttribute() {
		DomainAttributeImpl domainAttribute = new DomainAttributeImpl();
		return domainAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleEntity createSimpleEntity() {
		SimpleEntityImpl simpleEntity = new SimpleEntityImpl();
		return simpleEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingElement createMappingElement() {
		MappingElementImpl mappingElement = new MappingElementImpl();
		return mappingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementLiteral createElementLiteral() {
		ElementLiteralImpl elementLiteral = new ElementLiteralImpl();
		return elementLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URL createURL() {
		URLImpl url = new URLImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URLExpression createURLExpression() {
		URLExpressionImpl urlExpression = new URLExpressionImpl();
		return urlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URLText createURLText() {
		URLTextImpl urlText = new URLTextImpl();
		return urlText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockTypes createMockTypesFromString(EDataType eDataType, String initialValue) {
		MockTypes result = MockTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMockTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodTypeFromString(EDataType eDataType, String initialValue) {
		MethodType result = MethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionType createAssertionTypeFromString(EDataType eDataType, String initialValue) {
		AssertionType result = AssertionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparatorType createSeparatorTypeFromString(EDataType eDataType, String initialValue) {
		SeparatorType result = SeparatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutomatedresttestingPackage getAutomatedresttestingPackage() {
		return (AutomatedresttestingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutomatedresttestingPackage getPackage() {
		return AutomatedresttestingPackage.eINSTANCE;
	}

} //AutomatedresttestingFactoryImpl
