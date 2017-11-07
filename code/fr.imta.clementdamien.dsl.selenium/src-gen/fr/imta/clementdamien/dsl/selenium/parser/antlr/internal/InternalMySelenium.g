/*
 * generated by Xtext 2.12.0
 */
grammar InternalMySelenium;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.imta.clementdamien.dsl.selenium.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.imta.clementdamien.dsl.selenium.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.clementdamien.dsl.selenium.services.MySeleniumGrammarAccess;

}

@parser::members {

 	private MySeleniumGrammarAccess grammarAccess;

    public InternalMySeleniumParser(TokenStream input, MySeleniumGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected MySeleniumGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionsParserRuleCall_0_0());
				}
				lv_functions_0_0=ruleFunctions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"functions",
						lv_functions_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Functions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementsParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleStatements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"statements",
						lv_statements_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statements");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFunctions
entryRuleFunctions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionsRule()); }
	iv_ruleFunctions=ruleFunctions
	{ $current=$iv_ruleFunctions.current; }
	EOF;

// Rule Functions
ruleFunctions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0());
			}
			lv_functions_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFunctionsRule());
				}
				add(
					$current,
					"functions",
					lv_functions_0_0,
					"fr.imta.clementdamien.dsl.selenium.MySelenium.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleStatements
entryRuleStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementsRule()); }
	iv_ruleStatements=ruleStatements
	{ $current=$iv_ruleStatements.current; }
	EOF;

// Rule Statements
ruleStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStatementsRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"fr.imta.clementdamien.dsl.selenium.MySelenium.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFunctionName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParametersParserRuleCall_2_0());
				}
				lv_params_2_0=ruleFunctionParameters
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"params",
						lv_params_2_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionParameters");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFunctionName
entryRuleFunctionName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionNameRule()); }
	iv_ruleFunctionName=ruleFunctionName
	{ $current=$iv_ruleFunctionName.current; }
	EOF;

// Rule FunctionName
ruleFunctionName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFunctionNameRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleFunctionCall
entryRuleFunctionCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallRule()); }
	iv_ruleFunctionCall=ruleFunctionCall
	{ $current=$iv_ruleFunctionCall.current; }
	EOF;

// Rule FunctionCall
ruleFunctionCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsFunctionCallParametersParserRuleCall_1_0());
				}
				lv_params_1_0=ruleFunctionCallParameters
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionCallRule());
					}
					set(
						$current,
						"params",
						lv_params_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionCallParameters");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProjection
entryRuleProjection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectionRule()); }
	iv_ruleProjection=ruleProjection
	{ $current=$iv_ruleProjection.current; }
	EOF;

// Rule Projection
ruleProjection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0());
				}
				lv_selector_0_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectionAccess().getProjectionActionProjectionActionParserRuleCall_2_0());
				}
				lv_projectionAction_2_0=ruleProjectionAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectionRule());
					}
					set(
						$current,
						"projectionAction",
						lv_projectionAction_2_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.ProjectionAction");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProjectionAction
entryRuleProjectionAction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProjectionActionRule()); }
	iv_ruleProjectionAction=ruleProjectionAction
	{ $current=$iv_ruleProjectionAction.current.getText(); }
	EOF;

// Rule ProjectionAction
ruleProjectionAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='value'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getValueKeyword_0());
		}
		    |
		kw='text'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getTextKeyword_1());
		}
		    |
		kw='html'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getHtmlKeyword_2());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getOneParameterActionParserRuleCall_0());
		}
		this_OneParameterAction_0=ruleOneParameterAction
		{
			$current = $this_OneParameterAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTwoParametersActionParserRuleCall_1());
		}
		this_TwoParametersAction_1=ruleTwoParametersAction
		{
			$current = $this_TwoParametersAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_2());
		}
		this_FunctionCall_2=ruleFunctionCall
		{
			$current = $this_FunctionCall_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_3());
		}
		this_AssertEquals_3=ruleAssertEquals
		{
			$current = $this_AssertEquals_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_4());
		}
		this_AssertContains_4=ruleAssertContains
		{
			$current = $this_AssertContains_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5());
		}
		this_NavigationAction_5=ruleNavigationAction
		{
			$current = $this_NavigationAction_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCommentParserRuleCall_6());
		}
		ruleComment
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAssertEquals
entryRuleAssertEquals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssertEqualsRule()); }
	iv_ruleAssertEquals=ruleAssertEquals
	{ $current=$iv_ruleAssertEquals.current; }
	EOF;

// Rule AssertEquals
ruleAssertEquals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='assert'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssertEqualsAccess().getAssertKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_1_0());
				}
				lv_assertableElement_1_0=ruleAssertableElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
					}
					add(
						$current,
						"assertableElement",
						lv_assertableElement_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_3_0());
				}
				lv_assertableElement_3_0=ruleAssertableElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
					}
					add(
						$current,
						"assertableElement",
						lv_assertableElement_3_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssertContains
entryRuleAssertContains returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssertContainsRule()); }
	iv_ruleAssertContains=ruleAssertContains
	{ $current=$iv_ruleAssertContains.current; }
	EOF;

