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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'value'", "'text'", "'html'", "'go'", "'openBrowser'", "'name'", "'alt'", "'checked'", "'class'", "'id'", "'type'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'click'", "'assign'", "'fill'", "'choose'", "'def'", "'{'", "'}'", "'.'", "'assert'", "'='", "'contains'", "'['", "']'", "','", "'('", "')'", "'.all'"
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

                if ( (LA1_0==35) ) {
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

                if ( (LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=15)||(LA2_0>=31 && LA2_0<=34)||LA2_0==39) ) {
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
    // InternalMySelenium.g:276:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:280:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMySelenium.g:281:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMySelenium.g:281:2: ( ( rule__Statement__Alternatives ) )
            // InternalMySelenium.g:282:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMySelenium.g:283:3: ( rule__Statement__Alternatives )
            // InternalMySelenium.g:283:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRuleSelector"
    // InternalMySelenium.g:442:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMySelenium.g:443:1: ( ruleSelector EOF )
            // InternalMySelenium.g:444:1: ruleSelector EOF
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
    // InternalMySelenium.g:451:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:455:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMySelenium.g:456:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMySelenium.g:456:2: ( ( rule__Selector__Group__0 ) )
            // InternalMySelenium.g:457:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMySelenium.g:458:3: ( rule__Selector__Group__0 )
            // InternalMySelenium.g:458:4: rule__Selector__Group__0
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
    // InternalMySelenium.g:467:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalMySelenium.g:468:1: ( ruleAttributes EOF )
            // InternalMySelenium.g:469:1: ruleAttributes EOF
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
    // InternalMySelenium.g:476:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:480:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalMySelenium.g:481:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalMySelenium.g:481:2: ( ( rule__Attributes__Group__0 ) )
            // InternalMySelenium.g:482:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalMySelenium.g:483:3: ( rule__Attributes__Group__0 )
            // InternalMySelenium.g:483:4: rule__Attributes__Group__0
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
    // InternalMySelenium.g:492:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:493:1: ( ruleAttribute EOF )
            // InternalMySelenium.g:494:1: ruleAttribute EOF
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
    // InternalMySelenium.g:501:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:505:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMySelenium.g:506:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMySelenium.g:506:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMySelenium.g:507:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMySelenium.g:508:3: ( rule__Attribute__Group__0 )
            // InternalMySelenium.g:508:4: rule__Attribute__Group__0
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
    // InternalMySelenium.g:517:1: entryRuleDOMAttribute : ruleDOMAttribute EOF ;
    public final void entryRuleDOMAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:518:1: ( ruleDOMAttribute EOF )
            // InternalMySelenium.g:519:1: ruleDOMAttribute EOF
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
    // InternalMySelenium.g:526:1: ruleDOMAttribute : ( ( rule__DOMAttribute__Alternatives ) ) ;
    public final void ruleDOMAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:530:2: ( ( ( rule__DOMAttribute__Alternatives ) ) )
            // InternalMySelenium.g:531:2: ( ( rule__DOMAttribute__Alternatives ) )
            {
            // InternalMySelenium.g:531:2: ( ( rule__DOMAttribute__Alternatives ) )
            // InternalMySelenium.g:532:3: ( rule__DOMAttribute__Alternatives )
            {
             before(grammarAccess.getDOMAttributeAccess().getAlternatives()); 
            // InternalMySelenium.g:533:3: ( rule__DOMAttribute__Alternatives )
            // InternalMySelenium.g:533:4: rule__DOMAttribute__Alternatives
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
    // InternalMySelenium.g:542:1: entryRuleDOMElement : ruleDOMElement EOF ;
    public final void entryRuleDOMElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:543:1: ( ruleDOMElement EOF )
            // InternalMySelenium.g:544:1: ruleDOMElement EOF
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
    // InternalMySelenium.g:551:1: ruleDOMElement : ( ( rule__DOMElement__Alternatives ) ) ;
    public final void ruleDOMElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:555:2: ( ( ( rule__DOMElement__Alternatives ) ) )
            // InternalMySelenium.g:556:2: ( ( rule__DOMElement__Alternatives ) )
            {
            // InternalMySelenium.g:556:2: ( ( rule__DOMElement__Alternatives ) )
            // InternalMySelenium.g:557:3: ( rule__DOMElement__Alternatives )
            {
             before(grammarAccess.getDOMElementAccess().getAlternatives()); 
            // InternalMySelenium.g:558:3: ( rule__DOMElement__Alternatives )
            // InternalMySelenium.g:558:4: rule__DOMElement__Alternatives
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
    // InternalMySelenium.g:567:1: entryRuleOneParameterActionType : ruleOneParameterActionType EOF ;
    public final void entryRuleOneParameterActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:568:1: ( ruleOneParameterActionType EOF )
            // InternalMySelenium.g:569:1: ruleOneParameterActionType EOF
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
    // InternalMySelenium.g:576:1: ruleOneParameterActionType : ( ( rule__OneParameterActionType__Alternatives ) ) ;
    public final void ruleOneParameterActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:580:2: ( ( ( rule__OneParameterActionType__Alternatives ) ) )
            // InternalMySelenium.g:581:2: ( ( rule__OneParameterActionType__Alternatives ) )
            {
            // InternalMySelenium.g:581:2: ( ( rule__OneParameterActionType__Alternatives ) )
            // InternalMySelenium.g:582:3: ( rule__OneParameterActionType__Alternatives )
            {
             before(grammarAccess.getOneParameterActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:583:3: ( rule__OneParameterActionType__Alternatives )
            // InternalMySelenium.g:583:4: rule__OneParameterActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOneParameterActionTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMySelenium.g:592:1: entryRuleTwoParametersActionType : ruleTwoParametersActionType EOF ;
    public final void entryRuleTwoParametersActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:593:1: ( ruleTwoParametersActionType EOF )
            // InternalMySelenium.g:594:1: ruleTwoParametersActionType EOF
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
    // InternalMySelenium.g:601:1: ruleTwoParametersActionType : ( ( rule__TwoParametersActionType__Alternatives ) ) ;
    public final void ruleTwoParametersActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:605:2: ( ( ( rule__TwoParametersActionType__Alternatives ) ) )
            // InternalMySelenium.g:606:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            {
            // InternalMySelenium.g:606:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            // InternalMySelenium.g:607:3: ( rule__TwoParametersActionType__Alternatives )
            {
             before(grammarAccess.getTwoParametersActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:608:3: ( rule__TwoParametersActionType__Alternatives )
            // InternalMySelenium.g:608:4: rule__TwoParametersActionType__Alternatives
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
    // InternalMySelenium.g:617:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:618:1: ( ruleFunctionParameters EOF )
            // InternalMySelenium.g:619:1: ruleFunctionParameters EOF
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
    // InternalMySelenium.g:626:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Group__0 ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:630:2: ( ( ( rule__FunctionParameters__Group__0 ) ) )
            // InternalMySelenium.g:631:2: ( ( rule__FunctionParameters__Group__0 ) )
            {
            // InternalMySelenium.g:631:2: ( ( rule__FunctionParameters__Group__0 ) )
            // InternalMySelenium.g:632:3: ( rule__FunctionParameters__Group__0 )
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup()); 
            // InternalMySelenium.g:633:3: ( rule__FunctionParameters__Group__0 )
            // InternalMySelenium.g:633:4: rule__FunctionParameters__Group__0
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
    // InternalMySelenium.g:642:1: entryRuleFunctionCallParameters : ruleFunctionCallParameters EOF ;
    public final void entryRuleFunctionCallParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:643:1: ( ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:644:1: ruleFunctionCallParameters EOF
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
    // InternalMySelenium.g:651:1: ruleFunctionCallParameters : ( ( rule__FunctionCallParameters__Group__0 ) ) ;
    public final void ruleFunctionCallParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:655:2: ( ( ( rule__FunctionCallParameters__Group__0 ) ) )
            // InternalMySelenium.g:656:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            {
            // InternalMySelenium.g:656:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            // InternalMySelenium.g:657:3: ( rule__FunctionCallParameters__Group__0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup()); 
            // InternalMySelenium.g:658:3: ( rule__FunctionCallParameters__Group__0 )
            // InternalMySelenium.g:658:4: rule__FunctionCallParameters__Group__0
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
    // InternalMySelenium.g:667:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:668:1: ( ruleVariableCall EOF )
            // InternalMySelenium.g:669:1: ruleVariableCall EOF
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
    // InternalMySelenium.g:676:1: ruleVariableCall : ( ( rule__VariableCall__Alternatives ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:680:2: ( ( ( rule__VariableCall__Alternatives ) ) )
            // InternalMySelenium.g:681:2: ( ( rule__VariableCall__Alternatives ) )
            {
            // InternalMySelenium.g:681:2: ( ( rule__VariableCall__Alternatives ) )
            // InternalMySelenium.g:682:3: ( rule__VariableCall__Alternatives )
            {
             before(grammarAccess.getVariableCallAccess().getAlternatives()); 
            // InternalMySelenium.g:683:3: ( rule__VariableCall__Alternatives )
            // InternalMySelenium.g:683:4: rule__VariableCall__Alternatives
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
    // InternalMySelenium.g:692:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMySelenium.g:693:1: ( ruleVariable EOF )
            // InternalMySelenium.g:694:1: ruleVariable EOF
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
    // InternalMySelenium.g:701:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:705:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalMySelenium.g:706:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalMySelenium.g:706:2: ( ( rule__Variable__NameAssignment ) )
            // InternalMySelenium.g:707:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalMySelenium.g:708:3: ( rule__Variable__NameAssignment )
            // InternalMySelenium.g:708:4: rule__Variable__NameAssignment
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
    // InternalMySelenium.g:716:1: rule__Program__Alternatives : ( ( ( rule__Program__FunctionsAssignment_0 ) ) | ( ( rule__Program__StatementsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:720:1: ( ( ( rule__Program__FunctionsAssignment_0 ) ) | ( ( rule__Program__StatementsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=15)||(LA3_0>=31 && LA3_0<=34)||LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMySelenium.g:721:2: ( ( rule__Program__FunctionsAssignment_0 ) )
                    {
                    // InternalMySelenium.g:721:2: ( ( rule__Program__FunctionsAssignment_0 ) )
                    // InternalMySelenium.g:722:3: ( rule__Program__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getProgramAccess().getFunctionsAssignment_0()); 
                    // InternalMySelenium.g:723:3: ( rule__Program__FunctionsAssignment_0 )
                    // InternalMySelenium.g:723:4: rule__Program__FunctionsAssignment_0
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
                    // InternalMySelenium.g:727:2: ( ( rule__Program__StatementsAssignment_1 ) )
                    {
                    // InternalMySelenium.g:727:2: ( ( rule__Program__StatementsAssignment_1 ) )
                    // InternalMySelenium.g:728:3: ( rule__Program__StatementsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getStatementsAssignment_1()); 
                    // InternalMySelenium.g:729:3: ( rule__Program__StatementsAssignment_1 )
                    // InternalMySelenium.g:729:4: rule__Program__StatementsAssignment_1
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
    // InternalMySelenium.g:737:1: rule__ProjectionAction__Alternatives : ( ( 'value' ) | ( 'text' ) | ( 'html' ) );
    public final void rule__ProjectionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:741:1: ( ( 'value' ) | ( 'text' ) | ( 'html' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
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
                    // InternalMySelenium.g:742:2: ( 'value' )
                    {
                    // InternalMySelenium.g:742:2: ( 'value' )
                    // InternalMySelenium.g:743:3: 'value'
                    {
                     before(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:748:2: ( 'text' )
                    {
                    // InternalMySelenium.g:748:2: ( 'text' )
                    // InternalMySelenium.g:749:3: 'text'
                    {
                     before(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:754:2: ( 'html' )
                    {
                    // InternalMySelenium.g:754:2: ( 'html' )
                    // InternalMySelenium.g:755:3: 'html'
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
    // InternalMySelenium.g:764:1: rule__Statement__Alternatives : ( ( ruleOneParameterAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:768:1: ( ( ruleOneParameterAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMySelenium.g:769:2: ( ruleOneParameterAction )
                    {
                    // InternalMySelenium.g:769:2: ( ruleOneParameterAction )
                    // InternalMySelenium.g:770:3: ruleOneParameterAction
                    {
                     before(grammarAccess.getStatementAccess().getOneParameterActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOneParameterAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOneParameterActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:775:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:775:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:776:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:781:2: ( ruleAssertEquals )
                    {
                    // InternalMySelenium.g:781:2: ( ruleAssertEquals )
                    // InternalMySelenium.g:782:3: ruleAssertEquals
                    {
                     before(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertEquals();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertEqualsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:787:2: ( ruleAssertContains )
                    {
                    // InternalMySelenium.g:787:2: ( ruleAssertContains )
                    // InternalMySelenium.g:788:3: ruleAssertContains
                    {
                     before(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertContains();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertContainsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:793:2: ( ruleNavigationAction )
                    {
                    // InternalMySelenium.g:793:2: ( ruleNavigationAction )
                    // InternalMySelenium.g:794:3: ruleNavigationAction
                    {
                     before(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_4()); 

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
    // InternalMySelenium.g:803:1: rule__AssertableElement__Alternatives : ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) );
    public final void rule__AssertableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:807:1: ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_ID||(LA6_1>=14 && LA6_1<=15)||(LA6_1>=31 && LA6_1<=34)||LA6_1==37||(LA6_1>=39 && LA6_1<=41)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==45) ) {
                    alt6=4;
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
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
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
                    // InternalMySelenium.g:808:2: ( ruleVariable )
                    {
                    // InternalMySelenium.g:808:2: ( ruleVariable )
                    // InternalMySelenium.g:809:3: ruleVariable
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
                    // InternalMySelenium.g:814:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:814:2: ( RULE_STRING )
                    // InternalMySelenium.g:815:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:820:2: ( ruleProjection )
                    {
                    // InternalMySelenium.g:820:2: ( ruleProjection )
                    // InternalMySelenium.g:821:3: ruleProjection
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
                    // InternalMySelenium.g:826:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:826:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:827:3: ruleFunctionCall
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
    // InternalMySelenium.g:836:1: rule__NavigationActionType__Alternatives : ( ( 'go' ) | ( 'openBrowser' ) );
    public final void rule__NavigationActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:840:1: ( ( 'go' ) | ( 'openBrowser' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:841:2: ( 'go' )
                    {
                    // InternalMySelenium.g:841:2: ( 'go' )
                    // InternalMySelenium.g:842:3: 'go'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:847:2: ( 'openBrowser' )
                    {
                    // InternalMySelenium.g:847:2: ( 'openBrowser' )
                    // InternalMySelenium.g:848:3: 'openBrowser'
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


    // $ANTLR start "rule__OneParameterAction__Alternatives_2"
    // InternalMySelenium.g:857:1: rule__OneParameterAction__Alternatives_2 : ( ( ( rule__OneParameterAction__SelectorParameterAssignment_2_0 ) ) | ( ( rule__OneParameterAction__StringParameterAssignment_2_1 ) ) );
    public final void rule__OneParameterAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:861:1: ( ( ( rule__OneParameterAction__SelectorParameterAssignment_2_0 ) ) | ( ( rule__OneParameterAction__StringParameterAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=22 && LA8_0<=30)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMySelenium.g:862:2: ( ( rule__OneParameterAction__SelectorParameterAssignment_2_0 ) )
                    {
                    // InternalMySelenium.g:862:2: ( ( rule__OneParameterAction__SelectorParameterAssignment_2_0 ) )
                    // InternalMySelenium.g:863:3: ( rule__OneParameterAction__SelectorParameterAssignment_2_0 )
                    {
                     before(grammarAccess.getOneParameterActionAccess().getSelectorParameterAssignment_2_0()); 
                    // InternalMySelenium.g:864:3: ( rule__OneParameterAction__SelectorParameterAssignment_2_0 )
                    // InternalMySelenium.g:864:4: rule__OneParameterAction__SelectorParameterAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneParameterAction__SelectorParameterAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOneParameterActionAccess().getSelectorParameterAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:868:2: ( ( rule__OneParameterAction__StringParameterAssignment_2_1 ) )
                    {
                    // InternalMySelenium.g:868:2: ( ( rule__OneParameterAction__StringParameterAssignment_2_1 ) )
                    // InternalMySelenium.g:869:3: ( rule__OneParameterAction__StringParameterAssignment_2_1 )
                    {
                     before(grammarAccess.getOneParameterActionAccess().getStringParameterAssignment_2_1()); 
                    // InternalMySelenium.g:870:3: ( rule__OneParameterAction__StringParameterAssignment_2_1 )
                    // InternalMySelenium.g:870:4: rule__OneParameterAction__StringParameterAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneParameterAction__StringParameterAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOneParameterActionAccess().getStringParameterAssignment_2_1()); 

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
    // $ANTLR end "rule__OneParameterAction__Alternatives_2"


    // $ANTLR start "rule__Attribute__Alternatives_2"
    // InternalMySelenium.g:878:1: rule__Attribute__Alternatives_2 : ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) );
    public final void rule__Attribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:882:1: ( ( ( rule__Attribute__ValueAssignment_2_0 ) ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) )
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
                    // InternalMySelenium.g:883:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    {
                    // InternalMySelenium.g:883:2: ( ( rule__Attribute__ValueAssignment_2_0 ) )
                    // InternalMySelenium.g:884:3: ( rule__Attribute__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getValueAssignment_2_0()); 
                    // InternalMySelenium.g:885:3: ( rule__Attribute__ValueAssignment_2_0 )
                    // InternalMySelenium.g:885:4: rule__Attribute__ValueAssignment_2_0
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
                    // InternalMySelenium.g:889:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    {
                    // InternalMySelenium.g:889:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    // InternalMySelenium.g:890:3: ( rule__Attribute__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getValAssignment_2_1()); 
                    // InternalMySelenium.g:891:3: ( rule__Attribute__ValAssignment_2_1 )
                    // InternalMySelenium.g:891:4: rule__Attribute__ValAssignment_2_1
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
    // InternalMySelenium.g:899:1: rule__DOMAttribute__Alternatives : ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) );
    public final void rule__DOMAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:903:1: ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) | ( 'id' ) | ( 'type' ) )
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
                    // InternalMySelenium.g:904:2: ( 'name' )
                    {
                    // InternalMySelenium.g:904:2: ( 'name' )
                    // InternalMySelenium.g:905:3: 'name'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:910:2: ( 'text' )
                    {
                    // InternalMySelenium.g:910:2: ( 'text' )
                    // InternalMySelenium.g:911:3: 'text'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:916:2: ( 'alt' )
                    {
                    // InternalMySelenium.g:916:2: ( 'alt' )
                    // InternalMySelenium.g:917:3: 'alt'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:922:2: ( 'checked' )
                    {
                    // InternalMySelenium.g:922:2: ( 'checked' )
                    // InternalMySelenium.g:923:3: 'checked'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:928:2: ( 'class' )
                    {
                    // InternalMySelenium.g:928:2: ( 'class' )
                    // InternalMySelenium.g:929:3: 'class'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getClassKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:934:2: ( 'id' )
                    {
                    // InternalMySelenium.g:934:2: ( 'id' )
                    // InternalMySelenium.g:935:3: 'id'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getIdKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getIdKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:940:2: ( 'type' )
                    {
                    // InternalMySelenium.g:940:2: ( 'type' )
                    // InternalMySelenium.g:941:3: 'type'
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
    // InternalMySelenium.g:950:1: rule__DOMElement__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) );
    public final void rule__DOMElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:954:1: ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) )
            int alt11=9;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMySelenium.g:955:2: ( 'link' )
                    {
                    // InternalMySelenium.g:955:2: ( 'link' )
                    // InternalMySelenium.g:956:3: 'link'
                    {
                     before(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:961:2: ( 'button' )
                    {
                    // InternalMySelenium.g:961:2: ( 'button' )
                    // InternalMySelenium.g:962:3: 'button'
                    {
                     before(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:967:2: ( 'checkbox' )
                    {
                    // InternalMySelenium.g:967:2: ( 'checkbox' )
                    // InternalMySelenium.g:968:3: 'checkbox'
                    {
                     before(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:973:2: ( 'input' )
                    {
                    // InternalMySelenium.g:973:2: ( 'input' )
                    // InternalMySelenium.g:974:3: 'input'
                    {
                     before(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:979:2: ( 'h1' )
                    {
                    // InternalMySelenium.g:979:2: ( 'h1' )
                    // InternalMySelenium.g:980:3: 'h1'
                    {
                     before(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:985:2: ( 'body' )
                    {
                    // InternalMySelenium.g:985:2: ( 'body' )
                    // InternalMySelenium.g:986:3: 'body'
                    {
                     before(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:991:2: ( 'select' )
                    {
                    // InternalMySelenium.g:991:2: ( 'select' )
                    // InternalMySelenium.g:992:3: 'select'
                    {
                     before(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:997:2: ( 'a' )
                    {
                    // InternalMySelenium.g:997:2: ( 'a' )
                    // InternalMySelenium.g:998:3: 'a'
                    {
                     before(grammarAccess.getDOMElementAccess().getAKeyword_7()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:1003:2: ( 'img' )
                    {
                    // InternalMySelenium.g:1003:2: ( 'img' )
                    // InternalMySelenium.g:1004:3: 'img'
                    {
                     before(grammarAccess.getDOMElementAccess().getImgKeyword_8()); 
                    match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__OneParameterActionType__Alternatives"
    // InternalMySelenium.g:1013:1: rule__OneParameterActionType__Alternatives : ( ( 'click' ) | ( 'assign' ) | ( 'fill' ) | ( 'choose' ) );
    public final void rule__OneParameterActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1017:1: ( ( 'click' ) | ( 'assign' ) | ( 'fill' ) | ( 'choose' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
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
                    // InternalMySelenium.g:1018:2: ( 'click' )
                    {
                    // InternalMySelenium.g:1018:2: ( 'click' )
                    // InternalMySelenium.g:1019:3: 'click'
                    {
                     before(grammarAccess.getOneParameterActionTypeAccess().getClickKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOneParameterActionTypeAccess().getClickKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1024:2: ( 'assign' )
                    {
                    // InternalMySelenium.g:1024:2: ( 'assign' )
                    // InternalMySelenium.g:1025:3: 'assign'
                    {
                     before(grammarAccess.getOneParameterActionTypeAccess().getAssignKeyword_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getOneParameterActionTypeAccess().getAssignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1030:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:1030:2: ( 'fill' )
                    // InternalMySelenium.g:1031:3: 'fill'
                    {
                     before(grammarAccess.getOneParameterActionTypeAccess().getFillKeyword_2()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getOneParameterActionTypeAccess().getFillKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:1036:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:1036:2: ( 'choose' )
                    // InternalMySelenium.g:1037:3: 'choose'
                    {
                     before(grammarAccess.getOneParameterActionTypeAccess().getChooseKeyword_3()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getOneParameterActionTypeAccess().getChooseKeyword_3()); 

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
    // $ANTLR end "rule__OneParameterActionType__Alternatives"


    // $ANTLR start "rule__TwoParametersActionType__Alternatives"
    // InternalMySelenium.g:1046:1: rule__TwoParametersActionType__Alternatives : ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) );
    public final void rule__TwoParametersActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1050:1: ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
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
                    // InternalMySelenium.g:1051:2: ( 'assign' )
                    {
                    // InternalMySelenium.g:1051:2: ( 'assign' )
                    // InternalMySelenium.g:1052:3: 'assign'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:1057:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:1057:2: ( 'fill' )
                    // InternalMySelenium.g:1058:3: 'fill'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:1063:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:1063:2: ( 'choose' )
                    // InternalMySelenium.g:1064:3: 'choose'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getChooseKeyword_2()); 
                    match(input,34,FOLLOW_2); 
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
    // InternalMySelenium.g:1073:1: rule__VariableCall__Alternatives : ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) );
    public final void rule__VariableCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1077:1: ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMySelenium.g:1078:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    {
                    // InternalMySelenium.g:1078:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    // InternalMySelenium.g:1079:3: ( rule__VariableCall__NameAssignment_0 )
                    {
                     before(grammarAccess.getVariableCallAccess().getNameAssignment_0()); 
                    // InternalMySelenium.g:1080:3: ( rule__VariableCall__NameAssignment_0 )
                    // InternalMySelenium.g:1080:4: rule__VariableCall__NameAssignment_0
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
                    // InternalMySelenium.g:1084:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:1084:2: ( RULE_STRING )
                    // InternalMySelenium.g:1085:3: RULE_STRING
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
    // InternalMySelenium.g:1094:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1098:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMySelenium.g:1099:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalMySelenium.g:1106:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1110:1: ( ( 'def' ) )
            // InternalMySelenium.g:1111:1: ( 'def' )
            {
            // InternalMySelenium.g:1111:1: ( 'def' )
            // InternalMySelenium.g:1112:2: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMySelenium.g:1121:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1125:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMySelenium.g:1126:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalMySelenium.g:1133:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1137:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMySelenium.g:1138:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMySelenium.g:1138:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMySelenium.g:1139:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMySelenium.g:1140:2: ( rule__Function__NameAssignment_1 )
            // InternalMySelenium.g:1140:3: rule__Function__NameAssignment_1
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
    // InternalMySelenium.g:1148:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1152:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMySelenium.g:1153:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalMySelenium.g:1160:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1164:1: ( ( ( rule__Function__ParamsAssignment_2 )* ) )
            // InternalMySelenium.g:1165:1: ( ( rule__Function__ParamsAssignment_2 )* )
            {
            // InternalMySelenium.g:1165:1: ( ( rule__Function__ParamsAssignment_2 )* )
            // InternalMySelenium.g:1166:2: ( rule__Function__ParamsAssignment_2 )*
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalMySelenium.g:1167:2: ( rule__Function__ParamsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMySelenium.g:1167:3: rule__Function__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Function__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMySelenium.g:1175:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1179:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMySelenium.g:1180:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalMySelenium.g:1187:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1191:1: ( ( '{' ) )
            // InternalMySelenium.g:1192:1: ( '{' )
            {
            // InternalMySelenium.g:1192:1: ( '{' )
            // InternalMySelenium.g:1193:2: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMySelenium.g:1202:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1206:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMySelenium.g:1207:2: rule__Function__Group__4__Impl rule__Function__Group__5
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
    // InternalMySelenium.g:1214:1: rule__Function__Group__4__Impl : ( ( rule__Function__StatementsAssignment_4 )* ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1218:1: ( ( ( rule__Function__StatementsAssignment_4 )* ) )
            // InternalMySelenium.g:1219:1: ( ( rule__Function__StatementsAssignment_4 )* )
            {
            // InternalMySelenium.g:1219:1: ( ( rule__Function__StatementsAssignment_4 )* )
            // InternalMySelenium.g:1220:2: ( rule__Function__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 
            // InternalMySelenium.g:1221:2: ( rule__Function__StatementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=14 && LA16_0<=15)||(LA16_0>=31 && LA16_0<=34)||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMySelenium.g:1221:3: rule__Function__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Function__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMySelenium.g:1229:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1233:1: ( rule__Function__Group__5__Impl )
            // InternalMySelenium.g:1234:2: rule__Function__Group__5__Impl
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
    // InternalMySelenium.g:1240:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1244:1: ( ( '}' ) )
            // InternalMySelenium.g:1245:1: ( '}' )
            {
            // InternalMySelenium.g:1245:1: ( '}' )
            // InternalMySelenium.g:1246:2: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMySelenium.g:1256:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1260:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMySelenium.g:1261:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalMySelenium.g:1268:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__RefAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1272:1: ( ( ( rule__FunctionCall__RefAssignment_0 ) ) )
            // InternalMySelenium.g:1273:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            {
            // InternalMySelenium.g:1273:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            // InternalMySelenium.g:1274:2: ( rule__FunctionCall__RefAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 
            // InternalMySelenium.g:1275:2: ( rule__FunctionCall__RefAssignment_0 )
            // InternalMySelenium.g:1275:3: rule__FunctionCall__RefAssignment_0
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
    // InternalMySelenium.g:1283:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1287:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMySelenium.g:1288:2: rule__FunctionCall__Group__1__Impl
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
    // InternalMySelenium.g:1294:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__ParamsAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1298:1: ( ( ( rule__FunctionCall__ParamsAssignment_1 ) ) )
            // InternalMySelenium.g:1299:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            {
            // InternalMySelenium.g:1299:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            // InternalMySelenium.g:1300:2: ( rule__FunctionCall__ParamsAssignment_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 
            // InternalMySelenium.g:1301:2: ( rule__FunctionCall__ParamsAssignment_1 )
            // InternalMySelenium.g:1301:3: rule__FunctionCall__ParamsAssignment_1
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
    // InternalMySelenium.g:1310:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1314:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMySelenium.g:1315:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
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
    // InternalMySelenium.g:1322:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__SelectorAssignment_0 ) ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1326:1: ( ( ( rule__Projection__SelectorAssignment_0 ) ) )
            // InternalMySelenium.g:1327:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            {
            // InternalMySelenium.g:1327:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            // InternalMySelenium.g:1328:2: ( rule__Projection__SelectorAssignment_0 )
            {
             before(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 
            // InternalMySelenium.g:1329:2: ( rule__Projection__SelectorAssignment_0 )
            // InternalMySelenium.g:1329:3: rule__Projection__SelectorAssignment_0
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
    // InternalMySelenium.g:1337:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1341:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalMySelenium.g:1342:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
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
    // InternalMySelenium.g:1349:1: rule__Projection__Group__1__Impl : ( '.' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1353:1: ( ( '.' ) )
            // InternalMySelenium.g:1354:1: ( '.' )
            {
            // InternalMySelenium.g:1354:1: ( '.' )
            // InternalMySelenium.g:1355:2: '.'
            {
             before(grammarAccess.getProjectionAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMySelenium.g:1364:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1368:1: ( rule__Projection__Group__2__Impl )
            // InternalMySelenium.g:1369:2: rule__Projection__Group__2__Impl
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
    // InternalMySelenium.g:1375:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__ProjectionActionAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1379:1: ( ( ( rule__Projection__ProjectionActionAssignment_2 ) ) )
            // InternalMySelenium.g:1380:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            {
            // InternalMySelenium.g:1380:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            // InternalMySelenium.g:1381:2: ( rule__Projection__ProjectionActionAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 
            // InternalMySelenium.g:1382:2: ( rule__Projection__ProjectionActionAssignment_2 )
            // InternalMySelenium.g:1382:3: rule__Projection__ProjectionActionAssignment_2
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
    // InternalMySelenium.g:1391:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1395:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalMySelenium.g:1396:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
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
    // InternalMySelenium.g:1403:1: rule__AssertEquals__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1407:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1408:1: ( 'assert' )
            {
            // InternalMySelenium.g:1408:1: ( 'assert' )
            // InternalMySelenium.g:1409:2: 'assert'
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMySelenium.g:1418:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1422:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalMySelenium.g:1423:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
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
    // InternalMySelenium.g:1430:1: rule__AssertEquals__Group__1__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1434:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) )
            // InternalMySelenium.g:1435:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            {
            // InternalMySelenium.g:1435:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            // InternalMySelenium.g:1436:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 
            // InternalMySelenium.g:1437:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            // InternalMySelenium.g:1437:3: rule__AssertEquals__AssertableElementAssignment_1
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
    // InternalMySelenium.g:1445:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1449:1: ( rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 )
            // InternalMySelenium.g:1450:2: rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3
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
    // InternalMySelenium.g:1457:1: rule__AssertEquals__Group__2__Impl : ( '=' ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1461:1: ( ( '=' ) )
            // InternalMySelenium.g:1462:1: ( '=' )
            {
            // InternalMySelenium.g:1462:1: ( '=' )
            // InternalMySelenium.g:1463:2: '='
            {
             before(grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMySelenium.g:1472:1: rule__AssertEquals__Group__3 : rule__AssertEquals__Group__3__Impl ;
    public final void rule__AssertEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1476:1: ( rule__AssertEquals__Group__3__Impl )
            // InternalMySelenium.g:1477:2: rule__AssertEquals__Group__3__Impl
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
    // InternalMySelenium.g:1483:1: rule__AssertEquals__Group__3__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) ;
    public final void rule__AssertEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1487:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) )
            // InternalMySelenium.g:1488:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1488:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            // InternalMySelenium.g:1489:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 
            // InternalMySelenium.g:1490:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            // InternalMySelenium.g:1490:3: rule__AssertEquals__AssertableElementAssignment_3
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
    // InternalMySelenium.g:1499:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1503:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalMySelenium.g:1504:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
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
    // InternalMySelenium.g:1511:1: rule__AssertContains__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1515:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1516:1: ( 'assert' )
            {
            // InternalMySelenium.g:1516:1: ( 'assert' )
            // InternalMySelenium.g:1517:2: 'assert'
            {
             before(grammarAccess.getAssertContainsAccess().getAssertKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMySelenium.g:1526:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1530:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalMySelenium.g:1531:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
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
    // InternalMySelenium.g:1538:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__ContainerAssignment_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1542:1: ( ( ( rule__AssertContains__ContainerAssignment_1 ) ) )
            // InternalMySelenium.g:1543:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            {
            // InternalMySelenium.g:1543:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            // InternalMySelenium.g:1544:2: ( rule__AssertContains__ContainerAssignment_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 
            // InternalMySelenium.g:1545:2: ( rule__AssertContains__ContainerAssignment_1 )
            // InternalMySelenium.g:1545:3: rule__AssertContains__ContainerAssignment_1
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
    // InternalMySelenium.g:1553:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1557:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalMySelenium.g:1558:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
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
    // InternalMySelenium.g:1565:1: rule__AssertContains__Group__2__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1569:1: ( ( 'contains' ) )
            // InternalMySelenium.g:1570:1: ( 'contains' )
            {
            // InternalMySelenium.g:1570:1: ( 'contains' )
            // InternalMySelenium.g:1571:2: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getContainsKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMySelenium.g:1580:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1584:1: ( rule__AssertContains__Group__3__Impl )
            // InternalMySelenium.g:1585:2: rule__AssertContains__Group__3__Impl
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
    // InternalMySelenium.g:1591:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ElementAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1595:1: ( ( ( rule__AssertContains__ElementAssignment_3 ) ) )
            // InternalMySelenium.g:1596:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1596:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            // InternalMySelenium.g:1597:2: ( rule__AssertContains__ElementAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 
            // InternalMySelenium.g:1598:2: ( rule__AssertContains__ElementAssignment_3 )
            // InternalMySelenium.g:1598:3: rule__AssertContains__ElementAssignment_3
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
    // InternalMySelenium.g:1607:1: rule__NavigationAction__Group__0 : rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 ;
    public final void rule__NavigationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1611:1: ( rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 )
            // InternalMySelenium.g:1612:2: rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1
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
    // InternalMySelenium.g:1619:1: rule__NavigationAction__Group__0__Impl : ( ( rule__NavigationAction__ActionAssignment_0 ) ) ;
    public final void rule__NavigationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1623:1: ( ( ( rule__NavigationAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1624:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1624:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1625:2: ( rule__NavigationAction__ActionAssignment_0 )
            {
             before(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1626:2: ( rule__NavigationAction__ActionAssignment_0 )
            // InternalMySelenium.g:1626:3: rule__NavigationAction__ActionAssignment_0
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
    // InternalMySelenium.g:1634:1: rule__NavigationAction__Group__1 : rule__NavigationAction__Group__1__Impl ;
    public final void rule__NavigationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1638:1: ( rule__NavigationAction__Group__1__Impl )
            // InternalMySelenium.g:1639:2: rule__NavigationAction__Group__1__Impl
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
    // InternalMySelenium.g:1645:1: rule__NavigationAction__Group__1__Impl : ( ( rule__NavigationAction__ParamAssignment_1 ) ) ;
    public final void rule__NavigationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1649:1: ( ( ( rule__NavigationAction__ParamAssignment_1 ) ) )
            // InternalMySelenium.g:1650:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            {
            // InternalMySelenium.g:1650:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            // InternalMySelenium.g:1651:2: ( rule__NavigationAction__ParamAssignment_1 )
            {
             before(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 
            // InternalMySelenium.g:1652:2: ( rule__NavigationAction__ParamAssignment_1 )
            // InternalMySelenium.g:1652:3: rule__NavigationAction__ParamAssignment_1
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
    // InternalMySelenium.g:1661:1: rule__OneParameterAction__Group__0 : rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 ;
    public final void rule__OneParameterAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1665:1: ( rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 )
            // InternalMySelenium.g:1666:2: rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1
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
    // InternalMySelenium.g:1673:1: rule__OneParameterAction__Group__0__Impl : ( ( rule__OneParameterAction__ActionAssignment_0 ) ) ;
    public final void rule__OneParameterAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1677:1: ( ( ( rule__OneParameterAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1678:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1678:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1679:2: ( rule__OneParameterAction__ActionAssignment_0 )
            {
             before(grammarAccess.getOneParameterActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1680:2: ( rule__OneParameterAction__ActionAssignment_0 )
            // InternalMySelenium.g:1680:3: rule__OneParameterAction__ActionAssignment_0
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
    // InternalMySelenium.g:1688:1: rule__OneParameterAction__Group__1 : rule__OneParameterAction__Group__1__Impl rule__OneParameterAction__Group__2 ;
    public final void rule__OneParameterAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1692:1: ( rule__OneParameterAction__Group__1__Impl rule__OneParameterAction__Group__2 )
            // InternalMySelenium.g:1693:2: rule__OneParameterAction__Group__1__Impl rule__OneParameterAction__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__OneParameterAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneParameterAction__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMySelenium.g:1700:1: rule__OneParameterAction__Group__1__Impl : ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) ;
    public final void rule__OneParameterAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1704:1: ( ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) )
            // InternalMySelenium.g:1705:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            {
            // InternalMySelenium.g:1705:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            // InternalMySelenium.g:1706:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getOneParameterActionAccess().getSelectorAssignment_1()); 
            // InternalMySelenium.g:1707:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            // InternalMySelenium.g:1707:3: rule__OneParameterAction__SelectorAssignment_1
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


    // $ANTLR start "rule__OneParameterAction__Group__2"
    // InternalMySelenium.g:1715:1: rule__OneParameterAction__Group__2 : rule__OneParameterAction__Group__2__Impl ;
    public final void rule__OneParameterAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1719:1: ( rule__OneParameterAction__Group__2__Impl )
            // InternalMySelenium.g:1720:2: rule__OneParameterAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneParameterAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__2"


    // $ANTLR start "rule__OneParameterAction__Group__2__Impl"
    // InternalMySelenium.g:1726:1: rule__OneParameterAction__Group__2__Impl : ( ( rule__OneParameterAction__Alternatives_2 )? ) ;
    public final void rule__OneParameterAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1730:1: ( ( ( rule__OneParameterAction__Alternatives_2 )? ) )
            // InternalMySelenium.g:1731:1: ( ( rule__OneParameterAction__Alternatives_2 )? )
            {
            // InternalMySelenium.g:1731:1: ( ( rule__OneParameterAction__Alternatives_2 )? )
            // InternalMySelenium.g:1732:2: ( rule__OneParameterAction__Alternatives_2 )?
            {
             before(grammarAccess.getOneParameterActionAccess().getAlternatives_2()); 
            // InternalMySelenium.g:1733:2: ( rule__OneParameterAction__Alternatives_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||(LA17_0>=22 && LA17_0<=30)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:1733:3: rule__OneParameterAction__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneParameterAction__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOneParameterActionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalMySelenium.g:1742:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1746:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMySelenium.g:1747:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMySelenium.g:1754:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__ElementAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1758:1: ( ( ( rule__Selector__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:1759:1: ( ( rule__Selector__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:1759:1: ( ( rule__Selector__ElementAssignment_0 ) )
            // InternalMySelenium.g:1760:2: ( rule__Selector__ElementAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:1761:2: ( rule__Selector__ElementAssignment_0 )
            // InternalMySelenium.g:1761:3: rule__Selector__ElementAssignment_0
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
    // InternalMySelenium.g:1769:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1773:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMySelenium.g:1774:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMySelenium.g:1781:1: rule__Selector__Group__1__Impl : ( '[' ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1785:1: ( ( '[' ) )
            // InternalMySelenium.g:1786:1: ( '[' )
            {
            // InternalMySelenium.g:1786:1: ( '[' )
            // InternalMySelenium.g:1787:2: '['
            {
             before(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMySelenium.g:1796:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1800:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMySelenium.g:1801:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMySelenium.g:1808:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__AttrsAssignment_2 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1812:1: ( ( ( rule__Selector__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:1813:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:1813:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            // InternalMySelenium.g:1814:2: ( rule__Selector__AttrsAssignment_2 )?
            {
             before(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:1815:2: ( rule__Selector__AttrsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12||(LA18_0>=16 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMySelenium.g:1815:3: rule__Selector__AttrsAssignment_2
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
    // InternalMySelenium.g:1823:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1827:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMySelenium.g:1828:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMySelenium.g:1835:1: rule__Selector__Group__3__Impl : ( ']' ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1839:1: ( ( ']' ) )
            // InternalMySelenium.g:1840:1: ( ']' )
            {
            // InternalMySelenium.g:1840:1: ( ']' )
            // InternalMySelenium.g:1841:2: ']'
            {
             before(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMySelenium.g:1850:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1854:1: ( rule__Selector__Group__4__Impl )
            // InternalMySelenium.g:1855:2: rule__Selector__Group__4__Impl
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
    // InternalMySelenium.g:1861:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__AllAssignment_4 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1865:1: ( ( ( rule__Selector__AllAssignment_4 )? ) )
            // InternalMySelenium.g:1866:1: ( ( rule__Selector__AllAssignment_4 )? )
            {
            // InternalMySelenium.g:1866:1: ( ( rule__Selector__AllAssignment_4 )? )
            // InternalMySelenium.g:1867:2: ( rule__Selector__AllAssignment_4 )?
            {
             before(grammarAccess.getSelectorAccess().getAllAssignment_4()); 
            // InternalMySelenium.g:1868:2: ( rule__Selector__AllAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMySelenium.g:1868:3: rule__Selector__AllAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__AllAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAllAssignment_4()); 

            }


            }

        }
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
    // InternalMySelenium.g:1877:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1881:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalMySelenium.g:1882:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMySelenium.g:1889:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttrsAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1893:1: ( ( ( rule__Attributes__AttrsAssignment_0 ) ) )
            // InternalMySelenium.g:1894:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            {
            // InternalMySelenium.g:1894:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            // InternalMySelenium.g:1895:2: ( rule__Attributes__AttrsAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 
            // InternalMySelenium.g:1896:2: ( rule__Attributes__AttrsAssignment_0 )
            // InternalMySelenium.g:1896:3: rule__Attributes__AttrsAssignment_0
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
    // InternalMySelenium.g:1904:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1908:1: ( rule__Attributes__Group__1__Impl )
            // InternalMySelenium.g:1909:2: rule__Attributes__Group__1__Impl
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
    // InternalMySelenium.g:1915:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1919:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalMySelenium.g:1920:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalMySelenium.g:1920:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalMySelenium.g:1921:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalMySelenium.g:1922:2: ( rule__Attributes__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMySelenium.g:1922:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMySelenium.g:1931:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1935:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalMySelenium.g:1936:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMySelenium.g:1943:1: rule__Attributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1947:1: ( ( ',' ) )
            // InternalMySelenium.g:1948:1: ( ',' )
            {
            // InternalMySelenium.g:1948:1: ( ',' )
            // InternalMySelenium.g:1949:2: ','
            {
             before(grammarAccess.getAttributesAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMySelenium.g:1958:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1962:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalMySelenium.g:1963:2: rule__Attributes__Group_1__1__Impl
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
    // InternalMySelenium.g:1969:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttrsAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1973:1: ( ( ( rule__Attributes__AttrsAssignment_1_1 ) ) )
            // InternalMySelenium.g:1974:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            {
            // InternalMySelenium.g:1974:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            // InternalMySelenium.g:1975:2: ( rule__Attributes__AttrsAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 
            // InternalMySelenium.g:1976:2: ( rule__Attributes__AttrsAssignment_1_1 )
            // InternalMySelenium.g:1976:3: rule__Attributes__AttrsAssignment_1_1
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
    // InternalMySelenium.g:1985:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1989:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMySelenium.g:1990:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMySelenium.g:1997:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2001:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMySelenium.g:2002:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMySelenium.g:2002:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMySelenium.g:2003:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMySelenium.g:2004:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMySelenium.g:2004:3: rule__Attribute__NameAssignment_0
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
    // InternalMySelenium.g:2012:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2016:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMySelenium.g:2017:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMySelenium.g:2024:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2028:1: ( ( '=' ) )
            // InternalMySelenium.g:2029:1: ( '=' )
            {
            // InternalMySelenium.g:2029:1: ( '=' )
            // InternalMySelenium.g:2030:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMySelenium.g:2039:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2043:1: ( rule__Attribute__Group__2__Impl )
            // InternalMySelenium.g:2044:2: rule__Attribute__Group__2__Impl
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
    // InternalMySelenium.g:2050:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Alternatives_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2054:1: ( ( ( rule__Attribute__Alternatives_2 ) ) )
            // InternalMySelenium.g:2055:1: ( ( rule__Attribute__Alternatives_2 ) )
            {
            // InternalMySelenium.g:2055:1: ( ( rule__Attribute__Alternatives_2 ) )
            // InternalMySelenium.g:2056:2: ( rule__Attribute__Alternatives_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_2()); 
            // InternalMySelenium.g:2057:2: ( rule__Attribute__Alternatives_2 )
            // InternalMySelenium.g:2057:3: rule__Attribute__Alternatives_2
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
    // InternalMySelenium.g:2066:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2070:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // InternalMySelenium.g:2071:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
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
    // InternalMySelenium.g:2078:1: rule__FunctionParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2082:1: ( ( '(' ) )
            // InternalMySelenium.g:2083:1: ( '(' )
            {
            // InternalMySelenium.g:2083:1: ( '(' )
            // InternalMySelenium.g:2084:2: '('
            {
             before(grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMySelenium.g:2093:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2097:1: ( rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 )
            // InternalMySelenium.g:2098:2: rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMySelenium.g:2105:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2109:1: ( ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2110:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2110:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2111:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2112:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2112:3: rule__FunctionParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2120:1: rule__FunctionParameters__Group__2 : rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 ;
    public final void rule__FunctionParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2124:1: ( rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 )
            // InternalMySelenium.g:2125:2: rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMySelenium.g:2132:1: rule__FunctionParameters__Group__2__Impl : ( ( rule__FunctionParameters__Group_2__0 )* ) ;
    public final void rule__FunctionParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2136:1: ( ( ( rule__FunctionParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2137:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2137:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            // InternalMySelenium.g:2138:2: ( rule__FunctionParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2139:2: ( rule__FunctionParameters__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:2139:3: rule__FunctionParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FunctionParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMySelenium.g:2147:1: rule__FunctionParameters__Group__3 : rule__FunctionParameters__Group__3__Impl ;
    public final void rule__FunctionParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2151:1: ( rule__FunctionParameters__Group__3__Impl )
            // InternalMySelenium.g:2152:2: rule__FunctionParameters__Group__3__Impl
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
    // InternalMySelenium.g:2158:1: rule__FunctionParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2162:1: ( ( ')' ) )
            // InternalMySelenium.g:2163:1: ( ')' )
            {
            // InternalMySelenium.g:2163:1: ( ')' )
            // InternalMySelenium.g:2164:2: ')'
            {
             before(grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMySelenium.g:2174:1: rule__FunctionParameters__Group_2__0 : rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 ;
    public final void rule__FunctionParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2178:1: ( rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 )
            // InternalMySelenium.g:2179:2: rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1
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
    // InternalMySelenium.g:2186:1: rule__FunctionParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2190:1: ( ( ',' ) )
            // InternalMySelenium.g:2191:1: ( ',' )
            {
            // InternalMySelenium.g:2191:1: ( ',' )
            // InternalMySelenium.g:2192:2: ','
            {
             before(grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMySelenium.g:2201:1: rule__FunctionParameters__Group_2__1 : rule__FunctionParameters__Group_2__1__Impl ;
    public final void rule__FunctionParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2205:1: ( rule__FunctionParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2206:2: rule__FunctionParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2212:1: rule__FunctionParameters__Group_2__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2216:1: ( ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2217:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2217:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2218:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2219:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2219:3: rule__FunctionParameters__VariablesAssignment_2_1
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
    // InternalMySelenium.g:2228:1: rule__FunctionCallParameters__Group__0 : rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 ;
    public final void rule__FunctionCallParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2232:1: ( rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 )
            // InternalMySelenium.g:2233:2: rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMySelenium.g:2240:1: rule__FunctionCallParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2244:1: ( ( '(' ) )
            // InternalMySelenium.g:2245:1: ( '(' )
            {
            // InternalMySelenium.g:2245:1: ( '(' )
            // InternalMySelenium.g:2246:2: '('
            {
             before(grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMySelenium.g:2255:1: rule__FunctionCallParameters__Group__1 : rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 ;
    public final void rule__FunctionCallParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2259:1: ( rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 )
            // InternalMySelenium.g:2260:2: rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMySelenium.g:2267:1: rule__FunctionCallParameters__Group__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionCallParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2271:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2272:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2272:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2273:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2274:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2274:3: rule__FunctionCallParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2282:1: rule__FunctionCallParameters__Group__2 : rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 ;
    public final void rule__FunctionCallParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2286:1: ( rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 )
            // InternalMySelenium.g:2287:2: rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMySelenium.g:2294:1: rule__FunctionCallParameters__Group__2__Impl : ( ( rule__FunctionCallParameters__Group_2__0 )* ) ;
    public final void rule__FunctionCallParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2298:1: ( ( ( rule__FunctionCallParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2299:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2299:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            // InternalMySelenium.g:2300:2: ( rule__FunctionCallParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2301:2: ( rule__FunctionCallParameters__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMySelenium.g:2301:3: rule__FunctionCallParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FunctionCallParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMySelenium.g:2309:1: rule__FunctionCallParameters__Group__3 : rule__FunctionCallParameters__Group__3__Impl ;
    public final void rule__FunctionCallParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2313:1: ( rule__FunctionCallParameters__Group__3__Impl )
            // InternalMySelenium.g:2314:2: rule__FunctionCallParameters__Group__3__Impl
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
    // InternalMySelenium.g:2320:1: rule__FunctionCallParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCallParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2324:1: ( ( ')' ) )
            // InternalMySelenium.g:2325:1: ( ')' )
            {
            // InternalMySelenium.g:2325:1: ( ')' )
            // InternalMySelenium.g:2326:2: ')'
            {
             before(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMySelenium.g:2336:1: rule__FunctionCallParameters__Group_2__0 : rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 ;
    public final void rule__FunctionCallParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2340:1: ( rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 )
            // InternalMySelenium.g:2341:2: rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMySelenium.g:2348:1: rule__FunctionCallParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2352:1: ( ( ',' ) )
            // InternalMySelenium.g:2353:1: ( ',' )
            {
            // InternalMySelenium.g:2353:1: ( ',' )
            // InternalMySelenium.g:2354:2: ','
            {
             before(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMySelenium.g:2363:1: rule__FunctionCallParameters__Group_2__1 : rule__FunctionCallParameters__Group_2__1__Impl ;
    public final void rule__FunctionCallParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2367:1: ( rule__FunctionCallParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2368:2: rule__FunctionCallParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2374:1: rule__FunctionCallParameters__Group_2__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionCallParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2378:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2379:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2379:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2380:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2381:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2381:3: rule__FunctionCallParameters__VariablesAssignment_2_1
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
    // InternalMySelenium.g:2390:1: rule__Program__FunctionsAssignment_0 : ( ruleFunctions ) ;
    public final void rule__Program__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2394:1: ( ( ruleFunctions ) )
            // InternalMySelenium.g:2395:2: ( ruleFunctions )
            {
            // InternalMySelenium.g:2395:2: ( ruleFunctions )
            // InternalMySelenium.g:2396:3: ruleFunctions
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
    // InternalMySelenium.g:2405:1: rule__Program__StatementsAssignment_1 : ( ruleStatements ) ;
    public final void rule__Program__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2409:1: ( ( ruleStatements ) )
            // InternalMySelenium.g:2410:2: ( ruleStatements )
            {
            // InternalMySelenium.g:2410:2: ( ruleStatements )
            // InternalMySelenium.g:2411:3: ruleStatements
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
    // InternalMySelenium.g:2420:1: rule__Functions__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Functions__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2424:1: ( ( ruleFunction ) )
            // InternalMySelenium.g:2425:2: ( ruleFunction )
            {
            // InternalMySelenium.g:2425:2: ( ruleFunction )
            // InternalMySelenium.g:2426:3: ruleFunction
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
    // InternalMySelenium.g:2435:1: rule__Statements__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Statements__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2439:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:2440:2: ( ruleStatement )
            {
            // InternalMySelenium.g:2440:2: ( ruleStatement )
            // InternalMySelenium.g:2441:3: ruleStatement
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
    // InternalMySelenium.g:2450:1: rule__Function__NameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2454:1: ( ( ruleFunctionName ) )
            // InternalMySelenium.g:2455:2: ( ruleFunctionName )
            {
            // InternalMySelenium.g:2455:2: ( ruleFunctionName )
            // InternalMySelenium.g:2456:3: ruleFunctionName
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
    // InternalMySelenium.g:2465:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2469:1: ( ( ruleFunctionParameters ) )
            // InternalMySelenium.g:2470:2: ( ruleFunctionParameters )
            {
            // InternalMySelenium.g:2470:2: ( ruleFunctionParameters )
            // InternalMySelenium.g:2471:3: ruleFunctionParameters
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
    // InternalMySelenium.g:2480:1: rule__Function__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Function__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2484:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:2485:2: ( ruleStatement )
            {
            // InternalMySelenium.g:2485:2: ( ruleStatement )
            // InternalMySelenium.g:2486:3: ruleStatement
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
    // InternalMySelenium.g:2495:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2499:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:2500:2: ( RULE_ID )
            {
            // InternalMySelenium.g:2500:2: ( RULE_ID )
            // InternalMySelenium.g:2501:3: RULE_ID
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
    // InternalMySelenium.g:2510:1: rule__FunctionCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2514:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2515:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2515:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2516:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 
            // InternalMySelenium.g:2517:3: ( RULE_ID )
            // InternalMySelenium.g:2518:4: RULE_ID
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
    // InternalMySelenium.g:2529:1: rule__FunctionCall__ParamsAssignment_1 : ( ruleFunctionCallParameters ) ;
    public final void rule__FunctionCall__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2533:1: ( ( ruleFunctionCallParameters ) )
            // InternalMySelenium.g:2534:2: ( ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:2534:2: ( ruleFunctionCallParameters )
            // InternalMySelenium.g:2535:3: ruleFunctionCallParameters
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
    // InternalMySelenium.g:2544:1: rule__Projection__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Projection__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2548:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2549:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2549:2: ( ruleSelector )
            // InternalMySelenium.g:2550:3: ruleSelector
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
    // InternalMySelenium.g:2559:1: rule__Projection__ProjectionActionAssignment_2 : ( ruleProjectionAction ) ;
    public final void rule__Projection__ProjectionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2563:1: ( ( ruleProjectionAction ) )
            // InternalMySelenium.g:2564:2: ( ruleProjectionAction )
            {
            // InternalMySelenium.g:2564:2: ( ruleProjectionAction )
            // InternalMySelenium.g:2565:3: ruleProjectionAction
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
    // InternalMySelenium.g:2574:1: rule__AssertEquals__AssertableElementAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2578:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2579:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2579:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2580:3: ruleAssertableElement
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
    // InternalMySelenium.g:2589:1: rule__AssertEquals__AssertableElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2593:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2594:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2594:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2595:3: ruleAssertableElement
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
    // InternalMySelenium.g:2604:1: rule__AssertContains__ContainerAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2608:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2609:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2609:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2610:3: ruleAssertableElement
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
    // InternalMySelenium.g:2619:1: rule__AssertContains__ElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2623:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2624:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2624:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2625:3: ruleAssertableElement
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
    // InternalMySelenium.g:2634:1: rule__NavigationAction__ActionAssignment_0 : ( ruleNavigationActionType ) ;
    public final void rule__NavigationAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2638:1: ( ( ruleNavigationActionType ) )
            // InternalMySelenium.g:2639:2: ( ruleNavigationActionType )
            {
            // InternalMySelenium.g:2639:2: ( ruleNavigationActionType )
            // InternalMySelenium.g:2640:3: ruleNavigationActionType
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
    // InternalMySelenium.g:2649:1: rule__NavigationAction__ParamAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NavigationAction__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2653:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2654:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2654:2: ( RULE_STRING )
            // InternalMySelenium.g:2655:3: RULE_STRING
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
    // InternalMySelenium.g:2664:1: rule__OneParameterAction__ActionAssignment_0 : ( ruleOneParameterActionType ) ;
    public final void rule__OneParameterAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2668:1: ( ( ruleOneParameterActionType ) )
            // InternalMySelenium.g:2669:2: ( ruleOneParameterActionType )
            {
            // InternalMySelenium.g:2669:2: ( ruleOneParameterActionType )
            // InternalMySelenium.g:2670:3: ruleOneParameterActionType
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
    // InternalMySelenium.g:2679:1: rule__OneParameterAction__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__OneParameterAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2683:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2684:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2684:2: ( ruleSelector )
            // InternalMySelenium.g:2685:3: ruleSelector
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


    // $ANTLR start "rule__OneParameterAction__SelectorParameterAssignment_2_0"
    // InternalMySelenium.g:2694:1: rule__OneParameterAction__SelectorParameterAssignment_2_0 : ( ruleSelector ) ;
    public final void rule__OneParameterAction__SelectorParameterAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2698:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2699:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2699:2: ( ruleSelector )
            // InternalMySelenium.g:2700:3: ruleSelector
            {
             before(grammarAccess.getOneParameterActionAccess().getSelectorParameterSelectorParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getOneParameterActionAccess().getSelectorParameterSelectorParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__SelectorParameterAssignment_2_0"


    // $ANTLR start "rule__OneParameterAction__StringParameterAssignment_2_1"
    // InternalMySelenium.g:2709:1: rule__OneParameterAction__StringParameterAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__OneParameterAction__StringParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2713:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2714:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2714:2: ( RULE_STRING )
            // InternalMySelenium.g:2715:3: RULE_STRING
            {
             before(grammarAccess.getOneParameterActionAccess().getStringParameterSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOneParameterActionAccess().getStringParameterSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParameterAction__StringParameterAssignment_2_1"


    // $ANTLR start "rule__Selector__ElementAssignment_0"
    // InternalMySelenium.g:2724:1: rule__Selector__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Selector__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2728:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:2729:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:2729:2: ( ruleDOMElement )
            // InternalMySelenium.g:2730:3: ruleDOMElement
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
    // InternalMySelenium.g:2739:1: rule__Selector__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2743:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:2744:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:2744:2: ( ruleAttributes )
            // InternalMySelenium.g:2745:3: ruleAttributes
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


    // $ANTLR start "rule__Selector__AllAssignment_4"
    // InternalMySelenium.g:2754:1: rule__Selector__AllAssignment_4 : ( ( '.all' ) ) ;
    public final void rule__Selector__AllAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2758:1: ( ( ( '.all' ) ) )
            // InternalMySelenium.g:2759:2: ( ( '.all' ) )
            {
            // InternalMySelenium.g:2759:2: ( ( '.all' ) )
            // InternalMySelenium.g:2760:3: ( '.all' )
            {
             before(grammarAccess.getSelectorAccess().getAllAllKeyword_4_0()); 
            // InternalMySelenium.g:2761:3: ( '.all' )
            // InternalMySelenium.g:2762:4: '.all'
            {
             before(grammarAccess.getSelectorAccess().getAllAllKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getAllAllKeyword_4_0()); 

            }

             after(grammarAccess.getSelectorAccess().getAllAllKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__AllAssignment_4"


    // $ANTLR start "rule__Attributes__AttrsAssignment_0"
    // InternalMySelenium.g:2773:1: rule__Attributes__AttrsAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2777:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2778:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2778:2: ( ruleAttribute )
            // InternalMySelenium.g:2779:3: ruleAttribute
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
    // InternalMySelenium.g:2788:1: rule__Attributes__AttrsAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2792:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2793:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2793:2: ( ruleAttribute )
            // InternalMySelenium.g:2794:3: ruleAttribute
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
    // InternalMySelenium.g:2803:1: rule__Attribute__NameAssignment_0 : ( ruleDOMAttribute ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2807:1: ( ( ruleDOMAttribute ) )
            // InternalMySelenium.g:2808:2: ( ruleDOMAttribute )
            {
            // InternalMySelenium.g:2808:2: ( ruleDOMAttribute )
            // InternalMySelenium.g:2809:3: ruleDOMAttribute
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
    // InternalMySelenium.g:2818:1: rule__Attribute__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2822:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2823:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2823:2: ( RULE_STRING )
            // InternalMySelenium.g:2824:3: RULE_STRING
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
    // InternalMySelenium.g:2833:1: rule__Attribute__ValAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2837:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2838:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2838:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2839:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0()); 
            // InternalMySelenium.g:2840:3: ( RULE_ID )
            // InternalMySelenium.g:2841:4: RULE_ID
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
    // InternalMySelenium.g:2852:1: rule__FunctionParameters__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2856:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2857:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2857:2: ( ruleVariable )
            // InternalMySelenium.g:2858:3: ruleVariable
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
    // InternalMySelenium.g:2867:1: rule__FunctionParameters__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2871:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2872:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2872:2: ( ruleVariable )
            // InternalMySelenium.g:2873:3: ruleVariable
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
    // InternalMySelenium.g:2882:1: rule__FunctionCallParameters__VariablesAssignment_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2886:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2887:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2887:2: ( ruleVariableCall )
            // InternalMySelenium.g:2888:3: ruleVariableCall
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
    // InternalMySelenium.g:2897:1: rule__FunctionCallParameters__VariablesAssignment_2_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2901:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2902:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2902:2: ( ruleVariableCall )
            // InternalMySelenium.g:2903:3: ruleVariableCall
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
    // InternalMySelenium.g:2912:1: rule__VariableCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2916:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2917:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2917:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2918:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0()); 
            // InternalMySelenium.g:2919:3: ( RULE_ID )
            // InternalMySelenium.g:2920:4: RULE_ID
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
    // InternalMySelenium.g:2931:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2935:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:2936:2: ( RULE_ID )
            {
            // InternalMySelenium.g:2936:2: ( RULE_ID )
            // InternalMySelenium.g:2937:3: RULE_ID
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
    static final String dfa_1s = "\65\uffff";
    static final String dfa_2s = "\1\5\2\uffff\1\4\1\uffff\2\50\11\52\1\uffff\1\4\1\uffff\1\14\2\54\7\50\1\46\1\4\1\50\1\4\1\46\1\13\2\54\2\53\3\50\1\14\7\50\1\4\2\53";
    static final String dfa_3s = "\1\47\2\uffff\1\36\1\uffff\1\55\1\51\11\52\1\uffff\1\5\1\uffff\1\53\2\56\7\50\1\57\1\5\1\51\1\5\1\46\1\15\2\56\2\54\3\51\1\25\7\50\1\5\2\54";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\5\13\uffff\1\4\1\uffff\1\3\42\uffff";
    static final String dfa_5s = "\65\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\10\uffff\2\4\17\uffff\4\1\4\uffff\1\3",
            "",
            "",
            "\1\6\1\5\20\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\22\1\20\3\uffff\1\21",
            "\1\22\1\20",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "",
            "\1\25\1\24",
            "",
            "\1\27\3\uffff\1\26\1\30\1\31\1\32\1\33\1\34\25\uffff\1\35",
            "\1\36\1\uffff\1\37",
            "\1\36\1\uffff\1\37",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\42\10\uffff\1\41",
            "\1\44\1\43",
            "\1\22\1\20",
            "\1\45\1\46",
            "\1\42",
            "\1\47\1\50\1\51",
            "\1\36\1\uffff\1\37",
            "\1\36\1\uffff\1\37",
            "\1\35\1\52",
            "\1\35\1\52",
            "\1\22\1\20",
            "\1\22\1\20",
            "\1\22\1\20",
            "\1\54\3\uffff\1\53\1\55\1\56\1\57\1\60\1\61",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\62",
            "\1\63\1\64",
            "\1\35\1\52",
            "\1\35\1\52"
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
            return "764:1: rule__Statement__Alternatives : ( ( ruleOneParameterAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000878000C022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000A78000C020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007FC00030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007FC00010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000800003F1000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003F1000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000500000000000L});

}