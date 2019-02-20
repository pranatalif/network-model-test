package fr.inria.diverse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.services.NetworkModelTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNetworkModelTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'config'", "'extends'", "'image:'", "'name:'", "'nodeID:'", "'eth0.IP:'", "'Docker'", "'OVS'", "'EthSwitch'", "'Firefox'", "'UbuntuDesktop'", "'NAT'", "'Cloud'", "'bind'", "'and'", "'with'", "'linkID:'"
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

        public InternalNetworkModelTestParser(TokenStream input, NetworkModelTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected NetworkModelTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalNetworkModelTest.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalNetworkModelTest.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalNetworkModelTest.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalNetworkModelTest.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleNodeElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:77:2: ( ( (lv_elements_0_0= ruleNodeElement ) )* )
            // InternalNetworkModelTest.g:78:2: ( (lv_elements_0_0= ruleNodeElement ) )*
            {
            // InternalNetworkModelTest.g:78:2: ( (lv_elements_0_0= ruleNodeElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNetworkModelTest.g:79:3: (lv_elements_0_0= ruleNodeElement )
            	    {
            	    // InternalNetworkModelTest.g:79:3: (lv_elements_0_0= ruleNodeElement )
            	    // InternalNetworkModelTest.g:80:4: lv_elements_0_0= ruleNodeElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsNodeElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleNodeElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"fr.inria.diverse.NetworkModelTest.NodeElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeElement"
    // InternalNetworkModelTest.g:100:1: entryRuleNodeElement returns [EObject current=null] : iv_ruleNodeElement= ruleNodeElement EOF ;
    public final EObject entryRuleNodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeElement = null;


        try {
            // InternalNetworkModelTest.g:100:52: (iv_ruleNodeElement= ruleNodeElement EOF )
            // InternalNetworkModelTest.g:101:2: iv_ruleNodeElement= ruleNodeElement EOF
            {
             newCompositeNode(grammarAccess.getNodeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeElement=ruleNodeElement();

            state._fsp--;

             current =iv_ruleNodeElement; 
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
    // $ANTLR end "entryRuleNodeElement"


    // $ANTLR start "ruleNodeElement"
    // InternalNetworkModelTest.g:107:1: ruleNodeElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_Type_2= ruleType ) ;
    public final EObject ruleNodeElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Import_1 = null;

        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:113:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_Type_2= ruleType ) )
            // InternalNetworkModelTest.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_Type_2= ruleType )
            {
            // InternalNetworkModelTest.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_Type_2= ruleType )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
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
                    // InternalNetworkModelTest.g:115:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getNodeElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:124:3: this_Import_1= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getNodeElementAccess().getImportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_1=ruleImport();

                    state._fsp--;


                    			current = this_Import_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalNetworkModelTest.g:133:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getNodeElementAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current = this_Type_2;
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
    // $ANTLR end "ruleNodeElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalNetworkModelTest.g:145:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalNetworkModelTest.g:145:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalNetworkModelTest.g:146:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalNetworkModelTest.g:152:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNodeElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:158:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNodeElement ) )* otherlv_4= '}' ) )
            // InternalNetworkModelTest.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNodeElement ) )* otherlv_4= '}' )
            {
            // InternalNetworkModelTest.g:159:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNodeElement ) )* otherlv_4= '}' )
            // InternalNetworkModelTest.g:160:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNodeElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalNetworkModelTest.g:164:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalNetworkModelTest.g:165:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalNetworkModelTest.g:165:4: (lv_name_1_0= ruleQualifiedName )
            // InternalNetworkModelTest.g:166:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.NetworkModelTest.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalNetworkModelTest.g:187:3: ( (lv_elements_3_0= ruleNodeElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==15||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNetworkModelTest.g:188:4: (lv_elements_3_0= ruleNodeElement )
            	    {
            	    // InternalNetworkModelTest.g:188:4: (lv_elements_3_0= ruleNodeElement )
            	    // InternalNetworkModelTest.g:189:5: lv_elements_3_0= ruleNodeElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsNodeElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleNodeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"fr.inria.diverse.NetworkModelTest.NodeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNetworkModelTest.g:214:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNetworkModelTest.g:214:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNetworkModelTest.g:215:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalNetworkModelTest.g:221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalNetworkModelTest.g:227:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalNetworkModelTest.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalNetworkModelTest.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalNetworkModelTest.g:229:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalNetworkModelTest.g:236:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNetworkModelTest.g:237:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleImport"
    // InternalNetworkModelTest.g:254:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalNetworkModelTest.g:254:47: (iv_ruleImport= ruleImport EOF )
            // InternalNetworkModelTest.g:255:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalNetworkModelTest.g:261:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNameSpace_1_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:267:2: ( (otherlv_0= 'import' ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalNetworkModelTest.g:268:2: (otherlv_0= 'import' ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalNetworkModelTest.g:268:2: (otherlv_0= 'import' ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalNetworkModelTest.g:269:3: otherlv_0= 'import' ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalNetworkModelTest.g:273:3: ( (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalNetworkModelTest.g:274:4: (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalNetworkModelTest.g:274:4: (lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard )
            // InternalNetworkModelTest.g:275:5: lv_importedNameSpace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNameSpace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNameSpace",
            						lv_importedNameSpace_1_0,
            						"fr.inria.diverse.NetworkModelTest.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalNetworkModelTest.g:296:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalNetworkModelTest.g:296:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalNetworkModelTest.g:297:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalNetworkModelTest.g:303:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:309:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalNetworkModelTest.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalNetworkModelTest.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalNetworkModelTest.g:311:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalNetworkModelTest.g:321:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNetworkModelTest.g:322:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalNetworkModelTest.g:332:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalNetworkModelTest.g:332:45: (iv_ruleType= ruleType EOF )
            // InternalNetworkModelTest.g:333:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalNetworkModelTest.g:339:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Config_1= ruleConfig ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Config_1 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:345:2: ( (this_DataType_0= ruleDataType | this_Config_1= ruleConfig ) )
            // InternalNetworkModelTest.g:346:2: (this_DataType_0= ruleDataType | this_Config_1= ruleConfig )
            {
            // InternalNetworkModelTest.g:346:2: (this_DataType_0= ruleDataType | this_Config_1= ruleConfig )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNetworkModelTest.g:347:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:356:3: this_Config_1= ruleConfig
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getConfigParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Config_1=ruleConfig();

                    state._fsp--;


                    			current = this_Config_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalNetworkModelTest.g:368:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalNetworkModelTest.g:368:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalNetworkModelTest.g:369:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalNetworkModelTest.g:375:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalNetworkModelTest.g:381:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalNetworkModelTest.g:382:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalNetworkModelTest.g:382:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalNetworkModelTest.g:383:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalNetworkModelTest.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNetworkModelTest.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalNetworkModelTest.g:389:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleConfig"
    // InternalNetworkModelTest.g:409:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalNetworkModelTest.g:409:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalNetworkModelTest.g:410:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalNetworkModelTest.g:416:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_node_5_0= ruleNode ) )+ ( (lv_binding_6_0= ruleBinding ) )+ otherlv_7= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_node_5_0 = null;

        EObject lv_binding_6_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:422:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_node_5_0= ruleNode ) )+ ( (lv_binding_6_0= ruleBinding ) )+ otherlv_7= '}' ) )
            // InternalNetworkModelTest.g:423:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_node_5_0= ruleNode ) )+ ( (lv_binding_6_0= ruleBinding ) )+ otherlv_7= '}' )
            {
            // InternalNetworkModelTest.g:423:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_node_5_0= ruleNode ) )+ ( (lv_binding_6_0= ruleBinding ) )+ otherlv_7= '}' )
            // InternalNetworkModelTest.g:424:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_node_5_0= ruleNode ) )+ ( (lv_binding_6_0= ruleBinding ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            // InternalNetworkModelTest.g:428:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNetworkModelTest.g:429:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:429:4: (lv_name_1_0= RULE_ID )
            // InternalNetworkModelTest.g:430:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNetworkModelTest.g:446:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNetworkModelTest.g:447:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNetworkModelTest.g:451:4: ( ( ruleQualifiedName ) )
                    // InternalNetworkModelTest.g:452:5: ( ruleQualifiedName )
                    {
                    // InternalNetworkModelTest.g:452:5: ( ruleQualifiedName )
                    // InternalNetworkModelTest.g:453:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConfigAccess().getSuperTypeConfigCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNetworkModelTest.g:472:3: ( (lv_node_5_0= ruleNode ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNetworkModelTest.g:473:4: (lv_node_5_0= ruleNode )
            	    {
            	    // InternalNetworkModelTest.g:473:4: (lv_node_5_0= ruleNode )
            	    // InternalNetworkModelTest.g:474:5: lv_node_5_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getNodeNodeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_node_5_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"node",
            	    						lv_node_5_0,
            	    						"fr.inria.diverse.NetworkModelTest.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalNetworkModelTest.g:491:3: ( (lv_binding_6_0= ruleBinding ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNetworkModelTest.g:492:4: (lv_binding_6_0= ruleBinding )
            	    {
            	    // InternalNetworkModelTest.g:492:4: (lv_binding_6_0= ruleBinding )
            	    // InternalNetworkModelTest.g:493:5: lv_binding_6_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getBindingBindingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_binding_6_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"binding",
            	    						lv_binding_6_0,
            	    						"fr.inria.diverse.NetworkModelTest.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleNode"
    // InternalNetworkModelTest.g:518:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalNetworkModelTest.g:518:45: (iv_ruleNode= ruleNode EOF )
            // InternalNetworkModelTest.g:519:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalNetworkModelTest.g:525:1: ruleNode returns [EObject current=null] : ( ( (lv_nodetype_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )? otherlv_5= 'name:' ( (lv_nodeName_6_0= RULE_STRING ) ) otherlv_7= 'nodeID:' ( (lv_nodeID_8_0= RULE_STRING ) ) (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_image_4_0=null;
        Token otherlv_5=null;
        Token lv_nodeName_6_0=null;
        Token otherlv_7=null;
        Token lv_nodeID_8_0=null;
        Token otherlv_9=null;
        Token lv_nodeIP_10_0=null;
        Token otherlv_11=null;
        EObject lv_nodetype_0_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:531:2: ( ( ( (lv_nodetype_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )? otherlv_5= 'name:' ( (lv_nodeName_6_0= RULE_STRING ) ) otherlv_7= 'nodeID:' ( (lv_nodeID_8_0= RULE_STRING ) ) (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // InternalNetworkModelTest.g:532:2: ( ( (lv_nodetype_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )? otherlv_5= 'name:' ( (lv_nodeName_6_0= RULE_STRING ) ) otherlv_7= 'nodeID:' ( (lv_nodeID_8_0= RULE_STRING ) ) (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // InternalNetworkModelTest.g:532:2: ( ( (lv_nodetype_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )? otherlv_5= 'name:' ( (lv_nodeName_6_0= RULE_STRING ) ) otherlv_7= 'nodeID:' ( (lv_nodeID_8_0= RULE_STRING ) ) (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // InternalNetworkModelTest.g:533:3: ( (lv_nodetype_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )? otherlv_5= 'name:' ( (lv_nodeName_6_0= RULE_STRING ) ) otherlv_7= 'nodeID:' ( (lv_nodeID_8_0= RULE_STRING ) ) (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // InternalNetworkModelTest.g:533:3: ( (lv_nodetype_0_0= ruleNodeType ) )
            // InternalNetworkModelTest.g:534:4: (lv_nodetype_0_0= ruleNodeType )
            {
            // InternalNetworkModelTest.g:534:4: (lv_nodetype_0_0= ruleNodeType )
            // InternalNetworkModelTest.g:535:5: lv_nodetype_0_0= ruleNodeType
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNodetypeNodeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_nodetype_0_0=ruleNodeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"nodetype",
            						lv_nodetype_0_0,
            						"fr.inria.diverse.NetworkModelTest.NodeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNetworkModelTest.g:552:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNetworkModelTest.g:553:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:553:4: (lv_name_1_0= RULE_ID )
            // InternalNetworkModelTest.g:554:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalNetworkModelTest.g:574:3: (otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNetworkModelTest.g:575:4: otherlv_3= 'image:' ( (lv_image_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getImageKeyword_3_0());
                    			
                    // InternalNetworkModelTest.g:579:4: ( (lv_image_4_0= RULE_STRING ) )
                    // InternalNetworkModelTest.g:580:5: (lv_image_4_0= RULE_STRING )
                    {
                    // InternalNetworkModelTest.g:580:5: (lv_image_4_0= RULE_STRING )
                    // InternalNetworkModelTest.g:581:6: lv_image_4_0= RULE_STRING
                    {
                    lv_image_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_image_4_0, grammarAccess.getNodeAccess().getImageSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"image",
                    							lv_image_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getNameKeyword_4());
            		
            // InternalNetworkModelTest.g:602:3: ( (lv_nodeName_6_0= RULE_STRING ) )
            // InternalNetworkModelTest.g:603:4: (lv_nodeName_6_0= RULE_STRING )
            {
            // InternalNetworkModelTest.g:603:4: (lv_nodeName_6_0= RULE_STRING )
            // InternalNetworkModelTest.g:604:5: lv_nodeName_6_0= RULE_STRING
            {
            lv_nodeName_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_nodeName_6_0, grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeName",
            						lv_nodeName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getNodeIDKeyword_6());
            		
            // InternalNetworkModelTest.g:624:3: ( (lv_nodeID_8_0= RULE_STRING ) )
            // InternalNetworkModelTest.g:625:4: (lv_nodeID_8_0= RULE_STRING )
            {
            // InternalNetworkModelTest.g:625:4: (lv_nodeID_8_0= RULE_STRING )
            // InternalNetworkModelTest.g:626:5: lv_nodeID_8_0= RULE_STRING
            {
            lv_nodeID_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_nodeID_8_0, grammarAccess.getNodeAccess().getNodeIDSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeID",
            						lv_nodeID_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalNetworkModelTest.g:642:3: (otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNetworkModelTest.g:643:4: otherlv_9= 'eth0.IP:' ( (lv_nodeIP_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getEth0IPKeyword_8_0());
                    			
                    // InternalNetworkModelTest.g:647:4: ( (lv_nodeIP_10_0= RULE_STRING ) )
                    // InternalNetworkModelTest.g:648:5: (lv_nodeIP_10_0= RULE_STRING )
                    {
                    // InternalNetworkModelTest.g:648:5: (lv_nodeIP_10_0= RULE_STRING )
                    // InternalNetworkModelTest.g:649:6: lv_nodeIP_10_0= RULE_STRING
                    {
                    lv_nodeIP_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_nodeIP_10_0, grammarAccess.getNodeAccess().getNodeIPSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nodeIP",
                    							lv_nodeIP_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeType"
    // InternalNetworkModelTest.g:674:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // InternalNetworkModelTest.g:674:49: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalNetworkModelTest.g:675:2: iv_ruleNodeType= ruleNodeType EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;

             current =iv_ruleNodeType; 
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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalNetworkModelTest.g:681:1: ruleNodeType returns [EObject current=null] : ( ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) ) ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token lv_nodetype_0_1=null;
        Token lv_nodetype_0_2=null;
        Token lv_nodetype_0_3=null;
        Token lv_nodetype_0_4=null;
        Token lv_nodetype_0_5=null;
        Token lv_nodetype_0_6=null;
        Token lv_nodetype_0_7=null;


        	enterRule();

        try {
            // InternalNetworkModelTest.g:687:2: ( ( ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) ) ) )
            // InternalNetworkModelTest.g:688:2: ( ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) ) )
            {
            // InternalNetworkModelTest.g:688:2: ( ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) ) )
            // InternalNetworkModelTest.g:689:3: ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) )
            {
            // InternalNetworkModelTest.g:689:3: ( (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' ) )
            // InternalNetworkModelTest.g:690:4: (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' )
            {
            // InternalNetworkModelTest.g:690:4: (lv_nodetype_0_1= 'Docker' | lv_nodetype_0_2= 'OVS' | lv_nodetype_0_3= 'EthSwitch' | lv_nodetype_0_4= 'Firefox' | lv_nodetype_0_5= 'UbuntuDesktop' | lv_nodetype_0_6= 'NAT' | lv_nodetype_0_7= 'Cloud' )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            case 28:
                {
                alt12=5;
                }
                break;
            case 29:
                {
                alt12=6;
                }
                break;
            case 30:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalNetworkModelTest.g:691:5: lv_nodetype_0_1= 'Docker'
                    {
                    lv_nodetype_0_1=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_1, grammarAccess.getNodeTypeAccess().getNodetypeDockerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalNetworkModelTest.g:702:5: lv_nodetype_0_2= 'OVS'
                    {
                    lv_nodetype_0_2=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_2, grammarAccess.getNodeTypeAccess().getNodetypeOVSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalNetworkModelTest.g:713:5: lv_nodetype_0_3= 'EthSwitch'
                    {
                    lv_nodetype_0_3=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_3, grammarAccess.getNodeTypeAccess().getNodetypeEthSwitchKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalNetworkModelTest.g:724:5: lv_nodetype_0_4= 'Firefox'
                    {
                    lv_nodetype_0_4=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_4, grammarAccess.getNodeTypeAccess().getNodetypeFirefoxKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalNetworkModelTest.g:735:5: lv_nodetype_0_5= 'UbuntuDesktop'
                    {
                    lv_nodetype_0_5=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_5, grammarAccess.getNodeTypeAccess().getNodetypeUbuntuDesktopKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalNetworkModelTest.g:746:5: lv_nodetype_0_6= 'NAT'
                    {
                    lv_nodetype_0_6=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_6, grammarAccess.getNodeTypeAccess().getNodetypeNATKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalNetworkModelTest.g:757:5: lv_nodetype_0_7= 'Cloud'
                    {
                    lv_nodetype_0_7=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_nodetype_0_7, grammarAccess.getNodeTypeAccess().getNodetypeCloudKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTypeRule());
                    					}
                    					setWithLastConsumed(current, "nodetype", lv_nodetype_0_7, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleBinding"
    // InternalNetworkModelTest.g:773:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalNetworkModelTest.g:773:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalNetworkModelTest.g:774:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalNetworkModelTest.g:780:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_nodeA_1_0= ruleNodeA ) ) otherlv_2= 'and' ( (lv_nodeB_3_0= ruleNodeB ) ) otherlv_4= 'with' otherlv_5= 'linkID:' ( (lv_linkID_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_linkID_6_0=null;
        EObject lv_nodeA_1_0 = null;

        EObject lv_nodeB_3_0 = null;



        	enterRule();

        try {
            // InternalNetworkModelTest.g:786:2: ( (otherlv_0= 'bind' ( (lv_nodeA_1_0= ruleNodeA ) ) otherlv_2= 'and' ( (lv_nodeB_3_0= ruleNodeB ) ) otherlv_4= 'with' otherlv_5= 'linkID:' ( (lv_linkID_6_0= RULE_STRING ) ) ) )
            // InternalNetworkModelTest.g:787:2: (otherlv_0= 'bind' ( (lv_nodeA_1_0= ruleNodeA ) ) otherlv_2= 'and' ( (lv_nodeB_3_0= ruleNodeB ) ) otherlv_4= 'with' otherlv_5= 'linkID:' ( (lv_linkID_6_0= RULE_STRING ) ) )
            {
            // InternalNetworkModelTest.g:787:2: (otherlv_0= 'bind' ( (lv_nodeA_1_0= ruleNodeA ) ) otherlv_2= 'and' ( (lv_nodeB_3_0= ruleNodeB ) ) otherlv_4= 'with' otherlv_5= 'linkID:' ( (lv_linkID_6_0= RULE_STRING ) ) )
            // InternalNetworkModelTest.g:788:3: otherlv_0= 'bind' ( (lv_nodeA_1_0= ruleNodeA ) ) otherlv_2= 'and' ( (lv_nodeB_3_0= ruleNodeB ) ) otherlv_4= 'with' otherlv_5= 'linkID:' ( (lv_linkID_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindKeyword_0());
            		
            // InternalNetworkModelTest.g:792:3: ( (lv_nodeA_1_0= ruleNodeA ) )
            // InternalNetworkModelTest.g:793:4: (lv_nodeA_1_0= ruleNodeA )
            {
            // InternalNetworkModelTest.g:793:4: (lv_nodeA_1_0= ruleNodeA )
            // InternalNetworkModelTest.g:794:5: lv_nodeA_1_0= ruleNodeA
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getNodeANodeAParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_nodeA_1_0=ruleNodeA();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"nodeA",
            						lv_nodeA_1_0,
            						"fr.inria.diverse.NetworkModelTest.NodeA");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getAndKeyword_2());
            		
            // InternalNetworkModelTest.g:815:3: ( (lv_nodeB_3_0= ruleNodeB ) )
            // InternalNetworkModelTest.g:816:4: (lv_nodeB_3_0= ruleNodeB )
            {
            // InternalNetworkModelTest.g:816:4: (lv_nodeB_3_0= ruleNodeB )
            // InternalNetworkModelTest.g:817:5: lv_nodeB_3_0= ruleNodeB
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getNodeBNodeBParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_nodeB_3_0=ruleNodeB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"nodeB",
            						lv_nodeB_3_0,
            						"fr.inria.diverse.NetworkModelTest.NodeB");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getLinkIDKeyword_5());
            		
            // InternalNetworkModelTest.g:842:3: ( (lv_linkID_6_0= RULE_STRING ) )
            // InternalNetworkModelTest.g:843:4: (lv_linkID_6_0= RULE_STRING )
            {
            // InternalNetworkModelTest.g:843:4: (lv_linkID_6_0= RULE_STRING )
            // InternalNetworkModelTest.g:844:5: lv_linkID_6_0= RULE_STRING
            {
            lv_linkID_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_linkID_6_0, grammarAccess.getBindingAccess().getLinkIDSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linkID",
            						lv_linkID_6_0,
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleNodeA"
    // InternalNetworkModelTest.g:864:1: entryRuleNodeA returns [EObject current=null] : iv_ruleNodeA= ruleNodeA EOF ;
    public final EObject entryRuleNodeA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeA = null;


        try {
            // InternalNetworkModelTest.g:864:46: (iv_ruleNodeA= ruleNodeA EOF )
            // InternalNetworkModelTest.g:865:2: iv_ruleNodeA= ruleNodeA EOF
            {
             newCompositeNode(grammarAccess.getNodeARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeA=ruleNodeA();

            state._fsp--;

             current =iv_ruleNodeA; 
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
    // $ANTLR end "entryRuleNodeA"


    // $ANTLR start "ruleNodeA"
    // InternalNetworkModelTest.g:871:1: ruleNodeA returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeA() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_eth_2_0=null;


        	enterRule();

        try {
            // InternalNetworkModelTest.g:877:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) ) )
            // InternalNetworkModelTest.g:878:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) )
            {
            // InternalNetworkModelTest.g:878:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) )
            // InternalNetworkModelTest.g:879:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) )
            {
            // InternalNetworkModelTest.g:879:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNetworkModelTest.g:880:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:880:4: (lv_name_0_0= RULE_ID )
            // InternalNetworkModelTest.g:881:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNodeAAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeARule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAAccess().getFullStopKeyword_1());
            		
            // InternalNetworkModelTest.g:901:3: ( (lv_eth_2_0= RULE_ID ) )
            // InternalNetworkModelTest.g:902:4: (lv_eth_2_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:902:4: (lv_eth_2_0= RULE_ID )
            // InternalNetworkModelTest.g:903:5: lv_eth_2_0= RULE_ID
            {
            lv_eth_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_eth_2_0, grammarAccess.getNodeAAccess().getEthIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeARule());
            					}
            					setWithLastConsumed(
            						current,
            						"eth",
            						lv_eth_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleNodeA"


    // $ANTLR start "entryRuleNodeB"
    // InternalNetworkModelTest.g:923:1: entryRuleNodeB returns [EObject current=null] : iv_ruleNodeB= ruleNodeB EOF ;
    public final EObject entryRuleNodeB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeB = null;


        try {
            // InternalNetworkModelTest.g:923:46: (iv_ruleNodeB= ruleNodeB EOF )
            // InternalNetworkModelTest.g:924:2: iv_ruleNodeB= ruleNodeB EOF
            {
             newCompositeNode(grammarAccess.getNodeBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeB=ruleNodeB();

            state._fsp--;

             current =iv_ruleNodeB; 
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
    // $ANTLR end "entryRuleNodeB"


    // $ANTLR start "ruleNodeB"
    // InternalNetworkModelTest.g:930:1: ruleNodeB returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeB() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_eth_2_0=null;


        	enterRule();

        try {
            // InternalNetworkModelTest.g:936:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) ) )
            // InternalNetworkModelTest.g:937:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) )
            {
            // InternalNetworkModelTest.g:937:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) ) )
            // InternalNetworkModelTest.g:938:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eth_2_0= RULE_ID ) )
            {
            // InternalNetworkModelTest.g:938:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNetworkModelTest.g:939:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:939:4: (lv_name_0_0= RULE_ID )
            // InternalNetworkModelTest.g:940:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNodeBAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeBAccess().getFullStopKeyword_1());
            		
            // InternalNetworkModelTest.g:960:3: ( (lv_eth_2_0= RULE_ID ) )
            // InternalNetworkModelTest.g:961:4: (lv_eth_2_0= RULE_ID )
            {
            // InternalNetworkModelTest.g:961:4: (lv_eth_2_0= RULE_ID )
            // InternalNetworkModelTest.g:962:5: lv_eth_2_0= RULE_ID
            {
            lv_eth_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_eth_2_0, grammarAccess.getNodeBAccess().getEthIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eth",
            						lv_eth_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleNodeB"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});

}