package fr.imta.clementdamien.dsl.selenium.ide.contentassist.antlr.internal;

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
import fr.imta.clementdamien.dsl.selenium.services.MySeleniumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMySeleniumParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'click'", "'value'", "'text'", "'html'", "'go'", "'openBrowser'", "'name'", "'alt'", "'checked'", "'class'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'assign'", "'fill'", "'choose'", "'def'", "'{'", "'}'", "'.'", "'assert'", "'['", "']'", "'.all'", "','", "'='", "'('", "')'", "'contains'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MySeleniumGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMySelenium.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMySelenium.g:54:1: ( ruleProgram EOF )
            // InternalMySelenium.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMySelenium.g:62:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:66:2: ( ( ( rule__Program__Alternatives ) ) )
            // InternalMySelenium.g:67:2: ( ( rule__Program__Alternatives ) )
            {
            // InternalMySelenium.g:67:2: ( ( rule__Program__Alternatives ) )
            // InternalMySelenium.g:68:3: ( rule__Program__Alternatives )
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // InternalMySelenium.g:69:3: ( rule__Program__Alternatives )
            // InternalMySelenium.g:69:4: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunctions"
    // InternalMySelenium.g:78:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalMySelenium.g:79:1: ( ruleFunctions EOF )
            // InternalMySelenium.g:80:1: ruleFunctions EOF
            {
             before(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getFunctionsRule()); 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalMySelenium.g:87:1: ruleFunctions : ( ( ( rule__Functions__FunctionsAssignment ) ) ( ( rule__Functions__FunctionsAssignment )* ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:91:2: ( ( ( ( rule__Functions__FunctionsAssignment ) ) ( ( rule__Functions__FunctionsAssignment )* ) ) )
            // InternalMySelenium.g:92:2: ( ( ( rule__Functions__FunctionsAssignment ) ) ( ( rule__Functions__FunctionsAssignment )* ) )
            {
            // InternalMySelenium.g:92:2: ( ( ( rule__Functions__FunctionsAssignment ) ) ( ( rule__Functions__FunctionsAssignment )* ) )
            // InternalMySelenium.g:93:3: ( ( rule__Functions__FunctionsAssignment ) ) ( ( rule__Functions__FunctionsAssignment )* )
            {
            // InternalMySelenium.g:93:3: ( ( rule__Functions__FunctionsAssignment ) )
            // InternalMySelenium.g:94:4: ( rule__Functions__FunctionsAssignment )
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment()); 
            // InternalMySelenium.g:95:4: ( rule__Functions__FunctionsAssignment )
            // InternalMySelenium.g:95:5: rule__Functions__FunctionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Functions__FunctionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getFunctionsAssignment()); 

            }

            // InternalMySelenium.g:98:3: ( ( rule__Functions__FunctionsAssignment )* )
            // InternalMySelenium.g:99:4: ( rule__Functions__FunctionsAssignment )*
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment()); 
            // InternalMySelenium.g:100:4: ( rule__Functions__FunctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMySelenium.g:100:5: rule__Functions__FunctionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Functions__FunctionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFunctionsAccess().getFunctionsAssignment()); 

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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleStatements"
    // InternalMySelenium.g:110:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalMySelenium.g:111:1: ( ruleStatements EOF )
            // InternalMySelenium.g:112:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalMySelenium.g:119:1: ruleStatements : ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:123:2: ( ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) )
            // InternalMySelenium.g:124:2: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            {
            // InternalMySelenium.g:124:2: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            // InternalMySelenium.g:125:3: ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* )
            {
            // InternalMySelenium.g:125:3: ( ( rule__Statements__StatementsAssignment ) )
            // InternalMySelenium.g:126:4: ( rule__Statements__StatementsAssignment )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // InternalMySelenium.g:127:4: ( rule__Statements__StatementsAssignment )
            // InternalMySelenium.g:127:5: rule__Statements__StatementsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Statements__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }

            // InternalMySelenium.g:130:3: ( ( rule__Statements__StatementsAssignment )* )
            // InternalMySelenium.g:131:4: ( rule__Statements__StatementsAssignment )*
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // InternalMySelenium.g:132:4: ( rule__Statements__StatementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==11||(LA2_0>=15 && LA2_0<=16)||(LA2_0>=30 && LA2_0<=32)||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMySelenium.g:132:5: rule__Statements__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Statements__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:142:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMySelenium.g:143:1: ( ruleFunction EOF )
            // InternalMySelenium.g:144:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMySelenium.g:151:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:155:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMySelenium.g:156:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMySelenium.g:156:2: ( ( rule__Function__Group__0 ) )
            // InternalMySelenium.g:157:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMySelenium.g:158:3: ( rule__Function__Group__0 )
            // InternalMySelenium.g:158:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionName"
    // InternalMySelenium.g:167:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMySelenium.g:168:1: ( ruleFunctionName EOF )
            // InternalMySelenium.g:169:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalMySelenium.g:176:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:180:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMySelenium.g:181:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMySelenium.g:181:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMySelenium.g:182:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMySelenium.g:183:3: ( rule__FunctionName__NameAssignment )
            // InternalMySelenium.g:183:4: rule__FunctionName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMySelenium.g:192:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:193:1: ( ruleFunctionCall EOF )
            // InternalMySelenium.g:194:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMySelenium.g:201:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:205:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMySelenium.g:206:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMySelenium.g:206:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMySelenium.g:207:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMySelenium.g:208:3: ( rule__FunctionCall__Group__0 )
            // InternalMySelenium.g:208:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleProjection"
    // InternalMySelenium.g:217:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // InternalMySelenium.g:218:1: ( ruleProjection EOF )
            // InternalMySelenium.g:219:1: ruleProjection EOF
            {
             before(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProjection();

            state._fsp--;

             after(grammarAccess.getProjectionRule()); 
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
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalMySelenium.g:226:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:230:2: ( ( ( rule__Projection__Group__0 ) ) )
            // InternalMySelenium.g:231:2: ( ( rule__Projection__Group__0 ) )
            {
            // InternalMySelenium.g:231:2: ( ( rule__Projection__Group__0 ) )
            // InternalMySelenium.g:232:3: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // InternalMySelenium.g:233:3: ( rule__Projection__Group__0 )
            // InternalMySelenium.g:233:4: rule__Projection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleProjectionAction"
    // InternalMySelenium.g:242:1: entryRuleProjectionAction : ruleProjectionAction EOF ;
    public final void entryRuleProjectionAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:243:1: ( ruleProjectionAction EOF )
            // InternalMySelenium.g:244:1: ruleProjectionAction EOF
            {
             before(grammarAccess.getProjectionActionRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectionAction();

            state._fsp--;

             after(grammarAccess.getProjectionActionRule()); 
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
    // $ANTLR end "entryRuleProjectionAction"


    // $ANTLR start "ruleProjectionAction"
    // InternalMySelenium.g:251:1: ruleProjectionAction : ( ( rule__ProjectionAction__Alternatives ) ) ;
    public final void ruleProjectionAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:255:2: ( ( ( rule__ProjectionAction__Alternatives ) ) )
            // InternalMySelenium.g:256:2: ( ( rule__ProjectionAction__Alternatives ) )
            {
            // InternalMySelenium.g:256:2: ( ( rule__ProjectionAction__Alternatives ) )
            // InternalMySelenium.g:257:3: ( rule__ProjectionAction__Alternatives )
            {
             before(grammarAccess.getProjectionActionAccess().getAlternatives()); 
            // InternalMySelenium.g:258:3: ( rule__ProjectionAction__Alternatives )
            // InternalMySelenium.g:258:4: rule__ProjectionAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectionActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectionAction"


    // $ANTLR start "entryRuleStatement"
    // InternalMySelenium.g:267:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMySelenium.g:268:1: ( ruleStatement EOF )
            // InternalMySelenium.g:269:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMySelenium.g:276:1: ruleStatement : ( ( rule__Statement__StatementAssignment ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:280:2: ( ( ( rule__Statement__StatementAssignment ) ) )
            // InternalMySelenium.g:281:2: ( ( rule__Statement__StatementAssignment ) )
            {
            // InternalMySelenium.g:281:2: ( ( rule__Statement__StatementAssignment ) )
            // InternalMySelenium.g:282:3: ( rule__Statement__StatementAssignment )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment()); 
            // InternalMySelenium.g:283:3: ( rule__Statement__StatementAssignment )
            // InternalMySelenium.g:283:4: rule__Statement__StatementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssertEquals"
    // InternalMySelenium.g:292:1: entryRuleAssertEquals : ruleAssertEquals EOF ;
    public final void entryRuleAssertEquals() throws RecognitionException {
        try {
            // InternalMySelenium.g:293:1: ( ruleAssertEquals EOF )
            // InternalMySelenium.g:294:1: ruleAssertEquals EOF
            {
             before(grammarAccess.getAssertEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertEquals();

            state._fsp--;

             after(grammarAccess.getAssertEqualsRule()); 
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
    // $ANTLR end "entryRuleAssertEquals"


    // $ANTLR start "ruleAssertEquals"
    // InternalMySelenium.g:301:1: ruleAssertEquals : ( ( rule__AssertEquals__Group__0 ) ) ;
    public final void ruleAssertEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:305:2: ( ( ( rule__AssertEquals__Group__0 ) ) )
            // InternalMySelenium.g:306:2: ( ( rule__AssertEquals__Group__0 ) )
            {
            // InternalMySelenium.g:306:2: ( ( rule__AssertEquals__Group__0 ) )
            // InternalMySelenium.g:307:3: ( rule__AssertEquals__Group__0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getGroup()); 
            // InternalMySelenium.g:308:3: ( rule__AssertEquals__Group__0 )
            // InternalMySelenium.g:308:4: rule__AssertEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertEquals"


    // $ANTLR start "entryRuleAssertContains"
    // InternalMySelenium.g:317:1: entryRuleAssertContains : ruleAssertContains EOF ;
    public final void entryRuleAssertContains() throws RecognitionException {
        try {
            // InternalMySelenium.g:318:1: ( ruleAssertContains EOF )
            // InternalMySelenium.g:319:1: ruleAssertContains EOF
            {
             before(grammarAccess.getAssertContainsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertContains();

            state._fsp--;

             after(grammarAccess.getAssertContainsRule()); 
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
    // $ANTLR end "entryRuleAssertContains"


    // $ANTLR start "ruleAssertContains"
    // InternalMySelenium.g:326:1: ruleAssertContains : ( ( rule__AssertContains__Group__0 ) ) ;
    public final void ruleAssertContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:330:2: ( ( ( rule__AssertContains__Group__0 ) ) )
            // InternalMySelenium.g:331:2: ( ( rule__AssertContains__Group__0 ) )
            {
            // InternalMySelenium.g:331:2: ( ( rule__AssertContains__Group__0 ) )
            // InternalMySelenium.g:332:3: ( rule__AssertContains__Group__0 )
            {
             before(grammarAccess.getAssertContainsAccess().getGroup()); 
            // InternalMySelenium.g:333:3: ( rule__AssertContains__Group__0 )
            // InternalMySelenium.g:333:4: rule__AssertContains__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertContains"


    // $ANTLR start "entryRuleAssertableElement"
    // InternalMySelenium.g:342:1: entryRuleAssertableElement : ruleAssertableElement EOF ;
    public final void entryRuleAssertableElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:343:1: ( ruleAssertableElement EOF )
            // InternalMySelenium.g:344:1: ruleAssertableElement EOF
            {
             before(grammarAccess.getAssertableElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertableElement();

            state._fsp--;

             after(grammarAccess.getAssertableElementRule()); 
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
    // $ANTLR end "entryRuleAssertableElement"


    // $ANTLR start "ruleAssertableElement"
    // InternalMySelenium.g:351:1: ruleAssertableElement : ( ( rule__AssertableElement__Alternatives ) ) ;
    public final void ruleAssertableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:355:2: ( ( ( rule__AssertableElement__Alternatives ) ) )
            // InternalMySelenium.g:356:2: ( ( rule__AssertableElement__Alternatives ) )
            {
            // InternalMySelenium.g:356:2: ( ( rule__AssertableElement__Alternatives ) )
            // InternalMySelenium.g:357:3: ( rule__AssertableElement__Alternatives )
            {
             before(grammarAccess.getAssertableElementAccess().getAlternatives()); 
            // InternalMySelenium.g:358:3: ( rule__AssertableElement__Alternatives )
            // InternalMySelenium.g:358:4: rule__AssertableElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssertableElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssertableElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertableElement"


    // $ANTLR start "entryRuleNavigationAction"
    // InternalMySelenium.g:367:1: entryRuleNavigationAction : ruleNavigationAction EOF ;
    public final void entryRuleNavigationAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:368:1: ( ruleNavigationAction EOF )
            // InternalMySelenium.g:369:1: ruleNavigationAction EOF
            {
             before(grammarAccess.getNavigationActionRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationAction();

            state._fsp--;

             after(grammarAccess.getNavigationActionRule()); 
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
    // $ANTLR end "entryRuleNavigationAction"


    // $ANTLR start "ruleNavigationAction"
    // InternalMySelenium.g:376:1: ruleNavigationAction : ( ( rule__NavigationAction__Group__0 ) ) ;
    public final void ruleNavigationAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:380:2: ( ( ( rule__NavigationAction__Group__0 ) ) )
            // InternalMySelenium.g:381:2: ( ( rule__NavigationAction__Group__0 ) )
            {
            // InternalMySelenium.g:381:2: ( ( rule__NavigationAction__Group__0 ) )
            // InternalMySelenium.g:382:3: ( rule__NavigationAction__Group__0 )
            {
             before(grammarAccess.getNavigationActionAccess().getGroup()); 
            // InternalMySelenium.g:383:3: ( rule__NavigationAction__Group__0 )
            // InternalMySelenium.g:383:4: rule__NavigationAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigationAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigationActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationAction"


    // $ANTLR start "entryRuleNavigationActionType"
    // InternalMySelenium.g:392:1: entryRuleNavigationActionType : ruleNavigationActionType EOF ;
    public final void entryRuleNavigationActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:393:1: ( ruleNavigationActionType EOF )
            // InternalMySelenium.g:394:1: ruleNavigationActionType EOF
            {
             before(grammarAccess.getNavigationActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationActionType();

            state._fsp--;

             after(grammarAccess.getNavigationActionTypeRule()); 
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
    // $ANTLR end "entryRuleNavigationActionType"


    // $ANTLR start "ruleNavigationActionType"
    // InternalMySelenium.g:401:1: ruleNavigationActionType : ( ( rule__NavigationActionType__Alternatives ) ) ;
    public final void ruleNavigationActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:405:2: ( ( ( rule__NavigationActionType__Alternatives ) ) )
            // InternalMySelenium.g:406:2: ( ( rule__NavigationActionType__Alternatives ) )
            {
            // InternalMySelenium.g:406:2: ( ( rule__NavigationActionType__Alternatives ) )
            // InternalMySelenium.g:407:3: ( rule__NavigationActionType__Alternatives )
            {
             before(grammarAccess.getNavigationActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:408:3: ( rule__NavigationActionType__Alternatives )
            // InternalMySelenium.g:408:4: rule__NavigationActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigationActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigationActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationActionType"


    // $ANTLR start "entryRuleOneParameterAction"
    // InternalMySelenium.g:417:1: entryRuleOneParameterAction : ruleOneParameterAction EOF ;
    public final void entryRuleOneParameterAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:418:1: ( ruleOneParameterAction EOF )
            // InternalMySelenium.g:419:1: ruleOneParameterAction EOF
            {
             before(grammarAccess.getOneParameterActionRule()); 
            pushFollow(FOLLOW_1);
            ruleOneParameterAction();

            state._fsp--;

             after(grammarAccess.getOneParameterActionRule()); 
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
    // $ANTLR end "entryRuleOneParameterAction"


    // $ANTLR start "ruleOneParameterAction"
    // InternalMySelenium.g:426:1: ruleOneParameterAction : ( ( rule__OneParameterAction__Group__0 ) ) ;
    public final void ruleOneParameterAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:430:2: ( ( ( rule__OneParameterAction__Group__0 ) ) )
            // InternalMySelenium.g:431:2: ( ( rule__OneParameterAction__Group__0 ) )
            {
            // InternalMySelenium.g:431:2: ( ( rule__OneParameterAction__Group__0 ) )
            // InternalMySelenium.g:432:3: ( rule__OneParameterAction__Group__0 )
            {
             before(grammarAccess.getOneParameterActionAccess().getGroup()); 
            // InternalMySelenium.g:433:3: ( rule__OneParameterAction__Group__0 )
            // InternalMySelenium.g:433:4: rule__OneParameterAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneParameterActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneParameterAction"


    // $ANTLR start "entryRuleTwoParametersAction"
    // InternalMySelenium.g:442:1: entryRuleTwoParametersAction : ruleTwoParametersAction EOF ;
    public final void entryRuleTwoParametersAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:443:1: ( ruleTwoParametersAction EOF )
            // InternalMySelenium.g:444:1: ruleTwoParametersAction EOF
            {
             before(grammarAccess.getTwoParametersActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTwoParametersAction();

            state._fsp--;

             after(grammarAccess.getTwoParametersActionRule()); 
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
    // $ANTLR end "entryRuleTwoParametersAction"


    // $ANTLR start "ruleTwoParametersAction"
    // InternalMySelenium.g:451:1: ruleTwoParametersAction : ( ( rule__TwoParametersAction__Group__0 ) ) ;
    public final void ruleTwoParametersAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:455:2: ( ( ( rule__TwoParametersAction__Group__0 ) ) )
            // InternalMySelenium.g:456:2: ( ( rule__TwoParametersAction__Group__0 ) )
            {
            // InternalMySelenium.g:456:2: ( ( rule__TwoParametersAction__Group__0 ) )
            // InternalMySelenium.g:457:3: ( rule__TwoParametersAction__Group__0 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getGroup()); 
            // InternalMySelenium.g:458:3: ( rule__TwoParametersAction__Group__0 )
            // InternalMySelenium.g:458:4: rule__TwoParametersAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwoParametersAction"


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:467:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMySelenium.g:468:1: ( ruleSelector EOF )
            // InternalMySelenium.g:469:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalMySelenium.g:476:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:480:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMySelenium.g:481:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMySelenium.g:481:2: ( ( rule__Selector__Group__0 ) )
            // InternalMySelenium.g:482:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMySelenium.g:483:3: ( rule__Selector__Group__0 )
            // InternalMySelenium.g:483:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleAttributes"
    // InternalMySelenium.g:492:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalMySelenium.g:493:1: ( ruleAttributes EOF )
            // InternalMySelenium.g:494:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalMySelenium.g:501:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:505:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalMySelenium.g:506:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalMySelenium.g:506:2: ( ( rule__Attributes__Group__0 ) )
            // InternalMySelenium.g:507:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalMySelenium.g:508:3: ( rule__Attributes__Group__0 )
            // InternalMySelenium.g:508:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalMySelenium.g:517:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:518:1: ( ruleAttribute EOF )
            // InternalMySelenium.g:519:1: ruleAttribute EOF
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
    // InternalMySelenium.g:526:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:530:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMySelenium.g:531:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMySelenium.g:531:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMySelenium.g:532:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMySelenium.g:533:3: ( rule__Attribute__Group__0 )
            // InternalMySelenium.g:533:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDOMAttribute"
    // InternalMySelenium.g:542:1: entryRuleDOMAttribute : ruleDOMAttribute EOF ;
    public final void entryRuleDOMAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:543:1: ( ruleDOMAttribute EOF )
            // InternalMySelenium.g:544:1: ruleDOMAttribute EOF
            {
             before(grammarAccess.getDOMAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMAttribute();

            state._fsp--;

             after(grammarAccess.getDOMAttributeRule()); 
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
    // $ANTLR end "entryRuleDOMAttribute"


    // $ANTLR start "ruleDOMAttribute"
    // InternalMySelenium.g:551:1: ruleDOMAttribute : ( ( rule__DOMAttribute__Alternatives ) ) ;
    public final void ruleDOMAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:555:2: ( ( ( rule__DOMAttribute__Alternatives ) ) )
            // InternalMySelenium.g:556:2: ( ( rule__DOMAttribute__Alternatives ) )
            {
            // InternalMySelenium.g:556:2: ( ( rule__DOMAttribute__Alternatives ) )
            // InternalMySelenium.g:557:3: ( rule__DOMAttribute__Alternatives )
            {
             before(grammarAccess.getDOMAttributeAccess().getAlternatives()); 
            // InternalMySelenium.g:558:3: ( rule__DOMAttribute__Alternatives )
            // InternalMySelenium.g:558:4: rule__DOMAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOMAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOMAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMAttribute"


    // $ANTLR start "entryRuleDOMElement"
    // InternalMySelenium.g:567:1: entryRuleDOMElement : ruleDOMElement EOF ;
    public final void entryRuleDOMElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:568:1: ( ruleDOMElement EOF )
            // InternalMySelenium.g:569:1: ruleDOMElement EOF
            {
             before(grammarAccess.getDOMElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMElement();

            state._fsp--;

             after(grammarAccess.getDOMElementRule()); 
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
    // $ANTLR end "entryRuleDOMElement"


    // $ANTLR start "ruleDOMElement"
    // InternalMySelenium.g:576:1: ruleDOMElement : ( ( rule__DOMElement__Alternatives ) ) ;
    public final void ruleDOMElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:580:2: ( ( ( rule__DOMElement__Alternatives ) ) )
            // InternalMySelenium.g:581:2: ( ( rule__DOMElement__Alternatives ) )
            {
            // InternalMySelenium.g:581:2: ( ( rule__DOMElement__Alternatives ) )
            // InternalMySelenium.g:582:3: ( rule__DOMElement__Alternatives )
            {
             before(grammarAccess.getDOMElementAccess().getAlternatives()); 
            // InternalMySelenium.g:583:3: ( rule__DOMElement__Alternatives )
            // InternalMySelenium.g:583:4: rule__DOMElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOMElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOMElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMElement"


    // $ANTLR start "entryRuleOneParameterActionType"
    // InternalMySelenium.g:592:1: entryRuleOneParameterActionType : ruleOneParameterActionType EOF ;
    public final void entryRuleOneParameterActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:593:1: ( ruleOneParameterActionType EOF )
            // InternalMySelenium.g:594:1: ruleOneParameterActionType EOF
            {
             before(grammarAccess.getOneParameterActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOneParameterActionType();

            state._fsp--;

             after(grammarAccess.getOneParameterActionTypeRule()); 
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
    // $ANTLR end "entryRuleOneParameterActionType"


    // $ANTLR start "ruleOneParameterActionType"
    // InternalMySelenium.g:601:1: ruleOneParameterActionType : ( 'click' ) ;
    public final void ruleOneParameterActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:605:2: ( ( 'click' ) )
            // InternalMySelenium.g:606:2: ( 'click' )
            {
            // InternalMySelenium.g:606:2: ( 'click' )
            // InternalMySelenium.g:607:3: 'click'
            {
             before(grammarAccess.getOneParameterActionTypeAccess().getClickKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOneParameterActionTypeAccess().getClickKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneParameterActionType"


    // $ANTLR start "entryRuleTwoParametersActionType"
    // InternalMySelenium.g:617:1: entryRuleTwoParametersActionType : ruleTwoParametersActionType EOF ;
    public final void entryRuleTwoParametersActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:618:1: ( ruleTwoParametersActionType EOF )
            // InternalMySelenium.g:619:1: ruleTwoParametersActionType EOF
            {
             before(grammarAccess.getTwoParametersActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTwoParametersActionType();

            state._fsp--;

             after(grammarAccess.getTwoParametersActionTypeRule()); 
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
    // $ANTLR end "entryRuleTwoParametersActionType"


    // $ANTLR start "ruleTwoParametersActionType"
    // InternalMySelenium.g:626:1: ruleTwoParametersActionType : ( ( rule__TwoParametersActionType__Alternatives ) ) ;
    public final void ruleTwoParametersActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:630:2: ( ( ( rule__TwoParametersActionType__Alternatives ) ) )
            // InternalMySelenium.g:631:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            {
            // InternalMySelenium.g:631:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            // InternalMySelenium.g:632:3: ( rule__TwoParametersActionType__Alternatives )
            {
             before(grammarAccess.getTwoParametersActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:633:3: ( rule__TwoParametersActionType__Alternatives )
            // InternalMySelenium.g:633:4: rule__TwoParametersActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwoParametersActionType"


    // $ANTLR start "entryRuleFunctionParameters"
    // InternalMySelenium.g:642:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:643:1: ( ruleFunctionParameters EOF )
            // InternalMySelenium.g:644:1: ruleFunctionParameters EOF
            {
             before(grammarAccess.getFunctionParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionParameters();

            state._fsp--;

             after(grammarAccess.getFunctionParametersRule()); 
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
    // $ANTLR end "entryRuleFunctionParameters"


    // $ANTLR start "ruleFunctionParameters"
    // InternalMySelenium.g:651:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Group__0 ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:655:2: ( ( ( rule__FunctionParameters__Group__0 ) ) )
            // InternalMySelenium.g:656:2: ( ( rule__FunctionParameters__Group__0 ) )
            {
            // InternalMySelenium.g:656:2: ( ( rule__FunctionParameters__Group__0 ) )
            // InternalMySelenium.g:657:3: ( rule__FunctionParameters__Group__0 )
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup()); 
            // InternalMySelenium.g:658:3: ( rule__FunctionParameters__Group__0 )
            // InternalMySelenium.g:658:4: rule__FunctionParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionParameters"


    // $ANTLR start "entryRuleFunctionCallParameters"
    // InternalMySelenium.g:667:1: entryRuleFunctionCallParameters : ruleFunctionCallParameters EOF ;
    public final void entryRuleFunctionCallParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:668:1: ( ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:669:1: ruleFunctionCallParameters EOF
            {
             before(grammarAccess.getFunctionCallParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCallParameters();

            state._fsp--;

             after(grammarAccess.getFunctionCallParametersRule()); 
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
    // $ANTLR end "entryRuleFunctionCallParameters"


    // $ANTLR start "ruleFunctionCallParameters"
    // InternalMySelenium.g:676:1: ruleFunctionCallParameters : ( ( rule__FunctionCallParameters__Group__0 ) ) ;
    public final void ruleFunctionCallParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:680:2: ( ( ( rule__FunctionCallParameters__Group__0 ) ) )
            // InternalMySelenium.g:681:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            {
            // InternalMySelenium.g:681:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            // InternalMySelenium.g:682:3: ( rule__FunctionCallParameters__Group__0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup()); 
            // InternalMySelenium.g:683:3: ( rule__FunctionCallParameters__Group__0 )
            // InternalMySelenium.g:683:4: rule__FunctionCallParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCallParameters"


    // $ANTLR start "entryRuleVariableCall"
    // InternalMySelenium.g:692:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:693:1: ( ruleVariableCall EOF )
            // InternalMySelenium.g:694:1: ruleVariableCall EOF
            {
             before(grammarAccess.getVariableCallRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getVariableCallRule()); 
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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalMySelenium.g:701:1: ruleVariableCall : ( ( rule__VariableCall__Alternatives ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:705:2: ( ( ( rule__VariableCall__Alternatives ) ) )
            // InternalMySelenium.g:706:2: ( ( rule__VariableCall__Alternatives ) )
            {
            // InternalMySelenium.g:706:2: ( ( rule__VariableCall__Alternatives ) )
            // InternalMySelenium.g:707:3: ( rule__VariableCall__Alternatives )
            {
             before(grammarAccess.getVariableCallAccess().getAlternatives()); 
            // InternalMySelenium.g:708:3: ( rule__VariableCall__Alternatives )
            // InternalMySelenium.g:708:4: rule__VariableCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleVariable"
    // InternalMySelenium.g:717:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMySelenium.g:718:1: ( ruleVariable EOF )
            // InternalMySelenium.g:719:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMySelenium.g:726:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:730:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalMySelenium.g:731:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalMySelenium.g:731:2: ( ( rule__Variable__NameAssignment ) )
            // InternalMySelenium.g:732:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalMySelenium.g:733:3: ( rule__Variable__NameAssignment )
            // InternalMySelenium.g:733:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Program__Alternatives"
    // InternalMySelenium.g:741:1: rule__Program__Alternatives : ( ( ( rule__Program__FunctionsAssignment_0 ) ) | ( ( rule__Program__StatementsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:745:1: ( ( ( rule__Program__FunctionsAssignment_0 ) ) | ( ( rule__Program__StatementsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==11||(LA3_0>=15 && LA3_0<=16)||(LA3_0>=30 && LA3_0<=32)||LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMySelenium.g:746:2: ( ( rule__Program__FunctionsAssignment_0 ) )
                    {
                    // InternalMySelenium.g:746:2: ( ( rule__Program__FunctionsAssignment_0 ) )
                    // InternalMySelenium.g:747:3: ( rule__Program__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getProgramAccess().getFunctionsAssignment_0()); 
                    // InternalMySelenium.g:748:3: ( rule__Program__FunctionsAssignment_0 )
                    // InternalMySelenium.g:748:4: rule__Program__FunctionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__FunctionsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getFunctionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:752:2: ( ( rule__Program__StatementsAssignment_1 ) )
                    {
                    // InternalMySelenium.g:752:2: ( ( rule__Program__StatementsAssignment_1 ) )
                    // InternalMySelenium.g:753:3: ( rule__Program__StatementsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getStatementsAssignment_1()); 
                    // InternalMySelenium.g:754:3: ( rule__Program__StatementsAssignment_1 )
                    // InternalMySelenium.g:754:4: rule__Program__StatementsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__StatementsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__ProjectionAction__Alternatives"
    // InternalMySelenium.g:762:1: rule__ProjectionAction__Alternatives : ( ( 'value' ) | ( 'text' ) | ( 'html' ) );
    public final void rule__ProjectionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:766:1: ( ( 'value' ) | ( 'text' ) | ( 'html' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMySelenium.g:767:2: ( 'value' )
                    {
                    // InternalMySelenium.g:767:2: ( 'value' )
                    // InternalMySelenium.g:768:3: 'value'
                    {
                     before(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:773:2: ( 'text' )
                    {
                    // InternalMySelenium.g:773:2: ( 'text' )
                    // InternalMySelenium.g:774:3: 'text'
                    {
                     before(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:779:2: ( 'html' )
                    {
                    // InternalMySelenium.g:779:2: ( 'html' )
                    // InternalMySelenium.g:780:3: 'html'
                    {
                     before(grammarAccess.getProjectionActionAccess().getHtmlKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getHtmlKeyword_2()); 

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
    // $ANTLR end "rule__ProjectionAction__Alternatives"


    // $ANTLR start "rule__Statement__StatementAlternatives_0"
    // InternalMySelenium.g:789:1: rule__Statement__StatementAlternatives_0 : ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );
    public final void rule__Statement__StatementAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:793:1: ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMySelenium.g:794:2: ( ruleOneParameterAction )
                    {
                    // InternalMySelenium.g:794:2: ( ruleOneParameterAction )
                    // InternalMySelenium.g:795:3: ruleOneParameterAction
                    {
                     before(grammarAccess.getStatementAccess().getStatementOneParameterActionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOneParameterAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementOneParameterActionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:800:2: ( ruleTwoParametersAction )
                    {
                    // InternalMySelenium.g:800:2: ( ruleTwoParametersAction )
                    // InternalMySelenium.g:801:3: ruleTwoParametersAction
                    {
                     before(grammarAccess.getStatementAccess().getStatementTwoParametersActionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTwoParametersAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementTwoParametersActionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:806:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:806:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:807:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getStatementFunctionCallParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementFunctionCallParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:812:2: ( ruleAssertEquals )
                    {
                    // InternalMySelenium.g:812:2: ( ruleAssertEquals )
                    // InternalMySelenium.g:813:3: ruleAssertEquals
                    {
                     before(grammarAccess.getStatementAccess().getStatementAssertEqualsParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertEquals();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementAssertEqualsParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:818:2: ( ruleAssertContains )
                    {
                    // InternalMySelenium.g:818:2: ( ruleAssertContains )
                    // InternalMySelenium.g:819:3: ruleAssertContains
                    {
                     before(grammarAccess.getStatementAccess().getStatementAssertContainsParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertContains();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementAssertContainsParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:824:2: ( ruleNavigationAction )
                    {
                    // InternalMySelenium.g:824:2: ( ruleNavigationAction )
                    // InternalMySelenium.g:825:3: ruleNavigationAction
                    {
                     before(grammarAccess.getStatementAccess().getStatementNavigationActionParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementNavigationActionParserRuleCall_0_5()); 

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
    // $ANTLR end "rule__Statement__StatementAlternatives_0"


    // $ANTLR start "rule__AssertableElement__Alternatives"
    // InternalMySelenium.g:834:1: rule__AssertableElement__Alternatives : ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) );
    public final void rule__AssertableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:838:1: ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==43) ) {
                    alt6=4;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==11||(LA6_1>=15 && LA6_1<=16)||(LA6_1>=30 && LA6_1<=32)||LA6_1==35||LA6_1==37||LA6_1==42||LA6_1==45) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
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
                    // InternalMySelenium.g:839:2: ( ruleVariable )
                    {
                    // InternalMySelenium.g:839:2: ( ruleVariable )
                    // InternalMySelenium.g:840:3: ruleVariable
                    {
                     before(grammarAccess.getAssertableElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAssertableElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:845:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:845:2: ( RULE_STRING )
                    // InternalMySelenium.g:846:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:851:2: ( ruleProjection )
                    {
                    // InternalMySelenium.g:851:2: ( ruleProjection )
                    // InternalMySelenium.g:852:3: ruleProjection
                    {
                     before(grammarAccess.getAssertableElementAccess().getProjectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProjection();

                    state._fsp--;

                     after(grammarAccess.getAssertableElementAccess().getProjectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:857:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:857:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:858:3: ruleFunctionCall
                    {
                     before(grammarAccess.getAssertableElementAccess().getFunctionCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getAssertableElementAccess().getFunctionCallParserRuleCall_3()); 

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
    // $ANTLR end "rule__AssertableElement__Alternatives"


    // $ANTLR start "rule__NavigationActionType__Alternatives"
    // InternalMySelenium.g:867:1: rule__NavigationActionType__Alternatives : ( ( 'go' ) | ( 'openBrowser' ) );
    public final void rule__NavigationActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:871:1: ( ( 'go' ) | ( 'openBrowser' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:872:2: ( 'go' )
                    {
                    // InternalMySelenium.g:872:2: ( 'go' )
                    // InternalMySelenium.g:873:3: 'go'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:878:2: ( 'openBrowser' )
                    {
                    // InternalMySelenium.g:878:2: ( 'openBrowser' )
                    // InternalMySelenium.g:879:3: 'openBrowser'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getOpenBrowserKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNavigationActionTypeAccess().getOpenBrowserKeyword_1()); 

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
    // $ANTLR end "rule__NavigationActionType__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_2"
    // InternalMySelenium.g:888:1: rule__Attribute__Alternatives_2 : ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) );
    public final void rule__Attribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:892:1: ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) )
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
                    // InternalMySelenium.g:893:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    {
                    // InternalMySelenium.g:893:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    // InternalMySelenium.g:894:3: ( rule__Attribute__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getValueAssignment_2_0()); 
                    // InternalMySelenium.g:895:3: ( rule__Attribute__ValueAssignment_2_0 )
                    // InternalMySelenium.g:895:4: rule__Attribute__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:899:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    {
                    // InternalMySelenium.g:899:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    // InternalMySelenium.g:900:3: ( rule__Attribute__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getValAssignment_2_1()); 
                    // InternalMySelenium.g:901:3: ( rule__Attribute__ValAssignment_2_1 )
                    // InternalMySelenium.g:901:4: rule__Attribute__ValAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ValAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getValAssignment_2_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_2"


    // $ANTLR start "rule__DOMAttribute__Alternatives"
    // InternalMySelenium.g:909:1: rule__DOMAttribute__Alternatives : ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) );
    public final void rule__DOMAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:913:1: ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMySelenium.g:914:2: ( 'name' )
                    {
                    // InternalMySelenium.g:914:2: ( 'name' )
                    // InternalMySelenium.g:915:3: 'name'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:920:2: ( 'text' )
                    {
                    // InternalMySelenium.g:920:2: ( 'text' )
                    // InternalMySelenium.g:921:3: 'text'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:926:2: ( 'alt' )
                    {
                    // InternalMySelenium.g:926:2: ( 'alt' )
                    // InternalMySelenium.g:927:3: 'alt'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:932:2: ( 'checked' )
                    {
                    // InternalMySelenium.g:932:2: ( 'checked' )
                    // InternalMySelenium.g:933:3: 'checked'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:938:2: ( 'class' )
                    {
                    // InternalMySelenium.g:938:2: ( 'class' )
                    // InternalMySelenium.g:939:3: 'class'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 

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
    // $ANTLR end "rule__DOMAttribute__Alternatives"


    // $ANTLR start "rule__DOMElement__Alternatives"
    // InternalMySelenium.g:948:1: rule__DOMElement__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) );
    public final void rule__DOMElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:952:1: ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case 27:
                {
                alt10=7;
                }
                break;
            case 28:
                {
                alt10=8;
                }
                break;
            case 29:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:953:2: ( 'link' )
                    {
                    // InternalMySelenium.g:953:2: ( 'link' )
                    // InternalMySelenium.g:954:3: 'link'
                    {
                     before(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:959:2: ( 'button' )
                    {
                    // InternalMySelenium.g:959:2: ( 'button' )
                    // InternalMySelenium.g:960:3: 'button'
                    {
                     before(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:965:2: ( 'checkbox' )
                    {
                    // InternalMySelenium.g:965:2: ( 'checkbox' )
                    // InternalMySelenium.g:966:3: 'checkbox'
                    {
                     before(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:971:2: ( 'input' )
                    {
                    // InternalMySelenium.g:971:2: ( 'input' )
                    // InternalMySelenium.g:972:3: 'input'
                    {
                     before(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:977:2: ( 'h1' )
                    {
                    // InternalMySelenium.g:977:2: ( 'h1' )
                    // InternalMySelenium.g:978:3: 'h1'
                    {
                     before(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:983:2: ( 'body' )
                    {
                    // InternalMySelenium.g:983:2: ( 'body' )
                    // InternalMySelenium.g:984:3: 'body'
                    {
                     before(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:989:2: ( 'select' )
                    {
                    // InternalMySelenium.g:989:2: ( 'select' )
                    // InternalMySelenium.g:990:3: 'select'
                    {
                     before(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:995:2: ( 'a' )
                    {
                    // InternalMySelenium.g:995:2: ( 'a' )
                    // InternalMySelenium.g:996:3: 'a'
                    {
                     before(grammarAccess.getDOMElementAccess().getAKeyword_7()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1001:2: ( 'img' )
                    {
                    // InternalMySelenium.g:1001:2: ( 'img' )
                    // InternalMySelenium.g:1002:3: 'img'
                    {
                     before(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 

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
    // $ANTLR end "rule__DOMElement__Alternatives"


    // $ANTLR start "rule__TwoParametersActionType__Alternatives"
    // InternalMySelenium.g:1011:1: rule__TwoParametersActionType__Alternatives : ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) );
    public final void rule__TwoParametersActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1015:1: ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
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
                    // InternalMySelenium.g:1016:2: ( 'assign' )
                    {
                    // InternalMySelenium.g:1016:2: ( 'assign' )
                    // InternalMySelenium.g:1017:3: 'assign'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1022:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:1022:2: ( 'fill' )
                    // InternalMySelenium.g:1023:3: 'fill'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1028:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:1028:2: ( 'choose' )
                    // InternalMySelenium.g:1029:3: 'choose'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getChooseKeyword_2()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getChooseKeyword_2()); 

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
    // $ANTLR end "rule__TwoParametersActionType__Alternatives"


    // $ANTLR start "rule__VariableCall__Alternatives"
    // InternalMySelenium.g:1038:1: rule__VariableCall__Alternatives : ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) );
    public final void rule__VariableCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1042:1: ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMySelenium.g:1043:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    {
                    // InternalMySelenium.g:1043:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    // InternalMySelenium.g:1044:3: ( rule__VariableCall__NameAssignment_0 )
                    {
                     before(grammarAccess.getVariableCallAccess().getNameAssignment_0()); 
                    // InternalMySelenium.g:1045:3: ( rule__VariableCall__NameAssignment_0 )
                    // InternalMySelenium.g:1045:4: rule__VariableCall__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableCall__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableCallAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1049:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:1049:2: ( RULE_STRING )
                    // InternalMySelenium.g:1050:3: RULE_STRING
                    {
                     before(grammarAccess.getVariableCallAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVariableCallAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VariableCall__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMySelenium.g:1059:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1063:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMySelenium.g:1064:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMySelenium.g:1071:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1075:1: ( ( 'def' ) )
            // InternalMySelenium.g:1076:1: ( 'def' )
            {
            // InternalMySelenium.g:1076:1: ( 'def' )
            // InternalMySelenium.g:1077:2: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMySelenium.g:1086:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1090:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMySelenium.g:1091:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMySelenium.g:1098:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1102:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMySelenium.g:1103:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMySelenium.g:1103:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMySelenium.g:1104:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMySelenium.g:1105:2: ( rule__Function__NameAssignment_1 )
            // InternalMySelenium.g:1105:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMySelenium.g:1113:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1117:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMySelenium.g:1118:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMySelenium.g:1125:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1129:1: ( ( ( rule__Function__ParamsAssignment_2 )* ) )
            // InternalMySelenium.g:1130:1: ( ( rule__Function__ParamsAssignment_2 )* )
            {
            // InternalMySelenium.g:1130:1: ( ( rule__Function__ParamsAssignment_2 )* )
            // InternalMySelenium.g:1131:2: ( rule__Function__ParamsAssignment_2 )*
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalMySelenium.g:1132:2: ( rule__Function__ParamsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMySelenium.g:1132:3: rule__Function__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Function__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMySelenium.g:1140:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1144:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMySelenium.g:1145:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMySelenium.g:1152:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1156:1: ( ( '{' ) )
            // InternalMySelenium.g:1157:1: ( '{' )
            {
            // InternalMySelenium.g:1157:1: ( '{' )
            // InternalMySelenium.g:1158:2: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalMySelenium.g:1167:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1171:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMySelenium.g:1172:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalMySelenium.g:1179:1: rule__Function__Group__4__Impl : ( ( rule__Function__StatementsAssignment_4 )* ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1183:1: ( ( ( rule__Function__StatementsAssignment_4 )* ) )
            // InternalMySelenium.g:1184:1: ( ( rule__Function__StatementsAssignment_4 )* )
            {
            // InternalMySelenium.g:1184:1: ( ( rule__Function__StatementsAssignment_4 )* )
            // InternalMySelenium.g:1185:2: ( rule__Function__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 
            // InternalMySelenium.g:1186:2: ( rule__Function__StatementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==11||(LA14_0>=15 && LA14_0<=16)||(LA14_0>=30 && LA14_0<=32)||LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMySelenium.g:1186:3: rule__Function__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Function__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalMySelenium.g:1194:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1198:1: ( rule__Function__Group__5__Impl )
            // InternalMySelenium.g:1199:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalMySelenium.g:1205:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1209:1: ( ( '}' ) )
            // InternalMySelenium.g:1210:1: ( '}' )
            {
            // InternalMySelenium.g:1210:1: ( '}' )
            // InternalMySelenium.g:1211:2: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalMySelenium.g:1221:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1225:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMySelenium.g:1226:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalMySelenium.g:1233:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__RefAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1237:1: ( ( ( rule__FunctionCall__RefAssignment_0 ) ) )
            // InternalMySelenium.g:1238:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            {
            // InternalMySelenium.g:1238:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            // InternalMySelenium.g:1239:2: ( rule__FunctionCall__RefAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 
            // InternalMySelenium.g:1240:2: ( rule__FunctionCall__RefAssignment_0 )
            // InternalMySelenium.g:1240:3: rule__FunctionCall__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalMySelenium.g:1248:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1252:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMySelenium.g:1253:2: rule__FunctionCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalMySelenium.g:1259:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__ParamsAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1263:1: ( ( ( rule__FunctionCall__ParamsAssignment_1 ) ) )
            // InternalMySelenium.g:1264:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            {
            // InternalMySelenium.g:1264:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            // InternalMySelenium.g:1265:2: ( rule__FunctionCall__ParamsAssignment_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 
            // InternalMySelenium.g:1266:2: ( rule__FunctionCall__ParamsAssignment_1 )
            // InternalMySelenium.g:1266:3: rule__FunctionCall__ParamsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParamsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__Projection__Group__0"
    // InternalMySelenium.g:1275:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1279:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMySelenium.g:1280:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Projection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0"


    // $ANTLR start "rule__Projection__Group__0__Impl"
    // InternalMySelenium.g:1287:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__SelectorAssignment_0 ) ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1291:1: ( ( ( rule__Projection__SelectorAssignment_0 ) ) )
            // InternalMySelenium.g:1292:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            {
            // InternalMySelenium.g:1292:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            // InternalMySelenium.g:1293:2: ( rule__Projection__SelectorAssignment_0 )
            {
             before(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 
            // InternalMySelenium.g:1294:2: ( rule__Projection__SelectorAssignment_0 )
            // InternalMySelenium.g:1294:3: rule__Projection__SelectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Projection__SelectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0__Impl"


    // $ANTLR start "rule__Projection__Group__1"
    // InternalMySelenium.g:1302:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1306:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalMySelenium.g:1307:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Projection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1"


    // $ANTLR start "rule__Projection__Group__1__Impl"
    // InternalMySelenium.g:1314:1: rule__Projection__Group__1__Impl : ( '.' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1318:1: ( ( '.' ) )
            // InternalMySelenium.g:1319:1: ( '.' )
            {
            // InternalMySelenium.g:1319:1: ( '.' )
            // InternalMySelenium.g:1320:2: '.'
            {
             before(grammarAccess.getProjectionAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProjectionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1__Impl"


    // $ANTLR start "rule__Projection__Group__2"
    // InternalMySelenium.g:1329:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1333:1: ( rule__Projection__Group__2__Impl )
            // InternalMySelenium.g:1334:2: rule__Projection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projection__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__2"


    // $ANTLR start "rule__Projection__Group__2__Impl"
    // InternalMySelenium.g:1340:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__ProjectionActionAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1344:1: ( ( ( rule__Projection__ProjectionActionAssignment_2 ) ) )
            // InternalMySelenium.g:1345:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            {
            // InternalMySelenium.g:1345:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            // InternalMySelenium.g:1346:2: ( rule__Projection__ProjectionActionAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 
            // InternalMySelenium.g:1347:2: ( rule__Projection__ProjectionActionAssignment_2 )
            // InternalMySelenium.g:1347:3: rule__Projection__ProjectionActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Projection__ProjectionActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__2__Impl"


    // $ANTLR start "rule__AssertEquals__Group__0"
    // InternalMySelenium.g:1356:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1360:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalMySelenium.g:1361:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AssertEquals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__0"


    // $ANTLR start "rule__AssertEquals__Group__0__Impl"
    // InternalMySelenium.g:1368:1: rule__AssertEquals__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1372:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1373:1: ( 'assert' )
            {
            // InternalMySelenium.g:1373:1: ( 'assert' )
            // InternalMySelenium.g:1374:2: 'assert'
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssertEqualsAccess().getAssertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__0__Impl"


    // $ANTLR start "rule__AssertEquals__Group__1"
    // InternalMySelenium.g:1383:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1387:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalMySelenium.g:1388:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AssertEquals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__1"


    // $ANTLR start "rule__AssertEquals__Group__1__Impl"
    // InternalMySelenium.g:1395:1: rule__AssertEquals__Group__1__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1399:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) )
            // InternalMySelenium.g:1400:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            {
            // InternalMySelenium.g:1400:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            // InternalMySelenium.g:1401:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 
            // InternalMySelenium.g:1402:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            // InternalMySelenium.g:1402:3: rule__AssertEquals__AssertableElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__AssertableElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__1__Impl"


    // $ANTLR start "rule__AssertEquals__Group__2"
    // InternalMySelenium.g:1410:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1414:1: ( rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 )
            // InternalMySelenium.g:1415:2: rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AssertEquals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__2"


    // $ANTLR start "rule__AssertEquals__Group__2__Impl"
    // InternalMySelenium.g:1422:1: rule__AssertEquals__Group__2__Impl : ( ( rule__AssertEquals__OperatorAssignment_2 ) ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1426:1: ( ( ( rule__AssertEquals__OperatorAssignment_2 ) ) )
            // InternalMySelenium.g:1427:1: ( ( rule__AssertEquals__OperatorAssignment_2 ) )
            {
            // InternalMySelenium.g:1427:1: ( ( rule__AssertEquals__OperatorAssignment_2 ) )
            // InternalMySelenium.g:1428:2: ( rule__AssertEquals__OperatorAssignment_2 )
            {
             before(grammarAccess.getAssertEqualsAccess().getOperatorAssignment_2()); 
            // InternalMySelenium.g:1429:2: ( rule__AssertEquals__OperatorAssignment_2 )
            // InternalMySelenium.g:1429:3: rule__AssertEquals__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__2__Impl"


    // $ANTLR start "rule__AssertEquals__Group__3"
    // InternalMySelenium.g:1437:1: rule__AssertEquals__Group__3 : rule__AssertEquals__Group__3__Impl ;
    public final void rule__AssertEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1441:1: ( rule__AssertEquals__Group__3__Impl )
            // InternalMySelenium.g:1442:2: rule__AssertEquals__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__3"


    // $ANTLR start "rule__AssertEquals__Group__3__Impl"
    // InternalMySelenium.g:1448:1: rule__AssertEquals__Group__3__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) ;
    public final void rule__AssertEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1452:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) )
            // InternalMySelenium.g:1453:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1453:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            // InternalMySelenium.g:1454:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 
            // InternalMySelenium.g:1455:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            // InternalMySelenium.g:1455:3: rule__AssertEquals__AssertableElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__AssertableElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__3__Impl"


    // $ANTLR start "rule__AssertContains__Group__0"
    // InternalMySelenium.g:1464:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1468:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalMySelenium.g:1469:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AssertContains__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__0"


    // $ANTLR start "rule__AssertContains__Group__0__Impl"
    // InternalMySelenium.g:1476:1: rule__AssertContains__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1480:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1481:1: ( 'assert' )
            {
            // InternalMySelenium.g:1481:1: ( 'assert' )
            // InternalMySelenium.g:1482:2: 'assert'
            {
             before(grammarAccess.getAssertContainsAccess().getAssertKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getAssertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__0__Impl"


    // $ANTLR start "rule__AssertContains__Group__1"
    // InternalMySelenium.g:1491:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1495:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalMySelenium.g:1496:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AssertContains__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__1"


    // $ANTLR start "rule__AssertContains__Group__1__Impl"
    // InternalMySelenium.g:1503:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__ContainerAssignment_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1507:1: ( ( ( rule__AssertContains__ContainerAssignment_1 ) ) )
            // InternalMySelenium.g:1508:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            {
            // InternalMySelenium.g:1508:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            // InternalMySelenium.g:1509:2: ( rule__AssertContains__ContainerAssignment_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 
            // InternalMySelenium.g:1510:2: ( rule__AssertContains__ContainerAssignment_1 )
            // InternalMySelenium.g:1510:3: rule__AssertContains__ContainerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__ContainerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__1__Impl"


    // $ANTLR start "rule__AssertContains__Group__2"
    // InternalMySelenium.g:1518:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1522:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalMySelenium.g:1523:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AssertContains__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__2"


    // $ANTLR start "rule__AssertContains__Group__2__Impl"
    // InternalMySelenium.g:1530:1: rule__AssertContains__Group__2__Impl : ( ( rule__AssertContains__OperatorAssignment_2 ) ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1534:1: ( ( ( rule__AssertContains__OperatorAssignment_2 ) ) )
            // InternalMySelenium.g:1535:1: ( ( rule__AssertContains__OperatorAssignment_2 ) )
            {
            // InternalMySelenium.g:1535:1: ( ( rule__AssertContains__OperatorAssignment_2 ) )
            // InternalMySelenium.g:1536:2: ( rule__AssertContains__OperatorAssignment_2 )
            {
             before(grammarAccess.getAssertContainsAccess().getOperatorAssignment_2()); 
            // InternalMySelenium.g:1537:2: ( rule__AssertContains__OperatorAssignment_2 )
            // InternalMySelenium.g:1537:3: rule__AssertContains__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__2__Impl"


    // $ANTLR start "rule__AssertContains__Group__3"
    // InternalMySelenium.g:1545:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1549:1: ( rule__AssertContains__Group__3__Impl )
            // InternalMySelenium.g:1550:2: rule__AssertContains__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__3"


    // $ANTLR start "rule__AssertContains__Group__3__Impl"
    // InternalMySelenium.g:1556:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ElementAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1560:1: ( ( ( rule__AssertContains__ElementAssignment_3 ) ) )
            // InternalMySelenium.g:1561:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1561:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            // InternalMySelenium.g:1562:2: ( rule__AssertContains__ElementAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 
            // InternalMySelenium.g:1563:2: ( rule__AssertContains__ElementAssignment_3 )
            // InternalMySelenium.g:1563:3: rule__AssertContains__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__3__Impl"


    // $ANTLR start "rule__NavigationAction__Group__0"
    // InternalMySelenium.g:1572:1: rule__NavigationAction__Group__0 : rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 ;
    public final void rule__NavigationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1576:1: ( rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 )
            // InternalMySelenium.g:1577:2: rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__NavigationAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigationAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__Group__0"


    // $ANTLR start "rule__NavigationAction__Group__0__Impl"
    // InternalMySelenium.g:1584:1: rule__NavigationAction__Group__0__Impl : ( ( rule__NavigationAction__ActionAssignment_0 ) ) ;
    public final void rule__NavigationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1588:1: ( ( ( rule__NavigationAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1589:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1589:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1590:2: ( rule__NavigationAction__ActionAssignment_0 )
            {
             before(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1591:2: ( rule__NavigationAction__ActionAssignment_0 )
            // InternalMySelenium.g:1591:3: rule__NavigationAction__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NavigationAction__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__Group__0__Impl"


    // $ANTLR start "rule__NavigationAction__Group__1"
    // InternalMySelenium.g:1599:1: rule__NavigationAction__Group__1 : rule__NavigationAction__Group__1__Impl ;
    public final void rule__NavigationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1603:1: ( rule__NavigationAction__Group__1__Impl )
            // InternalMySelenium.g:1604:2: rule__NavigationAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__Group__1"


    // $ANTLR start "rule__NavigationAction__Group__1__Impl"
    // InternalMySelenium.g:1610:1: rule__NavigationAction__Group__1__Impl : ( ( rule__NavigationAction__ParamAssignment_1 ) ) ;
    public final void rule__NavigationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1614:1: ( ( ( rule__NavigationAction__ParamAssignment_1 ) ) )
            // InternalMySelenium.g:1615:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            {
            // InternalMySelenium.g:1615:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            // InternalMySelenium.g:1616:2: ( rule__NavigationAction__ParamAssignment_1 )
            {
             before(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 
            // InternalMySelenium.g:1617:2: ( rule__NavigationAction__ParamAssignment_1 )
            // InternalMySelenium.g:1617:3: rule__NavigationAction__ParamAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigationAction__ParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__Group__1__Impl"


    // $ANTLR start "rule__OneParameterAction__Group__0"
    // InternalMySelenium.g:1626:1: rule__OneParameterAction__Group__0 : rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 ;
    public final void rule__OneParameterAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1630:1: ( rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 )
            // InternalMySelenium.g:1631:2: rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__OneParameterAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneParameterAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__0"


    // $ANTLR start "rule__OneParameterAction__Group__0__Impl"
    // InternalMySelenium.g:1638:1: rule__OneParameterAction__Group__0__Impl : ( ( rule__OneParameterAction__ActionAssignment_0 ) ) ;
    public final void rule__OneParameterAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1642:1: ( ( ( rule__OneParameterAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1643:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1643:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1644:2: ( rule__OneParameterAction__ActionAssignment_0 )
            {
             before(grammarAccess.getOneParameterActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1645:2: ( rule__OneParameterAction__ActionAssignment_0 )
            // InternalMySelenium.g:1645:3: rule__OneParameterAction__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterAction__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOneParameterActionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__0__Impl"


    // $ANTLR start "rule__OneParameterAction__Group__1"
    // InternalMySelenium.g:1653:1: rule__OneParameterAction__Group__1 : rule__OneParameterAction__Group__1__Impl ;
    public final void rule__OneParameterAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1657:1: ( rule__OneParameterAction__Group__1__Impl )
            // InternalMySelenium.g:1658:2: rule__OneParameterAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__1"


    // $ANTLR start "rule__OneParameterAction__Group__1__Impl"
    // InternalMySelenium.g:1664:1: rule__OneParameterAction__Group__1__Impl : ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) ;
    public final void rule__OneParameterAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1668:1: ( ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) )
            // InternalMySelenium.g:1669:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            {
            // InternalMySelenium.g:1669:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            // InternalMySelenium.g:1670:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getOneParameterActionAccess().getSelectorAssignment_1()); 
            // InternalMySelenium.g:1671:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            // InternalMySelenium.g:1671:3: rule__OneParameterAction__SelectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterAction__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOneParameterActionAccess().getSelectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__1__Impl"


    // $ANTLR start "rule__TwoParametersAction__Group__0"
    // InternalMySelenium.g:1680:1: rule__TwoParametersAction__Group__0 : rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1 ;
    public final void rule__TwoParametersAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1684:1: ( rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1 )
            // InternalMySelenium.g:1685:2: rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TwoParametersAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__0"


    // $ANTLR start "rule__TwoParametersAction__Group__0__Impl"
    // InternalMySelenium.g:1692:1: rule__TwoParametersAction__Group__0__Impl : ( ( rule__TwoParametersAction__ActionAssignment_0 ) ) ;
    public final void rule__TwoParametersAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1696:1: ( ( ( rule__TwoParametersAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1697:1: ( ( rule__TwoParametersAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1697:1: ( ( rule__TwoParametersAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1698:2: ( rule__TwoParametersAction__ActionAssignment_0 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1699:2: ( rule__TwoParametersAction__ActionAssignment_0 )
            // InternalMySelenium.g:1699:3: rule__TwoParametersAction__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__0__Impl"


    // $ANTLR start "rule__TwoParametersAction__Group__1"
    // InternalMySelenium.g:1707:1: rule__TwoParametersAction__Group__1 : rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2 ;
    public final void rule__TwoParametersAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1711:1: ( rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2 )
            // InternalMySelenium.g:1712:2: rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TwoParametersAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__1"


    // $ANTLR start "rule__TwoParametersAction__Group__1__Impl"
    // InternalMySelenium.g:1719:1: rule__TwoParametersAction__Group__1__Impl : ( ( rule__TwoParametersAction__SelectorAssignment_1 ) ) ;
    public final void rule__TwoParametersAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1723:1: ( ( ( rule__TwoParametersAction__SelectorAssignment_1 ) ) )
            // InternalMySelenium.g:1724:1: ( ( rule__TwoParametersAction__SelectorAssignment_1 ) )
            {
            // InternalMySelenium.g:1724:1: ( ( rule__TwoParametersAction__SelectorAssignment_1 ) )
            // InternalMySelenium.g:1725:2: ( rule__TwoParametersAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getSelectorAssignment_1()); 
            // InternalMySelenium.g:1726:2: ( rule__TwoParametersAction__SelectorAssignment_1 )
            // InternalMySelenium.g:1726:3: rule__TwoParametersAction__SelectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionAccess().getSelectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__1__Impl"


    // $ANTLR start "rule__TwoParametersAction__Group__2"
    // InternalMySelenium.g:1734:1: rule__TwoParametersAction__Group__2 : rule__TwoParametersAction__Group__2__Impl ;
    public final void rule__TwoParametersAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1738:1: ( rule__TwoParametersAction__Group__2__Impl )
            // InternalMySelenium.g:1739:2: rule__TwoParametersAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__2"


    // $ANTLR start "rule__TwoParametersAction__Group__2__Impl"
    // InternalMySelenium.g:1745:1: rule__TwoParametersAction__Group__2__Impl : ( ( rule__TwoParametersAction__ParameterAssignment_2 ) ) ;
    public final void rule__TwoParametersAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1749:1: ( ( ( rule__TwoParametersAction__ParameterAssignment_2 ) ) )
            // InternalMySelenium.g:1750:1: ( ( rule__TwoParametersAction__ParameterAssignment_2 ) )
            {
            // InternalMySelenium.g:1750:1: ( ( rule__TwoParametersAction__ParameterAssignment_2 ) )
            // InternalMySelenium.g:1751:2: ( rule__TwoParametersAction__ParameterAssignment_2 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getParameterAssignment_2()); 
            // InternalMySelenium.g:1752:2: ( rule__TwoParametersAction__ParameterAssignment_2 )
            // InternalMySelenium.g:1752:3: rule__TwoParametersAction__ParameterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalMySelenium.g:1761:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1765:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMySelenium.g:1766:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalMySelenium.g:1773:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__ElementAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1777:1: ( ( ( rule__Selector__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:1778:1: ( ( rule__Selector__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:1778:1: ( ( rule__Selector__ElementAssignment_0 ) )
            // InternalMySelenium.g:1779:2: ( rule__Selector__ElementAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:1780:2: ( rule__Selector__ElementAssignment_0 )
            // InternalMySelenium.g:1780:3: rule__Selector__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalMySelenium.g:1788:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1792:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMySelenium.g:1793:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Selector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalMySelenium.g:1800:1: rule__Selector__Group__1__Impl : ( '[' ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1804:1: ( ( '[' ) )
            // InternalMySelenium.g:1805:1: ( '[' )
            {
            // InternalMySelenium.g:1805:1: ( '[' )
            // InternalMySelenium.g:1806:2: '['
            {
             before(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group__2"
    // InternalMySelenium.g:1815:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1819:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMySelenium.g:1820:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Selector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2"


    // $ANTLR start "rule__Selector__Group__2__Impl"
    // InternalMySelenium.g:1827:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__AttrsAssignment_2 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1831:1: ( ( ( rule__Selector__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:1832:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:1832:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            // InternalMySelenium.g:1833:2: ( rule__Selector__AttrsAssignment_2 )?
            {
             before(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:1834:2: ( rule__Selector__AttrsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13||(LA15_0>=17 && LA15_0<=20)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1834:3: rule__Selector__AttrsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__AttrsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__3"
    // InternalMySelenium.g:1842:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1846:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMySelenium.g:1847:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Selector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3"


    // $ANTLR start "rule__Selector__Group__3__Impl"
    // InternalMySelenium.g:1854:1: rule__Selector__Group__3__Impl : ( ']' ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1858:1: ( ( ']' ) )
            // InternalMySelenium.g:1859:1: ( ']' )
            {
            // InternalMySelenium.g:1859:1: ( ']' )
            // InternalMySelenium.g:1860:2: ']'
            {
             before(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3__Impl"


    // $ANTLR start "rule__Selector__Group__4"
    // InternalMySelenium.g:1869:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1873:1: ( rule__Selector__Group__4__Impl )
            // InternalMySelenium.g:1874:2: rule__Selector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4"


    // $ANTLR start "rule__Selector__Group__4__Impl"
    // InternalMySelenium.g:1880:1: rule__Selector__Group__4__Impl : ( ( '.all' )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1884:1: ( ( ( '.all' )? ) )
            // InternalMySelenium.g:1885:1: ( ( '.all' )? )
            {
            // InternalMySelenium.g:1885:1: ( ( '.all' )? )
            // InternalMySelenium.g:1886:2: ( '.all' )?
            {
             before(grammarAccess.getSelectorAccess().getAllKeyword_4()); 
            // InternalMySelenium.g:1887:2: ( '.all' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMySelenium.g:1887:3: '.all'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAllKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalMySelenium.g:1896:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1900:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalMySelenium.g:1901:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalMySelenium.g:1908:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttrsAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1912:1: ( ( ( rule__Attributes__AttrsAssignment_0 ) ) )
            // InternalMySelenium.g:1913:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            {
            // InternalMySelenium.g:1913:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            // InternalMySelenium.g:1914:2: ( rule__Attributes__AttrsAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 
            // InternalMySelenium.g:1915:2: ( rule__Attributes__AttrsAssignment_0 )
            // InternalMySelenium.g:1915:3: rule__Attributes__AttrsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttrsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalMySelenium.g:1923:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1927:1: ( rule__Attributes__Group__1__Impl )
            // InternalMySelenium.g:1928:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalMySelenium.g:1934:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1938:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalMySelenium.g:1939:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalMySelenium.g:1939:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalMySelenium.g:1940:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalMySelenium.g:1941:2: ( rule__Attributes__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMySelenium.g:1941:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1__0"
    // InternalMySelenium.g:1950:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1954:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalMySelenium.g:1955:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Attributes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__0"


    // $ANTLR start "rule__Attributes__Group_1__0__Impl"
    // InternalMySelenium.g:1962:1: rule__Attributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1966:1: ( ( ',' ) )
            // InternalMySelenium.g:1967:1: ( ',' )
            {
            // InternalMySelenium.g:1967:1: ( ',' )
            // InternalMySelenium.g:1968:2: ','
            {
             before(grammarAccess.getAttributesAccess().getCommaKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1__1"
    // InternalMySelenium.g:1977:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1981:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalMySelenium.g:1982:2: rule__Attributes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__1"


    // $ANTLR start "rule__Attributes__Group_1__1__Impl"
    // InternalMySelenium.g:1988:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttrsAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1992:1: ( ( ( rule__Attributes__AttrsAssignment_1_1 ) ) )
            // InternalMySelenium.g:1993:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            {
            // InternalMySelenium.g:1993:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            // InternalMySelenium.g:1994:2: ( rule__Attributes__AttrsAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 
            // InternalMySelenium.g:1995:2: ( rule__Attributes__AttrsAssignment_1_1 )
            // InternalMySelenium.g:1995:3: rule__Attributes__AttrsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttrsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMySelenium.g:2004:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2008:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMySelenium.g:2009:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMySelenium.g:2016:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2020:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMySelenium.g:2021:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMySelenium.g:2021:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMySelenium.g:2022:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMySelenium.g:2023:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMySelenium.g:2023:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMySelenium.g:2031:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2035:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMySelenium.g:2036:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMySelenium.g:2043:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2047:1: ( ( '=' ) )
            // InternalMySelenium.g:2048:1: ( '=' )
            {
            // InternalMySelenium.g:2048:1: ( '=' )
            // InternalMySelenium.g:2049:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMySelenium.g:2058:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2062:1: ( rule__Attribute__Group__2__Impl )
            // InternalMySelenium.g:2063:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMySelenium.g:2069:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Alternatives_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2073:1: ( ( ( rule__Attribute__Alternatives_2 ) ) )
            // InternalMySelenium.g:2074:1: ( ( rule__Attribute__Alternatives_2 ) )
            {
            // InternalMySelenium.g:2074:1: ( ( rule__Attribute__Alternatives_2 ) )
            // InternalMySelenium.g:2075:2: ( rule__Attribute__Alternatives_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_2()); 
            // InternalMySelenium.g:2076:2: ( rule__Attribute__Alternatives_2 )
            // InternalMySelenium.g:2076:3: rule__Attribute__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__0"
    // InternalMySelenium.g:2085:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2089:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // InternalMySelenium.g:2090:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FunctionParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__0"


    // $ANTLR start "rule__FunctionParameters__Group__0__Impl"
    // InternalMySelenium.g:2097:1: rule__FunctionParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2101:1: ( ( '(' ) )
            // InternalMySelenium.g:2102:1: ( '(' )
            {
            // InternalMySelenium.g:2102:1: ( '(' )
            // InternalMySelenium.g:2103:2: '('
            {
             before(grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__1"
    // InternalMySelenium.g:2112:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2116:1: ( rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 )
            // InternalMySelenium.g:2117:2: rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__FunctionParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__1"


    // $ANTLR start "rule__FunctionParameters__Group__1__Impl"
    // InternalMySelenium.g:2124:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2128:1: ( ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2129:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2129:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2130:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2131:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2131:3: rule__FunctionParameters__VariablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParameters__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__1__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__2"
    // InternalMySelenium.g:2139:1: rule__FunctionParameters__Group__2 : rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 ;
    public final void rule__FunctionParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2143:1: ( rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 )
            // InternalMySelenium.g:2144:2: rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__FunctionParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__2"


    // $ANTLR start "rule__FunctionParameters__Group__2__Impl"
    // InternalMySelenium.g:2151:1: rule__FunctionParameters__Group__2__Impl : ( ( rule__FunctionParameters__Group_2__0 )* ) ;
    public final void rule__FunctionParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2155:1: ( ( ( rule__FunctionParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2156:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2156:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            // InternalMySelenium.g:2157:2: ( rule__FunctionParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2158:2: ( rule__FunctionParameters__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMySelenium.g:2158:3: rule__FunctionParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FunctionParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFunctionParametersAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__2__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__3"
    // InternalMySelenium.g:2166:1: rule__FunctionParameters__Group__3 : rule__FunctionParameters__Group__3__Impl ;
    public final void rule__FunctionParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2170:1: ( rule__FunctionParameters__Group__3__Impl )
            // InternalMySelenium.g:2171:2: rule__FunctionParameters__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__3"


    // $ANTLR start "rule__FunctionParameters__Group__3__Impl"
    // InternalMySelenium.g:2177:1: rule__FunctionParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2181:1: ( ( ')' ) )
            // InternalMySelenium.g:2182:1: ( ')' )
            {
            // InternalMySelenium.g:2182:1: ( ')' )
            // InternalMySelenium.g:2183:2: ')'
            {
             before(grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group__3__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_2__0"
    // InternalMySelenium.g:2193:1: rule__FunctionParameters__Group_2__0 : rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 ;
    public final void rule__FunctionParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2197:1: ( rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 )
            // InternalMySelenium.g:2198:2: rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__FunctionParameters__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_2__0"


    // $ANTLR start "rule__FunctionParameters__Group_2__0__Impl"
    // InternalMySelenium.g:2205:1: rule__FunctionParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2209:1: ( ( ',' ) )
            // InternalMySelenium.g:2210:1: ( ',' )
            {
            // InternalMySelenium.g:2210:1: ( ',' )
            // InternalMySelenium.g:2211:2: ','
            {
             before(grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_2__1"
    // InternalMySelenium.g:2220:1: rule__FunctionParameters__Group_2__1 : rule__FunctionParameters__Group_2__1__Impl ;
    public final void rule__FunctionParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2224:1: ( rule__FunctionParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2225:2: rule__FunctionParameters__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParameters__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_2__1"


    // $ANTLR start "rule__FunctionParameters__Group_2__1__Impl"
    // InternalMySelenium.g:2231:1: rule__FunctionParameters__Group_2__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2235:1: ( ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2236:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2236:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2237:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2238:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2238:3: rule__FunctionParameters__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParameters__VariablesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group__0"
    // InternalMySelenium.g:2247:1: rule__FunctionCallParameters__Group__0 : rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 ;
    public final void rule__FunctionCallParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2251:1: ( rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 )
            // InternalMySelenium.g:2252:2: rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FunctionCallParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__0"


    // $ANTLR start "rule__FunctionCallParameters__Group__0__Impl"
    // InternalMySelenium.g:2259:1: rule__FunctionCallParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2263:1: ( ( '(' ) )
            // InternalMySelenium.g:2264:1: ( '(' )
            {
            // InternalMySelenium.g:2264:1: ( '(' )
            // InternalMySelenium.g:2265:2: '('
            {
             before(grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__0__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group__1"
    // InternalMySelenium.g:2274:1: rule__FunctionCallParameters__Group__1 : rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 ;
    public final void rule__FunctionCallParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2278:1: ( rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 )
            // InternalMySelenium.g:2279:2: rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__FunctionCallParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__1"


    // $ANTLR start "rule__FunctionCallParameters__Group__1__Impl"
    // InternalMySelenium.g:2286:1: rule__FunctionCallParameters__Group__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionCallParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2290:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2291:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2291:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2292:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2293:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2293:3: rule__FunctionCallParameters__VariablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__1__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group__2"
    // InternalMySelenium.g:2301:1: rule__FunctionCallParameters__Group__2 : rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 ;
    public final void rule__FunctionCallParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2305:1: ( rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 )
            // InternalMySelenium.g:2306:2: rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__FunctionCallParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__2"


    // $ANTLR start "rule__FunctionCallParameters__Group__2__Impl"
    // InternalMySelenium.g:2313:1: rule__FunctionCallParameters__Group__2__Impl : ( ( rule__FunctionCallParameters__Group_2__0 )* ) ;
    public final void rule__FunctionCallParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2317:1: ( ( ( rule__FunctionCallParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2318:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2318:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            // InternalMySelenium.g:2319:2: ( rule__FunctionCallParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2320:2: ( rule__FunctionCallParameters__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMySelenium.g:2320:3: rule__FunctionCallParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FunctionCallParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFunctionCallParametersAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__2__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group__3"
    // InternalMySelenium.g:2328:1: rule__FunctionCallParameters__Group__3 : rule__FunctionCallParameters__Group__3__Impl ;
    public final void rule__FunctionCallParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2332:1: ( rule__FunctionCallParameters__Group__3__Impl )
            // InternalMySelenium.g:2333:2: rule__FunctionCallParameters__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__3"


    // $ANTLR start "rule__FunctionCallParameters__Group__3__Impl"
    // InternalMySelenium.g:2339:1: rule__FunctionCallParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCallParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2343:1: ( ( ')' ) )
            // InternalMySelenium.g:2344:1: ( ')' )
            {
            // InternalMySelenium.g:2344:1: ( ')' )
            // InternalMySelenium.g:2345:2: ')'
            {
             before(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group__3__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group_2__0"
    // InternalMySelenium.g:2355:1: rule__FunctionCallParameters__Group_2__0 : rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 ;
    public final void rule__FunctionCallParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2359:1: ( rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 )
            // InternalMySelenium.g:2360:2: rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__FunctionCallParameters__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_2__0"


    // $ANTLR start "rule__FunctionCallParameters__Group_2__0__Impl"
    // InternalMySelenium.g:2367:1: rule__FunctionCallParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2371:1: ( ( ',' ) )
            // InternalMySelenium.g:2372:1: ( ',' )
            {
            // InternalMySelenium.g:2372:1: ( ',' )
            // InternalMySelenium.g:2373:2: ','
            {
             before(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group_2__1"
    // InternalMySelenium.g:2382:1: rule__FunctionCallParameters__Group_2__1 : rule__FunctionCallParameters__Group_2__1__Impl ;
    public final void rule__FunctionCallParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2386:1: ( rule__FunctionCallParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2387:2: rule__FunctionCallParameters__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_2__1"


    // $ANTLR start "rule__FunctionCallParameters__Group_2__1__Impl"
    // InternalMySelenium.g:2393:1: rule__FunctionCallParameters__Group_2__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionCallParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2397:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2398:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2398:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2399:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2400:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2400:3: rule__FunctionCallParameters__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__VariablesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_2__1__Impl"


    // $ANTLR start "rule__Program__FunctionsAssignment_0"
    // InternalMySelenium.g:2409:1: rule__Program__FunctionsAssignment_0 : ( ruleFunctions ) ;
    public final void rule__Program__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2413:1: ( ( ruleFunctions ) )
            // InternalMySelenium.g:2414:2: ( ruleFunctions )
            {
            // InternalMySelenium.g:2414:2: ( ruleFunctions )
            // InternalMySelenium.g:2415:3: ruleFunctions
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment_0"


    // $ANTLR start "rule__Program__StatementsAssignment_1"
    // InternalMySelenium.g:2424:1: rule__Program__StatementsAssignment_1 : ( ruleStatements ) ;
    public final void rule__Program__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2428:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:2429:2: ( ruleStatements )
            {
            // InternalMySelenium.g:2429:2: ( ruleStatements )
            // InternalMySelenium.g:2430:3: ruleStatements
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment_1"


    // $ANTLR start "rule__Functions__FunctionsAssignment"
    // InternalMySelenium.g:2439:1: rule__Functions__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Functions__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2443:1: ( ( ruleFunction ) )
            // InternalMySelenium.g:2444:2: ( ruleFunction )
            {
            // InternalMySelenium.g:2444:2: ( ruleFunction )
            // InternalMySelenium.g:2445:3: ruleFunction
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__FunctionsAssignment"


    // $ANTLR start "rule__Statements__StatementsAssignment"
    // InternalMySelenium.g:2454:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2458:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:2459:2: ( ruleStatement )
            {
            // InternalMySelenium.g:2459:2: ( ruleStatement )
            // InternalMySelenium.g:2460:3: ruleStatement
            {
             before(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__StatementsAssignment"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalMySelenium.g:2469:1: rule__Function__NameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2473:1: ( ( ruleFunctionName ) )
            // InternalMySelenium.g:2474:2: ( ruleFunctionName )
            {
            // InternalMySelenium.g:2474:2: ( ruleFunctionName )
            // InternalMySelenium.g:2475:3: ruleFunctionName
            {
             before(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ParamsAssignment_2"
    // InternalMySelenium.g:2484:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2488:1: ( ( ruleFunctionParameters ) )
            // InternalMySelenium.g:2489:2: ( ruleFunctionParameters )
            {
            // InternalMySelenium.g:2489:2: ( ruleFunctionParameters )
            // InternalMySelenium.g:2490:3: ruleFunctionParameters
            {
             before(grammarAccess.getFunctionAccess().getParamsFunctionParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionParameters();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParamsFunctionParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParamsAssignment_2"


    // $ANTLR start "rule__Function__StatementsAssignment_4"
    // InternalMySelenium.g:2499:1: rule__Function__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Function__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2503:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:2504:2: ( ruleStatement )
            {
            // InternalMySelenium.g:2504:2: ( ruleStatement )
            // InternalMySelenium.g:2505:3: ruleStatement
            {
             before(grammarAccess.getFunctionAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__StatementsAssignment_4"


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMySelenium.g:2514:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2518:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:2519:2: ( RULE_ID )
            {
            // InternalMySelenium.g:2519:2: ( RULE_ID )
            // InternalMySelenium.g:2520:3: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionName__NameAssignment"


    // $ANTLR start "rule__FunctionCall__RefAssignment_0"
    // InternalMySelenium.g:2529:1: rule__FunctionCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2533:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2534:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2534:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2535:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 
            // InternalMySelenium.g:2536:3: ( RULE_ID )
            // InternalMySelenium.g:2537:4: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRefFunctionNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__RefAssignment_0"


    // $ANTLR start "rule__FunctionCall__ParamsAssignment_1"
    // InternalMySelenium.g:2548:1: rule__FunctionCall__ParamsAssignment_1 : ( ruleFunctionCallParameters ) ;
    public final void rule__FunctionCall__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2552:1: ( ( ruleFunctionCallParameters ) )
            // InternalMySelenium.g:2553:2: ( ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:2553:2: ( ruleFunctionCallParameters )
            // InternalMySelenium.g:2554:3: ruleFunctionCallParameters
            {
             before(grammarAccess.getFunctionCallAccess().getParamsFunctionCallParametersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionCallParameters();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParamsFunctionCallParametersParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParamsAssignment_1"


    // $ANTLR start "rule__Projection__SelectorAssignment_0"
    // InternalMySelenium.g:2563:1: rule__Projection__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Projection__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2567:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2568:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2568:2: ( ruleSelector )
            // InternalMySelenium.g:2569:3: ruleSelector
            {
             before(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getProjectionAccess().getSelectorSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__SelectorAssignment_0"


    // $ANTLR start "rule__Projection__ProjectionActionAssignment_2"
    // InternalMySelenium.g:2578:1: rule__Projection__ProjectionActionAssignment_2 : ( ruleProjectionAction ) ;
    public final void rule__Projection__ProjectionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2582:1: ( ( ruleProjectionAction ) )
            // InternalMySelenium.g:2583:2: ( ruleProjectionAction )
            {
            // InternalMySelenium.g:2583:2: ( ruleProjectionAction )
            // InternalMySelenium.g:2584:3: ruleProjectionAction
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionProjectionActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectionAction();

            state._fsp--;

             after(grammarAccess.getProjectionAccess().getProjectionActionProjectionActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__ProjectionActionAssignment_2"


    // $ANTLR start "rule__Statement__StatementAssignment"
    // InternalMySelenium.g:2593:1: rule__Statement__StatementAssignment : ( ( rule__Statement__StatementAlternatives_0 ) ) ;
    public final void rule__Statement__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2597:1: ( ( ( rule__Statement__StatementAlternatives_0 ) ) )
            // InternalMySelenium.g:2598:2: ( ( rule__Statement__StatementAlternatives_0 ) )
            {
            // InternalMySelenium.g:2598:2: ( ( rule__Statement__StatementAlternatives_0 ) )
            // InternalMySelenium.g:2599:3: ( rule__Statement__StatementAlternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementAlternatives_0()); 
            // InternalMySelenium.g:2600:3: ( rule__Statement__StatementAlternatives_0 )
            // InternalMySelenium.g:2600:4: rule__Statement__StatementAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment"


    // $ANTLR start "rule__AssertEquals__AssertableElementAssignment_1"
    // InternalMySelenium.g:2608:1: rule__AssertEquals__AssertableElementAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2612:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2613:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2613:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2614:3: ruleAssertableElement
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertableElement();

            state._fsp--;

             after(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__AssertableElementAssignment_1"


    // $ANTLR start "rule__AssertEquals__OperatorAssignment_2"
    // InternalMySelenium.g:2623:1: rule__AssertEquals__OperatorAssignment_2 : ( ( '=' ) ) ;
    public final void rule__AssertEquals__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2627:1: ( ( ( '=' ) ) )
            // InternalMySelenium.g:2628:2: ( ( '=' ) )
            {
            // InternalMySelenium.g:2628:2: ( ( '=' ) )
            // InternalMySelenium.g:2629:3: ( '=' )
            {
             before(grammarAccess.getAssertEqualsAccess().getOperatorEqualsSignKeyword_2_0()); 
            // InternalMySelenium.g:2630:3: ( '=' )
            // InternalMySelenium.g:2631:4: '='
            {
             before(grammarAccess.getAssertEqualsAccess().getOperatorEqualsSignKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAssertEqualsAccess().getOperatorEqualsSignKeyword_2_0()); 

            }

             after(grammarAccess.getAssertEqualsAccess().getOperatorEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__OperatorAssignment_2"


    // $ANTLR start "rule__AssertEquals__AssertableElementAssignment_3"
    // InternalMySelenium.g:2642:1: rule__AssertEquals__AssertableElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2646:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2647:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2647:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2648:3: ruleAssertableElement
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertableElement();

            state._fsp--;

             after(grammarAccess.getAssertEqualsAccess().getAssertableElementAssertableElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__AssertableElementAssignment_3"


    // $ANTLR start "rule__AssertContains__ContainerAssignment_1"
    // InternalMySelenium.g:2657:1: rule__AssertContains__ContainerAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2661:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2662:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2662:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2663:3: ruleAssertableElement
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertableElement();

            state._fsp--;

             after(grammarAccess.getAssertContainsAccess().getContainerAssertableElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__ContainerAssignment_1"


    // $ANTLR start "rule__AssertContains__OperatorAssignment_2"
    // InternalMySelenium.g:2672:1: rule__AssertContains__OperatorAssignment_2 : ( ( 'contains' ) ) ;
    public final void rule__AssertContains__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2676:1: ( ( ( 'contains' ) ) )
            // InternalMySelenium.g:2677:2: ( ( 'contains' ) )
            {
            // InternalMySelenium.g:2677:2: ( ( 'contains' ) )
            // InternalMySelenium.g:2678:3: ( 'contains' )
            {
             before(grammarAccess.getAssertContainsAccess().getOperatorContainsKeyword_2_0()); 
            // InternalMySelenium.g:2679:3: ( 'contains' )
            // InternalMySelenium.g:2680:4: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getOperatorContainsKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getOperatorContainsKeyword_2_0()); 

            }

             after(grammarAccess.getAssertContainsAccess().getOperatorContainsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__OperatorAssignment_2"


    // $ANTLR start "rule__AssertContains__ElementAssignment_3"
    // InternalMySelenium.g:2691:1: rule__AssertContains__ElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2695:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2696:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2696:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2697:3: ruleAssertableElement
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssertableElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertableElement();

            state._fsp--;

             after(grammarAccess.getAssertContainsAccess().getElementAssertableElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__ElementAssignment_3"


    // $ANTLR start "rule__NavigationAction__ActionAssignment_0"
    // InternalMySelenium.g:2706:1: rule__NavigationAction__ActionAssignment_0 : ( ruleNavigationActionType ) ;
    public final void rule__NavigationAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2710:1: ( ( ruleNavigationActionType ) )
            // InternalMySelenium.g:2711:2: ( ruleNavigationActionType )
            {
            // InternalMySelenium.g:2711:2: ( ruleNavigationActionType )
            // InternalMySelenium.g:2712:3: ruleNavigationActionType
            {
             before(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigationActionType();

            state._fsp--;

             after(grammarAccess.getNavigationActionAccess().getActionNavigationActionTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__ActionAssignment_0"


    // $ANTLR start "rule__NavigationAction__ParamAssignment_1"
    // InternalMySelenium.g:2721:1: rule__NavigationAction__ParamAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NavigationAction__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2725:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2726:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2726:2: ( RULE_STRING )
            // InternalMySelenium.g:2727:3: RULE_STRING
            {
             before(grammarAccess.getNavigationActionAccess().getParamSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNavigationActionAccess().getParamSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationAction__ParamAssignment_1"


    // $ANTLR start "rule__OneParameterAction__ActionAssignment_0"
    // InternalMySelenium.g:2736:1: rule__OneParameterAction__ActionAssignment_0 : ( ruleOneParameterActionType ) ;
    public final void rule__OneParameterAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2740:1: ( ( ruleOneParameterActionType ) )
            // InternalMySelenium.g:2741:2: ( ruleOneParameterActionType )
            {
            // InternalMySelenium.g:2741:2: ( ruleOneParameterActionType )
            // InternalMySelenium.g:2742:3: ruleOneParameterActionType
            {
             before(grammarAccess.getOneParameterActionAccess().getActionOneParameterActionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOneParameterActionType();

            state._fsp--;

             after(grammarAccess.getOneParameterActionAccess().getActionOneParameterActionTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__ActionAssignment_0"


    // $ANTLR start "rule__OneParameterAction__SelectorAssignment_1"
    // InternalMySelenium.g:2751:1: rule__OneParameterAction__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__OneParameterAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2755:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2756:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2756:2: ( ruleSelector )
            // InternalMySelenium.g:2757:3: ruleSelector
            {
             before(grammarAccess.getOneParameterActionAccess().getSelectorSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getOneParameterActionAccess().getSelectorSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__SelectorAssignment_1"


    // $ANTLR start "rule__TwoParametersAction__ActionAssignment_0"
    // InternalMySelenium.g:2766:1: rule__TwoParametersAction__ActionAssignment_0 : ( ruleTwoParametersActionType ) ;
    public final void rule__TwoParametersAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2770:1: ( ( ruleTwoParametersActionType ) )
            // InternalMySelenium.g:2771:2: ( ruleTwoParametersActionType )
            {
            // InternalMySelenium.g:2771:2: ( ruleTwoParametersActionType )
            // InternalMySelenium.g:2772:3: ruleTwoParametersActionType
            {
             before(grammarAccess.getTwoParametersActionAccess().getActionTwoParametersActionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTwoParametersActionType();

            state._fsp--;

             after(grammarAccess.getTwoParametersActionAccess().getActionTwoParametersActionTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__ActionAssignment_0"


    // $ANTLR start "rule__TwoParametersAction__SelectorAssignment_1"
    // InternalMySelenium.g:2781:1: rule__TwoParametersAction__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__TwoParametersAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2785:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2786:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2786:2: ( ruleSelector )
            // InternalMySelenium.g:2787:3: ruleSelector
            {
             before(grammarAccess.getTwoParametersActionAccess().getSelectorSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getTwoParametersActionAccess().getSelectorSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__SelectorAssignment_1"


    // $ANTLR start "rule__TwoParametersAction__ParameterAssignment_2"
    // InternalMySelenium.g:2796:1: rule__TwoParametersAction__ParameterAssignment_2 : ( ruleSelector ) ;
    public final void rule__TwoParametersAction__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2800:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2801:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2801:2: ( ruleSelector )
            // InternalMySelenium.g:2802:3: ruleSelector
            {
             before(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParametersAction__ParameterAssignment_2"


    // $ANTLR start "rule__Selector__ElementAssignment_0"
    // InternalMySelenium.g:2811:1: rule__Selector__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Selector__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2815:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:2816:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:2816:2: ( ruleDOMElement )
            // InternalMySelenium.g:2817:3: ruleDOMElement
            {
             before(grammarAccess.getSelectorAccess().getElementDOMElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMElement();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getElementDOMElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ElementAssignment_0"


    // $ANTLR start "rule__Selector__AttrsAssignment_2"
    // InternalMySelenium.g:2826:1: rule__Selector__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2830:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:2831:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:2831:2: ( ruleAttributes )
            // InternalMySelenium.g:2832:3: ruleAttributes
            {
             before(grammarAccess.getSelectorAccess().getAttrsAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getAttrsAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__AttrsAssignment_2"


    // $ANTLR start "rule__Attributes__AttrsAssignment_0"
    // InternalMySelenium.g:2841:1: rule__Attributes__AttrsAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2845:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2846:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2846:2: ( ruleAttribute )
            // InternalMySelenium.g:2847:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttrsAssignment_0"


    // $ANTLR start "rule__Attributes__AttrsAssignment_1_1"
    // InternalMySelenium.g:2856:1: rule__Attributes__AttrsAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2860:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2861:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2861:2: ( ruleAttribute )
            // InternalMySelenium.g:2862:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttrsAssignment_1_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalMySelenium.g:2871:1: rule__Attribute__NameAssignment_0 : ( ruleDOMAttribute ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2875:1: ( ( ruleDOMAttribute ) )
            // InternalMySelenium.g:2876:2: ( ruleDOMAttribute )
            {
            // InternalMySelenium.g:2876:2: ( ruleDOMAttribute )
            // InternalMySelenium.g:2877:3: ruleDOMAttribute
            {
             before(grammarAccess.getAttributeAccess().getNameDOMAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameDOMAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2_0"
    // InternalMySelenium.g:2886:1: rule__Attribute__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2890:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2891:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2891:2: ( RULE_STRING )
            // InternalMySelenium.g:2892:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2_0"


    // $ANTLR start "rule__Attribute__ValAssignment_2_1"
    // InternalMySelenium.g:2901:1: rule__Attribute__ValAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2905:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2906:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2906:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2907:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0()); 
            // InternalMySelenium.g:2908:3: ( RULE_ID )
            // InternalMySelenium.g:2909:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getValVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValAssignment_2_1"


    // $ANTLR start "rule__FunctionParameters__VariablesAssignment_1"
    // InternalMySelenium.g:2920:1: rule__FunctionParameters__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2924:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2925:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2925:2: ( ruleVariable )
            // InternalMySelenium.g:2926:3: ruleVariable
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__VariablesAssignment_1"


    // $ANTLR start "rule__FunctionParameters__VariablesAssignment_2_1"
    // InternalMySelenium.g:2935:1: rule__FunctionParameters__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2939:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2940:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2940:2: ( ruleVariable )
            // InternalMySelenium.g:2941:3: ruleVariable
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFunctionParametersAccess().getVariablesVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__VariablesAssignment_2_1"


    // $ANTLR start "rule__FunctionCallParameters__VariablesAssignment_1"
    // InternalMySelenium.g:2950:1: rule__FunctionCallParameters__VariablesAssignment_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2954:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2955:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2955:2: ( ruleVariableCall )
            // InternalMySelenium.g:2956:3: ruleVariableCall
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__VariablesAssignment_1"


    // $ANTLR start "rule__FunctionCallParameters__VariablesAssignment_2_1"
    // InternalMySelenium.g:2965:1: rule__FunctionCallParameters__VariablesAssignment_2_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2969:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2970:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2970:2: ( ruleVariableCall )
            // InternalMySelenium.g:2971:3: ruleVariableCall
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__VariablesAssignment_2_1"


    // $ANTLR start "rule__VariableCall__NameAssignment_0"
    // InternalMySelenium.g:2980:1: rule__VariableCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2984:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2985:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2985:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2986:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0()); 
            // InternalMySelenium.g:2987:3: ( RULE_ID )
            // InternalMySelenium.g:2988:4: RULE_ID
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__NameAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalMySelenium.g:2999:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3003:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3004:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3004:2: ( RULE_ID )
            // InternalMySelenium.g:3005:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\62\uffff";
    static final String dfa_2s = "\1\5\3\uffff\1\4\1\uffff\2\52\11\46\1\uffff\1\4\1\uffff\1\15\2\51\5\52\1\44\1\4\1\52\1\4\1\44\1\14\2\51\2\47\3\52\1\15\5\52\1\4\2\47";
    static final String dfa_3s = "\1\45\3\uffff\1\35\1\uffff\2\55\11\46\1\uffff\1\5\1\uffff\1\47\2\54\5\52\1\50\1\5\1\55\1\5\1\44\1\16\2\54\2\51\3\55\1\24\5\52\1\5\2\51";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\13\uffff\1\4\1\uffff\1\5\36\uffff";
    static final String dfa_5s = "\62\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\3\uffff\2\5\15\uffff\3\2\4\uffff\1\4",
            "",
            "",
            "",
            "\1\7\1\6\17\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "",
            "\1\21\1\22\1\uffff\1\23",
            "\1\21\2\uffff\1\23",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "",
            "\1\26\1\25",
            "",
            "\1\30\3\uffff\1\27\1\31\1\32\1\33\22\uffff\1\34",
            "\1\35\2\uffff\1\36",
            "\1\35\2\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\41\3\uffff\1\40",
            "\1\43\1\42",
            "\1\21\2\uffff\1\23",
            "\1\44\1\45",
            "\1\41",
            "\1\46\1\47\1\50",
            "\1\35\2\uffff\1\36",
            "\1\35\2\uffff\1\36",
            "\1\34\1\uffff\1\51",
            "\1\34\1\uffff\1\51",
            "\1\21\2\uffff\1\23",
            "\1\21\2\uffff\1\23",
            "\1\21\2\uffff\1\23",
            "\1\53\3\uffff\1\52\1\54\1\55\1\56",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\60\1\61",
            "\1\34\1\uffff\1\51",
            "\1\34\1\uffff\1\51"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "789:1: rule__Statement__StatementAlternatives_0 : ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000021C0018822L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000029C0018820L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003FE00030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003FE00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000080001E2000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001E2000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000120000000000L});

}