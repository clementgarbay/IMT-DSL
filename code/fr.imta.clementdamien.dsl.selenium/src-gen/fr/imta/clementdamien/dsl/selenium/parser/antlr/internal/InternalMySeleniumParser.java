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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'main'", "'{'", "'}'", "'.'", "'value'", "'text'", "'html'", "'assert'", "'='", "'contains'", "'go'", "'openBrowser'", "'assign'", "'['", "']'", "'.parent'", "'('", "')'", "'.all'", "','", "'name'", "'alt'", "'checked'", "'class'", "'id'", "'type'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'div'", "'click'", "'fill'", "'choose'", "'count'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    // InternalMySelenium.g:71:1: ruleProgram returns [EObject current=null] : (this_Statements_0= ruleStatements | this_Functions_1= ruleFunctions ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject this_Statements_0 = null;

        EObject this_Functions_1 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:77:2: ( (this_Statements_0= ruleStatements | this_Functions_1= ruleFunctions ) )
            // InternalMySelenium.g:78:2: (this_Statements_0= ruleStatements | this_Functions_1= ruleFunctions )
            {
            // InternalMySelenium.g:78:2: (this_Statements_0= ruleStatements | this_Functions_1= ruleFunctions )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==19||(LA1_0>=22 && LA1_0<=24)||(LA1_0>=48 && LA1_0<=51)) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMySelenium.g:79:3: this_Statements_0= ruleStatements
                    {

                    			newCompositeNode(grammarAccess.getProgramAccess().getStatementsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Statements_0=ruleStatements();

                    state._fsp--;


                    			current = this_Statements_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:88:3: this_Functions_1= ruleFunctions
                    {

                    			newCompositeNode(grammarAccess.getProgramAccess().getFunctionsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Functions_1=ruleFunctions();

                    state._fsp--;


                    			current = this_Functions_1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunctions"
    // InternalMySelenium.g:100:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalMySelenium.g:100:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalMySelenium.g:101:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalMySelenium.g:107:1: ruleFunctions returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunction ) )+ ( (lv_mainFunction_1_0= ruleMainFunction ) ) ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_mainFunction_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:113:2: ( ( ( (lv_functions_0_0= ruleFunction ) )+ ( (lv_mainFunction_1_0= ruleMainFunction ) ) ) )
            // InternalMySelenium.g:114:2: ( ( (lv_functions_0_0= ruleFunction ) )+ ( (lv_mainFunction_1_0= ruleMainFunction ) ) )
            {
            // InternalMySelenium.g:114:2: ( ( (lv_functions_0_0= ruleFunction ) )+ ( (lv_mainFunction_1_0= ruleMainFunction ) ) )
            // InternalMySelenium.g:115:3: ( (lv_functions_0_0= ruleFunction ) )+ ( (lv_mainFunction_1_0= ruleMainFunction ) )
            {
            // InternalMySelenium.g:115:3: ( (lv_functions_0_0= ruleFunction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMySelenium.g:116:4: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalMySelenium.g:116:4: (lv_functions_0_0= ruleFunction )
            	    // InternalMySelenium.g:117:5: lv_functions_0_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0_0());
            	    				
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

            // InternalMySelenium.g:134:3: ( (lv_mainFunction_1_0= ruleMainFunction ) )
            // InternalMySelenium.g:135:4: (lv_mainFunction_1_0= ruleMainFunction )
            {
            // InternalMySelenium.g:135:4: (lv_mainFunction_1_0= ruleMainFunction )
            // InternalMySelenium.g:136:5: lv_mainFunction_1_0= ruleMainFunction
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getMainFunctionMainFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_mainFunction_1_0=ruleMainFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"mainFunction",
            						lv_mainFunction_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.MainFunction");
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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleStatements"
    // InternalMySelenium.g:157:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalMySelenium.g:157:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalMySelenium.g:158:2: iv_ruleStatements= ruleStatements EOF
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
    // InternalMySelenium.g:164:1: ruleStatements returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:170:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalMySelenium.g:171:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalMySelenium.g:171:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==19||(LA3_0>=22 && LA3_0<=24)||(LA3_0>=48 && LA3_0<=51)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMySelenium.g:172:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMySelenium.g:172:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMySelenium.g:173:4: lv_statements_0_0= ruleStatement
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


    // $ANTLR start "entryRuleMainFunction"
    // InternalMySelenium.g:193:1: entryRuleMainFunction returns [EObject current=null] : iv_ruleMainFunction= ruleMainFunction EOF ;
    public final EObject entryRuleMainFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFunction = null;


        try {
            // InternalMySelenium.g:193:53: (iv_ruleMainFunction= ruleMainFunction EOF )
            // InternalMySelenium.g:194:2: iv_ruleMainFunction= ruleMainFunction EOF
            {
             newCompositeNode(grammarAccess.getMainFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainFunction=ruleMainFunction();

            state._fsp--;

             current =iv_ruleMainFunction; 
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
    // $ANTLR end "entryRuleMainFunction"


    // $ANTLR start "ruleMainFunction"
    // InternalMySelenium.g:200:1: ruleMainFunction returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= 'main' otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) ) otherlv_4= '}' ) ;
    public final EObject ruleMainFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:206:2: ( (otherlv_0= 'def' otherlv_1= 'main' otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) ) otherlv_4= '}' ) )
            // InternalMySelenium.g:207:2: (otherlv_0= 'def' otherlv_1= 'main' otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) ) otherlv_4= '}' )
            {
            // InternalMySelenium.g:207:2: (otherlv_0= 'def' otherlv_1= 'main' otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) ) otherlv_4= '}' )
            // InternalMySelenium.g:208:3: otherlv_0= 'def' otherlv_1= 'main' otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFunctionAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMainFunctionAccess().getMainKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFunctionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMySelenium.g:220:3: ( (lv_statements_3_0= ruleStatements ) )
            // InternalMySelenium.g:221:4: (lv_statements_3_0= ruleStatements )
            {
            // InternalMySelenium.g:221:4: (lv_statements_3_0= ruleStatements )
            // InternalMySelenium.g:222:5: lv_statements_3_0= ruleStatements
            {

            					newCompositeNode(grammarAccess.getMainFunctionAccess().getStatementsStatementsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_statements_3_0=ruleStatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainFunctionRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_3_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMainFunctionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMainFunction"


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:247:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMySelenium.g:247:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMySelenium.g:248:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMySelenium.g:254:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )? otherlv_3= '{' ( (lv_statements_4_0= ruleStatements ) ) otherlv_5= '}' ) ;
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
            // InternalMySelenium.g:260:2: ( (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )? otherlv_3= '{' ( (lv_statements_4_0= ruleStatements ) ) otherlv_5= '}' ) )
            // InternalMySelenium.g:261:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )? otherlv_3= '{' ( (lv_statements_4_0= ruleStatements ) ) otherlv_5= '}' )
            {
            // InternalMySelenium.g:261:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )? otherlv_3= '{' ( (lv_statements_4_0= ruleStatements ) ) otherlv_5= '}' )
            // InternalMySelenium.g:262:3: otherlv_0= 'def' ( (lv_name_1_0= ruleFunctionName ) ) ( (lv_params_2_0= ruleFunctionParameters ) )? otherlv_3= '{' ( (lv_statements_4_0= ruleStatements ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
            		
            // InternalMySelenium.g:266:3: ( (lv_name_1_0= ruleFunctionName ) )
            // InternalMySelenium.g:267:4: (lv_name_1_0= ruleFunctionName )
            {
            // InternalMySelenium.g:267:4: (lv_name_1_0= ruleFunctionName )
            // InternalMySelenium.g:268:5: lv_name_1_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMySelenium.g:285:3: ( (lv_params_2_0= ruleFunctionParameters ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMySelenium.g:286:4: (lv_params_2_0= ruleFunctionParameters )
                    {
                    // InternalMySelenium.g:286:4: (lv_params_2_0= ruleFunctionParameters )
                    // InternalMySelenium.g:287:5: lv_params_2_0= ruleFunctionParameters
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

            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMySelenium.g:308:3: ( (lv_statements_4_0= ruleStatements ) )
            // InternalMySelenium.g:309:4: (lv_statements_4_0= ruleStatements )
            {
            // InternalMySelenium.g:309:4: (lv_statements_4_0= ruleStatements )
            // InternalMySelenium.g:310:5: lv_statements_4_0= ruleStatements
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getStatementsStatementsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_statements_4_0=ruleStatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_4_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMySelenium.g:335:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMySelenium.g:335:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMySelenium.g:336:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMySelenium.g:342:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:348:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:349:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:349:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:350:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:350:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:351:4: lv_name_0_0= RULE_ID
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
    // InternalMySelenium.g:370:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMySelenium.g:370:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMySelenium.g:371:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalMySelenium.g:377:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_params_1_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:383:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) ) )
            // InternalMySelenium.g:384:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            {
            // InternalMySelenium.g:384:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) ) )
            // InternalMySelenium.g:385:3: ( (otherlv_0= RULE_ID ) ) ( (lv_params_1_0= ruleFunctionCallParameters ) )
            {
            // InternalMySelenium.g:385:3: ( (otherlv_0= RULE_ID ) )
            // InternalMySelenium.g:386:4: (otherlv_0= RULE_ID )
            {
            // InternalMySelenium.g:386:4: (otherlv_0= RULE_ID )
            // InternalMySelenium.g:387:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0());
            				

            }


            }

            // InternalMySelenium.g:398:3: ( (lv_params_1_0= ruleFunctionCallParameters ) )
            // InternalMySelenium.g:399:4: (lv_params_1_0= ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:399:4: (lv_params_1_0= ruleFunctionCallParameters )
            // InternalMySelenium.g:400:5: lv_params_1_0= ruleFunctionCallParameters
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
    // InternalMySelenium.g:421:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMySelenium.g:421:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMySelenium.g:422:2: iv_ruleProjection= ruleProjection EOF
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
    // InternalMySelenium.g:428:1: ruleProjection returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selector_0_0 = null;

        AntlrDatatypeRuleToken lv_projectionAction_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:434:2: ( ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) ) )
            // InternalMySelenium.g:435:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            {
            // InternalMySelenium.g:435:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) ) )
            // InternalMySelenium.g:436:3: ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '.' ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            {
            // InternalMySelenium.g:436:3: ( (lv_selector_0_0= ruleSelector ) )
            // InternalMySelenium.g:437:4: (lv_selector_0_0= ruleSelector )
            {
            // InternalMySelenium.g:437:4: (lv_selector_0_0= ruleSelector )
            // InternalMySelenium.g:438:5: lv_selector_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getFullStopKeyword_1());
            		
            // InternalMySelenium.g:459:3: ( (lv_projectionAction_2_0= ruleProjectionAction ) )
            // InternalMySelenium.g:460:4: (lv_projectionAction_2_0= ruleProjectionAction )
            {
            // InternalMySelenium.g:460:4: (lv_projectionAction_2_0= ruleProjectionAction )
            // InternalMySelenium.g:461:5: lv_projectionAction_2_0= ruleProjectionAction
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
    // InternalMySelenium.g:482:1: entryRuleProjectionAction returns [String current=null] : iv_ruleProjectionAction= ruleProjectionAction EOF ;
    public final String entryRuleProjectionAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectionAction = null;


        try {
            // InternalMySelenium.g:482:56: (iv_ruleProjectionAction= ruleProjectionAction EOF )
            // InternalMySelenium.g:483:2: iv_ruleProjectionAction= ruleProjectionAction EOF
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
    // InternalMySelenium.g:489:1: ruleProjectionAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'value' | kw= 'text' | kw= 'html' ) ;
    public final AntlrDatatypeRuleToken ruleProjectionAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:495:2: ( (kw= 'value' | kw= 'text' | kw= 'html' ) )
            // InternalMySelenium.g:496:2: (kw= 'value' | kw= 'text' | kw= 'html' )
            {
            // InternalMySelenium.g:496:2: (kw= 'value' | kw= 'text' | kw= 'html' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
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
                    // InternalMySelenium.g:497:3: kw= 'value'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getValueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:503:3: kw= 'text'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProjectionActionAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:509:3: kw= 'html'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMySelenium.g:518:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMySelenium.g:518:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMySelenium.g:519:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMySelenium.g:525:1: ruleStatement returns [EObject current=null] : (this_Action_0= ruleAction | this_AssignAction_1= ruleAssignAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;

        EObject this_AssignAction_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_AssertEquals_3 = null;

        EObject this_AssertContains_4 = null;

        EObject this_NavigationAction_5 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:531:2: ( (this_Action_0= ruleAction | this_AssignAction_1= ruleAssignAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction ) )
            // InternalMySelenium.g:532:2: (this_Action_0= ruleAction | this_AssignAction_1= ruleAssignAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction )
            {
            // InternalMySelenium.g:532:2: (this_Action_0= ruleAction | this_AssignAction_1= ruleAssignAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMySelenium.g:533:3: this_Action_0= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_0=ruleAction();

                    state._fsp--;


                    			current = this_Action_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:542:3: this_AssignAction_1= ruleAssignAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignAction_1=ruleAssignAction();

                    state._fsp--;


                    			current = this_AssignAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:551:3: this_FunctionCall_2= ruleFunctionCall
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
                    // InternalMySelenium.g:560:3: this_AssertEquals_3= ruleAssertEquals
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
                    // InternalMySelenium.g:569:3: this_AssertContains_4= ruleAssertContains
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
                    // InternalMySelenium.g:578:3: this_NavigationAction_5= ruleNavigationAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationAction_5=ruleNavigationAction();

                    state._fsp--;


                    			current = this_NavigationAction_5;
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
    // InternalMySelenium.g:590:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalMySelenium.g:590:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalMySelenium.g:591:2: iv_ruleAssertEquals= ruleAssertEquals EOF
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
    // InternalMySelenium.g:597:1: ruleAssertEquals returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_assertableElement_1_0 = null;

        EObject lv_assertableElement_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:603:2: ( (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:604:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:604:2: (otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:605:3: otherlv_0= 'assert' ( (lv_assertableElement_1_0= ruleAssertableElement ) ) otherlv_2= '=' ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertEqualsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:609:3: ( (lv_assertableElement_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:610:4: (lv_assertableElement_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:610:4: (lv_assertableElement_1_0= ruleAssertableElement )
            // InternalMySelenium.g:611:5: lv_assertableElement_1_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2());
            		
            // InternalMySelenium.g:632:3: ( (lv_assertableElement_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:633:4: (lv_assertableElement_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:633:4: (lv_assertableElement_3_0= ruleAssertableElement )
            // InternalMySelenium.g:634:5: lv_assertableElement_3_0= ruleAssertableElement
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
    // InternalMySelenium.g:655:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalMySelenium.g:655:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalMySelenium.g:656:2: iv_ruleAssertContains= ruleAssertContains EOF
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
    // InternalMySelenium.g:662:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_container_1_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:668:2: ( (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) ) )
            // InternalMySelenium.g:669:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) )
            {
            // InternalMySelenium.g:669:2: (otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) ) )
            // InternalMySelenium.g:670:3: otherlv_0= 'assert' ( (lv_container_1_0= ruleAssertableElement ) ) otherlv_2= 'contains' ( (lv_element_3_0= ruleAssertableElement ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getAssertKeyword_0());
            		
            // InternalMySelenium.g:674:3: ( (lv_container_1_0= ruleAssertableElement ) )
            // InternalMySelenium.g:675:4: (lv_container_1_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:675:4: (lv_container_1_0= ruleAssertableElement )
            // InternalMySelenium.g:676:5: lv_container_1_0= ruleAssertableElement
            {

            					newCompositeNode(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertContainsAccess().getContainsKeyword_2());
            		
            // InternalMySelenium.g:697:3: ( (lv_element_3_0= ruleAssertableElement ) )
            // InternalMySelenium.g:698:4: (lv_element_3_0= ruleAssertableElement )
            {
            // InternalMySelenium.g:698:4: (lv_element_3_0= ruleAssertableElement )
            // InternalMySelenium.g:699:5: lv_element_3_0= ruleAssertableElement
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
    // InternalMySelenium.g:720:1: entryRuleAssertableElement returns [EObject current=null] : iv_ruleAssertableElement= ruleAssertableElement EOF ;
    public final EObject entryRuleAssertableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertableElement = null;


        try {
            // InternalMySelenium.g:720:58: (iv_ruleAssertableElement= ruleAssertableElement EOF )
            // InternalMySelenium.g:721:2: iv_ruleAssertableElement= ruleAssertableElement EOF
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
    // InternalMySelenium.g:727:1: ruleAssertableElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_StringParameter_1= ruleStringParameter | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) ;
    public final EObject ruleAssertableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_StringParameter_1 = null;

        EObject this_Projection_2 = null;

        EObject this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:733:2: ( (this_Variable_0= ruleVariable | this_StringParameter_1= ruleStringParameter | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall ) )
            // InternalMySelenium.g:734:2: (this_Variable_0= ruleVariable | this_StringParameter_1= ruleStringParameter | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalMySelenium.g:734:2: (this_Variable_0= ruleVariable | this_StringParameter_1= ruleStringParameter | this_Projection_2= ruleProjection | this_FunctionCall_3= ruleFunctionCall )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==14||(LA7_1>=19 && LA7_1<=24)||(LA7_1>=48 && LA7_1<=51)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==28) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:735:3: this_Variable_0= ruleVariable
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
                    // InternalMySelenium.g:744:3: this_StringParameter_1= ruleStringParameter
                    {

                    			newCompositeNode(grammarAccess.getAssertableElementAccess().getStringParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringParameter_1=ruleStringParameter();

                    state._fsp--;


                    			current = this_StringParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:753:3: this_Projection_2= ruleProjection
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
                    // InternalMySelenium.g:762:3: this_FunctionCall_3= ruleFunctionCall
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
    // InternalMySelenium.g:774:1: entryRuleNavigationAction returns [EObject current=null] : iv_ruleNavigationAction= ruleNavigationAction EOF ;
    public final EObject entryRuleNavigationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationAction = null;


        try {
            // InternalMySelenium.g:774:57: (iv_ruleNavigationAction= ruleNavigationAction EOF )
            // InternalMySelenium.g:775:2: iv_ruleNavigationAction= ruleNavigationAction EOF
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
    // InternalMySelenium.g:781:1: ruleNavigationAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigationAction() throws RecognitionException {
        EObject current = null;

        Token lv_param_1_0=null;
        AntlrDatatypeRuleToken lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:787:2: ( ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) ) )
            // InternalMySelenium.g:788:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            {
            // InternalMySelenium.g:788:2: ( ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) ) )
            // InternalMySelenium.g:789:3: ( (lv_action_0_0= ruleNavigationActionType ) ) ( (lv_param_1_0= RULE_STRING ) )
            {
            // InternalMySelenium.g:789:3: ( (lv_action_0_0= ruleNavigationActionType ) )
            // InternalMySelenium.g:790:4: (lv_action_0_0= ruleNavigationActionType )
            {
            // InternalMySelenium.g:790:4: (lv_action_0_0= ruleNavigationActionType )
            // InternalMySelenium.g:791:5: lv_action_0_0= ruleNavigationActionType
            {

            					newCompositeNode(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalMySelenium.g:808:3: ( (lv_param_1_0= RULE_STRING ) )
            // InternalMySelenium.g:809:4: (lv_param_1_0= RULE_STRING )
            {
            // InternalMySelenium.g:809:4: (lv_param_1_0= RULE_STRING )
            // InternalMySelenium.g:810:5: lv_param_1_0= RULE_STRING
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
    // InternalMySelenium.g:830:1: entryRuleNavigationActionType returns [String current=null] : iv_ruleNavigationActionType= ruleNavigationActionType EOF ;
    public final String entryRuleNavigationActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationActionType = null;


        try {
            // InternalMySelenium.g:830:60: (iv_ruleNavigationActionType= ruleNavigationActionType EOF )
            // InternalMySelenium.g:831:2: iv_ruleNavigationActionType= ruleNavigationActionType EOF
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
    // InternalMySelenium.g:837:1: ruleNavigationActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' | kw= 'openBrowser' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:843:2: ( (kw= 'go' | kw= 'openBrowser' ) )
            // InternalMySelenium.g:844:2: (kw= 'go' | kw= 'openBrowser' )
            {
            // InternalMySelenium.g:844:2: (kw= 'go' | kw= 'openBrowser' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMySelenium.g:845:3: kw= 'go'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:851:3: kw= 'openBrowser'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAction"
    // InternalMySelenium.g:860:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMySelenium.g:860:47: (iv_ruleAction= ruleAction EOF )
            // InternalMySelenium.g:861:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMySelenium.g:867:1: ruleAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleActionType ) ) ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_param_2_0= ruleActionParameter ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_action_0_0 = null;

        EObject lv_target_1_0 = null;

        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:873:2: ( ( ( (lv_action_0_0= ruleActionType ) ) ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_param_2_0= ruleActionParameter ) )? ) )
            // InternalMySelenium.g:874:2: ( ( (lv_action_0_0= ruleActionType ) ) ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_param_2_0= ruleActionParameter ) )? )
            {
            // InternalMySelenium.g:874:2: ( ( (lv_action_0_0= ruleActionType ) ) ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_param_2_0= ruleActionParameter ) )? )
            // InternalMySelenium.g:875:3: ( (lv_action_0_0= ruleActionType ) ) ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_param_2_0= ruleActionParameter ) )?
            {
            // InternalMySelenium.g:875:3: ( (lv_action_0_0= ruleActionType ) )
            // InternalMySelenium.g:876:4: (lv_action_0_0= ruleActionType )
            {
            // InternalMySelenium.g:876:4: (lv_action_0_0= ruleActionType )
            // InternalMySelenium.g:877:5: lv_action_0_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionActionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_action_0_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.ActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:894:3: ( (lv_target_1_0= ruleActionTarget ) )
            // InternalMySelenium.g:895:4: (lv_target_1_0= ruleActionTarget )
            {
            // InternalMySelenium.g:895:4: (lv_target_1_0= ruleActionTarget )
            // InternalMySelenium.g:896:5: lv_target_1_0= ruleActionTarget
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTargetActionTargetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_target_1_0=ruleActionTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.ActionTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:913:3: ( (lv_param_2_0= ruleActionParameter ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||(LA9_0>=38 && LA9_0<=47)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==14||LA9_2==19||(LA9_2>=22 && LA9_2<=24)||(LA9_2>=48 && LA9_2<=51)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMySelenium.g:914:4: (lv_param_2_0= ruleActionParameter )
                    {
                    // InternalMySelenium.g:914:4: (lv_param_2_0= ruleActionParameter )
                    // InternalMySelenium.g:915:5: lv_param_2_0= ruleActionParameter
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getParamActionParameterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_param_2_0=ruleActionParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"param",
                    						lv_param_2_0,
                    						"fr.imta.clementdamien.dsl.selenium.MySelenium.ActionParameter");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAssignAction"
    // InternalMySelenium.g:936:1: entryRuleAssignAction returns [EObject current=null] : iv_ruleAssignAction= ruleAssignAction EOF ;
    public final EObject entryRuleAssignAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignAction = null;


        try {
            // InternalMySelenium.g:936:53: (iv_ruleAssignAction= ruleAssignAction EOF )
            // InternalMySelenium.g:937:2: iv_ruleAssignAction= ruleAssignAction EOF
            {
             newCompositeNode(grammarAccess.getAssignActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignAction=ruleAssignAction();

            state._fsp--;

             current =iv_ruleAssignAction; 
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
    // $ANTLR end "entryRuleAssignAction"


    // $ANTLR start "ruleAssignAction"
    // InternalMySelenium.g:943:1: ruleAssignAction returns [EObject current=null] : (otherlv_0= 'assign' ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_variable_2_0= ruleVariable ) ) ) ;
    public final EObject ruleAssignAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_target_1_0 = null;

        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:949:2: ( (otherlv_0= 'assign' ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_variable_2_0= ruleVariable ) ) ) )
            // InternalMySelenium.g:950:2: (otherlv_0= 'assign' ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_variable_2_0= ruleVariable ) ) )
            {
            // InternalMySelenium.g:950:2: (otherlv_0= 'assign' ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_variable_2_0= ruleVariable ) ) )
            // InternalMySelenium.g:951:3: otherlv_0= 'assign' ( (lv_target_1_0= ruleActionTarget ) ) ( (lv_variable_2_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignActionAccess().getAssignKeyword_0());
            		
            // InternalMySelenium.g:955:3: ( (lv_target_1_0= ruleActionTarget ) )
            // InternalMySelenium.g:956:4: (lv_target_1_0= ruleActionTarget )
            {
            // InternalMySelenium.g:956:4: (lv_target_1_0= ruleActionTarget )
            // InternalMySelenium.g:957:5: lv_target_1_0= ruleActionTarget
            {

            					newCompositeNode(grammarAccess.getAssignActionAccess().getTargetActionTargetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_target_1_0=ruleActionTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignActionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.ActionTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMySelenium.g:974:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalMySelenium.g:975:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalMySelenium.g:975:4: (lv_variable_2_0= ruleVariable )
            // InternalMySelenium.g:976:5: lv_variable_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getAssignActionAccess().getVariableVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignActionRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.Variable");
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
    // $ANTLR end "ruleAssignAction"


    // $ANTLR start "entryRuleActionTarget"
    // InternalMySelenium.g:997:1: entryRuleActionTarget returns [EObject current=null] : iv_ruleActionTarget= ruleActionTarget EOF ;
    public final EObject entryRuleActionTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionTarget = null;


        try {
            // InternalMySelenium.g:997:53: (iv_ruleActionTarget= ruleActionTarget EOF )
            // InternalMySelenium.g:998:2: iv_ruleActionTarget= ruleActionTarget EOF
            {
             newCompositeNode(grammarAccess.getActionTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionTarget=ruleActionTarget();

            state._fsp--;

             current =iv_ruleActionTarget; 
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
    // $ANTLR end "entryRuleActionTarget"


    // $ANTLR start "ruleActionTarget"
    // InternalMySelenium.g:1004:1: ruleActionTarget returns [EObject current=null] : (this_Selector_0= ruleSelector | this_VariableRef_1= ruleVariableRef | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleActionTarget() throws RecognitionException {
        EObject current = null;

        EObject this_Selector_0 = null;

        EObject this_VariableRef_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1010:2: ( (this_Selector_0= ruleSelector | this_VariableRef_1= ruleVariableRef | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalMySelenium.g:1011:2: (this_Selector_0= ruleSelector | this_VariableRef_1= ruleVariableRef | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalMySelenium.g:1011:2: (this_Selector_0= ruleSelector | this_VariableRef_1= ruleVariableRef | this_FunctionCall_2= ruleFunctionCall )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=38 && LA10_0<=47)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==28) ) {
                    alt10=3;
                }
                else if ( (LA10_2==EOF||(LA10_2>=RULE_ID && LA10_2<=RULE_STRING)||LA10_2==14||LA10_2==19||(LA10_2>=22 && LA10_2<=24)||(LA10_2>=38 && LA10_2<=51)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:1012:3: this_Selector_0= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getActionTargetAccess().getSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_0=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1021:3: this_VariableRef_1= ruleVariableRef
                    {

                    			newCompositeNode(grammarAccess.getActionTargetAccess().getVariableRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableRef_1=ruleVariableRef();

                    state._fsp--;


                    			current = this_VariableRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1030:3: this_FunctionCall_2= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getActionTargetAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_2;
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
    // $ANTLR end "ruleActionTarget"


    // $ANTLR start "entryRuleActionParameter"
    // InternalMySelenium.g:1042:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalMySelenium.g:1042:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalMySelenium.g:1043:2: iv_ruleActionParameter= ruleActionParameter EOF
            {
             newCompositeNode(grammarAccess.getActionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParameter=ruleActionParameter();

            state._fsp--;

             current =iv_ruleActionParameter; 
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
    // $ANTLR end "entryRuleActionParameter"


    // $ANTLR start "ruleActionParameter"
    // InternalMySelenium.g:1049:1: ruleActionParameter returns [EObject current=null] : (this_Selector_0= ruleSelector | this_ActionParameterString_1= ruleActionParameterString | this_VariableRef_2= ruleVariableRef ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Selector_0 = null;

        EObject this_ActionParameterString_1 = null;

        EObject this_VariableRef_2 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1055:2: ( (this_Selector_0= ruleSelector | this_ActionParameterString_1= ruleActionParameterString | this_VariableRef_2= ruleVariableRef ) )
            // InternalMySelenium.g:1056:2: (this_Selector_0= ruleSelector | this_ActionParameterString_1= ruleActionParameterString | this_VariableRef_2= ruleVariableRef )
            {
            // InternalMySelenium.g:1056:2: (this_Selector_0= ruleSelector | this_ActionParameterString_1= ruleActionParameterString | this_VariableRef_2= ruleVariableRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMySelenium.g:1057:3: this_Selector_0= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getActionParameterAccess().getSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_0=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1066:3: this_ActionParameterString_1= ruleActionParameterString
                    {

                    			newCompositeNode(grammarAccess.getActionParameterAccess().getActionParameterStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionParameterString_1=ruleActionParameterString();

                    state._fsp--;


                    			current = this_ActionParameterString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1075:3: this_VariableRef_2= ruleVariableRef
                    {

                    			newCompositeNode(grammarAccess.getActionParameterAccess().getVariableRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableRef_2=ruleVariableRef();

                    state._fsp--;


                    			current = this_VariableRef_2;
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
    // $ANTLR end "ruleActionParameter"


    // $ANTLR start "entryRuleActionParameterString"
    // InternalMySelenium.g:1087:1: entryRuleActionParameterString returns [EObject current=null] : iv_ruleActionParameterString= ruleActionParameterString EOF ;
    public final EObject entryRuleActionParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameterString = null;


        try {
            // InternalMySelenium.g:1087:62: (iv_ruleActionParameterString= ruleActionParameterString EOF )
            // InternalMySelenium.g:1088:2: iv_ruleActionParameterString= ruleActionParameterString EOF
            {
             newCompositeNode(grammarAccess.getActionParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParameterString=ruleActionParameterString();

            state._fsp--;

             current =iv_ruleActionParameterString; 
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
    // $ANTLR end "entryRuleActionParameterString"


    // $ANTLR start "ruleActionParameterString"
    // InternalMySelenium.g:1094:1: ruleActionParameterString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleActionParameterString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1100:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMySelenium.g:1101:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMySelenium.g:1101:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMySelenium.g:1102:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMySelenium.g:1102:3: (lv_value_0_0= RULE_STRING )
            // InternalMySelenium.g:1103:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getActionParameterStringAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionParameterStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleActionParameterString"


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:1122:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalMySelenium.g:1122:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalMySelenium.g:1123:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalMySelenium.g:1129:1: ruleSelector returns [EObject current=null] : ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )? ( (lv_all_8_0= '.all' ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_all_8_0=null;
        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_attrs_2_0 = null;

        EObject lv_parent_6_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1135:2: ( ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )? ( (lv_all_8_0= '.all' ) )? ) )
            // InternalMySelenium.g:1136:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )? ( (lv_all_8_0= '.all' ) )? )
            {
            // InternalMySelenium.g:1136:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )? ( (lv_all_8_0= '.all' ) )? )
            // InternalMySelenium.g:1137:3: ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )? ( (lv_all_8_0= '.all' ) )?
            {
            // InternalMySelenium.g:1137:3: ( (lv_element_0_0= ruleDOMElement ) )
            // InternalMySelenium.g:1138:4: (lv_element_0_0= ruleDOMElement )
            {
            // InternalMySelenium.g:1138:4: (lv_element_0_0= ruleDOMElement )
            // InternalMySelenium.g:1139:5: lv_element_0_0= ruleDOMElement
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getElementDOMElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMySelenium.g:1160:3: ( (lv_attrs_2_0= ruleAttributes ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17||(LA12_0>=32 && LA12_0<=37)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMySelenium.g:1161:4: (lv_attrs_2_0= ruleAttributes )
                    {
                    // InternalMySelenium.g:1161:4: (lv_attrs_2_0= ruleAttributes )
                    // InternalMySelenium.g:1162:5: lv_attrs_2_0= ruleAttributes
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getAttrsAttributesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3());
            		
            // InternalMySelenium.g:1183:3: (otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMySelenium.g:1184:4: otherlv_4= '.parent' otherlv_5= '(' ( (lv_parent_6_0= ruleParent ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getParentKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMySelenium.g:1192:4: ( (lv_parent_6_0= ruleParent ) )
                    // InternalMySelenium.g:1193:5: (lv_parent_6_0= ruleParent )
                    {
                    // InternalMySelenium.g:1193:5: (lv_parent_6_0= ruleParent )
                    // InternalMySelenium.g:1194:6: lv_parent_6_0= ruleParent
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getParentParentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_parent_6_0=ruleParent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"parent",
                    							lv_parent_6_0,
                    							"fr.imta.clementdamien.dsl.selenium.MySelenium.Parent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelectorAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMySelenium.g:1216:3: ( (lv_all_8_0= '.all' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMySelenium.g:1217:4: (lv_all_8_0= '.all' )
                    {
                    // InternalMySelenium.g:1217:4: (lv_all_8_0= '.all' )
                    // InternalMySelenium.g:1218:5: lv_all_8_0= '.all'
                    {
                    lv_all_8_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_all_8_0, grammarAccess.getSelectorAccess().getAllAllKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorRule());
                    					}
                    					setWithLastConsumed(current, "all", true, ".all");
                    				

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleParent"
    // InternalMySelenium.g:1234:1: entryRuleParent returns [EObject current=null] : iv_ruleParent= ruleParent EOF ;
    public final EObject entryRuleParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParent = null;


        try {
            // InternalMySelenium.g:1234:47: (iv_ruleParent= ruleParent EOF )
            // InternalMySelenium.g:1235:2: iv_ruleParent= ruleParent EOF
            {
             newCompositeNode(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParent=ruleParent();

            state._fsp--;

             current =iv_ruleParent; 
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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalMySelenium.g:1241:1: ruleParent returns [EObject current=null] : ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' ) ;
    public final EObject ruleParent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1247:2: ( ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' ) )
            // InternalMySelenium.g:1248:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' )
            {
            // InternalMySelenium.g:1248:2: ( ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']' )
            // InternalMySelenium.g:1249:3: ( (lv_element_0_0= ruleDOMElement ) ) otherlv_1= '[' ( (lv_attrs_2_0= ruleAttributes ) )? otherlv_3= ']'
            {
            // InternalMySelenium.g:1249:3: ( (lv_element_0_0= ruleDOMElement ) )
            // InternalMySelenium.g:1250:4: (lv_element_0_0= ruleDOMElement )
            {
            // InternalMySelenium.g:1250:4: (lv_element_0_0= ruleDOMElement )
            // InternalMySelenium.g:1251:5: lv_element_0_0= ruleDOMElement
            {

            					newCompositeNode(grammarAccess.getParentAccess().getElementDOMElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_element_0_0=ruleDOMElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"fr.imta.clementdamien.dsl.selenium.MySelenium.DOMElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMySelenium.g:1272:3: ( (lv_attrs_2_0= ruleAttributes ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17||(LA15_0>=32 && LA15_0<=37)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1273:4: (lv_attrs_2_0= ruleAttributes )
                    {
                    // InternalMySelenium.g:1273:4: (lv_attrs_2_0= ruleAttributes )
                    // InternalMySelenium.g:1274:5: lv_attrs_2_0= ruleAttributes
                    {

                    					newCompositeNode(grammarAccess.getParentAccess().getAttrsAttributesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_attrs_2_0=ruleAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParentRule());
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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParentAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleAttributes"
    // InternalMySelenium.g:1299:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalMySelenium.g:1299:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalMySelenium.g:1300:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalMySelenium.g:1306:1: ruleAttributes returns [EObject current=null] : ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attrs_0_0 = null;

        EObject lv_attrs_2_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1312:2: ( ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* ) )
            // InternalMySelenium.g:1313:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            {
            // InternalMySelenium.g:1313:2: ( ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )* )
            // InternalMySelenium.g:1314:3: ( (lv_attrs_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            {
            // InternalMySelenium.g:1314:3: ( (lv_attrs_0_0= ruleAttribute ) )
            // InternalMySelenium.g:1315:4: (lv_attrs_0_0= ruleAttribute )
            {
            // InternalMySelenium.g:1315:4: (lv_attrs_0_0= ruleAttribute )
            // InternalMySelenium.g:1316:5: lv_attrs_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalMySelenium.g:1333:3: (otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMySelenium.g:1334:4: otherlv_1= ',' ( (lv_attrs_2_0= ruleAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_28); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMySelenium.g:1338:4: ( (lv_attrs_2_0= ruleAttribute ) )
            	    // InternalMySelenium.g:1339:5: (lv_attrs_2_0= ruleAttribute )
            	    {
            	    // InternalMySelenium.g:1339:5: (lv_attrs_2_0= ruleAttribute )
            	    // InternalMySelenium.g:1340:6: lv_attrs_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop16;
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
    // InternalMySelenium.g:1362:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMySelenium.g:1362:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMySelenium.g:1363:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMySelenium.g:1369:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1375:2: ( ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) ) ) )
            // InternalMySelenium.g:1376:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) ) )
            {
            // InternalMySelenium.g:1376:2: ( ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) ) )
            // InternalMySelenium.g:1377:3: ( (lv_name_0_0= ruleDOMAttribute ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) )
            {
            // InternalMySelenium.g:1377:3: ( (lv_name_0_0= ruleDOMAttribute ) )
            // InternalMySelenium.g:1378:4: (lv_name_0_0= ruleDOMAttribute )
            {
            // InternalMySelenium.g:1378:4: (lv_name_0_0= ruleDOMAttribute )
            // InternalMySelenium.g:1379:5: lv_name_0_0= ruleDOMAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameDOMAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalMySelenium.g:1400:3: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_variable_3_0= ruleVariableRef ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:1401:4: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalMySelenium.g:1401:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalMySelenium.g:1402:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMySelenium.g:1402:5: (lv_value_2_0= RULE_STRING )
                    // InternalMySelenium.g:1403:6: lv_value_2_0= RULE_STRING
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
                    // InternalMySelenium.g:1420:4: ( (lv_variable_3_0= ruleVariableRef ) )
                    {
                    // InternalMySelenium.g:1420:4: ( (lv_variable_3_0= ruleVariableRef ) )
                    // InternalMySelenium.g:1421:5: (lv_variable_3_0= ruleVariableRef )
                    {
                    // InternalMySelenium.g:1421:5: (lv_variable_3_0= ruleVariableRef )
                    // InternalMySelenium.g:1422:6: lv_variable_3_0= ruleVariableRef
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getVariableVariableRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariableRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"fr.imta.clementdamien.dsl.selenium.MySelenium.VariableRef");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDOMAttribute"
    // InternalMySelenium.g:1444:1: entryRuleDOMAttribute returns [String current=null] : iv_ruleDOMAttribute= ruleDOMAttribute EOF ;
    public final String entryRuleDOMAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAttribute = null;


        try {
            // InternalMySelenium.g:1444:52: (iv_ruleDOMAttribute= ruleDOMAttribute EOF )
            // InternalMySelenium.g:1445:2: iv_ruleDOMAttribute= ruleDOMAttribute EOF
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
    // InternalMySelenium.g:1451:1: ruleDOMAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'id' | kw= 'type' ) ;
    public final AntlrDatatypeRuleToken ruleDOMAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1457:2: ( (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'id' | kw= 'type' ) )
            // InternalMySelenium.g:1458:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'id' | kw= 'type' )
            {
            // InternalMySelenium.g:1458:2: (kw= 'name' | kw= 'text' | kw= 'alt' | kw= 'checked' | kw= 'class' | kw= 'id' | kw= 'type' )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 17:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            case 35:
                {
                alt18=5;
                }
                break;
            case 36:
                {
                alt18=6;
                }
                break;
            case 37:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMySelenium.g:1459:3: kw= 'name'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getNameKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1465:3: kw= 'text'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1471:3: kw= 'alt'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getAltKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1477:3: kw= 'checked'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1483:3: kw= 'class'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getClassKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1489:3: kw= 'id'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getIdKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1495:3: kw= 'type'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMAttributeAccess().getTypeKeyword_6());
                    		

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
    // InternalMySelenium.g:1504:1: entryRuleDOMElement returns [String current=null] : iv_ruleDOMElement= ruleDOMElement EOF ;
    public final String entryRuleDOMElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMElement = null;


        try {
            // InternalMySelenium.g:1504:50: (iv_ruleDOMElement= ruleDOMElement EOF )
            // InternalMySelenium.g:1505:2: iv_ruleDOMElement= ruleDOMElement EOF
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
    // InternalMySelenium.g:1511:1: ruleDOMElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' | kw= 'div' ) ;
    public final AntlrDatatypeRuleToken ruleDOMElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1517:2: ( (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' | kw= 'div' ) )
            // InternalMySelenium.g:1518:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' | kw= 'div' )
            {
            // InternalMySelenium.g:1518:2: (kw= 'link' | kw= 'button' | kw= 'checkbox' | kw= 'input' | kw= 'h1' | kw= 'body' | kw= 'select' | kw= 'a' | kw= 'img' | kw= 'div' )
            int alt19=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 43:
                {
                alt19=6;
                }
                break;
            case 44:
                {
                alt19=7;
                }
                break;
            case 45:
                {
                alt19=8;
                }
                break;
            case 46:
                {
                alt19=9;
                }
                break;
            case 47:
                {
                alt19=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMySelenium.g:1519:3: kw= 'link'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1525:3: kw= 'button'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1531:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getCheckboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1537:3: kw= 'input'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getInputKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1543:3: kw= 'h1'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getH1Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1549:3: kw= 'body'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getBodyKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1555:3: kw= 'select'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getSelectKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:1561:3: kw= 'a'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getAKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1567:3: kw= 'img'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getImgKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMySelenium.g:1573:3: kw= 'div'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMElementAccess().getDivKeyword_9());
                    		

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


    // $ANTLR start "entryRuleActionType"
    // InternalMySelenium.g:1582:1: entryRuleActionType returns [String current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final String entryRuleActionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionType = null;


        try {
            // InternalMySelenium.g:1582:50: (iv_ruleActionType= ruleActionType EOF )
            // InternalMySelenium.g:1583:2: iv_ruleActionType= ruleActionType EOF
            {
             newCompositeNode(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionType=ruleActionType();

            state._fsp--;

             current =iv_ruleActionType.getText(); 
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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalMySelenium.g:1589:1: ruleActionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'click' | kw= 'fill' | kw= 'choose' | kw= 'count' ) ;
    public final AntlrDatatypeRuleToken ruleActionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1595:2: ( (kw= 'click' | kw= 'fill' | kw= 'choose' | kw= 'count' ) )
            // InternalMySelenium.g:1596:2: (kw= 'click' | kw= 'fill' | kw= 'choose' | kw= 'count' )
            {
            // InternalMySelenium.g:1596:2: (kw= 'click' | kw= 'fill' | kw= 'choose' | kw= 'count' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt20=1;
                }
                break;
            case 49:
                {
                alt20=2;
                }
                break;
            case 50:
                {
                alt20=3;
                }
                break;
            case 51:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMySelenium.g:1597:3: kw= 'click'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionTypeAccess().getClickKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1603:3: kw= 'fill'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionTypeAccess().getFillKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1609:3: kw= 'choose'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionTypeAccess().getChooseKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1615:3: kw= 'count'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionTypeAccess().getCountKeyword_3());
                    		

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleFunctionParameters"
    // InternalMySelenium.g:1624:1: entryRuleFunctionParameters returns [EObject current=null] : iv_ruleFunctionParameters= ruleFunctionParameters EOF ;
    public final EObject entryRuleFunctionParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameters = null;


        try {
            // InternalMySelenium.g:1624:59: (iv_ruleFunctionParameters= ruleFunctionParameters EOF )
            // InternalMySelenium.g:1625:2: iv_ruleFunctionParameters= ruleFunctionParameters EOF
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
    // InternalMySelenium.g:1631:1: ruleFunctionParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFunctionParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1637:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' ) )
            // InternalMySelenium.g:1638:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            {
            // InternalMySelenium.g:1638:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')' )
            // InternalMySelenium.g:1639:3: otherlv_0= '(' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1643:3: ( (lv_variables_1_0= ruleVariable ) )
            // InternalMySelenium.g:1644:4: (lv_variables_1_0= ruleVariable )
            {
            // InternalMySelenium.g:1644:4: (lv_variables_1_0= ruleVariable )
            // InternalMySelenium.g:1645:5: lv_variables_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalMySelenium.g:1662:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:1663:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMySelenium.g:1667:4: ( (lv_variables_3_0= ruleVariable ) )
            	    // InternalMySelenium.g:1668:5: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalMySelenium.g:1668:5: (lv_variables_3_0= ruleVariable )
            	    // InternalMySelenium.g:1669:6: lv_variables_3_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMySelenium.g:1695:1: entryRuleFunctionCallParameters returns [EObject current=null] : iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF ;
    public final EObject entryRuleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallParameters = null;


        try {
            // InternalMySelenium.g:1695:63: (iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:1696:2: iv_ruleFunctionCallParameters= ruleFunctionCallParameters EOF
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
    // InternalMySelenium.g:1702:1: ruleFunctionCallParameters returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleFunctionCallParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1708:2: ( (otherlv_0= '(' ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )? otherlv_4= ')' ) )
            // InternalMySelenium.g:1709:2: (otherlv_0= '(' ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )? otherlv_4= ')' )
            {
            // InternalMySelenium.g:1709:2: (otherlv_0= '(' ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )? otherlv_4= ')' )
            // InternalMySelenium.g:1710:3: otherlv_0= '(' ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMySelenium.g:1714:3: ( ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMySelenium.g:1715:4: ( (lv_variables_1_0= ruleVariableCall ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )*
                    {
                    // InternalMySelenium.g:1715:4: ( (lv_variables_1_0= ruleVariableCall ) )
                    // InternalMySelenium.g:1716:5: (lv_variables_1_0= ruleVariableCall )
                    {
                    // InternalMySelenium.g:1716:5: (lv_variables_1_0= ruleVariableCall )
                    // InternalMySelenium.g:1717:6: lv_variables_1_0= ruleVariableCall
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalMySelenium.g:1734:4: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==31) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMySelenium.g:1735:5: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableCall ) )
                    	    {
                    	    otherlv_2=(Token)match(input,31,FOLLOW_29); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMySelenium.g:1739:5: ( (lv_variables_3_0= ruleVariableCall ) )
                    	    // InternalMySelenium.g:1740:6: (lv_variables_3_0= ruleVariableCall )
                    	    {
                    	    // InternalMySelenium.g:1740:6: (lv_variables_3_0= ruleVariableCall )
                    	    // InternalMySelenium.g:1741:7: lv_variables_3_0= ruleVariableCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalMySelenium.g:1768:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalMySelenium.g:1768:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalMySelenium.g:1769:2: iv_ruleVariableCall= ruleVariableCall EOF
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
    // InternalMySelenium.g:1775:1: ruleVariableCall returns [EObject current=null] : (this_VariableRef_0= ruleVariableRef | this_StringParameter_1= ruleStringParameter ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject this_VariableRef_0 = null;

        EObject this_StringParameter_1 = null;



        	enterRule();

        try {
            // InternalMySelenium.g:1781:2: ( (this_VariableRef_0= ruleVariableRef | this_StringParameter_1= ruleStringParameter ) )
            // InternalMySelenium.g:1782:2: (this_VariableRef_0= ruleVariableRef | this_StringParameter_1= ruleStringParameter )
            {
            // InternalMySelenium.g:1782:2: (this_VariableRef_0= ruleVariableRef | this_StringParameter_1= ruleStringParameter )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMySelenium.g:1783:3: this_VariableRef_0= ruleVariableRef
                    {

                    			newCompositeNode(grammarAccess.getVariableCallAccess().getVariableRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableRef_0=ruleVariableRef();

                    state._fsp--;


                    			current = this_VariableRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1792:3: this_StringParameter_1= ruleStringParameter
                    {

                    			newCompositeNode(grammarAccess.getVariableCallAccess().getStringParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringParameter_1=ruleStringParameter();

                    state._fsp--;


                    			current = this_StringParameter_1;
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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleVariableRef"
    // InternalMySelenium.g:1804:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalMySelenium.g:1804:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalMySelenium.g:1805:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             newCompositeNode(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableRef=ruleVariableRef();

            state._fsp--;

             current =iv_ruleVariableRef; 
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
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalMySelenium.g:1811:1: ruleVariableRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1817:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMySelenium.g:1818:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMySelenium.g:1818:2: ( (otherlv_0= RULE_ID ) )
            // InternalMySelenium.g:1819:3: (otherlv_0= RULE_ID )
            {
            // InternalMySelenium.g:1819:3: (otherlv_0= RULE_ID )
            // InternalMySelenium.g:1820:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableRefAccess().getRefVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleVariable"
    // InternalMySelenium.g:1834:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMySelenium.g:1834:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMySelenium.g:1835:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMySelenium.g:1841:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1847:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMySelenium.g:1848:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMySelenium.g:1848:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMySelenium.g:1849:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMySelenium.g:1849:3: (lv_name_0_0= RULE_ID )
            // InternalMySelenium.g:1850:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleStringParameter"
    // InternalMySelenium.g:1869:1: entryRuleStringParameter returns [EObject current=null] : iv_ruleStringParameter= ruleStringParameter EOF ;
    public final EObject entryRuleStringParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParameter = null;


        try {
            // InternalMySelenium.g:1869:56: (iv_ruleStringParameter= ruleStringParameter EOF )
            // InternalMySelenium.g:1870:2: iv_ruleStringParameter= ruleStringParameter EOF
            {
             newCompositeNode(grammarAccess.getStringParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringParameter=ruleStringParameter();

            state._fsp--;

             current =iv_ruleStringParameter; 
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
    // $ANTLR end "entryRuleStringParameter"


    // $ANTLR start "ruleStringParameter"
    // InternalMySelenium.g:1876:1: ruleStringParameter returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringParameter() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMySelenium.g:1882:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMySelenium.g:1883:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMySelenium.g:1883:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMySelenium.g:1884:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMySelenium.g:1884:3: (lv_value_0_0= RULE_STRING )
            // InternalMySelenium.g:1885:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringParameterAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringParameter"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\133\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\1\uffff\2\24\12\31\2\uffff\1\4\1\21\2\35\10\24\1\17\2\4\1\34\1\17\1\20\2\35\2\32\1\46\3\24\1\21\12\31\7\24\1\21\1\4\7\24\1\35\2\32\1\4\1\17\2\32\1\21\7\24\1\4\2\32";
    static final String dfa_3s = "\1\63\3\uffff\1\57\1\uffff\1\34\1\25\12\31\2\uffff\1\35\1\45\2\37\1\25\7\24\1\36\2\5\1\34\1\17\1\22\4\37\1\57\3\25\1\45\12\31\7\24\1\45\1\5\7\24\1\35\2\37\1\5\1\36\2\37\1\45\7\24\1\5\2\37";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\14\uffff\1\5\1\4\107\uffff";
    static final String dfa_5s = "\133\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\16\uffff\1\4\2\uffff\2\5\1\2\27\uffff\4\1",
            "",
            "",
            "",
            "\1\6\1\7\40\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "",
            "\1\23\1\22\6\uffff\1\24",
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
            "\1\25",
            "",
            "",
            "\1\26\1\27\27\uffff\1\30",
            "\1\32\10\uffff\1\40\5\uffff\1\31\1\33\1\34\1\35\1\36\1\37",
            "\1\30\1\uffff\1\41",
            "\1\30\1\uffff\1\41",
            "\1\23\1\22",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\45\13\uffff\1\43\2\uffff\1\44",
            "\1\46\1\47",
            "\1\51\1\50",
            "\1\52",
            "\1\45",
            "\1\53\1\54\1\55",
            "\1\30\1\uffff\1\41",
            "\1\30\1\uffff\1\41",
            "\1\40\4\uffff\1\56",
            "\1\40\4\uffff\1\56",
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\72\16\uffff\1\71\1\73\1\74\1\75\1\76\1\77",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\103\10\uffff\1\111\5\uffff\1\102\1\104\1\105\1\106\1\107\1\110",
            "\1\113\1\112",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\115",
            "\1\40\4\uffff\1\56",
            "\1\40\4\uffff\1\56",
            "\1\117\1\116",
            "\1\45\16\uffff\1\44",
            "\1\111\4\uffff\1\120",
            "\1\111\4\uffff\1\120",
            "\1\122\16\uffff\1\121\1\123\1\124\1\125\1\126\1\127",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\132\1\131",
            "\1\111\4\uffff\1\120",
            "\1\111\4\uffff\1\120"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "532:2: (this_Action_0= ruleAction | this_AssignAction_1= ruleAssignAction | this_FunctionCall_2= ruleFunctionCall | this_AssertEquals_3= ruleAssertEquals | this_AssertContains_4= ruleAssertContains | this_NavigationAction_5= ruleNavigationAction )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000F000001C80012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000F000001C80010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000FFC000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000FFC000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000FFC000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003F04020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000FFC000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003F00020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000030L});

}