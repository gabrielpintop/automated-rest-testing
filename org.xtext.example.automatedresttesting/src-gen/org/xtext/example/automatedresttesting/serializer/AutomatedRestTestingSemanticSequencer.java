/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting.serializer;

import automatedresttesting.Assertion;
import automatedresttesting.Attribute;
import automatedresttesting.AutomatedRestTesting;
import automatedresttesting.AutomatedresttestingPackage;
import automatedresttesting.DomainAttribute;
import automatedresttesting.ElementLiteral;
import automatedresttesting.Entity;
import automatedresttesting.Expression;
import automatedresttesting.IntegerLiteral;
import automatedresttesting.MappingElement;
import automatedresttesting.RestService;
import automatedresttesting.Restriction;
import automatedresttesting.Separator;
import automatedresttesting.SimpleEntity;
import automatedresttesting.StringLiteral;
import automatedresttesting.Test;
import automatedresttesting.URL;
import automatedresttesting.URLText;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;

@SuppressWarnings("all")
public class AutomatedRestTestingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AutomatedRestTestingGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AutomatedresttestingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AutomatedresttestingPackage.ASSERTION:
				sequence_Assertion(context, (Assertion) semanticObject); 
				return; 
			case AutomatedresttestingPackage.ATTRIBUTE:
				sequence_Attribute_Impl(context, (Attribute) semanticObject); 
				return; 
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING:
				sequence_AutomatedRestTesting(context, (AutomatedRestTesting) semanticObject); 
				return; 
			case AutomatedresttestingPackage.DOMAIN_ATTRIBUTE:
				sequence_DomainAttribute(context, (DomainAttribute) semanticObject); 
				return; 
			case AutomatedresttestingPackage.ELEMENT_LITERAL:
				sequence_ElementLiteral(context, (ElementLiteral) semanticObject); 
				return; 
			case AutomatedresttestingPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case AutomatedresttestingPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case AutomatedresttestingPackage.INTEGER_LITERAL:
				sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
				return; 
			case AutomatedresttestingPackage.MAPPING_ELEMENT:
				sequence_MappingElement(context, (MappingElement) semanticObject); 
				return; 
			case AutomatedresttestingPackage.PARAMETER:
				sequence_Parameter(context, (automatedresttesting.Parameter) semanticObject); 
				return; 
			case AutomatedresttestingPackage.REST_SERVICE:
				sequence_RestService(context, (RestService) semanticObject); 
				return; 
			case AutomatedresttestingPackage.RESTRICTION:
				sequence_Restriction(context, (Restriction) semanticObject); 
				return; 
			case AutomatedresttestingPackage.SEPARATOR:
				sequence_Separator(context, (Separator) semanticObject); 
				return; 
			case AutomatedresttestingPackage.SIMPLE_ENTITY:
				sequence_SimpleEntity(context, (SimpleEntity) semanticObject); 
				return; 
			case AutomatedresttestingPackage.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			case AutomatedresttestingPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case AutomatedresttestingPackage.URL:
				sequence_URL(context, (URL) semanticObject); 
				return; 
			case AutomatedresttestingPackage.URL_TEXT:
				sequence_URLText(context, (URLText) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assertion returns Assertion
	 *
	 * Constraint:
	 *     ((assertionType=AssertionType dataToTest=[Element|QualifiedName])? condition=Expression)
	 */
	protected void sequence_Assertion(ISerializationContext context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *     Attribute_Impl returns Attribute
	 *
	 * Constraint:
	 *     (type=AttributeType isArray?=SQUARE_LEFT_BRACKET? name=EString)
	 */
	protected void sequence_Attribute_Impl(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AutomatedRestTesting returns AutomatedRestTesting
	 *
	 * Constraint:
	 *     (url=EString (dataElements+=Element dataElements+=Element*)? (services+=RestService services+=RestService*)? (tests+=Test tests+=Test*)?)
	 */
	protected void sequence_AutomatedRestTesting(ISerializationContext context, AutomatedRestTesting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainAttribute returns DomainAttribute
	 *
	 * Constraint:
	 *     (type=AttributeType isArray?=SQUARE_LEFT_BRACKET? name=EString (primaryKey?='PK'? restrictions+=Restriction)?)
	 */
	protected void sequence_DomainAttribute(ISerializationContext context, DomainAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ElementLiteral
	 *     ElementLiteral returns ElementLiteral
	 *
	 * Constraint:
	 *     value=[Element|QualifiedName]
	 */
	protected void sequence_ElementLiteral(ISerializationContext context, ElementLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.ELEMENT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.ELEMENT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementLiteralAccess().getValueElementQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(AutomatedresttestingPackage.Literals.ELEMENT_LITERAL__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=EString entityAttributes+=DomainAttribute entityAttributes+=DomainAttribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (relationalOperator=RelationalOperator expectedValue=Literal?)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns IntegerLiteral
	 *     IntegerLiteral returns IntegerLiteral
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerLiteral(ISerializationContext context, IntegerLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MappingElement returns MappingElement
	 *
	 * Constraint:
	 *     (parameter=[Element|QualifiedName] value=Literal)
	 */
	protected void sequence_MappingElement(ISerializationContext context, MappingElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.MAPPING_ELEMENT__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.MAPPING_ELEMENT__PARAMETER));
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.MAPPING_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.MAPPING_ELEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMappingElementAccess().getParameterElementQualifiedNameParserRuleCall_3_0_1(), semanticObject.eGet(AutomatedresttestingPackage.Literals.MAPPING_ELEMENT__PARAMETER, false));
		feeder.accept(grammarAccess.getMappingElementAccess().getValueLiteralParserRuleCall_8_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     URLExpression returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (paramType=ParameterType name=ID)
	 */
	protected void sequence_Parameter(ISerializationContext context, automatedresttesting.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.PARAMETER__PARAM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.PARAMETER__PARAM_TYPE));
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getParamTypeParameterTypeEnumRuleCall_1_0(), semanticObject.getParamType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RestService returns RestService
	 *
	 * Constraint:
	 *     (method=MethodType name=EString uri=URL request=[Element|EString]? response=[Element|EString])
	 */
	protected void sequence_RestService(ISerializationContext context, RestService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Restriction returns Restriction
	 *
	 * Constraint:
	 *     mockType=MockTypes
	 */
	protected void sequence_Restriction(ISerializationContext context, Restriction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.RESTRICTION__MOCK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.RESTRICTION__MOCK_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRestrictionAccess().getMockTypeMockTypesEnumRuleCall_3_0(), semanticObject.getMockType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     URLExpression returns Separator
	 *     Separator returns Separator
	 *
	 * Constraint:
	 *     separatorType=SeparatorType
	 */
	protected void sequence_Separator(ISerializationContext context, Separator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.SEPARATOR__SEPARATOR_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.SEPARATOR__SEPARATOR_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSeparatorAccess().getSeparatorTypeSeparatorTypeEnumRuleCall_1_0(), semanticObject.getSeparatorType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SimpleEntity
	 *     SimpleEntity returns SimpleEntity
	 *
	 * Constraint:
	 *     (name=EString entityAttributes+=Attribute entityAttributes+=Attribute*)
	 */
	protected void sequence_SimpleEntity(ISerializationContext context, SimpleEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (name=EString service=[RestService|EString] description=EString? (mappings+=MappingElement mappings+=MappingElement*)? assertions+=Assertion+)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     URLExpression returns URLText
	 *     URLText returns URLText
	 *
	 * Constraint:
	 *     text=EString
	 */
	protected void sequence_URLText(ISerializationContext context, URLText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AutomatedresttestingPackage.Literals.URL_TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AutomatedresttestingPackage.Literals.URL_TEXT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getURLTextAccess().getTextEStringParserRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     URL returns URL
	 *
	 * Constraint:
	 *     (urlexpression+=URLExpression urlexpression+=URLExpression*)
	 */
	protected void sequence_URL(ISerializationContext context, URL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
