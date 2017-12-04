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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'value'", "'text'", "'html'", "'go'", "'openBrowser'", "'name'", "'alt'", "'checked'", "'class'", "'id'", "'type'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'div'", "'click'", "'fill'", "'choose'", "'count'", "'def'", "'main'", "'{'", "'}'", "'.'", "'assert'", "'='", "'contains'", "'assign'", "'['", "']'", "'.parent'", "'('", "')'", "','", "'.all'"
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
    // InternalMySelenium.g:87:1: ruleFunctions : ( ( rule__Functions__Group__0 ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:91:2: ( ( ( rule__Functions__Group__0 ) ) )
            // InternalMySelenium.g:92:2: ( ( rule__Functions__Group__0 ) )
            {
            // InternalMySelenium.g:92:2: ( ( rule__Functions__Group__0 ) )
            // InternalMySelenium.g:93:3: ( rule__Functions__Group__0 )
            {
             before(grammarAccess.getFunctionsAccess().getGroup()); 
            // InternalMySelenium.g:94:3: ( rule__Functions__Group__0 )
            // InternalMySelenium.g:94:4: rule__Functions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getGroup()); 

            }


            }

        }
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
    // InternalMySelenium.g:103:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalMySelenium.g:104:1: ( ruleStatements EOF )
            // InternalMySelenium.g:105:1: ruleStatements EOF
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
    // InternalMySelenium.g:112:1: ruleStatements : ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:116:2: ( ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) ) )
            // InternalMySelenium.g:117:2: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            {
            // InternalMySelenium.g:117:2: ( ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* ) )
            // InternalMySelenium.g:118:3: ( ( rule__Statements__StatementsAssignment ) ) ( ( rule__Statements__StatementsAssignment )* )
            {
            // InternalMySelenium.g:118:3: ( ( rule__Statements__StatementsAssignment ) )
            // InternalMySelenium.g:119:4: ( rule__Statements__StatementsAssignment )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // InternalMySelenium.g:120:4: ( rule__Statements__StatementsAssignment )
            // InternalMySelenium.g:120:5: rule__Statements__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Statements__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment()); 

            }

            // InternalMySelenium.g:123:3: ( ( rule__Statements__StatementsAssignment )* )
            // InternalMySelenium.g:124:4: ( rule__Statements__StatementsAssignment )*
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment()); 
            // InternalMySelenium.g:125:4: ( rule__Statements__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=32 && LA1_0<=35)||LA1_0==41||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMySelenium.g:125:5: rule__Statements__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Statements__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleMainFunction"
    // InternalMySelenium.g:135:1: entryRuleMainFunction : ruleMainFunction EOF ;
    public final void entryRuleMainFunction() throws RecognitionException {
        try {
            // InternalMySelenium.g:136:1: ( ruleMainFunction EOF )
            // InternalMySelenium.g:137:1: ruleMainFunction EOF
            {
             before(grammarAccess.getMainFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleMainFunction();

            state._fsp--;

             after(grammarAccess.getMainFunctionRule()); 
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
    // $ANTLR end "entryRuleMainFunction"


    // $ANTLR start "ruleMainFunction"
    // InternalMySelenium.g:144:1: ruleMainFunction : ( ( rule__MainFunction__Group__0 ) ) ;
    public final void ruleMainFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:148:2: ( ( ( rule__MainFunction__Group__0 ) ) )
            // InternalMySelenium.g:149:2: ( ( rule__MainFunction__Group__0 ) )
            {
            // InternalMySelenium.g:149:2: ( ( rule__MainFunction__Group__0 ) )
            // InternalMySelenium.g:150:3: ( rule__MainFunction__Group__0 )
            {
             before(grammarAccess.getMainFunctionAccess().getGroup()); 
            // InternalMySelenium.g:151:3: ( rule__MainFunction__Group__0 )
            // InternalMySelenium.g:151:4: rule__MainFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainFunction"


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:160:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMySelenium.g:161:1: ( ruleFunction EOF )
            // InternalMySelenium.g:162:1: ruleFunction EOF
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
    // InternalMySelenium.g:169:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:173:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMySelenium.g:174:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMySelenium.g:174:2: ( ( rule__Function__Group__0 ) )
            // InternalMySelenium.g:175:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMySelenium.g:176:3: ( rule__Function__Group__0 )
            // InternalMySelenium.g:176:4: rule__Function__Group__0
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
    // InternalMySelenium.g:185:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMySelenium.g:186:1: ( ruleFunctionName EOF )
            // InternalMySelenium.g:187:1: ruleFunctionName EOF
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
    // InternalMySelenium.g:194:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:198:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMySelenium.g:199:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMySelenium.g:199:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMySelenium.g:200:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMySelenium.g:201:3: ( rule__FunctionName__NameAssignment )
            // InternalMySelenium.g:201:4: rule__FunctionName__NameAssignment
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
    // InternalMySelenium.g:210:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:211:1: ( ruleFunctionCall EOF )
            // InternalMySelenium.g:212:1: ruleFunctionCall EOF
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
    // InternalMySelenium.g:219:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:223:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMySelenium.g:224:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMySelenium.g:224:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMySelenium.g:225:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMySelenium.g:226:3: ( rule__FunctionCall__Group__0 )
            // InternalMySelenium.g:226:4: rule__FunctionCall__Group__0
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
    // InternalMySelenium.g:235:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // InternalMySelenium.g:236:1: ( ruleProjection EOF )
            // InternalMySelenium.g:237:1: ruleProjection EOF
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
    // InternalMySelenium.g:244:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:248:2: ( ( ( rule__Projection__Group__0 ) ) )
            // InternalMySelenium.g:249:2: ( ( rule__Projection__Group__0 ) )
            {
            // InternalMySelenium.g:249:2: ( ( rule__Projection__Group__0 ) )
            // InternalMySelenium.g:250:3: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // InternalMySelenium.g:251:3: ( rule__Projection__Group__0 )
            // InternalMySelenium.g:251:4: rule__Projection__Group__0
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
    // InternalMySelenium.g:260:1: entryRuleProjectionAction : ruleProjectionAction EOF ;
    public final void entryRuleProjectionAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:261:1: ( ruleProjectionAction EOF )
            // InternalMySelenium.g:262:1: ruleProjectionAction EOF
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
    // InternalMySelenium.g:269:1: ruleProjectionAction : ( ( rule__ProjectionAction__Alternatives ) ) ;
    public final void ruleProjectionAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:273:2: ( ( ( rule__ProjectionAction__Alternatives ) ) )
            // InternalMySelenium.g:274:2: ( ( rule__ProjectionAction__Alternatives ) )
            {
            // InternalMySelenium.g:274:2: ( ( rule__ProjectionAction__Alternatives ) )
            // InternalMySelenium.g:275:3: ( rule__ProjectionAction__Alternatives )
            {
             before(grammarAccess.getProjectionActionAccess().getAlternatives()); 
            // InternalMySelenium.g:276:3: ( rule__ProjectionAction__Alternatives )
            // InternalMySelenium.g:276:4: rule__ProjectionAction__Alternatives
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
    // InternalMySelenium.g:285:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMySelenium.g:286:1: ( ruleStatement EOF )
            // InternalMySelenium.g:287:1: ruleStatement EOF
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
    // InternalMySelenium.g:294:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:298:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMySelenium.g:299:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMySelenium.g:299:2: ( ( rule__Statement__Alternatives ) )
            // InternalMySelenium.g:300:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMySelenium.g:301:3: ( rule__Statement__Alternatives )
            // InternalMySelenium.g:301:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMySelenium.g:310:1: entryRuleAssertEquals : ruleAssertEquals EOF ;
    public final void entryRuleAssertEquals() throws RecognitionException {
        try {
            // InternalMySelenium.g:311:1: ( ruleAssertEquals EOF )
            // InternalMySelenium.g:312:1: ruleAssertEquals EOF
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
    // InternalMySelenium.g:319:1: ruleAssertEquals : ( ( rule__AssertEquals__Group__0 ) ) ;
    public final void ruleAssertEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:323:2: ( ( ( rule__AssertEquals__Group__0 ) ) )
            // InternalMySelenium.g:324:2: ( ( rule__AssertEquals__Group__0 ) )
            {
            // InternalMySelenium.g:324:2: ( ( rule__AssertEquals__Group__0 ) )
            // InternalMySelenium.g:325:3: ( rule__AssertEquals__Group__0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getGroup()); 
            // InternalMySelenium.g:326:3: ( rule__AssertEquals__Group__0 )
            // InternalMySelenium.g:326:4: rule__AssertEquals__Group__0
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
    // InternalMySelenium.g:335:1: entryRuleAssertContains : ruleAssertContains EOF ;
    public final void entryRuleAssertContains() throws RecognitionException {
        try {
            // InternalMySelenium.g:336:1: ( ruleAssertContains EOF )
            // InternalMySelenium.g:337:1: ruleAssertContains EOF
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
    // InternalMySelenium.g:344:1: ruleAssertContains : ( ( rule__AssertContains__Group__0 ) ) ;
    public final void ruleAssertContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:348:2: ( ( ( rule__AssertContains__Group__0 ) ) )
            // InternalMySelenium.g:349:2: ( ( rule__AssertContains__Group__0 ) )
            {
            // InternalMySelenium.g:349:2: ( ( rule__AssertContains__Group__0 ) )
            // InternalMySelenium.g:350:3: ( rule__AssertContains__Group__0 )
            {
             before(grammarAccess.getAssertContainsAccess().getGroup()); 
            // InternalMySelenium.g:351:3: ( rule__AssertContains__Group__0 )
            // InternalMySelenium.g:351:4: rule__AssertContains__Group__0
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
    // InternalMySelenium.g:360:1: entryRuleAssertableElement : ruleAssertableElement EOF ;
    public final void entryRuleAssertableElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:361:1: ( ruleAssertableElement EOF )
            // InternalMySelenium.g:362:1: ruleAssertableElement EOF
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
    // InternalMySelenium.g:369:1: ruleAssertableElement : ( ( rule__AssertableElement__Alternatives ) ) ;
    public final void ruleAssertableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:373:2: ( ( ( rule__AssertableElement__Alternatives ) ) )
            // InternalMySelenium.g:374:2: ( ( rule__AssertableElement__Alternatives ) )
            {
            // InternalMySelenium.g:374:2: ( ( rule__AssertableElement__Alternatives ) )
            // InternalMySelenium.g:375:3: ( rule__AssertableElement__Alternatives )
            {
             before(grammarAccess.getAssertableElementAccess().getAlternatives()); 
            // InternalMySelenium.g:376:3: ( rule__AssertableElement__Alternatives )
            // InternalMySelenium.g:376:4: rule__AssertableElement__Alternatives
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
    // InternalMySelenium.g:385:1: entryRuleNavigationAction : ruleNavigationAction EOF ;
    public final void entryRuleNavigationAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:386:1: ( ruleNavigationAction EOF )
            // InternalMySelenium.g:387:1: ruleNavigationAction EOF
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
    // InternalMySelenium.g:394:1: ruleNavigationAction : ( ( rule__NavigationAction__Group__0 ) ) ;
    public final void ruleNavigationAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:398:2: ( ( ( rule__NavigationAction__Group__0 ) ) )
            // InternalMySelenium.g:399:2: ( ( rule__NavigationAction__Group__0 ) )
            {
            // InternalMySelenium.g:399:2: ( ( rule__NavigationAction__Group__0 ) )
            // InternalMySelenium.g:400:3: ( rule__NavigationAction__Group__0 )
            {
             before(grammarAccess.getNavigationActionAccess().getGroup()); 
            // InternalMySelenium.g:401:3: ( rule__NavigationAction__Group__0 )
            // InternalMySelenium.g:401:4: rule__NavigationAction__Group__0
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
    // InternalMySelenium.g:410:1: entryRuleNavigationActionType : ruleNavigationActionType EOF ;
    public final void entryRuleNavigationActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:411:1: ( ruleNavigationActionType EOF )
            // InternalMySelenium.g:412:1: ruleNavigationActionType EOF
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
    // InternalMySelenium.g:419:1: ruleNavigationActionType : ( ( rule__NavigationActionType__Alternatives ) ) ;
    public final void ruleNavigationActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:423:2: ( ( ( rule__NavigationActionType__Alternatives ) ) )
            // InternalMySelenium.g:424:2: ( ( rule__NavigationActionType__Alternatives ) )
            {
            // InternalMySelenium.g:424:2: ( ( rule__NavigationActionType__Alternatives ) )
            // InternalMySelenium.g:425:3: ( rule__NavigationActionType__Alternatives )
            {
             before(grammarAccess.getNavigationActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:426:3: ( rule__NavigationActionType__Alternatives )
            // InternalMySelenium.g:426:4: rule__NavigationActionType__Alternatives
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


    // $ANTLR start "entryRuleAction"
    // InternalMySelenium.g:435:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:436:1: ( ruleAction EOF )
            // InternalMySelenium.g:437:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMySelenium.g:444:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:448:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMySelenium.g:449:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMySelenium.g:449:2: ( ( rule__Action__Group__0 ) )
            // InternalMySelenium.g:450:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMySelenium.g:451:3: ( rule__Action__Group__0 )
            // InternalMySelenium.g:451:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAssignAction"
    // InternalMySelenium.g:460:1: entryRuleAssignAction : ruleAssignAction EOF ;
    public final void entryRuleAssignAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:461:1: ( ruleAssignAction EOF )
            // InternalMySelenium.g:462:1: ruleAssignAction EOF
            {
             before(grammarAccess.getAssignActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignAction();

            state._fsp--;

             after(grammarAccess.getAssignActionRule()); 
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
    // $ANTLR end "entryRuleAssignAction"


    // $ANTLR start "ruleAssignAction"
    // InternalMySelenium.g:469:1: ruleAssignAction : ( ( rule__AssignAction__Group__0 ) ) ;
    public final void ruleAssignAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:473:2: ( ( ( rule__AssignAction__Group__0 ) ) )
            // InternalMySelenium.g:474:2: ( ( rule__AssignAction__Group__0 ) )
            {
            // InternalMySelenium.g:474:2: ( ( rule__AssignAction__Group__0 ) )
            // InternalMySelenium.g:475:3: ( rule__AssignAction__Group__0 )
            {
             before(grammarAccess.getAssignActionAccess().getGroup()); 
            // InternalMySelenium.g:476:3: ( rule__AssignAction__Group__0 )
            // InternalMySelenium.g:476:4: rule__AssignAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignAction"


    // $ANTLR start "entryRuleActionTarget"
    // InternalMySelenium.g:485:1: entryRuleActionTarget : ruleActionTarget EOF ;
    public final void entryRuleActionTarget() throws RecognitionException {
        try {
            // InternalMySelenium.g:486:1: ( ruleActionTarget EOF )
            // InternalMySelenium.g:487:1: ruleActionTarget EOF
            {
             before(grammarAccess.getActionTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleActionTarget();

            state._fsp--;

             after(grammarAccess.getActionTargetRule()); 
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
    // $ANTLR end "entryRuleActionTarget"


    // $ANTLR start "ruleActionTarget"
    // InternalMySelenium.g:494:1: ruleActionTarget : ( ( rule__ActionTarget__Alternatives ) ) ;
    public final void ruleActionTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:498:2: ( ( ( rule__ActionTarget__Alternatives ) ) )
            // InternalMySelenium.g:499:2: ( ( rule__ActionTarget__Alternatives ) )
            {
            // InternalMySelenium.g:499:2: ( ( rule__ActionTarget__Alternatives ) )
            // InternalMySelenium.g:500:3: ( rule__ActionTarget__Alternatives )
            {
             before(grammarAccess.getActionTargetAccess().getAlternatives()); 
            // InternalMySelenium.g:501:3: ( rule__ActionTarget__Alternatives )
            // InternalMySelenium.g:501:4: rule__ActionTarget__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionTarget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionTarget"


    // $ANTLR start "entryRuleActionParameter"
    // InternalMySelenium.g:510:1: entryRuleActionParameter : ruleActionParameter EOF ;
    public final void entryRuleActionParameter() throws RecognitionException {
        try {
            // InternalMySelenium.g:511:1: ( ruleActionParameter EOF )
            // InternalMySelenium.g:512:1: ruleActionParameter EOF
            {
             before(grammarAccess.getActionParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleActionParameter();

            state._fsp--;

             after(grammarAccess.getActionParameterRule()); 
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
    // $ANTLR end "entryRuleActionParameter"


    // $ANTLR start "ruleActionParameter"
    // InternalMySelenium.g:519:1: ruleActionParameter : ( ( rule__ActionParameter__Alternatives ) ) ;
    public final void ruleActionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:523:2: ( ( ( rule__ActionParameter__Alternatives ) ) )
            // InternalMySelenium.g:524:2: ( ( rule__ActionParameter__Alternatives ) )
            {
            // InternalMySelenium.g:524:2: ( ( rule__ActionParameter__Alternatives ) )
            // InternalMySelenium.g:525:3: ( rule__ActionParameter__Alternatives )
            {
             before(grammarAccess.getActionParameterAccess().getAlternatives()); 
            // InternalMySelenium.g:526:3: ( rule__ActionParameter__Alternatives )
            // InternalMySelenium.g:526:4: rule__ActionParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionParameter"


    // $ANTLR start "entryRuleActionParameterString"
    // InternalMySelenium.g:535:1: entryRuleActionParameterString : ruleActionParameterString EOF ;
    public final void entryRuleActionParameterString() throws RecognitionException {
        try {
            // InternalMySelenium.g:536:1: ( ruleActionParameterString EOF )
            // InternalMySelenium.g:537:1: ruleActionParameterString EOF
            {
             before(grammarAccess.getActionParameterStringRule()); 
            pushFollow(FOLLOW_1);
            ruleActionParameterString();

            state._fsp--;

             after(grammarAccess.getActionParameterStringRule()); 
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
    // $ANTLR end "entryRuleActionParameterString"


    // $ANTLR start "ruleActionParameterString"
    // InternalMySelenium.g:544:1: ruleActionParameterString : ( ( rule__ActionParameterString__ValueAssignment ) ) ;
    public final void ruleActionParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:548:2: ( ( ( rule__ActionParameterString__ValueAssignment ) ) )
            // InternalMySelenium.g:549:2: ( ( rule__ActionParameterString__ValueAssignment ) )
            {
            // InternalMySelenium.g:549:2: ( ( rule__ActionParameterString__ValueAssignment ) )
            // InternalMySelenium.g:550:3: ( rule__ActionParameterString__ValueAssignment )
            {
             before(grammarAccess.getActionParameterStringAccess().getValueAssignment()); 
            // InternalMySelenium.g:551:3: ( rule__ActionParameterString__ValueAssignment )
            // InternalMySelenium.g:551:4: rule__ActionParameterString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ActionParameterString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionParameterStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionParameterString"


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:560:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMySelenium.g:561:1: ( ruleSelector EOF )
            // InternalMySelenium.g:562:1: ruleSelector EOF
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
    // InternalMySelenium.g:569:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:573:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMySelenium.g:574:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMySelenium.g:574:2: ( ( rule__Selector__Group__0 ) )
            // InternalMySelenium.g:575:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMySelenium.g:576:3: ( rule__Selector__Group__0 )
            // InternalMySelenium.g:576:4: rule__Selector__Group__0
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


    // $ANTLR start "entryRuleParent"
    // InternalMySelenium.g:585:1: entryRuleParent : ruleParent EOF ;
    public final void entryRuleParent() throws RecognitionException {
        try {
            // InternalMySelenium.g:586:1: ( ruleParent EOF )
            // InternalMySelenium.g:587:1: ruleParent EOF
            {
             before(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getParentRule()); 
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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalMySelenium.g:594:1: ruleParent : ( ( rule__Parent__Group__0 ) ) ;
    public final void ruleParent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:598:2: ( ( ( rule__Parent__Group__0 ) ) )
            // InternalMySelenium.g:599:2: ( ( rule__Parent__Group__0 ) )
            {
            // InternalMySelenium.g:599:2: ( ( rule__Parent__Group__0 ) )
            // InternalMySelenium.g:600:3: ( rule__Parent__Group__0 )
            {
             before(grammarAccess.getParentAccess().getGroup()); 
            // InternalMySelenium.g:601:3: ( rule__Parent__Group__0 )
            // InternalMySelenium.g:601:4: rule__Parent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleAttributes"
    // InternalMySelenium.g:610:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalMySelenium.g:611:1: ( ruleAttributes EOF )
            // InternalMySelenium.g:612:1: ruleAttributes EOF
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
    // InternalMySelenium.g:619:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:623:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalMySelenium.g:624:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalMySelenium.g:624:2: ( ( rule__Attributes__Group__0 ) )
            // InternalMySelenium.g:625:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalMySelenium.g:626:3: ( rule__Attributes__Group__0 )
            // InternalMySelenium.g:626:4: rule__Attributes__Group__0
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
    // InternalMySelenium.g:635:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:636:1: ( ruleAttribute EOF )
            // InternalMySelenium.g:637:1: ruleAttribute EOF
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
    // InternalMySelenium.g:644:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:648:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMySelenium.g:649:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMySelenium.g:649:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMySelenium.g:650:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMySelenium.g:651:3: ( rule__Attribute__Group__0 )
            // InternalMySelenium.g:651:4: rule__Attribute__Group__0
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
    // InternalMySelenium.g:660:1: entryRuleDOMAttribute : ruleDOMAttribute EOF ;
    public final void entryRuleDOMAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:661:1: ( ruleDOMAttribute EOF )
            // InternalMySelenium.g:662:1: ruleDOMAttribute EOF
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
    // InternalMySelenium.g:669:1: ruleDOMAttribute : ( ( rule__DOMAttribute__Alternatives ) ) ;
    public final void ruleDOMAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:673:2: ( ( ( rule__DOMAttribute__Alternatives ) ) )
            // InternalMySelenium.g:674:2: ( ( rule__DOMAttribute__Alternatives ) )
            {
            // InternalMySelenium.g:674:2: ( ( rule__DOMAttribute__Alternatives ) )
            // InternalMySelenium.g:675:3: ( rule__DOMAttribute__Alternatives )
            {
             before(grammarAccess.getDOMAttributeAccess().getAlternatives()); 
            // InternalMySelenium.g:676:3: ( rule__DOMAttribute__Alternatives )
            // InternalMySelenium.g:676:4: rule__DOMAttribute__Alternatives
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
    // InternalMySelenium.g:685:1: entryRuleDOMElement : ruleDOMElement EOF ;
    public final void entryRuleDOMElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:686:1: ( ruleDOMElement EOF )
            // InternalMySelenium.g:687:1: ruleDOMElement EOF
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
    // InternalMySelenium.g:694:1: ruleDOMElement : ( ( rule__DOMElement__Alternatives ) ) ;
    public final void ruleDOMElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:698:2: ( ( ( rule__DOMElement__Alternatives ) ) )
            // InternalMySelenium.g:699:2: ( ( rule__DOMElement__Alternatives ) )
            {
            // InternalMySelenium.g:699:2: ( ( rule__DOMElement__Alternatives ) )
            // InternalMySelenium.g:700:3: ( rule__DOMElement__Alternatives )
            {
             before(grammarAccess.getDOMElementAccess().getAlternatives()); 
            // InternalMySelenium.g:701:3: ( rule__DOMElement__Alternatives )
            // InternalMySelenium.g:701:4: rule__DOMElement__Alternatives
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


    // $ANTLR start "entryRuleActionType"
    // InternalMySelenium.g:710:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:711:1: ( ruleActionType EOF )
            // InternalMySelenium.g:712:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalMySelenium.g:719:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:723:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalMySelenium.g:724:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalMySelenium.g:724:2: ( ( rule__ActionType__Alternatives ) )
            // InternalMySelenium.g:725:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:726:3: ( rule__ActionType__Alternatives )
            // InternalMySelenium.g:726:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleFunctionParameters"
    // InternalMySelenium.g:735:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:736:1: ( ruleFunctionParameters EOF )
            // InternalMySelenium.g:737:1: ruleFunctionParameters EOF
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
    // InternalMySelenium.g:744:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Group__0 ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:748:2: ( ( ( rule__FunctionParameters__Group__0 ) ) )
            // InternalMySelenium.g:749:2: ( ( rule__FunctionParameters__Group__0 ) )
            {
            // InternalMySelenium.g:749:2: ( ( rule__FunctionParameters__Group__0 ) )
            // InternalMySelenium.g:750:3: ( rule__FunctionParameters__Group__0 )
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup()); 
            // InternalMySelenium.g:751:3: ( rule__FunctionParameters__Group__0 )
            // InternalMySelenium.g:751:4: rule__FunctionParameters__Group__0
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
    // InternalMySelenium.g:760:1: entryRuleFunctionCallParameters : ruleFunctionCallParameters EOF ;
    public final void entryRuleFunctionCallParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:761:1: ( ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:762:1: ruleFunctionCallParameters EOF
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
    // InternalMySelenium.g:769:1: ruleFunctionCallParameters : ( ( rule__FunctionCallParameters__Group__0 ) ) ;
    public final void ruleFunctionCallParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:773:2: ( ( ( rule__FunctionCallParameters__Group__0 ) ) )
            // InternalMySelenium.g:774:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            {
            // InternalMySelenium.g:774:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            // InternalMySelenium.g:775:3: ( rule__FunctionCallParameters__Group__0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup()); 
            // InternalMySelenium.g:776:3: ( rule__FunctionCallParameters__Group__0 )
            // InternalMySelenium.g:776:4: rule__FunctionCallParameters__Group__0
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
    // InternalMySelenium.g:785:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:786:1: ( ruleVariableCall EOF )
            // InternalMySelenium.g:787:1: ruleVariableCall EOF
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
    // InternalMySelenium.g:794:1: ruleVariableCall : ( ( rule__VariableCall__Alternatives ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:798:2: ( ( ( rule__VariableCall__Alternatives ) ) )
            // InternalMySelenium.g:799:2: ( ( rule__VariableCall__Alternatives ) )
            {
            // InternalMySelenium.g:799:2: ( ( rule__VariableCall__Alternatives ) )
            // InternalMySelenium.g:800:3: ( rule__VariableCall__Alternatives )
            {
             before(grammarAccess.getVariableCallAccess().getAlternatives()); 
            // InternalMySelenium.g:801:3: ( rule__VariableCall__Alternatives )
            // InternalMySelenium.g:801:4: rule__VariableCall__Alternatives
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


    // $ANTLR start "entryRuleVariableRef"
    // InternalMySelenium.g:810:1: entryRuleVariableRef : ruleVariableRef EOF ;
    public final void entryRuleVariableRef() throws RecognitionException {
        try {
            // InternalMySelenium.g:811:1: ( ruleVariableRef EOF )
            // InternalMySelenium.g:812:1: ruleVariableRef EOF
            {
             before(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableRef();

            state._fsp--;

             after(grammarAccess.getVariableRefRule()); 
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
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalMySelenium.g:819:1: ruleVariableRef : ( ( rule__VariableRef__RefAssignment ) ) ;
    public final void ruleVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:823:2: ( ( ( rule__VariableRef__RefAssignment ) ) )
            // InternalMySelenium.g:824:2: ( ( rule__VariableRef__RefAssignment ) )
            {
            // InternalMySelenium.g:824:2: ( ( rule__VariableRef__RefAssignment ) )
            // InternalMySelenium.g:825:3: ( rule__VariableRef__RefAssignment )
            {
             before(grammarAccess.getVariableRefAccess().getRefAssignment()); 
            // InternalMySelenium.g:826:3: ( rule__VariableRef__RefAssignment )
            // InternalMySelenium.g:826:4: rule__VariableRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleVariable"
    // InternalMySelenium.g:835:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMySelenium.g:836:1: ( ruleVariable EOF )
            // InternalMySelenium.g:837:1: ruleVariable EOF
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
    // InternalMySelenium.g:844:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:848:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalMySelenium.g:849:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalMySelenium.g:849:2: ( ( rule__Variable__NameAssignment ) )
            // InternalMySelenium.g:850:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalMySelenium.g:851:3: ( rule__Variable__NameAssignment )
            // InternalMySelenium.g:851:4: rule__Variable__NameAssignment
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


    // $ANTLR start "entryRuleStringParameter"
    // InternalMySelenium.g:860:1: entryRuleStringParameter : ruleStringParameter EOF ;
    public final void entryRuleStringParameter() throws RecognitionException {
        try {
            // InternalMySelenium.g:861:1: ( ruleStringParameter EOF )
            // InternalMySelenium.g:862:1: ruleStringParameter EOF
            {
             before(grammarAccess.getStringParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleStringParameter();

            state._fsp--;

             after(grammarAccess.getStringParameterRule()); 
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
    // $ANTLR end "entryRuleStringParameter"


    // $ANTLR start "ruleStringParameter"
    // InternalMySelenium.g:869:1: ruleStringParameter : ( ( rule__StringParameter__ValueAssignment ) ) ;
    public final void ruleStringParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:873:2: ( ( ( rule__StringParameter__ValueAssignment ) ) )
            // InternalMySelenium.g:874:2: ( ( rule__StringParameter__ValueAssignment ) )
            {
            // InternalMySelenium.g:874:2: ( ( rule__StringParameter__ValueAssignment ) )
            // InternalMySelenium.g:875:3: ( rule__StringParameter__ValueAssignment )
            {
             before(grammarAccess.getStringParameterAccess().getValueAssignment()); 
            // InternalMySelenium.g:876:3: ( rule__StringParameter__ValueAssignment )
            // InternalMySelenium.g:876:4: rule__StringParameter__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringParameter__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringParameter"


    // $ANTLR start "rule__Program__Alternatives"
    // InternalMySelenium.g:884:1: rule__Program__Alternatives : ( ( ruleStatements ) | ( ruleFunctions ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:888:1: ( ( ruleStatements ) | ( ruleFunctions ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=15)||(LA2_0>=32 && LA2_0<=35)||LA2_0==41||LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMySelenium.g:889:2: ( ruleStatements )
                    {
                    // InternalMySelenium.g:889:2: ( ruleStatements )
                    // InternalMySelenium.g:890:3: ruleStatements
                    {
                     before(grammarAccess.getProgramAccess().getStatementsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStatements();

                    state._fsp--;

                     after(grammarAccess.getProgramAccess().getStatementsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:895:2: ( ruleFunctions )
                    {
                    // InternalMySelenium.g:895:2: ( ruleFunctions )
                    // InternalMySelenium.g:896:3: ruleFunctions
                    {
                     before(grammarAccess.getProgramAccess().getFunctionsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctions();

                    state._fsp--;

                     after(grammarAccess.getProgramAccess().getFunctionsParserRuleCall_1()); 

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
    // InternalMySelenium.g:905:1: rule__ProjectionAction__Alternatives : ( ( 'value' ) | ( 'text' ) | ( 'html' ) );
    public final void rule__ProjectionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:909:1: ( ( 'value' ) | ( 'text' ) | ( 'html' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalMySelenium.g:910:2: ( 'value' )
                    {
                    // InternalMySelenium.g:910:2: ( 'value' )
                    // InternalMySelenium.g:911:3: 'value'
                    {
                     before(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:916:2: ( 'text' )
                    {
                    // InternalMySelenium.g:916:2: ( 'text' )
                    // InternalMySelenium.g:917:3: 'text'
                    {
                     before(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:922:2: ( 'html' )
                    {
                    // InternalMySelenium.g:922:2: ( 'html' )
                    // InternalMySelenium.g:923:3: 'html'
                    {
                     before(grammarAccess.getProjectionActionAccess().getHtmlKeyword_2()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMySelenium.g:932:1: rule__Statement__Alternatives : ( ( ruleAction ) | ( ruleAssignAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:936:1: ( ( ruleAction ) | ( ruleAssignAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMySelenium.g:937:2: ( ruleAction )
                    {
                    // InternalMySelenium.g:937:2: ( ruleAction )
                    // InternalMySelenium.g:938:3: ruleAction
                    {
                     before(grammarAccess.getStatementAccess().getActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:943:2: ( ruleAssignAction )
                    {
                    // InternalMySelenium.g:943:2: ( ruleAssignAction )
                    // InternalMySelenium.g:944:3: ruleAssignAction
                    {
                     before(grammarAccess.getStatementAccess().getAssignActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:949:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:949:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:950:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:955:2: ( ruleAssertEquals )
                    {
                    // InternalMySelenium.g:955:2: ( ruleAssertEquals )
                    // InternalMySelenium.g:956:3: ruleAssertEquals
                    {
                     before(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertEquals();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:961:2: ( ruleAssertContains )
                    {
                    // InternalMySelenium.g:961:2: ( ruleAssertContains )
                    // InternalMySelenium.g:962:3: ruleAssertContains
                    {
                     before(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertContains();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:967:2: ( ruleNavigationAction )
                    {
                    // InternalMySelenium.g:967:2: ( ruleNavigationAction )
                    // InternalMySelenium.g:968:3: ruleNavigationAction
                    {
                     before(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__AssertableElement__Alternatives"
    // InternalMySelenium.g:977:1: rule__AssertableElement__Alternatives : ( ( ruleVariable ) | ( ruleStringParameter ) | ( ruleProjection ) | ( ruleFunctionCall ) );
    public final void rule__AssertableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:981:1: ( ( ruleVariable ) | ( ruleStringParameter ) | ( ruleProjection ) | ( ruleFunctionCall ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=14 && LA5_1<=15)||(LA5_1>=32 && LA5_1<=35)||LA5_1==39||(LA5_1>=41 && LA5_1<=44)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==48) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
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
                    // InternalMySelenium.g:982:2: ( ruleVariable )
                    {
                    // InternalMySelenium.g:982:2: ( ruleVariable )
                    // InternalMySelenium.g:983:3: ruleVariable
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
                    // InternalMySelenium.g:988:2: ( ruleStringParameter )
                    {
                    // InternalMySelenium.g:988:2: ( ruleStringParameter )
                    // InternalMySelenium.g:989:3: ruleStringParameter
                    {
                     before(grammarAccess.getAssertableElementAccess().getStringParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringParameter();

                    state._fsp--;

                     after(grammarAccess.getAssertableElementAccess().getStringParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:994:2: ( ruleProjection )
                    {
                    // InternalMySelenium.g:994:2: ( ruleProjection )
                    // InternalMySelenium.g:995:3: ruleProjection
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
                    // InternalMySelenium.g:1000:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:1000:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:1001:3: ruleFunctionCall
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
    // InternalMySelenium.g:1010:1: rule__NavigationActionType__Alternatives : ( ( 'go' ) | ( 'openBrowser' ) );
    public final void rule__NavigationActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1014:1: ( ( 'go' ) | ( 'openBrowser' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMySelenium.g:1015:2: ( 'go' )
                    {
                    // InternalMySelenium.g:1015:2: ( 'go' )
                    // InternalMySelenium.g:1016:3: 'go'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1021:2: ( 'openBrowser' )
                    {
                    // InternalMySelenium.g:1021:2: ( 'openBrowser' )
                    // InternalMySelenium.g:1022:3: 'openBrowser'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getOpenBrowserKeyword_1()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__ActionTarget__Alternatives"
    // InternalMySelenium.g:1031:1: rule__ActionTarget__Alternatives : ( ( ruleSelector ) | ( ruleVariableRef ) | ( ruleFunctionCall ) );
    public final void rule__ActionTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1035:1: ( ( ruleSelector ) | ( ruleVariableRef ) | ( ruleFunctionCall ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=31)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_STRING)||(LA7_2>=14 && LA7_2<=15)||(LA7_2>=22 && LA7_2<=35)||LA7_2==39||LA7_2==41||LA7_2==44) ) {
                    alt7=2;
                }
                else if ( (LA7_2==48) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:1036:2: ( ruleSelector )
                    {
                    // InternalMySelenium.g:1036:2: ( ruleSelector )
                    // InternalMySelenium.g:1037:3: ruleSelector
                    {
                     before(grammarAccess.getActionTargetAccess().getSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelector();

                    state._fsp--;

                     after(grammarAccess.getActionTargetAccess().getSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1042:2: ( ruleVariableRef )
                    {
                    // InternalMySelenium.g:1042:2: ( ruleVariableRef )
                    // InternalMySelenium.g:1043:3: ruleVariableRef
                    {
                     before(grammarAccess.getActionTargetAccess().getVariableRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableRef();

                    state._fsp--;

                     after(grammarAccess.getActionTargetAccess().getVariableRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1048:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:1048:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:1049:3: ruleFunctionCall
                    {
                     before(grammarAccess.getActionTargetAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getActionTargetAccess().getFunctionCallParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActionTarget__Alternatives"


    // $ANTLR start "rule__ActionParameter__Alternatives"
    // InternalMySelenium.g:1058:1: rule__ActionParameter__Alternatives : ( ( ruleSelector ) | ( ruleActionParameterString ) | ( ruleVariableRef ) );
    public final void rule__ActionParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1062:1: ( ( ruleSelector ) | ( ruleActionParameterString ) | ( ruleVariableRef ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
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
                    // InternalMySelenium.g:1063:2: ( ruleSelector )
                    {
                    // InternalMySelenium.g:1063:2: ( ruleSelector )
                    // InternalMySelenium.g:1064:3: ruleSelector
                    {
                     before(grammarAccess.getActionParameterAccess().getSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelector();

                    state._fsp--;

                     after(grammarAccess.getActionParameterAccess().getSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1069:2: ( ruleActionParameterString )
                    {
                    // InternalMySelenium.g:1069:2: ( ruleActionParameterString )
                    // InternalMySelenium.g:1070:3: ruleActionParameterString
                    {
                     before(grammarAccess.getActionParameterAccess().getActionParameterStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActionParameterString();

                    state._fsp--;

                     after(grammarAccess.getActionParameterAccess().getActionParameterStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1075:2: ( ruleVariableRef )
                    {
                    // InternalMySelenium.g:1075:2: ( ruleVariableRef )
                    // InternalMySelenium.g:1076:3: ruleVariableRef
                    {
                     before(grammarAccess.getActionParameterAccess().getVariableRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableRef();

                    state._fsp--;

                     after(grammarAccess.getActionParameterAccess().getVariableRefParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActionParameter__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_2"
    // InternalMySelenium.g:1085:1: rule__Attribute__Alternatives_2 : ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__VariableAssignment_2_1 ) ) );
    public final void rule__Attribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1089:1: ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__VariableAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMySelenium.g:1090:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    {
                    // InternalMySelenium.g:1090:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    // InternalMySelenium.g:1091:3: ( rule__Attribute__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getValueAssignment_2_0()); 
                    // InternalMySelenium.g:1092:3: ( rule__Attribute__ValueAssignment_2_0 )
                    // InternalMySelenium.g:1092:4: rule__Attribute__ValueAssignment_2_0
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
                    // InternalMySelenium.g:1096:2: ( ( rule__Attribute__VariableAssignment_2_1 ) )
                    {
                    // InternalMySelenium.g:1096:2: ( ( rule__Attribute__VariableAssignment_2_1 ) )
                    // InternalMySelenium.g:1097:3: ( rule__Attribute__VariableAssignment_2_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getVariableAssignment_2_1()); 
                    // InternalMySelenium.g:1098:3: ( rule__Attribute__VariableAssignment_2_1 )
                    // InternalMySelenium.g:1098:4: rule__Attribute__VariableAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__VariableAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getVariableAssignment_2_1()); 

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
    // InternalMySelenium.g:1106:1: rule__DOMAttribute__Alternatives : ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) );
    public final void rule__DOMAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1110:1: ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            case 18:
                {
                alt10=4;
                }
                break;
            case 19:
                {
                alt10=5;
                }
                break;
            case 20:
                {
                alt10=6;
                }
                break;
            case 21:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:1111:2: ( 'name' )
                    {
                    // InternalMySelenium.g:1111:2: ( 'name' )
                    // InternalMySelenium.g:1112:3: 'name'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1117:2: ( 'text' )
                    {
                    // InternalMySelenium.g:1117:2: ( 'text' )
                    // InternalMySelenium.g:1118:3: 'text'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1123:2: ( 'alt' )
                    {
                    // InternalMySelenium.g:1123:2: ( 'alt' )
                    // InternalMySelenium.g:1124:3: 'alt'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1129:2: ( 'checked' )
                    {
                    // InternalMySelenium.g:1129:2: ( 'checked' )
                    // InternalMySelenium.g:1130:3: 'checked'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1135:2: ( 'class' )
                    {
                    // InternalMySelenium.g:1135:2: ( 'class' )
                    // InternalMySelenium.g:1136:3: 'class'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1141:2: ( 'id' )
                    {
                    // InternalMySelenium.g:1141:2: ( 'id' )
                    // InternalMySelenium.g:1142:3: 'id'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getIdKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getIdKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1147:2: ( 'type' )
                    {
                    // InternalMySelenium.g:1147:2: ( 'type' )
                    // InternalMySelenium.g:1148:3: 'type'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getTypeKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getTypeKeyword_6()); 

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
    // InternalMySelenium.g:1157:1: rule__DOMElement__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) | ( 'div' ) );
    public final void rule__DOMElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1161:1: ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) | ( 'div' ) )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            case 28:
                {
                alt11=7;
                }
                break;
            case 29:
                {
                alt11=8;
                }
                break;
            case 30:
                {
                alt11=9;
                }
                break;
            case 31:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMySelenium.g:1162:2: ( 'link' )
                    {
                    // InternalMySelenium.g:1162:2: ( 'link' )
                    // InternalMySelenium.g:1163:3: 'link'
                    {
                     before(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1168:2: ( 'button' )
                    {
                    // InternalMySelenium.g:1168:2: ( 'button' )
                    // InternalMySelenium.g:1169:3: 'button'
                    {
                     before(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1174:2: ( 'checkbox' )
                    {
                    // InternalMySelenium.g:1174:2: ( 'checkbox' )
                    // InternalMySelenium.g:1175:3: 'checkbox'
                    {
                     before(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1180:2: ( 'input' )
                    {
                    // InternalMySelenium.g:1180:2: ( 'input' )
                    // InternalMySelenium.g:1181:3: 'input'
                    {
                     before(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1186:2: ( 'h1' )
                    {
                    // InternalMySelenium.g:1186:2: ( 'h1' )
                    // InternalMySelenium.g:1187:3: 'h1'
                    {
                     before(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1192:2: ( 'body' )
                    {
                    // InternalMySelenium.g:1192:2: ( 'body' )
                    // InternalMySelenium.g:1193:3: 'body'
                    {
                     before(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1198:2: ( 'select' )
                    {
                    // InternalMySelenium.g:1198:2: ( 'select' )
                    // InternalMySelenium.g:1199:3: 'select'
                    {
                     before(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:1204:2: ( 'a' )
                    {
                    // InternalMySelenium.g:1204:2: ( 'a' )
                    // InternalMySelenium.g:1205:3: 'a'
                    {
                     before(grammarAccess.getDOMElementAccess().getAKeyword_7()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1210:2: ( 'img' )
                    {
                    // InternalMySelenium.g:1210:2: ( 'img' )
                    // InternalMySelenium.g:1211:3: 'img'
                    {
                     before(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMySelenium.g:1216:2: ( 'div' )
                    {
                    // InternalMySelenium.g:1216:2: ( 'div' )
                    // InternalMySelenium.g:1217:3: 'div'
                    {
                     before(grammarAccess.getDOMElementAccess().getDivKeyword_9()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getDivKeyword_9()); 

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


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalMySelenium.g:1226:1: rule__ActionType__Alternatives : ( ( 'click' ) | ( 'fill' ) | ( 'choose' ) | ( 'count' ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1230:1: ( ( 'click' ) | ( 'fill' ) | ( 'choose' ) | ( 'count' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMySelenium.g:1231:2: ( 'click' )
                    {
                    // InternalMySelenium.g:1231:2: ( 'click' )
                    // InternalMySelenium.g:1232:3: 'click'
                    {
                     before(grammarAccess.getActionTypeAccess().getClickKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getClickKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1237:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:1237:2: ( 'fill' )
                    // InternalMySelenium.g:1238:3: 'fill'
                    {
                     before(grammarAccess.getActionTypeAccess().getFillKeyword_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getFillKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1243:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:1243:2: ( 'choose' )
                    // InternalMySelenium.g:1244:3: 'choose'
                    {
                     before(grammarAccess.getActionTypeAccess().getChooseKeyword_2()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getChooseKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1249:2: ( 'count' )
                    {
                    // InternalMySelenium.g:1249:2: ( 'count' )
                    // InternalMySelenium.g:1250:3: 'count'
                    {
                     before(grammarAccess.getActionTypeAccess().getCountKeyword_3()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getCountKeyword_3()); 

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
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__VariableCall__Alternatives"
    // InternalMySelenium.g:1259:1: rule__VariableCall__Alternatives : ( ( ruleVariableRef ) | ( ruleStringParameter ) );
    public final void rule__VariableCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1263:1: ( ( ruleVariableRef ) | ( ruleStringParameter ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMySelenium.g:1264:2: ( ruleVariableRef )
                    {
                    // InternalMySelenium.g:1264:2: ( ruleVariableRef )
                    // InternalMySelenium.g:1265:3: ruleVariableRef
                    {
                     before(grammarAccess.getVariableCallAccess().getVariableRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableRef();

                    state._fsp--;

                     after(grammarAccess.getVariableCallAccess().getVariableRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1270:2: ( ruleStringParameter )
                    {
                    // InternalMySelenium.g:1270:2: ( ruleStringParameter )
                    // InternalMySelenium.g:1271:3: ruleStringParameter
                    {
                     before(grammarAccess.getVariableCallAccess().getStringParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringParameter();

                    state._fsp--;

                     after(grammarAccess.getVariableCallAccess().getStringParameterParserRuleCall_1()); 

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


    // $ANTLR start "rule__Functions__Group__0"
    // InternalMySelenium.g:1280:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1284:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalMySelenium.g:1285:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Functions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__Group__0"


    // $ANTLR start "rule__Functions__Group__0__Impl"
    // InternalMySelenium.g:1292:1: rule__Functions__Group__0__Impl : ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1296:1: ( ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) ) )
            // InternalMySelenium.g:1297:1: ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) )
            {
            // InternalMySelenium.g:1297:1: ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) )
            // InternalMySelenium.g:1298:2: ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* )
            {
            // InternalMySelenium.g:1298:2: ( ( rule__Functions__FunctionsAssignment_0 ) )
            // InternalMySelenium.g:1299:3: ( rule__Functions__FunctionsAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 
            // InternalMySelenium.g:1300:3: ( rule__Functions__FunctionsAssignment_0 )
            // InternalMySelenium.g:1300:4: rule__Functions__FunctionsAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Functions__FunctionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 

            }

            // InternalMySelenium.g:1303:2: ( ( rule__Functions__FunctionsAssignment_0 )* )
            // InternalMySelenium.g:1304:3: ( rule__Functions__FunctionsAssignment_0 )*
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 
            // InternalMySelenium.g:1305:3: ( rule__Functions__FunctionsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalMySelenium.g:1305:4: rule__Functions__FunctionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Functions__FunctionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 

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
    // $ANTLR end "rule__Functions__Group__0__Impl"


    // $ANTLR start "rule__Functions__Group__1"
    // InternalMySelenium.g:1314:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1318:1: ( rule__Functions__Group__1__Impl )
            // InternalMySelenium.g:1319:2: rule__Functions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__Group__1"


    // $ANTLR start "rule__Functions__Group__1__Impl"
    // InternalMySelenium.g:1325:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__MainFunctionAssignment_1 ) ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1329:1: ( ( ( rule__Functions__MainFunctionAssignment_1 ) ) )
            // InternalMySelenium.g:1330:1: ( ( rule__Functions__MainFunctionAssignment_1 ) )
            {
            // InternalMySelenium.g:1330:1: ( ( rule__Functions__MainFunctionAssignment_1 ) )
            // InternalMySelenium.g:1331:2: ( rule__Functions__MainFunctionAssignment_1 )
            {
             before(grammarAccess.getFunctionsAccess().getMainFunctionAssignment_1()); 
            // InternalMySelenium.g:1332:2: ( rule__Functions__MainFunctionAssignment_1 )
            // InternalMySelenium.g:1332:3: rule__Functions__MainFunctionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Functions__MainFunctionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getMainFunctionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__Group__1__Impl"


    // $ANTLR start "rule__MainFunction__Group__0"
    // InternalMySelenium.g:1341:1: rule__MainFunction__Group__0 : rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 ;
    public final void rule__MainFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1345:1: ( rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 )
            // InternalMySelenium.g:1346:2: rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MainFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__0"


    // $ANTLR start "rule__MainFunction__Group__0__Impl"
    // InternalMySelenium.g:1353:1: rule__MainFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__MainFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1357:1: ( ( 'def' ) )
            // InternalMySelenium.g:1358:1: ( 'def' )
            {
            // InternalMySelenium.g:1358:1: ( 'def' )
            // InternalMySelenium.g:1359:2: 'def'
            {
             before(grammarAccess.getMainFunctionAccess().getDefKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMainFunctionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__0__Impl"


    // $ANTLR start "rule__MainFunction__Group__1"
    // InternalMySelenium.g:1368:1: rule__MainFunction__Group__1 : rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 ;
    public final void rule__MainFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1372:1: ( rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 )
            // InternalMySelenium.g:1373:2: rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MainFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__1"


    // $ANTLR start "rule__MainFunction__Group__1__Impl"
    // InternalMySelenium.g:1380:1: rule__MainFunction__Group__1__Impl : ( 'main' ) ;
    public final void rule__MainFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1384:1: ( ( 'main' ) )
            // InternalMySelenium.g:1385:1: ( 'main' )
            {
            // InternalMySelenium.g:1385:1: ( 'main' )
            // InternalMySelenium.g:1386:2: 'main'
            {
             before(grammarAccess.getMainFunctionAccess().getMainKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMainFunctionAccess().getMainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__1__Impl"


    // $ANTLR start "rule__MainFunction__Group__2"
    // InternalMySelenium.g:1395:1: rule__MainFunction__Group__2 : rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 ;
    public final void rule__MainFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1399:1: ( rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 )
            // InternalMySelenium.g:1400:2: rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MainFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__2"


    // $ANTLR start "rule__MainFunction__Group__2__Impl"
    // InternalMySelenium.g:1407:1: rule__MainFunction__Group__2__Impl : ( '{' ) ;
    public final void rule__MainFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1411:1: ( ( '{' ) )
            // InternalMySelenium.g:1412:1: ( '{' )
            {
            // InternalMySelenium.g:1412:1: ( '{' )
            // InternalMySelenium.g:1413:2: '{'
            {
             before(grammarAccess.getMainFunctionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMainFunctionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__2__Impl"


    // $ANTLR start "rule__MainFunction__Group__3"
    // InternalMySelenium.g:1422:1: rule__MainFunction__Group__3 : rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 ;
    public final void rule__MainFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1426:1: ( rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 )
            // InternalMySelenium.g:1427:2: rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MainFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__3"


    // $ANTLR start "rule__MainFunction__Group__3__Impl"
    // InternalMySelenium.g:1434:1: rule__MainFunction__Group__3__Impl : ( ( rule__MainFunction__StatementsAssignment_3 ) ) ;
    public final void rule__MainFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1438:1: ( ( ( rule__MainFunction__StatementsAssignment_3 ) ) )
            // InternalMySelenium.g:1439:1: ( ( rule__MainFunction__StatementsAssignment_3 ) )
            {
            // InternalMySelenium.g:1439:1: ( ( rule__MainFunction__StatementsAssignment_3 ) )
            // InternalMySelenium.g:1440:2: ( rule__MainFunction__StatementsAssignment_3 )
            {
             before(grammarAccess.getMainFunctionAccess().getStatementsAssignment_3()); 
            // InternalMySelenium.g:1441:2: ( rule__MainFunction__StatementsAssignment_3 )
            // InternalMySelenium.g:1441:3: rule__MainFunction__StatementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MainFunction__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMainFunctionAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__3__Impl"


    // $ANTLR start "rule__MainFunction__Group__4"
    // InternalMySelenium.g:1449:1: rule__MainFunction__Group__4 : rule__MainFunction__Group__4__Impl ;
    public final void rule__MainFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1453:1: ( rule__MainFunction__Group__4__Impl )
            // InternalMySelenium.g:1454:2: rule__MainFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainFunction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__4"


    // $ANTLR start "rule__MainFunction__Group__4__Impl"
    // InternalMySelenium.g:1460:1: rule__MainFunction__Group__4__Impl : ( '}' ) ;
    public final void rule__MainFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1464:1: ( ( '}' ) )
            // InternalMySelenium.g:1465:1: ( '}' )
            {
            // InternalMySelenium.g:1465:1: ( '}' )
            // InternalMySelenium.g:1466:2: '}'
            {
             before(grammarAccess.getMainFunctionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMainFunctionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMySelenium.g:1476:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1480:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMySelenium.g:1481:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMySelenium.g:1488:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1492:1: ( ( 'def' ) )
            // InternalMySelenium.g:1493:1: ( 'def' )
            {
            // InternalMySelenium.g:1493:1: ( 'def' )
            // InternalMySelenium.g:1494:2: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMySelenium.g:1503:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1507:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMySelenium.g:1508:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMySelenium.g:1515:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1519:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMySelenium.g:1520:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMySelenium.g:1520:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMySelenium.g:1521:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMySelenium.g:1522:2: ( rule__Function__NameAssignment_1 )
            // InternalMySelenium.g:1522:3: rule__Function__NameAssignment_1
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
    // InternalMySelenium.g:1530:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1534:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMySelenium.g:1535:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMySelenium.g:1542:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1546:1: ( ( ( rule__Function__ParamsAssignment_2 )? ) )
            // InternalMySelenium.g:1547:1: ( ( rule__Function__ParamsAssignment_2 )? )
            {
            // InternalMySelenium.g:1547:1: ( ( rule__Function__ParamsAssignment_2 )? )
            // InternalMySelenium.g:1548:2: ( rule__Function__ParamsAssignment_2 )?
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalMySelenium.g:1549:2: ( rule__Function__ParamsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1549:3: rule__Function__ParamsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ParamsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalMySelenium.g:1557:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1561:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMySelenium.g:1562:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalMySelenium.g:1569:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1573:1: ( ( '{' ) )
            // InternalMySelenium.g:1574:1: ( '{' )
            {
            // InternalMySelenium.g:1574:1: ( '{' )
            // InternalMySelenium.g:1575:2: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMySelenium.g:1584:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1588:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMySelenium.g:1589:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMySelenium.g:1596:1: rule__Function__Group__4__Impl : ( ( rule__Function__StatementsAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1600:1: ( ( ( rule__Function__StatementsAssignment_4 ) ) )
            // InternalMySelenium.g:1601:1: ( ( rule__Function__StatementsAssignment_4 ) )
            {
            // InternalMySelenium.g:1601:1: ( ( rule__Function__StatementsAssignment_4 ) )
            // InternalMySelenium.g:1602:2: ( rule__Function__StatementsAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 
            // InternalMySelenium.g:1603:2: ( rule__Function__StatementsAssignment_4 )
            // InternalMySelenium.g:1603:3: rule__Function__StatementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Function__StatementsAssignment_4();

            state._fsp--;


            }

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
    // InternalMySelenium.g:1611:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1615:1: ( rule__Function__Group__5__Impl )
            // InternalMySelenium.g:1616:2: rule__Function__Group__5__Impl
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
    // InternalMySelenium.g:1622:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1626:1: ( ( '}' ) )
            // InternalMySelenium.g:1627:1: ( '}' )
            {
            // InternalMySelenium.g:1627:1: ( '}' )
            // InternalMySelenium.g:1628:2: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMySelenium.g:1638:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1642:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMySelenium.g:1643:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMySelenium.g:1650:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__RefAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1654:1: ( ( ( rule__FunctionCall__RefAssignment_0 ) ) )
            // InternalMySelenium.g:1655:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            {
            // InternalMySelenium.g:1655:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            // InternalMySelenium.g:1656:2: ( rule__FunctionCall__RefAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 
            // InternalMySelenium.g:1657:2: ( rule__FunctionCall__RefAssignment_0 )
            // InternalMySelenium.g:1657:3: rule__FunctionCall__RefAssignment_0
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
    // InternalMySelenium.g:1665:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1669:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMySelenium.g:1670:2: rule__FunctionCall__Group__1__Impl
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
    // InternalMySelenium.g:1676:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__ParamsAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1680:1: ( ( ( rule__FunctionCall__ParamsAssignment_1 ) ) )
            // InternalMySelenium.g:1681:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            {
            // InternalMySelenium.g:1681:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            // InternalMySelenium.g:1682:2: ( rule__FunctionCall__ParamsAssignment_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 
            // InternalMySelenium.g:1683:2: ( rule__FunctionCall__ParamsAssignment_1 )
            // InternalMySelenium.g:1683:3: rule__FunctionCall__ParamsAssignment_1
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
    // InternalMySelenium.g:1692:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1696:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMySelenium.g:1697:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMySelenium.g:1704:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__SelectorAssignment_0 ) ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1708:1: ( ( ( rule__Projection__SelectorAssignment_0 ) ) )
            // InternalMySelenium.g:1709:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            {
            // InternalMySelenium.g:1709:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            // InternalMySelenium.g:1710:2: ( rule__Projection__SelectorAssignment_0 )
            {
             before(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 
            // InternalMySelenium.g:1711:2: ( rule__Projection__SelectorAssignment_0 )
            // InternalMySelenium.g:1711:3: rule__Projection__SelectorAssignment_0
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
    // InternalMySelenium.g:1719:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1723:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalMySelenium.g:1724:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMySelenium.g:1731:1: rule__Projection__Group__1__Impl : ( '.' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1735:1: ( ( '.' ) )
            // InternalMySelenium.g:1736:1: ( '.' )
            {
            // InternalMySelenium.g:1736:1: ( '.' )
            // InternalMySelenium.g:1737:2: '.'
            {
             before(grammarAccess.getProjectionAccess().getFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMySelenium.g:1746:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1750:1: ( rule__Projection__Group__2__Impl )
            // InternalMySelenium.g:1751:2: rule__Projection__Group__2__Impl
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
    // InternalMySelenium.g:1757:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__ProjectionActionAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1761:1: ( ( ( rule__Projection__ProjectionActionAssignment_2 ) ) )
            // InternalMySelenium.g:1762:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            {
            // InternalMySelenium.g:1762:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            // InternalMySelenium.g:1763:2: ( rule__Projection__ProjectionActionAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 
            // InternalMySelenium.g:1764:2: ( rule__Projection__ProjectionActionAssignment_2 )
            // InternalMySelenium.g:1764:3: rule__Projection__ProjectionActionAssignment_2
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
    // InternalMySelenium.g:1773:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1777:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalMySelenium.g:1778:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMySelenium.g:1785:1: rule__AssertEquals__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1789:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1790:1: ( 'assert' )
            {
            // InternalMySelenium.g:1790:1: ( 'assert' )
            // InternalMySelenium.g:1791:2: 'assert'
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMySelenium.g:1800:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1804:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalMySelenium.g:1805:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMySelenium.g:1812:1: rule__AssertEquals__Group__1__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1816:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) )
            // InternalMySelenium.g:1817:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            {
            // InternalMySelenium.g:1817:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            // InternalMySelenium.g:1818:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 
            // InternalMySelenium.g:1819:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            // InternalMySelenium.g:1819:3: rule__AssertEquals__AssertableElementAssignment_1
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
    // InternalMySelenium.g:1827:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1831:1: ( rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 )
            // InternalMySelenium.g:1832:2: rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMySelenium.g:1839:1: rule__AssertEquals__Group__2__Impl : ( '=' ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1843:1: ( ( '=' ) )
            // InternalMySelenium.g:1844:1: ( '=' )
            {
            // InternalMySelenium.g:1844:1: ( '=' )
            // InternalMySelenium.g:1845:2: '='
            {
             before(grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalMySelenium.g:1854:1: rule__AssertEquals__Group__3 : rule__AssertEquals__Group__3__Impl ;
    public final void rule__AssertEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1858:1: ( rule__AssertEquals__Group__3__Impl )
            // InternalMySelenium.g:1859:2: rule__AssertEquals__Group__3__Impl
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
    // InternalMySelenium.g:1865:1: rule__AssertEquals__Group__3__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) ;
    public final void rule__AssertEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1869:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) )
            // InternalMySelenium.g:1870:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1870:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            // InternalMySelenium.g:1871:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 
            // InternalMySelenium.g:1872:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            // InternalMySelenium.g:1872:3: rule__AssertEquals__AssertableElementAssignment_3
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
    // InternalMySelenium.g:1881:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1885:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalMySelenium.g:1886:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMySelenium.g:1893:1: rule__AssertContains__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1897:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1898:1: ( 'assert' )
            {
            // InternalMySelenium.g:1898:1: ( 'assert' )
            // InternalMySelenium.g:1899:2: 'assert'
            {
             before(grammarAccess.getAssertContainsAccess().getAssertKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMySelenium.g:1908:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1912:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalMySelenium.g:1913:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMySelenium.g:1920:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__ContainerAssignment_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1924:1: ( ( ( rule__AssertContains__ContainerAssignment_1 ) ) )
            // InternalMySelenium.g:1925:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            {
            // InternalMySelenium.g:1925:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            // InternalMySelenium.g:1926:2: ( rule__AssertContains__ContainerAssignment_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 
            // InternalMySelenium.g:1927:2: ( rule__AssertContains__ContainerAssignment_1 )
            // InternalMySelenium.g:1927:3: rule__AssertContains__ContainerAssignment_1
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
    // InternalMySelenium.g:1935:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1939:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalMySelenium.g:1940:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMySelenium.g:1947:1: rule__AssertContains__Group__2__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1951:1: ( ( 'contains' ) )
            // InternalMySelenium.g:1952:1: ( 'contains' )
            {
            // InternalMySelenium.g:1952:1: ( 'contains' )
            // InternalMySelenium.g:1953:2: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getContainsKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getContainsKeyword_2()); 

            }


            }

        }
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
    // InternalMySelenium.g:1962:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1966:1: ( rule__AssertContains__Group__3__Impl )
            // InternalMySelenium.g:1967:2: rule__AssertContains__Group__3__Impl
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
    // InternalMySelenium.g:1973:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ElementAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1977:1: ( ( ( rule__AssertContains__ElementAssignment_3 ) ) )
            // InternalMySelenium.g:1978:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1978:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            // InternalMySelenium.g:1979:2: ( rule__AssertContains__ElementAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 
            // InternalMySelenium.g:1980:2: ( rule__AssertContains__ElementAssignment_3 )
            // InternalMySelenium.g:1980:3: rule__AssertContains__ElementAssignment_3
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
    // InternalMySelenium.g:1989:1: rule__NavigationAction__Group__0 : rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 ;
    public final void rule__NavigationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1993:1: ( rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 )
            // InternalMySelenium.g:1994:2: rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMySelenium.g:2001:1: rule__NavigationAction__Group__0__Impl : ( ( rule__NavigationAction__ActionAssignment_0 ) ) ;
    public final void rule__NavigationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2005:1: ( ( ( rule__NavigationAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:2006:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:2006:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:2007:2: ( rule__NavigationAction__ActionAssignment_0 )
            {
             before(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:2008:2: ( rule__NavigationAction__ActionAssignment_0 )
            // InternalMySelenium.g:2008:3: rule__NavigationAction__ActionAssignment_0
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
    // InternalMySelenium.g:2016:1: rule__NavigationAction__Group__1 : rule__NavigationAction__Group__1__Impl ;
    public final void rule__NavigationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2020:1: ( rule__NavigationAction__Group__1__Impl )
            // InternalMySelenium.g:2021:2: rule__NavigationAction__Group__1__Impl
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
    // InternalMySelenium.g:2027:1: rule__NavigationAction__Group__1__Impl : ( ( rule__NavigationAction__ParamAssignment_1 ) ) ;
    public final void rule__NavigationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2031:1: ( ( ( rule__NavigationAction__ParamAssignment_1 ) ) )
            // InternalMySelenium.g:2032:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            {
            // InternalMySelenium.g:2032:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            // InternalMySelenium.g:2033:2: ( rule__NavigationAction__ParamAssignment_1 )
            {
             before(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 
            // InternalMySelenium.g:2034:2: ( rule__NavigationAction__ParamAssignment_1 )
            // InternalMySelenium.g:2034:3: rule__NavigationAction__ParamAssignment_1
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


    // $ANTLR start "rule__Action__Group__0"
    // InternalMySelenium.g:2043:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2047:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMySelenium.g:2048:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMySelenium.g:2055:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActionAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2059:1: ( ( ( rule__Action__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:2060:1: ( ( rule__Action__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:2060:1: ( ( rule__Action__ActionAssignment_0 ) )
            // InternalMySelenium.g:2061:2: ( rule__Action__ActionAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:2062:2: ( rule__Action__ActionAssignment_0 )
            // InternalMySelenium.g:2062:3: rule__Action__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMySelenium.g:2070:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2074:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMySelenium.g:2075:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMySelenium.g:2082:1: rule__Action__Group__1__Impl : ( ( rule__Action__TargetAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2086:1: ( ( ( rule__Action__TargetAssignment_1 ) ) )
            // InternalMySelenium.g:2087:1: ( ( rule__Action__TargetAssignment_1 ) )
            {
            // InternalMySelenium.g:2087:1: ( ( rule__Action__TargetAssignment_1 ) )
            // InternalMySelenium.g:2088:2: ( rule__Action__TargetAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTargetAssignment_1()); 
            // InternalMySelenium.g:2089:2: ( rule__Action__TargetAssignment_1 )
            // InternalMySelenium.g:2089:3: rule__Action__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMySelenium.g:2097:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2101:1: ( rule__Action__Group__2__Impl )
            // InternalMySelenium.g:2102:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMySelenium.g:2108:1: rule__Action__Group__2__Impl : ( ( rule__Action__ParamAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2112:1: ( ( ( rule__Action__ParamAssignment_2 )? ) )
            // InternalMySelenium.g:2113:1: ( ( rule__Action__ParamAssignment_2 )? )
            {
            // InternalMySelenium.g:2113:1: ( ( rule__Action__ParamAssignment_2 )? )
            // InternalMySelenium.g:2114:2: ( rule__Action__ParamAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getParamAssignment_2()); 
            // InternalMySelenium.g:2115:2: ( rule__Action__ParamAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||(LA16_0>=22 && LA16_0<=31)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||LA16_2==RULE_ID||(LA16_2>=14 && LA16_2<=15)||(LA16_2>=32 && LA16_2<=35)||LA16_2==39||LA16_2==41||LA16_2==44) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMySelenium.g:2115:3: rule__Action__ParamAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ParamAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__AssignAction__Group__0"
    // InternalMySelenium.g:2124:1: rule__AssignAction__Group__0 : rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1 ;
    public final void rule__AssignAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2128:1: ( rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1 )
            // InternalMySelenium.g:2129:2: rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AssignAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__0"


    // $ANTLR start "rule__AssignAction__Group__0__Impl"
    // InternalMySelenium.g:2136:1: rule__AssignAction__Group__0__Impl : ( 'assign' ) ;
    public final void rule__AssignAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2140:1: ( ( 'assign' ) )
            // InternalMySelenium.g:2141:1: ( 'assign' )
            {
            // InternalMySelenium.g:2141:1: ( 'assign' )
            // InternalMySelenium.g:2142:2: 'assign'
            {
             before(grammarAccess.getAssignActionAccess().getAssignKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAssignActionAccess().getAssignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__0__Impl"


    // $ANTLR start "rule__AssignAction__Group__1"
    // InternalMySelenium.g:2151:1: rule__AssignAction__Group__1 : rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2 ;
    public final void rule__AssignAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2155:1: ( rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2 )
            // InternalMySelenium.g:2156:2: rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AssignAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__1"


    // $ANTLR start "rule__AssignAction__Group__1__Impl"
    // InternalMySelenium.g:2163:1: rule__AssignAction__Group__1__Impl : ( ( rule__AssignAction__TargetAssignment_1 ) ) ;
    public final void rule__AssignAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2167:1: ( ( ( rule__AssignAction__TargetAssignment_1 ) ) )
            // InternalMySelenium.g:2168:1: ( ( rule__AssignAction__TargetAssignment_1 ) )
            {
            // InternalMySelenium.g:2168:1: ( ( rule__AssignAction__TargetAssignment_1 ) )
            // InternalMySelenium.g:2169:2: ( rule__AssignAction__TargetAssignment_1 )
            {
             before(grammarAccess.getAssignActionAccess().getTargetAssignment_1()); 
            // InternalMySelenium.g:2170:2: ( rule__AssignAction__TargetAssignment_1 )
            // InternalMySelenium.g:2170:3: rule__AssignAction__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignAction__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignActionAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__1__Impl"


    // $ANTLR start "rule__AssignAction__Group__2"
    // InternalMySelenium.g:2178:1: rule__AssignAction__Group__2 : rule__AssignAction__Group__2__Impl ;
    public final void rule__AssignAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2182:1: ( rule__AssignAction__Group__2__Impl )
            // InternalMySelenium.g:2183:2: rule__AssignAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__2"


    // $ANTLR start "rule__AssignAction__Group__2__Impl"
    // InternalMySelenium.g:2189:1: rule__AssignAction__Group__2__Impl : ( ( rule__AssignAction__VariableAssignment_2 ) ) ;
    public final void rule__AssignAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2193:1: ( ( ( rule__AssignAction__VariableAssignment_2 ) ) )
            // InternalMySelenium.g:2194:1: ( ( rule__AssignAction__VariableAssignment_2 ) )
            {
            // InternalMySelenium.g:2194:1: ( ( rule__AssignAction__VariableAssignment_2 ) )
            // InternalMySelenium.g:2195:2: ( rule__AssignAction__VariableAssignment_2 )
            {
             before(grammarAccess.getAssignActionAccess().getVariableAssignment_2()); 
            // InternalMySelenium.g:2196:2: ( rule__AssignAction__VariableAssignment_2 )
            // InternalMySelenium.g:2196:3: rule__AssignAction__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssignAction__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignActionAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalMySelenium.g:2205:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2209:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMySelenium.g:2210:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMySelenium.g:2217:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__ElementAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2221:1: ( ( ( rule__Selector__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:2222:1: ( ( rule__Selector__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:2222:1: ( ( rule__Selector__ElementAssignment_0 ) )
            // InternalMySelenium.g:2223:2: ( rule__Selector__ElementAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:2224:2: ( rule__Selector__ElementAssignment_0 )
            // InternalMySelenium.g:2224:3: rule__Selector__ElementAssignment_0
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
    // InternalMySelenium.g:2232:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2236:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMySelenium.g:2237:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMySelenium.g:2244:1: rule__Selector__Group__1__Impl : ( '[' ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2248:1: ( ( '[' ) )
            // InternalMySelenium.g:2249:1: ( '[' )
            {
            // InternalMySelenium.g:2249:1: ( '[' )
            // InternalMySelenium.g:2250:2: '['
            {
             before(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMySelenium.g:2259:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2263:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMySelenium.g:2264:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMySelenium.g:2271:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__AttrsAssignment_2 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2275:1: ( ( ( rule__Selector__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:2276:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:2276:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            // InternalMySelenium.g:2277:2: ( rule__Selector__AttrsAssignment_2 )?
            {
             before(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:2278:2: ( rule__Selector__AttrsAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12||(LA17_0>=16 && LA17_0<=21)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:2278:3: rule__Selector__AttrsAssignment_2
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
    // InternalMySelenium.g:2286:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2290:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMySelenium.g:2291:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMySelenium.g:2298:1: rule__Selector__Group__3__Impl : ( ']' ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2302:1: ( ( ']' ) )
            // InternalMySelenium.g:2303:1: ( ']' )
            {
            // InternalMySelenium.g:2303:1: ( ']' )
            // InternalMySelenium.g:2304:2: ']'
            {
             before(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMySelenium.g:2313:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2317:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalMySelenium.g:2318:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Selector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMySelenium.g:2325:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2329:1: ( ( ( rule__Selector__Group_4__0 )? ) )
            // InternalMySelenium.g:2330:1: ( ( rule__Selector__Group_4__0 )? )
            {
            // InternalMySelenium.g:2330:1: ( ( rule__Selector__Group_4__0 )? )
            // InternalMySelenium.g:2331:2: ( rule__Selector__Group_4__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalMySelenium.g:2332:2: ( rule__Selector__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMySelenium.g:2332:3: rule__Selector__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Selector__Group__5"
    // InternalMySelenium.g:2340:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2344:1: ( rule__Selector__Group__5__Impl )
            // InternalMySelenium.g:2345:2: rule__Selector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5"


    // $ANTLR start "rule__Selector__Group__5__Impl"
    // InternalMySelenium.g:2351:1: rule__Selector__Group__5__Impl : ( ( rule__Selector__AllAssignment_5 )? ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2355:1: ( ( ( rule__Selector__AllAssignment_5 )? ) )
            // InternalMySelenium.g:2356:1: ( ( rule__Selector__AllAssignment_5 )? )
            {
            // InternalMySelenium.g:2356:1: ( ( rule__Selector__AllAssignment_5 )? )
            // InternalMySelenium.g:2357:2: ( rule__Selector__AllAssignment_5 )?
            {
             before(grammarAccess.getSelectorAccess().getAllAssignment_5()); 
            // InternalMySelenium.g:2358:2: ( rule__Selector__AllAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMySelenium.g:2358:3: rule__Selector__AllAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__AllAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAllAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5__Impl"


    // $ANTLR start "rule__Selector__Group_4__0"
    // InternalMySelenium.g:2367:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2371:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalMySelenium.g:2372:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Selector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0"


    // $ANTLR start "rule__Selector__Group_4__0__Impl"
    // InternalMySelenium.g:2379:1: rule__Selector__Group_4__0__Impl : ( '.parent' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2383:1: ( ( '.parent' ) )
            // InternalMySelenium.g:2384:1: ( '.parent' )
            {
            // InternalMySelenium.g:2384:1: ( '.parent' )
            // InternalMySelenium.g:2385:2: '.parent'
            {
             before(grammarAccess.getSelectorAccess().getParentKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getParentKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0__Impl"


    // $ANTLR start "rule__Selector__Group_4__1"
    // InternalMySelenium.g:2394:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2398:1: ( rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 )
            // InternalMySelenium.g:2399:2: rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Selector__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1"


    // $ANTLR start "rule__Selector__Group_4__1__Impl"
    // InternalMySelenium.g:2406:1: rule__Selector__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2410:1: ( ( '(' ) )
            // InternalMySelenium.g:2411:1: ( '(' )
            {
            // InternalMySelenium.g:2411:1: ( '(' )
            // InternalMySelenium.g:2412:2: '('
            {
             before(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1__Impl"


    // $ANTLR start "rule__Selector__Group_4__2"
    // InternalMySelenium.g:2421:1: rule__Selector__Group_4__2 : rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3 ;
    public final void rule__Selector__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2425:1: ( rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3 )
            // InternalMySelenium.g:2426:2: rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3
            {
            pushFollow(FOLLOW_24);
            rule__Selector__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__2"


    // $ANTLR start "rule__Selector__Group_4__2__Impl"
    // InternalMySelenium.g:2433:1: rule__Selector__Group_4__2__Impl : ( ( rule__Selector__ParentAssignment_4_2 ) ) ;
    public final void rule__Selector__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2437:1: ( ( ( rule__Selector__ParentAssignment_4_2 ) ) )
            // InternalMySelenium.g:2438:1: ( ( rule__Selector__ParentAssignment_4_2 ) )
            {
            // InternalMySelenium.g:2438:1: ( ( rule__Selector__ParentAssignment_4_2 ) )
            // InternalMySelenium.g:2439:2: ( rule__Selector__ParentAssignment_4_2 )
            {
             before(grammarAccess.getSelectorAccess().getParentAssignment_4_2()); 
            // InternalMySelenium.g:2440:2: ( rule__Selector__ParentAssignment_4_2 )
            // InternalMySelenium.g:2440:3: rule__Selector__ParentAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ParentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getParentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__2__Impl"


    // $ANTLR start "rule__Selector__Group_4__3"
    // InternalMySelenium.g:2448:1: rule__Selector__Group_4__3 : rule__Selector__Group_4__3__Impl ;
    public final void rule__Selector__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2452:1: ( rule__Selector__Group_4__3__Impl )
            // InternalMySelenium.g:2453:2: rule__Selector__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__3"


    // $ANTLR start "rule__Selector__Group_4__3__Impl"
    // InternalMySelenium.g:2459:1: rule__Selector__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Selector__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2463:1: ( ( ')' ) )
            // InternalMySelenium.g:2464:1: ( ')' )
            {
            // InternalMySelenium.g:2464:1: ( ')' )
            // InternalMySelenium.g:2465:2: ')'
            {
             before(grammarAccess.getSelectorAccess().getRightParenthesisKeyword_4_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__3__Impl"


    // $ANTLR start "rule__Parent__Group__0"
    // InternalMySelenium.g:2475:1: rule__Parent__Group__0 : rule__Parent__Group__0__Impl rule__Parent__Group__1 ;
    public final void rule__Parent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2479:1: ( rule__Parent__Group__0__Impl rule__Parent__Group__1 )
            // InternalMySelenium.g:2480:2: rule__Parent__Group__0__Impl rule__Parent__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Parent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__0"


    // $ANTLR start "rule__Parent__Group__0__Impl"
    // InternalMySelenium.g:2487:1: rule__Parent__Group__0__Impl : ( ( rule__Parent__ElementAssignment_0 ) ) ;
    public final void rule__Parent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2491:1: ( ( ( rule__Parent__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:2492:1: ( ( rule__Parent__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:2492:1: ( ( rule__Parent__ElementAssignment_0 ) )
            // InternalMySelenium.g:2493:2: ( rule__Parent__ElementAssignment_0 )
            {
             before(grammarAccess.getParentAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:2494:2: ( rule__Parent__ElementAssignment_0 )
            // InternalMySelenium.g:2494:3: rule__Parent__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parent__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParentAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__0__Impl"


    // $ANTLR start "rule__Parent__Group__1"
    // InternalMySelenium.g:2502:1: rule__Parent__Group__1 : rule__Parent__Group__1__Impl rule__Parent__Group__2 ;
    public final void rule__Parent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2506:1: ( rule__Parent__Group__1__Impl rule__Parent__Group__2 )
            // InternalMySelenium.g:2507:2: rule__Parent__Group__1__Impl rule__Parent__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Parent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__1"


    // $ANTLR start "rule__Parent__Group__1__Impl"
    // InternalMySelenium.g:2514:1: rule__Parent__Group__1__Impl : ( '[' ) ;
    public final void rule__Parent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2518:1: ( ( '[' ) )
            // InternalMySelenium.g:2519:1: ( '[' )
            {
            // InternalMySelenium.g:2519:1: ( '[' )
            // InternalMySelenium.g:2520:2: '['
            {
             before(grammarAccess.getParentAccess().getLeftSquareBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__1__Impl"


    // $ANTLR start "rule__Parent__Group__2"
    // InternalMySelenium.g:2529:1: rule__Parent__Group__2 : rule__Parent__Group__2__Impl rule__Parent__Group__3 ;
    public final void rule__Parent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2533:1: ( rule__Parent__Group__2__Impl rule__Parent__Group__3 )
            // InternalMySelenium.g:2534:2: rule__Parent__Group__2__Impl rule__Parent__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Parent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__2"


    // $ANTLR start "rule__Parent__Group__2__Impl"
    // InternalMySelenium.g:2541:1: rule__Parent__Group__2__Impl : ( ( rule__Parent__AttrsAssignment_2 )? ) ;
    public final void rule__Parent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2545:1: ( ( ( rule__Parent__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:2546:1: ( ( rule__Parent__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:2546:1: ( ( rule__Parent__AttrsAssignment_2 )? )
            // InternalMySelenium.g:2547:2: ( rule__Parent__AttrsAssignment_2 )?
            {
             before(grammarAccess.getParentAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:2548:2: ( rule__Parent__AttrsAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12||(LA20_0>=16 && LA20_0<=21)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMySelenium.g:2548:3: rule__Parent__AttrsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parent__AttrsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParentAccess().getAttrsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__2__Impl"


    // $ANTLR start "rule__Parent__Group__3"
    // InternalMySelenium.g:2556:1: rule__Parent__Group__3 : rule__Parent__Group__3__Impl ;
    public final void rule__Parent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2560:1: ( rule__Parent__Group__3__Impl )
            // InternalMySelenium.g:2561:2: rule__Parent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__3"


    // $ANTLR start "rule__Parent__Group__3__Impl"
    // InternalMySelenium.g:2567:1: rule__Parent__Group__3__Impl : ( ']' ) ;
    public final void rule__Parent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2571:1: ( ( ']' ) )
            // InternalMySelenium.g:2572:1: ( ']' )
            {
            // InternalMySelenium.g:2572:1: ( ']' )
            // InternalMySelenium.g:2573:2: ']'
            {
             before(grammarAccess.getParentAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__3__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalMySelenium.g:2583:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2587:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalMySelenium.g:2588:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMySelenium.g:2595:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttrsAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2599:1: ( ( ( rule__Attributes__AttrsAssignment_0 ) ) )
            // InternalMySelenium.g:2600:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            {
            // InternalMySelenium.g:2600:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            // InternalMySelenium.g:2601:2: ( rule__Attributes__AttrsAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 
            // InternalMySelenium.g:2602:2: ( rule__Attributes__AttrsAssignment_0 )
            // InternalMySelenium.g:2602:3: rule__Attributes__AttrsAssignment_0
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
    // InternalMySelenium.g:2610:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2614:1: ( rule__Attributes__Group__1__Impl )
            // InternalMySelenium.g:2615:2: rule__Attributes__Group__1__Impl
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
    // InternalMySelenium.g:2621:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2625:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalMySelenium.g:2626:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalMySelenium.g:2626:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalMySelenium.g:2627:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalMySelenium.g:2628:2: ( rule__Attributes__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:2628:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMySelenium.g:2637:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2641:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalMySelenium.g:2642:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMySelenium.g:2649:1: rule__Attributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2653:1: ( ( ',' ) )
            // InternalMySelenium.g:2654:1: ( ',' )
            {
            // InternalMySelenium.g:2654:1: ( ',' )
            // InternalMySelenium.g:2655:2: ','
            {
             before(grammarAccess.getAttributesAccess().getCommaKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMySelenium.g:2664:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2668:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalMySelenium.g:2669:2: rule__Attributes__Group_1__1__Impl
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
    // InternalMySelenium.g:2675:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttrsAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2679:1: ( ( ( rule__Attributes__AttrsAssignment_1_1 ) ) )
            // InternalMySelenium.g:2680:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            {
            // InternalMySelenium.g:2680:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            // InternalMySelenium.g:2681:2: ( rule__Attributes__AttrsAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 
            // InternalMySelenium.g:2682:2: ( rule__Attributes__AttrsAssignment_1_1 )
            // InternalMySelenium.g:2682:3: rule__Attributes__AttrsAssignment_1_1
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
    // InternalMySelenium.g:2691:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2695:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMySelenium.g:2696:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMySelenium.g:2703:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2707:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMySelenium.g:2708:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMySelenium.g:2708:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMySelenium.g:2709:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMySelenium.g:2710:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMySelenium.g:2710:3: rule__Attribute__NameAssignment_0
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
    // InternalMySelenium.g:2718:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2722:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMySelenium.g:2723:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMySelenium.g:2730:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2734:1: ( ( '=' ) )
            // InternalMySelenium.g:2735:1: ( '=' )
            {
            // InternalMySelenium.g:2735:1: ( '=' )
            // InternalMySelenium.g:2736:2: '='
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
    // InternalMySelenium.g:2745:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2749:1: ( rule__Attribute__Group__2__Impl )
            // InternalMySelenium.g:2750:2: rule__Attribute__Group__2__Impl
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
    // InternalMySelenium.g:2756:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Alternatives_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2760:1: ( ( ( rule__Attribute__Alternatives_2 ) ) )
            // InternalMySelenium.g:2761:1: ( ( rule__Attribute__Alternatives_2 ) )
            {
            // InternalMySelenium.g:2761:1: ( ( rule__Attribute__Alternatives_2 ) )
            // InternalMySelenium.g:2762:2: ( rule__Attribute__Alternatives_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_2()); 
            // InternalMySelenium.g:2763:2: ( rule__Attribute__Alternatives_2 )
            // InternalMySelenium.g:2763:3: rule__Attribute__Alternatives_2
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
    // InternalMySelenium.g:2772:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2776:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // InternalMySelenium.g:2777:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMySelenium.g:2784:1: rule__FunctionParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2788:1: ( ( '(' ) )
            // InternalMySelenium.g:2789:1: ( '(' )
            {
            // InternalMySelenium.g:2789:1: ( '(' )
            // InternalMySelenium.g:2790:2: '('
            {
             before(grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMySelenium.g:2799:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2803:1: ( rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 )
            // InternalMySelenium.g:2804:2: rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMySelenium.g:2811:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2815:1: ( ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2816:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2816:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2817:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2818:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2818:3: rule__FunctionParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2826:1: rule__FunctionParameters__Group__2 : rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 ;
    public final void rule__FunctionParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2830:1: ( rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 )
            // InternalMySelenium.g:2831:2: rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMySelenium.g:2838:1: rule__FunctionParameters__Group__2__Impl : ( ( rule__FunctionParameters__Group_2__0 )* ) ;
    public final void rule__FunctionParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2842:1: ( ( ( rule__FunctionParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2843:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2843:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            // InternalMySelenium.g:2844:2: ( rule__FunctionParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2845:2: ( rule__FunctionParameters__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMySelenium.g:2845:3: rule__FunctionParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__FunctionParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMySelenium.g:2853:1: rule__FunctionParameters__Group__3 : rule__FunctionParameters__Group__3__Impl ;
    public final void rule__FunctionParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2857:1: ( rule__FunctionParameters__Group__3__Impl )
            // InternalMySelenium.g:2858:2: rule__FunctionParameters__Group__3__Impl
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
    // InternalMySelenium.g:2864:1: rule__FunctionParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2868:1: ( ( ')' ) )
            // InternalMySelenium.g:2869:1: ( ')' )
            {
            // InternalMySelenium.g:2869:1: ( ')' )
            // InternalMySelenium.g:2870:2: ')'
            {
             before(grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMySelenium.g:2880:1: rule__FunctionParameters__Group_2__0 : rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 ;
    public final void rule__FunctionParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2884:1: ( rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 )
            // InternalMySelenium.g:2885:2: rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMySelenium.g:2892:1: rule__FunctionParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2896:1: ( ( ',' ) )
            // InternalMySelenium.g:2897:1: ( ',' )
            {
            // InternalMySelenium.g:2897:1: ( ',' )
            // InternalMySelenium.g:2898:2: ','
            {
             before(grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMySelenium.g:2907:1: rule__FunctionParameters__Group_2__1 : rule__FunctionParameters__Group_2__1__Impl ;
    public final void rule__FunctionParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2911:1: ( rule__FunctionParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2912:2: rule__FunctionParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2918:1: rule__FunctionParameters__Group_2__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2922:1: ( ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2923:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2923:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2924:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2925:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2925:3: rule__FunctionParameters__VariablesAssignment_2_1
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
    // InternalMySelenium.g:2934:1: rule__FunctionCallParameters__Group__0 : rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 ;
    public final void rule__FunctionCallParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2938:1: ( rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 )
            // InternalMySelenium.g:2939:2: rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMySelenium.g:2946:1: rule__FunctionCallParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2950:1: ( ( '(' ) )
            // InternalMySelenium.g:2951:1: ( '(' )
            {
            // InternalMySelenium.g:2951:1: ( '(' )
            // InternalMySelenium.g:2952:2: '('
            {
             before(grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMySelenium.g:2961:1: rule__FunctionCallParameters__Group__1 : rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 ;
    public final void rule__FunctionCallParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2965:1: ( rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 )
            // InternalMySelenium.g:2966:2: rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMySelenium.g:2973:1: rule__FunctionCallParameters__Group__1__Impl : ( ( rule__FunctionCallParameters__Group_1__0 )? ) ;
    public final void rule__FunctionCallParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2977:1: ( ( ( rule__FunctionCallParameters__Group_1__0 )? ) )
            // InternalMySelenium.g:2978:1: ( ( rule__FunctionCallParameters__Group_1__0 )? )
            {
            // InternalMySelenium.g:2978:1: ( ( rule__FunctionCallParameters__Group_1__0 )? )
            // InternalMySelenium.g:2979:2: ( rule__FunctionCallParameters__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_1()); 
            // InternalMySelenium.g:2980:2: ( rule__FunctionCallParameters__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMySelenium.g:2980:3: rule__FunctionCallParameters__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCallParameters__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallParametersAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMySelenium.g:2988:1: rule__FunctionCallParameters__Group__2 : rule__FunctionCallParameters__Group__2__Impl ;
    public final void rule__FunctionCallParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2992:1: ( rule__FunctionCallParameters__Group__2__Impl )
            // InternalMySelenium.g:2993:2: rule__FunctionCallParameters__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMySelenium.g:2999:1: rule__FunctionCallParameters__Group__2__Impl : ( ')' ) ;
    public final void rule__FunctionCallParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3003:1: ( ( ')' ) )
            // InternalMySelenium.g:3004:1: ( ')' )
            {
            // InternalMySelenium.g:3004:1: ( ')' )
            // InternalMySelenium.g:3005:2: ')'
            {
             before(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCallParameters__Group_1__0"
    // InternalMySelenium.g:3015:1: rule__FunctionCallParameters__Group_1__0 : rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1 ;
    public final void rule__FunctionCallParameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3019:1: ( rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1 )
            // InternalMySelenium.g:3020:2: rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__FunctionCallParameters__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1__0"


    // $ANTLR start "rule__FunctionCallParameters__Group_1__0__Impl"
    // InternalMySelenium.g:3027:1: rule__FunctionCallParameters__Group_1__0__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) ) ;
    public final void rule__FunctionCallParameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3031:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) ) )
            // InternalMySelenium.g:3032:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) )
            {
            // InternalMySelenium.g:3032:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) )
            // InternalMySelenium.g:3033:2: ( rule__FunctionCallParameters__VariablesAssignment_1_0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_0()); 
            // InternalMySelenium.g:3034:2: ( rule__FunctionCallParameters__VariablesAssignment_1_0 )
            // InternalMySelenium.g:3034:3: rule__FunctionCallParameters__VariablesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__VariablesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group_1__1"
    // InternalMySelenium.g:3042:1: rule__FunctionCallParameters__Group_1__1 : rule__FunctionCallParameters__Group_1__1__Impl ;
    public final void rule__FunctionCallParameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3046:1: ( rule__FunctionCallParameters__Group_1__1__Impl )
            // InternalMySelenium.g:3047:2: rule__FunctionCallParameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1__1"


    // $ANTLR start "rule__FunctionCallParameters__Group_1__1__Impl"
    // InternalMySelenium.g:3053:1: rule__FunctionCallParameters__Group_1__1__Impl : ( ( rule__FunctionCallParameters__Group_1_1__0 )* ) ;
    public final void rule__FunctionCallParameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3057:1: ( ( ( rule__FunctionCallParameters__Group_1_1__0 )* ) )
            // InternalMySelenium.g:3058:1: ( ( rule__FunctionCallParameters__Group_1_1__0 )* )
            {
            // InternalMySelenium.g:3058:1: ( ( rule__FunctionCallParameters__Group_1_1__0 )* )
            // InternalMySelenium.g:3059:2: ( rule__FunctionCallParameters__Group_1_1__0 )*
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_1_1()); 
            // InternalMySelenium.g:3060:2: ( rule__FunctionCallParameters__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMySelenium.g:3060:3: rule__FunctionCallParameters__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__FunctionCallParameters__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFunctionCallParametersAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group_1_1__0"
    // InternalMySelenium.g:3069:1: rule__FunctionCallParameters__Group_1_1__0 : rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1 ;
    public final void rule__FunctionCallParameters__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3073:1: ( rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1 )
            // InternalMySelenium.g:3074:2: rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCallParameters__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1_1__0"


    // $ANTLR start "rule__FunctionCallParameters__Group_1_1__0__Impl"
    // InternalMySelenium.g:3081:1: rule__FunctionCallParameters__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallParameters__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3085:1: ( ( ',' ) )
            // InternalMySelenium.g:3086:1: ( ',' )
            {
            // InternalMySelenium.g:3086:1: ( ',' )
            // InternalMySelenium.g:3087:2: ','
            {
             before(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1_1__0__Impl"


    // $ANTLR start "rule__FunctionCallParameters__Group_1_1__1"
    // InternalMySelenium.g:3096:1: rule__FunctionCallParameters__Group_1_1__1 : rule__FunctionCallParameters__Group_1_1__1__Impl ;
    public final void rule__FunctionCallParameters__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3100:1: ( rule__FunctionCallParameters__Group_1_1__1__Impl )
            // InternalMySelenium.g:3101:2: rule__FunctionCallParameters__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1_1__1"


    // $ANTLR start "rule__FunctionCallParameters__Group_1_1__1__Impl"
    // InternalMySelenium.g:3107:1: rule__FunctionCallParameters__Group_1_1__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) ) ;
    public final void rule__FunctionCallParameters__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3111:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) ) )
            // InternalMySelenium.g:3112:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) )
            {
            // InternalMySelenium.g:3112:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) )
            // InternalMySelenium.g:3113:2: ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_1_1()); 
            // InternalMySelenium.g:3114:2: ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 )
            // InternalMySelenium.g:3114:3: rule__FunctionCallParameters__VariablesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallParameters__VariablesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__Group_1_1__1__Impl"


    // $ANTLR start "rule__Functions__FunctionsAssignment_0"
    // InternalMySelenium.g:3123:1: rule__Functions__FunctionsAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3127:1: ( ( ruleFunction ) )
            // InternalMySelenium.g:3128:2: ( ruleFunction )
            {
            // InternalMySelenium.g:3128:2: ( ruleFunction )
            // InternalMySelenium.g:3129:3: ruleFunction
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__FunctionsAssignment_0"


    // $ANTLR start "rule__Functions__MainFunctionAssignment_1"
    // InternalMySelenium.g:3138:1: rule__Functions__MainFunctionAssignment_1 : ( ruleMainFunction ) ;
    public final void rule__Functions__MainFunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3142:1: ( ( ruleMainFunction ) )
            // InternalMySelenium.g:3143:2: ( ruleMainFunction )
            {
            // InternalMySelenium.g:3143:2: ( ruleMainFunction )
            // InternalMySelenium.g:3144:3: ruleMainFunction
            {
             before(grammarAccess.getFunctionsAccess().getMainFunctionMainFunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainFunction();

            state._fsp--;

             after(grammarAccess.getFunctionsAccess().getMainFunctionMainFunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__MainFunctionAssignment_1"


    // $ANTLR start "rule__Statements__StatementsAssignment"
    // InternalMySelenium.g:3153:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3157:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:3158:2: ( ruleStatement )
            {
            // InternalMySelenium.g:3158:2: ( ruleStatement )
            // InternalMySelenium.g:3159:3: ruleStatement
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


    // $ANTLR start "rule__MainFunction__StatementsAssignment_3"
    // InternalMySelenium.g:3168:1: rule__MainFunction__StatementsAssignment_3 : ( ruleStatements ) ;
    public final void rule__MainFunction__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3172:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:3173:2: ( ruleStatements )
            {
            // InternalMySelenium.g:3173:2: ( ruleStatements )
            // InternalMySelenium.g:3174:3: ruleStatements
            {
             before(grammarAccess.getMainFunctionAccess().getStatementsStatementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getMainFunctionAccess().getStatementsStatementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunction__StatementsAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalMySelenium.g:3183:1: rule__Function__NameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3187:1: ( ( ruleFunctionName ) )
            // InternalMySelenium.g:3188:2: ( ruleFunctionName )
            {
            // InternalMySelenium.g:3188:2: ( ruleFunctionName )
            // InternalMySelenium.g:3189:3: ruleFunctionName
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
    // InternalMySelenium.g:3198:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3202:1: ( ( ruleFunctionParameters ) )
            // InternalMySelenium.g:3203:2: ( ruleFunctionParameters )
            {
            // InternalMySelenium.g:3203:2: ( ruleFunctionParameters )
            // InternalMySelenium.g:3204:3: ruleFunctionParameters
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
    // InternalMySelenium.g:3213:1: rule__Function__StatementsAssignment_4 : ( ruleStatements ) ;
    public final void rule__Function__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3217:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:3218:2: ( ruleStatements )
            {
            // InternalMySelenium.g:3218:2: ( ruleStatements )
            // InternalMySelenium.g:3219:3: ruleStatements
            {
             before(grammarAccess.getFunctionAccess().getStatementsStatementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getStatementsStatementsParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMySelenium.g:3228:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3232:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3233:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3233:2: ( RULE_ID )
            // InternalMySelenium.g:3234:3: RULE_ID
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
    // InternalMySelenium.g:3243:1: rule__FunctionCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3247:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:3248:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:3248:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:3249:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 
            // InternalMySelenium.g:3250:3: ( RULE_ID )
            // InternalMySelenium.g:3251:4: RULE_ID
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
    // InternalMySelenium.g:3262:1: rule__FunctionCall__ParamsAssignment_1 : ( ruleFunctionCallParameters ) ;
    public final void rule__FunctionCall__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3266:1: ( ( ruleFunctionCallParameters ) )
            // InternalMySelenium.g:3267:2: ( ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:3267:2: ( ruleFunctionCallParameters )
            // InternalMySelenium.g:3268:3: ruleFunctionCallParameters
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
    // InternalMySelenium.g:3277:1: rule__Projection__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Projection__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3281:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:3282:2: ( ruleSelector )
            {
            // InternalMySelenium.g:3282:2: ( ruleSelector )
            // InternalMySelenium.g:3283:3: ruleSelector
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
    // InternalMySelenium.g:3292:1: rule__Projection__ProjectionActionAssignment_2 : ( ruleProjectionAction ) ;
    public final void rule__Projection__ProjectionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3296:1: ( ( ruleProjectionAction ) )
            // InternalMySelenium.g:3297:2: ( ruleProjectionAction )
            {
            // InternalMySelenium.g:3297:2: ( ruleProjectionAction )
            // InternalMySelenium.g:3298:3: ruleProjectionAction
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


    // $ANTLR start "rule__AssertEquals__AssertableElementAssignment_1"
    // InternalMySelenium.g:3307:1: rule__AssertEquals__AssertableElementAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3311:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3312:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3312:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3313:3: ruleAssertableElement
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


    // $ANTLR start "rule__AssertEquals__AssertableElementAssignment_3"
    // InternalMySelenium.g:3322:1: rule__AssertEquals__AssertableElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3326:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3327:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3327:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3328:3: ruleAssertableElement
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
    // InternalMySelenium.g:3337:1: rule__AssertContains__ContainerAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3341:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3342:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3342:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3343:3: ruleAssertableElement
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


    // $ANTLR start "rule__AssertContains__ElementAssignment_3"
    // InternalMySelenium.g:3352:1: rule__AssertContains__ElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3356:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3357:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3357:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3358:3: ruleAssertableElement
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
    // InternalMySelenium.g:3367:1: rule__NavigationAction__ActionAssignment_0 : ( ruleNavigationActionType ) ;
    public final void rule__NavigationAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3371:1: ( ( ruleNavigationActionType ) )
            // InternalMySelenium.g:3372:2: ( ruleNavigationActionType )
            {
            // InternalMySelenium.g:3372:2: ( ruleNavigationActionType )
            // InternalMySelenium.g:3373:3: ruleNavigationActionType
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
    // InternalMySelenium.g:3382:1: rule__NavigationAction__ParamAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NavigationAction__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3386:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3387:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3387:2: ( RULE_STRING )
            // InternalMySelenium.g:3388:3: RULE_STRING
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


    // $ANTLR start "rule__Action__ActionAssignment_0"
    // InternalMySelenium.g:3397:1: rule__Action__ActionAssignment_0 : ( ruleActionType ) ;
    public final void rule__Action__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3401:1: ( ( ruleActionType ) )
            // InternalMySelenium.g:3402:2: ( ruleActionType )
            {
            // InternalMySelenium.g:3402:2: ( ruleActionType )
            // InternalMySelenium.g:3403:3: ruleActionType
            {
             before(grammarAccess.getActionAccess().getActionActionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionActionTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionAssignment_0"


    // $ANTLR start "rule__Action__TargetAssignment_1"
    // InternalMySelenium.g:3412:1: rule__Action__TargetAssignment_1 : ( ruleActionTarget ) ;
    public final void rule__Action__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3416:1: ( ( ruleActionTarget ) )
            // InternalMySelenium.g:3417:2: ( ruleActionTarget )
            {
            // InternalMySelenium.g:3417:2: ( ruleActionTarget )
            // InternalMySelenium.g:3418:3: ruleActionTarget
            {
             before(grammarAccess.getActionAccess().getTargetActionTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionTarget();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTargetActionTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TargetAssignment_1"


    // $ANTLR start "rule__Action__ParamAssignment_2"
    // InternalMySelenium.g:3427:1: rule__Action__ParamAssignment_2 : ( ruleActionParameter ) ;
    public final void rule__Action__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3431:1: ( ( ruleActionParameter ) )
            // InternalMySelenium.g:3432:2: ( ruleActionParameter )
            {
            // InternalMySelenium.g:3432:2: ( ruleActionParameter )
            // InternalMySelenium.g:3433:3: ruleActionParameter
            {
             before(grammarAccess.getActionAccess().getParamActionParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionParameter();

            state._fsp--;

             after(grammarAccess.getActionAccess().getParamActionParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ParamAssignment_2"


    // $ANTLR start "rule__AssignAction__TargetAssignment_1"
    // InternalMySelenium.g:3442:1: rule__AssignAction__TargetAssignment_1 : ( ruleActionTarget ) ;
    public final void rule__AssignAction__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3446:1: ( ( ruleActionTarget ) )
            // InternalMySelenium.g:3447:2: ( ruleActionTarget )
            {
            // InternalMySelenium.g:3447:2: ( ruleActionTarget )
            // InternalMySelenium.g:3448:3: ruleActionTarget
            {
             before(grammarAccess.getAssignActionAccess().getTargetActionTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionTarget();

            state._fsp--;

             after(grammarAccess.getAssignActionAccess().getTargetActionTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__TargetAssignment_1"


    // $ANTLR start "rule__AssignAction__VariableAssignment_2"
    // InternalMySelenium.g:3457:1: rule__AssignAction__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__AssignAction__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3461:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3462:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3462:2: ( ruleVariable )
            // InternalMySelenium.g:3463:3: ruleVariable
            {
             before(grammarAccess.getAssignActionAccess().getVariableVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAssignActionAccess().getVariableVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignAction__VariableAssignment_2"


    // $ANTLR start "rule__ActionParameterString__ValueAssignment"
    // InternalMySelenium.g:3472:1: rule__ActionParameterString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ActionParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3476:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3477:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3477:2: ( RULE_STRING )
            // InternalMySelenium.g:3478:3: RULE_STRING
            {
             before(grammarAccess.getActionParameterStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionParameterStringAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionParameterString__ValueAssignment"


    // $ANTLR start "rule__Selector__ElementAssignment_0"
    // InternalMySelenium.g:3487:1: rule__Selector__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Selector__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3491:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:3492:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:3492:2: ( ruleDOMElement )
            // InternalMySelenium.g:3493:3: ruleDOMElement
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
    // InternalMySelenium.g:3502:1: rule__Selector__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3506:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:3507:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:3507:2: ( ruleAttributes )
            // InternalMySelenium.g:3508:3: ruleAttributes
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


    // $ANTLR start "rule__Selector__ParentAssignment_4_2"
    // InternalMySelenium.g:3517:1: rule__Selector__ParentAssignment_4_2 : ( ruleParent ) ;
    public final void rule__Selector__ParentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3521:1: ( ( ruleParent ) )
            // InternalMySelenium.g:3522:2: ( ruleParent )
            {
            // InternalMySelenium.g:3522:2: ( ruleParent )
            // InternalMySelenium.g:3523:3: ruleParent
            {
             before(grammarAccess.getSelectorAccess().getParentParentParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getParentParentParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ParentAssignment_4_2"


    // $ANTLR start "rule__Selector__AllAssignment_5"
    // InternalMySelenium.g:3532:1: rule__Selector__AllAssignment_5 : ( ( '.all' ) ) ;
    public final void rule__Selector__AllAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3536:1: ( ( ( '.all' ) ) )
            // InternalMySelenium.g:3537:2: ( ( '.all' ) )
            {
            // InternalMySelenium.g:3537:2: ( ( '.all' ) )
            // InternalMySelenium.g:3538:3: ( '.all' )
            {
             before(grammarAccess.getSelectorAccess().getAllAllKeyword_5_0()); 
            // InternalMySelenium.g:3539:3: ( '.all' )
            // InternalMySelenium.g:3540:4: '.all'
            {
             before(grammarAccess.getSelectorAccess().getAllAllKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getAllAllKeyword_5_0()); 

            }

             after(grammarAccess.getSelectorAccess().getAllAllKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__AllAssignment_5"


    // $ANTLR start "rule__Parent__ElementAssignment_0"
    // InternalMySelenium.g:3551:1: rule__Parent__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Parent__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3555:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:3556:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:3556:2: ( ruleDOMElement )
            // InternalMySelenium.g:3557:3: ruleDOMElement
            {
             before(grammarAccess.getParentAccess().getElementDOMElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMElement();

            state._fsp--;

             after(grammarAccess.getParentAccess().getElementDOMElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__ElementAssignment_0"


    // $ANTLR start "rule__Parent__AttrsAssignment_2"
    // InternalMySelenium.g:3566:1: rule__Parent__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Parent__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3570:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:3571:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:3571:2: ( ruleAttributes )
            // InternalMySelenium.g:3572:3: ruleAttributes
            {
             before(grammarAccess.getParentAccess().getAttrsAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getParentAccess().getAttrsAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__AttrsAssignment_2"


    // $ANTLR start "rule__Attributes__AttrsAssignment_0"
    // InternalMySelenium.g:3581:1: rule__Attributes__AttrsAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3585:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:3586:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:3586:2: ( ruleAttribute )
            // InternalMySelenium.g:3587:3: ruleAttribute
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
    // InternalMySelenium.g:3596:1: rule__Attributes__AttrsAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3600:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:3601:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:3601:2: ( ruleAttribute )
            // InternalMySelenium.g:3602:3: ruleAttribute
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
    // InternalMySelenium.g:3611:1: rule__Attribute__NameAssignment_0 : ( ruleDOMAttribute ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3615:1: ( ( ruleDOMAttribute ) )
            // InternalMySelenium.g:3616:2: ( ruleDOMAttribute )
            {
            // InternalMySelenium.g:3616:2: ( ruleDOMAttribute )
            // InternalMySelenium.g:3617:3: ruleDOMAttribute
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
    // InternalMySelenium.g:3626:1: rule__Attribute__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3630:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3631:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3631:2: ( RULE_STRING )
            // InternalMySelenium.g:3632:3: RULE_STRING
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


    // $ANTLR start "rule__Attribute__VariableAssignment_2_1"
    // InternalMySelenium.g:3641:1: rule__Attribute__VariableAssignment_2_1 : ( ruleVariableRef ) ;
    public final void rule__Attribute__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3645:1: ( ( ruleVariableRef ) )
            // InternalMySelenium.g:3646:2: ( ruleVariableRef )
            {
            // InternalMySelenium.g:3646:2: ( ruleVariableRef )
            // InternalMySelenium.g:3647:3: ruleVariableRef
            {
             before(grammarAccess.getAttributeAccess().getVariableVariableRefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableRef();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVariableVariableRefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VariableAssignment_2_1"


    // $ANTLR start "rule__FunctionParameters__VariablesAssignment_1"
    // InternalMySelenium.g:3656:1: rule__FunctionParameters__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3660:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3661:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3661:2: ( ruleVariable )
            // InternalMySelenium.g:3662:3: ruleVariable
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
    // InternalMySelenium.g:3671:1: rule__FunctionParameters__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3675:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3676:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3676:2: ( ruleVariable )
            // InternalMySelenium.g:3677:3: ruleVariable
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


    // $ANTLR start "rule__FunctionCallParameters__VariablesAssignment_1_0"
    // InternalMySelenium.g:3686:1: rule__FunctionCallParameters__VariablesAssignment_1_0 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3690:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:3691:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:3691:2: ( ruleVariableCall )
            // InternalMySelenium.g:3692:3: ruleVariableCall
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__VariablesAssignment_1_0"


    // $ANTLR start "rule__FunctionCallParameters__VariablesAssignment_1_1_1"
    // InternalMySelenium.g:3701:1: rule__FunctionCallParameters__VariablesAssignment_1_1_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3705:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:3706:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:3706:2: ( ruleVariableCall )
            // InternalMySelenium.g:3707:3: ruleVariableCall
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallParametersAccess().getVariablesVariableCallParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallParameters__VariablesAssignment_1_1_1"


    // $ANTLR start "rule__VariableRef__RefAssignment"
    // InternalMySelenium.g:3716:1: rule__VariableRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3720:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:3721:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:3721:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:3722:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableRefAccess().getRefVariableCrossReference_0()); 
            // InternalMySelenium.g:3723:3: ( RULE_ID )
            // InternalMySelenium.g:3724:4: RULE_ID
            {
             before(grammarAccess.getVariableRefAccess().getRefVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableRefAccess().getRefVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableRefAccess().getRefVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRef__RefAssignment"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalMySelenium.g:3735:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3739:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3740:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3740:2: ( RULE_ID )
            // InternalMySelenium.g:3741:3: RULE_ID
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


    // $ANTLR start "rule__StringParameter__ValueAssignment"
    // InternalMySelenium.g:3750:1: rule__StringParameter__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3754:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3755:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3755:2: ( RULE_STRING )
            // InternalMySelenium.g:3756:3: RULE_STRING
            {
             before(grammarAccess.getStringParameterAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringParameterAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameter__ValueAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\133\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\1\uffff\2\52\12\55\1\4\2\uffff\1\14\2\61\10\52\1\50\2\4\1\60\1\50\1\13\2\61\2\56\1\26\3\52\1\14\12\55\7\52\1\14\1\4\7\52\1\61\2\56\1\4\1\50\2\56\1\14\7\52\1\4\2\56";
    static final String dfa_3s = "\1\54\3\uffff\1\37\1\uffff\1\60\1\53\12\55\1\61\2\uffff\1\56\2\62\1\53\7\52\1\63\2\5\1\60\1\50\1\15\4\62\1\37\3\53\1\25\12\55\7\52\1\56\1\5\7\52\1\61\2\62\1\5\1\63\2\62\1\25\7\52\1\5\2\62";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\15\uffff\1\5\1\4\106\uffff";
    static final String dfa_5s = "\133\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\11\uffff\2\5\20\uffff\4\1\5\uffff\1\4\2\uffff\1\2",
            "",
            "",
            "",
            "\1\6\1\7\20\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "",
            "\1\24\1\23\4\uffff\1\22",
            "\1\24\1\23",
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
            "\1\26\1\27\53\uffff\1\30",
            "",
            "",
            "\1\32\3\uffff\1\31\1\33\1\34\1\35\1\36\1\37\30\uffff\1\40",
            "\1\30\1\41",
            "\1\30\1\41",
            "\1\24\1\23",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\45\6\uffff\1\43\3\uffff\1\44",
            "\1\46\1\47",
            "\1\51\1\50",
            "\1\52",
            "\1\45",
            "\1\53\1\54\1\55",
            "\1\30\1\41",
            "\1\30\1\41",
            "\1\40\3\uffff\1\56",
            "\1\40\3\uffff\1\56",
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\72\3\uffff\1\71\1\73\1\74\1\75\1\76\1\77",
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
            "\1\103\3\uffff\1\102\1\104\1\105\1\106\1\107\1\110\30\uffff\1\111",
            "\1\113\1\112",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\115",
            "\1\40\3\uffff\1\56",
            "\1\40\3\uffff\1\56",
            "\1\117\1\116",
            "\1\45\12\uffff\1\44",
            "\1\111\3\uffff\1\120",
            "\1\111\3\uffff\1\120",
            "\1\122\3\uffff\1\121\1\123\1\124\1\125\1\126\1\127",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\130",
            "\1\132\1\131",
            "\1\111\3\uffff\1\120",
            "\1\111\3\uffff\1\120"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "932:1: rule__Statement__Alternatives : ( ( ruleAction ) | ( ruleAssignAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000120F0000C012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000120F0000C010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000FFC00030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000FFC00010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00004000003F1000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000FFC00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003F1000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000030L});

}