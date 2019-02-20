package fr.inria.diverse.ide.contentassist.antlr.internal;

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
import fr.inria.diverse.services.NetworkModelTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNetworkModelTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Docker'", "'OVS'", "'EthSwitch'", "'Firefox'", "'UbuntuDesktop'", "'NAT'", "'Cloud'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'config'", "'extends'", "'name:'", "'nodeID:'", "'image:'", "'eth0.IP:'", "'bind'", "'and'", "'with'", "'linkID:'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalNetworkModelTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNetworkModelTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNetworkModelTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNetworkModelTest.g"; }


    	private NetworkModelTestGrammarAccess grammarAccess;

    	public void setGrammarAccess(NetworkModelTestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalNetworkModelTest.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:54:1: ( ruleModel EOF )
            // InternalNetworkModelTest.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalNetworkModelTest.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalNetworkModelTest.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalNetworkModelTest.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalNetworkModelTest.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalNetworkModelTest.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==22||(LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNetworkModelTest.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeElement"
    // InternalNetworkModelTest.g:78:1: entryRuleNodeElement : ruleNodeElement EOF ;
    public final void entryRuleNodeElement() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:79:1: ( ruleNodeElement EOF )
            // InternalNetworkModelTest.g:80:1: ruleNodeElement EOF
            {
             before(grammarAccess.getNodeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeElement();

            state._fsp--;

             after(grammarAccess.getNodeElementRule()); 
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
    // $ANTLR end "entryRuleNodeElement"


    // $ANTLR start "ruleNodeElement"
    // InternalNetworkModelTest.g:87:1: ruleNodeElement : ( ( rule__NodeElement__Alternatives ) ) ;
    public final void ruleNodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:91:2: ( ( ( rule__NodeElement__Alternatives ) ) )
            // InternalNetworkModelTest.g:92:2: ( ( rule__NodeElement__Alternatives ) )
            {
            // InternalNetworkModelTest.g:92:2: ( ( rule__NodeElement__Alternatives ) )
            // InternalNetworkModelTest.g:93:3: ( rule__NodeElement__Alternatives )
            {
             before(grammarAccess.getNodeElementAccess().getAlternatives()); 
            // InternalNetworkModelTest.g:94:3: ( rule__NodeElement__Alternatives )
            // InternalNetworkModelTest.g:94:4: rule__NodeElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalNetworkModelTest.g:103:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:104:1: ( rulePackageDeclaration EOF )
            // InternalNetworkModelTest.g:105:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalNetworkModelTest.g:112:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:116:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalNetworkModelTest.g:117:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalNetworkModelTest.g:117:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalNetworkModelTest.g:118:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalNetworkModelTest.g:119:3: ( rule__PackageDeclaration__Group__0 )
            // InternalNetworkModelTest.g:119:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNetworkModelTest.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:129:1: ( ruleQualifiedName EOF )
            // InternalNetworkModelTest.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalNetworkModelTest.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalNetworkModelTest.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalNetworkModelTest.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalNetworkModelTest.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalNetworkModelTest.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalNetworkModelTest.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalNetworkModelTest.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:154:1: ( ruleImport EOF )
            // InternalNetworkModelTest.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalNetworkModelTest.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalNetworkModelTest.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalNetworkModelTest.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalNetworkModelTest.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalNetworkModelTest.g:169:3: ( rule__Import__Group__0 )
            // InternalNetworkModelTest.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalNetworkModelTest.g:178:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:179:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalNetworkModelTest.g:180:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalNetworkModelTest.g:187:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:191:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalNetworkModelTest.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalNetworkModelTest.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalNetworkModelTest.g:193:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalNetworkModelTest.g:194:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalNetworkModelTest.g:194:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalNetworkModelTest.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:204:1: ( ruleType EOF )
            // InternalNetworkModelTest.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalNetworkModelTest.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalNetworkModelTest.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalNetworkModelTest.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalNetworkModelTest.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalNetworkModelTest.g:219:3: ( rule__Type__Alternatives )
            // InternalNetworkModelTest.g:219:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalNetworkModelTest.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:229:1: ( ruleDataType EOF )
            // InternalNetworkModelTest.g:230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalNetworkModelTest.g:237:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:241:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalNetworkModelTest.g:242:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalNetworkModelTest.g:242:2: ( ( rule__DataType__Group__0 ) )
            // InternalNetworkModelTest.g:243:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalNetworkModelTest.g:244:3: ( rule__DataType__Group__0 )
            // InternalNetworkModelTest.g:244:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleConfig"
    // InternalNetworkModelTest.g:253:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:254:1: ( ruleConfig EOF )
            // InternalNetworkModelTest.g:255:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalNetworkModelTest.g:262:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:266:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalNetworkModelTest.g:267:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalNetworkModelTest.g:267:2: ( ( rule__Config__Group__0 ) )
            // InternalNetworkModelTest.g:268:3: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // InternalNetworkModelTest.g:269:3: ( rule__Config__Group__0 )
            // InternalNetworkModelTest.g:269:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleNode"
    // InternalNetworkModelTest.g:278:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:279:1: ( ruleNode EOF )
            // InternalNetworkModelTest.g:280:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalNetworkModelTest.g:287:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:291:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalNetworkModelTest.g:292:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalNetworkModelTest.g:292:2: ( ( rule__Node__Group__0 ) )
            // InternalNetworkModelTest.g:293:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalNetworkModelTest.g:294:3: ( rule__Node__Group__0 )
            // InternalNetworkModelTest.g:294:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeType"
    // InternalNetworkModelTest.g:303:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:304:1: ( ruleNodeType EOF )
            // InternalNetworkModelTest.g:305:1: ruleNodeType EOF
            {
             before(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getNodeTypeRule()); 
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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalNetworkModelTest.g:312:1: ruleNodeType : ( ( rule__NodeType__NodetypeAssignment ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:316:2: ( ( ( rule__NodeType__NodetypeAssignment ) ) )
            // InternalNetworkModelTest.g:317:2: ( ( rule__NodeType__NodetypeAssignment ) )
            {
            // InternalNetworkModelTest.g:317:2: ( ( rule__NodeType__NodetypeAssignment ) )
            // InternalNetworkModelTest.g:318:3: ( rule__NodeType__NodetypeAssignment )
            {
             before(grammarAccess.getNodeTypeAccess().getNodetypeAssignment()); 
            // InternalNetworkModelTest.g:319:3: ( rule__NodeType__NodetypeAssignment )
            // InternalNetworkModelTest.g:319:4: rule__NodeType__NodetypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__NodetypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getNodetypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleBinding"
    // InternalNetworkModelTest.g:328:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:329:1: ( ruleBinding EOF )
            // InternalNetworkModelTest.g:330:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalNetworkModelTest.g:337:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:341:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalNetworkModelTest.g:342:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalNetworkModelTest.g:342:2: ( ( rule__Binding__Group__0 ) )
            // InternalNetworkModelTest.g:343:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalNetworkModelTest.g:344:3: ( rule__Binding__Group__0 )
            // InternalNetworkModelTest.g:344:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleNodeA"
    // InternalNetworkModelTest.g:353:1: entryRuleNodeA : ruleNodeA EOF ;
    public final void entryRuleNodeA() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:354:1: ( ruleNodeA EOF )
            // InternalNetworkModelTest.g:355:1: ruleNodeA EOF
            {
             before(grammarAccess.getNodeARule()); 
            pushFollow(FOLLOW_1);
            ruleNodeA();

            state._fsp--;

             after(grammarAccess.getNodeARule()); 
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
    // $ANTLR end "entryRuleNodeA"


    // $ANTLR start "ruleNodeA"
    // InternalNetworkModelTest.g:362:1: ruleNodeA : ( ( rule__NodeA__Group__0 ) ) ;
    public final void ruleNodeA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:366:2: ( ( ( rule__NodeA__Group__0 ) ) )
            // InternalNetworkModelTest.g:367:2: ( ( rule__NodeA__Group__0 ) )
            {
            // InternalNetworkModelTest.g:367:2: ( ( rule__NodeA__Group__0 ) )
            // InternalNetworkModelTest.g:368:3: ( rule__NodeA__Group__0 )
            {
             before(grammarAccess.getNodeAAccess().getGroup()); 
            // InternalNetworkModelTest.g:369:3: ( rule__NodeA__Group__0 )
            // InternalNetworkModelTest.g:369:4: rule__NodeA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeA"


    // $ANTLR start "entryRuleNodeB"
    // InternalNetworkModelTest.g:378:1: entryRuleNodeB : ruleNodeB EOF ;
    public final void entryRuleNodeB() throws RecognitionException {
        try {
            // InternalNetworkModelTest.g:379:1: ( ruleNodeB EOF )
            // InternalNetworkModelTest.g:380:1: ruleNodeB EOF
            {
             before(grammarAccess.getNodeBRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeB();

            state._fsp--;

             after(grammarAccess.getNodeBRule()); 
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
    // $ANTLR end "entryRuleNodeB"


    // $ANTLR start "ruleNodeB"
    // InternalNetworkModelTest.g:387:1: ruleNodeB : ( ( rule__NodeB__Group__0 ) ) ;
    public final void ruleNodeB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:391:2: ( ( ( rule__NodeB__Group__0 ) ) )
            // InternalNetworkModelTest.g:392:2: ( ( rule__NodeB__Group__0 ) )
            {
            // InternalNetworkModelTest.g:392:2: ( ( rule__NodeB__Group__0 ) )
            // InternalNetworkModelTest.g:393:3: ( rule__NodeB__Group__0 )
            {
             before(grammarAccess.getNodeBAccess().getGroup()); 
            // InternalNetworkModelTest.g:394:3: ( rule__NodeB__Group__0 )
            // InternalNetworkModelTest.g:394:4: rule__NodeB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeB"


    // $ANTLR start "rule__NodeElement__Alternatives"
    // InternalNetworkModelTest.g:402:1: rule__NodeElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleImport ) | ( ruleType ) );
    public final void rule__NodeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:406:1: ( ( rulePackageDeclaration ) | ( ruleImport ) | ( ruleType ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalNetworkModelTest.g:407:2: ( rulePackageDeclaration )
                    {
                    // InternalNetworkModelTest.g:407:2: ( rulePackageDeclaration )
                    // InternalNetworkModelTest.g:408:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getNodeElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getNodeElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:413:2: ( ruleImport )
                    {
                    // InternalNetworkModelTest.g:413:2: ( ruleImport )
                    // InternalNetworkModelTest.g:414:3: ruleImport
                    {
                     before(grammarAccess.getNodeElementAccess().getImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getNodeElementAccess().getImportParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNetworkModelTest.g:419:2: ( ruleType )
                    {
                    // InternalNetworkModelTest.g:419:2: ( ruleType )
                    // InternalNetworkModelTest.g:420:3: ruleType
                    {
                     before(grammarAccess.getNodeElementAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getNodeElementAccess().getTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__NodeElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalNetworkModelTest.g:429:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleConfig ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:433:1: ( ( ruleDataType ) | ( ruleConfig ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNetworkModelTest.g:434:2: ( ruleDataType )
                    {
                    // InternalNetworkModelTest.g:434:2: ( ruleDataType )
                    // InternalNetworkModelTest.g:435:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:440:2: ( ruleConfig )
                    {
                    // InternalNetworkModelTest.g:440:2: ( ruleConfig )
                    // InternalNetworkModelTest.g:441:3: ruleConfig
                    {
                     before(grammarAccess.getTypeAccess().getConfigParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConfig();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getConfigParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__NodeType__NodetypeAlternatives_0"
    // InternalNetworkModelTest.g:450:1: rule__NodeType__NodetypeAlternatives_0 : ( ( 'Docker' ) | ( 'OVS' ) | ( 'EthSwitch' ) | ( 'Firefox' ) | ( 'UbuntuDesktop' ) | ( 'NAT' ) | ( 'Cloud' ) );
    public final void rule__NodeType__NodetypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:454:1: ( ( 'Docker' ) | ( 'OVS' ) | ( 'EthSwitch' ) | ( 'Firefox' ) | ( 'UbuntuDesktop' ) | ( 'NAT' ) | ( 'Cloud' ) )
            int alt4=7;
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
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalNetworkModelTest.g:455:2: ( 'Docker' )
                    {
                    // InternalNetworkModelTest.g:455:2: ( 'Docker' )
                    // InternalNetworkModelTest.g:456:3: 'Docker'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeDockerKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeDockerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:461:2: ( 'OVS' )
                    {
                    // InternalNetworkModelTest.g:461:2: ( 'OVS' )
                    // InternalNetworkModelTest.g:462:3: 'OVS'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeOVSKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeOVSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNetworkModelTest.g:467:2: ( 'EthSwitch' )
                    {
                    // InternalNetworkModelTest.g:467:2: ( 'EthSwitch' )
                    // InternalNetworkModelTest.g:468:3: 'EthSwitch'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeEthSwitchKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeEthSwitchKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNetworkModelTest.g:473:2: ( 'Firefox' )
                    {
                    // InternalNetworkModelTest.g:473:2: ( 'Firefox' )
                    // InternalNetworkModelTest.g:474:3: 'Firefox'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeFirefoxKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeFirefoxKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalNetworkModelTest.g:479:2: ( 'UbuntuDesktop' )
                    {
                    // InternalNetworkModelTest.g:479:2: ( 'UbuntuDesktop' )
                    // InternalNetworkModelTest.g:480:3: 'UbuntuDesktop'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeUbuntuDesktopKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeUbuntuDesktopKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalNetworkModelTest.g:485:2: ( 'NAT' )
                    {
                    // InternalNetworkModelTest.g:485:2: ( 'NAT' )
                    // InternalNetworkModelTest.g:486:3: 'NAT'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeNATKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeNATKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalNetworkModelTest.g:491:2: ( 'Cloud' )
                    {
                    // InternalNetworkModelTest.g:491:2: ( 'Cloud' )
                    // InternalNetworkModelTest.g:492:3: 'Cloud'
                    {
                     before(grammarAccess.getNodeTypeAccess().getNodetypeCloudKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNodeTypeAccess().getNodetypeCloudKeyword_0_6()); 

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
    // $ANTLR end "rule__NodeType__NodetypeAlternatives_0"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalNetworkModelTest.g:501:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:505:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalNetworkModelTest.g:506:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalNetworkModelTest.g:513:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:517:1: ( ( 'package' ) )
            // InternalNetworkModelTest.g:518:1: ( 'package' )
            {
            // InternalNetworkModelTest.g:518:1: ( 'package' )
            // InternalNetworkModelTest.g:519:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalNetworkModelTest.g:528:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:532:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalNetworkModelTest.g:533:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalNetworkModelTest.g:540:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:544:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalNetworkModelTest.g:545:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:545:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalNetworkModelTest.g:546:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalNetworkModelTest.g:547:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalNetworkModelTest.g:547:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalNetworkModelTest.g:555:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:559:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalNetworkModelTest.g:560:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalNetworkModelTest.g:567:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:571:1: ( ( '{' ) )
            // InternalNetworkModelTest.g:572:1: ( '{' )
            {
            // InternalNetworkModelTest.g:572:1: ( '{' )
            // InternalNetworkModelTest.g:573:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalNetworkModelTest.g:582:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:586:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalNetworkModelTest.g:587:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalNetworkModelTest.g:594:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:598:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalNetworkModelTest.g:599:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalNetworkModelTest.g:599:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalNetworkModelTest.g:600:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalNetworkModelTest.g:601:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==22||(LA5_0>=24 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNetworkModelTest.g:601:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalNetworkModelTest.g:609:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:613:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalNetworkModelTest.g:614:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalNetworkModelTest.g:620:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:624:1: ( ( '}' ) )
            // InternalNetworkModelTest.g:625:1: ( '}' )
            {
            // InternalNetworkModelTest.g:625:1: ( '}' )
            // InternalNetworkModelTest.g:626:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalNetworkModelTest.g:636:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:640:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalNetworkModelTest.g:641:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalNetworkModelTest.g:648:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:652:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:653:1: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:653:1: ( RULE_ID )
            // InternalNetworkModelTest.g:654:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalNetworkModelTest.g:663:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:667:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalNetworkModelTest.g:668:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalNetworkModelTest.g:674:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:678:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalNetworkModelTest.g:679:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalNetworkModelTest.g:679:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalNetworkModelTest.g:680:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalNetworkModelTest.g:681:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNetworkModelTest.g:681:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalNetworkModelTest.g:690:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:694:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalNetworkModelTest.g:695:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalNetworkModelTest.g:702:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:706:1: ( ( '.' ) )
            // InternalNetworkModelTest.g:707:1: ( '.' )
            {
            // InternalNetworkModelTest.g:707:1: ( '.' )
            // InternalNetworkModelTest.g:708:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalNetworkModelTest.g:717:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:721:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalNetworkModelTest.g:722:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalNetworkModelTest.g:728:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:732:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:733:1: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:733:1: ( RULE_ID )
            // InternalNetworkModelTest.g:734:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalNetworkModelTest.g:744:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:748:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalNetworkModelTest.g:749:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalNetworkModelTest.g:756:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:760:1: ( ( 'import' ) )
            // InternalNetworkModelTest.g:761:1: ( 'import' )
            {
            // InternalNetworkModelTest.g:761:1: ( 'import' )
            // InternalNetworkModelTest.g:762:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalNetworkModelTest.g:771:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:775:1: ( rule__Import__Group__1__Impl )
            // InternalNetworkModelTest.g:776:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalNetworkModelTest.g:782:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNameSpaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:786:1: ( ( ( rule__Import__ImportedNameSpaceAssignment_1 ) ) )
            // InternalNetworkModelTest.g:787:1: ( ( rule__Import__ImportedNameSpaceAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:787:1: ( ( rule__Import__ImportedNameSpaceAssignment_1 ) )
            // InternalNetworkModelTest.g:788:2: ( rule__Import__ImportedNameSpaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNameSpaceAssignment_1()); 
            // InternalNetworkModelTest.g:789:2: ( rule__Import__ImportedNameSpaceAssignment_1 )
            // InternalNetworkModelTest.g:789:3: rule__Import__ImportedNameSpaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNameSpaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNameSpaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalNetworkModelTest.g:798:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:802:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalNetworkModelTest.g:803:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalNetworkModelTest.g:810:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:814:1: ( ( ruleQualifiedName ) )
            // InternalNetworkModelTest.g:815:1: ( ruleQualifiedName )
            {
            // InternalNetworkModelTest.g:815:1: ( ruleQualifiedName )
            // InternalNetworkModelTest.g:816:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalNetworkModelTest.g:825:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:829:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalNetworkModelTest.g:830:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalNetworkModelTest.g:836:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:840:1: ( ( ( '.*' )? ) )
            // InternalNetworkModelTest.g:841:1: ( ( '.*' )? )
            {
            // InternalNetworkModelTest.g:841:1: ( ( '.*' )? )
            // InternalNetworkModelTest.g:842:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalNetworkModelTest.g:843:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNetworkModelTest.g:843:3: '.*'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalNetworkModelTest.g:852:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:856:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalNetworkModelTest.g:857:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalNetworkModelTest.g:864:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:868:1: ( ( 'datatype' ) )
            // InternalNetworkModelTest.g:869:1: ( 'datatype' )
            {
            // InternalNetworkModelTest.g:869:1: ( 'datatype' )
            // InternalNetworkModelTest.g:870:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalNetworkModelTest.g:879:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:883:1: ( rule__DataType__Group__1__Impl )
            // InternalNetworkModelTest.g:884:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalNetworkModelTest.g:890:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:894:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalNetworkModelTest.g:895:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:895:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalNetworkModelTest.g:896:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalNetworkModelTest.g:897:2: ( rule__DataType__NameAssignment_1 )
            // InternalNetworkModelTest.g:897:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__0"
    // InternalNetworkModelTest.g:906:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:910:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalNetworkModelTest.g:911:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalNetworkModelTest.g:918:1: rule__Config__Group__0__Impl : ( 'config' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:922:1: ( ( 'config' ) )
            // InternalNetworkModelTest.g:923:1: ( 'config' )
            {
            // InternalNetworkModelTest.g:923:1: ( 'config' )
            // InternalNetworkModelTest.g:924:2: 'config'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalNetworkModelTest.g:933:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:937:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalNetworkModelTest.g:938:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalNetworkModelTest.g:945:1: rule__Config__Group__1__Impl : ( ( rule__Config__NameAssignment_1 ) ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:949:1: ( ( ( rule__Config__NameAssignment_1 ) ) )
            // InternalNetworkModelTest.g:950:1: ( ( rule__Config__NameAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:950:1: ( ( rule__Config__NameAssignment_1 ) )
            // InternalNetworkModelTest.g:951:2: ( rule__Config__NameAssignment_1 )
            {
             before(grammarAccess.getConfigAccess().getNameAssignment_1()); 
            // InternalNetworkModelTest.g:952:2: ( rule__Config__NameAssignment_1 )
            // InternalNetworkModelTest.g:952:3: rule__Config__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalNetworkModelTest.g:960:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:964:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalNetworkModelTest.g:965:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalNetworkModelTest.g:972:1: rule__Config__Group__2__Impl : ( ( rule__Config__Group_2__0 )? ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:976:1: ( ( ( rule__Config__Group_2__0 )? ) )
            // InternalNetworkModelTest.g:977:1: ( ( rule__Config__Group_2__0 )? )
            {
            // InternalNetworkModelTest.g:977:1: ( ( rule__Config__Group_2__0 )? )
            // InternalNetworkModelTest.g:978:2: ( rule__Config__Group_2__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_2()); 
            // InternalNetworkModelTest.g:979:2: ( rule__Config__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNetworkModelTest.g:979:3: rule__Config__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalNetworkModelTest.g:987:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:991:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalNetworkModelTest.g:992:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalNetworkModelTest.g:999:1: rule__Config__Group__3__Impl : ( '{' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1003:1: ( ( '{' ) )
            // InternalNetworkModelTest.g:1004:1: ( '{' )
            {
            // InternalNetworkModelTest.g:1004:1: ( '{' )
            // InternalNetworkModelTest.g:1005:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // InternalNetworkModelTest.g:1014:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1018:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalNetworkModelTest.g:1019:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // InternalNetworkModelTest.g:1026:1: rule__Config__Group__4__Impl : ( ( ( rule__Config__NodeAssignment_4 ) ) ( ( rule__Config__NodeAssignment_4 )* ) ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1030:1: ( ( ( ( rule__Config__NodeAssignment_4 ) ) ( ( rule__Config__NodeAssignment_4 )* ) ) )
            // InternalNetworkModelTest.g:1031:1: ( ( ( rule__Config__NodeAssignment_4 ) ) ( ( rule__Config__NodeAssignment_4 )* ) )
            {
            // InternalNetworkModelTest.g:1031:1: ( ( ( rule__Config__NodeAssignment_4 ) ) ( ( rule__Config__NodeAssignment_4 )* ) )
            // InternalNetworkModelTest.g:1032:2: ( ( rule__Config__NodeAssignment_4 ) ) ( ( rule__Config__NodeAssignment_4 )* )
            {
            // InternalNetworkModelTest.g:1032:2: ( ( rule__Config__NodeAssignment_4 ) )
            // InternalNetworkModelTest.g:1033:3: ( rule__Config__NodeAssignment_4 )
            {
             before(grammarAccess.getConfigAccess().getNodeAssignment_4()); 
            // InternalNetworkModelTest.g:1034:3: ( rule__Config__NodeAssignment_4 )
            // InternalNetworkModelTest.g:1034:4: rule__Config__NodeAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Config__NodeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getNodeAssignment_4()); 

            }

            // InternalNetworkModelTest.g:1037:2: ( ( rule__Config__NodeAssignment_4 )* )
            // InternalNetworkModelTest.g:1038:3: ( rule__Config__NodeAssignment_4 )*
            {
             before(grammarAccess.getConfigAccess().getNodeAssignment_4()); 
            // InternalNetworkModelTest.g:1039:3: ( rule__Config__NodeAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNetworkModelTest.g:1039:4: rule__Config__NodeAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Config__NodeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getNodeAssignment_4()); 

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
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // InternalNetworkModelTest.g:1048:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1052:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalNetworkModelTest.g:1053:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // InternalNetworkModelTest.g:1060:1: rule__Config__Group__5__Impl : ( ( ( rule__Config__BindingAssignment_5 ) ) ( ( rule__Config__BindingAssignment_5 )* ) ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1064:1: ( ( ( ( rule__Config__BindingAssignment_5 ) ) ( ( rule__Config__BindingAssignment_5 )* ) ) )
            // InternalNetworkModelTest.g:1065:1: ( ( ( rule__Config__BindingAssignment_5 ) ) ( ( rule__Config__BindingAssignment_5 )* ) )
            {
            // InternalNetworkModelTest.g:1065:1: ( ( ( rule__Config__BindingAssignment_5 ) ) ( ( rule__Config__BindingAssignment_5 )* ) )
            // InternalNetworkModelTest.g:1066:2: ( ( rule__Config__BindingAssignment_5 ) ) ( ( rule__Config__BindingAssignment_5 )* )
            {
            // InternalNetworkModelTest.g:1066:2: ( ( rule__Config__BindingAssignment_5 ) )
            // InternalNetworkModelTest.g:1067:3: ( rule__Config__BindingAssignment_5 )
            {
             before(grammarAccess.getConfigAccess().getBindingAssignment_5()); 
            // InternalNetworkModelTest.g:1068:3: ( rule__Config__BindingAssignment_5 )
            // InternalNetworkModelTest.g:1068:4: rule__Config__BindingAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Config__BindingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getBindingAssignment_5()); 

            }

            // InternalNetworkModelTest.g:1071:2: ( ( rule__Config__BindingAssignment_5 )* )
            // InternalNetworkModelTest.g:1072:3: ( rule__Config__BindingAssignment_5 )*
            {
             before(grammarAccess.getConfigAccess().getBindingAssignment_5()); 
            // InternalNetworkModelTest.g:1073:3: ( rule__Config__BindingAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNetworkModelTest.g:1073:4: rule__Config__BindingAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Config__BindingAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getBindingAssignment_5()); 

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
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // InternalNetworkModelTest.g:1082:1: rule__Config__Group__6 : rule__Config__Group__6__Impl ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1086:1: ( rule__Config__Group__6__Impl )
            // InternalNetworkModelTest.g:1087:2: rule__Config__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // InternalNetworkModelTest.g:1093:1: rule__Config__Group__6__Impl : ( '}' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1097:1: ( ( '}' ) )
            // InternalNetworkModelTest.g:1098:1: ( '}' )
            {
            // InternalNetworkModelTest.g:1098:1: ( '}' )
            // InternalNetworkModelTest.g:1099:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group_2__0"
    // InternalNetworkModelTest.g:1109:1: rule__Config__Group_2__0 : rule__Config__Group_2__0__Impl rule__Config__Group_2__1 ;
    public final void rule__Config__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1113:1: ( rule__Config__Group_2__0__Impl rule__Config__Group_2__1 )
            // InternalNetworkModelTest.g:1114:2: rule__Config__Group_2__0__Impl rule__Config__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Config__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_2__0"


    // $ANTLR start "rule__Config__Group_2__0__Impl"
    // InternalNetworkModelTest.g:1121:1: rule__Config__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Config__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1125:1: ( ( 'extends' ) )
            // InternalNetworkModelTest.g:1126:1: ( 'extends' )
            {
            // InternalNetworkModelTest.g:1126:1: ( 'extends' )
            // InternalNetworkModelTest.g:1127:2: 'extends'
            {
             before(grammarAccess.getConfigAccess().getExtendsKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_2__0__Impl"


    // $ANTLR start "rule__Config__Group_2__1"
    // InternalNetworkModelTest.g:1136:1: rule__Config__Group_2__1 : rule__Config__Group_2__1__Impl ;
    public final void rule__Config__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1140:1: ( rule__Config__Group_2__1__Impl )
            // InternalNetworkModelTest.g:1141:2: rule__Config__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_2__1"


    // $ANTLR start "rule__Config__Group_2__1__Impl"
    // InternalNetworkModelTest.g:1147:1: rule__Config__Group_2__1__Impl : ( ( rule__Config__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Config__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1151:1: ( ( ( rule__Config__SuperTypeAssignment_2_1 ) ) )
            // InternalNetworkModelTest.g:1152:1: ( ( rule__Config__SuperTypeAssignment_2_1 ) )
            {
            // InternalNetworkModelTest.g:1152:1: ( ( rule__Config__SuperTypeAssignment_2_1 ) )
            // InternalNetworkModelTest.g:1153:2: ( rule__Config__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getConfigAccess().getSuperTypeAssignment_2_1()); 
            // InternalNetworkModelTest.g:1154:2: ( rule__Config__SuperTypeAssignment_2_1 )
            // InternalNetworkModelTest.g:1154:3: rule__Config__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_2__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalNetworkModelTest.g:1163:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1167:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalNetworkModelTest.g:1168:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalNetworkModelTest.g:1175:1: rule__Node__Group__0__Impl : ( ( rule__Node__NodetypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1179:1: ( ( ( rule__Node__NodetypeAssignment_0 ) ) )
            // InternalNetworkModelTest.g:1180:1: ( ( rule__Node__NodetypeAssignment_0 ) )
            {
            // InternalNetworkModelTest.g:1180:1: ( ( rule__Node__NodetypeAssignment_0 ) )
            // InternalNetworkModelTest.g:1181:2: ( rule__Node__NodetypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNodetypeAssignment_0()); 
            // InternalNetworkModelTest.g:1182:2: ( rule__Node__NodetypeAssignment_0 )
            // InternalNetworkModelTest.g:1182:3: rule__Node__NodetypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodetypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodetypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalNetworkModelTest.g:1190:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1194:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalNetworkModelTest.g:1195:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalNetworkModelTest.g:1202:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1206:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalNetworkModelTest.g:1207:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:1207:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalNetworkModelTest.g:1208:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalNetworkModelTest.g:1209:2: ( rule__Node__NameAssignment_1 )
            // InternalNetworkModelTest.g:1209:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalNetworkModelTest.g:1217:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1221:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalNetworkModelTest.g:1222:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalNetworkModelTest.g:1229:1: rule__Node__Group__2__Impl : ( '{' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1233:1: ( ( '{' ) )
            // InternalNetworkModelTest.g:1234:1: ( '{' )
            {
            // InternalNetworkModelTest.g:1234:1: ( '{' )
            // InternalNetworkModelTest.g:1235:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalNetworkModelTest.g:1244:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1248:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalNetworkModelTest.g:1249:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalNetworkModelTest.g:1256:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1260:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // InternalNetworkModelTest.g:1261:1: ( ( rule__Node__Group_3__0 )? )
            {
            // InternalNetworkModelTest.g:1261:1: ( ( rule__Node__Group_3__0 )? )
            // InternalNetworkModelTest.g:1262:2: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // InternalNetworkModelTest.g:1263:2: ( rule__Node__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNetworkModelTest.g:1263:3: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalNetworkModelTest.g:1271:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1275:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalNetworkModelTest.g:1276:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalNetworkModelTest.g:1283:1: rule__Node__Group__4__Impl : ( 'name:' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1287:1: ( ( 'name:' ) )
            // InternalNetworkModelTest.g:1288:1: ( 'name:' )
            {
            // InternalNetworkModelTest.g:1288:1: ( 'name:' )
            // InternalNetworkModelTest.g:1289:2: 'name:'
            {
             before(grammarAccess.getNodeAccess().getNameKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalNetworkModelTest.g:1298:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1302:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // InternalNetworkModelTest.g:1303:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalNetworkModelTest.g:1310:1: rule__Node__Group__5__Impl : ( ( rule__Node__NodeNameAssignment_5 ) ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1314:1: ( ( ( rule__Node__NodeNameAssignment_5 ) ) )
            // InternalNetworkModelTest.g:1315:1: ( ( rule__Node__NodeNameAssignment_5 ) )
            {
            // InternalNetworkModelTest.g:1315:1: ( ( rule__Node__NodeNameAssignment_5 ) )
            // InternalNetworkModelTest.g:1316:2: ( rule__Node__NodeNameAssignment_5 )
            {
             before(grammarAccess.getNodeAccess().getNodeNameAssignment_5()); 
            // InternalNetworkModelTest.g:1317:2: ( rule__Node__NodeNameAssignment_5 )
            // InternalNetworkModelTest.g:1317:3: rule__Node__NodeNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodeNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // InternalNetworkModelTest.g:1325:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1329:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // InternalNetworkModelTest.g:1330:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // InternalNetworkModelTest.g:1337:1: rule__Node__Group__6__Impl : ( 'nodeID:' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1341:1: ( ( 'nodeID:' ) )
            // InternalNetworkModelTest.g:1342:1: ( 'nodeID:' )
            {
            // InternalNetworkModelTest.g:1342:1: ( 'nodeID:' )
            // InternalNetworkModelTest.g:1343:2: 'nodeID:'
            {
             before(grammarAccess.getNodeAccess().getNodeIDKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeIDKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // InternalNetworkModelTest.g:1352:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1356:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // InternalNetworkModelTest.g:1357:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // InternalNetworkModelTest.g:1364:1: rule__Node__Group__7__Impl : ( ( rule__Node__NodeIDAssignment_7 ) ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1368:1: ( ( ( rule__Node__NodeIDAssignment_7 ) ) )
            // InternalNetworkModelTest.g:1369:1: ( ( rule__Node__NodeIDAssignment_7 ) )
            {
            // InternalNetworkModelTest.g:1369:1: ( ( rule__Node__NodeIDAssignment_7 ) )
            // InternalNetworkModelTest.g:1370:2: ( rule__Node__NodeIDAssignment_7 )
            {
             before(grammarAccess.getNodeAccess().getNodeIDAssignment_7()); 
            // InternalNetworkModelTest.g:1371:2: ( rule__Node__NodeIDAssignment_7 )
            // InternalNetworkModelTest.g:1371:3: rule__Node__NodeIDAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeIDAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodeIDAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__Node__Group__8"
    // InternalNetworkModelTest.g:1379:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1383:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // InternalNetworkModelTest.g:1384:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8"


    // $ANTLR start "rule__Node__Group__8__Impl"
    // InternalNetworkModelTest.g:1391:1: rule__Node__Group__8__Impl : ( ( rule__Node__Group_8__0 )? ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1395:1: ( ( ( rule__Node__Group_8__0 )? ) )
            // InternalNetworkModelTest.g:1396:1: ( ( rule__Node__Group_8__0 )? )
            {
            // InternalNetworkModelTest.g:1396:1: ( ( rule__Node__Group_8__0 )? )
            // InternalNetworkModelTest.g:1397:2: ( rule__Node__Group_8__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_8()); 
            // InternalNetworkModelTest.g:1398:2: ( rule__Node__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNetworkModelTest.g:1398:3: rule__Node__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8__Impl"


    // $ANTLR start "rule__Node__Group__9"
    // InternalNetworkModelTest.g:1406:1: rule__Node__Group__9 : rule__Node__Group__9__Impl ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1410:1: ( rule__Node__Group__9__Impl )
            // InternalNetworkModelTest.g:1411:2: rule__Node__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9"


    // $ANTLR start "rule__Node__Group__9__Impl"
    // InternalNetworkModelTest.g:1417:1: rule__Node__Group__9__Impl : ( '}' ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1421:1: ( ( '}' ) )
            // InternalNetworkModelTest.g:1422:1: ( '}' )
            {
            // InternalNetworkModelTest.g:1422:1: ( '}' )
            // InternalNetworkModelTest.g:1423:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9__Impl"


    // $ANTLR start "rule__Node__Group_3__0"
    // InternalNetworkModelTest.g:1433:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1437:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // InternalNetworkModelTest.g:1438:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0"


    // $ANTLR start "rule__Node__Group_3__0__Impl"
    // InternalNetworkModelTest.g:1445:1: rule__Node__Group_3__0__Impl : ( 'image:' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1449:1: ( ( 'image:' ) )
            // InternalNetworkModelTest.g:1450:1: ( 'image:' )
            {
            // InternalNetworkModelTest.g:1450:1: ( 'image:' )
            // InternalNetworkModelTest.g:1451:2: 'image:'
            {
             before(grammarAccess.getNodeAccess().getImageKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getImageKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3__1"
    // InternalNetworkModelTest.g:1460:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1464:1: ( rule__Node__Group_3__1__Impl )
            // InternalNetworkModelTest.g:1465:2: rule__Node__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1"


    // $ANTLR start "rule__Node__Group_3__1__Impl"
    // InternalNetworkModelTest.g:1471:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__ImageAssignment_3_1 ) ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1475:1: ( ( ( rule__Node__ImageAssignment_3_1 ) ) )
            // InternalNetworkModelTest.g:1476:1: ( ( rule__Node__ImageAssignment_3_1 ) )
            {
            // InternalNetworkModelTest.g:1476:1: ( ( rule__Node__ImageAssignment_3_1 ) )
            // InternalNetworkModelTest.g:1477:2: ( rule__Node__ImageAssignment_3_1 )
            {
             before(grammarAccess.getNodeAccess().getImageAssignment_3_1()); 
            // InternalNetworkModelTest.g:1478:2: ( rule__Node__ImageAssignment_3_1 )
            // InternalNetworkModelTest.g:1478:3: rule__Node__ImageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__ImageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getImageAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group_8__0"
    // InternalNetworkModelTest.g:1487:1: rule__Node__Group_8__0 : rule__Node__Group_8__0__Impl rule__Node__Group_8__1 ;
    public final void rule__Node__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1491:1: ( rule__Node__Group_8__0__Impl rule__Node__Group_8__1 )
            // InternalNetworkModelTest.g:1492:2: rule__Node__Group_8__0__Impl rule__Node__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_8__0"


    // $ANTLR start "rule__Node__Group_8__0__Impl"
    // InternalNetworkModelTest.g:1499:1: rule__Node__Group_8__0__Impl : ( 'eth0.IP:' ) ;
    public final void rule__Node__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1503:1: ( ( 'eth0.IP:' ) )
            // InternalNetworkModelTest.g:1504:1: ( 'eth0.IP:' )
            {
            // InternalNetworkModelTest.g:1504:1: ( 'eth0.IP:' )
            // InternalNetworkModelTest.g:1505:2: 'eth0.IP:'
            {
             before(grammarAccess.getNodeAccess().getEth0IPKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getEth0IPKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_8__0__Impl"


    // $ANTLR start "rule__Node__Group_8__1"
    // InternalNetworkModelTest.g:1514:1: rule__Node__Group_8__1 : rule__Node__Group_8__1__Impl ;
    public final void rule__Node__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1518:1: ( rule__Node__Group_8__1__Impl )
            // InternalNetworkModelTest.g:1519:2: rule__Node__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_8__1"


    // $ANTLR start "rule__Node__Group_8__1__Impl"
    // InternalNetworkModelTest.g:1525:1: rule__Node__Group_8__1__Impl : ( ( rule__Node__NodeIPAssignment_8_1 ) ) ;
    public final void rule__Node__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1529:1: ( ( ( rule__Node__NodeIPAssignment_8_1 ) ) )
            // InternalNetworkModelTest.g:1530:1: ( ( rule__Node__NodeIPAssignment_8_1 ) )
            {
            // InternalNetworkModelTest.g:1530:1: ( ( rule__Node__NodeIPAssignment_8_1 ) )
            // InternalNetworkModelTest.g:1531:2: ( rule__Node__NodeIPAssignment_8_1 )
            {
             before(grammarAccess.getNodeAccess().getNodeIPAssignment_8_1()); 
            // InternalNetworkModelTest.g:1532:2: ( rule__Node__NodeIPAssignment_8_1 )
            // InternalNetworkModelTest.g:1532:3: rule__Node__NodeIPAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeIPAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodeIPAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_8__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalNetworkModelTest.g:1541:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1545:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalNetworkModelTest.g:1546:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalNetworkModelTest.g:1553:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1557:1: ( ( 'bind' ) )
            // InternalNetworkModelTest.g:1558:1: ( 'bind' )
            {
            // InternalNetworkModelTest.g:1558:1: ( 'bind' )
            // InternalNetworkModelTest.g:1559:2: 'bind'
            {
             before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalNetworkModelTest.g:1568:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1572:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalNetworkModelTest.g:1573:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalNetworkModelTest.g:1580:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__NodeAAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1584:1: ( ( ( rule__Binding__NodeAAssignment_1 ) ) )
            // InternalNetworkModelTest.g:1585:1: ( ( rule__Binding__NodeAAssignment_1 ) )
            {
            // InternalNetworkModelTest.g:1585:1: ( ( rule__Binding__NodeAAssignment_1 ) )
            // InternalNetworkModelTest.g:1586:2: ( rule__Binding__NodeAAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getNodeAAssignment_1()); 
            // InternalNetworkModelTest.g:1587:2: ( rule__Binding__NodeAAssignment_1 )
            // InternalNetworkModelTest.g:1587:3: rule__Binding__NodeAAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NodeAAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getNodeAAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalNetworkModelTest.g:1595:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1599:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalNetworkModelTest.g:1600:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalNetworkModelTest.g:1607:1: rule__Binding__Group__2__Impl : ( 'and' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1611:1: ( ( 'and' ) )
            // InternalNetworkModelTest.g:1612:1: ( 'and' )
            {
            // InternalNetworkModelTest.g:1612:1: ( 'and' )
            // InternalNetworkModelTest.g:1613:2: 'and'
            {
             before(grammarAccess.getBindingAccess().getAndKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getAndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalNetworkModelTest.g:1622:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1626:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalNetworkModelTest.g:1627:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalNetworkModelTest.g:1634:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__NodeBAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1638:1: ( ( ( rule__Binding__NodeBAssignment_3 ) ) )
            // InternalNetworkModelTest.g:1639:1: ( ( rule__Binding__NodeBAssignment_3 ) )
            {
            // InternalNetworkModelTest.g:1639:1: ( ( rule__Binding__NodeBAssignment_3 ) )
            // InternalNetworkModelTest.g:1640:2: ( rule__Binding__NodeBAssignment_3 )
            {
             before(grammarAccess.getBindingAccess().getNodeBAssignment_3()); 
            // InternalNetworkModelTest.g:1641:2: ( rule__Binding__NodeBAssignment_3 )
            // InternalNetworkModelTest.g:1641:3: rule__Binding__NodeBAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NodeBAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getNodeBAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalNetworkModelTest.g:1649:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1653:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalNetworkModelTest.g:1654:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalNetworkModelTest.g:1661:1: rule__Binding__Group__4__Impl : ( 'with' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1665:1: ( ( 'with' ) )
            // InternalNetworkModelTest.g:1666:1: ( 'with' )
            {
            // InternalNetworkModelTest.g:1666:1: ( 'with' )
            // InternalNetworkModelTest.g:1667:2: 'with'
            {
             before(grammarAccess.getBindingAccess().getWithKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalNetworkModelTest.g:1676:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1680:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // InternalNetworkModelTest.g:1681:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Binding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalNetworkModelTest.g:1688:1: rule__Binding__Group__5__Impl : ( 'linkID:' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1692:1: ( ( 'linkID:' ) )
            // InternalNetworkModelTest.g:1693:1: ( 'linkID:' )
            {
            // InternalNetworkModelTest.g:1693:1: ( 'linkID:' )
            // InternalNetworkModelTest.g:1694:2: 'linkID:'
            {
             before(grammarAccess.getBindingAccess().getLinkIDKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLinkIDKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__6"
    // InternalNetworkModelTest.g:1703:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl ;
    public final void rule__Binding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1707:1: ( rule__Binding__Group__6__Impl )
            // InternalNetworkModelTest.g:1708:2: rule__Binding__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6"


    // $ANTLR start "rule__Binding__Group__6__Impl"
    // InternalNetworkModelTest.g:1714:1: rule__Binding__Group__6__Impl : ( ( rule__Binding__LinkIDAssignment_6 ) ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1718:1: ( ( ( rule__Binding__LinkIDAssignment_6 ) ) )
            // InternalNetworkModelTest.g:1719:1: ( ( rule__Binding__LinkIDAssignment_6 ) )
            {
            // InternalNetworkModelTest.g:1719:1: ( ( rule__Binding__LinkIDAssignment_6 ) )
            // InternalNetworkModelTest.g:1720:2: ( rule__Binding__LinkIDAssignment_6 )
            {
             before(grammarAccess.getBindingAccess().getLinkIDAssignment_6()); 
            // InternalNetworkModelTest.g:1721:2: ( rule__Binding__LinkIDAssignment_6 )
            // InternalNetworkModelTest.g:1721:3: rule__Binding__LinkIDAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Binding__LinkIDAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getLinkIDAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6__Impl"


    // $ANTLR start "rule__NodeA__Group__0"
    // InternalNetworkModelTest.g:1730:1: rule__NodeA__Group__0 : rule__NodeA__Group__0__Impl rule__NodeA__Group__1 ;
    public final void rule__NodeA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1734:1: ( rule__NodeA__Group__0__Impl rule__NodeA__Group__1 )
            // InternalNetworkModelTest.g:1735:2: rule__NodeA__Group__0__Impl rule__NodeA__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NodeA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__0"


    // $ANTLR start "rule__NodeA__Group__0__Impl"
    // InternalNetworkModelTest.g:1742:1: rule__NodeA__Group__0__Impl : ( ( rule__NodeA__NameAssignment_0 ) ) ;
    public final void rule__NodeA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1746:1: ( ( ( rule__NodeA__NameAssignment_0 ) ) )
            // InternalNetworkModelTest.g:1747:1: ( ( rule__NodeA__NameAssignment_0 ) )
            {
            // InternalNetworkModelTest.g:1747:1: ( ( rule__NodeA__NameAssignment_0 ) )
            // InternalNetworkModelTest.g:1748:2: ( rule__NodeA__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAAccess().getNameAssignment_0()); 
            // InternalNetworkModelTest.g:1749:2: ( rule__NodeA__NameAssignment_0 )
            // InternalNetworkModelTest.g:1749:3: rule__NodeA__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeA__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__0__Impl"


    // $ANTLR start "rule__NodeA__Group__1"
    // InternalNetworkModelTest.g:1757:1: rule__NodeA__Group__1 : rule__NodeA__Group__1__Impl rule__NodeA__Group__2 ;
    public final void rule__NodeA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1761:1: ( rule__NodeA__Group__1__Impl rule__NodeA__Group__2 )
            // InternalNetworkModelTest.g:1762:2: rule__NodeA__Group__1__Impl rule__NodeA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__1"


    // $ANTLR start "rule__NodeA__Group__1__Impl"
    // InternalNetworkModelTest.g:1769:1: rule__NodeA__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1773:1: ( ( '.' ) )
            // InternalNetworkModelTest.g:1774:1: ( '.' )
            {
            // InternalNetworkModelTest.g:1774:1: ( '.' )
            // InternalNetworkModelTest.g:1775:2: '.'
            {
             before(grammarAccess.getNodeAAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNodeAAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__1__Impl"


    // $ANTLR start "rule__NodeA__Group__2"
    // InternalNetworkModelTest.g:1784:1: rule__NodeA__Group__2 : rule__NodeA__Group__2__Impl ;
    public final void rule__NodeA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1788:1: ( rule__NodeA__Group__2__Impl )
            // InternalNetworkModelTest.g:1789:2: rule__NodeA__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeA__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__2"


    // $ANTLR start "rule__NodeA__Group__2__Impl"
    // InternalNetworkModelTest.g:1795:1: rule__NodeA__Group__2__Impl : ( ( rule__NodeA__EthAssignment_2 ) ) ;
    public final void rule__NodeA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1799:1: ( ( ( rule__NodeA__EthAssignment_2 ) ) )
            // InternalNetworkModelTest.g:1800:1: ( ( rule__NodeA__EthAssignment_2 ) )
            {
            // InternalNetworkModelTest.g:1800:1: ( ( rule__NodeA__EthAssignment_2 ) )
            // InternalNetworkModelTest.g:1801:2: ( rule__NodeA__EthAssignment_2 )
            {
             before(grammarAccess.getNodeAAccess().getEthAssignment_2()); 
            // InternalNetworkModelTest.g:1802:2: ( rule__NodeA__EthAssignment_2 )
            // InternalNetworkModelTest.g:1802:3: rule__NodeA__EthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeA__EthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAAccess().getEthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__Group__2__Impl"


    // $ANTLR start "rule__NodeB__Group__0"
    // InternalNetworkModelTest.g:1811:1: rule__NodeB__Group__0 : rule__NodeB__Group__0__Impl rule__NodeB__Group__1 ;
    public final void rule__NodeB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1815:1: ( rule__NodeB__Group__0__Impl rule__NodeB__Group__1 )
            // InternalNetworkModelTest.g:1816:2: rule__NodeB__Group__0__Impl rule__NodeB__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NodeB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__0"


    // $ANTLR start "rule__NodeB__Group__0__Impl"
    // InternalNetworkModelTest.g:1823:1: rule__NodeB__Group__0__Impl : ( ( rule__NodeB__NameAssignment_0 ) ) ;
    public final void rule__NodeB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1827:1: ( ( ( rule__NodeB__NameAssignment_0 ) ) )
            // InternalNetworkModelTest.g:1828:1: ( ( rule__NodeB__NameAssignment_0 ) )
            {
            // InternalNetworkModelTest.g:1828:1: ( ( rule__NodeB__NameAssignment_0 ) )
            // InternalNetworkModelTest.g:1829:2: ( rule__NodeB__NameAssignment_0 )
            {
             before(grammarAccess.getNodeBAccess().getNameAssignment_0()); 
            // InternalNetworkModelTest.g:1830:2: ( rule__NodeB__NameAssignment_0 )
            // InternalNetworkModelTest.g:1830:3: rule__NodeB__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeB__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeBAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__0__Impl"


    // $ANTLR start "rule__NodeB__Group__1"
    // InternalNetworkModelTest.g:1838:1: rule__NodeB__Group__1 : rule__NodeB__Group__1__Impl rule__NodeB__Group__2 ;
    public final void rule__NodeB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1842:1: ( rule__NodeB__Group__1__Impl rule__NodeB__Group__2 )
            // InternalNetworkModelTest.g:1843:2: rule__NodeB__Group__1__Impl rule__NodeB__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__1"


    // $ANTLR start "rule__NodeB__Group__1__Impl"
    // InternalNetworkModelTest.g:1850:1: rule__NodeB__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1854:1: ( ( '.' ) )
            // InternalNetworkModelTest.g:1855:1: ( '.' )
            {
            // InternalNetworkModelTest.g:1855:1: ( '.' )
            // InternalNetworkModelTest.g:1856:2: '.'
            {
             before(grammarAccess.getNodeBAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNodeBAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__1__Impl"


    // $ANTLR start "rule__NodeB__Group__2"
    // InternalNetworkModelTest.g:1865:1: rule__NodeB__Group__2 : rule__NodeB__Group__2__Impl ;
    public final void rule__NodeB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1869:1: ( rule__NodeB__Group__2__Impl )
            // InternalNetworkModelTest.g:1870:2: rule__NodeB__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeB__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__2"


    // $ANTLR start "rule__NodeB__Group__2__Impl"
    // InternalNetworkModelTest.g:1876:1: rule__NodeB__Group__2__Impl : ( ( rule__NodeB__EthAssignment_2 ) ) ;
    public final void rule__NodeB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1880:1: ( ( ( rule__NodeB__EthAssignment_2 ) ) )
            // InternalNetworkModelTest.g:1881:1: ( ( rule__NodeB__EthAssignment_2 ) )
            {
            // InternalNetworkModelTest.g:1881:1: ( ( rule__NodeB__EthAssignment_2 ) )
            // InternalNetworkModelTest.g:1882:2: ( rule__NodeB__EthAssignment_2 )
            {
             before(grammarAccess.getNodeBAccess().getEthAssignment_2()); 
            // InternalNetworkModelTest.g:1883:2: ( rule__NodeB__EthAssignment_2 )
            // InternalNetworkModelTest.g:1883:3: rule__NodeB__EthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeB__EthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeBAccess().getEthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalNetworkModelTest.g:1892:1: rule__Model__ElementsAssignment : ( ruleNodeElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1896:1: ( ( ruleNodeElement ) )
            // InternalNetworkModelTest.g:1897:2: ( ruleNodeElement )
            {
            // InternalNetworkModelTest.g:1897:2: ( ruleNodeElement )
            // InternalNetworkModelTest.g:1898:3: ruleNodeElement
            {
             before(grammarAccess.getModelAccess().getElementsNodeElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsNodeElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalNetworkModelTest.g:1907:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1911:1: ( ( ruleQualifiedName ) )
            // InternalNetworkModelTest.g:1912:2: ( ruleQualifiedName )
            {
            // InternalNetworkModelTest.g:1912:2: ( ruleQualifiedName )
            // InternalNetworkModelTest.g:1913:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalNetworkModelTest.g:1922:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleNodeElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1926:1: ( ( ruleNodeElement ) )
            // InternalNetworkModelTest.g:1927:2: ( ruleNodeElement )
            {
            // InternalNetworkModelTest.g:1927:2: ( ruleNodeElement )
            // InternalNetworkModelTest.g:1928:3: ruleNodeElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsNodeElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsNodeElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNameSpaceAssignment_1"
    // InternalNetworkModelTest.g:1937:1: rule__Import__ImportedNameSpaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNameSpaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1941:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalNetworkModelTest.g:1942:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalNetworkModelTest.g:1942:2: ( ruleQualifiedNameWithWildcard )
            // InternalNetworkModelTest.g:1943:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNameSpaceAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalNetworkModelTest.g:1952:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1956:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:1957:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:1957:2: ( RULE_ID )
            // InternalNetworkModelTest.g:1958:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Config__NameAssignment_1"
    // InternalNetworkModelTest.g:1967:1: rule__Config__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Config__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1971:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:1972:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:1972:2: ( RULE_ID )
            // InternalNetworkModelTest.g:1973:3: RULE_ID
            {
             before(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__NameAssignment_1"


    // $ANTLR start "rule__Config__SuperTypeAssignment_2_1"
    // InternalNetworkModelTest.g:1982:1: rule__Config__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Config__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:1986:1: ( ( ( ruleQualifiedName ) ) )
            // InternalNetworkModelTest.g:1987:2: ( ( ruleQualifiedName ) )
            {
            // InternalNetworkModelTest.g:1987:2: ( ( ruleQualifiedName ) )
            // InternalNetworkModelTest.g:1988:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConfigAccess().getSuperTypeConfigCrossReference_2_1_0()); 
            // InternalNetworkModelTest.g:1989:3: ( ruleQualifiedName )
            // InternalNetworkModelTest.g:1990:4: ruleQualifiedName
            {
             before(grammarAccess.getConfigAccess().getSuperTypeConfigQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getSuperTypeConfigQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getConfigAccess().getSuperTypeConfigCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Config__NodeAssignment_4"
    // InternalNetworkModelTest.g:2001:1: rule__Config__NodeAssignment_4 : ( ruleNode ) ;
    public final void rule__Config__NodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2005:1: ( ( ruleNode ) )
            // InternalNetworkModelTest.g:2006:2: ( ruleNode )
            {
            // InternalNetworkModelTest.g:2006:2: ( ruleNode )
            // InternalNetworkModelTest.g:2007:3: ruleNode
            {
             before(grammarAccess.getConfigAccess().getNodeNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getNodeNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__NodeAssignment_4"


    // $ANTLR start "rule__Config__BindingAssignment_5"
    // InternalNetworkModelTest.g:2016:1: rule__Config__BindingAssignment_5 : ( ruleBinding ) ;
    public final void rule__Config__BindingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2020:1: ( ( ruleBinding ) )
            // InternalNetworkModelTest.g:2021:2: ( ruleBinding )
            {
            // InternalNetworkModelTest.g:2021:2: ( ruleBinding )
            // InternalNetworkModelTest.g:2022:3: ruleBinding
            {
             before(grammarAccess.getConfigAccess().getBindingBindingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getBindingBindingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__BindingAssignment_5"


    // $ANTLR start "rule__Node__NodetypeAssignment_0"
    // InternalNetworkModelTest.g:2031:1: rule__Node__NodetypeAssignment_0 : ( ruleNodeType ) ;
    public final void rule__Node__NodetypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2035:1: ( ( ruleNodeType ) )
            // InternalNetworkModelTest.g:2036:2: ( ruleNodeType )
            {
            // InternalNetworkModelTest.g:2036:2: ( ruleNodeType )
            // InternalNetworkModelTest.g:2037:3: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getNodetypeNodeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNodetypeNodeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodetypeAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalNetworkModelTest.g:2046:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2050:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:2051:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:2051:2: ( RULE_ID )
            // InternalNetworkModelTest.g:2052:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__ImageAssignment_3_1"
    // InternalNetworkModelTest.g:2061:1: rule__Node__ImageAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__ImageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2065:1: ( ( RULE_STRING ) )
            // InternalNetworkModelTest.g:2066:2: ( RULE_STRING )
            {
            // InternalNetworkModelTest.g:2066:2: ( RULE_STRING )
            // InternalNetworkModelTest.g:2067:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getImageSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getImageSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ImageAssignment_3_1"


    // $ANTLR start "rule__Node__NodeNameAssignment_5"
    // InternalNetworkModelTest.g:2076:1: rule__Node__NodeNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Node__NodeNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2080:1: ( ( RULE_STRING ) )
            // InternalNetworkModelTest.g:2081:2: ( RULE_STRING )
            {
            // InternalNetworkModelTest.g:2081:2: ( RULE_STRING )
            // InternalNetworkModelTest.g:2082:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodeNameAssignment_5"


    // $ANTLR start "rule__Node__NodeIDAssignment_7"
    // InternalNetworkModelTest.g:2091:1: rule__Node__NodeIDAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Node__NodeIDAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2095:1: ( ( RULE_STRING ) )
            // InternalNetworkModelTest.g:2096:2: ( RULE_STRING )
            {
            // InternalNetworkModelTest.g:2096:2: ( RULE_STRING )
            // InternalNetworkModelTest.g:2097:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getNodeIDSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeIDSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodeIDAssignment_7"


    // $ANTLR start "rule__Node__NodeIPAssignment_8_1"
    // InternalNetworkModelTest.g:2106:1: rule__Node__NodeIPAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Node__NodeIPAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2110:1: ( ( RULE_STRING ) )
            // InternalNetworkModelTest.g:2111:2: ( RULE_STRING )
            {
            // InternalNetworkModelTest.g:2111:2: ( RULE_STRING )
            // InternalNetworkModelTest.g:2112:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getNodeIPSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeIPSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodeIPAssignment_8_1"


    // $ANTLR start "rule__NodeType__NodetypeAssignment"
    // InternalNetworkModelTest.g:2121:1: rule__NodeType__NodetypeAssignment : ( ( rule__NodeType__NodetypeAlternatives_0 ) ) ;
    public final void rule__NodeType__NodetypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2125:1: ( ( ( rule__NodeType__NodetypeAlternatives_0 ) ) )
            // InternalNetworkModelTest.g:2126:2: ( ( rule__NodeType__NodetypeAlternatives_0 ) )
            {
            // InternalNetworkModelTest.g:2126:2: ( ( rule__NodeType__NodetypeAlternatives_0 ) )
            // InternalNetworkModelTest.g:2127:3: ( rule__NodeType__NodetypeAlternatives_0 )
            {
             before(grammarAccess.getNodeTypeAccess().getNodetypeAlternatives_0()); 
            // InternalNetworkModelTest.g:2128:3: ( rule__NodeType__NodetypeAlternatives_0 )
            // InternalNetworkModelTest.g:2128:4: rule__NodeType__NodetypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__NodetypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getNodetypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__NodetypeAssignment"


    // $ANTLR start "rule__Binding__NodeAAssignment_1"
    // InternalNetworkModelTest.g:2136:1: rule__Binding__NodeAAssignment_1 : ( ruleNodeA ) ;
    public final void rule__Binding__NodeAAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2140:1: ( ( ruleNodeA ) )
            // InternalNetworkModelTest.g:2141:2: ( ruleNodeA )
            {
            // InternalNetworkModelTest.g:2141:2: ( ruleNodeA )
            // InternalNetworkModelTest.g:2142:3: ruleNodeA
            {
             before(grammarAccess.getBindingAccess().getNodeANodeAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeA();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getNodeANodeAParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__NodeAAssignment_1"


    // $ANTLR start "rule__Binding__NodeBAssignment_3"
    // InternalNetworkModelTest.g:2151:1: rule__Binding__NodeBAssignment_3 : ( ruleNodeB ) ;
    public final void rule__Binding__NodeBAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2155:1: ( ( ruleNodeB ) )
            // InternalNetworkModelTest.g:2156:2: ( ruleNodeB )
            {
            // InternalNetworkModelTest.g:2156:2: ( ruleNodeB )
            // InternalNetworkModelTest.g:2157:3: ruleNodeB
            {
             before(grammarAccess.getBindingAccess().getNodeBNodeBParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeB();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getNodeBNodeBParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__NodeBAssignment_3"


    // $ANTLR start "rule__Binding__LinkIDAssignment_6"
    // InternalNetworkModelTest.g:2166:1: rule__Binding__LinkIDAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Binding__LinkIDAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2170:1: ( ( RULE_STRING ) )
            // InternalNetworkModelTest.g:2171:2: ( RULE_STRING )
            {
            // InternalNetworkModelTest.g:2171:2: ( RULE_STRING )
            // InternalNetworkModelTest.g:2172:3: RULE_STRING
            {
             before(grammarAccess.getBindingAccess().getLinkIDSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLinkIDSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__LinkIDAssignment_6"


    // $ANTLR start "rule__NodeA__NameAssignment_0"
    // InternalNetworkModelTest.g:2181:1: rule__NodeA__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NodeA__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2185:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:2186:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:2186:2: ( RULE_ID )
            // InternalNetworkModelTest.g:2187:3: RULE_ID
            {
             before(grammarAccess.getNodeAAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__NameAssignment_0"


    // $ANTLR start "rule__NodeA__EthAssignment_2"
    // InternalNetworkModelTest.g:2196:1: rule__NodeA__EthAssignment_2 : ( RULE_ID ) ;
    public final void rule__NodeA__EthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2200:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:2201:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:2201:2: ( RULE_ID )
            // InternalNetworkModelTest.g:2202:3: RULE_ID
            {
             before(grammarAccess.getNodeAAccess().getEthIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAAccess().getEthIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeA__EthAssignment_2"


    // $ANTLR start "rule__NodeB__NameAssignment_0"
    // InternalNetworkModelTest.g:2211:1: rule__NodeB__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NodeB__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2215:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:2216:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:2216:2: ( RULE_ID )
            // InternalNetworkModelTest.g:2217:3: RULE_ID
            {
             before(grammarAccess.getNodeBAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeBAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__NameAssignment_0"


    // $ANTLR start "rule__NodeB__EthAssignment_2"
    // InternalNetworkModelTest.g:2226:1: rule__NodeB__EthAssignment_2 : ( RULE_ID ) ;
    public final void rule__NodeB__EthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNetworkModelTest.g:2230:1: ( ( RULE_ID ) )
            // InternalNetworkModelTest.g:2231:2: ( RULE_ID )
            {
            // InternalNetworkModelTest.g:2231:2: ( RULE_ID )
            // InternalNetworkModelTest.g:2232:3: RULE_ID
            {
             before(grammarAccess.getNodeBAccess().getEthIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeBAccess().getEthIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeB__EthAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003440002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003540000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});

}