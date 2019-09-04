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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_STRING", "RULE_ID", "RULE_LEFT_BRACKET", "RULE_COMMA", "RULE_RIGHT_BRACKET", "RULE_SLASH", "RULE_TWO_DOTS", "RULE_QUESTION_MARK", "RULE_MONEY", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'Test'", "'description'", "'assertions'", "'URL'", "'Request'", "'Type'", "'[]'", "'Response'", "'Assertion'", "'dataToTest'", "'condition'", "'Expression'", "'type'", "'expectedValue'", "'relationalOperator'", "'mockType'", "'Entity'", "'PK'", "'SimpleEntity'", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'Minor'", "'MinorEqual'", "'Equal'", "'Different'", "'MajorEqual'", "'Major'", "'AND'", "'OR'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'"
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
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=9;
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
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=10;
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

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

            if ( (LA2_0==39||LA2_0==41) ) {
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

                        if ( (LA1_0==39||LA1_0==41) ) {
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

            if ( ((LA4_0>=55 && LA4_0<=58)) ) {
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

                        if ( ((LA3_0>=55 && LA3_0<=58)) ) {
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

            if ( (LA6_0==23) ) {
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

                        if ( (LA5_0==23) ) {
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

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
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


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:337:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalAutomatedRestTesting.g:337:45: (iv_ruleTest= ruleTest EOF )
            // InternalAutomatedRestTesting.g:338:2: iv_ruleTest= ruleTest EOF
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
    // InternalAutomatedRestTesting.g:344:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'assertions' this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_assertions_7_0= ruleAssertion ) ) (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )* this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_11= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_LEFT_BRACKET_6=null;
        Token this_COMMA_8=null;
        Token this_RIGHT_BRACKET_10=null;
        Token this_RIGHT_BRACKET_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_assertions_7_0 = null;

        EObject lv_assertions_9_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:350:2: ( (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'assertions' this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_assertions_7_0= ruleAssertion ) ) (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )* this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_11= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:351:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'assertions' this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_assertions_7_0= ruleAssertion ) ) (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )* this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_11= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:351:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'assertions' this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_assertions_7_0= ruleAssertion ) ) (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )* this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_11= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:352:3: otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'assertions' this_LEFT_BRACKET_6= RULE_LEFT_BRACKET ( (lv_assertions_7_0= ruleAssertion ) ) (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )* this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_11= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalAutomatedRestTesting.g:356:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:357:4: (lv_name_1_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:357:4: (lv_name_1_0= ruleEString )
            // InternalAutomatedRestTesting.g:358:5: lv_name_1_0= ruleEString
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

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_10); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:379:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAutomatedRestTesting.g:380:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTestAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalAutomatedRestTesting.g:384:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalAutomatedRestTesting.g:385:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:385:5: (lv_description_4_0= ruleEString )
                    // InternalAutomatedRestTesting.g:386:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getAssertionsKeyword_4());
            		
            this_LEFT_BRACKET_6=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_12); 

            			newLeafNode(this_LEFT_BRACKET_6, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_5());
            		
            // InternalAutomatedRestTesting.g:412:3: ( (lv_assertions_7_0= ruleAssertion ) )
            // InternalAutomatedRestTesting.g:413:4: (lv_assertions_7_0= ruleAssertion )
            {
            // InternalAutomatedRestTesting.g:413:4: (lv_assertions_7_0= ruleAssertion )
            // InternalAutomatedRestTesting.g:414:5: lv_assertions_7_0= ruleAssertion
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_assertions_7_0=ruleAssertion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					add(
            						current,
            						"assertions",
            						lv_assertions_7_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.Assertion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:431:3: (this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:432:4: this_COMMA_8= RULE_COMMA ( (lv_assertions_9_0= ruleAssertion ) )
            	    {
            	    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            	    				newLeafNode(this_COMMA_8, grammarAccess.getTestAccess().getCOMMATerminalRuleCall_7_0());
            	    			
            	    // InternalAutomatedRestTesting.g:436:4: ( (lv_assertions_9_0= ruleAssertion ) )
            	    // InternalAutomatedRestTesting.g:437:5: (lv_assertions_9_0= ruleAssertion )
            	    {
            	    // InternalAutomatedRestTesting.g:437:5: (lv_assertions_9_0= ruleAssertion )
            	    // InternalAutomatedRestTesting.g:438:6: lv_assertions_9_0= ruleAssertion
            	    {

            	    						newCompositeNode(grammarAccess.getTestAccess().getAssertionsAssertionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_assertions_9_0=ruleAssertion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assertions",
            	    							lv_assertions_9_0,
            	    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Assertion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_RIGHT_BRACKET_10=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_14); 

            			newLeafNode(this_RIGHT_BRACKET_10, grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_8());
            		
            this_RIGHT_BRACKET_11=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_11, grammarAccess.getTestAccess().getRIGHT_BRACKETTerminalRuleCall_9());
            		

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


    // $ANTLR start "entryRuleRestService"
    // InternalAutomatedRestTesting.g:468:1: entryRuleRestService returns [EObject current=null] : iv_ruleRestService= ruleRestService EOF ;
    public final EObject entryRuleRestService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestService = null;


        try {
            // InternalAutomatedRestTesting.g:468:52: (iv_ruleRestService= ruleRestService EOF )
            // InternalAutomatedRestTesting.g:469:2: iv_ruleRestService= ruleRestService EOF
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
    // InternalAutomatedRestTesting.g:475:1: ruleRestService returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )? otherlv_19= 'Response' this_LEFT_BRACKET_20= RULE_LEFT_BRACKET otherlv_21= 'Type' this_EQUAL_22= RULE_EQUAL ( ( ruleEString ) ) (otherlv_24= '[]' )? this_SEMICOLON_25= RULE_SEMICOLON this_RIGHT_BRACKET_26= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_27= RULE_RIGHT_BRACKET ) ;
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
        Token otherlv_16=null;
        Token this_SEMICOLON_17=null;
        Token this_RIGHT_BRACKET_18=null;
        Token otherlv_19=null;
        Token this_LEFT_BRACKET_20=null;
        Token otherlv_21=null;
        Token this_EQUAL_22=null;
        Token otherlv_24=null;
        Token this_SEMICOLON_25=null;
        Token this_RIGHT_BRACKET_26=null;
        Token this_RIGHT_BRACKET_27=null;
        Enumerator lv_method_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:481:2: ( ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )? otherlv_19= 'Response' this_LEFT_BRACKET_20= RULE_LEFT_BRACKET otherlv_21= 'Type' this_EQUAL_22= RULE_EQUAL ( ( ruleEString ) ) (otherlv_24= '[]' )? this_SEMICOLON_25= RULE_SEMICOLON this_RIGHT_BRACKET_26= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_27= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:482:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )? otherlv_19= 'Response' this_LEFT_BRACKET_20= RULE_LEFT_BRACKET otherlv_21= 'Type' this_EQUAL_22= RULE_EQUAL ( ( ruleEString ) ) (otherlv_24= '[]' )? this_SEMICOLON_25= RULE_SEMICOLON this_RIGHT_BRACKET_26= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_27= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:482:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )? otherlv_19= 'Response' this_LEFT_BRACKET_20= RULE_LEFT_BRACKET otherlv_21= 'Type' this_EQUAL_22= RULE_EQUAL ( ( ruleEString ) ) (otherlv_24= '[]' )? this_SEMICOLON_25= RULE_SEMICOLON this_RIGHT_BRACKET_26= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_27= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:483:3: ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= RULE_SLASH ) ) ruleEString ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )* this_SEMICOLON_10= RULE_SEMICOLON (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )? otherlv_19= 'Response' this_LEFT_BRACKET_20= RULE_LEFT_BRACKET otherlv_21= 'Type' this_EQUAL_22= RULE_EQUAL ( ( ruleEString ) ) (otherlv_24= '[]' )? this_SEMICOLON_25= RULE_SEMICOLON this_RIGHT_BRACKET_26= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_27= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:483:3: ( (lv_method_0_0= ruleMethodType ) )
            // InternalAutomatedRestTesting.g:484:4: (lv_method_0_0= ruleMethodType )
            {
            // InternalAutomatedRestTesting.g:484:4: (lv_method_0_0= ruleMethodType )
            // InternalAutomatedRestTesting.g:485:5: lv_method_0_0= ruleMethodType
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

            // InternalAutomatedRestTesting.g:502:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:503:4: (lv_name_1_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:503:4: (lv_name_1_0= ruleEString )
            // InternalAutomatedRestTesting.g:504:5: lv_name_1_0= ruleEString
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

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_15); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestServiceAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_16); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:533:3: ( (lv_uri_5_0= RULE_SLASH ) )
            // InternalAutomatedRestTesting.g:534:4: (lv_uri_5_0= RULE_SLASH )
            {
            // InternalAutomatedRestTesting.g:534:4: (lv_uri_5_0= RULE_SLASH )
            // InternalAutomatedRestTesting.g:535:5: lv_uri_5_0= RULE_SLASH
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
            		
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalAutomatedRestTesting.g:558:3: ( (this_SLASH_7= RULE_SLASH ruleEString ) | ( (lv_parameters_9_0= ruleParameter ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SLASH) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_TWO_DOTS) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_2>=RULE_STRING && LA11_2<=RULE_ID)) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_QUESTION_MARK) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:559:4: (this_SLASH_7= RULE_SLASH ruleEString )
            	    {
            	    // InternalAutomatedRestTesting.g:559:4: (this_SLASH_7= RULE_SLASH ruleEString )
            	    // InternalAutomatedRestTesting.g:560:5: this_SLASH_7= RULE_SLASH ruleEString
            	    {
            	    this_SLASH_7=(Token)match(input,RULE_SLASH,FOLLOW_4); 

            	    					newLeafNode(this_SLASH_7, grammarAccess.getRestServiceAccess().getSLASHTerminalRuleCall_7_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getRestServiceAccess().getEStringParserRuleCall_7_0_1());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAutomatedRestTesting.g:573:4: ( (lv_parameters_9_0= ruleParameter ) )
            	    {
            	    // InternalAutomatedRestTesting.g:573:4: ( (lv_parameters_9_0= ruleParameter ) )
            	    // InternalAutomatedRestTesting.g:574:5: (lv_parameters_9_0= ruleParameter )
            	    {
            	    // InternalAutomatedRestTesting.g:574:5: (lv_parameters_9_0= ruleParameter )
            	    // InternalAutomatedRestTesting.g:575:6: lv_parameters_9_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRestServiceAccess().getParametersParameterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop11;
                }
            } while (true);

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_18); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalAutomatedRestTesting.g:597:3: (otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:598:4: otherlv_11= 'Request' this_LEFT_BRACKET_12= RULE_LEFT_BRACKET otherlv_13= 'Type' this_EQUAL_14= RULE_EQUAL ( ( ruleEString ) ) (otherlv_16= '[]' )? this_SEMICOLON_17= RULE_SEMICOLON this_RIGHT_BRACKET_18= RULE_RIGHT_BRACKET
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRestServiceAccess().getRequestKeyword_9_0());
                    			
                    this_LEFT_BRACKET_12=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_19); 

                    				newLeafNode(this_LEFT_BRACKET_12, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9_1());
                    			
                    otherlv_13=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRestServiceAccess().getTypeKeyword_9_2());
                    			
                    this_EQUAL_14=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_14, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_9_3());
                    			
                    // InternalAutomatedRestTesting.g:614:4: ( ( ruleEString ) )
                    // InternalAutomatedRestTesting.g:615:5: ( ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:615:5: ( ruleEString )
                    // InternalAutomatedRestTesting.g:616:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_9_4_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:630:4: (otherlv_16= '[]' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==29) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:631:5: otherlv_16= '[]'
                            {
                            otherlv_16=(Token)match(input,29,FOLLOW_5); 

                            					newLeafNode(otherlv_16, grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_9_5());
                            				

                            }
                            break;

                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_14); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_9_6());
                    			
                    this_RIGHT_BRACKET_18=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_21); 

                    				newLeafNode(this_RIGHT_BRACKET_18, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_9_7());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getRestServiceAccess().getResponseKeyword_10());
            		
            this_LEFT_BRACKET_20=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_19); 

            			newLeafNode(this_LEFT_BRACKET_20, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_11());
            		
            otherlv_21=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getRestServiceAccess().getTypeKeyword_12());
            		
            this_EQUAL_22=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_22, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_13());
            		
            // InternalAutomatedRestTesting.g:661:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:662:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:662:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:663:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_14_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:677:3: (otherlv_24= '[]' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAutomatedRestTesting.g:678:4: otherlv_24= '[]'
                    {
                    otherlv_24=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_24, grammarAccess.getRestServiceAccess().getLeftSquareBracketRightSquareBracketKeyword_15());
                    			

                    }
                    break;

            }

            this_SEMICOLON_25=(Token)match(input,RULE_SEMICOLON,FOLLOW_14); 

            			newLeafNode(this_SEMICOLON_25, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_16());
            		
            this_RIGHT_BRACKET_26=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_14); 

            			newLeafNode(this_RIGHT_BRACKET_26, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_17());
            		
            this_RIGHT_BRACKET_27=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_27, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_18());
            		

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


    // $ANTLR start "entryRuleAssertion"
    // InternalAutomatedRestTesting.g:699:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalAutomatedRestTesting.g:699:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalAutomatedRestTesting.g:700:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalAutomatedRestTesting.g:706:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'Assertion' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET otherlv_2= 'dataToTest' ( ( ruleEString ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleExpression ) ) this_RIGHT_BRACKET_6= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RIGHT_BRACKET_6=null;
        EObject lv_condition_5_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:712:2: ( (otherlv_0= 'Assertion' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET otherlv_2= 'dataToTest' ( ( ruleEString ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleExpression ) ) this_RIGHT_BRACKET_6= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:713:2: (otherlv_0= 'Assertion' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET otherlv_2= 'dataToTest' ( ( ruleEString ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleExpression ) ) this_RIGHT_BRACKET_6= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:713:2: (otherlv_0= 'Assertion' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET otherlv_2= 'dataToTest' ( ( ruleEString ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleExpression ) ) this_RIGHT_BRACKET_6= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:714:3: otherlv_0= 'Assertion' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET otherlv_2= 'dataToTest' ( ( ruleEString ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleExpression ) ) this_RIGHT_BRACKET_6= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertionKeyword_0());
            		
            this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_22); 

            			newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getAssertionAccess().getLEFT_BRACKETTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getDataToTestKeyword_2());
            		
            // InternalAutomatedRestTesting.g:726:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:727:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:727:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:728:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getAssertionAccess().getConditionKeyword_4());
            		
            // InternalAutomatedRestTesting.g:746:3: ( (lv_condition_5_0= ruleExpression ) )
            // InternalAutomatedRestTesting.g:747:4: (lv_condition_5_0= ruleExpression )
            {
            // InternalAutomatedRestTesting.g:747:4: (lv_condition_5_0= ruleExpression )
            // InternalAutomatedRestTesting.g:748:5: lv_condition_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_condition_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RIGHT_BRACKET_6=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_6, grammarAccess.getAssertionAccess().getRIGHT_BRACKETTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleExpression"
    // InternalAutomatedRestTesting.g:773:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAutomatedRestTesting.g:773:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAutomatedRestTesting.g:774:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAutomatedRestTesting.g:780:1: ruleExpression returns [EObject current=null] : ( () otherlv_1= 'Expression' this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )? (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )? (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LEFT_BRACKET_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_RIGHT_BRACKET_9=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_expectedValue_6_0 = null;

        Enumerator lv_relationalOperator_8_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:786:2: ( ( () otherlv_1= 'Expression' this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )? (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )? (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:787:2: ( () otherlv_1= 'Expression' this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )? (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )? (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:787:2: ( () otherlv_1= 'Expression' this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )? (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )? (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:788:3: () otherlv_1= 'Expression' this_LEFT_BRACKET_2= RULE_LEFT_BRACKET (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )? (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )? (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:788:3: ()
            // InternalAutomatedRestTesting.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getExpressionKeyword_1());
            		
            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_25); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getExpressionAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:803:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAutomatedRestTesting.g:804:4: otherlv_3= 'type' ( (lv_type_4_0= ruleAttributeType ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getTypeKeyword_3_0());
                    			
                    // InternalAutomatedRestTesting.g:808:4: ( (lv_type_4_0= ruleAttributeType ) )
                    // InternalAutomatedRestTesting.g:809:5: (lv_type_4_0= ruleAttributeType )
                    {
                    // InternalAutomatedRestTesting.g:809:5: (lv_type_4_0= ruleAttributeType )
                    // InternalAutomatedRestTesting.g:810:6: lv_type_4_0= ruleAttributeType
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getTypeAttributeTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_4_0=ruleAttributeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.AttributeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:828:3: (otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAutomatedRestTesting.g:829:4: otherlv_5= 'expectedValue' ( (lv_expectedValue_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getExpectedValueKeyword_4_0());
                    			
                    // InternalAutomatedRestTesting.g:833:4: ( (lv_expectedValue_6_0= ruleEString ) )
                    // InternalAutomatedRestTesting.g:834:5: (lv_expectedValue_6_0= ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:834:5: (lv_expectedValue_6_0= ruleEString )
                    // InternalAutomatedRestTesting.g:835:6: lv_expectedValue_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpectedValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_expectedValue_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expectedValue",
                    							lv_expectedValue_6_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:853:3: (otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAutomatedRestTesting.g:854:4: otherlv_7= 'relationalOperator' ( (lv_relationalOperator_8_0= ruleRelationalOperator ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getRelationalOperatorKeyword_5_0());
                    			
                    // InternalAutomatedRestTesting.g:858:4: ( (lv_relationalOperator_8_0= ruleRelationalOperator ) )
                    // InternalAutomatedRestTesting.g:859:5: (lv_relationalOperator_8_0= ruleRelationalOperator )
                    {
                    // InternalAutomatedRestTesting.g:859:5: (lv_relationalOperator_8_0= ruleRelationalOperator )
                    // InternalAutomatedRestTesting.g:860:6: lv_relationalOperator_8_0= ruleRelationalOperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_relationalOperator_8_0=ruleRelationalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"relationalOperator",
                    							lv_relationalOperator_8_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.RelationalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_RIGHT_BRACKET_9=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_9, grammarAccess.getExpressionAccess().getRIGHT_BRACKETTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:886:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAutomatedRestTesting.g:886:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAutomatedRestTesting.g:887:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAutomatedRestTesting.g:893:1: ruleParameter returns [EObject current=null] : ( () ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) ) this_LEFT_BRACKET_5= RULE_LEFT_BRACKET ( (lv_name_6_0= ruleEString ) ) this_RIGHT_BRACKET_7= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token this_SLASH_1=null;
        Token this_TWO_DOTS_2=null;
        Token this_QUESTION_MARK_3=null;
        Token this_MONEY_4=null;
        Token this_LEFT_BRACKET_5=null;
        Token this_RIGHT_BRACKET_7=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:899:2: ( ( () ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) ) this_LEFT_BRACKET_5= RULE_LEFT_BRACKET ( (lv_name_6_0= ruleEString ) ) this_RIGHT_BRACKET_7= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:900:2: ( () ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) ) this_LEFT_BRACKET_5= RULE_LEFT_BRACKET ( (lv_name_6_0= ruleEString ) ) this_RIGHT_BRACKET_7= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:900:2: ( () ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) ) this_LEFT_BRACKET_5= RULE_LEFT_BRACKET ( (lv_name_6_0= ruleEString ) ) this_RIGHT_BRACKET_7= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:901:3: () ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) ) this_LEFT_BRACKET_5= RULE_LEFT_BRACKET ( (lv_name_6_0= ruleEString ) ) this_RIGHT_BRACKET_7= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:901:3: ()
            // InternalAutomatedRestTesting.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:908:3: ( (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS ) | (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SLASH) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_QUESTION_MARK) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAutomatedRestTesting.g:909:4: (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS )
                    {
                    // InternalAutomatedRestTesting.g:909:4: (this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS )
                    // InternalAutomatedRestTesting.g:910:5: this_SLASH_1= RULE_SLASH this_TWO_DOTS_2= RULE_TWO_DOTS
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_30); 

                    					newLeafNode(this_SLASH_1, grammarAccess.getParameterAccess().getSLASHTerminalRuleCall_1_0_0());
                    				
                    this_TWO_DOTS_2=(Token)match(input,RULE_TWO_DOTS,FOLLOW_9); 

                    					newLeafNode(this_TWO_DOTS_2, grammarAccess.getParameterAccess().getTWO_DOTSTerminalRuleCall_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:920:4: (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY )
                    {
                    // InternalAutomatedRestTesting.g:920:4: (this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY )
                    // InternalAutomatedRestTesting.g:921:5: this_QUESTION_MARK_3= RULE_QUESTION_MARK this_MONEY_4= RULE_MONEY
                    {
                    this_QUESTION_MARK_3=(Token)match(input,RULE_QUESTION_MARK,FOLLOW_31); 

                    					newLeafNode(this_QUESTION_MARK_3, grammarAccess.getParameterAccess().getQUESTION_MARKTerminalRuleCall_1_1_0());
                    				
                    this_MONEY_4=(Token)match(input,RULE_MONEY,FOLLOW_9); 

                    					newLeafNode(this_MONEY_4, grammarAccess.getParameterAccess().getMONEYTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }

            this_LEFT_BRACKET_5=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_4); 

            			newLeafNode(this_LEFT_BRACKET_5, grammarAccess.getParameterAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:935:3: ( (lv_name_6_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:936:4: (lv_name_6_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:936:4: (lv_name_6_0= ruleEString )
            // InternalAutomatedRestTesting.g:937:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RIGHT_BRACKET_7=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_7, grammarAccess.getParameterAccess().getRIGHT_BRACKETTerminalRuleCall_4());
            		

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
    // InternalAutomatedRestTesting.g:962:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // InternalAutomatedRestTesting.g:962:52: (iv_ruleRestriction= ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:963:2: iv_ruleRestriction= ruleRestriction EOF
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
    // InternalAutomatedRestTesting.g:969:1: ruleRestriction returns [EObject current=null] : ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Enumerator lv_mockType_3_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:975:2: ( ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) )
            // InternalAutomatedRestTesting.g:976:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            {
            // InternalAutomatedRestTesting.g:976:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            // InternalAutomatedRestTesting.g:977:3: () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) )
            {
            // InternalAutomatedRestTesting.g:977:3: ()
            // InternalAutomatedRestTesting.g:978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestrictionAccess().getRestrictionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getMockTypeKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_32); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getRestrictionAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:992:3: ( (lv_mockType_3_0= ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:993:4: (lv_mockType_3_0= ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:993:4: (lv_mockType_3_0= ruleMockTypes )
            // InternalAutomatedRestTesting.g:994:5: lv_mockType_3_0= ruleMockTypes
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
    // InternalAutomatedRestTesting.g:1015:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1015:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAutomatedRestTesting.g:1016:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAutomatedRestTesting.g:1022:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:1028:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1029:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1029:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1030:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1030:3: ()
            // InternalAutomatedRestTesting.g:1031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1041:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1042:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1042:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1043:5: lv_name_2_0= ruleEString
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

            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_26); 

            			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getEntityAccess().getLEFT_BRACKETTerminalRuleCall_3());
            		
            // InternalAutomatedRestTesting.g:1064:3: ( (lv_entityAttributes_4_0= ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:1065:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:1065:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:1066:5: lv_entityAttributes_4_0= ruleDomainAttribute
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

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalAutomatedRestTesting.g:1087:3: ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=42 && LA19_0<=46)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1088:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1088:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) )
            	    // InternalAutomatedRestTesting.g:1089:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1089:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    // InternalAutomatedRestTesting.g:1090:6: lv_entityAttributes_6_0= ruleDomainAttribute
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

            	    this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

            	    				newLeafNode(this_SEMICOLON_7, grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAutomatedRestTesting.g:1120:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalAutomatedRestTesting.g:1120:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:1121:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalAutomatedRestTesting.g:1127:1: ruleAttribute_Impl returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1133:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalAutomatedRestTesting.g:1134:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalAutomatedRestTesting.g:1134:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:1135:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:1135:3: ()
            // InternalAutomatedRestTesting.g:1136:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1142:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1143:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1143:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1144:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getTypeAttributeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAutomatedRestTesting.g:1161:3: ( (lv_isArray_2_0= '[]' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1162:4: (lv_isArray_2_0= '[]' )
                    {
                    // InternalAutomatedRestTesting.g:1162:4: (lv_isArray_2_0= '[]' )
                    // InternalAutomatedRestTesting.g:1163:5: lv_isArray_2_0= '[]'
                    {
                    lv_isArray_2_0=(Token)match(input,29,FOLLOW_4); 

                    					newLeafNode(lv_isArray_2_0, grammarAccess.getAttribute_ImplAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttribute_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isArray", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1175:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1176:4: (lv_name_3_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1176:4: (lv_name_3_0= ruleEString )
            // InternalAutomatedRestTesting.g:1177:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
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
    // InternalAutomatedRestTesting.g:1198:1: entryRuleDomainAttribute returns [EObject current=null] : iv_ruleDomainAttribute= ruleDomainAttribute EOF ;
    public final EObject entryRuleDomainAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainAttribute = null;


        try {
            // InternalAutomatedRestTesting.g:1198:56: (iv_ruleDomainAttribute= ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:1199:2: iv_ruleDomainAttribute= ruleDomainAttribute EOF
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
    // InternalAutomatedRestTesting.g:1205:1: ruleDomainAttribute returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )? ) ;
    public final EObject ruleDomainAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token this_LEFT_PARENTHESIS_4=null;
        Token lv_primaryKey_5_0=null;
        Token this_COMMA_6=null;
        Token this_RIGHT_PARENTHESIS_8=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_restrictions_7_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1211:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )? ) )
            // InternalAutomatedRestTesting.g:1212:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )? )
            {
            // InternalAutomatedRestTesting.g:1212:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )? )
            // InternalAutomatedRestTesting.g:1213:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_isArray_2_0= '[]' ) )? ( (lv_name_3_0= ruleEString ) ) (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )?
            {
            // InternalAutomatedRestTesting.g:1213:3: ()
            // InternalAutomatedRestTesting.g:1214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1220:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1221:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1221:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1222:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getDomainAttributeAccess().getTypeAttributeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAutomatedRestTesting.g:1239:3: ( (lv_isArray_2_0= '[]' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1240:4: (lv_isArray_2_0= '[]' )
                    {
                    // InternalAutomatedRestTesting.g:1240:4: (lv_isArray_2_0= '[]' )
                    // InternalAutomatedRestTesting.g:1241:5: lv_isArray_2_0= '[]'
                    {
                    lv_isArray_2_0=(Token)match(input,29,FOLLOW_4); 

                    					newLeafNode(lv_isArray_2_0, grammarAccess.getDomainAttributeAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDomainAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isArray", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1253:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1254:4: (lv_name_3_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1254:4: (lv_name_3_0= ruleEString )
            // InternalAutomatedRestTesting.g:1255:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:1272:3: (this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LEFT_PARENTHESIS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1273:4: this_LEFT_PARENTHESIS_4= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )? ( (lv_restrictions_7_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_8= RULE_RIGHT_PARENTHESIS
                    {
                    this_LEFT_PARENTHESIS_4=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_36); 

                    				newLeafNode(this_LEFT_PARENTHESIS_4, grammarAccess.getDomainAttributeAccess().getLEFT_PARENTHESISTerminalRuleCall_4_0());
                    			
                    // InternalAutomatedRestTesting.g:1277:4: ( ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==40) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:1278:5: ( (lv_primaryKey_5_0= 'PK' ) ) this_COMMA_6= RULE_COMMA
                            {
                            // InternalAutomatedRestTesting.g:1278:5: ( (lv_primaryKey_5_0= 'PK' ) )
                            // InternalAutomatedRestTesting.g:1279:6: (lv_primaryKey_5_0= 'PK' )
                            {
                            // InternalAutomatedRestTesting.g:1279:6: (lv_primaryKey_5_0= 'PK' )
                            // InternalAutomatedRestTesting.g:1280:7: lv_primaryKey_5_0= 'PK'
                            {
                            lv_primaryKey_5_0=(Token)match(input,40,FOLLOW_37); 

                            							newLeafNode(lv_primaryKey_5_0, grammarAccess.getDomainAttributeAccess().getPrimaryKeyPKKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDomainAttributeRule());
                            							}
                            							setWithLastConsumed(current, "primaryKey", true, "PK");
                            						

                            }


                            }

                            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_36); 

                            					newLeafNode(this_COMMA_6, grammarAccess.getDomainAttributeAccess().getCOMMATerminalRuleCall_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAutomatedRestTesting.g:1297:4: ( (lv_restrictions_7_0= ruleRestriction ) )
                    // InternalAutomatedRestTesting.g:1298:5: (lv_restrictions_7_0= ruleRestriction )
                    {
                    // InternalAutomatedRestTesting.g:1298:5: (lv_restrictions_7_0= ruleRestriction )
                    // InternalAutomatedRestTesting.g:1299:6: lv_restrictions_7_0= ruleRestriction
                    {

                    						newCompositeNode(grammarAccess.getDomainAttributeAccess().getRestrictionsRestrictionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_restrictions_7_0=ruleRestriction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainAttributeRule());
                    						}
                    						add(
                    							current,
                    							"restrictions",
                    							lv_restrictions_7_0,
                    							"org.xtext.example.automatedresttesting.AutomatedRestTesting.Restriction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_RIGHT_PARENTHESIS_8=(Token)match(input,RULE_RIGHT_PARENTHESIS,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_PARENTHESIS_8, grammarAccess.getDomainAttributeAccess().getRIGHT_PARENTHESISTerminalRuleCall_4_3());
                    			

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
    // InternalAutomatedRestTesting.g:1325:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1325:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:1326:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
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
    // InternalAutomatedRestTesting.g:1332:1: ruleSimpleEntity returns [EObject current=null] : ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:1338:2: ( ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1339:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1339:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1340:3: () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1340:3: ()
            // InternalAutomatedRestTesting.g:1341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1351:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1352:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1352:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1353:5: lv_name_2_0= ruleEString
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

            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_26); 

            			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getSimpleEntityAccess().getLEFT_BRACKETTerminalRuleCall_3());
            		
            // InternalAutomatedRestTesting.g:1374:3: ( (lv_entityAttributes_4_0= ruleAttribute ) )
            // InternalAutomatedRestTesting.g:1375:4: (lv_entityAttributes_4_0= ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:1375:4: (lv_entityAttributes_4_0= ruleAttribute )
            // InternalAutomatedRestTesting.g:1376:5: lv_entityAttributes_4_0= ruleAttribute
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

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalAutomatedRestTesting.g:1397:3: ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=42 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1398:4: ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1398:4: ( (lv_entityAttributes_6_0= ruleAttribute ) )
            	    // InternalAutomatedRestTesting.g:1399:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1399:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    // InternalAutomatedRestTesting.g:1400:6: lv_entityAttributes_6_0= ruleAttribute
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

            	    this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

            	    				newLeafNode(this_SEMICOLON_7, grammarAccess.getSimpleEntityAccess().getSEMICOLONTerminalRuleCall_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "ruleAttributeType"
    // InternalAutomatedRestTesting.g:1430:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1436:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) )
            // InternalAutomatedRestTesting.g:1437:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            {
            // InternalAutomatedRestTesting.g:1437:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt25=1;
                }
                break;
            case 43:
                {
                alt25=2;
                }
                break;
            case 44:
                {
                alt25=3;
                }
                break;
            case 45:
                {
                alt25=4;
                }
                break;
            case 46:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1438:3: (enumLiteral_0= 'string' )
                    {
                    // InternalAutomatedRestTesting.g:1438:3: (enumLiteral_0= 'string' )
                    // InternalAutomatedRestTesting.g:1439:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1446:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalAutomatedRestTesting.g:1446:3: (enumLiteral_1= 'boolean' )
                    // InternalAutomatedRestTesting.g:1447:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1454:3: (enumLiteral_2= 'integer' )
                    {
                    // InternalAutomatedRestTesting.g:1454:3: (enumLiteral_2= 'integer' )
                    // InternalAutomatedRestTesting.g:1455:4: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1462:3: (enumLiteral_3= 'double' )
                    {
                    // InternalAutomatedRestTesting.g:1462:3: (enumLiteral_3= 'double' )
                    // InternalAutomatedRestTesting.g:1463:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1470:3: (enumLiteral_4= 'date' )
                    {
                    // InternalAutomatedRestTesting.g:1470:3: (enumLiteral_4= 'date' )
                    // InternalAutomatedRestTesting.g:1471:4: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1481:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Minor' ) | (enumLiteral_1= 'MinorEqual' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'Different' ) | (enumLiteral_4= 'MajorEqual' ) | (enumLiteral_5= 'Major' ) | (enumLiteral_6= 'AND' ) | (enumLiteral_7= 'OR' ) ) ;
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
            // InternalAutomatedRestTesting.g:1487:2: ( ( (enumLiteral_0= 'Minor' ) | (enumLiteral_1= 'MinorEqual' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'Different' ) | (enumLiteral_4= 'MajorEqual' ) | (enumLiteral_5= 'Major' ) | (enumLiteral_6= 'AND' ) | (enumLiteral_7= 'OR' ) ) )
            // InternalAutomatedRestTesting.g:1488:2: ( (enumLiteral_0= 'Minor' ) | (enumLiteral_1= 'MinorEqual' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'Different' ) | (enumLiteral_4= 'MajorEqual' ) | (enumLiteral_5= 'Major' ) | (enumLiteral_6= 'AND' ) | (enumLiteral_7= 'OR' ) )
            {
            // InternalAutomatedRestTesting.g:1488:2: ( (enumLiteral_0= 'Minor' ) | (enumLiteral_1= 'MinorEqual' ) | (enumLiteral_2= 'Equal' ) | (enumLiteral_3= 'Different' ) | (enumLiteral_4= 'MajorEqual' ) | (enumLiteral_5= 'Major' ) | (enumLiteral_6= 'AND' ) | (enumLiteral_7= 'OR' ) )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt26=1;
                }
                break;
            case 48:
                {
                alt26=2;
                }
                break;
            case 49:
                {
                alt26=3;
                }
                break;
            case 50:
                {
                alt26=4;
                }
                break;
            case 51:
                {
                alt26=5;
                }
                break;
            case 52:
                {
                alt26=6;
                }
                break;
            case 53:
                {
                alt26=7;
                }
                break;
            case 54:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1489:3: (enumLiteral_0= 'Minor' )
                    {
                    // InternalAutomatedRestTesting.g:1489:3: (enumLiteral_0= 'Minor' )
                    // InternalAutomatedRestTesting.g:1490:4: enumLiteral_0= 'Minor'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1497:3: (enumLiteral_1= 'MinorEqual' )
                    {
                    // InternalAutomatedRestTesting.g:1497:3: (enumLiteral_1= 'MinorEqual' )
                    // InternalAutomatedRestTesting.g:1498:4: enumLiteral_1= 'MinorEqual'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1505:3: (enumLiteral_2= 'Equal' )
                    {
                    // InternalAutomatedRestTesting.g:1505:3: (enumLiteral_2= 'Equal' )
                    // InternalAutomatedRestTesting.g:1506:4: enumLiteral_2= 'Equal'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1513:3: (enumLiteral_3= 'Different' )
                    {
                    // InternalAutomatedRestTesting.g:1513:3: (enumLiteral_3= 'Different' )
                    // InternalAutomatedRestTesting.g:1514:4: enumLiteral_3= 'Different'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1521:3: (enumLiteral_4= 'MajorEqual' )
                    {
                    // InternalAutomatedRestTesting.g:1521:3: (enumLiteral_4= 'MajorEqual' )
                    // InternalAutomatedRestTesting.g:1522:4: enumLiteral_4= 'MajorEqual'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:1529:3: (enumLiteral_5= 'Major' )
                    {
                    // InternalAutomatedRestTesting.g:1529:3: (enumLiteral_5= 'Major' )
                    // InternalAutomatedRestTesting.g:1530:4: enumLiteral_5= 'Major'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:1537:3: (enumLiteral_6= 'AND' )
                    {
                    // InternalAutomatedRestTesting.g:1537:3: (enumLiteral_6= 'AND' )
                    // InternalAutomatedRestTesting.g:1538:4: enumLiteral_6= 'AND'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:1545:3: (enumLiteral_7= 'OR' )
                    {
                    // InternalAutomatedRestTesting.g:1545:3: (enumLiteral_7= 'OR' )
                    // InternalAutomatedRestTesting.g:1546:4: enumLiteral_7= 'OR'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1556:1: ruleMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1562:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalAutomatedRestTesting.g:1563:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalAutomatedRestTesting.g:1563:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            case 58:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1564:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalAutomatedRestTesting.g:1564:3: (enumLiteral_0= 'GET' )
                    // InternalAutomatedRestTesting.g:1565:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1572:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalAutomatedRestTesting.g:1572:3: (enumLiteral_1= 'POST' )
                    // InternalAutomatedRestTesting.g:1573:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1580:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalAutomatedRestTesting.g:1580:3: (enumLiteral_2= 'PUT' )
                    // InternalAutomatedRestTesting.g:1581:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1588:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalAutomatedRestTesting.g:1588:3: (enumLiteral_3= 'DELETE' )
                    // InternalAutomatedRestTesting.g:1589:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

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


    // $ANTLR start "ruleMockTypes"
    // InternalAutomatedRestTesting.g:1599:1: ruleMockTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) ;
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
            // InternalAutomatedRestTesting.g:1605:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) )
            // InternalAutomatedRestTesting.g:1606:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            {
            // InternalAutomatedRestTesting.g:1606:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'FamilyNameType' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            int alt28=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt28=1;
                }
                break;
            case 60:
                {
                alt28=2;
                }
                break;
            case 61:
                {
                alt28=3;
                }
                break;
            case 62:
                {
                alt28=4;
                }
                break;
            case 63:
                {
                alt28=5;
                }
                break;
            case 64:
                {
                alt28=6;
                }
                break;
            case 65:
                {
                alt28=7;
                }
                break;
            case 66:
                {
                alt28=8;
                }
                break;
            case 67:
                {
                alt28=9;
                }
                break;
            case 68:
                {
                alt28=10;
                }
                break;
            case 69:
                {
                alt28=11;
                }
                break;
            case 70:
                {
                alt28=12;
                }
                break;
            case 71:
                {
                alt28=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1607:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalAutomatedRestTesting.g:1607:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:1608:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1615:3: (enumLiteral_1= 'FirstNameMaleType' )
                    {
                    // InternalAutomatedRestTesting.g:1615:3: (enumLiteral_1= 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:1616:4: enumLiteral_1= 'FirstNameMaleType'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1623:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    {
                    // InternalAutomatedRestTesting.g:1623:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:1624:4: enumLiteral_2= 'FirstNameFemaleType'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:1631:3: (enumLiteral_3= 'LastNameType' )
                    {
                    // InternalAutomatedRestTesting.g:1631:3: (enumLiteral_3= 'LastNameType' )
                    // InternalAutomatedRestTesting.g:1632:4: enumLiteral_3= 'LastNameType'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:1639:3: (enumLiteral_4= 'FamilyNameType' )
                    {
                    // InternalAutomatedRestTesting.g:1639:3: (enumLiteral_4= 'FamilyNameType' )
                    // InternalAutomatedRestTesting.g:1640:4: enumLiteral_4= 'FamilyNameType'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockTypesAccess().getFamilyNameTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:1647:3: (enumLiteral_5= 'FullNameType' )
                    {
                    // InternalAutomatedRestTesting.g:1647:3: (enumLiteral_5= 'FullNameType' )
                    // InternalAutomatedRestTesting.g:1648:4: enumLiteral_5= 'FullNameType'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:1655:3: (enumLiteral_6= 'GenderType' )
                    {
                    // InternalAutomatedRestTesting.g:1655:3: (enumLiteral_6= 'GenderType' )
                    // InternalAutomatedRestTesting.g:1656:4: enumLiteral_6= 'GenderType'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:1663:3: (enumLiteral_7= 'EmailAddressType' )
                    {
                    // InternalAutomatedRestTesting.g:1663:3: (enumLiteral_7= 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:1664:4: enumLiteral_7= 'EmailAddressType'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:1671:3: (enumLiteral_8= 'PhoneType' )
                    {
                    // InternalAutomatedRestTesting.g:1671:3: (enumLiteral_8= 'PhoneType' )
                    // InternalAutomatedRestTesting.g:1672:4: enumLiteral_8= 'PhoneType'
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:1679:3: (enumLiteral_9= 'CountryType' )
                    {
                    // InternalAutomatedRestTesting.g:1679:3: (enumLiteral_9= 'CountryType' )
                    // InternalAutomatedRestTesting.g:1680:4: enumLiteral_9= 'CountryType'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:1687:3: (enumLiteral_10= 'CountryCodeType' )
                    {
                    // InternalAutomatedRestTesting.g:1687:3: (enumLiteral_10= 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:1688:4: enumLiteral_10= 'CountryCodeType'
                    {
                    enumLiteral_10=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:1695:3: (enumLiteral_11= 'CityType' )
                    {
                    // InternalAutomatedRestTesting.g:1695:3: (enumLiteral_11= 'CityType' )
                    // InternalAutomatedRestTesting.g:1696:4: enumLiteral_11= 'CityType'
                    {
                    enumLiteral_11=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:1703:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalAutomatedRestTesting.g:1703:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:1704:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,71,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0780028000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0780000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002820L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003800000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007F800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF800000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00007C0000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000200000C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});

}