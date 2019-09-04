package org.xtext.example.automatedresttesting.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutomatedRestTestingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_COMMA", "RULE_SLASH", "RULE_TWO_DOTS", "RULE_QUESTION_MARK", "RULE_MONEY", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'Minor'", "'MinorEqual'", "'Equal'", "'Different'", "'MajorEqual'", "'Major'", "'AND'", "'OR'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'", "'apiURL'", "'Test'", "'assertions'", "'description'", "'URL'", "'Response'", "'Type'", "'[]'", "'Request'", "'Assertion'", "'dataToTest'", "'condition'", "'Expression'", "'type'", "'expectedValue'", "'relationalOperator'", "'mockType'", "'Entity'", "'SimpleEntity'", "'PK'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_LEFT_PARENTHESIS=15;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=6;
    public static final int RULE_COMMA=10;
    public static final int RULE_SLASH=11;
    public static final int T__26=26;
    public static final int RULE_TWO_DOTS=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_MONEY=14;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=7;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=9;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_RIGHT_PARENTHESIS=16;
    public static final int RULE_WS=20;
    public static final int RULE_LEFT_BRACKET=8;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_QUESTION_MARK=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAutomatedRestTestingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAutomatedRestTestingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAutomatedRestTestingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAutomatedRestTesting.g"; }


    	private AutomatedRestTestingGrammarAccess grammarAccess;

    	public void setGrammarAccess(AutomatedRestTestingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAutomatedRestTesting"
    // InternalAutomatedRestTesting.g:53:1: entryRuleAutomatedRestTesting : ruleAutomatedRestTesting EOF ;
    public final void entryRuleAutomatedRestTesting() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:54:1: ( ruleAutomatedRestTesting EOF )
            // InternalAutomatedRestTesting.g:55:1: ruleAutomatedRestTesting EOF
            {
             before(grammarAccess.getAutomatedRestTestingRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomatedRestTesting();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutomatedRestTesting"


    // $ANTLR start "ruleAutomatedRestTesting"
    // InternalAutomatedRestTesting.g:62:1: ruleAutomatedRestTesting : ( ( rule__AutomatedRestTesting__Group__0 ) ) ;
    public final void ruleAutomatedRestTesting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:66:2: ( ( ( rule__AutomatedRestTesting__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:67:2: ( ( rule__AutomatedRestTesting__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:67:2: ( ( rule__AutomatedRestTesting__Group__0 ) )
            // InternalAutomatedRestTesting.g:68:3: ( rule__AutomatedRestTesting__Group__0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:69:3: ( rule__AutomatedRestTesting__Group__0 )
            // InternalAutomatedRestTesting.g:69:4: rule__AutomatedRestTesting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatedRestTestingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutomatedRestTesting"


    // $ANTLR start "entryRuleElement"
    // InternalAutomatedRestTesting.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:79:1: ( ruleElement EOF )
            // InternalAutomatedRestTesting.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalAutomatedRestTesting.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalAutomatedRestTesting.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:94:3: ( rule__Element__Alternatives )
            // InternalAutomatedRestTesting.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribute"
    // InternalAutomatedRestTesting.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:104:1: ( ruleAttribute EOF )
            // InternalAutomatedRestTesting.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalAutomatedRestTesting.g:112:1: ruleAttribute : ( ruleAttribute_Impl ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:116:2: ( ( ruleAttribute_Impl ) )
            // InternalAutomatedRestTesting.g:117:2: ( ruleAttribute_Impl )
            {
            // InternalAutomatedRestTesting.g:117:2: ( ruleAttribute_Impl )
            // InternalAutomatedRestTesting.g:118:3: ruleAttribute_Impl
            {
             before(grammarAccess.getAttributeAccess().getAttribute_ImplParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAttribute_Impl();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttribute_ImplParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEString"
    // InternalAutomatedRestTesting.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:129:1: ( ruleEString EOF )
            // InternalAutomatedRestTesting.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAutomatedRestTesting.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalAutomatedRestTesting.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:144:3: ( rule__EString__Alternatives )
            // InternalAutomatedRestTesting.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:153:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:154:1: ( ruleTest EOF )
            // InternalAutomatedRestTesting.g:155:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalAutomatedRestTesting.g:162:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:166:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:167:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:167:2: ( ( rule__Test__Group__0 ) )
            // InternalAutomatedRestTesting.g:168:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:169:3: ( rule__Test__Group__0 )
            // InternalAutomatedRestTesting.g:169:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleRestService"
    // InternalAutomatedRestTesting.g:178:1: entryRuleRestService : ruleRestService EOF ;
    public final void entryRuleRestService() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:179:1: ( ruleRestService EOF )
            // InternalAutomatedRestTesting.g:180:1: ruleRestService EOF
            {
             before(grammarAccess.getRestServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRestService();

            state._fsp--;

             after(grammarAccess.getRestServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestService"


    // $ANTLR start "ruleRestService"
    // InternalAutomatedRestTesting.g:187:1: ruleRestService : ( ( rule__RestService__Group__0 ) ) ;
    public final void ruleRestService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:191:2: ( ( ( rule__RestService__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__RestService__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__RestService__Group__0 ) )
            // InternalAutomatedRestTesting.g:193:3: ( rule__RestService__Group__0 )
            {
             before(grammarAccess.getRestServiceAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:194:3: ( rule__RestService__Group__0 )
            // InternalAutomatedRestTesting.g:194:4: rule__RestService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestService"


    // $ANTLR start "entryRuleAssertion"
    // InternalAutomatedRestTesting.g:203:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:204:1: ( ruleAssertion EOF )
            // InternalAutomatedRestTesting.g:205:1: ruleAssertion EOF
            {
             before(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getAssertionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalAutomatedRestTesting.g:212:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:216:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:217:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:217:2: ( ( rule__Assertion__Group__0 ) )
            // InternalAutomatedRestTesting.g:218:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:219:3: ( rule__Assertion__Group__0 )
            // InternalAutomatedRestTesting.g:219:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleExpression"
    // InternalAutomatedRestTesting.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:229:1: ( ruleExpression EOF )
            // InternalAutomatedRestTesting.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAutomatedRestTesting.g:237:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:241:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__Expression__Group__0 ) )
            // InternalAutomatedRestTesting.g:243:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:244:3: ( rule__Expression__Group__0 )
            // InternalAutomatedRestTesting.g:244:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:254:1: ( ruleParameter EOF )
            // InternalAutomatedRestTesting.g:255:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAutomatedRestTesting.g:262:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:266:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Parameter__Group__0 ) )
            // InternalAutomatedRestTesting.g:268:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:269:3: ( rule__Parameter__Group__0 )
            // InternalAutomatedRestTesting.g:269:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRestriction"
    // InternalAutomatedRestTesting.g:278:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:279:1: ( ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:280:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_1);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // InternalAutomatedRestTesting.g:287:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:291:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__Restriction__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__Restriction__Group__0 ) )
            // InternalAutomatedRestTesting.g:293:3: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:294:3: ( rule__Restriction__Group__0 )
            // InternalAutomatedRestTesting.g:294:4: rule__Restriction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleEntity"
    // InternalAutomatedRestTesting.g:303:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:304:1: ( ruleEntity EOF )
            // InternalAutomatedRestTesting.g:305:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAutomatedRestTesting.g:312:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:316:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__Entity__Group__0 ) )
            // InternalAutomatedRestTesting.g:318:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:319:3: ( rule__Entity__Group__0 )
            // InternalAutomatedRestTesting.g:319:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute_Impl"
    // InternalAutomatedRestTesting.g:328:1: entryRuleAttribute_Impl : ruleAttribute_Impl EOF ;
    public final void entryRuleAttribute_Impl() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:329:1: ( ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:330:1: ruleAttribute_Impl EOF
            {
             before(grammarAccess.getAttribute_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute_Impl();

            state._fsp--;

             after(grammarAccess.getAttribute_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute_Impl"


    // $ANTLR start "ruleAttribute_Impl"
    // InternalAutomatedRestTesting.g:337:1: ruleAttribute_Impl : ( ( rule__Attribute_Impl__Group__0 ) ) ;
    public final void ruleAttribute_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:341:2: ( ( ( rule__Attribute_Impl__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__Attribute_Impl__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__Attribute_Impl__Group__0 ) )
            // InternalAutomatedRestTesting.g:343:3: ( rule__Attribute_Impl__Group__0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:344:3: ( rule__Attribute_Impl__Group__0 )
            // InternalAutomatedRestTesting.g:344:4: rule__Attribute_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttribute_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute_Impl"


    // $ANTLR start "entryRuleDomainAttribute"
    // InternalAutomatedRestTesting.g:353:1: entryRuleDomainAttribute : ruleDomainAttribute EOF ;
    public final void entryRuleDomainAttribute() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:354:1: ( ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:355:1: ruleDomainAttribute EOF
            {
             before(grammarAccess.getDomainAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainAttribute();

            state._fsp--;

             after(grammarAccess.getDomainAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainAttribute"


    // $ANTLR start "ruleDomainAttribute"
    // InternalAutomatedRestTesting.g:362:1: ruleDomainAttribute : ( ( rule__DomainAttribute__Group__0 ) ) ;
    public final void ruleDomainAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:366:2: ( ( ( rule__DomainAttribute__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__DomainAttribute__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__DomainAttribute__Group__0 ) )
            // InternalAutomatedRestTesting.g:368:3: ( rule__DomainAttribute__Group__0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:369:3: ( rule__DomainAttribute__Group__0 )
            // InternalAutomatedRestTesting.g:369:4: rule__DomainAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainAttribute"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalAutomatedRestTesting.g:378:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:379:1: ( ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:380:1: ruleSimpleEntity EOF
            {
             before(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleEntity();

            state._fsp--;

             after(grammarAccess.getSimpleEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalAutomatedRestTesting.g:387:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:391:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalAutomatedRestTesting.g:393:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:394:3: ( rule__SimpleEntity__Group__0 )
            // InternalAutomatedRestTesting.g:394:4: rule__SimpleEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "ruleAttributeType"
    // InternalAutomatedRestTesting.g:403:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:407:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:408:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:408:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalAutomatedRestTesting.g:409:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:410:3: ( rule__AttributeType__Alternatives )
            // InternalAutomatedRestTesting.g:410:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleRelationalOperator"
    // InternalAutomatedRestTesting.g:419:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:423:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:424:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:424:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalAutomatedRestTesting.g:425:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:426:3: ( rule__RelationalOperator__Alternatives )
            // InternalAutomatedRestTesting.g:426:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleMethodType"
    // InternalAutomatedRestTesting.g:435:1: ruleMethodType : ( ( rule__MethodType__Alternatives ) ) ;
    public final void ruleMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:439:1: ( ( ( rule__MethodType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:440:2: ( ( rule__MethodType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:440:2: ( ( rule__MethodType__Alternatives ) )
            // InternalAutomatedRestTesting.g:441:3: ( rule__MethodType__Alternatives )
            {
             before(grammarAccess.getMethodTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:442:3: ( rule__MethodType__Alternatives )
            // InternalAutomatedRestTesting.g:442:4: rule__MethodType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MethodType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodType"


    // $ANTLR start "ruleMockTypes"
    // InternalAutomatedRestTesting.g:451:1: ruleMockTypes : ( ( rule__MockTypes__Alternatives ) ) ;
    public final void ruleMockTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:455:1: ( ( ( rule__MockTypes__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:456:2: ( ( rule__MockTypes__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:456:2: ( ( rule__MockTypes__Alternatives ) )
            // InternalAutomatedRestTesting.g:457:3: ( rule__MockTypes__Alternatives )
            {
             before(grammarAccess.getMockTypesAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:458:3: ( rule__MockTypes__Alternatives )
            // InternalAutomatedRestTesting.g:458:4: rule__MockTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MockTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMockTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockTypes"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalAutomatedRestTesting.g:466:1: rule__Element__Alternatives : ( ( ruleEntity ) | ( ruleSimpleEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:470:1: ( ( ruleEntity ) | ( ruleSimpleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==69) ) {
                alt1=1;
            }
            else if ( (LA1_0==70) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAutomatedRestTesting.g:471:2: ( ruleEntity )
                    {
                    // InternalAutomatedRestTesting.g:471:2: ( ruleEntity )
                    // InternalAutomatedRestTesting.g:472:3: ruleEntity
                    {
                     before(grammarAccess.getElementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:477:2: ( ruleSimpleEntity )
                    {
                    // InternalAutomatedRestTesting.g:477:2: ( ruleSimpleEntity )
                    // InternalAutomatedRestTesting.g:478:3: ruleSimpleEntity
                    {
                     before(grammarAccess.getElementAccess().getSimpleEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSimpleEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAutomatedRestTesting.g:487:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:491:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAutomatedRestTesting.g:492:2: ( RULE_STRING )
                    {
                    // InternalAutomatedRestTesting.g:492:2: ( RULE_STRING )
                    // InternalAutomatedRestTesting.g:493:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:498:2: ( RULE_ID )
                    {
                    // InternalAutomatedRestTesting.g:498:2: ( RULE_ID )
                    // InternalAutomatedRestTesting.g:499:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RestService__Alternatives_7"
    // InternalAutomatedRestTesting.g:508:1: rule__RestService__Alternatives_7 : ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) );
    public final void rule__RestService__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:512:1: ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SLASH) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_STRING && LA3_1<=RULE_ID)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_TWO_DOTS) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_QUESTION_MARK) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutomatedRestTesting.g:513:2: ( ( rule__RestService__Group_7_0__0 ) )
                    {
                    // InternalAutomatedRestTesting.g:513:2: ( ( rule__RestService__Group_7_0__0 ) )
                    // InternalAutomatedRestTesting.g:514:3: ( rule__RestService__Group_7_0__0 )
                    {
                     before(grammarAccess.getRestServiceAccess().getGroup_7_0()); 
                    // InternalAutomatedRestTesting.g:515:3: ( rule__RestService__Group_7_0__0 )
                    // InternalAutomatedRestTesting.g:515:4: rule__RestService__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestServiceAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:519:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    {
                    // InternalAutomatedRestTesting.g:519:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    // InternalAutomatedRestTesting.g:520:3: ( rule__RestService__ParametersAssignment_7_1 )
                    {
                     before(grammarAccess.getRestServiceAccess().getParametersAssignment_7_1()); 
                    // InternalAutomatedRestTesting.g:521:3: ( rule__RestService__ParametersAssignment_7_1 )
                    // InternalAutomatedRestTesting.g:521:4: rule__RestService__ParametersAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__ParametersAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestServiceAccess().getParametersAssignment_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Alternatives_7"


    // $ANTLR start "rule__Parameter__Alternatives_1"
    // InternalAutomatedRestTesting.g:529:1: rule__Parameter__Alternatives_1 : ( ( ( rule__Parameter__Group_1_0__0 ) ) | ( ( rule__Parameter__Group_1_1__0 ) ) );
    public final void rule__Parameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:533:1: ( ( ( rule__Parameter__Group_1_0__0 ) ) | ( ( rule__Parameter__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SLASH) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_QUESTION_MARK) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAutomatedRestTesting.g:534:2: ( ( rule__Parameter__Group_1_0__0 ) )
                    {
                    // InternalAutomatedRestTesting.g:534:2: ( ( rule__Parameter__Group_1_0__0 ) )
                    // InternalAutomatedRestTesting.g:535:3: ( rule__Parameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_1_0()); 
                    // InternalAutomatedRestTesting.g:536:3: ( rule__Parameter__Group_1_0__0 )
                    // InternalAutomatedRestTesting.g:536:4: rule__Parameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:540:2: ( ( rule__Parameter__Group_1_1__0 ) )
                    {
                    // InternalAutomatedRestTesting.g:540:2: ( ( rule__Parameter__Group_1_1__0 ) )
                    // InternalAutomatedRestTesting.g:541:3: ( rule__Parameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_1_1()); 
                    // InternalAutomatedRestTesting.g:542:3: ( rule__Parameter__Group_1_1__0 )
                    // InternalAutomatedRestTesting.g:542:4: rule__Parameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives_1"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalAutomatedRestTesting.g:550:1: rule__AttributeType__Alternatives : ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:554:1: ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAutomatedRestTesting.g:555:2: ( ( 'string' ) )
                    {
                    // InternalAutomatedRestTesting.g:555:2: ( ( 'string' ) )
                    // InternalAutomatedRestTesting.g:556:3: ( 'string' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:557:3: ( 'string' )
                    // InternalAutomatedRestTesting.g:557:4: 'string'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:561:2: ( ( 'boolean' ) )
                    {
                    // InternalAutomatedRestTesting.g:561:2: ( ( 'boolean' ) )
                    // InternalAutomatedRestTesting.g:562:3: ( 'boolean' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:563:3: ( 'boolean' )
                    // InternalAutomatedRestTesting.g:563:4: 'boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:567:2: ( ( 'integer' ) )
                    {
                    // InternalAutomatedRestTesting.g:567:2: ( ( 'integer' ) )
                    // InternalAutomatedRestTesting.g:568:3: ( 'integer' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:569:3: ( 'integer' )
                    // InternalAutomatedRestTesting.g:569:4: 'integer'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:573:2: ( ( 'double' ) )
                    {
                    // InternalAutomatedRestTesting.g:573:2: ( ( 'double' ) )
                    // InternalAutomatedRestTesting.g:574:3: ( 'double' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:575:3: ( 'double' )
                    // InternalAutomatedRestTesting.g:575:4: 'double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:579:2: ( ( 'date' ) )
                    {
                    // InternalAutomatedRestTesting.g:579:2: ( ( 'date' ) )
                    // InternalAutomatedRestTesting.g:580:3: ( 'date' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:581:3: ( 'date' )
                    // InternalAutomatedRestTesting.g:581:4: 'date'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalAutomatedRestTesting.g:589:1: rule__RelationalOperator__Alternatives : ( ( ( 'Minor' ) ) | ( ( 'MinorEqual' ) ) | ( ( 'Equal' ) ) | ( ( 'Different' ) ) | ( ( 'MajorEqual' ) ) | ( ( 'Major' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:593:1: ( ( ( 'Minor' ) ) | ( ( 'MinorEqual' ) ) | ( ( 'Equal' ) ) | ( ( 'Different' ) ) | ( ( 'MajorEqual' ) ) | ( ( 'Major' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 34:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAutomatedRestTesting.g:594:2: ( ( 'Minor' ) )
                    {
                    // InternalAutomatedRestTesting.g:594:2: ( ( 'Minor' ) )
                    // InternalAutomatedRestTesting.g:595:3: ( 'Minor' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:596:3: ( 'Minor' )
                    // InternalAutomatedRestTesting.g:596:4: 'Minor'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:600:2: ( ( 'MinorEqual' ) )
                    {
                    // InternalAutomatedRestTesting.g:600:2: ( ( 'MinorEqual' ) )
                    // InternalAutomatedRestTesting.g:601:3: ( 'MinorEqual' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:602:3: ( 'MinorEqual' )
                    // InternalAutomatedRestTesting.g:602:4: 'MinorEqual'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:606:2: ( ( 'Equal' ) )
                    {
                    // InternalAutomatedRestTesting.g:606:2: ( ( 'Equal' ) )
                    // InternalAutomatedRestTesting.g:607:3: ( 'Equal' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:608:3: ( 'Equal' )
                    // InternalAutomatedRestTesting.g:608:4: 'Equal'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:612:2: ( ( 'Different' ) )
                    {
                    // InternalAutomatedRestTesting.g:612:2: ( ( 'Different' ) )
                    // InternalAutomatedRestTesting.g:613:3: ( 'Different' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:614:3: ( 'Different' )
                    // InternalAutomatedRestTesting.g:614:4: 'Different'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:618:2: ( ( 'MajorEqual' ) )
                    {
                    // InternalAutomatedRestTesting.g:618:2: ( ( 'MajorEqual' ) )
                    // InternalAutomatedRestTesting.g:619:3: ( 'MajorEqual' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:620:3: ( 'MajorEqual' )
                    // InternalAutomatedRestTesting.g:620:4: 'MajorEqual'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:624:2: ( ( 'Major' ) )
                    {
                    // InternalAutomatedRestTesting.g:624:2: ( ( 'Major' ) )
                    // InternalAutomatedRestTesting.g:625:3: ( 'Major' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:626:3: ( 'Major' )
                    // InternalAutomatedRestTesting.g:626:4: 'Major'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:630:2: ( ( 'AND' ) )
                    {
                    // InternalAutomatedRestTesting.g:630:2: ( ( 'AND' ) )
                    // InternalAutomatedRestTesting.g:631:3: ( 'AND' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:632:3: ( 'AND' )
                    // InternalAutomatedRestTesting.g:632:4: 'AND'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:636:2: ( ( 'OR' ) )
                    {
                    // InternalAutomatedRestTesting.g:636:2: ( ( 'OR' ) )
                    // InternalAutomatedRestTesting.g:637:3: ( 'OR' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:638:3: ( 'OR' )
                    // InternalAutomatedRestTesting.g:638:4: 'OR'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__MethodType__Alternatives"
    // InternalAutomatedRestTesting.g:646:1: rule__MethodType__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__MethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:650:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAutomatedRestTesting.g:651:2: ( ( 'GET' ) )
                    {
                    // InternalAutomatedRestTesting.g:651:2: ( ( 'GET' ) )
                    // InternalAutomatedRestTesting.g:652:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:653:3: ( 'GET' )
                    // InternalAutomatedRestTesting.g:653:4: 'GET'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:657:2: ( ( 'POST' ) )
                    {
                    // InternalAutomatedRestTesting.g:657:2: ( ( 'POST' ) )
                    // InternalAutomatedRestTesting.g:658:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:659:3: ( 'POST' )
                    // InternalAutomatedRestTesting.g:659:4: 'POST'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:663:2: ( ( 'PUT' ) )
                    {
                    // InternalAutomatedRestTesting.g:663:2: ( ( 'PUT' ) )
                    // InternalAutomatedRestTesting.g:664:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:665:3: ( 'PUT' )
                    // InternalAutomatedRestTesting.g:665:4: 'PUT'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:669:2: ( ( 'DELETE' ) )
                    {
                    // InternalAutomatedRestTesting.g:669:2: ( ( 'DELETE' ) )
                    // InternalAutomatedRestTesting.g:670:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:671:3: ( 'DELETE' )
                    // InternalAutomatedRestTesting.g:671:4: 'DELETE'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodType__Alternatives"


    // $ANTLR start "rule__MockTypes__Alternatives"
    // InternalAutomatedRestTesting.g:679:1: rule__MockTypes__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) );
    public final void rule__MockTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:683:1: ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 45:
                {
                alt8=7;
                }
                break;
            case 46:
                {
                alt8=8;
                }
                break;
            case 47:
                {
                alt8=9;
                }
                break;
            case 48:
                {
                alt8=10;
                }
                break;
            case 49:
                {
                alt8=11;
                }
                break;
            case 50:
                {
                alt8=12;
                }
                break;
            case 51:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAutomatedRestTesting.g:684:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:684:2: ( ( 'FirstNameType' ) )
                    // InternalAutomatedRestTesting.g:685:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:686:3: ( 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:686:4: 'FirstNameType'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:690:2: ( ( 'FirstNameMaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:690:2: ( ( 'FirstNameMaleType' ) )
                    // InternalAutomatedRestTesting.g:691:3: ( 'FirstNameMaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:692:3: ( 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:692:4: 'FirstNameMaleType'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:696:2: ( ( 'FirstNameFemaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:696:2: ( ( 'FirstNameFemaleType' ) )
                    // InternalAutomatedRestTesting.g:697:3: ( 'FirstNameFemaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:698:3: ( 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:698:4: 'FirstNameFemaleType'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:702:2: ( ( 'LastNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:702:2: ( ( 'LastNameType' ) )
                    // InternalAutomatedRestTesting.g:703:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:704:3: ( 'LastNameType' )
                    // InternalAutomatedRestTesting.g:704:4: 'LastNameType'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:708:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:708:2: ( ( 'FamilyNameType' ) )
                    // InternalAutomatedRestTesting.g:709:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:710:3: ( 'FamilyNameType' )
                    // InternalAutomatedRestTesting.g:710:4: 'FamilyNameType'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:714:2: ( ( 'FullNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:714:2: ( ( 'FullNameType' ) )
                    // InternalAutomatedRestTesting.g:715:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:716:3: ( 'FullNameType' )
                    // InternalAutomatedRestTesting.g:716:4: 'FullNameType'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:720:2: ( ( 'GenderType' ) )
                    {
                    // InternalAutomatedRestTesting.g:720:2: ( ( 'GenderType' ) )
                    // InternalAutomatedRestTesting.g:721:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:722:3: ( 'GenderType' )
                    // InternalAutomatedRestTesting.g:722:4: 'GenderType'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:726:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalAutomatedRestTesting.g:726:2: ( ( 'EmailAddressType' ) )
                    // InternalAutomatedRestTesting.g:727:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:728:3: ( 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:728:4: 'EmailAddressType'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:732:2: ( ( 'PhoneType' ) )
                    {
                    // InternalAutomatedRestTesting.g:732:2: ( ( 'PhoneType' ) )
                    // InternalAutomatedRestTesting.g:733:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 
                    // InternalAutomatedRestTesting.g:734:3: ( 'PhoneType' )
                    // InternalAutomatedRestTesting.g:734:4: 'PhoneType'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:738:2: ( ( 'CountryType' ) )
                    {
                    // InternalAutomatedRestTesting.g:738:2: ( ( 'CountryType' ) )
                    // InternalAutomatedRestTesting.g:739:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 
                    // InternalAutomatedRestTesting.g:740:3: ( 'CountryType' )
                    // InternalAutomatedRestTesting.g:740:4: 'CountryType'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:744:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalAutomatedRestTesting.g:744:2: ( ( 'CountryCodeType' ) )
                    // InternalAutomatedRestTesting.g:745:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 
                    // InternalAutomatedRestTesting.g:746:3: ( 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:746:4: 'CountryCodeType'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:750:2: ( ( 'CityType' ) )
                    {
                    // InternalAutomatedRestTesting.g:750:2: ( ( 'CityType' ) )
                    // InternalAutomatedRestTesting.g:751:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 
                    // InternalAutomatedRestTesting.g:752:3: ( 'CityType' )
                    // InternalAutomatedRestTesting.g:752:4: 'CityType'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:756:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalAutomatedRestTesting.g:756:2: ( ( 'RowNumberType' ) )
                    // InternalAutomatedRestTesting.g:757:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalAutomatedRestTesting.g:758:3: ( 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:758:4: 'RowNumberType'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockTypes__Alternatives"


    // $ANTLR start "rule__AutomatedRestTesting__Group__0"
    // InternalAutomatedRestTesting.g:766:1: rule__AutomatedRestTesting__Group__0 : rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 ;
    public final void rule__AutomatedRestTesting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:770:1: ( rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 )
            // InternalAutomatedRestTesting.g:771:2: rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AutomatedRestTesting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__0"


    // $ANTLR start "rule__AutomatedRestTesting__Group__0__Impl"
    // InternalAutomatedRestTesting.g:778:1: rule__AutomatedRestTesting__Group__0__Impl : ( () ) ;
    public final void rule__AutomatedRestTesting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:782:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:783:1: ( () )
            {
            // InternalAutomatedRestTesting.g:783:1: ( () )
            // InternalAutomatedRestTesting.g:784:2: ()
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0()); 
            // InternalAutomatedRestTesting.g:785:2: ()
            // InternalAutomatedRestTesting.g:785:3: 
            {
            }

             after(grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__0__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__1"
    // InternalAutomatedRestTesting.g:793:1: rule__AutomatedRestTesting__Group__1 : rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 ;
    public final void rule__AutomatedRestTesting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:797:1: ( rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 )
            // InternalAutomatedRestTesting.g:798:2: rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutomatedRestTesting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__1"


    // $ANTLR start "rule__AutomatedRestTesting__Group__1__Impl"
    // InternalAutomatedRestTesting.g:805:1: rule__AutomatedRestTesting__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__AutomatedRestTesting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:809:1: ( ( 'apiURL' ) )
            // InternalAutomatedRestTesting.g:810:1: ( 'apiURL' )
            {
            // InternalAutomatedRestTesting.g:810:1: ( 'apiURL' )
            // InternalAutomatedRestTesting.g:811:2: 'apiURL'
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__1__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__2"
    // InternalAutomatedRestTesting.g:820:1: rule__AutomatedRestTesting__Group__2 : rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 ;
    public final void rule__AutomatedRestTesting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:824:1: ( rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 )
            // InternalAutomatedRestTesting.g:825:2: rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AutomatedRestTesting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__2"


    // $ANTLR start "rule__AutomatedRestTesting__Group__2__Impl"
    // InternalAutomatedRestTesting.g:832:1: rule__AutomatedRestTesting__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__AutomatedRestTesting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:836:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:837:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:837:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:838:2: RULE_EQUAL
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAutomatedRestTestingAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__2__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__3"
    // InternalAutomatedRestTesting.g:847:1: rule__AutomatedRestTesting__Group__3 : rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 ;
    public final void rule__AutomatedRestTesting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:851:1: ( rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 )
            // InternalAutomatedRestTesting.g:852:2: rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AutomatedRestTesting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__3"


    // $ANTLR start "rule__AutomatedRestTesting__Group__3__Impl"
    // InternalAutomatedRestTesting.g:859:1: rule__AutomatedRestTesting__Group__3__Impl : ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) ;
    public final void rule__AutomatedRestTesting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:863:1: ( ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:864:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:864:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            // InternalAutomatedRestTesting.g:865:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getUrlAssignment_3()); 
            // InternalAutomatedRestTesting.g:866:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            // InternalAutomatedRestTesting.g:866:3: rule__AutomatedRestTesting__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAutomatedRestTestingAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__3__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__4"
    // InternalAutomatedRestTesting.g:874:1: rule__AutomatedRestTesting__Group__4 : rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 ;
    public final void rule__AutomatedRestTesting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:878:1: ( rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 )
            // InternalAutomatedRestTesting.g:879:2: rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AutomatedRestTesting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__4"


    // $ANTLR start "rule__AutomatedRestTesting__Group__4__Impl"
    // InternalAutomatedRestTesting.g:886:1: rule__AutomatedRestTesting__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AutomatedRestTesting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:890:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:891:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:891:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:892:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAutomatedRestTestingAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__4__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__5"
    // InternalAutomatedRestTesting.g:901:1: rule__AutomatedRestTesting__Group__5 : rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 ;
    public final void rule__AutomatedRestTesting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:905:1: ( rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 )
            // InternalAutomatedRestTesting.g:906:2: rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AutomatedRestTesting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__5"


    // $ANTLR start "rule__AutomatedRestTesting__Group__5__Impl"
    // InternalAutomatedRestTesting.g:913:1: rule__AutomatedRestTesting__Group__5__Impl : ( ( rule__AutomatedRestTesting__Group_5__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:917:1: ( ( ( rule__AutomatedRestTesting__Group_5__0 )? ) )
            // InternalAutomatedRestTesting.g:918:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:918:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            // InternalAutomatedRestTesting.g:919:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_5()); 
            // InternalAutomatedRestTesting.g:920:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=69 && LA9_0<=70)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAutomatedRestTesting.g:920:3: rule__AutomatedRestTesting__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutomatedRestTesting__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedRestTestingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__5__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__6"
    // InternalAutomatedRestTesting.g:928:1: rule__AutomatedRestTesting__Group__6 : rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 ;
    public final void rule__AutomatedRestTesting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:932:1: ( rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 )
            // InternalAutomatedRestTesting.g:933:2: rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AutomatedRestTesting__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__6"


    // $ANTLR start "rule__AutomatedRestTesting__Group__6__Impl"
    // InternalAutomatedRestTesting.g:940:1: rule__AutomatedRestTesting__Group__6__Impl : ( ( rule__AutomatedRestTesting__Group_6__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:944:1: ( ( ( rule__AutomatedRestTesting__Group_6__0 )? ) )
            // InternalAutomatedRestTesting.g:945:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            {
            // InternalAutomatedRestTesting.g:945:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            // InternalAutomatedRestTesting.g:946:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:947:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=35 && LA10_0<=38)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAutomatedRestTesting.g:947:3: rule__AutomatedRestTesting__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutomatedRestTesting__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedRestTestingAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__6__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group__7"
    // InternalAutomatedRestTesting.g:955:1: rule__AutomatedRestTesting__Group__7 : rule__AutomatedRestTesting__Group__7__Impl ;
    public final void rule__AutomatedRestTesting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:959:1: ( rule__AutomatedRestTesting__Group__7__Impl )
            // InternalAutomatedRestTesting.g:960:2: rule__AutomatedRestTesting__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__7"


    // $ANTLR start "rule__AutomatedRestTesting__Group__7__Impl"
    // InternalAutomatedRestTesting.g:966:1: rule__AutomatedRestTesting__Group__7__Impl : ( ( rule__AutomatedRestTesting__Group_7__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:970:1: ( ( ( rule__AutomatedRestTesting__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:971:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:971:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:972:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:973:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAutomatedRestTesting.g:973:3: rule__AutomatedRestTesting__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutomatedRestTesting__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedRestTestingAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group__7__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_5__0"
    // InternalAutomatedRestTesting.g:982:1: rule__AutomatedRestTesting__Group_5__0 : rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 ;
    public final void rule__AutomatedRestTesting__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:986:1: ( rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 )
            // InternalAutomatedRestTesting.g:987:2: rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__AutomatedRestTesting__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_5__0"


    // $ANTLR start "rule__AutomatedRestTesting__Group_5__0__Impl"
    // InternalAutomatedRestTesting.g:994:1: rule__AutomatedRestTesting__Group_5__0__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:998:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) )
            // InternalAutomatedRestTesting.g:999:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            {
            // InternalAutomatedRestTesting.g:999:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            // InternalAutomatedRestTesting.g:1000:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_0()); 
            // InternalAutomatedRestTesting.g:1001:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            // InternalAutomatedRestTesting.g:1001:3: rule__AutomatedRestTesting__DataElementsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__DataElementsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_5__0__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_5__1"
    // InternalAutomatedRestTesting.g:1009:1: rule__AutomatedRestTesting__Group_5__1 : rule__AutomatedRestTesting__Group_5__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1013:1: ( rule__AutomatedRestTesting__Group_5__1__Impl )
            // InternalAutomatedRestTesting.g:1014:2: rule__AutomatedRestTesting__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_5__1"


    // $ANTLR start "rule__AutomatedRestTesting__Group_5__1__Impl"
    // InternalAutomatedRestTesting.g:1020:1: rule__AutomatedRestTesting__Group_5__1__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1024:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) )
            // InternalAutomatedRestTesting.g:1025:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            {
            // InternalAutomatedRestTesting.g:1025:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            // InternalAutomatedRestTesting.g:1026:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_1()); 
            // InternalAutomatedRestTesting.g:1027:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=69 && LA12_0<=70)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1027:3: rule__AutomatedRestTesting__DataElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AutomatedRestTesting__DataElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_5__1__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_6__0"
    // InternalAutomatedRestTesting.g:1036:1: rule__AutomatedRestTesting__Group_6__0 : rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 ;
    public final void rule__AutomatedRestTesting__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1040:1: ( rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 )
            // InternalAutomatedRestTesting.g:1041:2: rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__AutomatedRestTesting__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_6__0"


    // $ANTLR start "rule__AutomatedRestTesting__Group_6__0__Impl"
    // InternalAutomatedRestTesting.g:1048:1: rule__AutomatedRestTesting__Group_6__0__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1052:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:1053:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:1053:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:1054:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:1055:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:1055:3: rule__AutomatedRestTesting__ServicesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__ServicesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_6__0__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_6__1"
    // InternalAutomatedRestTesting.g:1063:1: rule__AutomatedRestTesting__Group_6__1 : rule__AutomatedRestTesting__Group_6__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1067:1: ( rule__AutomatedRestTesting__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:1068:2: rule__AutomatedRestTesting__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_6__1"


    // $ANTLR start "rule__AutomatedRestTesting__Group_6__1__Impl"
    // InternalAutomatedRestTesting.g:1074:1: rule__AutomatedRestTesting__Group_6__1__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1078:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) )
            // InternalAutomatedRestTesting.g:1079:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            {
            // InternalAutomatedRestTesting.g:1079:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            // InternalAutomatedRestTesting.g:1080:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_1()); 
            // InternalAutomatedRestTesting.g:1081:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=35 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1081:3: rule__AutomatedRestTesting__ServicesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AutomatedRestTesting__ServicesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_6__1__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_7__0"
    // InternalAutomatedRestTesting.g:1090:1: rule__AutomatedRestTesting__Group_7__0 : rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 ;
    public final void rule__AutomatedRestTesting__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1094:1: ( rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 )
            // InternalAutomatedRestTesting.g:1095:2: rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__AutomatedRestTesting__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_7__0"


    // $ANTLR start "rule__AutomatedRestTesting__Group_7__0__Impl"
    // InternalAutomatedRestTesting.g:1102:1: rule__AutomatedRestTesting__Group_7__0__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1106:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) )
            // InternalAutomatedRestTesting.g:1107:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            {
            // InternalAutomatedRestTesting.g:1107:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            // InternalAutomatedRestTesting.g:1108:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_0()); 
            // InternalAutomatedRestTesting.g:1109:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            // InternalAutomatedRestTesting.g:1109:3: rule__AutomatedRestTesting__TestsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__TestsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_7__0__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__Group_7__1"
    // InternalAutomatedRestTesting.g:1117:1: rule__AutomatedRestTesting__Group_7__1 : rule__AutomatedRestTesting__Group_7__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1121:1: ( rule__AutomatedRestTesting__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:1122:2: rule__AutomatedRestTesting__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomatedRestTesting__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_7__1"


    // $ANTLR start "rule__AutomatedRestTesting__Group_7__1__Impl"
    // InternalAutomatedRestTesting.g:1128:1: rule__AutomatedRestTesting__Group_7__1__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1132:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) )
            // InternalAutomatedRestTesting.g:1133:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            {
            // InternalAutomatedRestTesting.g:1133:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            // InternalAutomatedRestTesting.g:1134:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_1()); 
            // InternalAutomatedRestTesting.g:1135:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==53) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1135:3: rule__AutomatedRestTesting__TestsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AutomatedRestTesting__TestsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__Group_7__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalAutomatedRestTesting.g:1144:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1148:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAutomatedRestTesting.g:1149:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalAutomatedRestTesting.g:1156:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1160:1: ( ( 'Test' ) )
            // InternalAutomatedRestTesting.g:1161:1: ( 'Test' )
            {
            // InternalAutomatedRestTesting.g:1161:1: ( 'Test' )
            // InternalAutomatedRestTesting.g:1162:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalAutomatedRestTesting.g:1171:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1175:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAutomatedRestTesting.g:1176:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalAutomatedRestTesting.g:1183:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1187:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1188:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1188:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1189:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1190:2: ( rule__Test__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1190:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalAutomatedRestTesting.g:1198:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1202:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAutomatedRestTesting.g:1203:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalAutomatedRestTesting.g:1210:1: rule__Test__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1214:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1215:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1215:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1216:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalAutomatedRestTesting.g:1225:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1229:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAutomatedRestTesting.g:1230:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalAutomatedRestTesting.g:1237:1: rule__Test__Group__3__Impl : ( ( rule__Test__Group_3__0 )? ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1241:1: ( ( ( rule__Test__Group_3__0 )? ) )
            // InternalAutomatedRestTesting.g:1242:1: ( ( rule__Test__Group_3__0 )? )
            {
            // InternalAutomatedRestTesting.g:1242:1: ( ( rule__Test__Group_3__0 )? )
            // InternalAutomatedRestTesting.g:1243:2: ( rule__Test__Group_3__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_3()); 
            // InternalAutomatedRestTesting.g:1244:2: ( rule__Test__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1244:3: rule__Test__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalAutomatedRestTesting.g:1252:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1256:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAutomatedRestTesting.g:1257:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalAutomatedRestTesting.g:1264:1: rule__Test__Group__4__Impl : ( 'assertions' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1268:1: ( ( 'assertions' ) )
            // InternalAutomatedRestTesting.g:1269:1: ( 'assertions' )
            {
            // InternalAutomatedRestTesting.g:1269:1: ( 'assertions' )
            // InternalAutomatedRestTesting.g:1270:2: 'assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalAutomatedRestTesting.g:1279:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1283:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAutomatedRestTesting.g:1284:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalAutomatedRestTesting.g:1291:1: rule__Test__Group__5__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1295:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1296:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1296:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1297:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_5()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalAutomatedRestTesting.g:1306:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1310:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAutomatedRestTesting.g:1311:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalAutomatedRestTesting.g:1318:1: rule__Test__Group__6__Impl : ( ( rule__Test__AssertionsAssignment_6 ) ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1322:1: ( ( ( rule__Test__AssertionsAssignment_6 ) ) )
            // InternalAutomatedRestTesting.g:1323:1: ( ( rule__Test__AssertionsAssignment_6 ) )
            {
            // InternalAutomatedRestTesting.g:1323:1: ( ( rule__Test__AssertionsAssignment_6 ) )
            // InternalAutomatedRestTesting.g:1324:2: ( rule__Test__AssertionsAssignment_6 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_6()); 
            // InternalAutomatedRestTesting.g:1325:2: ( rule__Test__AssertionsAssignment_6 )
            // InternalAutomatedRestTesting.g:1325:3: rule__Test__AssertionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Test__AssertionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAssertionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalAutomatedRestTesting.g:1333:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1337:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAutomatedRestTesting.g:1338:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalAutomatedRestTesting.g:1345:1: rule__Test__Group__7__Impl : ( ( rule__Test__Group_7__0 )* ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1349:1: ( ( ( rule__Test__Group_7__0 )* ) )
            // InternalAutomatedRestTesting.g:1350:1: ( ( rule__Test__Group_7__0 )* )
            {
            // InternalAutomatedRestTesting.g:1350:1: ( ( rule__Test__Group_7__0 )* )
            // InternalAutomatedRestTesting.g:1351:2: ( rule__Test__Group_7__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1352:2: ( rule__Test__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1352:3: rule__Test__Group_7__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Test__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalAutomatedRestTesting.g:1360:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1364:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAutomatedRestTesting.g:1365:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalAutomatedRestTesting.g:1372:1: rule__Test__Group__8__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1376:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1377:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1377:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1378:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_8()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalAutomatedRestTesting.g:1387:1: rule__Test__Group__9 : rule__Test__Group__9__Impl ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1391:1: ( rule__Test__Group__9__Impl )
            // InternalAutomatedRestTesting.g:1392:2: rule__Test__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalAutomatedRestTesting.g:1398:1: rule__Test__Group__9__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1402:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1403:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1403:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1404:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_9()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group_3__0"
    // InternalAutomatedRestTesting.g:1414:1: rule__Test__Group_3__0 : rule__Test__Group_3__0__Impl rule__Test__Group_3__1 ;
    public final void rule__Test__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1418:1: ( rule__Test__Group_3__0__Impl rule__Test__Group_3__1 )
            // InternalAutomatedRestTesting.g:1419:2: rule__Test__Group_3__0__Impl rule__Test__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__0"


    // $ANTLR start "rule__Test__Group_3__0__Impl"
    // InternalAutomatedRestTesting.g:1426:1: rule__Test__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1430:1: ( ( 'description' ) )
            // InternalAutomatedRestTesting.g:1431:1: ( 'description' )
            {
            // InternalAutomatedRestTesting.g:1431:1: ( 'description' )
            // InternalAutomatedRestTesting.g:1432:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__0__Impl"


    // $ANTLR start "rule__Test__Group_3__1"
    // InternalAutomatedRestTesting.g:1441:1: rule__Test__Group_3__1 : rule__Test__Group_3__1__Impl ;
    public final void rule__Test__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1445:1: ( rule__Test__Group_3__1__Impl )
            // InternalAutomatedRestTesting.g:1446:2: rule__Test__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__1"


    // $ANTLR start "rule__Test__Group_3__1__Impl"
    // InternalAutomatedRestTesting.g:1452:1: rule__Test__Group_3__1__Impl : ( ( rule__Test__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Test__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1456:1: ( ( ( rule__Test__DescriptionAssignment_3_1 ) ) )
            // InternalAutomatedRestTesting.g:1457:1: ( ( rule__Test__DescriptionAssignment_3_1 ) )
            {
            // InternalAutomatedRestTesting.g:1457:1: ( ( rule__Test__DescriptionAssignment_3_1 ) )
            // InternalAutomatedRestTesting.g:1458:2: ( rule__Test__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_3_1()); 
            // InternalAutomatedRestTesting.g:1459:2: ( rule__Test__DescriptionAssignment_3_1 )
            // InternalAutomatedRestTesting.g:1459:3: rule__Test__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__1__Impl"


    // $ANTLR start "rule__Test__Group_7__0"
    // InternalAutomatedRestTesting.g:1468:1: rule__Test__Group_7__0 : rule__Test__Group_7__0__Impl rule__Test__Group_7__1 ;
    public final void rule__Test__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1472:1: ( rule__Test__Group_7__0__Impl rule__Test__Group_7__1 )
            // InternalAutomatedRestTesting.g:1473:2: rule__Test__Group_7__0__Impl rule__Test__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Test__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_7__0"


    // $ANTLR start "rule__Test__Group_7__0__Impl"
    // InternalAutomatedRestTesting.g:1480:1: rule__Test__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Test__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1484:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:1485:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:1485:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:1486:2: RULE_COMMA
            {
             before(grammarAccess.getTestAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getCOMMATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_7__0__Impl"


    // $ANTLR start "rule__Test__Group_7__1"
    // InternalAutomatedRestTesting.g:1495:1: rule__Test__Group_7__1 : rule__Test__Group_7__1__Impl ;
    public final void rule__Test__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1499:1: ( rule__Test__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:1500:2: rule__Test__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_7__1"


    // $ANTLR start "rule__Test__Group_7__1__Impl"
    // InternalAutomatedRestTesting.g:1506:1: rule__Test__Group_7__1__Impl : ( ( rule__Test__AssertionsAssignment_7_1 ) ) ;
    public final void rule__Test__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1510:1: ( ( ( rule__Test__AssertionsAssignment_7_1 ) ) )
            // InternalAutomatedRestTesting.g:1511:1: ( ( rule__Test__AssertionsAssignment_7_1 ) )
            {
            // InternalAutomatedRestTesting.g:1511:1: ( ( rule__Test__AssertionsAssignment_7_1 ) )
            // InternalAutomatedRestTesting.g:1512:2: ( rule__Test__AssertionsAssignment_7_1 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_7_1()); 
            // InternalAutomatedRestTesting.g:1513:2: ( rule__Test__AssertionsAssignment_7_1 )
            // InternalAutomatedRestTesting.g:1513:3: rule__Test__AssertionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__AssertionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAssertionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_7__1__Impl"


    // $ANTLR start "rule__RestService__Group__0"
    // InternalAutomatedRestTesting.g:1522:1: rule__RestService__Group__0 : rule__RestService__Group__0__Impl rule__RestService__Group__1 ;
    public final void rule__RestService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1526:1: ( rule__RestService__Group__0__Impl rule__RestService__Group__1 )
            // InternalAutomatedRestTesting.g:1527:2: rule__RestService__Group__0__Impl rule__RestService__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__0"


    // $ANTLR start "rule__RestService__Group__0__Impl"
    // InternalAutomatedRestTesting.g:1534:1: rule__RestService__Group__0__Impl : ( ( rule__RestService__MethodAssignment_0 ) ) ;
    public final void rule__RestService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1538:1: ( ( ( rule__RestService__MethodAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:1539:1: ( ( rule__RestService__MethodAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:1539:1: ( ( rule__RestService__MethodAssignment_0 ) )
            // InternalAutomatedRestTesting.g:1540:2: ( rule__RestService__MethodAssignment_0 )
            {
             before(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 
            // InternalAutomatedRestTesting.g:1541:2: ( rule__RestService__MethodAssignment_0 )
            // InternalAutomatedRestTesting.g:1541:3: rule__RestService__MethodAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RestService__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__0__Impl"


    // $ANTLR start "rule__RestService__Group__1"
    // InternalAutomatedRestTesting.g:1549:1: rule__RestService__Group__1 : rule__RestService__Group__1__Impl rule__RestService__Group__2 ;
    public final void rule__RestService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1553:1: ( rule__RestService__Group__1__Impl rule__RestService__Group__2 )
            // InternalAutomatedRestTesting.g:1554:2: rule__RestService__Group__1__Impl rule__RestService__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__RestService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__1"


    // $ANTLR start "rule__RestService__Group__1__Impl"
    // InternalAutomatedRestTesting.g:1561:1: rule__RestService__Group__1__Impl : ( ( rule__RestService__NameAssignment_1 ) ) ;
    public final void rule__RestService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1565:1: ( ( ( rule__RestService__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1566:1: ( ( rule__RestService__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1566:1: ( ( rule__RestService__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1567:2: ( rule__RestService__NameAssignment_1 )
            {
             before(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1568:2: ( rule__RestService__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1568:3: rule__RestService__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RestService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__1__Impl"


    // $ANTLR start "rule__RestService__Group__2"
    // InternalAutomatedRestTesting.g:1576:1: rule__RestService__Group__2 : rule__RestService__Group__2__Impl rule__RestService__Group__3 ;
    public final void rule__RestService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1580:1: ( rule__RestService__Group__2__Impl rule__RestService__Group__3 )
            // InternalAutomatedRestTesting.g:1581:2: rule__RestService__Group__2__Impl rule__RestService__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__RestService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__2"


    // $ANTLR start "rule__RestService__Group__2__Impl"
    // InternalAutomatedRestTesting.g:1588:1: rule__RestService__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1592:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1593:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1593:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1594:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__2__Impl"


    // $ANTLR start "rule__RestService__Group__3"
    // InternalAutomatedRestTesting.g:1603:1: rule__RestService__Group__3 : rule__RestService__Group__3__Impl rule__RestService__Group__4 ;
    public final void rule__RestService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1607:1: ( rule__RestService__Group__3__Impl rule__RestService__Group__4 )
            // InternalAutomatedRestTesting.g:1608:2: rule__RestService__Group__3__Impl rule__RestService__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RestService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__3"


    // $ANTLR start "rule__RestService__Group__3__Impl"
    // InternalAutomatedRestTesting.g:1615:1: rule__RestService__Group__3__Impl : ( 'URL' ) ;
    public final void rule__RestService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1619:1: ( ( 'URL' ) )
            // InternalAutomatedRestTesting.g:1620:1: ( 'URL' )
            {
            // InternalAutomatedRestTesting.g:1620:1: ( 'URL' )
            // InternalAutomatedRestTesting.g:1621:2: 'URL'
            {
             before(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__3__Impl"


    // $ANTLR start "rule__RestService__Group__4"
    // InternalAutomatedRestTesting.g:1630:1: rule__RestService__Group__4 : rule__RestService__Group__4__Impl rule__RestService__Group__5 ;
    public final void rule__RestService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1634:1: ( rule__RestService__Group__4__Impl rule__RestService__Group__5 )
            // InternalAutomatedRestTesting.g:1635:2: rule__RestService__Group__4__Impl rule__RestService__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RestService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__4"


    // $ANTLR start "rule__RestService__Group__4__Impl"
    // InternalAutomatedRestTesting.g:1642:1: rule__RestService__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1646:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1647:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1647:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1648:2: RULE_EQUAL
            {
             before(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_4()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__4__Impl"


    // $ANTLR start "rule__RestService__Group__5"
    // InternalAutomatedRestTesting.g:1657:1: rule__RestService__Group__5 : rule__RestService__Group__5__Impl rule__RestService__Group__6 ;
    public final void rule__RestService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1661:1: ( rule__RestService__Group__5__Impl rule__RestService__Group__6 )
            // InternalAutomatedRestTesting.g:1662:2: rule__RestService__Group__5__Impl rule__RestService__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__5"


    // $ANTLR start "rule__RestService__Group__5__Impl"
    // InternalAutomatedRestTesting.g:1669:1: rule__RestService__Group__5__Impl : ( ( rule__RestService__UriAssignment_5 ) ) ;
    public final void rule__RestService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1673:1: ( ( ( rule__RestService__UriAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1674:1: ( ( rule__RestService__UriAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1674:1: ( ( rule__RestService__UriAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1675:2: ( rule__RestService__UriAssignment_5 )
            {
             before(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 
            // InternalAutomatedRestTesting.g:1676:2: ( rule__RestService__UriAssignment_5 )
            // InternalAutomatedRestTesting.g:1676:3: rule__RestService__UriAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RestService__UriAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__5__Impl"


    // $ANTLR start "rule__RestService__Group__6"
    // InternalAutomatedRestTesting.g:1684:1: rule__RestService__Group__6 : rule__RestService__Group__6__Impl rule__RestService__Group__7 ;
    public final void rule__RestService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1688:1: ( rule__RestService__Group__6__Impl rule__RestService__Group__7 )
            // InternalAutomatedRestTesting.g:1689:2: rule__RestService__Group__6__Impl rule__RestService__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__RestService__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__6"


    // $ANTLR start "rule__RestService__Group__6__Impl"
    // InternalAutomatedRestTesting.g:1696:1: rule__RestService__Group__6__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1700:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1701:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1701:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1702:2: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__6__Impl"


    // $ANTLR start "rule__RestService__Group__7"
    // InternalAutomatedRestTesting.g:1711:1: rule__RestService__Group__7 : rule__RestService__Group__7__Impl rule__RestService__Group__8 ;
    public final void rule__RestService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1715:1: ( rule__RestService__Group__7__Impl rule__RestService__Group__8 )
            // InternalAutomatedRestTesting.g:1716:2: rule__RestService__Group__7__Impl rule__RestService__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__RestService__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__7"


    // $ANTLR start "rule__RestService__Group__7__Impl"
    // InternalAutomatedRestTesting.g:1723:1: rule__RestService__Group__7__Impl : ( ( rule__RestService__Alternatives_7 )* ) ;
    public final void rule__RestService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1727:1: ( ( ( rule__RestService__Alternatives_7 )* ) )
            // InternalAutomatedRestTesting.g:1728:1: ( ( rule__RestService__Alternatives_7 )* )
            {
            // InternalAutomatedRestTesting.g:1728:1: ( ( rule__RestService__Alternatives_7 )* )
            // InternalAutomatedRestTesting.g:1729:2: ( rule__RestService__Alternatives_7 )*
            {
             before(grammarAccess.getRestServiceAccess().getAlternatives_7()); 
            // InternalAutomatedRestTesting.g:1730:2: ( rule__RestService__Alternatives_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SLASH||LA17_0==RULE_QUESTION_MARK) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1730:3: rule__RestService__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__RestService__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRestServiceAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__7__Impl"


    // $ANTLR start "rule__RestService__Group__8"
    // InternalAutomatedRestTesting.g:1738:1: rule__RestService__Group__8 : rule__RestService__Group__8__Impl rule__RestService__Group__9 ;
    public final void rule__RestService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1742:1: ( rule__RestService__Group__8__Impl rule__RestService__Group__9 )
            // InternalAutomatedRestTesting.g:1743:2: rule__RestService__Group__8__Impl rule__RestService__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__RestService__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__8"


    // $ANTLR start "rule__RestService__Group__8__Impl"
    // InternalAutomatedRestTesting.g:1750:1: rule__RestService__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1754:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1755:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1755:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1756:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_8()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__8__Impl"


    // $ANTLR start "rule__RestService__Group__9"
    // InternalAutomatedRestTesting.g:1765:1: rule__RestService__Group__9 : rule__RestService__Group__9__Impl rule__RestService__Group__10 ;
    public final void rule__RestService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1769:1: ( rule__RestService__Group__9__Impl rule__RestService__Group__10 )
            // InternalAutomatedRestTesting.g:1770:2: rule__RestService__Group__9__Impl rule__RestService__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__RestService__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__9"


    // $ANTLR start "rule__RestService__Group__9__Impl"
    // InternalAutomatedRestTesting.g:1777:1: rule__RestService__Group__9__Impl : ( ( rule__RestService__Group_9__0 )? ) ;
    public final void rule__RestService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1781:1: ( ( ( rule__RestService__Group_9__0 )? ) )
            // InternalAutomatedRestTesting.g:1782:1: ( ( rule__RestService__Group_9__0 )? )
            {
            // InternalAutomatedRestTesting.g:1782:1: ( ( rule__RestService__Group_9__0 )? )
            // InternalAutomatedRestTesting.g:1783:2: ( rule__RestService__Group_9__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9()); 
            // InternalAutomatedRestTesting.g:1784:2: ( rule__RestService__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==60) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1784:3: rule__RestService__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__9__Impl"


    // $ANTLR start "rule__RestService__Group__10"
    // InternalAutomatedRestTesting.g:1792:1: rule__RestService__Group__10 : rule__RestService__Group__10__Impl rule__RestService__Group__11 ;
    public final void rule__RestService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1796:1: ( rule__RestService__Group__10__Impl rule__RestService__Group__11 )
            // InternalAutomatedRestTesting.g:1797:2: rule__RestService__Group__10__Impl rule__RestService__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__RestService__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__10"


    // $ANTLR start "rule__RestService__Group__10__Impl"
    // InternalAutomatedRestTesting.g:1804:1: rule__RestService__Group__10__Impl : ( 'Response' ) ;
    public final void rule__RestService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1808:1: ( ( 'Response' ) )
            // InternalAutomatedRestTesting.g:1809:1: ( 'Response' )
            {
            // InternalAutomatedRestTesting.g:1809:1: ( 'Response' )
            // InternalAutomatedRestTesting.g:1810:2: 'Response'
            {
             before(grammarAccess.getRestServiceAccess().getResponseKeyword_10()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getResponseKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__10__Impl"


    // $ANTLR start "rule__RestService__Group__11"
    // InternalAutomatedRestTesting.g:1819:1: rule__RestService__Group__11 : rule__RestService__Group__11__Impl rule__RestService__Group__12 ;
    public final void rule__RestService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1823:1: ( rule__RestService__Group__11__Impl rule__RestService__Group__12 )
            // InternalAutomatedRestTesting.g:1824:2: rule__RestService__Group__11__Impl rule__RestService__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__RestService__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__11"


    // $ANTLR start "rule__RestService__Group__11__Impl"
    // InternalAutomatedRestTesting.g:1831:1: rule__RestService__Group__11__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1835:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1836:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1836:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1837:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_11()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__11__Impl"


    // $ANTLR start "rule__RestService__Group__12"
    // InternalAutomatedRestTesting.g:1846:1: rule__RestService__Group__12 : rule__RestService__Group__12__Impl rule__RestService__Group__13 ;
    public final void rule__RestService__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1850:1: ( rule__RestService__Group__12__Impl rule__RestService__Group__13 )
            // InternalAutomatedRestTesting.g:1851:2: rule__RestService__Group__12__Impl rule__RestService__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__RestService__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__12"


    // $ANTLR start "rule__RestService__Group__12__Impl"
    // InternalAutomatedRestTesting.g:1858:1: rule__RestService__Group__12__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1862:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:1863:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:1863:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:1864:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_12()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getTypeKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__12__Impl"


    // $ANTLR start "rule__RestService__Group__13"
    // InternalAutomatedRestTesting.g:1873:1: rule__RestService__Group__13 : rule__RestService__Group__13__Impl rule__RestService__Group__14 ;
    public final void rule__RestService__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1877:1: ( rule__RestService__Group__13__Impl rule__RestService__Group__14 )
            // InternalAutomatedRestTesting.g:1878:2: rule__RestService__Group__13__Impl rule__RestService__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__13"


    // $ANTLR start "rule__RestService__Group__13__Impl"
    // InternalAutomatedRestTesting.g:1885:1: rule__RestService__Group__13__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1889:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1890:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1890:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1891:2: RULE_EQUAL
            {
             before(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_13()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__13__Impl"


    // $ANTLR start "rule__RestService__Group__14"
    // InternalAutomatedRestTesting.g:1900:1: rule__RestService__Group__14 : rule__RestService__Group__14__Impl rule__RestService__Group__15 ;
    public final void rule__RestService__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1904:1: ( rule__RestService__Group__14__Impl rule__RestService__Group__15 )
            // InternalAutomatedRestTesting.g:1905:2: rule__RestService__Group__14__Impl rule__RestService__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__RestService__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__14"


    // $ANTLR start "rule__RestService__Group__14__Impl"
    // InternalAutomatedRestTesting.g:1912:1: rule__RestService__Group__14__Impl : ( ( rule__RestService__ResponseAssignment_14 ) ) ;
    public final void rule__RestService__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1916:1: ( ( ( rule__RestService__ResponseAssignment_14 ) ) )
            // InternalAutomatedRestTesting.g:1917:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            {
            // InternalAutomatedRestTesting.g:1917:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            // InternalAutomatedRestTesting.g:1918:2: ( rule__RestService__ResponseAssignment_14 )
            {
             before(grammarAccess.getRestServiceAccess().getResponseAssignment_14()); 
            // InternalAutomatedRestTesting.g:1919:2: ( rule__RestService__ResponseAssignment_14 )
            // InternalAutomatedRestTesting.g:1919:3: rule__RestService__ResponseAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__RestService__ResponseAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getResponseAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__14__Impl"


    // $ANTLR start "rule__RestService__Group__15"
    // InternalAutomatedRestTesting.g:1927:1: rule__RestService__Group__15 : rule__RestService__Group__15__Impl rule__RestService__Group__16 ;
    public final void rule__RestService__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1931:1: ( rule__RestService__Group__15__Impl rule__RestService__Group__16 )
            // InternalAutomatedRestTesting.g:1932:2: rule__RestService__Group__15__Impl rule__RestService__Group__16
            {
            pushFollow(FOLLOW_26);
            rule__RestService__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__15"


    // $ANTLR start "rule__RestService__Group__15__Impl"
    // InternalAutomatedRestTesting.g:1939:1: rule__RestService__Group__15__Impl : ( ( '[]' )? ) ;
    public final void rule__RestService__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1943:1: ( ( ( '[]' )? ) )
            // InternalAutomatedRestTesting.g:1944:1: ( ( '[]' )? )
            {
            // InternalAutomatedRestTesting.g:1944:1: ( ( '[]' )? )
            // InternalAutomatedRestTesting.g:1945:2: ( '[]' )?
            {
             before(grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_15()); 
            // InternalAutomatedRestTesting.g:1946:2: ( '[]' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1946:3: '[]'
                    {
                    match(input,59,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__15__Impl"


    // $ANTLR start "rule__RestService__Group__16"
    // InternalAutomatedRestTesting.g:1954:1: rule__RestService__Group__16 : rule__RestService__Group__16__Impl rule__RestService__Group__17 ;
    public final void rule__RestService__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1958:1: ( rule__RestService__Group__16__Impl rule__RestService__Group__17 )
            // InternalAutomatedRestTesting.g:1959:2: rule__RestService__Group__16__Impl rule__RestService__Group__17
            {
            pushFollow(FOLLOW_19);
            rule__RestService__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__16"


    // $ANTLR start "rule__RestService__Group__16__Impl"
    // InternalAutomatedRestTesting.g:1966:1: rule__RestService__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1970:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1971:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1971:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1972:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_16()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__16__Impl"


    // $ANTLR start "rule__RestService__Group__17"
    // InternalAutomatedRestTesting.g:1981:1: rule__RestService__Group__17 : rule__RestService__Group__17__Impl rule__RestService__Group__18 ;
    public final void rule__RestService__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1985:1: ( rule__RestService__Group__17__Impl rule__RestService__Group__18 )
            // InternalAutomatedRestTesting.g:1986:2: rule__RestService__Group__17__Impl rule__RestService__Group__18
            {
            pushFollow(FOLLOW_19);
            rule__RestService__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__17"


    // $ANTLR start "rule__RestService__Group__17__Impl"
    // InternalAutomatedRestTesting.g:1993:1: rule__RestService__Group__17__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1997:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1998:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1998:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1999:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_17()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__17__Impl"


    // $ANTLR start "rule__RestService__Group__18"
    // InternalAutomatedRestTesting.g:2008:1: rule__RestService__Group__18 : rule__RestService__Group__18__Impl ;
    public final void rule__RestService__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2012:1: ( rule__RestService__Group__18__Impl )
            // InternalAutomatedRestTesting.g:2013:2: rule__RestService__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__18"


    // $ANTLR start "rule__RestService__Group__18__Impl"
    // InternalAutomatedRestTesting.g:2019:1: rule__RestService__Group__18__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2023:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2024:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2024:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2025:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_18()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group__18__Impl"


    // $ANTLR start "rule__RestService__Group_7_0__0"
    // InternalAutomatedRestTesting.g:2035:1: rule__RestService__Group_7_0__0 : rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 ;
    public final void rule__RestService__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2039:1: ( rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 )
            // InternalAutomatedRestTesting.g:2040:2: rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_0__0"


    // $ANTLR start "rule__RestService__Group_7_0__0__Impl"
    // InternalAutomatedRestTesting.g:2047:1: rule__RestService__Group_7_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__RestService__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2051:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:2052:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:2052:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:2053:2: RULE_SLASH
            {
             before(grammarAccess.getRestServiceAccess().getSLASHTerminalRuleCall_7_0_0()); 
            match(input,RULE_SLASH,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSLASHTerminalRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_0__0__Impl"


    // $ANTLR start "rule__RestService__Group_7_0__1"
    // InternalAutomatedRestTesting.g:2062:1: rule__RestService__Group_7_0__1 : rule__RestService__Group_7_0__1__Impl ;
    public final void rule__RestService__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2066:1: ( rule__RestService__Group_7_0__1__Impl )
            // InternalAutomatedRestTesting.g:2067:2: rule__RestService__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_0__1"


    // $ANTLR start "rule__RestService__Group_7_0__1__Impl"
    // InternalAutomatedRestTesting.g:2073:1: rule__RestService__Group_7_0__1__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2077:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:2078:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:2078:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:2079:2: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_0__1__Impl"


    // $ANTLR start "rule__RestService__Group_9__0"
    // InternalAutomatedRestTesting.g:2089:1: rule__RestService__Group_9__0 : rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 ;
    public final void rule__RestService__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2093:1: ( rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 )
            // InternalAutomatedRestTesting.g:2094:2: rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1
            {
            pushFollow(FOLLOW_14);
            rule__RestService__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__0"


    // $ANTLR start "rule__RestService__Group_9__0__Impl"
    // InternalAutomatedRestTesting.g:2101:1: rule__RestService__Group_9__0__Impl : ( 'Request' ) ;
    public final void rule__RestService__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2105:1: ( ( 'Request' ) )
            // InternalAutomatedRestTesting.g:2106:1: ( 'Request' )
            {
            // InternalAutomatedRestTesting.g:2106:1: ( 'Request' )
            // InternalAutomatedRestTesting.g:2107:2: 'Request'
            {
             before(grammarAccess.getRestServiceAccess().getRequestKeyword_9_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRequestKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__0__Impl"


    // $ANTLR start "rule__RestService__Group_9__1"
    // InternalAutomatedRestTesting.g:2116:1: rule__RestService__Group_9__1 : rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 ;
    public final void rule__RestService__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2120:1: ( rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 )
            // InternalAutomatedRestTesting.g:2121:2: rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2
            {
            pushFollow(FOLLOW_25);
            rule__RestService__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__1"


    // $ANTLR start "rule__RestService__Group_9__1__Impl"
    // InternalAutomatedRestTesting.g:2128:1: rule__RestService__Group_9__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2132:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2133:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2133:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2134:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__1__Impl"


    // $ANTLR start "rule__RestService__Group_9__2"
    // InternalAutomatedRestTesting.g:2143:1: rule__RestService__Group_9__2 : rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 ;
    public final void rule__RestService__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2147:1: ( rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 )
            // InternalAutomatedRestTesting.g:2148:2: rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3
            {
            pushFollow(FOLLOW_4);
            rule__RestService__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__2"


    // $ANTLR start "rule__RestService__Group_9__2__Impl"
    // InternalAutomatedRestTesting.g:2155:1: rule__RestService__Group_9__2__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2159:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2160:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2160:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2161:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_9_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getTypeKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__2__Impl"


    // $ANTLR start "rule__RestService__Group_9__3"
    // InternalAutomatedRestTesting.g:2170:1: rule__RestService__Group_9__3 : rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 ;
    public final void rule__RestService__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2174:1: ( rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 )
            // InternalAutomatedRestTesting.g:2175:2: rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__3"


    // $ANTLR start "rule__RestService__Group_9__3__Impl"
    // InternalAutomatedRestTesting.g:2182:1: rule__RestService__Group_9__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2186:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2187:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2187:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2188:2: RULE_EQUAL
            {
             before(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_9_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__3__Impl"


    // $ANTLR start "rule__RestService__Group_9__4"
    // InternalAutomatedRestTesting.g:2197:1: rule__RestService__Group_9__4 : rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 ;
    public final void rule__RestService__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2201:1: ( rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 )
            // InternalAutomatedRestTesting.g:2202:2: rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5
            {
            pushFollow(FOLLOW_26);
            rule__RestService__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__4"


    // $ANTLR start "rule__RestService__Group_9__4__Impl"
    // InternalAutomatedRestTesting.g:2209:1: rule__RestService__Group_9__4__Impl : ( ( rule__RestService__RequestAssignment_9_4 ) ) ;
    public final void rule__RestService__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2213:1: ( ( ( rule__RestService__RequestAssignment_9_4 ) ) )
            // InternalAutomatedRestTesting.g:2214:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            {
            // InternalAutomatedRestTesting.g:2214:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            // InternalAutomatedRestTesting.g:2215:2: ( rule__RestService__RequestAssignment_9_4 )
            {
             before(grammarAccess.getRestServiceAccess().getRequestAssignment_9_4()); 
            // InternalAutomatedRestTesting.g:2216:2: ( rule__RestService__RequestAssignment_9_4 )
            // InternalAutomatedRestTesting.g:2216:3: rule__RestService__RequestAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__RestService__RequestAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getRequestAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__4__Impl"


    // $ANTLR start "rule__RestService__Group_9__5"
    // InternalAutomatedRestTesting.g:2224:1: rule__RestService__Group_9__5 : rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 ;
    public final void rule__RestService__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2228:1: ( rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 )
            // InternalAutomatedRestTesting.g:2229:2: rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6
            {
            pushFollow(FOLLOW_26);
            rule__RestService__Group_9__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__5"


    // $ANTLR start "rule__RestService__Group_9__5__Impl"
    // InternalAutomatedRestTesting.g:2236:1: rule__RestService__Group_9__5__Impl : ( ( '[]' )? ) ;
    public final void rule__RestService__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2240:1: ( ( ( '[]' )? ) )
            // InternalAutomatedRestTesting.g:2241:1: ( ( '[]' )? )
            {
            // InternalAutomatedRestTesting.g:2241:1: ( ( '[]' )? )
            // InternalAutomatedRestTesting.g:2242:2: ( '[]' )?
            {
             before(grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_9_5()); 
            // InternalAutomatedRestTesting.g:2243:2: ( '[]' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2243:3: '[]'
                    {
                    match(input,59,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__5__Impl"


    // $ANTLR start "rule__RestService__Group_9__6"
    // InternalAutomatedRestTesting.g:2251:1: rule__RestService__Group_9__6 : rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 ;
    public final void rule__RestService__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2255:1: ( rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 )
            // InternalAutomatedRestTesting.g:2256:2: rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7
            {
            pushFollow(FOLLOW_19);
            rule__RestService__Group_9__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__6"


    // $ANTLR start "rule__RestService__Group_9__6__Impl"
    // InternalAutomatedRestTesting.g:2263:1: rule__RestService__Group_9__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2267:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2268:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2268:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2269:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_9_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_9_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__6__Impl"


    // $ANTLR start "rule__RestService__Group_9__7"
    // InternalAutomatedRestTesting.g:2278:1: rule__RestService__Group_9__7 : rule__RestService__Group_9__7__Impl ;
    public final void rule__RestService__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2282:1: ( rule__RestService__Group_9__7__Impl )
            // InternalAutomatedRestTesting.g:2283:2: rule__RestService__Group_9__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_9__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__7"


    // $ANTLR start "rule__RestService__Group_9__7__Impl"
    // InternalAutomatedRestTesting.g:2289:1: rule__RestService__Group_9__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2293:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2294:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2294:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2295:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_9_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_9_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_9__7__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalAutomatedRestTesting.g:2305:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2309:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalAutomatedRestTesting.g:2310:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Assertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // InternalAutomatedRestTesting.g:2317:1: rule__Assertion__Group__0__Impl : ( 'Assertion' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2321:1: ( ( 'Assertion' ) )
            // InternalAutomatedRestTesting.g:2322:1: ( 'Assertion' )
            {
            // InternalAutomatedRestTesting.g:2322:1: ( 'Assertion' )
            // InternalAutomatedRestTesting.g:2323:2: 'Assertion'
            {
             before(grammarAccess.getAssertionAccess().getAssertionKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getAssertionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // InternalAutomatedRestTesting.g:2332:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2336:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalAutomatedRestTesting.g:2337:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Assertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // InternalAutomatedRestTesting.g:2344:1: rule__Assertion__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2348:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2349:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2349:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2350:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAssertionAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group__2"
    // InternalAutomatedRestTesting.g:2359:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl rule__Assertion__Group__3 ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2363:1: ( rule__Assertion__Group__2__Impl rule__Assertion__Group__3 )
            // InternalAutomatedRestTesting.g:2364:2: rule__Assertion__Group__2__Impl rule__Assertion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Assertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2"


    // $ANTLR start "rule__Assertion__Group__2__Impl"
    // InternalAutomatedRestTesting.g:2371:1: rule__Assertion__Group__2__Impl : ( 'dataToTest' ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2375:1: ( ( 'dataToTest' ) )
            // InternalAutomatedRestTesting.g:2376:1: ( 'dataToTest' )
            {
            // InternalAutomatedRestTesting.g:2376:1: ( 'dataToTest' )
            // InternalAutomatedRestTesting.g:2377:2: 'dataToTest'
            {
             before(grammarAccess.getAssertionAccess().getDataToTestKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getDataToTestKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2__Impl"


    // $ANTLR start "rule__Assertion__Group__3"
    // InternalAutomatedRestTesting.g:2386:1: rule__Assertion__Group__3 : rule__Assertion__Group__3__Impl rule__Assertion__Group__4 ;
    public final void rule__Assertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2390:1: ( rule__Assertion__Group__3__Impl rule__Assertion__Group__4 )
            // InternalAutomatedRestTesting.g:2391:2: rule__Assertion__Group__3__Impl rule__Assertion__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Assertion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__3"


    // $ANTLR start "rule__Assertion__Group__3__Impl"
    // InternalAutomatedRestTesting.g:2398:1: rule__Assertion__Group__3__Impl : ( ( rule__Assertion__DataToTestAssignment_3 ) ) ;
    public final void rule__Assertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2402:1: ( ( ( rule__Assertion__DataToTestAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:2403:1: ( ( rule__Assertion__DataToTestAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:2403:1: ( ( rule__Assertion__DataToTestAssignment_3 ) )
            // InternalAutomatedRestTesting.g:2404:2: ( rule__Assertion__DataToTestAssignment_3 )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestAssignment_3()); 
            // InternalAutomatedRestTesting.g:2405:2: ( rule__Assertion__DataToTestAssignment_3 )
            // InternalAutomatedRestTesting.g:2405:3: rule__Assertion__DataToTestAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__DataToTestAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getDataToTestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__3__Impl"


    // $ANTLR start "rule__Assertion__Group__4"
    // InternalAutomatedRestTesting.g:2413:1: rule__Assertion__Group__4 : rule__Assertion__Group__4__Impl rule__Assertion__Group__5 ;
    public final void rule__Assertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2417:1: ( rule__Assertion__Group__4__Impl rule__Assertion__Group__5 )
            // InternalAutomatedRestTesting.g:2418:2: rule__Assertion__Group__4__Impl rule__Assertion__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Assertion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__4"


    // $ANTLR start "rule__Assertion__Group__4__Impl"
    // InternalAutomatedRestTesting.g:2425:1: rule__Assertion__Group__4__Impl : ( 'condition' ) ;
    public final void rule__Assertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2429:1: ( ( 'condition' ) )
            // InternalAutomatedRestTesting.g:2430:1: ( 'condition' )
            {
            // InternalAutomatedRestTesting.g:2430:1: ( 'condition' )
            // InternalAutomatedRestTesting.g:2431:2: 'condition'
            {
             before(grammarAccess.getAssertionAccess().getConditionKeyword_4()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getConditionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__4__Impl"


    // $ANTLR start "rule__Assertion__Group__5"
    // InternalAutomatedRestTesting.g:2440:1: rule__Assertion__Group__5 : rule__Assertion__Group__5__Impl rule__Assertion__Group__6 ;
    public final void rule__Assertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2444:1: ( rule__Assertion__Group__5__Impl rule__Assertion__Group__6 )
            // InternalAutomatedRestTesting.g:2445:2: rule__Assertion__Group__5__Impl rule__Assertion__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Assertion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__5"


    // $ANTLR start "rule__Assertion__Group__5__Impl"
    // InternalAutomatedRestTesting.g:2452:1: rule__Assertion__Group__5__Impl : ( ( rule__Assertion__ConditionAssignment_5 ) ) ;
    public final void rule__Assertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2456:1: ( ( ( rule__Assertion__ConditionAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:2457:1: ( ( rule__Assertion__ConditionAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:2457:1: ( ( rule__Assertion__ConditionAssignment_5 ) )
            // InternalAutomatedRestTesting.g:2458:2: ( rule__Assertion__ConditionAssignment_5 )
            {
             before(grammarAccess.getAssertionAccess().getConditionAssignment_5()); 
            // InternalAutomatedRestTesting.g:2459:2: ( rule__Assertion__ConditionAssignment_5 )
            // InternalAutomatedRestTesting.g:2459:3: rule__Assertion__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getConditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__5__Impl"


    // $ANTLR start "rule__Assertion__Group__6"
    // InternalAutomatedRestTesting.g:2467:1: rule__Assertion__Group__6 : rule__Assertion__Group__6__Impl ;
    public final void rule__Assertion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2471:1: ( rule__Assertion__Group__6__Impl )
            // InternalAutomatedRestTesting.g:2472:2: rule__Assertion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__6"


    // $ANTLR start "rule__Assertion__Group__6__Impl"
    // InternalAutomatedRestTesting.g:2478:1: rule__Assertion__Group__6__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Assertion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2482:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2483:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2483:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2484:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAssertionAccess().getRIGHT_BRACKETTerminalRuleCall_6()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getRIGHT_BRACKETTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__6__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAutomatedRestTesting.g:2494:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2498:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAutomatedRestTesting.g:2499:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalAutomatedRestTesting.g:2506:1: rule__Expression__Group__0__Impl : ( () ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2510:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2511:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2511:1: ( () )
            // InternalAutomatedRestTesting.g:2512:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionAction_0()); 
            // InternalAutomatedRestTesting.g:2513:2: ()
            // InternalAutomatedRestTesting.g:2513:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalAutomatedRestTesting.g:2521:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2525:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalAutomatedRestTesting.g:2526:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalAutomatedRestTesting.g:2533:1: rule__Expression__Group__1__Impl : ( 'Expression' ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2537:1: ( ( 'Expression' ) )
            // InternalAutomatedRestTesting.g:2538:1: ( 'Expression' )
            {
            // InternalAutomatedRestTesting.g:2538:1: ( 'Expression' )
            // InternalAutomatedRestTesting.g:2539:2: 'Expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpressionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalAutomatedRestTesting.g:2548:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2552:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalAutomatedRestTesting.g:2553:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalAutomatedRestTesting.g:2560:1: rule__Expression__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2564:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2565:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2565:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2566:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getExpressionAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__3"
    // InternalAutomatedRestTesting.g:2575:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2579:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalAutomatedRestTesting.g:2580:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3"


    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalAutomatedRestTesting.g:2587:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__Group_3__0 )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2591:1: ( ( ( rule__Expression__Group_3__0 )? ) )
            // InternalAutomatedRestTesting.g:2592:1: ( ( rule__Expression__Group_3__0 )? )
            {
            // InternalAutomatedRestTesting.g:2592:1: ( ( rule__Expression__Group_3__0 )? )
            // InternalAutomatedRestTesting.g:2593:2: ( rule__Expression__Group_3__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_3()); 
            // InternalAutomatedRestTesting.g:2594:2: ( rule__Expression__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2594:3: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__4"
    // InternalAutomatedRestTesting.g:2602:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2606:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalAutomatedRestTesting.g:2607:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4"


    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalAutomatedRestTesting.g:2614:1: rule__Expression__Group__4__Impl : ( ( rule__Expression__Group_4__0 )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2618:1: ( ( ( rule__Expression__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:2619:1: ( ( rule__Expression__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:2619:1: ( ( rule__Expression__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:2620:2: ( rule__Expression__Group_4__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:2621:2: ( rule__Expression__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2621:3: rule__Expression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4__Impl"


    // $ANTLR start "rule__Expression__Group__5"
    // InternalAutomatedRestTesting.g:2629:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2633:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalAutomatedRestTesting.g:2634:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Expression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5"


    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalAutomatedRestTesting.g:2641:1: rule__Expression__Group__5__Impl : ( ( rule__Expression__Group_5__0 )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2645:1: ( ( ( rule__Expression__Group_5__0 )? ) )
            // InternalAutomatedRestTesting.g:2646:1: ( ( rule__Expression__Group_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:2646:1: ( ( rule__Expression__Group_5__0 )? )
            // InternalAutomatedRestTesting.g:2647:2: ( rule__Expression__Group_5__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_5()); 
            // InternalAutomatedRestTesting.g:2648:2: ( rule__Expression__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==67) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2648:3: rule__Expression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__5__Impl"


    // $ANTLR start "rule__Expression__Group__6"
    // InternalAutomatedRestTesting.g:2656:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl ;
    public final void rule__Expression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2660:1: ( rule__Expression__Group__6__Impl )
            // InternalAutomatedRestTesting.g:2661:2: rule__Expression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__6"


    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalAutomatedRestTesting.g:2667:1: rule__Expression__Group__6__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2671:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2672:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2672:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2673:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getExpressionAccess().getRIGHT_BRACKETTerminalRuleCall_6()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRIGHT_BRACKETTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__6__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalAutomatedRestTesting.g:2683:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2687:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalAutomatedRestTesting.g:2688:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalAutomatedRestTesting.g:2695:1: rule__Expression__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2699:1: ( ( 'type' ) )
            // InternalAutomatedRestTesting.g:2700:1: ( 'type' )
            {
            // InternalAutomatedRestTesting.g:2700:1: ( 'type' )
            // InternalAutomatedRestTesting.g:2701:2: 'type'
            {
             before(grammarAccess.getExpressionAccess().getTypeKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalAutomatedRestTesting.g:2710:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2714:1: ( rule__Expression__Group_3__1__Impl )
            // InternalAutomatedRestTesting.g:2715:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalAutomatedRestTesting.g:2721:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__TypeAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2725:1: ( ( ( rule__Expression__TypeAssignment_3_1 ) ) )
            // InternalAutomatedRestTesting.g:2726:1: ( ( rule__Expression__TypeAssignment_3_1 ) )
            {
            // InternalAutomatedRestTesting.g:2726:1: ( ( rule__Expression__TypeAssignment_3_1 ) )
            // InternalAutomatedRestTesting.g:2727:2: ( rule__Expression__TypeAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getTypeAssignment_3_1()); 
            // InternalAutomatedRestTesting.g:2728:2: ( rule__Expression__TypeAssignment_3_1 )
            // InternalAutomatedRestTesting.g:2728:3: rule__Expression__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_4__0"
    // InternalAutomatedRestTesting.g:2737:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2741:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // InternalAutomatedRestTesting.g:2742:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0"


    // $ANTLR start "rule__Expression__Group_4__0__Impl"
    // InternalAutomatedRestTesting.g:2749:1: rule__Expression__Group_4__0__Impl : ( 'expectedValue' ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2753:1: ( ( 'expectedValue' ) )
            // InternalAutomatedRestTesting.g:2754:1: ( 'expectedValue' )
            {
            // InternalAutomatedRestTesting.g:2754:1: ( 'expectedValue' )
            // InternalAutomatedRestTesting.g:2755:2: 'expectedValue'
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpectedValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_4__1"
    // InternalAutomatedRestTesting.g:2764:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2768:1: ( rule__Expression__Group_4__1__Impl )
            // InternalAutomatedRestTesting.g:2769:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1"


    // $ANTLR start "rule__Expression__Group_4__1__Impl"
    // InternalAutomatedRestTesting.g:2775:1: rule__Expression__Group_4__1__Impl : ( ( rule__Expression__ExpectedValueAssignment_4_1 ) ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2779:1: ( ( ( rule__Expression__ExpectedValueAssignment_4_1 ) ) )
            // InternalAutomatedRestTesting.g:2780:1: ( ( rule__Expression__ExpectedValueAssignment_4_1 ) )
            {
            // InternalAutomatedRestTesting.g:2780:1: ( ( rule__Expression__ExpectedValueAssignment_4_1 ) )
            // InternalAutomatedRestTesting.g:2781:2: ( rule__Expression__ExpectedValueAssignment_4_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueAssignment_4_1()); 
            // InternalAutomatedRestTesting.g:2782:2: ( rule__Expression__ExpectedValueAssignment_4_1 )
            // InternalAutomatedRestTesting.g:2782:3: rule__Expression__ExpectedValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpectedValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpectedValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1__Impl"


    // $ANTLR start "rule__Expression__Group_5__0"
    // InternalAutomatedRestTesting.g:2791:1: rule__Expression__Group_5__0 : rule__Expression__Group_5__0__Impl rule__Expression__Group_5__1 ;
    public final void rule__Expression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2795:1: ( rule__Expression__Group_5__0__Impl rule__Expression__Group_5__1 )
            // InternalAutomatedRestTesting.g:2796:2: rule__Expression__Group_5__0__Impl rule__Expression__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_5__0"


    // $ANTLR start "rule__Expression__Group_5__0__Impl"
    // InternalAutomatedRestTesting.g:2803:1: rule__Expression__Group_5__0__Impl : ( 'relationalOperator' ) ;
    public final void rule__Expression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2807:1: ( ( 'relationalOperator' ) )
            // InternalAutomatedRestTesting.g:2808:1: ( 'relationalOperator' )
            {
            // InternalAutomatedRestTesting.g:2808:1: ( 'relationalOperator' )
            // InternalAutomatedRestTesting.g:2809:2: 'relationalOperator'
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRelationalOperatorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_5__0__Impl"


    // $ANTLR start "rule__Expression__Group_5__1"
    // InternalAutomatedRestTesting.g:2818:1: rule__Expression__Group_5__1 : rule__Expression__Group_5__1__Impl ;
    public final void rule__Expression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2822:1: ( rule__Expression__Group_5__1__Impl )
            // InternalAutomatedRestTesting.g:2823:2: rule__Expression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_5__1"


    // $ANTLR start "rule__Expression__Group_5__1__Impl"
    // InternalAutomatedRestTesting.g:2829:1: rule__Expression__Group_5__1__Impl : ( ( rule__Expression__RelationalOperatorAssignment_5_1 ) ) ;
    public final void rule__Expression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2833:1: ( ( ( rule__Expression__RelationalOperatorAssignment_5_1 ) ) )
            // InternalAutomatedRestTesting.g:2834:1: ( ( rule__Expression__RelationalOperatorAssignment_5_1 ) )
            {
            // InternalAutomatedRestTesting.g:2834:1: ( ( rule__Expression__RelationalOperatorAssignment_5_1 ) )
            // InternalAutomatedRestTesting.g:2835:2: ( rule__Expression__RelationalOperatorAssignment_5_1 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_5_1()); 
            // InternalAutomatedRestTesting.g:2836:2: ( rule__Expression__RelationalOperatorAssignment_5_1 )
            // InternalAutomatedRestTesting.g:2836:3: rule__Expression__RelationalOperatorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RelationalOperatorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalAutomatedRestTesting.g:2845:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2849:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAutomatedRestTesting.g:2850:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalAutomatedRestTesting.g:2857:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2861:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2862:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2862:1: ( () )
            // InternalAutomatedRestTesting.g:2863:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalAutomatedRestTesting.g:2864:2: ()
            // InternalAutomatedRestTesting.g:2864:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalAutomatedRestTesting.g:2872:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2876:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAutomatedRestTesting.g:2877:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalAutomatedRestTesting.g:2884:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Alternatives_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2888:1: ( ( ( rule__Parameter__Alternatives_1 ) ) )
            // InternalAutomatedRestTesting.g:2889:1: ( ( rule__Parameter__Alternatives_1 ) )
            {
            // InternalAutomatedRestTesting.g:2889:1: ( ( rule__Parameter__Alternatives_1 ) )
            // InternalAutomatedRestTesting.g:2890:2: ( rule__Parameter__Alternatives_1 )
            {
             before(grammarAccess.getParameterAccess().getAlternatives_1()); 
            // InternalAutomatedRestTesting.g:2891:2: ( rule__Parameter__Alternatives_1 )
            // InternalAutomatedRestTesting.g:2891:3: rule__Parameter__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalAutomatedRestTesting.g:2899:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2903:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAutomatedRestTesting.g:2904:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalAutomatedRestTesting.g:2911:1: rule__Parameter__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2915:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2916:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2916:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2917:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getParameterAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalAutomatedRestTesting.g:2926:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2930:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAutomatedRestTesting.g:2931:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalAutomatedRestTesting.g:2938:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2942:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:2943:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:2943:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:2944:2: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:2945:2: ( rule__Parameter__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:2945:3: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalAutomatedRestTesting.g:2953:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2957:1: ( rule__Parameter__Group__4__Impl )
            // InternalAutomatedRestTesting.g:2958:2: rule__Parameter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalAutomatedRestTesting.g:2964:1: rule__Parameter__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2968:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2969:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2969:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2970:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getParameterAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group_1_0__0"
    // InternalAutomatedRestTesting.g:2980:1: rule__Parameter__Group_1_0__0 : rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 ;
    public final void rule__Parameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2984:1: ( rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 )
            // InternalAutomatedRestTesting.g:2985:2: rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Parameter__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__0"


    // $ANTLR start "rule__Parameter__Group_1_0__0__Impl"
    // InternalAutomatedRestTesting.g:2992:1: rule__Parameter__Group_1_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__Parameter__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2996:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:2997:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:2997:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:2998:2: RULE_SLASH
            {
             before(grammarAccess.getParameterAccess().getSLASHTerminalRuleCall_1_0_0()); 
            match(input,RULE_SLASH,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getSLASHTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1_0__1"
    // InternalAutomatedRestTesting.g:3007:1: rule__Parameter__Group_1_0__1 : rule__Parameter__Group_1_0__1__Impl ;
    public final void rule__Parameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3011:1: ( rule__Parameter__Group_1_0__1__Impl )
            // InternalAutomatedRestTesting.g:3012:2: rule__Parameter__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__1"


    // $ANTLR start "rule__Parameter__Group_1_0__1__Impl"
    // InternalAutomatedRestTesting.g:3018:1: rule__Parameter__Group_1_0__1__Impl : ( RULE_TWO_DOTS ) ;
    public final void rule__Parameter__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3022:1: ( ( RULE_TWO_DOTS ) )
            // InternalAutomatedRestTesting.g:3023:1: ( RULE_TWO_DOTS )
            {
            // InternalAutomatedRestTesting.g:3023:1: ( RULE_TWO_DOTS )
            // InternalAutomatedRestTesting.g:3024:2: RULE_TWO_DOTS
            {
             before(grammarAccess.getParameterAccess().getTWO_DOTSTerminalRuleCall_1_0_1()); 
            match(input,RULE_TWO_DOTS,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTWO_DOTSTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__0"
    // InternalAutomatedRestTesting.g:3034:1: rule__Parameter__Group_1_1__0 : rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 ;
    public final void rule__Parameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3038:1: ( rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 )
            // InternalAutomatedRestTesting.g:3039:2: rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Parameter__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__0"


    // $ANTLR start "rule__Parameter__Group_1_1__0__Impl"
    // InternalAutomatedRestTesting.g:3046:1: rule__Parameter__Group_1_1__0__Impl : ( RULE_QUESTION_MARK ) ;
    public final void rule__Parameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3050:1: ( ( RULE_QUESTION_MARK ) )
            // InternalAutomatedRestTesting.g:3051:1: ( RULE_QUESTION_MARK )
            {
            // InternalAutomatedRestTesting.g:3051:1: ( RULE_QUESTION_MARK )
            // InternalAutomatedRestTesting.g:3052:2: RULE_QUESTION_MARK
            {
             before(grammarAccess.getParameterAccess().getQUESTION_MARKTerminalRuleCall_1_1_0()); 
            match(input,RULE_QUESTION_MARK,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getQUESTION_MARKTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__1"
    // InternalAutomatedRestTesting.g:3061:1: rule__Parameter__Group_1_1__1 : rule__Parameter__Group_1_1__1__Impl ;
    public final void rule__Parameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3065:1: ( rule__Parameter__Group_1_1__1__Impl )
            // InternalAutomatedRestTesting.g:3066:2: rule__Parameter__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__1"


    // $ANTLR start "rule__Parameter__Group_1_1__1__Impl"
    // InternalAutomatedRestTesting.g:3072:1: rule__Parameter__Group_1_1__1__Impl : ( RULE_MONEY ) ;
    public final void rule__Parameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3076:1: ( ( RULE_MONEY ) )
            // InternalAutomatedRestTesting.g:3077:1: ( RULE_MONEY )
            {
            // InternalAutomatedRestTesting.g:3077:1: ( RULE_MONEY )
            // InternalAutomatedRestTesting.g:3078:2: RULE_MONEY
            {
             before(grammarAccess.getParameterAccess().getMONEYTerminalRuleCall_1_1_1()); 
            match(input,RULE_MONEY,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getMONEYTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__1__Impl"


    // $ANTLR start "rule__Restriction__Group__0"
    // InternalAutomatedRestTesting.g:3088:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3092:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAutomatedRestTesting.g:3093:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Restriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restriction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0"


    // $ANTLR start "rule__Restriction__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3100:1: rule__Restriction__Group__0__Impl : ( () ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3104:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3105:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3105:1: ( () )
            // InternalAutomatedRestTesting.g:3106:2: ()
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 
            // InternalAutomatedRestTesting.g:3107:2: ()
            // InternalAutomatedRestTesting.g:3107:3: 
            {
            }

             after(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0__Impl"


    // $ANTLR start "rule__Restriction__Group__1"
    // InternalAutomatedRestTesting.g:3115:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3119:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // InternalAutomatedRestTesting.g:3120:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Restriction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restriction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1"


    // $ANTLR start "rule__Restriction__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3127:1: rule__Restriction__Group__1__Impl : ( 'mockType' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3131:1: ( ( 'mockType' ) )
            // InternalAutomatedRestTesting.g:3132:1: ( 'mockType' )
            {
            // InternalAutomatedRestTesting.g:3132:1: ( 'mockType' )
            // InternalAutomatedRestTesting.g:3133:2: 'mockType'
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRestrictionAccess().getMockTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1__Impl"


    // $ANTLR start "rule__Restriction__Group__2"
    // InternalAutomatedRestTesting.g:3142:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3146:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // InternalAutomatedRestTesting.g:3147:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Restriction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restriction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__2"


    // $ANTLR start "rule__Restriction__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3154:1: rule__Restriction__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3158:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3159:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3159:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3160:2: RULE_EQUAL
            {
             before(grammarAccess.getRestrictionAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestrictionAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__2__Impl"


    // $ANTLR start "rule__Restriction__Group__3"
    // InternalAutomatedRestTesting.g:3169:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3173:1: ( rule__Restriction__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3174:2: rule__Restriction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__3"


    // $ANTLR start "rule__Restriction__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3180:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__MockTypeAssignment_3 ) ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3184:1: ( ( ( rule__Restriction__MockTypeAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3185:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3185:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3186:2: ( rule__Restriction__MockTypeAssignment_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 
            // InternalAutomatedRestTesting.g:3187:2: ( rule__Restriction__MockTypeAssignment_3 )
            // InternalAutomatedRestTesting.g:3187:3: rule__Restriction__MockTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__MockTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalAutomatedRestTesting.g:3196:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3200:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAutomatedRestTesting.g:3201:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3208:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3212:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3213:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3213:1: ( () )
            // InternalAutomatedRestTesting.g:3214:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3215:2: ()
            // InternalAutomatedRestTesting.g:3215:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalAutomatedRestTesting.g:3223:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3227:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAutomatedRestTesting.g:3228:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3235:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3239:1: ( ( 'Entity' ) )
            // InternalAutomatedRestTesting.g:3240:1: ( 'Entity' )
            {
            // InternalAutomatedRestTesting.g:3240:1: ( 'Entity' )
            // InternalAutomatedRestTesting.g:3241:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalAutomatedRestTesting.g:3250:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3254:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAutomatedRestTesting.g:3255:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3262:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3266:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3267:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3267:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3268:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3269:2: ( rule__Entity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3269:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalAutomatedRestTesting.g:3277:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3281:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAutomatedRestTesting.g:3282:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3289:1: rule__Entity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3293:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3294:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3294:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3295:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getEntityAccess().getLEFT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLEFT_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalAutomatedRestTesting.g:3304:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3308:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAutomatedRestTesting.g:3309:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalAutomatedRestTesting.g:3316:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3320:1: ( ( ( rule__Entity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:3321:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:3321:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:3322:2: ( rule__Entity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:3323:2: ( rule__Entity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:3323:3: rule__Entity__EntityAttributesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__EntityAttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalAutomatedRestTesting.g:3331:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3335:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAutomatedRestTesting.g:3336:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalAutomatedRestTesting.g:3343:1: rule__Entity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3347:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3348:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3348:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3349:2: RULE_SEMICOLON
            {
             before(grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_5()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalAutomatedRestTesting.g:3358:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3362:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAutomatedRestTesting.g:3363:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalAutomatedRestTesting.g:3370:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3374:1: ( ( ( rule__Entity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:3375:1: ( ( rule__Entity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:3375:1: ( ( rule__Entity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:3376:2: ( rule__Entity__Group_6__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:3377:2: ( rule__Entity__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=22 && LA24_0<=26)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3377:3: rule__Entity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Entity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalAutomatedRestTesting.g:3385:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3389:1: ( rule__Entity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:3390:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalAutomatedRestTesting.g:3396:1: rule__Entity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3400:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3401:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3401:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3402:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // InternalAutomatedRestTesting.g:3412:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3416:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalAutomatedRestTesting.g:3417:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // InternalAutomatedRestTesting.g:3424:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3428:1: ( ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:3429:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:3429:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:3430:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:3431:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:3431:3: rule__Entity__EntityAttributesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__EntityAttributesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // InternalAutomatedRestTesting.g:3439:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3443:1: ( rule__Entity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:3444:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // InternalAutomatedRestTesting.g:3450:1: rule__Entity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3454:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3455:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3455:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3456:2: RULE_SEMICOLON
            {
             before(grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_6_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Attribute_Impl__Group__0"
    // InternalAutomatedRestTesting.g:3466:1: rule__Attribute_Impl__Group__0 : rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 ;
    public final void rule__Attribute_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3470:1: ( rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 )
            // InternalAutomatedRestTesting.g:3471:2: rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Attribute_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__0"


    // $ANTLR start "rule__Attribute_Impl__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3478:1: rule__Attribute_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Attribute_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3482:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3483:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3483:1: ( () )
            // InternalAutomatedRestTesting.g:3484:2: ()
            {
             before(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:3485:2: ()
            // InternalAutomatedRestTesting.g:3485:3: 
            {
            }

             after(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__0__Impl"


    // $ANTLR start "rule__Attribute_Impl__Group__1"
    // InternalAutomatedRestTesting.g:3493:1: rule__Attribute_Impl__Group__1 : rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 ;
    public final void rule__Attribute_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3497:1: ( rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 )
            // InternalAutomatedRestTesting.g:3498:2: rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Attribute_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__1"


    // $ANTLR start "rule__Attribute_Impl__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3505:1: rule__Attribute_Impl__Group__1__Impl : ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) ;
    public final void rule__Attribute_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3509:1: ( ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3510:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3510:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3511:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3512:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3512:3: rule__Attribute_Impl__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__1__Impl"


    // $ANTLR start "rule__Attribute_Impl__Group__2"
    // InternalAutomatedRestTesting.g:3520:1: rule__Attribute_Impl__Group__2 : rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 ;
    public final void rule__Attribute_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3524:1: ( rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 )
            // InternalAutomatedRestTesting.g:3525:2: rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Attribute_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__2"


    // $ANTLR start "rule__Attribute_Impl__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3532:1: rule__Attribute_Impl__Group__2__Impl : ( ( rule__Attribute_Impl__IsArrayAssignment_2 )? ) ;
    public final void rule__Attribute_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3536:1: ( ( ( rule__Attribute_Impl__IsArrayAssignment_2 )? ) )
            // InternalAutomatedRestTesting.g:3537:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2 )? )
            {
            // InternalAutomatedRestTesting.g:3537:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2 )? )
            // InternalAutomatedRestTesting.g:3538:2: ( rule__Attribute_Impl__IsArrayAssignment_2 )?
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2()); 
            // InternalAutomatedRestTesting.g:3539:2: ( rule__Attribute_Impl__IsArrayAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3539:3: rule__Attribute_Impl__IsArrayAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute_Impl__IsArrayAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__2__Impl"


    // $ANTLR start "rule__Attribute_Impl__Group__3"
    // InternalAutomatedRestTesting.g:3547:1: rule__Attribute_Impl__Group__3 : rule__Attribute_Impl__Group__3__Impl ;
    public final void rule__Attribute_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3551:1: ( rule__Attribute_Impl__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3552:2: rule__Attribute_Impl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__3"


    // $ANTLR start "rule__Attribute_Impl__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3558:1: rule__Attribute_Impl__Group__3__Impl : ( ( rule__Attribute_Impl__NameAssignment_3 ) ) ;
    public final void rule__Attribute_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3562:1: ( ( ( rule__Attribute_Impl__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3563:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3563:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3564:2: ( rule__Attribute_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:3565:2: ( rule__Attribute_Impl__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:3565:3: rule__Attribute_Impl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__Group__3__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__0"
    // InternalAutomatedRestTesting.g:3574:1: rule__DomainAttribute__Group__0 : rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 ;
    public final void rule__DomainAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3578:1: ( rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 )
            // InternalAutomatedRestTesting.g:3579:2: rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__DomainAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__0"


    // $ANTLR start "rule__DomainAttribute__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3586:1: rule__DomainAttribute__Group__0__Impl : ( () ) ;
    public final void rule__DomainAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3590:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3591:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3591:1: ( () )
            // InternalAutomatedRestTesting.g:3592:2: ()
            {
             before(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:3593:2: ()
            // InternalAutomatedRestTesting.g:3593:3: 
            {
            }

             after(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__0__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__1"
    // InternalAutomatedRestTesting.g:3601:1: rule__DomainAttribute__Group__1 : rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 ;
    public final void rule__DomainAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3605:1: ( rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 )
            // InternalAutomatedRestTesting.g:3606:2: rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__DomainAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__1"


    // $ANTLR start "rule__DomainAttribute__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3613:1: rule__DomainAttribute__Group__1__Impl : ( ( rule__DomainAttribute__TypeAssignment_1 ) ) ;
    public final void rule__DomainAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3617:1: ( ( ( rule__DomainAttribute__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3618:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3618:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3619:2: ( rule__DomainAttribute__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3620:2: ( rule__DomainAttribute__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3620:3: rule__DomainAttribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__1__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__2"
    // InternalAutomatedRestTesting.g:3628:1: rule__DomainAttribute__Group__2 : rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 ;
    public final void rule__DomainAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3632:1: ( rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 )
            // InternalAutomatedRestTesting.g:3633:2: rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__DomainAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__2"


    // $ANTLR start "rule__DomainAttribute__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3640:1: rule__DomainAttribute__Group__2__Impl : ( ( rule__DomainAttribute__IsArrayAssignment_2 )? ) ;
    public final void rule__DomainAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3644:1: ( ( ( rule__DomainAttribute__IsArrayAssignment_2 )? ) )
            // InternalAutomatedRestTesting.g:3645:1: ( ( rule__DomainAttribute__IsArrayAssignment_2 )? )
            {
            // InternalAutomatedRestTesting.g:3645:1: ( ( rule__DomainAttribute__IsArrayAssignment_2 )? )
            // InternalAutomatedRestTesting.g:3646:2: ( rule__DomainAttribute__IsArrayAssignment_2 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2()); 
            // InternalAutomatedRestTesting.g:3647:2: ( rule__DomainAttribute__IsArrayAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==59) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3647:3: rule__DomainAttribute__IsArrayAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainAttribute__IsArrayAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__2__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__3"
    // InternalAutomatedRestTesting.g:3655:1: rule__DomainAttribute__Group__3 : rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 ;
    public final void rule__DomainAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3659:1: ( rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 )
            // InternalAutomatedRestTesting.g:3660:2: rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__DomainAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__3"


    // $ANTLR start "rule__DomainAttribute__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3667:1: rule__DomainAttribute__Group__3__Impl : ( ( rule__DomainAttribute__NameAssignment_3 ) ) ;
    public final void rule__DomainAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3671:1: ( ( ( rule__DomainAttribute__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3672:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3672:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3673:2: ( rule__DomainAttribute__NameAssignment_3 )
            {
             before(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:3674:2: ( rule__DomainAttribute__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:3674:3: rule__DomainAttribute__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__3__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__4"
    // InternalAutomatedRestTesting.g:3682:1: rule__DomainAttribute__Group__4 : rule__DomainAttribute__Group__4__Impl ;
    public final void rule__DomainAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3686:1: ( rule__DomainAttribute__Group__4__Impl )
            // InternalAutomatedRestTesting.g:3687:2: rule__DomainAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__4"


    // $ANTLR start "rule__DomainAttribute__Group__4__Impl"
    // InternalAutomatedRestTesting.g:3693:1: rule__DomainAttribute__Group__4__Impl : ( ( rule__DomainAttribute__Group_4__0 )? ) ;
    public final void rule__DomainAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3697:1: ( ( ( rule__DomainAttribute__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:3698:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:3698:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:3699:2: ( rule__DomainAttribute__Group_4__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:3700:2: ( rule__DomainAttribute__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_LEFT_PARENTHESIS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3700:3: rule__DomainAttribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group__4__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4__0"
    // InternalAutomatedRestTesting.g:3709:1: rule__DomainAttribute__Group_4__0 : rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 ;
    public final void rule__DomainAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3713:1: ( rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 )
            // InternalAutomatedRestTesting.g:3714:2: rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1
            {
            pushFollow(FOLLOW_43);
            rule__DomainAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__0"


    // $ANTLR start "rule__DomainAttribute__Group_4__0__Impl"
    // InternalAutomatedRestTesting.g:3721:1: rule__DomainAttribute__Group_4__0__Impl : ( RULE_LEFT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3725:1: ( ( RULE_LEFT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:3726:1: ( RULE_LEFT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:3726:1: ( RULE_LEFT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:3727:2: RULE_LEFT_PARENTHESIS
            {
             before(grammarAccess.getDomainAttributeAccess().getLEFT_PARENTHESISTerminalRuleCall_4_0()); 
            match(input,RULE_LEFT_PARENTHESIS,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getLEFT_PARENTHESISTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4__1"
    // InternalAutomatedRestTesting.g:3736:1: rule__DomainAttribute__Group_4__1 : rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 ;
    public final void rule__DomainAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3740:1: ( rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 )
            // InternalAutomatedRestTesting.g:3741:2: rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2
            {
            pushFollow(FOLLOW_43);
            rule__DomainAttribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__1"


    // $ANTLR start "rule__DomainAttribute__Group_4__1__Impl"
    // InternalAutomatedRestTesting.g:3748:1: rule__DomainAttribute__Group_4__1__Impl : ( ( rule__DomainAttribute__Group_4_1__0 )? ) ;
    public final void rule__DomainAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3752:1: ( ( ( rule__DomainAttribute__Group_4_1__0 )? ) )
            // InternalAutomatedRestTesting.g:3753:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:3753:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            // InternalAutomatedRestTesting.g:3754:2: ( rule__DomainAttribute__Group_4_1__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 
            // InternalAutomatedRestTesting.g:3755:2: ( rule__DomainAttribute__Group_4_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3755:3: rule__DomainAttribute__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainAttribute__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4__2"
    // InternalAutomatedRestTesting.g:3763:1: rule__DomainAttribute__Group_4__2 : rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 ;
    public final void rule__DomainAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3767:1: ( rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 )
            // InternalAutomatedRestTesting.g:3768:2: rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3
            {
            pushFollow(FOLLOW_44);
            rule__DomainAttribute__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__2"


    // $ANTLR start "rule__DomainAttribute__Group_4__2__Impl"
    // InternalAutomatedRestTesting.g:3775:1: rule__DomainAttribute__Group_4__2__Impl : ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) ;
    public final void rule__DomainAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3779:1: ( ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) )
            // InternalAutomatedRestTesting.g:3780:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            {
            // InternalAutomatedRestTesting.g:3780:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            // InternalAutomatedRestTesting.g:3781:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 
            // InternalAutomatedRestTesting.g:3782:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            // InternalAutomatedRestTesting.g:3782:3: rule__DomainAttribute__RestrictionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__RestrictionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__2__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4__3"
    // InternalAutomatedRestTesting.g:3790:1: rule__DomainAttribute__Group_4__3 : rule__DomainAttribute__Group_4__3__Impl ;
    public final void rule__DomainAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3794:1: ( rule__DomainAttribute__Group_4__3__Impl )
            // InternalAutomatedRestTesting.g:3795:2: rule__DomainAttribute__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__3"


    // $ANTLR start "rule__DomainAttribute__Group_4__3__Impl"
    // InternalAutomatedRestTesting.g:3801:1: rule__DomainAttribute__Group_4__3__Impl : ( RULE_RIGHT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3805:1: ( ( RULE_RIGHT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:3806:1: ( RULE_RIGHT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:3806:1: ( RULE_RIGHT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:3807:2: RULE_RIGHT_PARENTHESIS
            {
             before(grammarAccess.getDomainAttributeAccess().getRIGHT_PARENTHESISTerminalRuleCall_4_3()); 
            match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getRIGHT_PARENTHESISTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4__3__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4_1__0"
    // InternalAutomatedRestTesting.g:3817:1: rule__DomainAttribute__Group_4_1__0 : rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 ;
    public final void rule__DomainAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3821:1: ( rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 )
            // InternalAutomatedRestTesting.g:3822:2: rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_45);
            rule__DomainAttribute__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4_1__0"


    // $ANTLR start "rule__DomainAttribute__Group_4_1__0__Impl"
    // InternalAutomatedRestTesting.g:3829:1: rule__DomainAttribute__Group_4_1__0__Impl : ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) ;
    public final void rule__DomainAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3833:1: ( ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) )
            // InternalAutomatedRestTesting.g:3834:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            {
            // InternalAutomatedRestTesting.g:3834:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            // InternalAutomatedRestTesting.g:3835:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 
            // InternalAutomatedRestTesting.g:3836:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            // InternalAutomatedRestTesting.g:3836:3: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__PrimaryKeyAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4_1__0__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4_1__1"
    // InternalAutomatedRestTesting.g:3844:1: rule__DomainAttribute__Group_4_1__1 : rule__DomainAttribute__Group_4_1__1__Impl ;
    public final void rule__DomainAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3848:1: ( rule__DomainAttribute__Group_4_1__1__Impl )
            // InternalAutomatedRestTesting.g:3849:2: rule__DomainAttribute__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4_1__1"


    // $ANTLR start "rule__DomainAttribute__Group_4_1__1__Impl"
    // InternalAutomatedRestTesting.g:3855:1: rule__DomainAttribute__Group_4_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__DomainAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3859:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:3860:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:3860:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:3861:2: RULE_COMMA
            {
             before(grammarAccess.getDomainAttributeAccess().getCOMMATerminalRuleCall_4_1_1()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getCOMMATerminalRuleCall_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__Group_4_1__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalAutomatedRestTesting.g:3871:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3875:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalAutomatedRestTesting.g:3876:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SimpleEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0"


    // $ANTLR start "rule__SimpleEntity__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3883:1: rule__SimpleEntity__Group__0__Impl : ( () ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3887:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3888:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3888:1: ( () )
            // InternalAutomatedRestTesting.g:3889:2: ()
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3890:2: ()
            // InternalAutomatedRestTesting.g:3890:3: 
            {
            }

             after(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__1"
    // InternalAutomatedRestTesting.g:3898:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3902:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalAutomatedRestTesting.g:3903:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SimpleEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1"


    // $ANTLR start "rule__SimpleEntity__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3910:1: rule__SimpleEntity__Group__1__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3914:1: ( ( 'SimpleEntity' ) )
            // InternalAutomatedRestTesting.g:3915:1: ( 'SimpleEntity' )
            {
            // InternalAutomatedRestTesting.g:3915:1: ( 'SimpleEntity' )
            // InternalAutomatedRestTesting.g:3916:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__2"
    // InternalAutomatedRestTesting.g:3925:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3929:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalAutomatedRestTesting.g:3930:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SimpleEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2"


    // $ANTLR start "rule__SimpleEntity__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3937:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3941:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3942:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3942:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3943:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3944:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3944:3: rule__SimpleEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__3"
    // InternalAutomatedRestTesting.g:3952:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3956:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalAutomatedRestTesting.g:3957:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__SimpleEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3"


    // $ANTLR start "rule__SimpleEntity__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3964:1: rule__SimpleEntity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3968:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3969:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3969:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3970:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getSimpleEntityAccess().getLEFT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getLEFT_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__4"
    // InternalAutomatedRestTesting.g:3979:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3983:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalAutomatedRestTesting.g:3984:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4"


    // $ANTLR start "rule__SimpleEntity__Group__4__Impl"
    // InternalAutomatedRestTesting.g:3991:1: rule__SimpleEntity__Group__4__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3995:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:3996:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:3996:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:3997:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:3998:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:3998:3: rule__SimpleEntity__EntityAttributesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__EntityAttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__5"
    // InternalAutomatedRestTesting.g:4006:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4010:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalAutomatedRestTesting.g:4011:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__SimpleEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__5"


    // $ANTLR start "rule__SimpleEntity__Group__5__Impl"
    // InternalAutomatedRestTesting.g:4018:1: rule__SimpleEntity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4022:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4023:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4023:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4024:2: RULE_SEMICOLON
            {
             before(grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_5()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__5__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__6"
    // InternalAutomatedRestTesting.g:4033:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4037:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalAutomatedRestTesting.g:4038:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__SimpleEntity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__6"


    // $ANTLR start "rule__SimpleEntity__Group__6__Impl"
    // InternalAutomatedRestTesting.g:4045:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__Group_6__0 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4049:1: ( ( ( rule__SimpleEntity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4050:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4050:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4051:2: ( rule__SimpleEntity__Group_6__0 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4052:2: ( rule__SimpleEntity__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=22 && LA29_0<=26)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4052:3: rule__SimpleEntity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__SimpleEntity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__6__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__7"
    // InternalAutomatedRestTesting.g:4060:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4064:1: ( rule__SimpleEntity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4065:2: rule__SimpleEntity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__7"


    // $ANTLR start "rule__SimpleEntity__Group__7__Impl"
    // InternalAutomatedRestTesting.g:4071:1: rule__SimpleEntity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4075:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4076:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4076:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4077:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getSimpleEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__7__Impl"


    // $ANTLR start "rule__SimpleEntity__Group_6__0"
    // InternalAutomatedRestTesting.g:4087:1: rule__SimpleEntity__Group_6__0 : rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 ;
    public final void rule__SimpleEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4091:1: ( rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4092:2: rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__SimpleEntity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_6__0"


    // $ANTLR start "rule__SimpleEntity__Group_6__0__Impl"
    // InternalAutomatedRestTesting.g:4099:1: rule__SimpleEntity__Group_6__0__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__SimpleEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4103:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4104:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4104:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4105:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4106:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4106:3: rule__SimpleEntity__EntityAttributesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__EntityAttributesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group_6__1"
    // InternalAutomatedRestTesting.g:4114:1: rule__SimpleEntity__Group_6__1 : rule__SimpleEntity__Group_6__1__Impl ;
    public final void rule__SimpleEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4118:1: ( rule__SimpleEntity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4119:2: rule__SimpleEntity__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_6__1"


    // $ANTLR start "rule__SimpleEntity__Group_6__1__Impl"
    // InternalAutomatedRestTesting.g:4125:1: rule__SimpleEntity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4129:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4130:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4130:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4131:2: RULE_SEMICOLON
            {
             before(grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_6_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group_6__1__Impl"


    // $ANTLR start "rule__AutomatedRestTesting__UrlAssignment_3"
    // InternalAutomatedRestTesting.g:4141:1: rule__AutomatedRestTesting__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AutomatedRestTesting__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4145:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4146:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4146:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4147:3: ruleEString
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__UrlAssignment_3"


    // $ANTLR start "rule__AutomatedRestTesting__DataElementsAssignment_5_0"
    // InternalAutomatedRestTesting.g:4156:1: rule__AutomatedRestTesting__DataElementsAssignment_5_0 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4160:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4161:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4161:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4162:3: ruleElement
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__DataElementsAssignment_5_0"


    // $ANTLR start "rule__AutomatedRestTesting__DataElementsAssignment_5_1"
    // InternalAutomatedRestTesting.g:4171:1: rule__AutomatedRestTesting__DataElementsAssignment_5_1 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4175:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4176:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4176:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4177:3: ruleElement
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__DataElementsAssignment_5_1"


    // $ANTLR start "rule__AutomatedRestTesting__ServicesAssignment_6_0"
    // InternalAutomatedRestTesting.g:4186:1: rule__AutomatedRestTesting__ServicesAssignment_6_0 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4190:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:4191:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:4191:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:4192:3: ruleRestService
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRestService();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__ServicesAssignment_6_0"


    // $ANTLR start "rule__AutomatedRestTesting__ServicesAssignment_6_1"
    // InternalAutomatedRestTesting.g:4201:1: rule__AutomatedRestTesting__ServicesAssignment_6_1 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4205:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:4206:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:4206:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:4207:3: ruleRestService
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRestService();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__ServicesAssignment_6_1"


    // $ANTLR start "rule__AutomatedRestTesting__TestsAssignment_7_0"
    // InternalAutomatedRestTesting.g:4216:1: rule__AutomatedRestTesting__TestsAssignment_7_0 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4220:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:4221:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:4221:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:4222:3: ruleTest
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__TestsAssignment_7_0"


    // $ANTLR start "rule__AutomatedRestTesting__TestsAssignment_7_1"
    // InternalAutomatedRestTesting.g:4231:1: rule__AutomatedRestTesting__TestsAssignment_7_1 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4235:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:4236:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:4236:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:4237:3: ruleTest
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomatedRestTesting__TestsAssignment_7_1"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalAutomatedRestTesting.g:4246:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4250:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4251:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4251:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4252:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__DescriptionAssignment_3_1"
    // InternalAutomatedRestTesting.g:4261:1: rule__Test__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Test__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4265:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4266:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4266:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4267:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Test__AssertionsAssignment_6"
    // InternalAutomatedRestTesting.g:4276:1: rule__Test__AssertionsAssignment_6 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4280:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:4281:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:4281:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:4282:3: ruleAssertion
            {
             before(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AssertionsAssignment_6"


    // $ANTLR start "rule__Test__AssertionsAssignment_7_1"
    // InternalAutomatedRestTesting.g:4291:1: rule__Test__AssertionsAssignment_7_1 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4295:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:4296:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:4296:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:4297:3: ruleAssertion
            {
             before(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AssertionsAssignment_7_1"


    // $ANTLR start "rule__RestService__MethodAssignment_0"
    // InternalAutomatedRestTesting.g:4306:1: rule__RestService__MethodAssignment_0 : ( ruleMethodType ) ;
    public final void rule__RestService__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4310:1: ( ( ruleMethodType ) )
            // InternalAutomatedRestTesting.g:4311:2: ( ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:4311:2: ( ruleMethodType )
            // InternalAutomatedRestTesting.g:4312:3: ruleMethodType
            {
             before(grammarAccess.getRestServiceAccess().getMethodMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodType();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getMethodMethodTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__MethodAssignment_0"


    // $ANTLR start "rule__RestService__NameAssignment_1"
    // InternalAutomatedRestTesting.g:4321:1: rule__RestService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RestService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4325:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4326:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4326:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4327:3: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__NameAssignment_1"


    // $ANTLR start "rule__RestService__UriAssignment_5"
    // InternalAutomatedRestTesting.g:4336:1: rule__RestService__UriAssignment_5 : ( RULE_SLASH ) ;
    public final void rule__RestService__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4340:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:4341:2: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:4341:2: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:4342:3: RULE_SLASH
            {
             before(grammarAccess.getRestServiceAccess().getUriSLASHTerminalRuleCall_5_0()); 
            match(input,RULE_SLASH,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getUriSLASHTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__UriAssignment_5"


    // $ANTLR start "rule__RestService__ParametersAssignment_7_1"
    // InternalAutomatedRestTesting.g:4351:1: rule__RestService__ParametersAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__RestService__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4355:1: ( ( ruleParameter ) )
            // InternalAutomatedRestTesting.g:4356:2: ( ruleParameter )
            {
            // InternalAutomatedRestTesting.g:4356:2: ( ruleParameter )
            // InternalAutomatedRestTesting.g:4357:3: ruleParameter
            {
             before(grammarAccess.getRestServiceAccess().getParametersParameterParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getParametersParameterParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__ParametersAssignment_7_1"


    // $ANTLR start "rule__RestService__RequestAssignment_9_4"
    // InternalAutomatedRestTesting.g:4366:1: rule__RestService__RequestAssignment_9_4 : ( ( ruleEString ) ) ;
    public final void rule__RestService__RequestAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4370:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4371:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4371:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4372:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0()); 
            // InternalAutomatedRestTesting.g:4373:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4374:4: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementEStringParserRuleCall_9_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getRequestElementEStringParserRuleCall_9_4_0_1()); 

            }

             after(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__RequestAssignment_9_4"


    // $ANTLR start "rule__RestService__ResponseAssignment_14"
    // InternalAutomatedRestTesting.g:4385:1: rule__RestService__ResponseAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__RestService__ResponseAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4389:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4390:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4390:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4391:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0()); 
            // InternalAutomatedRestTesting.g:4392:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4393:4: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getResponseElementEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__ResponseAssignment_14"


    // $ANTLR start "rule__Assertion__DataToTestAssignment_3"
    // InternalAutomatedRestTesting.g:4404:1: rule__Assertion__DataToTestAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assertion__DataToTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4408:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4409:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4409:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4410:3: ( ruleEString )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_3_0()); 
            // InternalAutomatedRestTesting.g:4411:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4412:4: ruleEString
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getDataToTestElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__DataToTestAssignment_3"


    // $ANTLR start "rule__Assertion__ConditionAssignment_5"
    // InternalAutomatedRestTesting.g:4423:1: rule__Assertion__ConditionAssignment_5 : ( ruleExpression ) ;
    public final void rule__Assertion__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4427:1: ( ( ruleExpression ) )
            // InternalAutomatedRestTesting.g:4428:2: ( ruleExpression )
            {
            // InternalAutomatedRestTesting.g:4428:2: ( ruleExpression )
            // InternalAutomatedRestTesting.g:4429:3: ruleExpression
            {
             before(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ConditionAssignment_5"


    // $ANTLR start "rule__Expression__TypeAssignment_3_1"
    // InternalAutomatedRestTesting.g:4438:1: rule__Expression__TypeAssignment_3_1 : ( ruleAttributeType ) ;
    public final void rule__Expression__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4442:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:4443:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:4443:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:4444:3: ruleAttributeType
            {
             before(grammarAccess.getExpressionAccess().getTypeAttributeTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTypeAttributeTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TypeAssignment_3_1"


    // $ANTLR start "rule__Expression__ExpectedValueAssignment_4_1"
    // InternalAutomatedRestTesting.g:4453:1: rule__Expression__ExpectedValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Expression__ExpectedValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4457:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4458:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4458:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4459:3: ruleEString
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpectedValueEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpectedValueAssignment_4_1"


    // $ANTLR start "rule__Expression__RelationalOperatorAssignment_5_1"
    // InternalAutomatedRestTesting.g:4468:1: rule__Expression__RelationalOperatorAssignment_5_1 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4472:1: ( ( ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:4473:2: ( ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:4473:2: ( ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:4474:3: ruleRelationalOperator
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RelationalOperatorAssignment_5_1"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4483:1: rule__Parameter__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4487:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4488:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4488:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4489:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_3"


    // $ANTLR start "rule__Restriction__MockTypeAssignment_3"
    // InternalAutomatedRestTesting.g:4498:1: rule__Restriction__MockTypeAssignment_3 : ( ruleMockTypes ) ;
    public final void rule__Restriction__MockTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4502:1: ( ( ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:4503:2: ( ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:4503:2: ( ruleMockTypes )
            // InternalAutomatedRestTesting.g:4504:3: ruleMockTypes
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeMockTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMockTypes();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getMockTypeMockTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__MockTypeAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalAutomatedRestTesting.g:4513:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4517:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4518:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4518:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4519:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__EntityAttributesAssignment_4"
    // InternalAutomatedRestTesting.g:4528:1: rule__Entity__EntityAttributesAssignment_4 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4532:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:4533:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:4533:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:4534:3: ruleDomainAttribute
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityAttributesAssignment_4"


    // $ANTLR start "rule__Entity__EntityAttributesAssignment_6_0"
    // InternalAutomatedRestTesting.g:4543:1: rule__Entity__EntityAttributesAssignment_6_0 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4547:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:4548:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:4548:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:4549:3: ruleDomainAttribute
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityAttributesAssignment_6_0"


    // $ANTLR start "rule__Attribute_Impl__TypeAssignment_1"
    // InternalAutomatedRestTesting.g:4558:1: rule__Attribute_Impl__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute_Impl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4562:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:4563:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:4563:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:4564:3: ruleAttributeType
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttribute_ImplAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__TypeAssignment_1"


    // $ANTLR start "rule__Attribute_Impl__IsArrayAssignment_2"
    // InternalAutomatedRestTesting.g:4573:1: rule__Attribute_Impl__IsArrayAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__Attribute_Impl__IsArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4577:1: ( ( ( '[]' ) ) )
            // InternalAutomatedRestTesting.g:4578:2: ( ( '[]' ) )
            {
            // InternalAutomatedRestTesting.g:4578:2: ( ( '[]' ) )
            // InternalAutomatedRestTesting.g:4579:3: ( '[]' )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // InternalAutomatedRestTesting.g:4580:3: ( '[]' )
            // InternalAutomatedRestTesting.g:4581:4: '[]'
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__IsArrayAssignment_2"


    // $ANTLR start "rule__Attribute_Impl__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4592:1: rule__Attribute_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4596:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4597:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4597:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4598:3: ruleEString
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute_Impl__NameAssignment_3"


    // $ANTLR start "rule__DomainAttribute__TypeAssignment_1"
    // InternalAutomatedRestTesting.g:4607:1: rule__DomainAttribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__DomainAttribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4611:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:4612:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:4612:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:4613:3: ruleAttributeType
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getDomainAttributeAccess().getTypeAttributeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__TypeAssignment_1"


    // $ANTLR start "rule__DomainAttribute__IsArrayAssignment_2"
    // InternalAutomatedRestTesting.g:4622:1: rule__DomainAttribute__IsArrayAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__DomainAttribute__IsArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4626:1: ( ( ( '[]' ) ) )
            // InternalAutomatedRestTesting.g:4627:2: ( ( '[]' ) )
            {
            // InternalAutomatedRestTesting.g:4627:2: ( ( '[]' ) )
            // InternalAutomatedRestTesting.g:4628:3: ( '[]' )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // InternalAutomatedRestTesting.g:4629:3: ( '[]' )
            // InternalAutomatedRestTesting.g:4630:4: '[]'
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__IsArrayAssignment_2"


    // $ANTLR start "rule__DomainAttribute__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4641:1: rule__DomainAttribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DomainAttribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4645:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4646:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4646:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4647:3: ruleEString
            {
             before(grammarAccess.getDomainAttributeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainAttributeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__NameAssignment_3"


    // $ANTLR start "rule__DomainAttribute__PrimaryKeyAssignment_4_1_0"
    // InternalAutomatedRestTesting.g:4656:1: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 : ( ( 'PK' ) ) ;
    public final void rule__DomainAttribute__PrimaryKeyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4660:1: ( ( ( 'PK' ) ) )
            // InternalAutomatedRestTesting.g:4661:2: ( ( 'PK' ) )
            {
            // InternalAutomatedRestTesting.g:4661:2: ( ( 'PK' ) )
            // InternalAutomatedRestTesting.g:4662:3: ( 'PK' )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            // InternalAutomatedRestTesting.g:4663:3: ( 'PK' )
            // InternalAutomatedRestTesting.g:4664:4: 'PK'
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 

            }

             after(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__PrimaryKeyAssignment_4_1_0"


    // $ANTLR start "rule__DomainAttribute__RestrictionsAssignment_4_2"
    // InternalAutomatedRestTesting.g:4675:1: rule__DomainAttribute__RestrictionsAssignment_4_2 : ( ruleRestriction ) ;
    public final void rule__DomainAttribute__RestrictionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4679:1: ( ( ruleRestriction ) )
            // InternalAutomatedRestTesting.g:4680:2: ( ruleRestriction )
            {
            // InternalAutomatedRestTesting.g:4680:2: ( ruleRestriction )
            // InternalAutomatedRestTesting.g:4681:3: ruleRestriction
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsRestrictionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getDomainAttributeAccess().getRestrictionsRestrictionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainAttribute__RestrictionsAssignment_4_2"


    // $ANTLR start "rule__SimpleEntity__NameAssignment_2"
    // InternalAutomatedRestTesting.g:4690:1: rule__SimpleEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4694:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4695:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4695:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4696:3: ruleEString
            {
             before(grammarAccess.getSimpleEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NameAssignment_2"


    // $ANTLR start "rule__SimpleEntity__EntityAttributesAssignment_4"
    // InternalAutomatedRestTesting.g:4705:1: rule__SimpleEntity__EntityAttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4709:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:4710:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:4710:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:4711:3: ruleAttribute
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__EntityAttributesAssignment_4"


    // $ANTLR start "rule__SimpleEntity__EntityAttributesAssignment_6_0"
    // InternalAutomatedRestTesting.g:4720:1: rule__SimpleEntity__EntityAttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4724:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:4725:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:4725:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:4726:3: ruleAttribute
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__EntityAttributesAssignment_6_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020007800000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002880L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000200L,0x000000000000000EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000007F8000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000FFF8000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000007C00200L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000400L});

}