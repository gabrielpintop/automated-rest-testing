package org.xtext.example.automatedresttesting.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutomatedRestTestingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_STRING", "RULE_ID", "RULE_LEFT_BRACKET", "RULE_SLASH", "RULE_SQUARE_LEFT_BRACKET", "RULE_SQUARE_RIGHT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_DOT", "RULE_ARROW", "RULE_INT", "RULE_COMMA", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_TWO_DOTS", "RULE_MONEY", "RULE_QUESTION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'URL'", "'Request'", "'Type'", "'Response'", "'Test'", "'service'", "'description'", "'Mapping'", "'Assertions'", "'parameter'", "'value'", "'request'", "'mockType'", "'Entity'", "'PK'", "'SimpleEntity'", "'response->'", "'response.'", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'/:'", "'?$'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'"
    };
    public static final int RULE_SQUARE_LEFT_BRACKET=10;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=14;
    public static final int RULE_LEFT_PARENTHESIS=17;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=16;
    public static final int RULE_SLASH=9;
    public static final int T__26=26;
    public static final int RULE_TWO_DOTS=19;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__67=67;
    public static final int RULE_MONEY=20;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int RULE_DOT=13;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_SQUARE_RIGHT_BRACKET=11;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_RIGHT_PARENTHESIS=18;
    public static final int RULE_WS=24;
    public static final int RULE_LEFT_BRACKET=8;
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

        public InternalAutomatedRestTestingParser(TokenStream input, AutomatedRestTestingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AutomatedRestTesting";
       	}

       	@Override
       	protected AutomatedRestTestingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAutomatedRestTesting"
    // InternalAutomatedRestTesting.g:65:1: entryRuleAutomatedRestTesting returns [EObject current=null] : iv_ruleAutomatedRestTesting= ruleAutomatedRestTesting EOF ;
    public final EObject entryRuleAutomatedRestTesting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatedRestTesting = null;


        try {
            // InternalAutomatedRestTesting.g:65:61: (iv_ruleAutomatedRestTesting= ruleAutomatedRestTesting EOF )
            // InternalAutomatedRestTesting.g:66:2: iv_ruleAutomatedRestTesting= ruleAutomatedRestTesting EOF
            {
             newCompositeNode(grammarAccess.getAutomatedRestTestingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomatedRestTesting=ruleAutomatedRestTesting();

            state._fsp--;

             current =iv_ruleAutomatedRestTesting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomatedRestTesting"


    // $ANTLR start "ruleAutomatedRestTesting"
    // InternalAutomatedRestTesting.g:72:1: ruleAutomatedRestTesting returns [EObject current=null] : ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )? ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )? ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )? ) ;
    public final EObject ruleAutomatedRestTesting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_dataElements_5_0 = null;

        EObject lv_dataElements_6_0 = null;

        EObject lv_services_7_0 = null;

        EObject lv_services_8_0 = null;

        EObject lv_tests_9_0 = null;

        EObject lv_tests_10_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:78:2: ( ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )? ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )? ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )? ) )
            // InternalAutomatedRestTesting.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )? ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )? ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )? )
            {
            // InternalAutomatedRestTesting.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )? ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )? ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )? )
            // InternalAutomatedRestTesting.g:80:3: () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )? ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )? ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )?
            {
            // InternalAutomatedRestTesting.g:80:3: ()
            // InternalAutomatedRestTesting.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutomatedRestTestingAccess().getAutomatedRestTestingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutomatedRestTestingAccess().getApiURLKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getAutomatedRestTestingAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:95:3: ( (lv_url_3_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:96:4: (lv_url_3_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:96:4: (lv_url_3_0= ruleEString )
            // InternalAutomatedRestTesting.g:97:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getAutomatedRestTestingAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:118:3: ( ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40||LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAutomatedRestTesting.g:119:4: ( (lv_dataElements_5_0= ruleElement ) ) ( (lv_dataElements_6_0= ruleElement ) )*
                    {
                    // InternalAutomatedRestTesting.g:119:4: ( (lv_dataElements_5_0= ruleElement ) )
                    // InternalAutomatedRestTesting.g:120:5: (lv_dataElements_5_0= ruleElement )
                    {
                    // InternalAutomatedRestTesting.g:120:5: (lv_dataElements_5_0= ruleElement )
                    // InternalAutomatedRestTesting.g:121:6: lv_dataElements_5_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_dataElements_5_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    						}
                    						add(
                    							current,
                    							"dataElements",
                    							lv_dataElements_5_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:138:4: ( (lv_dataElements_6_0= ruleElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==40||LA1_0==42) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAutomatedRestTesting.g:139:5: (lv_dataElements_6_0= ruleElement )
                    	    {
                    	    // InternalAutomatedRestTesting.g:139:5: (lv_dataElements_6_0= ruleElement )
                    	    // InternalAutomatedRestTesting.g:140:6: lv_dataElements_6_0= ruleElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getDataElementsElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_dataElements_6_0=ruleElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dataElements",
                    	    							lv_dataElements_6_0,
                    	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Element");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:158:3: ( ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=58 && LA4_0<=61)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAutomatedRestTesting.g:159:4: ( (lv_services_7_0= ruleRestService ) ) ( (lv_services_8_0= ruleRestService ) )*
                    {
                    // InternalAutomatedRestTesting.g:159:4: ( (lv_services_7_0= ruleRestService ) )
                    // InternalAutomatedRestTesting.g:160:5: (lv_services_7_0= ruleRestService )
                    {
                    // InternalAutomatedRestTesting.g:160:5: (lv_services_7_0= ruleRestService )
                    // InternalAutomatedRestTesting.g:161:6: lv_services_7_0= ruleRestService
                    {

                    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_services_7_0=ruleRestService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    						}
                    						add(
                    							current,
                    							"services",
                    							lv_services_7_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.RestService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:178:4: ( (lv_services_8_0= ruleRestService ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=58 && LA3_0<=61)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAutomatedRestTesting.g:179:5: (lv_services_8_0= ruleRestService )
                    	    {
                    	    // InternalAutomatedRestTesting.g:179:5: (lv_services_8_0= ruleRestService )
                    	    // InternalAutomatedRestTesting.g:180:6: lv_services_8_0= ruleRestService
                    	    {

                    	    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getServicesRestServiceParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_services_8_0=ruleRestService();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"services",
                    	    							lv_services_8_0,
                    	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.RestService");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:198:3: ( ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAutomatedRestTesting.g:199:4: ( (lv_tests_9_0= ruleTest ) ) ( (lv_tests_10_0= ruleTest ) )*
                    {
                    // InternalAutomatedRestTesting.g:199:4: ( (lv_tests_9_0= ruleTest ) )
                    // InternalAutomatedRestTesting.g:200:5: (lv_tests_9_0= ruleTest )
                    {
                    // InternalAutomatedRestTesting.g:200:5: (lv_tests_9_0= ruleTest )
                    // InternalAutomatedRestTesting.g:201:6: lv_tests_9_0= ruleTest
                    {

                    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tests_9_0=ruleTest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    						}
                    						add(
                    							current,
                    							"tests",
                    							lv_tests_9_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Test");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:218:4: ( (lv_tests_10_0= ruleTest ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==31) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAutomatedRestTesting.g:219:5: (lv_tests_10_0= ruleTest )
                    	    {
                    	    // InternalAutomatedRestTesting.g:219:5: (lv_tests_10_0= ruleTest )
                    	    // InternalAutomatedRestTesting.g:220:6: lv_tests_10_0= ruleTest
                    	    {

                    	    						newCompositeNode(grammarAccess.getAutomatedRestTestingAccess().getTestsTestParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_tests_10_0=ruleTest();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAutomatedRestTestingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tests",
                    	    							lv_tests_10_0,
                    	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Test");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutomatedRestTesting"


    // $ANTLR start "entryRuleElement"
    // InternalAutomatedRestTesting.g:242:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalAutomatedRestTesting.g:242:48: (iv_ruleElement= ruleElement EOF )
            // InternalAutomatedRestTesting.g:243:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalAutomatedRestTesting.g:249:1: ruleElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_SimpleEntity_1= ruleSimpleEntity ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_SimpleEntity_1 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:255:2: ( (this_Entity_0= ruleEntity | this_SimpleEntity_1= ruleSimpleEntity ) )
            // InternalAutomatedRestTesting.g:256:2: (this_Entity_0= ruleEntity | this_SimpleEntity_1= ruleSimpleEntity )
            {
            // InternalAutomatedRestTesting.g:256:2: (this_Entity_0= ruleEntity | this_SimpleEntity_1= ruleSimpleEntity )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAutomatedRestTesting.g:257:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:266:3: this_SimpleEntity_1= ruleSimpleEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSimpleEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleEntity_1=ruleSimpleEntity();

                    state._fsp--;


                    			current = this_SimpleEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribute"
    // InternalAutomatedRestTesting.g:278:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalAutomatedRestTesting.g:278:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAutomatedRestTesting.g:279:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalAutomatedRestTesting.g:285:1: ruleAttribute returns [EObject current=null] : this_Attribute_Impl_0= ruleAttribute_Impl ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:291:2: (this_Attribute_Impl_0= ruleAttribute_Impl )
            // InternalAutomatedRestTesting.g:292:2: this_Attribute_Impl_0= ruleAttribute_Impl
            {

            		newCompositeNode(grammarAccess.getAttributeAccess().getAttribute_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Attribute_Impl_0=ruleAttribute_Impl();

            state._fsp--;


            		current = this_Attribute_Impl_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEString"
    // InternalAutomatedRestTesting.g:303:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAutomatedRestTesting.g:303:47: (iv_ruleEString= ruleEString EOF )
            // InternalAutomatedRestTesting.g:304:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAutomatedRestTesting.g:310:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:316:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAutomatedRestTesting.g:317:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAutomatedRestTesting.g:317:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAutomatedRestTesting.g:318:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:326:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRestService"
    // InternalAutomatedRestTesting.g:337:1: entryRuleRestService returns [EObject current=null] : iv_ruleRestService= ruleRestService EOF ;
    public final EObject entryRuleRestService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestService = null;


        try {
            // InternalAutomatedRestTesting.g:337:52: (iv_ruleRestService= ruleRestService EOF )
            // InternalAutomatedRestTesting.g:338:2: iv_ruleRestService= ruleRestService EOF
            {
             newCompositeNode(grammarAccess.getRestServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestService=ruleRestService();

            state._fsp--;

             current =iv_ruleRestService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestService"


    // $ANTLR start "ruleRestService"
    // InternalAutomatedRestTesting.g:344:1: ruleRestService returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )? otherlv_20= 'Response' this_LEFT_BRACKET_21= RULE_LEFT_BRACKET otherlv_22= 'Type' this_EQUAL_23= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_27= RULE_SEMICOLON this_RIGHT_BRACKET_28= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_29= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleRestService() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_2=null;
        Token otherlv_3=null;
        Token this_EQUAL_4=null;
        Token lv_uri_5_0=null;
        Token this_SLASH_7=null;
        Token this_SEMICOLON_10=null;
        Token otherlv_11=null;
        Token this_LEFT_BRACKET_12=null;
        Token otherlv_13=null;
        Token this_EQUAL_14=null;
        Token this_SQUARE_LEFT_BRACKET_16=null;
        Token this_SQUARE_RIGHT_BRACKET_17=null;
        Token this_SEMICOLON_18=null;
        Token this_RIGHT_BRACKET_19=null;
        Token otherlv_20=null;
        Token this_LEFT_BRACKET_21=null;
        Token otherlv_22=null;
        Token this_EQUAL_23=null;
        Token this_SQUARE_LEFT_BRACKET_25=null;
        Token this_SQUARE_RIGHT_BRACKET_26=null;
        Token this_SEMICOLON_27=null;
        Token this_RIGHT_BRACKET_28=null;
        Token this_RIGHT_BRACKET_29=null;
        Enumerator lv_method_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:350:2: ( ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )? otherlv_20= 'Response' this_LEFT_BRACKET_21= RULE_LEFT_BRACKET otherlv_22= 'Type' this_EQUAL_23= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_27= RULE_SEMICOLON this_RIGHT_BRACKET_28= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_29= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:351:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )? otherlv_20= 'Response' this_LEFT_BRACKET_21= RULE_LEFT_BRACKET otherlv_22= 'Type' this_EQUAL_23= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_27= RULE_SEMICOLON this_RIGHT_BRACKET_28= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_29= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:351:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )? otherlv_20= 'Response' this_LEFT_BRACKET_21= RULE_LEFT_BRACKET otherlv_22= 'Type' this_EQUAL_23= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_27= RULE_SEMICOLON this_RIGHT_BRACKET_28= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_29= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:352:3: ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )? otherlv_20= 'Response' this_LEFT_BRACKET_21= RULE_LEFT_BRACKET otherlv_22= 'Type' this_EQUAL_23= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_27= RULE_SEMICOLON this_RIGHT_BRACKET_28= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_29= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:352:3: ( (lv_method_0_0= ruleMethodType ) )
            // InternalAutomatedRestTesting.g:353:4: (lv_method_0_0= ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:353:4: (lv_method_0_0= ruleMethodType )
            // InternalAutomatedRestTesting.g:354:5: lv_method_0_0= ruleMethodType
            {

            					newCompositeNode(grammarAccess.getRestServiceAccess().getMethodMethodTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_method_0_0=ruleMethodType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestServiceRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_0_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.MethodType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:371:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:372:4: (lv_name_1_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:372:4: (lv_name_1_0= ruleEString )
            // InternalAutomatedRestTesting.g:373:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRestServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_10); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestServiceAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_11); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:402:3: ( (lv_uri_5_0= RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:403:4: (lv_uri_5_0= RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:403:4: (lv_uri_5_0= RULE_SLASH )
            // InternalAutomatedRestTesting.g:404:5: lv_uri_5_0= RULE_SLASH
            {
            lv_uri_5_0=(Token)match(input,RULE_SLASH,FOLLOW_4); 

            					newLeafNode(lv_uri_5_0, grammarAccess.getRestServiceAccess().getUriSLASHTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_5_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.SLASH");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_6());
            		
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalAutomatedRestTesting.g:427:3: ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SLASH) ) {
                    alt9=1;
                }
                else if ( ((LA9_0>=62 && LA9_0<=63)) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:428:4: (this_SLASH_7= RULE_SLASH ruleEString )
            	    {
            	    // InternalAutomatedRestTesting.g:428:4: (this_SLASH_7= RULE_SLASH ruleEString )
            	    // InternalAutomatedRestTesting.g:429:5: this_SLASH_7= RULE_SLASH ruleEString
            	    {
            	    this_SLASH_7=(Token)match(input,RULE_SLASH,FOLLOW_4); 

            	    					newLeafNode(this_SLASH_7, grammarAccess.getRestServiceAccess().getSLASHTerminalRuleCall_7_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_7_0_1());
            	    				
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAutomatedRestTesting.g:442:4: ( (lv_parameters_9_0= ruleParameter ) )
            	    {
            	    // InternalAutomatedRestTesting.g:442:4: ( (lv_parameters_9_0= ruleParameter ) )
            	    // InternalAutomatedRestTesting.g:443:5: (lv_parameters_9_0= ruleParameter )
            	    {
            	    // InternalAutomatedRestTesting.g:443:5: (lv_parameters_9_0= ruleParameter )
            	    // InternalAutomatedRestTesting.g:444:6: lv_parameters_9_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRestServiceAccess().getParametersParameterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameters_9_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRestServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_9_0,
            	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_13); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalAutomatedRestTesting.g:466:3: (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAutomatedRestTesting.g:467:4: otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_18= RULE_SEMICOLON this_RIGHT_BRACKET_19= RULE_RIGHT_BRACKET
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRestServiceAccess().getRequestKeyword_9_0());
                    			
                    this_LEFT_BRACKET_12=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_14); 

                    				newLeafNode(this_LEFT_BRACKET_12, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9_1());
                    			
                    otherlv_13=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRestServiceAccess().getTypeKeyword_9_2());
                    			
                    this_EQUAL_14=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_14, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_9_3());
                    			
                    // InternalAutomatedRestTesting.g:483:4: ( ( ruleEString ) )
                    // InternalAutomatedRestTesting.g:484:5: ( ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:484:5: ( ruleEString )
                    // InternalAutomatedRestTesting.g:485:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:499:4: (this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_SQUARE_LEFT_BRACKET) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:500:5: this_SQUARE_LEFT_BRACKET_16= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_17= RULE_SQUARE_RIGHT_BRACKET
                            {
                            this_SQUARE_LEFT_BRACKET_16=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_16); 

                            					newLeafNode(this_SQUARE_LEFT_BRACKET_16, grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_9_5_0());
                            				
                            this_SQUARE_RIGHT_BRACKET_17=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_5); 

                            					newLeafNode(this_SQUARE_RIGHT_BRACKET_17, grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_9_5_1());
                            				

                            }
                            break;

                    }

                    this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_17); 

                    				newLeafNode(this_SEMICOLON_18, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_9_6());
                    			
                    this_RIGHT_BRACKET_19=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_18); 

                    				newLeafNode(this_RIGHT_BRACKET_19, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_9_7());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getRestServiceAccess().getResponseKeyword_10());
            		
            this_LEFT_BRACKET_21=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_14); 

            			newLeafNode(this_LEFT_BRACKET_21, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_11());
            		
            otherlv_22=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getRestServiceAccess().getTypeKeyword_12());
            		
            this_EQUAL_23=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_23, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_13());
            		
            // InternalAutomatedRestTesting.g:534:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:535:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:535:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:536:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:550:3: (this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAutomatedRestTesting.g:551:4: this_SQUARE_LEFT_BRACKET_25= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_26= RULE_SQUARE_RIGHT_BRACKET
                    {
                    this_SQUARE_LEFT_BRACKET_25=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_16); 

                    				newLeafNode(this_SQUARE_LEFT_BRACKET_25, grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_15_0());
                    			
                    this_SQUARE_RIGHT_BRACKET_26=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_5); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_26, grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_15_1());
                    			

                    }
                    break;

            }

            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_17); 

            			newLeafNode(this_SEMICOLON_27, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_16());
            		
            this_RIGHT_BRACKET_28=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_17); 

            			newLeafNode(this_RIGHT_BRACKET_28, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_17());
            		
            this_RIGHT_BRACKET_29=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_29, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestService"


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:576:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalAutomatedRestTesting.g:576:45: (iv_ruleTest= ruleTest EOF )
            // InternalAutomatedRestTesting.g:577:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalAutomatedRestTesting.g:583:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token otherlv_3=null;
        Token this_EQUAL_4=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        Token this_EQUAL_8=null;
        Token this_SEMICOLON_10=null;
        Token otherlv_11=null;
        Token this_SQUARE_LEFT_BRACKET_12=null;
        Token this_SQUARE_RIGHT_BRACKET_15=null;
        Token otherlv_16=null;
        Token this_LEFT_BRACKET_17=null;
        Token this_SEMICOLON_19=null;
        Token this_RIGHT_BRACKET_20=null;
        Token this_RIGHT_BRACKET_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        EObject lv_mappings_13_0 = null;

        EObject lv_mappings_14_0 = null;

        EObject lv_assertions_18_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:589:2: ( (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:590:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:590:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:591:3: otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalAutomatedRestTesting.g:595:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:596:4: (lv_name_1_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:596:4: (lv_name_1_0= ruleEString )
            // InternalAutomatedRestTesting.g:597:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_19); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getServiceKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:626:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:627:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:627:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:628:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTestAccess().getServiceRestServiceCrossReference_5_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_20); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalAutomatedRestTesting.g:646:3: (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:647:4: otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestAccess().getDescriptionKeyword_7_0());
                    			
                    this_EQUAL_8=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_8, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_7_1());
                    			
                    // InternalAutomatedRestTesting.g:655:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalAutomatedRestTesting.g:656:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:656:5: (lv_description_9_0= ruleEString )
                    // InternalAutomatedRestTesting.g:657:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

                    				newLeafNode(this_SEMICOLON_10, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:679:3: (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAutomatedRestTesting.g:680:4: otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestAccess().getMappingKeyword_8_0());
                    			
                    this_SQUARE_LEFT_BRACKET_12=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_9); 

                    				newLeafNode(this_SQUARE_LEFT_BRACKET_12, grammarAccess.getTestAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_8_1());
                    			
                    // InternalAutomatedRestTesting.g:688:4: ( (lv_mappings_13_0= ruleMappingElement ) )
                    // InternalAutomatedRestTesting.g:689:5: (lv_mappings_13_0= ruleMappingElement )
                    {
                    // InternalAutomatedRestTesting.g:689:5: (lv_mappings_13_0= ruleMappingElement )
                    // InternalAutomatedRestTesting.g:690:6: lv_mappings_13_0= ruleMappingElement
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_mappings_13_0=ruleMappingElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestRule());
                    						}
                    						add(
                    							current,
                    							"mappings",
                    							lv_mappings_13_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.MappingElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:707:4: ( (lv_mappings_14_0= ruleMappingElement ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_LEFT_BRACKET) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAutomatedRestTesting.g:708:5: (lv_mappings_14_0= ruleMappingElement )
                    	    {
                    	    // InternalAutomatedRestTesting.g:708:5: (lv_mappings_14_0= ruleMappingElement )
                    	    // InternalAutomatedRestTesting.g:709:6: lv_mappings_14_0= ruleMappingElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_mappings_14_0=ruleMappingElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTestRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mappings",
                    	    							lv_mappings_14_0,
                    	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.MappingElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_SQUARE_RIGHT_BRACKET_15=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_24); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_15, grammarAccess.getTestAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_8_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getTestAccess().getAssertionsKeyword_9());
            		
            this_LEFT_BRACKET_17=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_25); 

            			newLeafNode(this_LEFT_BRACKET_17, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_10());
            		
            // InternalAutomatedRestTesting.g:739:3: ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=43 && LA16_0<=44)||(LA16_0>=50 && LA16_0<=57)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:740:4: ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:740:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // InternalAutomatedRestTesting.g:741:5: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // InternalAutomatedRestTesting.g:741:5: (lv_assertions_18_0= ruleAssertion )
            	    // InternalAutomatedRestTesting.g:742:6: lv_assertions_18_0= ruleAssertion
            	    {

            	    						newCompositeNode(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_assertions_18_0=ruleAssertion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assertions",
            	    							lv_assertions_18_0,
            	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Assertion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_26); 

            	    				newLeafNode(this_SEMICOLON_19, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            this_RIGHT_BRACKET_20=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_17); 

            			newLeafNode(this_RIGHT_BRACKET_20, grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_12());
            		
            this_RIGHT_BRACKET_21=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_21, grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleAssertion"
    // InternalAutomatedRestTesting.g:776:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalAutomatedRestTesting.g:776:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalAutomatedRestTesting.g:777:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalAutomatedRestTesting.g:783:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Enumerator lv_assertionType_0_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:789:2: ( ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) ) )
            // InternalAutomatedRestTesting.g:790:2: ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) )
            {
            // InternalAutomatedRestTesting.g:790:2: ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) )
            // InternalAutomatedRestTesting.g:791:3: ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) )
            {
            // InternalAutomatedRestTesting.g:791:3: ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAutomatedRestTesting.g:792:4: ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAutomatedRestTesting.g:792:4: ( (lv_assertionType_0_0= ruleAssertionType ) )
                    // InternalAutomatedRestTesting.g:793:5: (lv_assertionType_0_0= ruleAssertionType )
                    {
                    // InternalAutomatedRestTesting.g:793:5: (lv_assertionType_0_0= ruleAssertionType )
                    // InternalAutomatedRestTesting.g:794:6: lv_assertionType_0_0= ruleAssertionType
                    {

                    						newCompositeNode(grammarAccess.getAssertionAccess().getAssertionTypeAssertionTypeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_assertionType_0_0=ruleAssertionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertionRule());
                    						}
                    						set(
                    							current,
                    							"assertionType",
                    							lv_assertionType_0_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.AssertionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:811:4: ( ( ruleQualifiedName ) )
                    // InternalAutomatedRestTesting.g:812:5: ( ruleQualifiedName )
                    {
                    // InternalAutomatedRestTesting.g:812:5: ( ruleQualifiedName )
                    // InternalAutomatedRestTesting.g:813:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssertionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:828:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalAutomatedRestTesting.g:829:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalAutomatedRestTesting.g:829:4: (lv_condition_2_0= ruleExpression )
            // InternalAutomatedRestTesting.g:830:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAutomatedRestTesting.g:851:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAutomatedRestTesting.g:851:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAutomatedRestTesting.g:852:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAutomatedRestTesting.g:858:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:864:2: ( (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) )
            // InternalAutomatedRestTesting.g:865:2: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            {
            // InternalAutomatedRestTesting.g:865:2: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            // InternalAutomatedRestTesting.g:866:3: this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAutomatedRestTesting.g:873:3: (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:874:4: this_DOT_1= RULE_DOT this_ID_2= RULE_ID
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_27); 

            	    				current.merge(this_DOT_1);
            	    			

            	    				newLeafNode(this_DOT_1, grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // InternalAutomatedRestTesting.g:893:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAutomatedRestTesting.g:893:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAutomatedRestTesting.g:894:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAutomatedRestTesting.g:900:1: ruleExpression returns [EObject current=null] : ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOT_2=null;
        Token this_ARROW_3=null;
        Enumerator lv_relationalOperator_0_0 = null;

        EObject lv_expectedValue_4_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:906:2: ( ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? ) )
            // InternalAutomatedRestTesting.g:907:2: ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? )
            {
            // InternalAutomatedRestTesting.g:907:2: ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? )
            // InternalAutomatedRestTesting.g:908:3: ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )?
            {
            // InternalAutomatedRestTesting.g:908:3: ( (lv_relationalOperator_0_0= ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:909:4: (lv_relationalOperator_0_0= ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:909:4: (lv_relationalOperator_0_0= ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:910:5: lv_relationalOperator_0_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_relationalOperator_0_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"relationalOperator",
            						lv_relationalOperator_0_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:927:3: ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==RULE_INT||LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:928:4: (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) )
                    {
                    // InternalAutomatedRestTesting.g:928:4: (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==36) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:929:5: otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_30); 

                            					newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getParameterKeyword_1_0_0());
                            				
                            // InternalAutomatedRestTesting.g:933:5: (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW )
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==RULE_DOT) ) {
                                alt19=1;
                            }
                            else if ( (LA19_0==RULE_ARROW) ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 0, input);

                                throw nvae;
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalAutomatedRestTesting.g:934:6: this_DOT_2= RULE_DOT
                                    {
                                    this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_31); 

                                    						newLeafNode(this_DOT_2, grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalAutomatedRestTesting.g:939:6: this_ARROW_3= RULE_ARROW
                                    {
                                    this_ARROW_3=(Token)match(input,RULE_ARROW,FOLLOW_31); 

                                    						newLeafNode(this_ARROW_3, grammarAccess.getExpressionAccess().getARROWTerminalRuleCall_1_0_1_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAutomatedRestTesting.g:945:4: ( (lv_expectedValue_4_0= ruleLiteral ) )
                    // InternalAutomatedRestTesting.g:946:5: (lv_expectedValue_4_0= ruleLiteral )
                    {
                    // InternalAutomatedRestTesting.g:946:5: (lv_expectedValue_4_0= ruleLiteral )
                    // InternalAutomatedRestTesting.g:947:6: lv_expectedValue_4_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpectedValueLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expectedValue_4_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expectedValue",
                    							lv_expectedValue_4_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalAutomatedRestTesting.g:969:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:969:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAutomatedRestTesting.g:970:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAutomatedRestTesting.g:976:1: ruleLiteral returns [EObject current=null] : (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_ElementLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:982:2: ( (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral ) )
            // InternalAutomatedRestTesting.g:983:2: (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral )
            {
            // InternalAutomatedRestTesting.g:983:2: (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:984:3: this_ElementLiteral_0= ruleElementLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getElementLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementLiteral_0=ruleElementLiteral();

                    state._fsp--;


                    			current = this_ElementLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:993:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1002:3: this_IntegerLiteral_2= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_2=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalAutomatedRestTesting.g:1014:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1014:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalAutomatedRestTesting.g:1015:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalAutomatedRestTesting.g:1021:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1027:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAutomatedRestTesting.g:1028:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAutomatedRestTesting.g:1028:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAutomatedRestTesting.g:1029:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAutomatedRestTesting.g:1029:3: (lv_value_0_0= RULE_INT )
            // InternalAutomatedRestTesting.g:1030:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAutomatedRestTesting.g:1049:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1049:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAutomatedRestTesting.g:1050:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAutomatedRestTesting.g:1056:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1062:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:1063:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:1063:2: ( (lv_value_0_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1064:3: (lv_value_0_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1064:3: (lv_value_0_0= ruleEString )
            // InternalAutomatedRestTesting.g:1065:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleElementLiteral"
    // InternalAutomatedRestTesting.g:1085:1: entryRuleElementLiteral returns [EObject current=null] : iv_ruleElementLiteral= ruleElementLiteral EOF ;
    public final EObject entryRuleElementLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1085:55: (iv_ruleElementLiteral= ruleElementLiteral EOF )
            // InternalAutomatedRestTesting.g:1086:2: iv_ruleElementLiteral= ruleElementLiteral EOF
            {
             newCompositeNode(grammarAccess.getElementLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementLiteral=ruleElementLiteral();

            state._fsp--;

             current =iv_ruleElementLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementLiteral"


    // $ANTLR start "ruleElementLiteral"
    // InternalAutomatedRestTesting.g:1092:1: ruleElementLiteral returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1098:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:1099:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:1099:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:1100:3: ( ruleQualifiedName )
            {
            // InternalAutomatedRestTesting.g:1100:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:1101:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementLiteralRule());
            				}
            			

            				newCompositeNode(grammarAccess.getElementLiteralAccess().getValueElementCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementLiteral"


    // $ANTLR start "entryRuleMappingElement"
    // InternalAutomatedRestTesting.g:1118:1: entryRuleMappingElement returns [EObject current=null] : iv_ruleMappingElement= ruleMappingElement EOF ;
    public final EObject entryRuleMappingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingElement = null;


        try {
            // InternalAutomatedRestTesting.g:1118:55: (iv_ruleMappingElement= ruleMappingElement EOF )
            // InternalAutomatedRestTesting.g:1119:2: iv_ruleMappingElement= ruleMappingElement EOF
            {
             newCompositeNode(grammarAccess.getMappingElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingElement=ruleMappingElement();

            state._fsp--;

             current =iv_ruleMappingElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingElement"


    // $ANTLR start "ruleMappingElement"
    // InternalAutomatedRestTesting.g:1125:1: ruleMappingElement returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleMappingElement() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_0=null;
        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_EQUAL_6=null;
        Token otherlv_7=null;
        Token this_ARROW_8=null;
        Token this_RIGHT_BRACKET_10=null;
        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1131:2: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1132:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1132:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1133:3: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_32); 

            			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getMappingElementAccess().getLEFT_BRACKETTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingElementAccess().getParameterKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:1145:3: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:1146:4: ( ruleQualifiedName )
            {
            // InternalAutomatedRestTesting.g:1146:4: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:1147:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingElementAccess().getParameterElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_34); 

            			newLeafNode(this_COMMA_4, grammarAccess.getMappingElementAccess().getCOMMATerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMappingElementAccess().getValueKeyword_5());
            		
            this_EQUAL_6=(Token)match(input,RULE_EQUAL,FOLLOW_35); 

            			newLeafNode(this_EQUAL_6, grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_6());
            		
            // InternalAutomatedRestTesting.g:1173:3: (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1174:4: otherlv_7= 'request' this_ARROW_8= RULE_ARROW
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappingElementAccess().getRequestKeyword_7_0());
                    			
                    this_ARROW_8=(Token)match(input,RULE_ARROW,FOLLOW_31); 

                    				newLeafNode(this_ARROW_8, grammarAccess.getMappingElementAccess().getARROWTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1183:3: ( (lv_value_9_0= ruleLiteral ) )
            // InternalAutomatedRestTesting.g:1184:4: (lv_value_9_0= ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:1184:4: (lv_value_9_0= ruleLiteral )
            // InternalAutomatedRestTesting.g:1185:5: lv_value_9_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMappingElementAccess().getValueLiteralParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_9_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RIGHT_BRACKET_10=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_10, grammarAccess.getMappingElementAccess().getRIGHT_BRACKETTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingElement"


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:1210:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAutomatedRestTesting.g:1210:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAutomatedRestTesting.g:1211:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAutomatedRestTesting.g:1217:1: ruleParameter returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_value_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_2=null;
        Token lv_value_3_0=null;
        Token this_RIGHT_BRACKET_4=null;
        Enumerator lv_paramType_1_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1223:2: ( ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_value_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1224:2: ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_value_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1224:2: ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_value_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1225:3: () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_value_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1225:3: ()
            // InternalAutomatedRestTesting.g:1226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1232:3: ( (lv_paramType_1_0= ruleParameterType ) )
            // InternalAutomatedRestTesting.g:1233:4: (lv_paramType_1_0= ruleParameterType )
            {
            // InternalAutomatedRestTesting.g:1233:4: (lv_paramType_1_0= ruleParameterType )
            // InternalAutomatedRestTesting.g:1234:5: lv_paramType_1_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParamTypeParameterTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_paramType_1_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"paramType",
            						lv_paramType_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_27); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getParameterAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:1255:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalAutomatedRestTesting.g:1256:4: (lv_value_3_0= RULE_ID )
            {
            // InternalAutomatedRestTesting.g:1256:4: (lv_value_3_0= RULE_ID )
            // InternalAutomatedRestTesting.g:1257:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_value_3_0, grammarAccess.getParameterAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_RIGHT_BRACKET_4=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getParameterAccess().getRIGHT_BRACKETTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRestriction"
    // InternalAutomatedRestTesting.g:1281:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // InternalAutomatedRestTesting.g:1281:52: (iv_ruleRestriction= ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:1282:2: iv_ruleRestriction= ruleRestriction EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestriction=ruleRestriction();

            state._fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // InternalAutomatedRestTesting.g:1288:1: ruleRestriction returns [EObject current=null] : ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Enumerator lv_mockType_3_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1294:2: ( ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) )
            // InternalAutomatedRestTesting.g:1295:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            {
            // InternalAutomatedRestTesting.g:1295:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            // InternalAutomatedRestTesting.g:1296:3: () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) )
            {
            // InternalAutomatedRestTesting.g:1296:3: ()
            // InternalAutomatedRestTesting.g:1297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestrictionAccess().getRestrictionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getMockTypeKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_37); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getRestrictionAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:1311:3: ( (lv_mockType_3_0= ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:1312:4: (lv_mockType_3_0= ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:1312:4: (lv_mockType_3_0= ruleMockTypes )
            // InternalAutomatedRestTesting.g:1313:5: lv_mockType_3_0= ruleMockTypes
            {

            					newCompositeNode(grammarAccess.getRestrictionAccess().getMockTypeMockTypesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_mockType_3_0=ruleMockTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestrictionRule());
            					}
            					set(
            						current,
            						"mockType",
            						lv_mockType_3_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.MockTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleEntity"
    // InternalAutomatedRestTesting.g:1334:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1334:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAutomatedRestTesting.g:1335:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAutomatedRestTesting.g:1341:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LEFT_BRACKET_3=null;
        Token this_SEMICOLON_5=null;
        Token this_SEMICOLON_7=null;
        Token this_RIGHT_BRACKET_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entityAttributes_4_0 = null;

        EObject lv_entityAttributes_6_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1347:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1348:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1348:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1349:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1349:3: ()
            // InternalAutomatedRestTesting.g:1350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1360:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1361:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1361:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1362:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_38); 

            			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getEntityAccess().getLEFT_BRACKETTerminalRuleCall_3());
            		
            // InternalAutomatedRestTesting.g:1383:3: ( (lv_entityAttributes_4_0= ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:1384:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:1384:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:1385:5: lv_entityAttributes_4_0= ruleDomainAttribute
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_entityAttributes_4_0=ruleDomainAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"entityAttributes",
            						lv_entityAttributes_4_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.DomainAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalAutomatedRestTesting.g:1406:3: ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=45 && LA24_0<=49)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1407:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1407:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) )
            	    // InternalAutomatedRestTesting.g:1408:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1408:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    // InternalAutomatedRestTesting.g:1409:6: lv_entityAttributes_6_0= ruleDomainAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getEntityAttributesDomainAttributeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_entityAttributes_6_0=ruleDomainAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityAttributes",
            	    							lv_entityAttributes_6_0,
            	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.DomainAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

            	    				newLeafNode(this_SEMICOLON_7, grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute_Impl"
    // InternalAutomatedRestTesting.g:1439:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalAutomatedRestTesting.g:1439:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:1440:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
            {
             newCompositeNode(grammarAccess.getAttribute_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute_Impl=ruleAttribute_Impl();

            state._fsp--;

             current =iv_ruleAttribute_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute_Impl"


    // $ANTLR start "ruleAttribute_Impl"
    // InternalAutomatedRestTesting.g:1446:1: ruleAttribute_Impl returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token this_SQUARE_RIGHT_BRACKET_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1452:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalAutomatedRestTesting.g:1453:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalAutomatedRestTesting.g:1453:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:1454:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:1454:3: ()
            // InternalAutomatedRestTesting.g:1455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1461:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1462:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1462:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1463:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getTypeAttributeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_type_1_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:1480:3: ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1481:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET
                    {
                    // InternalAutomatedRestTesting.g:1481:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) )
                    // InternalAutomatedRestTesting.g:1482:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    {
                    // InternalAutomatedRestTesting.g:1482:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    // InternalAutomatedRestTesting.g:1483:6: lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET
                    {
                    lv_isArray_2_0=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_16); 

                    						newLeafNode(lv_isArray_2_0, grammarAccess.getAttribute_ImplAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttribute_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isArray",
                    							true,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.SQUARE_LEFT_BRACKET");
                    					

                    }


                    }

                    this_SQUARE_RIGHT_BRACKET_3=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_4); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_3, grammarAccess.getAttribute_ImplAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1504:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1505:4: (lv_name_4_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1505:4: (lv_name_4_0= ruleEString )
            // InternalAutomatedRestTesting.g:1506:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute_Impl"


    // $ANTLR start "entryRuleDomainAttribute"
    // InternalAutomatedRestTesting.g:1527:1: entryRuleDomainAttribute returns [EObject current=null] : iv_ruleDomainAttribute= ruleDomainAttribute EOF ;
    public final EObject entryRuleDomainAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainAttribute = null;


        try {
            // InternalAutomatedRestTesting.g:1527:56: (iv_ruleDomainAttribute= ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:1528:2: iv_ruleDomainAttribute= ruleDomainAttribute EOF
            {
             newCompositeNode(grammarAccess.getDomainAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainAttribute=ruleDomainAttribute();

            state._fsp--;

             current =iv_ruleDomainAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainAttribute"


    // $ANTLR start "ruleDomainAttribute"
    // InternalAutomatedRestTesting.g:1534:1: ruleDomainAttribute returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? ) ;
    public final EObject ruleDomainAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token this_SQUARE_RIGHT_BRACKET_3=null;
        Token this_LEFT_PARENTHESIS_5=null;
        Token lv_primaryKey_6_0=null;
        Token this_COMMA_7=null;
        Token this_RIGHT_PARENTHESIS_9=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_restrictions_8_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1540:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? ) )
            // InternalAutomatedRestTesting.g:1541:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? )
            {
            // InternalAutomatedRestTesting.g:1541:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? )
            // InternalAutomatedRestTesting.g:1542:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )?
            {
            // InternalAutomatedRestTesting.g:1542:3: ()
            // InternalAutomatedRestTesting.g:1543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1549:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1550:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1550:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1551:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getDomainAttributeAccess().getTypeAttributeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_type_1_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:1568:3: ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1569:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET
                    {
                    // InternalAutomatedRestTesting.g:1569:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) )
                    // InternalAutomatedRestTesting.g:1570:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    {
                    // InternalAutomatedRestTesting.g:1570:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    // InternalAutomatedRestTesting.g:1571:6: lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET
                    {
                    lv_isArray_2_0=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_16); 

                    						newLeafNode(lv_isArray_2_0, grammarAccess.getDomainAttributeAccess().getIsArraySQUARE_LEFT_BRACKETTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDomainAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isArray",
                    							true,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.SQUARE_LEFT_BRACKET");
                    					

                    }


                    }

                    this_SQUARE_RIGHT_BRACKET_3=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_4); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_3, grammarAccess.getDomainAttributeAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1592:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1593:4: (lv_name_4_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1593:4: (lv_name_4_0= ruleEString )
            // InternalAutomatedRestTesting.g:1594:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:1611:3: (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LEFT_PARENTHESIS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1612:4: this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS
                    {
                    this_LEFT_PARENTHESIS_5=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_42); 

                    				newLeafNode(this_LEFT_PARENTHESIS_5, grammarAccess.getDomainAttributeAccess().getLEFT_PARENTHESISTerminalRuleCall_4_0());
                    			
                    // InternalAutomatedRestTesting.g:1616:4: ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==41) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:1617:5: ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA
                            {
                            // InternalAutomatedRestTesting.g:1617:5: ( (lv_primaryKey_6_0= 'PK' ) )
                            // InternalAutomatedRestTesting.g:1618:6: (lv_primaryKey_6_0= 'PK' )
                            {
                            // InternalAutomatedRestTesting.g:1618:6: (lv_primaryKey_6_0= 'PK' )
                            // InternalAutomatedRestTesting.g:1619:7: lv_primaryKey_6_0= 'PK'
                            {
                            lv_primaryKey_6_0=(Token)match(input,41,FOLLOW_33); 

                            							newLeafNode(lv_primaryKey_6_0, grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDomainAttributeRule());
                            							}
                            							setWithLastConsumed(current, "primaryKey", true, "PK");
                            						

                            }


                            }

                            this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_42); 

                            					newLeafNode(this_COMMA_7, grammarAccess.getDomainAttributeAccess().getCOMMATerminalRuleCall_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAutomatedRestTesting.g:1636:4: ( (lv_restrictions_8_0= ruleRestriction ) )
                    // InternalAutomatedRestTesting.g:1637:5: (lv_restrictions_8_0= ruleRestriction )
                    {
                    // InternalAutomatedRestTesting.g:1637:5: (lv_restrictions_8_0= ruleRestriction )
                    // InternalAutomatedRestTesting.g:1638:6: lv_restrictions_8_0= ruleRestriction
                    {

                    						newCompositeNode(grammarAccess.getDomainAttributeAccess().getRestrictionsRestrictionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_restrictions_8_0=ruleRestriction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainAttributeRule());
                    						}
                    						add(
                    							current,
                    							"restrictions",
                    							lv_restrictions_8_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Restriction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_RIGHT_PARENTHESIS_9=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_PARENTHESIS_9, grammarAccess.getDomainAttributeAccess().getRIGHT_PARENTHESISTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainAttribute"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalAutomatedRestTesting.g:1664:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1664:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:1665:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
            {
             newCompositeNode(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleEntity=ruleSimpleEntity();

            state._fsp--;

             current =iv_ruleSimpleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalAutomatedRestTesting.g:1671:1: ruleSimpleEntity returns [EObject current=null] : ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LEFT_BRACKET_3=null;
        Token this_SEMICOLON_5=null;
        Token this_SEMICOLON_7=null;
        Token this_RIGHT_BRACKET_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entityAttributes_4_0 = null;

        EObject lv_entityAttributes_6_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1677:2: ( ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1678:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1678:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1679:3: () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1679:3: ()
            // InternalAutomatedRestTesting.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1690:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1691:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1691:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1692:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_38); 

            			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getSimpleEntityAccess().getLEFT_BRACKETTerminalRuleCall_3());
            		
            // InternalAutomatedRestTesting.g:1713:3: ( (lv_entityAttributes_4_0= ruleAttribute ) )
            // InternalAutomatedRestTesting.g:1714:4: (lv_entityAttributes_4_0= ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:1714:4: (lv_entityAttributes_4_0= ruleAttribute )
            // InternalAutomatedRestTesting.g:1715:5: lv_entityAttributes_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_entityAttributes_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            					}
            					add(
            						current,
            						"entityAttributes",
            						lv_entityAttributes_4_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalAutomatedRestTesting.g:1736:3: ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=45 && LA29_0<=49)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1737:4: ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1737:4: ( (lv_entityAttributes_6_0= ruleAttribute ) )
            	    // InternalAutomatedRestTesting.g:1738:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1738:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    // InternalAutomatedRestTesting.g:1739:6: lv_entityAttributes_6_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleEntityAccess().getEntityAttributesAttributeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_entityAttributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityAttributes",
            	    							lv_entityAttributes_6_0,
            	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

            	    				newLeafNode(this_SEMICOLON_7, grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getSimpleEntityAccess().getRIGHT_BRACKETTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "ruleAssertionType"
    // InternalAutomatedRestTesting.g:1769:1: ruleAssertionType returns [Enumerator current=null] : ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) ) ;
    public final Enumerator ruleAssertionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1775:2: ( ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) ) )
            // InternalAutomatedRestTesting.g:1776:2: ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) )
            {
            // InternalAutomatedRestTesting.g:1776:2: ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1777:3: (enumLiteral_0= 'response->' )
                    {
                    // InternalAutomatedRestTesting.g:1777:3: (enumLiteral_0= 'response->' )
                    // InternalAutomatedRestTesting.g:1778:4: enumLiteral_0= 'response->'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1785:3: (enumLiteral_1= 'response.' )
                    {
                    // InternalAutomatedRestTesting.g:1785:3: (enumLiteral_1= 'response.' )
                    // InternalAutomatedRestTesting.g:1786:4: enumLiteral_1= 'response.'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAssertionTypeAccess().getInformationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssertionTypeAccess().getInformationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertionType"


    // $ANTLR start "ruleAttributeType"
    // InternalAutomatedRestTesting.g:1796:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1802:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) )
            // InternalAutomatedRestTesting.g:1803:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            {
            // InternalAutomatedRestTesting.g:1803:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt31=1;
                }
                break;
            case 46:
                {
                alt31=2;
                }
                break;
            case 47:
                {
                alt31=3;
                }
                break;
            case 48:
                {
                alt31=4;
                }
                break;
            case 49:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1804:3: (enumLiteral_0= 'string' )
                    {
                    // InternalAutomatedRestTesting.g:1804:3: (enumLiteral_0= 'string' )
                    // InternalAutomatedRestTesting.g:1805:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1812:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalAutomatedRestTesting.g:1812:3: (enumLiteral_1= 'boolean' )
                    // InternalAutomatedRestTesting.g:1813:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1820:3: (enumLiteral_2= 'integer' )
                    {
                    // InternalAutomatedRestTesting.g:1820:3: (enumLiteral_2= 'integer' )
                    // InternalAutomatedRestTesting.g:1821:4: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1828:3: (enumLiteral_3= 'double' )
                    {
                    // InternalAutomatedRestTesting.g:1828:3: (enumLiteral_3= 'double' )
                    // InternalAutomatedRestTesting.g:1829:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1836:3: (enumLiteral_4= 'date' )
                    {
                    // InternalAutomatedRestTesting.g:1836:3: (enumLiteral_4= 'date' )
                    // InternalAutomatedRestTesting.g:1837:4: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleRelationalOperator"
    // InternalAutomatedRestTesting.g:1847:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1853:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalAutomatedRestTesting.g:1854:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalAutomatedRestTesting.g:1854:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt32=1;
                }
                break;
            case 51:
                {
                alt32=2;
                }
                break;
            case 52:
                {
                alt32=3;
                }
                break;
            case 53:
                {
                alt32=4;
                }
                break;
            case 54:
                {
                alt32=5;
                }
                break;
            case 55:
                {
                alt32=6;
                }
                break;
            case 56:
                {
                alt32=7;
                }
                break;
            case 57:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1855:3: (enumLiteral_0= '<' )
                    {
                    // InternalAutomatedRestTesting.g:1855:3: (enumLiteral_0= '<' )
                    // InternalAutomatedRestTesting.g:1856:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1863:3: (enumLiteral_1= '<=' )
                    {
                    // InternalAutomatedRestTesting.g:1863:3: (enumLiteral_1= '<=' )
                    // InternalAutomatedRestTesting.g:1864:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1871:3: (enumLiteral_2= '==' )
                    {
                    // InternalAutomatedRestTesting.g:1871:3: (enumLiteral_2= '==' )
                    // InternalAutomatedRestTesting.g:1872:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1879:3: (enumLiteral_3= '!=' )
                    {
                    // InternalAutomatedRestTesting.g:1879:3: (enumLiteral_3= '!=' )
                    // InternalAutomatedRestTesting.g:1880:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1887:3: (enumLiteral_4= '>=' )
                    {
                    // InternalAutomatedRestTesting.g:1887:3: (enumLiteral_4= '>=' )
                    // InternalAutomatedRestTesting.g:1888:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:1895:3: (enumLiteral_5= '>' )
                    {
                    // InternalAutomatedRestTesting.g:1895:3: (enumLiteral_5= '>' )
                    // InternalAutomatedRestTesting.g:1896:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:1903:3: (enumLiteral_6= '&&' )
                    {
                    // InternalAutomatedRestTesting.g:1903:3: (enumLiteral_6= '&&' )
                    // InternalAutomatedRestTesting.g:1904:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:1911:3: (enumLiteral_7= '||' )
                    {
                    // InternalAutomatedRestTesting.g:1911:3: (enumLiteral_7= '||' )
                    // InternalAutomatedRestTesting.g:1912:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getRelationalOperatorAccess().getOREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleMethodType"
    // InternalAutomatedRestTesting.g:1922:1: ruleMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1928:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalAutomatedRestTesting.g:1929:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalAutomatedRestTesting.g:1929:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt33=1;
                }
                break;
            case 59:
                {
                alt33=2;
                }
                break;
            case 60:
                {
                alt33=3;
                }
                break;
            case 61:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1930:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalAutomatedRestTesting.g:1930:3: (enumLiteral_0= 'GET' )
                    // InternalAutomatedRestTesting.g:1931:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1938:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalAutomatedRestTesting.g:1938:3: (enumLiteral_1= 'POST' )
                    // InternalAutomatedRestTesting.g:1939:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1946:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalAutomatedRestTesting.g:1946:3: (enumLiteral_2= 'PUT' )
                    // InternalAutomatedRestTesting.g:1947:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1954:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalAutomatedRestTesting.g:1954:3: (enumLiteral_3= 'DELETE' )
                    // InternalAutomatedRestTesting.g:1955:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMethodTypeAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodType"


    // $ANTLR start "ruleParameterType"
    // InternalAutomatedRestTesting.g:1965:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= '/:' ) | (enumLiteral_1= '?$' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1971:2: ( ( (enumLiteral_0= '/:' ) | (enumLiteral_1= '?$' ) ) )
            // InternalAutomatedRestTesting.g:1972:2: ( (enumLiteral_0= '/:' ) | (enumLiteral_1= '?$' ) )
            {
            // InternalAutomatedRestTesting.g:1972:2: ( (enumLiteral_0= '/:' ) | (enumLiteral_1= '?$' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==62) ) {
                alt34=1;
            }
            else if ( (LA34_0==63) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1973:3: (enumLiteral_0= '/:' )
                    {
                    // InternalAutomatedRestTesting.g:1973:3: (enumLiteral_0= '/:' )
                    // InternalAutomatedRestTesting.g:1974:4: enumLiteral_0= '/:'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1981:3: (enumLiteral_1= '?$' )
                    {
                    // InternalAutomatedRestTesting.g:1981:3: (enumLiteral_1= '?$' )
                    // InternalAutomatedRestTesting.g:1982:4: enumLiteral_1= '?$'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getQueryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "ruleMockTypes"
    // InternalAutomatedRestTesting.g:1992:1: ruleMockTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) ;
    public final Enumerator ruleMockTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1998:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) )
            // InternalAutomatedRestTesting.g:1999:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            {
            // InternalAutomatedRestTesting.g:1999:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            int alt35=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt35=1;
                }
                break;
            case 65:
                {
                alt35=2;
                }
                break;
            case 66:
                {
                alt35=3;
                }
                break;
            case 67:
                {
                alt35=4;
                }
                break;
            case 68:
                {
                alt35=5;
                }
                break;
            case 69:
                {
                alt35=6;
                }
                break;
            case 70:
                {
                alt35=7;
                }
                break;
            case 71:
                {
                alt35=8;
                }
                break;
            case 72:
                {
                alt35=9;
                }
                break;
            case 73:
                {
                alt35=10;
                }
                break;
            case 74:
                {
                alt35=11;
                }
                break;
            case 75:
                {
                alt35=12;
                }
                break;
            case 76:
                {
                alt35=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2000:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2000:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:2001:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:2008:3: (enumLiteral_1= 'FirstNameMaleType' )
                    {
                    // InternalAutomatedRestTesting.g:2008:3: (enumLiteral_1= 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:2009:4: enumLiteral_1= 'FirstNameMaleType'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:2016:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    {
                    // InternalAutomatedRestTesting.g:2016:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:2017:4: enumLiteral_2= 'FirstNameFemaleType'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:2024:3: (enumLiteral_3= 'LastNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2024:3: (enumLiteral_3= 'LastNameType' )
                    // InternalAutomatedRestTesting.g:2025:4: enumLiteral_3= 'LastNameType'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:2032:3: (enumLiteral_4= 'FamilyNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2032:3: (enumLiteral_4= 'FamilyNameType' )
                    // InternalAutomatedRestTesting.g:2033:4: enumLiteral_4= 'FamilyNameType'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:2040:3: (enumLiteral_5= 'FullNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2040:3: (enumLiteral_5= 'FullNameType' )
                    // InternalAutomatedRestTesting.g:2041:4: enumLiteral_5= 'FullNameType'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:2048:3: (enumLiteral_6= 'GenderType' )
                    {
                    // InternalAutomatedRestTesting.g:2048:3: (enumLiteral_6= 'GenderType' )
                    // InternalAutomatedRestTesting.g:2049:4: enumLiteral_6= 'GenderType'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:2056:3: (enumLiteral_7= 'EmailAddressType' )
                    {
                    // InternalAutomatedRestTesting.g:2056:3: (enumLiteral_7= 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:2057:4: enumLiteral_7= 'EmailAddressType'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:2064:3: (enumLiteral_8= 'PhoneType' )
                    {
                    // InternalAutomatedRestTesting.g:2064:3: (enumLiteral_8= 'PhoneType' )
                    // InternalAutomatedRestTesting.g:2065:4: enumLiteral_8= 'PhoneType'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:2072:3: (enumLiteral_9= 'CountryType' )
                    {
                    // InternalAutomatedRestTesting.g:2072:3: (enumLiteral_9= 'CountryType' )
                    // InternalAutomatedRestTesting.g:2073:4: enumLiteral_9= 'CountryType'
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:2080:3: (enumLiteral_10= 'CountryCodeType' )
                    {
                    // InternalAutomatedRestTesting.g:2080:3: (enumLiteral_10= 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:2081:4: enumLiteral_10= 'CountryCodeType'
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:2088:3: (enumLiteral_11= 'CityType' )
                    {
                    // InternalAutomatedRestTesting.g:2088:3: (enumLiteral_11= 'CityType' )
                    // InternalAutomatedRestTesting.g:2089:4: enumLiteral_11= 'CityType'
                    {
                    enumLiteral_11=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:2096:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalAutomatedRestTesting.g:2096:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:2097:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getMockTypesAccess().getRowNumberTypeEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x3C00050080000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x3C00000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xC000000000000220L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x03FC180000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x03FC180000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000010000080C2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000010000080C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000050000080C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003E00000001000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000040000L});

}