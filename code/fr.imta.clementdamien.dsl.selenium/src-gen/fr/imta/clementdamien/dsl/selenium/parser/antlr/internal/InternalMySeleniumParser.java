package fr.imta.clementdamien.dsl.selenium.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.clementdamien.dsl.selenium.services.MySeleniumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMySeleniumParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'{'", "'}'", "'.'", "'value'", "'text'", "'html'", "'assert'", "'='", "'contains'", "'go'", "'openBrowser'", "'['", "']'", "'.all'", "','", "'name'", "'alt'", "'checked'", "'class'", "'type'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'click'", "'assign'", "'fill'", "'choose'", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMySeleniumParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMySeleniumParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMySeleniumParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMySelenium.g"; }



     	private MySeleniumGrammarAccess grammarAccess;

        public InternalMySeleniumParser(TokenStream input, MySeleniumGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MySeleniumGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMySelenium.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMySelenium.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMySelenium.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMySelenium.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctions ) ) | ( (lv_statements_1_0= ruleStatements ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:77:2: ( ( ( (lv_functions_0_0= ruleFunctions ) ) | ( (lv_statements_1_0= ruleStatements ) ) ) )
            // InternalMySelenium.g:78:2: ( ( (lv_functions_0_0= ruleFunctions ) ) | ( (lv_statements_1_0= ruleStatements ) ) )
            {
            // InternalMySelenium.g:78:2: ( ( (lv_functions_0_0= ruleFunctions ) ) | ( (lv_statements_1_0= ruleStatements ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=41 && LA1_0<=44)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMySelenium.g:79:3: ( (lv_functions_0_0= ruleFunctions ) )
                    {
                    // InternalMySelenium.g:79:3: ( (lv_functions_0_0= ruleFunctions ) )
                    // InternalMySelenium.g:80:4: (lv_functions_0_0= ruleFunctions )
                    {
                    // InternalMySelenium.g:80:4: (lv_functions_0_0= ruleFunctions )
                    // InternalMySelenium.g:81:5: lv_functions_0_0= ruleFunctions
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functions_0_0=ruleFunctions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"functions",
                    						lv_functions_0_0,
                    						"fr.imta.clementdamien.dsl.selenium.MySelenium.Functions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:99:3: ( (lv_statements_1_0= ruleStatements ) )
                    {
                    // InternalMySelenium.g:99:3: ( (lv_statements_1_0= ruleStatements ) )
                    // InternalMySelenium.g:100:4: (lv_statements_1_0= ruleStatements )
                    {
                    // InternalMySelenium.g:100:4: (lv_statements_1_0= ruleStatements )
                    // InternalMySelenium.g:101:5: lv_statements_1_0= ruleStatements
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statements_1_0=ruleStatements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"statements",
                    						lv_statements_1_0,
                    						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunctions"
    // InternalMySelenium.g:122:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalMySelenium.g:122:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalMySelenium.g:123:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalMySelenium.g:129:1: ruleFunctions returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )+ ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:135:2: ( ( (lv_functions_0_0= ruleFunction ) )+ )
            // InternalMySelenium.g:136:2: ( (lv_functions_0_0= ruleFunction ) )+
            {
            // InternalMySelenium.g:136:2: ( (lv_functions_0_0= ruleFunction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMySelenium.g:137:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalMySelenium.g:137:3: (lv_functions_0_0= ruleFunction )
            	    // InternalMySelenium.g:138:4: lv_functions_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFunctionsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"functions",
            	    					lv_functions_0_0,
            	    					"fr.imta.clementdamien.dsl.selenium.MySelenium.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleStatements"
    // InternalMySelenium.g:158:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalMySelenium.g:158:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalMySelenium.g:159:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalMySelenium.g:165:1: ruleStatements returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:171:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMySelenium.g:172:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMySelenium.g:172:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==18||(LA3_0>=21 && LA3_0<=22)||(LA3_0>=41 && LA3_0<=44)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMySelenium.g:173:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMySelenium.g:173:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMySelenium.g:174:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStatementsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"fr.imta.clementdamien.dsl.selenium.MySelenium.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:194:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMySelenium.g:194:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMySelenium.g:195:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMySelenium.g:201:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_1_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:207:2: ( (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalMySelenium.g:208:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalMySelenium.g:208:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalMySelenium.g:209:3: otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
            		
            // InternalMySelenium.g:213:3: ( (lv_name_1_0= ruleFunctionName ) )
            // InternalMySelenium.g:214:4: (lv_name_1_0= ruleFunctionName )
            {
            // InternalMySelenium.g:214:4: (lv_name_1_0= ruleFunctionName )
            // InternalMySelenium.g:215:5: lv_name_1_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:232:3: ( (lv_params_2_0= ruleFunctionParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMySelenium.g:233:4: (lv_params_2_0= ruleFunctionParameters )
            	    {
            	    // InternalMySelenium.g:233:4: (lv_params_2_0= ruleFunctionParameters )
            	    // InternalMySelenium.g:234:5: lv_params_2_0= ruleFunctionParameters
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParametersParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_params_2_0=ruleFunctionParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					set(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySelenium.g:255:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=41 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMySelenium.g:256:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalMySelenium.g:256:4: (lv_statements_4_0= ruleStatement )
            	    // InternalMySelenium.g:257:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionName"
    // InternalMySelenium.g:282:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMySelenium.g:282:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMySelenium.g:283:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalMySelenium.g:289:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:296:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:296:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:297:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:297:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:298:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctionNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMySelenium.g:317:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMySelenium.g:317:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMySelenium.g:318:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMySelenium.g:324:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:330:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) )
            // InternalMySelenium.g:331:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            {
            // InternalMySelenium.g:331:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            // InternalMySelenium.g:332:3: ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) )
            {
            // InternalMySelenium.g:332:3: ( (otherlv_0= RULE_ID ) )
            // InternalMySelenium.g:333:4: (otherlv_0= RULE_ID )
            {
            // InternalMySelenium.g:333:4: (otherlv_0= RULE_ID )
            // InternalMySelenium.g:334:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0());
            				

            }


            }

            // InternalMySelenium.g:345:3: ( (lv_params_1_0= ruleFunctionCallParameters ) )
            // InternalMySelenium.g:346:4: (lv_params_1_0= ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:346:4: (lv_params_1_0= ruleFunctionCallParameters )
            // InternalMySelenium.g:347:5: lv_params_1_0= ruleFunctionCallParameters
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsFunctionCallParametersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_params_1_0=ruleFunctionCallParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.FunctionCallParameters");
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleProjection"
    // InternalMySelenium.g:368:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMySelenium.g:368:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMySelenium.g:369:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
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
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalMySelenium.g:375:1: ruleProjection returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selector_0_0 = null;

        AntlrDatatypeRuleToken lv_projectionAction_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:381:2: ( ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) )
            // InternalMySelenium.g:382:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            {
            // InternalMySelenium.g:382:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            // InternalMySelenium.g:383:3: ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            {
            // InternalMySelenium.g:383:3: ( (lv_selector_0_0= ruleSelector ) )
            // InternalMySelenium.g:384:4: (lv_selector_0_0= ruleSelector )
            {
            // InternalMySelenium.g:384:4: (lv_selector_0_0= ruleSelector )
            // InternalMySelenium.g:385:5: lv_selector_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_selector_0_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getFullStopKeyword_1());
            		
            // InternalMySelenium.g:406:3: ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            // InternalMySelenium.g:407:4: (lv_projectionAction_2_0= ruleProjectionAction )
            {
            // InternalMySelenium.g:407:4: (lv_projectionAction_2_0= ruleProjectionAction )
            // InternalMySelenium.g:408:5: lv_projectionAction_2_0= ruleProjectionAction
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getProjectionActionProjectionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_projectionAction_2_0=ruleProjectionAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionRule());
            					}
            					set(
            						current,
            						"projectionAction",
            						lv_projectionAction_2_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.ProjectionAction");
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
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleProjectionAction"
    // InternalMySelenium.g:429:1: entryRuleProjectionAction returns [String current=null] : iv_ruleProjectionAction= ruleProjectionAction EOF ;
    public final String entryRuleProjectionAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectionAction = null;


        try {
            // InternalMySelenium.g:429:56: (iv_ruleProjectionAction= ruleProjectionAction EOF )
            // InternalMySelenium.g:430:2: iv_ruleProjectionAction= ruleProjectionAction EOF
            {
             newCompositeNode(grammarAccess.getProjectionActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectionAction=ruleProjectionAction();

            state._fsp--;

             current =iv_ruleProjectionAction.getText(); 
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
    // $ANTLR end "entryRuleProjectionAction"


    // $ANTLR start "ruleProjectionAction"
    // InternalMySelenium.g:436:1: ruleProjectionAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'value' | kw= 'text' | kw= 'html' ) ;
    public final AntlrDatatypeRuleToken ruleProjectionAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:442:2: ( (kw= 'value' | kw= 'text' | kw= 'html' ) )
            // InternalMySelenium.g:443:2: (kw= 'value' | kw= 'text' | kw= 'html' )
            {
            // InternalMySelenium.g:443:2: (kw= 'value' | kw= 'text' | kw= 'html' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
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
                    // InternalMySelenium.g:444:3: kw= 'value'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getValueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:450:3: kw= 'text'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:456:3: kw= 'html'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getHtmlKeyword_2());
                    		

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
    // $ANTLR end "ruleProjectionAction"


    // $ANTLR start "entryRuleStatement"
    // InternalMySelenium.g:465:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMySelenium.g:465:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMySelenium.g:466:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMySelenium.g:472:1: ruleStatement returns [EObject current=null] : (this_OneParameterAction_0= ruleOneParameterAction | this_FunctionCall_1= ruleFunctionCall | this_AssertEquals_2= ruleAssertEquals | this_AssertContains_3= ruleAssertContains | this_NavigationAction_4= ruleNavigationAction ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_OneParameterAction_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_AssertEquals_2 = null;

        EObject this_AssertContains_3 = null;

        EObject this_NavigationAction_4 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:478:2: ( (this_OneParameterAction_0= ruleOneParameterAction | this_FunctionCall_1= ruleFunctionCall | this_AssertEquals_2= ruleAssertEquals | this_AssertContains_3= ruleAssertContains | this_NavigationAction_4= ruleNavigationAction ) )
            // InternalMySelenium.g:479:2: (this_OneParameterAction_0= ruleOneParameterAction | this_FunctionCall_1= ruleFunctionCall | this_AssertEquals_2= ruleAssertEquals | this_AssertContains_3= ruleAssertContains | this_NavigationAction_4= ruleNavigationAction )
            {
            // InternalMySelenium.g:479:2: (this_OneParameterAction_0= ruleOneParameterAction | this_FunctionCall_1= ruleFunctionCall | this_AssertEquals_2= ruleAssertEquals | this_AssertContains_3= ruleAssertContains | this_NavigationAction_4= ruleNavigationAction )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:480:3: this_OneParameterAction_0= ruleOneParameterAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOneParameterActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneParameterAction_0=ruleOneParameterAction();

                    state._fsp--;


                    			current = this_OneParameterAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:489:3: this_FunctionCall_1= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_1=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:498:3: this_AssertEquals_2= ruleAssertEquals
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertEquals_2=ruleAssertEquals();

                    state._fsp--;


                    			current = this_AssertEquals_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:507:3: this_AssertContains_3= ruleAssertContains
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertContains_3=ruleAssertContains();

                    state._fsp--;


                    			current = this_AssertContains_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:516:3: this_NavigationAction_4= ruleNavigationAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationAction_4=ruleNavigationAction();

                    state._fsp--;


                    			current = this_NavigationAction_4;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssertEquals"
    // InternalMySelenium.g:528:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalMySelenium.g:528:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalMySelenium.g:529:2: iv_ruleAssertEquals= ruleAssertEquals EOF
            {
             newCompositeNode(grammarAccess.getAssertEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertEquals=ruleAssertEquals();

            state._fsp--;

             current =iv_ruleAssertEquals; 
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
    // $ANTLR end "entryRuleAssertEquals"


    // $ANTLR start "ruleAssertEquals"
    // InternalMySelenium.g:535:1: ruleAssertEquals returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_2_0=null;
        EObject lv_assertableElement_1_0 = null;

        EObject lv_assertableElement_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:541:2: ( (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:542:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:542:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:543:3: otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= '=' ) ) ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertEqualsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:547:3: ( (lv_assertableElement_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:548:4: (lv_assertableElement_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:548:4: (lv_assertableElement_1_0= ruleAssertableElement )
            // InternalMySelenium.g:549:5: lv_assertableElement_1_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_assertableElement_1_0=ruleAssertableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					add(
            						current,
            						"assertableElement",
            						lv_assertableElement_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:566:3: ( (lv_operator_2_0= '=' ) )
            // InternalMySelenium.g:567:4: (lv_operator_2_0= '=' )
            {
            // InternalMySelenium.g:567:4: (lv_operator_2_0= '=' )
            // InternalMySelenium.g:568:5: lv_operator_2_0= '='
            {
            lv_operator_2_0=(Token)match(input,19,FOLLOW_11); 

            					newLeafNode(lv_operator_2_0, grammarAccess.getAssertEqualsAccess().getOperatorEqualsSignKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertEqualsRule());
            					}
            					setWithLastConsumed(current, "operator", lv_operator_2_0, "=");
            				

            }


            }

            // InternalMySelenium.g:580:3: ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:581:4: (lv_assertableElement_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:581:4: (lv_assertableElement_3_0= ruleAssertableElement )
            // InternalMySelenium.g:582:5: lv_assertableElement_3_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_assertableElement_3_0=ruleAssertableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					add(
            						current,
            						"assertableElement",
            						lv_assertableElement_3_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
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
    // $ANTLR end "ruleAssertEquals"


    // $ANTLR start "entryRuleAssertContains"
    // InternalMySelenium.g:603:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalMySelenium.g:603:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalMySelenium.g:604:2: iv_ruleAssertContains= ruleAssertContains EOF
            {
             newCompositeNode(grammarAccess.getAssertContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertContains=ruleAssertContains();

            state._fsp--;

             current =iv_ruleAssertContains; 
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
    // $ANTLR end "entryRuleAssertContains"


    // $ANTLR start "ruleAssertContains"
    // InternalMySelenium.g:610:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= 'contains' ) ) ( (lv_element_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_2_0=null;
        EObject lv_container_1_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:616:2: ( (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= 'contains' ) ) ( (lv_element_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:617:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= 'contains' ) ) ( (lv_element_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:617:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= 'contains' ) ) ( (lv_element_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:618:3: otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) ( (lv_operator_2_0= 'contains' ) ) ( (lv_element_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:622:3: ( (lv_container_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:623:4: (lv_container_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:623:4: (lv_container_1_0= ruleAssertableElement )
            // InternalMySelenium.g:624:5: lv_container_1_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_container_1_0=ruleAssertableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertContainsRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:641:3: ( (lv_operator_2_0= 'contains' ) )
            // InternalMySelenium.g:642:4: (lv_operator_2_0= 'contains' )
            {
            // InternalMySelenium.g:642:4: (lv_operator_2_0= 'contains' )
            // InternalMySelenium.g:643:5: lv_operator_2_0= 'contains'
            {
            lv_operator_2_0=(Token)match(input,20,FOLLOW_11); 

            					newLeafNode(lv_operator_2_0, grammarAccess.getAssertContainsAccess().getOperatorContainsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertContainsRule());
            					}
            					setWithLastConsumed(current, "operator", lv_operator_2_0, "contains");
            				

            }


            }

            // InternalMySelenium.g:655:3: ( (lv_element_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:656:4: (lv_element_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:656:4: (lv_element_3_0= ruleAssertableElement )
            // InternalMySelenium.g:657:5: lv_element_3_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertContainsAccess().getElementAssertableElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_3_0=ruleAssertableElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertContainsRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_3_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.AssertableElement");
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
    // $ANTLR end "ruleAssertContains"


    // $ANTLR start "entryRuleAssertableElement"
    // InternalMySelenium.g:678:1: entryRuleAssertableElement returns [EObject current=null] : iv_ruleAssertableElement= ruleAssertableElement EOF ;
    public final EObject entryRuleAssertableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertableElement = null;


        try {
            // InternalMySelenium.g:678:58: (iv_ruleAssertableElement= ruleAssertableElement EOF )
            // InternalMySelenium.g:679:2: iv_ruleAssertableElement= ruleAssertableElement EOF
            {
             newCompositeNode(grammarAccess.getAssertableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertableElement=ruleAssertableElement();

            state._fsp--;

             current =iv_ruleAssertableElement; 
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
    // $ANTLR end "entryRuleAssertableElement"


    // $ANTLR start "ruleAssertableElement"
    // InternalMySelenium.g:685:1: ruleAssertableElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleAssertableElement() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_Variable_0 = null;

        EObject this_Projection_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:691:2: ( (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalMySelenium.g:692:2: (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalMySelenium.g:692:2: (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==13||(LA8_1>=18 && LA8_1<=22)||(LA8_1>=41 && LA8_1<=44)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==45) ) {
                    alt8=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMySelenium.g:693:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getAssertableElementAccess().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:702:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:707:3: this_Projection_2= ruleProjection
                    {

                    			newCompositeNode(grammarAccess.getAssertableElementAccess().getProjectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projection_2=ruleProjection();

                    state._fsp--;


                    			current = this_Projection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:716:3: this_FunctionCall_3= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getAssertableElementAccess().getFunctionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_3=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_3;
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
    // $ANTLR end "ruleAssertableElement"


    // $ANTLR start "entryRuleNavigationAction"
    // InternalMySelenium.g:728:1: entryRuleNavigationAction returns [EObject current=null] : iv_ruleNavigationAction= ruleNavigationAction EOF ;
    public final EObject entryRuleNavigationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationAction = null;


        try {
            // InternalMySelenium.g:728:57: (iv_ruleNavigationAction= ruleNavigationAction EOF )
            // InternalMySelenium.g:729:2: iv_ruleNavigationAction= ruleNavigationAction EOF
            {
             newCompositeNode(grammarAccess.getNavigationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationAction=ruleNavigationAction();

            state._fsp--;

             current =iv_ruleNavigationAction; 
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
    // $ANTLR end "entryRuleNavigationAction"


    // $ANTLR start "ruleNavigationAction"
    // InternalMySelenium.g:735:1: ruleNavigationAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigationAction() throws RecognitionException {
        EObject current = null;

        Token lv_param_1_0=null;
        AntlrDatatypeRuleToken lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:741:2: ( ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) )
            // InternalMySelenium.g:742:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            {
            // InternalMySelenium.g:742:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            // InternalMySelenium.g:743:3: ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) )
            {
            // InternalMySelenium.g:743:3: ( (lv_action_0_0= ruleNavigationActionType ) )
            // InternalMySelenium.g:744:4: (lv_action_0_0= ruleNavigationActionType )
            {
            // InternalMySelenium.g:744:4: (lv_action_0_0= ruleNavigationActionType )
            // InternalMySelenium.g:745:5: lv_action_0_0= ruleNavigationActionType
            {

            					newCompositeNode(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_action_0_0=ruleNavigationActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigationActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.NavigationActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:762:3: ( (lv_param_1_0= RULE_STRING ) )
            // InternalMySelenium.g:763:4: (lv_param_1_0= RULE_STRING )
            {
            // InternalMySelenium.g:763:4: (lv_param_1_0= RULE_STRING )
            // InternalMySelenium.g:764:5: lv_param_1_0= RULE_STRING
            {
            lv_param_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_param_1_0, grammarAccess.getNavigationActionAccess().getParamSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigationActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleNavigationAction"


    // $ANTLR start "entryRuleNavigationActionType"
    // InternalMySelenium.g:784:1: entryRuleNavigationActionType returns [String current=null] : iv_ruleNavigationActionType= ruleNavigationActionType EOF ;
    public final String entryRuleNavigationActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationActionType = null;


        try {
            // InternalMySelenium.g:784:60: (iv_ruleNavigationActionType= ruleNavigationActionType EOF )
            // InternalMySelenium.g:785:2: iv_ruleNavigationActionType= ruleNavigationActionType EOF
            {
             newCompositeNode(grammarAccess.getNavigationActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationActionType=ruleNavigationActionType();

            state._fsp--;

             current =iv_ruleNavigationActionType.getText(); 
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
    // $ANTLR end "entryRuleNavigationActionType"


    // $ANTLR start "ruleNavigationActionType"
    // InternalMySelenium.g:791:1: ruleNavigationActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' | kw= 'openBrowser' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:797:2: ( (kw= 'go' | kw= 'openBrowser' ) )
            // InternalMySelenium.g:798:2: (kw= 'go' | kw= 'openBrowser' )
            {
            // InternalMySelenium.g:798:2: (kw= 'go' | kw= 'openBrowser' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMySelenium.g:799:3: kw= 'go'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:805:3: kw= 'openBrowser'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getOpenBrowserKeyword_1());
                    		

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
    // $ANTLR end "ruleNavigationActionType"


    // $ANTLR start "entryRuleOneParameterAction"
    // InternalMySelenium.g:814:1: entryRuleOneParameterAction returns [EObject current=null] : iv_ruleOneParameterAction= ruleOneParameterAction EOF ;
    public final EObject entryRuleOneParameterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneParameterAction = null;


        try {
            // InternalMySelenium.g:814:59: (iv_ruleOneParameterAction= ruleOneParameterAction EOF )
            // InternalMySelenium.g:815:2: iv_ruleOneParameterAction= ruleOneParameterAction EOF
            {
             newCompositeNode(grammarAccess.getOneParameterActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneParameterAction=ruleOneParameterAction();

            state._fsp--;

             current =iv_ruleOneParameterAction; 
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
    // $ANTLR end "entryRuleOneParameterAction"


    // $ANTLR start "ruleOneParameterAction"
    // InternalMySelenium.g:821:1: ruleOneParameterAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleOneParameterAction() throws RecognitionException {
        EObject current = null;

        Token lv_stringParameter_3_0=null;
        AntlrDatatypeRuleToken lv_action_0_0 = null;

        EObject lv_selector_1_0 = null;

        EObject lv_selectorParameter_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:827:2: ( ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )? ) )
            // InternalMySelenium.g:828:2: ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )? )
            {
            // InternalMySelenium.g:828:2: ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )? )
            // InternalMySelenium.g:829:3: ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )?
            {
            // InternalMySelenium.g:829:3: ( (lv_action_0_0= ruleOneParameterActionType ) )
            // InternalMySelenium.g:830:4: (lv_action_0_0= ruleOneParameterActionType )
            {
            // InternalMySelenium.g:830:4: (lv_action_0_0= ruleOneParameterActionType )
            // InternalMySelenium.g:831:5: lv_action_0_0= ruleOneParameterActionType
            {

            					newCompositeNode(grammarAccess.getOneParameterActionAccess().getActionOneParameterActionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_action_0_0=ruleOneParameterActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneParameterActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.OneParameterActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:848:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalMySelenium.g:849:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalMySelenium.g:849:4: (lv_selector_1_0= ruleSelector )
            // InternalMySelenium.g:850:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getOneParameterActionAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneParameterActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:867:3: ( ( (lv_selectorParameter_2_0= ruleSelector ) ) | ( (lv_stringParameter_3_0= RULE_STRING ) ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=32 && LA10_0<=40)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:868:4: ( (lv_selectorParameter_2_0= ruleSelector ) )
                    {
                    // InternalMySelenium.g:868:4: ( (lv_selectorParameter_2_0= ruleSelector ) )
                    // InternalMySelenium.g:869:5: (lv_selectorParameter_2_0= ruleSelector )
                    {
                    // InternalMySelenium.g:869:5: (lv_selectorParameter_2_0= ruleSelector )
                    // InternalMySelenium.g:870:6: lv_selectorParameter_2_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getOneParameterActionAccess().getSelectorParameterSelectorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selectorParameter_2_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOneParameterActionRule());
                    						}
                    						set(
                    							current,
                    							"selectorParameter",
                    							lv_selectorParameter_2_0,
                    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:888:4: ( (lv_stringParameter_3_0= RULE_STRING ) )
                    {
                    // InternalMySelenium.g:888:4: ( (lv_stringParameter_3_0= RULE_STRING ) )
                    // InternalMySelenium.g:889:5: (lv_stringParameter_3_0= RULE_STRING )
                    {
                    // InternalMySelenium.g:889:5: (lv_stringParameter_3_0= RULE_STRING )
                    // InternalMySelenium.g:890:6: lv_stringParameter_3_0= RULE_STRING
                    {
                    lv_stringParameter_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_stringParameter_3_0, grammarAccess.getOneParameterActionAccess().getStringParameterSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOneParameterActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringParameter",
                    							lv_stringParameter_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleOneParameterAction"


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:911:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalMySelenium.g:911:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalMySelenium.g:912:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMySelenium.g:918:1: ruleSelector returns [EObject current=null] : ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:924:2: ( ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? ) )
            // InternalMySelenium.g:925:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? )
            {
            // InternalMySelenium.g:925:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? )
            // InternalMySelenium.g:926:3: ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )?
            {
            // InternalMySelenium.g:926:3: ( (lv_element_0_0= ruleDOMElement ) )
            // InternalMySelenium.g:927:4: (lv_element_0_0= ruleDOMElement )
            {
            // InternalMySelenium.g:927:4: (lv_element_0_0= ruleDOMElement )
            // InternalMySelenium.g:928:5: lv_element_0_0= ruleDOMElement
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getElementDOMElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_element_0_0=ruleDOMElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.DOMElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMySelenium.g:949:3: ( (lv_attrs_2_0= ruleAttributes ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16||(LA11_0>=27 && LA11_0<=31)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMySelenium.g:950:4: (lv_attrs_2_0= ruleAttributes )
                    {
                    // InternalMySelenium.g:950:4: (lv_attrs_2_0= ruleAttributes )
                    // InternalMySelenium.g:951:5: lv_attrs_2_0= ruleAttributes
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getAttrsAttributesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_attrs_2_0=ruleAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"attrs",
                    						lv_attrs_2_0,
                    						"fr.imta.clementdamien.dsl.selenium.MySelenium.Attributes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3());
            		
            // InternalMySelenium.g:972:3: (otherlv_4= '.all' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMySelenium.g:973:4: otherlv_4= '.all'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getAllKeyword_4());
                    			

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleAttributes"
    // InternalMySelenium.g:982:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalMySelenium.g:982:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalMySelenium.g:983:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalMySelenium.g:989:1: ruleAttributes returns [EObject current=null] : ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attrs_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:995:2: ( ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) )
            // InternalMySelenium.g:996:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            {
            // InternalMySelenium.g:996:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            // InternalMySelenium.g:997:3: ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            {
            // InternalMySelenium.g:997:3: ( (lv_attrs_0_0= ruleAttribute ) )
            // InternalMySelenium.g:998:4: (lv_attrs_0_0= ruleAttribute )
            {
            // InternalMySelenium.g:998:4: (lv_attrs_0_0= ruleAttribute )
            // InternalMySelenium.g:999:5: lv_attrs_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_attrs_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributesRule());
            					}
            					add(
            						current,
            						"attrs",
            						lv_attrs_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:1016:3: (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMySelenium.g:1017:4: otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMySelenium.g:1021:4: ( (lv_attrs_2_0= ruleAttribute ) )
            	    // InternalMySelenium.g:1022:5: (lv_attrs_2_0= ruleAttribute )
            	    {
            	    // InternalMySelenium.g:1022:5: (lv_attrs_2_0= ruleAttribute )
            	    // InternalMySelenium.g:1023:6: lv_attrs_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_attrs_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrs",
            	    							lv_attrs_2_0,
            	    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalMySelenium.g:1045:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMySelenium.g:1045:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMySelenium.g:1046:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMySelenium.g:1052:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1058:2: ( ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMySelenium.g:1059:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMySelenium.g:1059:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMySelenium.g:1060:3: ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMySelenium.g:1060:3: ( (lv_name_0_0= ruleDOMAttribute ) )
            // InternalMySelenium.g:1061:4: (lv_name_0_0= ruleDOMAttribute )
            {
            // InternalMySelenium.g:1061:4: (lv_name_0_0= ruleDOMAttribute )
            // InternalMySelenium.g:1062:5: lv_name_0_0= ruleDOMAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameDOMAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleDOMAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.DOMAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalMySelenium.g:1083:3: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMySelenium.g:1084:4: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalMySelenium.g:1084:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalMySelenium.g:1085:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMySelenium.g:1085:5: (lv_value_2_0= RULE_STRING )
                    // InternalMySelenium.g:1086:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1103:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMySelenium.g:1103:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMySelenium.g:1104:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMySelenium.g:1104:5: (otherlv_3= RULE_ID )
                    // InternalMySelenium.g:1105:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0());
                    					

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDOMAttribute"
    // InternalMySelenium.g:1121:1: entryRuleDOMAttribute returns [String current=null] : iv_ruleDOMAttribute= ruleDOMAttribute EOF ;
    public final String entryRuleDOMAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAttribute = null;


        try {
            // InternalMySelenium.g:1121:52: (iv_ruleDOMAttribute= ruleDOMAttribute EOF )
            // InternalMySelenium.g:1122:2: iv_ruleDOMAttribute= ruleDOMAttribute EOF
            {
             newCompositeNode(grammarAccess.getDOMAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMAttribute=ruleDOMAttribute();

            state._fsp--;

             current =iv_ruleDOMAttribute.getText(); 
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
    // $ANTLR end "entryRuleDOMAttribute"


    // $ANTLR start "ruleDOMAttribute"
    // InternalMySelenium.g:1128:1: ruleDOMAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'type' ) ;
    public final AntlrDatatypeRuleToken ruleDOMAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1134:2: ( (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'type' ) )
            // InternalMySelenium.g:1135:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'type' )
            {
            // InternalMySelenium.g:1135:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'type' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 30:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1136:3: kw= 'name'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getNameKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1142:3: kw= 'text'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1148:3: kw= 'alt'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getAltKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1154:3: kw= 'checked'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1160:3: kw= 'class'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getClassKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1166:3: kw= 'type'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTypeKeyword_5());
                    		

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
    // $ANTLR end "ruleDOMAttribute"


    // $ANTLR start "entryRuleDOMElement"
    // InternalMySelenium.g:1175:1: entryRuleDOMElement returns [String current=null] : iv_ruleDOMElement= ruleDOMElement EOF ;
    public final String entryRuleDOMElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMElement = null;


        try {
            // InternalMySelenium.g:1175:50: (iv_ruleDOMElement= ruleDOMElement EOF )
            // InternalMySelenium.g:1176:2: iv_ruleDOMElement= ruleDOMElement EOF
            {
             newCompositeNode(grammarAccess.getDOMElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMElement=ruleDOMElement();

            state._fsp--;

             current =iv_ruleDOMElement.getText(); 
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
    // $ANTLR end "entryRuleDOMElement"


    // $ANTLR start "ruleDOMElement"
    // InternalMySelenium.g:1182:1: ruleDOMElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' ) ;
    public final AntlrDatatypeRuleToken ruleDOMElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1188:2: ( (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' ) )
            // InternalMySelenium.g:1189:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' )
            {
            // InternalMySelenium.g:1189:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            case 39:
                {
                alt16=8;
                }
                break;
            case 40:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMySelenium.g:1190:3: kw= 'link'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1196:3: kw= 'button'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1202:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getCheckboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1208:3: kw= 'input'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getInputKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1214:3: kw= 'h1'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getH1Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1220:3: kw= 'body'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getBodyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1226:3: kw= 'select'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getSelectKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:1232:3: kw= 'a'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getAKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1238:3: kw= 'img'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getImgKeyword_8());
                    		

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
    // $ANTLR end "ruleDOMElement"


    // $ANTLR start "entryRuleOneParameterActionType"
    // InternalMySelenium.g:1247:1: entryRuleOneParameterActionType returns [String current=null] : iv_ruleOneParameterActionType= ruleOneParameterActionType EOF ;
    public final String entryRuleOneParameterActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOneParameterActionType = null;


        try {
            // InternalMySelenium.g:1247:62: (iv_ruleOneParameterActionType= ruleOneParameterActionType EOF )
            // InternalMySelenium.g:1248:2: iv_ruleOneParameterActionType= ruleOneParameterActionType EOF
            {
             newCompositeNode(grammarAccess.getOneParameterActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneParameterActionType=ruleOneParameterActionType();

            state._fsp--;

             current =iv_ruleOneParameterActionType.getText(); 
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
    // $ANTLR end "entryRuleOneParameterActionType"


    // $ANTLR start "ruleOneParameterActionType"
    // InternalMySelenium.g:1254:1: ruleOneParameterActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'click' | kw= 'assign' | kw= 'fill' | kw= 'choose' ) ;
    public final AntlrDatatypeRuleToken ruleOneParameterActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1260:2: ( (kw= 'click' | kw= 'assign' | kw= 'fill' | kw= 'choose' ) )
            // InternalMySelenium.g:1261:2: (kw= 'click' | kw= 'assign' | kw= 'fill' | kw= 'choose' )
            {
            // InternalMySelenium.g:1261:2: (kw= 'click' | kw= 'assign' | kw= 'fill' | kw= 'choose' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt17=1;
                }
                break;
            case 42:
                {
                alt17=2;
                }
                break;
            case 43:
                {
                alt17=3;
                }
                break;
            case 44:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:1262:3: kw= 'click'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getClickKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1268:3: kw= 'assign'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getAssignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1274:3: kw= 'fill'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getFillKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1280:3: kw= 'choose'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getChooseKeyword_3());
                    		

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
    // $ANTLR end "ruleOneParameterActionType"


    // $ANTLR start "entryRuleTwoParametersActionType"
    // InternalMySelenium.g:1289:1: entryRuleTwoParametersActionType returns [String current=null] : iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF ;
    public final String entryRuleTwoParametersActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTwoParametersActionType = null;


        try {
            // InternalMySelenium.g:1289:63: (iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF )
            // InternalMySelenium.g:1290:2: iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF
            {
             newCompositeNode(grammarAccess.getTwoParametersActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTwoParametersActionType=ruleTwoParametersActionType();

            state._fsp--;

             current =iv_ruleTwoParametersActionType.getText(); 
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
    // $ANTLR end "entryRuleTwoParametersActionType"


    // $ANTLR start "ruleTwoParametersActionType"
    // InternalMySelenium.g:1296:1: ruleTwoParametersActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'assign' | kw= 'fill' | kw= 'choose' ) ;
    public final AntlrDatatypeRuleToken ruleTwoParametersActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1302:2: ( (kw= 'assign' | kw= 'fill' | kw= 'choose' ) )
            // InternalMySelenium.g:1303:2: (kw= 'assign' | kw= 'fill' | kw= 'choose' )
            {
            // InternalMySelenium.g:1303:2: (kw= 'assign' | kw= 'fill' | kw= 'choose' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case 44:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMySelenium.g:1304:3: kw= 'assign'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1310:3: kw= 'fill'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1316:3: kw= 'choose'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getChooseKeyword_2());
                    		

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
    // $ANTLR end "ruleTwoParametersActionType"


    // $ANTLR start "entryRuleFunctionParameters"
    // InternalMySelenium.g:1325:1: entryRuleFunctionParameters returns [EObject current=null] : iv_ruleFunctionParameters= ruleFunctionParameters EOF ;
    public final EObject entryRuleFunctionParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameters = null;


        try {
            // InternalMySelenium.g:1325:59: (iv_ruleFunctionParameters= ruleFunctionParameters EOF )
            // InternalMySelenium.g:1326:2: iv_ruleFunctionParameters= ruleFunctionParameters EOF
            {
             newCompositeNode(grammarAccess.getFunctionParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionParameters=ruleFunctionParameters();

            state._fsp--;

             current =iv_ruleFunctionParameters; 
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
    // $ANTLR end "entryRuleFunctionParameters"


    // $ANTLR start "ruleFunctionParameters"
    // InternalMySelenium.g:1332:1: ruleFunctionParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFunctionParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1338:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) )
            // InternalMySelenium.g:1339:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            {
            // InternalMySelenium.g:1339:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            // InternalMySelenium.g:1340:3: otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1344:3: ( (lv_variables_1_0= ruleVariable ) )
            // InternalMySelenium.g:1345:4: (lv_variables_1_0= ruleVariable )
            {
            // InternalMySelenium.g:1345:4: (lv_variables_1_0= ruleVariable )
            // InternalMySelenium.g:1346:5: lv_variables_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_variables_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:1363:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMySelenium.g:1364:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMySelenium.g:1368:4: ( (lv_variables_3_0= ruleVariable ) )
            	    // InternalMySelenium.g:1369:5: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalMySelenium.g:1369:5: (lv_variables_3_0= ruleVariable )
            	    // InternalMySelenium.g:1370:6: lv_variables_3_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_variables_3_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionParameters"


    // $ANTLR start "entryRuleFunctionCallParameters"
    // InternalMySelenium.g:1396:1: entryRuleFunctionCallParameters returns [EObject current=null] : iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF ;
    public final EObject entryRuleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallParameters = null;


        try {
            // InternalMySelenium.g:1396:63: (iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:1397:2: iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallParameters=ruleFunctionCallParameters();

            state._fsp--;

             current =iv_ruleFunctionCallParameters; 
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
    // $ANTLR end "entryRuleFunctionCallParameters"


    // $ANTLR start "ruleFunctionCallParameters"
    // InternalMySelenium.g:1403:1: ruleFunctionCallParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1409:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' ) )
            // InternalMySelenium.g:1410:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' )
            {
            // InternalMySelenium.g:1410:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' )
            // InternalMySelenium.g:1411:3: otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1415:3: ( (lv_variables_1_0= ruleVariableCall ) )
            // InternalMySelenium.g:1416:4: (lv_variables_1_0= ruleVariableCall )
            {
            // InternalMySelenium.g:1416:4: (lv_variables_1_0= ruleVariableCall )
            // InternalMySelenium.g:1417:5: lv_variables_1_0= ruleVariableCall
            {

            					newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_variables_1_0=ruleVariableCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallParametersRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.VariableCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:1434:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMySelenium.g:1435:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMySelenium.g:1439:4: ( (lv_variables_3_0= ruleVariableCall ) )
            	    // InternalMySelenium.g:1440:5: (lv_variables_3_0= ruleVariableCall )
            	    {
            	    // InternalMySelenium.g:1440:5: (lv_variables_3_0= ruleVariableCall )
            	    // InternalMySelenium.g:1441:6: lv_variables_3_0= ruleVariableCall
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_variables_3_0=ruleVariableCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionCallParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"fr.imta.clementdamien.dsl.selenium.MySelenium.VariableCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCallParameters"


    // $ANTLR start "entryRuleVariableCall"
    // InternalMySelenium.g:1467:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalMySelenium.g:1467:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalMySelenium.g:1468:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
             newCompositeNode(grammarAccess.getVariableCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;

             current =iv_ruleVariableCall; 
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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalMySelenium.g:1474:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1480:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) )
            // InternalMySelenium.g:1481:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            {
            // InternalMySelenium.g:1481:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMySelenium.g:1482:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMySelenium.g:1482:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMySelenium.g:1483:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMySelenium.g:1483:4: (otherlv_0= RULE_ID )
                    // InternalMySelenium.g:1484:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableCallRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1496:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getVariableCallAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleVariable"
    // InternalMySelenium.g:1504:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMySelenium.g:1504:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMySelenium.g:1505:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMySelenium.g:1511:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1517:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:1518:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:1518:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:1519:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:1519:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:1520:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariable"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\1\uffff\2\23\11\27\1\4\2\uffff\1\20\2\32\6\23\1\16\1\4\1\23\1\4\1\16\1\17\2\32\2\30\3\23\1\20\6\23\1\4\2\30";
    static final String dfa_3s = "\1\54\2\uffff\1\50\1\uffff\1\55\1\24\11\27\1\5\2\uffff\1\37\2\56\6\23\1\31\1\5\1\24\1\5\1\16\1\21\2\56\2\32\3\24\1\37\6\23\1\5\2\32";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\5\14\uffff\1\3\1\4\40\uffff";
    static final String dfa_5s = "\63\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\15\uffff\1\3\2\uffff\2\4\22\uffff\4\1",
            "",
            "",
            "\1\5\1\6\32\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\21\1\22\30\uffff\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24\1\25",
            "",
            "",
            "\1\27\7\uffff\1\34\2\uffff\1\26\1\30\1\31\1\32\1\33",
            "\1\35\23\uffff\1\36",
            "\1\35\23\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\41\12\uffff\1\40",
            "\1\42\1\43",
            "\1\21\1\22",
            "\1\45\1\44",
            "\1\41",
            "\1\46\1\47\1\50",
            "\1\35\23\uffff\1\36",
            "\1\35\23\uffff\1\36",
            "\1\34\1\uffff\1\51",
            "\1\34\1\uffff\1\51",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\53\12\uffff\1\52\1\54\1\55\1\56\1\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\62\1\61",
            "\1\34\1\uffff\1\51",
            "\1\34\1\uffff\1\51"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "479:2: (this_OneParameterAction_0= ruleOneParameterAction | this_FunctionCall_1= ruleFunctionCall | this_AssertEquals_2= ruleAssertEquals | this_AssertContains_3= ruleAssertContains | this_NavigationAction_4= ruleNavigationAction )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00001E0000640012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00001E0000642010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000001FF00000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001FF00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001FF00000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F9010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F8010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400004000000L});

}