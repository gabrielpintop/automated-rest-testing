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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_SLASH", "RULE_ARROW", "RULE_TWO_DOTS", "RULE_QUESTION_MARK", "RULE_MONEY", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_COMMA", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'", "'apiURL'", "'Test'", "'service'", "'Assertions'", "'description'", "'URL'", "'Response'", "'Type'", "'Request'", "'['", "']'", "'response'", "'mockType'", "'Entity'", "'SimpleEntity'", "'PK'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=11;
    public static final int RULE_LEFT_PARENTHESIS=15;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=6;
    public static final int RULE_COMMA=17;
    public static final int RULE_SLASH=10;
    public static final int T__26=26;
    public static final int RULE_TWO_DOTS=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_MONEY=14;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=7;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=20;
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
    public static final int RULE_WS=21;
    public static final int RULE_LEFT_BRACKET=8;
    public static final int RULE_ANY_OTHER=22;
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

            if ( (LA1_0==66) ) {
                alt1=1;
            }
            else if ( (LA1_0==67) ) {
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
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
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
                    match(input,23,FOLLOW_2); 

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
                    match(input,24,FOLLOW_2); 

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
                    match(input,25,FOLLOW_2); 

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
                    match(input,26,FOLLOW_2); 

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
                    match(input,27,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:589:1: rule__RelationalOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:593:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 32:
                {
                alt6=5;
                }
                break;
            case 33:
                {
                alt6=6;
                }
                break;
            case 34:
                {
                alt6=7;
                }
                break;
            case 35:
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
                    // InternalAutomatedRestTesting.g:594:2: ( ( '<' ) )
                    {
                    // InternalAutomatedRestTesting.g:594:2: ( ( '<' ) )
                    // InternalAutomatedRestTesting.g:595:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:596:3: ( '<' )
                    // InternalAutomatedRestTesting.g:596:4: '<'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:600:2: ( ( '<=' ) )
                    {
                    // InternalAutomatedRestTesting.g:600:2: ( ( '<=' ) )
                    // InternalAutomatedRestTesting.g:601:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:602:3: ( '<=' )
                    // InternalAutomatedRestTesting.g:602:4: '<='
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:606:2: ( ( '==' ) )
                    {
                    // InternalAutomatedRestTesting.g:606:2: ( ( '==' ) )
                    // InternalAutomatedRestTesting.g:607:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:608:3: ( '==' )
                    // InternalAutomatedRestTesting.g:608:4: '=='
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:612:2: ( ( '!=' ) )
                    {
                    // InternalAutomatedRestTesting.g:612:2: ( ( '!=' ) )
                    // InternalAutomatedRestTesting.g:613:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:614:3: ( '!=' )
                    // InternalAutomatedRestTesting.g:614:4: '!='
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:618:2: ( ( '>=' ) )
                    {
                    // InternalAutomatedRestTesting.g:618:2: ( ( '>=' ) )
                    // InternalAutomatedRestTesting.g:619:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:620:3: ( '>=' )
                    // InternalAutomatedRestTesting.g:620:4: '>='
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:624:2: ( ( '>' ) )
                    {
                    // InternalAutomatedRestTesting.g:624:2: ( ( '>' ) )
                    // InternalAutomatedRestTesting.g:625:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:626:3: ( '>' )
                    // InternalAutomatedRestTesting.g:626:4: '>'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:630:2: ( ( '&&' ) )
                    {
                    // InternalAutomatedRestTesting.g:630:2: ( ( '&&' ) )
                    // InternalAutomatedRestTesting.g:631:3: ( '&&' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:632:3: ( '&&' )
                    // InternalAutomatedRestTesting.g:632:4: '&&'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:636:2: ( ( '||' ) )
                    {
                    // InternalAutomatedRestTesting.g:636:2: ( ( '||' ) )
                    // InternalAutomatedRestTesting.g:637:3: ( '||' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:638:3: ( '||' )
                    // InternalAutomatedRestTesting.g:638:4: '||'
                    {
                    match(input,35,FOLLOW_2); 

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
            case 36:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 39:
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
                    match(input,36,FOLLOW_2); 

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
                    match(input,37,FOLLOW_2); 

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
                    match(input,38,FOLLOW_2); 

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
                    match(input,39,FOLLOW_2); 

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
            case 40:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            case 43:
                {
                alt8=4;
                }
                break;
            case 44:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            case 46:
                {
                alt8=7;
                }
                break;
            case 47:
                {
                alt8=8;
                }
                break;
            case 48:
                {
                alt8=9;
                }
                break;
            case 49:
                {
                alt8=10;
                }
                break;
            case 50:
                {
                alt8=11;
                }
                break;
            case 51:
                {
                alt8=12;
                }
                break;
            case 52:
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
                    match(input,40,FOLLOW_2); 

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
                    match(input,41,FOLLOW_2); 

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
                    match(input,42,FOLLOW_2); 

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
                    match(input,43,FOLLOW_2); 

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
                    match(input,44,FOLLOW_2); 

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
                    match(input,45,FOLLOW_2); 

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
                    match(input,46,FOLLOW_2); 

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
                    match(input,47,FOLLOW_2); 

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
                    match(input,48,FOLLOW_2); 

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
                    match(input,49,FOLLOW_2); 

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
                    match(input,50,FOLLOW_2); 

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
                    match(input,51,FOLLOW_2); 

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
                    match(input,52,FOLLOW_2); 

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
            match(input,53,FOLLOW_2); 
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

            if ( ((LA9_0>=66 && LA9_0<=67)) ) {
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

            if ( ((LA10_0>=36 && LA10_0<=39)) ) {
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

            if ( (LA11_0==54) ) {
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

                if ( ((LA12_0>=66 && LA12_0<=67)) ) {
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

                if ( ((LA13_0>=36 && LA13_0<=39)) ) {
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

                if ( (LA14_0==54) ) {
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
            match(input,54,FOLLOW_2); 
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
            pushFollow(FOLLOW_4);
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
    // InternalAutomatedRestTesting.g:1237:1: rule__Test__Group__3__Impl : ( 'service' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1241:1: ( ( 'service' ) )
            // InternalAutomatedRestTesting.g:1242:1: ( 'service' )
            {
            // InternalAutomatedRestTesting.g:1242:1: ( 'service' )
            // InternalAutomatedRestTesting.g:1243:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceKeyword_3()); 

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
            pushFollow(FOLLOW_5);
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
    // InternalAutomatedRestTesting.g:1264:1: rule__Test__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1268:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1269:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1269:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1270:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_4()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_4()); 

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
            pushFollow(FOLLOW_6);
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
    // InternalAutomatedRestTesting.g:1291:1: rule__Test__Group__5__Impl : ( ( rule__Test__ServiceAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1295:1: ( ( ( rule__Test__ServiceAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1296:1: ( ( rule__Test__ServiceAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1296:1: ( ( rule__Test__ServiceAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1297:2: ( rule__Test__ServiceAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_5()); 
            // InternalAutomatedRestTesting.g:1298:2: ( rule__Test__ServiceAssignment_5 )
            // InternalAutomatedRestTesting.g:1298:3: rule__Test__ServiceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Test__ServiceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getServiceAssignment_5()); 

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
            pushFollow(FOLLOW_16);
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
    // InternalAutomatedRestTesting.g:1318:1: rule__Test__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1322:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1323:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1323:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1324:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_6()); 

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
            pushFollow(FOLLOW_16);
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
    // InternalAutomatedRestTesting.g:1345:1: rule__Test__Group__7__Impl : ( ( rule__Test__Group_7__0 )? ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1349:1: ( ( ( rule__Test__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:1350:1: ( ( rule__Test__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:1350:1: ( ( rule__Test__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:1351:2: ( rule__Test__Group_7__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1352:2: ( rule__Test__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1352:3: rule__Test__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

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
            pushFollow(FOLLOW_14);
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
    // InternalAutomatedRestTesting.g:1372:1: rule__Test__Group__8__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1376:1: ( ( 'Assertions' ) )
            // InternalAutomatedRestTesting.g:1377:1: ( 'Assertions' )
            {
            // InternalAutomatedRestTesting.g:1377:1: ( 'Assertions' )
            // InternalAutomatedRestTesting.g:1378:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_8()); 

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
    // InternalAutomatedRestTesting.g:1387:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1391:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAutomatedRestTesting.g:1392:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

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
    // InternalAutomatedRestTesting.g:1399:1: rule__Test__Group__9__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1403:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1404:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1404:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1405:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_9()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_9()); 

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


    // $ANTLR start "rule__Test__Group__10"
    // InternalAutomatedRestTesting.g:1414:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1418:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAutomatedRestTesting.g:1419:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

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
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalAutomatedRestTesting.g:1426:1: rule__Test__Group__10__Impl : ( ( ( rule__Test__Group_10__0 ) ) ( ( rule__Test__Group_10__0 )* ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1430:1: ( ( ( ( rule__Test__Group_10__0 ) ) ( ( rule__Test__Group_10__0 )* ) ) )
            // InternalAutomatedRestTesting.g:1431:1: ( ( ( rule__Test__Group_10__0 ) ) ( ( rule__Test__Group_10__0 )* ) )
            {
            // InternalAutomatedRestTesting.g:1431:1: ( ( ( rule__Test__Group_10__0 ) ) ( ( rule__Test__Group_10__0 )* ) )
            // InternalAutomatedRestTesting.g:1432:2: ( ( rule__Test__Group_10__0 ) ) ( ( rule__Test__Group_10__0 )* )
            {
            // InternalAutomatedRestTesting.g:1432:2: ( ( rule__Test__Group_10__0 ) )
            // InternalAutomatedRestTesting.g:1433:3: ( rule__Test__Group_10__0 )
            {
             before(grammarAccess.getTestAccess().getGroup_10()); 
            // InternalAutomatedRestTesting.g:1434:3: ( rule__Test__Group_10__0 )
            // InternalAutomatedRestTesting.g:1434:4: rule__Test__Group_10__0
            {
            pushFollow(FOLLOW_19);
            rule__Test__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup_10()); 

            }

            // InternalAutomatedRestTesting.g:1437:2: ( ( rule__Test__Group_10__0 )* )
            // InternalAutomatedRestTesting.g:1438:3: ( rule__Test__Group_10__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_10()); 
            // InternalAutomatedRestTesting.g:1439:3: ( rule__Test__Group_10__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==64) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1439:4: rule__Test__Group_10__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Test__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_10()); 

            }


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
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalAutomatedRestTesting.g:1448:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1452:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAutomatedRestTesting.g:1453:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

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
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalAutomatedRestTesting.g:1460:1: rule__Test__Group__11__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1464:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1465:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1465:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1466:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_11()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalAutomatedRestTesting.g:1475:1: rule__Test__Group__12 : rule__Test__Group__12__Impl ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1479:1: ( rule__Test__Group__12__Impl )
            // InternalAutomatedRestTesting.g:1480:2: rule__Test__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__12__Impl();

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
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalAutomatedRestTesting.g:1486:1: rule__Test__Group__12__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1490:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1491:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1491:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1492:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_12()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_12()); 

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
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__Test__Group_7__0"
    // InternalAutomatedRestTesting.g:1502:1: rule__Test__Group_7__0 : rule__Test__Group_7__0__Impl rule__Test__Group_7__1 ;
    public final void rule__Test__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1506:1: ( rule__Test__Group_7__0__Impl rule__Test__Group_7__1 )
            // InternalAutomatedRestTesting.g:1507:2: rule__Test__Group_7__0__Impl rule__Test__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalAutomatedRestTesting.g:1514:1: rule__Test__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1518:1: ( ( 'description' ) )
            // InternalAutomatedRestTesting.g:1519:1: ( 'description' )
            {
            // InternalAutomatedRestTesting.g:1519:1: ( 'description' )
            // InternalAutomatedRestTesting.g:1520:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_7_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_7_0()); 

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
    // InternalAutomatedRestTesting.g:1529:1: rule__Test__Group_7__1 : rule__Test__Group_7__1__Impl rule__Test__Group_7__2 ;
    public final void rule__Test__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1533:1: ( rule__Test__Group_7__1__Impl rule__Test__Group_7__2 )
            // InternalAutomatedRestTesting.g:1534:2: rule__Test__Group_7__1__Impl rule__Test__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_7__2();

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
    // InternalAutomatedRestTesting.g:1541:1: rule__Test__Group_7__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1545:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1546:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1546:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1547:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_7_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_7_1()); 

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


    // $ANTLR start "rule__Test__Group_7__2"
    // InternalAutomatedRestTesting.g:1556:1: rule__Test__Group_7__2 : rule__Test__Group_7__2__Impl rule__Test__Group_7__3 ;
    public final void rule__Test__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1560:1: ( rule__Test__Group_7__2__Impl rule__Test__Group_7__3 )
            // InternalAutomatedRestTesting.g:1561:2: rule__Test__Group_7__2__Impl rule__Test__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_7__3();

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
    // $ANTLR end "rule__Test__Group_7__2"


    // $ANTLR start "rule__Test__Group_7__2__Impl"
    // InternalAutomatedRestTesting.g:1568:1: rule__Test__Group_7__2__Impl : ( ( rule__Test__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Test__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1572:1: ( ( ( rule__Test__DescriptionAssignment_7_2 ) ) )
            // InternalAutomatedRestTesting.g:1573:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            {
            // InternalAutomatedRestTesting.g:1573:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            // InternalAutomatedRestTesting.g:1574:2: ( rule__Test__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_7_2()); 
            // InternalAutomatedRestTesting.g:1575:2: ( rule__Test__DescriptionAssignment_7_2 )
            // InternalAutomatedRestTesting.g:1575:3: rule__Test__DescriptionAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescriptionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescriptionAssignment_7_2()); 

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
    // $ANTLR end "rule__Test__Group_7__2__Impl"


    // $ANTLR start "rule__Test__Group_7__3"
    // InternalAutomatedRestTesting.g:1583:1: rule__Test__Group_7__3 : rule__Test__Group_7__3__Impl ;
    public final void rule__Test__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1587:1: ( rule__Test__Group_7__3__Impl )
            // InternalAutomatedRestTesting.g:1588:2: rule__Test__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_7__3__Impl();

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
    // $ANTLR end "rule__Test__Group_7__3"


    // $ANTLR start "rule__Test__Group_7__3__Impl"
    // InternalAutomatedRestTesting.g:1594:1: rule__Test__Group_7__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1598:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1599:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1599:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1600:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7_3()); 

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
    // $ANTLR end "rule__Test__Group_7__3__Impl"


    // $ANTLR start "rule__Test__Group_10__0"
    // InternalAutomatedRestTesting.g:1610:1: rule__Test__Group_10__0 : rule__Test__Group_10__0__Impl rule__Test__Group_10__1 ;
    public final void rule__Test__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1614:1: ( rule__Test__Group_10__0__Impl rule__Test__Group_10__1 )
            // InternalAutomatedRestTesting.g:1615:2: rule__Test__Group_10__0__Impl rule__Test__Group_10__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_10__1();

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
    // $ANTLR end "rule__Test__Group_10__0"


    // $ANTLR start "rule__Test__Group_10__0__Impl"
    // InternalAutomatedRestTesting.g:1622:1: rule__Test__Group_10__0__Impl : ( ( rule__Test__AssertionsAssignment_10_0 ) ) ;
    public final void rule__Test__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1626:1: ( ( ( rule__Test__AssertionsAssignment_10_0 ) ) )
            // InternalAutomatedRestTesting.g:1627:1: ( ( rule__Test__AssertionsAssignment_10_0 ) )
            {
            // InternalAutomatedRestTesting.g:1627:1: ( ( rule__Test__AssertionsAssignment_10_0 ) )
            // InternalAutomatedRestTesting.g:1628:2: ( rule__Test__AssertionsAssignment_10_0 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_10_0()); 
            // InternalAutomatedRestTesting.g:1629:2: ( rule__Test__AssertionsAssignment_10_0 )
            // InternalAutomatedRestTesting.g:1629:3: rule__Test__AssertionsAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Test__AssertionsAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAssertionsAssignment_10_0()); 

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
    // $ANTLR end "rule__Test__Group_10__0__Impl"


    // $ANTLR start "rule__Test__Group_10__1"
    // InternalAutomatedRestTesting.g:1637:1: rule__Test__Group_10__1 : rule__Test__Group_10__1__Impl ;
    public final void rule__Test__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1641:1: ( rule__Test__Group_10__1__Impl )
            // InternalAutomatedRestTesting.g:1642:2: rule__Test__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_10__1__Impl();

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
    // $ANTLR end "rule__Test__Group_10__1"


    // $ANTLR start "rule__Test__Group_10__1__Impl"
    // InternalAutomatedRestTesting.g:1648:1: rule__Test__Group_10__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1652:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1653:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1653:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1654:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_10_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_10_1()); 

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
    // $ANTLR end "rule__Test__Group_10__1__Impl"


    // $ANTLR start "rule__RestService__Group__0"
    // InternalAutomatedRestTesting.g:1664:1: rule__RestService__Group__0 : rule__RestService__Group__0__Impl rule__RestService__Group__1 ;
    public final void rule__RestService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1668:1: ( rule__RestService__Group__0__Impl rule__RestService__Group__1 )
            // InternalAutomatedRestTesting.g:1669:2: rule__RestService__Group__0__Impl rule__RestService__Group__1
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
    // InternalAutomatedRestTesting.g:1676:1: rule__RestService__Group__0__Impl : ( ( rule__RestService__MethodAssignment_0 ) ) ;
    public final void rule__RestService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1680:1: ( ( ( rule__RestService__MethodAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:1681:1: ( ( rule__RestService__MethodAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:1681:1: ( ( rule__RestService__MethodAssignment_0 ) )
            // InternalAutomatedRestTesting.g:1682:2: ( rule__RestService__MethodAssignment_0 )
            {
             before(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 
            // InternalAutomatedRestTesting.g:1683:2: ( rule__RestService__MethodAssignment_0 )
            // InternalAutomatedRestTesting.g:1683:3: rule__RestService__MethodAssignment_0
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
    // InternalAutomatedRestTesting.g:1691:1: rule__RestService__Group__1 : rule__RestService__Group__1__Impl rule__RestService__Group__2 ;
    public final void rule__RestService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1695:1: ( rule__RestService__Group__1__Impl rule__RestService__Group__2 )
            // InternalAutomatedRestTesting.g:1696:2: rule__RestService__Group__1__Impl rule__RestService__Group__2
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
    // InternalAutomatedRestTesting.g:1703:1: rule__RestService__Group__1__Impl : ( ( rule__RestService__NameAssignment_1 ) ) ;
    public final void rule__RestService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1707:1: ( ( ( rule__RestService__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1708:1: ( ( rule__RestService__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1708:1: ( ( rule__RestService__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1709:2: ( rule__RestService__NameAssignment_1 )
            {
             before(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1710:2: ( rule__RestService__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1710:3: rule__RestService__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:1718:1: rule__RestService__Group__2 : rule__RestService__Group__2__Impl rule__RestService__Group__3 ;
    public final void rule__RestService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1722:1: ( rule__RestService__Group__2__Impl rule__RestService__Group__3 )
            // InternalAutomatedRestTesting.g:1723:2: rule__RestService__Group__2__Impl rule__RestService__Group__3
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
    // InternalAutomatedRestTesting.g:1730:1: rule__RestService__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1734:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1735:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1735:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1736:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1745:1: rule__RestService__Group__3 : rule__RestService__Group__3__Impl rule__RestService__Group__4 ;
    public final void rule__RestService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1749:1: ( rule__RestService__Group__3__Impl rule__RestService__Group__4 )
            // InternalAutomatedRestTesting.g:1750:2: rule__RestService__Group__3__Impl rule__RestService__Group__4
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
    // InternalAutomatedRestTesting.g:1757:1: rule__RestService__Group__3__Impl : ( 'URL' ) ;
    public final void rule__RestService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1761:1: ( ( 'URL' ) )
            // InternalAutomatedRestTesting.g:1762:1: ( 'URL' )
            {
            // InternalAutomatedRestTesting.g:1762:1: ( 'URL' )
            // InternalAutomatedRestTesting.g:1763:2: 'URL'
            {
             before(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1772:1: rule__RestService__Group__4 : rule__RestService__Group__4__Impl rule__RestService__Group__5 ;
    public final void rule__RestService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1776:1: ( rule__RestService__Group__4__Impl rule__RestService__Group__5 )
            // InternalAutomatedRestTesting.g:1777:2: rule__RestService__Group__4__Impl rule__RestService__Group__5
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
    // InternalAutomatedRestTesting.g:1784:1: rule__RestService__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1788:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1789:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1789:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1790:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1799:1: rule__RestService__Group__5 : rule__RestService__Group__5__Impl rule__RestService__Group__6 ;
    public final void rule__RestService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1803:1: ( rule__RestService__Group__5__Impl rule__RestService__Group__6 )
            // InternalAutomatedRestTesting.g:1804:2: rule__RestService__Group__5__Impl rule__RestService__Group__6
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
    // InternalAutomatedRestTesting.g:1811:1: rule__RestService__Group__5__Impl : ( ( rule__RestService__UriAssignment_5 ) ) ;
    public final void rule__RestService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1815:1: ( ( ( rule__RestService__UriAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1816:1: ( ( rule__RestService__UriAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1816:1: ( ( rule__RestService__UriAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1817:2: ( rule__RestService__UriAssignment_5 )
            {
             before(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 
            // InternalAutomatedRestTesting.g:1818:2: ( rule__RestService__UriAssignment_5 )
            // InternalAutomatedRestTesting.g:1818:3: rule__RestService__UriAssignment_5
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
    // InternalAutomatedRestTesting.g:1826:1: rule__RestService__Group__6 : rule__RestService__Group__6__Impl rule__RestService__Group__7 ;
    public final void rule__RestService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1830:1: ( rule__RestService__Group__6__Impl rule__RestService__Group__7 )
            // InternalAutomatedRestTesting.g:1831:2: rule__RestService__Group__6__Impl rule__RestService__Group__7
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
    // InternalAutomatedRestTesting.g:1838:1: rule__RestService__Group__6__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1842:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1843:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1843:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1844:2: ruleEString
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
    // InternalAutomatedRestTesting.g:1853:1: rule__RestService__Group__7 : rule__RestService__Group__7__Impl rule__RestService__Group__8 ;
    public final void rule__RestService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1857:1: ( rule__RestService__Group__7__Impl rule__RestService__Group__8 )
            // InternalAutomatedRestTesting.g:1858:2: rule__RestService__Group__7__Impl rule__RestService__Group__8
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
    // InternalAutomatedRestTesting.g:1865:1: rule__RestService__Group__7__Impl : ( ( rule__RestService__Alternatives_7 )* ) ;
    public final void rule__RestService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1869:1: ( ( ( rule__RestService__Alternatives_7 )* ) )
            // InternalAutomatedRestTesting.g:1870:1: ( ( rule__RestService__Alternatives_7 )* )
            {
            // InternalAutomatedRestTesting.g:1870:1: ( ( rule__RestService__Alternatives_7 )* )
            // InternalAutomatedRestTesting.g:1871:2: ( rule__RestService__Alternatives_7 )*
            {
             before(grammarAccess.getRestServiceAccess().getAlternatives_7()); 
            // InternalAutomatedRestTesting.g:1872:2: ( rule__RestService__Alternatives_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SLASH||LA17_0==RULE_QUESTION_MARK) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1872:3: rule__RestService__Alternatives_7
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
    // InternalAutomatedRestTesting.g:1880:1: rule__RestService__Group__8 : rule__RestService__Group__8__Impl rule__RestService__Group__9 ;
    public final void rule__RestService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1884:1: ( rule__RestService__Group__8__Impl rule__RestService__Group__9 )
            // InternalAutomatedRestTesting.g:1885:2: rule__RestService__Group__8__Impl rule__RestService__Group__9
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
    // InternalAutomatedRestTesting.g:1892:1: rule__RestService__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1896:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1897:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1897:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1898:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1907:1: rule__RestService__Group__9 : rule__RestService__Group__9__Impl rule__RestService__Group__10 ;
    public final void rule__RestService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1911:1: ( rule__RestService__Group__9__Impl rule__RestService__Group__10 )
            // InternalAutomatedRestTesting.g:1912:2: rule__RestService__Group__9__Impl rule__RestService__Group__10
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
    // InternalAutomatedRestTesting.g:1919:1: rule__RestService__Group__9__Impl : ( ( rule__RestService__Group_9__0 )? ) ;
    public final void rule__RestService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1923:1: ( ( ( rule__RestService__Group_9__0 )? ) )
            // InternalAutomatedRestTesting.g:1924:1: ( ( rule__RestService__Group_9__0 )? )
            {
            // InternalAutomatedRestTesting.g:1924:1: ( ( rule__RestService__Group_9__0 )? )
            // InternalAutomatedRestTesting.g:1925:2: ( rule__RestService__Group_9__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9()); 
            // InternalAutomatedRestTesting.g:1926:2: ( rule__RestService__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==61) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1926:3: rule__RestService__Group_9__0
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
    // InternalAutomatedRestTesting.g:1934:1: rule__RestService__Group__10 : rule__RestService__Group__10__Impl rule__RestService__Group__11 ;
    public final void rule__RestService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1938:1: ( rule__RestService__Group__10__Impl rule__RestService__Group__11 )
            // InternalAutomatedRestTesting.g:1939:2: rule__RestService__Group__10__Impl rule__RestService__Group__11
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
    // InternalAutomatedRestTesting.g:1946:1: rule__RestService__Group__10__Impl : ( 'Response' ) ;
    public final void rule__RestService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1950:1: ( ( 'Response' ) )
            // InternalAutomatedRestTesting.g:1951:1: ( 'Response' )
            {
            // InternalAutomatedRestTesting.g:1951:1: ( 'Response' )
            // InternalAutomatedRestTesting.g:1952:2: 'Response'
            {
             before(grammarAccess.getRestServiceAccess().getResponseKeyword_10()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1961:1: rule__RestService__Group__11 : rule__RestService__Group__11__Impl rule__RestService__Group__12 ;
    public final void rule__RestService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1965:1: ( rule__RestService__Group__11__Impl rule__RestService__Group__12 )
            // InternalAutomatedRestTesting.g:1966:2: rule__RestService__Group__11__Impl rule__RestService__Group__12
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
    // InternalAutomatedRestTesting.g:1973:1: rule__RestService__Group__11__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1977:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1978:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1978:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1979:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1988:1: rule__RestService__Group__12 : rule__RestService__Group__12__Impl rule__RestService__Group__13 ;
    public final void rule__RestService__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1992:1: ( rule__RestService__Group__12__Impl rule__RestService__Group__13 )
            // InternalAutomatedRestTesting.g:1993:2: rule__RestService__Group__12__Impl rule__RestService__Group__13
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
    // InternalAutomatedRestTesting.g:2000:1: rule__RestService__Group__12__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2004:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2005:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2005:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2006:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_12()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2015:1: rule__RestService__Group__13 : rule__RestService__Group__13__Impl rule__RestService__Group__14 ;
    public final void rule__RestService__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2019:1: ( rule__RestService__Group__13__Impl rule__RestService__Group__14 )
            // InternalAutomatedRestTesting.g:2020:2: rule__RestService__Group__13__Impl rule__RestService__Group__14
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
    // InternalAutomatedRestTesting.g:2027:1: rule__RestService__Group__13__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2031:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2032:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2032:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2033:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2042:1: rule__RestService__Group__14 : rule__RestService__Group__14__Impl rule__RestService__Group__15 ;
    public final void rule__RestService__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2046:1: ( rule__RestService__Group__14__Impl rule__RestService__Group__15 )
            // InternalAutomatedRestTesting.g:2047:2: rule__RestService__Group__14__Impl rule__RestService__Group__15
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
    // InternalAutomatedRestTesting.g:2054:1: rule__RestService__Group__14__Impl : ( ( rule__RestService__ResponseAssignment_14 ) ) ;
    public final void rule__RestService__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2058:1: ( ( ( rule__RestService__ResponseAssignment_14 ) ) )
            // InternalAutomatedRestTesting.g:2059:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            {
            // InternalAutomatedRestTesting.g:2059:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            // InternalAutomatedRestTesting.g:2060:2: ( rule__RestService__ResponseAssignment_14 )
            {
             before(grammarAccess.getRestServiceAccess().getResponseAssignment_14()); 
            // InternalAutomatedRestTesting.g:2061:2: ( rule__RestService__ResponseAssignment_14 )
            // InternalAutomatedRestTesting.g:2061:3: rule__RestService__ResponseAssignment_14
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
    // InternalAutomatedRestTesting.g:2069:1: rule__RestService__Group__15 : rule__RestService__Group__15__Impl rule__RestService__Group__16 ;
    public final void rule__RestService__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2073:1: ( rule__RestService__Group__15__Impl rule__RestService__Group__16 )
            // InternalAutomatedRestTesting.g:2074:2: rule__RestService__Group__15__Impl rule__RestService__Group__16
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
    // InternalAutomatedRestTesting.g:2081:1: rule__RestService__Group__15__Impl : ( ( rule__RestService__Group_15__0 )? ) ;
    public final void rule__RestService__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2085:1: ( ( ( rule__RestService__Group_15__0 )? ) )
            // InternalAutomatedRestTesting.g:2086:1: ( ( rule__RestService__Group_15__0 )? )
            {
            // InternalAutomatedRestTesting.g:2086:1: ( ( rule__RestService__Group_15__0 )? )
            // InternalAutomatedRestTesting.g:2087:2: ( rule__RestService__Group_15__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_15()); 
            // InternalAutomatedRestTesting.g:2088:2: ( rule__RestService__Group_15__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2088:3: rule__RestService__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_15()); 

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
    // InternalAutomatedRestTesting.g:2096:1: rule__RestService__Group__16 : rule__RestService__Group__16__Impl rule__RestService__Group__17 ;
    public final void rule__RestService__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2100:1: ( rule__RestService__Group__16__Impl rule__RestService__Group__17 )
            // InternalAutomatedRestTesting.g:2101:2: rule__RestService__Group__16__Impl rule__RestService__Group__17
            {
            pushFollow(FOLLOW_18);
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
    // InternalAutomatedRestTesting.g:2108:1: rule__RestService__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2112:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2113:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2113:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2114:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2123:1: rule__RestService__Group__17 : rule__RestService__Group__17__Impl rule__RestService__Group__18 ;
    public final void rule__RestService__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2127:1: ( rule__RestService__Group__17__Impl rule__RestService__Group__18 )
            // InternalAutomatedRestTesting.g:2128:2: rule__RestService__Group__17__Impl rule__RestService__Group__18
            {
            pushFollow(FOLLOW_18);
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
    // InternalAutomatedRestTesting.g:2135:1: rule__RestService__Group__17__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2139:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2140:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2140:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2141:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2150:1: rule__RestService__Group__18 : rule__RestService__Group__18__Impl ;
    public final void rule__RestService__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2154:1: ( rule__RestService__Group__18__Impl )
            // InternalAutomatedRestTesting.g:2155:2: rule__RestService__Group__18__Impl
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
    // InternalAutomatedRestTesting.g:2161:1: rule__RestService__Group__18__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2165:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2166:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2166:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2167:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2177:1: rule__RestService__Group_7_0__0 : rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 ;
    public final void rule__RestService__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2181:1: ( rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 )
            // InternalAutomatedRestTesting.g:2182:2: rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1
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
    // InternalAutomatedRestTesting.g:2189:1: rule__RestService__Group_7_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__RestService__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2193:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:2194:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:2194:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:2195:2: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:2204:1: rule__RestService__Group_7_0__1 : rule__RestService__Group_7_0__1__Impl ;
    public final void rule__RestService__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2208:1: ( rule__RestService__Group_7_0__1__Impl )
            // InternalAutomatedRestTesting.g:2209:2: rule__RestService__Group_7_0__1__Impl
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
    // InternalAutomatedRestTesting.g:2215:1: rule__RestService__Group_7_0__1__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2219:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:2220:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:2220:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:2221:2: ruleEString
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
    // InternalAutomatedRestTesting.g:2231:1: rule__RestService__Group_9__0 : rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 ;
    public final void rule__RestService__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2235:1: ( rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 )
            // InternalAutomatedRestTesting.g:2236:2: rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1
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
    // InternalAutomatedRestTesting.g:2243:1: rule__RestService__Group_9__0__Impl : ( 'Request' ) ;
    public final void rule__RestService__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2247:1: ( ( 'Request' ) )
            // InternalAutomatedRestTesting.g:2248:1: ( 'Request' )
            {
            // InternalAutomatedRestTesting.g:2248:1: ( 'Request' )
            // InternalAutomatedRestTesting.g:2249:2: 'Request'
            {
             before(grammarAccess.getRestServiceAccess().getRequestKeyword_9_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2258:1: rule__RestService__Group_9__1 : rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 ;
    public final void rule__RestService__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2262:1: ( rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 )
            // InternalAutomatedRestTesting.g:2263:2: rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2
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
    // InternalAutomatedRestTesting.g:2270:1: rule__RestService__Group_9__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2274:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2275:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2275:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2276:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2285:1: rule__RestService__Group_9__2 : rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 ;
    public final void rule__RestService__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2289:1: ( rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 )
            // InternalAutomatedRestTesting.g:2290:2: rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3
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
    // InternalAutomatedRestTesting.g:2297:1: rule__RestService__Group_9__2__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2301:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2302:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2302:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2303:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_9_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2312:1: rule__RestService__Group_9__3 : rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 ;
    public final void rule__RestService__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2316:1: ( rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 )
            // InternalAutomatedRestTesting.g:2317:2: rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4
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
    // InternalAutomatedRestTesting.g:2324:1: rule__RestService__Group_9__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2328:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2329:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2329:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2330:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2339:1: rule__RestService__Group_9__4 : rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 ;
    public final void rule__RestService__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2343:1: ( rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 )
            // InternalAutomatedRestTesting.g:2344:2: rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5
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
    // InternalAutomatedRestTesting.g:2351:1: rule__RestService__Group_9__4__Impl : ( ( rule__RestService__RequestAssignment_9_4 ) ) ;
    public final void rule__RestService__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2355:1: ( ( ( rule__RestService__RequestAssignment_9_4 ) ) )
            // InternalAutomatedRestTesting.g:2356:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            {
            // InternalAutomatedRestTesting.g:2356:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            // InternalAutomatedRestTesting.g:2357:2: ( rule__RestService__RequestAssignment_9_4 )
            {
             before(grammarAccess.getRestServiceAccess().getRequestAssignment_9_4()); 
            // InternalAutomatedRestTesting.g:2358:2: ( rule__RestService__RequestAssignment_9_4 )
            // InternalAutomatedRestTesting.g:2358:3: rule__RestService__RequestAssignment_9_4
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
    // InternalAutomatedRestTesting.g:2366:1: rule__RestService__Group_9__5 : rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 ;
    public final void rule__RestService__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2370:1: ( rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 )
            // InternalAutomatedRestTesting.g:2371:2: rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6
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
    // InternalAutomatedRestTesting.g:2378:1: rule__RestService__Group_9__5__Impl : ( ( rule__RestService__Group_9_5__0 )? ) ;
    public final void rule__RestService__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2382:1: ( ( ( rule__RestService__Group_9_5__0 )? ) )
            // InternalAutomatedRestTesting.g:2383:1: ( ( rule__RestService__Group_9_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:2383:1: ( ( rule__RestService__Group_9_5__0 )? )
            // InternalAutomatedRestTesting.g:2384:2: ( rule__RestService__Group_9_5__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9_5()); 
            // InternalAutomatedRestTesting.g:2385:2: ( rule__RestService__Group_9_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2385:3: rule__RestService__Group_9_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_9_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_9_5()); 

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
    // InternalAutomatedRestTesting.g:2393:1: rule__RestService__Group_9__6 : rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 ;
    public final void rule__RestService__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2397:1: ( rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 )
            // InternalAutomatedRestTesting.g:2398:2: rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalAutomatedRestTesting.g:2405:1: rule__RestService__Group_9__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2409:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2410:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2410:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2411:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2420:1: rule__RestService__Group_9__7 : rule__RestService__Group_9__7__Impl ;
    public final void rule__RestService__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2424:1: ( rule__RestService__Group_9__7__Impl )
            // InternalAutomatedRestTesting.g:2425:2: rule__RestService__Group_9__7__Impl
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
    // InternalAutomatedRestTesting.g:2431:1: rule__RestService__Group_9__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2435:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2436:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2436:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2437:2: RULE_RIGHT_BRACKET
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


    // $ANTLR start "rule__RestService__Group_9_5__0"
    // InternalAutomatedRestTesting.g:2447:1: rule__RestService__Group_9_5__0 : rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 ;
    public final void rule__RestService__Group_9_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2451:1: ( rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 )
            // InternalAutomatedRestTesting.g:2452:2: rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1
            {
            pushFollow(FOLLOW_27);
            rule__RestService__Group_9_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_9_5__1();

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
    // $ANTLR end "rule__RestService__Group_9_5__0"


    // $ANTLR start "rule__RestService__Group_9_5__0__Impl"
    // InternalAutomatedRestTesting.g:2459:1: rule__RestService__Group_9_5__0__Impl : ( '[' ) ;
    public final void rule__RestService__Group_9_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2463:1: ( ( '[' ) )
            // InternalAutomatedRestTesting.g:2464:1: ( '[' )
            {
            // InternalAutomatedRestTesting.g:2464:1: ( '[' )
            // InternalAutomatedRestTesting.g:2465:2: '['
            {
             before(grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_9_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_9_5_0()); 

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
    // $ANTLR end "rule__RestService__Group_9_5__0__Impl"


    // $ANTLR start "rule__RestService__Group_9_5__1"
    // InternalAutomatedRestTesting.g:2474:1: rule__RestService__Group_9_5__1 : rule__RestService__Group_9_5__1__Impl ;
    public final void rule__RestService__Group_9_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2478:1: ( rule__RestService__Group_9_5__1__Impl )
            // InternalAutomatedRestTesting.g:2479:2: rule__RestService__Group_9_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_9_5__1__Impl();

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
    // $ANTLR end "rule__RestService__Group_9_5__1"


    // $ANTLR start "rule__RestService__Group_9_5__1__Impl"
    // InternalAutomatedRestTesting.g:2485:1: rule__RestService__Group_9_5__1__Impl : ( ']' ) ;
    public final void rule__RestService__Group_9_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2489:1: ( ( ']' ) )
            // InternalAutomatedRestTesting.g:2490:1: ( ']' )
            {
            // InternalAutomatedRestTesting.g:2490:1: ( ']' )
            // InternalAutomatedRestTesting.g:2491:2: ']'
            {
             before(grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_9_5_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_9_5_1()); 

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
    // $ANTLR end "rule__RestService__Group_9_5__1__Impl"


    // $ANTLR start "rule__RestService__Group_15__0"
    // InternalAutomatedRestTesting.g:2501:1: rule__RestService__Group_15__0 : rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 ;
    public final void rule__RestService__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2505:1: ( rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 )
            // InternalAutomatedRestTesting.g:2506:2: rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1
            {
            pushFollow(FOLLOW_27);
            rule__RestService__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_15__1();

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
    // $ANTLR end "rule__RestService__Group_15__0"


    // $ANTLR start "rule__RestService__Group_15__0__Impl"
    // InternalAutomatedRestTesting.g:2513:1: rule__RestService__Group_15__0__Impl : ( '[' ) ;
    public final void rule__RestService__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2517:1: ( ( '[' ) )
            // InternalAutomatedRestTesting.g:2518:1: ( '[' )
            {
            // InternalAutomatedRestTesting.g:2518:1: ( '[' )
            // InternalAutomatedRestTesting.g:2519:2: '['
            {
             before(grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_15_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLeftSquareBracketKeyword_15_0()); 

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
    // $ANTLR end "rule__RestService__Group_15__0__Impl"


    // $ANTLR start "rule__RestService__Group_15__1"
    // InternalAutomatedRestTesting.g:2528:1: rule__RestService__Group_15__1 : rule__RestService__Group_15__1__Impl ;
    public final void rule__RestService__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2532:1: ( rule__RestService__Group_15__1__Impl )
            // InternalAutomatedRestTesting.g:2533:2: rule__RestService__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_15__1__Impl();

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
    // $ANTLR end "rule__RestService__Group_15__1"


    // $ANTLR start "rule__RestService__Group_15__1__Impl"
    // InternalAutomatedRestTesting.g:2539:1: rule__RestService__Group_15__1__Impl : ( ']' ) ;
    public final void rule__RestService__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2543:1: ( ( ']' ) )
            // InternalAutomatedRestTesting.g:2544:1: ( ']' )
            {
            // InternalAutomatedRestTesting.g:2544:1: ( ']' )
            // InternalAutomatedRestTesting.g:2545:2: ']'
            {
             before(grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_15_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRightSquareBracketKeyword_15_1()); 

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
    // $ANTLR end "rule__RestService__Group_15__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalAutomatedRestTesting.g:2555:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2559:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalAutomatedRestTesting.g:2560:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAutomatedRestTesting.g:2567:1: rule__Assertion__Group__0__Impl : ( 'response' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2571:1: ( ( 'response' ) )
            // InternalAutomatedRestTesting.g:2572:1: ( 'response' )
            {
            // InternalAutomatedRestTesting.g:2572:1: ( 'response' )
            // InternalAutomatedRestTesting.g:2573:2: 'response'
            {
             before(grammarAccess.getAssertionAccess().getResponseKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getResponseKeyword_0()); 

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
    // InternalAutomatedRestTesting.g:2582:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2586:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalAutomatedRestTesting.g:2587:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAutomatedRestTesting.g:2594:1: rule__Assertion__Group__1__Impl : ( RULE_ARROW ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2598:1: ( ( RULE_ARROW ) )
            // InternalAutomatedRestTesting.g:2599:1: ( RULE_ARROW )
            {
            // InternalAutomatedRestTesting.g:2599:1: ( RULE_ARROW )
            // InternalAutomatedRestTesting.g:2600:2: RULE_ARROW
            {
             before(grammarAccess.getAssertionAccess().getARROWTerminalRuleCall_1()); 
            match(input,RULE_ARROW,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getARROWTerminalRuleCall_1()); 

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
    // InternalAutomatedRestTesting.g:2609:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl rule__Assertion__Group__3 ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2613:1: ( rule__Assertion__Group__2__Impl rule__Assertion__Group__3 )
            // InternalAutomatedRestTesting.g:2614:2: rule__Assertion__Group__2__Impl rule__Assertion__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAutomatedRestTesting.g:2621:1: rule__Assertion__Group__2__Impl : ( ( rule__Assertion__DataToTestAssignment_2 ) ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2625:1: ( ( ( rule__Assertion__DataToTestAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:2626:1: ( ( rule__Assertion__DataToTestAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:2626:1: ( ( rule__Assertion__DataToTestAssignment_2 ) )
            // InternalAutomatedRestTesting.g:2627:2: ( rule__Assertion__DataToTestAssignment_2 )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestAssignment_2()); 
            // InternalAutomatedRestTesting.g:2628:2: ( rule__Assertion__DataToTestAssignment_2 )
            // InternalAutomatedRestTesting.g:2628:3: rule__Assertion__DataToTestAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__DataToTestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getDataToTestAssignment_2()); 

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
    // InternalAutomatedRestTesting.g:2636:1: rule__Assertion__Group__3 : rule__Assertion__Group__3__Impl ;
    public final void rule__Assertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2640:1: ( rule__Assertion__Group__3__Impl )
            // InternalAutomatedRestTesting.g:2641:2: rule__Assertion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__3__Impl();

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
    // InternalAutomatedRestTesting.g:2647:1: rule__Assertion__Group__3__Impl : ( ( rule__Assertion__ConditionAssignment_3 ) ) ;
    public final void rule__Assertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2651:1: ( ( ( rule__Assertion__ConditionAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:2652:1: ( ( rule__Assertion__ConditionAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:2652:1: ( ( rule__Assertion__ConditionAssignment_3 ) )
            // InternalAutomatedRestTesting.g:2653:2: ( rule__Assertion__ConditionAssignment_3 )
            {
             before(grammarAccess.getAssertionAccess().getConditionAssignment_3()); 
            // InternalAutomatedRestTesting.g:2654:2: ( rule__Assertion__ConditionAssignment_3 )
            // InternalAutomatedRestTesting.g:2654:3: rule__Assertion__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getConditionAssignment_3()); 

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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAutomatedRestTesting.g:2663:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2667:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAutomatedRestTesting.g:2668:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAutomatedRestTesting.g:2675:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2679:1: ( ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:2680:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:2680:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            // InternalAutomatedRestTesting.g:2681:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_0()); 
            // InternalAutomatedRestTesting.g:2682:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            // InternalAutomatedRestTesting.g:2682:3: rule__Expression__RelationalOperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RelationalOperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalAutomatedRestTesting.g:2690:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2694:1: ( rule__Expression__Group__1__Impl )
            // InternalAutomatedRestTesting.g:2695:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // InternalAutomatedRestTesting.g:2701:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ExpectedValueAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2705:1: ( ( ( rule__Expression__ExpectedValueAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2706:1: ( ( rule__Expression__ExpectedValueAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2706:1: ( ( rule__Expression__ExpectedValueAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2707:2: ( rule__Expression__ExpectedValueAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1()); 
            // InternalAutomatedRestTesting.g:2708:2: ( rule__Expression__ExpectedValueAssignment_1 )
            // InternalAutomatedRestTesting.g:2708:3: rule__Expression__ExpectedValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpectedValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1()); 

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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalAutomatedRestTesting.g:2717:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2721:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAutomatedRestTesting.g:2722:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAutomatedRestTesting.g:2729:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2733:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2734:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2734:1: ( () )
            // InternalAutomatedRestTesting.g:2735:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalAutomatedRestTesting.g:2736:2: ()
            // InternalAutomatedRestTesting.g:2736:3: 
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
    // InternalAutomatedRestTesting.g:2744:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2748:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAutomatedRestTesting.g:2749:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalAutomatedRestTesting.g:2756:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Alternatives_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2760:1: ( ( ( rule__Parameter__Alternatives_1 ) ) )
            // InternalAutomatedRestTesting.g:2761:1: ( ( rule__Parameter__Alternatives_1 ) )
            {
            // InternalAutomatedRestTesting.g:2761:1: ( ( rule__Parameter__Alternatives_1 ) )
            // InternalAutomatedRestTesting.g:2762:2: ( rule__Parameter__Alternatives_1 )
            {
             before(grammarAccess.getParameterAccess().getAlternatives_1()); 
            // InternalAutomatedRestTesting.g:2763:2: ( rule__Parameter__Alternatives_1 )
            // InternalAutomatedRestTesting.g:2763:3: rule__Parameter__Alternatives_1
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
    // InternalAutomatedRestTesting.g:2771:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2775:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAutomatedRestTesting.g:2776:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalAutomatedRestTesting.g:2783:1: rule__Parameter__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2787:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2788:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2788:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2789:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2798:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2802:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAutomatedRestTesting.g:2803:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalAutomatedRestTesting.g:2810:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2814:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:2815:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:2815:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:2816:2: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:2817:2: ( rule__Parameter__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:2817:3: rule__Parameter__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:2825:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2829:1: ( rule__Parameter__Group__4__Impl )
            // InternalAutomatedRestTesting.g:2830:2: rule__Parameter__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:2836:1: rule__Parameter__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2840:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2841:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2841:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2842:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2852:1: rule__Parameter__Group_1_0__0 : rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 ;
    public final void rule__Parameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2856:1: ( rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 )
            // InternalAutomatedRestTesting.g:2857:2: rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:2864:1: rule__Parameter__Group_1_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__Parameter__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2868:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:2869:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:2869:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:2870:2: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:2879:1: rule__Parameter__Group_1_0__1 : rule__Parameter__Group_1_0__1__Impl ;
    public final void rule__Parameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2883:1: ( rule__Parameter__Group_1_0__1__Impl )
            // InternalAutomatedRestTesting.g:2884:2: rule__Parameter__Group_1_0__1__Impl
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
    // InternalAutomatedRestTesting.g:2890:1: rule__Parameter__Group_1_0__1__Impl : ( RULE_TWO_DOTS ) ;
    public final void rule__Parameter__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2894:1: ( ( RULE_TWO_DOTS ) )
            // InternalAutomatedRestTesting.g:2895:1: ( RULE_TWO_DOTS )
            {
            // InternalAutomatedRestTesting.g:2895:1: ( RULE_TWO_DOTS )
            // InternalAutomatedRestTesting.g:2896:2: RULE_TWO_DOTS
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
    // InternalAutomatedRestTesting.g:2906:1: rule__Parameter__Group_1_1__0 : rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 ;
    public final void rule__Parameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2910:1: ( rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 )
            // InternalAutomatedRestTesting.g:2911:2: rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAutomatedRestTesting.g:2918:1: rule__Parameter__Group_1_1__0__Impl : ( RULE_QUESTION_MARK ) ;
    public final void rule__Parameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2922:1: ( ( RULE_QUESTION_MARK ) )
            // InternalAutomatedRestTesting.g:2923:1: ( RULE_QUESTION_MARK )
            {
            // InternalAutomatedRestTesting.g:2923:1: ( RULE_QUESTION_MARK )
            // InternalAutomatedRestTesting.g:2924:2: RULE_QUESTION_MARK
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
    // InternalAutomatedRestTesting.g:2933:1: rule__Parameter__Group_1_1__1 : rule__Parameter__Group_1_1__1__Impl ;
    public final void rule__Parameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2937:1: ( rule__Parameter__Group_1_1__1__Impl )
            // InternalAutomatedRestTesting.g:2938:2: rule__Parameter__Group_1_1__1__Impl
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
    // InternalAutomatedRestTesting.g:2944:1: rule__Parameter__Group_1_1__1__Impl : ( RULE_MONEY ) ;
    public final void rule__Parameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2948:1: ( ( RULE_MONEY ) )
            // InternalAutomatedRestTesting.g:2949:1: ( RULE_MONEY )
            {
            // InternalAutomatedRestTesting.g:2949:1: ( RULE_MONEY )
            // InternalAutomatedRestTesting.g:2950:2: RULE_MONEY
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
    // InternalAutomatedRestTesting.g:2960:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2964:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAutomatedRestTesting.g:2965:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAutomatedRestTesting.g:2972:1: rule__Restriction__Group__0__Impl : ( () ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2976:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2977:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2977:1: ( () )
            // InternalAutomatedRestTesting.g:2978:2: ()
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 
            // InternalAutomatedRestTesting.g:2979:2: ()
            // InternalAutomatedRestTesting.g:2979:3: 
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
    // InternalAutomatedRestTesting.g:2987:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2991:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // InternalAutomatedRestTesting.g:2992:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
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
    // InternalAutomatedRestTesting.g:2999:1: rule__Restriction__Group__1__Impl : ( 'mockType' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3003:1: ( ( 'mockType' ) )
            // InternalAutomatedRestTesting.g:3004:1: ( 'mockType' )
            {
            // InternalAutomatedRestTesting.g:3004:1: ( 'mockType' )
            // InternalAutomatedRestTesting.g:3005:2: 'mockType'
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3014:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3018:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // InternalAutomatedRestTesting.g:3019:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalAutomatedRestTesting.g:3026:1: rule__Restriction__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3030:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3031:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3031:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3032:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3041:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3045:1: ( rule__Restriction__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3046:2: rule__Restriction__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:3052:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__MockTypeAssignment_3 ) ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3056:1: ( ( ( rule__Restriction__MockTypeAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3057:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3057:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3058:2: ( rule__Restriction__MockTypeAssignment_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 
            // InternalAutomatedRestTesting.g:3059:2: ( rule__Restriction__MockTypeAssignment_3 )
            // InternalAutomatedRestTesting.g:3059:3: rule__Restriction__MockTypeAssignment_3
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
    // InternalAutomatedRestTesting.g:3068:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3072:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAutomatedRestTesting.g:3073:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAutomatedRestTesting.g:3080:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3084:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3085:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3085:1: ( () )
            // InternalAutomatedRestTesting.g:3086:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3087:2: ()
            // InternalAutomatedRestTesting.g:3087:3: 
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
    // InternalAutomatedRestTesting.g:3095:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3099:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAutomatedRestTesting.g:3100:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalAutomatedRestTesting.g:3107:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3111:1: ( ( 'Entity' ) )
            // InternalAutomatedRestTesting.g:3112:1: ( 'Entity' )
            {
            // InternalAutomatedRestTesting.g:3112:1: ( 'Entity' )
            // InternalAutomatedRestTesting.g:3113:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3122:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3126:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAutomatedRestTesting.g:3127:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalAutomatedRestTesting.g:3134:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3138:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3139:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3139:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3140:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3141:2: ( rule__Entity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3141:3: rule__Entity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:3149:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3153:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAutomatedRestTesting.g:3154:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3161:1: rule__Entity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3165:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3166:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3166:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3167:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3176:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3180:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAutomatedRestTesting.g:3181:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalAutomatedRestTesting.g:3188:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3192:1: ( ( ( rule__Entity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:3193:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:3193:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:3194:2: ( rule__Entity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:3195:2: ( rule__Entity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:3195:3: rule__Entity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:3203:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3207:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAutomatedRestTesting.g:3208:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:3215:1: rule__Entity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3219:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3220:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3220:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3221:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:3230:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3234:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAutomatedRestTesting.g:3235:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:3242:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3246:1: ( ( ( rule__Entity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:3247:1: ( ( rule__Entity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:3247:1: ( ( rule__Entity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:3248:2: ( rule__Entity__Group_6__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:3249:2: ( rule__Entity__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=23 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3249:3: rule__Entity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Entity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAutomatedRestTesting.g:3257:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3261:1: ( rule__Entity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:3262:2: rule__Entity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:3268:1: rule__Entity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3272:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3273:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3273:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3274:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:3284:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3288:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalAutomatedRestTesting.g:3289:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
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
    // InternalAutomatedRestTesting.g:3296:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3300:1: ( ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:3301:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:3301:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:3302:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:3303:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:3303:3: rule__Entity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:3311:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3315:1: ( rule__Entity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:3316:2: rule__Entity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:3322:1: rule__Entity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3326:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3327:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3327:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3328:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:3338:1: rule__Attribute_Impl__Group__0 : rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 ;
    public final void rule__Attribute_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3342:1: ( rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 )
            // InternalAutomatedRestTesting.g:3343:2: rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3350:1: rule__Attribute_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Attribute_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3354:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3355:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3355:1: ( () )
            // InternalAutomatedRestTesting.g:3356:2: ()
            {
             before(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:3357:2: ()
            // InternalAutomatedRestTesting.g:3357:3: 
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
    // InternalAutomatedRestTesting.g:3365:1: rule__Attribute_Impl__Group__1 : rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 ;
    public final void rule__Attribute_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3369:1: ( rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 )
            // InternalAutomatedRestTesting.g:3370:2: rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3377:1: rule__Attribute_Impl__Group__1__Impl : ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) ;
    public final void rule__Attribute_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3381:1: ( ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3382:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3382:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3383:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3384:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3384:3: rule__Attribute_Impl__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:3392:1: rule__Attribute_Impl__Group__2 : rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 ;
    public final void rule__Attribute_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3396:1: ( rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 )
            // InternalAutomatedRestTesting.g:3397:2: rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3404:1: rule__Attribute_Impl__Group__2__Impl : ( ( rule__Attribute_Impl__Group_2__0 )? ) ;
    public final void rule__Attribute_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3408:1: ( ( ( rule__Attribute_Impl__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:3409:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:3409:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:3410:2: ( rule__Attribute_Impl__Group_2__0 )?
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:3411:2: ( rule__Attribute_Impl__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3411:3: rule__Attribute_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttribute_ImplAccess().getGroup_2()); 

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
    // InternalAutomatedRestTesting.g:3419:1: rule__Attribute_Impl__Group__3 : rule__Attribute_Impl__Group__3__Impl ;
    public final void rule__Attribute_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3423:1: ( rule__Attribute_Impl__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3424:2: rule__Attribute_Impl__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:3430:1: rule__Attribute_Impl__Group__3__Impl : ( ( rule__Attribute_Impl__NameAssignment_3 ) ) ;
    public final void rule__Attribute_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3434:1: ( ( ( rule__Attribute_Impl__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3435:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3435:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3436:2: ( rule__Attribute_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:3437:2: ( rule__Attribute_Impl__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:3437:3: rule__Attribute_Impl__NameAssignment_3
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


    // $ANTLR start "rule__Attribute_Impl__Group_2__0"
    // InternalAutomatedRestTesting.g:3446:1: rule__Attribute_Impl__Group_2__0 : rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 ;
    public final void rule__Attribute_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3450:1: ( rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 )
            // InternalAutomatedRestTesting.g:3451:2: rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Attribute_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group_2__1();

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
    // $ANTLR end "rule__Attribute_Impl__Group_2__0"


    // $ANTLR start "rule__Attribute_Impl__Group_2__0__Impl"
    // InternalAutomatedRestTesting.g:3458:1: rule__Attribute_Impl__Group_2__0__Impl : ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) ;
    public final void rule__Attribute_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3462:1: ( ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:3463:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:3463:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:3464:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:3465:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:3465:3: rule__Attribute_Impl__IsArrayAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__IsArrayAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2_0()); 

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
    // $ANTLR end "rule__Attribute_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute_Impl__Group_2__1"
    // InternalAutomatedRestTesting.g:3473:1: rule__Attribute_Impl__Group_2__1 : rule__Attribute_Impl__Group_2__1__Impl ;
    public final void rule__Attribute_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3477:1: ( rule__Attribute_Impl__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:3478:2: rule__Attribute_Impl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute_Impl__Group_2__1__Impl();

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
    // $ANTLR end "rule__Attribute_Impl__Group_2__1"


    // $ANTLR start "rule__Attribute_Impl__Group_2__1__Impl"
    // InternalAutomatedRestTesting.g:3484:1: rule__Attribute_Impl__Group_2__1__Impl : ( ']' ) ;
    public final void rule__Attribute_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3488:1: ( ( ']' ) )
            // InternalAutomatedRestTesting.g:3489:1: ( ']' )
            {
            // InternalAutomatedRestTesting.g:3489:1: ( ']' )
            // InternalAutomatedRestTesting.g:3490:2: ']'
            {
             before(grammarAccess.getAttribute_ImplAccess().getRightSquareBracketKeyword_2_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAttribute_ImplAccess().getRightSquareBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Attribute_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__DomainAttribute__Group__0"
    // InternalAutomatedRestTesting.g:3500:1: rule__DomainAttribute__Group__0 : rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 ;
    public final void rule__DomainAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3504:1: ( rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 )
            // InternalAutomatedRestTesting.g:3505:2: rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3512:1: rule__DomainAttribute__Group__0__Impl : ( () ) ;
    public final void rule__DomainAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3516:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3517:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3517:1: ( () )
            // InternalAutomatedRestTesting.g:3518:2: ()
            {
             before(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:3519:2: ()
            // InternalAutomatedRestTesting.g:3519:3: 
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
    // InternalAutomatedRestTesting.g:3527:1: rule__DomainAttribute__Group__1 : rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 ;
    public final void rule__DomainAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3531:1: ( rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 )
            // InternalAutomatedRestTesting.g:3532:2: rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3539:1: rule__DomainAttribute__Group__1__Impl : ( ( rule__DomainAttribute__TypeAssignment_1 ) ) ;
    public final void rule__DomainAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3543:1: ( ( ( rule__DomainAttribute__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3544:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3544:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3545:2: ( rule__DomainAttribute__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3546:2: ( rule__DomainAttribute__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3546:3: rule__DomainAttribute__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:3554:1: rule__DomainAttribute__Group__2 : rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 ;
    public final void rule__DomainAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3558:1: ( rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 )
            // InternalAutomatedRestTesting.g:3559:2: rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3566:1: rule__DomainAttribute__Group__2__Impl : ( ( rule__DomainAttribute__Group_2__0 )? ) ;
    public final void rule__DomainAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3570:1: ( ( ( rule__DomainAttribute__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:3571:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:3571:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:3572:2: ( rule__DomainAttribute__Group_2__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:3573:2: ( rule__DomainAttribute__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==62) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3573:3: rule__DomainAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainAttribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAttributeAccess().getGroup_2()); 

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
    // InternalAutomatedRestTesting.g:3581:1: rule__DomainAttribute__Group__3 : rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 ;
    public final void rule__DomainAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3585:1: ( rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 )
            // InternalAutomatedRestTesting.g:3586:2: rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAutomatedRestTesting.g:3593:1: rule__DomainAttribute__Group__3__Impl : ( ( rule__DomainAttribute__NameAssignment_3 ) ) ;
    public final void rule__DomainAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3597:1: ( ( ( rule__DomainAttribute__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3598:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3598:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3599:2: ( rule__DomainAttribute__NameAssignment_3 )
            {
             before(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:3600:2: ( rule__DomainAttribute__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:3600:3: rule__DomainAttribute__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:3608:1: rule__DomainAttribute__Group__4 : rule__DomainAttribute__Group__4__Impl ;
    public final void rule__DomainAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3612:1: ( rule__DomainAttribute__Group__4__Impl )
            // InternalAutomatedRestTesting.g:3613:2: rule__DomainAttribute__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:3619:1: rule__DomainAttribute__Group__4__Impl : ( ( rule__DomainAttribute__Group_4__0 )? ) ;
    public final void rule__DomainAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3623:1: ( ( ( rule__DomainAttribute__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:3624:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:3624:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:3625:2: ( rule__DomainAttribute__Group_4__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:3626:2: ( rule__DomainAttribute__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LEFT_PARENTHESIS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3626:3: rule__DomainAttribute__Group_4__0
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


    // $ANTLR start "rule__DomainAttribute__Group_2__0"
    // InternalAutomatedRestTesting.g:3635:1: rule__DomainAttribute__Group_2__0 : rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 ;
    public final void rule__DomainAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3639:1: ( rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 )
            // InternalAutomatedRestTesting.g:3640:2: rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__DomainAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_2__1();

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
    // $ANTLR end "rule__DomainAttribute__Group_2__0"


    // $ANTLR start "rule__DomainAttribute__Group_2__0__Impl"
    // InternalAutomatedRestTesting.g:3647:1: rule__DomainAttribute__Group_2__0__Impl : ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) ;
    public final void rule__DomainAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3651:1: ( ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:3652:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:3652:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:3653:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:3654:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:3654:3: rule__DomainAttribute__IsArrayAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__IsArrayAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2_0()); 

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
    // $ANTLR end "rule__DomainAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_2__1"
    // InternalAutomatedRestTesting.g:3662:1: rule__DomainAttribute__Group_2__1 : rule__DomainAttribute__Group_2__1__Impl ;
    public final void rule__DomainAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3666:1: ( rule__DomainAttribute__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:3667:2: rule__DomainAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainAttribute__Group_2__1__Impl();

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
    // $ANTLR end "rule__DomainAttribute__Group_2__1"


    // $ANTLR start "rule__DomainAttribute__Group_2__1__Impl"
    // InternalAutomatedRestTesting.g:3673:1: rule__DomainAttribute__Group_2__1__Impl : ( ']' ) ;
    public final void rule__DomainAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3677:1: ( ( ']' ) )
            // InternalAutomatedRestTesting.g:3678:1: ( ']' )
            {
            // InternalAutomatedRestTesting.g:3678:1: ( ']' )
            // InternalAutomatedRestTesting.g:3679:2: ']'
            {
             before(grammarAccess.getDomainAttributeAccess().getRightSquareBracketKeyword_2_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getRightSquareBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__DomainAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__DomainAttribute__Group_4__0"
    // InternalAutomatedRestTesting.g:3689:1: rule__DomainAttribute__Group_4__0 : rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 ;
    public final void rule__DomainAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3693:1: ( rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 )
            // InternalAutomatedRestTesting.g:3694:2: rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAutomatedRestTesting.g:3701:1: rule__DomainAttribute__Group_4__0__Impl : ( RULE_LEFT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3705:1: ( ( RULE_LEFT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:3706:1: ( RULE_LEFT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:3706:1: ( RULE_LEFT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:3707:2: RULE_LEFT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:3716:1: rule__DomainAttribute__Group_4__1 : rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 ;
    public final void rule__DomainAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3720:1: ( rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 )
            // InternalAutomatedRestTesting.g:3721:2: rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAutomatedRestTesting.g:3728:1: rule__DomainAttribute__Group_4__1__Impl : ( ( rule__DomainAttribute__Group_4_1__0 )? ) ;
    public final void rule__DomainAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3732:1: ( ( ( rule__DomainAttribute__Group_4_1__0 )? ) )
            // InternalAutomatedRestTesting.g:3733:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:3733:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            // InternalAutomatedRestTesting.g:3734:2: ( rule__DomainAttribute__Group_4_1__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 
            // InternalAutomatedRestTesting.g:3735:2: ( rule__DomainAttribute__Group_4_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==68) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3735:3: rule__DomainAttribute__Group_4_1__0
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
    // InternalAutomatedRestTesting.g:3743:1: rule__DomainAttribute__Group_4__2 : rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 ;
    public final void rule__DomainAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3747:1: ( rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 )
            // InternalAutomatedRestTesting.g:3748:2: rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAutomatedRestTesting.g:3755:1: rule__DomainAttribute__Group_4__2__Impl : ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) ;
    public final void rule__DomainAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3759:1: ( ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) )
            // InternalAutomatedRestTesting.g:3760:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            {
            // InternalAutomatedRestTesting.g:3760:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            // InternalAutomatedRestTesting.g:3761:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 
            // InternalAutomatedRestTesting.g:3762:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            // InternalAutomatedRestTesting.g:3762:3: rule__DomainAttribute__RestrictionsAssignment_4_2
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
    // InternalAutomatedRestTesting.g:3770:1: rule__DomainAttribute__Group_4__3 : rule__DomainAttribute__Group_4__3__Impl ;
    public final void rule__DomainAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3774:1: ( rule__DomainAttribute__Group_4__3__Impl )
            // InternalAutomatedRestTesting.g:3775:2: rule__DomainAttribute__Group_4__3__Impl
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
    // InternalAutomatedRestTesting.g:3781:1: rule__DomainAttribute__Group_4__3__Impl : ( RULE_RIGHT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3785:1: ( ( RULE_RIGHT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:3786:1: ( RULE_RIGHT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:3786:1: ( RULE_RIGHT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:3787:2: RULE_RIGHT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:3797:1: rule__DomainAttribute__Group_4_1__0 : rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 ;
    public final void rule__DomainAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3801:1: ( rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 )
            // InternalAutomatedRestTesting.g:3802:2: rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAutomatedRestTesting.g:3809:1: rule__DomainAttribute__Group_4_1__0__Impl : ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) ;
    public final void rule__DomainAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3813:1: ( ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) )
            // InternalAutomatedRestTesting.g:3814:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            {
            // InternalAutomatedRestTesting.g:3814:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            // InternalAutomatedRestTesting.g:3815:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 
            // InternalAutomatedRestTesting.g:3816:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            // InternalAutomatedRestTesting.g:3816:3: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0
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
    // InternalAutomatedRestTesting.g:3824:1: rule__DomainAttribute__Group_4_1__1 : rule__DomainAttribute__Group_4_1__1__Impl ;
    public final void rule__DomainAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3828:1: ( rule__DomainAttribute__Group_4_1__1__Impl )
            // InternalAutomatedRestTesting.g:3829:2: rule__DomainAttribute__Group_4_1__1__Impl
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
    // InternalAutomatedRestTesting.g:3835:1: rule__DomainAttribute__Group_4_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__DomainAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3839:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:3840:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:3840:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:3841:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:3851:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3855:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalAutomatedRestTesting.g:3856:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalAutomatedRestTesting.g:3863:1: rule__SimpleEntity__Group__0__Impl : ( () ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3867:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3868:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3868:1: ( () )
            // InternalAutomatedRestTesting.g:3869:2: ()
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3870:2: ()
            // InternalAutomatedRestTesting.g:3870:3: 
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
    // InternalAutomatedRestTesting.g:3878:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3882:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalAutomatedRestTesting.g:3883:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalAutomatedRestTesting.g:3890:1: rule__SimpleEntity__Group__1__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3894:1: ( ( 'SimpleEntity' ) )
            // InternalAutomatedRestTesting.g:3895:1: ( 'SimpleEntity' )
            {
            // InternalAutomatedRestTesting.g:3895:1: ( 'SimpleEntity' )
            // InternalAutomatedRestTesting.g:3896:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3905:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3909:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalAutomatedRestTesting.g:3910:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalAutomatedRestTesting.g:3917:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3921:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3922:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3922:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3923:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3924:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3924:3: rule__SimpleEntity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:3932:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3936:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalAutomatedRestTesting.g:3937:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3944:1: rule__SimpleEntity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3948:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3949:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3949:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3950:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3959:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3963:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalAutomatedRestTesting.g:3964:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
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
    // InternalAutomatedRestTesting.g:3971:1: rule__SimpleEntity__Group__4__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3975:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:3976:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:3976:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:3977:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:3978:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:3978:3: rule__SimpleEntity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:3986:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3990:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalAutomatedRestTesting.g:3991:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:3998:1: rule__SimpleEntity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4002:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4003:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4003:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4004:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4013:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4017:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalAutomatedRestTesting.g:4018:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:4025:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__Group_6__0 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4029:1: ( ( ( rule__SimpleEntity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4030:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4030:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4031:2: ( rule__SimpleEntity__Group_6__0 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4032:2: ( rule__SimpleEntity__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=23 && LA26_0<=27)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4032:3: rule__SimpleEntity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SimpleEntity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAutomatedRestTesting.g:4040:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4044:1: ( rule__SimpleEntity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4045:2: rule__SimpleEntity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4051:1: rule__SimpleEntity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4055:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4056:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4056:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4057:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4067:1: rule__SimpleEntity__Group_6__0 : rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 ;
    public final void rule__SimpleEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4071:1: ( rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4072:2: rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4079:1: rule__SimpleEntity__Group_6__0__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__SimpleEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4083:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4084:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4084:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4085:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4086:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4086:3: rule__SimpleEntity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4094:1: rule__SimpleEntity__Group_6__1 : rule__SimpleEntity__Group_6__1__Impl ;
    public final void rule__SimpleEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4098:1: ( rule__SimpleEntity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4099:2: rule__SimpleEntity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4105:1: rule__SimpleEntity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4109:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4110:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4110:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4111:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4121:1: rule__AutomatedRestTesting__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AutomatedRestTesting__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4125:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4126:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4126:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4127:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4136:1: rule__AutomatedRestTesting__DataElementsAssignment_5_0 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4140:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4141:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4141:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4142:3: ruleElement
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
    // InternalAutomatedRestTesting.g:4151:1: rule__AutomatedRestTesting__DataElementsAssignment_5_1 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4155:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4156:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4156:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4157:3: ruleElement
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
    // InternalAutomatedRestTesting.g:4166:1: rule__AutomatedRestTesting__ServicesAssignment_6_0 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4170:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:4171:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:4171:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:4172:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:4181:1: rule__AutomatedRestTesting__ServicesAssignment_6_1 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4185:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:4186:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:4186:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:4187:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:4196:1: rule__AutomatedRestTesting__TestsAssignment_7_0 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4200:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:4201:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:4201:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:4202:3: ruleTest
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
    // InternalAutomatedRestTesting.g:4211:1: rule__AutomatedRestTesting__TestsAssignment_7_1 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4215:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:4216:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:4216:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:4217:3: ruleTest
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
    // InternalAutomatedRestTesting.g:4226:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4230:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4231:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4231:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4232:3: ruleEString
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


    // $ANTLR start "rule__Test__ServiceAssignment_5"
    // InternalAutomatedRestTesting.g:4241:1: rule__Test__ServiceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Test__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4245:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4246:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4246:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4247:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0()); 
            // InternalAutomatedRestTesting.g:4248:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4249:4: ruleEString
            {
             before(grammarAccess.getTestAccess().getServiceRestServiceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getServiceRestServiceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0()); 

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
    // $ANTLR end "rule__Test__ServiceAssignment_5"


    // $ANTLR start "rule__Test__DescriptionAssignment_7_2"
    // InternalAutomatedRestTesting.g:4260:1: rule__Test__DescriptionAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Test__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4264:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4265:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4265:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4266:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Test__DescriptionAssignment_7_2"


    // $ANTLR start "rule__Test__AssertionsAssignment_10_0"
    // InternalAutomatedRestTesting.g:4275:1: rule__Test__AssertionsAssignment_10_0 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4279:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:4280:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:4280:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:4281:3: ruleAssertion
            {
             before(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_10_0_0()); 

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
    // $ANTLR end "rule__Test__AssertionsAssignment_10_0"


    // $ANTLR start "rule__RestService__MethodAssignment_0"
    // InternalAutomatedRestTesting.g:4290:1: rule__RestService__MethodAssignment_0 : ( ruleMethodType ) ;
    public final void rule__RestService__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4294:1: ( ( ruleMethodType ) )
            // InternalAutomatedRestTesting.g:4295:2: ( ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:4295:2: ( ruleMethodType )
            // InternalAutomatedRestTesting.g:4296:3: ruleMethodType
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
    // InternalAutomatedRestTesting.g:4305:1: rule__RestService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RestService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4309:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4310:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4310:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4311:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4320:1: rule__RestService__UriAssignment_5 : ( RULE_SLASH ) ;
    public final void rule__RestService__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4324:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:4325:2: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:4325:2: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:4326:3: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:4335:1: rule__RestService__ParametersAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__RestService__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4339:1: ( ( ruleParameter ) )
            // InternalAutomatedRestTesting.g:4340:2: ( ruleParameter )
            {
            // InternalAutomatedRestTesting.g:4340:2: ( ruleParameter )
            // InternalAutomatedRestTesting.g:4341:3: ruleParameter
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
    // InternalAutomatedRestTesting.g:4350:1: rule__RestService__RequestAssignment_9_4 : ( ( ruleEString ) ) ;
    public final void rule__RestService__RequestAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4354:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4355:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4355:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4356:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0()); 
            // InternalAutomatedRestTesting.g:4357:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4358:4: ruleEString
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
    // InternalAutomatedRestTesting.g:4369:1: rule__RestService__ResponseAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__RestService__ResponseAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4373:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4374:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4374:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4375:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0()); 
            // InternalAutomatedRestTesting.g:4376:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4377:4: ruleEString
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


    // $ANTLR start "rule__Assertion__DataToTestAssignment_2"
    // InternalAutomatedRestTesting.g:4388:1: rule__Assertion__DataToTestAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Assertion__DataToTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4392:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:4393:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:4393:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4394:3: ( ruleEString )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_2_0()); 
            // InternalAutomatedRestTesting.g:4395:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:4396:4: ruleEString
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getDataToTestElementEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_2_0()); 

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
    // $ANTLR end "rule__Assertion__DataToTestAssignment_2"


    // $ANTLR start "rule__Assertion__ConditionAssignment_3"
    // InternalAutomatedRestTesting.g:4407:1: rule__Assertion__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assertion__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4411:1: ( ( ruleExpression ) )
            // InternalAutomatedRestTesting.g:4412:2: ( ruleExpression )
            {
            // InternalAutomatedRestTesting.g:4412:2: ( ruleExpression )
            // InternalAutomatedRestTesting.g:4413:3: ruleExpression
            {
             before(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Assertion__ConditionAssignment_3"


    // $ANTLR start "rule__Expression__RelationalOperatorAssignment_0"
    // InternalAutomatedRestTesting.g:4422:1: rule__Expression__RelationalOperatorAssignment_0 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4426:1: ( ( ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:4427:2: ( ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:4427:2: ( ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:4428:3: ruleRelationalOperator
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__RelationalOperatorAssignment_0"


    // $ANTLR start "rule__Expression__ExpectedValueAssignment_1"
    // InternalAutomatedRestTesting.g:4437:1: rule__Expression__ExpectedValueAssignment_1 : ( ruleEString ) ;
    public final void rule__Expression__ExpectedValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4441:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4442:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4442:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4443:3: ruleEString
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpectedValueEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ExpectedValueAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4452:1: rule__Parameter__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4456:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4457:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4457:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4458:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4467:1: rule__Restriction__MockTypeAssignment_3 : ( ruleMockTypes ) ;
    public final void rule__Restriction__MockTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4471:1: ( ( ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:4472:2: ( ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:4472:2: ( ruleMockTypes )
            // InternalAutomatedRestTesting.g:4473:3: ruleMockTypes
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
    // InternalAutomatedRestTesting.g:4482:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4486:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4487:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4487:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4488:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4497:1: rule__Entity__EntityAttributesAssignment_4 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4501:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:4502:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:4502:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:4503:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:4512:1: rule__Entity__EntityAttributesAssignment_6_0 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4516:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:4517:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:4517:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:4518:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:4527:1: rule__Attribute_Impl__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute_Impl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4531:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:4532:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:4532:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:4533:3: ruleAttributeType
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


    // $ANTLR start "rule__Attribute_Impl__IsArrayAssignment_2_0"
    // InternalAutomatedRestTesting.g:4542:1: rule__Attribute_Impl__IsArrayAssignment_2_0 : ( ( '[' ) ) ;
    public final void rule__Attribute_Impl__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4546:1: ( ( ( '[' ) ) )
            // InternalAutomatedRestTesting.g:4547:2: ( ( '[' ) )
            {
            // InternalAutomatedRestTesting.g:4547:2: ( ( '[' ) )
            // InternalAutomatedRestTesting.g:4548:3: ( '[' )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 
            // InternalAutomatedRestTesting.g:4549:3: ( '[' )
            // InternalAutomatedRestTesting.g:4550:4: '['
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 

            }

             after(grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Attribute_Impl__IsArrayAssignment_2_0"


    // $ANTLR start "rule__Attribute_Impl__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4561:1: rule__Attribute_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4565:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4566:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4566:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4567:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4576:1: rule__DomainAttribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__DomainAttribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4580:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:4581:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:4581:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:4582:3: ruleAttributeType
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


    // $ANTLR start "rule__DomainAttribute__IsArrayAssignment_2_0"
    // InternalAutomatedRestTesting.g:4591:1: rule__DomainAttribute__IsArrayAssignment_2_0 : ( ( '[' ) ) ;
    public final void rule__DomainAttribute__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4595:1: ( ( ( '[' ) ) )
            // InternalAutomatedRestTesting.g:4596:2: ( ( '[' ) )
            {
            // InternalAutomatedRestTesting.g:4596:2: ( ( '[' ) )
            // InternalAutomatedRestTesting.g:4597:3: ( '[' )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 
            // InternalAutomatedRestTesting.g:4598:3: ( '[' )
            // InternalAutomatedRestTesting.g:4599:4: '['
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 

            }

             after(grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketKeyword_2_0_0()); 

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
    // $ANTLR end "rule__DomainAttribute__IsArrayAssignment_2_0"


    // $ANTLR start "rule__DomainAttribute__NameAssignment_3"
    // InternalAutomatedRestTesting.g:4610:1: rule__DomainAttribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DomainAttribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4614:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4615:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4615:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4616:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4625:1: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 : ( ( 'PK' ) ) ;
    public final void rule__DomainAttribute__PrimaryKeyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4629:1: ( ( ( 'PK' ) ) )
            // InternalAutomatedRestTesting.g:4630:2: ( ( 'PK' ) )
            {
            // InternalAutomatedRestTesting.g:4630:2: ( ( 'PK' ) )
            // InternalAutomatedRestTesting.g:4631:3: ( 'PK' )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            // InternalAutomatedRestTesting.g:4632:3: ( 'PK' )
            // InternalAutomatedRestTesting.g:4633:4: 'PK'
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:4644:1: rule__DomainAttribute__RestrictionsAssignment_4_2 : ( ruleRestriction ) ;
    public final void rule__DomainAttribute__RestrictionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4648:1: ( ( ruleRestriction ) )
            // InternalAutomatedRestTesting.g:4649:2: ( ruleRestriction )
            {
            // InternalAutomatedRestTesting.g:4649:2: ( ruleRestriction )
            // InternalAutomatedRestTesting.g:4650:3: ruleRestriction
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
    // InternalAutomatedRestTesting.g:4659:1: rule__SimpleEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4663:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4664:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4664:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4665:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4674:1: rule__SimpleEntity__EntityAttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4678:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:4679:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:4679:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:4680:3: ruleAttribute
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
    // InternalAutomatedRestTesting.g:4689:1: rule__SimpleEntity__EntityAttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4693:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:4694:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:4694:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:4695:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x004000F000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002480L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000FF0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001FFF0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000F800200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020000L});

}