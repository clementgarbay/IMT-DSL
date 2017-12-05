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

                if ( (LA5_1==48) ) {
                    alt5=4;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=14 && LA5_1<=15)||(LA5_1>=32 && LA5_1<=35)||LA5_1==39||(LA5_1>=41 && LA5_1<=44)) ) {
                    alt5=1;
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

                if ( (LA7_2==48) ) {
                    alt7=3;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_STRING)||(LA7_2>=14 && LA7_2<=15)||(LA7_2>=22 && LA7_2<=35)||LA7_2==39||LA7_2==41||LA7_2==44) ) {
                    alt7=2;
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
    // InternalMySelenium.g:1106:1: rule__DOMAttribute__Alternatives : ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) | ( 'value' ) );
    public final void rule__DOMAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1110:1: ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) | ( 'value' ) )
            int alt10=8;
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
            case 11:
                {
                alt10=8;
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
                case 8 :
                    // InternalMySelenium.g:1153:2: ( 'value' )
                    {
                    // InternalMySelenium.g:1153:2: ( 'value' )
                    // InternalMySelenium.g:1154:3: 'value'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getValueKeyword_7()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getValueKeyword_7()); 

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
    // InternalMySelenium.g:1163:1: rule__DOMElement__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) | ( 'div' ) );
    public final void rule__DOMElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1167:1: ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) | ( 'div' ) )
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
                    // InternalMySelenium.g:1168:2: ( 'link' )
                    {
                    // InternalMySelenium.g:1168:2: ( 'link' )
                    // InternalMySelenium.g:1169:3: 'link'
                    {
                     before(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1174:2: ( 'button' )
                    {
                    // InternalMySelenium.g:1174:2: ( 'button' )
                    // InternalMySelenium.g:1175:3: 'button'
                    {
                     before(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1180:2: ( 'checkbox' )
                    {
                    // InternalMySelenium.g:1180:2: ( 'checkbox' )
                    // InternalMySelenium.g:1181:3: 'checkbox'
                    {
                     before(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1186:2: ( 'input' )
                    {
                    // InternalMySelenium.g:1186:2: ( 'input' )
                    // InternalMySelenium.g:1187:3: 'input'
                    {
                     before(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:1192:2: ( 'h1' )
                    {
                    // InternalMySelenium.g:1192:2: ( 'h1' )
                    // InternalMySelenium.g:1193:3: 'h1'
                    {
                     before(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:1198:2: ( 'body' )
                    {
                    // InternalMySelenium.g:1198:2: ( 'body' )
                    // InternalMySelenium.g:1199:3: 'body'
                    {
                     before(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:1204:2: ( 'select' )
                    {
                    // InternalMySelenium.g:1204:2: ( 'select' )
                    // InternalMySelenium.g:1205:3: 'select'
                    {
                     before(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:1210:2: ( 'a' )
                    {
                    // InternalMySelenium.g:1210:2: ( 'a' )
                    // InternalMySelenium.g:1211:3: 'a'
                    {
                     before(grammarAccess.getDOMElementAccess().getAKeyword_7()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1216:2: ( 'img' )
                    {
                    // InternalMySelenium.g:1216:2: ( 'img' )
                    // InternalMySelenium.g:1217:3: 'img'
                    {
                     before(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMySelenium.g:1222:2: ( 'div' )
                    {
                    // InternalMySelenium.g:1222:2: ( 'div' )
                    // InternalMySelenium.g:1223:3: 'div'
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
    // InternalMySelenium.g:1232:1: rule__ActionType__Alternatives : ( ( 'click' ) | ( 'fill' ) | ( 'choose' ) | ( 'count' ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1236:1: ( ( 'click' ) | ( 'fill' ) | ( 'choose' ) | ( 'count' ) )
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
                    // InternalMySelenium.g:1237:2: ( 'click' )
                    {
                    // InternalMySelenium.g:1237:2: ( 'click' )
                    // InternalMySelenium.g:1238:3: 'click'
                    {
                     before(grammarAccess.getActionTypeAccess().getClickKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getClickKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1243:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:1243:2: ( 'fill' )
                    // InternalMySelenium.g:1244:3: 'fill'
                    {
                     before(grammarAccess.getActionTypeAccess().getFillKeyword_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getFillKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1249:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:1249:2: ( 'choose' )
                    // InternalMySelenium.g:1250:3: 'choose'
                    {
                     before(grammarAccess.getActionTypeAccess().getChooseKeyword_2()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getActionTypeAccess().getChooseKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1255:2: ( 'count' )
                    {
                    // InternalMySelenium.g:1255:2: ( 'count' )
                    // InternalMySelenium.g:1256:3: 'count'
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
    // InternalMySelenium.g:1265:1: rule__VariableCall__Alternatives : ( ( ruleVariableRef ) | ( ruleStringParameter ) );
    public final void rule__VariableCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1269:1: ( ( ruleVariableRef ) | ( ruleStringParameter ) )
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
                    // InternalMySelenium.g:1270:2: ( ruleVariableRef )
                    {
                    // InternalMySelenium.g:1270:2: ( ruleVariableRef )
                    // InternalMySelenium.g:1271:3: ruleVariableRef
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
                    // InternalMySelenium.g:1276:2: ( ruleStringParameter )
                    {
                    // InternalMySelenium.g:1276:2: ( ruleStringParameter )
                    // InternalMySelenium.g:1277:3: ruleStringParameter
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
    // InternalMySelenium.g:1286:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1290:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalMySelenium.g:1291:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
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
    // InternalMySelenium.g:1298:1: rule__Functions__Group__0__Impl : ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1302:1: ( ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) ) )
            // InternalMySelenium.g:1303:1: ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) )
            {
            // InternalMySelenium.g:1303:1: ( ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* ) )
            // InternalMySelenium.g:1304:2: ( ( rule__Functions__FunctionsAssignment_0 ) ) ( ( rule__Functions__FunctionsAssignment_0 )* )
            {
            // InternalMySelenium.g:1304:2: ( ( rule__Functions__FunctionsAssignment_0 ) )
            // InternalMySelenium.g:1305:3: ( rule__Functions__FunctionsAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 
            // InternalMySelenium.g:1306:3: ( rule__Functions__FunctionsAssignment_0 )
            // InternalMySelenium.g:1306:4: rule__Functions__FunctionsAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Functions__FunctionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 

            }

            // InternalMySelenium.g:1309:2: ( ( rule__Functions__FunctionsAssignment_0 )* )
            // InternalMySelenium.g:1310:3: ( rule__Functions__FunctionsAssignment_0 )*
            {
             before(grammarAccess.getFunctionsAccess().getFunctionsAssignment_0()); 
            // InternalMySelenium.g:1311:3: ( rule__Functions__FunctionsAssignment_0 )*
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
            	    // InternalMySelenium.g:1311:4: rule__Functions__FunctionsAssignment_0
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
    // InternalMySelenium.g:1320:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1324:1: ( rule__Functions__Group__1__Impl )
            // InternalMySelenium.g:1325:2: rule__Functions__Group__1__Impl
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
    // InternalMySelenium.g:1331:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__MainFunctionAssignment_1 ) ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1335:1: ( ( ( rule__Functions__MainFunctionAssignment_1 ) ) )
            // InternalMySelenium.g:1336:1: ( ( rule__Functions__MainFunctionAssignment_1 ) )
            {
            // InternalMySelenium.g:1336:1: ( ( rule__Functions__MainFunctionAssignment_1 ) )
            // InternalMySelenium.g:1337:2: ( rule__Functions__MainFunctionAssignment_1 )
            {
             before(grammarAccess.getFunctionsAccess().getMainFunctionAssignment_1()); 
            // InternalMySelenium.g:1338:2: ( rule__Functions__MainFunctionAssignment_1 )
            // InternalMySelenium.g:1338:3: rule__Functions__MainFunctionAssignment_1
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
    // InternalMySelenium.g:1347:1: rule__MainFunction__Group__0 : rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 ;
    public final void rule__MainFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1351:1: ( rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 )
            // InternalMySelenium.g:1352:2: rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1
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
    // InternalMySelenium.g:1359:1: rule__MainFunction__Group__0__Impl : ( 'def' ) ;
    public final void rule__MainFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1363:1: ( ( 'def' ) )
            // InternalMySelenium.g:1364:1: ( 'def' )
            {
            // InternalMySelenium.g:1364:1: ( 'def' )
            // InternalMySelenium.g:1365:2: 'def'
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
    // InternalMySelenium.g:1374:1: rule__MainFunction__Group__1 : rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 ;
    public final void rule__MainFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1378:1: ( rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 )
            // InternalMySelenium.g:1379:2: rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2
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
    // InternalMySelenium.g:1386:1: rule__MainFunction__Group__1__Impl : ( 'main' ) ;
    public final void rule__MainFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1390:1: ( ( 'main' ) )
            // InternalMySelenium.g:1391:1: ( 'main' )
            {
            // InternalMySelenium.g:1391:1: ( 'main' )
            // InternalMySelenium.g:1392:2: 'main'
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
    // InternalMySelenium.g:1401:1: rule__MainFunction__Group__2 : rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 ;
    public final void rule__MainFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1405:1: ( rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 )
            // InternalMySelenium.g:1406:2: rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3
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
    // InternalMySelenium.g:1413:1: rule__MainFunction__Group__2__Impl : ( '{' ) ;
    public final void rule__MainFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1417:1: ( ( '{' ) )
            // InternalMySelenium.g:1418:1: ( '{' )
            {
            // InternalMySelenium.g:1418:1: ( '{' )
            // InternalMySelenium.g:1419:2: '{'
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
    // InternalMySelenium.g:1428:1: rule__MainFunction__Group__3 : rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 ;
    public final void rule__MainFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1432:1: ( rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 )
            // InternalMySelenium.g:1433:2: rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4
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
    // InternalMySelenium.g:1440:1: rule__MainFunction__Group__3__Impl : ( ( rule__MainFunction__StatementsAssignment_3 ) ) ;
    public final void rule__MainFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1444:1: ( ( ( rule__MainFunction__StatementsAssignment_3 ) ) )
            // InternalMySelenium.g:1445:1: ( ( rule__MainFunction__StatementsAssignment_3 ) )
            {
            // InternalMySelenium.g:1445:1: ( ( rule__MainFunction__StatementsAssignment_3 ) )
            // InternalMySelenium.g:1446:2: ( rule__MainFunction__StatementsAssignment_3 )
            {
             before(grammarAccess.getMainFunctionAccess().getStatementsAssignment_3()); 
            // InternalMySelenium.g:1447:2: ( rule__MainFunction__StatementsAssignment_3 )
            // InternalMySelenium.g:1447:3: rule__MainFunction__StatementsAssignment_3
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
    // InternalMySelenium.g:1455:1: rule__MainFunction__Group__4 : rule__MainFunction__Group__4__Impl ;
    public final void rule__MainFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1459:1: ( rule__MainFunction__Group__4__Impl )
            // InternalMySelenium.g:1460:2: rule__MainFunction__Group__4__Impl
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
    // InternalMySelenium.g:1466:1: rule__MainFunction__Group__4__Impl : ( '}' ) ;
    public final void rule__MainFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1470:1: ( ( '}' ) )
            // InternalMySelenium.g:1471:1: ( '}' )
            {
            // InternalMySelenium.g:1471:1: ( '}' )
            // InternalMySelenium.g:1472:2: '}'
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
    // InternalMySelenium.g:1482:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1486:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMySelenium.g:1487:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalMySelenium.g:1494:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1498:1: ( ( 'def' ) )
            // InternalMySelenium.g:1499:1: ( 'def' )
            {
            // InternalMySelenium.g:1499:1: ( 'def' )
            // InternalMySelenium.g:1500:2: 'def'
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
    // InternalMySelenium.g:1509:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1513:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMySelenium.g:1514:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalMySelenium.g:1521:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1525:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMySelenium.g:1526:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMySelenium.g:1526:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMySelenium.g:1527:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMySelenium.g:1528:2: ( rule__Function__NameAssignment_1 )
            // InternalMySelenium.g:1528:3: rule__Function__NameAssignment_1
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
    // InternalMySelenium.g:1536:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1540:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMySelenium.g:1541:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalMySelenium.g:1548:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )? ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1552:1: ( ( ( rule__Function__ParamsAssignment_2 )? ) )
            // InternalMySelenium.g:1553:1: ( ( rule__Function__ParamsAssignment_2 )? )
            {
            // InternalMySelenium.g:1553:1: ( ( rule__Function__ParamsAssignment_2 )? )
            // InternalMySelenium.g:1554:2: ( rule__Function__ParamsAssignment_2 )?
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalMySelenium.g:1555:2: ( rule__Function__ParamsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMySelenium.g:1555:3: rule__Function__ParamsAssignment_2
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
    // InternalMySelenium.g:1563:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1567:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMySelenium.g:1568:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalMySelenium.g:1575:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1579:1: ( ( '{' ) )
            // InternalMySelenium.g:1580:1: ( '{' )
            {
            // InternalMySelenium.g:1580:1: ( '{' )
            // InternalMySelenium.g:1581:2: '{'
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
    // InternalMySelenium.g:1590:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1594:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMySelenium.g:1595:2: rule__Function__Group__4__Impl rule__Function__Group__5
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
    // InternalMySelenium.g:1602:1: rule__Function__Group__4__Impl : ( ( rule__Function__StatementsAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1606:1: ( ( ( rule__Function__StatementsAssignment_4 ) ) )
            // InternalMySelenium.g:1607:1: ( ( rule__Function__StatementsAssignment_4 ) )
            {
            // InternalMySelenium.g:1607:1: ( ( rule__Function__StatementsAssignment_4 ) )
            // InternalMySelenium.g:1608:2: ( rule__Function__StatementsAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 
            // InternalMySelenium.g:1609:2: ( rule__Function__StatementsAssignment_4 )
            // InternalMySelenium.g:1609:3: rule__Function__StatementsAssignment_4
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
    // InternalMySelenium.g:1617:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1621:1: ( rule__Function__Group__5__Impl )
            // InternalMySelenium.g:1622:2: rule__Function__Group__5__Impl
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
    // InternalMySelenium.g:1628:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1632:1: ( ( '}' ) )
            // InternalMySelenium.g:1633:1: ( '}' )
            {
            // InternalMySelenium.g:1633:1: ( '}' )
            // InternalMySelenium.g:1634:2: '}'
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
    // InternalMySelenium.g:1644:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1648:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMySelenium.g:1649:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalMySelenium.g:1656:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__RefAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1660:1: ( ( ( rule__FunctionCall__RefAssignment_0 ) ) )
            // InternalMySelenium.g:1661:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            {
            // InternalMySelenium.g:1661:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            // InternalMySelenium.g:1662:2: ( rule__FunctionCall__RefAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 
            // InternalMySelenium.g:1663:2: ( rule__FunctionCall__RefAssignment_0 )
            // InternalMySelenium.g:1663:3: rule__FunctionCall__RefAssignment_0
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
    // InternalMySelenium.g:1671:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1675:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMySelenium.g:1676:2: rule__FunctionCall__Group__1__Impl
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
    // InternalMySelenium.g:1682:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__ParamsAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1686:1: ( ( ( rule__FunctionCall__ParamsAssignment_1 ) ) )
            // InternalMySelenium.g:1687:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            {
            // InternalMySelenium.g:1687:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            // InternalMySelenium.g:1688:2: ( rule__FunctionCall__ParamsAssignment_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 
            // InternalMySelenium.g:1689:2: ( rule__FunctionCall__ParamsAssignment_1 )
            // InternalMySelenium.g:1689:3: rule__FunctionCall__ParamsAssignment_1
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
    // InternalMySelenium.g:1698:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1702:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMySelenium.g:1703:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
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
    // InternalMySelenium.g:1710:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__SelectorAssignment_0 ) ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1714:1: ( ( ( rule__Projection__SelectorAssignment_0 ) ) )
            // InternalMySelenium.g:1715:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            {
            // InternalMySelenium.g:1715:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            // InternalMySelenium.g:1716:2: ( rule__Projection__SelectorAssignment_0 )
            {
             before(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 
            // InternalMySelenium.g:1717:2: ( rule__Projection__SelectorAssignment_0 )
            // InternalMySelenium.g:1717:3: rule__Projection__SelectorAssignment_0
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
    // InternalMySelenium.g:1725:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1729:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalMySelenium.g:1730:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
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
    // InternalMySelenium.g:1737:1: rule__Projection__Group__1__Impl : ( '.' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1741:1: ( ( '.' ) )
            // InternalMySelenium.g:1742:1: ( '.' )
            {
            // InternalMySelenium.g:1742:1: ( '.' )
            // InternalMySelenium.g:1743:2: '.'
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
    // InternalMySelenium.g:1752:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1756:1: ( rule__Projection__Group__2__Impl )
            // InternalMySelenium.g:1757:2: rule__Projection__Group__2__Impl
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
    // InternalMySelenium.g:1763:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__ProjectionActionAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1767:1: ( ( ( rule__Projection__ProjectionActionAssignment_2 ) ) )
            // InternalMySelenium.g:1768:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            {
            // InternalMySelenium.g:1768:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            // InternalMySelenium.g:1769:2: ( rule__Projection__ProjectionActionAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 
            // InternalMySelenium.g:1770:2: ( rule__Projection__ProjectionActionAssignment_2 )
            // InternalMySelenium.g:1770:3: rule__Projection__ProjectionActionAssignment_2
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
    // InternalMySelenium.g:1779:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1783:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalMySelenium.g:1784:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
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
    // InternalMySelenium.g:1791:1: rule__AssertEquals__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1795:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1796:1: ( 'assert' )
            {
            // InternalMySelenium.g:1796:1: ( 'assert' )
            // InternalMySelenium.g:1797:2: 'assert'
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
    // InternalMySelenium.g:1806:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1810:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalMySelenium.g:1811:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
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
    // InternalMySelenium.g:1818:1: rule__AssertEquals__Group__1__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1822:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) )
            // InternalMySelenium.g:1823:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            {
            // InternalMySelenium.g:1823:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            // InternalMySelenium.g:1824:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 
            // InternalMySelenium.g:1825:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            // InternalMySelenium.g:1825:3: rule__AssertEquals__AssertableElementAssignment_1
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
    // InternalMySelenium.g:1833:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1837:1: ( rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 )
            // InternalMySelenium.g:1838:2: rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3
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
    // InternalMySelenium.g:1845:1: rule__AssertEquals__Group__2__Impl : ( '=' ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1849:1: ( ( '=' ) )
            // InternalMySelenium.g:1850:1: ( '=' )
            {
            // InternalMySelenium.g:1850:1: ( '=' )
            // InternalMySelenium.g:1851:2: '='
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
    // InternalMySelenium.g:1860:1: rule__AssertEquals__Group__3 : rule__AssertEquals__Group__3__Impl ;
    public final void rule__AssertEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1864:1: ( rule__AssertEquals__Group__3__Impl )
            // InternalMySelenium.g:1865:2: rule__AssertEquals__Group__3__Impl
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
    // InternalMySelenium.g:1871:1: rule__AssertEquals__Group__3__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) ;
    public final void rule__AssertEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1875:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) )
            // InternalMySelenium.g:1876:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1876:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            // InternalMySelenium.g:1877:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 
            // InternalMySelenium.g:1878:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            // InternalMySelenium.g:1878:3: rule__AssertEquals__AssertableElementAssignment_3
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
    // InternalMySelenium.g:1887:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1891:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalMySelenium.g:1892:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
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
    // InternalMySelenium.g:1899:1: rule__AssertContains__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1903:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1904:1: ( 'assert' )
            {
            // InternalMySelenium.g:1904:1: ( 'assert' )
            // InternalMySelenium.g:1905:2: 'assert'
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
    // InternalMySelenium.g:1914:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1918:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalMySelenium.g:1919:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
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
    // InternalMySelenium.g:1926:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__ContainerAssignment_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1930:1: ( ( ( rule__AssertContains__ContainerAssignment_1 ) ) )
            // InternalMySelenium.g:1931:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            {
            // InternalMySelenium.g:1931:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            // InternalMySelenium.g:1932:2: ( rule__AssertContains__ContainerAssignment_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 
            // InternalMySelenium.g:1933:2: ( rule__AssertContains__ContainerAssignment_1 )
            // InternalMySelenium.g:1933:3: rule__AssertContains__ContainerAssignment_1
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
    // InternalMySelenium.g:1941:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1945:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalMySelenium.g:1946:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
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
    // InternalMySelenium.g:1953:1: rule__AssertContains__Group__2__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1957:1: ( ( 'contains' ) )
            // InternalMySelenium.g:1958:1: ( 'contains' )
            {
            // InternalMySelenium.g:1958:1: ( 'contains' )
            // InternalMySelenium.g:1959:2: 'contains'
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
    // InternalMySelenium.g:1968:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1972:1: ( rule__AssertContains__Group__3__Impl )
            // InternalMySelenium.g:1973:2: rule__AssertContains__Group__3__Impl
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
    // InternalMySelenium.g:1979:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ElementAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1983:1: ( ( ( rule__AssertContains__ElementAssignment_3 ) ) )
            // InternalMySelenium.g:1984:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1984:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            // InternalMySelenium.g:1985:2: ( rule__AssertContains__ElementAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 
            // InternalMySelenium.g:1986:2: ( rule__AssertContains__ElementAssignment_3 )
            // InternalMySelenium.g:1986:3: rule__AssertContains__ElementAssignment_3
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
    // InternalMySelenium.g:1995:1: rule__NavigationAction__Group__0 : rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 ;
    public final void rule__NavigationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1999:1: ( rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 )
            // InternalMySelenium.g:2000:2: rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1
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
    // InternalMySelenium.g:2007:1: rule__NavigationAction__Group__0__Impl : ( ( rule__NavigationAction__ActionAssignment_0 ) ) ;
    public final void rule__NavigationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2011:1: ( ( ( rule__NavigationAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:2012:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:2012:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:2013:2: ( rule__NavigationAction__ActionAssignment_0 )
            {
             before(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:2014:2: ( rule__NavigationAction__ActionAssignment_0 )
            // InternalMySelenium.g:2014:3: rule__NavigationAction__ActionAssignment_0
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
    // InternalMySelenium.g:2022:1: rule__NavigationAction__Group__1 : rule__NavigationAction__Group__1__Impl ;
    public final void rule__NavigationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2026:1: ( rule__NavigationAction__Group__1__Impl )
            // InternalMySelenium.g:2027:2: rule__NavigationAction__Group__1__Impl
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
    // InternalMySelenium.g:2033:1: rule__NavigationAction__Group__1__Impl : ( ( rule__NavigationAction__ParamAssignment_1 ) ) ;
    public final void rule__NavigationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2037:1: ( ( ( rule__NavigationAction__ParamAssignment_1 ) ) )
            // InternalMySelenium.g:2038:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            {
            // InternalMySelenium.g:2038:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            // InternalMySelenium.g:2039:2: ( rule__NavigationAction__ParamAssignment_1 )
            {
             before(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 
            // InternalMySelenium.g:2040:2: ( rule__NavigationAction__ParamAssignment_1 )
            // InternalMySelenium.g:2040:3: rule__NavigationAction__ParamAssignment_1
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
    // InternalMySelenium.g:2049:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2053:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMySelenium.g:2054:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalMySelenium.g:2061:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActionAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2065:1: ( ( ( rule__Action__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:2066:1: ( ( rule__Action__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:2066:1: ( ( rule__Action__ActionAssignment_0 ) )
            // InternalMySelenium.g:2067:2: ( rule__Action__ActionAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:2068:2: ( rule__Action__ActionAssignment_0 )
            // InternalMySelenium.g:2068:3: rule__Action__ActionAssignment_0
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
    // InternalMySelenium.g:2076:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2080:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMySelenium.g:2081:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalMySelenium.g:2088:1: rule__Action__Group__1__Impl : ( ( rule__Action__TargetAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2092:1: ( ( ( rule__Action__TargetAssignment_1 ) ) )
            // InternalMySelenium.g:2093:1: ( ( rule__Action__TargetAssignment_1 ) )
            {
            // InternalMySelenium.g:2093:1: ( ( rule__Action__TargetAssignment_1 ) )
            // InternalMySelenium.g:2094:2: ( rule__Action__TargetAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTargetAssignment_1()); 
            // InternalMySelenium.g:2095:2: ( rule__Action__TargetAssignment_1 )
            // InternalMySelenium.g:2095:3: rule__Action__TargetAssignment_1
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
    // InternalMySelenium.g:2103:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2107:1: ( rule__Action__Group__2__Impl )
            // InternalMySelenium.g:2108:2: rule__Action__Group__2__Impl
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
    // InternalMySelenium.g:2114:1: rule__Action__Group__2__Impl : ( ( rule__Action__ParamAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2118:1: ( ( ( rule__Action__ParamAssignment_2 )? ) )
            // InternalMySelenium.g:2119:1: ( ( rule__Action__ParamAssignment_2 )? )
            {
            // InternalMySelenium.g:2119:1: ( ( rule__Action__ParamAssignment_2 )? )
            // InternalMySelenium.g:2120:2: ( rule__Action__ParamAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getParamAssignment_2()); 
            // InternalMySelenium.g:2121:2: ( rule__Action__ParamAssignment_2 )?
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
                    // InternalMySelenium.g:2121:3: rule__Action__ParamAssignment_2
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
    // InternalMySelenium.g:2130:1: rule__AssignAction__Group__0 : rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1 ;
    public final void rule__AssignAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2134:1: ( rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1 )
            // InternalMySelenium.g:2135:2: rule__AssignAction__Group__0__Impl rule__AssignAction__Group__1
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
    // InternalMySelenium.g:2142:1: rule__AssignAction__Group__0__Impl : ( 'assign' ) ;
    public final void rule__AssignAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2146:1: ( ( 'assign' ) )
            // InternalMySelenium.g:2147:1: ( 'assign' )
            {
            // InternalMySelenium.g:2147:1: ( 'assign' )
            // InternalMySelenium.g:2148:2: 'assign'
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
    // InternalMySelenium.g:2157:1: rule__AssignAction__Group__1 : rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2 ;
    public final void rule__AssignAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2161:1: ( rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2 )
            // InternalMySelenium.g:2162:2: rule__AssignAction__Group__1__Impl rule__AssignAction__Group__2
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
    // InternalMySelenium.g:2169:1: rule__AssignAction__Group__1__Impl : ( ( rule__AssignAction__TargetAssignment_1 ) ) ;
    public final void rule__AssignAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2173:1: ( ( ( rule__AssignAction__TargetAssignment_1 ) ) )
            // InternalMySelenium.g:2174:1: ( ( rule__AssignAction__TargetAssignment_1 ) )
            {
            // InternalMySelenium.g:2174:1: ( ( rule__AssignAction__TargetAssignment_1 ) )
            // InternalMySelenium.g:2175:2: ( rule__AssignAction__TargetAssignment_1 )
            {
             before(grammarAccess.getAssignActionAccess().getTargetAssignment_1()); 
            // InternalMySelenium.g:2176:2: ( rule__AssignAction__TargetAssignment_1 )
            // InternalMySelenium.g:2176:3: rule__AssignAction__TargetAssignment_1
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
    // InternalMySelenium.g:2184:1: rule__AssignAction__Group__2 : rule__AssignAction__Group__2__Impl ;
    public final void rule__AssignAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2188:1: ( rule__AssignAction__Group__2__Impl )
            // InternalMySelenium.g:2189:2: rule__AssignAction__Group__2__Impl
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
    // InternalMySelenium.g:2195:1: rule__AssignAction__Group__2__Impl : ( ( rule__AssignAction__VariableAssignment_2 ) ) ;
    public final void rule__AssignAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2199:1: ( ( ( rule__AssignAction__VariableAssignment_2 ) ) )
            // InternalMySelenium.g:2200:1: ( ( rule__AssignAction__VariableAssignment_2 ) )
            {
            // InternalMySelenium.g:2200:1: ( ( rule__AssignAction__VariableAssignment_2 ) )
            // InternalMySelenium.g:2201:2: ( rule__AssignAction__VariableAssignment_2 )
            {
             before(grammarAccess.getAssignActionAccess().getVariableAssignment_2()); 
            // InternalMySelenium.g:2202:2: ( rule__AssignAction__VariableAssignment_2 )
            // InternalMySelenium.g:2202:3: rule__AssignAction__VariableAssignment_2
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
    // InternalMySelenium.g:2211:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2215:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMySelenium.g:2216:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalMySelenium.g:2223:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__ElementAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2227:1: ( ( ( rule__Selector__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:2228:1: ( ( rule__Selector__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:2228:1: ( ( rule__Selector__ElementAssignment_0 ) )
            // InternalMySelenium.g:2229:2: ( rule__Selector__ElementAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:2230:2: ( rule__Selector__ElementAssignment_0 )
            // InternalMySelenium.g:2230:3: rule__Selector__ElementAssignment_0
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
    // InternalMySelenium.g:2238:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2242:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMySelenium.g:2243:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
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
    // InternalMySelenium.g:2250:1: rule__Selector__Group__1__Impl : ( '[' ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2254:1: ( ( '[' ) )
            // InternalMySelenium.g:2255:1: ( '[' )
            {
            // InternalMySelenium.g:2255:1: ( '[' )
            // InternalMySelenium.g:2256:2: '['
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
    // InternalMySelenium.g:2265:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2269:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMySelenium.g:2270:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
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
    // InternalMySelenium.g:2277:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__AttrsAssignment_2 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2281:1: ( ( ( rule__Selector__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:2282:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:2282:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            // InternalMySelenium.g:2283:2: ( rule__Selector__AttrsAssignment_2 )?
            {
             before(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:2284:2: ( rule__Selector__AttrsAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)||(LA17_0>=16 && LA17_0<=21)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:2284:3: rule__Selector__AttrsAssignment_2
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
    // InternalMySelenium.g:2292:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2296:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMySelenium.g:2297:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
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
    // InternalMySelenium.g:2304:1: rule__Selector__Group__3__Impl : ( ']' ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2308:1: ( ( ']' ) )
            // InternalMySelenium.g:2309:1: ( ']' )
            {
            // InternalMySelenium.g:2309:1: ( ']' )
            // InternalMySelenium.g:2310:2: ']'
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
    // InternalMySelenium.g:2319:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2323:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalMySelenium.g:2324:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
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
    // InternalMySelenium.g:2331:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2335:1: ( ( ( rule__Selector__Group_4__0 )? ) )
            // InternalMySelenium.g:2336:1: ( ( rule__Selector__Group_4__0 )? )
            {
            // InternalMySelenium.g:2336:1: ( ( rule__Selector__Group_4__0 )? )
            // InternalMySelenium.g:2337:2: ( rule__Selector__Group_4__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalMySelenium.g:2338:2: ( rule__Selector__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMySelenium.g:2338:3: rule__Selector__Group_4__0
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
    // InternalMySelenium.g:2346:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2350:1: ( rule__Selector__Group__5__Impl )
            // InternalMySelenium.g:2351:2: rule__Selector__Group__5__Impl
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
    // InternalMySelenium.g:2357:1: rule__Selector__Group__5__Impl : ( ( rule__Selector__AllAssignment_5 )? ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2361:1: ( ( ( rule__Selector__AllAssignment_5 )? ) )
            // InternalMySelenium.g:2362:1: ( ( rule__Selector__AllAssignment_5 )? )
            {
            // InternalMySelenium.g:2362:1: ( ( rule__Selector__AllAssignment_5 )? )
            // InternalMySelenium.g:2363:2: ( rule__Selector__AllAssignment_5 )?
            {
             before(grammarAccess.getSelectorAccess().getAllAssignment_5()); 
            // InternalMySelenium.g:2364:2: ( rule__Selector__AllAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMySelenium.g:2364:3: rule__Selector__AllAssignment_5
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
    // InternalMySelenium.g:2373:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2377:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalMySelenium.g:2378:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
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
    // InternalMySelenium.g:2385:1: rule__Selector__Group_4__0__Impl : ( '.parent' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2389:1: ( ( '.parent' ) )
            // InternalMySelenium.g:2390:1: ( '.parent' )
            {
            // InternalMySelenium.g:2390:1: ( '.parent' )
            // InternalMySelenium.g:2391:2: '.parent'
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
    // InternalMySelenium.g:2400:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2404:1: ( rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 )
            // InternalMySelenium.g:2405:2: rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2
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
    // InternalMySelenium.g:2412:1: rule__Selector__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2416:1: ( ( '(' ) )
            // InternalMySelenium.g:2417:1: ( '(' )
            {
            // InternalMySelenium.g:2417:1: ( '(' )
            // InternalMySelenium.g:2418:2: '('
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
    // InternalMySelenium.g:2427:1: rule__Selector__Group_4__2 : rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3 ;
    public final void rule__Selector__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2431:1: ( rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3 )
            // InternalMySelenium.g:2432:2: rule__Selector__Group_4__2__Impl rule__Selector__Group_4__3
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
    // InternalMySelenium.g:2439:1: rule__Selector__Group_4__2__Impl : ( ( rule__Selector__ParentAssignment_4_2 ) ) ;
    public final void rule__Selector__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2443:1: ( ( ( rule__Selector__ParentAssignment_4_2 ) ) )
            // InternalMySelenium.g:2444:1: ( ( rule__Selector__ParentAssignment_4_2 ) )
            {
            // InternalMySelenium.g:2444:1: ( ( rule__Selector__ParentAssignment_4_2 ) )
            // InternalMySelenium.g:2445:2: ( rule__Selector__ParentAssignment_4_2 )
            {
             before(grammarAccess.getSelectorAccess().getParentAssignment_4_2()); 
            // InternalMySelenium.g:2446:2: ( rule__Selector__ParentAssignment_4_2 )
            // InternalMySelenium.g:2446:3: rule__Selector__ParentAssignment_4_2
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
    // InternalMySelenium.g:2454:1: rule__Selector__Group_4__3 : rule__Selector__Group_4__3__Impl ;
    public final void rule__Selector__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2458:1: ( rule__Selector__Group_4__3__Impl )
            // InternalMySelenium.g:2459:2: rule__Selector__Group_4__3__Impl
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
    // InternalMySelenium.g:2465:1: rule__Selector__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Selector__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2469:1: ( ( ')' ) )
            // InternalMySelenium.g:2470:1: ( ')' )
            {
            // InternalMySelenium.g:2470:1: ( ')' )
            // InternalMySelenium.g:2471:2: ')'
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
    // InternalMySelenium.g:2481:1: rule__Parent__Group__0 : rule__Parent__Group__0__Impl rule__Parent__Group__1 ;
    public final void rule__Parent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2485:1: ( rule__Parent__Group__0__Impl rule__Parent__Group__1 )
            // InternalMySelenium.g:2486:2: rule__Parent__Group__0__Impl rule__Parent__Group__1
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
    // InternalMySelenium.g:2493:1: rule__Parent__Group__0__Impl : ( ( rule__Parent__ElementAssignment_0 ) ) ;
    public final void rule__Parent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2497:1: ( ( ( rule__Parent__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:2498:1: ( ( rule__Parent__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:2498:1: ( ( rule__Parent__ElementAssignment_0 ) )
            // InternalMySelenium.g:2499:2: ( rule__Parent__ElementAssignment_0 )
            {
             before(grammarAccess.getParentAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:2500:2: ( rule__Parent__ElementAssignment_0 )
            // InternalMySelenium.g:2500:3: rule__Parent__ElementAssignment_0
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
    // InternalMySelenium.g:2508:1: rule__Parent__Group__1 : rule__Parent__Group__1__Impl rule__Parent__Group__2 ;
    public final void rule__Parent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2512:1: ( rule__Parent__Group__1__Impl rule__Parent__Group__2 )
            // InternalMySelenium.g:2513:2: rule__Parent__Group__1__Impl rule__Parent__Group__2
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
    // InternalMySelenium.g:2520:1: rule__Parent__Group__1__Impl : ( '[' ) ;
    public final void rule__Parent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2524:1: ( ( '[' ) )
            // InternalMySelenium.g:2525:1: ( '[' )
            {
            // InternalMySelenium.g:2525:1: ( '[' )
            // InternalMySelenium.g:2526:2: '['
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
    // InternalMySelenium.g:2535:1: rule__Parent__Group__2 : rule__Parent__Group__2__Impl rule__Parent__Group__3 ;
    public final void rule__Parent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2539:1: ( rule__Parent__Group__2__Impl rule__Parent__Group__3 )
            // InternalMySelenium.g:2540:2: rule__Parent__Group__2__Impl rule__Parent__Group__3
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
    // InternalMySelenium.g:2547:1: rule__Parent__Group__2__Impl : ( ( rule__Parent__AttrsAssignment_2 )? ) ;
    public final void rule__Parent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2551:1: ( ( ( rule__Parent__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:2552:1: ( ( rule__Parent__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:2552:1: ( ( rule__Parent__AttrsAssignment_2 )? )
            // InternalMySelenium.g:2553:2: ( rule__Parent__AttrsAssignment_2 )?
            {
             before(grammarAccess.getParentAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:2554:2: ( rule__Parent__AttrsAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=12)||(LA20_0>=16 && LA20_0<=21)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMySelenium.g:2554:3: rule__Parent__AttrsAssignment_2
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
    // InternalMySelenium.g:2562:1: rule__Parent__Group__3 : rule__Parent__Group__3__Impl ;
    public final void rule__Parent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2566:1: ( rule__Parent__Group__3__Impl )
            // InternalMySelenium.g:2567:2: rule__Parent__Group__3__Impl
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
    // InternalMySelenium.g:2573:1: rule__Parent__Group__3__Impl : ( ']' ) ;
    public final void rule__Parent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2577:1: ( ( ']' ) )
            // InternalMySelenium.g:2578:1: ( ']' )
            {
            // InternalMySelenium.g:2578:1: ( ']' )
            // InternalMySelenium.g:2579:2: ']'
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
    // InternalMySelenium.g:2589:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2593:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalMySelenium.g:2594:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
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
    // InternalMySelenium.g:2601:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttrsAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2605:1: ( ( ( rule__Attributes__AttrsAssignment_0 ) ) )
            // InternalMySelenium.g:2606:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            {
            // InternalMySelenium.g:2606:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            // InternalMySelenium.g:2607:2: ( rule__Attributes__AttrsAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 
            // InternalMySelenium.g:2608:2: ( rule__Attributes__AttrsAssignment_0 )
            // InternalMySelenium.g:2608:3: rule__Attributes__AttrsAssignment_0
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
    // InternalMySelenium.g:2616:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2620:1: ( rule__Attributes__Group__1__Impl )
            // InternalMySelenium.g:2621:2: rule__Attributes__Group__1__Impl
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
    // InternalMySelenium.g:2627:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2631:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalMySelenium.g:2632:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalMySelenium.g:2632:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalMySelenium.g:2633:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalMySelenium.g:2634:2: ( rule__Attributes__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:2634:3: rule__Attributes__Group_1__0
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
    // InternalMySelenium.g:2643:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2647:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalMySelenium.g:2648:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
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
    // InternalMySelenium.g:2655:1: rule__Attributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2659:1: ( ( ',' ) )
            // InternalMySelenium.g:2660:1: ( ',' )
            {
            // InternalMySelenium.g:2660:1: ( ',' )
            // InternalMySelenium.g:2661:2: ','
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
    // InternalMySelenium.g:2670:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2674:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalMySelenium.g:2675:2: rule__Attributes__Group_1__1__Impl
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
    // InternalMySelenium.g:2681:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttrsAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2685:1: ( ( ( rule__Attributes__AttrsAssignment_1_1 ) ) )
            // InternalMySelenium.g:2686:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            {
            // InternalMySelenium.g:2686:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            // InternalMySelenium.g:2687:2: ( rule__Attributes__AttrsAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 
            // InternalMySelenium.g:2688:2: ( rule__Attributes__AttrsAssignment_1_1 )
            // InternalMySelenium.g:2688:3: rule__Attributes__AttrsAssignment_1_1
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
    // InternalMySelenium.g:2697:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2701:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMySelenium.g:2702:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMySelenium.g:2709:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2713:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMySelenium.g:2714:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMySelenium.g:2714:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMySelenium.g:2715:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMySelenium.g:2716:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMySelenium.g:2716:3: rule__Attribute__NameAssignment_0
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
    // InternalMySelenium.g:2724:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2728:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMySelenium.g:2729:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalMySelenium.g:2736:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2740:1: ( ( '=' ) )
            // InternalMySelenium.g:2741:1: ( '=' )
            {
            // InternalMySelenium.g:2741:1: ( '=' )
            // InternalMySelenium.g:2742:2: '='
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
    // InternalMySelenium.g:2751:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2755:1: ( rule__Attribute__Group__2__Impl )
            // InternalMySelenium.g:2756:2: rule__Attribute__Group__2__Impl
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
    // InternalMySelenium.g:2762:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Alternatives_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2766:1: ( ( ( rule__Attribute__Alternatives_2 ) ) )
            // InternalMySelenium.g:2767:1: ( ( rule__Attribute__Alternatives_2 ) )
            {
            // InternalMySelenium.g:2767:1: ( ( rule__Attribute__Alternatives_2 ) )
            // InternalMySelenium.g:2768:2: ( rule__Attribute__Alternatives_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_2()); 
            // InternalMySelenium.g:2769:2: ( rule__Attribute__Alternatives_2 )
            // InternalMySelenium.g:2769:3: rule__Attribute__Alternatives_2
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
    // InternalMySelenium.g:2778:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2782:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // InternalMySelenium.g:2783:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
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
    // InternalMySelenium.g:2790:1: rule__FunctionParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2794:1: ( ( '(' ) )
            // InternalMySelenium.g:2795:1: ( '(' )
            {
            // InternalMySelenium.g:2795:1: ( '(' )
            // InternalMySelenium.g:2796:2: '('
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
    // InternalMySelenium.g:2805:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2809:1: ( rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 )
            // InternalMySelenium.g:2810:2: rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2
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
    // InternalMySelenium.g:2817:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2821:1: ( ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2822:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2822:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2823:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2824:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2824:3: rule__FunctionParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2832:1: rule__FunctionParameters__Group__2 : rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 ;
    public final void rule__FunctionParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2836:1: ( rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 )
            // InternalMySelenium.g:2837:2: rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3
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
    // InternalMySelenium.g:2844:1: rule__FunctionParameters__Group__2__Impl : ( ( rule__FunctionParameters__Group_2__0 )* ) ;
    public final void rule__FunctionParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2848:1: ( ( ( rule__FunctionParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2849:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2849:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            // InternalMySelenium.g:2850:2: ( rule__FunctionParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2851:2: ( rule__FunctionParameters__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMySelenium.g:2851:3: rule__FunctionParameters__Group_2__0
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
    // InternalMySelenium.g:2859:1: rule__FunctionParameters__Group__3 : rule__FunctionParameters__Group__3__Impl ;
    public final void rule__FunctionParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2863:1: ( rule__FunctionParameters__Group__3__Impl )
            // InternalMySelenium.g:2864:2: rule__FunctionParameters__Group__3__Impl
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
    // InternalMySelenium.g:2870:1: rule__FunctionParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2874:1: ( ( ')' ) )
            // InternalMySelenium.g:2875:1: ( ')' )
            {
            // InternalMySelenium.g:2875:1: ( ')' )
            // InternalMySelenium.g:2876:2: ')'
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
    // InternalMySelenium.g:2886:1: rule__FunctionParameters__Group_2__0 : rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 ;
    public final void rule__FunctionParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2890:1: ( rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 )
            // InternalMySelenium.g:2891:2: rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1
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
    // InternalMySelenium.g:2898:1: rule__FunctionParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2902:1: ( ( ',' ) )
            // InternalMySelenium.g:2903:1: ( ',' )
            {
            // InternalMySelenium.g:2903:1: ( ',' )
            // InternalMySelenium.g:2904:2: ','
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
    // InternalMySelenium.g:2913:1: rule__FunctionParameters__Group_2__1 : rule__FunctionParameters__Group_2__1__Impl ;
    public final void rule__FunctionParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2917:1: ( rule__FunctionParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2918:2: rule__FunctionParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2924:1: rule__FunctionParameters__Group_2__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2928:1: ( ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2929:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2929:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2930:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2931:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2931:3: rule__FunctionParameters__VariablesAssignment_2_1
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
    // InternalMySelenium.g:2940:1: rule__FunctionCallParameters__Group__0 : rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 ;
    public final void rule__FunctionCallParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2944:1: ( rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 )
            // InternalMySelenium.g:2945:2: rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1
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
    // InternalMySelenium.g:2952:1: rule__FunctionCallParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2956:1: ( ( '(' ) )
            // InternalMySelenium.g:2957:1: ( '(' )
            {
            // InternalMySelenium.g:2957:1: ( '(' )
            // InternalMySelenium.g:2958:2: '('
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
    // InternalMySelenium.g:2967:1: rule__FunctionCallParameters__Group__1 : rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 ;
    public final void rule__FunctionCallParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2971:1: ( rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 )
            // InternalMySelenium.g:2972:2: rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2
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
    // InternalMySelenium.g:2979:1: rule__FunctionCallParameters__Group__1__Impl : ( ( rule__FunctionCallParameters__Group_1__0 )? ) ;
    public final void rule__FunctionCallParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2983:1: ( ( ( rule__FunctionCallParameters__Group_1__0 )? ) )
            // InternalMySelenium.g:2984:1: ( ( rule__FunctionCallParameters__Group_1__0 )? )
            {
            // InternalMySelenium.g:2984:1: ( ( rule__FunctionCallParameters__Group_1__0 )? )
            // InternalMySelenium.g:2985:2: ( rule__FunctionCallParameters__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_1()); 
            // InternalMySelenium.g:2986:2: ( rule__FunctionCallParameters__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMySelenium.g:2986:3: rule__FunctionCallParameters__Group_1__0
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
    // InternalMySelenium.g:2994:1: rule__FunctionCallParameters__Group__2 : rule__FunctionCallParameters__Group__2__Impl ;
    public final void rule__FunctionCallParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2998:1: ( rule__FunctionCallParameters__Group__2__Impl )
            // InternalMySelenium.g:2999:2: rule__FunctionCallParameters__Group__2__Impl
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
    // InternalMySelenium.g:3005:1: rule__FunctionCallParameters__Group__2__Impl : ( ')' ) ;
    public final void rule__FunctionCallParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3009:1: ( ( ')' ) )
            // InternalMySelenium.g:3010:1: ( ')' )
            {
            // InternalMySelenium.g:3010:1: ( ')' )
            // InternalMySelenium.g:3011:2: ')'
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
    // InternalMySelenium.g:3021:1: rule__FunctionCallParameters__Group_1__0 : rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1 ;
    public final void rule__FunctionCallParameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3025:1: ( rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1 )
            // InternalMySelenium.g:3026:2: rule__FunctionCallParameters__Group_1__0__Impl rule__FunctionCallParameters__Group_1__1
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
    // InternalMySelenium.g:3033:1: rule__FunctionCallParameters__Group_1__0__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) ) ;
    public final void rule__FunctionCallParameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3037:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) ) )
            // InternalMySelenium.g:3038:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) )
            {
            // InternalMySelenium.g:3038:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_0 ) )
            // InternalMySelenium.g:3039:2: ( rule__FunctionCallParameters__VariablesAssignment_1_0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_0()); 
            // InternalMySelenium.g:3040:2: ( rule__FunctionCallParameters__VariablesAssignment_1_0 )
            // InternalMySelenium.g:3040:3: rule__FunctionCallParameters__VariablesAssignment_1_0
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
    // InternalMySelenium.g:3048:1: rule__FunctionCallParameters__Group_1__1 : rule__FunctionCallParameters__Group_1__1__Impl ;
    public final void rule__FunctionCallParameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3052:1: ( rule__FunctionCallParameters__Group_1__1__Impl )
            // InternalMySelenium.g:3053:2: rule__FunctionCallParameters__Group_1__1__Impl
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
    // InternalMySelenium.g:3059:1: rule__FunctionCallParameters__Group_1__1__Impl : ( ( rule__FunctionCallParameters__Group_1_1__0 )* ) ;
    public final void rule__FunctionCallParameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3063:1: ( ( ( rule__FunctionCallParameters__Group_1_1__0 )* ) )
            // InternalMySelenium.g:3064:1: ( ( rule__FunctionCallParameters__Group_1_1__0 )* )
            {
            // InternalMySelenium.g:3064:1: ( ( rule__FunctionCallParameters__Group_1_1__0 )* )
            // InternalMySelenium.g:3065:2: ( rule__FunctionCallParameters__Group_1_1__0 )*
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_1_1()); 
            // InternalMySelenium.g:3066:2: ( rule__FunctionCallParameters__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMySelenium.g:3066:3: rule__FunctionCallParameters__Group_1_1__0
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
    // InternalMySelenium.g:3075:1: rule__FunctionCallParameters__Group_1_1__0 : rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1 ;
    public final void rule__FunctionCallParameters__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3079:1: ( rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1 )
            // InternalMySelenium.g:3080:2: rule__FunctionCallParameters__Group_1_1__0__Impl rule__FunctionCallParameters__Group_1_1__1
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
    // InternalMySelenium.g:3087:1: rule__FunctionCallParameters__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallParameters__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3091:1: ( ( ',' ) )
            // InternalMySelenium.g:3092:1: ( ',' )
            {
            // InternalMySelenium.g:3092:1: ( ',' )
            // InternalMySelenium.g:3093:2: ','
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
    // InternalMySelenium.g:3102:1: rule__FunctionCallParameters__Group_1_1__1 : rule__FunctionCallParameters__Group_1_1__1__Impl ;
    public final void rule__FunctionCallParameters__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3106:1: ( rule__FunctionCallParameters__Group_1_1__1__Impl )
            // InternalMySelenium.g:3107:2: rule__FunctionCallParameters__Group_1_1__1__Impl
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
    // InternalMySelenium.g:3113:1: rule__FunctionCallParameters__Group_1_1__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) ) ;
    public final void rule__FunctionCallParameters__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3117:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) ) )
            // InternalMySelenium.g:3118:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) )
            {
            // InternalMySelenium.g:3118:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 ) )
            // InternalMySelenium.g:3119:2: ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1_1_1()); 
            // InternalMySelenium.g:3120:2: ( rule__FunctionCallParameters__VariablesAssignment_1_1_1 )
            // InternalMySelenium.g:3120:3: rule__FunctionCallParameters__VariablesAssignment_1_1_1
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
    // InternalMySelenium.g:3129:1: rule__Functions__FunctionsAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3133:1: ( ( ruleFunction ) )
            // InternalMySelenium.g:3134:2: ( ruleFunction )
            {
            // InternalMySelenium.g:3134:2: ( ruleFunction )
            // InternalMySelenium.g:3135:3: ruleFunction
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
    // InternalMySelenium.g:3144:1: rule__Functions__MainFunctionAssignment_1 : ( ruleMainFunction ) ;
    public final void rule__Functions__MainFunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3148:1: ( ( ruleMainFunction ) )
            // InternalMySelenium.g:3149:2: ( ruleMainFunction )
            {
            // InternalMySelenium.g:3149:2: ( ruleMainFunction )
            // InternalMySelenium.g:3150:3: ruleMainFunction
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
    // InternalMySelenium.g:3159:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3163:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:3164:2: ( ruleStatement )
            {
            // InternalMySelenium.g:3164:2: ( ruleStatement )
            // InternalMySelenium.g:3165:3: ruleStatement
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
    // InternalMySelenium.g:3174:1: rule__MainFunction__StatementsAssignment_3 : ( ruleStatements ) ;
    public final void rule__MainFunction__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3178:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:3179:2: ( ruleStatements )
            {
            // InternalMySelenium.g:3179:2: ( ruleStatements )
            // InternalMySelenium.g:3180:3: ruleStatements
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
    // InternalMySelenium.g:3189:1: rule__Function__NameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3193:1: ( ( ruleFunctionName ) )
            // InternalMySelenium.g:3194:2: ( ruleFunctionName )
            {
            // InternalMySelenium.g:3194:2: ( ruleFunctionName )
            // InternalMySelenium.g:3195:3: ruleFunctionName
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
    // InternalMySelenium.g:3204:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3208:1: ( ( ruleFunctionParameters ) )
            // InternalMySelenium.g:3209:2: ( ruleFunctionParameters )
            {
            // InternalMySelenium.g:3209:2: ( ruleFunctionParameters )
            // InternalMySelenium.g:3210:3: ruleFunctionParameters
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
    // InternalMySelenium.g:3219:1: rule__Function__StatementsAssignment_4 : ( ruleStatements ) ;
    public final void rule__Function__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3223:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:3224:2: ( ruleStatements )
            {
            // InternalMySelenium.g:3224:2: ( ruleStatements )
            // InternalMySelenium.g:3225:3: ruleStatements
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
    // InternalMySelenium.g:3234:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3238:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3239:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3239:2: ( RULE_ID )
            // InternalMySelenium.g:3240:3: RULE_ID
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
    // InternalMySelenium.g:3249:1: rule__FunctionCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3253:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:3254:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:3254:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:3255:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 
            // InternalMySelenium.g:3256:3: ( RULE_ID )
            // InternalMySelenium.g:3257:4: RULE_ID
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
    // InternalMySelenium.g:3268:1: rule__FunctionCall__ParamsAssignment_1 : ( ruleFunctionCallParameters ) ;
    public final void rule__FunctionCall__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3272:1: ( ( ruleFunctionCallParameters ) )
            // InternalMySelenium.g:3273:2: ( ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:3273:2: ( ruleFunctionCallParameters )
            // InternalMySelenium.g:3274:3: ruleFunctionCallParameters
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
    // InternalMySelenium.g:3283:1: rule__Projection__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Projection__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3287:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:3288:2: ( ruleSelector )
            {
            // InternalMySelenium.g:3288:2: ( ruleSelector )
            // InternalMySelenium.g:3289:3: ruleSelector
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
    // InternalMySelenium.g:3298:1: rule__Projection__ProjectionActionAssignment_2 : ( ruleProjectionAction ) ;
    public final void rule__Projection__ProjectionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3302:1: ( ( ruleProjectionAction ) )
            // InternalMySelenium.g:3303:2: ( ruleProjectionAction )
            {
            // InternalMySelenium.g:3303:2: ( ruleProjectionAction )
            // InternalMySelenium.g:3304:3: ruleProjectionAction
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
    // InternalMySelenium.g:3313:1: rule__AssertEquals__AssertableElementAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3317:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3318:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3318:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3319:3: ruleAssertableElement
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
    // InternalMySelenium.g:3328:1: rule__AssertEquals__AssertableElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3332:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3333:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3333:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3334:3: ruleAssertableElement
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
    // InternalMySelenium.g:3343:1: rule__AssertContains__ContainerAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3347:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3348:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3348:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3349:3: ruleAssertableElement
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
    // InternalMySelenium.g:3358:1: rule__AssertContains__ElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3362:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:3363:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:3363:2: ( ruleAssertableElement )
            // InternalMySelenium.g:3364:3: ruleAssertableElement
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
    // InternalMySelenium.g:3373:1: rule__NavigationAction__ActionAssignment_0 : ( ruleNavigationActionType ) ;
    public final void rule__NavigationAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3377:1: ( ( ruleNavigationActionType ) )
            // InternalMySelenium.g:3378:2: ( ruleNavigationActionType )
            {
            // InternalMySelenium.g:3378:2: ( ruleNavigationActionType )
            // InternalMySelenium.g:3379:3: ruleNavigationActionType
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
    // InternalMySelenium.g:3388:1: rule__NavigationAction__ParamAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NavigationAction__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3392:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3393:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3393:2: ( RULE_STRING )
            // InternalMySelenium.g:3394:3: RULE_STRING
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
    // InternalMySelenium.g:3403:1: rule__Action__ActionAssignment_0 : ( ruleActionType ) ;
    public final void rule__Action__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3407:1: ( ( ruleActionType ) )
            // InternalMySelenium.g:3408:2: ( ruleActionType )
            {
            // InternalMySelenium.g:3408:2: ( ruleActionType )
            // InternalMySelenium.g:3409:3: ruleActionType
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
    // InternalMySelenium.g:3418:1: rule__Action__TargetAssignment_1 : ( ruleActionTarget ) ;
    public final void rule__Action__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3422:1: ( ( ruleActionTarget ) )
            // InternalMySelenium.g:3423:2: ( ruleActionTarget )
            {
            // InternalMySelenium.g:3423:2: ( ruleActionTarget )
            // InternalMySelenium.g:3424:3: ruleActionTarget
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
    // InternalMySelenium.g:3433:1: rule__Action__ParamAssignment_2 : ( ruleActionParameter ) ;
    public final void rule__Action__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3437:1: ( ( ruleActionParameter ) )
            // InternalMySelenium.g:3438:2: ( ruleActionParameter )
            {
            // InternalMySelenium.g:3438:2: ( ruleActionParameter )
            // InternalMySelenium.g:3439:3: ruleActionParameter
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
    // InternalMySelenium.g:3448:1: rule__AssignAction__TargetAssignment_1 : ( ruleActionTarget ) ;
    public final void rule__AssignAction__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3452:1: ( ( ruleActionTarget ) )
            // InternalMySelenium.g:3453:2: ( ruleActionTarget )
            {
            // InternalMySelenium.g:3453:2: ( ruleActionTarget )
            // InternalMySelenium.g:3454:3: ruleActionTarget
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
    // InternalMySelenium.g:3463:1: rule__AssignAction__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__AssignAction__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3467:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3468:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3468:2: ( ruleVariable )
            // InternalMySelenium.g:3469:3: ruleVariable
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
    // InternalMySelenium.g:3478:1: rule__ActionParameterString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ActionParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3482:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3483:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3483:2: ( RULE_STRING )
            // InternalMySelenium.g:3484:3: RULE_STRING
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
    // InternalMySelenium.g:3493:1: rule__Selector__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Selector__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3497:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:3498:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:3498:2: ( ruleDOMElement )
            // InternalMySelenium.g:3499:3: ruleDOMElement
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
    // InternalMySelenium.g:3508:1: rule__Selector__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3512:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:3513:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:3513:2: ( ruleAttributes )
            // InternalMySelenium.g:3514:3: ruleAttributes
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
    // InternalMySelenium.g:3523:1: rule__Selector__ParentAssignment_4_2 : ( ruleParent ) ;
    public final void rule__Selector__ParentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3527:1: ( ( ruleParent ) )
            // InternalMySelenium.g:3528:2: ( ruleParent )
            {
            // InternalMySelenium.g:3528:2: ( ruleParent )
            // InternalMySelenium.g:3529:3: ruleParent
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
    // InternalMySelenium.g:3538:1: rule__Selector__AllAssignment_5 : ( ( '.all' ) ) ;
    public final void rule__Selector__AllAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3542:1: ( ( ( '.all' ) ) )
            // InternalMySelenium.g:3543:2: ( ( '.all' ) )
            {
            // InternalMySelenium.g:3543:2: ( ( '.all' ) )
            // InternalMySelenium.g:3544:3: ( '.all' )
            {
             before(grammarAccess.getSelectorAccess().getAllAllKeyword_5_0()); 
            // InternalMySelenium.g:3545:3: ( '.all' )
            // InternalMySelenium.g:3546:4: '.all'
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
    // InternalMySelenium.g:3557:1: rule__Parent__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Parent__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3561:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:3562:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:3562:2: ( ruleDOMElement )
            // InternalMySelenium.g:3563:3: ruleDOMElement
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
    // InternalMySelenium.g:3572:1: rule__Parent__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Parent__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3576:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:3577:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:3577:2: ( ruleAttributes )
            // InternalMySelenium.g:3578:3: ruleAttributes
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
    // InternalMySelenium.g:3587:1: rule__Attributes__AttrsAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3591:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:3592:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:3592:2: ( ruleAttribute )
            // InternalMySelenium.g:3593:3: ruleAttribute
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
    // InternalMySelenium.g:3602:1: rule__Attributes__AttrsAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3606:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:3607:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:3607:2: ( ruleAttribute )
            // InternalMySelenium.g:3608:3: ruleAttribute
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
    // InternalMySelenium.g:3617:1: rule__Attribute__NameAssignment_0 : ( ruleDOMAttribute ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3621:1: ( ( ruleDOMAttribute ) )
            // InternalMySelenium.g:3622:2: ( ruleDOMAttribute )
            {
            // InternalMySelenium.g:3622:2: ( ruleDOMAttribute )
            // InternalMySelenium.g:3623:3: ruleDOMAttribute
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
    // InternalMySelenium.g:3632:1: rule__Attribute__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3636:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3637:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3637:2: ( RULE_STRING )
            // InternalMySelenium.g:3638:3: RULE_STRING
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
    // InternalMySelenium.g:3647:1: rule__Attribute__VariableAssignment_2_1 : ( ruleVariableRef ) ;
    public final void rule__Attribute__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3651:1: ( ( ruleVariableRef ) )
            // InternalMySelenium.g:3652:2: ( ruleVariableRef )
            {
            // InternalMySelenium.g:3652:2: ( ruleVariableRef )
            // InternalMySelenium.g:3653:3: ruleVariableRef
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
    // InternalMySelenium.g:3662:1: rule__FunctionParameters__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3666:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3667:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3667:2: ( ruleVariable )
            // InternalMySelenium.g:3668:3: ruleVariable
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
    // InternalMySelenium.g:3677:1: rule__FunctionParameters__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3681:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:3682:2: ( ruleVariable )
            {
            // InternalMySelenium.g:3682:2: ( ruleVariable )
            // InternalMySelenium.g:3683:3: ruleVariable
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
    // InternalMySelenium.g:3692:1: rule__FunctionCallParameters__VariablesAssignment_1_0 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3696:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:3697:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:3697:2: ( ruleVariableCall )
            // InternalMySelenium.g:3698:3: ruleVariableCall
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
    // InternalMySelenium.g:3707:1: rule__FunctionCallParameters__VariablesAssignment_1_1_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3711:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:3712:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:3712:2: ( ruleVariableCall )
            // InternalMySelenium.g:3713:3: ruleVariableCall
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
    // InternalMySelenium.g:3722:1: rule__VariableRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3726:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:3727:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:3727:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:3728:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableRefAccess().getRefVariableCrossReference_0()); 
            // InternalMySelenium.g:3729:3: ( RULE_ID )
            // InternalMySelenium.g:3730:4: RULE_ID
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
    // InternalMySelenium.g:3741:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3745:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3746:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3746:2: ( RULE_ID )
            // InternalMySelenium.g:3747:3: RULE_ID
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
    // InternalMySelenium.g:3756:1: rule__StringParameter__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3760:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:3761:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:3761:2: ( RULE_STRING )
            // InternalMySelenium.g:3762:3: RULE_STRING
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
    static final String dfa_1s = "\137\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\1\uffff\2\52\12\55\1\4\2\uffff\1\13\2\61\11\52\1\50\2\4\1\60\1\50\1\13\2\61\2\56\1\26\3\52\1\13\12\55\10\52\1\13\1\4\10\52\1\61\2\56\1\4\1\50\2\56\1\13\10\52\1\4\2\56";
    static final String dfa_3s = "\1\54\3\uffff\1\37\1\uffff\1\60\1\53\12\55\1\61\2\uffff\1\56\2\62\1\53\10\52\1\63\2\5\1\60\1\50\1\15\4\62\1\37\3\53\1\25\12\55\10\52\1\56\1\5\10\52\1\61\2\62\1\5\1\63\2\62\1\25\10\52\1\5\2\62";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\15\uffff\1\4\1\5\112\uffff";
    static final String dfa_5s = "\137\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\11\uffff\2\5\20\uffff\4\1\5\uffff\1\4\2\uffff\1\2",
            "",
            "",
            "",
            "\1\6\1\7\20\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "",
            "\1\23\1\24\4\uffff\1\22",
            "\1\23\1\24",
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
            "\1\24\1\25",
            "",
            "\1\40\1\32\3\uffff\1\31\1\33\1\34\1\35\1\36\1\37\30\uffff\1\41",
            "\1\30\1\42",
            "\1\30\1\42",
            "\1\23\1\24",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\46\6\uffff\1\44\3\uffff\1\45",
            "\1\47\1\50",
            "\1\52\1\51",
            "\1\53",
            "\1\46",
            "\1\54\1\55\1\56",
            "\1\30\1\42",
            "\1\30\1\42",
            "\1\41\3\uffff\1\57",
            "\1\41\3\uffff\1\57",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71",
            "\1\23\1\24",
            "\1\23\1\24",
            "\1\23\1\24",
            "\1\101\1\73\3\uffff\1\72\1\74\1\75\1\76\1\77\1\100",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\103",
            "\1\113\1\105\3\uffff\1\104\1\106\1\107\1\110\1\111\1\112\30\uffff\1\114",
            "\1\116\1\115",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\117",
            "\1\120",
            "\1\41\3\uffff\1\57",
            "\1\41\3\uffff\1\57",
            "\1\122\1\121",
            "\1\46\12\uffff\1\45",
            "\1\114\3\uffff\1\123",
            "\1\114\3\uffff\1\123",
            "\1\133\1\125\3\uffff\1\124\1\126\1\127\1\130\1\131\1\132",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\134",
            "\1\136\1\135",
            "\1\114\3\uffff\1\123",
            "\1\114\3\uffff\1\123"
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00004000003F1800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000FFC00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003F1800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000030L});

}