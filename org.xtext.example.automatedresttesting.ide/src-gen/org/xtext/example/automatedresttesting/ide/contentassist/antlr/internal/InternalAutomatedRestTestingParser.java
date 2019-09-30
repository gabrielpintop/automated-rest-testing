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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOT", "RULE_ARROW", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_SQUARE_LEFT_BRACKET", "RULE_SQUARE_RIGHT_BRACKET", "RULE_COMMA", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/'", "'&'", "'?'", "'response->'", "'response.'", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "':'", "'$'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'University'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'", "'apiURL'", "'URL'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'Assertions'", "'description'", "'Mapping'", "'parameter'", "'value'", "'request'", "'mockType'", "'Entity'", "'SimpleEntity'", "'PK'"
    };
    public static final int RULE_SQUARE_LEFT_BRACKET=12;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=7;
    public static final int RULE_LEFT_PARENTHESIS=15;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=8;
    public static final int RULE_COMMA=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
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
    public static final int RULE_SL_COMMENT=19;
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
    public static final int RULE_SQUARE_RIGHT_BRACKET=13;
    public static final int T__32=32;
    public static final int RULE_RIGHT_PARENTHESIS=16;
    public static final int RULE_WS=20;
    public static final int RULE_LEFT_BRACKET=10;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleURL"
    // InternalAutomatedRestTesting.g:178:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:179:1: ( ruleURL EOF )
            // InternalAutomatedRestTesting.g:180:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getURLRule()); 
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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalAutomatedRestTesting.g:187:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:191:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__URL__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:192:2: ( ( rule__URL__Group__0 ) )
            // InternalAutomatedRestTesting.g:193:3: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:194:3: ( rule__URL__Group__0 )
            // InternalAutomatedRestTesting.g:194:4: rule__URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURLExpression"
    // InternalAutomatedRestTesting.g:203:1: entryRuleURLExpression : ruleURLExpression EOF ;
    public final void entryRuleURLExpression() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:204:1: ( ruleURLExpression EOF )
            // InternalAutomatedRestTesting.g:205:1: ruleURLExpression EOF
            {
             before(grammarAccess.getURLExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleURLExpression();

            state._fsp--;

             after(grammarAccess.getURLExpressionRule()); 
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
    // $ANTLR end "entryRuleURLExpression"


    // $ANTLR start "ruleURLExpression"
    // InternalAutomatedRestTesting.g:212:1: ruleURLExpression : ( ( rule__URLExpression__Alternatives ) ) ;
    public final void ruleURLExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:216:2: ( ( ( rule__URLExpression__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:217:2: ( ( rule__URLExpression__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:217:2: ( ( rule__URLExpression__Alternatives ) )
            // InternalAutomatedRestTesting.g:218:3: ( rule__URLExpression__Alternatives )
            {
             before(grammarAccess.getURLExpressionAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:219:3: ( rule__URLExpression__Alternatives )
            // InternalAutomatedRestTesting.g:219:4: rule__URLExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__URLExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getURLExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURLExpression"


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:229:1: ( ruleParameter EOF )
            // InternalAutomatedRestTesting.g:230:1: ruleParameter EOF
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
    // InternalAutomatedRestTesting.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:242:2: ( ( rule__Parameter__Group__0 ) )
            // InternalAutomatedRestTesting.g:243:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:244:3: ( rule__Parameter__Group__0 )
            // InternalAutomatedRestTesting.g:244:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleSeparator"
    // InternalAutomatedRestTesting.g:253:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:254:1: ( ruleSeparator EOF )
            // InternalAutomatedRestTesting.g:255:1: ruleSeparator EOF
            {
             before(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getSeparatorRule()); 
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
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalAutomatedRestTesting.g:262:1: ruleSeparator : ( ( rule__Separator__Group__0 ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:266:2: ( ( ( rule__Separator__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Separator__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:267:2: ( ( rule__Separator__Group__0 ) )
            // InternalAutomatedRestTesting.g:268:3: ( rule__Separator__Group__0 )
            {
             before(grammarAccess.getSeparatorAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:269:3: ( rule__Separator__Group__0 )
            // InternalAutomatedRestTesting.g:269:4: rule__Separator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleURLText"
    // InternalAutomatedRestTesting.g:278:1: entryRuleURLText : ruleURLText EOF ;
    public final void entryRuleURLText() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:279:1: ( ruleURLText EOF )
            // InternalAutomatedRestTesting.g:280:1: ruleURLText EOF
            {
             before(grammarAccess.getURLTextRule()); 
            pushFollow(FOLLOW_1);
            ruleURLText();

            state._fsp--;

             after(grammarAccess.getURLTextRule()); 
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
    // $ANTLR end "entryRuleURLText"


    // $ANTLR start "ruleURLText"
    // InternalAutomatedRestTesting.g:287:1: ruleURLText : ( ( rule__URLText__TextAssignment ) ) ;
    public final void ruleURLText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:291:2: ( ( ( rule__URLText__TextAssignment ) ) )
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__URLText__TextAssignment ) )
            {
            // InternalAutomatedRestTesting.g:292:2: ( ( rule__URLText__TextAssignment ) )
            // InternalAutomatedRestTesting.g:293:3: ( rule__URLText__TextAssignment )
            {
             before(grammarAccess.getURLTextAccess().getTextAssignment()); 
            // InternalAutomatedRestTesting.g:294:3: ( rule__URLText__TextAssignment )
            // InternalAutomatedRestTesting.g:294:4: rule__URLText__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URLText__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURLTextAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURLText"


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:303:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:304:1: ( ruleTest EOF )
            // InternalAutomatedRestTesting.g:305:1: ruleTest EOF
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
    // InternalAutomatedRestTesting.g:312:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:316:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:317:2: ( ( rule__Test__Group__0 ) )
            // InternalAutomatedRestTesting.g:318:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:319:3: ( rule__Test__Group__0 )
            // InternalAutomatedRestTesting.g:319:4: rule__Test__Group__0
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
    // InternalAutomatedRestTesting.g:328:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:329:1: ( ruleAssertion EOF )
            // InternalAutomatedRestTesting.g:330:1: ruleAssertion EOF
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
    // InternalAutomatedRestTesting.g:337:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:341:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:342:2: ( ( rule__Assertion__Group__0 ) )
            // InternalAutomatedRestTesting.g:343:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:344:3: ( rule__Assertion__Group__0 )
            // InternalAutomatedRestTesting.g:344:4: rule__Assertion__Group__0
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
    // InternalAutomatedRestTesting.g:353:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:354:1: ( ruleQualifiedName EOF )
            // InternalAutomatedRestTesting.g:355:1: ruleQualifiedName EOF
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
    // InternalAutomatedRestTesting.g:362:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:366:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:367:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAutomatedRestTesting.g:368:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:369:3: ( rule__QualifiedName__Group__0 )
            // InternalAutomatedRestTesting.g:369:4: rule__QualifiedName__Group__0
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
    // InternalAutomatedRestTesting.g:378:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:379:1: ( ruleExpression EOF )
            // InternalAutomatedRestTesting.g:380:1: ruleExpression EOF
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
    // InternalAutomatedRestTesting.g:387:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:391:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:392:2: ( ( rule__Expression__Group__0 ) )
            // InternalAutomatedRestTesting.g:393:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:394:3: ( rule__Expression__Group__0 )
            // InternalAutomatedRestTesting.g:394:4: rule__Expression__Group__0
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
    // InternalAutomatedRestTesting.g:403:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:404:1: ( ruleLiteral EOF )
            // InternalAutomatedRestTesting.g:405:1: ruleLiteral EOF
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
    // InternalAutomatedRestTesting.g:412:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:416:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:417:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:417:2: ( ( rule__Literal__Alternatives ) )
            // InternalAutomatedRestTesting.g:418:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:419:3: ( rule__Literal__Alternatives )
            // InternalAutomatedRestTesting.g:419:4: rule__Literal__Alternatives
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
    // InternalAutomatedRestTesting.g:428:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:429:1: ( ruleIntegerLiteral EOF )
            // InternalAutomatedRestTesting.g:430:1: ruleIntegerLiteral EOF
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
    // InternalAutomatedRestTesting.g:437:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:441:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:442:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:442:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:443:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:444:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:444:4: rule__IntegerLiteral__ValueAssignment
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
    // InternalAutomatedRestTesting.g:453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:454:1: ( ruleStringLiteral EOF )
            // InternalAutomatedRestTesting.g:455:1: ruleStringLiteral EOF
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
    // InternalAutomatedRestTesting.g:462:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:466:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:467:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:467:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:468:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:469:3: ( rule__StringLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:469:4: rule__StringLiteral__ValueAssignment
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
    // InternalAutomatedRestTesting.g:478:1: entryRuleElementLiteral : ruleElementLiteral EOF ;
    public final void entryRuleElementLiteral() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:479:1: ( ruleElementLiteral EOF )
            // InternalAutomatedRestTesting.g:480:1: ruleElementLiteral EOF
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
    // InternalAutomatedRestTesting.g:487:1: ruleElementLiteral : ( ( rule__ElementLiteral__ValueAssignment ) ) ;
    public final void ruleElementLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:491:2: ( ( ( rule__ElementLiteral__ValueAssignment ) ) )
            // InternalAutomatedRestTesting.g:492:2: ( ( rule__ElementLiteral__ValueAssignment ) )
            {
            // InternalAutomatedRestTesting.g:492:2: ( ( rule__ElementLiteral__ValueAssignment ) )
            // InternalAutomatedRestTesting.g:493:3: ( rule__ElementLiteral__ValueAssignment )
            {
             before(grammarAccess.getElementLiteralAccess().getValueAssignment()); 
            // InternalAutomatedRestTesting.g:494:3: ( rule__ElementLiteral__ValueAssignment )
            // InternalAutomatedRestTesting.g:494:4: rule__ElementLiteral__ValueAssignment
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
    // InternalAutomatedRestTesting.g:503:1: entryRuleMappingElement : ruleMappingElement EOF ;
    public final void entryRuleMappingElement() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:504:1: ( ruleMappingElement EOF )
            // InternalAutomatedRestTesting.g:505:1: ruleMappingElement EOF
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
    // InternalAutomatedRestTesting.g:512:1: ruleMappingElement : ( ( rule__MappingElement__Group__0 ) ) ;
    public final void ruleMappingElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:516:2: ( ( ( rule__MappingElement__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:517:2: ( ( rule__MappingElement__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:517:2: ( ( rule__MappingElement__Group__0 ) )
            // InternalAutomatedRestTesting.g:518:3: ( rule__MappingElement__Group__0 )
            {
             before(grammarAccess.getMappingElementAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:519:3: ( rule__MappingElement__Group__0 )
            // InternalAutomatedRestTesting.g:519:4: rule__MappingElement__Group__0
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


    // $ANTLR start "entryRuleRestriction"
    // InternalAutomatedRestTesting.g:528:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:529:1: ( ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:530:1: ruleRestriction EOF
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
    // InternalAutomatedRestTesting.g:537:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:541:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:542:2: ( ( rule__Restriction__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:542:2: ( ( rule__Restriction__Group__0 ) )
            // InternalAutomatedRestTesting.g:543:3: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:544:3: ( rule__Restriction__Group__0 )
            // InternalAutomatedRestTesting.g:544:4: rule__Restriction__Group__0
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
    // InternalAutomatedRestTesting.g:553:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:554:1: ( ruleEntity EOF )
            // InternalAutomatedRestTesting.g:555:1: ruleEntity EOF
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
    // InternalAutomatedRestTesting.g:562:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:566:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:567:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:567:2: ( ( rule__Entity__Group__0 ) )
            // InternalAutomatedRestTesting.g:568:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:569:3: ( rule__Entity__Group__0 )
            // InternalAutomatedRestTesting.g:569:4: rule__Entity__Group__0
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
    // InternalAutomatedRestTesting.g:578:1: entryRuleAttribute_Impl : ruleAttribute_Impl EOF ;
    public final void entryRuleAttribute_Impl() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:579:1: ( ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:580:1: ruleAttribute_Impl EOF
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
    // InternalAutomatedRestTesting.g:587:1: ruleAttribute_Impl : ( ( rule__Attribute_Impl__Group__0 ) ) ;
    public final void ruleAttribute_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:591:2: ( ( ( rule__Attribute_Impl__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:592:2: ( ( rule__Attribute_Impl__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:592:2: ( ( rule__Attribute_Impl__Group__0 ) )
            // InternalAutomatedRestTesting.g:593:3: ( rule__Attribute_Impl__Group__0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:594:3: ( rule__Attribute_Impl__Group__0 )
            // InternalAutomatedRestTesting.g:594:4: rule__Attribute_Impl__Group__0
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
    // InternalAutomatedRestTesting.g:603:1: entryRuleDomainAttribute : ruleDomainAttribute EOF ;
    public final void entryRuleDomainAttribute() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:604:1: ( ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:605:1: ruleDomainAttribute EOF
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
    // InternalAutomatedRestTesting.g:612:1: ruleDomainAttribute : ( ( rule__DomainAttribute__Group__0 ) ) ;
    public final void ruleDomainAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:616:2: ( ( ( rule__DomainAttribute__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:617:2: ( ( rule__DomainAttribute__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:617:2: ( ( rule__DomainAttribute__Group__0 ) )
            // InternalAutomatedRestTesting.g:618:3: ( rule__DomainAttribute__Group__0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:619:3: ( rule__DomainAttribute__Group__0 )
            // InternalAutomatedRestTesting.g:619:4: rule__DomainAttribute__Group__0
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
    // InternalAutomatedRestTesting.g:628:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalAutomatedRestTesting.g:629:1: ( ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:630:1: ruleSimpleEntity EOF
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
    // InternalAutomatedRestTesting.g:637:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:641:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalAutomatedRestTesting.g:642:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalAutomatedRestTesting.g:642:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalAutomatedRestTesting.g:643:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalAutomatedRestTesting.g:644:3: ( rule__SimpleEntity__Group__0 )
            // InternalAutomatedRestTesting.g:644:4: rule__SimpleEntity__Group__0
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


    // $ANTLR start "ruleSeparatorType"
    // InternalAutomatedRestTesting.g:653:1: ruleSeparatorType : ( ( rule__SeparatorType__Alternatives ) ) ;
    public final void ruleSeparatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:657:1: ( ( ( rule__SeparatorType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:658:2: ( ( rule__SeparatorType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:658:2: ( ( rule__SeparatorType__Alternatives ) )
            // InternalAutomatedRestTesting.g:659:3: ( rule__SeparatorType__Alternatives )
            {
             before(grammarAccess.getSeparatorTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:660:3: ( rule__SeparatorType__Alternatives )
            // InternalAutomatedRestTesting.g:660:4: rule__SeparatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeparatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparatorType"


    // $ANTLR start "ruleAssertionType"
    // InternalAutomatedRestTesting.g:669:1: ruleAssertionType : ( ( rule__AssertionType__Alternatives ) ) ;
    public final void ruleAssertionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:673:1: ( ( ( rule__AssertionType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:674:2: ( ( rule__AssertionType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:674:2: ( ( rule__AssertionType__Alternatives ) )
            // InternalAutomatedRestTesting.g:675:3: ( rule__AssertionType__Alternatives )
            {
             before(grammarAccess.getAssertionTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:676:3: ( rule__AssertionType__Alternatives )
            // InternalAutomatedRestTesting.g:676:4: rule__AssertionType__Alternatives
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
    // InternalAutomatedRestTesting.g:685:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:689:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:690:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:690:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalAutomatedRestTesting.g:691:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:692:3: ( rule__AttributeType__Alternatives )
            // InternalAutomatedRestTesting.g:692:4: rule__AttributeType__Alternatives
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
    // InternalAutomatedRestTesting.g:701:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:705:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:706:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:706:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalAutomatedRestTesting.g:707:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:708:3: ( rule__RelationalOperator__Alternatives )
            // InternalAutomatedRestTesting.g:708:4: rule__RelationalOperator__Alternatives
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
    // InternalAutomatedRestTesting.g:717:1: ruleMethodType : ( ( rule__MethodType__Alternatives ) ) ;
    public final void ruleMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:721:1: ( ( ( rule__MethodType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:722:2: ( ( rule__MethodType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:722:2: ( ( rule__MethodType__Alternatives ) )
            // InternalAutomatedRestTesting.g:723:3: ( rule__MethodType__Alternatives )
            {
             before(grammarAccess.getMethodTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:724:3: ( rule__MethodType__Alternatives )
            // InternalAutomatedRestTesting.g:724:4: rule__MethodType__Alternatives
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
    // InternalAutomatedRestTesting.g:733:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:737:1: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:738:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:738:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalAutomatedRestTesting.g:739:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:740:3: ( rule__ParameterType__Alternatives )
            // InternalAutomatedRestTesting.g:740:4: rule__ParameterType__Alternatives
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
    // InternalAutomatedRestTesting.g:749:1: ruleMockTypes : ( ( rule__MockTypes__Alternatives ) ) ;
    public final void ruleMockTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:753:1: ( ( ( rule__MockTypes__Alternatives ) ) )
            // InternalAutomatedRestTesting.g:754:2: ( ( rule__MockTypes__Alternatives ) )
            {
            // InternalAutomatedRestTesting.g:754:2: ( ( rule__MockTypes__Alternatives ) )
            // InternalAutomatedRestTesting.g:755:3: ( rule__MockTypes__Alternatives )
            {
             before(grammarAccess.getMockTypesAccess().getAlternatives()); 
            // InternalAutomatedRestTesting.g:756:3: ( rule__MockTypes__Alternatives )
            // InternalAutomatedRestTesting.g:756:4: rule__MockTypes__Alternatives
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
    // InternalAutomatedRestTesting.g:764:1: rule__Element__Alternatives : ( ( ruleEntity ) | ( ruleSimpleEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:768:1: ( ( ruleEntity ) | ( ruleSimpleEntity ) )
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
                    // InternalAutomatedRestTesting.g:769:2: ( ruleEntity )
                    {
                    // InternalAutomatedRestTesting.g:769:2: ( ruleEntity )
                    // InternalAutomatedRestTesting.g:770:3: ruleEntity
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
                    // InternalAutomatedRestTesting.g:775:2: ( ruleSimpleEntity )
                    {
                    // InternalAutomatedRestTesting.g:775:2: ( ruleSimpleEntity )
                    // InternalAutomatedRestTesting.g:776:3: ruleSimpleEntity
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
    // InternalAutomatedRestTesting.g:785:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:789:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAutomatedRestTesting.g:790:2: ( RULE_STRING )
                    {
                    // InternalAutomatedRestTesting.g:790:2: ( RULE_STRING )
                    // InternalAutomatedRestTesting.g:791:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:796:2: ( RULE_ID )
                    {
                    // InternalAutomatedRestTesting.g:796:2: ( RULE_ID )
                    // InternalAutomatedRestTesting.g:797:3: RULE_ID
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


    // $ANTLR start "rule__URLExpression__Alternatives"
    // InternalAutomatedRestTesting.g:806:1: rule__URLExpression__Alternatives : ( ( ruleParameter ) | ( ruleSeparator ) | ( ruleURLText ) );
    public final void rule__URLExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:810:1: ( ( ruleParameter ) | ( ruleSeparator ) | ( ruleURLText ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
                {
                alt3=1;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAutomatedRestTesting.g:811:2: ( ruleParameter )
                    {
                    // InternalAutomatedRestTesting.g:811:2: ( ruleParameter )
                    // InternalAutomatedRestTesting.g:812:3: ruleParameter
                    {
                     before(grammarAccess.getURLExpressionAccess().getParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getURLExpressionAccess().getParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:817:2: ( ruleSeparator )
                    {
                    // InternalAutomatedRestTesting.g:817:2: ( ruleSeparator )
                    // InternalAutomatedRestTesting.g:818:3: ruleSeparator
                    {
                     before(grammarAccess.getURLExpressionAccess().getSeparatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSeparator();

                    state._fsp--;

                     after(grammarAccess.getURLExpressionAccess().getSeparatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:823:2: ( ruleURLText )
                    {
                    // InternalAutomatedRestTesting.g:823:2: ( ruleURLText )
                    // InternalAutomatedRestTesting.g:824:3: ruleURLText
                    {
                     before(grammarAccess.getURLExpressionAccess().getURLTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleURLText();

                    state._fsp--;

                     after(grammarAccess.getURLExpressionAccess().getURLTextParserRuleCall_2()); 

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
    // $ANTLR end "rule__URLExpression__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_1_0_1"
    // InternalAutomatedRestTesting.g:833:1: rule__Expression__Alternatives_1_0_1 : ( ( RULE_DOT ) | ( RULE_ARROW ) );
    public final void rule__Expression__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:837:1: ( ( RULE_DOT ) | ( RULE_ARROW ) )
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
                    // InternalAutomatedRestTesting.g:838:2: ( RULE_DOT )
                    {
                    // InternalAutomatedRestTesting.g:838:2: ( RULE_DOT )
                    // InternalAutomatedRestTesting.g:839:3: RULE_DOT
                    {
                     before(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 
                    match(input,RULE_DOT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:844:2: ( RULE_ARROW )
                    {
                    // InternalAutomatedRestTesting.g:844:2: ( RULE_ARROW )
                    // InternalAutomatedRestTesting.g:845:3: RULE_ARROW
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
    // InternalAutomatedRestTesting.g:854:1: rule__Literal__Alternatives : ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:858:1: ( ( ruleElementLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) )
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
                    // InternalAutomatedRestTesting.g:859:2: ( ruleElementLiteral )
                    {
                    // InternalAutomatedRestTesting.g:859:2: ( ruleElementLiteral )
                    // InternalAutomatedRestTesting.g:860:3: ruleElementLiteral
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
                    // InternalAutomatedRestTesting.g:865:2: ( ruleStringLiteral )
                    {
                    // InternalAutomatedRestTesting.g:865:2: ( ruleStringLiteral )
                    // InternalAutomatedRestTesting.g:866:3: ruleStringLiteral
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
                    // InternalAutomatedRestTesting.g:871:2: ( ruleIntegerLiteral )
                    {
                    // InternalAutomatedRestTesting.g:871:2: ( ruleIntegerLiteral )
                    // InternalAutomatedRestTesting.g:872:3: ruleIntegerLiteral
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


    // $ANTLR start "rule__SeparatorType__Alternatives"
    // InternalAutomatedRestTesting.g:881:1: rule__SeparatorType__Alternatives : ( ( ( '/' ) ) | ( ( '&' ) ) | ( ( '?' ) ) );
    public final void rule__SeparatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:885:1: ( ( ( '/' ) ) | ( ( '&' ) ) | ( ( '?' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
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
                    // InternalAutomatedRestTesting.g:886:2: ( ( '/' ) )
                    {
                    // InternalAutomatedRestTesting.g:886:2: ( ( '/' ) )
                    // InternalAutomatedRestTesting.g:887:3: ( '/' )
                    {
                     before(grammarAccess.getSeparatorTypeAccess().getSlashEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:888:3: ( '/' )
                    // InternalAutomatedRestTesting.g:888:4: '/'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeparatorTypeAccess().getSlashEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:892:2: ( ( '&' ) )
                    {
                    // InternalAutomatedRestTesting.g:892:2: ( ( '&' ) )
                    // InternalAutomatedRestTesting.g:893:3: ( '&' )
                    {
                     before(grammarAccess.getSeparatorTypeAccess().getEtEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:894:3: ( '&' )
                    // InternalAutomatedRestTesting.g:894:4: '&'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeparatorTypeAccess().getEtEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:898:2: ( ( '?' ) )
                    {
                    // InternalAutomatedRestTesting.g:898:2: ( ( '?' ) )
                    // InternalAutomatedRestTesting.g:899:3: ( '?' )
                    {
                     before(grammarAccess.getSeparatorTypeAccess().getQuestionMarkEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:900:3: ( '?' )
                    // InternalAutomatedRestTesting.g:900:4: '?'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeparatorTypeAccess().getQuestionMarkEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SeparatorType__Alternatives"


    // $ANTLR start "rule__AssertionType__Alternatives"
    // InternalAutomatedRestTesting.g:908:1: rule__AssertionType__Alternatives : ( ( ( 'response->' ) ) | ( ( 'response.' ) ) );
    public final void rule__AssertionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:912:1: ( ( ( 'response->' ) ) | ( ( 'response.' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAutomatedRestTesting.g:913:2: ( ( 'response->' ) )
                    {
                    // InternalAutomatedRestTesting.g:913:2: ( ( 'response->' ) )
                    // InternalAutomatedRestTesting.g:914:3: ( 'response->' )
                    {
                     before(grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:915:3: ( 'response->' )
                    // InternalAutomatedRestTesting.g:915:4: 'response->'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:919:2: ( ( 'response.' ) )
                    {
                    // InternalAutomatedRestTesting.g:919:2: ( ( 'response.' ) )
                    // InternalAutomatedRestTesting.g:920:3: ( 'response.' )
                    {
                     before(grammarAccess.getAssertionTypeAccess().getInformationEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:921:3: ( 'response.' )
                    // InternalAutomatedRestTesting.g:921:4: 'response.'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:929:1: rule__AttributeType__Alternatives : ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:933:1: ( ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAutomatedRestTesting.g:934:2: ( ( 'string' ) )
                    {
                    // InternalAutomatedRestTesting.g:934:2: ( ( 'string' ) )
                    // InternalAutomatedRestTesting.g:935:3: ( 'string' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:936:3: ( 'string' )
                    // InternalAutomatedRestTesting.g:936:4: 'string'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:940:2: ( ( 'boolean' ) )
                    {
                    // InternalAutomatedRestTesting.g:940:2: ( ( 'boolean' ) )
                    // InternalAutomatedRestTesting.g:941:3: ( 'boolean' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:942:3: ( 'boolean' )
                    // InternalAutomatedRestTesting.g:942:4: 'boolean'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:946:2: ( ( 'integer' ) )
                    {
                    // InternalAutomatedRestTesting.g:946:2: ( ( 'integer' ) )
                    // InternalAutomatedRestTesting.g:947:3: ( 'integer' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:948:3: ( 'integer' )
                    // InternalAutomatedRestTesting.g:948:4: 'integer'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:952:2: ( ( 'double' ) )
                    {
                    // InternalAutomatedRestTesting.g:952:2: ( ( 'double' ) )
                    // InternalAutomatedRestTesting.g:953:3: ( 'double' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:954:3: ( 'double' )
                    // InternalAutomatedRestTesting.g:954:4: 'double'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:958:2: ( ( 'date' ) )
                    {
                    // InternalAutomatedRestTesting.g:958:2: ( ( 'date' ) )
                    // InternalAutomatedRestTesting.g:959:3: ( 'date' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:960:3: ( 'date' )
                    // InternalAutomatedRestTesting.g:960:4: 'date'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:968:1: rule__RelationalOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:972:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            case 38:
                {
                alt9=7;
                }
                break;
            case 39:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAutomatedRestTesting.g:973:2: ( ( '<' ) )
                    {
                    // InternalAutomatedRestTesting.g:973:2: ( ( '<' ) )
                    // InternalAutomatedRestTesting.g:974:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:975:3: ( '<' )
                    // InternalAutomatedRestTesting.g:975:4: '<'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:979:2: ( ( '<=' ) )
                    {
                    // InternalAutomatedRestTesting.g:979:2: ( ( '<=' ) )
                    // InternalAutomatedRestTesting.g:980:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:981:3: ( '<=' )
                    // InternalAutomatedRestTesting.g:981:4: '<='
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:985:2: ( ( '==' ) )
                    {
                    // InternalAutomatedRestTesting.g:985:2: ( ( '==' ) )
                    // InternalAutomatedRestTesting.g:986:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:987:3: ( '==' )
                    // InternalAutomatedRestTesting.g:987:4: '=='
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:991:2: ( ( '!=' ) )
                    {
                    // InternalAutomatedRestTesting.g:991:2: ( ( '!=' ) )
                    // InternalAutomatedRestTesting.g:992:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:993:3: ( '!=' )
                    // InternalAutomatedRestTesting.g:993:4: '!='
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:997:2: ( ( '>=' ) )
                    {
                    // InternalAutomatedRestTesting.g:997:2: ( ( '>=' ) )
                    // InternalAutomatedRestTesting.g:998:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:999:3: ( '>=' )
                    // InternalAutomatedRestTesting.g:999:4: '>='
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:1003:2: ( ( '>' ) )
                    {
                    // InternalAutomatedRestTesting.g:1003:2: ( ( '>' ) )
                    // InternalAutomatedRestTesting.g:1004:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:1005:3: ( '>' )
                    // InternalAutomatedRestTesting.g:1005:4: '>'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:1009:2: ( ( '&&' ) )
                    {
                    // InternalAutomatedRestTesting.g:1009:2: ( ( '&&' ) )
                    // InternalAutomatedRestTesting.g:1010:3: ( '&&' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:1011:3: ( '&&' )
                    // InternalAutomatedRestTesting.g:1011:4: '&&'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:1015:2: ( ( '||' ) )
                    {
                    // InternalAutomatedRestTesting.g:1015:2: ( ( '||' ) )
                    // InternalAutomatedRestTesting.g:1016:3: ( '||' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:1017:3: ( '||' )
                    // InternalAutomatedRestTesting.g:1017:4: '||'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1025:1: rule__MethodType__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__MethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1029:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1030:2: ( ( 'GET' ) )
                    {
                    // InternalAutomatedRestTesting.g:1030:2: ( ( 'GET' ) )
                    // InternalAutomatedRestTesting.g:1031:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:1032:3: ( 'GET' )
                    // InternalAutomatedRestTesting.g:1032:4: 'GET'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1036:2: ( ( 'POST' ) )
                    {
                    // InternalAutomatedRestTesting.g:1036:2: ( ( 'POST' ) )
                    // InternalAutomatedRestTesting.g:1037:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:1038:3: ( 'POST' )
                    // InternalAutomatedRestTesting.g:1038:4: 'POST'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1042:2: ( ( 'PUT' ) )
                    {
                    // InternalAutomatedRestTesting.g:1042:2: ( ( 'PUT' ) )
                    // InternalAutomatedRestTesting.g:1043:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:1044:3: ( 'PUT' )
                    // InternalAutomatedRestTesting.g:1044:4: 'PUT'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1048:2: ( ( 'DELETE' ) )
                    {
                    // InternalAutomatedRestTesting.g:1048:2: ( ( 'DELETE' ) )
                    // InternalAutomatedRestTesting.g:1049:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:1050:3: ( 'DELETE' )
                    // InternalAutomatedRestTesting.g:1050:4: 'DELETE'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1058:1: rule__ParameterType__Alternatives : ( ( ( ':' ) ) | ( ( '$' ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1062:1: ( ( ( ':' ) ) | ( ( '$' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1063:2: ( ( ':' ) )
                    {
                    // InternalAutomatedRestTesting.g:1063:2: ( ( ':' ) )
                    // InternalAutomatedRestTesting.g:1064:3: ( ':' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:1065:3: ( ':' )
                    // InternalAutomatedRestTesting.g:1065:4: ':'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1069:2: ( ( '$' ) )
                    {
                    // InternalAutomatedRestTesting.g:1069:2: ( ( '$' ) )
                    // InternalAutomatedRestTesting.g:1070:3: ( '$' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:1071:3: ( '$' )
                    // InternalAutomatedRestTesting.g:1071:4: '$'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1079:1: rule__MockTypes__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'University' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) );
    public final void rule__MockTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1083:1: ( ( ( 'FirstNameType' ) ) | ( ( 'FirstNameMaleType' ) ) | ( ( 'FirstNameFemaleType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'University' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'CityType' ) ) | ( ( 'RowNumberType' ) ) )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 48:
                {
                alt12=3;
                }
                break;
            case 49:
                {
                alt12=4;
                }
                break;
            case 50:
                {
                alt12=5;
                }
                break;
            case 51:
                {
                alt12=6;
                }
                break;
            case 52:
                {
                alt12=7;
                }
                break;
            case 53:
                {
                alt12=8;
                }
                break;
            case 54:
                {
                alt12=9;
                }
                break;
            case 55:
                {
                alt12=10;
                }
                break;
            case 56:
                {
                alt12=11;
                }
                break;
            case 57:
                {
                alt12=12;
                }
                break;
            case 58:
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1084:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1084:2: ( ( 'FirstNameType' ) )
                    // InternalAutomatedRestTesting.g:1085:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalAutomatedRestTesting.g:1086:3: ( 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:1086:4: 'FirstNameType'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1090:2: ( ( 'FirstNameMaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1090:2: ( ( 'FirstNameMaleType' ) )
                    // InternalAutomatedRestTesting.g:1091:3: ( 'FirstNameMaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 
                    // InternalAutomatedRestTesting.g:1092:3: ( 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:1092:4: 'FirstNameMaleType'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1096:2: ( ( 'FirstNameFemaleType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1096:2: ( ( 'FirstNameFemaleType' ) )
                    // InternalAutomatedRestTesting.g:1097:3: ( 'FirstNameFemaleType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 
                    // InternalAutomatedRestTesting.g:1098:3: ( 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:1098:4: 'FirstNameFemaleType'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1102:2: ( ( 'LastNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1102:2: ( ( 'LastNameType' ) )
                    // InternalAutomatedRestTesting.g:1103:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 
                    // InternalAutomatedRestTesting.g:1104:3: ( 'LastNameType' )
                    // InternalAutomatedRestTesting.g:1104:4: 'LastNameType'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1108:2: ( ( 'University' ) )
                    {
                    // InternalAutomatedRestTesting.g:1108:2: ( ( 'University' ) )
                    // InternalAutomatedRestTesting.g:1109:3: ( 'University' )
                    {
                     before(grammarAccess.getMockTypesAccess().getUniversityTypeEnumLiteralDeclaration_4()); 
                    // InternalAutomatedRestTesting.g:1110:3: ( 'University' )
                    // InternalAutomatedRestTesting.g:1110:4: 'University'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getUniversityTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:1114:2: ( ( 'FullNameType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1114:2: ( ( 'FullNameType' ) )
                    // InternalAutomatedRestTesting.g:1115:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 
                    // InternalAutomatedRestTesting.g:1116:3: ( 'FullNameType' )
                    // InternalAutomatedRestTesting.g:1116:4: 'FullNameType'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:1120:2: ( ( 'GenderType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1120:2: ( ( 'GenderType' ) )
                    // InternalAutomatedRestTesting.g:1121:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 
                    // InternalAutomatedRestTesting.g:1122:3: ( 'GenderType' )
                    // InternalAutomatedRestTesting.g:1122:4: 'GenderType'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:1126:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1126:2: ( ( 'EmailAddressType' ) )
                    // InternalAutomatedRestTesting.g:1127:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 
                    // InternalAutomatedRestTesting.g:1128:3: ( 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:1128:4: 'EmailAddressType'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:1132:2: ( ( 'PhoneType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1132:2: ( ( 'PhoneType' ) )
                    // InternalAutomatedRestTesting.g:1133:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 
                    // InternalAutomatedRestTesting.g:1134:3: ( 'PhoneType' )
                    // InternalAutomatedRestTesting.g:1134:4: 'PhoneType'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:1138:2: ( ( 'CountryType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1138:2: ( ( 'CountryType' ) )
                    // InternalAutomatedRestTesting.g:1139:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 
                    // InternalAutomatedRestTesting.g:1140:3: ( 'CountryType' )
                    // InternalAutomatedRestTesting.g:1140:4: 'CountryType'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:1144:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1144:2: ( ( 'CountryCodeType' ) )
                    // InternalAutomatedRestTesting.g:1145:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 
                    // InternalAutomatedRestTesting.g:1146:3: ( 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:1146:4: 'CountryCodeType'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:1150:2: ( ( 'CityType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1150:2: ( ( 'CityType' ) )
                    // InternalAutomatedRestTesting.g:1151:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 
                    // InternalAutomatedRestTesting.g:1152:3: ( 'CityType' )
                    // InternalAutomatedRestTesting.g:1152:4: 'CityType'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:1156:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalAutomatedRestTesting.g:1156:2: ( ( 'RowNumberType' ) )
                    // InternalAutomatedRestTesting.g:1157:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalAutomatedRestTesting.g:1158:3: ( 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:1158:4: 'RowNumberType'
                    {
                    match(input,58,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1166:1: rule__AutomatedRestTesting__Group__0 : rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 ;
    public final void rule__AutomatedRestTesting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1170:1: ( rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1 )
            // InternalAutomatedRestTesting.g:1171:2: rule__AutomatedRestTesting__Group__0__Impl rule__AutomatedRestTesting__Group__1
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
    // InternalAutomatedRestTesting.g:1178:1: rule__AutomatedRestTesting__Group__0__Impl : ( () ) ;
    public final void rule__AutomatedRestTesting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1182:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:1183:1: ( () )
            {
            // InternalAutomatedRestTesting.g:1183:1: ( () )
            // InternalAutomatedRestTesting.g:1184:2: ()
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0()); 
            // InternalAutomatedRestTesting.g:1185:2: ()
            // InternalAutomatedRestTesting.g:1185:3: 
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
    // InternalAutomatedRestTesting.g:1193:1: rule__AutomatedRestTesting__Group__1 : rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 ;
    public final void rule__AutomatedRestTesting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1197:1: ( rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2 )
            // InternalAutomatedRestTesting.g:1198:2: rule__AutomatedRestTesting__Group__1__Impl rule__AutomatedRestTesting__Group__2
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
    // InternalAutomatedRestTesting.g:1205:1: rule__AutomatedRestTesting__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__AutomatedRestTesting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1209:1: ( ( 'apiURL' ) )
            // InternalAutomatedRestTesting.g:1210:1: ( 'apiURL' )
            {
            // InternalAutomatedRestTesting.g:1210:1: ( 'apiURL' )
            // InternalAutomatedRestTesting.g:1211:2: 'apiURL'
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1220:1: rule__AutomatedRestTesting__Group__2 : rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 ;
    public final void rule__AutomatedRestTesting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1224:1: ( rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3 )
            // InternalAutomatedRestTesting.g:1225:2: rule__AutomatedRestTesting__Group__2__Impl rule__AutomatedRestTesting__Group__3
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
    // InternalAutomatedRestTesting.g:1232:1: rule__AutomatedRestTesting__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__AutomatedRestTesting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1236:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1237:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1237:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1238:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1247:1: rule__AutomatedRestTesting__Group__3 : rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 ;
    public final void rule__AutomatedRestTesting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1251:1: ( rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4 )
            // InternalAutomatedRestTesting.g:1252:2: rule__AutomatedRestTesting__Group__3__Impl rule__AutomatedRestTesting__Group__4
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
    // InternalAutomatedRestTesting.g:1259:1: rule__AutomatedRestTesting__Group__3__Impl : ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) ;
    public final void rule__AutomatedRestTesting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1263:1: ( ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:1264:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:1264:1: ( ( rule__AutomatedRestTesting__UrlAssignment_3 ) )
            // InternalAutomatedRestTesting.g:1265:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getUrlAssignment_3()); 
            // InternalAutomatedRestTesting.g:1266:2: ( rule__AutomatedRestTesting__UrlAssignment_3 )
            // InternalAutomatedRestTesting.g:1266:3: rule__AutomatedRestTesting__UrlAssignment_3
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
    // InternalAutomatedRestTesting.g:1274:1: rule__AutomatedRestTesting__Group__4 : rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 ;
    public final void rule__AutomatedRestTesting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1278:1: ( rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5 )
            // InternalAutomatedRestTesting.g:1279:2: rule__AutomatedRestTesting__Group__4__Impl rule__AutomatedRestTesting__Group__5
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
    // InternalAutomatedRestTesting.g:1286:1: rule__AutomatedRestTesting__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AutomatedRestTesting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1290:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1291:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1291:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1292:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:1301:1: rule__AutomatedRestTesting__Group__5 : rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 ;
    public final void rule__AutomatedRestTesting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1305:1: ( rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6 )
            // InternalAutomatedRestTesting.g:1306:2: rule__AutomatedRestTesting__Group__5__Impl rule__AutomatedRestTesting__Group__6
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
    // InternalAutomatedRestTesting.g:1313:1: rule__AutomatedRestTesting__Group__5__Impl : ( ( rule__AutomatedRestTesting__Group_5__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1317:1: ( ( ( rule__AutomatedRestTesting__Group_5__0 )? ) )
            // InternalAutomatedRestTesting.g:1318:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:1318:1: ( ( rule__AutomatedRestTesting__Group_5__0 )? )
            // InternalAutomatedRestTesting.g:1319:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_5()); 
            // InternalAutomatedRestTesting.g:1320:2: ( rule__AutomatedRestTesting__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=73 && LA13_0<=74)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1320:3: rule__AutomatedRestTesting__Group_5__0
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
    // InternalAutomatedRestTesting.g:1328:1: rule__AutomatedRestTesting__Group__6 : rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 ;
    public final void rule__AutomatedRestTesting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1332:1: ( rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7 )
            // InternalAutomatedRestTesting.g:1333:2: rule__AutomatedRestTesting__Group__6__Impl rule__AutomatedRestTesting__Group__7
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
    // InternalAutomatedRestTesting.g:1340:1: rule__AutomatedRestTesting__Group__6__Impl : ( ( rule__AutomatedRestTesting__Group_6__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1344:1: ( ( ( rule__AutomatedRestTesting__Group_6__0 )? ) )
            // InternalAutomatedRestTesting.g:1345:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            {
            // InternalAutomatedRestTesting.g:1345:1: ( ( rule__AutomatedRestTesting__Group_6__0 )? )
            // InternalAutomatedRestTesting.g:1346:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:1347:2: ( rule__AutomatedRestTesting__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=40 && LA14_0<=43)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1347:3: rule__AutomatedRestTesting__Group_6__0
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
    // InternalAutomatedRestTesting.g:1355:1: rule__AutomatedRestTesting__Group__7 : rule__AutomatedRestTesting__Group__7__Impl ;
    public final void rule__AutomatedRestTesting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1359:1: ( rule__AutomatedRestTesting__Group__7__Impl )
            // InternalAutomatedRestTesting.g:1360:2: rule__AutomatedRestTesting__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:1366:1: rule__AutomatedRestTesting__Group__7__Impl : ( ( rule__AutomatedRestTesting__Group_7__0 )? ) ;
    public final void rule__AutomatedRestTesting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1370:1: ( ( ( rule__AutomatedRestTesting__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:1371:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:1371:1: ( ( rule__AutomatedRestTesting__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:1372:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1373:2: ( rule__AutomatedRestTesting__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==64) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1373:3: rule__AutomatedRestTesting__Group_7__0
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
    // InternalAutomatedRestTesting.g:1382:1: rule__AutomatedRestTesting__Group_5__0 : rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 ;
    public final void rule__AutomatedRestTesting__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1386:1: ( rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1 )
            // InternalAutomatedRestTesting.g:1387:2: rule__AutomatedRestTesting__Group_5__0__Impl rule__AutomatedRestTesting__Group_5__1
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
    // InternalAutomatedRestTesting.g:1394:1: rule__AutomatedRestTesting__Group_5__0__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1398:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) ) )
            // InternalAutomatedRestTesting.g:1399:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            {
            // InternalAutomatedRestTesting.g:1399:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 ) )
            // InternalAutomatedRestTesting.g:1400:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_0()); 
            // InternalAutomatedRestTesting.g:1401:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_0 )
            // InternalAutomatedRestTesting.g:1401:3: rule__AutomatedRestTesting__DataElementsAssignment_5_0
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
    // InternalAutomatedRestTesting.g:1409:1: rule__AutomatedRestTesting__Group_5__1 : rule__AutomatedRestTesting__Group_5__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1413:1: ( rule__AutomatedRestTesting__Group_5__1__Impl )
            // InternalAutomatedRestTesting.g:1414:2: rule__AutomatedRestTesting__Group_5__1__Impl
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
    // InternalAutomatedRestTesting.g:1420:1: rule__AutomatedRestTesting__Group_5__1__Impl : ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1424:1: ( ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* ) )
            // InternalAutomatedRestTesting.g:1425:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            {
            // InternalAutomatedRestTesting.g:1425:1: ( ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )* )
            // InternalAutomatedRestTesting.g:1426:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getDataElementsAssignment_5_1()); 
            // InternalAutomatedRestTesting.g:1427:2: ( rule__AutomatedRestTesting__DataElementsAssignment_5_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=73 && LA16_0<=74)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1427:3: rule__AutomatedRestTesting__DataElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AutomatedRestTesting__DataElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAutomatedRestTesting.g:1436:1: rule__AutomatedRestTesting__Group_6__0 : rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 ;
    public final void rule__AutomatedRestTesting__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1440:1: ( rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1 )
            // InternalAutomatedRestTesting.g:1441:2: rule__AutomatedRestTesting__Group_6__0__Impl rule__AutomatedRestTesting__Group_6__1
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
    // InternalAutomatedRestTesting.g:1448:1: rule__AutomatedRestTesting__Group_6__0__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1452:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:1453:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:1453:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:1454:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:1455:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:1455:3: rule__AutomatedRestTesting__ServicesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:1463:1: rule__AutomatedRestTesting__Group_6__1 : rule__AutomatedRestTesting__Group_6__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1467:1: ( rule__AutomatedRestTesting__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:1468:2: rule__AutomatedRestTesting__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:1474:1: rule__AutomatedRestTesting__Group_6__1__Impl : ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1478:1: ( ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* ) )
            // InternalAutomatedRestTesting.g:1479:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            {
            // InternalAutomatedRestTesting.g:1479:1: ( ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )* )
            // InternalAutomatedRestTesting.g:1480:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getServicesAssignment_6_1()); 
            // InternalAutomatedRestTesting.g:1481:2: ( rule__AutomatedRestTesting__ServicesAssignment_6_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=43)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1481:3: rule__AutomatedRestTesting__ServicesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AutomatedRestTesting__ServicesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAutomatedRestTesting.g:1490:1: rule__AutomatedRestTesting__Group_7__0 : rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 ;
    public final void rule__AutomatedRestTesting__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1494:1: ( rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1 )
            // InternalAutomatedRestTesting.g:1495:2: rule__AutomatedRestTesting__Group_7__0__Impl rule__AutomatedRestTesting__Group_7__1
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
    // InternalAutomatedRestTesting.g:1502:1: rule__AutomatedRestTesting__Group_7__0__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) ;
    public final void rule__AutomatedRestTesting__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1506:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) ) )
            // InternalAutomatedRestTesting.g:1507:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            {
            // InternalAutomatedRestTesting.g:1507:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_0 ) )
            // InternalAutomatedRestTesting.g:1508:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_0()); 
            // InternalAutomatedRestTesting.g:1509:2: ( rule__AutomatedRestTesting__TestsAssignment_7_0 )
            // InternalAutomatedRestTesting.g:1509:3: rule__AutomatedRestTesting__TestsAssignment_7_0
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
    // InternalAutomatedRestTesting.g:1517:1: rule__AutomatedRestTesting__Group_7__1 : rule__AutomatedRestTesting__Group_7__1__Impl ;
    public final void rule__AutomatedRestTesting__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1521:1: ( rule__AutomatedRestTesting__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:1522:2: rule__AutomatedRestTesting__Group_7__1__Impl
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
    // InternalAutomatedRestTesting.g:1528:1: rule__AutomatedRestTesting__Group_7__1__Impl : ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) ;
    public final void rule__AutomatedRestTesting__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1532:1: ( ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* ) )
            // InternalAutomatedRestTesting.g:1533:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            {
            // InternalAutomatedRestTesting.g:1533:1: ( ( rule__AutomatedRestTesting__TestsAssignment_7_1 )* )
            // InternalAutomatedRestTesting.g:1534:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            {
             before(grammarAccess.getAutomatedRestTestingAccess().getTestsAssignment_7_1()); 
            // InternalAutomatedRestTesting.g:1535:2: ( rule__AutomatedRestTesting__TestsAssignment_7_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==64) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1535:3: rule__AutomatedRestTesting__TestsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AutomatedRestTesting__TestsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAutomatedRestTesting.g:1544:1: rule__RestService__Group__0 : rule__RestService__Group__0__Impl rule__RestService__Group__1 ;
    public final void rule__RestService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1548:1: ( rule__RestService__Group__0__Impl rule__RestService__Group__1 )
            // InternalAutomatedRestTesting.g:1549:2: rule__RestService__Group__0__Impl rule__RestService__Group__1
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
    // InternalAutomatedRestTesting.g:1556:1: rule__RestService__Group__0__Impl : ( ( rule__RestService__MethodAssignment_0 ) ) ;
    public final void rule__RestService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1560:1: ( ( ( rule__RestService__MethodAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:1561:1: ( ( rule__RestService__MethodAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:1561:1: ( ( rule__RestService__MethodAssignment_0 ) )
            // InternalAutomatedRestTesting.g:1562:2: ( rule__RestService__MethodAssignment_0 )
            {
             before(grammarAccess.getRestServiceAccess().getMethodAssignment_0()); 
            // InternalAutomatedRestTesting.g:1563:2: ( rule__RestService__MethodAssignment_0 )
            // InternalAutomatedRestTesting.g:1563:3: rule__RestService__MethodAssignment_0
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
    // InternalAutomatedRestTesting.g:1571:1: rule__RestService__Group__1 : rule__RestService__Group__1__Impl rule__RestService__Group__2 ;
    public final void rule__RestService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1575:1: ( rule__RestService__Group__1__Impl rule__RestService__Group__2 )
            // InternalAutomatedRestTesting.g:1576:2: rule__RestService__Group__1__Impl rule__RestService__Group__2
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
    // InternalAutomatedRestTesting.g:1583:1: rule__RestService__Group__1__Impl : ( ( rule__RestService__NameAssignment_1 ) ) ;
    public final void rule__RestService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1587:1: ( ( ( rule__RestService__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:1588:1: ( ( rule__RestService__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:1588:1: ( ( rule__RestService__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:1589:2: ( rule__RestService__NameAssignment_1 )
            {
             before(grammarAccess.getRestServiceAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:1590:2: ( rule__RestService__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:1590:3: rule__RestService__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:1598:1: rule__RestService__Group__2 : rule__RestService__Group__2__Impl rule__RestService__Group__3 ;
    public final void rule__RestService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1602:1: ( rule__RestService__Group__2__Impl rule__RestService__Group__3 )
            // InternalAutomatedRestTesting.g:1603:2: rule__RestService__Group__2__Impl rule__RestService__Group__3
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
    // InternalAutomatedRestTesting.g:1610:1: rule__RestService__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1614:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1615:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1615:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1616:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:1625:1: rule__RestService__Group__3 : rule__RestService__Group__3__Impl rule__RestService__Group__4 ;
    public final void rule__RestService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1629:1: ( rule__RestService__Group__3__Impl rule__RestService__Group__4 )
            // InternalAutomatedRestTesting.g:1630:2: rule__RestService__Group__3__Impl rule__RestService__Group__4
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
    // InternalAutomatedRestTesting.g:1637:1: rule__RestService__Group__3__Impl : ( 'URL' ) ;
    public final void rule__RestService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1641:1: ( ( 'URL' ) )
            // InternalAutomatedRestTesting.g:1642:1: ( 'URL' )
            {
            // InternalAutomatedRestTesting.g:1642:1: ( 'URL' )
            // InternalAutomatedRestTesting.g:1643:2: 'URL'
            {
             before(grammarAccess.getRestServiceAccess().getURLKeyword_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:1652:1: rule__RestService__Group__4 : rule__RestService__Group__4__Impl rule__RestService__Group__5 ;
    public final void rule__RestService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1656:1: ( rule__RestService__Group__4__Impl rule__RestService__Group__5 )
            // InternalAutomatedRestTesting.g:1657:2: rule__RestService__Group__4__Impl rule__RestService__Group__5
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
    // InternalAutomatedRestTesting.g:1664:1: rule__RestService__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1668:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1669:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1669:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1670:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:1679:1: rule__RestService__Group__5 : rule__RestService__Group__5__Impl rule__RestService__Group__6 ;
    public final void rule__RestService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1683:1: ( rule__RestService__Group__5__Impl rule__RestService__Group__6 )
            // InternalAutomatedRestTesting.g:1684:2: rule__RestService__Group__5__Impl rule__RestService__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalAutomatedRestTesting.g:1691:1: rule__RestService__Group__5__Impl : ( ( rule__RestService__UriAssignment_5 ) ) ;
    public final void rule__RestService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1695:1: ( ( ( rule__RestService__UriAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:1696:1: ( ( rule__RestService__UriAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:1696:1: ( ( rule__RestService__UriAssignment_5 ) )
            // InternalAutomatedRestTesting.g:1697:2: ( rule__RestService__UriAssignment_5 )
            {
             before(grammarAccess.getRestServiceAccess().getUriAssignment_5()); 
            // InternalAutomatedRestTesting.g:1698:2: ( rule__RestService__UriAssignment_5 )
            // InternalAutomatedRestTesting.g:1698:3: rule__RestService__UriAssignment_5
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
    // InternalAutomatedRestTesting.g:1706:1: rule__RestService__Group__6 : rule__RestService__Group__6__Impl rule__RestService__Group__7 ;
    public final void rule__RestService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1710:1: ( rule__RestService__Group__6__Impl rule__RestService__Group__7 )
            // InternalAutomatedRestTesting.g:1711:2: rule__RestService__Group__6__Impl rule__RestService__Group__7
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
    // InternalAutomatedRestTesting.g:1718:1: rule__RestService__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1722:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1723:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1723:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1724:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1733:1: rule__RestService__Group__7 : rule__RestService__Group__7__Impl rule__RestService__Group__8 ;
    public final void rule__RestService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1737:1: ( rule__RestService__Group__7__Impl rule__RestService__Group__8 )
            // InternalAutomatedRestTesting.g:1738:2: rule__RestService__Group__7__Impl rule__RestService__Group__8
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
    // InternalAutomatedRestTesting.g:1745:1: rule__RestService__Group__7__Impl : ( ( rule__RestService__Group_7__0 )? ) ;
    public final void rule__RestService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1749:1: ( ( ( rule__RestService__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:1750:1: ( ( rule__RestService__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:1750:1: ( ( rule__RestService__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:1751:2: ( rule__RestService__Group_7__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:1752:2: ( rule__RestService__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==63) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1752:3: rule__RestService__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1760:1: rule__RestService__Group__8 : rule__RestService__Group__8__Impl rule__RestService__Group__9 ;
    public final void rule__RestService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1764:1: ( rule__RestService__Group__8__Impl rule__RestService__Group__9 )
            // InternalAutomatedRestTesting.g:1765:2: rule__RestService__Group__8__Impl rule__RestService__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalAutomatedRestTesting.g:1772:1: rule__RestService__Group__8__Impl : ( 'Response' ) ;
    public final void rule__RestService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1776:1: ( ( 'Response' ) )
            // InternalAutomatedRestTesting.g:1777:1: ( 'Response' )
            {
            // InternalAutomatedRestTesting.g:1777:1: ( 'Response' )
            // InternalAutomatedRestTesting.g:1778:2: 'Response'
            {
             before(grammarAccess.getRestServiceAccess().getResponseKeyword_8()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getResponseKeyword_8()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1787:1: rule__RestService__Group__9 : rule__RestService__Group__9__Impl rule__RestService__Group__10 ;
    public final void rule__RestService__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1791:1: ( rule__RestService__Group__9__Impl rule__RestService__Group__10 )
            // InternalAutomatedRestTesting.g:1792:2: rule__RestService__Group__9__Impl rule__RestService__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalAutomatedRestTesting.g:1799:1: rule__RestService__Group__9__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1803:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1804:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1804:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:1805:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1814:1: rule__RestService__Group__10 : rule__RestService__Group__10__Impl rule__RestService__Group__11 ;
    public final void rule__RestService__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1818:1: ( rule__RestService__Group__10__Impl rule__RestService__Group__11 )
            // InternalAutomatedRestTesting.g:1819:2: rule__RestService__Group__10__Impl rule__RestService__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalAutomatedRestTesting.g:1826:1: rule__RestService__Group__10__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1830:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:1831:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:1831:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:1832:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_10()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getTypeKeyword_10()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1841:1: rule__RestService__Group__11 : rule__RestService__Group__11__Impl rule__RestService__Group__12 ;
    public final void rule__RestService__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1845:1: ( rule__RestService__Group__11__Impl rule__RestService__Group__12 )
            // InternalAutomatedRestTesting.g:1846:2: rule__RestService__Group__11__Impl rule__RestService__Group__12
            {
            pushFollow(FOLLOW_5);
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
    // InternalAutomatedRestTesting.g:1853:1: rule__RestService__Group__11__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1857:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:1858:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:1858:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:1859:2: RULE_EQUAL
            {
             before(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_11()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_11()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1868:1: rule__RestService__Group__12 : rule__RestService__Group__12__Impl rule__RestService__Group__13 ;
    public final void rule__RestService__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1872:1: ( rule__RestService__Group__12__Impl rule__RestService__Group__13 )
            // InternalAutomatedRestTesting.g:1873:2: rule__RestService__Group__12__Impl rule__RestService__Group__13
            {
            pushFollow(FOLLOW_19);
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
    // InternalAutomatedRestTesting.g:1880:1: rule__RestService__Group__12__Impl : ( ( rule__RestService__ResponseAssignment_12 ) ) ;
    public final void rule__RestService__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1884:1: ( ( ( rule__RestService__ResponseAssignment_12 ) ) )
            // InternalAutomatedRestTesting.g:1885:1: ( ( rule__RestService__ResponseAssignment_12 ) )
            {
            // InternalAutomatedRestTesting.g:1885:1: ( ( rule__RestService__ResponseAssignment_12 ) )
            // InternalAutomatedRestTesting.g:1886:2: ( rule__RestService__ResponseAssignment_12 )
            {
             before(grammarAccess.getRestServiceAccess().getResponseAssignment_12()); 
            // InternalAutomatedRestTesting.g:1887:2: ( rule__RestService__ResponseAssignment_12 )
            // InternalAutomatedRestTesting.g:1887:3: rule__RestService__ResponseAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__RestService__ResponseAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getResponseAssignment_12()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1895:1: rule__RestService__Group__13 : rule__RestService__Group__13__Impl rule__RestService__Group__14 ;
    public final void rule__RestService__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1899:1: ( rule__RestService__Group__13__Impl rule__RestService__Group__14 )
            // InternalAutomatedRestTesting.g:1900:2: rule__RestService__Group__13__Impl rule__RestService__Group__14
            {
            pushFollow(FOLLOW_19);
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
    // InternalAutomatedRestTesting.g:1907:1: rule__RestService__Group__13__Impl : ( ( rule__RestService__Group_13__0 )? ) ;
    public final void rule__RestService__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1911:1: ( ( ( rule__RestService__Group_13__0 )? ) )
            // InternalAutomatedRestTesting.g:1912:1: ( ( rule__RestService__Group_13__0 )? )
            {
            // InternalAutomatedRestTesting.g:1912:1: ( ( rule__RestService__Group_13__0 )? )
            // InternalAutomatedRestTesting.g:1913:2: ( rule__RestService__Group_13__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_13()); 
            // InternalAutomatedRestTesting.g:1914:2: ( rule__RestService__Group_13__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1914:3: rule__RestService__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_13()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1922:1: rule__RestService__Group__14 : rule__RestService__Group__14__Impl rule__RestService__Group__15 ;
    public final void rule__RestService__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1926:1: ( rule__RestService__Group__14__Impl rule__RestService__Group__15 )
            // InternalAutomatedRestTesting.g:1927:2: rule__RestService__Group__14__Impl rule__RestService__Group__15
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:1934:1: rule__RestService__Group__14__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1938:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:1939:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:1939:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:1940:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_14()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_14()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1949:1: rule__RestService__Group__15 : rule__RestService__Group__15__Impl rule__RestService__Group__16 ;
    public final void rule__RestService__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1953:1: ( rule__RestService__Group__15__Impl rule__RestService__Group__16 )
            // InternalAutomatedRestTesting.g:1954:2: rule__RestService__Group__15__Impl rule__RestService__Group__16
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:1961:1: rule__RestService__Group__15__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1965:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1966:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1966:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1967:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_15()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_15()); 

            }


            }

        }
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
    // InternalAutomatedRestTesting.g:1976:1: rule__RestService__Group__16 : rule__RestService__Group__16__Impl ;
    public final void rule__RestService__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1980:1: ( rule__RestService__Group__16__Impl )
            // InternalAutomatedRestTesting.g:1981:2: rule__RestService__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group__16__Impl();

            state._fsp--;


            }

        }
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
    // InternalAutomatedRestTesting.g:1987:1: rule__RestService__Group__16__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:1991:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1992:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1992:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1993:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_16()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__RestService__Group_7__0"
    // InternalAutomatedRestTesting.g:2003:1: rule__RestService__Group_7__0 : rule__RestService__Group_7__0__Impl rule__RestService__Group_7__1 ;
    public final void rule__RestService__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2007:1: ( rule__RestService__Group_7__0__Impl rule__RestService__Group_7__1 )
            // InternalAutomatedRestTesting.g:2008:2: rule__RestService__Group_7__0__Impl rule__RestService__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__RestService__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__0"


    // $ANTLR start "rule__RestService__Group_7__0__Impl"
    // InternalAutomatedRestTesting.g:2015:1: rule__RestService__Group_7__0__Impl : ( 'Request' ) ;
    public final void rule__RestService__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2019:1: ( ( 'Request' ) )
            // InternalAutomatedRestTesting.g:2020:1: ( 'Request' )
            {
            // InternalAutomatedRestTesting.g:2020:1: ( 'Request' )
            // InternalAutomatedRestTesting.g:2021:2: 'Request'
            {
             before(grammarAccess.getRestServiceAccess().getRequestKeyword_7_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRequestKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__0__Impl"


    // $ANTLR start "rule__RestService__Group_7__1"
    // InternalAutomatedRestTesting.g:2030:1: rule__RestService__Group_7__1 : rule__RestService__Group_7__1__Impl rule__RestService__Group_7__2 ;
    public final void rule__RestService__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2034:1: ( rule__RestService__Group_7__1__Impl rule__RestService__Group_7__2 )
            // InternalAutomatedRestTesting.g:2035:2: rule__RestService__Group_7__1__Impl rule__RestService__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__RestService__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__1"


    // $ANTLR start "rule__RestService__Group_7__1__Impl"
    // InternalAutomatedRestTesting.g:2042:1: rule__RestService__Group_7__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2046:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2047:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2047:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2048:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_7_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__1__Impl"


    // $ANTLR start "rule__RestService__Group_7__2"
    // InternalAutomatedRestTesting.g:2057:1: rule__RestService__Group_7__2 : rule__RestService__Group_7__2__Impl rule__RestService__Group_7__3 ;
    public final void rule__RestService__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2061:1: ( rule__RestService__Group_7__2__Impl rule__RestService__Group_7__3 )
            // InternalAutomatedRestTesting.g:2062:2: rule__RestService__Group_7__2__Impl rule__RestService__Group_7__3
            {
            pushFollow(FOLLOW_4);
            rule__RestService__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__2"


    // $ANTLR start "rule__RestService__Group_7__2__Impl"
    // InternalAutomatedRestTesting.g:2069:1: rule__RestService__Group_7__2__Impl : ( 'Type' ) ;
    public final void rule__RestService__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2073:1: ( ( 'Type' ) )
            // InternalAutomatedRestTesting.g:2074:1: ( 'Type' )
            {
            // InternalAutomatedRestTesting.g:2074:1: ( 'Type' )
            // InternalAutomatedRestTesting.g:2075:2: 'Type'
            {
             before(grammarAccess.getRestServiceAccess().getTypeKeyword_7_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getTypeKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__2__Impl"


    // $ANTLR start "rule__RestService__Group_7__3"
    // InternalAutomatedRestTesting.g:2084:1: rule__RestService__Group_7__3 : rule__RestService__Group_7__3__Impl rule__RestService__Group_7__4 ;
    public final void rule__RestService__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2088:1: ( rule__RestService__Group_7__3__Impl rule__RestService__Group_7__4 )
            // InternalAutomatedRestTesting.g:2089:2: rule__RestService__Group_7__3__Impl rule__RestService__Group_7__4
            {
            pushFollow(FOLLOW_5);
            rule__RestService__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__3"


    // $ANTLR start "rule__RestService__Group_7__3__Impl"
    // InternalAutomatedRestTesting.g:2096:1: rule__RestService__Group_7__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__RestService__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2100:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2101:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2101:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2102:2: RULE_EQUAL
            {
             before(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_7_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__3__Impl"


    // $ANTLR start "rule__RestService__Group_7__4"
    // InternalAutomatedRestTesting.g:2111:1: rule__RestService__Group_7__4 : rule__RestService__Group_7__4__Impl rule__RestService__Group_7__5 ;
    public final void rule__RestService__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2115:1: ( rule__RestService__Group_7__4__Impl rule__RestService__Group_7__5 )
            // InternalAutomatedRestTesting.g:2116:2: rule__RestService__Group_7__4__Impl rule__RestService__Group_7__5
            {
            pushFollow(FOLLOW_19);
            rule__RestService__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__4"


    // $ANTLR start "rule__RestService__Group_7__4__Impl"
    // InternalAutomatedRestTesting.g:2123:1: rule__RestService__Group_7__4__Impl : ( ( rule__RestService__RequestAssignment_7_4 ) ) ;
    public final void rule__RestService__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2127:1: ( ( ( rule__RestService__RequestAssignment_7_4 ) ) )
            // InternalAutomatedRestTesting.g:2128:1: ( ( rule__RestService__RequestAssignment_7_4 ) )
            {
            // InternalAutomatedRestTesting.g:2128:1: ( ( rule__RestService__RequestAssignment_7_4 ) )
            // InternalAutomatedRestTesting.g:2129:2: ( rule__RestService__RequestAssignment_7_4 )
            {
             before(grammarAccess.getRestServiceAccess().getRequestAssignment_7_4()); 
            // InternalAutomatedRestTesting.g:2130:2: ( rule__RestService__RequestAssignment_7_4 )
            // InternalAutomatedRestTesting.g:2130:3: rule__RestService__RequestAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__RestService__RequestAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getRestServiceAccess().getRequestAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__4__Impl"


    // $ANTLR start "rule__RestService__Group_7__5"
    // InternalAutomatedRestTesting.g:2138:1: rule__RestService__Group_7__5 : rule__RestService__Group_7__5__Impl rule__RestService__Group_7__6 ;
    public final void rule__RestService__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2142:1: ( rule__RestService__Group_7__5__Impl rule__RestService__Group_7__6 )
            // InternalAutomatedRestTesting.g:2143:2: rule__RestService__Group_7__5__Impl rule__RestService__Group_7__6
            {
            pushFollow(FOLLOW_19);
            rule__RestService__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__5"


    // $ANTLR start "rule__RestService__Group_7__5__Impl"
    // InternalAutomatedRestTesting.g:2150:1: rule__RestService__Group_7__5__Impl : ( ( rule__RestService__Group_7_5__0 )? ) ;
    public final void rule__RestService__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2154:1: ( ( ( rule__RestService__Group_7_5__0 )? ) )
            // InternalAutomatedRestTesting.g:2155:1: ( ( rule__RestService__Group_7_5__0 )? )
            {
            // InternalAutomatedRestTesting.g:2155:1: ( ( rule__RestService__Group_7_5__0 )? )
            // InternalAutomatedRestTesting.g:2156:2: ( rule__RestService__Group_7_5__0 )?
            {
             before(grammarAccess.getRestServiceAccess().getGroup_7_5()); 
            // InternalAutomatedRestTesting.g:2157:2: ( rule__RestService__Group_7_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2157:3: rule__RestService__Group_7_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestService__Group_7_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestServiceAccess().getGroup_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__5__Impl"


    // $ANTLR start "rule__RestService__Group_7__6"
    // InternalAutomatedRestTesting.g:2165:1: rule__RestService__Group_7__6 : rule__RestService__Group_7__6__Impl rule__RestService__Group_7__7 ;
    public final void rule__RestService__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2169:1: ( rule__RestService__Group_7__6__Impl rule__RestService__Group_7__7 )
            // InternalAutomatedRestTesting.g:2170:2: rule__RestService__Group_7__6__Impl rule__RestService__Group_7__7
            {
            pushFollow(FOLLOW_20);
            rule__RestService__Group_7__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__6"


    // $ANTLR start "rule__RestService__Group_7__6__Impl"
    // InternalAutomatedRestTesting.g:2177:1: rule__RestService__Group_7__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__RestService__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2181:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2182:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2182:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2183:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_7_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_7_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__6__Impl"


    // $ANTLR start "rule__RestService__Group_7__7"
    // InternalAutomatedRestTesting.g:2192:1: rule__RestService__Group_7__7 : rule__RestService__Group_7__7__Impl ;
    public final void rule__RestService__Group_7__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2196:1: ( rule__RestService__Group_7__7__Impl )
            // InternalAutomatedRestTesting.g:2197:2: rule__RestService__Group_7__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_7__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__7"


    // $ANTLR start "rule__RestService__Group_7__7__Impl"
    // InternalAutomatedRestTesting.g:2203:1: rule__RestService__Group_7__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_7__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2207:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2208:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2208:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2209:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_7_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_7_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7__7__Impl"


    // $ANTLR start "rule__RestService__Group_7_5__0"
    // InternalAutomatedRestTesting.g:2219:1: rule__RestService__Group_7_5__0 : rule__RestService__Group_7_5__0__Impl rule__RestService__Group_7_5__1 ;
    public final void rule__RestService__Group_7_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2223:1: ( rule__RestService__Group_7_5__0__Impl rule__RestService__Group_7_5__1 )
            // InternalAutomatedRestTesting.g:2224:2: rule__RestService__Group_7_5__0__Impl rule__RestService__Group_7_5__1
            {
            pushFollow(FOLLOW_21);
            rule__RestService__Group_7_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_7_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_5__0"


    // $ANTLR start "rule__RestService__Group_7_5__0__Impl"
    // InternalAutomatedRestTesting.g:2231:1: rule__RestService__Group_7_5__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_7_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2235:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2236:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2236:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2237:2: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_7_5_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_5__0__Impl"


    // $ANTLR start "rule__RestService__Group_7_5__1"
    // InternalAutomatedRestTesting.g:2246:1: rule__RestService__Group_7_5__1 : rule__RestService__Group_7_5__1__Impl ;
    public final void rule__RestService__Group_7_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2250:1: ( rule__RestService__Group_7_5__1__Impl )
            // InternalAutomatedRestTesting.g:2251:2: rule__RestService__Group_7_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_7_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_5__1"


    // $ANTLR start "rule__RestService__Group_7_5__1__Impl"
    // InternalAutomatedRestTesting.g:2257:1: rule__RestService__Group_7_5__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_7_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2261:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2262:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2262:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2263:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_7_5_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_7_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_7_5__1__Impl"


    // $ANTLR start "rule__RestService__Group_13__0"
    // InternalAutomatedRestTesting.g:2273:1: rule__RestService__Group_13__0 : rule__RestService__Group_13__0__Impl rule__RestService__Group_13__1 ;
    public final void rule__RestService__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2277:1: ( rule__RestService__Group_13__0__Impl rule__RestService__Group_13__1 )
            // InternalAutomatedRestTesting.g:2278:2: rule__RestService__Group_13__0__Impl rule__RestService__Group_13__1
            {
            pushFollow(FOLLOW_21);
            rule__RestService__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestService__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_13__0"


    // $ANTLR start "rule__RestService__Group_13__0__Impl"
    // InternalAutomatedRestTesting.g:2285:1: rule__RestService__Group_13__0__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__RestService__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2289:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2290:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2290:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2291:2: RULE_SQUARE_LEFT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_13_0()); 
            match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_13__0__Impl"


    // $ANTLR start "rule__RestService__Group_13__1"
    // InternalAutomatedRestTesting.g:2300:1: rule__RestService__Group_13__1 : rule__RestService__Group_13__1__Impl ;
    public final void rule__RestService__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2304:1: ( rule__RestService__Group_13__1__Impl )
            // InternalAutomatedRestTesting.g:2305:2: rule__RestService__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestService__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_13__1"


    // $ANTLR start "rule__RestService__Group_13__1__Impl"
    // InternalAutomatedRestTesting.g:2311:1: rule__RestService__Group_13__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__RestService__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2315:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2316:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2316:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2317:2: RULE_SQUARE_RIGHT_BRACKET
            {
             before(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_13_1()); 
            match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__Group_13__1__Impl"


    // $ANTLR start "rule__URL__Group__0"
    // InternalAutomatedRestTesting.g:2327:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2331:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalAutomatedRestTesting.g:2332:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0"


    // $ANTLR start "rule__URL__Group__0__Impl"
    // InternalAutomatedRestTesting.g:2339:1: rule__URL__Group__0__Impl : ( ( rule__URL__UrlexpressionAssignment_0 ) ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2343:1: ( ( ( rule__URL__UrlexpressionAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:2344:1: ( ( rule__URL__UrlexpressionAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:2344:1: ( ( rule__URL__UrlexpressionAssignment_0 ) )
            // InternalAutomatedRestTesting.g:2345:2: ( rule__URL__UrlexpressionAssignment_0 )
            {
             before(grammarAccess.getURLAccess().getUrlexpressionAssignment_0()); 
            // InternalAutomatedRestTesting.g:2346:2: ( rule__URL__UrlexpressionAssignment_0 )
            // InternalAutomatedRestTesting.g:2346:3: rule__URL__UrlexpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__URL__UrlexpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getUrlexpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0__Impl"


    // $ANTLR start "rule__URL__Group__1"
    // InternalAutomatedRestTesting.g:2354:1: rule__URL__Group__1 : rule__URL__Group__1__Impl ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2358:1: ( rule__URL__Group__1__Impl )
            // InternalAutomatedRestTesting.g:2359:2: rule__URL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1"


    // $ANTLR start "rule__URL__Group__1__Impl"
    // InternalAutomatedRestTesting.g:2365:1: rule__URL__Group__1__Impl : ( ( rule__URL__UrlexpressionAssignment_1 )* ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2369:1: ( ( ( rule__URL__UrlexpressionAssignment_1 )* ) )
            // InternalAutomatedRestTesting.g:2370:1: ( ( rule__URL__UrlexpressionAssignment_1 )* )
            {
            // InternalAutomatedRestTesting.g:2370:1: ( ( rule__URL__UrlexpressionAssignment_1 )* )
            // InternalAutomatedRestTesting.g:2371:2: ( rule__URL__UrlexpressionAssignment_1 )*
            {
             before(grammarAccess.getURLAccess().getUrlexpressionAssignment_1()); 
            // InternalAutomatedRestTesting.g:2372:2: ( rule__URL__UrlexpressionAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||(LA22_0>=22 && LA22_0<=24)||(LA22_0>=44 && LA22_0<=45)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2372:3: rule__URL__UrlexpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__URL__UrlexpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getURLAccess().getUrlexpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalAutomatedRestTesting.g:2381:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2385:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalAutomatedRestTesting.g:2386:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAutomatedRestTesting.g:2393:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2397:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2398:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2398:1: ( () )
            // InternalAutomatedRestTesting.g:2399:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalAutomatedRestTesting.g:2400:2: ()
            // InternalAutomatedRestTesting.g:2400:3: 
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
    // InternalAutomatedRestTesting.g:2408:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2412:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalAutomatedRestTesting.g:2413:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalAutomatedRestTesting.g:2420:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParamTypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2424:1: ( ( ( rule__Parameter__ParamTypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2425:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2425:1: ( ( rule__Parameter__ParamTypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2426:2: ( rule__Parameter__ParamTypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParamTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:2427:2: ( rule__Parameter__ParamTypeAssignment_1 )
            // InternalAutomatedRestTesting.g:2427:3: rule__Parameter__ParamTypeAssignment_1
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
    // InternalAutomatedRestTesting.g:2435:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2439:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalAutomatedRestTesting.g:2440:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAutomatedRestTesting.g:2447:1: rule__Parameter__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2451:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2452:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2452:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2453:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2462:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2466:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalAutomatedRestTesting.g:2467:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:2474:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2478:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:2479:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:2479:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:2480:2: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:2481:2: ( rule__Parameter__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:2481:3: rule__Parameter__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:2489:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2493:1: ( rule__Parameter__Group__4__Impl )
            // InternalAutomatedRestTesting.g:2494:2: rule__Parameter__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:2500:1: rule__Parameter__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2504:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2505:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2505:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2506:2: RULE_RIGHT_BRACKET
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


    // $ANTLR start "rule__Separator__Group__0"
    // InternalAutomatedRestTesting.g:2516:1: rule__Separator__Group__0 : rule__Separator__Group__0__Impl rule__Separator__Group__1 ;
    public final void rule__Separator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2520:1: ( rule__Separator__Group__0__Impl rule__Separator__Group__1 )
            // InternalAutomatedRestTesting.g:2521:2: rule__Separator__Group__0__Impl rule__Separator__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Separator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Separator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Group__0"


    // $ANTLR start "rule__Separator__Group__0__Impl"
    // InternalAutomatedRestTesting.g:2528:1: rule__Separator__Group__0__Impl : ( () ) ;
    public final void rule__Separator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2532:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:2533:1: ( () )
            {
            // InternalAutomatedRestTesting.g:2533:1: ( () )
            // InternalAutomatedRestTesting.g:2534:2: ()
            {
             before(grammarAccess.getSeparatorAccess().getSeparatorAction_0()); 
            // InternalAutomatedRestTesting.g:2535:2: ()
            // InternalAutomatedRestTesting.g:2535:3: 
            {
            }

             after(grammarAccess.getSeparatorAccess().getSeparatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Group__0__Impl"


    // $ANTLR start "rule__Separator__Group__1"
    // InternalAutomatedRestTesting.g:2543:1: rule__Separator__Group__1 : rule__Separator__Group__1__Impl ;
    public final void rule__Separator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2547:1: ( rule__Separator__Group__1__Impl )
            // InternalAutomatedRestTesting.g:2548:2: rule__Separator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Group__1"


    // $ANTLR start "rule__Separator__Group__1__Impl"
    // InternalAutomatedRestTesting.g:2554:1: rule__Separator__Group__1__Impl : ( ( rule__Separator__SeparatorTypeAssignment_1 ) ) ;
    public final void rule__Separator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2558:1: ( ( ( rule__Separator__SeparatorTypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2559:1: ( ( rule__Separator__SeparatorTypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2559:1: ( ( rule__Separator__SeparatorTypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2560:2: ( rule__Separator__SeparatorTypeAssignment_1 )
            {
             before(grammarAccess.getSeparatorAccess().getSeparatorTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:2561:2: ( rule__Separator__SeparatorTypeAssignment_1 )
            // InternalAutomatedRestTesting.g:2561:3: rule__Separator__SeparatorTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Separator__SeparatorTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getSeparatorTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalAutomatedRestTesting.g:2570:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2574:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAutomatedRestTesting.g:2575:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalAutomatedRestTesting.g:2582:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2586:1: ( ( 'Test' ) )
            // InternalAutomatedRestTesting.g:2587:1: ( 'Test' )
            {
            // InternalAutomatedRestTesting.g:2587:1: ( 'Test' )
            // InternalAutomatedRestTesting.g:2588:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2597:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2601:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAutomatedRestTesting.g:2602:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalAutomatedRestTesting.g:2609:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2613:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:2614:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:2614:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAutomatedRestTesting.g:2615:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAutomatedRestTesting.g:2616:2: ( rule__Test__NameAssignment_1 )
            // InternalAutomatedRestTesting.g:2616:3: rule__Test__NameAssignment_1
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
    // InternalAutomatedRestTesting.g:2624:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2628:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAutomatedRestTesting.g:2629:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAutomatedRestTesting.g:2636:1: rule__Test__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2640:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2641:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2641:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2642:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2651:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2655:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAutomatedRestTesting.g:2656:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalAutomatedRestTesting.g:2663:1: rule__Test__Group__3__Impl : ( 'service' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2667:1: ( ( 'service' ) )
            // InternalAutomatedRestTesting.g:2668:1: ( 'service' )
            {
            // InternalAutomatedRestTesting.g:2668:1: ( 'service' )
            // InternalAutomatedRestTesting.g:2669:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2678:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2682:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAutomatedRestTesting.g:2683:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalAutomatedRestTesting.g:2690:1: rule__Test__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2694:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2695:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2695:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:2696:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:2705:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2709:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAutomatedRestTesting.g:2710:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalAutomatedRestTesting.g:2717:1: rule__Test__Group__5__Impl : ( ( rule__Test__ServiceAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2721:1: ( ( ( rule__Test__ServiceAssignment_5 ) ) )
            // InternalAutomatedRestTesting.g:2722:1: ( ( rule__Test__ServiceAssignment_5 ) )
            {
            // InternalAutomatedRestTesting.g:2722:1: ( ( rule__Test__ServiceAssignment_5 ) )
            // InternalAutomatedRestTesting.g:2723:2: ( rule__Test__ServiceAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_5()); 
            // InternalAutomatedRestTesting.g:2724:2: ( rule__Test__ServiceAssignment_5 )
            // InternalAutomatedRestTesting.g:2724:3: rule__Test__ServiceAssignment_5
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
    // InternalAutomatedRestTesting.g:2732:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2736:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAutomatedRestTesting.g:2737:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalAutomatedRestTesting.g:2744:1: rule__Test__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2748:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:2749:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:2749:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:2750:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:2759:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2763:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAutomatedRestTesting.g:2764:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalAutomatedRestTesting.g:2771:1: rule__Test__Group__7__Impl : ( ( rule__Test__Group_7__0 )? ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2775:1: ( ( ( rule__Test__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:2776:1: ( ( rule__Test__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:2776:1: ( ( rule__Test__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:2777:2: ( rule__Test__Group_7__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:2778:2: ( rule__Test__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==67) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2778:3: rule__Test__Group_7__0
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
    // InternalAutomatedRestTesting.g:2786:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2790:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAutomatedRestTesting.g:2791:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalAutomatedRestTesting.g:2798:1: rule__Test__Group__8__Impl : ( ( rule__Test__Group_8__0 )? ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2802:1: ( ( ( rule__Test__Group_8__0 )? ) )
            // InternalAutomatedRestTesting.g:2803:1: ( ( rule__Test__Group_8__0 )? )
            {
            // InternalAutomatedRestTesting.g:2803:1: ( ( rule__Test__Group_8__0 )? )
            // InternalAutomatedRestTesting.g:2804:2: ( rule__Test__Group_8__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_8()); 
            // InternalAutomatedRestTesting.g:2805:2: ( rule__Test__Group_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2805:3: rule__Test__Group_8__0
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
    // InternalAutomatedRestTesting.g:2813:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2817:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAutomatedRestTesting.g:2818:2: rule__Test__Group__9__Impl rule__Test__Group__10
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
    // InternalAutomatedRestTesting.g:2825:1: rule__Test__Group__9__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2829:1: ( ( 'Assertions' ) )
            // InternalAutomatedRestTesting.g:2830:1: ( 'Assertions' )
            {
            // InternalAutomatedRestTesting.g:2830:1: ( 'Assertions' )
            // InternalAutomatedRestTesting.g:2831:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_9()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2840:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2844:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAutomatedRestTesting.g:2845:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalAutomatedRestTesting.g:2852:1: rule__Test__Group__10__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2856:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2857:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2857:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:2858:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:2867:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2871:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAutomatedRestTesting.g:2872:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:2879:1: rule__Test__Group__11__Impl : ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2883:1: ( ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) ) )
            // InternalAutomatedRestTesting.g:2884:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            {
            // InternalAutomatedRestTesting.g:2884:1: ( ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* ) )
            // InternalAutomatedRestTesting.g:2885:2: ( ( rule__Test__Group_11__0 ) ) ( ( rule__Test__Group_11__0 )* )
            {
            // InternalAutomatedRestTesting.g:2885:2: ( ( rule__Test__Group_11__0 ) )
            // InternalAutomatedRestTesting.g:2886:3: ( rule__Test__Group_11__0 )
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2887:3: ( rule__Test__Group_11__0 )
            // InternalAutomatedRestTesting.g:2887:4: rule__Test__Group_11__0
            {
            pushFollow(FOLLOW_29);
            rule__Test__Group_11__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup_11()); 

            }

            // InternalAutomatedRestTesting.g:2890:2: ( ( rule__Test__Group_11__0 )* )
            // InternalAutomatedRestTesting.g:2891:3: ( rule__Test__Group_11__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_11()); 
            // InternalAutomatedRestTesting.g:2892:3: ( rule__Test__Group_11__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=25 && LA25_0<=26)||(LA25_0>=32 && LA25_0<=39)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:2892:4: rule__Test__Group_11__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Test__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAutomatedRestTesting.g:2901:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2905:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalAutomatedRestTesting.g:2906:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:2913:1: rule__Test__Group__12__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2917:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2918:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2918:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2919:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2928:1: rule__Test__Group__13 : rule__Test__Group__13__Impl ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2932:1: ( rule__Test__Group__13__Impl )
            // InternalAutomatedRestTesting.g:2933:2: rule__Test__Group__13__Impl
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
    // InternalAutomatedRestTesting.g:2939:1: rule__Test__Group__13__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2943:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:2944:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:2944:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:2945:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:2955:1: rule__Test__Group_7__0 : rule__Test__Group_7__0__Impl rule__Test__Group_7__1 ;
    public final void rule__Test__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2959:1: ( rule__Test__Group_7__0__Impl rule__Test__Group_7__1 )
            // InternalAutomatedRestTesting.g:2960:2: rule__Test__Group_7__0__Impl rule__Test__Group_7__1
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
    // InternalAutomatedRestTesting.g:2967:1: rule__Test__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Test__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2971:1: ( ( 'description' ) )
            // InternalAutomatedRestTesting.g:2972:1: ( 'description' )
            {
            // InternalAutomatedRestTesting.g:2972:1: ( 'description' )
            // InternalAutomatedRestTesting.g:2973:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:2982:1: rule__Test__Group_7__1 : rule__Test__Group_7__1__Impl rule__Test__Group_7__2 ;
    public final void rule__Test__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2986:1: ( rule__Test__Group_7__1__Impl rule__Test__Group_7__2 )
            // InternalAutomatedRestTesting.g:2987:2: rule__Test__Group_7__1__Impl rule__Test__Group_7__2
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
    // InternalAutomatedRestTesting.g:2994:1: rule__Test__Group_7__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:2998:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:2999:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:2999:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3000:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3009:1: rule__Test__Group_7__2 : rule__Test__Group_7__2__Impl rule__Test__Group_7__3 ;
    public final void rule__Test__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3013:1: ( rule__Test__Group_7__2__Impl rule__Test__Group_7__3 )
            // InternalAutomatedRestTesting.g:3014:2: rule__Test__Group_7__2__Impl rule__Test__Group_7__3
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
    // InternalAutomatedRestTesting.g:3021:1: rule__Test__Group_7__2__Impl : ( ( rule__Test__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Test__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3025:1: ( ( ( rule__Test__DescriptionAssignment_7_2 ) ) )
            // InternalAutomatedRestTesting.g:3026:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            {
            // InternalAutomatedRestTesting.g:3026:1: ( ( rule__Test__DescriptionAssignment_7_2 ) )
            // InternalAutomatedRestTesting.g:3027:2: ( rule__Test__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getTestAccess().getDescriptionAssignment_7_2()); 
            // InternalAutomatedRestTesting.g:3028:2: ( rule__Test__DescriptionAssignment_7_2 )
            // InternalAutomatedRestTesting.g:3028:3: rule__Test__DescriptionAssignment_7_2
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
    // InternalAutomatedRestTesting.g:3036:1: rule__Test__Group_7__3 : rule__Test__Group_7__3__Impl ;
    public final void rule__Test__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3040:1: ( rule__Test__Group_7__3__Impl )
            // InternalAutomatedRestTesting.g:3041:2: rule__Test__Group_7__3__Impl
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
    // InternalAutomatedRestTesting.g:3047:1: rule__Test__Group_7__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3051:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3052:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3052:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3053:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:3063:1: rule__Test__Group_8__0 : rule__Test__Group_8__0__Impl rule__Test__Group_8__1 ;
    public final void rule__Test__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3067:1: ( rule__Test__Group_8__0__Impl rule__Test__Group_8__1 )
            // InternalAutomatedRestTesting.g:3068:2: rule__Test__Group_8__0__Impl rule__Test__Group_8__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAutomatedRestTesting.g:3075:1: rule__Test__Group_8__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3079:1: ( ( 'Mapping' ) )
            // InternalAutomatedRestTesting.g:3080:1: ( 'Mapping' )
            {
            // InternalAutomatedRestTesting.g:3080:1: ( 'Mapping' )
            // InternalAutomatedRestTesting.g:3081:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAutomatedRestTesting.g:3090:1: rule__Test__Group_8__1 : rule__Test__Group_8__1__Impl rule__Test__Group_8__2 ;
    public final void rule__Test__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3094:1: ( rule__Test__Group_8__1__Impl rule__Test__Group_8__2 )
            // InternalAutomatedRestTesting.g:3095:2: rule__Test__Group_8__1__Impl rule__Test__Group_8__2
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
    // InternalAutomatedRestTesting.g:3102:1: rule__Test__Group_8__1__Impl : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Test__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3106:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3107:1: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3107:1: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3108:2: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3117:1: rule__Test__Group_8__2 : rule__Test__Group_8__2__Impl rule__Test__Group_8__3 ;
    public final void rule__Test__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3121:1: ( rule__Test__Group_8__2__Impl rule__Test__Group_8__3 )
            // InternalAutomatedRestTesting.g:3122:2: rule__Test__Group_8__2__Impl rule__Test__Group_8__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:3129:1: rule__Test__Group_8__2__Impl : ( ( rule__Test__MappingsAssignment_8_2 ) ) ;
    public final void rule__Test__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3133:1: ( ( ( rule__Test__MappingsAssignment_8_2 ) ) )
            // InternalAutomatedRestTesting.g:3134:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            {
            // InternalAutomatedRestTesting.g:3134:1: ( ( rule__Test__MappingsAssignment_8_2 ) )
            // InternalAutomatedRestTesting.g:3135:2: ( rule__Test__MappingsAssignment_8_2 )
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_2()); 
            // InternalAutomatedRestTesting.g:3136:2: ( rule__Test__MappingsAssignment_8_2 )
            // InternalAutomatedRestTesting.g:3136:3: rule__Test__MappingsAssignment_8_2
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
    // InternalAutomatedRestTesting.g:3144:1: rule__Test__Group_8__3 : rule__Test__Group_8__3__Impl rule__Test__Group_8__4 ;
    public final void rule__Test__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3148:1: ( rule__Test__Group_8__3__Impl rule__Test__Group_8__4 )
            // InternalAutomatedRestTesting.g:3149:2: rule__Test__Group_8__3__Impl rule__Test__Group_8__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalAutomatedRestTesting.g:3156:1: rule__Test__Group_8__3__Impl : ( ( rule__Test__MappingsAssignment_8_3 )* ) ;
    public final void rule__Test__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3160:1: ( ( ( rule__Test__MappingsAssignment_8_3 )* ) )
            // InternalAutomatedRestTesting.g:3161:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            {
            // InternalAutomatedRestTesting.g:3161:1: ( ( rule__Test__MappingsAssignment_8_3 )* )
            // InternalAutomatedRestTesting.g:3162:2: ( rule__Test__MappingsAssignment_8_3 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_8_3()); 
            // InternalAutomatedRestTesting.g:3163:2: ( rule__Test__MappingsAssignment_8_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_LEFT_BRACKET) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3163:3: rule__Test__MappingsAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Test__MappingsAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAutomatedRestTesting.g:3171:1: rule__Test__Group_8__4 : rule__Test__Group_8__4__Impl ;
    public final void rule__Test__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3175:1: ( rule__Test__Group_8__4__Impl )
            // InternalAutomatedRestTesting.g:3176:2: rule__Test__Group_8__4__Impl
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
    // InternalAutomatedRestTesting.g:3182:1: rule__Test__Group_8__4__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Test__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3186:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3187:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3187:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3188:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:3198:1: rule__Test__Group_11__0 : rule__Test__Group_11__0__Impl rule__Test__Group_11__1 ;
    public final void rule__Test__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3202:1: ( rule__Test__Group_11__0__Impl rule__Test__Group_11__1 )
            // InternalAutomatedRestTesting.g:3203:2: rule__Test__Group_11__0__Impl rule__Test__Group_11__1
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
    // InternalAutomatedRestTesting.g:3210:1: rule__Test__Group_11__0__Impl : ( ( rule__Test__AssertionsAssignment_11_0 ) ) ;
    public final void rule__Test__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3214:1: ( ( ( rule__Test__AssertionsAssignment_11_0 ) ) )
            // InternalAutomatedRestTesting.g:3215:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            {
            // InternalAutomatedRestTesting.g:3215:1: ( ( rule__Test__AssertionsAssignment_11_0 ) )
            // InternalAutomatedRestTesting.g:3216:2: ( rule__Test__AssertionsAssignment_11_0 )
            {
             before(grammarAccess.getTestAccess().getAssertionsAssignment_11_0()); 
            // InternalAutomatedRestTesting.g:3217:2: ( rule__Test__AssertionsAssignment_11_0 )
            // InternalAutomatedRestTesting.g:3217:3: rule__Test__AssertionsAssignment_11_0
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
    // InternalAutomatedRestTesting.g:3225:1: rule__Test__Group_11__1 : rule__Test__Group_11__1__Impl ;
    public final void rule__Test__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3229:1: ( rule__Test__Group_11__1__Impl )
            // InternalAutomatedRestTesting.g:3230:2: rule__Test__Group_11__1__Impl
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
    // InternalAutomatedRestTesting.g:3236:1: rule__Test__Group_11__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3240:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:3241:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:3241:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:3242:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:3252:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3256:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalAutomatedRestTesting.g:3257:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
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
    // InternalAutomatedRestTesting.g:3264:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Group_0__0 )? ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3268:1: ( ( ( rule__Assertion__Group_0__0 )? ) )
            // InternalAutomatedRestTesting.g:3269:1: ( ( rule__Assertion__Group_0__0 )? )
            {
            // InternalAutomatedRestTesting.g:3269:1: ( ( rule__Assertion__Group_0__0 )? )
            // InternalAutomatedRestTesting.g:3270:2: ( rule__Assertion__Group_0__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0()); 
            // InternalAutomatedRestTesting.g:3271:2: ( rule__Assertion__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=25 && LA27_0<=26)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3271:3: rule__Assertion__Group_0__0
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
    // InternalAutomatedRestTesting.g:3279:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3283:1: ( rule__Assertion__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3284:2: rule__Assertion__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3290:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ConditionAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3294:1: ( ( ( rule__Assertion__ConditionAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:3295:1: ( ( rule__Assertion__ConditionAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:3295:1: ( ( rule__Assertion__ConditionAssignment_1 ) )
            // InternalAutomatedRestTesting.g:3296:2: ( rule__Assertion__ConditionAssignment_1 )
            {
             before(grammarAccess.getAssertionAccess().getConditionAssignment_1()); 
            // InternalAutomatedRestTesting.g:3297:2: ( rule__Assertion__ConditionAssignment_1 )
            // InternalAutomatedRestTesting.g:3297:3: rule__Assertion__ConditionAssignment_1
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
    // InternalAutomatedRestTesting.g:3306:1: rule__Assertion__Group_0__0 : rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1 ;
    public final void rule__Assertion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3310:1: ( rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1 )
            // InternalAutomatedRestTesting.g:3311:2: rule__Assertion__Group_0__0__Impl rule__Assertion__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAutomatedRestTesting.g:3318:1: rule__Assertion__Group_0__0__Impl : ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) ) ;
    public final void rule__Assertion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3322:1: ( ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) ) )
            // InternalAutomatedRestTesting.g:3323:1: ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) )
            {
            // InternalAutomatedRestTesting.g:3323:1: ( ( rule__Assertion__AssertionTypeAssignment_0_0 ) )
            // InternalAutomatedRestTesting.g:3324:2: ( rule__Assertion__AssertionTypeAssignment_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getAssertionTypeAssignment_0_0()); 
            // InternalAutomatedRestTesting.g:3325:2: ( rule__Assertion__AssertionTypeAssignment_0_0 )
            // InternalAutomatedRestTesting.g:3325:3: rule__Assertion__AssertionTypeAssignment_0_0
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
    // InternalAutomatedRestTesting.g:3333:1: rule__Assertion__Group_0__1 : rule__Assertion__Group_0__1__Impl ;
    public final void rule__Assertion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3337:1: ( rule__Assertion__Group_0__1__Impl )
            // InternalAutomatedRestTesting.g:3338:2: rule__Assertion__Group_0__1__Impl
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
    // InternalAutomatedRestTesting.g:3344:1: rule__Assertion__Group_0__1__Impl : ( ( rule__Assertion__DataToTestAssignment_0_1 ) ) ;
    public final void rule__Assertion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3348:1: ( ( ( rule__Assertion__DataToTestAssignment_0_1 ) ) )
            // InternalAutomatedRestTesting.g:3349:1: ( ( rule__Assertion__DataToTestAssignment_0_1 ) )
            {
            // InternalAutomatedRestTesting.g:3349:1: ( ( rule__Assertion__DataToTestAssignment_0_1 ) )
            // InternalAutomatedRestTesting.g:3350:2: ( rule__Assertion__DataToTestAssignment_0_1 )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestAssignment_0_1()); 
            // InternalAutomatedRestTesting.g:3351:2: ( rule__Assertion__DataToTestAssignment_0_1 )
            // InternalAutomatedRestTesting.g:3351:3: rule__Assertion__DataToTestAssignment_0_1
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
    // InternalAutomatedRestTesting.g:3360:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3364:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAutomatedRestTesting.g:3365:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAutomatedRestTesting.g:3372:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3376:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3377:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3377:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3378:2: RULE_ID
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
    // InternalAutomatedRestTesting.g:3387:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3391:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3392:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3398:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3402:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAutomatedRestTesting.g:3403:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAutomatedRestTesting.g:3403:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAutomatedRestTesting.g:3404:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3405:2: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:3405:3: rule__QualifiedName__Group_1__0
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
    // InternalAutomatedRestTesting.g:3414:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3418:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAutomatedRestTesting.g:3419:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAutomatedRestTesting.g:3426:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3430:1: ( ( RULE_DOT ) )
            // InternalAutomatedRestTesting.g:3431:1: ( RULE_DOT )
            {
            // InternalAutomatedRestTesting.g:3431:1: ( RULE_DOT )
            // InternalAutomatedRestTesting.g:3432:2: RULE_DOT
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
    // InternalAutomatedRestTesting.g:3441:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3445:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3446:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAutomatedRestTesting.g:3452:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3456:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:3457:1: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:3457:1: ( RULE_ID )
            // InternalAutomatedRestTesting.g:3458:2: RULE_ID
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
    // InternalAutomatedRestTesting.g:3468:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3472:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAutomatedRestTesting.g:3473:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAutomatedRestTesting.g:3480:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3484:1: ( ( ( rule__Expression__RelationalOperatorAssignment_0 ) ) )
            // InternalAutomatedRestTesting.g:3485:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            {
            // InternalAutomatedRestTesting.g:3485:1: ( ( rule__Expression__RelationalOperatorAssignment_0 ) )
            // InternalAutomatedRestTesting.g:3486:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_0()); 
            // InternalAutomatedRestTesting.g:3487:2: ( rule__Expression__RelationalOperatorAssignment_0 )
            // InternalAutomatedRestTesting.g:3487:3: rule__Expression__RelationalOperatorAssignment_0
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
    // InternalAutomatedRestTesting.g:3495:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3499:1: ( rule__Expression__Group__1__Impl )
            // InternalAutomatedRestTesting.g:3500:2: rule__Expression__Group__1__Impl
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
    // InternalAutomatedRestTesting.g:3506:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3510:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalAutomatedRestTesting.g:3511:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:3511:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalAutomatedRestTesting.g:3512:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAutomatedRestTesting.g:3513:2: ( rule__Expression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||LA29_0==RULE_INT||LA29_0==69) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3513:3: rule__Expression__Group_1__0
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
    // InternalAutomatedRestTesting.g:3522:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3526:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAutomatedRestTesting.g:3527:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAutomatedRestTesting.g:3534:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3538:1: ( ( ( rule__Expression__Group_1_0__0 )? ) )
            // InternalAutomatedRestTesting.g:3539:1: ( ( rule__Expression__Group_1_0__0 )? )
            {
            // InternalAutomatedRestTesting.g:3539:1: ( ( rule__Expression__Group_1_0__0 )? )
            // InternalAutomatedRestTesting.g:3540:2: ( rule__Expression__Group_1_0__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            // InternalAutomatedRestTesting.g:3541:2: ( rule__Expression__Group_1_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3541:3: rule__Expression__Group_1_0__0
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
    // InternalAutomatedRestTesting.g:3549:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3553:1: ( rule__Expression__Group_1__1__Impl )
            // InternalAutomatedRestTesting.g:3554:2: rule__Expression__Group_1__1__Impl
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
    // InternalAutomatedRestTesting.g:3560:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3564:1: ( ( ( rule__Expression__ExpectedValueAssignment_1_1 ) ) )
            // InternalAutomatedRestTesting.g:3565:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            {
            // InternalAutomatedRestTesting.g:3565:1: ( ( rule__Expression__ExpectedValueAssignment_1_1 ) )
            // InternalAutomatedRestTesting.g:3566:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpectedValueAssignment_1_1()); 
            // InternalAutomatedRestTesting.g:3567:2: ( rule__Expression__ExpectedValueAssignment_1_1 )
            // InternalAutomatedRestTesting.g:3567:3: rule__Expression__ExpectedValueAssignment_1_1
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
    // InternalAutomatedRestTesting.g:3576:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3580:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // InternalAutomatedRestTesting.g:3581:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAutomatedRestTesting.g:3588:1: rule__Expression__Group_1_0__0__Impl : ( 'parameter' ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3592:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3593:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3593:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3594:2: 'parameter'
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
    // InternalAutomatedRestTesting.g:3603:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3607:1: ( rule__Expression__Group_1_0__1__Impl )
            // InternalAutomatedRestTesting.g:3608:2: rule__Expression__Group_1_0__1__Impl
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
    // InternalAutomatedRestTesting.g:3614:1: rule__Expression__Group_1_0__1__Impl : ( ( rule__Expression__Alternatives_1_0_1 ) ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3618:1: ( ( ( rule__Expression__Alternatives_1_0_1 ) ) )
            // InternalAutomatedRestTesting.g:3619:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            {
            // InternalAutomatedRestTesting.g:3619:1: ( ( rule__Expression__Alternatives_1_0_1 ) )
            // InternalAutomatedRestTesting.g:3620:2: ( rule__Expression__Alternatives_1_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0_1()); 
            // InternalAutomatedRestTesting.g:3621:2: ( rule__Expression__Alternatives_1_0_1 )
            // InternalAutomatedRestTesting.g:3621:3: rule__Expression__Alternatives_1_0_1
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
    // InternalAutomatedRestTesting.g:3630:1: rule__MappingElement__Group__0 : rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 ;
    public final void rule__MappingElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3634:1: ( rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1 )
            // InternalAutomatedRestTesting.g:3635:2: rule__MappingElement__Group__0__Impl rule__MappingElement__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAutomatedRestTesting.g:3642:1: rule__MappingElement__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__MappingElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3646:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3647:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3647:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:3648:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:3657:1: rule__MappingElement__Group__1 : rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 ;
    public final void rule__MappingElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3661:1: ( rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2 )
            // InternalAutomatedRestTesting.g:3662:2: rule__MappingElement__Group__1__Impl rule__MappingElement__Group__2
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
    // InternalAutomatedRestTesting.g:3669:1: rule__MappingElement__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__MappingElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3673:1: ( ( 'parameter' ) )
            // InternalAutomatedRestTesting.g:3674:1: ( 'parameter' )
            {
            // InternalAutomatedRestTesting.g:3674:1: ( 'parameter' )
            // InternalAutomatedRestTesting.g:3675:2: 'parameter'
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
    // InternalAutomatedRestTesting.g:3684:1: rule__MappingElement__Group__2 : rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 ;
    public final void rule__MappingElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3688:1: ( rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3 )
            // InternalAutomatedRestTesting.g:3689:2: rule__MappingElement__Group__2__Impl rule__MappingElement__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAutomatedRestTesting.g:3696:1: rule__MappingElement__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3700:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3701:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3701:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3702:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3711:1: rule__MappingElement__Group__3 : rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 ;
    public final void rule__MappingElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3715:1: ( rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4 )
            // InternalAutomatedRestTesting.g:3716:2: rule__MappingElement__Group__3__Impl rule__MappingElement__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalAutomatedRestTesting.g:3723:1: rule__MappingElement__Group__3__Impl : ( ( rule__MappingElement__ParameterAssignment_3 ) ) ;
    public final void rule__MappingElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3727:1: ( ( ( rule__MappingElement__ParameterAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:3728:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:3728:1: ( ( rule__MappingElement__ParameterAssignment_3 ) )
            // InternalAutomatedRestTesting.g:3729:2: ( rule__MappingElement__ParameterAssignment_3 )
            {
             before(grammarAccess.getMappingElementAccess().getParameterAssignment_3()); 
            // InternalAutomatedRestTesting.g:3730:2: ( rule__MappingElement__ParameterAssignment_3 )
            // InternalAutomatedRestTesting.g:3730:3: rule__MappingElement__ParameterAssignment_3
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
    // InternalAutomatedRestTesting.g:3738:1: rule__MappingElement__Group__4 : rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 ;
    public final void rule__MappingElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3742:1: ( rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5 )
            // InternalAutomatedRestTesting.g:3743:2: rule__MappingElement__Group__4__Impl rule__MappingElement__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalAutomatedRestTesting.g:3750:1: rule__MappingElement__Group__4__Impl : ( RULE_COMMA ) ;
    public final void rule__MappingElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3754:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:3755:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:3755:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:3756:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:3765:1: rule__MappingElement__Group__5 : rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 ;
    public final void rule__MappingElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3769:1: ( rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6 )
            // InternalAutomatedRestTesting.g:3770:2: rule__MappingElement__Group__5__Impl rule__MappingElement__Group__6
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
    // InternalAutomatedRestTesting.g:3777:1: rule__MappingElement__Group__5__Impl : ( 'value' ) ;
    public final void rule__MappingElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3781:1: ( ( 'value' ) )
            // InternalAutomatedRestTesting.g:3782:1: ( 'value' )
            {
            // InternalAutomatedRestTesting.g:3782:1: ( 'value' )
            // InternalAutomatedRestTesting.g:3783:2: 'value'
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
    // InternalAutomatedRestTesting.g:3792:1: rule__MappingElement__Group__6 : rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 ;
    public final void rule__MappingElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3796:1: ( rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7 )
            // InternalAutomatedRestTesting.g:3797:2: rule__MappingElement__Group__6__Impl rule__MappingElement__Group__7
            {
            pushFollow(FOLLOW_40);
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
    // InternalAutomatedRestTesting.g:3804:1: rule__MappingElement__Group__6__Impl : ( RULE_EQUAL ) ;
    public final void rule__MappingElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3808:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:3809:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:3809:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:3810:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:3819:1: rule__MappingElement__Group__7 : rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 ;
    public final void rule__MappingElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3823:1: ( rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8 )
            // InternalAutomatedRestTesting.g:3824:2: rule__MappingElement__Group__7__Impl rule__MappingElement__Group__8
            {
            pushFollow(FOLLOW_40);
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
    // InternalAutomatedRestTesting.g:3831:1: rule__MappingElement__Group__7__Impl : ( ( rule__MappingElement__Group_7__0 )? ) ;
    public final void rule__MappingElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3835:1: ( ( ( rule__MappingElement__Group_7__0 )? ) )
            // InternalAutomatedRestTesting.g:3836:1: ( ( rule__MappingElement__Group_7__0 )? )
            {
            // InternalAutomatedRestTesting.g:3836:1: ( ( rule__MappingElement__Group_7__0 )? )
            // InternalAutomatedRestTesting.g:3837:2: ( rule__MappingElement__Group_7__0 )?
            {
             before(grammarAccess.getMappingElementAccess().getGroup_7()); 
            // InternalAutomatedRestTesting.g:3838:2: ( rule__MappingElement__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAutomatedRestTesting.g:3838:3: rule__MappingElement__Group_7__0
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
    // InternalAutomatedRestTesting.g:3846:1: rule__MappingElement__Group__8 : rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 ;
    public final void rule__MappingElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3850:1: ( rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9 )
            // InternalAutomatedRestTesting.g:3851:2: rule__MappingElement__Group__8__Impl rule__MappingElement__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalAutomatedRestTesting.g:3858:1: rule__MappingElement__Group__8__Impl : ( ( rule__MappingElement__ValueAssignment_8 ) ) ;
    public final void rule__MappingElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3862:1: ( ( ( rule__MappingElement__ValueAssignment_8 ) ) )
            // InternalAutomatedRestTesting.g:3863:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            {
            // InternalAutomatedRestTesting.g:3863:1: ( ( rule__MappingElement__ValueAssignment_8 ) )
            // InternalAutomatedRestTesting.g:3864:2: ( rule__MappingElement__ValueAssignment_8 )
            {
             before(grammarAccess.getMappingElementAccess().getValueAssignment_8()); 
            // InternalAutomatedRestTesting.g:3865:2: ( rule__MappingElement__ValueAssignment_8 )
            // InternalAutomatedRestTesting.g:3865:3: rule__MappingElement__ValueAssignment_8
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
    // InternalAutomatedRestTesting.g:3873:1: rule__MappingElement__Group__9 : rule__MappingElement__Group__9__Impl ;
    public final void rule__MappingElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3877:1: ( rule__MappingElement__Group__9__Impl )
            // InternalAutomatedRestTesting.g:3878:2: rule__MappingElement__Group__9__Impl
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
    // InternalAutomatedRestTesting.g:3884:1: rule__MappingElement__Group__9__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__MappingElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3888:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:3889:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:3889:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:3890:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:3900:1: rule__MappingElement__Group_7__0 : rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 ;
    public final void rule__MappingElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3904:1: ( rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1 )
            // InternalAutomatedRestTesting.g:3905:2: rule__MappingElement__Group_7__0__Impl rule__MappingElement__Group_7__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAutomatedRestTesting.g:3912:1: rule__MappingElement__Group_7__0__Impl : ( 'request' ) ;
    public final void rule__MappingElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3916:1: ( ( 'request' ) )
            // InternalAutomatedRestTesting.g:3917:1: ( 'request' )
            {
            // InternalAutomatedRestTesting.g:3917:1: ( 'request' )
            // InternalAutomatedRestTesting.g:3918:2: 'request'
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
    // InternalAutomatedRestTesting.g:3927:1: rule__MappingElement__Group_7__1 : rule__MappingElement__Group_7__1__Impl ;
    public final void rule__MappingElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3931:1: ( rule__MappingElement__Group_7__1__Impl )
            // InternalAutomatedRestTesting.g:3932:2: rule__MappingElement__Group_7__1__Impl
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
    // InternalAutomatedRestTesting.g:3938:1: rule__MappingElement__Group_7__1__Impl : ( RULE_ARROW ) ;
    public final void rule__MappingElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3942:1: ( ( RULE_ARROW ) )
            // InternalAutomatedRestTesting.g:3943:1: ( RULE_ARROW )
            {
            // InternalAutomatedRestTesting.g:3943:1: ( RULE_ARROW )
            // InternalAutomatedRestTesting.g:3944:2: RULE_ARROW
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


    // $ANTLR start "rule__Restriction__Group__0"
    // InternalAutomatedRestTesting.g:3954:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3958:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAutomatedRestTesting.g:3959:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
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
    // InternalAutomatedRestTesting.g:3966:1: rule__Restriction__Group__0__Impl : ( () ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3970:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:3971:1: ( () )
            {
            // InternalAutomatedRestTesting.g:3971:1: ( () )
            // InternalAutomatedRestTesting.g:3972:2: ()
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionAction_0()); 
            // InternalAutomatedRestTesting.g:3973:2: ()
            // InternalAutomatedRestTesting.g:3973:3: 
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
    // InternalAutomatedRestTesting.g:3981:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3985:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // InternalAutomatedRestTesting.g:3986:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
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
    // InternalAutomatedRestTesting.g:3993:1: rule__Restriction__Group__1__Impl : ( 'mockType' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:3997:1: ( ( 'mockType' ) )
            // InternalAutomatedRestTesting.g:3998:1: ( 'mockType' )
            {
            // InternalAutomatedRestTesting.g:3998:1: ( 'mockType' )
            // InternalAutomatedRestTesting.g:3999:2: 'mockType'
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
    // InternalAutomatedRestTesting.g:4008:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4012:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // InternalAutomatedRestTesting.g:4013:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
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
    // InternalAutomatedRestTesting.g:4020:1: rule__Restriction__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4024:1: ( ( RULE_EQUAL ) )
            // InternalAutomatedRestTesting.g:4025:1: ( RULE_EQUAL )
            {
            // InternalAutomatedRestTesting.g:4025:1: ( RULE_EQUAL )
            // InternalAutomatedRestTesting.g:4026:2: RULE_EQUAL
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
    // InternalAutomatedRestTesting.g:4035:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4039:1: ( rule__Restriction__Group__3__Impl )
            // InternalAutomatedRestTesting.g:4040:2: rule__Restriction__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:4046:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__MockTypeAssignment_3 ) ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4050:1: ( ( ( rule__Restriction__MockTypeAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4051:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4051:1: ( ( rule__Restriction__MockTypeAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4052:2: ( rule__Restriction__MockTypeAssignment_3 )
            {
             before(grammarAccess.getRestrictionAccess().getMockTypeAssignment_3()); 
            // InternalAutomatedRestTesting.g:4053:2: ( rule__Restriction__MockTypeAssignment_3 )
            // InternalAutomatedRestTesting.g:4053:3: rule__Restriction__MockTypeAssignment_3
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
    // InternalAutomatedRestTesting.g:4062:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4066:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAutomatedRestTesting.g:4067:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalAutomatedRestTesting.g:4074:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4078:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4079:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4079:1: ( () )
            // InternalAutomatedRestTesting.g:4080:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalAutomatedRestTesting.g:4081:2: ()
            // InternalAutomatedRestTesting.g:4081:3: 
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
    // InternalAutomatedRestTesting.g:4089:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4093:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAutomatedRestTesting.g:4094:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalAutomatedRestTesting.g:4101:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4105:1: ( ( 'Entity' ) )
            // InternalAutomatedRestTesting.g:4106:1: ( 'Entity' )
            {
            // InternalAutomatedRestTesting.g:4106:1: ( 'Entity' )
            // InternalAutomatedRestTesting.g:4107:2: 'Entity'
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
    // InternalAutomatedRestTesting.g:4116:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4120:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAutomatedRestTesting.g:4121:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalAutomatedRestTesting.g:4128:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4132:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:4133:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:4133:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:4134:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:4135:2: ( rule__Entity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:4135:3: rule__Entity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:4143:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4147:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAutomatedRestTesting.g:4148:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalAutomatedRestTesting.g:4155:1: rule__Entity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4159:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4160:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4160:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4161:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4170:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4174:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAutomatedRestTesting.g:4175:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalAutomatedRestTesting.g:4182:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4186:1: ( ( ( rule__Entity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4187:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4187:1: ( ( rule__Entity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4188:2: ( rule__Entity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4189:2: ( rule__Entity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4189:3: rule__Entity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4197:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4201:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAutomatedRestTesting.g:4202:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
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
    // InternalAutomatedRestTesting.g:4209:1: rule__Entity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4213:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4214:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4214:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4215:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4224:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4228:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAutomatedRestTesting.g:4229:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
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
    // InternalAutomatedRestTesting.g:4236:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4240:1: ( ( ( rule__Entity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:4241:1: ( ( rule__Entity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:4241:1: ( ( rule__Entity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:4242:2: ( rule__Entity__Group_6__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:4243:2: ( rule__Entity__Group_6__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=27 && LA32_0<=31)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:4243:3: rule__Entity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:4251:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4255:1: ( rule__Entity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:4256:2: rule__Entity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:4262:1: rule__Entity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4266:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4267:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4267:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4268:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4278:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4282:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalAutomatedRestTesting.g:4283:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
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
    // InternalAutomatedRestTesting.g:4290:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4294:1: ( ( ( rule__Entity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:4295:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:4295:1: ( ( rule__Entity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:4296:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:4297:2: ( rule__Entity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:4297:3: rule__Entity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:4305:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4309:1: ( rule__Entity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:4310:2: rule__Entity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:4316:1: rule__Entity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4320:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4321:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4321:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4322:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:4332:1: rule__Attribute_Impl__Group__0 : rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 ;
    public final void rule__Attribute_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4336:1: ( rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1 )
            // InternalAutomatedRestTesting.g:4337:2: rule__Attribute_Impl__Group__0__Impl rule__Attribute_Impl__Group__1
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
    // InternalAutomatedRestTesting.g:4344:1: rule__Attribute_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Attribute_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4348:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4349:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4349:1: ( () )
            // InternalAutomatedRestTesting.g:4350:2: ()
            {
             before(grammarAccess.getAttribute_ImplAccess().getAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4351:2: ()
            // InternalAutomatedRestTesting.g:4351:3: 
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
    // InternalAutomatedRestTesting.g:4359:1: rule__Attribute_Impl__Group__1 : rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 ;
    public final void rule__Attribute_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4363:1: ( rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2 )
            // InternalAutomatedRestTesting.g:4364:2: rule__Attribute_Impl__Group__1__Impl rule__Attribute_Impl__Group__2
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
    // InternalAutomatedRestTesting.g:4371:1: rule__Attribute_Impl__Group__1__Impl : ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) ;
    public final void rule__Attribute_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4375:1: ( ( ( rule__Attribute_Impl__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4376:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4376:1: ( ( rule__Attribute_Impl__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4377:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4378:2: ( rule__Attribute_Impl__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4378:3: rule__Attribute_Impl__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4386:1: rule__Attribute_Impl__Group__2 : rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 ;
    public final void rule__Attribute_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4390:1: ( rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3 )
            // InternalAutomatedRestTesting.g:4391:2: rule__Attribute_Impl__Group__2__Impl rule__Attribute_Impl__Group__3
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
    // InternalAutomatedRestTesting.g:4398:1: rule__Attribute_Impl__Group__2__Impl : ( ( rule__Attribute_Impl__Group_2__0 )? ) ;
    public final void rule__Attribute_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4402:1: ( ( ( rule__Attribute_Impl__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4403:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4403:1: ( ( rule__Attribute_Impl__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4404:2: ( rule__Attribute_Impl__Group_2__0 )?
            {
             before(grammarAccess.getAttribute_ImplAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4405:2: ( rule__Attribute_Impl__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4405:3: rule__Attribute_Impl__Group_2__0
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
    // InternalAutomatedRestTesting.g:4413:1: rule__Attribute_Impl__Group__3 : rule__Attribute_Impl__Group__3__Impl ;
    public final void rule__Attribute_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4417:1: ( rule__Attribute_Impl__Group__3__Impl )
            // InternalAutomatedRestTesting.g:4418:2: rule__Attribute_Impl__Group__3__Impl
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
    // InternalAutomatedRestTesting.g:4424:1: rule__Attribute_Impl__Group__3__Impl : ( ( rule__Attribute_Impl__NameAssignment_3 ) ) ;
    public final void rule__Attribute_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4428:1: ( ( ( rule__Attribute_Impl__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4429:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4429:1: ( ( rule__Attribute_Impl__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4430:2: ( rule__Attribute_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4431:2: ( rule__Attribute_Impl__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4431:3: rule__Attribute_Impl__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4440:1: rule__Attribute_Impl__Group_2__0 : rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 ;
    public final void rule__Attribute_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4444:1: ( rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1 )
            // InternalAutomatedRestTesting.g:4445:2: rule__Attribute_Impl__Group_2__0__Impl rule__Attribute_Impl__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:4452:1: rule__Attribute_Impl__Group_2__0__Impl : ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) ;
    public final void rule__Attribute_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4456:1: ( ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4457:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4457:1: ( ( rule__Attribute_Impl__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4458:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getAttribute_ImplAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4459:2: ( rule__Attribute_Impl__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4459:3: rule__Attribute_Impl__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4467:1: rule__Attribute_Impl__Group_2__1 : rule__Attribute_Impl__Group_2__1__Impl ;
    public final void rule__Attribute_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4471:1: ( rule__Attribute_Impl__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4472:2: rule__Attribute_Impl__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4478:1: rule__Attribute_Impl__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__Attribute_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4482:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4483:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4483:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4484:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4494:1: rule__DomainAttribute__Group__0 : rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 ;
    public final void rule__DomainAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4498:1: ( rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1 )
            // InternalAutomatedRestTesting.g:4499:2: rule__DomainAttribute__Group__0__Impl rule__DomainAttribute__Group__1
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
    // InternalAutomatedRestTesting.g:4506:1: rule__DomainAttribute__Group__0__Impl : ( () ) ;
    public final void rule__DomainAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4510:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4511:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4511:1: ( () )
            // InternalAutomatedRestTesting.g:4512:2: ()
            {
             before(grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0()); 
            // InternalAutomatedRestTesting.g:4513:2: ()
            // InternalAutomatedRestTesting.g:4513:3: 
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
    // InternalAutomatedRestTesting.g:4521:1: rule__DomainAttribute__Group__1 : rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 ;
    public final void rule__DomainAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4525:1: ( rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2 )
            // InternalAutomatedRestTesting.g:4526:2: rule__DomainAttribute__Group__1__Impl rule__DomainAttribute__Group__2
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
    // InternalAutomatedRestTesting.g:4533:1: rule__DomainAttribute__Group__1__Impl : ( ( rule__DomainAttribute__TypeAssignment_1 ) ) ;
    public final void rule__DomainAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4537:1: ( ( ( rule__DomainAttribute__TypeAssignment_1 ) ) )
            // InternalAutomatedRestTesting.g:4538:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            {
            // InternalAutomatedRestTesting.g:4538:1: ( ( rule__DomainAttribute__TypeAssignment_1 ) )
            // InternalAutomatedRestTesting.g:4539:2: ( rule__DomainAttribute__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAttributeAccess().getTypeAssignment_1()); 
            // InternalAutomatedRestTesting.g:4540:2: ( rule__DomainAttribute__TypeAssignment_1 )
            // InternalAutomatedRestTesting.g:4540:3: rule__DomainAttribute__TypeAssignment_1
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
    // InternalAutomatedRestTesting.g:4548:1: rule__DomainAttribute__Group__2 : rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 ;
    public final void rule__DomainAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4552:1: ( rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3 )
            // InternalAutomatedRestTesting.g:4553:2: rule__DomainAttribute__Group__2__Impl rule__DomainAttribute__Group__3
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
    // InternalAutomatedRestTesting.g:4560:1: rule__DomainAttribute__Group__2__Impl : ( ( rule__DomainAttribute__Group_2__0 )? ) ;
    public final void rule__DomainAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4564:1: ( ( ( rule__DomainAttribute__Group_2__0 )? ) )
            // InternalAutomatedRestTesting.g:4565:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            {
            // InternalAutomatedRestTesting.g:4565:1: ( ( rule__DomainAttribute__Group_2__0 )? )
            // InternalAutomatedRestTesting.g:4566:2: ( rule__DomainAttribute__Group_2__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_2()); 
            // InternalAutomatedRestTesting.g:4567:2: ( rule__DomainAttribute__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4567:3: rule__DomainAttribute__Group_2__0
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
    // InternalAutomatedRestTesting.g:4575:1: rule__DomainAttribute__Group__3 : rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 ;
    public final void rule__DomainAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4579:1: ( rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4 )
            // InternalAutomatedRestTesting.g:4580:2: rule__DomainAttribute__Group__3__Impl rule__DomainAttribute__Group__4
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
    // InternalAutomatedRestTesting.g:4587:1: rule__DomainAttribute__Group__3__Impl : ( ( rule__DomainAttribute__NameAssignment_3 ) ) ;
    public final void rule__DomainAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4591:1: ( ( ( rule__DomainAttribute__NameAssignment_3 ) ) )
            // InternalAutomatedRestTesting.g:4592:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            {
            // InternalAutomatedRestTesting.g:4592:1: ( ( rule__DomainAttribute__NameAssignment_3 ) )
            // InternalAutomatedRestTesting.g:4593:2: ( rule__DomainAttribute__NameAssignment_3 )
            {
             before(grammarAccess.getDomainAttributeAccess().getNameAssignment_3()); 
            // InternalAutomatedRestTesting.g:4594:2: ( rule__DomainAttribute__NameAssignment_3 )
            // InternalAutomatedRestTesting.g:4594:3: rule__DomainAttribute__NameAssignment_3
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
    // InternalAutomatedRestTesting.g:4602:1: rule__DomainAttribute__Group__4 : rule__DomainAttribute__Group__4__Impl ;
    public final void rule__DomainAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4606:1: ( rule__DomainAttribute__Group__4__Impl )
            // InternalAutomatedRestTesting.g:4607:2: rule__DomainAttribute__Group__4__Impl
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
    // InternalAutomatedRestTesting.g:4613:1: rule__DomainAttribute__Group__4__Impl : ( ( rule__DomainAttribute__Group_4__0 )? ) ;
    public final void rule__DomainAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4617:1: ( ( ( rule__DomainAttribute__Group_4__0 )? ) )
            // InternalAutomatedRestTesting.g:4618:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            {
            // InternalAutomatedRestTesting.g:4618:1: ( ( rule__DomainAttribute__Group_4__0 )? )
            // InternalAutomatedRestTesting.g:4619:2: ( rule__DomainAttribute__Group_4__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4()); 
            // InternalAutomatedRestTesting.g:4620:2: ( rule__DomainAttribute__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LEFT_PARENTHESIS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4620:3: rule__DomainAttribute__Group_4__0
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
    // InternalAutomatedRestTesting.g:4629:1: rule__DomainAttribute__Group_2__0 : rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 ;
    public final void rule__DomainAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4633:1: ( rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1 )
            // InternalAutomatedRestTesting.g:4634:2: rule__DomainAttribute__Group_2__0__Impl rule__DomainAttribute__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAutomatedRestTesting.g:4641:1: rule__DomainAttribute__Group_2__0__Impl : ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) ;
    public final void rule__DomainAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4645:1: ( ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) ) )
            // InternalAutomatedRestTesting.g:4646:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            {
            // InternalAutomatedRestTesting.g:4646:1: ( ( rule__DomainAttribute__IsArrayAssignment_2_0 ) )
            // InternalAutomatedRestTesting.g:4647:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getIsArrayAssignment_2_0()); 
            // InternalAutomatedRestTesting.g:4648:2: ( rule__DomainAttribute__IsArrayAssignment_2_0 )
            // InternalAutomatedRestTesting.g:4648:3: rule__DomainAttribute__IsArrayAssignment_2_0
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
    // InternalAutomatedRestTesting.g:4656:1: rule__DomainAttribute__Group_2__1 : rule__DomainAttribute__Group_2__1__Impl ;
    public final void rule__DomainAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4660:1: ( rule__DomainAttribute__Group_2__1__Impl )
            // InternalAutomatedRestTesting.g:4661:2: rule__DomainAttribute__Group_2__1__Impl
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
    // InternalAutomatedRestTesting.g:4667:1: rule__DomainAttribute__Group_2__1__Impl : ( RULE_SQUARE_RIGHT_BRACKET ) ;
    public final void rule__DomainAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4671:1: ( ( RULE_SQUARE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4672:1: ( RULE_SQUARE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4672:1: ( RULE_SQUARE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:4673:2: RULE_SQUARE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:4683:1: rule__DomainAttribute__Group_4__0 : rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 ;
    public final void rule__DomainAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4687:1: ( rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1 )
            // InternalAutomatedRestTesting.g:4688:2: rule__DomainAttribute__Group_4__0__Impl rule__DomainAttribute__Group_4__1
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
    // InternalAutomatedRestTesting.g:4695:1: rule__DomainAttribute__Group_4__0__Impl : ( RULE_LEFT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4699:1: ( ( RULE_LEFT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4700:1: ( RULE_LEFT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4700:1: ( RULE_LEFT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4701:2: RULE_LEFT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4710:1: rule__DomainAttribute__Group_4__1 : rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 ;
    public final void rule__DomainAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4714:1: ( rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2 )
            // InternalAutomatedRestTesting.g:4715:2: rule__DomainAttribute__Group_4__1__Impl rule__DomainAttribute__Group_4__2
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
    // InternalAutomatedRestTesting.g:4722:1: rule__DomainAttribute__Group_4__1__Impl : ( ( rule__DomainAttribute__Group_4_1__0 )? ) ;
    public final void rule__DomainAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4726:1: ( ( ( rule__DomainAttribute__Group_4_1__0 )? ) )
            // InternalAutomatedRestTesting.g:4727:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            {
            // InternalAutomatedRestTesting.g:4727:1: ( ( rule__DomainAttribute__Group_4_1__0 )? )
            // InternalAutomatedRestTesting.g:4728:2: ( rule__DomainAttribute__Group_4_1__0 )?
            {
             before(grammarAccess.getDomainAttributeAccess().getGroup_4_1()); 
            // InternalAutomatedRestTesting.g:4729:2: ( rule__DomainAttribute__Group_4_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAutomatedRestTesting.g:4729:3: rule__DomainAttribute__Group_4_1__0
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
    // InternalAutomatedRestTesting.g:4737:1: rule__DomainAttribute__Group_4__2 : rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 ;
    public final void rule__DomainAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4741:1: ( rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3 )
            // InternalAutomatedRestTesting.g:4742:2: rule__DomainAttribute__Group_4__2__Impl rule__DomainAttribute__Group_4__3
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
    // InternalAutomatedRestTesting.g:4749:1: rule__DomainAttribute__Group_4__2__Impl : ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) ;
    public final void rule__DomainAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4753:1: ( ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) ) )
            // InternalAutomatedRestTesting.g:4754:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            {
            // InternalAutomatedRestTesting.g:4754:1: ( ( rule__DomainAttribute__RestrictionsAssignment_4_2 ) )
            // InternalAutomatedRestTesting.g:4755:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            {
             before(grammarAccess.getDomainAttributeAccess().getRestrictionsAssignment_4_2()); 
            // InternalAutomatedRestTesting.g:4756:2: ( rule__DomainAttribute__RestrictionsAssignment_4_2 )
            // InternalAutomatedRestTesting.g:4756:3: rule__DomainAttribute__RestrictionsAssignment_4_2
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
    // InternalAutomatedRestTesting.g:4764:1: rule__DomainAttribute__Group_4__3 : rule__DomainAttribute__Group_4__3__Impl ;
    public final void rule__DomainAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4768:1: ( rule__DomainAttribute__Group_4__3__Impl )
            // InternalAutomatedRestTesting.g:4769:2: rule__DomainAttribute__Group_4__3__Impl
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
    // InternalAutomatedRestTesting.g:4775:1: rule__DomainAttribute__Group_4__3__Impl : ( RULE_RIGHT_PARENTHESIS ) ;
    public final void rule__DomainAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4779:1: ( ( RULE_RIGHT_PARENTHESIS ) )
            // InternalAutomatedRestTesting.g:4780:1: ( RULE_RIGHT_PARENTHESIS )
            {
            // InternalAutomatedRestTesting.g:4780:1: ( RULE_RIGHT_PARENTHESIS )
            // InternalAutomatedRestTesting.g:4781:2: RULE_RIGHT_PARENTHESIS
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
    // InternalAutomatedRestTesting.g:4791:1: rule__DomainAttribute__Group_4_1__0 : rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 ;
    public final void rule__DomainAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4795:1: ( rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1 )
            // InternalAutomatedRestTesting.g:4796:2: rule__DomainAttribute__Group_4_1__0__Impl rule__DomainAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAutomatedRestTesting.g:4803:1: rule__DomainAttribute__Group_4_1__0__Impl : ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) ;
    public final void rule__DomainAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4807:1: ( ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) ) )
            // InternalAutomatedRestTesting.g:4808:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            {
            // InternalAutomatedRestTesting.g:4808:1: ( ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 ) )
            // InternalAutomatedRestTesting.g:4809:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyAssignment_4_1_0()); 
            // InternalAutomatedRestTesting.g:4810:2: ( rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 )
            // InternalAutomatedRestTesting.g:4810:3: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0
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
    // InternalAutomatedRestTesting.g:4818:1: rule__DomainAttribute__Group_4_1__1 : rule__DomainAttribute__Group_4_1__1__Impl ;
    public final void rule__DomainAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4822:1: ( rule__DomainAttribute__Group_4_1__1__Impl )
            // InternalAutomatedRestTesting.g:4823:2: rule__DomainAttribute__Group_4_1__1__Impl
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
    // InternalAutomatedRestTesting.g:4829:1: rule__DomainAttribute__Group_4_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__DomainAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4833:1: ( ( RULE_COMMA ) )
            // InternalAutomatedRestTesting.g:4834:1: ( RULE_COMMA )
            {
            // InternalAutomatedRestTesting.g:4834:1: ( RULE_COMMA )
            // InternalAutomatedRestTesting.g:4835:2: RULE_COMMA
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
    // InternalAutomatedRestTesting.g:4845:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4849:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalAutomatedRestTesting.g:4850:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalAutomatedRestTesting.g:4857:1: rule__SimpleEntity__Group__0__Impl : ( () ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4861:1: ( ( () ) )
            // InternalAutomatedRestTesting.g:4862:1: ( () )
            {
            // InternalAutomatedRestTesting.g:4862:1: ( () )
            // InternalAutomatedRestTesting.g:4863:2: ()
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0()); 
            // InternalAutomatedRestTesting.g:4864:2: ()
            // InternalAutomatedRestTesting.g:4864:3: 
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
    // InternalAutomatedRestTesting.g:4872:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4876:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalAutomatedRestTesting.g:4877:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalAutomatedRestTesting.g:4884:1: rule__SimpleEntity__Group__1__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4888:1: ( ( 'SimpleEntity' ) )
            // InternalAutomatedRestTesting.g:4889:1: ( 'SimpleEntity' )
            {
            // InternalAutomatedRestTesting.g:4889:1: ( 'SimpleEntity' )
            // InternalAutomatedRestTesting.g:4890:2: 'SimpleEntity'
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
    // InternalAutomatedRestTesting.g:4899:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4903:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalAutomatedRestTesting.g:4904:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalAutomatedRestTesting.g:4911:1: rule__SimpleEntity__Group__2__Impl : ( ( rule__SimpleEntity__NameAssignment_2 ) ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4915:1: ( ( ( rule__SimpleEntity__NameAssignment_2 ) ) )
            // InternalAutomatedRestTesting.g:4916:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            {
            // InternalAutomatedRestTesting.g:4916:1: ( ( rule__SimpleEntity__NameAssignment_2 ) )
            // InternalAutomatedRestTesting.g:4917:2: ( rule__SimpleEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_2()); 
            // InternalAutomatedRestTesting.g:4918:2: ( rule__SimpleEntity__NameAssignment_2 )
            // InternalAutomatedRestTesting.g:4918:3: rule__SimpleEntity__NameAssignment_2
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
    // InternalAutomatedRestTesting.g:4926:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4930:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalAutomatedRestTesting.g:4931:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
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
    // InternalAutomatedRestTesting.g:4938:1: rule__SimpleEntity__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4942:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:4943:1: ( RULE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:4943:1: ( RULE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:4944:2: RULE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:4953:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4957:1: ( rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5 )
            // InternalAutomatedRestTesting.g:4958:2: rule__SimpleEntity__Group__4__Impl rule__SimpleEntity__Group__5
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
    // InternalAutomatedRestTesting.g:4965:1: rule__SimpleEntity__Group__4__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4969:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) ) )
            // InternalAutomatedRestTesting.g:4970:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            {
            // InternalAutomatedRestTesting.g:4970:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_4 ) )
            // InternalAutomatedRestTesting.g:4971:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_4()); 
            // InternalAutomatedRestTesting.g:4972:2: ( rule__SimpleEntity__EntityAttributesAssignment_4 )
            // InternalAutomatedRestTesting.g:4972:3: rule__SimpleEntity__EntityAttributesAssignment_4
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
    // InternalAutomatedRestTesting.g:4980:1: rule__SimpleEntity__Group__5 : rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 ;
    public final void rule__SimpleEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4984:1: ( rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6 )
            // InternalAutomatedRestTesting.g:4985:2: rule__SimpleEntity__Group__5__Impl rule__SimpleEntity__Group__6
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
    // InternalAutomatedRestTesting.g:4992:1: rule__SimpleEntity__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:4996:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:4997:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:4997:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:4998:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:5007:1: rule__SimpleEntity__Group__6 : rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 ;
    public final void rule__SimpleEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5011:1: ( rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7 )
            // InternalAutomatedRestTesting.g:5012:2: rule__SimpleEntity__Group__6__Impl rule__SimpleEntity__Group__7
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
    // InternalAutomatedRestTesting.g:5019:1: rule__SimpleEntity__Group__6__Impl : ( ( rule__SimpleEntity__Group_6__0 )* ) ;
    public final void rule__SimpleEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5023:1: ( ( ( rule__SimpleEntity__Group_6__0 )* ) )
            // InternalAutomatedRestTesting.g:5024:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            {
            // InternalAutomatedRestTesting.g:5024:1: ( ( rule__SimpleEntity__Group_6__0 )* )
            // InternalAutomatedRestTesting.g:5025:2: ( rule__SimpleEntity__Group_6__0 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup_6()); 
            // InternalAutomatedRestTesting.g:5026:2: ( rule__SimpleEntity__Group_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=27 && LA37_0<=31)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:5026:3: rule__SimpleEntity__Group_6__0
            	    {
            	    pushFollow(FOLLOW_47);
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
    // InternalAutomatedRestTesting.g:5034:1: rule__SimpleEntity__Group__7 : rule__SimpleEntity__Group__7__Impl ;
    public final void rule__SimpleEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5038:1: ( rule__SimpleEntity__Group__7__Impl )
            // InternalAutomatedRestTesting.g:5039:2: rule__SimpleEntity__Group__7__Impl
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
    // InternalAutomatedRestTesting.g:5045:1: rule__SimpleEntity__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__SimpleEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5049:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5050:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5050:1: ( RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:5051:2: RULE_RIGHT_BRACKET
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
    // InternalAutomatedRestTesting.g:5061:1: rule__SimpleEntity__Group_6__0 : rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 ;
    public final void rule__SimpleEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5065:1: ( rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1 )
            // InternalAutomatedRestTesting.g:5066:2: rule__SimpleEntity__Group_6__0__Impl rule__SimpleEntity__Group_6__1
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
    // InternalAutomatedRestTesting.g:5073:1: rule__SimpleEntity__Group_6__0__Impl : ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) ;
    public final void rule__SimpleEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5077:1: ( ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) ) )
            // InternalAutomatedRestTesting.g:5078:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            {
            // InternalAutomatedRestTesting.g:5078:1: ( ( rule__SimpleEntity__EntityAttributesAssignment_6_0 ) )
            // InternalAutomatedRestTesting.g:5079:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getEntityAttributesAssignment_6_0()); 
            // InternalAutomatedRestTesting.g:5080:2: ( rule__SimpleEntity__EntityAttributesAssignment_6_0 )
            // InternalAutomatedRestTesting.g:5080:3: rule__SimpleEntity__EntityAttributesAssignment_6_0
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
    // InternalAutomatedRestTesting.g:5088:1: rule__SimpleEntity__Group_6__1 : rule__SimpleEntity__Group_6__1__Impl ;
    public final void rule__SimpleEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5092:1: ( rule__SimpleEntity__Group_6__1__Impl )
            // InternalAutomatedRestTesting.g:5093:2: rule__SimpleEntity__Group_6__1__Impl
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
    // InternalAutomatedRestTesting.g:5099:1: rule__SimpleEntity__Group_6__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SimpleEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5103:1: ( ( RULE_SEMICOLON ) )
            // InternalAutomatedRestTesting.g:5104:1: ( RULE_SEMICOLON )
            {
            // InternalAutomatedRestTesting.g:5104:1: ( RULE_SEMICOLON )
            // InternalAutomatedRestTesting.g:5105:2: RULE_SEMICOLON
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
    // InternalAutomatedRestTesting.g:5115:1: rule__AutomatedRestTesting__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AutomatedRestTesting__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5119:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5120:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5120:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5121:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5130:1: rule__AutomatedRestTesting__DataElementsAssignment_5_0 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5134:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:5135:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:5135:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:5136:3: ruleElement
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
    // InternalAutomatedRestTesting.g:5145:1: rule__AutomatedRestTesting__DataElementsAssignment_5_1 : ( ruleElement ) ;
    public final void rule__AutomatedRestTesting__DataElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5149:1: ( ( ruleElement ) )
            // InternalAutomatedRestTesting.g:5150:2: ( ruleElement )
            {
            // InternalAutomatedRestTesting.g:5150:2: ( ruleElement )
            // InternalAutomatedRestTesting.g:5151:3: ruleElement
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
    // InternalAutomatedRestTesting.g:5160:1: rule__AutomatedRestTesting__ServicesAssignment_6_0 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5164:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5165:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5165:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5166:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5175:1: rule__AutomatedRestTesting__ServicesAssignment_6_1 : ( ruleRestService ) ;
    public final void rule__AutomatedRestTesting__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5179:1: ( ( ruleRestService ) )
            // InternalAutomatedRestTesting.g:5180:2: ( ruleRestService )
            {
            // InternalAutomatedRestTesting.g:5180:2: ( ruleRestService )
            // InternalAutomatedRestTesting.g:5181:3: ruleRestService
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
    // InternalAutomatedRestTesting.g:5190:1: rule__AutomatedRestTesting__TestsAssignment_7_0 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5194:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5195:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5195:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5196:3: ruleTest
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
    // InternalAutomatedRestTesting.g:5205:1: rule__AutomatedRestTesting__TestsAssignment_7_1 : ( ruleTest ) ;
    public final void rule__AutomatedRestTesting__TestsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5209:1: ( ( ruleTest ) )
            // InternalAutomatedRestTesting.g:5210:2: ( ruleTest )
            {
            // InternalAutomatedRestTesting.g:5210:2: ( ruleTest )
            // InternalAutomatedRestTesting.g:5211:3: ruleTest
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
    // InternalAutomatedRestTesting.g:5220:1: rule__RestService__MethodAssignment_0 : ( ruleMethodType ) ;
    public final void rule__RestService__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5224:1: ( ( ruleMethodType ) )
            // InternalAutomatedRestTesting.g:5225:2: ( ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:5225:2: ( ruleMethodType )
            // InternalAutomatedRestTesting.g:5226:3: ruleMethodType
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
    // InternalAutomatedRestTesting.g:5235:1: rule__RestService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RestService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5239:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5240:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5240:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5241:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5250:1: rule__RestService__UriAssignment_5 : ( ruleURL ) ;
    public final void rule__RestService__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5254:1: ( ( ruleURL ) )
            // InternalAutomatedRestTesting.g:5255:2: ( ruleURL )
            {
            // InternalAutomatedRestTesting.g:5255:2: ( ruleURL )
            // InternalAutomatedRestTesting.g:5256:3: ruleURL
            {
             before(grammarAccess.getRestServiceAccess().getUriURLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getUriURLParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RestService__RequestAssignment_7_4"
    // InternalAutomatedRestTesting.g:5265:1: rule__RestService__RequestAssignment_7_4 : ( ( ruleEString ) ) ;
    public final void rule__RestService__RequestAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5269:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5270:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5270:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5271:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_7_4_0()); 
            // InternalAutomatedRestTesting.g:5272:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5273:4: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getRequestElementEStringParserRuleCall_7_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getRequestElementEStringParserRuleCall_7_4_0_1()); 

            }

             after(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__RequestAssignment_7_4"


    // $ANTLR start "rule__RestService__ResponseAssignment_12"
    // InternalAutomatedRestTesting.g:5284:1: rule__RestService__ResponseAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__RestService__ResponseAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5288:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5289:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5289:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5290:3: ( ruleEString )
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_12_0()); 
            // InternalAutomatedRestTesting.g:5291:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5292:4: ruleEString
            {
             before(grammarAccess.getRestServiceAccess().getResponseElementEStringParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestServiceAccess().getResponseElementEStringParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestService__ResponseAssignment_12"


    // $ANTLR start "rule__URL__UrlexpressionAssignment_0"
    // InternalAutomatedRestTesting.g:5303:1: rule__URL__UrlexpressionAssignment_0 : ( ruleURLExpression ) ;
    public final void rule__URL__UrlexpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5307:1: ( ( ruleURLExpression ) )
            // InternalAutomatedRestTesting.g:5308:2: ( ruleURLExpression )
            {
            // InternalAutomatedRestTesting.g:5308:2: ( ruleURLExpression )
            // InternalAutomatedRestTesting.g:5309:3: ruleURLExpression
            {
             before(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleURLExpression();

            state._fsp--;

             after(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__UrlexpressionAssignment_0"


    // $ANTLR start "rule__URL__UrlexpressionAssignment_1"
    // InternalAutomatedRestTesting.g:5318:1: rule__URL__UrlexpressionAssignment_1 : ( ruleURLExpression ) ;
    public final void rule__URL__UrlexpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5322:1: ( ( ruleURLExpression ) )
            // InternalAutomatedRestTesting.g:5323:2: ( ruleURLExpression )
            {
            // InternalAutomatedRestTesting.g:5323:2: ( ruleURLExpression )
            // InternalAutomatedRestTesting.g:5324:3: ruleURLExpression
            {
             before(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURLExpression();

            state._fsp--;

             after(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__UrlexpressionAssignment_1"


    // $ANTLR start "rule__Parameter__ParamTypeAssignment_1"
    // InternalAutomatedRestTesting.g:5333:1: rule__Parameter__ParamTypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__Parameter__ParamTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5337:1: ( ( ruleParameterType ) )
            // InternalAutomatedRestTesting.g:5338:2: ( ruleParameterType )
            {
            // InternalAutomatedRestTesting.g:5338:2: ( ruleParameterType )
            // InternalAutomatedRestTesting.g:5339:3: ruleParameterType
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
    // InternalAutomatedRestTesting.g:5348:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5352:1: ( ( RULE_ID ) )
            // InternalAutomatedRestTesting.g:5353:2: ( RULE_ID )
            {
            // InternalAutomatedRestTesting.g:5353:2: ( RULE_ID )
            // InternalAutomatedRestTesting.g:5354:3: RULE_ID
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


    // $ANTLR start "rule__Separator__SeparatorTypeAssignment_1"
    // InternalAutomatedRestTesting.g:5363:1: rule__Separator__SeparatorTypeAssignment_1 : ( ruleSeparatorType ) ;
    public final void rule__Separator__SeparatorTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5367:1: ( ( ruleSeparatorType ) )
            // InternalAutomatedRestTesting.g:5368:2: ( ruleSeparatorType )
            {
            // InternalAutomatedRestTesting.g:5368:2: ( ruleSeparatorType )
            // InternalAutomatedRestTesting.g:5369:3: ruleSeparatorType
            {
             before(grammarAccess.getSeparatorAccess().getSeparatorTypeSeparatorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparatorType();

            state._fsp--;

             after(grammarAccess.getSeparatorAccess().getSeparatorTypeSeparatorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__SeparatorTypeAssignment_1"


    // $ANTLR start "rule__URLText__TextAssignment"
    // InternalAutomatedRestTesting.g:5378:1: rule__URLText__TextAssignment : ( ruleEString ) ;
    public final void rule__URLText__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5382:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5383:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5383:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5384:3: ruleEString
            {
             before(grammarAccess.getURLTextAccess().getTextEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getURLTextAccess().getTextEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLText__TextAssignment"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalAutomatedRestTesting.g:5393:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5397:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5398:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5398:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5399:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5408:1: rule__Test__ServiceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Test__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5412:1: ( ( ( ruleEString ) ) )
            // InternalAutomatedRestTesting.g:5413:2: ( ( ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:5413:2: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5414:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0()); 
            // InternalAutomatedRestTesting.g:5415:3: ( ruleEString )
            // InternalAutomatedRestTesting.g:5416:4: ruleEString
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
    // InternalAutomatedRestTesting.g:5427:1: rule__Test__DescriptionAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Test__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5431:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5432:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5432:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5433:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5442:1: rule__Test__MappingsAssignment_8_2 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5446:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5447:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5447:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5448:3: ruleMappingElement
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
    // InternalAutomatedRestTesting.g:5457:1: rule__Test__MappingsAssignment_8_3 : ( ruleMappingElement ) ;
    public final void rule__Test__MappingsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5461:1: ( ( ruleMappingElement ) )
            // InternalAutomatedRestTesting.g:5462:2: ( ruleMappingElement )
            {
            // InternalAutomatedRestTesting.g:5462:2: ( ruleMappingElement )
            // InternalAutomatedRestTesting.g:5463:3: ruleMappingElement
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
    // InternalAutomatedRestTesting.g:5472:1: rule__Test__AssertionsAssignment_11_0 : ( ruleAssertion ) ;
    public final void rule__Test__AssertionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5476:1: ( ( ruleAssertion ) )
            // InternalAutomatedRestTesting.g:5477:2: ( ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:5477:2: ( ruleAssertion )
            // InternalAutomatedRestTesting.g:5478:3: ruleAssertion
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
    // InternalAutomatedRestTesting.g:5487:1: rule__Assertion__AssertionTypeAssignment_0_0 : ( ruleAssertionType ) ;
    public final void rule__Assertion__AssertionTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5491:1: ( ( ruleAssertionType ) )
            // InternalAutomatedRestTesting.g:5492:2: ( ruleAssertionType )
            {
            // InternalAutomatedRestTesting.g:5492:2: ( ruleAssertionType )
            // InternalAutomatedRestTesting.g:5493:3: ruleAssertionType
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
    // InternalAutomatedRestTesting.g:5502:1: rule__Assertion__DataToTestAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__DataToTestAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5506:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5507:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5507:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5508:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_0_1_0()); 
            // InternalAutomatedRestTesting.g:5509:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5510:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:5521:1: rule__Assertion__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Assertion__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5525:1: ( ( ruleExpression ) )
            // InternalAutomatedRestTesting.g:5526:2: ( ruleExpression )
            {
            // InternalAutomatedRestTesting.g:5526:2: ( ruleExpression )
            // InternalAutomatedRestTesting.g:5527:3: ruleExpression
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
    // InternalAutomatedRestTesting.g:5536:1: rule__Expression__RelationalOperatorAssignment_0 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5540:1: ( ( ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:5541:2: ( ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:5541:2: ( ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:5542:3: ruleRelationalOperator
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
    // InternalAutomatedRestTesting.g:5551:1: rule__Expression__ExpectedValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Expression__ExpectedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5555:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5556:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5556:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5557:3: ruleLiteral
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
    // InternalAutomatedRestTesting.g:5566:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5570:1: ( ( RULE_INT ) )
            // InternalAutomatedRestTesting.g:5571:2: ( RULE_INT )
            {
            // InternalAutomatedRestTesting.g:5571:2: ( RULE_INT )
            // InternalAutomatedRestTesting.g:5572:3: RULE_INT
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
    // InternalAutomatedRestTesting.g:5581:1: rule__StringLiteral__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5585:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5586:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5586:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5587:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5596:1: rule__ElementLiteral__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5600:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5601:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5601:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5602:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementLiteralAccess().getValueElementCrossReference_0()); 
            // InternalAutomatedRestTesting.g:5603:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5604:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:5615:1: rule__MappingElement__ParameterAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingElement__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5619:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:5620:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:5620:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:5621:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingElementAccess().getParameterElementCrossReference_3_0()); 
            // InternalAutomatedRestTesting.g:5622:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:5623:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:5634:1: rule__MappingElement__ValueAssignment_8 : ( ruleLiteral ) ;
    public final void rule__MappingElement__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5638:1: ( ( ruleLiteral ) )
            // InternalAutomatedRestTesting.g:5639:2: ( ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:5639:2: ( ruleLiteral )
            // InternalAutomatedRestTesting.g:5640:3: ruleLiteral
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


    // $ANTLR start "rule__Restriction__MockTypeAssignment_3"
    // InternalAutomatedRestTesting.g:5649:1: rule__Restriction__MockTypeAssignment_3 : ( ruleMockTypes ) ;
    public final void rule__Restriction__MockTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5653:1: ( ( ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:5654:2: ( ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:5654:2: ( ruleMockTypes )
            // InternalAutomatedRestTesting.g:5655:3: ruleMockTypes
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
    // InternalAutomatedRestTesting.g:5664:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5668:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5669:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5669:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5670:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5679:1: rule__Entity__EntityAttributesAssignment_4 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5683:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5684:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5684:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5685:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5694:1: rule__Entity__EntityAttributesAssignment_6_0 : ( ruleDomainAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5698:1: ( ( ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:5699:2: ( ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:5699:2: ( ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:5700:3: ruleDomainAttribute
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
    // InternalAutomatedRestTesting.g:5709:1: rule__Attribute_Impl__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute_Impl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5713:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5714:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5714:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5715:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5724:1: rule__Attribute_Impl__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__Attribute_Impl__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5728:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5729:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5729:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5730:3: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:5739:1: rule__Attribute_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Attribute_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5743:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5744:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5744:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5745:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5754:1: rule__DomainAttribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__DomainAttribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5758:1: ( ( ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:5759:2: ( ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:5759:2: ( ruleAttributeType )
            // InternalAutomatedRestTesting.g:5760:3: ruleAttributeType
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
    // InternalAutomatedRestTesting.g:5769:1: rule__DomainAttribute__IsArrayAssignment_2_0 : ( RULE_SQUARE_LEFT_BRACKET ) ;
    public final void rule__DomainAttribute__IsArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5773:1: ( ( RULE_SQUARE_LEFT_BRACKET ) )
            // InternalAutomatedRestTesting.g:5774:2: ( RULE_SQUARE_LEFT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:5774:2: ( RULE_SQUARE_LEFT_BRACKET )
            // InternalAutomatedRestTesting.g:5775:3: RULE_SQUARE_LEFT_BRACKET
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
    // InternalAutomatedRestTesting.g:5784:1: rule__DomainAttribute__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DomainAttribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5788:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5789:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5789:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5790:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5799:1: rule__DomainAttribute__PrimaryKeyAssignment_4_1_0 : ( ( 'PK' ) ) ;
    public final void rule__DomainAttribute__PrimaryKeyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5803:1: ( ( ( 'PK' ) ) )
            // InternalAutomatedRestTesting.g:5804:2: ( ( 'PK' ) )
            {
            // InternalAutomatedRestTesting.g:5804:2: ( ( 'PK' ) )
            // InternalAutomatedRestTesting.g:5805:3: ( 'PK' )
            {
             before(grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0()); 
            // InternalAutomatedRestTesting.g:5806:3: ( 'PK' )
            // InternalAutomatedRestTesting.g:5807:4: 'PK'
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
    // InternalAutomatedRestTesting.g:5818:1: rule__DomainAttribute__RestrictionsAssignment_4_2 : ( ruleRestriction ) ;
    public final void rule__DomainAttribute__RestrictionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5822:1: ( ( ruleRestriction ) )
            // InternalAutomatedRestTesting.g:5823:2: ( ruleRestriction )
            {
            // InternalAutomatedRestTesting.g:5823:2: ( ruleRestriction )
            // InternalAutomatedRestTesting.g:5824:3: ruleRestriction
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
    // InternalAutomatedRestTesting.g:5833:1: rule__SimpleEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5837:1: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:5838:2: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:5838:2: ( ruleEString )
            // InternalAutomatedRestTesting.g:5839:3: ruleEString
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
    // InternalAutomatedRestTesting.g:5848:1: rule__SimpleEntity__EntityAttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5852:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5853:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5853:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5854:3: ruleAttribute
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
    // InternalAutomatedRestTesting.g:5863:1: rule__SimpleEntity__EntityAttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__SimpleEntity__EntityAttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutomatedRestTesting.g:5867:1: ( ( ruleAttribute ) )
            // InternalAutomatedRestTesting.g:5868:2: ( ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:5868:2: ( ruleAttribute )
            // InternalAutomatedRestTesting.g:5869:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000F0000000000L,0x0000000000000601L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000300001C00030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xA000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000300001C00032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000FF06000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000FF06000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020030L,0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020030L,0x00000000000000A0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x07FFC00000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000F8000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000010000L});

}