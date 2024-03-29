/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.automatedresttesting.parser.antlr.internal.InternalAutomatedRestTestingParser;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;

public class AutomatedRestTestingParser extends AbstractAntlrParser {

	@Inject
	private AutomatedRestTestingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAutomatedRestTestingParser createParser(XtextTokenStream stream) {
		return new InternalAutomatedRestTestingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AutomatedRestTesting";
	}

	public AutomatedRestTestingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AutomatedRestTestingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
