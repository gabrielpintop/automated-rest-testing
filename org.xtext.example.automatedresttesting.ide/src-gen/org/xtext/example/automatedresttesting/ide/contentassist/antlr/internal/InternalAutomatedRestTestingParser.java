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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOT", "RULE_ARROW", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_SLASH", "RULE_SQUARE_LEFT_BRACKET", "RULE_SQUARE_RIGHT_BRACKET", "RULE_COMMA", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_INT", "RULE_TWO_DOTS", "RULE_MONEY", "RULE_QUESTION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'/:'", "'?$'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'", "'apiURL'", "'URL'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'Assertions'", "'description'", "'Mapping'", "'response'", "'parameter'", "'value'", "'request'", "'mockType'", "'Entity'", "'SimpleEntity'", "'PK'"
    };
    public static final int RULE_SQUARE_LEFT_BRACKET=13;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=7;
    public static final int RULE_LEFT_PARENTHESIS=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=8;
    public static final int RULE_COMMA=15;
    public static final int RULE_SLASH=12;
    public static final int T__26=26;
    public static final int RULE_TWO_DOTS=19;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__67=67;
    public static final int RULE_MONEY=20;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=9;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int RULE_DOT=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_SQUARE_RIGHT_BRACKET=14;
    public static final int T__32=32;
    public static final int RULE_RIGHT_PARENTHESIS=17;
    public static final int RULE_WS=24;
    public static final int RULE_LEFT_BRACKET=10;
    public static final int RULE_ANY_OTHER=25;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_QUESTION_MARK=21;
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


    // $ANTLR start "entryRuleRestService"
    // InternalAutomatedRestTesting.g:153:1: entryRuleRestService : ruleRestService EOF ;
    public final void entryRuleRestService() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:154:1: ( ruleRestService EOF )
            // InternalAutomatedRestTesting.g:155:1: ruleRestService EOF
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
    // InternalAutomatedRestTesting.g:162:1: ruleRestService : ( ( rule__RestService__Group__0 ) ) ;
    public final void ruleRestService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:166:2: ( ( ( rule__RestService__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:167:2: ( ( rule__RestService__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:167:2: ( ( rule__RestService__Group__0 ) )
            // InternalAutomatedRestTesting.g:168:3: ( rule__RestService__Group__0 )
            {
             before(grammarAccess.getRestServiceAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:169:3: ( rule__RestService__Group__0 )
            // InternalAutomatedRestTesting.g:169:4: rule__RestService__Group__0
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


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:178:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:179:1: ( ruleTest EOF )
            // InternalAutomatedRestTesting.g:180:1: ruleTest EOF
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
    // InternalAutomatedRestTesting.g:187:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:191:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__Test__Group__0 ) )
            // InternalAutomatedRestTesting.g:193:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:194:3: ( rule__Test__Group__0 )
            // InternalAutomatedRestTesting.g:194:4: rule__Test__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAutomatedRestTesting.g:228:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:229:1: ( ruleQualifiedName EOF )
            // InternalAutomatedRestTesting.g:230:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAutomatedRestTesting.g:237:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:241:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAutomatedRestTesting.g:243:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:244:3: ( rule__QualifiedName__Group__0 )
            // InternalAutomatedRestTesting.g:244:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // InternalAutomatedRestTesting.g:253:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:254:1: ( ruleExpression EOF )
            // InternalAutomatedRestTesting.g:255:1: ruleExpression EOF
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
    // InternalAutomatedRestTesting.g:262:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:266:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Expression__Group__0 ) )
            // InternalAutomatedRestTesting.g:268:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:269:3: ( rule__Expression__Group__0 )
            // InternalAutomatedRestTesting.g:269:4: rule__Expression__Group__0
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


    // $ANTLR start "entryRuleLiteral"
    // InternalAutomatedRestTesting.g:278:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:279:1: ( ruleLiteral EOF )
            // InternalAutomatedRestTesting.g:280:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAutomatedRestTesting.g:287:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:291:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__Literal__Alternatives ) )
            // InternalAutomatedRestTesting.g:293:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:294:3: ( rule__Literal__Alternatives )
            // InternalAutomatedRestTesting.g:294:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalAutomatedRestTesting.g:303:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:304:1: ( ruleIntegerLiteral EOF )
            // InternalAutomatedRestTesting.g:305:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalAutomatedRestTesting.g:312:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:316:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:318:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:319:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:319:4: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAutomatedRestTesting.g:328:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:329:1: ( ruleStringLiteral EOF )
            // InternalAutomatedRestTesting.g:330:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAutomatedRestTesting.g:337:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:341:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:343:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:344:3: ( rule__StringLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:344:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleElementLiteral"
    // InternalAutomatedRestTesting.g:353:1: entryRuleElementLiteral : ruleElementLiteral EOF ;
    public final void entryRuleElementLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:354:1: ( ruleElementLiteral EOF )
            // InternalAutomatedRestTesting.g:355:1: ruleElementLiteral EOF
            {
             before(grammarAccess.getElementLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleElementLiteral();

            state._fsp--;

             after(grammarAccess.getElementLiteralRule()); 
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
    // $ANTLR end "entryRuleElementLiteral"


    // $ANTLR start "ruleElementLiteral"
    // InternalAutomatedRestTesting.g:362:1: ruleElementLiteral : ( ( rule__ElementLiteral__ValueAssignment ) ) ;
    public final void ruleElementLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:366:2: ( ( ( rule__ElementLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__ElementLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__ElementLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:368:3: ( rule__ElementLiteral__ValueAssignment )
            {
             before(grammarAccess.getElementLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:369:3: ( rule__ElementLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:369:4: rule__ElementLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementLiteral"


    // $ANTLR start "entryRuleMappingElement"
    // InternalAutomatedRestTesting.g:378:1: entryRuleMappingElement : ruleMappingElement EOF ;
    public final void entryRuleMappingElement() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:379:1: ( ruleMappingElement EOF )
            // InternalAutomatedRestTesting.g:380:1: ruleMappingElement EOF
            {
             before(grammarAccess.getMappingElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingElement();

            state._fsp--;

             after(grammarAccess.getMappingElementRule()); 
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
    // $ANTLR end "entryRuleMappingElement"


    // $ANTLR start "ruleMappingElement"
    // InternalAutomatedRestTesting.g:387:1: ruleMappingElement : ( ( rule__MappingElement__Group__0 ) ) ;
    public final void ruleMappingElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:391:2: ( ( ( rule__MappingElement__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__MappingElement__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__MappingElement__Group__0 ) )
            // InternalAutomatedRestTesting.g:393:3: ( rule__MappingElement__Group__0 )
            {
             before(grammarAccess.getMappingElementAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:394:3: ( rule__MappingElement__Group__0 )
            // InternalAutomatedRestTesting.g:394:4: rule__MappingElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingElement"


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:403:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:404:1: ( ruleParameter EOF )
            // InternalAutomatedRestTesting.g:405:1: ruleParameter EOF
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
    // InternalAutomatedRestTesting.g:412:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:416:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:417:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:417:2: ( ( rule__Parameter__Group__0 ) )
            // InternalAutomatedRestTesting.g:418:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:419:3: ( rule__Parameter__Group__0 )
            // InternalAutomatedRestTesting.g:419:4: rule__Parameter__Group__0
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
    // InternalAutomatedRestTesting.g:428:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:429:1: ( ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:430:1: ruleRestriction EOF
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
    // InternalAutomatedRestTesting.g:437:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:441:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:442:2: ( ( rule__Restriction__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:442:2: ( ( rule__Restriction__Group__0 ) )
            // InternalAutomatedRestTesting.g:443:3: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:444:3: ( rule__Restriction__Group__0 )
            // InternalAutomatedRestTesting.g:444:4: rule__Restriction__Group__0
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
    // InternalAutomatedRestTesting.g:453:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:454:1: ( ruleEntity EOF )
            // InternalAutomatedRestTesting.g:455:1: ruleEntity EOF
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
    // InternalAutomatedRestTesting.g:462:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:466:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:467:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:467:2: ( ( rule__Entity__Group__0 ) )
            // InternalAutomatedRestTesting.g:468:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:469:3: ( rule__Entity__Group__0 )
            // InternalAutomatedRestTesting.g:469:4: rule__Entity__Group__0
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
    // InternalAutomatedRestTesting.g:478:1: entryRuleAttribute_Impl : ruleAttribute_Impl EOF ;
    public final void entryRuleAttribute_Impl() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:479:1: ( ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:480:1: ruleAttribute_Impl EOF
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
    // InternalAutomatedRestTesting.g:487:1: ruleAttribute_Impl : ( ( rule__Attribute_Impl__Group__0 ) ) ;
    public final void ruleAttribute_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:491:2: ( ( ( rule__Attribute_Impl__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:492:2: ( ( rule__Attribute_Impl__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:492:2: ( ( rule__Attribute_Impl__Group__0 ) )
            // InternalAutomatedRestTesting.g:493:3: ( rule__Attribute_Impl__Group__0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:494:3: ( rule__Attribute_Impl__Group__0 )
            // InternalAutomatedRestTesting.g:494:4: rule__Attribute_Impl__Group__0
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
    // InternalAutomatedRestTesting.g:503:1: entryRuleDomainAttribute : ruleDomainAttribute EOF ;
    public final void entryRuleDomainAttribute() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:504:1: ( ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:505:1: ruleDomainAttribute EOF
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
    // InternalAutomatedRestTesting.g:512:1: ruleDomainAttribute : ( ( rule__DomainAttribute__Group__0 ) ) ;
    public final void ruleDomainAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:516:2: ( ( ( rule__DomainAttribute__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:517:2: ( ( rule__DomainAttribute__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:517:2: ( ( rule__DomainAttribute__Group__0 ) )
            // InternalAutomatedRestTesting.g:518:3: ( rule__DomainAttribute__Group__0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:519:3: ( rule__DomainAttribute__Group__0 )
            // InternalAutomatedRestTesting.g:519:4: rule__DomainAttribute__Group__0
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
    // InternalAutomatedRestTesting.g:528:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:529:1: ( ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:530:1: ruleSimpleEntity EOF
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
    // InternalAutomatedRestTesting.g:537:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:541:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:542:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:542:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalAutomatedRestTesting.g:543:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:544:3: ( rule__SimpleEntity__Group__0 )
            // InternalAutomatedRestTesting.g:544:4: rule__SimpleEntity__Group__0
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
    // InternalAutomatedRestTesting.g:553:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:557:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:558:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:558:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalAutomatedRestTesting.g:559:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:560:3: ( rule__AttributeType__Alternatives )
            // InternalAutomatedRestTesting.g:560:4: rule__AttributeType__Alternatives
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
    // InternalAutomatedRestTesting.g:569:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:573:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:574:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:574:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalAutomatedRestTesting.g:575:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:576:3: ( rule__RelationalOperator__Alternatives )
            // InternalAutomatedRestTesting.g:576:4: rule__RelationalOperator__Alternatives
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
    // InternalAutomatedRestTesting.g:585:1: ruleMethodType : ( ( rule__MethodType__Alternatives ) ) ;
    public final void ruleMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:589:1: ( ( ( rule__MethodType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:590:2: ( ( rule__MethodType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:590:2: ( ( rule__MethodType__Alternatives ) )
            // InternalAutomatedRestTesting.g:591:3: ( rule__MethodType__Alternatives )
            {
             before(grammarAccess.getMethodTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:592:3: ( rule__MethodType__Alternatives )
            // InternalAutomatedRestTesting.g:592:4: rule__MethodType__Alternatives
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


    // $ANTLR start "ruleParameterType"
    // InternalAutomatedRestTesting.g:601:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:605:1: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:606:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:606:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalAutomatedRestTesting.g:607:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:608:3: ( rule__ParameterType__Alternatives )
            // InternalAutomatedRestTesting.g:608:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "ruleMockTypes"
    // InternalAutomatedRestTesting.g:617:1: ruleMockTypes : ( ( rule__MockTypes__Alternatives ) ) ;
    public final void ruleMockTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:621:1: ( ( ( rule__MockTypes__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:622:2: ( ( rule__MockTypes__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:622:2: ( ( rule__MockTypes__Alternatives ) )
            // InternalAutomatedRestTesting.g:623:3: ( rule__MockTypes__Alternatives )
            {
             before(grammarAccess.getMockTypesAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:624:3: ( rule__MockTypes__Alternatives )
            // InternalAutomatedRestTesting.g:624:4: rule__MockTypes__Alternatives
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
    // InternalAutomatedRestTesting.g:632:1: rule__Element__Alternatives : ( ( ruleEntity ) | ( ruleSimpleEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:636:1: ( ( ruleEntity ) | ( ruleSimpleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==73) ) {
                alt1=1;
            }
            else if ( (LA1_0==74) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAutomatedRestTesting.g:637:2: ( ruleEntity )
                    {
                    // InternalAutomatedRestTesting.g:637:2: ( ruleEntity )
                    // InternalAutomatedRestTesting.g:638:3: ruleEntity
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
                    // InternalAutomatedRestTesting.g:643:2: ( ruleSimpleEntity )
                    {
                    // InternalAutomatedRestTesting.g:643:2: ( ruleSimpleEntity )
                    // InternalAutomatedRestTesting.g:644:3: ruleSimpleEntity
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
    // InternalAutomatedRestTesting.g:653:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:657:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAutomatedRestTesting.g:658:2: ( RULE_STRING )
                    {
                    // InternalAutomatedRestTesting.g:658:2: ( RULE_STRING )
                    // InternalAutomatedRestTesting.g:659:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:664:2: ( RULE_ID )
                    {
                    // InternalAutomatedRestTesting.g:664:2: ( RULE_ID )
                    // InternalAutomatedRestTesting.g:665:3: RULE_ID
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
    // InternalAutomatedRestTesting.g:674:1: rule__RestService__Alternatives_7 : ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) );
    public final void rule__RestService__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:678:1: ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SLASH) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=43 && LA3_0<=44)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutomatedRestTesting.g:679:2: ( ( rule__RestService__Group_7_0__0 ) )
                    {
                    // InternalAutomatedRestTesting.g:679:2: ( ( rule__RestService__Group_7_0__0 ) )
                    // InternalAutomatedRestTesting.g:680:3: ( rule__RestService__Group_7_0__0 )
                    {
                     before(grammarAccess.getRestServiceAccess().getGroup_7_0()); 
                    // InternalAutomatedRestTesting.g:681:3: ( rule__RestService__Group_7_0__0 )
                    // InternalAutomatedRestTesting.g:681:4: rule__RestService__Group_7_0__0
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
                    // InternalAutomatedRestTesting.g:685:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    {
                    // InternalAutomatedRestTesting.g:685:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    // InternalAutomatedRestTesting.g:686:3: ( rule__RestService__ParametersAssignment_7_1 )
                    {
                     before(grammarAccess.getRestServiceAccess().getParametersAssignment_7_1()); 
                    // InternalAutomatedRestTesting.g:687:3: ( rule__RestService__ParametersAssignment_7_1 )
                    // InternalAutomatedRestTesting.g:687:4: rule__RestService__ParametersAssignment_7_1
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


    // $ANTLR start "rule__Assertion__Alternatives_1_0"
    // InternalAutomatedRestTesting.g:695:1: rule__Assertion__Alternatives_1_0 : ( ( RULE_DOT ) | ( RULE_ARROW ) );
    public final void rule__Assertion__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:699:1: ( ( RULE_DOT ) | ( RULE_ARROW ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ARROW) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAutomatedRestTesting.g:700:2: ( RULE_DOT )
                    {
                    // InternalAutomatedRestTesting.g:700:2: ( RULE_DOT )
                    // InternalAutomatedRestTesting.g:701:3: RULE_DOT
                    {
                     before(grammarAccess.getAssertionAccess().getDOTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_DOT,FOLLOW_2); 
                     after(grammarAccess.getAssertionAccess().getDOTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:706:2: ( RULE_ARROW )
                    {
                    // InternalAutomatedRestTesting.g:706:2: ( RULE_ARROW )
                    // InternalAutomatedRestTesting.g:707:3: RULE_ARROW
                    {
                     before(grammarAccess.getAssertionAccess().getARROWTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ARROW,FOLLOW_2); 
                     after(grammarAccess.getAssertionAccess().getARROWTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Assertion__Alternatives_1_0"


    // $ANTLR start "rule__Expression__Alternatives_1_0_1"
    // InternalAutomatedRestTesting.g:716:1: rule__Expression__Alternatives_1_0_1 : ( ( RULE_DOT ) | ( RULE_ARROW ) );
    public final void rule__Expression__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:720:1: ( ( RULE_DOT ) | ( RULE_ARROW ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ARROW) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAutomatedRestTesting.g:721:2: ( RULE_DOT )
                    {
                    // InternalAutomatedRestTesting.g:721:2: ( RULE_DOT )
                    // InternalAutomatedRestTesting.g:722:3: RULE_DOT
                    {
                     before(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 
                    match(input,RULE_DOT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:727:2: ( RULE_ARROW )
                    {
                    // InternalAutomatedRestTesting.g:727:2: ( RULE_ARROW )
                    // InternalAutomatedRestTesting.g:728:3: RULE_ARROW
                    {
                     before(grammarAccess.getExpressionAccess().getARROWTerminalRuleCall_1_0_1_1()); 
                    match(input,RULE_ARROW,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getARROWTerminalRuleCall_1_0_1_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives_1_0_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalAutomatedRestTesting.g:737:1: rule__Literal__Alternatives : ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:741:1: ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAutomatedRestTesting.g:742:2: ( ruleElementLiteral )
                    {
                    // InternalAutomatedRestTesting.g:742:2: ( ruleElementLiteral )
                    // InternalAutomatedRestTesting.g:743:3: ruleElementLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getElementLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getElementLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:748:2: ( ruleStringLiteral )
                    {
                    // InternalAutomatedRestTesting.g:748:2: ( ruleStringLiteral )
                    // InternalAutomatedRestTesting.g:749:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:754:2: ( ruleIntegerLiteral )
                    {
                    // InternalAutomatedRestTesting.g:754:2: ( ruleIntegerLiteral )
                    // InternalAutomatedRestTesting.g:755:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalAutomatedRestTesting.g:764:1: rule__AttributeType__Alternatives : ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:768:1: ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAutomatedRestTesting.g:769:2: ( ( 'string' ) )
                    {
                    // InternalAutomatedRestTesting.g:769:2: ( ( 'string' ) )
                    // InternalAutomatedRestTesting.g:770:3: ( 'string' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:771:3: ( 'string' )
                    // InternalAutomatedRestTesting.g:771:4: 'string'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:775:2: ( ( 'boolean' ) )
                    {
                    // InternalAutomatedRestTesting.g:775:2: ( ( 'boolean' ) )
                    // InternalAutomatedRestTesting.g:776:3: ( 'boolean' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:777:3: ( 'boolean' )
                    // InternalAutomatedRestTesting.g:777:4: 'boolean'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:781:2: ( ( 'integer' ) )
                    {
                    // InternalAutomatedRestTesting.g:781:2: ( ( 'integer' ) )
                    // InternalAutomatedRestTesting.g:782:3: ( 'integer' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:783:3: ( 'integer' )
                    // InternalAutomatedRestTesting.g:783:4: 'integer'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:787:2: ( ( 'double' ) )
                    {
                    // InternalAutomatedRestTesting.g:787:2: ( ( 'double' ) )
                    // InternalAutomatedRestTesting.g:788:3: ( 'double' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:789:3: ( 'double' )
                    // InternalAutomatedRestTesting.g:789:4: 'double'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:793:2: ( ( 'date' ) )
                    {
                    // InternalAutomatedRestTesting.g:793:2: ( ( 'date' ) )
                    // InternalAutomatedRestTesting.g:794:3: ( 'date' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:795:3: ( 'date' )
                    // InternalAutomatedRestTesting.g:795:4: 'date'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:803:1: rule__RelationalOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:807:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            case 37:
                {
                alt8=7;
                }
                break;
            case 38:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAutomatedRestTesting.g:808:2: ( ( '<' ) )
                    {
                    // InternalAutomatedRestTesting.g:808:2: ( ( '<' ) )
                    // InternalAutomatedRestTesting.g:809:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:810:3: ( '<' )
                    // InternalAutomatedRestTesting.g:810:4: '<'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:814:2: ( ( '<=' ) )
                    {
                    // InternalAutomatedRestTesting.g:814:2: ( ( '<=' ) )
                    // InternalAutomatedRestTesting.g:815:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:816:3: ( '<=' )
                    // InternalAutomatedRestTesting.g:816:4: '<='
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:820:2: ( ( '==' ) )
                    {
                    // InternalAutomatedRestTesting.g:820:2: ( ( '==' ) )
                    // InternalAutomatedRestTesting.g:821:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:822:3: ( '==' )
                    // InternalAutomatedRestTesting.g:822:4: '=='
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:826:2: ( ( '!=' ) )
                    {
                    // InternalAutomatedRestTesting.g:826:2: ( ( '!=' ) )
                    // InternalAutomatedRestTesting.g:827:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:828:3: ( '!=' )
                    // InternalAutomatedRestTesting.g:828:4: '!='
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:832:2: ( ( '>=' ) )
                    {
                    // InternalAutomatedRestTesting.g:832:2: ( ( '>=' ) )
                    // InternalAutomatedRestTesting.g:833:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:834:3: ( '>=' )
                    // InternalAutomatedRestTesting.g:834:4: '>='
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:838:2: ( ( '>' ) )
                    {
                    // InternalAutomatedRestTesting.g:838:2: ( ( '>' ) )
                    // InternalAutomatedRestTesting.g:839:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:840:3: ( '>' )
                    // InternalAutomatedRestTesting.g:840:4: '>'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:844:2: ( ( '&&' ) )
                    {
                    // InternalAutomatedRestTesting.g:844:2: ( ( '&&' ) )
                    // InternalAutomatedRestTesting.g:845:3: ( '&&' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:846:3: ( '&&' )
                    // InternalAutomatedRestTesting.g:846:4: '&&'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:850:2: ( ( '||' ) )
                    {
                    // InternalAutomatedRestTesting.g:850:2: ( ( '||' ) )
                    // InternalAutomatedRestTesting.g:851:3: ( '||' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:852:3: ( '||' )
                    // InternalAutomatedRestTesting.g:852:4: '||'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:860:1: rule__MethodType__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__MethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:864:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAutomatedRestTesting.g:865:2: ( ( 'GET' ) )
                    {
                    // InternalAutomatedRestTesting.g:865:2: ( ( 'GET' ) )
                    // InternalAutomatedRestTesting.g:866:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:867:3: ( 'GET' )
                    // InternalAutomatedRestTesting.g:867:4: 'GET'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:871:2: ( ( 'POST' ) )
                    {
                    // InternalAutomatedRestTesting.g:871:2: ( ( 'POST' ) )
                    // InternalAutomatedRestTesting.g:872:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:873:3: ( 'POST' )
                    // InternalAutomatedRestTesting.g:873:4: 'POST'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:877:2: ( ( 'PUT' ) )
                    {
                    // InternalAutomatedRestTesting.g:877:2: ( ( 'PUT' ) )
                    // InternalAutomatedRestTesting.g:878:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:879:3: ( 'PUT' )
                    // InternalAutomatedRestTesting.g:879:4: 'PUT'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:883:2: ( ( 'DELETE' ) )
                    {
                    // InternalAutomatedRestTesting.g:883:2: ( ( 'DELETE' ) )
                    // InternalAutomatedRestTesting.g:884:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:885:3: ( 'DELETE' )
                    // InternalAutomatedRestTesting.g:885:4: 'DELETE'
                    {
                    match(input,42,FOLLOW_2); 

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


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalAutomatedRestTesting.g:893:1: rule__ParameterType__Alternatives : ( ( ( '/:' ) ) | ( ( '?$' ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:897:1: ( ( ( '/:' ) ) | ( ( '?$' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAutomatedRestTesting.g:898:2: ( ( '/:' ) )
                    {
                    // InternalAutomatedRestTesting.g:898:2: ( ( '/:' ) )
                    // InternalAutomatedRestTesting.g:899:3: ( '/:' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:900:3: ( '/:' )
                    // InternalAutomatedRestTesting.g:900:4: '/:'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:904:2: ( ( '?$' ) )
                    {
                    // InternalAutomatedRestTesting.g:904:2: ( ( '?$' ) )
                    // InternalAutomatedRestTesting.g:905:3: ( '?$' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:906:3: ( '?$' )
                    // InternalAutomatedRestTesting.g:906:4: '?$'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__MockTypes__Alternatives"
    // InternalAutomatedRestTesting.g:914:1: rule__MockTypes__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) );
    public final void rule__MockTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:918:1: ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) )
            int alt11=13;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 47:
                {
                alt11=3;
                }
                break;
            case 48:
                {
                alt11=4;
                }
                break;
            case 49:
                {
                alt11=5;
                }
                break;
            case 50:
                {
                alt11=6;
                }
                break;
            case 51:
                {
                alt11=7;
                }
                break;
            case 52:
                {
                alt11=8;
                }
                break;
            case 53:
                {
                alt11=9;
                }
                break;
            case 54:
                {
                alt11=10;
                }
                break;
            case 55:
                {
                alt11=11;
                }
                break;
            case 56:
                {
                alt11=12;
                }
                break;
            case 57:
                {
                alt11=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAutomatedRestTesting.g:919:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:919:2: ( ( 'FirstNameType' ) )
                    // InternalAutomatedRestTesting.g:920:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:921:3: ( 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:921:4: 'FirstNameType'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:925:2: ( ( 'FirstNameMaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:925:2: ( ( 'FirstNameMaleType' ) )
                    // InternalAutomatedRestTesting.g:926:3: ( 'FirstNameMaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:927:3: ( 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:927:4: 'FirstNameMaleType'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:931:2: ( ( 'FirstNameFemaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:931:2: ( ( 'FirstNameFemaleType' ) )
                    // InternalAutomatedRestTesting.g:932:3: ( 'FirstNameFemaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:933:3: ( 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:933:4: 'FirstNameFemaleType'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:937:2: ( ( 'LastNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:937:2: ( ( 'LastNameType' ) )
                    // InternalAutomatedRestTesting.g:938:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:939:3: ( 'LastNameType' )
                    // InternalAutomatedRestTesting.g:939:4: 'LastNameType'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:943:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:943:2: ( ( 'FamilyNameType' ) )
                    // InternalAutomatedRestTesting.g:944:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:945:3: ( 'FamilyNameType' )
                    // InternalAutomatedRestTesting.g:945:4: 'FamilyNameType'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:949:2: ( ( 'FullNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:949:2: ( ( 'FullNameType' ) )
                    // InternalAutomatedRestTesting.g:950:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:951:3: ( 'FullNameType' )
                    // InternalAutomatedRestTesting.g:951:4: 'FullNameType'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:955:2: ( ( 'GenderType' ) )
                    {
                    // InternalAutomatedRestTesting.g:955:2: ( ( 'GenderType' ) )
                    // InternalAutomatedRestTesting.g:956:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:957:3: ( 'GenderType' )
                    // InternalAutomatedRestTesting.g:957:4: 'GenderType'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:961:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalAutomatedRestTesting.g:961:2: ( ( 'EmailAddressType' ) )
                    // InternalAutomatedRestTesting.g:962:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:963:3: ( 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:963:4: 'EmailAddressType'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:967:2: ( ( 'PhoneType' ) )
                    {
                    // InternalAutomatedRestTesting.g:967:2: ( ( 'PhoneType' ) )
                    // InternalAutomatedRestTesting.g:968:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 
                    // InternalAutomatedRestTesting.g:969:3: ( 'PhoneType' )
                    // InternalAutomatedRestTesting.g:969:4: 'PhoneType'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:973:2: ( ( 'CountryType' ) )
                    {
                    // InternalAutomatedRestTesting.g:973:2: ( ( 'CountryType' ) )
                    // InternalAutomatedRestTesting.g:974:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 
                    // InternalAutomatedRestTesting.g:975:3: ( 'CountryType' )
                    // InternalAutomatedRestTesting.g:975:4: 'CountryType'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:979:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalAutomatedRestTesting.g:979:2: ( ( 'CountryCodeType' ) )
                    // InternalAutomatedRestTesting.g:980:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 
                    // InternalAutomatedRestTesting.g:981:3: ( 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:981:4: 'CountryCodeType'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:985:2: ( ( 'CityType' ) )
                    {
                    // InternalAutomatedRestTesting.g:985:2: ( ( 'CityType' ) )
                    // InternalAutomatedRestTesting.g:986:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 
                    // InternalAutomatedRestTesting.g:987:3: ( 'CityType' )
                    // InternalAutomatedRestTesting.g:987:4: 'CityType'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:991:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalAutomatedRestTesting.g:991:2: ( ( 'RowNumberType' ) )
                    // InternalAutomatedRestTesting.g:992:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalAutomatedRestTesting.g:993:3: ( 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:993:4: 'RowNumberType'
                    {
                    match(input,57,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1001:1: rule__AutomatedRestTesting__Group__0 : rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 ;
    public final void rule__AutomatedRestTesting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1005:1: ( rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 )
            // InternalAutomatedRestTesting.g:1006:2: rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1
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
    // InternalAutomatedRestTesting.g:1013:1: rule__AutomatedRestTesting__Group__0__Impl : ( () ) ;
    public final void rule__AutomatedRestTesting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1017:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:1018:1: ( () )
            {
            // InternalAutomatedRestTesting.g:1018:1: ( () )
            // InternalAutomatedRestTesting.g:1019:2: ()
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0()); 
            // InternalAutomatedRestTesting.g:1020:2: ()
            // InternalAutomatedRestTesting.g:1020:3: 
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
    // InternalAutomatedRestTesting.g:1028:1: rule__AutomatedRestTesting__Group__1 : rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 ;
    public final void rule__AutomatedRestTesting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1032:1: ( rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 )
            // InternalAutomatedRestTesting.g:1033:2: rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2
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
    // InternalAutomatedRestTesting.g:1040:1: rule__AutomatedRestTesting__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__AutomatedRestTesting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1044:1: ( ( 'apiURL' ) )
            // InternalAutomatedRestTesting.g:1045:1: ( 'apiURL' )
            {
            // InternalAutomatedRestTesting.g:1045:1: ( 'apiURL' )
            // InternalAutomatedRestTesting.g:1046:2: 'apiURL'
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1055:1: rule__AutomatedRestTesting__Group__2 : rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 ;
    public final void rule__AutomatedRestTesting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1059:1: ( rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 )
            // InternalAutomatedRestTesting.g:1060:2: rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3
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
    // InternalAutomatedRestTesting.g:1067:1: rule__AutomatedRestTesting__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__AutomatedRestTesting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1071:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1072:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1072:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1073:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1082:1: rule__AutomatedRestTesting__Group__3 : rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 ;
    public final void rule__AutomatedRestTesting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1086:1: ( rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 )
            // InternalAutomatedRestTesting.g:1087:2: rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4
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
    // InternalAutomatedRestTesting.g:1094:1: rule__AutomatedRestTesting__Group__3__Impl : ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) ;
    public final void rule__AutomatedRestTesting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1098:1: ( ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:1099:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:1099:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            // InternalAutomatedRestTesting.g:1100:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getUrlAssignment_3()); 
            // InternalAutomatedRestTesting.g:1101:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            // InternalAutomatedRestTesting.g:1101:3: rule__AutomatedRestTesting__UrlAssignment_3
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
    // InternalAutomatedRestTesting.g:1109:1: rule__AutomatedRestTesting__Group__4 : rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 ;
    public final void rule__AutomatedRestTesting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1113:1: ( rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 )
            // InternalAutomatedRestTesting.g:1114:2: rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5
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
    // InternalAutomatedRestTesting.g:1121:1: rule__AutomatedRestTesting__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AutomatedRestTesting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1125:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1126:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1126:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1127:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1136:1: rule__AutomatedRestTesting__Group__5 : rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 ;
    public final void rule__AutomatedRestTesting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1140:1: ( rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 )
            // InternalAutomatedRestTesting.g:1141:2: rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6
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
    // InternalAutomatedRestTesting.g:1148:1: rule__AutomatedRestTesting__Group__5__Impl : ( ( rule__AutomatedRestTesting__Group_5__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1152:1: ( ( ( rule__AutomatedRestTesting__Group_5__0 )? ) )
            // InternalAutomatedRestTesting.g:1153:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:1153:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            // InternalAutomatedRestTesting.g:1154:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_5()); 
            // InternalAutomatedRestTesting.g:1155:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=73 && LA12_0<=74)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1155:3: rule__AutomatedRestTesting__Group_5__0
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
    // InternalAutomatedRestTesting.g:1163:1: rule__AutomatedRestTesting__Group__6 : rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 ;
    public final void rule__AutomatedRestTesting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1167:1: ( rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 )
            // InternalAutomatedRestTesting.g:1168:2: rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7
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
    // InternalAutomatedRestTesting.g:1175:1: rule__AutomatedRestTesting__Group__6__Impl : ( ( rule__AutomatedRestTesting__Group_6__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1179:1: ( ( ( rule__AutomatedRestTesting__Group_6__0 )? ) )
            // InternalAutomatedRestTesting.g:1180:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            {
            // InternalAutomatedRestTesting.g:1180:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            // InternalAutomatedRestTesting.g:1181:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:1182:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=42)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1182:3: rule__AutomatedRestTesting__Group_6__0
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
    // InternalAutomatedRestTesting.g:1190:1: rule__AutomatedRestTesting__Group__7 : rule__AutomatedRestTesting__Group__7__Impl ;
    public final void rule__AutomatedRestTesting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1194:1: ( rule__AutomatedRestTesting__Group__7__Impl )
            // InternalAutomatedRestTesting.g:1195:2: rule__AutomatedRestTesting__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:1201:1: rule__AutomatedRestTesting__Group__7__Impl : ( ( rule__AutomatedRestTesting__Group_7__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1205:1: ( ( ( rule__AutomatedRestTesting__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:1206:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:1206:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:1207:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1208:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==63) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1208:3: rule__AutomatedRestTesting__Group_7__0
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
    // InternalAutomatedRestTesting.g:1217:1: rule__AutomatedRestTesting__Group_5__0 : rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 ;
    public final void rule__AutomatedRestTesting__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1221:1: ( rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 )
            // InternalAutomatedRestTesting.g:1222:2: rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1
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
    // InternalAutomatedRestTesting.g:1229:1: rule__AutomatedRestTesting__Group_5__0__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1233:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) )
            // InternalAutomatedRestTesting.g:1234:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            {
            // InternalAutomatedRestTesting.g:1234:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            // InternalAutomatedRestTesting.g:1235:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_0()); 
            // InternalAutomatedRestTesting.g:1236:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            // InternalAutomatedRestTesting.g:1236:3: rule__AutomatedRestTesting__DataElementsAssignment_5_0
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
    // InternalAutomatedRestTesting.g:1244:1: rule__AutomatedRestTesting__Group_5__1 : rule__AutomatedRestTesting__Group_5__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1248:1: ( rule__AutomatedRestTesting__Group_5__1__Impl )
            // InternalAutomatedRestTesting.g:1249:2: rule__AutomatedRestTesting__Group_5__1__Impl
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
    // InternalAutomatedRestTesting.g:1255:1: rule__AutomatedRestTesting__Group_5__1__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1259:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) )
            // InternalAutomatedRestTesting.g:1260:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            {
            // InternalAutomatedRestTesting.g:1260:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            // InternalAutomatedRestTesting.g:1261:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_1()); 
            // InternalAutomatedRestTesting.g:1262:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=73 && LA15_0<=74)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1262:3: rule__AutomatedRestTesting__DataElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AutomatedRestTesting__DataElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAutomatedRestTesting.g:1271:1: rule__AutomatedRestTesting__Group_6__0 : rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 ;
    public final void rule__AutomatedRestTesting__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1275:1: ( rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 )
            // InternalAutomatedRestTesting.g:1276:2: rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1
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
    // InternalAutomatedRestTesting.g:1283:1: rule__AutomatedRestTesting__Group_6__0__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1287:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:1288:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:1288:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:1289:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:1290:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:1290:3: rule__AutomatedRestTesting__ServicesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:1298:1: rule__AutomatedRestTesting__Group_6__1 : rule__AutomatedRestTesting__Group_6__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1302:1: ( rule__AutomatedRestTesting__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:1303:2: rule__AutomatedRestTesting__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:1309:1: rule__AutomatedRestTesting__Group_6__1__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1313:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) )
            // InternalAutomatedRestTesting.g:1314:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            {
            // InternalAutomatedRestTesting.g:1314:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            // InternalAutomatedRestTesting.g:1315:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_1()); 
            // InternalAutomatedRestTesting.g:1316:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=39 && LA16_0<=42)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1316:3: rule__AutomatedRestTesting__ServicesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AutomatedRestTesting__ServicesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAutomatedRestTesting.g:1325:1: rule__AutomatedRestTesting__Group_7__0 : rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 ;
    public final void rule__AutomatedRestTesting__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1329:1: ( rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 )
            // InternalAutomatedRestTesting.g:1330:2: rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1
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
    // InternalAutomatedRestTesting.g:1337:1: rule__AutomatedRestTesting__Group_7__0__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1341:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) )
            // InternalAutomatedRestTesting.g:1342:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            {
            // InternalAutomatedRestTesting.g:1342:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            // InternalAutomatedRestTesting.g:1343:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_0()); 
            // InternalAutomatedRestTesting.g:1344:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            // InternalAutomatedRestTesting.g:1344:3: rule__AutomatedRestTesting__TestsAssignment_7_0
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
    // InternalAutomatedRestTesting.g:1352:1: rule__AutomatedRestTesting__Group_7__1 : rule__AutomatedRestTesting__Group_7__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1356:1: ( rule__AutomatedRestTesting__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:1357:2: rule__AutomatedRestTesting__Group_7__1__Impl
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
    // InternalAutomatedRestTesting.g:1363:1: rule__AutomatedRestTesting__Group_7__1__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1367:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) )
            // InternalAutomatedRestTesting.g:1368:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            {
            // InternalAutomatedRestTesting.g:1368:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            // InternalAutomatedRestTesting.g:1369:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_1()); 
            // InternalAutomatedRestTesting.g:1370:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==63) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1370:3: rule__AutomatedRestTesting__TestsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AutomatedRestTesting__TestsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__RestService__Group__0"
    // InternalAutomatedRestTesting.g:1379:1: rule__RestService__Group__0 : rule__RestService__Group__0__Impl rule__RestService__Group__1 ;
    public final void rule__RestService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1383:1: ( rule__RestService__Group__0__Impl rule__RestService__Group__1 )
            // InternalAutomatedRestTesting.g:1384:2: rule__RestService__Group__0__Impl rule__RestService__Group__1
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
    // InternalAutomatedRestTesting.g:1391:1: rule__RestService__Group__0__Impl : ( ( rule__RestService__MethodAssignment_0 ) ) ;
    public final void rule__RestService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1395:1: ( ( ( rule__RestService__MethodAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:1396:1: ( ( rule__RestService__MethodAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:1396:1: ( ( rule__RestService__MethodAssignment_0 ) )
            // InternalAutomatedRestTesting.g:1397:2: ( rule__RestService__MethodAssignment_0 )
            {
             before(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 
            // InternalAutomatedRestTesting.g:1398:2: ( rule__RestService__MethodAssignment_0 )
            // InternalAutomatedRestTesting.g:1398:3: rule__RestService__MethodAssignment_0
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
    // InternalAutomatedRestTesting.g:1406:1: rule__RestService__Group__1 : rule__RestService__Group__1__Impl rule__RestService__Group__2 ;
    public final void rule__RestService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1410:1: ( rule__RestService__Group__1__Impl rule__RestService__Group__2 )
            // InternalAutomatedRestTesting.g:1411:2: rule__RestService__Group__1__Impl rule__RestService__Group__2
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
    // InternalAutomatedRestTesting.g:1418:1: rule__RestService__Group__1__Impl : ( ( rule__RestService__NameAssignment_1 ) ) ;
    public final void rule__RestService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1422:1: ( ( ( rule__RestService__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1423:1: ( ( rule__RestService__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1423:1: ( ( rule__RestService__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1424:2: ( rule__RestService__NameAssignment_1 )
            {
             before(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1425:2: ( rule__RestService__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1425:3: rule__RestService__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:1433:1: rule__RestService__Group__2 : rule__RestService__Group__2__Impl rule__RestService__Group__3 ;
    public final void rule__RestService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1437:1: ( rule__RestService__Group__2__Impl rule__RestService__Group__3 )
            // InternalAutomatedRestTesting.g:1438:2: rule__RestService__Group__2__Impl rule__RestService__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalAutomatedRestTesting.g:1445:1: rule__RestService__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1449:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1450:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1450:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1451:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1460:1: rule__RestService__Group__3 : rule__RestService__Group__3__Impl rule__RestService__Group__4 ;
    public final void rule__RestService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1464:1: ( rule__RestService__Group__3__Impl rule__RestService__Group__4 )
            // InternalAutomatedRestTesting.g:1465:2: rule__RestService__Group__3__Impl rule__RestService__Group__4
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
    // InternalAutomatedRestTesting.g:1472:1: rule__RestService__Group__3__Impl : ( 'URL' ) ;
    public final void rule__RestService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1476:1: ( ( 'URL' ) )
            // InternalAutomatedRestTesting.g:1477:1: ( 'URL' )
            {
            // InternalAutomatedRestTesting.g:1477:1: ( 'URL' )
            // InternalAutomatedRestTesting.g:1478:2: 'URL'
            {
             before(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1487:1: rule__RestService__Group__4 : rule__RestService__Group__4__Impl rule__RestService__Group__5 ;
    public final void rule__RestService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1491:1: ( rule__RestService__Group__4__Impl rule__RestService__Group__5 )
            // InternalAutomatedRestTesting.g:1492:2: rule__RestService__Group__4__Impl rule__RestService__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAutomatedRestTesting.g:1499:1: rule__RestService__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1503:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1504:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1504:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1505:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1514:1: rule__RestService__Group__5 : rule__RestService__Group__5__Impl rule__RestService__Group__6 ;
    public final void rule__RestService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1518:1: ( rule__RestService__Group__5__Impl rule__RestService__Group__6 )
            // InternalAutomatedRestTesting.g:1519:2: rule__RestService__Group__5__Impl rule__RestService__Group__6
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
    // InternalAutomatedRestTesting.g:1526:1: rule__RestService__Group__5__Impl : ( ( rule__RestService__UriAssignment_5 ) ) ;
    public final void rule__RestService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1530:1: ( ( ( rule__RestService__UriAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1531:1: ( ( rule__RestService__UriAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1531:1: ( ( rule__RestService__UriAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1532:2: ( rule__RestService__UriAssignment_5 )
            {
             before(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 
            // InternalAutomatedRestTesting.g:1533:2: ( rule__RestService__UriAssignment_5 )
            // InternalAutomatedRestTesting.g:1533:3: rule__RestService__UriAssignment_5
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
    // InternalAutomatedRestTesting.g:1541:1: rule__RestService__Group__6 : rule__RestService__Group__6__Impl rule__RestService__Group__7 ;
    public final void rule__RestService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1545:1: ( rule__RestService__Group__6__Impl rule__RestService__Group__7 )
            // InternalAutomatedRestTesting.g:1546:2: rule__RestService__Group__6__Impl rule__RestService__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalAutomatedRestTesting.g:1553:1: rule__RestService__Group__6__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1557:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1558:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1558:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1559:2: ruleEString
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
    // InternalAutomatedRestTesting.g:1568:1: rule__RestService__Group__7 : rule__RestService__Group__7__Impl rule__RestService__Group__8 ;
    public final void rule__RestService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1572:1: ( rule__RestService__Group__7__Impl rule__RestService__Group__8 )
            // InternalAutomatedRestTesting.g:1573:2: rule__RestService__Group__7__Impl rule__RestService__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalAutomatedRestTesting.g:1580:1: rule__RestService__Group__7__Impl : ( ( rule__RestService__Alternatives_7 )* ) ;
    public final void rule__RestService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1584:1: ( ( ( rule__RestService__Alternatives_7 )* ) )
            // InternalAutomatedRestTesting.g:1585:1: ( ( rule__RestService__Alternatives_7 )* )
            {
            // InternalAutomatedRestTesting.g:1585:1: ( ( rule__RestService__Alternatives_7 )* )
            // InternalAutomatedRestTesting.g:1586:2: ( rule__RestService__Alternatives_7 )*
            {
             before(grammarAccess.getRestServiceAccess().getAlternatives_7()); 
            // InternalAutomatedRestTesting.g:1587:2: ( rule__RestService__Alternatives_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SLASH||(LA18_0>=43 && LA18_0<=44)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1587:3: rule__RestService__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RestService__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAutomatedRestTesting.g:1595:1: rule__RestService__Group__8 : rule__RestService__Group__8__Impl rule__RestService__Group__9 ;
    public final void rule__RestService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1599:1: ( rule__RestService__Group__8__Impl rule__RestService__Group__9 )
            // InternalAutomatedRestTesting.g:1600:2: rule__RestService__Group__8__Impl rule__RestService__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalAutomatedRestTesting.g:1607:1: rule__RestService__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1611:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1612:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1612:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1613:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1622:1: rule__RestService__Group__9 : rule__RestService__Group__9__Impl rule__RestService__Group__10 ;
    public final void rule__RestService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1626:1: ( rule__RestService__Group__9__Impl rule__RestService__Group__10 )
            // InternalAutomatedRestTesting.g:1627:2: rule__RestService__Group__9__Impl rule__RestService__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalAutomatedRestTesting.g:1634:1: rule__RestService__Group__9__Impl : ( ( rule__RestService__Group_9__0 )? ) ;
    public final void rule__RestService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1638:1: ( ( ( rule__RestService__Group_9__0 )? ) )
            // InternalAutomatedRestTesting.g:1639:1: ( ( rule__RestService__Group_9__0 )? )
            {
            // InternalAutomatedRestTesting.g:1639:1: ( ( rule__RestService__Group_9__0 )? )
            // InternalAutomatedRestTesting.g:1640:2: ( rule__RestService__Group_9__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9()); 
            // InternalAutomatedRestTesting.g:1641:2: ( rule__RestService__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1641:3: rule__RestService__Group_9__0
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
    // InternalAutomatedRestTesting.g:1649:1: rule__RestService__Group__10 : rule__RestService__Group__10__Impl rule__RestService__Group__11 ;
    public final void rule__RestService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1653:1: ( rule__RestService__Group__10__Impl rule__RestService__Group__11 )
            // InternalAutomatedRestTesting.g:1654:2: rule__RestService__Group__10__Impl rule__RestService__Group__11
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
    // InternalAutomatedRestTesting.g:1661:1: rule__RestService__Group__10__Impl : ( 'Response' ) ;
    public final void rule__RestService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1665:1: ( ( 'Response' ) )
            // InternalAutomatedRestTesting.g:1666:1: ( 'Response' )
            {
            // InternalAutomatedRestTesting.g:1666:1: ( 'Response' )
            // InternalAutomatedRestTesting.g:1667:2: 'Response'
            {
             before(grammarAccess.getRestServiceAccess().getResponseKeyword_10()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1676:1: rule__RestService__Group__11 : rule__RestService__Group__11__Impl rule__RestService__Group__12 ;
    public final void rule__RestService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1680:1: ( rule__RestService__Group__11__Impl rule__RestService__Group__12 )
            // InternalAutomatedRestTesting.g:1681:2: rule__RestService__Group__11__Impl rule__RestService__Group__12
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:1688:1: rule__RestService__Group__11__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1692:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1693:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1693:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1694:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1703:1: rule__RestService__Group__12 : rule__RestService__Group__12__Impl rule__RestService__Group__13 ;
    public final void rule__RestService__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1707:1: ( rule__RestService__Group__12__Impl rule__RestService__Group__13 )
            // InternalAutomatedRestTesting.g:1708:2: rule__RestService__Group__12__Impl rule__RestService__Group__13
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
    // InternalAutomatedRestTesting.g:1715:1: rule__RestService__Group__12__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1719:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:1720:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:1720:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:1721:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_12()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1730:1: rule__RestService__Group__13 : rule__RestService__Group__13__Impl rule__RestService__Group__14 ;
    public final void rule__RestService__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1734:1: ( rule__RestService__Group__13__Impl rule__RestService__Group__14 )
            // InternalAutomatedRestTesting.g:1735:2: rule__RestService__Group__13__Impl rule__RestService__Group__14
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
    // InternalAutomatedRestTesting.g:1742:1: rule__RestService__Group__13__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1746:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1747:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1747:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1748:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1757:1: rule__RestService__Group__14 : rule__RestService__Group__14__Impl rule__RestService__Group__15 ;
    public final void rule__RestService__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1761:1: ( rule__RestService__Group__14__Impl rule__RestService__Group__15 )
            // InternalAutomatedRestTesting.g:1762:2: rule__RestService__Group__14__Impl rule__RestService__Group__15
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:1769:1: rule__RestService__Group__14__Impl : ( ( rule__RestService__ResponseAssignment_14 ) ) ;
    public final void rule__RestService__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1773:1: ( ( ( rule__RestService__ResponseAssignment_14 ) ) )
            // InternalAutomatedRestTesting.g:1774:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            {
            // InternalAutomatedRestTesting.g:1774:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            // InternalAutomatedRestTesting.g:1775:2: ( rule__RestService__ResponseAssignment_14 )
            {
             before(grammarAccess.getRestServiceAccess().getResponseAssignment_14()); 
            // InternalAutomatedRestTesting.g:1776:2: ( rule__RestService__ResponseAssignment_14 )
            // InternalAutomatedRestTesting.g:1776:3: rule__RestService__ResponseAssignment_14
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
    // InternalAutomatedRestTesting.g:1784:1: rule__RestService__Group__15 : rule__RestService__Group__15__Impl rule__RestService__Group__16 ;
    public final void rule__RestService__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1788:1: ( rule__RestService__Group__15__Impl rule__RestService__Group__16 )
            // InternalAutomatedRestTesting.g:1789:2: rule__RestService__Group__15__Impl rule__RestService__Group__16
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:1796:1: rule__RestService__Group__15__Impl : ( ( rule__RestService__Group_15__0 )? ) ;
    public final void rule__RestService__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1800:1: ( ( ( rule__RestService__Group_15__0 )? ) )
            // InternalAutomatedRestTesting.g:1801:1: ( ( rule__RestService__Group_15__0 )? )
            {
            // InternalAutomatedRestTesting.g:1801:1: ( ( rule__RestService__Group_15__0 )? )
            // InternalAutomatedRestTesting.g:1802:2: ( rule__RestService__Group_15__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_15()); 
            // InternalAutomatedRestTesting.g:1803:2: ( rule__RestService__Group_15__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1803:3: rule__RestService__Group_15__0
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
    // InternalAutomatedRestTesting.g:1811:1: rule__RestService__Group__16 : rule__RestService__Group__16__Impl rule__RestService__Group__17 ;
    public final void rule__RestService__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1815:1: ( rule__RestService__Group__16__Impl rule__RestService__Group__17 )
            // InternalAutomatedRestTesting.g:1816:2: rule__RestService__Group__16__Impl rule__RestService__Group__17
            {
            pushFollow(FOLLOW_22);
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
    // InternalAutomatedRestTesting.g:1823:1: rule__RestService__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1827:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1828:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1828:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1829:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1838:1: rule__RestService__Group__17 : rule__RestService__Group__17__Impl rule__RestService__Group__18 ;
    public final void rule__RestService__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1842:1: ( rule__RestService__Group__17__Impl rule__RestService__Group__18 )
            // InternalAutomatedRestTesting.g:1843:2: rule__RestService__Group__17__Impl rule__RestService__Group__18
            {
            pushFollow(FOLLOW_22);
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
    // InternalAutomatedRestTesting.g:1850:1: rule__RestService__Group__17__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1854:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1855:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1855:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1856:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:1865:1: rule__RestService__Group__18 : rule__RestService__Group__18__Impl ;
    public final void rule__RestService__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1869:1: ( rule__RestService__Group__18__Impl )
            // InternalAutomatedRestTesting.g:1870:2: rule__RestService__Group__18__Impl
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
    // InternalAutomatedRestTesting.g:1876:1: rule__RestService__Group__18__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1880:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1881:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1881:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1882:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:1892:1: rule__RestService__Group_7_0__0 : rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 ;
    public final void rule__RestService__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1896:1: ( rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 )
            // InternalAutomatedRestTesting.g:1897:2: rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1
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
    // InternalAutomatedRestTesting.g:1904:1: rule__RestService__Group_7_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__RestService__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1908:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:1909:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:1909:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:1910:2: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:1919:1: rule__RestService__Group_7_0__1 : rule__RestService__Group_7_0__1__Impl ;
    public final void rule__RestService__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1923:1: ( rule__RestService__Group_7_0__1__Impl )
            // InternalAutomatedRestTesting.g:1924:2: rule__RestService__Group_7_0__1__Impl
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
    // InternalAutomatedRestTesting.g:1930:1: rule__RestService__Group_7_0__1__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1934:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1935:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1935:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1936:2: ruleEString
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
    // InternalAutomatedRestTesting.g:1946:1: rule__RestService__Group_9__0 : rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 ;
    public final void rule__RestService__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1950:1: ( rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 )
            // InternalAutomatedRestTesting.g:1951:2: rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1
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
    // InternalAutomatedRestTesting.g:1958:1: rule__RestService__Group_9__0__Impl : ( 'Request' ) ;
    public final void rule__RestService__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1962:1: ( ( 'Request' ) )
            // InternalAutomatedRestTesting.g:1963:1: ( 'Request' )
            {
            // InternalAutomatedRestTesting.g:1963:1: ( 'Request' )
            // InternalAutomatedRestTesting.g:1964:2: 'Request'
            {
             before(grammarAccess.getRestServiceAccess().getRequestKeyword_9_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1973:1: rule__RestService__Group_9__1 : rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 ;
    public final void rule__RestService__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1977:1: ( rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 )
            // InternalAutomatedRestTesting.g:1978:2: rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:1985:1: rule__RestService__Group_9__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1989:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1990:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1990:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1991:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2000:1: rule__RestService__Group_9__2 : rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 ;
    public final void rule__RestService__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2004:1: ( rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 )
            // InternalAutomatedRestTesting.g:2005:2: rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3
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
    // InternalAutomatedRestTesting.g:2012:1: rule__RestService__Group_9__2__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2016:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2017:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2017:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2018:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_9_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2027:1: rule__RestService__Group_9__3 : rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 ;
    public final void rule__RestService__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2031:1: ( rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 )
            // InternalAutomatedRestTesting.g:2032:2: rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4
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
    // InternalAutomatedRestTesting.g:2039:1: rule__RestService__Group_9__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2043:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2044:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2044:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2045:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2054:1: rule__RestService__Group_9__4 : rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 ;
    public final void rule__RestService__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2058:1: ( rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 )
            // InternalAutomatedRestTesting.g:2059:2: rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:2066:1: rule__RestService__Group_9__4__Impl : ( ( rule__RestService__RequestAssignment_9_4 ) ) ;
    public final void rule__RestService__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2070:1: ( ( ( rule__RestService__RequestAssignment_9_4 ) ) )
            // InternalAutomatedRestTesting.g:2071:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            {
            // InternalAutomatedRestTesting.g:2071:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            // InternalAutomatedRestTesting.g:2072:2: ( rule__RestService__RequestAssignment_9_4 )
            {
             before(grammarAccess.getRestServiceAccess().getRequestAssignment_9_4()); 
            // InternalAutomatedRestTesting.g:2073:2: ( rule__RestService__RequestAssignment_9_4 )
            // InternalAutomatedRestTesting.g:2073:3: rule__RestService__RequestAssignment_9_4
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
    // InternalAutomatedRestTesting.g:2081:1: rule__RestService__Group_9__5 : rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 ;
    public final void rule__RestService__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2085:1: ( rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 )
            // InternalAutomatedRestTesting.g:2086:2: rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:2093:1: rule__RestService__Group_9__5__Impl : ( ( rule__RestService__Group_9_5__0 )? ) ;
    public final void rule__RestService__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2097:1: ( ( ( rule__RestService__Group_9_5__0 )? ) )
            // InternalAutomatedRestTesting.g:2098:1: ( ( rule__RestService__Group_9_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:2098:1: ( ( rule__RestService__Group_9_5__0 )? )
            // InternalAutomatedRestTesting.g:2099:2: ( rule__RestService__Group_9_5__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9_5()); 
            // InternalAutomatedRestTesting.g:2100:2: ( rule__RestService__Group_9_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2100:3: rule__RestService__Group_9_5__0
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
    // InternalAutomatedRestTesting.g:2108:1: rule__RestService__Group_9__6 : rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 ;
    public final void rule__RestService__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2112:1: ( rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 )
            // InternalAutomatedRestTesting.g:2113:2: rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalAutomatedRestTesting.g:2120:1: rule__RestService__Group_9__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2124:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2125:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2125:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2126:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2135:1: rule__RestService__Group_9__7 : rule__RestService__Group_9__7__Impl ;
    public final void rule__RestService__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2139:1: ( rule__RestService__Group_9__7__Impl )
            // InternalAutomatedRestTesting.g:2140:2: rule__RestService__Group_9__7__Impl
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
    // InternalAutomatedRestTesting.g:2146:1: rule__RestService__Group_9__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2150:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2151:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2151:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2152:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2162:1: rule__RestService__Group_9_5__0 : rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 ;
    public final void rule__RestService__Group_9_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2166:1: ( rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 )
            // InternalAutomatedRestTesting.g:2167:2: rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAutomatedRestTesting.g:2174:1: rule__RestService__Group_9_5__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2178:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2179:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2179:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2180:2: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_9_5_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_9_5_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2189:1: rule__RestService__Group_9_5__1 : rule__RestService__Group_9_5__1__Impl ;
    public final void rule__RestService__Group_9_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2193:1: ( rule__RestService__Group_9_5__1__Impl )
            // InternalAutomatedRestTesting.g:2194:2: rule__RestService__Group_9_5__1__Impl
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
    // InternalAutomatedRestTesting.g:2200:1: rule__RestService__Group_9_5__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2204:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2205:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2205:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2206:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_9_5_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_9_5_1()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2216:1: rule__RestService__Group_15__0 : rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 ;
    public final void rule__RestService__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2220:1: ( rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 )
            // InternalAutomatedRestTesting.g:2221:2: rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAutomatedRestTesting.g:2228:1: rule__RestService__Group_15__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2232:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2233:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2233:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2234:2: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_15_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_15_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2243:1: rule__RestService__Group_15__1 : rule__RestService__Group_15__1__Impl ;
    public final void rule__RestService__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2247:1: ( rule__RestService__Group_15__1__Impl )
            // InternalAutomatedRestTesting.g:2248:2: rule__RestService__Group_15__1__Impl
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
    // InternalAutomatedRestTesting.g:2254:1: rule__RestService__Group_15__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2258:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2259:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2259:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2260:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_15_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_15_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Test__Group__0"
    // InternalAutomatedRestTesting.g:2270:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2274:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAutomatedRestTesting.g:2275:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalAutomatedRestTesting.g:2282:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2286:1: ( ( 'Test' ) )
            // InternalAutomatedRestTesting.g:2287:1: ( 'Test' )
            {
            // InternalAutomatedRestTesting.g:2287:1: ( 'Test' )
            // InternalAutomatedRestTesting.g:2288:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2297:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2301:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAutomatedRestTesting.g:2302:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalAutomatedRestTesting.g:2309:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2313:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2314:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2314:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2315:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:2316:2: ( rule__Test__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:2316:3: rule__Test__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:2324:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2328:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAutomatedRestTesting.g:2329:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAutomatedRestTesting.g:2336:1: rule__Test__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2340:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2341:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2341:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2342:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2351:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2355:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAutomatedRestTesting.g:2356:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalAutomatedRestTesting.g:2363:1: rule__Test__Group__3__Impl : ( 'service' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2367:1: ( ( 'service' ) )
            // InternalAutomatedRestTesting.g:2368:1: ( 'service' )
            {
            // InternalAutomatedRestTesting.g:2368:1: ( 'service' )
            // InternalAutomatedRestTesting.g:2369:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2378:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2382:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAutomatedRestTesting.g:2383:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalAutomatedRestTesting.g:2390:1: rule__Test__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2394:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2395:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2395:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2396:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2405:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2409:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAutomatedRestTesting.g:2410:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalAutomatedRestTesting.g:2417:1: rule__Test__Group__5__Impl : ( ( rule__Test__ServiceAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2421:1: ( ( ( rule__Test__ServiceAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:2422:1: ( ( rule__Test__ServiceAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:2422:1: ( ( rule__Test__ServiceAssignment_5 ) )
            // InternalAutomatedRestTesting.g:2423:2: ( rule__Test__ServiceAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_5()); 
            // InternalAutomatedRestTesting.g:2424:2: ( rule__Test__ServiceAssignment_5 )
            // InternalAutomatedRestTesting.g:2424:3: rule__Test__ServiceAssignment_5
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
    // InternalAutomatedRestTesting.g:2432:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2436:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAutomatedRestTesting.g:2437:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalAutomatedRestTesting.g:2444:1: rule__Test__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2448:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2449:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2449:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2450:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2459:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2463:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAutomatedRestTesting.g:2464:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalAutomatedRestTesting.g:2471:1: rule__Test__Group__7__Impl : ( ( rule__Test__Group_7__0 )? ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2475:1: ( ( ( rule__Test__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:2476:1: ( ( rule__Test__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:2476:1: ( ( rule__Test__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:2477:2: ( rule__Test__Group_7__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:2478:2: ( rule__Test__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2478:3: rule__Test__Group_7__0
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
    // InternalAutomatedRestTesting.g:2486:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2490:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAutomatedRestTesting.g:2491:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalAutomatedRestTesting.g:2498:1: rule__Test__Group__8__Impl : ( ( rule__Test__Group_8__0 )? ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2502:1: ( ( ( rule__Test__Group_8__0 )? ) )
            // InternalAutomatedRestTesting.g:2503:1: ( ( rule__Test__Group_8__0 )? )
            {
            // InternalAutomatedRestTesting.g:2503:1: ( ( rule__Test__Group_8__0 )? )
            // InternalAutomatedRestTesting.g:2504:2: ( rule__Test__Group_8__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_8()); 
            // InternalAutomatedRestTesting.g:2505:2: ( rule__Test__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==67) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2505:3: rule__Test__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2513:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2517:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAutomatedRestTesting.g:2518:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalAutomatedRestTesting.g:2525:1: rule__Test__Group__9__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2529:1: ( ( 'Assertions' ) )
            // InternalAutomatedRestTesting.g:2530:1: ( 'Assertions' )
            {
            // InternalAutomatedRestTesting.g:2530:1: ( 'Assertions' )
            // InternalAutomatedRestTesting.g:2531:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_9()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_9()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2540:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2544:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAutomatedRestTesting.g:2545:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_26);
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
    // InternalAutomatedRestTesting.g:2552:1: rule__Test__Group__10__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2556:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2557:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2557:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2558:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_10()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_10()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2567:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2571:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAutomatedRestTesting.g:2572:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_22);
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
    // InternalAutomatedRestTesting.g:2579:1: rule__Test__Group__11__Impl : ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2583:1: ( ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) )
            // InternalAutomatedRestTesting.g:2584:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            {
            // InternalAutomatedRestTesting.g:2584:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            // InternalAutomatedRestTesting.g:2585:2: ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* )
            {
            // InternalAutomatedRestTesting.g:2585:2: ( ( rule__Test__Group_11__0 ) )
            // InternalAutomatedRestTesting.g:2586:3: ( rule__Test__Group_11__0 )
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2587:3: ( rule__Test__Group_11__0 )
            // InternalAutomatedRestTesting.g:2587:4: rule__Test__Group_11__0
            {
            pushFollow(FOLLOW_27);
            rule__Test__Group_11__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup_11()); 

            }

            // InternalAutomatedRestTesting.g:2590:2: ( ( rule__Test__Group_11__0 )* )
            // InternalAutomatedRestTesting.g:2591:3: ( rule__Test__Group_11__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2592:3: ( rule__Test__Group_11__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==68) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2592:4: rule__Test__Group_11__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Test__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalAutomatedRestTesting.g:2601:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2605:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalAutomatedRestTesting.g:2606:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_22);
            rule__Test__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__13();

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
    // InternalAutomatedRestTesting.g:2613:1: rule__Test__Group__12__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2617:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2618:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2618:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2619:2: RULE_RIGHT_BRACKET
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


    // $ANTLR start "rule__Test__Group__13"
    // InternalAutomatedRestTesting.g:2628:1: rule__Test__Group__13 : rule__Test__Group__13__Impl ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2632:1: ( rule__Test__Group__13__Impl )
            // InternalAutomatedRestTesting.g:2633:2: rule__Test__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__13__Impl();

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
    // $ANTLR end "rule__Test__Group__13"


    // $ANTLR start "rule__Test__Group__13__Impl"
    // InternalAutomatedRestTesting.g:2639:1: rule__Test__Group__13__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2643:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2644:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2644:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2645:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_13()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13__Impl"


    // $ANTLR start "rule__Test__Group_7__0"
    // InternalAutomatedRestTesting.g:2655:1: rule__Test__Group_7__0 : rule__Test__Group_7__0__Impl rule__Test__Group_7__1 ;
    public final void rule__Test__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2659:1: ( rule__Test__Group_7__0__Impl rule__Test__Group_7__1 )
            // InternalAutomatedRestTesting.g:2660:2: rule__Test__Group_7__0__Impl rule__Test__Group_7__1
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
    // InternalAutomatedRestTesting.g:2667:1: rule__Test__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2671:1: ( ( 'description' ) )
            // InternalAutomatedRestTesting.g:2672:1: ( 'description' )
            {
            // InternalAutomatedRestTesting.g:2672:1: ( 'description' )
            // InternalAutomatedRestTesting.g:2673:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_7_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2682:1: rule__Test__Group_7__1 : rule__Test__Group_7__1__Impl rule__Test__Group_7__2 ;
    public final void rule__Test__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2686:1: ( rule__Test__Group_7__1__Impl rule__Test__Group_7__2 )
            // InternalAutomatedRestTesting.g:2687:2: rule__Test__Group_7__1__Impl rule__Test__Group_7__2
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
    // InternalAutomatedRestTesting.g:2694:1: rule__Test__Group_7__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2698:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2699:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2699:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2700:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2709:1: rule__Test__Group_7__2 : rule__Test__Group_7__2__Impl rule__Test__Group_7__3 ;
    public final void rule__Test__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2713:1: ( rule__Test__Group_7__2__Impl rule__Test__Group_7__3 )
            // InternalAutomatedRestTesting.g:2714:2: rule__Test__Group_7__2__Impl rule__Test__Group_7__3
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
    // InternalAutomatedRestTesting.g:2721:1: rule__Test__Group_7__2__Impl : ( ( rule__Test__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Test__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2725:1: ( ( ( rule__Test__DescriptionAssignment_7_2 ) ) )
            // InternalAutomatedRestTesting.g:2726:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            {
            // InternalAutomatedRestTesting.g:2726:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            // InternalAutomatedRestTesting.g:2727:2: ( rule__Test__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_7_2()); 
            // InternalAutomatedRestTesting.g:2728:2: ( rule__Test__DescriptionAssignment_7_2 )
            // InternalAutomatedRestTesting.g:2728:3: rule__Test__DescriptionAssignment_7_2
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
    // InternalAutomatedRestTesting.g:2736:1: rule__Test__Group_7__3 : rule__Test__Group_7__3__Impl ;
    public final void rule__Test__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2740:1: ( rule__Test__Group_7__3__Impl )
            // InternalAutomatedRestTesting.g:2741:2: rule__Test__Group_7__3__Impl
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
    // InternalAutomatedRestTesting.g:2747:1: rule__Test__Group_7__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2751:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2752:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2752:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2753:2: RULE_SEMICOLON
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


    // $ANTLR start "rule__Test__Group_8__0"
    // InternalAutomatedRestTesting.g:2763:1: rule__Test__Group_8__0 : rule__Test__Group_8__0__Impl rule__Test__Group_8__1 ;
    public final void rule__Test__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2767:1: ( rule__Test__Group_8__0__Impl rule__Test__Group_8__1 )
            // InternalAutomatedRestTesting.g:2768:2: rule__Test__Group_8__0__Impl rule__Test__Group_8__1
            {
            pushFollow(FOLLOW_28);
            rule__Test__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_8__1();

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
    // $ANTLR end "rule__Test__Group_8__0"


    // $ANTLR start "rule__Test__Group_8__0__Impl"
    // InternalAutomatedRestTesting.g:2775:1: rule__Test__Group_8__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2779:1: ( ( 'Mapping' ) )
            // InternalAutomatedRestTesting.g:2780:1: ( 'Mapping' )
            {
            // InternalAutomatedRestTesting.g:2780:1: ( 'Mapping' )
            // InternalAutomatedRestTesting.g:2781:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_8_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getMappingKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_8__0__Impl"


    // $ANTLR start "rule__Test__Group_8__1"
    // InternalAutomatedRestTesting.g:2790:1: rule__Test__Group_8__1 : rule__Test__Group_8__1__Impl rule__Test__Group_8__2 ;
    public final void rule__Test__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2794:1: ( rule__Test__Group_8__1__Impl rule__Test__Group_8__2 )
            // InternalAutomatedRestTesting.g:2795:2: rule__Test__Group_8__1__Impl rule__Test__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_8__2();

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
    // $ANTLR end "rule__Test__Group_8__1"


    // $ANTLR start "rule__Test__Group_8__1__Impl"
    // InternalAutomatedRestTesting.g:2802:1: rule__Test__Group_8__1__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Test__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2806:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2807:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2807:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2808:2: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getTestAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_8_1()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_8__1__Impl"


    // $ANTLR start "rule__Test__Group_8__2"
    // InternalAutomatedRestTesting.g:2817:1: rule__Test__Group_8__2 : rule__Test__Group_8__2__Impl rule__Test__Group_8__3 ;
    public final void rule__Test__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2821:1: ( rule__Test__Group_8__2__Impl rule__Test__Group_8__3 )
            // InternalAutomatedRestTesting.g:2822:2: rule__Test__Group_8__2__Impl rule__Test__Group_8__3
            {
            pushFollow(FOLLOW_29);
            rule__Test__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_8__3();

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
    // $ANTLR end "rule__Test__Group_8__2"


    // $ANTLR start "rule__Test__Group_8__2__Impl"
    // InternalAutomatedRestTesting.g:2829:1: rule__Test__Group_8__2__Impl : ( ( rule__Test__MappingsAssignment_8_2 ) ) ;
    public final void rule__Test__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2833:1: ( ( ( rule__Test__MappingsAssignment_8_2 ) ) )
            // InternalAutomatedRestTesting.g:2834:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            {
            // InternalAutomatedRestTesting.g:2834:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            // InternalAutomatedRestTesting.g:2835:2: ( rule__Test__MappingsAssignment_8_2 )
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_2()); 
            // InternalAutomatedRestTesting.g:2836:2: ( rule__Test__MappingsAssignment_8_2 )
            // InternalAutomatedRestTesting.g:2836:3: rule__Test__MappingsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__MappingsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getMappingsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_8__2__Impl"


    // $ANTLR start "rule__Test__Group_8__3"
    // InternalAutomatedRestTesting.g:2844:1: rule__Test__Group_8__3 : rule__Test__Group_8__3__Impl rule__Test__Group_8__4 ;
    public final void rule__Test__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2848:1: ( rule__Test__Group_8__3__Impl rule__Test__Group_8__4 )
            // InternalAutomatedRestTesting.g:2849:2: rule__Test__Group_8__3__Impl rule__Test__Group_8__4
            {
            pushFollow(FOLLOW_29);
            rule__Test__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_8__4();

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
    // $ANTLR end "rule__Test__Group_8__3"


    // $ANTLR start "rule__Test__Group_8__3__Impl"
    // InternalAutomatedRestTesting.g:2856:1: rule__Test__Group_8__3__Impl : ( ( rule__Test__MappingsAssignment_8_3 )* ) ;
    public final void rule__Test__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2860:1: ( ( ( rule__Test__MappingsAssignment_8_3 )* ) )
            // InternalAutomatedRestTesting.g:2861:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            {
            // InternalAutomatedRestTesting.g:2861:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            // InternalAutomatedRestTesting.g:2862:2: ( rule__Test__MappingsAssignment_8_3 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_3()); 
            // InternalAutomatedRestTesting.g:2863:2: ( rule__Test__MappingsAssignment_8_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_LEFT_BRACKET) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2863:3: rule__Test__MappingsAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Test__MappingsAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getMappingsAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_8__3__Impl"


    // $ANTLR start "rule__Test__Group_8__4"
    // InternalAutomatedRestTesting.g:2871:1: rule__Test__Group_8__4 : rule__Test__Group_8__4__Impl ;
    public final void rule__Test__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2875:1: ( rule__Test__Group_8__4__Impl )
            // InternalAutomatedRestTesting.g:2876:2: rule__Test__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_8__4__Impl();

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
    // $ANTLR end "rule__Test__Group_8__4"


    // $ANTLR start "rule__Test__Group_8__4__Impl"
    // InternalAutomatedRestTesting.g:2882:1: rule__Test__Group_8__4__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2886:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2887:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2887:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2888:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getTestAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_8_4()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_8__4__Impl"


    // $ANTLR start "rule__Test__Group_11__0"
    // InternalAutomatedRestTesting.g:2898:1: rule__Test__Group_11__0 : rule__Test__Group_11__0__Impl rule__Test__Group_11__1 ;
    public final void rule__Test__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2902:1: ( rule__Test__Group_11__0__Impl rule__Test__Group_11__1 )
            // InternalAutomatedRestTesting.g:2903:2: rule__Test__Group_11__0__Impl rule__Test__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_11__1();

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
    // $ANTLR end "rule__Test__Group_11__0"


    // $ANTLR start "rule__Test__Group_11__0__Impl"
    // InternalAutomatedRestTesting.g:2910:1: rule__Test__Group_11__0__Impl : ( ( rule__Test__AssertionsAssignment_11_0 ) ) ;
    public final void rule__Test__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2914:1: ( ( ( rule__Test__AssertionsAssignment_11_0 ) ) )
            // InternalAutomatedRestTesting.g:2915:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            {
            // InternalAutomatedRestTesting.g:2915:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            // InternalAutomatedRestTesting.g:2916:2: ( rule__Test__AssertionsAssignment_11_0 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_11_0()); 
            // InternalAutomatedRestTesting.g:2917:2: ( rule__Test__AssertionsAssignment_11_0 )
            // InternalAutomatedRestTesting.g:2917:3: rule__Test__AssertionsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Test__AssertionsAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAssertionsAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_11__0__Impl"


    // $ANTLR start "rule__Test__Group_11__1"
    // InternalAutomatedRestTesting.g:2925:1: rule__Test__Group_11__1 : rule__Test__Group_11__1__Impl ;
    public final void rule__Test__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2929:1: ( rule__Test__Group_11__1__Impl )
            // InternalAutomatedRestTesting.g:2930:2: rule__Test__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_11__1__Impl();

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
    // $ANTLR end "rule__Test__Group_11__1"


    // $ANTLR start "rule__Test__Group_11__1__Impl"
    // InternalAutomatedRestTesting.g:2936:1: rule__Test__Group_11__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2940:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2941:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2941:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2942:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_11__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalAutomatedRestTesting.g:2952:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2956:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalAutomatedRestTesting.g:2957:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:2964:1: rule__Assertion__Group__0__Impl : ( 'response' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2968:1: ( ( 'response' ) )
            // InternalAutomatedRestTesting.g:2969:1: ( 'response' )
            {
            // InternalAutomatedRestTesting.g:2969:1: ( 'response' )
            // InternalAutomatedRestTesting.g:2970:2: 'response'
            {
             before(grammarAccess.getAssertionAccess().getResponseKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2979:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2983:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalAutomatedRestTesting.g:2984:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:2991:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__Group_1__0 )? ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2995:1: ( ( ( rule__Assertion__Group_1__0 )? ) )
            // InternalAutomatedRestTesting.g:2996:1: ( ( rule__Assertion__Group_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:2996:1: ( ( rule__Assertion__Group_1__0 )? )
            // InternalAutomatedRestTesting.g:2997:2: ( rule__Assertion__Group_1__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:2998:2: ( rule__Assertion__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_ARROW)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2998:3: rule__Assertion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:3006:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3010:1: ( rule__Assertion__Group__2__Impl )
            // InternalAutomatedRestTesting.g:3011:2: rule__Assertion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__2__Impl();

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
    // InternalAutomatedRestTesting.g:3017:1: rule__Assertion__Group__2__Impl : ( ( rule__Assertion__ConditionAssignment_2 ) ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3021:1: ( ( ( rule__Assertion__ConditionAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3022:1: ( ( rule__Assertion__ConditionAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3022:1: ( ( rule__Assertion__ConditionAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3023:2: ( rule__Assertion__ConditionAssignment_2 )
            {
             before(grammarAccess.getAssertionAccess().getConditionAssignment_2()); 
            // InternalAutomatedRestTesting.g:3024:2: ( rule__Assertion__ConditionAssignment_2 )
            // InternalAutomatedRestTesting.g:3024:3: rule__Assertion__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getConditionAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assertion__Group_1__0"
    // InternalAutomatedRestTesting.g:3033:1: rule__Assertion__Group_1__0 : rule__Assertion__Group_1__0__Impl rule__Assertion__Group_1__1 ;
    public final void rule__Assertion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3037:1: ( rule__Assertion__Group_1__0__Impl rule__Assertion__Group_1__1 )
            // InternalAutomatedRestTesting.g:3038:2: rule__Assertion__Group_1__0__Impl rule__Assertion__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Assertion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_1__1();

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
    // $ANTLR end "rule__Assertion__Group_1__0"


    // $ANTLR start "rule__Assertion__Group_1__0__Impl"
    // InternalAutomatedRestTesting.g:3045:1: rule__Assertion__Group_1__0__Impl : ( ( rule__Assertion__Alternatives_1_0 )? ) ;
    public final void rule__Assertion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3049:1: ( ( ( rule__Assertion__Alternatives_1_0 )? ) )
            // InternalAutomatedRestTesting.g:3050:1: ( ( rule__Assertion__Alternatives_1_0 )? )
            {
            // InternalAutomatedRestTesting.g:3050:1: ( ( rule__Assertion__Alternatives_1_0 )? )
            // InternalAutomatedRestTesting.g:3051:2: ( rule__Assertion__Alternatives_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_1_0()); 
            // InternalAutomatedRestTesting.g:3052:2: ( rule__Assertion__Alternatives_1_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_DOT && LA27_0<=RULE_ARROW)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3052:3: rule__Assertion__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Alternatives_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_1__0__Impl"


    // $ANTLR start "rule__Assertion__Group_1__1"
    // InternalAutomatedRestTesting.g:3060:1: rule__Assertion__Group_1__1 : rule__Assertion__Group_1__1__Impl ;
    public final void rule__Assertion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3064:1: ( rule__Assertion__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3065:2: rule__Assertion__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_1__1__Impl();

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
    // $ANTLR end "rule__Assertion__Group_1__1"


    // $ANTLR start "rule__Assertion__Group_1__1__Impl"
    // InternalAutomatedRestTesting.g:3071:1: rule__Assertion__Group_1__1__Impl : ( ( rule__Assertion__DataToTestAssignment_1_1 ) ) ;
    public final void rule__Assertion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3075:1: ( ( ( rule__Assertion__DataToTestAssignment_1_1 ) ) )
            // InternalAutomatedRestTesting.g:3076:1: ( ( rule__Assertion__DataToTestAssignment_1_1 ) )
            {
            // InternalAutomatedRestTesting.g:3076:1: ( ( rule__Assertion__DataToTestAssignment_1_1 ) )
            // InternalAutomatedRestTesting.g:3077:2: ( rule__Assertion__DataToTestAssignment_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestAssignment_1_1()); 
            // InternalAutomatedRestTesting.g:3078:2: ( rule__Assertion__DataToTestAssignment_1_1 )
            // InternalAutomatedRestTesting.g:3078:3: rule__Assertion__DataToTestAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__DataToTestAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getDataToTestAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAutomatedRestTesting.g:3087:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3091:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAutomatedRestTesting.g:3092:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3099:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3103:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3104:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3104:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3105:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalAutomatedRestTesting.g:3114:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3118:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3119:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3125:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3129:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAutomatedRestTesting.g:3130:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAutomatedRestTesting.g:3130:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAutomatedRestTesting.g:3131:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3132:2: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3132:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalAutomatedRestTesting.g:3141:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3145:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAutomatedRestTesting.g:3146:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAutomatedRestTesting.g:3153:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3157:1: ( ( RULE_DOT ) )
            // InternalAutomatedRestTesting.g:3158:1: ( RULE_DOT )
            {
            // InternalAutomatedRestTesting.g:3158:1: ( RULE_DOT )
            // InternalAutomatedRestTesting.g:3159:2: RULE_DOT
            {
             before(grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalAutomatedRestTesting.g:3168:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3172:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3173:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAutomatedRestTesting.g:3179:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3183:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3184:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3184:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3185:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAutomatedRestTesting.g:3195:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3199:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAutomatedRestTesting.g:3200:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3207:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3211:1: ( ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:3212:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:3212:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            // InternalAutomatedRestTesting.g:3213:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_0()); 
            // InternalAutomatedRestTesting.g:3214:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            // InternalAutomatedRestTesting.g:3214:3: rule__Expression__RelationalOperatorAssignment_0
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
    // InternalAutomatedRestTesting.g:3222:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3226:1: ( rule__Expression__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3227:2: rule__Expression__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3233:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3237:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalAutomatedRestTesting.g:3238:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:3238:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalAutomatedRestTesting.g:3239:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3240:2: ( rule__Expression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||LA29_0==RULE_INT||LA29_0==69) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3240:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalAutomatedRestTesting.g:3249:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3253:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAutomatedRestTesting.g:3254:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalAutomatedRestTesting.g:3261:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3265:1: ( ( ( rule__Expression__Group_1_0__0 )? ) )
            // InternalAutomatedRestTesting.g:3266:1: ( ( rule__Expression__Group_1_0__0 )? )
            {
            // InternalAutomatedRestTesting.g:3266:1: ( ( rule__Expression__Group_1_0__0 )? )
            // InternalAutomatedRestTesting.g:3267:2: ( rule__Expression__Group_1_0__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            // InternalAutomatedRestTesting.g:3268:2: ( rule__Expression__Group_1_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3268:3: rule__Expression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalAutomatedRestTesting.g:3276:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3280:1: ( rule__Expression__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3281:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalAutomatedRestTesting.g:3287:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3291:1: ( ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) )
            // InternalAutomatedRestTesting.g:3292:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            {
            // InternalAutomatedRestTesting.g:3292:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            // InternalAutomatedRestTesting.g:3293:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1_1()); 
            // InternalAutomatedRestTesting.g:3294:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            // InternalAutomatedRestTesting.g:3294:3: rule__Expression__ExpectedValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpectedValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // InternalAutomatedRestTesting.g:3303:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3307:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // InternalAutomatedRestTesting.g:3308:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__1();

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
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // InternalAutomatedRestTesting.g:3315:1: rule__Expression__Group_1_0__0__Impl : ( 'parameter' ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3319:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3320:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3320:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3321:2: 'parameter'
            {
             before(grammarAccess.getExpressionAccess().getParameterKeyword_1_0_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getParameterKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__1"
    // InternalAutomatedRestTesting.g:3330:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3334:1: ( rule__Expression__Group_1_0__1__Impl )
            // InternalAutomatedRestTesting.g:3335:2: rule__Expression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_0__1"


    // $ANTLR start "rule__Expression__Group_1_0__1__Impl"
    // InternalAutomatedRestTesting.g:3341:1: rule__Expression__Group_1_0__1__Impl : ( ( rule__Expression__Alternatives_1_0_1 ) ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3345:1: ( ( ( rule__Expression__Alternatives_1_0_1 ) ) )
            // InternalAutomatedRestTesting.g:3346:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            {
            // InternalAutomatedRestTesting.g:3346:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            // InternalAutomatedRestTesting.g:3347:2: ( rule__Expression__Alternatives_1_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0_1()); 
            // InternalAutomatedRestTesting.g:3348:2: ( rule__Expression__Alternatives_1_0_1 )
            // InternalAutomatedRestTesting.g:3348:3: rule__Expression__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__1__Impl"


    // $ANTLR start "rule__MappingElement__Group__0"
    // InternalAutomatedRestTesting.g:3357:1: rule__MappingElement__Group__0 : rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 ;
    public final void rule__MappingElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3361:1: ( rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 )
            // InternalAutomatedRestTesting.g:3362:2: rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__MappingElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__1();

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
    // $ANTLR end "rule__MappingElement__Group__0"


    // $ANTLR start "rule__MappingElement__Group__0__Impl"
    // InternalAutomatedRestTesting.g:3369:1: rule__MappingElement__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__MappingElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3373:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3374:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3374:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3375:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getMappingElementAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getLEFT_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__0__Impl"


    // $ANTLR start "rule__MappingElement__Group__1"
    // InternalAutomatedRestTesting.g:3384:1: rule__MappingElement__Group__1 : rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 ;
    public final void rule__MappingElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3388:1: ( rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 )
            // InternalAutomatedRestTesting.g:3389:2: rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MappingElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__2();

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
    // $ANTLR end "rule__MappingElement__Group__1"


    // $ANTLR start "rule__MappingElement__Group__1__Impl"
    // InternalAutomatedRestTesting.g:3396:1: rule__MappingElement__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__MappingElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3400:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3401:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3401:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3402:2: 'parameter'
            {
             before(grammarAccess.getMappingElementAccess().getParameterKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__1__Impl"


    // $ANTLR start "rule__MappingElement__Group__2"
    // InternalAutomatedRestTesting.g:3411:1: rule__MappingElement__Group__2 : rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 ;
    public final void rule__MappingElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3415:1: ( rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 )
            // InternalAutomatedRestTesting.g:3416:2: rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__MappingElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__3();

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
    // $ANTLR end "rule__MappingElement__Group__2"


    // $ANTLR start "rule__MappingElement__Group__2__Impl"
    // InternalAutomatedRestTesting.g:3423:1: rule__MappingElement__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3427:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3428:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3428:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3429:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__2__Impl"


    // $ANTLR start "rule__MappingElement__Group__3"
    // InternalAutomatedRestTesting.g:3438:1: rule__MappingElement__Group__3 : rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 ;
    public final void rule__MappingElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3442:1: ( rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 )
            // InternalAutomatedRestTesting.g:3443:2: rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__MappingElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__4();

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
    // $ANTLR end "rule__MappingElement__Group__3"


    // $ANTLR start "rule__MappingElement__Group__3__Impl"
    // InternalAutomatedRestTesting.g:3450:1: rule__MappingElement__Group__3__Impl : ( ( rule__MappingElement__ParameterAssignment_3 ) ) ;
    public final void rule__MappingElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3454:1: ( ( ( rule__MappingElement__ParameterAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3455:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3455:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3456:2: ( rule__MappingElement__ParameterAssignment_3 )
            {
             before(grammarAccess.getMappingElementAccess().getParameterAssignment_3()); 
            // InternalAutomatedRestTesting.g:3457:2: ( rule__MappingElement__ParameterAssignment_3 )
            // InternalAutomatedRestTesting.g:3457:3: rule__MappingElement__ParameterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MappingElement__ParameterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingElementAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__3__Impl"


    // $ANTLR start "rule__MappingElement__Group__4"
    // InternalAutomatedRestTesting.g:3465:1: rule__MappingElement__Group__4 : rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 ;
    public final void rule__MappingElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3469:1: ( rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 )
            // InternalAutomatedRestTesting.g:3470:2: rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__MappingElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__5();

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
    // $ANTLR end "rule__MappingElement__Group__4"


    // $ANTLR start "rule__MappingElement__Group__4__Impl"
    // InternalAutomatedRestTesting.g:3477:1: rule__MappingElement__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__MappingElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3481:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:3482:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:3482:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:3483:2: RULE_COMMA
            {
             before(grammarAccess.getMappingElementAccess().getCOMMATerminalRuleCall_4()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getCOMMATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__4__Impl"


    // $ANTLR start "rule__MappingElement__Group__5"
    // InternalAutomatedRestTesting.g:3492:1: rule__MappingElement__Group__5 : rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 ;
    public final void rule__MappingElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3496:1: ( rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 )
            // InternalAutomatedRestTesting.g:3497:2: rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__MappingElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__6();

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
    // $ANTLR end "rule__MappingElement__Group__5"


    // $ANTLR start "rule__MappingElement__Group__5__Impl"
    // InternalAutomatedRestTesting.g:3504:1: rule__MappingElement__Group__5__Impl : ( 'value' ) ;
    public final void rule__MappingElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3508:1: ( ( 'value' ) )
            // InternalAutomatedRestTesting.g:3509:1: ( 'value' )
            {
            // InternalAutomatedRestTesting.g:3509:1: ( 'value' )
            // InternalAutomatedRestTesting.g:3510:2: 'value'
            {
             before(grammarAccess.getMappingElementAccess().getValueKeyword_5()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getValueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__5__Impl"


    // $ANTLR start "rule__MappingElement__Group__6"
    // InternalAutomatedRestTesting.g:3519:1: rule__MappingElement__Group__6 : rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 ;
    public final void rule__MappingElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3523:1: ( rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 )
            // InternalAutomatedRestTesting.g:3524:2: rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__MappingElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__7();

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
    // $ANTLR end "rule__MappingElement__Group__6"


    // $ANTLR start "rule__MappingElement__Group__6__Impl"
    // InternalAutomatedRestTesting.g:3531:1: rule__MappingElement__Group__6__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3535:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3536:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3536:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3537:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_6()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__6__Impl"


    // $ANTLR start "rule__MappingElement__Group__7"
    // InternalAutomatedRestTesting.g:3546:1: rule__MappingElement__Group__7 : rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 ;
    public final void rule__MappingElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3550:1: ( rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 )
            // InternalAutomatedRestTesting.g:3551:2: rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__MappingElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__8();

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
    // $ANTLR end "rule__MappingElement__Group__7"


    // $ANTLR start "rule__MappingElement__Group__7__Impl"
    // InternalAutomatedRestTesting.g:3558:1: rule__MappingElement__Group__7__Impl : ( ( rule__MappingElement__Group_7__0 )? ) ;
    public final void rule__MappingElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3562:1: ( ( ( rule__MappingElement__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:3563:1: ( ( rule__MappingElement__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:3563:1: ( ( rule__MappingElement__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:3564:2: ( rule__MappingElement__Group_7__0 )?
            {
             before(grammarAccess.getMappingElementAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:3565:2: ( rule__MappingElement__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3565:3: rule__MappingElement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingElement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingElementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__7__Impl"


    // $ANTLR start "rule__MappingElement__Group__8"
    // InternalAutomatedRestTesting.g:3573:1: rule__MappingElement__Group__8 : rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 ;
    public final void rule__MappingElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3577:1: ( rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 )
            // InternalAutomatedRestTesting.g:3578:2: rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__MappingElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__9();

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
    // $ANTLR end "rule__MappingElement__Group__8"


    // $ANTLR start "rule__MappingElement__Group__8__Impl"
    // InternalAutomatedRestTesting.g:3585:1: rule__MappingElement__Group__8__Impl : ( ( rule__MappingElement__ValueAssignment_8 ) ) ;
    public final void rule__MappingElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3589:1: ( ( ( rule__MappingElement__ValueAssignment_8 ) ) )
            // InternalAutomatedRestTesting.g:3590:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            {
            // InternalAutomatedRestTesting.g:3590:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            // InternalAutomatedRestTesting.g:3591:2: ( rule__MappingElement__ValueAssignment_8 )
            {
             before(grammarAccess.getMappingElementAccess().getValueAssignment_8()); 
            // InternalAutomatedRestTesting.g:3592:2: ( rule__MappingElement__ValueAssignment_8 )
            // InternalAutomatedRestTesting.g:3592:3: rule__MappingElement__ValueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MappingElement__ValueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMappingElementAccess().getValueAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__8__Impl"


    // $ANTLR start "rule__MappingElement__Group__9"
    // InternalAutomatedRestTesting.g:3600:1: rule__MappingElement__Group__9 : rule__MappingElement__Group__9__Impl ;
    public final void rule__MappingElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3604:1: ( rule__MappingElement__Group__9__Impl )
            // InternalAutomatedRestTesting.g:3605:2: rule__MappingElement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingElement__Group__9__Impl();

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
    // $ANTLR end "rule__MappingElement__Group__9"


    // $ANTLR start "rule__MappingElement__Group__9__Impl"
    // InternalAutomatedRestTesting.g:3611:1: rule__MappingElement__Group__9__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__MappingElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3615:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3616:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3616:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3617:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getMappingElementAccess().getRIGHT_BRACKETTerminalRuleCall_9()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getRIGHT_BRACKETTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group__9__Impl"


    // $ANTLR start "rule__MappingElement__Group_7__0"
    // InternalAutomatedRestTesting.g:3627:1: rule__MappingElement__Group_7__0 : rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 ;
    public final void rule__MappingElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3631:1: ( rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 )
            // InternalAutomatedRestTesting.g:3632:2: rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1
            {
            pushFollow(FOLLOW_42);
            rule__MappingElement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingElement__Group_7__1();

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
    // $ANTLR end "rule__MappingElement__Group_7__0"


    // $ANTLR start "rule__MappingElement__Group_7__0__Impl"
    // InternalAutomatedRestTesting.g:3639:1: rule__MappingElement__Group_7__0__Impl : ( 'request' ) ;
    public final void rule__MappingElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3643:1: ( ( 'request' ) )
            // InternalAutomatedRestTesting.g:3644:1: ( 'request' )
            {
            // InternalAutomatedRestTesting.g:3644:1: ( 'request' )
            // InternalAutomatedRestTesting.g:3645:2: 'request'
            {
             before(grammarAccess.getMappingElementAccess().getRequestKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getRequestKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group_7__0__Impl"


    // $ANTLR start "rule__MappingElement__Group_7__1"
    // InternalAutomatedRestTesting.g:3654:1: rule__MappingElement__Group_7__1 : rule__MappingElement__Group_7__1__Impl ;
    public final void rule__MappingElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3658:1: ( rule__MappingElement__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:3659:2: rule__MappingElement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingElement__Group_7__1__Impl();

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
    // $ANTLR end "rule__MappingElement__Group_7__1"


    // $ANTLR start "rule__MappingElement__Group_7__1__Impl"
    // InternalAutomatedRestTesting.g:3665:1: rule__MappingElement__Group_7__1__Impl : ( RULE_ARROW ) ;
    public final void rule__MappingElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3669:1: ( ( RULE_ARROW ) )
            // InternalAutomatedRestTesting.g:3670:1: ( RULE_ARROW )
            {
            // InternalAutomatedRestTesting.g:3670:1: ( RULE_ARROW )
            // InternalAutomatedRestTesting.g:3671:2: RULE_ARROW
            {
             before(grammarAccess.getMappingElementAccess().getARROWTerminalRuleCall_7_1()); 
            match(input,RULE_ARROW,FOLLOW_2); 
             after(grammarAccess.getMappingElementAccess().getARROWTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__Group_7__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalAutomatedRestTesting.g:3681:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3685:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAutomatedRestTesting.g:3686:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAutomatedRestTesting.g:3693:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3697:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3698:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3698:1: ( () )
            // InternalAutomatedRestTesting.g:3699:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalAutomatedRestTesting.g:3700:2: ()
            // InternalAutomatedRestTesting.g:3700:3: 
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
    // InternalAutomatedRestTesting.g:3708:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3712:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAutomatedRestTesting.g:3713:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalAutomatedRestTesting.g:3720:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParamTypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3724:1: ( ( ( rule__Parameter__ParamTypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3725:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3725:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3726:2: ( rule__Parameter__ParamTypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParamTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3727:2: ( rule__Parameter__ParamTypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3727:3: rule__Parameter__ParamTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParamTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParamTypeAssignment_1()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:3735:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3739:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAutomatedRestTesting.g:3740:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAutomatedRestTesting.g:3747:1: rule__Parameter__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3751:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3752:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3752:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3753:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3762:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3766:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAutomatedRestTesting.g:3767:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalAutomatedRestTesting.g:3774:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3778:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3779:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3779:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3780:2: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:3781:2: ( rule__Parameter__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:3781:3: rule__Parameter__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:3789:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3793:1: ( rule__Parameter__Group__4__Impl )
            // InternalAutomatedRestTesting.g:3794:2: rule__Parameter__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:3800:1: rule__Parameter__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3804:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3805:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3805:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3806:2: RULE_RIGHT_BRACKET
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


    // $ANTLR start "rule__Restriction__Group__0"
    // InternalAutomatedRestTesting.g:3816:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3820:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAutomatedRestTesting.g:3821:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAutomatedRestTesting.g:3828:1: rule__Restriction__Group__0__Impl : ( () ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3832:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3833:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3833:1: ( () )
            // InternalAutomatedRestTesting.g:3834:2: ()
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 
            // InternalAutomatedRestTesting.g:3835:2: ()
            // InternalAutomatedRestTesting.g:3835:3: 
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
    // InternalAutomatedRestTesting.g:3843:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3847:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // InternalAutomatedRestTesting.g:3848:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
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
    // InternalAutomatedRestTesting.g:3855:1: rule__Restriction__Group__1__Impl : ( 'mockType' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3859:1: ( ( 'mockType' ) )
            // InternalAutomatedRestTesting.g:3860:1: ( 'mockType' )
            {
            // InternalAutomatedRestTesting.g:3860:1: ( 'mockType' )
            // InternalAutomatedRestTesting.g:3861:2: 'mockType'
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3870:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3874:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // InternalAutomatedRestTesting.g:3875:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalAutomatedRestTesting.g:3882:1: rule__Restriction__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3886:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3887:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3887:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3888:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3897:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3901:1: ( rule__Restriction__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3902:2: rule__Restriction__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:3908:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__MockTypeAssignment_3 ) ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3912:1: ( ( ( rule__Restriction__MockTypeAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3913:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3913:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3914:2: ( rule__Restriction__MockTypeAssignment_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 
            // InternalAutomatedRestTesting.g:3915:2: ( rule__Restriction__MockTypeAssignment_3 )
            // InternalAutomatedRestTesting.g:3915:3: rule__Restriction__MockTypeAssignment_3
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
    // InternalAutomatedRestTesting.g:3924:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3928:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAutomatedRestTesting.g:3929:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalAutomatedRestTesting.g:3936:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3940:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3941:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3941:1: ( () )
            // InternalAutomatedRestTesting.g:3942:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3943:2: ()
            // InternalAutomatedRestTesting.g:3943:3: 
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
    // InternalAutomatedRestTesting.g:3951:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3955:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAutomatedRestTesting.g:3956:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalAutomatedRestTesting.g:3963:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3967:1: ( ( 'Entity' ) )
            // InternalAutomatedRestTesting.g:3968:1: ( 'Entity' )
            {
            // InternalAutomatedRestTesting.g:3968:1: ( 'Entity' )
            // InternalAutomatedRestTesting.g:3969:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3978:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3982:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAutomatedRestTesting.g:3983:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalAutomatedRestTesting.g:3990:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3994:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3995:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3995:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3996:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3997:2: ( rule__Entity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3997:3: rule__Entity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:4005:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4009:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAutomatedRestTesting.g:4010:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:4017:1: rule__Entity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4021:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4022:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4022:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4023:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4032:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4036:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAutomatedRestTesting.g:4037:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalAutomatedRestTesting.g:4044:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4048:1: ( ( ( rule__Entity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4049:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4049:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4050:2: ( rule__Entity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4051:2: ( rule__Entity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4051:3: rule__Entity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4059:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4063:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAutomatedRestTesting.g:4064:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4071:1: rule__Entity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4075:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4076:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4076:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4077:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4086:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4090:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAutomatedRestTesting.g:4091:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4098:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4102:1: ( ( ( rule__Entity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4103:1: ( ( rule__Entity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4103:1: ( ( rule__Entity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4104:2: ( rule__Entity__Group_6__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4105:2: ( rule__Entity__Group_6__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=26 && LA32_0<=30)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4105:3: rule__Entity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Entity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalAutomatedRestTesting.g:4113:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4117:1: ( rule__Entity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4118:2: rule__Entity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4124:1: rule__Entity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4128:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4129:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4129:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4130:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4140:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4144:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4145:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4152:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4156:1: ( ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4157:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4157:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4158:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4159:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4159:3: rule__Entity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4167:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4171:1: ( rule__Entity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4172:2: rule__Entity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4178:1: rule__Entity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4182:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4183:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4183:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4184:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4194:1: rule__Attribute_Impl__Group__0 : rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 ;
    public final void rule__Attribute_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4198:1: ( rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 )
            // InternalAutomatedRestTesting.g:4199:2: rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:4206:1: rule__Attribute_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Attribute_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4210:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4211:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4211:1: ( () )
            // InternalAutomatedRestTesting.g:4212:2: ()
            {
             before(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4213:2: ()
            // InternalAutomatedRestTesting.g:4213:3: 
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
    // InternalAutomatedRestTesting.g:4221:1: rule__Attribute_Impl__Group__1 : rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 ;
    public final void rule__Attribute_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4225:1: ( rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 )
            // InternalAutomatedRestTesting.g:4226:2: rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4233:1: rule__Attribute_Impl__Group__1__Impl : ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) ;
    public final void rule__Attribute_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4237:1: ( ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4238:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4238:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4239:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4240:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4240:3: rule__Attribute_Impl__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4248:1: rule__Attribute_Impl__Group__2 : rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 ;
    public final void rule__Attribute_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4252:1: ( rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 )
            // InternalAutomatedRestTesting.g:4253:2: rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4260:1: rule__Attribute_Impl__Group__2__Impl : ( ( rule__Attribute_Impl__Group_2__0 )? ) ;
    public final void rule__Attribute_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4264:1: ( ( ( rule__Attribute_Impl__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4265:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4265:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4266:2: ( rule__Attribute_Impl__Group_2__0 )?
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4267:2: ( rule__Attribute_Impl__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4267:3: rule__Attribute_Impl__Group_2__0
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
    // InternalAutomatedRestTesting.g:4275:1: rule__Attribute_Impl__Group__3 : rule__Attribute_Impl__Group__3__Impl ;
    public final void rule__Attribute_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4279:1: ( rule__Attribute_Impl__Group__3__Impl )
            // InternalAutomatedRestTesting.g:4280:2: rule__Attribute_Impl__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:4286:1: rule__Attribute_Impl__Group__3__Impl : ( ( rule__Attribute_Impl__NameAssignment_3 ) ) ;
    public final void rule__Attribute_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4290:1: ( ( ( rule__Attribute_Impl__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4291:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4291:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4292:2: ( rule__Attribute_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4293:2: ( rule__Attribute_Impl__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4293:3: rule__Attribute_Impl__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4302:1: rule__Attribute_Impl__Group_2__0 : rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 ;
    public final void rule__Attribute_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4306:1: ( rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 )
            // InternalAutomatedRestTesting.g:4307:2: rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAutomatedRestTesting.g:4314:1: rule__Attribute_Impl__Group_2__0__Impl : ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) ;
    public final void rule__Attribute_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4318:1: ( ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4319:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4319:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4320:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4321:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4321:3: rule__Attribute_Impl__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4329:1: rule__Attribute_Impl__Group_2__1 : rule__Attribute_Impl__Group_2__1__Impl ;
    public final void rule__Attribute_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4333:1: ( rule__Attribute_Impl__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4334:2: rule__Attribute_Impl__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4340:1: rule__Attribute_Impl__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Attribute_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4344:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4345:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4345:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4346:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getAttribute_ImplAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAttribute_ImplAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:4356:1: rule__DomainAttribute__Group__0 : rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 ;
    public final void rule__DomainAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4360:1: ( rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 )
            // InternalAutomatedRestTesting.g:4361:2: rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:4368:1: rule__DomainAttribute__Group__0__Impl : ( () ) ;
    public final void rule__DomainAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4372:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4373:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4373:1: ( () )
            // InternalAutomatedRestTesting.g:4374:2: ()
            {
             before(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4375:2: ()
            // InternalAutomatedRestTesting.g:4375:3: 
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
    // InternalAutomatedRestTesting.g:4383:1: rule__DomainAttribute__Group__1 : rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 ;
    public final void rule__DomainAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4387:1: ( rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 )
            // InternalAutomatedRestTesting.g:4388:2: rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4395:1: rule__DomainAttribute__Group__1__Impl : ( ( rule__DomainAttribute__TypeAssignment_1 ) ) ;
    public final void rule__DomainAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4399:1: ( ( ( rule__DomainAttribute__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4400:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4400:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4401:2: ( rule__DomainAttribute__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4402:2: ( rule__DomainAttribute__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4402:3: rule__DomainAttribute__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4410:1: rule__DomainAttribute__Group__2 : rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 ;
    public final void rule__DomainAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4414:1: ( rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 )
            // InternalAutomatedRestTesting.g:4415:2: rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4422:1: rule__DomainAttribute__Group__2__Impl : ( ( rule__DomainAttribute__Group_2__0 )? ) ;
    public final void rule__DomainAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4426:1: ( ( ( rule__DomainAttribute__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4427:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4427:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4428:2: ( rule__DomainAttribute__Group_2__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4429:2: ( rule__DomainAttribute__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4429:3: rule__DomainAttribute__Group_2__0
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
    // InternalAutomatedRestTesting.g:4437:1: rule__DomainAttribute__Group__3 : rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 ;
    public final void rule__DomainAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4441:1: ( rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 )
            // InternalAutomatedRestTesting.g:4442:2: rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalAutomatedRestTesting.g:4449:1: rule__DomainAttribute__Group__3__Impl : ( ( rule__DomainAttribute__NameAssignment_3 ) ) ;
    public final void rule__DomainAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4453:1: ( ( ( rule__DomainAttribute__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4454:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4454:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4455:2: ( rule__DomainAttribute__NameAssignment_3 )
            {
             before(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4456:2: ( rule__DomainAttribute__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4456:3: rule__DomainAttribute__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4464:1: rule__DomainAttribute__Group__4 : rule__DomainAttribute__Group__4__Impl ;
    public final void rule__DomainAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4468:1: ( rule__DomainAttribute__Group__4__Impl )
            // InternalAutomatedRestTesting.g:4469:2: rule__DomainAttribute__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:4475:1: rule__DomainAttribute__Group__4__Impl : ( ( rule__DomainAttribute__Group_4__0 )? ) ;
    public final void rule__DomainAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4479:1: ( ( ( rule__DomainAttribute__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:4480:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:4480:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:4481:2: ( rule__DomainAttribute__Group_4__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:4482:2: ( rule__DomainAttribute__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LEFT_PARENTHESIS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4482:3: rule__DomainAttribute__Group_4__0
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
    // InternalAutomatedRestTesting.g:4491:1: rule__DomainAttribute__Group_2__0 : rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 ;
    public final void rule__DomainAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4495:1: ( rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 )
            // InternalAutomatedRestTesting.g:4496:2: rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAutomatedRestTesting.g:4503:1: rule__DomainAttribute__Group_2__0__Impl : ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) ;
    public final void rule__DomainAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4507:1: ( ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4508:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4508:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4509:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4510:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4510:3: rule__DomainAttribute__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4518:1: rule__DomainAttribute__Group_2__1 : rule__DomainAttribute__Group_2__1__Impl ;
    public final void rule__DomainAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4522:1: ( rule__DomainAttribute__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4523:2: rule__DomainAttribute__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4529:1: rule__DomainAttribute__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__DomainAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4533:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4534:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4534:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4535:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getDomainAttributeAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:4545:1: rule__DomainAttribute__Group_4__0 : rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 ;
    public final void rule__DomainAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4549:1: ( rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 )
            // InternalAutomatedRestTesting.g:4550:2: rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalAutomatedRestTesting.g:4557:1: rule__DomainAttribute__Group_4__0__Impl : ( RULE_LEFT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4561:1: ( ( RULE_LEFT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4562:1: ( RULE_LEFT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4562:1: ( RULE_LEFT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4563:2: RULE_LEFT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4572:1: rule__DomainAttribute__Group_4__1 : rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 ;
    public final void rule__DomainAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4576:1: ( rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 )
            // InternalAutomatedRestTesting.g:4577:2: rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalAutomatedRestTesting.g:4584:1: rule__DomainAttribute__Group_4__1__Impl : ( ( rule__DomainAttribute__Group_4_1__0 )? ) ;
    public final void rule__DomainAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4588:1: ( ( ( rule__DomainAttribute__Group_4_1__0 )? ) )
            // InternalAutomatedRestTesting.g:4589:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:4589:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            // InternalAutomatedRestTesting.g:4590:2: ( rule__DomainAttribute__Group_4_1__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 
            // InternalAutomatedRestTesting.g:4591:2: ( rule__DomainAttribute__Group_4_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4591:3: rule__DomainAttribute__Group_4_1__0
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
    // InternalAutomatedRestTesting.g:4599:1: rule__DomainAttribute__Group_4__2 : rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 ;
    public final void rule__DomainAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4603:1: ( rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 )
            // InternalAutomatedRestTesting.g:4604:2: rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalAutomatedRestTesting.g:4611:1: rule__DomainAttribute__Group_4__2__Impl : ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) ;
    public final void rule__DomainAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4615:1: ( ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) )
            // InternalAutomatedRestTesting.g:4616:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            {
            // InternalAutomatedRestTesting.g:4616:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            // InternalAutomatedRestTesting.g:4617:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 
            // InternalAutomatedRestTesting.g:4618:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            // InternalAutomatedRestTesting.g:4618:3: rule__DomainAttribute__RestrictionsAssignment_4_2
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
    // InternalAutomatedRestTesting.g:4626:1: rule__DomainAttribute__Group_4__3 : rule__DomainAttribute__Group_4__3__Impl ;
    public final void rule__DomainAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4630:1: ( rule__DomainAttribute__Group_4__3__Impl )
            // InternalAutomatedRestTesting.g:4631:2: rule__DomainAttribute__Group_4__3__Impl
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
    // InternalAutomatedRestTesting.g:4637:1: rule__DomainAttribute__Group_4__3__Impl : ( RULE_RIGHT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4641:1: ( ( RULE_RIGHT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4642:1: ( RULE_RIGHT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4642:1: ( RULE_RIGHT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4643:2: RULE_RIGHT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4653:1: rule__DomainAttribute__Group_4_1__0 : rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 ;
    public final void rule__DomainAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4657:1: ( rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 )
            // InternalAutomatedRestTesting.g:4658:2: rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:4665:1: rule__DomainAttribute__Group_4_1__0__Impl : ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) ;
    public final void rule__DomainAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4669:1: ( ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) )
            // InternalAutomatedRestTesting.g:4670:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            {
            // InternalAutomatedRestTesting.g:4670:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            // InternalAutomatedRestTesting.g:4671:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 
            // InternalAutomatedRestTesting.g:4672:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            // InternalAutomatedRestTesting.g:4672:3: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0
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
    // InternalAutomatedRestTesting.g:4680:1: rule__DomainAttribute__Group_4_1__1 : rule__DomainAttribute__Group_4_1__1__Impl ;
    public final void rule__DomainAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4684:1: ( rule__DomainAttribute__Group_4_1__1__Impl )
            // InternalAutomatedRestTesting.g:4685:2: rule__DomainAttribute__Group_4_1__1__Impl
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
    // InternalAutomatedRestTesting.g:4691:1: rule__DomainAttribute__Group_4_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__DomainAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4695:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:4696:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:4696:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:4697:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:4707:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4711:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalAutomatedRestTesting.g:4712:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalAutomatedRestTesting.g:4719:1: rule__SimpleEntity__Group__0__Impl : ( () ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4723:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4724:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4724:1: ( () )
            // InternalAutomatedRestTesting.g:4725:2: ()
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 
            // InternalAutomatedRestTesting.g:4726:2: ()
            // InternalAutomatedRestTesting.g:4726:3: 
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
    // InternalAutomatedRestTesting.g:4734:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4738:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalAutomatedRestTesting.g:4739:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalAutomatedRestTesting.g:4746:1: rule__SimpleEntity__Group__1__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4750:1: ( ( 'SimpleEntity' ) )
            // InternalAutomatedRestTesting.g:4751:1: ( 'SimpleEntity' )
            {
            // InternalAutomatedRestTesting.g:4751:1: ( 'SimpleEntity' )
            // InternalAutomatedRestTesting.g:4752:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:4761:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4765:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalAutomatedRestTesting.g:4766:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalAutomatedRestTesting.g:4773:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4777:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:4778:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:4778:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:4779:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:4780:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:4780:3: rule__SimpleEntity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:4788:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4792:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalAutomatedRestTesting.g:4793:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:4800:1: rule__SimpleEntity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4804:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4805:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4805:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4806:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4815:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4819:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalAutomatedRestTesting.g:4820:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
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
    // InternalAutomatedRestTesting.g:4827:1: rule__SimpleEntity__Group__4__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4831:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4832:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4832:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4833:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4834:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4834:3: rule__SimpleEntity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4842:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4846:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalAutomatedRestTesting.g:4847:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4854:1: rule__SimpleEntity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4858:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4859:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4859:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4860:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4869:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4873:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalAutomatedRestTesting.g:4874:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4881:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__Group_6__0 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4885:1: ( ( ( rule__SimpleEntity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4886:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4886:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4887:2: ( rule__SimpleEntity__Group_6__0 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4888:2: ( rule__SimpleEntity__Group_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=26 && LA37_0<=30)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4888:3: rule__SimpleEntity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__SimpleEntity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAutomatedRestTesting.g:4896:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4900:1: ( rule__SimpleEntity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4901:2: rule__SimpleEntity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4907:1: rule__SimpleEntity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4911:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4912:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4912:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4913:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4923:1: rule__SimpleEntity__Group_6__0 : rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 ;
    public final void rule__SimpleEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4927:1: ( rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4928:2: rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4935:1: rule__SimpleEntity__Group_6__0__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__SimpleEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4939:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4940:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4940:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4941:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4942:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4942:3: rule__SimpleEntity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4950:1: rule__SimpleEntity__Group_6__1 : rule__SimpleEntity__Group_6__1__Impl ;
    public final void rule__SimpleEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4954:1: ( rule__SimpleEntity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4955:2: rule__SimpleEntity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4961:1: rule__SimpleEntity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4965:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4966:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4966:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4967:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4977:1: rule__AutomatedRestTesting__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AutomatedRestTesting__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4981:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4982:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4982:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4983:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4992:1: rule__AutomatedRestTesting__DataElementsAssignment_5_0 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4996:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4997:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4997:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4998:3: ruleElement
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
    // InternalAutomatedRestTesting.g:5007:1: rule__AutomatedRestTesting__DataElementsAssignment_5_1 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5011:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:5012:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:5012:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:5013:3: ruleElement
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
    // InternalAutomatedRestTesting.g:5022:1: rule__AutomatedRestTesting__ServicesAssignment_6_0 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5026:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5027:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5027:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5028:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5037:1: rule__AutomatedRestTesting__ServicesAssignment_6_1 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5041:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5042:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5042:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5043:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5052:1: rule__AutomatedRestTesting__TestsAssignment_7_0 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5056:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5057:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5057:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5058:3: ruleTest
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
    // InternalAutomatedRestTesting.g:5067:1: rule__AutomatedRestTesting__TestsAssignment_7_1 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5071:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5072:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5072:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5073:3: ruleTest
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


    // $ANTLR start "rule__RestService__MethodAssignment_0"
    // InternalAutomatedRestTesting.g:5082:1: rule__RestService__MethodAssignment_0 : ( ruleMethodType ) ;
    public final void rule__RestService__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5086:1: ( ( ruleMethodType ) )
            // InternalAutomatedRestTesting.g:5087:2: ( ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:5087:2: ( ruleMethodType )
            // InternalAutomatedRestTesting.g:5088:3: ruleMethodType
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
    // InternalAutomatedRestTesting.g:5097:1: rule__RestService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RestService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5101:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5102:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5102:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5103:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5112:1: rule__RestService__UriAssignment_5 : ( RULE_SLASH ) ;
    public final void rule__RestService__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5116:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:5117:2: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:5117:2: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:5118:3: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:5127:1: rule__RestService__ParametersAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__RestService__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5131:1: ( ( ruleParameter ) )
            // InternalAutomatedRestTesting.g:5132:2: ( ruleParameter )
            {
            // InternalAutomatedRestTesting.g:5132:2: ( ruleParameter )
            // InternalAutomatedRestTesting.g:5133:3: ruleParameter
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
    // InternalAutomatedRestTesting.g:5142:1: rule__RestService__RequestAssignment_9_4 : ( ( ruleEString ) ) ;
    public final void rule__RestService__RequestAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5146:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5147:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5147:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5148:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0()); 
            // InternalAutomatedRestTesting.g:5149:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5150:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5161:1: rule__RestService__ResponseAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__RestService__ResponseAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5165:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5166:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5166:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5167:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0()); 
            // InternalAutomatedRestTesting.g:5168:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5169:4: ruleEString
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


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalAutomatedRestTesting.g:5180:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5184:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5185:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5185:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5186:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5195:1: rule__Test__ServiceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Test__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5199:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5200:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5200:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5201:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0()); 
            // InternalAutomatedRestTesting.g:5202:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5203:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5214:1: rule__Test__DescriptionAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Test__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5218:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5219:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5219:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5220:3: ruleEString
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


    // $ANTLR start "rule__Test__MappingsAssignment_8_2"
    // InternalAutomatedRestTesting.g:5229:1: rule__Test__MappingsAssignment_8_2 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5233:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5234:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5234:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5235:3: ruleMappingElement
            {
             before(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingElement();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__MappingsAssignment_8_2"


    // $ANTLR start "rule__Test__MappingsAssignment_8_3"
    // InternalAutomatedRestTesting.g:5244:1: rule__Test__MappingsAssignment_8_3 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5248:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5249:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5249:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5250:3: ruleMappingElement
            {
             before(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingElement();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__MappingsAssignment_8_3"


    // $ANTLR start "rule__Test__AssertionsAssignment_11_0"
    // InternalAutomatedRestTesting.g:5259:1: rule__Test__AssertionsAssignment_11_0 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5263:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:5264:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:5264:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:5265:3: ruleAssertion
            {
             before(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AssertionsAssignment_11_0"


    // $ANTLR start "rule__Assertion__DataToTestAssignment_1_1"
    // InternalAutomatedRestTesting.g:5274:1: rule__Assertion__DataToTestAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__DataToTestAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5278:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5279:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5279:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5280:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_1_1_0()); 
            // InternalAutomatedRestTesting.g:5281:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5282:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getDataToTestElementQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__DataToTestAssignment_1_1"


    // $ANTLR start "rule__Assertion__ConditionAssignment_2"
    // InternalAutomatedRestTesting.g:5293:1: rule__Assertion__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assertion__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5297:1: ( ( ruleExpression ) )
            // InternalAutomatedRestTesting.g:5298:2: ( ruleExpression )
            {
            // InternalAutomatedRestTesting.g:5298:2: ( ruleExpression )
            // InternalAutomatedRestTesting.g:5299:3: ruleExpression
            {
             before(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ConditionAssignment_2"


    // $ANTLR start "rule__Expression__RelationalOperatorAssignment_0"
    // InternalAutomatedRestTesting.g:5308:1: rule__Expression__RelationalOperatorAssignment_0 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5312:1: ( ( ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:5313:2: ( ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:5313:2: ( ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:5314:3: ruleRelationalOperator
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


    // $ANTLR start "rule__Expression__ExpectedValueAssignment_1_1"
    // InternalAutomatedRestTesting.g:5323:1: rule__Expression__ExpectedValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Expression__ExpectedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5327:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5328:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5328:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5329:3: ruleLiteral
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpectedValueLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpectedValueAssignment_1_1"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalAutomatedRestTesting.g:5338:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5342:1: ( ( RULE_INT ) )
            // InternalAutomatedRestTesting.g:5343:2: ( RULE_INT )
            {
            // InternalAutomatedRestTesting.g:5343:2: ( RULE_INT )
            // InternalAutomatedRestTesting.g:5344:3: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalAutomatedRestTesting.g:5353:1: rule__StringLiteral__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5357:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5358:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5358:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5359:3: ruleEString
            {
             before(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__ElementLiteral__ValueAssignment"
    // InternalAutomatedRestTesting.g:5368:1: rule__ElementLiteral__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5372:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5373:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5373:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5374:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementLiteralAccess().getValueElementCrossReference_0()); 
            // InternalAutomatedRestTesting.g:5375:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5376:4: ruleQualifiedName
            {
             before(grammarAccess.getElementLiteralAccess().getValueElementQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementLiteralAccess().getValueElementQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getElementLiteralAccess().getValueElementCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementLiteral__ValueAssignment"


    // $ANTLR start "rule__MappingElement__ParameterAssignment_3"
    // InternalAutomatedRestTesting.g:5387:1: rule__MappingElement__ParameterAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingElement__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5391:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5392:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5392:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5393:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingElementAccess().getParameterElementCrossReference_3_0()); 
            // InternalAutomatedRestTesting.g:5394:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5395:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingElementAccess().getParameterElementQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingElementAccess().getParameterElementQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingElementAccess().getParameterElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__ParameterAssignment_3"


    // $ANTLR start "rule__MappingElement__ValueAssignment_8"
    // InternalAutomatedRestTesting.g:5406:1: rule__MappingElement__ValueAssignment_8 : ( ruleLiteral ) ;
    public final void rule__MappingElement__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5410:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5411:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5411:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5412:3: ruleLiteral
            {
             before(grammarAccess.getMappingElementAccess().getValueLiteralParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMappingElementAccess().getValueLiteralParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingElement__ValueAssignment_8"


    // $ANTLR start "rule__Parameter__ParamTypeAssignment_1"
    // InternalAutomatedRestTesting.g:5421:1: rule__Parameter__ParamTypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__Parameter__ParamTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5425:1: ( ( ruleParameterType ) )
            // InternalAutomatedRestTesting.g:5426:2: ( ruleParameterType )
            {
            // InternalAutomatedRestTesting.g:5426:2: ( ruleParameterType )
            // InternalAutomatedRestTesting.g:5427:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getParamTypeParameterTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParamTypeParameterTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParamTypeAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // InternalAutomatedRestTesting.g:5436:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5440:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:5441:2: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:5441:2: ( RULE_ID )
            // InternalAutomatedRestTesting.g:5442:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:5451:1: rule__Restriction__MockTypeAssignment_3 : ( ruleMockTypes ) ;
    public final void rule__Restriction__MockTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5455:1: ( ( ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:5456:2: ( ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:5456:2: ( ruleMockTypes )
            // InternalAutomatedRestTesting.g:5457:3: ruleMockTypes
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
    // InternalAutomatedRestTesting.g:5466:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5470:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5471:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5471:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5472:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5481:1: rule__Entity__EntityAttributesAssignment_4 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5485:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5486:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5486:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5487:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5496:1: rule__Entity__EntityAttributesAssignment_6_0 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5500:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5501:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5501:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5502:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5511:1: rule__Attribute_Impl__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute_Impl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5515:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5516:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5516:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5517:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5526:1: rule__Attribute_Impl__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Attribute_Impl__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5530:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5531:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5531:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5532:3: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAttribute_ImplAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:5541:1: rule__Attribute_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5545:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5546:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5546:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5547:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5556:1: rule__DomainAttribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__DomainAttribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5560:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5561:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5561:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5562:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5571:1: rule__DomainAttribute__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__DomainAttribute__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5575:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5576:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5576:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5577:3: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getDomainAttributeAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:5586:1: rule__DomainAttribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DomainAttribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5590:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5591:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5591:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5592:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5601:1: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 : ( ( 'PK' ) ) ;
    public final void rule__DomainAttribute__PrimaryKeyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5605:1: ( ( ( 'PK' ) ) )
            // InternalAutomatedRestTesting.g:5606:2: ( ( 'PK' ) )
            {
            // InternalAutomatedRestTesting.g:5606:2: ( ( 'PK' ) )
            // InternalAutomatedRestTesting.g:5607:3: ( 'PK' )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            // InternalAutomatedRestTesting.g:5608:3: ( 'PK' )
            // InternalAutomatedRestTesting.g:5609:4: 'PK'
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:5620:1: rule__DomainAttribute__RestrictionsAssignment_4_2 : ( ruleRestriction ) ;
    public final void rule__DomainAttribute__RestrictionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5624:1: ( ( ruleRestriction ) )
            // InternalAutomatedRestTesting.g:5625:2: ( ruleRestriction )
            {
            // InternalAutomatedRestTesting.g:5625:2: ( ruleRestriction )
            // InternalAutomatedRestTesting.g:5626:3: ruleRestriction
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
    // InternalAutomatedRestTesting.g:5635:1: rule__SimpleEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5639:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5640:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5640:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5641:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5650:1: rule__SimpleEntity__EntityAttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5654:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5655:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5655:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5656:3: ruleAttribute
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
    // InternalAutomatedRestTesting.g:5665:1: rule__SimpleEntity__EntityAttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5669:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5670:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5670:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5671:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8000078000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000180000001200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180000001002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007F800000E0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000400F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000400F0L,0x00000000000000A0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000180000001000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x03FFE00000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000007C000800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000020000L});

}