// Rule AssertContains
ruleAssertContains returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='assert'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getAssertKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0());
				}
				lv_container_1_0=ruleAssertableElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssertContainsRule());
					}
					set(
						$current,
						"container",
						lv_container_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='contains'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssertContainsAccess().getContainsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssertContainsAccess().getElementAssertableElementParserRuleCall_3_0());
				}
				lv_element_3_0=ruleAssertableElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssertContainsRule());
					}
					set(
						$current,
						"element",
						lv_element_3_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssertableElement
entryRuleAssertableElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssertableElementRule()); }
	iv_ruleAssertableElement=ruleAssertableElement
	{ $current=$iv_ruleAssertableElement.current; }
	EOF;

// Rule AssertableElement
ruleAssertableElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssertableElementAccess().getVariableParserRuleCall_0());
		}
		this_Variable_0=ruleVariable
		{
			$current = $this_Variable_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		this_STRING_1=RULE_STRING
		{
			newLeafNode(this_STRING_1, grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssertableElementAccess().getProjectionParserRuleCall_2());
		}
		this_Projection_2=ruleProjection
		{
			$current = $this_Projection_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssertableElementAccess().getFunctionCallParserRuleCall_3());
		}
		this_FunctionCall_3=ruleFunctionCall
		{
			$current = $this_FunctionCall_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNavigationAction
entryRuleNavigationAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNavigationActionRule()); }
	iv_ruleNavigationAction=ruleNavigationAction
	{ $current=$iv_ruleNavigationAction.current; }
	EOF;

// Rule NavigationAction
ruleNavigationAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0());
				}
				lv_action_0_0=ruleNavigationActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNavigationActionRule());
					}
					set(
						$current,
						"action",
						lv_action_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.NavigationActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_param_1_0=RULE_STRING
				{
					newLeafNode(lv_param_1_0, grammarAccess.getNavigationActionAccess().getParamSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNavigationActionRule());
					}
					setWithLastConsumed(
						$current,
						"param",
						lv_param_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleNavigationActionType
entryRuleNavigationActionType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNavigationActionTypeRule()); }
	iv_ruleNavigationActionType=ruleNavigationActionType
	{ $current=$iv_ruleNavigationActionType.current.getText(); }
	EOF;

// Rule NavigationActionType
ruleNavigationActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='go'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0());
		}
		    |
		kw='openBrowser'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getOpenBrowserKeyword_1());
		}
	)
;

// Entry rule entryRuleOneParameterAction
entryRuleOneParameterAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOneParameterActionRule()); }
	iv_ruleOneParameterAction=ruleOneParameterAction
	{ $current=$iv_ruleOneParameterAction.current; }
	EOF;

// Rule OneParameterAction
ruleOneParameterAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOneParameterActionAccess().getActionOneParameterActionTypeParserRuleCall_0_0());
				}
				lv_action_0_0=ruleOneParameterActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOneParameterActionRule());
					}
					set(
						$current,
						"action",
						lv_action_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.OneParameterActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOneParameterActionAccess().getSelectorSelectorParserRuleCall_1_0());
				}
				lv_selector_1_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOneParameterActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTwoParametersAction
entryRuleTwoParametersAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoParametersActionRule()); }
	iv_ruleTwoParametersAction=ruleTwoParametersAction
	{ $current=$iv_ruleTwoParametersAction.current; }
	EOF;

// Rule TwoParametersAction
ruleTwoParametersAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTwoParametersActionAccess().getActionTwoParametersActionTypeParserRuleCall_0_0());
				}
				lv_action_0_0=ruleTwoParametersActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
					}
					set(
						$current,
						"action",
						lv_action_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.TwoParametersActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTwoParametersActionAccess().getSelectorSelectorParserRuleCall_1_0());
				}
				lv_selector_1_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0_0());
					}
					lv_parameter_2_1=ruleSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
						}
						set(
							$current,
							"parameter",
							lv_parameter_2_1,
							"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTwoParametersActionAccess().getParameterVariableParserRuleCall_2_0_1());
					}
					lv_parameter_2_2=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
						}
						set(
							$current,
							"parameter",
							lv_parameter_2_2,
							"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSelector
entryRuleSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorRule()); }
	iv_ruleSelector=ruleSelector
	{ $current=$iv_ruleSelector.current; }
	EOF;

// Rule Selector
ruleSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectorAccess().getElementDOMElementParserRuleCall_0_0());
				}
				lv_element_0_0=ruleDOMElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectorRule());
					}
					set(
						$current,
						"element",
						lv_element_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.DOMElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectorAccess().getAttrsAttributesParserRuleCall_2_0());
				}
				lv_attrs_2_0=ruleAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectorRule());
					}
					set(
						$current,
						"attrs",
						lv_attrs_2_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Attributes");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3());
		}
		(
			otherlv_4='.all'
			{
				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getAllKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleAttributes
entryRuleAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributesRule()); }
	iv_ruleAttributes=ruleAttributes
	{ $current=$iv_ruleAttributes.current; }
	EOF;

