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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'{'", "'}'", "'.'", "'value'", "'text'", "'html'", "'assert'", "'='", "'contains'", "'go'", "'openBrowser'", "'['", "']'", "'.all'", "','", "'name'", "'alt'", "'checked'", "'class'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'click'", "'assign'", "'fill'", "'choose'", "'('", "')'", "'#'"
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
    // InternalMySelenium.g:71:1: ruleProgram returns [EObject current=null] : ( ( ruleComment )* ( (lv_functions_1_0= ruleFunction ) )+ ( ruleComment )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:77:2: ( ( ( ruleComment )* ( (lv_functions_1_0= ruleFunction ) )+ ( ruleComment )* ) )
            // InternalMySelenium.g:78:2: ( ( ruleComment )* ( (lv_functions_1_0= ruleFunction ) )+ ( ruleComment )* )
            {
            // InternalMySelenium.g:78:2: ( ( ruleComment )* ( (lv_functions_1_0= ruleFunction ) )+ ( ruleComment )* )
            // InternalMySelenium.g:79:3: ( ruleComment )* ( (lv_functions_1_0= ruleFunction ) )+ ( ruleComment )*
            {
            // InternalMySelenium.g:79:3: ( ruleComment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==46) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMySelenium.g:80:4: ruleComment
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getCommentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    ruleComment();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMySelenium.g:88:3: ( (lv_functions_1_0= ruleFunction ) )+
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
            	    // InternalMySelenium.g:89:4: (lv_functions_1_0= ruleFunction )
            	    {
            	    // InternalMySelenium.g:89:4: (lv_functions_1_0= ruleFunction )
            	    // InternalMySelenium.g:90:5: lv_functions_1_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_1_0,
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

            // InternalMySelenium.g:107:3: ( ruleComment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==46) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMySelenium.g:108:4: ruleComment
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getCommentParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_4);
            	    ruleComment();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:120:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMySelenium.g:120:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMySelenium.g:121:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMySelenium.g:127:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
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
            // InternalMySelenium.g:133:2: ( (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalMySelenium.g:134:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalMySelenium.g:134:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalMySelenium.g:135:3: otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )* otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
            		
            // InternalMySelenium.g:139:3: ( (lv_name_1_0= ruleFunctionName ) )
            // InternalMySelenium.g:140:4: (lv_name_1_0= ruleFunctionName )
            {
            // InternalMySelenium.g:140:4: (lv_name_1_0= ruleFunctionName )
            // InternalMySelenium.g:141:5: lv_name_1_0= ruleFunctionName
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

            // InternalMySelenium.g:158:3: ( (lv_params_2_0= ruleFunctionParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMySelenium.g:159:4: (lv_params_2_0= ruleFunctionParameters )
            	    {
            	    // InternalMySelenium.g:159:4: (lv_params_2_0= ruleFunctionParameters )
            	    // InternalMySelenium.g:160:5: lv_params_2_0= ruleFunctionParameters
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
            		
            // InternalMySelenium.g:181:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=40 && LA5_0<=43)||LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMySelenium.g:182:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalMySelenium.g:182:4: (lv_statements_4_0= ruleStatement )
            	    // InternalMySelenium.g:183:5: lv_statements_4_0= ruleStatement
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
    // InternalMySelenium.g:208:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMySelenium.g:208:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMySelenium.g:209:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMySelenium.g:215:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:222:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:222:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:223:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:223:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:224:4: lv_name_0_0= RULE_ID
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
    // InternalMySelenium.g:243:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMySelenium.g:243:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMySelenium.g:244:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalMySelenium.g:250:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:256:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) )
            // InternalMySelenium.g:257:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            {
            // InternalMySelenium.g:257:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            // InternalMySelenium.g:258:3: ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) )
            {
            // InternalMySelenium.g:258:3: ( (otherlv_0= RULE_ID ) )
            // InternalMySelenium.g:259:4: (otherlv_0= RULE_ID )
            {
            // InternalMySelenium.g:259:4: (otherlv_0= RULE_ID )
            // InternalMySelenium.g:260:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0());
            				

            }


            }

            // InternalMySelenium.g:271:3: ( (lv_params_1_0= ruleFunctionCallParameters ) )
            // InternalMySelenium.g:272:4: (lv_params_1_0= ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:272:4: (lv_params_1_0= ruleFunctionCallParameters )
            // InternalMySelenium.g:273:5: lv_params_1_0= ruleFunctionCallParameters
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
    // InternalMySelenium.g:294:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMySelenium.g:294:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMySelenium.g:295:2: iv_ruleProjection= ruleProjection EOF
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
    // InternalMySelenium.g:301:1: ruleProjection returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selector_0_0 = null;

        AntlrDatatypeRuleToken lv_projectionAction_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:307:2: ( ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) )
            // InternalMySelenium.g:308:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            {
            // InternalMySelenium.g:308:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            // InternalMySelenium.g:309:3: ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            {
            // InternalMySelenium.g:309:3: ( (lv_selector_0_0= ruleSelector ) )
            // InternalMySelenium.g:310:4: (lv_selector_0_0= ruleSelector )
            {
            // InternalMySelenium.g:310:4: (lv_selector_0_0= ruleSelector )
            // InternalMySelenium.g:311:5: lv_selector_0_0= ruleSelector
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
            		
            // InternalMySelenium.g:332:3: ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            // InternalMySelenium.g:333:4: (lv_projectionAction_2_0= ruleProjectionAction )
            {
            // InternalMySelenium.g:333:4: (lv_projectionAction_2_0= ruleProjectionAction )
            // InternalMySelenium.g:334:5: lv_projectionAction_2_0= ruleProjectionAction
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
    // InternalMySelenium.g:355:1: entryRuleProjectionAction returns [String current=null] : iv_ruleProjectionAction= ruleProjectionAction EOF ;
    public final String entryRuleProjectionAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectionAction = null;


        try {
            // InternalMySelenium.g:355:56: (iv_ruleProjectionAction= ruleProjectionAction EOF )
            // InternalMySelenium.g:356:2: iv_ruleProjectionAction= ruleProjectionAction EOF
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
    // InternalMySelenium.g:362:1: ruleProjectionAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'value' | kw= 'text' | kw= 'html' ) ;
    public final AntlrDatatypeRuleToken ruleProjectionAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:368:2: ( (kw= 'value' | kw= 'text' | kw= 'html' ) )
            // InternalMySelenium.g:369:2: (kw= 'value' | kw= 'text' | kw= 'html' )
            {
            // InternalMySelenium.g:369:2: (kw= 'value' | kw= 'text' | kw= 'html' )
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
                    // InternalMySelenium.g:370:3: kw= 'value'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getValueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:376:3: kw= 'text'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:382:3: kw= 'html'
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
    // InternalMySelenium.g:391:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMySelenium.g:391:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMySelenium.g:392:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMySelenium.g:398:1: ruleStatement returns [EObject current=null] : (this_OneParameterAction_0= ruleOneParameterAction | this_TwoParametersAction_1= ruleTwoParametersAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction | ruleComment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_OneParameterAction_0 = null;

        EObject this_TwoParametersAction_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_AssertEquals_3 = null;

        EObject this_AssertContains_4 = null;

        EObject this_NavigationAction_5 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:404:2: ( (this_OneParameterAction_0= ruleOneParameterAction | this_TwoParametersAction_1= ruleTwoParametersAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction | ruleComment ) )
            // InternalMySelenium.g:405:2: (this_OneParameterAction_0= ruleOneParameterAction | this_TwoParametersAction_1= ruleTwoParametersAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction | ruleComment )
            {
            // InternalMySelenium.g:405:2: (this_OneParameterAction_0= ruleOneParameterAction | this_TwoParametersAction_1= ruleTwoParametersAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction | ruleComment )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:406:3: this_OneParameterAction_0= ruleOneParameterAction
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
                    // InternalMySelenium.g:415:3: this_TwoParametersAction_1= ruleTwoParametersAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTwoParametersActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TwoParametersAction_1=ruleTwoParametersAction();

                    state._fsp--;


                    			current = this_TwoParametersAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:424:3: this_FunctionCall_2= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:433:3: this_AssertEquals_3= ruleAssertEquals
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertEquals_3=ruleAssertEquals();

                    state._fsp--;


                    			current = this_AssertEquals_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:442:3: this_AssertContains_4= ruleAssertContains
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertContains_4=ruleAssertContains();

                    state._fsp--;


                    			current = this_AssertContains_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:451:3: this_NavigationAction_5= ruleNavigationAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationAction_5=ruleNavigationAction();

                    state._fsp--;


                    			current = this_NavigationAction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:460:3: ruleComment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCommentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;


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
    // InternalMySelenium.g:471:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalMySelenium.g:471:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalMySelenium.g:472:2: iv_ruleAssertEquals= ruleAssertEquals EOF
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
    // InternalMySelenium.g:478:1: ruleAssertEquals returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_assertableElement_1_0 = null;

        EObject lv_assertableElement_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:484:2: ( (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:485:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:485:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:486:3: otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertEqualsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:490:3: ( (lv_assertableElement_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:491:4: (lv_assertableElement_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:491:4: (lv_assertableElement_1_0= ruleAssertableElement )
            // InternalMySelenium.g:492:5: lv_assertableElement_1_0= ruleAssertableElement
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

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2());
            		
            // InternalMySelenium.g:513:3: ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:514:4: (lv_assertableElement_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:514:4: (lv_assertableElement_3_0= ruleAssertableElement )
            // InternalMySelenium.g:515:5: lv_assertableElement_3_0= ruleAssertableElement
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
    // InternalMySelenium.g:536:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalMySelenium.g:536:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalMySelenium.g:537:2: iv_ruleAssertContains= ruleAssertContains EOF
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
    // InternalMySelenium.g:543:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_container_1_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:549:2: ( (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:550:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:550:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:551:3: otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:555:3: ( (lv_container_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:556:4: (lv_container_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:556:4: (lv_container_1_0= ruleAssertableElement )
            // InternalMySelenium.g:557:5: lv_container_1_0= ruleAssertableElement
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

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertContainsAccess().getContainsKeyword_2());
            		
            // InternalMySelenium.g:578:3: ( (lv_element_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:579:4: (lv_element_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:579:4: (lv_element_3_0= ruleAssertableElement )
            // InternalMySelenium.g:580:5: lv_element_3_0= ruleAssertableElement
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
    // InternalMySelenium.g:601:1: entryRuleAssertableElement returns [EObject current=null] : iv_ruleAssertableElement= ruleAssertableElement EOF ;
    public final EObject entryRuleAssertableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertableElement = null;


        try {
            // InternalMySelenium.g:601:58: (iv_ruleAssertableElement= ruleAssertableElement EOF )
            // InternalMySelenium.g:602:2: iv_ruleAssertableElement= ruleAssertableElement EOF
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
    // InternalMySelenium.g:608:1: ruleAssertableElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleAssertableElement() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_Variable_0 = null;

        EObject this_Projection_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:614:2: ( (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalMySelenium.g:615:2: (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalMySelenium.g:615:2: (this_Variable_0= ruleVariable | this_STRING_1= RULE_STRING | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==44) ) {
                    alt8=4;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==13||(LA8_1>=18 && LA8_1<=22)||(LA8_1>=40 && LA8_1<=43)||LA8_1==46) ) {
                    alt8=1;
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
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
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
                    // InternalMySelenium.g:616:3: this_Variable_0= ruleVariable
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
                    // InternalMySelenium.g:625:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:630:3: this_Projection_2= ruleProjection
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
                    // InternalMySelenium.g:639:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalMySelenium.g:651:1: entryRuleNavigationAction returns [EObject current=null] : iv_ruleNavigationAction= ruleNavigationAction EOF ;
    public final EObject entryRuleNavigationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationAction = null;


        try {
            // InternalMySelenium.g:651:57: (iv_ruleNavigationAction= ruleNavigationAction EOF )
            // InternalMySelenium.g:652:2: iv_ruleNavigationAction= ruleNavigationAction EOF
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
    // InternalMySelenium.g:658:1: ruleNavigationAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigationAction() throws RecognitionException {
        EObject current = null;

        Token lv_param_1_0=null;
        AntlrDatatypeRuleToken lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:664:2: ( ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) )
            // InternalMySelenium.g:665:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            {
            // InternalMySelenium.g:665:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            // InternalMySelenium.g:666:3: ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) )
            {
            // InternalMySelenium.g:666:3: ( (lv_action_0_0= ruleNavigationActionType ) )
            // InternalMySelenium.g:667:4: (lv_action_0_0= ruleNavigationActionType )
            {
            // InternalMySelenium.g:667:4: (lv_action_0_0= ruleNavigationActionType )
            // InternalMySelenium.g:668:5: lv_action_0_0= ruleNavigationActionType
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

            // InternalMySelenium.g:685:3: ( (lv_param_1_0= RULE_STRING ) )
            // InternalMySelenium.g:686:4: (lv_param_1_0= RULE_STRING )
            {
            // InternalMySelenium.g:686:4: (lv_param_1_0= RULE_STRING )
            // InternalMySelenium.g:687:5: lv_param_1_0= RULE_STRING
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
    // InternalMySelenium.g:707:1: entryRuleNavigationActionType returns [String current=null] : iv_ruleNavigationActionType= ruleNavigationActionType EOF ;
    public final String entryRuleNavigationActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationActionType = null;


        try {
            // InternalMySelenium.g:707:60: (iv_ruleNavigationActionType= ruleNavigationActionType EOF )
            // InternalMySelenium.g:708:2: iv_ruleNavigationActionType= ruleNavigationActionType EOF
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
    // InternalMySelenium.g:714:1: ruleNavigationActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' | kw= 'openBrowser' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:720:2: ( (kw= 'go' | kw= 'openBrowser' ) )
            // InternalMySelenium.g:721:2: (kw= 'go' | kw= 'openBrowser' )
            {
            // InternalMySelenium.g:721:2: (kw= 'go' | kw= 'openBrowser' )
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
                    // InternalMySelenium.g:722:3: kw= 'go'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:728:3: kw= 'openBrowser'
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
    // InternalMySelenium.g:737:1: entryRuleOneParameterAction returns [EObject current=null] : iv_ruleOneParameterAction= ruleOneParameterAction EOF ;
    public final EObject entryRuleOneParameterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneParameterAction = null;


        try {
            // InternalMySelenium.g:737:59: (iv_ruleOneParameterAction= ruleOneParameterAction EOF )
            // InternalMySelenium.g:738:2: iv_ruleOneParameterAction= ruleOneParameterAction EOF
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
    // InternalMySelenium.g:744:1: ruleOneParameterAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ) ;
    public final EObject ruleOneParameterAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_action_0_0 = null;

        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:750:2: ( ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ) )
            // InternalMySelenium.g:751:2: ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) )
            {
            // InternalMySelenium.g:751:2: ( ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) )
            // InternalMySelenium.g:752:3: ( (lv_action_0_0= ruleOneParameterActionType ) ) ( (lv_selector_1_0= ruleSelector ) )
            {
            // InternalMySelenium.g:752:3: ( (lv_action_0_0= ruleOneParameterActionType ) )
            // InternalMySelenium.g:753:4: (lv_action_0_0= ruleOneParameterActionType )
            {
            // InternalMySelenium.g:753:4: (lv_action_0_0= ruleOneParameterActionType )
            // InternalMySelenium.g:754:5: lv_action_0_0= ruleOneParameterActionType
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

            // InternalMySelenium.g:771:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalMySelenium.g:772:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalMySelenium.g:772:4: (lv_selector_1_0= ruleSelector )
            // InternalMySelenium.g:773:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getOneParameterActionAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleTwoParametersAction"
    // InternalMySelenium.g:794:1: entryRuleTwoParametersAction returns [EObject current=null] : iv_ruleTwoParametersAction= ruleTwoParametersAction EOF ;
    public final EObject entryRuleTwoParametersAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoParametersAction = null;


        try {
            // InternalMySelenium.g:794:60: (iv_ruleTwoParametersAction= ruleTwoParametersAction EOF )
            // InternalMySelenium.g:795:2: iv_ruleTwoParametersAction= ruleTwoParametersAction EOF
            {
             newCompositeNode(grammarAccess.getTwoParametersActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTwoParametersAction=ruleTwoParametersAction();

            state._fsp--;

             current =iv_ruleTwoParametersAction; 
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
    // $ANTLR end "entryRuleTwoParametersAction"


    // $ANTLR start "ruleTwoParametersAction"
    // InternalMySelenium.g:801:1: ruleTwoParametersAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleTwoParametersActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) ) ) ;
    public final EObject ruleTwoParametersAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_action_0_0 = null;

        EObject lv_selector_1_0 = null;

        EObject lv_parameter_2_1 = null;

        EObject lv_parameter_2_2 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:807:2: ( ( ( (lv_action_0_0= ruleTwoParametersActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) ) ) )
            // InternalMySelenium.g:808:2: ( ( (lv_action_0_0= ruleTwoParametersActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) ) )
            {
            // InternalMySelenium.g:808:2: ( ( (lv_action_0_0= ruleTwoParametersActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) ) )
            // InternalMySelenium.g:809:3: ( (lv_action_0_0= ruleTwoParametersActionType ) ) ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) )
            {
            // InternalMySelenium.g:809:3: ( (lv_action_0_0= ruleTwoParametersActionType ) )
            // InternalMySelenium.g:810:4: (lv_action_0_0= ruleTwoParametersActionType )
            {
            // InternalMySelenium.g:810:4: (lv_action_0_0= ruleTwoParametersActionType )
            // InternalMySelenium.g:811:5: lv_action_0_0= ruleTwoParametersActionType
            {

            					newCompositeNode(grammarAccess.getTwoParametersActionAccess().getActionTwoParametersActionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_action_0_0=ruleTwoParametersActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.TwoParametersActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:828:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalMySelenium.g:829:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalMySelenium.g:829:4: (lv_selector_1_0= ruleSelector )
            // InternalMySelenium.g:830:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getTwoParametersActionAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:847:3: ( ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) ) )
            // InternalMySelenium.g:848:4: ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) )
            {
            // InternalMySelenium.g:848:4: ( (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable ) )
            // InternalMySelenium.g:849:5: (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable )
            {
            // InternalMySelenium.g:849:5: (lv_parameter_2_1= ruleSelector | lv_parameter_2_2= ruleVariable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=31 && LA10_0<=39)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:850:6: lv_parameter_2_1= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameter_2_1=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
                    						}
                    						set(
                    							current,
                    							"parameter",
                    							lv_parameter_2_1,
                    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:866:6: lv_parameter_2_2= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getTwoParametersActionAccess().getParameterVariableParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameter_2_2=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTwoParametersActionRule());
                    						}
                    						set(
                    							current,
                    							"parameter",
                    							lv_parameter_2_2,
                    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTwoParametersAction"


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:888:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalMySelenium.g:888:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalMySelenium.g:889:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalMySelenium.g:895:1: ruleSelector returns [EObject current=null] : ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:901:2: ( ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? ) )
            // InternalMySelenium.g:902:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? )
            {
            // InternalMySelenium.g:902:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )? )
            // InternalMySelenium.g:903:3: ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.all' )?
            {
            // InternalMySelenium.g:903:3: ( (lv_element_0_0= ruleDOMElement ) )
            // InternalMySelenium.g:904:4: (lv_element_0_0= ruleDOMElement )
            {
            // InternalMySelenium.g:904:4: (lv_element_0_0= ruleDOMElement )
            // InternalMySelenium.g:905:5: lv_element_0_0= ruleDOMElement
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
            		
            // InternalMySelenium.g:926:3: ( (lv_attrs_2_0= ruleAttributes ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16||(LA11_0>=27 && LA11_0<=30)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMySelenium.g:927:4: (lv_attrs_2_0= ruleAttributes )
                    {
                    // InternalMySelenium.g:927:4: (lv_attrs_2_0= ruleAttributes )
                    // InternalMySelenium.g:928:5: lv_attrs_2_0= ruleAttributes
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
            		
            // InternalMySelenium.g:949:3: (otherlv_4= '.all' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMySelenium.g:950:4: otherlv_4= '.all'
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
    // InternalMySelenium.g:959:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalMySelenium.g:959:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalMySelenium.g:960:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalMySelenium.g:966:1: ruleAttributes returns [EObject current=null] : ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attrs_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:972:2: ( ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) )
            // InternalMySelenium.g:973:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            {
            // InternalMySelenium.g:973:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            // InternalMySelenium.g:974:3: ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            {
            // InternalMySelenium.g:974:3: ( (lv_attrs_0_0= ruleAttribute ) )
            // InternalMySelenium.g:975:4: (lv_attrs_0_0= ruleAttribute )
            {
            // InternalMySelenium.g:975:4: (lv_attrs_0_0= ruleAttribute )
            // InternalMySelenium.g:976:5: lv_attrs_0_0= ruleAttribute
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

            // InternalMySelenium.g:993:3: (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMySelenium.g:994:4: otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMySelenium.g:998:4: ( (lv_attrs_2_0= ruleAttribute ) )
            	    // InternalMySelenium.g:999:5: (lv_attrs_2_0= ruleAttribute )
            	    {
            	    // InternalMySelenium.g:999:5: (lv_attrs_2_0= ruleAttribute )
            	    // InternalMySelenium.g:1000:6: lv_attrs_2_0= ruleAttribute
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
    // InternalMySelenium.g:1022:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMySelenium.g:1022:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMySelenium.g:1023:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMySelenium.g:1029:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1035:2: ( ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMySelenium.g:1036:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMySelenium.g:1036:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMySelenium.g:1037:3: ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMySelenium.g:1037:3: ( (lv_name_0_0= ruleDOMAttribute ) )
            // InternalMySelenium.g:1038:4: (lv_name_0_0= ruleDOMAttribute )
            {
            // InternalMySelenium.g:1038:4: (lv_name_0_0= ruleDOMAttribute )
            // InternalMySelenium.g:1039:5: lv_name_0_0= ruleDOMAttribute
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
            		
            // InternalMySelenium.g:1060:3: (this_STRING_2= RULE_STRING | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMySelenium.g:1061:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_2, grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1066:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMySelenium.g:1066:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMySelenium.g:1067:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMySelenium.g:1067:5: (otherlv_3= RULE_ID )
                    // InternalMySelenium.g:1068:6: otherlv_3= RULE_ID
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
    // InternalMySelenium.g:1084:1: entryRuleDOMAttribute returns [String current=null] : iv_ruleDOMAttribute= ruleDOMAttribute EOF ;
    public final String entryRuleDOMAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAttribute = null;


        try {
            // InternalMySelenium.g:1084:52: (iv_ruleDOMAttribute= ruleDOMAttribute EOF )
            // InternalMySelenium.g:1085:2: iv_ruleDOMAttribute= ruleDOMAttribute EOF
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
    // InternalMySelenium.g:1091:1: ruleDOMAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' ) ;
    public final AntlrDatatypeRuleToken ruleDOMAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1097:2: ( (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' ) )
            // InternalMySelenium.g:1098:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' )
            {
            // InternalMySelenium.g:1098:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' )
            int alt15=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1099:3: kw= 'name'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getNameKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1105:3: kw= 'text'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1111:3: kw= 'alt'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getAltKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1117:3: kw= 'checked'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1123:3: kw= 'class'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getClassKeyword_4());
                    		

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
    // InternalMySelenium.g:1132:1: entryRuleDOMElement returns [String current=null] : iv_ruleDOMElement= ruleDOMElement EOF ;
    public final String entryRuleDOMElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMElement = null;


        try {
            // InternalMySelenium.g:1132:50: (iv_ruleDOMElement= ruleDOMElement EOF )
            // InternalMySelenium.g:1133:2: iv_ruleDOMElement= ruleDOMElement EOF
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
    // InternalMySelenium.g:1139:1: ruleDOMElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' ) ;
    public final AntlrDatatypeRuleToken ruleDOMElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1145:2: ( (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' ) )
            // InternalMySelenium.g:1146:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' )
            {
            // InternalMySelenium.g:1146:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            case 35:
                {
                alt16=5;
                }
                break;
            case 36:
                {
                alt16=6;
                }
                break;
            case 37:
                {
                alt16=7;
                }
                break;
            case 38:
                {
                alt16=8;
                }
                break;
            case 39:
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
                    // InternalMySelenium.g:1147:3: kw= 'link'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1153:3: kw= 'button'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1159:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getCheckboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1165:3: kw= 'input'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getInputKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1171:3: kw= 'h1'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getH1Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1177:3: kw= 'body'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getBodyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1183:3: kw= 'select'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getSelectKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:1189:3: kw= 'a'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getAKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1195:3: kw= 'img'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMySelenium.g:1204:1: entryRuleOneParameterActionType returns [String current=null] : iv_ruleOneParameterActionType= ruleOneParameterActionType EOF ;
    public final String entryRuleOneParameterActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOneParameterActionType = null;


        try {
            // InternalMySelenium.g:1204:62: (iv_ruleOneParameterActionType= ruleOneParameterActionType EOF )
            // InternalMySelenium.g:1205:2: iv_ruleOneParameterActionType= ruleOneParameterActionType EOF
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
    // InternalMySelenium.g:1211:1: ruleOneParameterActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'click' ;
    public final AntlrDatatypeRuleToken ruleOneParameterActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1217:2: (kw= 'click' )
            // InternalMySelenium.g:1218:2: kw= 'click'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOneParameterActionTypeAccess().getClickKeyword());
            	

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
    // InternalMySelenium.g:1226:1: entryRuleTwoParametersActionType returns [String current=null] : iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF ;
    public final String entryRuleTwoParametersActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTwoParametersActionType = null;


        try {
            // InternalMySelenium.g:1226:63: (iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF )
            // InternalMySelenium.g:1227:2: iv_ruleTwoParametersActionType= ruleTwoParametersActionType EOF
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
    // InternalMySelenium.g:1233:1: ruleTwoParametersActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'assign' | kw= 'fill' | kw= 'choose' ) ;
    public final AntlrDatatypeRuleToken ruleTwoParametersActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1239:2: ( (kw= 'assign' | kw= 'fill' | kw= 'choose' ) )
            // InternalMySelenium.g:1240:2: (kw= 'assign' | kw= 'fill' | kw= 'choose' )
            {
            // InternalMySelenium.g:1240:2: (kw= 'assign' | kw= 'fill' | kw= 'choose' )
            int alt17=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:1241:3: kw= 'assign'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1247:3: kw= 'fill'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1253:3: kw= 'choose'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMySelenium.g:1262:1: entryRuleFunctionParameters returns [EObject current=null] : iv_ruleFunctionParameters= ruleFunctionParameters EOF ;
    public final EObject entryRuleFunctionParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameters = null;


        try {
            // InternalMySelenium.g:1262:59: (iv_ruleFunctionParameters= ruleFunctionParameters EOF )
            // InternalMySelenium.g:1263:2: iv_ruleFunctionParameters= ruleFunctionParameters EOF
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
    // InternalMySelenium.g:1269:1: ruleFunctionParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFunctionParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1275:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) )
            // InternalMySelenium.g:1276:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            {
            // InternalMySelenium.g:1276:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            // InternalMySelenium.g:1277:3: otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1281:3: ( (lv_variables_1_0= ruleVariable ) )
            // InternalMySelenium.g:1282:4: (lv_variables_1_0= ruleVariable )
            {
            // InternalMySelenium.g:1282:4: (lv_variables_1_0= ruleVariable )
            // InternalMySelenium.g:1283:5: lv_variables_1_0= ruleVariable
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

            // InternalMySelenium.g:1300:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMySelenium.g:1301:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMySelenium.g:1305:4: ( (lv_variables_3_0= ruleVariable ) )
            	    // InternalMySelenium.g:1306:5: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalMySelenium.g:1306:5: (lv_variables_3_0= ruleVariable )
            	    // InternalMySelenium.g:1307:6: lv_variables_3_0= ruleVariable
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMySelenium.g:1333:1: entryRuleFunctionCallParameters returns [EObject current=null] : iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF ;
    public final EObject entryRuleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallParameters = null;


        try {
            // InternalMySelenium.g:1333:63: (iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:1334:2: iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF
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
    // InternalMySelenium.g:1340:1: ruleFunctionCallParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1346:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' ) )
            // InternalMySelenium.g:1347:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' )
            {
            // InternalMySelenium.g:1347:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')' )
            // InternalMySelenium.g:1348:3: otherlv_0= '(' ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1352:3: ( (lv_variables_1_0= ruleVariableCall ) )
            // InternalMySelenium.g:1353:4: (lv_variables_1_0= ruleVariableCall )
            {
            // InternalMySelenium.g:1353:4: (lv_variables_1_0= ruleVariableCall )
            // InternalMySelenium.g:1354:5: lv_variables_1_0= ruleVariableCall
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

            // InternalMySelenium.g:1371:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMySelenium.g:1372:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMySelenium.g:1376:4: ( (lv_variables_3_0= ruleVariableCall ) )
            	    // InternalMySelenium.g:1377:5: (lv_variables_3_0= ruleVariableCall )
            	    {
            	    // InternalMySelenium.g:1377:5: (lv_variables_3_0= ruleVariableCall )
            	    // InternalMySelenium.g:1378:6: lv_variables_3_0= ruleVariableCall
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
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMySelenium.g:1404:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalMySelenium.g:1404:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalMySelenium.g:1405:2: iv_ruleVariableCall= ruleVariableCall EOF
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
    // InternalMySelenium.g:1411:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1417:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) )
            // InternalMySelenium.g:1418:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            {
            // InternalMySelenium.g:1418:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMySelenium.g:1419:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMySelenium.g:1419:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMySelenium.g:1420:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMySelenium.g:1420:4: (otherlv_0= RULE_ID )
                    // InternalMySelenium.g:1421:5: otherlv_0= RULE_ID
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
                    // InternalMySelenium.g:1433:3: this_STRING_1= RULE_STRING
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
    // InternalMySelenium.g:1441:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMySelenium.g:1441:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMySelenium.g:1442:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMySelenium.g:1448:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1454:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:1455:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:1455:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:1456:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:1456:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:1457:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleComment"
    // InternalMySelenium.g:1476:1: entryRuleComment returns [String current=null] : iv_ruleComment= ruleComment EOF ;
    public final String entryRuleComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComment = null;


        try {
            // InternalMySelenium.g:1476:47: (iv_ruleComment= ruleComment EOF )
            // InternalMySelenium.g:1477:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment.getText(); 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalMySelenium.g:1483:1: ruleComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' )+ this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1489:2: ( ( (kw= '#' )+ this_STRING_1= RULE_STRING ) )
            // InternalMySelenium.g:1490:2: ( (kw= '#' )+ this_STRING_1= RULE_STRING )
            {
            // InternalMySelenium.g:1490:2: ( (kw= '#' )+ this_STRING_1= RULE_STRING )
            // InternalMySelenium.g:1491:3: (kw= '#' )+ this_STRING_1= RULE_STRING
            {
            // InternalMySelenium.g:1491:3: (kw= '#' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:1492:4: kw= '#'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_25); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCommentAccess().getNumberSignKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getCommentAccess().getSTRINGTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleComment"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\2\uffff\2\23\11\27\2\uffff\1\4\1\20\2\32\5\23\1\16\1\4\1\23\1\4\1\16\1\17\2\32\2\30\3\23\1\20\5\23\1\4\2\30";
    static final String dfa_3s = "\1\56\3\uffff\1\47\2\uffff\1\54\1\24\11\27\2\uffff\1\5\1\36\2\55\5\23\1\31\1\5\1\24\1\5\1\16\1\21\2\55\2\32\3\24\1\36\5\23\1\5\2\32";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\13\uffff\1\5\1\4\37\uffff";
    static final String dfa_5s = "\63\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\15\uffff\1\4\2\uffff\2\5\21\uffff\1\1\3\2\2\uffff\1\6",
            "",
            "",
            "",
            "\1\7\1\10\31\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\23\1\22\27\uffff\1\24",
            "\1\23\1\22",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "",
            "",
            "\1\26\1\27",
            "\1\31\7\uffff\1\35\2\uffff\1\30\1\32\1\33\1\34",
            "\1\36\22\uffff\1\37",
            "\1\36\22\uffff\1\37",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\42\12\uffff\1\41",
            "\1\43\1\44",
            "\1\23\1\22",
            "\1\46\1\45",
            "\1\42",
            "\1\47\1\50\1\51",
            "\1\36\22\uffff\1\37",
            "\1\36\22\uffff\1\37",
            "\1\35\1\uffff\1\52",
            "\1\35\1\uffff\1\52",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\54\12\uffff\1\53\1\55\1\56\1\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\62\1\61",
            "\1\35\1\uffff\1\52",
            "\1\35\1\uffff\1\52"
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
            return "405:2: (this_OneParameterAction_0= ruleOneParameterAction | this_TwoParametersAction_1= ruleTwoParametersAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction | ruleComment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00004F0000642810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000FF80000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000FF80000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000FF80000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000079010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000078010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000020L});

}