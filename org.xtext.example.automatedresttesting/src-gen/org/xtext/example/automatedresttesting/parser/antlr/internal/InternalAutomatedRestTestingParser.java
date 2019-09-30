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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_STRING", "RULE_ID", "RULE_LEFT_BRACKET", "RULE_SQUARE_LEFT_BRACKET", "RULE_SQUARE_RIGHT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_DOT", "RULE_ARROW", "RULE_INT", "RULE_COMMA", "RULE_LEFT_PARENTHESIS", "RULE_RIGHT_PARENTHESIS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'URL'", "'Request'", "'Type'", "'Response'", "'Test'", "'service'", "'description'", "'Mapping'", "'Assertions'", "'parameter'", "'value'", "'request'", "'mockType'", "'Entity'", "'PK'", "'SimpleEntity'", "'/'", "'&'", "'?'", "'response->'", "'response.'", "'string'", "'boolean'", "'integer'", "'double'", "'date'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'&&'", "'||'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "':'", "'$'", "'FirstNameType'", "'FirstNameMaleType'", "'FirstNameFemaleType'", "'LastNameType'", "'University'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CountryCodeType'", "'CityType'", "'RowNumberType'"
    };
    public static final int RULE_SQUARE_LEFT_BRACKET=9;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_ARROW=13;
    public static final int RULE_LEFT_PARENTHESIS=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
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
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
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
    public static final int RULE_DOT=12;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_SQUARE_RIGHT_BRACKET=10;
    public static final int T__32=32;
    public static final int RULE_RIGHT_PARENTHESIS=17;
    public static final int RULE_WS=20;
    public static final int RULE_LEFT_BRACKET=8;
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

            if ( (LA2_0==36||LA2_0==38) ) {
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

                        if ( (LA1_0==36||LA1_0==38) ) {
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

            if ( ((LA4_0>=57 && LA4_0<=60)) ) {
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

                        if ( ((LA3_0>=57 && LA3_0<=60)) ) {
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

            if ( (LA6_0==27) ) {
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

                        if ( (LA5_0==27) ) {
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

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
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
    // InternalAutomatedRestTesting.g:344:1: ruleRestService returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= ruleURL ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )? otherlv_16= 'Response' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET otherlv_18= 'Type' this_EQUAL_19= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_23= RULE_SEMICOLON this_RIGHT_BRACKET_24= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_25= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleRestService() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_2=null;
        Token otherlv_3=null;
        Token this_EQUAL_4=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        Token this_LEFT_BRACKET_8=null;
        Token otherlv_9=null;
        Token this_EQUAL_10=null;
        Token this_SQUARE_LEFT_BRACKET_12=null;
        Token this_SQUARE_RIGHT_BRACKET_13=null;
        Token this_SEMICOLON_14=null;
        Token this_RIGHT_BRACKET_15=null;
        Token otherlv_16=null;
        Token this_LEFT_BRACKET_17=null;
        Token otherlv_18=null;
        Token this_EQUAL_19=null;
        Token this_SQUARE_LEFT_BRACKET_21=null;
        Token this_SQUARE_RIGHT_BRACKET_22=null;
        Token this_SEMICOLON_23=null;
        Token this_RIGHT_BRACKET_24=null;
        Token this_RIGHT_BRACKET_25=null;
        Enumerator lv_method_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_uri_5_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:350:2: ( ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= ruleURL ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )? otherlv_16= 'Response' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET otherlv_18= 'Type' this_EQUAL_19= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_23= RULE_SEMICOLON this_RIGHT_BRACKET_24= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_25= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:351:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= ruleURL ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )? otherlv_16= 'Response' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET otherlv_18= 'Type' this_EQUAL_19= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_23= RULE_SEMICOLON this_RIGHT_BRACKET_24= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_25= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:351:2: ( ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= ruleURL ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )? otherlv_16= 'Response' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET otherlv_18= 'Type' this_EQUAL_19= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_23= RULE_SEMICOLON this_RIGHT_BRACKET_24= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_25= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:352:3: ( (lv_method_0_0= ruleMethodType ) ) ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL ( (lv_uri_5_0= ruleURL ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )? otherlv_16= 'Response' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET otherlv_18= 'Type' this_EQUAL_19= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_23= RULE_SEMICOLON this_RIGHT_BRACKET_24= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_25= RULE_RIGHT_BRACKET
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
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestServiceAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_11); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:402:3: ( (lv_uri_5_0= ruleURL ) )
            // InternalAutomatedRestTesting.g:403:4: (lv_uri_5_0= ruleURL )
            {
            // InternalAutomatedRestTesting.g:403:4: (lv_uri_5_0= ruleURL )
            // InternalAutomatedRestTesting.g:404:5: lv_uri_5_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getRestServiceAccess().getUriURLParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_5);
            lv_uri_5_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestServiceRule());
            					}
            					set(
            						current,
            						"uri",
            						lv_uri_5_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_12); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalAutomatedRestTesting.g:425:3: (otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAutomatedRestTesting.g:426:4: otherlv_7= 'Request' this_LEFT_BRACKET_8= RULE_LEFT_BRACKET otherlv_9= 'Type' this_EQUAL_10= RULE_EQUAL ( ( ruleEString ) ) (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )? this_SEMICOLON_14= RULE_SEMICOLON this_RIGHT_BRACKET_15= RULE_RIGHT_BRACKET
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getRestServiceAccess().getRequestKeyword_7_0());
                    			
                    this_LEFT_BRACKET_8=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_13); 

                    				newLeafNode(this_LEFT_BRACKET_8, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_7_1());
                    			
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRestServiceAccess().getTypeKeyword_7_2());
                    			
                    this_EQUAL_10=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_10, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_7_3());
                    			
                    // InternalAutomatedRestTesting.g:442:4: ( ( ruleEString ) )
                    // InternalAutomatedRestTesting.g:443:5: ( ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:443:5: ( ruleEString )
                    // InternalAutomatedRestTesting.g:444:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRestServiceAccess().getRequestElementCrossReference_7_4_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAutomatedRestTesting.g:458:4: (this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_SQUARE_LEFT_BRACKET) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:459:5: this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_13= RULE_SQUARE_RIGHT_BRACKET
                            {
                            this_SQUARE_LEFT_BRACKET_12=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_15); 

                            					newLeafNode(this_SQUARE_LEFT_BRACKET_12, grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_7_5_0());
                            				
                            this_SQUARE_RIGHT_BRACKET_13=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_5); 

                            					newLeafNode(this_SQUARE_RIGHT_BRACKET_13, grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_7_5_1());
                            				

                            }
                            break;

                    }

                    this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_16); 

                    				newLeafNode(this_SEMICOLON_14, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_7_6());
                    			
                    this_RIGHT_BRACKET_15=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_17); 

                    				newLeafNode(this_RIGHT_BRACKET_15, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_7_7());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getRestServiceAccess().getResponseKeyword_8());
            		
            this_LEFT_BRACKET_17=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_13); 

            			newLeafNode(this_LEFT_BRACKET_17, grammarAccess.getRestServiceAccess().getLEFT_BRACKETTerminalRuleCall_9());
            		
            otherlv_18=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getRestServiceAccess().getTypeKeyword_10());
            		
            this_EQUAL_19=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_19, grammarAccess.getRestServiceAccess().getEQUALTerminalRuleCall_11());
            		
            // InternalAutomatedRestTesting.g:493:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:494:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:494:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:495:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRestServiceAccess().getResponseElementCrossReference_12_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:509:3: (this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAutomatedRestTesting.g:510:4: this_SQUARE_LEFT_BRACKET_21= RULE_SQUARE_LEFT_BRACKET this_SQUARE_RIGHT_BRACKET_22= RULE_SQUARE_RIGHT_BRACKET
                    {
                    this_SQUARE_LEFT_BRACKET_21=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_15); 

                    				newLeafNode(this_SQUARE_LEFT_BRACKET_21, grammarAccess.getRestServiceAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_13_0());
                    			
                    this_SQUARE_RIGHT_BRACKET_22=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_5); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_22, grammarAccess.getRestServiceAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_13_1());
                    			

                    }
                    break;

            }

            this_SEMICOLON_23=(Token)match(input,RULE_SEMICOLON,FOLLOW_16); 

            			newLeafNode(this_SEMICOLON_23, grammarAccess.getRestServiceAccess().getSEMICOLONTerminalRuleCall_14());
            		
            this_RIGHT_BRACKET_24=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_16); 

            			newLeafNode(this_RIGHT_BRACKET_24, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_15());
            		
            this_RIGHT_BRACKET_25=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_25, grammarAccess.getRestServiceAccess().getRIGHT_BRACKETTerminalRuleCall_16());
            		

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


    // $ANTLR start "entryRuleURL"
    // InternalAutomatedRestTesting.g:535:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalAutomatedRestTesting.g:535:44: (iv_ruleURL= ruleURL EOF )
            // InternalAutomatedRestTesting.g:536:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalAutomatedRestTesting.g:542:1: ruleURL returns [EObject current=null] : ( ( (lv_urlexpression_0_0= ruleURLExpression ) ) ( (lv_urlexpression_1_0= ruleURLExpression ) )* ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        EObject lv_urlexpression_0_0 = null;

        EObject lv_urlexpression_1_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:548:2: ( ( ( (lv_urlexpression_0_0= ruleURLExpression ) ) ( (lv_urlexpression_1_0= ruleURLExpression ) )* ) )
            // InternalAutomatedRestTesting.g:549:2: ( ( (lv_urlexpression_0_0= ruleURLExpression ) ) ( (lv_urlexpression_1_0= ruleURLExpression ) )* )
            {
            // InternalAutomatedRestTesting.g:549:2: ( ( (lv_urlexpression_0_0= ruleURLExpression ) ) ( (lv_urlexpression_1_0= ruleURLExpression ) )* )
            // InternalAutomatedRestTesting.g:550:3: ( (lv_urlexpression_0_0= ruleURLExpression ) ) ( (lv_urlexpression_1_0= ruleURLExpression ) )*
            {
            // InternalAutomatedRestTesting.g:550:3: ( (lv_urlexpression_0_0= ruleURLExpression ) )
            // InternalAutomatedRestTesting.g:551:4: (lv_urlexpression_0_0= ruleURLExpression )
            {
            // InternalAutomatedRestTesting.g:551:4: (lv_urlexpression_0_0= ruleURLExpression )
            // InternalAutomatedRestTesting.g:552:5: lv_urlexpression_0_0= ruleURLExpression
            {

            					newCompositeNode(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_urlexpression_0_0=ruleURLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getURLRule());
            					}
            					add(
            						current,
            						"urlexpression",
            						lv_urlexpression_0_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.URLExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAutomatedRestTesting.g:569:3: ( (lv_urlexpression_1_0= ruleURLExpression ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||(LA12_0>=39 && LA12_0<=41)||(LA12_0>=61 && LA12_0<=62)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:570:4: (lv_urlexpression_1_0= ruleURLExpression )
            	    {
            	    // InternalAutomatedRestTesting.g:570:4: (lv_urlexpression_1_0= ruleURLExpression )
            	    // InternalAutomatedRestTesting.g:571:5: lv_urlexpression_1_0= ruleURLExpression
            	    {

            	    					newCompositeNode(grammarAccess.getURLAccess().getUrlexpressionURLExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_urlexpression_1_0=ruleURLExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getURLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"urlexpression",
            	    						lv_urlexpression_1_0,
            	    						"org.xtext.example.automatedresttesting.AutomatedRestTesting.URLExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURLExpression"
    // InternalAutomatedRestTesting.g:592:1: entryRuleURLExpression returns [EObject current=null] : iv_ruleURLExpression= ruleURLExpression EOF ;
    public final EObject entryRuleURLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLExpression = null;


        try {
            // InternalAutomatedRestTesting.g:592:54: (iv_ruleURLExpression= ruleURLExpression EOF )
            // InternalAutomatedRestTesting.g:593:2: iv_ruleURLExpression= ruleURLExpression EOF
            {
             newCompositeNode(grammarAccess.getURLExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURLExpression=ruleURLExpression();

            state._fsp--;

             current =iv_ruleURLExpression; 
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
    // $ANTLR end "entryRuleURLExpression"


    // $ANTLR start "ruleURLExpression"
    // InternalAutomatedRestTesting.g:599:1: ruleURLExpression returns [EObject current=null] : (this_Parameter_0= ruleParameter | this_Separator_1= ruleSeparator | this_URLText_2= ruleURLText ) ;
    public final EObject ruleURLExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_Separator_1 = null;

        EObject this_URLText_2 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:605:2: ( (this_Parameter_0= ruleParameter | this_Separator_1= ruleSeparator | this_URLText_2= ruleURLText ) )
            // InternalAutomatedRestTesting.g:606:2: (this_Parameter_0= ruleParameter | this_Separator_1= ruleSeparator | this_URLText_2= ruleURLText )
            {
            // InternalAutomatedRestTesting.g:606:2: (this_Parameter_0= ruleParameter | this_Separator_1= ruleSeparator | this_URLText_2= ruleURLText )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
                {
                alt13=1;
                }
                break;
            case 39:
            case 40:
            case 41:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAutomatedRestTesting.g:607:3: this_Parameter_0= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getURLExpressionAccess().getParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_0=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:616:3: this_Separator_1= ruleSeparator
                    {

                    			newCompositeNode(grammarAccess.getURLExpressionAccess().getSeparatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Separator_1=ruleSeparator();

                    state._fsp--;


                    			current = this_Separator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:625:3: this_URLText_2= ruleURLText
                    {

                    			newCompositeNode(grammarAccess.getURLExpressionAccess().getURLTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_URLText_2=ruleURLText();

                    state._fsp--;


                    			current = this_URLText_2;
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
    // $ANTLR end "ruleURLExpression"


    // $ANTLR start "entryRuleParameter"
    // InternalAutomatedRestTesting.g:637:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAutomatedRestTesting.g:637:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAutomatedRestTesting.g:638:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAutomatedRestTesting.g:644:1: ruleParameter returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_name_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_2=null;
        Token lv_name_3_0=null;
        Token this_RIGHT_BRACKET_4=null;
        Enumerator lv_paramType_1_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:650:2: ( ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_name_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:651:2: ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_name_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:651:2: ( () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_name_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:652:3: () ( (lv_paramType_1_0= ruleParameterType ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_name_3_0= RULE_ID ) ) this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:652:3: ()
            // InternalAutomatedRestTesting.g:653:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:659:3: ( (lv_paramType_1_0= ruleParameterType ) )
            // InternalAutomatedRestTesting.g:660:4: (lv_paramType_1_0= ruleParameterType )
            {
            // InternalAutomatedRestTesting.g:660:4: (lv_paramType_1_0= ruleParameterType )
            // InternalAutomatedRestTesting.g:661:5: lv_paramType_1_0= ruleParameterType
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

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_19); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getParameterAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:682:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAutomatedRestTesting.g:683:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAutomatedRestTesting.g:683:4: (lv_name_3_0= RULE_ID )
            // InternalAutomatedRestTesting.g:684:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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


    // $ANTLR start "entryRuleSeparator"
    // InternalAutomatedRestTesting.g:708:1: entryRuleSeparator returns [EObject current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final EObject entryRuleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeparator = null;


        try {
            // InternalAutomatedRestTesting.g:708:50: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalAutomatedRestTesting.g:709:2: iv_ruleSeparator= ruleSeparator EOF
            {
             newCompositeNode(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparator=ruleSeparator();

            state._fsp--;

             current =iv_ruleSeparator; 
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
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalAutomatedRestTesting.g:715:1: ruleSeparator returns [EObject current=null] : ( () ( (lv_separatorType_1_0= ruleSeparatorType ) ) ) ;
    public final EObject ruleSeparator() throws RecognitionException {
        EObject current = null;

        Enumerator lv_separatorType_1_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:721:2: ( ( () ( (lv_separatorType_1_0= ruleSeparatorType ) ) ) )
            // InternalAutomatedRestTesting.g:722:2: ( () ( (lv_separatorType_1_0= ruleSeparatorType ) ) )
            {
            // InternalAutomatedRestTesting.g:722:2: ( () ( (lv_separatorType_1_0= ruleSeparatorType ) ) )
            // InternalAutomatedRestTesting.g:723:3: () ( (lv_separatorType_1_0= ruleSeparatorType ) )
            {
            // InternalAutomatedRestTesting.g:723:3: ()
            // InternalAutomatedRestTesting.g:724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSeparatorAccess().getSeparatorAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:730:3: ( (lv_separatorType_1_0= ruleSeparatorType ) )
            // InternalAutomatedRestTesting.g:731:4: (lv_separatorType_1_0= ruleSeparatorType )
            {
            // InternalAutomatedRestTesting.g:731:4: (lv_separatorType_1_0= ruleSeparatorType )
            // InternalAutomatedRestTesting.g:732:5: lv_separatorType_1_0= ruleSeparatorType
            {

            					newCompositeNode(grammarAccess.getSeparatorAccess().getSeparatorTypeSeparatorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_separatorType_1_0=ruleSeparatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeparatorRule());
            					}
            					set(
            						current,
            						"separatorType",
            						lv_separatorType_1_0,
            						"org.xtext.example.automatedresttesting.AutomatedRestTesting.SeparatorType");
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
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleURLText"
    // InternalAutomatedRestTesting.g:753:1: entryRuleURLText returns [EObject current=null] : iv_ruleURLText= ruleURLText EOF ;
    public final EObject entryRuleURLText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLText = null;


        try {
            // InternalAutomatedRestTesting.g:753:48: (iv_ruleURLText= ruleURLText EOF )
            // InternalAutomatedRestTesting.g:754:2: iv_ruleURLText= ruleURLText EOF
            {
             newCompositeNode(grammarAccess.getURLTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURLText=ruleURLText();

            state._fsp--;

             current =iv_ruleURLText; 
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
    // $ANTLR end "entryRuleURLText"


    // $ANTLR start "ruleURLText"
    // InternalAutomatedRestTesting.g:760:1: ruleURLText returns [EObject current=null] : ( (lv_text_0_0= ruleEString ) ) ;
    public final EObject ruleURLText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:766:2: ( ( (lv_text_0_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:767:2: ( (lv_text_0_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:767:2: ( (lv_text_0_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:768:3: (lv_text_0_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:768:3: (lv_text_0_0= ruleEString )
            // InternalAutomatedRestTesting.g:769:4: lv_text_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getURLTextAccess().getTextEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_text_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURLTextRule());
            				}
            				set(
            					current,
            					"text",
            					lv_text_0_0,
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
    // $ANTLR end "ruleURLText"


    // $ANTLR start "entryRuleTest"
    // InternalAutomatedRestTesting.g:789:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalAutomatedRestTesting.g:789:45: (iv_ruleTest= ruleTest EOF )
            // InternalAutomatedRestTesting.g:790:2: iv_ruleTest= ruleTest EOF
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
    // InternalAutomatedRestTesting.g:796:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:802:2: ( (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:803:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:803:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:804:3: otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET otherlv_3= 'service' this_EQUAL_4= RULE_EQUAL ( ( ruleEString ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )? otherlv_16= 'Assertions' this_LEFT_BRACKET_17= RULE_LEFT_BRACKET ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+ this_RIGHT_BRACKET_20= RULE_RIGHT_BRACKET this_RIGHT_BRACKET_21= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalAutomatedRestTesting.g:808:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:809:4: (lv_name_1_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:809:4: (lv_name_1_0= ruleEString )
            // InternalAutomatedRestTesting.g:810:5: lv_name_1_0= ruleEString
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

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_20); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getServiceKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_4());
            		
            // InternalAutomatedRestTesting.g:839:3: ( ( ruleEString ) )
            // InternalAutomatedRestTesting.g:840:4: ( ruleEString )
            {
            // InternalAutomatedRestTesting.g:840:4: ( ruleEString )
            // InternalAutomatedRestTesting.g:841:5: ruleEString
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

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalAutomatedRestTesting.g:859:3: (otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAutomatedRestTesting.g:860:4: otherlv_7= 'description' this_EQUAL_8= RULE_EQUAL ( (lv_description_9_0= ruleEString ) ) this_SEMICOLON_10= RULE_SEMICOLON
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestAccess().getDescriptionKeyword_7_0());
                    			
                    this_EQUAL_8=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_8, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_7_1());
                    			
                    // InternalAutomatedRestTesting.g:868:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalAutomatedRestTesting.g:869:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalAutomatedRestTesting.g:869:5: (lv_description_9_0= ruleEString )
                    // InternalAutomatedRestTesting.g:870:6: lv_description_9_0= ruleEString
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

                    this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_22); 

                    				newLeafNode(this_SEMICOLON_10, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:892:3: (otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAutomatedRestTesting.g:893:4: otherlv_11= 'Mapping' this_SQUARE_LEFT_BRACKET_12= RULE_SQUARE_LEFT_BRACKET ( (lv_mappings_13_0= ruleMappingElement ) ) ( (lv_mappings_14_0= ruleMappingElement ) )* this_SQUARE_RIGHT_BRACKET_15= RULE_SQUARE_RIGHT_BRACKET
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestAccess().getMappingKeyword_8_0());
                    			
                    this_SQUARE_LEFT_BRACKET_12=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_9); 

                    				newLeafNode(this_SQUARE_LEFT_BRACKET_12, grammarAccess.getTestAccess().getSQUARE_LEFT_BRACKETTerminalRuleCall_8_1());
                    			
                    // InternalAutomatedRestTesting.g:901:4: ( (lv_mappings_13_0= ruleMappingElement ) )
                    // InternalAutomatedRestTesting.g:902:5: (lv_mappings_13_0= ruleMappingElement )
                    {
                    // InternalAutomatedRestTesting.g:902:5: (lv_mappings_13_0= ruleMappingElement )
                    // InternalAutomatedRestTesting.g:903:6: lv_mappings_13_0= ruleMappingElement
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalAutomatedRestTesting.g:920:4: ( (lv_mappings_14_0= ruleMappingElement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_LEFT_BRACKET) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAutomatedRestTesting.g:921:5: (lv_mappings_14_0= ruleMappingElement )
                    	    {
                    	    // InternalAutomatedRestTesting.g:921:5: (lv_mappings_14_0= ruleMappingElement )
                    	    // InternalAutomatedRestTesting.g:922:6: lv_mappings_14_0= ruleMappingElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getTestAccess().getMappingsMappingElementParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
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
                    	    break loop15;
                        }
                    } while (true);

                    this_SQUARE_RIGHT_BRACKET_15=(Token)match(input,RULE_SQUARE_RIGHT_BRACKET,FOLLOW_25); 

                    				newLeafNode(this_SQUARE_RIGHT_BRACKET_15, grammarAccess.getTestAccess().getSQUARE_RIGHT_BRACKETTerminalRuleCall_8_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getTestAccess().getAssertionsKeyword_9());
            		
            this_LEFT_BRACKET_17=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_26); 

            			newLeafNode(this_LEFT_BRACKET_17, grammarAccess.getTestAccess().getLEFT_BRACKETTerminalRuleCall_10());
            		
            // InternalAutomatedRestTesting.g:952:3: ( ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=42 && LA17_0<=43)||(LA17_0>=49 && LA17_0<=56)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:953:4: ( (lv_assertions_18_0= ruleAssertion ) ) this_SEMICOLON_19= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:953:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // InternalAutomatedRestTesting.g:954:5: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // InternalAutomatedRestTesting.g:954:5: (lv_assertions_18_0= ruleAssertion )
            	    // InternalAutomatedRestTesting.g:955:6: lv_assertions_18_0= ruleAssertion
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

            	    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

            	    				newLeafNode(this_SEMICOLON_19, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            this_RIGHT_BRACKET_20=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_16); 

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
    // InternalAutomatedRestTesting.g:989:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalAutomatedRestTesting.g:989:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalAutomatedRestTesting.g:990:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalAutomatedRestTesting.g:996:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Enumerator lv_assertionType_0_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1002:2: ( ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) ) )
            // InternalAutomatedRestTesting.g:1003:2: ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) )
            {
            // InternalAutomatedRestTesting.g:1003:2: ( ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) ) )
            // InternalAutomatedRestTesting.g:1004:3: ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )? ( (lv_condition_2_0= ruleExpression ) )
            {
            // InternalAutomatedRestTesting.g:1004:3: ( ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=42 && LA18_0<=43)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1005:4: ( (lv_assertionType_0_0= ruleAssertionType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAutomatedRestTesting.g:1005:4: ( (lv_assertionType_0_0= ruleAssertionType ) )
                    // InternalAutomatedRestTesting.g:1006:5: (lv_assertionType_0_0= ruleAssertionType )
                    {
                    // InternalAutomatedRestTesting.g:1006:5: (lv_assertionType_0_0= ruleAssertionType )
                    // InternalAutomatedRestTesting.g:1007:6: lv_assertionType_0_0= ruleAssertionType
                    {

                    						newCompositeNode(grammarAccess.getAssertionAccess().getAssertionTypeAssertionTypeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalAutomatedRestTesting.g:1024:4: ( ( ruleQualifiedName ) )
                    // InternalAutomatedRestTesting.g:1025:5: ( ruleQualifiedName )
                    {
                    // InternalAutomatedRestTesting.g:1025:5: ( ruleQualifiedName )
                    // InternalAutomatedRestTesting.g:1026:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssertionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssertionAccess().getDataToTestElementCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1041:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalAutomatedRestTesting.g:1042:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalAutomatedRestTesting.g:1042:4: (lv_condition_2_0= ruleExpression )
            // InternalAutomatedRestTesting.g:1043:5: lv_condition_2_0= ruleExpression
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
    // InternalAutomatedRestTesting.g:1064:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAutomatedRestTesting.g:1064:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAutomatedRestTesting.g:1065:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAutomatedRestTesting.g:1071:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1077:2: ( (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) )
            // InternalAutomatedRestTesting.g:1078:2: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            {
            // InternalAutomatedRestTesting.g:1078:2: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            // InternalAutomatedRestTesting.g:1079:3: this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAutomatedRestTesting.g:1086:3: (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1087:4: this_DOT_1= RULE_DOT this_ID_2= RULE_ID
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_19); 

            	    				current.merge(this_DOT_1);
            	    			

            	    				newLeafNode(this_DOT_1, grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAutomatedRestTesting.g:1106:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAutomatedRestTesting.g:1106:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAutomatedRestTesting.g:1107:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAutomatedRestTesting.g:1113:1: ruleExpression returns [EObject current=null] : ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOT_2=null;
        Token this_ARROW_3=null;
        Enumerator lv_relationalOperator_0_0 = null;

        EObject lv_expectedValue_4_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1119:2: ( ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? ) )
            // InternalAutomatedRestTesting.g:1120:2: ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? )
            {
            // InternalAutomatedRestTesting.g:1120:2: ( ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )? )
            // InternalAutomatedRestTesting.g:1121:3: ( (lv_relationalOperator_0_0= ruleRelationalOperator ) ) ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )?
            {
            // InternalAutomatedRestTesting.g:1121:3: ( (lv_relationalOperator_0_0= ruleRelationalOperator ) )
            // InternalAutomatedRestTesting.g:1122:4: (lv_relationalOperator_0_0= ruleRelationalOperator )
            {
            // InternalAutomatedRestTesting.g:1122:4: (lv_relationalOperator_0_0= ruleRelationalOperator )
            // InternalAutomatedRestTesting.g:1123:5: lv_relationalOperator_0_0= ruleRelationalOperator
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

            // InternalAutomatedRestTesting.g:1140:3: ( (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==RULE_INT||LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1141:4: (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )? ( (lv_expectedValue_4_0= ruleLiteral ) )
                    {
                    // InternalAutomatedRestTesting.g:1141:4: (otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:1142:5: otherlv_1= 'parameter' (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW )
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_30); 

                            					newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getParameterKeyword_1_0_0());
                            				
                            // InternalAutomatedRestTesting.g:1146:5: (this_DOT_2= RULE_DOT | this_ARROW_3= RULE_ARROW )
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==RULE_DOT) ) {
                                alt20=1;
                            }
                            else if ( (LA20_0==RULE_ARROW) ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 0, input);

                                throw nvae;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalAutomatedRestTesting.g:1147:6: this_DOT_2= RULE_DOT
                                    {
                                    this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_31); 

                                    						newLeafNode(this_DOT_2, grammarAccess.getExpressionAccess().getDOTTerminalRuleCall_1_0_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalAutomatedRestTesting.g:1152:6: this_ARROW_3= RULE_ARROW
                                    {
                                    this_ARROW_3=(Token)match(input,RULE_ARROW,FOLLOW_31); 

                                    						newLeafNode(this_ARROW_3, grammarAccess.getExpressionAccess().getARROWTerminalRuleCall_1_0_1_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAutomatedRestTesting.g:1158:4: ( (lv_expectedValue_4_0= ruleLiteral ) )
                    // InternalAutomatedRestTesting.g:1159:5: (lv_expectedValue_4_0= ruleLiteral )
                    {
                    // InternalAutomatedRestTesting.g:1159:5: (lv_expectedValue_4_0= ruleLiteral )
                    // InternalAutomatedRestTesting.g:1160:6: lv_expectedValue_4_0= ruleLiteral
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
    // InternalAutomatedRestTesting.g:1182:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1182:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAutomatedRestTesting.g:1183:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalAutomatedRestTesting.g:1189:1: ruleLiteral returns [EObject current=null] : (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_ElementLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1195:2: ( (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral ) )
            // InternalAutomatedRestTesting.g:1196:2: (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral )
            {
            // InternalAutomatedRestTesting.g:1196:2: (this_ElementLiteral_0= ruleElementLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1197:3: this_ElementLiteral_0= ruleElementLiteral
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
                    // InternalAutomatedRestTesting.g:1206:3: this_StringLiteral_1= ruleStringLiteral
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
                    // InternalAutomatedRestTesting.g:1215:3: this_IntegerLiteral_2= ruleIntegerLiteral
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
    // InternalAutomatedRestTesting.g:1227:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1227:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalAutomatedRestTesting.g:1228:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalAutomatedRestTesting.g:1234:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1240:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAutomatedRestTesting.g:1241:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAutomatedRestTesting.g:1241:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAutomatedRestTesting.g:1242:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAutomatedRestTesting.g:1242:3: (lv_value_0_0= RULE_INT )
            // InternalAutomatedRestTesting.g:1243:4: lv_value_0_0= RULE_INT
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
    // InternalAutomatedRestTesting.g:1262:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1262:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAutomatedRestTesting.g:1263:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalAutomatedRestTesting.g:1269:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1275:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:1276:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:1276:2: ( (lv_value_0_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1277:3: (lv_value_0_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1277:3: (lv_value_0_0= ruleEString )
            // InternalAutomatedRestTesting.g:1278:4: lv_value_0_0= ruleEString
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
    // InternalAutomatedRestTesting.g:1298:1: entryRuleElementLiteral returns [EObject current=null] : iv_ruleElementLiteral= ruleElementLiteral EOF ;
    public final EObject entryRuleElementLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLiteral = null;


        try {
            // InternalAutomatedRestTesting.g:1298:55: (iv_ruleElementLiteral= ruleElementLiteral EOF )
            // InternalAutomatedRestTesting.g:1299:2: iv_ruleElementLiteral= ruleElementLiteral EOF
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
    // InternalAutomatedRestTesting.g:1305:1: ruleElementLiteral returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1311:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAutomatedRestTesting.g:1312:2: ( ( ruleQualifiedName ) )
            {
            // InternalAutomatedRestTesting.g:1312:2: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:1313:3: ( ruleQualifiedName )
            {
            // InternalAutomatedRestTesting.g:1313:3: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:1314:4: ruleQualifiedName
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
    // InternalAutomatedRestTesting.g:1331:1: entryRuleMappingElement returns [EObject current=null] : iv_ruleMappingElement= ruleMappingElement EOF ;
    public final EObject entryRuleMappingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingElement = null;


        try {
            // InternalAutomatedRestTesting.g:1331:55: (iv_ruleMappingElement= ruleMappingElement EOF )
            // InternalAutomatedRestTesting.g:1332:2: iv_ruleMappingElement= ruleMappingElement EOF
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
    // InternalAutomatedRestTesting.g:1338:1: ruleMappingElement returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:1344:2: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1345:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1345:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1346:3: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'parameter' this_EQUAL_2= RULE_EQUAL ( ( ruleQualifiedName ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' this_EQUAL_6= RULE_EQUAL (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )? ( (lv_value_9_0= ruleLiteral ) ) this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_32); 

            			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getMappingElementAccess().getLEFT_BRACKETTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingElementAccess().getParameterKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_19); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:1358:3: ( ( ruleQualifiedName ) )
            // InternalAutomatedRestTesting.g:1359:4: ( ruleQualifiedName )
            {
            // InternalAutomatedRestTesting.g:1359:4: ( ruleQualifiedName )
            // InternalAutomatedRestTesting.g:1360:5: ruleQualifiedName
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
            		
            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMappingElementAccess().getValueKeyword_5());
            		
            this_EQUAL_6=(Token)match(input,RULE_EQUAL,FOLLOW_35); 

            			newLeafNode(this_EQUAL_6, grammarAccess.getMappingElementAccess().getEQUALTerminalRuleCall_6());
            		
            // InternalAutomatedRestTesting.g:1386:3: (otherlv_7= 'request' this_ARROW_8= RULE_ARROW )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1387:4: otherlv_7= 'request' this_ARROW_8= RULE_ARROW
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappingElementAccess().getRequestKeyword_7_0());
                    			
                    this_ARROW_8=(Token)match(input,RULE_ARROW,FOLLOW_31); 

                    				newLeafNode(this_ARROW_8, grammarAccess.getMappingElementAccess().getARROWTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            // InternalAutomatedRestTesting.g:1396:3: ( (lv_value_9_0= ruleLiteral ) )
            // InternalAutomatedRestTesting.g:1397:4: (lv_value_9_0= ruleLiteral )
            {
            // InternalAutomatedRestTesting.g:1397:4: (lv_value_9_0= ruleLiteral )
            // InternalAutomatedRestTesting.g:1398:5: lv_value_9_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMappingElementAccess().getValueLiteralParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleRestriction"
    // InternalAutomatedRestTesting.g:1423:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // InternalAutomatedRestTesting.g:1423:52: (iv_ruleRestriction= ruleRestriction EOF )
            // InternalAutomatedRestTesting.g:1424:2: iv_ruleRestriction= ruleRestriction EOF
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
    // InternalAutomatedRestTesting.g:1430:1: ruleRestriction returns [EObject current=null] : ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Enumerator lv_mockType_3_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1436:2: ( ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) ) )
            // InternalAutomatedRestTesting.g:1437:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            {
            // InternalAutomatedRestTesting.g:1437:2: ( () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) ) )
            // InternalAutomatedRestTesting.g:1438:3: () otherlv_1= 'mockType' this_EQUAL_2= RULE_EQUAL ( (lv_mockType_3_0= ruleMockTypes ) )
            {
            // InternalAutomatedRestTesting.g:1438:3: ()
            // InternalAutomatedRestTesting.g:1439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestrictionAccess().getRestrictionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getMockTypeKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_37); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getRestrictionAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalAutomatedRestTesting.g:1453:3: ( (lv_mockType_3_0= ruleMockTypes ) )
            // InternalAutomatedRestTesting.g:1454:4: (lv_mockType_3_0= ruleMockTypes )
            {
            // InternalAutomatedRestTesting.g:1454:4: (lv_mockType_3_0= ruleMockTypes )
            // InternalAutomatedRestTesting.g:1455:5: lv_mockType_3_0= ruleMockTypes
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
    // InternalAutomatedRestTesting.g:1476:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1476:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAutomatedRestTesting.g:1477:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAutomatedRestTesting.g:1483:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:1489:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1490:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1490:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1491:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleDomainAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1491:3: ()
            // InternalAutomatedRestTesting.g:1492:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1502:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1503:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1503:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1504:5: lv_name_2_0= ruleEString
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
            		
            // InternalAutomatedRestTesting.g:1525:3: ( (lv_entityAttributes_4_0= ruleDomainAttribute ) )
            // InternalAutomatedRestTesting.g:1526:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            {
            // InternalAutomatedRestTesting.g:1526:4: (lv_entityAttributes_4_0= ruleDomainAttribute )
            // InternalAutomatedRestTesting.g:1527:5: lv_entityAttributes_4_0= ruleDomainAttribute
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
            		
            // InternalAutomatedRestTesting.g:1548:3: ( ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=44 && LA25_0<=48)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1549:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1549:4: ( (lv_entityAttributes_6_0= ruleDomainAttribute ) )
            	    // InternalAutomatedRestTesting.g:1550:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1550:5: (lv_entityAttributes_6_0= ruleDomainAttribute )
            	    // InternalAutomatedRestTesting.g:1551:6: lv_entityAttributes_6_0= ruleDomainAttribute
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
            	    break loop25;
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
    // InternalAutomatedRestTesting.g:1581:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalAutomatedRestTesting.g:1581:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalAutomatedRestTesting.g:1582:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalAutomatedRestTesting.g:1588:1: ruleAttribute_Impl returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token this_SQUARE_RIGHT_BRACKET_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1594:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalAutomatedRestTesting.g:1595:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalAutomatedRestTesting.g:1595:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) )
            // InternalAutomatedRestTesting.g:1596:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) )
            {
            // InternalAutomatedRestTesting.g:1596:3: ()
            // InternalAutomatedRestTesting.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1603:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1604:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1604:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1605:5: lv_type_1_0= ruleAttributeType
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

            // InternalAutomatedRestTesting.g:1622:3: ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1623:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET
                    {
                    // InternalAutomatedRestTesting.g:1623:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) )
                    // InternalAutomatedRestTesting.g:1624:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    {
                    // InternalAutomatedRestTesting.g:1624:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    // InternalAutomatedRestTesting.g:1625:6: lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET
                    {
                    lv_isArray_2_0=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_15); 

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

            // InternalAutomatedRestTesting.g:1646:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1647:4: (lv_name_4_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1647:4: (lv_name_4_0= ruleEString )
            // InternalAutomatedRestTesting.g:1648:5: lv_name_4_0= ruleEString
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
    // InternalAutomatedRestTesting.g:1669:1: entryRuleDomainAttribute returns [EObject current=null] : iv_ruleDomainAttribute= ruleDomainAttribute EOF ;
    public final EObject entryRuleDomainAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainAttribute = null;


        try {
            // InternalAutomatedRestTesting.g:1669:56: (iv_ruleDomainAttribute= ruleDomainAttribute EOF )
            // InternalAutomatedRestTesting.g:1670:2: iv_ruleDomainAttribute= ruleDomainAttribute EOF
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
    // InternalAutomatedRestTesting.g:1676:1: ruleDomainAttribute returns [EObject current=null] : ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? ) ;
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
            // InternalAutomatedRestTesting.g:1682:2: ( ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? ) )
            // InternalAutomatedRestTesting.g:1683:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? )
            {
            // InternalAutomatedRestTesting.g:1683:2: ( () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )? )
            // InternalAutomatedRestTesting.g:1684:3: () ( (lv_type_1_0= ruleAttributeType ) ) ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )? ( (lv_name_4_0= ruleEString ) ) (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )?
            {
            // InternalAutomatedRestTesting.g:1684:3: ()
            // InternalAutomatedRestTesting.g:1685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainAttributeAccess().getDomainAttributeAction_0(),
            					current);
            			

            }

            // InternalAutomatedRestTesting.g:1691:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalAutomatedRestTesting.g:1692:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalAutomatedRestTesting.g:1692:4: (lv_type_1_0= ruleAttributeType )
            // InternalAutomatedRestTesting.g:1693:5: lv_type_1_0= ruleAttributeType
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

            // InternalAutomatedRestTesting.g:1710:3: ( ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SQUARE_LEFT_BRACKET) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1711:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) ) this_SQUARE_RIGHT_BRACKET_3= RULE_SQUARE_RIGHT_BRACKET
                    {
                    // InternalAutomatedRestTesting.g:1711:4: ( (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET ) )
                    // InternalAutomatedRestTesting.g:1712:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    {
                    // InternalAutomatedRestTesting.g:1712:5: (lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET )
                    // InternalAutomatedRestTesting.g:1713:6: lv_isArray_2_0= RULE_SQUARE_LEFT_BRACKET
                    {
                    lv_isArray_2_0=(Token)match(input,RULE_SQUARE_LEFT_BRACKET,FOLLOW_15); 

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

            // InternalAutomatedRestTesting.g:1734:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1735:4: (lv_name_4_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1735:4: (lv_name_4_0= ruleEString )
            // InternalAutomatedRestTesting.g:1736:5: lv_name_4_0= ruleEString
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

            // InternalAutomatedRestTesting.g:1753:3: (this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LEFT_PARENTHESIS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1754:4: this_LEFT_PARENTHESIS_5= RULE_LEFT_PARENTHESIS ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )? ( (lv_restrictions_8_0= ruleRestriction ) ) this_RIGHT_PARENTHESIS_9= RULE_RIGHT_PARENTHESIS
                    {
                    this_LEFT_PARENTHESIS_5=(Token)match(input,RULE_LEFT_PARENTHESIS,FOLLOW_42); 

                    				newLeafNode(this_LEFT_PARENTHESIS_5, grammarAccess.getDomainAttributeAccess().getLEFT_PARENTHESISTerminalRuleCall_4_0());
                    			
                    // InternalAutomatedRestTesting.g:1758:4: ( ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==37) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAutomatedRestTesting.g:1759:5: ( (lv_primaryKey_6_0= 'PK' ) ) this_COMMA_7= RULE_COMMA
                            {
                            // InternalAutomatedRestTesting.g:1759:5: ( (lv_primaryKey_6_0= 'PK' ) )
                            // InternalAutomatedRestTesting.g:1760:6: (lv_primaryKey_6_0= 'PK' )
                            {
                            // InternalAutomatedRestTesting.g:1760:6: (lv_primaryKey_6_0= 'PK' )
                            // InternalAutomatedRestTesting.g:1761:7: lv_primaryKey_6_0= 'PK'
                            {
                            lv_primaryKey_6_0=(Token)match(input,37,FOLLOW_33); 

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

                    // InternalAutomatedRestTesting.g:1778:4: ( (lv_restrictions_8_0= ruleRestriction ) )
                    // InternalAutomatedRestTesting.g:1779:5: (lv_restrictions_8_0= ruleRestriction )
                    {
                    // InternalAutomatedRestTesting.g:1779:5: (lv_restrictions_8_0= ruleRestriction )
                    // InternalAutomatedRestTesting.g:1780:6: lv_restrictions_8_0= ruleRestriction
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
    // InternalAutomatedRestTesting.g:1806:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalAutomatedRestTesting.g:1806:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalAutomatedRestTesting.g:1807:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
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
    // InternalAutomatedRestTesting.g:1813:1: ruleSimpleEntity returns [EObject current=null] : ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) ;
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
            // InternalAutomatedRestTesting.g:1819:2: ( ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET ) )
            // InternalAutomatedRestTesting.g:1820:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            {
            // InternalAutomatedRestTesting.g:1820:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )
            // InternalAutomatedRestTesting.g:1821:3: () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= ruleEString ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_entityAttributes_4_0= ruleAttribute ) ) this_SEMICOLON_5= RULE_SEMICOLON ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )* this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
            {
            // InternalAutomatedRestTesting.g:1821:3: ()
            // InternalAutomatedRestTesting.g:1822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleEntityAccess().getSimpleEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_1());
            		
            // InternalAutomatedRestTesting.g:1832:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutomatedRestTesting.g:1833:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutomatedRestTesting.g:1833:4: (lv_name_2_0= ruleEString )
            // InternalAutomatedRestTesting.g:1834:5: lv_name_2_0= ruleEString
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
            		
            // InternalAutomatedRestTesting.g:1855:3: ( (lv_entityAttributes_4_0= ruleAttribute ) )
            // InternalAutomatedRestTesting.g:1856:4: (lv_entityAttributes_4_0= ruleAttribute )
            {
            // InternalAutomatedRestTesting.g:1856:4: (lv_entityAttributes_4_0= ruleAttribute )
            // InternalAutomatedRestTesting.g:1857:5: lv_entityAttributes_4_0= ruleAttribute
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
            		
            // InternalAutomatedRestTesting.g:1878:3: ( ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=44 && LA30_0<=48)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAutomatedRestTesting.g:1879:4: ( (lv_entityAttributes_6_0= ruleAttribute ) ) this_SEMICOLON_7= RULE_SEMICOLON
            	    {
            	    // InternalAutomatedRestTesting.g:1879:4: ( (lv_entityAttributes_6_0= ruleAttribute ) )
            	    // InternalAutomatedRestTesting.g:1880:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    {
            	    // InternalAutomatedRestTesting.g:1880:5: (lv_entityAttributes_6_0= ruleAttribute )
            	    // InternalAutomatedRestTesting.g:1881:6: lv_entityAttributes_6_0= ruleAttribute
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
            	    break loop30;
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


    // $ANTLR start "ruleSeparatorType"
    // InternalAutomatedRestTesting.g:1911:1: ruleSeparatorType returns [Enumerator current=null] : ( (enumLiteral_0= '/' ) | (enumLiteral_1= '&' ) | (enumLiteral_2= '?' ) ) ;
    public final Enumerator ruleSeparatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1917:2: ( ( (enumLiteral_0= '/' ) | (enumLiteral_1= '&' ) | (enumLiteral_2= '?' ) ) )
            // InternalAutomatedRestTesting.g:1918:2: ( (enumLiteral_0= '/' ) | (enumLiteral_1= '&' ) | (enumLiteral_2= '?' ) )
            {
            // InternalAutomatedRestTesting.g:1918:2: ( (enumLiteral_0= '/' ) | (enumLiteral_1= '&' ) | (enumLiteral_2= '?' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt31=1;
                }
                break;
            case 40:
                {
                alt31=2;
                }
                break;
            case 41:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1919:3: (enumLiteral_0= '/' )
                    {
                    // InternalAutomatedRestTesting.g:1919:3: (enumLiteral_0= '/' )
                    // InternalAutomatedRestTesting.g:1920:4: enumLiteral_0= '/'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSeparatorTypeAccess().getSlashEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSeparatorTypeAccess().getSlashEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1927:3: (enumLiteral_1= '&' )
                    {
                    // InternalAutomatedRestTesting.g:1927:3: (enumLiteral_1= '&' )
                    // InternalAutomatedRestTesting.g:1928:4: enumLiteral_1= '&'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSeparatorTypeAccess().getEtEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSeparatorTypeAccess().getEtEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1935:3: (enumLiteral_2= '?' )
                    {
                    // InternalAutomatedRestTesting.g:1935:3: (enumLiteral_2= '?' )
                    // InternalAutomatedRestTesting.g:1936:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSeparatorTypeAccess().getQuestionMarkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSeparatorTypeAccess().getQuestionMarkEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSeparatorType"


    // $ANTLR start "ruleAssertionType"
    // InternalAutomatedRestTesting.g:1946:1: ruleAssertionType returns [Enumerator current=null] : ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) ) ;
    public final Enumerator ruleAssertionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1952:2: ( ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) ) )
            // InternalAutomatedRestTesting.g:1953:2: ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) )
            {
            // InternalAutomatedRestTesting.g:1953:2: ( (enumLiteral_0= 'response->' ) | (enumLiteral_1= 'response.' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1954:3: (enumLiteral_0= 'response->' )
                    {
                    // InternalAutomatedRestTesting.g:1954:3: (enumLiteral_0= 'response->' )
                    // InternalAutomatedRestTesting.g:1955:4: enumLiteral_0= 'response->'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssertionTypeAccess().getResponseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1962:3: (enumLiteral_1= 'response.' )
                    {
                    // InternalAutomatedRestTesting.g:1962:3: (enumLiteral_1= 'response.' )
                    // InternalAutomatedRestTesting.g:1963:4: enumLiteral_1= 'response.'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:1973:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:1979:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) ) )
            // InternalAutomatedRestTesting.g:1980:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            {
            // InternalAutomatedRestTesting.g:1980:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'date' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            case 48:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAutomatedRestTesting.g:1981:3: (enumLiteral_0= 'string' )
                    {
                    // InternalAutomatedRestTesting.g:1981:3: (enumLiteral_0= 'string' )
                    // InternalAutomatedRestTesting.g:1982:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:1989:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalAutomatedRestTesting.g:1989:3: (enumLiteral_1= 'boolean' )
                    // InternalAutomatedRestTesting.g:1990:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:1997:3: (enumLiteral_2= 'integer' )
                    {
                    // InternalAutomatedRestTesting.g:1997:3: (enumLiteral_2= 'integer' )
                    // InternalAutomatedRestTesting.g:1998:4: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:2005:3: (enumLiteral_3= 'double' )
                    {
                    // InternalAutomatedRestTesting.g:2005:3: (enumLiteral_3= 'double' )
                    // InternalAutomatedRestTesting.g:2006:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:2013:3: (enumLiteral_4= 'date' )
                    {
                    // InternalAutomatedRestTesting.g:2013:3: (enumLiteral_4= 'date' )
                    // InternalAutomatedRestTesting.g:2014:4: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:2024:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
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
            // InternalAutomatedRestTesting.g:2030:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalAutomatedRestTesting.g:2031:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalAutomatedRestTesting.g:2031:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt34=1;
                }
                break;
            case 50:
                {
                alt34=2;
                }
                break;
            case 51:
                {
                alt34=3;
                }
                break;
            case 52:
                {
                alt34=4;
                }
                break;
            case 53:
                {
                alt34=5;
                }
                break;
            case 54:
                {
                alt34=6;
                }
                break;
            case 55:
                {
                alt34=7;
                }
                break;
            case 56:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2032:3: (enumLiteral_0= '<' )
                    {
                    // InternalAutomatedRestTesting.g:2032:3: (enumLiteral_0= '<' )
                    // InternalAutomatedRestTesting.g:2033:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getMinorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:2040:3: (enumLiteral_1= '<=' )
                    {
                    // InternalAutomatedRestTesting.g:2040:3: (enumLiteral_1= '<=' )
                    // InternalAutomatedRestTesting.g:2041:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getMinorEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:2048:3: (enumLiteral_2= '==' )
                    {
                    // InternalAutomatedRestTesting.g:2048:3: (enumLiteral_2= '==' )
                    // InternalAutomatedRestTesting.g:2049:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:2056:3: (enumLiteral_3= '!=' )
                    {
                    // InternalAutomatedRestTesting.g:2056:3: (enumLiteral_3= '!=' )
                    // InternalAutomatedRestTesting.g:2057:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getDifferentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:2064:3: (enumLiteral_4= '>=' )
                    {
                    // InternalAutomatedRestTesting.g:2064:3: (enumLiteral_4= '>=' )
                    // InternalAutomatedRestTesting.g:2065:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getMajorEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:2072:3: (enumLiteral_5= '>' )
                    {
                    // InternalAutomatedRestTesting.g:2072:3: (enumLiteral_5= '>' )
                    // InternalAutomatedRestTesting.g:2073:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getMajorEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:2080:3: (enumLiteral_6= '&&' )
                    {
                    // InternalAutomatedRestTesting.g:2080:3: (enumLiteral_6= '&&' )
                    // InternalAutomatedRestTesting.g:2081:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRelationalOperatorAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:2088:3: (enumLiteral_7= '||' )
                    {
                    // InternalAutomatedRestTesting.g:2088:3: (enumLiteral_7= '||' )
                    // InternalAutomatedRestTesting.g:2089:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:2099:1: ruleMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:2105:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalAutomatedRestTesting.g:2106:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalAutomatedRestTesting.g:2106:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt35=1;
                }
                break;
            case 58:
                {
                alt35=2;
                }
                break;
            case 59:
                {
                alt35=3;
                }
                break;
            case 60:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2107:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalAutomatedRestTesting.g:2107:3: (enumLiteral_0= 'GET' )
                    // InternalAutomatedRestTesting.g:2108:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodTypeAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:2115:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalAutomatedRestTesting.g:2115:3: (enumLiteral_1= 'POST' )
                    // InternalAutomatedRestTesting.g:2116:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodTypeAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:2123:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalAutomatedRestTesting.g:2123:3: (enumLiteral_2= 'PUT' )
                    // InternalAutomatedRestTesting.g:2124:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodTypeAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:2131:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalAutomatedRestTesting.g:2131:3: (enumLiteral_3= 'DELETE' )
                    // InternalAutomatedRestTesting.g:2132:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:2142:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= ':' ) | (enumLiteral_1= '$' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAutomatedRestTesting.g:2148:2: ( ( (enumLiteral_0= ':' ) | (enumLiteral_1= '$' ) ) )
            // InternalAutomatedRestTesting.g:2149:2: ( (enumLiteral_0= ':' ) | (enumLiteral_1= '$' ) )
            {
            // InternalAutomatedRestTesting.g:2149:2: ( (enumLiteral_0= ':' ) | (enumLiteral_1= '$' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            else if ( (LA36_0==62) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2150:3: (enumLiteral_0= ':' )
                    {
                    // InternalAutomatedRestTesting.g:2150:3: (enumLiteral_0= ':' )
                    // InternalAutomatedRestTesting.g:2151:4: enumLiteral_0= ':'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getPathEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:2158:3: (enumLiteral_1= '$' )
                    {
                    // InternalAutomatedRestTesting.g:2158:3: (enumLiteral_1= '$' )
                    // InternalAutomatedRestTesting.g:2159:4: enumLiteral_1= '$'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

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
    // InternalAutomatedRestTesting.g:2169:1: ruleMockTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'University' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) ;
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
            // InternalAutomatedRestTesting.g:2175:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'University' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) ) )
            // InternalAutomatedRestTesting.g:2176:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'University' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            {
            // InternalAutomatedRestTesting.g:2176:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'FirstNameMaleType' ) | (enumLiteral_2= 'FirstNameFemaleType' ) | (enumLiteral_3= 'LastNameType' ) | (enumLiteral_4= 'University' ) | (enumLiteral_5= 'FullNameType' ) | (enumLiteral_6= 'GenderType' ) | (enumLiteral_7= 'EmailAddressType' ) | (enumLiteral_8= 'PhoneType' ) | (enumLiteral_9= 'CountryType' ) | (enumLiteral_10= 'CountryCodeType' ) | (enumLiteral_11= 'CityType' ) | (enumLiteral_12= 'RowNumberType' ) )
            int alt37=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt37=1;
                }
                break;
            case 64:
                {
                alt37=2;
                }
                break;
            case 65:
                {
                alt37=3;
                }
                break;
            case 66:
                {
                alt37=4;
                }
                break;
            case 67:
                {
                alt37=5;
                }
                break;
            case 68:
                {
                alt37=6;
                }
                break;
            case 69:
                {
                alt37=7;
                }
                break;
            case 70:
                {
                alt37=8;
                }
                break;
            case 71:
                {
                alt37=9;
                }
                break;
            case 72:
                {
                alt37=10;
                }
                break;
            case 73:
                {
                alt37=11;
                }
                break;
            case 74:
                {
                alt37=12;
                }
                break;
            case 75:
                {
                alt37=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalAutomatedRestTesting.g:2177:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2177:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalAutomatedRestTesting.g:2178:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockTypesAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutomatedRestTesting.g:2185:3: (enumLiteral_1= 'FirstNameMaleType' )
                    {
                    // InternalAutomatedRestTesting.g:2185:3: (enumLiteral_1= 'FirstNameMaleType' )
                    // InternalAutomatedRestTesting.g:2186:4: enumLiteral_1= 'FirstNameMaleType'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockTypesAccess().getFirstNameMaleTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutomatedRestTesting.g:2193:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    {
                    // InternalAutomatedRestTesting.g:2193:3: (enumLiteral_2= 'FirstNameFemaleType' )
                    // InternalAutomatedRestTesting.g:2194:4: enumLiteral_2= 'FirstNameFemaleType'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockTypesAccess().getFirstNameFemaleTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAutomatedRestTesting.g:2201:3: (enumLiteral_3= 'LastNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2201:3: (enumLiteral_3= 'LastNameType' )
                    // InternalAutomatedRestTesting.g:2202:4: enumLiteral_3= 'LastNameType'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockTypesAccess().getLastNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAutomatedRestTesting.g:2209:3: (enumLiteral_4= 'University' )
                    {
                    // InternalAutomatedRestTesting.g:2209:3: (enumLiteral_4= 'University' )
                    // InternalAutomatedRestTesting.g:2210:4: enumLiteral_4= 'University'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getUniversityTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockTypesAccess().getUniversityTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAutomatedRestTesting.g:2217:3: (enumLiteral_5= 'FullNameType' )
                    {
                    // InternalAutomatedRestTesting.g:2217:3: (enumLiteral_5= 'FullNameType' )
                    // InternalAutomatedRestTesting.g:2218:4: enumLiteral_5= 'FullNameType'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockTypesAccess().getFullNameTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAutomatedRestTesting.g:2225:3: (enumLiteral_6= 'GenderType' )
                    {
                    // InternalAutomatedRestTesting.g:2225:3: (enumLiteral_6= 'GenderType' )
                    // InternalAutomatedRestTesting.g:2226:4: enumLiteral_6= 'GenderType'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockTypesAccess().getGenderTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAutomatedRestTesting.g:2233:3: (enumLiteral_7= 'EmailAddressType' )
                    {
                    // InternalAutomatedRestTesting.g:2233:3: (enumLiteral_7= 'EmailAddressType' )
                    // InternalAutomatedRestTesting.g:2234:4: enumLiteral_7= 'EmailAddressType'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockTypesAccess().getEmailAddressTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalAutomatedRestTesting.g:2241:3: (enumLiteral_8= 'PhoneType' )
                    {
                    // InternalAutomatedRestTesting.g:2241:3: (enumLiteral_8= 'PhoneType' )
                    // InternalAutomatedRestTesting.g:2242:4: enumLiteral_8= 'PhoneType'
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockTypesAccess().getPhoneTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalAutomatedRestTesting.g:2249:3: (enumLiteral_9= 'CountryType' )
                    {
                    // InternalAutomatedRestTesting.g:2249:3: (enumLiteral_9= 'CountryType' )
                    // InternalAutomatedRestTesting.g:2250:4: enumLiteral_9= 'CountryType'
                    {
                    enumLiteral_9=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockTypesAccess().getCountryTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalAutomatedRestTesting.g:2257:3: (enumLiteral_10= 'CountryCodeType' )
                    {
                    // InternalAutomatedRestTesting.g:2257:3: (enumLiteral_10= 'CountryCodeType' )
                    // InternalAutomatedRestTesting.g:2258:4: enumLiteral_10= 'CountryCodeType'
                    {
                    enumLiteral_10=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockTypesAccess().getCountryCodeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalAutomatedRestTesting.g:2265:3: (enumLiteral_11= 'CityType' )
                    {
                    // InternalAutomatedRestTesting.g:2265:3: (enumLiteral_11= 'CityType' )
                    // InternalAutomatedRestTesting.g:2266:4: enumLiteral_11= 'CityType'
                    {
                    enumLiteral_11=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockTypesAccess().getCityTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalAutomatedRestTesting.g:2273:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalAutomatedRestTesting.g:2273:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalAutomatedRestTesting.g:2274:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,75,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1E00005008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1E00000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x60000380000000C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x60000380000000C2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x01FE0C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x01FE0C0000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001000040C2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000001000040C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000005000040C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001F00000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000002C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020000L});

}