// Rule Attributes
ruleAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_0_0());
				}
				lv_attrs_0_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributesRule());
					}
					add(
						$current,
						"attrs",
						lv_attrs_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_1_0());
					}
					lv_attrs_2_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributesRule());
						}
						add(
							$current,
							"attrs",
							lv_attrs_2_0,
							"fr.imta.clementdamien.dsl.selenium.MySelenium.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getNameDOMAttributeParserRuleCall_0_0());
				}
				lv_name_0_0=ruleDOMAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.DOMAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
		}
		(
			this_STRING_2=RULE_STRING
			{
				newLeafNode(this_STRING_2, grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall_2_0());
			}
			    |
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDOMAttribute
entryRuleDOMAttribute returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOMAttributeRule()); }
	iv_ruleDOMAttribute=ruleDOMAttribute
	{ $current=$iv_ruleDOMAttribute.current.getText(); }
	EOF;

// Rule DOMAttribute
ruleDOMAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='name'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getNameKeyword_0());
		}
		    |
		kw='text'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTextKeyword_1());
		}
		    |
		kw='alt'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getAltKeyword_2());
		}
		    |
		kw='checked'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3());
		}
		    |
		kw='class'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getClassKeyword_4());
		}
	)
;

// Entry rule entryRuleDOMElement
entryRuleDOMElement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOMElementRule()); }
	iv_ruleDOMElement=ruleDOMElement
	{ $current=$iv_ruleDOMElement.current.getText(); }
	EOF;

// Rule DOMElement
ruleDOMElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='link'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getLinkKeyword_0());
		}
		    |
		kw='button'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getButtonKeyword_1());
		}
		    |
		kw='checkbox'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getCheckboxKeyword_2());
		}
		    |
		kw='input'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getInputKeyword_3());
		}
		    |
		kw='h1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getH1Keyword_4());
		}
		    |
		kw='body'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getBodyKeyword_5());
		}
		    |
		kw='select'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getSelectKeyword_6());
		}
		    |
		kw='a'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getAKeyword_7());
		}
		    |
		kw='img'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOMElementAccess().getImgKeyword_8());
		}
	)
;

// Entry rule entryRuleOneParameterActionType
entryRuleOneParameterActionType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOneParameterActionTypeRule()); }
	iv_ruleOneParameterActionType=ruleOneParameterActionType
	{ $current=$iv_ruleOneParameterActionType.current.getText(); }
	EOF;

// Rule OneParameterActionType
ruleOneParameterActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='click'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getClickKeyword());
	}
;

// Entry rule entryRuleTwoParametersActionType
entryRuleTwoParametersActionType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTwoParametersActionTypeRule()); }
	iv_ruleTwoParametersActionType=ruleTwoParametersActionType
	{ $current=$iv_ruleTwoParametersActionType.current.getText(); }
	EOF;

// Rule TwoParametersActionType
ruleTwoParametersActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='assign'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0());
		}
		    |
		kw='fill'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1());
		}
		    |
		kw='choose'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getChooseKeyword_2());
		}
	)
;

// Entry rule entryRuleFunctionParameters
entryRuleFunctionParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionParametersRule()); }
	iv_ruleFunctionParameters=ruleFunctionParameters
	{ $current=$iv_ruleFunctionParameters.current; }
	EOF;

// Rule FunctionParameters
ruleFunctionParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_1_0());
				}
				lv_variables_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
					}
					add(
						$current,
						"variables",
						lv_variables_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_2_1_0());
					}
					lv_variables_3_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
						}
						add(
							$current,
							"variables",
							lv_variables_3_0,
							"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFunctionCallParameters
entryRuleFunctionCallParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallParametersRule()); }
	iv_ruleFunctionCallParameters=ruleFunctionCallParameters
	{ $current=$iv_ruleFunctionCallParameters.current; }
	EOF;

// Rule FunctionCallParameters
ruleFunctionCallParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0());
				}
				lv_variables_1_0=ruleVariableCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionCallParametersRule());
					}
					add(
						$current,
						"variables",
						lv_variables_1_0,
						"fr.imta.clementdamien.dsl.selenium.MySelenium.VariableCall");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_2_1_0());
					}
					lv_variables_3_0=ruleVariableCall
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallParametersRule());
						}
						add(
							$current,
							"variables",
							lv_variables_3_0,
							"fr.imta.clementdamien.dsl.selenium.MySelenium.VariableCall");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleVariableCall
entryRuleVariableCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableCallRule()); }
	iv_ruleVariableCall=ruleVariableCall
	{ $current=$iv_ruleVariableCall.current; }
	EOF;

// Rule VariableCall
ruleVariableCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0());
				}
			)
		)
		    |
		this_STRING_1=RULE_STRING
		{
			newLeafNode(this_STRING_1, grammarAccess.getVariableCallAccess().getSTRINGTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleComment
entryRuleComment returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	iv_ruleComment=ruleComment
	{ $current=$iv_ruleComment.current.getText(); }
	EOF;

// Rule Comment
ruleComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='#'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getCommentAccess().getNumberSignKeyword_0());
			}
		)+
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getCommentAccess().getSTRINGTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
