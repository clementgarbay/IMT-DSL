/*
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.serializer;

import com.google.inject.Inject;
import fr.imta.clementdamien.dsl.selenium.mySelenium.AssertContains;
import fr.imta.clementdamien.dsl.selenium.mySelenium.AssertEquals;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Attribute;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Attributes;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Function;
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCall;
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCallParameters;
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionName;
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionParameters;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Functions;
import fr.imta.clementdamien.dsl.selenium.mySelenium.MySeleniumPackage;
import fr.imta.clementdamien.dsl.selenium.mySelenium.NavigationAction;
import fr.imta.clementdamien.dsl.selenium.mySelenium.OneParameterAction;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Program;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Projection;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Selector;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Statements;
import fr.imta.clementdamien.dsl.selenium.mySelenium.StringParameter;
import fr.imta.clementdamien.dsl.selenium.mySelenium.TwoParametersAction;
import fr.imta.clementdamien.dsl.selenium.mySelenium.Variable;
import fr.imta.clementdamien.dsl.selenium.mySelenium.VariableCall;
import fr.imta.clementdamien.dsl.selenium.services.MySeleniumGrammarAccess;
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

@SuppressWarnings("all")
public class MySeleniumSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MySeleniumGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MySeleniumPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MySeleniumPackage.ASSERT_CONTAINS:
				sequence_AssertContains(context, (AssertContains) semanticObject); 
				return; 
			case MySeleniumPackage.ASSERT_EQUALS:
				sequence_AssertEquals(context, (AssertEquals) semanticObject); 
				return; 
			case MySeleniumPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MySeleniumPackage.ATTRIBUTES:
				sequence_Attributes(context, (Attributes) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTION_CALL_PARAMETERS:
				sequence_FunctionCallParameters(context, (FunctionCallParameters) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTION_NAME:
				sequence_FunctionName(context, (FunctionName) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTION_PARAMETERS:
				sequence_FunctionParameters(context, (FunctionParameters) semanticObject); 
				return; 
			case MySeleniumPackage.FUNCTIONS:
				sequence_Functions(context, (Functions) semanticObject); 
				return; 
			case MySeleniumPackage.NAVIGATION_ACTION:
				sequence_NavigationAction(context, (NavigationAction) semanticObject); 
				return; 
			case MySeleniumPackage.ONE_PARAMETER_ACTION:
				sequence_OneParameterAction(context, (OneParameterAction) semanticObject); 
				return; 
			case MySeleniumPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MySeleniumPackage.PROJECTION:
				sequence_Projection(context, (Projection) semanticObject); 
				return; 
			case MySeleniumPackage.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			case MySeleniumPackage.STATEMENTS:
				sequence_Statements(context, (Statements) semanticObject); 
				return; 
			case MySeleniumPackage.STRING_PARAMETER:
				sequence_StringParameter(context, (StringParameter) semanticObject); 
				return; 
			case MySeleniumPackage.TWO_PARAMETERS_ACTION:
				sequence_TwoParametersAction(context, (TwoParametersAction) semanticObject); 
				return; 
			case MySeleniumPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MySeleniumPackage.VARIABLE_CALL:
				sequence_VariableCall(context, (VariableCall) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns AssertContains
	 *     AssertContains returns AssertContains
	 *
	 * Constraint:
	 *     (container=AssertableElement element=AssertableElement)
	 */
	protected void sequence_AssertContains(ISerializationContext context, AssertContains semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.ASSERT_CONTAINS__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.ASSERT_CONTAINS__CONTAINER));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.ASSERT_CONTAINS__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.ASSERT_CONTAINS__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0(), semanticObject.getContainer());
		feeder.accept(grammarAccess.getAssertContainsAccess().getElementAssertableElementParserRuleCall_3_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AssertEquals
	 *     AssertEquals returns AssertEquals
	 *
	 * Constraint:
	 *     (assertableElement+=AssertableElement assertableElement+=AssertableElement)
	 */
	protected void sequence_AssertEquals(ISerializationContext context, AssertEquals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=DOMAttribute (value=STRING | val=[Variable|ID]))
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attributes returns Attributes
	 *
	 * Constraint:
	 *     (attrs+=Attribute attrs+=Attribute*)
	 */
	protected void sequence_Attributes(ISerializationContext context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionCallParameters returns FunctionCallParameters
	 *
	 * Constraint:
	 *     (variables+=VariableCall variables+=VariableCall*)
	 */
	protected void sequence_FunctionCallParameters(ISerializationContext context, FunctionCallParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionCall returns FunctionCall
	 *     Statement returns FunctionCall
	 *     AssertableElement returns FunctionCall
	 *
	 * Constraint:
	 *     (ref=[FunctionName|ID] params=FunctionCallParameters)
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.FUNCTION_CALL__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.FUNCTION_CALL__REF));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.FUNCTION_CALL__PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.FUNCTION_CALL__PARAMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionCallAccess().getRefFunctionNameIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MySeleniumPackage.Literals.FUNCTION_CALL__REF, false));
		feeder.accept(grammarAccess.getFunctionCallAccess().getParamsFunctionCallParametersParserRuleCall_1_0(), semanticObject.getParams());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FunctionName returns FunctionName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FunctionName(ISerializationContext context, FunctionName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.FUNCTION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.FUNCTION_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FunctionParameters returns FunctionParameters
	 *
	 * Constraint:
	 *     (variables+=Variable variables+=Variable*)
	 */
	protected void sequence_FunctionParameters(ISerializationContext context, FunctionParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=FunctionName params=FunctionParameters? statements+=Statement*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Functions returns Functions
	 *
	 * Constraint:
	 *     functions+=Function+
	 */
	protected void sequence_Functions(ISerializationContext context, Functions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns NavigationAction
	 *     NavigationAction returns NavigationAction
	 *
	 * Constraint:
	 *     (action=NavigationActionType param=STRING)
	 */
	protected void sequence_NavigationAction(ISerializationContext context, NavigationAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.NAVIGATION_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.NAVIGATION_ACTION__ACTION));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.NAVIGATION_ACTION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.NAVIGATION_ACTION__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getNavigationActionAccess().getParamSTRINGTerminalRuleCall_1_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns OneParameterAction
	 *     OneParameterAction returns OneParameterAction
	 *
	 * Constraint:
	 *     (action=OneParameterActionType selector=Selector (selectorParameter=Selector | stringParameter=STRING)?)
	 */
	protected void sequence_OneParameterAction(ISerializationContext context, OneParameterAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (functions=Functions | statements=Statements)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Projection returns Projection
	 *     AssertableElement returns Projection
	 *
	 * Constraint:
	 *     (selector=Selector projectionAction=ProjectionAction)
	 */
	protected void sequence_Projection(ISerializationContext context, Projection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.PROJECTION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.PROJECTION__SELECTOR));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.PROJECTION__PROJECTION_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.PROJECTION__PROJECTION_ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0(), semanticObject.getSelector());
		feeder.accept(grammarAccess.getProjectionAccess().getProjectionActionProjectionActionParserRuleCall_2_0(), semanticObject.getProjectionAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     (element=DOMElement attrs=Attributes? all?='.all'?)
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Statements
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_Statements(ISerializationContext context, Statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssertableElement returns StringParameter
	 *     VariableCall returns StringParameter
	 *     StringParameter returns StringParameter
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringParameter(ISerializationContext context, StringParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.STRING_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.STRING_PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringParameterAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TwoParametersAction returns TwoParametersAction
	 *
	 * Constraint:
	 *     (action=TwoParametersActionType selector=Selector parameter=Selector)
	 */
	protected void sequence_TwoParametersAction(ISerializationContext context, TwoParametersAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__ACTION));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__SELECTOR));
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.TWO_PARAMETERS_ACTION__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTwoParametersActionAccess().getActionTwoParametersActionTypeParserRuleCall_0_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getTwoParametersActionAccess().getSelectorSelectorParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.accept(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariableCall returns VariableCall
	 *
	 * Constraint:
	 *     name=[Variable|ID]
	 */
	protected void sequence_VariableCall(ISerializationContext context, VariableCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.VARIABLE_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.VARIABLE_CALL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MySeleniumPackage.Literals.VARIABLE_CALL__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AssertableElement returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MySeleniumPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MySeleniumPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
