/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.automatedresttesting.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;

@SuppressWarnings("all")
public class AutomatedRestTestingSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AutomatedRestTestingGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Parameter___QUESTION_MARKTerminalRuleCall_1_1_0_MONEYTerminalRuleCall_1_1_1___or___SLASHTerminalRuleCall_1_0_0_TWO_DOTSTerminalRuleCall_1_0_1__;
	protected AbstractElementAlias match_RestService___LeftSquareBracketKeyword_15_0_RightSquareBracketKeyword_15_1__q;
	protected AbstractElementAlias match_RestService___LeftSquareBracketKeyword_9_5_0_RightSquareBracketKeyword_9_5_1__q;
	protected AbstractElementAlias match_RestService___SLASHTerminalRuleCall_7_0_0_EStringParserRuleCall_7_0_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AutomatedRestTestingGrammarAccess) access;
		match_Parameter___QUESTION_MARKTerminalRuleCall_1_1_0_MONEYTerminalRuleCall_1_1_1___or___SLASHTerminalRuleCall_1_0_0_TWO_DOTSTerminalRuleCall_1_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getParameterAccess().getQUESTION_MARKTerminalRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getMONEYTerminalRuleCall_1_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getParameterAccess().getSLASHTerminalRuleCall_1_0_0()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getTWO_DOTSTerminalRuleCall_1_0_1())));
		match_RestService___LeftSquareBracketKeyword_15_0_RightSquareBracketKeyword_15_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_15_1()));
		match_RestService___LeftSquareBracketKeyword_9_5_0_RightSquareBracketKeyword_9_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_9_5_0()), new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_9_5_1()));
		match_RestService___SLASHTerminalRuleCall_7_0_0_EStringParserRuleCall_7_0_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getSLASHTerminalRuleCall_7_0_0()), new TokenAlias(false, false, grammarAccess.getRestServiceAccess().getEStringParserRuleCall_7_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getARROWRule())
			return getARROWToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEStringRule())
			return getEStringToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLEFT_BRACKETRule())
			return getLEFT_BRACKETToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLEFT_PARENTHESISRule())
			return getLEFT_PARENTHESISToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMONEYRule())
			return getMONEYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getQUESTION_MARKRule())
			return getQUESTION_MARKToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRIGHT_BRACKETRule())
			return getRIGHT_BRACKETToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRIGHT_PARENTHESISRule())
			return getRIGHT_PARENTHESISToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSLASHRule())
			return getSLASHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTWO_DOTSRule())
			return getTWO_DOTSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ARROW : "->";
	 */
	protected String getARROWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	/**
	 * terminal COMMA : ",";
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal EQUAL : "=";
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * EString returns ecore::EString:
	 * 	STRING | ID;
	 */
	protected String getEStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal LEFT_BRACKET : "{";
	 */
	protected String getLEFT_BRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LEFT_PARENTHESIS : "(";
	 */
	protected String getLEFT_PARENTHESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal MONEY : "$";
	 */
	protected String getMONEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	
	/**
	 * terminal QUESTION_MARK : "?";
	 */
	protected String getQUESTION_MARKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	
	/**
	 * terminal RIGHT_BRACKET : "}";
	 */
	protected String getRIGHT_BRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RIGHT_PARENTHESIS : ")";
	 */
	protected String getRIGHT_PARENTHESISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEMICOLON : ";";
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal SLASH : "/";
	 */
	protected String getSLASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	/**
	 * terminal TWO_DOTS : ":";
	 */
	protected String getTWO_DOTSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Parameter___QUESTION_MARKTerminalRuleCall_1_1_0_MONEYTerminalRuleCall_1_1_1___or___SLASHTerminalRuleCall_1_0_0_TWO_DOTSTerminalRuleCall_1_0_1__.equals(syntax))
				emit_Parameter___QUESTION_MARKTerminalRuleCall_1_1_0_MONEYTerminalRuleCall_1_1_1___or___SLASHTerminalRuleCall_1_0_0_TWO_DOTSTerminalRuleCall_1_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RestService___LeftSquareBracketKeyword_15_0_RightSquareBracketKeyword_15_1__q.equals(syntax))
				emit_RestService___LeftSquareBracketKeyword_15_0_RightSquareBracketKeyword_15_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RestService___LeftSquareBracketKeyword_9_5_0_RightSquareBracketKeyword_9_5_1__q.equals(syntax))
				emit_RestService___LeftSquareBracketKeyword_9_5_0_RightSquareBracketKeyword_9_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RestService___SLASHTerminalRuleCall_7_0_0_EStringParserRuleCall_7_0_1__a.equals(syntax))
				emit_RestService___SLASHTerminalRuleCall_7_0_0_EStringParserRuleCall_7_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (SLASH TWO_DOTS) | (QUESTION_MARK MONEY)
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) LEFT_BRACKET name=EString
	 */
	protected void emit_Parameter___QUESTION_MARKTerminalRuleCall_1_1_0_MONEYTerminalRuleCall_1_1_1___or___SLASHTerminalRuleCall_1_0_0_TWO_DOTSTerminalRuleCall_1_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     response=[Element|EString] (ambiguity) SEMICOLON RIGHT_BRACKET RIGHT_BRACKET (rule end)
	 */
	protected void emit_RestService___LeftSquareBracketKeyword_15_0_RightSquareBracketKeyword_15_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     request=[Element|EString] (ambiguity) SEMICOLON RIGHT_BRACKET 'Response' LEFT_BRACKET 'Type' EQUAL response=[Element|EString]
	 */
	protected void emit_RestService___LeftSquareBracketKeyword_9_5_0_RightSquareBracketKeyword_9_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (SLASH EString)*
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=Parameter (ambiguity) SEMICOLON 'Request' LEFT_BRACKET 'Type' EQUAL request=[Element|EString]
	 *     parameters+=Parameter (ambiguity) SEMICOLON 'Response' LEFT_BRACKET 'Type' EQUAL response=[Element|EString]
	 *     parameters+=Parameter (ambiguity) parameters+=Parameter
	 *     uri=SLASH EString (ambiguity) SEMICOLON 'Request' LEFT_BRACKET 'Type' EQUAL request=[Element|EString]
	 *     uri=SLASH EString (ambiguity) SEMICOLON 'Response' LEFT_BRACKET 'Type' EQUAL response=[Element|EString]
	 *     uri=SLASH EString (ambiguity) parameters+=Parameter
	 */
	protected void emit_RestService___SLASHTerminalRuleCall_7_0_0_EStringParserRuleCall_7_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
