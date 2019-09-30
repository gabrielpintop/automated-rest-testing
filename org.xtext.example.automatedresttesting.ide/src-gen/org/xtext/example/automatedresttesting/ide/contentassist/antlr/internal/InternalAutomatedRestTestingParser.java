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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOT", "RULE_ARROW", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_SLASH", "RULE_SQUARE_LEFT_BRACKET", "RULE_SQUARE_RIGHT_BRACKET", "RULE_COMMA", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_INT", "RULE_TWO_DOTS", "RULE_MONEY", "RULE_QUESTION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'response->'", "'response.'", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'/:'", "'?$'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'", "'apiURL'", "'URL'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'Assertions'", "'description'", "'Mapping'", "'parameter'", "'value'", "'request'", "'mockType'", "'Entity'", "'SimpleEntity'", "'PK'"
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
    public static final int T__76=76;
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


    // $ANTLR start "ruleAssertionType"
    // InternalAutomatedRestTesting.g:553:1: ruleAssertionType : ( ( rule__AssertionType__Alternatives ) ) ;
    public final void ruleAssertionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:557:1: ( ( ( rule__AssertionType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:558:2: ( ( rule__AssertionType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:558:2: ( ( rule__AssertionType__Alternatives ) )
            // InternalAutomatedRestTesting.g:559:3: ( rule__AssertionType__Alternatives )
            {
             before(grammarAccess.getAssertionTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:560:3: ( rule__AssertionType__Alternatives )
            // InternalAutomatedRestTesting.g:560:4: rule__AssertionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssertionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssertionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertionType"


    // $ANTLR start "ruleAttributeType"
    // InternalAutomatedRestTesting.g:569:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:573:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:574:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:574:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalAutomatedRestTesting.g:575:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:576:3: ( rule__AttributeType__Alternatives )
            // InternalAutomatedRestTesting.g:576:4: rule__AttributeType__Alternatives
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
    // InternalAutomatedRestTesting.g:585:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:589:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:590:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:590:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalAutomatedRestTesting.g:591:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:592:3: ( rule__RelationalOperator__Alternatives )
            // InternalAutomatedRestTesting.g:592:4: rule__RelationalOperator__Alternatives
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
    // InternalAutomatedRestTesting.g:601:1: ruleMethodType : ( ( rule__MethodType__Alternatives ) ) ;
    public final void ruleMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:605:1: ( ( ( rule__MethodType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:606:2: ( ( rule__MethodType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:606:2: ( ( rule__MethodType__Alternatives ) )
            // InternalAutomatedRestTesting.g:607:3: ( rule__MethodType__Alternatives )
            {
             before(grammarAccess.getMethodTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:608:3: ( rule__MethodType__Alternatives )
            // InternalAutomatedRestTesting.g:608:4: rule__MethodType__Alternatives
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
    // InternalAutomatedRestTesting.g:617:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:621:1: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:622:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:622:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalAutomatedRestTesting.g:623:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:624:3: ( rule__ParameterType__Alternatives )
            // InternalAutomatedRestTesting.g:624:4: rule__ParameterType__Alternatives
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
    // InternalAutomatedRestTesting.g:633:1: ruleMockTypes : ( ( rule__MockTypes__Alternatives ) ) ;
    public final void ruleMockTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:637:1: ( ( ( rule__MockTypes__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:638:2: ( ( rule__MockTypes__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:638:2: ( ( rule__MockTypes__Alternatives ) )
            // InternalAutomatedRestTesting.g:639:3: ( rule__MockTypes__Alternatives )
            {
             before(grammarAccess.getMockTypesAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:640:3: ( rule__MockTypes__Alternatives )
            // InternalAutomatedRestTesting.g:640:4: rule__MockTypes__Alternatives
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
    // InternalAutomatedRestTesting.g:648:1: rule__Element__Alternatives : ( ( ruleEntity ) | ( ruleSimpleEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:652:1: ( ( ruleEntity ) | ( ruleSimpleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==74) ) {
                alt1=1;
            }
            else if ( (LA1_0==75) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAutomatedRestTesting.g:653:2: ( ruleEntity )
                    {
                    // InternalAutomatedRestTesting.g:653:2: ( ruleEntity )
                    // InternalAutomatedRestTesting.g:654:3: ruleEntity
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
                    // InternalAutomatedRestTesting.g:659:2: ( ruleSimpleEntity )
                    {
                    // InternalAutomatedRestTesting.g:659:2: ( ruleSimpleEntity )
                    // InternalAutomatedRestTesting.g:660:3: ruleSimpleEntity
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
    // InternalAutomatedRestTesting.g:669:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:673:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAutomatedRestTesting.g:674:2: ( RULE_STRING )
                    {
                    // InternalAutomatedRestTesting.g:674:2: ( RULE_STRING )
                    // InternalAutomatedRestTesting.g:675:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:680:2: ( RULE_ID )
                    {
                    // InternalAutomatedRestTesting.g:680:2: ( RULE_ID )
                    // InternalAutomatedRestTesting.g:681:3: RULE_ID
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
    // InternalAutomatedRestTesting.g:690:1: rule__RestService__Alternatives_7 : ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) );
    public final void rule__RestService__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:694:1: ( ( ( rule__RestService__Group_7_0__0 ) ) | ( ( rule__RestService__ParametersAssignment_7_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SLASH) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=45 && LA3_0<=46)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutomatedRestTesting.g:695:2: ( ( rule__RestService__Group_7_0__0 ) )
                    {
                    // InternalAutomatedRestTesting.g:695:2: ( ( rule__RestService__Group_7_0__0 ) )
                    // InternalAutomatedRestTesting.g:696:3: ( rule__RestService__Group_7_0__0 )
                    {
                     before(grammarAccess.getRestServiceAccess().getGroup_7_0()); 
                    // InternalAutomatedRestTesting.g:697:3: ( rule__RestService__Group_7_0__0 )
                    // InternalAutomatedRestTesting.g:697:4: rule__RestService__Group_7_0__0
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
                    // InternalAutomatedRestTesting.g:701:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    {
                    // InternalAutomatedRestTesting.g:701:2: ( ( rule__RestService__ParametersAssignment_7_1 ) )
                    // InternalAutomatedRestTesting.g:702:3: ( rule__RestService__ParametersAssignment_7_1 )
                    {
                     before(grammarAccess.getRestServiceAccess().getParametersAssignment_7_1()); 
                    // InternalAutomatedRestTesting.g:703:3: ( rule__RestService__ParametersAssignment_7_1 )
                    // InternalAutomatedRestTesting.g:703:4: rule__RestService__ParametersAssignment_7_1
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


    // $ANTLR start "rule__Expression__Alternatives_1_0_1"
    // InternalAutomatedRestTesting.g:711:1: rule__Expression__Alternatives_1_0_1 : ( ( RULE_DOT ) | ( RULE_ARROW ) );
    public final void rule__Expression__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:715:1: ( ( RULE_DOT ) | ( RULE_ARROW ) )
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
                    // InternalAutomatedRestTesting.g:716:2: ( RULE_DOT )
                    {
                    // InternalAutomatedRestTesting.g:716:2: ( RULE_DOT )
                    // InternalAutomatedRestTesting.g:717:3: RULE_DOT
                    {
                     before(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 
                    match(input,RULE_DOT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:722:2: ( RULE_ARROW )
                    {
                    // InternalAutomatedRestTesting.g:722:2: ( RULE_ARROW )
                    // InternalAutomatedRestTesting.g:723:3: RULE_ARROW
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
    // InternalAutomatedRestTesting.g:732:1: rule__Literal__Alternatives : ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:736:1: ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAutomatedRestTesting.g:737:2: ( ruleElementLiteral )
                    {
                    // InternalAutomatedRestTesting.g:737:2: ( ruleElementLiteral )
                    // InternalAutomatedRestTesting.g:738:3: ruleElementLiteral
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
                    // InternalAutomatedRestTesting.g:743:2: ( ruleStringLiteral )
                    {
                    // InternalAutomatedRestTesting.g:743:2: ( ruleStringLiteral )
                    // InternalAutomatedRestTesting.g:744:3: ruleStringLiteral
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
                    // InternalAutomatedRestTesting.g:749:2: ( ruleIntegerLiteral )
                    {
                    // InternalAutomatedRestTesting.g:749:2: ( ruleIntegerLiteral )
                    // InternalAutomatedRestTesting.g:750:3: ruleIntegerLiteral
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


    // $ANTLR start "rule__AssertionType__Alternatives"
    // InternalAutomatedRestTesting.g:759:1: rule__AssertionType__Alternatives : ( ( ( 'response->' ) ) | ( ( 'response.' ) ) );
    public final void rule__AssertionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:763:1: ( ( ( 'response->' ) ) | ( ( 'response.' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAutomatedRestTesting.g:764:2: ( ( 'response->' ) )
                    {
                    // InternalAutomatedRestTesting.g:764:2: ( ( 'response->' ) )
                    // InternalAutomatedRestTesting.g:765:3: ( 'response->' )
                    {
                     before(grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:766:3: ( 'response->' )
                    // InternalAutomatedRestTesting.g:766:4: 'response->'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:770:2: ( ( 'response.' ) )
                    {
                    // InternalAutomatedRestTesting.g:770:2: ( ( 'response.' ) )
                    // InternalAutomatedRestTesting.g:771:3: ( 'response.' )
                    {
                     before(grammarAccess.getAssertionTypeAccess().getInformationEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:772:3: ( 'response.' )
                    // InternalAutomatedRestTesting.g:772:4: 'response.'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssertionTypeAccess().getInformationEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AssertionType__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalAutomatedRestTesting.g:780:1: rule__AttributeType__Alternatives : ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:784:1: ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
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
                    // InternalAutomatedRestTesting.g:785:2: ( ( 'string' ) )
                    {
                    // InternalAutomatedRestTesting.g:785:2: ( ( 'string' ) )
                    // InternalAutomatedRestTesting.g:786:3: ( 'string' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:787:3: ( 'string' )
                    // InternalAutomatedRestTesting.g:787:4: 'string'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:791:2: ( ( 'boolean' ) )
                    {
                    // InternalAutomatedRestTesting.g:791:2: ( ( 'boolean' ) )
                    // InternalAutomatedRestTesting.g:792:3: ( 'boolean' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:793:3: ( 'boolean' )
                    // InternalAutomatedRestTesting.g:793:4: 'boolean'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:797:2: ( ( 'integer' ) )
                    {
                    // InternalAutomatedRestTesting.g:797:2: ( ( 'integer' ) )
                    // InternalAutomatedRestTesting.g:798:3: ( 'integer' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:799:3: ( 'integer' )
                    // InternalAutomatedRestTesting.g:799:4: 'integer'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:803:2: ( ( 'double' ) )
                    {
                    // InternalAutomatedRestTesting.g:803:2: ( ( 'double' ) )
                    // InternalAutomatedRestTesting.g:804:3: ( 'double' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:805:3: ( 'double' )
                    // InternalAutomatedRestTesting.g:805:4: 'double'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:809:2: ( ( 'date' ) )
                    {
                    // InternalAutomatedRestTesting.g:809:2: ( ( 'date' ) )
                    // InternalAutomatedRestTesting.g:810:3: ( 'date' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:811:3: ( 'date' )
                    // InternalAutomatedRestTesting.g:811:4: 'date'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:819:1: rule__RelationalOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:823:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 39:
                {
                alt8=7;
                }
                break;
            case 40:
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
                    // InternalAutomatedRestTesting.g:824:2: ( ( '<' ) )
                    {
                    // InternalAutomatedRestTesting.g:824:2: ( ( '<' ) )
                    // InternalAutomatedRestTesting.g:825:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:826:3: ( '<' )
                    // InternalAutomatedRestTesting.g:826:4: '<'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:830:2: ( ( '<=' ) )
                    {
                    // InternalAutomatedRestTesting.g:830:2: ( ( '<=' ) )
                    // InternalAutomatedRestTesting.g:831:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:832:3: ( '<=' )
                    // InternalAutomatedRestTesting.g:832:4: '<='
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:836:2: ( ( '==' ) )
                    {
                    // InternalAutomatedRestTesting.g:836:2: ( ( '==' ) )
                    // InternalAutomatedRestTesting.g:837:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:838:3: ( '==' )
                    // InternalAutomatedRestTesting.g:838:4: '=='
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:842:2: ( ( '!=' ) )
                    {
                    // InternalAutomatedRestTesting.g:842:2: ( ( '!=' ) )
                    // InternalAutomatedRestTesting.g:843:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:844:3: ( '!=' )
                    // InternalAutomatedRestTesting.g:844:4: '!='
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:848:2: ( ( '>=' ) )
                    {
                    // InternalAutomatedRestTesting.g:848:2: ( ( '>=' ) )
                    // InternalAutomatedRestTesting.g:849:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:850:3: ( '>=' )
                    // InternalAutomatedRestTesting.g:850:4: '>='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:854:2: ( ( '>' ) )
                    {
                    // InternalAutomatedRestTesting.g:854:2: ( ( '>' ) )
                    // InternalAutomatedRestTesting.g:855:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:856:3: ( '>' )
                    // InternalAutomatedRestTesting.g:856:4: '>'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:860:2: ( ( '&&' ) )
                    {
                    // InternalAutomatedRestTesting.g:860:2: ( ( '&&' ) )
                    // InternalAutomatedRestTesting.g:861:3: ( '&&' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:862:3: ( '&&' )
                    // InternalAutomatedRestTesting.g:862:4: '&&'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:866:2: ( ( '||' ) )
                    {
                    // InternalAutomatedRestTesting.g:866:2: ( ( '||' ) )
                    // InternalAutomatedRestTesting.g:867:3: ( '||' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:868:3: ( '||' )
                    // InternalAutomatedRestTesting.g:868:4: '||'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:876:1: rule__MethodType__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__MethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:880:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 43:
                {
                alt9=3;
                }
                break;
            case 44:
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
                    // InternalAutomatedRestTesting.g:881:2: ( ( 'GET' ) )
                    {
                    // InternalAutomatedRestTesting.g:881:2: ( ( 'GET' ) )
                    // InternalAutomatedRestTesting.g:882:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:883:3: ( 'GET' )
                    // InternalAutomatedRestTesting.g:883:4: 'GET'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:887:2: ( ( 'POST' ) )
                    {
                    // InternalAutomatedRestTesting.g:887:2: ( ( 'POST' ) )
                    // InternalAutomatedRestTesting.g:888:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:889:3: ( 'POST' )
                    // InternalAutomatedRestTesting.g:889:4: 'POST'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:893:2: ( ( 'PUT' ) )
                    {
                    // InternalAutomatedRestTesting.g:893:2: ( ( 'PUT' ) )
                    // InternalAutomatedRestTesting.g:894:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:895:3: ( 'PUT' )
                    // InternalAutomatedRestTesting.g:895:4: 'PUT'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:899:2: ( ( 'DELETE' ) )
                    {
                    // InternalAutomatedRestTesting.g:899:2: ( ( 'DELETE' ) )
                    // InternalAutomatedRestTesting.g:900:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:901:3: ( 'DELETE' )
                    // InternalAutomatedRestTesting.g:901:4: 'DELETE'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:909:1: rule__ParameterType__Alternatives : ( ( ( '/:' ) ) | ( ( '?$' ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:913:1: ( ( ( '/:' ) ) | ( ( '?$' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            else if ( (LA10_0==46) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAutomatedRestTesting.g:914:2: ( ( '/:' ) )
                    {
                    // InternalAutomatedRestTesting.g:914:2: ( ( '/:' ) )
                    // InternalAutomatedRestTesting.g:915:3: ( '/:' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:916:3: ( '/:' )
                    // InternalAutomatedRestTesting.g:916:4: '/:'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:920:2: ( ( '?$' ) )
                    {
                    // InternalAutomatedRestTesting.g:920:2: ( ( '?$' ) )
                    // InternalAutomatedRestTesting.g:921:3: ( '?$' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:922:3: ( '?$' )
                    // InternalAutomatedRestTesting.g:922:4: '?$'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:930:1: rule__MockTypes__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) );
    public final void rule__MockTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:934:1: ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) )
            int alt11=13;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 48:
                {
                alt11=2;
                }
                break;
            case 49:
                {
                alt11=3;
                }
                break;
            case 50:
                {
                alt11=4;
                }
                break;
            case 51:
                {
                alt11=5;
                }
                break;
            case 52:
                {
                alt11=6;
                }
                break;
            case 53:
                {
                alt11=7;
                }
                break;
            case 54:
                {
                alt11=8;
                }
                break;
            case 55:
                {
                alt11=9;
                }
                break;
            case 56:
                {
                alt11=10;
                }
                break;
            case 57:
                {
                alt11=11;
                }
                break;
            case 58:
                {
                alt11=12;
                }
                break;
            case 59:
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
                    // InternalAutomatedRestTesting.g:935:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:935:2: ( ( 'FirstNameType' ) )
                    // InternalAutomatedRestTesting.g:936:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:937:3: ( 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:937:4: 'FirstNameType'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:941:2: ( ( 'FirstNameMaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:941:2: ( ( 'FirstNameMaleType' ) )
                    // InternalAutomatedRestTesting.g:942:3: ( 'FirstNameMaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:943:3: ( 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:943:4: 'FirstNameMaleType'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:947:2: ( ( 'FirstNameFemaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:947:2: ( ( 'FirstNameFemaleType' ) )
                    // InternalAutomatedRestTesting.g:948:3: ( 'FirstNameFemaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:949:3: ( 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:949:4: 'FirstNameFemaleType'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:953:2: ( ( 'LastNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:953:2: ( ( 'LastNameType' ) )
                    // InternalAutomatedRestTesting.g:954:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:955:3: ( 'LastNameType' )
                    // InternalAutomatedRestTesting.g:955:4: 'LastNameType'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:959:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:959:2: ( ( 'FamilyNameType' ) )
                    // InternalAutomatedRestTesting.g:960:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:961:3: ( 'FamilyNameType' )
                    // InternalAutomatedRestTesting.g:961:4: 'FamilyNameType'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:965:2: ( ( 'FullNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:965:2: ( ( 'FullNameType' ) )
                    // InternalAutomatedRestTesting.g:966:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:967:3: ( 'FullNameType' )
                    // InternalAutomatedRestTesting.g:967:4: 'FullNameType'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:971:2: ( ( 'GenderType' ) )
                    {
                    // InternalAutomatedRestTesting.g:971:2: ( ( 'GenderType' ) )
                    // InternalAutomatedRestTesting.g:972:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:973:3: ( 'GenderType' )
                    // InternalAutomatedRestTesting.g:973:4: 'GenderType'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:977:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalAutomatedRestTesting.g:977:2: ( ( 'EmailAddressType' ) )
                    // InternalAutomatedRestTesting.g:978:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:979:3: ( 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:979:4: 'EmailAddressType'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:983:2: ( ( 'PhoneType' ) )
                    {
                    // InternalAutomatedRestTesting.g:983:2: ( ( 'PhoneType' ) )
                    // InternalAutomatedRestTesting.g:984:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 
                    // InternalAutomatedRestTesting.g:985:3: ( 'PhoneType' )
                    // InternalAutomatedRestTesting.g:985:4: 'PhoneType'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:989:2: ( ( 'CountryType' ) )
                    {
                    // InternalAutomatedRestTesting.g:989:2: ( ( 'CountryType' ) )
                    // InternalAutomatedRestTesting.g:990:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 
                    // InternalAutomatedRestTesting.g:991:3: ( 'CountryType' )
                    // InternalAutomatedRestTesting.g:991:4: 'CountryType'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:995:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalAutomatedRestTesting.g:995:2: ( ( 'CountryCodeType' ) )
                    // InternalAutomatedRestTesting.g:996:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 
                    // InternalAutomatedRestTesting.g:997:3: ( 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:997:4: 'CountryCodeType'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:1001:2: ( ( 'CityType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1001:2: ( ( 'CityType' ) )
                    // InternalAutomatedRestTesting.g:1002:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 
                    // InternalAutomatedRestTesting.g:1003:3: ( 'CityType' )
                    // InternalAutomatedRestTesting.g:1003:4: 'CityType'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:1007:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1007:2: ( ( 'RowNumberType' ) )
                    // InternalAutomatedRestTesting.g:1008:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalAutomatedRestTesting.g:1009:3: ( 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:1009:4: 'RowNumberType'
                    {
                    match(input,59,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1017:1: rule__AutomatedRestTesting__Group__0 : rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 ;
    public final void rule__AutomatedRestTesting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1021:1: ( rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 )
            // InternalAutomatedRestTesting.g:1022:2: rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1
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
    // InternalAutomatedRestTesting.g:1029:1: rule__AutomatedRestTesting__Group__0__Impl : ( () ) ;
    public final void rule__AutomatedRestTesting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1033:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:1034:1: ( () )
            {
            // InternalAutomatedRestTesting.g:1034:1: ( () )
            // InternalAutomatedRestTesting.g:1035:2: ()
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0()); 
            // InternalAutomatedRestTesting.g:1036:2: ()
            // InternalAutomatedRestTesting.g:1036:3: 
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
    // InternalAutomatedRestTesting.g:1044:1: rule__AutomatedRestTesting__Group__1 : rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 ;
    public final void rule__AutomatedRestTesting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1048:1: ( rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 )
            // InternalAutomatedRestTesting.g:1049:2: rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2
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
    // InternalAutomatedRestTesting.g:1056:1: rule__AutomatedRestTesting__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__AutomatedRestTesting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1060:1: ( ( 'apiURL' ) )
            // InternalAutomatedRestTesting.g:1061:1: ( 'apiURL' )
            {
            // InternalAutomatedRestTesting.g:1061:1: ( 'apiURL' )
            // InternalAutomatedRestTesting.g:1062:2: 'apiURL'
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1071:1: rule__AutomatedRestTesting__Group__2 : rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 ;
    public final void rule__AutomatedRestTesting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1075:1: ( rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 )
            // InternalAutomatedRestTesting.g:1076:2: rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3
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
    // InternalAutomatedRestTesting.g:1083:1: rule__AutomatedRestTesting__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__AutomatedRestTesting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1087:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1088:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1088:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1089:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1098:1: rule__AutomatedRestTesting__Group__3 : rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 ;
    public final void rule__AutomatedRestTesting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1102:1: ( rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 )
            // InternalAutomatedRestTesting.g:1103:2: rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4
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
    // InternalAutomatedRestTesting.g:1110:1: rule__AutomatedRestTesting__Group__3__Impl : ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) ;
    public final void rule__AutomatedRestTesting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1114:1: ( ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:1115:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:1115:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            // InternalAutomatedRestTesting.g:1116:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getUrlAssignment_3()); 
            // InternalAutomatedRestTesting.g:1117:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            // InternalAutomatedRestTesting.g:1117:3: rule__AutomatedRestTesting__UrlAssignment_3
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
    // InternalAutomatedRestTesting.g:1125:1: rule__AutomatedRestTesting__Group__4 : rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 ;
    public final void rule__AutomatedRestTesting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1129:1: ( rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 )
            // InternalAutomatedRestTesting.g:1130:2: rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5
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
    // InternalAutomatedRestTesting.g:1137:1: rule__AutomatedRestTesting__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AutomatedRestTesting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1141:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1142:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1142:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1143:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1152:1: rule__AutomatedRestTesting__Group__5 : rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 ;
    public final void rule__AutomatedRestTesting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1156:1: ( rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 )
            // InternalAutomatedRestTesting.g:1157:2: rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6
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
    // InternalAutomatedRestTesting.g:1164:1: rule__AutomatedRestTesting__Group__5__Impl : ( ( rule__AutomatedRestTesting__Group_5__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1168:1: ( ( ( rule__AutomatedRestTesting__Group_5__0 )? ) )
            // InternalAutomatedRestTesting.g:1169:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:1169:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            // InternalAutomatedRestTesting.g:1170:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_5()); 
            // InternalAutomatedRestTesting.g:1171:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=74 && LA12_0<=75)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1171:3: rule__AutomatedRestTesting__Group_5__0
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
    // InternalAutomatedRestTesting.g:1179:1: rule__AutomatedRestTesting__Group__6 : rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 ;
    public final void rule__AutomatedRestTesting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1183:1: ( rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 )
            // InternalAutomatedRestTesting.g:1184:2: rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7
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
    // InternalAutomatedRestTesting.g:1191:1: rule__AutomatedRestTesting__Group__6__Impl : ( ( rule__AutomatedRestTesting__Group_6__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1195:1: ( ( ( rule__AutomatedRestTesting__Group_6__0 )? ) )
            // InternalAutomatedRestTesting.g:1196:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            {
            // InternalAutomatedRestTesting.g:1196:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            // InternalAutomatedRestTesting.g:1197:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:1198:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=41 && LA13_0<=44)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1198:3: rule__AutomatedRestTesting__Group_6__0
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
    // InternalAutomatedRestTesting.g:1206:1: rule__AutomatedRestTesting__Group__7 : rule__AutomatedRestTesting__Group__7__Impl ;
    public final void rule__AutomatedRestTesting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1210:1: ( rule__AutomatedRestTesting__Group__7__Impl )
            // InternalAutomatedRestTesting.g:1211:2: rule__AutomatedRestTesting__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:1217:1: rule__AutomatedRestTesting__Group__7__Impl : ( ( rule__AutomatedRestTesting__Group_7__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1221:1: ( ( ( rule__AutomatedRestTesting__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:1222:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:1222:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:1223:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1224:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==65) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1224:3: rule__AutomatedRestTesting__Group_7__0
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
    // InternalAutomatedRestTesting.g:1233:1: rule__AutomatedRestTesting__Group_5__0 : rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 ;
    public final void rule__AutomatedRestTesting__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1237:1: ( rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 )
            // InternalAutomatedRestTesting.g:1238:2: rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1
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
    // InternalAutomatedRestTesting.g:1245:1: rule__AutomatedRestTesting__Group_5__0__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1249:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) )
            // InternalAutomatedRestTesting.g:1250:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            {
            // InternalAutomatedRestTesting.g:1250:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            // InternalAutomatedRestTesting.g:1251:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_0()); 
            // InternalAutomatedRestTesting.g:1252:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            // InternalAutomatedRestTesting.g:1252:3: rule__AutomatedRestTesting__DataElementsAssignment_5_0
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
    // InternalAutomatedRestTesting.g:1260:1: rule__AutomatedRestTesting__Group_5__1 : rule__AutomatedRestTesting__Group_5__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1264:1: ( rule__AutomatedRestTesting__Group_5__1__Impl )
            // InternalAutomatedRestTesting.g:1265:2: rule__AutomatedRestTesting__Group_5__1__Impl
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
    // InternalAutomatedRestTesting.g:1271:1: rule__AutomatedRestTesting__Group_5__1__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1275:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) )
            // InternalAutomatedRestTesting.g:1276:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            {
            // InternalAutomatedRestTesting.g:1276:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            // InternalAutomatedRestTesting.g:1277:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_1()); 
            // InternalAutomatedRestTesting.g:1278:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=74 && LA15_0<=75)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1278:3: rule__AutomatedRestTesting__DataElementsAssignment_5_1
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
    // InternalAutomatedRestTesting.g:1287:1: rule__AutomatedRestTesting__Group_6__0 : rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 ;
    public final void rule__AutomatedRestTesting__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1291:1: ( rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 )
            // InternalAutomatedRestTesting.g:1292:2: rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1
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
    // InternalAutomatedRestTesting.g:1299:1: rule__AutomatedRestTesting__Group_6__0__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1303:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:1304:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:1304:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:1305:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:1306:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:1306:3: rule__AutomatedRestTesting__ServicesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:1314:1: rule__AutomatedRestTesting__Group_6__1 : rule__AutomatedRestTesting__Group_6__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1318:1: ( rule__AutomatedRestTesting__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:1319:2: rule__AutomatedRestTesting__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:1325:1: rule__AutomatedRestTesting__Group_6__1__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1329:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) )
            // InternalAutomatedRestTesting.g:1330:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            {
            // InternalAutomatedRestTesting.g:1330:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            // InternalAutomatedRestTesting.g:1331:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_1()); 
            // InternalAutomatedRestTesting.g:1332:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1332:3: rule__AutomatedRestTesting__ServicesAssignment_6_1
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
    // InternalAutomatedRestTesting.g:1341:1: rule__AutomatedRestTesting__Group_7__0 : rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 ;
    public final void rule__AutomatedRestTesting__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1345:1: ( rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 )
            // InternalAutomatedRestTesting.g:1346:2: rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1
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
    // InternalAutomatedRestTesting.g:1353:1: rule__AutomatedRestTesting__Group_7__0__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1357:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) )
            // InternalAutomatedRestTesting.g:1358:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            {
            // InternalAutomatedRestTesting.g:1358:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            // InternalAutomatedRestTesting.g:1359:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_0()); 
            // InternalAutomatedRestTesting.g:1360:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            // InternalAutomatedRestTesting.g:1360:3: rule__AutomatedRestTesting__TestsAssignment_7_0
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
    // InternalAutomatedRestTesting.g:1368:1: rule__AutomatedRestTesting__Group_7__1 : rule__AutomatedRestTesting__Group_7__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1372:1: ( rule__AutomatedRestTesting__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:1373:2: rule__AutomatedRestTesting__Group_7__1__Impl
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
    // InternalAutomatedRestTesting.g:1379:1: rule__AutomatedRestTesting__Group_7__1__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1383:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) )
            // InternalAutomatedRestTesting.g:1384:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            {
            // InternalAutomatedRestTesting.g:1384:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            // InternalAutomatedRestTesting.g:1385:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_1()); 
            // InternalAutomatedRestTesting.g:1386:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==65) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1386:3: rule__AutomatedRestTesting__TestsAssignment_7_1
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
    // InternalAutomatedRestTesting.g:1395:1: rule__RestService__Group__0 : rule__RestService__Group__0__Impl rule__RestService__Group__1 ;
    public final void rule__RestService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1399:1: ( rule__RestService__Group__0__Impl rule__RestService__Group__1 )
            // InternalAutomatedRestTesting.g:1400:2: rule__RestService__Group__0__Impl rule__RestService__Group__1
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
    // InternalAutomatedRestTesting.g:1407:1: rule__RestService__Group__0__Impl : ( ( rule__RestService__MethodAssignment_0 ) ) ;
    public final void rule__RestService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1411:1: ( ( ( rule__RestService__MethodAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:1412:1: ( ( rule__RestService__MethodAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:1412:1: ( ( rule__RestService__MethodAssignment_0 ) )
            // InternalAutomatedRestTesting.g:1413:2: ( rule__RestService__MethodAssignment_0 )
            {
             before(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 
            // InternalAutomatedRestTesting.g:1414:2: ( rule__RestService__MethodAssignment_0 )
            // InternalAutomatedRestTesting.g:1414:3: rule__RestService__MethodAssignment_0
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
    // InternalAutomatedRestTesting.g:1422:1: rule__RestService__Group__1 : rule__RestService__Group__1__Impl rule__RestService__Group__2 ;
    public final void rule__RestService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1426:1: ( rule__RestService__Group__1__Impl rule__RestService__Group__2 )
            // InternalAutomatedRestTesting.g:1427:2: rule__RestService__Group__1__Impl rule__RestService__Group__2
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
    // InternalAutomatedRestTesting.g:1434:1: rule__RestService__Group__1__Impl : ( ( rule__RestService__NameAssignment_1 ) ) ;
    public final void rule__RestService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1438:1: ( ( ( rule__RestService__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1439:1: ( ( rule__RestService__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1439:1: ( ( rule__RestService__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1440:2: ( rule__RestService__NameAssignment_1 )
            {
             before(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1441:2: ( rule__RestService__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1441:3: rule__RestService__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:1449:1: rule__RestService__Group__2 : rule__RestService__Group__2__Impl rule__RestService__Group__3 ;
    public final void rule__RestService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1453:1: ( rule__RestService__Group__2__Impl rule__RestService__Group__3 )
            // InternalAutomatedRestTesting.g:1454:2: rule__RestService__Group__2__Impl rule__RestService__Group__3
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
    // InternalAutomatedRestTesting.g:1461:1: rule__RestService__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1465:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1466:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1466:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1467:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1476:1: rule__RestService__Group__3 : rule__RestService__Group__3__Impl rule__RestService__Group__4 ;
    public final void rule__RestService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1480:1: ( rule__RestService__Group__3__Impl rule__RestService__Group__4 )
            // InternalAutomatedRestTesting.g:1481:2: rule__RestService__Group__3__Impl rule__RestService__Group__4
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
    // InternalAutomatedRestTesting.g:1488:1: rule__RestService__Group__3__Impl : ( 'URL' ) ;
    public final void rule__RestService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1492:1: ( ( 'URL' ) )
            // InternalAutomatedRestTesting.g:1493:1: ( 'URL' )
            {
            // InternalAutomatedRestTesting.g:1493:1: ( 'URL' )
            // InternalAutomatedRestTesting.g:1494:2: 'URL'
            {
             before(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1503:1: rule__RestService__Group__4 : rule__RestService__Group__4__Impl rule__RestService__Group__5 ;
    public final void rule__RestService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1507:1: ( rule__RestService__Group__4__Impl rule__RestService__Group__5 )
            // InternalAutomatedRestTesting.g:1508:2: rule__RestService__Group__4__Impl rule__RestService__Group__5
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
    // InternalAutomatedRestTesting.g:1515:1: rule__RestService__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1519:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1520:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1520:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1521:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1530:1: rule__RestService__Group__5 : rule__RestService__Group__5__Impl rule__RestService__Group__6 ;
    public final void rule__RestService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1534:1: ( rule__RestService__Group__5__Impl rule__RestService__Group__6 )
            // InternalAutomatedRestTesting.g:1535:2: rule__RestService__Group__5__Impl rule__RestService__Group__6
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
    // InternalAutomatedRestTesting.g:1542:1: rule__RestService__Group__5__Impl : ( ( rule__RestService__UriAssignment_5 ) ) ;
    public final void rule__RestService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1546:1: ( ( ( rule__RestService__UriAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1547:1: ( ( rule__RestService__UriAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1547:1: ( ( rule__RestService__UriAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1548:2: ( rule__RestService__UriAssignment_5 )
            {
             before(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 
            // InternalAutomatedRestTesting.g:1549:2: ( rule__RestService__UriAssignment_5 )
            // InternalAutomatedRestTesting.g:1549:3: rule__RestService__UriAssignment_5
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
    // InternalAutomatedRestTesting.g:1557:1: rule__RestService__Group__6 : rule__RestService__Group__6__Impl rule__RestService__Group__7 ;
    public final void rule__RestService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1561:1: ( rule__RestService__Group__6__Impl rule__RestService__Group__7 )
            // InternalAutomatedRestTesting.g:1562:2: rule__RestService__Group__6__Impl rule__RestService__Group__7
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
    // InternalAutomatedRestTesting.g:1569:1: rule__RestService__Group__6__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1573:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1574:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1574:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1575:2: ruleEString
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
    // InternalAutomatedRestTesting.g:1584:1: rule__RestService__Group__7 : rule__RestService__Group__7__Impl rule__RestService__Group__8 ;
    public final void rule__RestService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1588:1: ( rule__RestService__Group__7__Impl rule__RestService__Group__8 )
            // InternalAutomatedRestTesting.g:1589:2: rule__RestService__Group__7__Impl rule__RestService__Group__8
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
    // InternalAutomatedRestTesting.g:1596:1: rule__RestService__Group__7__Impl : ( ( rule__RestService__Alternatives_7 )* ) ;
    public final void rule__RestService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1600:1: ( ( ( rule__RestService__Alternatives_7 )* ) )
            // InternalAutomatedRestTesting.g:1601:1: ( ( rule__RestService__Alternatives_7 )* )
            {
            // InternalAutomatedRestTesting.g:1601:1: ( ( rule__RestService__Alternatives_7 )* )
            // InternalAutomatedRestTesting.g:1602:2: ( rule__RestService__Alternatives_7 )*
            {
             before(grammarAccess.getRestServiceAccess().getAlternatives_7()); 
            // InternalAutomatedRestTesting.g:1603:2: ( rule__RestService__Alternatives_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SLASH||(LA18_0>=45 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1603:3: rule__RestService__Alternatives_7
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
    // InternalAutomatedRestTesting.g:1611:1: rule__RestService__Group__8 : rule__RestService__Group__8__Impl rule__RestService__Group__9 ;
    public final void rule__RestService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1615:1: ( rule__RestService__Group__8__Impl rule__RestService__Group__9 )
            // InternalAutomatedRestTesting.g:1616:2: rule__RestService__Group__8__Impl rule__RestService__Group__9
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
    // InternalAutomatedRestTesting.g:1623:1: rule__RestService__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1627:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1628:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1628:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1629:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1638:1: rule__RestService__Group__9 : rule__RestService__Group__9__Impl rule__RestService__Group__10 ;
    public final void rule__RestService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1642:1: ( rule__RestService__Group__9__Impl rule__RestService__Group__10 )
            // InternalAutomatedRestTesting.g:1643:2: rule__RestService__Group__9__Impl rule__RestService__Group__10
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
    // InternalAutomatedRestTesting.g:1650:1: rule__RestService__Group__9__Impl : ( ( rule__RestService__Group_9__0 )? ) ;
    public final void rule__RestService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1654:1: ( ( ( rule__RestService__Group_9__0 )? ) )
            // InternalAutomatedRestTesting.g:1655:1: ( ( rule__RestService__Group_9__0 )? )
            {
            // InternalAutomatedRestTesting.g:1655:1: ( ( rule__RestService__Group_9__0 )? )
            // InternalAutomatedRestTesting.g:1656:2: ( rule__RestService__Group_9__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9()); 
            // InternalAutomatedRestTesting.g:1657:2: ( rule__RestService__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==64) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1657:3: rule__RestService__Group_9__0
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
    // InternalAutomatedRestTesting.g:1665:1: rule__RestService__Group__10 : rule__RestService__Group__10__Impl rule__RestService__Group__11 ;
    public final void rule__RestService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1669:1: ( rule__RestService__Group__10__Impl rule__RestService__Group__11 )
            // InternalAutomatedRestTesting.g:1670:2: rule__RestService__Group__10__Impl rule__RestService__Group__11
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
    // InternalAutomatedRestTesting.g:1677:1: rule__RestService__Group__10__Impl : ( 'Response' ) ;
    public final void rule__RestService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1681:1: ( ( 'Response' ) )
            // InternalAutomatedRestTesting.g:1682:1: ( 'Response' )
            {
            // InternalAutomatedRestTesting.g:1682:1: ( 'Response' )
            // InternalAutomatedRestTesting.g:1683:2: 'Response'
            {
             before(grammarAccess.getRestServiceAccess().getResponseKeyword_10()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1692:1: rule__RestService__Group__11 : rule__RestService__Group__11__Impl rule__RestService__Group__12 ;
    public final void rule__RestService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1696:1: ( rule__RestService__Group__11__Impl rule__RestService__Group__12 )
            // InternalAutomatedRestTesting.g:1697:2: rule__RestService__Group__11__Impl rule__RestService__Group__12
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
    // InternalAutomatedRestTesting.g:1704:1: rule__RestService__Group__11__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1708:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1709:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1709:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1710:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1719:1: rule__RestService__Group__12 : rule__RestService__Group__12__Impl rule__RestService__Group__13 ;
    public final void rule__RestService__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1723:1: ( rule__RestService__Group__12__Impl rule__RestService__Group__13 )
            // InternalAutomatedRestTesting.g:1724:2: rule__RestService__Group__12__Impl rule__RestService__Group__13
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
    // InternalAutomatedRestTesting.g:1731:1: rule__RestService__Group__12__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1735:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:1736:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:1736:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:1737:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_12()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1746:1: rule__RestService__Group__13 : rule__RestService__Group__13__Impl rule__RestService__Group__14 ;
    public final void rule__RestService__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1750:1: ( rule__RestService__Group__13__Impl rule__RestService__Group__14 )
            // InternalAutomatedRestTesting.g:1751:2: rule__RestService__Group__13__Impl rule__RestService__Group__14
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
    // InternalAutomatedRestTesting.g:1758:1: rule__RestService__Group__13__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1762:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1763:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1763:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1764:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1773:1: rule__RestService__Group__14 : rule__RestService__Group__14__Impl rule__RestService__Group__15 ;
    public final void rule__RestService__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1777:1: ( rule__RestService__Group__14__Impl rule__RestService__Group__15 )
            // InternalAutomatedRestTesting.g:1778:2: rule__RestService__Group__14__Impl rule__RestService__Group__15
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
    // InternalAutomatedRestTesting.g:1785:1: rule__RestService__Group__14__Impl : ( ( rule__RestService__ResponseAssignment_14 ) ) ;
    public final void rule__RestService__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1789:1: ( ( ( rule__RestService__ResponseAssignment_14 ) ) )
            // InternalAutomatedRestTesting.g:1790:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            {
            // InternalAutomatedRestTesting.g:1790:1: ( ( rule__RestService__ResponseAssignment_14 ) )
            // InternalAutomatedRestTesting.g:1791:2: ( rule__RestService__ResponseAssignment_14 )
            {
             before(grammarAccess.getRestServiceAccess().getResponseAssignment_14()); 
            // InternalAutomatedRestTesting.g:1792:2: ( rule__RestService__ResponseAssignment_14 )
            // InternalAutomatedRestTesting.g:1792:3: rule__RestService__ResponseAssignment_14
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
    // InternalAutomatedRestTesting.g:1800:1: rule__RestService__Group__15 : rule__RestService__Group__15__Impl rule__RestService__Group__16 ;
    public final void rule__RestService__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1804:1: ( rule__RestService__Group__15__Impl rule__RestService__Group__16 )
            // InternalAutomatedRestTesting.g:1805:2: rule__RestService__Group__15__Impl rule__RestService__Group__16
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
    // InternalAutomatedRestTesting.g:1812:1: rule__RestService__Group__15__Impl : ( ( rule__RestService__Group_15__0 )? ) ;
    public final void rule__RestService__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1816:1: ( ( ( rule__RestService__Group_15__0 )? ) )
            // InternalAutomatedRestTesting.g:1817:1: ( ( rule__RestService__Group_15__0 )? )
            {
            // InternalAutomatedRestTesting.g:1817:1: ( ( rule__RestService__Group_15__0 )? )
            // InternalAutomatedRestTesting.g:1818:2: ( rule__RestService__Group_15__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_15()); 
            // InternalAutomatedRestTesting.g:1819:2: ( rule__RestService__Group_15__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1819:3: rule__RestService__Group_15__0
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
    // InternalAutomatedRestTesting.g:1827:1: rule__RestService__Group__16 : rule__RestService__Group__16__Impl rule__RestService__Group__17 ;
    public final void rule__RestService__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1831:1: ( rule__RestService__Group__16__Impl rule__RestService__Group__17 )
            // InternalAutomatedRestTesting.g:1832:2: rule__RestService__Group__16__Impl rule__RestService__Group__17
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
    // InternalAutomatedRestTesting.g:1839:1: rule__RestService__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1843:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1844:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1844:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1845:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1854:1: rule__RestService__Group__17 : rule__RestService__Group__17__Impl rule__RestService__Group__18 ;
    public final void rule__RestService__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1858:1: ( rule__RestService__Group__17__Impl rule__RestService__Group__18 )
            // InternalAutomatedRestTesting.g:1859:2: rule__RestService__Group__17__Impl rule__RestService__Group__18
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
    // InternalAutomatedRestTesting.g:1866:1: rule__RestService__Group__17__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1870:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1871:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1871:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1872:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:1881:1: rule__RestService__Group__18 : rule__RestService__Group__18__Impl ;
    public final void rule__RestService__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1885:1: ( rule__RestService__Group__18__Impl )
            // InternalAutomatedRestTesting.g:1886:2: rule__RestService__Group__18__Impl
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
    // InternalAutomatedRestTesting.g:1892:1: rule__RestService__Group__18__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1896:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1897:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1897:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1898:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:1908:1: rule__RestService__Group_7_0__0 : rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 ;
    public final void rule__RestService__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1912:1: ( rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1 )
            // InternalAutomatedRestTesting.g:1913:2: rule__RestService__Group_7_0__0__Impl rule__RestService__Group_7_0__1
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
    // InternalAutomatedRestTesting.g:1920:1: rule__RestService__Group_7_0__0__Impl : ( RULE_SLASH ) ;
    public final void rule__RestService__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1924:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:1925:1: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:1925:1: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:1926:2: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:1935:1: rule__RestService__Group_7_0__1 : rule__RestService__Group_7_0__1__Impl ;
    public final void rule__RestService__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1939:1: ( rule__RestService__Group_7_0__1__Impl )
            // InternalAutomatedRestTesting.g:1940:2: rule__RestService__Group_7_0__1__Impl
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
    // InternalAutomatedRestTesting.g:1946:1: rule__RestService__Group_7_0__1__Impl : ( ruleEString ) ;
    public final void rule__RestService__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1950:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:1951:1: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:1951:1: ( ruleEString )
            // InternalAutomatedRestTesting.g:1952:2: ruleEString
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
    // InternalAutomatedRestTesting.g:1962:1: rule__RestService__Group_9__0 : rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 ;
    public final void rule__RestService__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1966:1: ( rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1 )
            // InternalAutomatedRestTesting.g:1967:2: rule__RestService__Group_9__0__Impl rule__RestService__Group_9__1
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
    // InternalAutomatedRestTesting.g:1974:1: rule__RestService__Group_9__0__Impl : ( 'Request' ) ;
    public final void rule__RestService__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1978:1: ( ( 'Request' ) )
            // InternalAutomatedRestTesting.g:1979:1: ( 'Request' )
            {
            // InternalAutomatedRestTesting.g:1979:1: ( 'Request' )
            // InternalAutomatedRestTesting.g:1980:2: 'Request'
            {
             before(grammarAccess.getRestServiceAccess().getRequestKeyword_9_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1989:1: rule__RestService__Group_9__1 : rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 ;
    public final void rule__RestService__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1993:1: ( rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2 )
            // InternalAutomatedRestTesting.g:1994:2: rule__RestService__Group_9__1__Impl rule__RestService__Group_9__2
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
    // InternalAutomatedRestTesting.g:2001:1: rule__RestService__Group_9__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2005:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2006:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2006:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2007:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2016:1: rule__RestService__Group_9__2 : rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 ;
    public final void rule__RestService__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2020:1: ( rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3 )
            // InternalAutomatedRestTesting.g:2021:2: rule__RestService__Group_9__2__Impl rule__RestService__Group_9__3
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
    // InternalAutomatedRestTesting.g:2028:1: rule__RestService__Group_9__2__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2032:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2033:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2033:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2034:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_9_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2043:1: rule__RestService__Group_9__3 : rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 ;
    public final void rule__RestService__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2047:1: ( rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4 )
            // InternalAutomatedRestTesting.g:2048:2: rule__RestService__Group_9__3__Impl rule__RestService__Group_9__4
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
    // InternalAutomatedRestTesting.g:2055:1: rule__RestService__Group_9__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2059:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2060:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2060:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2061:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2070:1: rule__RestService__Group_9__4 : rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 ;
    public final void rule__RestService__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2074:1: ( rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5 )
            // InternalAutomatedRestTesting.g:2075:2: rule__RestService__Group_9__4__Impl rule__RestService__Group_9__5
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
    // InternalAutomatedRestTesting.g:2082:1: rule__RestService__Group_9__4__Impl : ( ( rule__RestService__RequestAssignment_9_4 ) ) ;
    public final void rule__RestService__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2086:1: ( ( ( rule__RestService__RequestAssignment_9_4 ) ) )
            // InternalAutomatedRestTesting.g:2087:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            {
            // InternalAutomatedRestTesting.g:2087:1: ( ( rule__RestService__RequestAssignment_9_4 ) )
            // InternalAutomatedRestTesting.g:2088:2: ( rule__RestService__RequestAssignment_9_4 )
            {
             before(grammarAccess.getRestServiceAccess().getRequestAssignment_9_4()); 
            // InternalAutomatedRestTesting.g:2089:2: ( rule__RestService__RequestAssignment_9_4 )
            // InternalAutomatedRestTesting.g:2089:3: rule__RestService__RequestAssignment_9_4
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
    // InternalAutomatedRestTesting.g:2097:1: rule__RestService__Group_9__5 : rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 ;
    public final void rule__RestService__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2101:1: ( rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6 )
            // InternalAutomatedRestTesting.g:2102:2: rule__RestService__Group_9__5__Impl rule__RestService__Group_9__6
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
    // InternalAutomatedRestTesting.g:2109:1: rule__RestService__Group_9__5__Impl : ( ( rule__RestService__Group_9_5__0 )? ) ;
    public final void rule__RestService__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2113:1: ( ( ( rule__RestService__Group_9_5__0 )? ) )
            // InternalAutomatedRestTesting.g:2114:1: ( ( rule__RestService__Group_9_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:2114:1: ( ( rule__RestService__Group_9_5__0 )? )
            // InternalAutomatedRestTesting.g:2115:2: ( rule__RestService__Group_9_5__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_9_5()); 
            // InternalAutomatedRestTesting.g:2116:2: ( rule__RestService__Group_9_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2116:3: rule__RestService__Group_9_5__0
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
    // InternalAutomatedRestTesting.g:2124:1: rule__RestService__Group_9__6 : rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 ;
    public final void rule__RestService__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2128:1: ( rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7 )
            // InternalAutomatedRestTesting.g:2129:2: rule__RestService__Group_9__6__Impl rule__RestService__Group_9__7
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
    // InternalAutomatedRestTesting.g:2136:1: rule__RestService__Group_9__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2140:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2141:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2141:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2142:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2151:1: rule__RestService__Group_9__7 : rule__RestService__Group_9__7__Impl ;
    public final void rule__RestService__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2155:1: ( rule__RestService__Group_9__7__Impl )
            // InternalAutomatedRestTesting.g:2156:2: rule__RestService__Group_9__7__Impl
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
    // InternalAutomatedRestTesting.g:2162:1: rule__RestService__Group_9__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2166:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2167:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2167:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2168:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2178:1: rule__RestService__Group_9_5__0 : rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 ;
    public final void rule__RestService__Group_9_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2182:1: ( rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1 )
            // InternalAutomatedRestTesting.g:2183:2: rule__RestService__Group_9_5__0__Impl rule__RestService__Group_9_5__1
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
    // InternalAutomatedRestTesting.g:2190:1: rule__RestService__Group_9_5__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_9_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2194:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2195:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2195:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2196:2: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2205:1: rule__RestService__Group_9_5__1 : rule__RestService__Group_9_5__1__Impl ;
    public final void rule__RestService__Group_9_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2209:1: ( rule__RestService__Group_9_5__1__Impl )
            // InternalAutomatedRestTesting.g:2210:2: rule__RestService__Group_9_5__1__Impl
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
    // InternalAutomatedRestTesting.g:2216:1: rule__RestService__Group_9_5__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_9_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2220:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2221:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2221:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2222:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2232:1: rule__RestService__Group_15__0 : rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 ;
    public final void rule__RestService__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2236:1: ( rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1 )
            // InternalAutomatedRestTesting.g:2237:2: rule__RestService__Group_15__0__Impl rule__RestService__Group_15__1
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
    // InternalAutomatedRestTesting.g:2244:1: rule__RestService__Group_15__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2248:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2249:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2249:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2250:2: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2259:1: rule__RestService__Group_15__1 : rule__RestService__Group_15__1__Impl ;
    public final void rule__RestService__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2263:1: ( rule__RestService__Group_15__1__Impl )
            // InternalAutomatedRestTesting.g:2264:2: rule__RestService__Group_15__1__Impl
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
    // InternalAutomatedRestTesting.g:2270:1: rule__RestService__Group_15__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2274:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2275:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2275:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2276:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2286:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2290:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAutomatedRestTesting.g:2291:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalAutomatedRestTesting.g:2298:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2302:1: ( ( 'Test' ) )
            // InternalAutomatedRestTesting.g:2303:1: ( 'Test' )
            {
            // InternalAutomatedRestTesting.g:2303:1: ( 'Test' )
            // InternalAutomatedRestTesting.g:2304:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2313:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2317:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAutomatedRestTesting.g:2318:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalAutomatedRestTesting.g:2325:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2329:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2330:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2330:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2331:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:2332:2: ( rule__Test__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:2332:3: rule__Test__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:2340:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2344:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAutomatedRestTesting.g:2345:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalAutomatedRestTesting.g:2352:1: rule__Test__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2356:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2357:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2357:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2358:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2367:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2371:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAutomatedRestTesting.g:2372:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalAutomatedRestTesting.g:2379:1: rule__Test__Group__3__Impl : ( 'service' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2383:1: ( ( 'service' ) )
            // InternalAutomatedRestTesting.g:2384:1: ( 'service' )
            {
            // InternalAutomatedRestTesting.g:2384:1: ( 'service' )
            // InternalAutomatedRestTesting.g:2385:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_3()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2394:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2398:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAutomatedRestTesting.g:2399:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalAutomatedRestTesting.g:2406:1: rule__Test__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2410:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2411:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2411:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2412:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2421:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2425:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAutomatedRestTesting.g:2426:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalAutomatedRestTesting.g:2433:1: rule__Test__Group__5__Impl : ( ( rule__Test__ServiceAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2437:1: ( ( ( rule__Test__ServiceAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:2438:1: ( ( rule__Test__ServiceAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:2438:1: ( ( rule__Test__ServiceAssignment_5 ) )
            // InternalAutomatedRestTesting.g:2439:2: ( rule__Test__ServiceAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_5()); 
            // InternalAutomatedRestTesting.g:2440:2: ( rule__Test__ServiceAssignment_5 )
            // InternalAutomatedRestTesting.g:2440:3: rule__Test__ServiceAssignment_5
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
    // InternalAutomatedRestTesting.g:2448:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2452:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAutomatedRestTesting.g:2453:2: rule__Test__Group__6__Impl rule__Test__Group__7
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
    // InternalAutomatedRestTesting.g:2460:1: rule__Test__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2464:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2465:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2465:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2466:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2475:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2479:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAutomatedRestTesting.g:2480:2: rule__Test__Group__7__Impl rule__Test__Group__8
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
    // InternalAutomatedRestTesting.g:2487:1: rule__Test__Group__7__Impl : ( ( rule__Test__Group_7__0 )? ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2491:1: ( ( ( rule__Test__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:2492:1: ( ( rule__Test__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:2492:1: ( ( rule__Test__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:2493:2: ( rule__Test__Group_7__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:2494:2: ( rule__Test__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==68) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2494:3: rule__Test__Group_7__0
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
    // InternalAutomatedRestTesting.g:2502:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2506:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAutomatedRestTesting.g:2507:2: rule__Test__Group__8__Impl rule__Test__Group__9
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
    // InternalAutomatedRestTesting.g:2514:1: rule__Test__Group__8__Impl : ( ( rule__Test__Group_8__0 )? ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2518:1: ( ( ( rule__Test__Group_8__0 )? ) )
            // InternalAutomatedRestTesting.g:2519:1: ( ( rule__Test__Group_8__0 )? )
            {
            // InternalAutomatedRestTesting.g:2519:1: ( ( rule__Test__Group_8__0 )? )
            // InternalAutomatedRestTesting.g:2520:2: ( rule__Test__Group_8__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_8()); 
            // InternalAutomatedRestTesting.g:2521:2: ( rule__Test__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==69) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2521:3: rule__Test__Group_8__0
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
    // InternalAutomatedRestTesting.g:2529:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2533:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAutomatedRestTesting.g:2534:2: rule__Test__Group__9__Impl rule__Test__Group__10
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
    // InternalAutomatedRestTesting.g:2541:1: rule__Test__Group__9__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2545:1: ( ( 'Assertions' ) )
            // InternalAutomatedRestTesting.g:2546:1: ( 'Assertions' )
            {
            // InternalAutomatedRestTesting.g:2546:1: ( 'Assertions' )
            // InternalAutomatedRestTesting.g:2547:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_9()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2556:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2560:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAutomatedRestTesting.g:2561:2: rule__Test__Group__10__Impl rule__Test__Group__11
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
    // InternalAutomatedRestTesting.g:2568:1: rule__Test__Group__10__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2572:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2573:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2573:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2574:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2583:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2587:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAutomatedRestTesting.g:2588:2: rule__Test__Group__11__Impl rule__Test__Group__12
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
    // InternalAutomatedRestTesting.g:2595:1: rule__Test__Group__11__Impl : ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2599:1: ( ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) )
            // InternalAutomatedRestTesting.g:2600:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            {
            // InternalAutomatedRestTesting.g:2600:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            // InternalAutomatedRestTesting.g:2601:2: ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* )
            {
            // InternalAutomatedRestTesting.g:2601:2: ( ( rule__Test__Group_11__0 ) )
            // InternalAutomatedRestTesting.g:2602:3: ( rule__Test__Group_11__0 )
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2603:3: ( rule__Test__Group_11__0 )
            // InternalAutomatedRestTesting.g:2603:4: rule__Test__Group_11__0
            {
            pushFollow(FOLLOW_27);
            rule__Test__Group_11__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup_11()); 

            }

            // InternalAutomatedRestTesting.g:2606:2: ( ( rule__Test__Group_11__0 )* )
            // InternalAutomatedRestTesting.g:2607:3: ( rule__Test__Group_11__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2608:3: ( rule__Test__Group_11__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=26 && LA24_0<=27)||(LA24_0>=33 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2608:4: rule__Test__Group_11__0
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
    // InternalAutomatedRestTesting.g:2617:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2621:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalAutomatedRestTesting.g:2622:2: rule__Test__Group__12__Impl rule__Test__Group__13
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
    // InternalAutomatedRestTesting.g:2629:1: rule__Test__Group__12__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2633:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2634:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2634:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2635:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2644:1: rule__Test__Group__13 : rule__Test__Group__13__Impl ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2648:1: ( rule__Test__Group__13__Impl )
            // InternalAutomatedRestTesting.g:2649:2: rule__Test__Group__13__Impl
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
    // InternalAutomatedRestTesting.g:2655:1: rule__Test__Group__13__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2659:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2660:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2660:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2661:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2671:1: rule__Test__Group_7__0 : rule__Test__Group_7__0__Impl rule__Test__Group_7__1 ;
    public final void rule__Test__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2675:1: ( rule__Test__Group_7__0__Impl rule__Test__Group_7__1 )
            // InternalAutomatedRestTesting.g:2676:2: rule__Test__Group_7__0__Impl rule__Test__Group_7__1
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
    // InternalAutomatedRestTesting.g:2683:1: rule__Test__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2687:1: ( ( 'description' ) )
            // InternalAutomatedRestTesting.g:2688:1: ( 'description' )
            {
            // InternalAutomatedRestTesting.g:2688:1: ( 'description' )
            // InternalAutomatedRestTesting.g:2689:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_7_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2698:1: rule__Test__Group_7__1 : rule__Test__Group_7__1__Impl rule__Test__Group_7__2 ;
    public final void rule__Test__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2702:1: ( rule__Test__Group_7__1__Impl rule__Test__Group_7__2 )
            // InternalAutomatedRestTesting.g:2703:2: rule__Test__Group_7__1__Impl rule__Test__Group_7__2
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
    // InternalAutomatedRestTesting.g:2710:1: rule__Test__Group_7__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2714:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2715:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2715:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2716:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2725:1: rule__Test__Group_7__2 : rule__Test__Group_7__2__Impl rule__Test__Group_7__3 ;
    public final void rule__Test__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2729:1: ( rule__Test__Group_7__2__Impl rule__Test__Group_7__3 )
            // InternalAutomatedRestTesting.g:2730:2: rule__Test__Group_7__2__Impl rule__Test__Group_7__3
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
    // InternalAutomatedRestTesting.g:2737:1: rule__Test__Group_7__2__Impl : ( ( rule__Test__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Test__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2741:1: ( ( ( rule__Test__DescriptionAssignment_7_2 ) ) )
            // InternalAutomatedRestTesting.g:2742:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            {
            // InternalAutomatedRestTesting.g:2742:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            // InternalAutomatedRestTesting.g:2743:2: ( rule__Test__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_7_2()); 
            // InternalAutomatedRestTesting.g:2744:2: ( rule__Test__DescriptionAssignment_7_2 )
            // InternalAutomatedRestTesting.g:2744:3: rule__Test__DescriptionAssignment_7_2
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
    // InternalAutomatedRestTesting.g:2752:1: rule__Test__Group_7__3 : rule__Test__Group_7__3__Impl ;
    public final void rule__Test__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2756:1: ( rule__Test__Group_7__3__Impl )
            // InternalAutomatedRestTesting.g:2757:2: rule__Test__Group_7__3__Impl
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
    // InternalAutomatedRestTesting.g:2763:1: rule__Test__Group_7__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2767:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2768:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2768:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2769:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2779:1: rule__Test__Group_8__0 : rule__Test__Group_8__0__Impl rule__Test__Group_8__1 ;
    public final void rule__Test__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2783:1: ( rule__Test__Group_8__0__Impl rule__Test__Group_8__1 )
            // InternalAutomatedRestTesting.g:2784:2: rule__Test__Group_8__0__Impl rule__Test__Group_8__1
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
    // InternalAutomatedRestTesting.g:2791:1: rule__Test__Group_8__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2795:1: ( ( 'Mapping' ) )
            // InternalAutomatedRestTesting.g:2796:1: ( 'Mapping' )
            {
            // InternalAutomatedRestTesting.g:2796:1: ( 'Mapping' )
            // InternalAutomatedRestTesting.g:2797:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_8_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2806:1: rule__Test__Group_8__1 : rule__Test__Group_8__1__Impl rule__Test__Group_8__2 ;
    public final void rule__Test__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2810:1: ( rule__Test__Group_8__1__Impl rule__Test__Group_8__2 )
            // InternalAutomatedRestTesting.g:2811:2: rule__Test__Group_8__1__Impl rule__Test__Group_8__2
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
    // InternalAutomatedRestTesting.g:2818:1: rule__Test__Group_8__1__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Test__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2822:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2823:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2823:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2824:2: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2833:1: rule__Test__Group_8__2 : rule__Test__Group_8__2__Impl rule__Test__Group_8__3 ;
    public final void rule__Test__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2837:1: ( rule__Test__Group_8__2__Impl rule__Test__Group_8__3 )
            // InternalAutomatedRestTesting.g:2838:2: rule__Test__Group_8__2__Impl rule__Test__Group_8__3
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
    // InternalAutomatedRestTesting.g:2845:1: rule__Test__Group_8__2__Impl : ( ( rule__Test__MappingsAssignment_8_2 ) ) ;
    public final void rule__Test__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2849:1: ( ( ( rule__Test__MappingsAssignment_8_2 ) ) )
            // InternalAutomatedRestTesting.g:2850:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            {
            // InternalAutomatedRestTesting.g:2850:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            // InternalAutomatedRestTesting.g:2851:2: ( rule__Test__MappingsAssignment_8_2 )
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_2()); 
            // InternalAutomatedRestTesting.g:2852:2: ( rule__Test__MappingsAssignment_8_2 )
            // InternalAutomatedRestTesting.g:2852:3: rule__Test__MappingsAssignment_8_2
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
    // InternalAutomatedRestTesting.g:2860:1: rule__Test__Group_8__3 : rule__Test__Group_8__3__Impl rule__Test__Group_8__4 ;
    public final void rule__Test__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2864:1: ( rule__Test__Group_8__3__Impl rule__Test__Group_8__4 )
            // InternalAutomatedRestTesting.g:2865:2: rule__Test__Group_8__3__Impl rule__Test__Group_8__4
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
    // InternalAutomatedRestTesting.g:2872:1: rule__Test__Group_8__3__Impl : ( ( rule__Test__MappingsAssignment_8_3 )* ) ;
    public final void rule__Test__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2876:1: ( ( ( rule__Test__MappingsAssignment_8_3 )* ) )
            // InternalAutomatedRestTesting.g:2877:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            {
            // InternalAutomatedRestTesting.g:2877:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            // InternalAutomatedRestTesting.g:2878:2: ( rule__Test__MappingsAssignment_8_3 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_3()); 
            // InternalAutomatedRestTesting.g:2879:2: ( rule__Test__MappingsAssignment_8_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_LEFT_BRACKET) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2879:3: rule__Test__MappingsAssignment_8_3
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
    // InternalAutomatedRestTesting.g:2887:1: rule__Test__Group_8__4 : rule__Test__Group_8__4__Impl ;
    public final void rule__Test__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2891:1: ( rule__Test__Group_8__4__Impl )
            // InternalAutomatedRestTesting.g:2892:2: rule__Test__Group_8__4__Impl
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
    // InternalAutomatedRestTesting.g:2898:1: rule__Test__Group_8__4__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2902:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2903:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2903:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2904:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2914:1: rule__Test__Group_11__0 : rule__Test__Group_11__0__Impl rule__Test__Group_11__1 ;
    public final void rule__Test__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2918:1: ( rule__Test__Group_11__0__Impl rule__Test__Group_11__1 )
            // InternalAutomatedRestTesting.g:2919:2: rule__Test__Group_11__0__Impl rule__Test__Group_11__1
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
    // InternalAutomatedRestTesting.g:2926:1: rule__Test__Group_11__0__Impl : ( ( rule__Test__AssertionsAssignment_11_0 ) ) ;
    public final void rule__Test__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2930:1: ( ( ( rule__Test__AssertionsAssignment_11_0 ) ) )
            // InternalAutomatedRestTesting.g:2931:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            {
            // InternalAutomatedRestTesting.g:2931:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            // InternalAutomatedRestTesting.g:2932:2: ( rule__Test__AssertionsAssignment_11_0 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_11_0()); 
            // InternalAutomatedRestTesting.g:2933:2: ( rule__Test__AssertionsAssignment_11_0 )
            // InternalAutomatedRestTesting.g:2933:3: rule__Test__AssertionsAssignment_11_0
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
    // InternalAutomatedRestTesting.g:2941:1: rule__Test__Group_11__1 : rule__Test__Group_11__1__Impl ;
    public final void rule__Test__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2945:1: ( rule__Test__Group_11__1__Impl )
            // InternalAutomatedRestTesting.g:2946:2: rule__Test__Group_11__1__Impl
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
    // InternalAutomatedRestTesting.g:2952:1: rule__Test__Group_11__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2956:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2957:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2957:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2958:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2968:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2972:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalAutomatedRestTesting.g:2973:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAutomatedRestTesting.g:2980:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Group_0__0 )? ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2984:1: ( ( ( rule__Assertion__Group_0__0 )? ) )
            // InternalAutomatedRestTesting.g:2985:1: ( ( rule__Assertion__Group_0__0 )? )
            {
            // InternalAutomatedRestTesting.g:2985:1: ( ( rule__Assertion__Group_0__0 )? )
            // InternalAutomatedRestTesting.g:2986:2: ( rule__Assertion__Group_0__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0()); 
            // InternalAutomatedRestTesting.g:2987:2: ( rule__Assertion__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=26 && LA26_0<=27)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2987:3: rule__Assertion__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:2995:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2999:1: ( rule__Assertion__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3000:2: rule__Assertion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAutomatedRestTesting.g:3006:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ConditionAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3010:1: ( ( ( rule__Assertion__ConditionAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3011:1: ( ( rule__Assertion__ConditionAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3011:1: ( ( rule__Assertion__ConditionAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3012:2: ( rule__Assertion__ConditionAssignment_1 )
            {
             before(grammarAccess.getAssertionAccess().getConditionAssignment_1()); 
            // InternalAutomatedRestTesting.g:3013:2: ( rule__Assertion__ConditionAssignment_1 )
            // InternalAutomatedRestTesting.g:3013:3: rule__Assertion__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getConditionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assertion__Group_0__0"
    // InternalAutomatedRestTesting.g:3022:1: rule__Assertion__Group_0__0 : rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1 ;
    public final void rule__Assertion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3026:1: ( rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1 )
            // InternalAutomatedRestTesting.g:3027:2: rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__Assertion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0__0"


    // $ANTLR start "rule__Assertion__Group_0__0__Impl"
    // InternalAutomatedRestTesting.g:3034:1: rule__Assertion__Group_0__0__Impl : ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) ) ;
    public final void rule__Assertion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3038:1: ( ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) ) )
            // InternalAutomatedRestTesting.g:3039:1: ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) )
            {
            // InternalAutomatedRestTesting.g:3039:1: ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) )
            // InternalAutomatedRestTesting.g:3040:2: ( rule__Assertion__AssertionTypeAssignment_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getAssertionTypeAssignment_0_0()); 
            // InternalAutomatedRestTesting.g:3041:2: ( rule__Assertion__AssertionTypeAssignment_0_0 )
            // InternalAutomatedRestTesting.g:3041:3: rule__Assertion__AssertionTypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__AssertionTypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getAssertionTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0__1"
    // InternalAutomatedRestTesting.g:3049:1: rule__Assertion__Group_0__1 : rule__Assertion__Group_0__1__Impl ;
    public final void rule__Assertion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3053:1: ( rule__Assertion__Group_0__1__Impl )
            // InternalAutomatedRestTesting.g:3054:2: rule__Assertion__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0__1"


    // $ANTLR start "rule__Assertion__Group_0__1__Impl"
    // InternalAutomatedRestTesting.g:3060:1: rule__Assertion__Group_0__1__Impl : ( ( rule__Assertion__DataToTestAssignment_0_1 ) ) ;
    public final void rule__Assertion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3064:1: ( ( ( rule__Assertion__DataToTestAssignment_0_1 ) ) )
            // InternalAutomatedRestTesting.g:3065:1: ( ( rule__Assertion__DataToTestAssignment_0_1 ) )
            {
            // InternalAutomatedRestTesting.g:3065:1: ( ( rule__Assertion__DataToTestAssignment_0_1 ) )
            // InternalAutomatedRestTesting.g:3066:2: ( rule__Assertion__DataToTestAssignment_0_1 )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestAssignment_0_1()); 
            // InternalAutomatedRestTesting.g:3067:2: ( rule__Assertion__DataToTestAssignment_0_1 )
            // InternalAutomatedRestTesting.g:3067:3: rule__Assertion__DataToTestAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__DataToTestAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getDataToTestAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAutomatedRestTesting.g:3076:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3080:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAutomatedRestTesting.g:3081:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAutomatedRestTesting.g:3088:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3092:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3093:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3093:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3094:2: RULE_ID
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
    // InternalAutomatedRestTesting.g:3103:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3107:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3108:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3114:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3118:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAutomatedRestTesting.g:3119:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAutomatedRestTesting.g:3119:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAutomatedRestTesting.g:3120:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3121:2: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3121:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAutomatedRestTesting.g:3130:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3134:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAutomatedRestTesting.g:3135:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:3142:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3146:1: ( ( RULE_DOT ) )
            // InternalAutomatedRestTesting.g:3147:1: ( RULE_DOT )
            {
            // InternalAutomatedRestTesting.g:3147:1: ( RULE_DOT )
            // InternalAutomatedRestTesting.g:3148:2: RULE_DOT
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
    // InternalAutomatedRestTesting.g:3157:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3161:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3162:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAutomatedRestTesting.g:3168:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3172:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3173:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3173:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3174:2: RULE_ID
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
    // InternalAutomatedRestTesting.g:3184:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3188:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAutomatedRestTesting.g:3189:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAutomatedRestTesting.g:3196:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3200:1: ( ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:3201:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:3201:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            // InternalAutomatedRestTesting.g:3202:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_0()); 
            // InternalAutomatedRestTesting.g:3203:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            // InternalAutomatedRestTesting.g:3203:3: rule__Expression__RelationalOperatorAssignment_0
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
    // InternalAutomatedRestTesting.g:3211:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3215:1: ( rule__Expression__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3216:2: rule__Expression__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3222:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3226:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalAutomatedRestTesting.g:3227:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:3227:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalAutomatedRestTesting.g:3228:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3229:2: ( rule__Expression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==RULE_INT||LA28_0==70) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3229:3: rule__Expression__Group_1__0
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
    // InternalAutomatedRestTesting.g:3238:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3242:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAutomatedRestTesting.g:3243:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAutomatedRestTesting.g:3250:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3254:1: ( ( ( rule__Expression__Group_1_0__0 )? ) )
            // InternalAutomatedRestTesting.g:3255:1: ( ( rule__Expression__Group_1_0__0 )? )
            {
            // InternalAutomatedRestTesting.g:3255:1: ( ( rule__Expression__Group_1_0__0 )? )
            // InternalAutomatedRestTesting.g:3256:2: ( rule__Expression__Group_1_0__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            // InternalAutomatedRestTesting.g:3257:2: ( rule__Expression__Group_1_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3257:3: rule__Expression__Group_1_0__0
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
    // InternalAutomatedRestTesting.g:3265:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3269:1: ( rule__Expression__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3270:2: rule__Expression__Group_1__1__Impl
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
    // InternalAutomatedRestTesting.g:3276:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3280:1: ( ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) )
            // InternalAutomatedRestTesting.g:3281:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            {
            // InternalAutomatedRestTesting.g:3281:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            // InternalAutomatedRestTesting.g:3282:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1_1()); 
            // InternalAutomatedRestTesting.g:3283:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            // InternalAutomatedRestTesting.g:3283:3: rule__Expression__ExpectedValueAssignment_1_1
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
    // InternalAutomatedRestTesting.g:3292:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3296:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // InternalAutomatedRestTesting.g:3297:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAutomatedRestTesting.g:3304:1: rule__Expression__Group_1_0__0__Impl : ( 'parameter' ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3308:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3309:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3309:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3310:2: 'parameter'
            {
             before(grammarAccess.getExpressionAccess().getParameterKeyword_1_0_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3319:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3323:1: ( rule__Expression__Group_1_0__1__Impl )
            // InternalAutomatedRestTesting.g:3324:2: rule__Expression__Group_1_0__1__Impl
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
    // InternalAutomatedRestTesting.g:3330:1: rule__Expression__Group_1_0__1__Impl : ( ( rule__Expression__Alternatives_1_0_1 ) ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3334:1: ( ( ( rule__Expression__Alternatives_1_0_1 ) ) )
            // InternalAutomatedRestTesting.g:3335:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            {
            // InternalAutomatedRestTesting.g:3335:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            // InternalAutomatedRestTesting.g:3336:2: ( rule__Expression__Alternatives_1_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0_1()); 
            // InternalAutomatedRestTesting.g:3337:2: ( rule__Expression__Alternatives_1_0_1 )
            // InternalAutomatedRestTesting.g:3337:3: rule__Expression__Alternatives_1_0_1
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
    // InternalAutomatedRestTesting.g:3346:1: rule__MappingElement__Group__0 : rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 ;
    public final void rule__MappingElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3350:1: ( rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 )
            // InternalAutomatedRestTesting.g:3351:2: rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3358:1: rule__MappingElement__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__MappingElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3362:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3363:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3363:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3364:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3373:1: rule__MappingElement__Group__1 : rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 ;
    public final void rule__MappingElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3377:1: ( rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 )
            // InternalAutomatedRestTesting.g:3378:2: rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2
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
    // InternalAutomatedRestTesting.g:3385:1: rule__MappingElement__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__MappingElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3389:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3390:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3390:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3391:2: 'parameter'
            {
             before(grammarAccess.getMappingElementAccess().getParameterKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3400:1: rule__MappingElement__Group__2 : rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 ;
    public final void rule__MappingElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3404:1: ( rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 )
            // InternalAutomatedRestTesting.g:3405:2: rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:3412:1: rule__MappingElement__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3416:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3417:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3417:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3418:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3427:1: rule__MappingElement__Group__3 : rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 ;
    public final void rule__MappingElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3431:1: ( rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 )
            // InternalAutomatedRestTesting.g:3432:2: rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:3439:1: rule__MappingElement__Group__3__Impl : ( ( rule__MappingElement__ParameterAssignment_3 ) ) ;
    public final void rule__MappingElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3443:1: ( ( ( rule__MappingElement__ParameterAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3444:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3444:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3445:2: ( rule__MappingElement__ParameterAssignment_3 )
            {
             before(grammarAccess.getMappingElementAccess().getParameterAssignment_3()); 
            // InternalAutomatedRestTesting.g:3446:2: ( rule__MappingElement__ParameterAssignment_3 )
            // InternalAutomatedRestTesting.g:3446:3: rule__MappingElement__ParameterAssignment_3
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
    // InternalAutomatedRestTesting.g:3454:1: rule__MappingElement__Group__4 : rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 ;
    public final void rule__MappingElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3458:1: ( rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 )
            // InternalAutomatedRestTesting.g:3459:2: rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalAutomatedRestTesting.g:3466:1: rule__MappingElement__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__MappingElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3470:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:3471:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:3471:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:3472:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:3481:1: rule__MappingElement__Group__5 : rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 ;
    public final void rule__MappingElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3485:1: ( rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 )
            // InternalAutomatedRestTesting.g:3486:2: rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6
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
    // InternalAutomatedRestTesting.g:3493:1: rule__MappingElement__Group__5__Impl : ( 'value' ) ;
    public final void rule__MappingElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3497:1: ( ( 'value' ) )
            // InternalAutomatedRestTesting.g:3498:1: ( 'value' )
            {
            // InternalAutomatedRestTesting.g:3498:1: ( 'value' )
            // InternalAutomatedRestTesting.g:3499:2: 'value'
            {
             before(grammarAccess.getMappingElementAccess().getValueKeyword_5()); 
            match(input,71,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3508:1: rule__MappingElement__Group__6 : rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 ;
    public final void rule__MappingElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3512:1: ( rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 )
            // InternalAutomatedRestTesting.g:3513:2: rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3520:1: rule__MappingElement__Group__6__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3524:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3525:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3525:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3526:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3535:1: rule__MappingElement__Group__7 : rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 ;
    public final void rule__MappingElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3539:1: ( rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 )
            // InternalAutomatedRestTesting.g:3540:2: rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3547:1: rule__MappingElement__Group__7__Impl : ( ( rule__MappingElement__Group_7__0 )? ) ;
    public final void rule__MappingElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3551:1: ( ( ( rule__MappingElement__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:3552:1: ( ( rule__MappingElement__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:3552:1: ( ( rule__MappingElement__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:3553:2: ( rule__MappingElement__Group_7__0 )?
            {
             before(grammarAccess.getMappingElementAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:3554:2: ( rule__MappingElement__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==72) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3554:3: rule__MappingElement__Group_7__0
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
    // InternalAutomatedRestTesting.g:3562:1: rule__MappingElement__Group__8 : rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 ;
    public final void rule__MappingElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3566:1: ( rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 )
            // InternalAutomatedRestTesting.g:3567:2: rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9
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
    // InternalAutomatedRestTesting.g:3574:1: rule__MappingElement__Group__8__Impl : ( ( rule__MappingElement__ValueAssignment_8 ) ) ;
    public final void rule__MappingElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3578:1: ( ( ( rule__MappingElement__ValueAssignment_8 ) ) )
            // InternalAutomatedRestTesting.g:3579:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            {
            // InternalAutomatedRestTesting.g:3579:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            // InternalAutomatedRestTesting.g:3580:2: ( rule__MappingElement__ValueAssignment_8 )
            {
             before(grammarAccess.getMappingElementAccess().getValueAssignment_8()); 
            // InternalAutomatedRestTesting.g:3581:2: ( rule__MappingElement__ValueAssignment_8 )
            // InternalAutomatedRestTesting.g:3581:3: rule__MappingElement__ValueAssignment_8
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
    // InternalAutomatedRestTesting.g:3589:1: rule__MappingElement__Group__9 : rule__MappingElement__Group__9__Impl ;
    public final void rule__MappingElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3593:1: ( rule__MappingElement__Group__9__Impl )
            // InternalAutomatedRestTesting.g:3594:2: rule__MappingElement__Group__9__Impl
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
    // InternalAutomatedRestTesting.g:3600:1: rule__MappingElement__Group__9__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__MappingElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3604:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3605:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3605:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3606:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:3616:1: rule__MappingElement__Group_7__0 : rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 ;
    public final void rule__MappingElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3620:1: ( rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 )
            // InternalAutomatedRestTesting.g:3621:2: rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAutomatedRestTesting.g:3628:1: rule__MappingElement__Group_7__0__Impl : ( 'request' ) ;
    public final void rule__MappingElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3632:1: ( ( 'request' ) )
            // InternalAutomatedRestTesting.g:3633:1: ( 'request' )
            {
            // InternalAutomatedRestTesting.g:3633:1: ( 'request' )
            // InternalAutomatedRestTesting.g:3634:2: 'request'
            {
             before(grammarAccess.getMappingElementAccess().getRequestKeyword_7_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3643:1: rule__MappingElement__Group_7__1 : rule__MappingElement__Group_7__1__Impl ;
    public final void rule__MappingElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3647:1: ( rule__MappingElement__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:3648:2: rule__MappingElement__Group_7__1__Impl
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
    // InternalAutomatedRestTesting.g:3654:1: rule__MappingElement__Group_7__1__Impl : ( RULE_ARROW ) ;
    public final void rule__MappingElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3658:1: ( ( RULE_ARROW ) )
            // InternalAutomatedRestTesting.g:3659:1: ( RULE_ARROW )
            {
            // InternalAutomatedRestTesting.g:3659:1: ( RULE_ARROW )
            // InternalAutomatedRestTesting.g:3660:2: RULE_ARROW
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
    // InternalAutomatedRestTesting.g:3670:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3674:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAutomatedRestTesting.g:3675:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAutomatedRestTesting.g:3682:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3686:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3687:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3687:1: ( () )
            // InternalAutomatedRestTesting.g:3688:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalAutomatedRestTesting.g:3689:2: ()
            // InternalAutomatedRestTesting.g:3689:3: 
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
    // InternalAutomatedRestTesting.g:3697:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3701:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAutomatedRestTesting.g:3702:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalAutomatedRestTesting.g:3709:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParamTypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3713:1: ( ( ( rule__Parameter__ParamTypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3714:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3714:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3715:2: ( rule__Parameter__ParamTypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParamTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:3716:2: ( rule__Parameter__ParamTypeAssignment_1 )
            // InternalAutomatedRestTesting.g:3716:3: rule__Parameter__ParamTypeAssignment_1
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
    // InternalAutomatedRestTesting.g:3724:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3728:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAutomatedRestTesting.g:3729:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:3736:1: rule__Parameter__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3740:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3741:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3741:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3742:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3751:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3755:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAutomatedRestTesting.g:3756:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalAutomatedRestTesting.g:3763:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3767:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3768:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3768:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3769:2: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalAutomatedRestTesting.g:3770:2: ( rule__Parameter__ValueAssignment_3 )
            // InternalAutomatedRestTesting.g:3770:3: rule__Parameter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:3778:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3782:1: ( rule__Parameter__Group__4__Impl )
            // InternalAutomatedRestTesting.g:3783:2: rule__Parameter__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:3789:1: rule__Parameter__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3793:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3794:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3794:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3795:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:3805:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3809:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAutomatedRestTesting.g:3810:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAutomatedRestTesting.g:3817:1: rule__Restriction__Group__0__Impl : ( () ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3821:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3822:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3822:1: ( () )
            // InternalAutomatedRestTesting.g:3823:2: ()
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 
            // InternalAutomatedRestTesting.g:3824:2: ()
            // InternalAutomatedRestTesting.g:3824:3: 
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
    // InternalAutomatedRestTesting.g:3832:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3836:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // InternalAutomatedRestTesting.g:3837:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
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
    // InternalAutomatedRestTesting.g:3844:1: rule__Restriction__Group__1__Impl : ( 'mockType' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3848:1: ( ( 'mockType' ) )
            // InternalAutomatedRestTesting.g:3849:1: ( 'mockType' )
            {
            // InternalAutomatedRestTesting.g:3849:1: ( 'mockType' )
            // InternalAutomatedRestTesting.g:3850:2: 'mockType'
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3859:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3863:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // InternalAutomatedRestTesting.g:3864:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalAutomatedRestTesting.g:3871:1: rule__Restriction__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3875:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3876:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3876:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3877:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3886:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3890:1: ( rule__Restriction__Group__3__Impl )
            // InternalAutomatedRestTesting.g:3891:2: rule__Restriction__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:3897:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__MockTypeAssignment_3 ) ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3901:1: ( ( ( rule__Restriction__MockTypeAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3902:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3902:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3903:2: ( rule__Restriction__MockTypeAssignment_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 
            // InternalAutomatedRestTesting.g:3904:2: ( rule__Restriction__MockTypeAssignment_3 )
            // InternalAutomatedRestTesting.g:3904:3: rule__Restriction__MockTypeAssignment_3
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
    // InternalAutomatedRestTesting.g:3913:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3917:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAutomatedRestTesting.g:3918:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAutomatedRestTesting.g:3925:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3929:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3930:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3930:1: ( () )
            // InternalAutomatedRestTesting.g:3931:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalAutomatedRestTesting.g:3932:2: ()
            // InternalAutomatedRestTesting.g:3932:3: 
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
    // InternalAutomatedRestTesting.g:3940:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3944:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAutomatedRestTesting.g:3945:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalAutomatedRestTesting.g:3952:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3956:1: ( ( 'Entity' ) )
            // InternalAutomatedRestTesting.g:3957:1: ( 'Entity' )
            {
            // InternalAutomatedRestTesting.g:3957:1: ( 'Entity' )
            // InternalAutomatedRestTesting.g:3958:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3967:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3971:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAutomatedRestTesting.g:3972:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalAutomatedRestTesting.g:3979:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3983:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:3984:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:3984:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:3985:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:3986:2: ( rule__Entity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:3986:3: rule__Entity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:3994:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3998:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAutomatedRestTesting.g:3999:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalAutomatedRestTesting.g:4006:1: rule__Entity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4010:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4011:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4011:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4012:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4021:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4025:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAutomatedRestTesting.g:4026:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalAutomatedRestTesting.g:4033:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4037:1: ( ( ( rule__Entity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4038:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4038:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4039:2: ( rule__Entity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4040:2: ( rule__Entity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4040:3: rule__Entity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4048:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4052:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAutomatedRestTesting.g:4053:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalAutomatedRestTesting.g:4060:1: rule__Entity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4064:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4065:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4065:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4066:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4075:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4079:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAutomatedRestTesting.g:4080:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalAutomatedRestTesting.g:4087:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4091:1: ( ( ( rule__Entity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4092:1: ( ( rule__Entity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4092:1: ( ( rule__Entity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4093:2: ( rule__Entity__Group_6__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4094:2: ( rule__Entity__Group_6__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=28 && LA31_0<=32)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4094:3: rule__Entity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Entity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAutomatedRestTesting.g:4102:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4106:1: ( rule__Entity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4107:2: rule__Entity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4113:1: rule__Entity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4117:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4118:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4118:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4119:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4129:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4133:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4134:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4141:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4145:1: ( ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4146:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4146:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4147:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4148:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4148:3: rule__Entity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4156:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4160:1: ( rule__Entity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4161:2: rule__Entity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4167:1: rule__Entity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4171:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4172:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4172:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4173:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4183:1: rule__Attribute_Impl__Group__0 : rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 ;
    public final void rule__Attribute_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4187:1: ( rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 )
            // InternalAutomatedRestTesting.g:4188:2: rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAutomatedRestTesting.g:4195:1: rule__Attribute_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Attribute_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4199:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4200:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4200:1: ( () )
            // InternalAutomatedRestTesting.g:4201:2: ()
            {
             before(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4202:2: ()
            // InternalAutomatedRestTesting.g:4202:3: 
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
    // InternalAutomatedRestTesting.g:4210:1: rule__Attribute_Impl__Group__1 : rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 ;
    public final void rule__Attribute_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4214:1: ( rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 )
            // InternalAutomatedRestTesting.g:4215:2: rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4222:1: rule__Attribute_Impl__Group__1__Impl : ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) ;
    public final void rule__Attribute_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4226:1: ( ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4227:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4227:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4228:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4229:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4229:3: rule__Attribute_Impl__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4237:1: rule__Attribute_Impl__Group__2 : rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 ;
    public final void rule__Attribute_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4241:1: ( rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 )
            // InternalAutomatedRestTesting.g:4242:2: rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4249:1: rule__Attribute_Impl__Group__2__Impl : ( ( rule__Attribute_Impl__Group_2__0 )? ) ;
    public final void rule__Attribute_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4253:1: ( ( ( rule__Attribute_Impl__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4254:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4254:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4255:2: ( rule__Attribute_Impl__Group_2__0 )?
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4256:2: ( rule__Attribute_Impl__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4256:3: rule__Attribute_Impl__Group_2__0
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
    // InternalAutomatedRestTesting.g:4264:1: rule__Attribute_Impl__Group__3 : rule__Attribute_Impl__Group__3__Impl ;
    public final void rule__Attribute_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4268:1: ( rule__Attribute_Impl__Group__3__Impl )
            // InternalAutomatedRestTesting.g:4269:2: rule__Attribute_Impl__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:4275:1: rule__Attribute_Impl__Group__3__Impl : ( ( rule__Attribute_Impl__NameAssignment_3 ) ) ;
    public final void rule__Attribute_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4279:1: ( ( ( rule__Attribute_Impl__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4280:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4280:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4281:2: ( rule__Attribute_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4282:2: ( rule__Attribute_Impl__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4282:3: rule__Attribute_Impl__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4291:1: rule__Attribute_Impl__Group_2__0 : rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 ;
    public final void rule__Attribute_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4295:1: ( rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 )
            // InternalAutomatedRestTesting.g:4296:2: rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1
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
    // InternalAutomatedRestTesting.g:4303:1: rule__Attribute_Impl__Group_2__0__Impl : ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) ;
    public final void rule__Attribute_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4307:1: ( ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4308:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4308:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4309:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4310:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4310:3: rule__Attribute_Impl__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4318:1: rule__Attribute_Impl__Group_2__1 : rule__Attribute_Impl__Group_2__1__Impl ;
    public final void rule__Attribute_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4322:1: ( rule__Attribute_Impl__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4323:2: rule__Attribute_Impl__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4329:1: rule__Attribute_Impl__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Attribute_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4333:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4334:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4334:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4335:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4345:1: rule__DomainAttribute__Group__0 : rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 ;
    public final void rule__DomainAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4349:1: ( rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 )
            // InternalAutomatedRestTesting.g:4350:2: rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAutomatedRestTesting.g:4357:1: rule__DomainAttribute__Group__0__Impl : ( () ) ;
    public final void rule__DomainAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4361:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4362:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4362:1: ( () )
            // InternalAutomatedRestTesting.g:4363:2: ()
            {
             before(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4364:2: ()
            // InternalAutomatedRestTesting.g:4364:3: 
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
    // InternalAutomatedRestTesting.g:4372:1: rule__DomainAttribute__Group__1 : rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 ;
    public final void rule__DomainAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4376:1: ( rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 )
            // InternalAutomatedRestTesting.g:4377:2: rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4384:1: rule__DomainAttribute__Group__1__Impl : ( ( rule__DomainAttribute__TypeAssignment_1 ) ) ;
    public final void rule__DomainAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4388:1: ( ( ( rule__DomainAttribute__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4389:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4389:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4390:2: ( rule__DomainAttribute__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4391:2: ( rule__DomainAttribute__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4391:3: rule__DomainAttribute__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4399:1: rule__DomainAttribute__Group__2 : rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 ;
    public final void rule__DomainAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4403:1: ( rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 )
            // InternalAutomatedRestTesting.g:4404:2: rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalAutomatedRestTesting.g:4411:1: rule__DomainAttribute__Group__2__Impl : ( ( rule__DomainAttribute__Group_2__0 )? ) ;
    public final void rule__DomainAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4415:1: ( ( ( rule__DomainAttribute__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4416:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4416:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4417:2: ( rule__DomainAttribute__Group_2__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4418:2: ( rule__DomainAttribute__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4418:3: rule__DomainAttribute__Group_2__0
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
    // InternalAutomatedRestTesting.g:4426:1: rule__DomainAttribute__Group__3 : rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 ;
    public final void rule__DomainAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4430:1: ( rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 )
            // InternalAutomatedRestTesting.g:4431:2: rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalAutomatedRestTesting.g:4438:1: rule__DomainAttribute__Group__3__Impl : ( ( rule__DomainAttribute__NameAssignment_3 ) ) ;
    public final void rule__DomainAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4442:1: ( ( ( rule__DomainAttribute__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4443:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4443:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4444:2: ( rule__DomainAttribute__NameAssignment_3 )
            {
             before(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4445:2: ( rule__DomainAttribute__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4445:3: rule__DomainAttribute__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4453:1: rule__DomainAttribute__Group__4 : rule__DomainAttribute__Group__4__Impl ;
    public final void rule__DomainAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4457:1: ( rule__DomainAttribute__Group__4__Impl )
            // InternalAutomatedRestTesting.g:4458:2: rule__DomainAttribute__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:4464:1: rule__DomainAttribute__Group__4__Impl : ( ( rule__DomainAttribute__Group_4__0 )? ) ;
    public final void rule__DomainAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4468:1: ( ( ( rule__DomainAttribute__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:4469:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:4469:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:4470:2: ( rule__DomainAttribute__Group_4__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:4471:2: ( rule__DomainAttribute__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_LEFT_PARENTHESIS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4471:3: rule__DomainAttribute__Group_4__0
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
    // InternalAutomatedRestTesting.g:4480:1: rule__DomainAttribute__Group_2__0 : rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 ;
    public final void rule__DomainAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4484:1: ( rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 )
            // InternalAutomatedRestTesting.g:4485:2: rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1
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
    // InternalAutomatedRestTesting.g:4492:1: rule__DomainAttribute__Group_2__0__Impl : ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) ;
    public final void rule__DomainAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4496:1: ( ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4497:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4497:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4498:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4499:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4499:3: rule__DomainAttribute__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4507:1: rule__DomainAttribute__Group_2__1 : rule__DomainAttribute__Group_2__1__Impl ;
    public final void rule__DomainAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4511:1: ( rule__DomainAttribute__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4512:2: rule__DomainAttribute__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4518:1: rule__DomainAttribute__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__DomainAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4522:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4523:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4523:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4524:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4534:1: rule__DomainAttribute__Group_4__0 : rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 ;
    public final void rule__DomainAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4538:1: ( rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 )
            // InternalAutomatedRestTesting.g:4539:2: rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4546:1: rule__DomainAttribute__Group_4__0__Impl : ( RULE_LEFT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4550:1: ( ( RULE_LEFT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4551:1: ( RULE_LEFT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4551:1: ( RULE_LEFT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4552:2: RULE_LEFT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4561:1: rule__DomainAttribute__Group_4__1 : rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 ;
    public final void rule__DomainAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4565:1: ( rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 )
            // InternalAutomatedRestTesting.g:4566:2: rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalAutomatedRestTesting.g:4573:1: rule__DomainAttribute__Group_4__1__Impl : ( ( rule__DomainAttribute__Group_4_1__0 )? ) ;
    public final void rule__DomainAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4577:1: ( ( ( rule__DomainAttribute__Group_4_1__0 )? ) )
            // InternalAutomatedRestTesting.g:4578:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:4578:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            // InternalAutomatedRestTesting.g:4579:2: ( rule__DomainAttribute__Group_4_1__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 
            // InternalAutomatedRestTesting.g:4580:2: ( rule__DomainAttribute__Group_4_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==76) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4580:3: rule__DomainAttribute__Group_4_1__0
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
    // InternalAutomatedRestTesting.g:4588:1: rule__DomainAttribute__Group_4__2 : rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 ;
    public final void rule__DomainAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4592:1: ( rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 )
            // InternalAutomatedRestTesting.g:4593:2: rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalAutomatedRestTesting.g:4600:1: rule__DomainAttribute__Group_4__2__Impl : ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) ;
    public final void rule__DomainAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4604:1: ( ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) )
            // InternalAutomatedRestTesting.g:4605:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            {
            // InternalAutomatedRestTesting.g:4605:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            // InternalAutomatedRestTesting.g:4606:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 
            // InternalAutomatedRestTesting.g:4607:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            // InternalAutomatedRestTesting.g:4607:3: rule__DomainAttribute__RestrictionsAssignment_4_2
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
    // InternalAutomatedRestTesting.g:4615:1: rule__DomainAttribute__Group_4__3 : rule__DomainAttribute__Group_4__3__Impl ;
    public final void rule__DomainAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4619:1: ( rule__DomainAttribute__Group_4__3__Impl )
            // InternalAutomatedRestTesting.g:4620:2: rule__DomainAttribute__Group_4__3__Impl
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
    // InternalAutomatedRestTesting.g:4626:1: rule__DomainAttribute__Group_4__3__Impl : ( RULE_RIGHT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4630:1: ( ( RULE_RIGHT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4631:1: ( RULE_RIGHT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4631:1: ( RULE_RIGHT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4632:2: RULE_RIGHT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4642:1: rule__DomainAttribute__Group_4_1__0 : rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 ;
    public final void rule__DomainAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4646:1: ( rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 )
            // InternalAutomatedRestTesting.g:4647:2: rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:4654:1: rule__DomainAttribute__Group_4_1__0__Impl : ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) ;
    public final void rule__DomainAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4658:1: ( ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) )
            // InternalAutomatedRestTesting.g:4659:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            {
            // InternalAutomatedRestTesting.g:4659:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            // InternalAutomatedRestTesting.g:4660:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 
            // InternalAutomatedRestTesting.g:4661:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            // InternalAutomatedRestTesting.g:4661:3: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0
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
    // InternalAutomatedRestTesting.g:4669:1: rule__DomainAttribute__Group_4_1__1 : rule__DomainAttribute__Group_4_1__1__Impl ;
    public final void rule__DomainAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4673:1: ( rule__DomainAttribute__Group_4_1__1__Impl )
            // InternalAutomatedRestTesting.g:4674:2: rule__DomainAttribute__Group_4_1__1__Impl
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
    // InternalAutomatedRestTesting.g:4680:1: rule__DomainAttribute__Group_4_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__DomainAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4684:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:4685:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:4685:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:4686:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:4696:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4700:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalAutomatedRestTesting.g:4701:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalAutomatedRestTesting.g:4708:1: rule__SimpleEntity__Group__0__Impl : ( () ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4712:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4713:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4713:1: ( () )
            // InternalAutomatedRestTesting.g:4714:2: ()
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 
            // InternalAutomatedRestTesting.g:4715:2: ()
            // InternalAutomatedRestTesting.g:4715:3: 
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
    // InternalAutomatedRestTesting.g:4723:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4727:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalAutomatedRestTesting.g:4728:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalAutomatedRestTesting.g:4735:1: rule__SimpleEntity__Group__1__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4739:1: ( ( 'SimpleEntity' ) )
            // InternalAutomatedRestTesting.g:4740:1: ( 'SimpleEntity' )
            {
            // InternalAutomatedRestTesting.g:4740:1: ( 'SimpleEntity' )
            // InternalAutomatedRestTesting.g:4741:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:4750:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4754:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalAutomatedRestTesting.g:4755:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalAutomatedRestTesting.g:4762:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4766:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:4767:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:4767:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:4768:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:4769:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:4769:3: rule__SimpleEntity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:4777:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4781:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalAutomatedRestTesting.g:4782:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalAutomatedRestTesting.g:4789:1: rule__SimpleEntity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4793:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4794:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4794:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4795:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4804:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4808:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalAutomatedRestTesting.g:4809:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
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
    // InternalAutomatedRestTesting.g:4816:1: rule__SimpleEntity__Group__4__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4820:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4821:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4821:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4822:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4823:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4823:3: rule__SimpleEntity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4831:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4835:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalAutomatedRestTesting.g:4836:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalAutomatedRestTesting.g:4843:1: rule__SimpleEntity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4847:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4848:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4848:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4849:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4858:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4862:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalAutomatedRestTesting.g:4863:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalAutomatedRestTesting.g:4870:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__Group_6__0 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4874:1: ( ( ( rule__SimpleEntity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4875:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4875:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4876:2: ( rule__SimpleEntity__Group_6__0 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4877:2: ( rule__SimpleEntity__Group_6__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=28 && LA36_0<=32)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4877:3: rule__SimpleEntity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__SimpleEntity__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAutomatedRestTesting.g:4885:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4889:1: ( rule__SimpleEntity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4890:2: rule__SimpleEntity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4896:1: rule__SimpleEntity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4900:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4901:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4901:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4902:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4912:1: rule__SimpleEntity__Group_6__0 : rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 ;
    public final void rule__SimpleEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4916:1: ( rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4917:2: rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4924:1: rule__SimpleEntity__Group_6__0__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__SimpleEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4928:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4929:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4929:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4930:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4931:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4931:3: rule__SimpleEntity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4939:1: rule__SimpleEntity__Group_6__1 : rule__SimpleEntity__Group_6__1__Impl ;
    public final void rule__SimpleEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4943:1: ( rule__SimpleEntity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4944:2: rule__SimpleEntity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4950:1: rule__SimpleEntity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4954:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4955:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4955:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4956:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4966:1: rule__AutomatedRestTesting__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AutomatedRestTesting__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4970:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:4971:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:4971:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:4972:3: ruleEString
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
    // InternalAutomatedRestTesting.g:4981:1: rule__AutomatedRestTesting__DataElementsAssignment_5_0 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4985:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:4986:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:4986:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:4987:3: ruleElement
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
    // InternalAutomatedRestTesting.g:4996:1: rule__AutomatedRestTesting__DataElementsAssignment_5_1 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5000:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:5001:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:5001:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:5002:3: ruleElement
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
    // InternalAutomatedRestTesting.g:5011:1: rule__AutomatedRestTesting__ServicesAssignment_6_0 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5015:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5016:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5016:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5017:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5026:1: rule__AutomatedRestTesting__ServicesAssignment_6_1 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5030:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5031:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5031:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5032:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5041:1: rule__AutomatedRestTesting__TestsAssignment_7_0 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5045:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5046:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5046:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5047:3: ruleTest
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
    // InternalAutomatedRestTesting.g:5056:1: rule__AutomatedRestTesting__TestsAssignment_7_1 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5060:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5061:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5061:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5062:3: ruleTest
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
    // InternalAutomatedRestTesting.g:5071:1: rule__RestService__MethodAssignment_0 : ( ruleMethodType ) ;
    public final void rule__RestService__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5075:1: ( ( ruleMethodType ) )
            // InternalAutomatedRestTesting.g:5076:2: ( ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:5076:2: ( ruleMethodType )
            // InternalAutomatedRestTesting.g:5077:3: ruleMethodType
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
    // InternalAutomatedRestTesting.g:5086:1: rule__RestService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RestService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5090:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5091:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5091:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5092:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5101:1: rule__RestService__UriAssignment_5 : ( RULE_SLASH ) ;
    public final void rule__RestService__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5105:1: ( ( RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:5106:2: ( RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:5106:2: ( RULE_SLASH )
            // InternalAutomatedRestTesting.g:5107:3: RULE_SLASH
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
    // InternalAutomatedRestTesting.g:5116:1: rule__RestService__ParametersAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__RestService__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5120:1: ( ( ruleParameter ) )
            // InternalAutomatedRestTesting.g:5121:2: ( ruleParameter )
            {
            // InternalAutomatedRestTesting.g:5121:2: ( ruleParameter )
            // InternalAutomatedRestTesting.g:5122:3: ruleParameter
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
    // InternalAutomatedRestTesting.g:5131:1: rule__RestService__RequestAssignment_9_4 : ( ( ruleEString ) ) ;
    public final void rule__RestService__RequestAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5135:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5136:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5136:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5137:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0()); 
            // InternalAutomatedRestTesting.g:5138:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5139:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5150:1: rule__RestService__ResponseAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__RestService__ResponseAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5154:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5155:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5155:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5156:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0()); 
            // InternalAutomatedRestTesting.g:5157:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5158:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5169:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5173:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5174:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5174:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5175:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5184:1: rule__Test__ServiceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Test__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5188:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5189:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5189:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5190:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0()); 
            // InternalAutomatedRestTesting.g:5191:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5192:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5203:1: rule__Test__DescriptionAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Test__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5207:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5208:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5208:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5209:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5218:1: rule__Test__MappingsAssignment_8_2 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5222:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5223:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5223:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5224:3: ruleMappingElement
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
    // InternalAutomatedRestTesting.g:5233:1: rule__Test__MappingsAssignment_8_3 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5237:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5238:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5238:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5239:3: ruleMappingElement
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
    // InternalAutomatedRestTesting.g:5248:1: rule__Test__AssertionsAssignment_11_0 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5252:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:5253:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:5253:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:5254:3: ruleAssertion
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


    // $ANTLR start "rule__Assertion__AssertionTypeAssignment_0_0"
    // InternalAutomatedRestTesting.g:5263:1: rule__Assertion__AssertionTypeAssignment_0_0 : ( ruleAssertionType ) ;
    public final void rule__Assertion__AssertionTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5267:1: ( ( ruleAssertionType ) )
            // InternalAutomatedRestTesting.g:5268:2: ( ruleAssertionType )
            {
            // InternalAutomatedRestTesting.g:5268:2: ( ruleAssertionType )
            // InternalAutomatedRestTesting.g:5269:3: ruleAssertionType
            {
             before(grammarAccess.getAssertionAccess().getAssertionTypeAssertionTypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionType();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getAssertionTypeAssertionTypeEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__AssertionTypeAssignment_0_0"


    // $ANTLR start "rule__Assertion__DataToTestAssignment_0_1"
    // InternalAutomatedRestTesting.g:5278:1: rule__Assertion__DataToTestAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__DataToTestAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5282:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5283:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5283:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5284:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_0_1_0()); 
            // InternalAutomatedRestTesting.g:5285:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5286:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementQualifiedNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getDataToTestElementQualifiedNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__DataToTestAssignment_0_1"


    // $ANTLR start "rule__Assertion__ConditionAssignment_1"
    // InternalAutomatedRestTesting.g:5297:1: rule__Assertion__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assertion__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5301:1: ( ( ruleExpression ) )
            // InternalAutomatedRestTesting.g:5302:2: ( ruleExpression )
            {
            // InternalAutomatedRestTesting.g:5302:2: ( ruleExpression )
            // InternalAutomatedRestTesting.g:5303:3: ruleExpression
            {
             before(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ConditionAssignment_1"


    // $ANTLR start "rule__Expression__RelationalOperatorAssignment_0"
    // InternalAutomatedRestTesting.g:5312:1: rule__Expression__RelationalOperatorAssignment_0 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5316:1: ( ( ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:5317:2: ( ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:5317:2: ( ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:5318:3: ruleRelationalOperator
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
    // InternalAutomatedRestTesting.g:5327:1: rule__Expression__ExpectedValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Expression__ExpectedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5331:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5332:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5332:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5333:3: ruleLiteral
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
    // InternalAutomatedRestTesting.g:5342:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5346:1: ( ( RULE_INT ) )
            // InternalAutomatedRestTesting.g:5347:2: ( RULE_INT )
            {
            // InternalAutomatedRestTesting.g:5347:2: ( RULE_INT )
            // InternalAutomatedRestTesting.g:5348:3: RULE_INT
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
    // InternalAutomatedRestTesting.g:5357:1: rule__StringLiteral__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5361:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5362:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5362:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5363:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5372:1: rule__ElementLiteral__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5376:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5377:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5377:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5378:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementLiteralAccess().getValueElementCrossReference_0()); 
            // InternalAutomatedRestTesting.g:5379:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5380:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:5391:1: rule__MappingElement__ParameterAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingElement__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5395:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5396:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5396:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5397:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingElementAccess().getParameterElementCrossReference_3_0()); 
            // InternalAutomatedRestTesting.g:5398:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5399:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:5410:1: rule__MappingElement__ValueAssignment_8 : ( ruleLiteral ) ;
    public final void rule__MappingElement__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5414:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5415:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5415:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5416:3: ruleLiteral
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
    // InternalAutomatedRestTesting.g:5425:1: rule__Parameter__ParamTypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__Parameter__ParamTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5429:1: ( ( ruleParameterType ) )
            // InternalAutomatedRestTesting.g:5430:2: ( ruleParameterType )
            {
            // InternalAutomatedRestTesting.g:5430:2: ( ruleParameterType )
            // InternalAutomatedRestTesting.g:5431:3: ruleParameterType
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


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // InternalAutomatedRestTesting.g:5440:1: rule__Parameter__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5444:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:5445:2: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:5445:2: ( RULE_ID )
            // InternalAutomatedRestTesting.g:5446:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_3"


    // $ANTLR start "rule__Restriction__MockTypeAssignment_3"
    // InternalAutomatedRestTesting.g:5455:1: rule__Restriction__MockTypeAssignment_3 : ( ruleMockTypes ) ;
    public final void rule__Restriction__MockTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5459:1: ( ( ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:5460:2: ( ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:5460:2: ( ruleMockTypes )
            // InternalAutomatedRestTesting.g:5461:3: ruleMockTypes
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
    // InternalAutomatedRestTesting.g:5470:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5474:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5475:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5475:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5476:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5485:1: rule__Entity__EntityAttributesAssignment_4 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5489:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5490:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5490:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5491:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5500:1: rule__Entity__EntityAttributesAssignment_6_0 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5504:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5505:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5505:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5506:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5515:1: rule__Attribute_Impl__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute_Impl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5519:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5520:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5520:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5521:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5530:1: rule__Attribute_Impl__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Attribute_Impl__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5534:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5535:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5535:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5536:3: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:5545:1: rule__Attribute_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5549:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5550:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5550:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5551:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5560:1: rule__DomainAttribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__DomainAttribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5564:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5565:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5565:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5566:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5575:1: rule__DomainAttribute__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__DomainAttribute__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5579:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5580:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5580:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5581:3: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:5590:1: rule__DomainAttribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DomainAttribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5594:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5595:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5595:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5596:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5605:1: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 : ( ( 'PK' ) ) ;
    public final void rule__DomainAttribute__PrimaryKeyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5609:1: ( ( ( 'PK' ) ) )
            // InternalAutomatedRestTesting.g:5610:2: ( ( 'PK' ) )
            {
            // InternalAutomatedRestTesting.g:5610:2: ( ( 'PK' ) )
            // InternalAutomatedRestTesting.g:5611:3: ( 'PK' )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            // InternalAutomatedRestTesting.g:5612:3: ( 'PK' )
            // InternalAutomatedRestTesting.g:5613:4: 'PK'
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:5624:1: rule__DomainAttribute__RestrictionsAssignment_4_2 : ( ruleRestriction ) ;
    public final void rule__DomainAttribute__RestrictionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5628:1: ( ( ruleRestriction ) )
            // InternalAutomatedRestTesting.g:5629:2: ( ruleRestriction )
            {
            // InternalAutomatedRestTesting.g:5629:2: ( ruleRestriction )
            // InternalAutomatedRestTesting.g:5630:3: ruleRestriction
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
    // InternalAutomatedRestTesting.g:5639:1: rule__SimpleEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5643:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5644:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5644:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5645:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5654:1: rule__SimpleEntity__EntityAttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5658:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5659:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5659:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5660:3: ruleAttribute
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
    // InternalAutomatedRestTesting.g:5669:1: rule__SimpleEntity__EntityAttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5673:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5674:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5674:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5675:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00001E0000000000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000600000001200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001FE0C000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001FE0C000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040030L,0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040030L,0x0000000000000140L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000600000001000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0FFF800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000001F0000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000020000L});

}