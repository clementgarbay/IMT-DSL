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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'click'", "'value'", "'text'", "'html'", "'go'", "'openBrowser'", "'name'", "'alt'", "'checked'", "'class'", "'link'", "'button'", "'checkbox'", "'input'", "'h1'", "'body'", "'select'", "'a'", "'img'", "'assign'", "'fill'", "'choose'", "'def'", "'{'", "'}'", "'.'", "'assert'", "'='", "'contains'", "'['", "']'", "'.all'", "','", "'('", "')'", "'#'"
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
    // InternalMySelenium.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMySelenium.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMySelenium.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMySelenium.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMySelenium.g:69:3: ( rule__Program__Group__0 )
            // InternalMySelenium.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFunction"
    // InternalMySelenium.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMySelenium.g:79:1: ( ruleFunction EOF )
            // InternalMySelenium.g:80:1: ruleFunction EOF
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
    // InternalMySelenium.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMySelenium.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMySelenium.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalMySelenium.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMySelenium.g:94:3: ( rule__Function__Group__0 )
            // InternalMySelenium.g:94:4: rule__Function__Group__0
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
    // InternalMySelenium.g:103:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMySelenium.g:104:1: ( ruleFunctionName EOF )
            // InternalMySelenium.g:105:1: ruleFunctionName EOF
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
    // InternalMySelenium.g:112:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:116:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMySelenium.g:117:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMySelenium.g:117:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMySelenium.g:118:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMySelenium.g:119:3: ( rule__FunctionName__NameAssignment )
            // InternalMySelenium.g:119:4: rule__FunctionName__NameAssignment
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
    // InternalMySelenium.g:128:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:129:1: ( ruleFunctionCall EOF )
            // InternalMySelenium.g:130:1: ruleFunctionCall EOF
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
    // InternalMySelenium.g:137:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:141:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMySelenium.g:142:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMySelenium.g:142:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMySelenium.g:143:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMySelenium.g:144:3: ( rule__FunctionCall__Group__0 )
            // InternalMySelenium.g:144:4: rule__FunctionCall__Group__0
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
    // InternalMySelenium.g:153:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // InternalMySelenium.g:154:1: ( ruleProjection EOF )
            // InternalMySelenium.g:155:1: ruleProjection EOF
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
    // InternalMySelenium.g:162:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:166:2: ( ( ( rule__Projection__Group__0 ) ) )
            // InternalMySelenium.g:167:2: ( ( rule__Projection__Group__0 ) )
            {
            // InternalMySelenium.g:167:2: ( ( rule__Projection__Group__0 ) )
            // InternalMySelenium.g:168:3: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // InternalMySelenium.g:169:3: ( rule__Projection__Group__0 )
            // InternalMySelenium.g:169:4: rule__Projection__Group__0
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
    // InternalMySelenium.g:178:1: entryRuleProjectionAction : ruleProjectionAction EOF ;
    public final void entryRuleProjectionAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:179:1: ( ruleProjectionAction EOF )
            // InternalMySelenium.g:180:1: ruleProjectionAction EOF
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
    // InternalMySelenium.g:187:1: ruleProjectionAction : ( ( rule__ProjectionAction__Alternatives ) ) ;
    public final void ruleProjectionAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:191:2: ( ( ( rule__ProjectionAction__Alternatives ) ) )
            // InternalMySelenium.g:192:2: ( ( rule__ProjectionAction__Alternatives ) )
            {
            // InternalMySelenium.g:192:2: ( ( rule__ProjectionAction__Alternatives ) )
            // InternalMySelenium.g:193:3: ( rule__ProjectionAction__Alternatives )
            {
             before(grammarAccess.getProjectionActionAccess().getAlternatives()); 
            // InternalMySelenium.g:194:3: ( rule__ProjectionAction__Alternatives )
            // InternalMySelenium.g:194:4: rule__ProjectionAction__Alternatives
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
    // InternalMySelenium.g:203:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMySelenium.g:204:1: ( ruleStatement EOF )
            // InternalMySelenium.g:205:1: ruleStatement EOF
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
    // InternalMySelenium.g:212:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:216:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMySelenium.g:217:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMySelenium.g:217:2: ( ( rule__Statement__Alternatives ) )
            // InternalMySelenium.g:218:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMySelenium.g:219:3: ( rule__Statement__Alternatives )
            // InternalMySelenium.g:219:4: rule__Statement__Alternatives
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
    // InternalMySelenium.g:228:1: entryRuleAssertEquals : ruleAssertEquals EOF ;
    public final void entryRuleAssertEquals() throws RecognitionException {
        try {
            // InternalMySelenium.g:229:1: ( ruleAssertEquals EOF )
            // InternalMySelenium.g:230:1: ruleAssertEquals EOF
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
    // InternalMySelenium.g:237:1: ruleAssertEquals : ( ( rule__AssertEquals__Group__0 ) ) ;
    public final void ruleAssertEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:241:2: ( ( ( rule__AssertEquals__Group__0 ) ) )
            // InternalMySelenium.g:242:2: ( ( rule__AssertEquals__Group__0 ) )
            {
            // InternalMySelenium.g:242:2: ( ( rule__AssertEquals__Group__0 ) )
            // InternalMySelenium.g:243:3: ( rule__AssertEquals__Group__0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getGroup()); 
            // InternalMySelenium.g:244:3: ( rule__AssertEquals__Group__0 )
            // InternalMySelenium.g:244:4: rule__AssertEquals__Group__0
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
    // InternalMySelenium.g:253:1: entryRuleAssertContains : ruleAssertContains EOF ;
    public final void entryRuleAssertContains() throws RecognitionException {
        try {
            // InternalMySelenium.g:254:1: ( ruleAssertContains EOF )
            // InternalMySelenium.g:255:1: ruleAssertContains EOF
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
    // InternalMySelenium.g:262:1: ruleAssertContains : ( ( rule__AssertContains__Group__0 ) ) ;
    public final void ruleAssertContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:266:2: ( ( ( rule__AssertContains__Group__0 ) ) )
            // InternalMySelenium.g:267:2: ( ( rule__AssertContains__Group__0 ) )
            {
            // InternalMySelenium.g:267:2: ( ( rule__AssertContains__Group__0 ) )
            // InternalMySelenium.g:268:3: ( rule__AssertContains__Group__0 )
            {
             before(grammarAccess.getAssertContainsAccess().getGroup()); 
            // InternalMySelenium.g:269:3: ( rule__AssertContains__Group__0 )
            // InternalMySelenium.g:269:4: rule__AssertContains__Group__0
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
    // InternalMySelenium.g:278:1: entryRuleAssertableElement : ruleAssertableElement EOF ;
    public final void entryRuleAssertableElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:279:1: ( ruleAssertableElement EOF )
            // InternalMySelenium.g:280:1: ruleAssertableElement EOF
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
    // InternalMySelenium.g:287:1: ruleAssertableElement : ( ( rule__AssertableElement__Alternatives ) ) ;
    public final void ruleAssertableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:291:2: ( ( ( rule__AssertableElement__Alternatives ) ) )
            // InternalMySelenium.g:292:2: ( ( rule__AssertableElement__Alternatives ) )
            {
            // InternalMySelenium.g:292:2: ( ( rule__AssertableElement__Alternatives ) )
            // InternalMySelenium.g:293:3: ( rule__AssertableElement__Alternatives )
            {
             before(grammarAccess.getAssertableElementAccess().getAlternatives()); 
            // InternalMySelenium.g:294:3: ( rule__AssertableElement__Alternatives )
            // InternalMySelenium.g:294:4: rule__AssertableElement__Alternatives
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
    // InternalMySelenium.g:303:1: entryRuleNavigationAction : ruleNavigationAction EOF ;
    public final void entryRuleNavigationAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:304:1: ( ruleNavigationAction EOF )
            // InternalMySelenium.g:305:1: ruleNavigationAction EOF
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
    // InternalMySelenium.g:312:1: ruleNavigationAction : ( ( rule__NavigationAction__Group__0 ) ) ;
    public final void ruleNavigationAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:316:2: ( ( ( rule__NavigationAction__Group__0 ) ) )
            // InternalMySelenium.g:317:2: ( ( rule__NavigationAction__Group__0 ) )
            {
            // InternalMySelenium.g:317:2: ( ( rule__NavigationAction__Group__0 ) )
            // InternalMySelenium.g:318:3: ( rule__NavigationAction__Group__0 )
            {
             before(grammarAccess.getNavigationActionAccess().getGroup()); 
            // InternalMySelenium.g:319:3: ( rule__NavigationAction__Group__0 )
            // InternalMySelenium.g:319:4: rule__NavigationAction__Group__0
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
    // InternalMySelenium.g:328:1: entryRuleNavigationActionType : ruleNavigationActionType EOF ;
    public final void entryRuleNavigationActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:329:1: ( ruleNavigationActionType EOF )
            // InternalMySelenium.g:330:1: ruleNavigationActionType EOF
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
    // InternalMySelenium.g:337:1: ruleNavigationActionType : ( ( rule__NavigationActionType__Alternatives ) ) ;
    public final void ruleNavigationActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:341:2: ( ( ( rule__NavigationActionType__Alternatives ) ) )
            // InternalMySelenium.g:342:2: ( ( rule__NavigationActionType__Alternatives ) )
            {
            // InternalMySelenium.g:342:2: ( ( rule__NavigationActionType__Alternatives ) )
            // InternalMySelenium.g:343:3: ( rule__NavigationActionType__Alternatives )
            {
             before(grammarAccess.getNavigationActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:344:3: ( rule__NavigationActionType__Alternatives )
            // InternalMySelenium.g:344:4: rule__NavigationActionType__Alternatives
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
    // InternalMySelenium.g:353:1: entryRuleOneParameterAction : ruleOneParameterAction EOF ;
    public final void entryRuleOneParameterAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:354:1: ( ruleOneParameterAction EOF )
            // InternalMySelenium.g:355:1: ruleOneParameterAction EOF
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
    // InternalMySelenium.g:362:1: ruleOneParameterAction : ( ( rule__OneParameterAction__Group__0 ) ) ;
    public final void ruleOneParameterAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:366:2: ( ( ( rule__OneParameterAction__Group__0 ) ) )
            // InternalMySelenium.g:367:2: ( ( rule__OneParameterAction__Group__0 ) )
            {
            // InternalMySelenium.g:367:2: ( ( rule__OneParameterAction__Group__0 ) )
            // InternalMySelenium.g:368:3: ( rule__OneParameterAction__Group__0 )
            {
             before(grammarAccess.getOneParameterActionAccess().getGroup()); 
            // InternalMySelenium.g:369:3: ( rule__OneParameterAction__Group__0 )
            // InternalMySelenium.g:369:4: rule__OneParameterAction__Group__0
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
    // InternalMySelenium.g:378:1: entryRuleTwoParametersAction : ruleTwoParametersAction EOF ;
    public final void entryRuleTwoParametersAction() throws RecognitionException {
        try {
            // InternalMySelenium.g:379:1: ( ruleTwoParametersAction EOF )
            // InternalMySelenium.g:380:1: ruleTwoParametersAction EOF
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
    // InternalMySelenium.g:387:1: ruleTwoParametersAction : ( ( rule__TwoParametersAction__Group__0 ) ) ;
    public final void ruleTwoParametersAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:391:2: ( ( ( rule__TwoParametersAction__Group__0 ) ) )
            // InternalMySelenium.g:392:2: ( ( rule__TwoParametersAction__Group__0 ) )
            {
            // InternalMySelenium.g:392:2: ( ( rule__TwoParametersAction__Group__0 ) )
            // InternalMySelenium.g:393:3: ( rule__TwoParametersAction__Group__0 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getGroup()); 
            // InternalMySelenium.g:394:3: ( rule__TwoParametersAction__Group__0 )
            // InternalMySelenium.g:394:4: rule__TwoParametersAction__Group__0
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
    // InternalMySelenium.g:403:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalMySelenium.g:404:1: ( ruleSelector EOF )
            // InternalMySelenium.g:405:1: ruleSelector EOF
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
    // InternalMySelenium.g:412:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:416:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalMySelenium.g:417:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalMySelenium.g:417:2: ( ( rule__Selector__Group__0 ) )
            // InternalMySelenium.g:418:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalMySelenium.g:419:3: ( rule__Selector__Group__0 )
            // InternalMySelenium.g:419:4: rule__Selector__Group__0
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
    // InternalMySelenium.g:428:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalMySelenium.g:429:1: ( ruleAttributes EOF )
            // InternalMySelenium.g:430:1: ruleAttributes EOF
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
    // InternalMySelenium.g:437:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:441:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalMySelenium.g:442:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalMySelenium.g:442:2: ( ( rule__Attributes__Group__0 ) )
            // InternalMySelenium.g:443:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalMySelenium.g:444:3: ( rule__Attributes__Group__0 )
            // InternalMySelenium.g:444:4: rule__Attributes__Group__0
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
    // InternalMySelenium.g:453:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:454:1: ( ruleAttribute EOF )
            // InternalMySelenium.g:455:1: ruleAttribute EOF
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
    // InternalMySelenium.g:462:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:466:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMySelenium.g:467:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMySelenium.g:467:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMySelenium.g:468:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMySelenium.g:469:3: ( rule__Attribute__Group__0 )
            // InternalMySelenium.g:469:4: rule__Attribute__Group__0
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
    // InternalMySelenium.g:478:1: entryRuleDOMAttribute : ruleDOMAttribute EOF ;
    public final void entryRuleDOMAttribute() throws RecognitionException {
        try {
            // InternalMySelenium.g:479:1: ( ruleDOMAttribute EOF )
            // InternalMySelenium.g:480:1: ruleDOMAttribute EOF
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
    // InternalMySelenium.g:487:1: ruleDOMAttribute : ( ( rule__DOMAttribute__Alternatives ) ) ;
    public final void ruleDOMAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:491:2: ( ( ( rule__DOMAttribute__Alternatives ) ) )
            // InternalMySelenium.g:492:2: ( ( rule__DOMAttribute__Alternatives ) )
            {
            // InternalMySelenium.g:492:2: ( ( rule__DOMAttribute__Alternatives ) )
            // InternalMySelenium.g:493:3: ( rule__DOMAttribute__Alternatives )
            {
             before(grammarAccess.getDOMAttributeAccess().getAlternatives()); 
            // InternalMySelenium.g:494:3: ( rule__DOMAttribute__Alternatives )
            // InternalMySelenium.g:494:4: rule__DOMAttribute__Alternatives
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
    // InternalMySelenium.g:503:1: entryRuleDOMElement : ruleDOMElement EOF ;
    public final void entryRuleDOMElement() throws RecognitionException {
        try {
            // InternalMySelenium.g:504:1: ( ruleDOMElement EOF )
            // InternalMySelenium.g:505:1: ruleDOMElement EOF
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
    // InternalMySelenium.g:512:1: ruleDOMElement : ( ( rule__DOMElement__Alternatives ) ) ;
    public final void ruleDOMElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:516:2: ( ( ( rule__DOMElement__Alternatives ) ) )
            // InternalMySelenium.g:517:2: ( ( rule__DOMElement__Alternatives ) )
            {
            // InternalMySelenium.g:517:2: ( ( rule__DOMElement__Alternatives ) )
            // InternalMySelenium.g:518:3: ( rule__DOMElement__Alternatives )
            {
             before(grammarAccess.getDOMElementAccess().getAlternatives()); 
            // InternalMySelenium.g:519:3: ( rule__DOMElement__Alternatives )
            // InternalMySelenium.g:519:4: rule__DOMElement__Alternatives
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
    // InternalMySelenium.g:528:1: entryRuleOneParameterActionType : ruleOneParameterActionType EOF ;
    public final void entryRuleOneParameterActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:529:1: ( ruleOneParameterActionType EOF )
            // InternalMySelenium.g:530:1: ruleOneParameterActionType EOF
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
    // InternalMySelenium.g:537:1: ruleOneParameterActionType : ( 'click' ) ;
    public final void ruleOneParameterActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:541:2: ( ( 'click' ) )
            // InternalMySelenium.g:542:2: ( 'click' )
            {
            // InternalMySelenium.g:542:2: ( 'click' )
            // InternalMySelenium.g:543:3: 'click'
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
    // InternalMySelenium.g:553:1: entryRuleTwoParametersActionType : ruleTwoParametersActionType EOF ;
    public final void entryRuleTwoParametersActionType() throws RecognitionException {
        try {
            // InternalMySelenium.g:554:1: ( ruleTwoParametersActionType EOF )
            // InternalMySelenium.g:555:1: ruleTwoParametersActionType EOF
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
    // InternalMySelenium.g:562:1: ruleTwoParametersActionType : ( ( rule__TwoParametersActionType__Alternatives ) ) ;
    public final void ruleTwoParametersActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:566:2: ( ( ( rule__TwoParametersActionType__Alternatives ) ) )
            // InternalMySelenium.g:567:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            {
            // InternalMySelenium.g:567:2: ( ( rule__TwoParametersActionType__Alternatives ) )
            // InternalMySelenium.g:568:3: ( rule__TwoParametersActionType__Alternatives )
            {
             before(grammarAccess.getTwoParametersActionTypeAccess().getAlternatives()); 
            // InternalMySelenium.g:569:3: ( rule__TwoParametersActionType__Alternatives )
            // InternalMySelenium.g:569:4: rule__TwoParametersActionType__Alternatives
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
    // InternalMySelenium.g:578:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:579:1: ( ruleFunctionParameters EOF )
            // InternalMySelenium.g:580:1: ruleFunctionParameters EOF
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
    // InternalMySelenium.g:587:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Group__0 ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:591:2: ( ( ( rule__FunctionParameters__Group__0 ) ) )
            // InternalMySelenium.g:592:2: ( ( rule__FunctionParameters__Group__0 ) )
            {
            // InternalMySelenium.g:592:2: ( ( rule__FunctionParameters__Group__0 ) )
            // InternalMySelenium.g:593:3: ( rule__FunctionParameters__Group__0 )
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup()); 
            // InternalMySelenium.g:594:3: ( rule__FunctionParameters__Group__0 )
            // InternalMySelenium.g:594:4: rule__FunctionParameters__Group__0
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
    // InternalMySelenium.g:603:1: entryRuleFunctionCallParameters : ruleFunctionCallParameters EOF ;
    public final void entryRuleFunctionCallParameters() throws RecognitionException {
        try {
            // InternalMySelenium.g:604:1: ( ruleFunctionCallParameters EOF )
            // InternalMySelenium.g:605:1: ruleFunctionCallParameters EOF
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
    // InternalMySelenium.g:612:1: ruleFunctionCallParameters : ( ( rule__FunctionCallParameters__Group__0 ) ) ;
    public final void ruleFunctionCallParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:616:2: ( ( ( rule__FunctionCallParameters__Group__0 ) ) )
            // InternalMySelenium.g:617:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            {
            // InternalMySelenium.g:617:2: ( ( rule__FunctionCallParameters__Group__0 ) )
            // InternalMySelenium.g:618:3: ( rule__FunctionCallParameters__Group__0 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup()); 
            // InternalMySelenium.g:619:3: ( rule__FunctionCallParameters__Group__0 )
            // InternalMySelenium.g:619:4: rule__FunctionCallParameters__Group__0
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
    // InternalMySelenium.g:628:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalMySelenium.g:629:1: ( ruleVariableCall EOF )
            // InternalMySelenium.g:630:1: ruleVariableCall EOF
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
    // InternalMySelenium.g:637:1: ruleVariableCall : ( ( rule__VariableCall__Alternatives ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:641:2: ( ( ( rule__VariableCall__Alternatives ) ) )
            // InternalMySelenium.g:642:2: ( ( rule__VariableCall__Alternatives ) )
            {
            // InternalMySelenium.g:642:2: ( ( rule__VariableCall__Alternatives ) )
            // InternalMySelenium.g:643:3: ( rule__VariableCall__Alternatives )
            {
             before(grammarAccess.getVariableCallAccess().getAlternatives()); 
            // InternalMySelenium.g:644:3: ( rule__VariableCall__Alternatives )
            // InternalMySelenium.g:644:4: rule__VariableCall__Alternatives
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
    // InternalMySelenium.g:653:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMySelenium.g:654:1: ( ruleVariable EOF )
            // InternalMySelenium.g:655:1: ruleVariable EOF
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
    // InternalMySelenium.g:662:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:666:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalMySelenium.g:667:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalMySelenium.g:667:2: ( ( rule__Variable__NameAssignment ) )
            // InternalMySelenium.g:668:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalMySelenium.g:669:3: ( rule__Variable__NameAssignment )
            // InternalMySelenium.g:669:4: rule__Variable__NameAssignment
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


    // $ANTLR start "entryRuleComment"
    // InternalMySelenium.g:678:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalMySelenium.g:679:1: ( ruleComment EOF )
            // InternalMySelenium.g:680:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalMySelenium.g:687:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:691:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalMySelenium.g:692:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalMySelenium.g:692:2: ( ( rule__Comment__Group__0 ) )
            // InternalMySelenium.g:693:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalMySelenium.g:694:3: ( rule__Comment__Group__0 )
            // InternalMySelenium.g:694:4: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "rule__ProjectionAction__Alternatives"
    // InternalMySelenium.g:702:1: rule__ProjectionAction__Alternatives : ( ( 'value' ) | ( 'text' ) | ( 'html' ) );
    public final void rule__ProjectionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:706:1: ( ( 'value' ) | ( 'text' ) | ( 'html' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMySelenium.g:707:2: ( 'value' )
                    {
                    // InternalMySelenium.g:707:2: ( 'value' )
                    // InternalMySelenium.g:708:3: 'value'
                    {
                     before(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getValueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:713:2: ( 'text' )
                    {
                    // InternalMySelenium.g:713:2: ( 'text' )
                    // InternalMySelenium.g:714:3: 'text'
                    {
                     before(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProjectionActionAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:719:2: ( 'html' )
                    {
                    // InternalMySelenium.g:719:2: ( 'html' )
                    // InternalMySelenium.g:720:3: 'html'
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMySelenium.g:729:1: rule__Statement__Alternatives : ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) | ( ruleComment ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:733:1: ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) | ( ruleComment ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMySelenium.g:734:2: ( ruleOneParameterAction )
                    {
                    // InternalMySelenium.g:734:2: ( ruleOneParameterAction )
                    // InternalMySelenium.g:735:3: ruleOneParameterAction
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
                    // InternalMySelenium.g:740:2: ( ruleTwoParametersAction )
                    {
                    // InternalMySelenium.g:740:2: ( ruleTwoParametersAction )
                    // InternalMySelenium.g:741:3: ruleTwoParametersAction
                    {
                     before(grammarAccess.getStatementAccess().getTwoParametersActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTwoParametersAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTwoParametersActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:746:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:746:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:747:3: ruleFunctionCall
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
                    // InternalMySelenium.g:752:2: ( ruleAssertEquals )
                    {
                    // InternalMySelenium.g:752:2: ( ruleAssertEquals )
                    // InternalMySelenium.g:753:3: ruleAssertEquals
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
                    // InternalMySelenium.g:758:2: ( ruleAssertContains )
                    {
                    // InternalMySelenium.g:758:2: ( ruleAssertContains )
                    // InternalMySelenium.g:759:3: ruleAssertContains
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
                    // InternalMySelenium.g:764:2: ( ruleNavigationAction )
                    {
                    // InternalMySelenium.g:764:2: ( ruleNavigationAction )
                    // InternalMySelenium.g:765:3: ruleNavigationAction
                    {
                     before(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNavigationActionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:770:2: ( ruleComment )
                    {
                    // InternalMySelenium.g:770:2: ( ruleComment )
                    // InternalMySelenium.g:771:3: ruleComment
                    {
                     before(grammarAccess.getStatementAccess().getCommentParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCommentParserRuleCall_6()); 

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
    // InternalMySelenium.g:780:1: rule__AssertableElement__Alternatives : ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) );
    public final void rule__AssertableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:784:1: ( ( ruleVariable ) | ( RULE_STRING ) | ( ruleProjection ) | ( ruleFunctionCall ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==44) ) {
                    alt3=4;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==11||(LA3_1>=15 && LA3_1<=16)||(LA3_1>=30 && LA3_1<=32)||LA3_1==35||(LA3_1>=37 && LA3_1<=39)||LA3_1==46) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
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
                    // InternalMySelenium.g:785:2: ( ruleVariable )
                    {
                    // InternalMySelenium.g:785:2: ( ruleVariable )
                    // InternalMySelenium.g:786:3: ruleVariable
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
                    // InternalMySelenium.g:791:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:791:2: ( RULE_STRING )
                    // InternalMySelenium.g:792:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertableElementAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:797:2: ( ruleProjection )
                    {
                    // InternalMySelenium.g:797:2: ( ruleProjection )
                    // InternalMySelenium.g:798:3: ruleProjection
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
                    // InternalMySelenium.g:803:2: ( ruleFunctionCall )
                    {
                    // InternalMySelenium.g:803:2: ( ruleFunctionCall )
                    // InternalMySelenium.g:804:3: ruleFunctionCall
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
    // InternalMySelenium.g:813:1: rule__NavigationActionType__Alternatives : ( ( 'go' ) | ( 'openBrowser' ) );
    public final void rule__NavigationActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:817:1: ( ( 'go' ) | ( 'openBrowser' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMySelenium.g:818:2: ( 'go' )
                    {
                    // InternalMySelenium.g:818:2: ( 'go' )
                    // InternalMySelenium.g:819:3: 'go'
                    {
                     before(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNavigationActionTypeAccess().getGoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:824:2: ( 'openBrowser' )
                    {
                    // InternalMySelenium.g:824:2: ( 'openBrowser' )
                    // InternalMySelenium.g:825:3: 'openBrowser'
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


    // $ANTLR start "rule__TwoParametersAction__ParameterAlternatives_2_0"
    // InternalMySelenium.g:834:1: rule__TwoParametersAction__ParameterAlternatives_2_0 : ( ( ruleSelector ) | ( ruleVariable ) );
    public final void rule__TwoParametersAction__ParameterAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:838:1: ( ( ruleSelector ) | ( ruleVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=29)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMySelenium.g:839:2: ( ruleSelector )
                    {
                    // InternalMySelenium.g:839:2: ( ruleSelector )
                    // InternalMySelenium.g:840:3: ruleSelector
                    {
                     before(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelector();

                    state._fsp--;

                     after(grammarAccess.getTwoParametersActionAccess().getParameterSelectorParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:845:2: ( ruleVariable )
                    {
                    // InternalMySelenium.g:845:2: ( ruleVariable )
                    // InternalMySelenium.g:846:3: ruleVariable
                    {
                     before(grammarAccess.getTwoParametersActionAccess().getParameterVariableParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getTwoParametersActionAccess().getParameterVariableParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__TwoParametersAction__ParameterAlternatives_2_0"


    // $ANTLR start "rule__Attribute__Alternatives_2"
    // InternalMySelenium.g:855:1: rule__Attribute__Alternatives_2 : ( ( RULE_STRING ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) );
    public final void rule__Attribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:859:1: ( ( RULE_STRING ) | ( ( rule__Attribute__ValAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMySelenium.g:860:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:860:2: ( RULE_STRING )
                    // InternalMySelenium.g:861:3: RULE_STRING
                    {
                     before(grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall_2_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:866:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    {
                    // InternalMySelenium.g:866:2: ( ( rule__Attribute__ValAssignment_2_1 ) )
                    // InternalMySelenium.g:867:3: ( rule__Attribute__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getValAssignment_2_1()); 
                    // InternalMySelenium.g:868:3: ( rule__Attribute__ValAssignment_2_1 )
                    // InternalMySelenium.g:868:4: rule__Attribute__ValAssignment_2_1
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
    // InternalMySelenium.g:876:1: rule__DOMAttribute__Alternatives : ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) );
    public final void rule__DOMAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:880:1: ( ( 'name' ) | ( 'text' ) | ( 'alt' ) | ( 'checked' ) | ( 'class' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMySelenium.g:881:2: ( 'name' )
                    {
                    // InternalMySelenium.g:881:2: ( 'name' )
                    // InternalMySelenium.g:882:3: 'name'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:887:2: ( 'text' )
                    {
                    // InternalMySelenium.g:887:2: ( 'text' )
                    // InternalMySelenium.g:888:3: 'text'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:893:2: ( 'alt' )
                    {
                    // InternalMySelenium.g:893:2: ( 'alt' )
                    // InternalMySelenium.g:894:3: 'alt'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:899:2: ( 'checked' )
                    {
                    // InternalMySelenium.g:899:2: ( 'checked' )
                    // InternalMySelenium.g:900:3: 'checked'
                    {
                     before(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDOMAttributeAccess().getCheckedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:905:2: ( 'class' )
                    {
                    // InternalMySelenium.g:905:2: ( 'class' )
                    // InternalMySelenium.g:906:3: 'class'
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
    // InternalMySelenium.g:915:1: rule__DOMElement__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) );
    public final void rule__DOMElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:919:1: ( ( 'link' ) | ( 'button' ) | ( 'checkbox' ) | ( 'input' ) | ( 'h1' ) | ( 'body' ) | ( 'select' ) | ( 'a' ) | ( 'img' ) )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            case 28:
                {
                alt8=8;
                }
                break;
            case 29:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMySelenium.g:920:2: ( 'link' )
                    {
                    // InternalMySelenium.g:920:2: ( 'link' )
                    // InternalMySelenium.g:921:3: 'link'
                    {
                     before(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:926:2: ( 'button' )
                    {
                    // InternalMySelenium.g:926:2: ( 'button' )
                    // InternalMySelenium.g:927:3: 'button'
                    {
                     before(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:932:2: ( 'checkbox' )
                    {
                    // InternalMySelenium.g:932:2: ( 'checkbox' )
                    // InternalMySelenium.g:933:3: 'checkbox'
                    {
                     before(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMySelenium.g:938:2: ( 'input' )
                    {
                    // InternalMySelenium.g:938:2: ( 'input' )
                    // InternalMySelenium.g:939:3: 'input'
                    {
                     before(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMySelenium.g:944:2: ( 'h1' )
                    {
                    // InternalMySelenium.g:944:2: ( 'h1' )
                    // InternalMySelenium.g:945:3: 'h1'
                    {
                     before(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getH1Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMySelenium.g:950:2: ( 'body' )
                    {
                    // InternalMySelenium.g:950:2: ( 'body' )
                    // InternalMySelenium.g:951:3: 'body'
                    {
                     before(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getBodyKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMySelenium.g:956:2: ( 'select' )
                    {
                    // InternalMySelenium.g:956:2: ( 'select' )
                    // InternalMySelenium.g:957:3: 'select'
                    {
                     before(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getSelectKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMySelenium.g:962:2: ( 'a' )
                    {
                    // InternalMySelenium.g:962:2: ( 'a' )
                    // InternalMySelenium.g:963:3: 'a'
                    {
                     before(grammarAccess.getDOMElementAccess().getAKeyword_7()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDOMElementAccess().getAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMySelenium.g:968:2: ( 'img' )
                    {
                    // InternalMySelenium.g:968:2: ( 'img' )
                    // InternalMySelenium.g:969:3: 'img'
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
    // InternalMySelenium.g:978:1: rule__TwoParametersActionType__Alternatives : ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) );
    public final void rule__TwoParametersActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:982:1: ( ( 'assign' ) | ( 'fill' ) | ( 'choose' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMySelenium.g:983:2: ( 'assign' )
                    {
                    // InternalMySelenium.g:983:2: ( 'assign' )
                    // InternalMySelenium.g:984:3: 'assign'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getAssignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMySelenium.g:989:2: ( 'fill' )
                    {
                    // InternalMySelenium.g:989:2: ( 'fill' )
                    // InternalMySelenium.g:990:3: 'fill'
                    {
                     before(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTwoParametersActionTypeAccess().getFillKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMySelenium.g:995:2: ( 'choose' )
                    {
                    // InternalMySelenium.g:995:2: ( 'choose' )
                    // InternalMySelenium.g:996:3: 'choose'
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
    // InternalMySelenium.g:1005:1: rule__VariableCall__Alternatives : ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) );
    public final void rule__VariableCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1009:1: ( ( ( rule__VariableCall__NameAssignment_0 ) ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMySelenium.g:1010:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    {
                    // InternalMySelenium.g:1010:2: ( ( rule__VariableCall__NameAssignment_0 ) )
                    // InternalMySelenium.g:1011:3: ( rule__VariableCall__NameAssignment_0 )
                    {
                     before(grammarAccess.getVariableCallAccess().getNameAssignment_0()); 
                    // InternalMySelenium.g:1012:3: ( rule__VariableCall__NameAssignment_0 )
                    // InternalMySelenium.g:1012:4: rule__VariableCall__NameAssignment_0
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
                    // InternalMySelenium.g:1016:2: ( RULE_STRING )
                    {
                    // InternalMySelenium.g:1016:2: ( RULE_STRING )
                    // InternalMySelenium.g:1017:3: RULE_STRING
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalMySelenium.g:1026:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1030:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMySelenium.g:1031:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMySelenium.g:1038:1: rule__Program__Group__0__Impl : ( ( ruleComment )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1042:1: ( ( ( ruleComment )* ) )
            // InternalMySelenium.g:1043:1: ( ( ruleComment )* )
            {
            // InternalMySelenium.g:1043:1: ( ( ruleComment )* )
            // InternalMySelenium.g:1044:2: ( ruleComment )*
            {
             before(grammarAccess.getProgramAccess().getCommentParserRuleCall_0()); 
            // InternalMySelenium.g:1045:2: ( ruleComment )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMySelenium.g:1045:3: ruleComment
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleComment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getCommentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMySelenium.g:1053:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1057:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMySelenium.g:1058:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMySelenium.g:1065:1: rule__Program__Group__1__Impl : ( ( ( rule__Program__FunctionsAssignment_1 ) ) ( ( rule__Program__FunctionsAssignment_1 )* ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1069:1: ( ( ( ( rule__Program__FunctionsAssignment_1 ) ) ( ( rule__Program__FunctionsAssignment_1 )* ) ) )
            // InternalMySelenium.g:1070:1: ( ( ( rule__Program__FunctionsAssignment_1 ) ) ( ( rule__Program__FunctionsAssignment_1 )* ) )
            {
            // InternalMySelenium.g:1070:1: ( ( ( rule__Program__FunctionsAssignment_1 ) ) ( ( rule__Program__FunctionsAssignment_1 )* ) )
            // InternalMySelenium.g:1071:2: ( ( rule__Program__FunctionsAssignment_1 ) ) ( ( rule__Program__FunctionsAssignment_1 )* )
            {
            // InternalMySelenium.g:1071:2: ( ( rule__Program__FunctionsAssignment_1 ) )
            // InternalMySelenium.g:1072:3: ( rule__Program__FunctionsAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_1()); 
            // InternalMySelenium.g:1073:3: ( rule__Program__FunctionsAssignment_1 )
            // InternalMySelenium.g:1073:4: rule__Program__FunctionsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Program__FunctionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_1()); 

            }

            // InternalMySelenium.g:1076:2: ( ( rule__Program__FunctionsAssignment_1 )* )
            // InternalMySelenium.g:1077:3: ( rule__Program__FunctionsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_1()); 
            // InternalMySelenium.g:1078:3: ( rule__Program__FunctionsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMySelenium.g:1078:4: rule__Program__FunctionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Program__FunctionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMySelenium.g:1087:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1091:1: ( rule__Program__Group__2__Impl )
            // InternalMySelenium.g:1092:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMySelenium.g:1098:1: rule__Program__Group__2__Impl : ( ( ruleComment )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1102:1: ( ( ( ruleComment )* ) )
            // InternalMySelenium.g:1103:1: ( ( ruleComment )* )
            {
            // InternalMySelenium.g:1103:1: ( ( ruleComment )* )
            // InternalMySelenium.g:1104:2: ( ruleComment )*
            {
             before(grammarAccess.getProgramAccess().getCommentParserRuleCall_2()); 
            // InternalMySelenium.g:1105:2: ( ruleComment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMySelenium.g:1105:3: ruleComment
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleComment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getCommentParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMySelenium.g:1114:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1118:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMySelenium.g:1119:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMySelenium.g:1126:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1130:1: ( ( 'def' ) )
            // InternalMySelenium.g:1131:1: ( 'def' )
            {
            // InternalMySelenium.g:1131:1: ( 'def' )
            // InternalMySelenium.g:1132:2: 'def'
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
    // InternalMySelenium.g:1141:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1145:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMySelenium.g:1146:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMySelenium.g:1153:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1157:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMySelenium.g:1158:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMySelenium.g:1158:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMySelenium.g:1159:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMySelenium.g:1160:2: ( rule__Function__NameAssignment_1 )
            // InternalMySelenium.g:1160:3: rule__Function__NameAssignment_1
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
    // InternalMySelenium.g:1168:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1172:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMySelenium.g:1173:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMySelenium.g:1180:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1184:1: ( ( ( rule__Function__ParamsAssignment_2 )* ) )
            // InternalMySelenium.g:1185:1: ( ( rule__Function__ParamsAssignment_2 )* )
            {
            // InternalMySelenium.g:1185:1: ( ( rule__Function__ParamsAssignment_2 )* )
            // InternalMySelenium.g:1186:2: ( rule__Function__ParamsAssignment_2 )*
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalMySelenium.g:1187:2: ( rule__Function__ParamsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMySelenium.g:1187:3: rule__Function__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Function__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMySelenium.g:1195:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1199:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMySelenium.g:1200:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMySelenium.g:1207:1: rule__Function__Group__3__Impl : ( '{' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1211:1: ( ( '{' ) )
            // InternalMySelenium.g:1212:1: ( '{' )
            {
            // InternalMySelenium.g:1212:1: ( '{' )
            // InternalMySelenium.g:1213:2: '{'
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
    // InternalMySelenium.g:1222:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1226:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMySelenium.g:1227:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMySelenium.g:1234:1: rule__Function__Group__4__Impl : ( ( rule__Function__StatementsAssignment_4 )* ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1238:1: ( ( ( rule__Function__StatementsAssignment_4 )* ) )
            // InternalMySelenium.g:1239:1: ( ( rule__Function__StatementsAssignment_4 )* )
            {
            // InternalMySelenium.g:1239:1: ( ( rule__Function__StatementsAssignment_4 )* )
            // InternalMySelenium.g:1240:2: ( rule__Function__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFunctionAccess().getStatementsAssignment_4()); 
            // InternalMySelenium.g:1241:2: ( rule__Function__StatementsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==11||(LA15_0>=15 && LA15_0<=16)||(LA15_0>=30 && LA15_0<=32)||LA15_0==37||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMySelenium.g:1241:3: rule__Function__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Function__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMySelenium.g:1249:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1253:1: ( rule__Function__Group__5__Impl )
            // InternalMySelenium.g:1254:2: rule__Function__Group__5__Impl
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
    // InternalMySelenium.g:1260:1: rule__Function__Group__5__Impl : ( '}' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1264:1: ( ( '}' ) )
            // InternalMySelenium.g:1265:1: ( '}' )
            {
            // InternalMySelenium.g:1265:1: ( '}' )
            // InternalMySelenium.g:1266:2: '}'
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
    // InternalMySelenium.g:1276:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1280:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMySelenium.g:1281:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalMySelenium.g:1288:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__RefAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1292:1: ( ( ( rule__FunctionCall__RefAssignment_0 ) ) )
            // InternalMySelenium.g:1293:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            {
            // InternalMySelenium.g:1293:1: ( ( rule__FunctionCall__RefAssignment_0 ) )
            // InternalMySelenium.g:1294:2: ( rule__FunctionCall__RefAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getRefAssignment_0()); 
            // InternalMySelenium.g:1295:2: ( rule__FunctionCall__RefAssignment_0 )
            // InternalMySelenium.g:1295:3: rule__FunctionCall__RefAssignment_0
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
    // InternalMySelenium.g:1303:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1307:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMySelenium.g:1308:2: rule__FunctionCall__Group__1__Impl
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
    // InternalMySelenium.g:1314:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__ParamsAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1318:1: ( ( ( rule__FunctionCall__ParamsAssignment_1 ) ) )
            // InternalMySelenium.g:1319:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            {
            // InternalMySelenium.g:1319:1: ( ( rule__FunctionCall__ParamsAssignment_1 ) )
            // InternalMySelenium.g:1320:2: ( rule__FunctionCall__ParamsAssignment_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParamsAssignment_1()); 
            // InternalMySelenium.g:1321:2: ( rule__FunctionCall__ParamsAssignment_1 )
            // InternalMySelenium.g:1321:3: rule__FunctionCall__ParamsAssignment_1
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
    // InternalMySelenium.g:1330:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1334:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // InternalMySelenium.g:1335:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
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
    // InternalMySelenium.g:1342:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__SelectorAssignment_0 ) ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1346:1: ( ( ( rule__Projection__SelectorAssignment_0 ) ) )
            // InternalMySelenium.g:1347:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            {
            // InternalMySelenium.g:1347:1: ( ( rule__Projection__SelectorAssignment_0 ) )
            // InternalMySelenium.g:1348:2: ( rule__Projection__SelectorAssignment_0 )
            {
             before(grammarAccess.getProjectionAccess().getSelectorAssignment_0()); 
            // InternalMySelenium.g:1349:2: ( rule__Projection__SelectorAssignment_0 )
            // InternalMySelenium.g:1349:3: rule__Projection__SelectorAssignment_0
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
    // InternalMySelenium.g:1357:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1361:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // InternalMySelenium.g:1362:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
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
    // InternalMySelenium.g:1369:1: rule__Projection__Group__1__Impl : ( '.' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1373:1: ( ( '.' ) )
            // InternalMySelenium.g:1374:1: ( '.' )
            {
            // InternalMySelenium.g:1374:1: ( '.' )
            // InternalMySelenium.g:1375:2: '.'
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
    // InternalMySelenium.g:1384:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1388:1: ( rule__Projection__Group__2__Impl )
            // InternalMySelenium.g:1389:2: rule__Projection__Group__2__Impl
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
    // InternalMySelenium.g:1395:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__ProjectionActionAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1399:1: ( ( ( rule__Projection__ProjectionActionAssignment_2 ) ) )
            // InternalMySelenium.g:1400:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            {
            // InternalMySelenium.g:1400:1: ( ( rule__Projection__ProjectionActionAssignment_2 ) )
            // InternalMySelenium.g:1401:2: ( rule__Projection__ProjectionActionAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getProjectionActionAssignment_2()); 
            // InternalMySelenium.g:1402:2: ( rule__Projection__ProjectionActionAssignment_2 )
            // InternalMySelenium.g:1402:3: rule__Projection__ProjectionActionAssignment_2
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
    // InternalMySelenium.g:1411:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1415:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalMySelenium.g:1416:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
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
    // InternalMySelenium.g:1423:1: rule__AssertEquals__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1427:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1428:1: ( 'assert' )
            {
            // InternalMySelenium.g:1428:1: ( 'assert' )
            // InternalMySelenium.g:1429:2: 'assert'
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
    // InternalMySelenium.g:1438:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1442:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalMySelenium.g:1443:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
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
    // InternalMySelenium.g:1450:1: rule__AssertEquals__Group__1__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1454:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_1 ) ) )
            // InternalMySelenium.g:1455:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            {
            // InternalMySelenium.g:1455:1: ( ( rule__AssertEquals__AssertableElementAssignment_1 ) )
            // InternalMySelenium.g:1456:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_1()); 
            // InternalMySelenium.g:1457:2: ( rule__AssertEquals__AssertableElementAssignment_1 )
            // InternalMySelenium.g:1457:3: rule__AssertEquals__AssertableElementAssignment_1
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
    // InternalMySelenium.g:1465:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1469:1: ( rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3 )
            // InternalMySelenium.g:1470:2: rule__AssertEquals__Group__2__Impl rule__AssertEquals__Group__3
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
    // InternalMySelenium.g:1477:1: rule__AssertEquals__Group__2__Impl : ( '=' ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1481:1: ( ( '=' ) )
            // InternalMySelenium.g:1482:1: ( '=' )
            {
            // InternalMySelenium.g:1482:1: ( '=' )
            // InternalMySelenium.g:1483:2: '='
            {
             before(grammarAccess.getAssertEqualsAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMySelenium.g:1492:1: rule__AssertEquals__Group__3 : rule__AssertEquals__Group__3__Impl ;
    public final void rule__AssertEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1496:1: ( rule__AssertEquals__Group__3__Impl )
            // InternalMySelenium.g:1497:2: rule__AssertEquals__Group__3__Impl
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
    // InternalMySelenium.g:1503:1: rule__AssertEquals__Group__3__Impl : ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) ;
    public final void rule__AssertEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1507:1: ( ( ( rule__AssertEquals__AssertableElementAssignment_3 ) ) )
            // InternalMySelenium.g:1508:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1508:1: ( ( rule__AssertEquals__AssertableElementAssignment_3 ) )
            // InternalMySelenium.g:1509:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            {
             before(grammarAccess.getAssertEqualsAccess().getAssertableElementAssignment_3()); 
            // InternalMySelenium.g:1510:2: ( rule__AssertEquals__AssertableElementAssignment_3 )
            // InternalMySelenium.g:1510:3: rule__AssertEquals__AssertableElementAssignment_3
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
    // InternalMySelenium.g:1519:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1523:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalMySelenium.g:1524:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
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
    // InternalMySelenium.g:1531:1: rule__AssertContains__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1535:1: ( ( 'assert' ) )
            // InternalMySelenium.g:1536:1: ( 'assert' )
            {
            // InternalMySelenium.g:1536:1: ( 'assert' )
            // InternalMySelenium.g:1537:2: 'assert'
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
    // InternalMySelenium.g:1546:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1550:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalMySelenium.g:1551:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
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
    // InternalMySelenium.g:1558:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__ContainerAssignment_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1562:1: ( ( ( rule__AssertContains__ContainerAssignment_1 ) ) )
            // InternalMySelenium.g:1563:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            {
            // InternalMySelenium.g:1563:1: ( ( rule__AssertContains__ContainerAssignment_1 ) )
            // InternalMySelenium.g:1564:2: ( rule__AssertContains__ContainerAssignment_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getContainerAssignment_1()); 
            // InternalMySelenium.g:1565:2: ( rule__AssertContains__ContainerAssignment_1 )
            // InternalMySelenium.g:1565:3: rule__AssertContains__ContainerAssignment_1
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
    // InternalMySelenium.g:1573:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1577:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalMySelenium.g:1578:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
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
    // InternalMySelenium.g:1585:1: rule__AssertContains__Group__2__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1589:1: ( ( 'contains' ) )
            // InternalMySelenium.g:1590:1: ( 'contains' )
            {
            // InternalMySelenium.g:1590:1: ( 'contains' )
            // InternalMySelenium.g:1591:2: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getContainsKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMySelenium.g:1600:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1604:1: ( rule__AssertContains__Group__3__Impl )
            // InternalMySelenium.g:1605:2: rule__AssertContains__Group__3__Impl
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
    // InternalMySelenium.g:1611:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ElementAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1615:1: ( ( ( rule__AssertContains__ElementAssignment_3 ) ) )
            // InternalMySelenium.g:1616:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            {
            // InternalMySelenium.g:1616:1: ( ( rule__AssertContains__ElementAssignment_3 ) )
            // InternalMySelenium.g:1617:2: ( rule__AssertContains__ElementAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getElementAssignment_3()); 
            // InternalMySelenium.g:1618:2: ( rule__AssertContains__ElementAssignment_3 )
            // InternalMySelenium.g:1618:3: rule__AssertContains__ElementAssignment_3
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
    // InternalMySelenium.g:1627:1: rule__NavigationAction__Group__0 : rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 ;
    public final void rule__NavigationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1631:1: ( rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1 )
            // InternalMySelenium.g:1632:2: rule__NavigationAction__Group__0__Impl rule__NavigationAction__Group__1
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
    // InternalMySelenium.g:1639:1: rule__NavigationAction__Group__0__Impl : ( ( rule__NavigationAction__ActionAssignment_0 ) ) ;
    public final void rule__NavigationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1643:1: ( ( ( rule__NavigationAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1644:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1644:1: ( ( rule__NavigationAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1645:2: ( rule__NavigationAction__ActionAssignment_0 )
            {
             before(grammarAccess.getNavigationActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1646:2: ( rule__NavigationAction__ActionAssignment_0 )
            // InternalMySelenium.g:1646:3: rule__NavigationAction__ActionAssignment_0
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
    // InternalMySelenium.g:1654:1: rule__NavigationAction__Group__1 : rule__NavigationAction__Group__1__Impl ;
    public final void rule__NavigationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1658:1: ( rule__NavigationAction__Group__1__Impl )
            // InternalMySelenium.g:1659:2: rule__NavigationAction__Group__1__Impl
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
    // InternalMySelenium.g:1665:1: rule__NavigationAction__Group__1__Impl : ( ( rule__NavigationAction__ParamAssignment_1 ) ) ;
    public final void rule__NavigationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1669:1: ( ( ( rule__NavigationAction__ParamAssignment_1 ) ) )
            // InternalMySelenium.g:1670:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            {
            // InternalMySelenium.g:1670:1: ( ( rule__NavigationAction__ParamAssignment_1 ) )
            // InternalMySelenium.g:1671:2: ( rule__NavigationAction__ParamAssignment_1 )
            {
             before(grammarAccess.getNavigationActionAccess().getParamAssignment_1()); 
            // InternalMySelenium.g:1672:2: ( rule__NavigationAction__ParamAssignment_1 )
            // InternalMySelenium.g:1672:3: rule__NavigationAction__ParamAssignment_1
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
    // InternalMySelenium.g:1681:1: rule__OneParameterAction__Group__0 : rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 ;
    public final void rule__OneParameterAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1685:1: ( rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1 )
            // InternalMySelenium.g:1686:2: rule__OneParameterAction__Group__0__Impl rule__OneParameterAction__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMySelenium.g:1693:1: rule__OneParameterAction__Group__0__Impl : ( ( rule__OneParameterAction__ActionAssignment_0 ) ) ;
    public final void rule__OneParameterAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1697:1: ( ( ( rule__OneParameterAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1698:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1698:1: ( ( rule__OneParameterAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1699:2: ( rule__OneParameterAction__ActionAssignment_0 )
            {
             before(grammarAccess.getOneParameterActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1700:2: ( rule__OneParameterAction__ActionAssignment_0 )
            // InternalMySelenium.g:1700:3: rule__OneParameterAction__ActionAssignment_0
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
    // InternalMySelenium.g:1708:1: rule__OneParameterAction__Group__1 : rule__OneParameterAction__Group__1__Impl ;
    public final void rule__OneParameterAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1712:1: ( rule__OneParameterAction__Group__1__Impl )
            // InternalMySelenium.g:1713:2: rule__OneParameterAction__Group__1__Impl
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
    // InternalMySelenium.g:1719:1: rule__OneParameterAction__Group__1__Impl : ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) ;
    public final void rule__OneParameterAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1723:1: ( ( ( rule__OneParameterAction__SelectorAssignment_1 ) ) )
            // InternalMySelenium.g:1724:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            {
            // InternalMySelenium.g:1724:1: ( ( rule__OneParameterAction__SelectorAssignment_1 ) )
            // InternalMySelenium.g:1725:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getOneParameterActionAccess().getSelectorAssignment_1()); 
            // InternalMySelenium.g:1726:2: ( rule__OneParameterAction__SelectorAssignment_1 )
            // InternalMySelenium.g:1726:3: rule__OneParameterAction__SelectorAssignment_1
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
    // InternalMySelenium.g:1735:1: rule__TwoParametersAction__Group__0 : rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1 ;
    public final void rule__TwoParametersAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1739:1: ( rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1 )
            // InternalMySelenium.g:1740:2: rule__TwoParametersAction__Group__0__Impl rule__TwoParametersAction__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMySelenium.g:1747:1: rule__TwoParametersAction__Group__0__Impl : ( ( rule__TwoParametersAction__ActionAssignment_0 ) ) ;
    public final void rule__TwoParametersAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1751:1: ( ( ( rule__TwoParametersAction__ActionAssignment_0 ) ) )
            // InternalMySelenium.g:1752:1: ( ( rule__TwoParametersAction__ActionAssignment_0 ) )
            {
            // InternalMySelenium.g:1752:1: ( ( rule__TwoParametersAction__ActionAssignment_0 ) )
            // InternalMySelenium.g:1753:2: ( rule__TwoParametersAction__ActionAssignment_0 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getActionAssignment_0()); 
            // InternalMySelenium.g:1754:2: ( rule__TwoParametersAction__ActionAssignment_0 )
            // InternalMySelenium.g:1754:3: rule__TwoParametersAction__ActionAssignment_0
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
    // InternalMySelenium.g:1762:1: rule__TwoParametersAction__Group__1 : rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2 ;
    public final void rule__TwoParametersAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1766:1: ( rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2 )
            // InternalMySelenium.g:1767:2: rule__TwoParametersAction__Group__1__Impl rule__TwoParametersAction__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMySelenium.g:1774:1: rule__TwoParametersAction__Group__1__Impl : ( ( rule__TwoParametersAction__SelectorAssignment_1 ) ) ;
    public final void rule__TwoParametersAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1778:1: ( ( ( rule__TwoParametersAction__SelectorAssignment_1 ) ) )
            // InternalMySelenium.g:1779:1: ( ( rule__TwoParametersAction__SelectorAssignment_1 ) )
            {
            // InternalMySelenium.g:1779:1: ( ( rule__TwoParametersAction__SelectorAssignment_1 ) )
            // InternalMySelenium.g:1780:2: ( rule__TwoParametersAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getSelectorAssignment_1()); 
            // InternalMySelenium.g:1781:2: ( rule__TwoParametersAction__SelectorAssignment_1 )
            // InternalMySelenium.g:1781:3: rule__TwoParametersAction__SelectorAssignment_1
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
    // InternalMySelenium.g:1789:1: rule__TwoParametersAction__Group__2 : rule__TwoParametersAction__Group__2__Impl ;
    public final void rule__TwoParametersAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1793:1: ( rule__TwoParametersAction__Group__2__Impl )
            // InternalMySelenium.g:1794:2: rule__TwoParametersAction__Group__2__Impl
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
    // InternalMySelenium.g:1800:1: rule__TwoParametersAction__Group__2__Impl : ( ( rule__TwoParametersAction__ParameterAssignment_2 ) ) ;
    public final void rule__TwoParametersAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1804:1: ( ( ( rule__TwoParametersAction__ParameterAssignment_2 ) ) )
            // InternalMySelenium.g:1805:1: ( ( rule__TwoParametersAction__ParameterAssignment_2 ) )
            {
            // InternalMySelenium.g:1805:1: ( ( rule__TwoParametersAction__ParameterAssignment_2 ) )
            // InternalMySelenium.g:1806:2: ( rule__TwoParametersAction__ParameterAssignment_2 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getParameterAssignment_2()); 
            // InternalMySelenium.g:1807:2: ( rule__TwoParametersAction__ParameterAssignment_2 )
            // InternalMySelenium.g:1807:3: rule__TwoParametersAction__ParameterAssignment_2
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
    // InternalMySelenium.g:1816:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1820:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalMySelenium.g:1821:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMySelenium.g:1828:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__ElementAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1832:1: ( ( ( rule__Selector__ElementAssignment_0 ) ) )
            // InternalMySelenium.g:1833:1: ( ( rule__Selector__ElementAssignment_0 ) )
            {
            // InternalMySelenium.g:1833:1: ( ( rule__Selector__ElementAssignment_0 ) )
            // InternalMySelenium.g:1834:2: ( rule__Selector__ElementAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getElementAssignment_0()); 
            // InternalMySelenium.g:1835:2: ( rule__Selector__ElementAssignment_0 )
            // InternalMySelenium.g:1835:3: rule__Selector__ElementAssignment_0
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
    // InternalMySelenium.g:1843:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1847:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalMySelenium.g:1848:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMySelenium.g:1855:1: rule__Selector__Group__1__Impl : ( '[' ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1859:1: ( ( '[' ) )
            // InternalMySelenium.g:1860:1: ( '[' )
            {
            // InternalMySelenium.g:1860:1: ( '[' )
            // InternalMySelenium.g:1861:2: '['
            {
             before(grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMySelenium.g:1870:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1874:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalMySelenium.g:1875:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMySelenium.g:1882:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__AttrsAssignment_2 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1886:1: ( ( ( rule__Selector__AttrsAssignment_2 )? ) )
            // InternalMySelenium.g:1887:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            {
            // InternalMySelenium.g:1887:1: ( ( rule__Selector__AttrsAssignment_2 )? )
            // InternalMySelenium.g:1888:2: ( rule__Selector__AttrsAssignment_2 )?
            {
             before(grammarAccess.getSelectorAccess().getAttrsAssignment_2()); 
            // InternalMySelenium.g:1889:2: ( rule__Selector__AttrsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13||(LA16_0>=17 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMySelenium.g:1889:3: rule__Selector__AttrsAssignment_2
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
    // InternalMySelenium.g:1897:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1901:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalMySelenium.g:1902:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMySelenium.g:1909:1: rule__Selector__Group__3__Impl : ( ']' ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1913:1: ( ( ']' ) )
            // InternalMySelenium.g:1914:1: ( ']' )
            {
            // InternalMySelenium.g:1914:1: ( ']' )
            // InternalMySelenium.g:1915:2: ']'
            {
             before(grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMySelenium.g:1924:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1928:1: ( rule__Selector__Group__4__Impl )
            // InternalMySelenium.g:1929:2: rule__Selector__Group__4__Impl
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
    // InternalMySelenium.g:1935:1: rule__Selector__Group__4__Impl : ( ( '.all' )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1939:1: ( ( ( '.all' )? ) )
            // InternalMySelenium.g:1940:1: ( ( '.all' )? )
            {
            // InternalMySelenium.g:1940:1: ( ( '.all' )? )
            // InternalMySelenium.g:1941:2: ( '.all' )?
            {
             before(grammarAccess.getSelectorAccess().getAllKeyword_4()); 
            // InternalMySelenium.g:1942:2: ( '.all' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMySelenium.g:1942:3: '.all'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalMySelenium.g:1951:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1955:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalMySelenium.g:1956:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMySelenium.g:1963:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttrsAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1967:1: ( ( ( rule__Attributes__AttrsAssignment_0 ) ) )
            // InternalMySelenium.g:1968:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            {
            // InternalMySelenium.g:1968:1: ( ( rule__Attributes__AttrsAssignment_0 ) )
            // InternalMySelenium.g:1969:2: ( rule__Attributes__AttrsAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_0()); 
            // InternalMySelenium.g:1970:2: ( rule__Attributes__AttrsAssignment_0 )
            // InternalMySelenium.g:1970:3: rule__Attributes__AttrsAssignment_0
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
    // InternalMySelenium.g:1978:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1982:1: ( rule__Attributes__Group__1__Impl )
            // InternalMySelenium.g:1983:2: rule__Attributes__Group__1__Impl
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
    // InternalMySelenium.g:1989:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:1993:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalMySelenium.g:1994:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalMySelenium.g:1994:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalMySelenium.g:1995:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalMySelenium.g:1996:2: ( rule__Attributes__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMySelenium.g:1996:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMySelenium.g:2005:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2009:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalMySelenium.g:2010:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMySelenium.g:2017:1: rule__Attributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2021:1: ( ( ',' ) )
            // InternalMySelenium.g:2022:1: ( ',' )
            {
            // InternalMySelenium.g:2022:1: ( ',' )
            // InternalMySelenium.g:2023:2: ','
            {
             before(grammarAccess.getAttributesAccess().getCommaKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMySelenium.g:2032:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2036:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalMySelenium.g:2037:2: rule__Attributes__Group_1__1__Impl
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
    // InternalMySelenium.g:2043:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttrsAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2047:1: ( ( ( rule__Attributes__AttrsAssignment_1_1 ) ) )
            // InternalMySelenium.g:2048:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            {
            // InternalMySelenium.g:2048:1: ( ( rule__Attributes__AttrsAssignment_1_1 ) )
            // InternalMySelenium.g:2049:2: ( rule__Attributes__AttrsAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1_1()); 
            // InternalMySelenium.g:2050:2: ( rule__Attributes__AttrsAssignment_1_1 )
            // InternalMySelenium.g:2050:3: rule__Attributes__AttrsAssignment_1_1
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
    // InternalMySelenium.g:2059:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2063:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMySelenium.g:2064:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMySelenium.g:2071:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2075:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMySelenium.g:2076:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMySelenium.g:2076:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMySelenium.g:2077:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMySelenium.g:2078:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMySelenium.g:2078:3: rule__Attribute__NameAssignment_0
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
    // InternalMySelenium.g:2086:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2090:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMySelenium.g:2091:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMySelenium.g:2098:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2102:1: ( ( '=' ) )
            // InternalMySelenium.g:2103:1: ( '=' )
            {
            // InternalMySelenium.g:2103:1: ( '=' )
            // InternalMySelenium.g:2104:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMySelenium.g:2113:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2117:1: ( rule__Attribute__Group__2__Impl )
            // InternalMySelenium.g:2118:2: rule__Attribute__Group__2__Impl
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
    // InternalMySelenium.g:2124:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Alternatives_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2128:1: ( ( ( rule__Attribute__Alternatives_2 ) ) )
            // InternalMySelenium.g:2129:1: ( ( rule__Attribute__Alternatives_2 ) )
            {
            // InternalMySelenium.g:2129:1: ( ( rule__Attribute__Alternatives_2 ) )
            // InternalMySelenium.g:2130:2: ( rule__Attribute__Alternatives_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_2()); 
            // InternalMySelenium.g:2131:2: ( rule__Attribute__Alternatives_2 )
            // InternalMySelenium.g:2131:3: rule__Attribute__Alternatives_2
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
    // InternalMySelenium.g:2140:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2144:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // InternalMySelenium.g:2145:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMySelenium.g:2152:1: rule__FunctionParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2156:1: ( ( '(' ) )
            // InternalMySelenium.g:2157:1: ( '(' )
            {
            // InternalMySelenium.g:2157:1: ( '(' )
            // InternalMySelenium.g:2158:2: '('
            {
             before(grammarAccess.getFunctionParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMySelenium.g:2167:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2171:1: ( rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2 )
            // InternalMySelenium.g:2172:2: rule__FunctionParameters__Group__1__Impl rule__FunctionParameters__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMySelenium.g:2179:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2183:1: ( ( ( rule__FunctionParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2184:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2184:1: ( ( rule__FunctionParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2185:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2186:2: ( rule__FunctionParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2186:3: rule__FunctionParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2194:1: rule__FunctionParameters__Group__2 : rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 ;
    public final void rule__FunctionParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2198:1: ( rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3 )
            // InternalMySelenium.g:2199:2: rule__FunctionParameters__Group__2__Impl rule__FunctionParameters__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMySelenium.g:2206:1: rule__FunctionParameters__Group__2__Impl : ( ( rule__FunctionParameters__Group_2__0 )* ) ;
    public final void rule__FunctionParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2210:1: ( ( ( rule__FunctionParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2211:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2211:1: ( ( rule__FunctionParameters__Group_2__0 )* )
            // InternalMySelenium.g:2212:2: ( rule__FunctionParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2213:2: ( rule__FunctionParameters__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMySelenium.g:2213:3: rule__FunctionParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__FunctionParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMySelenium.g:2221:1: rule__FunctionParameters__Group__3 : rule__FunctionParameters__Group__3__Impl ;
    public final void rule__FunctionParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2225:1: ( rule__FunctionParameters__Group__3__Impl )
            // InternalMySelenium.g:2226:2: rule__FunctionParameters__Group__3__Impl
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
    // InternalMySelenium.g:2232:1: rule__FunctionParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2236:1: ( ( ')' ) )
            // InternalMySelenium.g:2237:1: ( ')' )
            {
            // InternalMySelenium.g:2237:1: ( ')' )
            // InternalMySelenium.g:2238:2: ')'
            {
             before(grammarAccess.getFunctionParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMySelenium.g:2248:1: rule__FunctionParameters__Group_2__0 : rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 ;
    public final void rule__FunctionParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2252:1: ( rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1 )
            // InternalMySelenium.g:2253:2: rule__FunctionParameters__Group_2__0__Impl rule__FunctionParameters__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMySelenium.g:2260:1: rule__FunctionParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2264:1: ( ( ',' ) )
            // InternalMySelenium.g:2265:1: ( ',' )
            {
            // InternalMySelenium.g:2265:1: ( ',' )
            // InternalMySelenium.g:2266:2: ','
            {
             before(grammarAccess.getFunctionParametersAccess().getCommaKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMySelenium.g:2275:1: rule__FunctionParameters__Group_2__1 : rule__FunctionParameters__Group_2__1__Impl ;
    public final void rule__FunctionParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2279:1: ( rule__FunctionParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2280:2: rule__FunctionParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2286:1: rule__FunctionParameters__Group_2__1__Impl : ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2290:1: ( ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2291:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2291:1: ( ( rule__FunctionParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2292:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2293:2: ( rule__FunctionParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2293:3: rule__FunctionParameters__VariablesAssignment_2_1
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
    // InternalMySelenium.g:2302:1: rule__FunctionCallParameters__Group__0 : rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 ;
    public final void rule__FunctionCallParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2306:1: ( rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1 )
            // InternalMySelenium.g:2307:2: rule__FunctionCallParameters__Group__0__Impl rule__FunctionCallParameters__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMySelenium.g:2314:1: rule__FunctionCallParameters__Group__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2318:1: ( ( '(' ) )
            // InternalMySelenium.g:2319:1: ( '(' )
            {
            // InternalMySelenium.g:2319:1: ( '(' )
            // InternalMySelenium.g:2320:2: '('
            {
             before(grammarAccess.getFunctionCallParametersAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMySelenium.g:2329:1: rule__FunctionCallParameters__Group__1 : rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 ;
    public final void rule__FunctionCallParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2333:1: ( rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2 )
            // InternalMySelenium.g:2334:2: rule__FunctionCallParameters__Group__1__Impl rule__FunctionCallParameters__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMySelenium.g:2341:1: rule__FunctionCallParameters__Group__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) ;
    public final void rule__FunctionCallParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2345:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) ) )
            // InternalMySelenium.g:2346:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            {
            // InternalMySelenium.g:2346:1: ( ( rule__FunctionCallParameters__VariablesAssignment_1 ) )
            // InternalMySelenium.g:2347:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_1()); 
            // InternalMySelenium.g:2348:2: ( rule__FunctionCallParameters__VariablesAssignment_1 )
            // InternalMySelenium.g:2348:3: rule__FunctionCallParameters__VariablesAssignment_1
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
    // InternalMySelenium.g:2356:1: rule__FunctionCallParameters__Group__2 : rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 ;
    public final void rule__FunctionCallParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2360:1: ( rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3 )
            // InternalMySelenium.g:2361:2: rule__FunctionCallParameters__Group__2__Impl rule__FunctionCallParameters__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMySelenium.g:2368:1: rule__FunctionCallParameters__Group__2__Impl : ( ( rule__FunctionCallParameters__Group_2__0 )* ) ;
    public final void rule__FunctionCallParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2372:1: ( ( ( rule__FunctionCallParameters__Group_2__0 )* ) )
            // InternalMySelenium.g:2373:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            {
            // InternalMySelenium.g:2373:1: ( ( rule__FunctionCallParameters__Group_2__0 )* )
            // InternalMySelenium.g:2374:2: ( rule__FunctionCallParameters__Group_2__0 )*
            {
             before(grammarAccess.getFunctionCallParametersAccess().getGroup_2()); 
            // InternalMySelenium.g:2375:2: ( rule__FunctionCallParameters__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMySelenium.g:2375:3: rule__FunctionCallParameters__Group_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__FunctionCallParameters__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMySelenium.g:2383:1: rule__FunctionCallParameters__Group__3 : rule__FunctionCallParameters__Group__3__Impl ;
    public final void rule__FunctionCallParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2387:1: ( rule__FunctionCallParameters__Group__3__Impl )
            // InternalMySelenium.g:2388:2: rule__FunctionCallParameters__Group__3__Impl
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
    // InternalMySelenium.g:2394:1: rule__FunctionCallParameters__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCallParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2398:1: ( ( ')' ) )
            // InternalMySelenium.g:2399:1: ( ')' )
            {
            // InternalMySelenium.g:2399:1: ( ')' )
            // InternalMySelenium.g:2400:2: ')'
            {
             before(grammarAccess.getFunctionCallParametersAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMySelenium.g:2410:1: rule__FunctionCallParameters__Group_2__0 : rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 ;
    public final void rule__FunctionCallParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2414:1: ( rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1 )
            // InternalMySelenium.g:2415:2: rule__FunctionCallParameters__Group_2__0__Impl rule__FunctionCallParameters__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMySelenium.g:2422:1: rule__FunctionCallParameters__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2426:1: ( ( ',' ) )
            // InternalMySelenium.g:2427:1: ( ',' )
            {
            // InternalMySelenium.g:2427:1: ( ',' )
            // InternalMySelenium.g:2428:2: ','
            {
             before(grammarAccess.getFunctionCallParametersAccess().getCommaKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMySelenium.g:2437:1: rule__FunctionCallParameters__Group_2__1 : rule__FunctionCallParameters__Group_2__1__Impl ;
    public final void rule__FunctionCallParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2441:1: ( rule__FunctionCallParameters__Group_2__1__Impl )
            // InternalMySelenium.g:2442:2: rule__FunctionCallParameters__Group_2__1__Impl
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
    // InternalMySelenium.g:2448:1: rule__FunctionCallParameters__Group_2__1__Impl : ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) ;
    public final void rule__FunctionCallParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2452:1: ( ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) ) )
            // InternalMySelenium.g:2453:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            {
            // InternalMySelenium.g:2453:1: ( ( rule__FunctionCallParameters__VariablesAssignment_2_1 ) )
            // InternalMySelenium.g:2454:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFunctionCallParametersAccess().getVariablesAssignment_2_1()); 
            // InternalMySelenium.g:2455:2: ( rule__FunctionCallParameters__VariablesAssignment_2_1 )
            // InternalMySelenium.g:2455:3: rule__FunctionCallParameters__VariablesAssignment_2_1
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


    // $ANTLR start "rule__Comment__Group__0"
    // InternalMySelenium.g:2464:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2468:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalMySelenium.g:2469:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

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
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalMySelenium.g:2476:1: rule__Comment__Group__0__Impl : ( ( ( '#' ) ) ( ( '#' )* ) ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2480:1: ( ( ( ( '#' ) ) ( ( '#' )* ) ) )
            // InternalMySelenium.g:2481:1: ( ( ( '#' ) ) ( ( '#' )* ) )
            {
            // InternalMySelenium.g:2481:1: ( ( ( '#' ) ) ( ( '#' )* ) )
            // InternalMySelenium.g:2482:2: ( ( '#' ) ) ( ( '#' )* )
            {
            // InternalMySelenium.g:2482:2: ( ( '#' ) )
            // InternalMySelenium.g:2483:3: ( '#' )
            {
             before(grammarAccess.getCommentAccess().getNumberSignKeyword_0()); 
            // InternalMySelenium.g:2484:3: ( '#' )
            // InternalMySelenium.g:2484:4: '#'
            {
            match(input,46,FOLLOW_4); 

            }

             after(grammarAccess.getCommentAccess().getNumberSignKeyword_0()); 

            }

            // InternalMySelenium.g:2487:2: ( ( '#' )* )
            // InternalMySelenium.g:2488:3: ( '#' )*
            {
             before(grammarAccess.getCommentAccess().getNumberSignKeyword_0()); 
            // InternalMySelenium.g:2489:3: ( '#' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMySelenium.g:2489:4: '#'
            	    {
            	    match(input,46,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCommentAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalMySelenium.g:2498:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2502:1: ( rule__Comment__Group__1__Impl )
            // InternalMySelenium.g:2503:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1__Impl();

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
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalMySelenium.g:2509:1: rule__Comment__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2513:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2514:1: ( RULE_STRING )
            {
            // InternalMySelenium.g:2514:1: ( RULE_STRING )
            // InternalMySelenium.g:2515:2: RULE_STRING
            {
             before(grammarAccess.getCommentAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Program__FunctionsAssignment_1"
    // InternalMySelenium.g:2525:1: rule__Program__FunctionsAssignment_1 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2529:1: ( ( ruleFunction ) )
            // InternalMySelenium.g:2530:2: ( ruleFunction )
            {
            // InternalMySelenium.g:2530:2: ( ruleFunction )
            // InternalMySelenium.g:2531:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalMySelenium.g:2540:1: rule__Function__NameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2544:1: ( ( ruleFunctionName ) )
            // InternalMySelenium.g:2545:2: ( ruleFunctionName )
            {
            // InternalMySelenium.g:2545:2: ( ruleFunctionName )
            // InternalMySelenium.g:2546:3: ruleFunctionName
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
    // InternalMySelenium.g:2555:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2559:1: ( ( ruleFunctionParameters ) )
            // InternalMySelenium.g:2560:2: ( ruleFunctionParameters )
            {
            // InternalMySelenium.g:2560:2: ( ruleFunctionParameters )
            // InternalMySelenium.g:2561:3: ruleFunctionParameters
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
    // InternalMySelenium.g:2570:1: rule__Function__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Function__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2574:1: ( ( ruleStatement ) )
            // InternalMySelenium.g:2575:2: ( ruleStatement )
            {
            // InternalMySelenium.g:2575:2: ( ruleStatement )
            // InternalMySelenium.g:2576:3: ruleStatement
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
    // InternalMySelenium.g:2585:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2589:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:2590:2: ( RULE_ID )
            {
            // InternalMySelenium.g:2590:2: ( RULE_ID )
            // InternalMySelenium.g:2591:3: RULE_ID
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
    // InternalMySelenium.g:2600:1: rule__FunctionCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2604:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2605:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2605:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2606:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getRefFunctionNameCrossReference_0_0()); 
            // InternalMySelenium.g:2607:3: ( RULE_ID )
            // InternalMySelenium.g:2608:4: RULE_ID
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
    // InternalMySelenium.g:2619:1: rule__FunctionCall__ParamsAssignment_1 : ( ruleFunctionCallParameters ) ;
    public final void rule__FunctionCall__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2623:1: ( ( ruleFunctionCallParameters ) )
            // InternalMySelenium.g:2624:2: ( ruleFunctionCallParameters )
            {
            // InternalMySelenium.g:2624:2: ( ruleFunctionCallParameters )
            // InternalMySelenium.g:2625:3: ruleFunctionCallParameters
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
    // InternalMySelenium.g:2634:1: rule__Projection__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Projection__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2638:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2639:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2639:2: ( ruleSelector )
            // InternalMySelenium.g:2640:3: ruleSelector
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
    // InternalMySelenium.g:2649:1: rule__Projection__ProjectionActionAssignment_2 : ( ruleProjectionAction ) ;
    public final void rule__Projection__ProjectionActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2653:1: ( ( ruleProjectionAction ) )
            // InternalMySelenium.g:2654:2: ( ruleProjectionAction )
            {
            // InternalMySelenium.g:2654:2: ( ruleProjectionAction )
            // InternalMySelenium.g:2655:3: ruleProjectionAction
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
    // InternalMySelenium.g:2664:1: rule__AssertEquals__AssertableElementAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2668:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2669:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2669:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2670:3: ruleAssertableElement
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
    // InternalMySelenium.g:2679:1: rule__AssertEquals__AssertableElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertEquals__AssertableElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2683:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2684:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2684:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2685:3: ruleAssertableElement
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
    // InternalMySelenium.g:2694:1: rule__AssertContains__ContainerAssignment_1 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ContainerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2698:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2699:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2699:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2700:3: ruleAssertableElement
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
    // InternalMySelenium.g:2709:1: rule__AssertContains__ElementAssignment_3 : ( ruleAssertableElement ) ;
    public final void rule__AssertContains__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2713:1: ( ( ruleAssertableElement ) )
            // InternalMySelenium.g:2714:2: ( ruleAssertableElement )
            {
            // InternalMySelenium.g:2714:2: ( ruleAssertableElement )
            // InternalMySelenium.g:2715:3: ruleAssertableElement
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
    // InternalMySelenium.g:2724:1: rule__NavigationAction__ActionAssignment_0 : ( ruleNavigationActionType ) ;
    public final void rule__NavigationAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2728:1: ( ( ruleNavigationActionType ) )
            // InternalMySelenium.g:2729:2: ( ruleNavigationActionType )
            {
            // InternalMySelenium.g:2729:2: ( ruleNavigationActionType )
            // InternalMySelenium.g:2730:3: ruleNavigationActionType
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
    // InternalMySelenium.g:2739:1: rule__NavigationAction__ParamAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NavigationAction__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2743:1: ( ( RULE_STRING ) )
            // InternalMySelenium.g:2744:2: ( RULE_STRING )
            {
            // InternalMySelenium.g:2744:2: ( RULE_STRING )
            // InternalMySelenium.g:2745:3: RULE_STRING
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
    // InternalMySelenium.g:2754:1: rule__OneParameterAction__ActionAssignment_0 : ( ruleOneParameterActionType ) ;
    public final void rule__OneParameterAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2758:1: ( ( ruleOneParameterActionType ) )
            // InternalMySelenium.g:2759:2: ( ruleOneParameterActionType )
            {
            // InternalMySelenium.g:2759:2: ( ruleOneParameterActionType )
            // InternalMySelenium.g:2760:3: ruleOneParameterActionType
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
    // InternalMySelenium.g:2769:1: rule__OneParameterAction__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__OneParameterAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2773:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2774:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2774:2: ( ruleSelector )
            // InternalMySelenium.g:2775:3: ruleSelector
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
    // InternalMySelenium.g:2784:1: rule__TwoParametersAction__ActionAssignment_0 : ( ruleTwoParametersActionType ) ;
    public final void rule__TwoParametersAction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2788:1: ( ( ruleTwoParametersActionType ) )
            // InternalMySelenium.g:2789:2: ( ruleTwoParametersActionType )
            {
            // InternalMySelenium.g:2789:2: ( ruleTwoParametersActionType )
            // InternalMySelenium.g:2790:3: ruleTwoParametersActionType
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
    // InternalMySelenium.g:2799:1: rule__TwoParametersAction__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__TwoParametersAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2803:1: ( ( ruleSelector ) )
            // InternalMySelenium.g:2804:2: ( ruleSelector )
            {
            // InternalMySelenium.g:2804:2: ( ruleSelector )
            // InternalMySelenium.g:2805:3: ruleSelector
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
    // InternalMySelenium.g:2814:1: rule__TwoParametersAction__ParameterAssignment_2 : ( ( rule__TwoParametersAction__ParameterAlternatives_2_0 ) ) ;
    public final void rule__TwoParametersAction__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2818:1: ( ( ( rule__TwoParametersAction__ParameterAlternatives_2_0 ) ) )
            // InternalMySelenium.g:2819:2: ( ( rule__TwoParametersAction__ParameterAlternatives_2_0 ) )
            {
            // InternalMySelenium.g:2819:2: ( ( rule__TwoParametersAction__ParameterAlternatives_2_0 ) )
            // InternalMySelenium.g:2820:3: ( rule__TwoParametersAction__ParameterAlternatives_2_0 )
            {
             before(grammarAccess.getTwoParametersActionAccess().getParameterAlternatives_2_0()); 
            // InternalMySelenium.g:2821:3: ( rule__TwoParametersAction__ParameterAlternatives_2_0 )
            // InternalMySelenium.g:2821:4: rule__TwoParametersAction__ParameterAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__TwoParametersAction__ParameterAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTwoParametersActionAccess().getParameterAlternatives_2_0()); 

            }


            }

        }
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
    // InternalMySelenium.g:2829:1: rule__Selector__ElementAssignment_0 : ( ruleDOMElement ) ;
    public final void rule__Selector__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2833:1: ( ( ruleDOMElement ) )
            // InternalMySelenium.g:2834:2: ( ruleDOMElement )
            {
            // InternalMySelenium.g:2834:2: ( ruleDOMElement )
            // InternalMySelenium.g:2835:3: ruleDOMElement
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
    // InternalMySelenium.g:2844:1: rule__Selector__AttrsAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2848:1: ( ( ruleAttributes ) )
            // InternalMySelenium.g:2849:2: ( ruleAttributes )
            {
            // InternalMySelenium.g:2849:2: ( ruleAttributes )
            // InternalMySelenium.g:2850:3: ruleAttributes
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
    // InternalMySelenium.g:2859:1: rule__Attributes__AttrsAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2863:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2864:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2864:2: ( ruleAttribute )
            // InternalMySelenium.g:2865:3: ruleAttribute
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
    // InternalMySelenium.g:2874:1: rule__Attributes__AttrsAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2878:1: ( ( ruleAttribute ) )
            // InternalMySelenium.g:2879:2: ( ruleAttribute )
            {
            // InternalMySelenium.g:2879:2: ( ruleAttribute )
            // InternalMySelenium.g:2880:3: ruleAttribute
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
    // InternalMySelenium.g:2889:1: rule__Attribute__NameAssignment_0 : ( ruleDOMAttribute ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2893:1: ( ( ruleDOMAttribute ) )
            // InternalMySelenium.g:2894:2: ( ruleDOMAttribute )
            {
            // InternalMySelenium.g:2894:2: ( ruleDOMAttribute )
            // InternalMySelenium.g:2895:3: ruleDOMAttribute
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


    // $ANTLR start "rule__Attribute__ValAssignment_2_1"
    // InternalMySelenium.g:2904:1: rule__Attribute__ValAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2908:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2909:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2909:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2910:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getValVariableCrossReference_2_1_0()); 
            // InternalMySelenium.g:2911:3: ( RULE_ID )
            // InternalMySelenium.g:2912:4: RULE_ID
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
    // InternalMySelenium.g:2923:1: rule__FunctionParameters__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2927:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2928:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2928:2: ( ruleVariable )
            // InternalMySelenium.g:2929:3: ruleVariable
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
    // InternalMySelenium.g:2938:1: rule__FunctionParameters__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__FunctionParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2942:1: ( ( ruleVariable ) )
            // InternalMySelenium.g:2943:2: ( ruleVariable )
            {
            // InternalMySelenium.g:2943:2: ( ruleVariable )
            // InternalMySelenium.g:2944:3: ruleVariable
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
    // InternalMySelenium.g:2953:1: rule__FunctionCallParameters__VariablesAssignment_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2957:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2958:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2958:2: ( ruleVariableCall )
            // InternalMySelenium.g:2959:3: ruleVariableCall
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
    // InternalMySelenium.g:2968:1: rule__FunctionCallParameters__VariablesAssignment_2_1 : ( ruleVariableCall ) ;
    public final void rule__FunctionCallParameters__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2972:1: ( ( ruleVariableCall ) )
            // InternalMySelenium.g:2973:2: ( ruleVariableCall )
            {
            // InternalMySelenium.g:2973:2: ( ruleVariableCall )
            // InternalMySelenium.g:2974:3: ruleVariableCall
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
    // InternalMySelenium.g:2983:1: rule__VariableCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:2987:1: ( ( ( RULE_ID ) ) )
            // InternalMySelenium.g:2988:2: ( ( RULE_ID ) )
            {
            // InternalMySelenium.g:2988:2: ( ( RULE_ID ) )
            // InternalMySelenium.g:2989:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_0_0()); 
            // InternalMySelenium.g:2990:3: ( RULE_ID )
            // InternalMySelenium.g:2991:4: RULE_ID
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
    // InternalMySelenium.g:3002:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMySelenium.g:3006:1: ( ( RULE_ID ) )
            // InternalMySelenium.g:3007:2: ( RULE_ID )
            {
            // InternalMySelenium.g:3007:2: ( RULE_ID )
            // InternalMySelenium.g:3008:3: RULE_ID
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\5\3\uffff\1\4\2\uffff\2\46\11\50\1\uffff\1\4\1\uffff\1\15\2\53\5\46\1\44\1\4\1\46\1\4\1\44\1\14\2\53\2\51\3\46\1\15\5\46\1\4\2\51";
    static final String dfa_3s = "\1\56\3\uffff\1\35\2\uffff\1\54\1\47\11\50\1\uffff\1\5\1\uffff\1\51\2\55\5\46\1\52\1\5\1\47\1\5\1\44\1\16\2\55\2\53\3\47\1\24\5\46\1\5\2\53";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\13\uffff\1\4\1\uffff\1\5\36\uffff";
    static final String dfa_5s = "\63\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\3\uffff\2\5\15\uffff\3\2\4\uffff\1\4\10\uffff\1\6",
            "",
            "",
            "",
            "\1\10\1\7\17\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\22\1\24\4\uffff\1\23",
            "\1\22\1\24",
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
            "\1\27\1\26",
            "",
            "\1\31\3\uffff\1\30\1\32\1\33\1\34\24\uffff\1\35",
            "\1\36\1\uffff\1\37",
            "\1\36\1\uffff\1\37",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\42\5\uffff\1\41",
            "\1\44\1\43",
            "\1\22\1\24",
            "\1\45\1\46",
            "\1\42",
            "\1\47\1\50\1\51",
            "\1\36\1\uffff\1\37",
            "\1\36\1\uffff\1\37",
            "\1\35\1\uffff\1\52",
            "\1\35\1\uffff\1\52",
            "\1\22\1\24",
            "\1\22\1\24",
            "\1\22\1\24",
            "\1\54\3\uffff\1\53\1\55\1\56\1\57",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\61\1\62",
            "\1\35\1\uffff\1\52",
            "\1\35\1\uffff\1\52"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "729:1: rule__Statement__Alternatives : ( ( ruleOneParameterAction ) | ( ruleTwoParametersAction ) | ( ruleFunctionCall ) | ( ruleAssertEquals ) | ( ruleAssertContains ) | ( ruleNavigationAction ) | ( ruleComment ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00004029C0018820L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00004021C0018822L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003FE00030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003FE00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003FE00020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000200001E2000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000001E2000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000280000000000L});

}