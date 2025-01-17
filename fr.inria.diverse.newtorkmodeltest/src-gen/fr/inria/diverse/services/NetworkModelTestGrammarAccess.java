/*
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class NetworkModelTestGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsNodeElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=NodeElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=NodeElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//NodeElement
		public RuleCall getElementsNodeElementParserRuleCall_0() { return cElementsNodeElementParserRuleCall_0; }
	}
	public class NodeElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.NodeElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cImportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//NodeElement:
		//	PackageDeclaration | Import | Type;
		@Override public ParserRule getRule() { return rule; }
		
		//PackageDeclaration | Import | Type
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }
		
		//Import
		public RuleCall getImportParserRuleCall_1() { return cImportParserRuleCall_1; }
		
		//Type
		public RuleCall getTypeParserRuleCall_2() { return cTypeParserRuleCall_2; }
	}
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsNodeElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PackageDeclaration:
		//	'package' name=QualifiedName '{'
		//	elements+=NodeElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName '{' elements+=NodeElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=NodeElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//NodeElement
		public RuleCall getElementsNodeElementParserRuleCall_3_0() { return cElementsNodeElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNameSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNameSpaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNameSpace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNameSpace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNameSpace=QualifiedNameWithWildcard
		public Assignment getImportedNameSpaceAssignment_1() { return cImportedNameSpaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNameSpaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConfigParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	DataType | Config;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Config
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Config
		public RuleCall getConfigParserRuleCall_1() { return cConfigParserRuleCall_1; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//	'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Config");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConfigKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeConfigCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeConfigQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeConfigCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNodeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNodeNodeParserRuleCall_4_0 = (RuleCall)cNodeAssignment_4.eContents().get(0);
		private final Assignment cBindingAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBindingBindingParserRuleCall_5_0 = (RuleCall)cBindingAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Config:
		//	'config' name=ID ('extends' superType=[Config|QualifiedName])? '{'
		//	node+=Node+
		//	binding+=Binding+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'config' name=ID ('extends' superType=[Config|QualifiedName])? '{' node+=Node+ binding+=Binding+ '}'
		public Group getGroup() { return cGroup; }
		
		//'config'
		public Keyword getConfigKeyword_0() { return cConfigKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Config|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Config|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Config|QualifiedName]
		public CrossReference getSuperTypeConfigCrossReference_2_1_0() { return cSuperTypeConfigCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeConfigQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeConfigQualifiedNameParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//node+=Node+
		public Assignment getNodeAssignment_4() { return cNodeAssignment_4; }
		
		//Node
		public RuleCall getNodeNodeParserRuleCall_4_0() { return cNodeNodeParserRuleCall_4_0; }
		
		//binding+=Binding+
		public Assignment getBindingAssignment_5() { return cBindingAssignment_5; }
		
		//Binding
		public RuleCall getBindingBindingParserRuleCall_5_0() { return cBindingBindingParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNodetypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNodetypeNodeTypeParserRuleCall_0_0 = (RuleCall)cNodetypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImageKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImageAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cImageSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cImageAssignment_3_1.eContents().get(0);
		private final Keyword cNameKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNodeNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNodeNameSTRINGTerminalRuleCall_5_0 = (RuleCall)cNodeNameAssignment_5.eContents().get(0);
		private final Keyword cNodeIDKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cNodeIDAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cNodeIDSTRINGTerminalRuleCall_7_0 = (RuleCall)cNodeIDAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cEth0IPKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cNodeIPAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cNodeIPSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cNodeIPAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Node:
		//	nodetype=NodeType name=ID '{' ('image:' image=STRING)?
		//	'name:' nodeName=STRING
		//	'nodeID:' nodeID=STRING ('eth0.IP:' nodeIP=STRING)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//nodetype=NodeType name=ID '{' ('image:' image=STRING)? 'name:' nodeName=STRING 'nodeID:' nodeID=STRING ('eth0.IP:'
		//nodeIP=STRING)? '}'
		public Group getGroup() { return cGroup; }
		
		//nodetype=NodeType
		public Assignment getNodetypeAssignment_0() { return cNodetypeAssignment_0; }
		
		//NodeType
		public RuleCall getNodetypeNodeTypeParserRuleCall_0_0() { return cNodetypeNodeTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('image:' image=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'image:'
		public Keyword getImageKeyword_3_0() { return cImageKeyword_3_0; }
		
		//image=STRING
		public Assignment getImageAssignment_3_1() { return cImageAssignment_3_1; }
		
		//STRING
		public RuleCall getImageSTRINGTerminalRuleCall_3_1_0() { return cImageSTRINGTerminalRuleCall_3_1_0; }
		
		//'name:'
		public Keyword getNameKeyword_4() { return cNameKeyword_4; }
		
		//nodeName=STRING
		public Assignment getNodeNameAssignment_5() { return cNodeNameAssignment_5; }
		
		//STRING
		public RuleCall getNodeNameSTRINGTerminalRuleCall_5_0() { return cNodeNameSTRINGTerminalRuleCall_5_0; }
		
		//'nodeID:'
		public Keyword getNodeIDKeyword_6() { return cNodeIDKeyword_6; }
		
		//nodeID=STRING
		public Assignment getNodeIDAssignment_7() { return cNodeIDAssignment_7; }
		
		//STRING
		public RuleCall getNodeIDSTRINGTerminalRuleCall_7_0() { return cNodeIDSTRINGTerminalRuleCall_7_0; }
		
		//('eth0.IP:' nodeIP=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'eth0.IP:'
		public Keyword getEth0IPKeyword_8_0() { return cEth0IPKeyword_8_0; }
		
		//nodeIP=STRING
		public Assignment getNodeIPAssignment_8_1() { return cNodeIPAssignment_8_1; }
		
		//STRING
		public RuleCall getNodeIPSTRINGTerminalRuleCall_8_1_0() { return cNodeIPSTRINGTerminalRuleCall_8_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class NodeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.NodeType");
		private final Assignment cNodetypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cNodetypeAlternatives_0 = (Alternatives)cNodetypeAssignment.eContents().get(0);
		private final Keyword cNodetypeDockerKeyword_0_0 = (Keyword)cNodetypeAlternatives_0.eContents().get(0);
		private final Keyword cNodetypeOVSKeyword_0_1 = (Keyword)cNodetypeAlternatives_0.eContents().get(1);
		private final Keyword cNodetypeEthSwitchKeyword_0_2 = (Keyword)cNodetypeAlternatives_0.eContents().get(2);
		private final Keyword cNodetypeFirefoxKeyword_0_3 = (Keyword)cNodetypeAlternatives_0.eContents().get(3);
		private final Keyword cNodetypeUbuntuDesktopKeyword_0_4 = (Keyword)cNodetypeAlternatives_0.eContents().get(4);
		private final Keyword cNodetypeNATKeyword_0_5 = (Keyword)cNodetypeAlternatives_0.eContents().get(5);
		private final Keyword cNodetypeCloudKeyword_0_6 = (Keyword)cNodetypeAlternatives_0.eContents().get(6);
		
		//NodeType:
		//	nodetype=('Docker' | 'OVS' | 'EthSwitch' | 'Firefox' | 'UbuntuDesktop' | 'NAT' | 'Cloud');
		@Override public ParserRule getRule() { return rule; }
		
		//nodetype=('Docker' | 'OVS' | 'EthSwitch' | 'Firefox' | 'UbuntuDesktop' | 'NAT' | 'Cloud')
		public Assignment getNodetypeAssignment() { return cNodetypeAssignment; }
		
		//('Docker' | 'OVS' | 'EthSwitch' | 'Firefox' | 'UbuntuDesktop' | 'NAT' | 'Cloud')
		public Alternatives getNodetypeAlternatives_0() { return cNodetypeAlternatives_0; }
		
		//'Docker'
		public Keyword getNodetypeDockerKeyword_0_0() { return cNodetypeDockerKeyword_0_0; }
		
		//'OVS'
		public Keyword getNodetypeOVSKeyword_0_1() { return cNodetypeOVSKeyword_0_1; }
		
		//'EthSwitch'
		public Keyword getNodetypeEthSwitchKeyword_0_2() { return cNodetypeEthSwitchKeyword_0_2; }
		
		//'Firefox'
		public Keyword getNodetypeFirefoxKeyword_0_3() { return cNodetypeFirefoxKeyword_0_3; }
		
		//'UbuntuDesktop'
		public Keyword getNodetypeUbuntuDesktopKeyword_0_4() { return cNodetypeUbuntuDesktopKeyword_0_4; }
		
		//'NAT'
		public Keyword getNodetypeNATKeyword_0_5() { return cNodetypeNATKeyword_0_5; }
		
		//'Cloud'
		public Keyword getNodetypeCloudKeyword_0_6() { return cNodetypeCloudKeyword_0_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNodeAAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNodeANodeAParserRuleCall_1_0 = (RuleCall)cNodeAAssignment_1.eContents().get(0);
		private final Keyword cAndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNodeBAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNodeBNodeBParserRuleCall_3_0 = (RuleCall)cNodeBAssignment_3.eContents().get(0);
		private final Keyword cWithKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLinkIDKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLinkIDAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLinkIDSTRINGTerminalRuleCall_6_0 = (RuleCall)cLinkIDAssignment_6.eContents().get(0);
		
		//Binding:
		//	'bind' nodeA=NodeA 'and' nodeB=NodeB 'with' 'linkID:' linkID=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'bind' nodeA=NodeA 'and' nodeB=NodeB 'with' 'linkID:' linkID=STRING
		public Group getGroup() { return cGroup; }
		
		//'bind'
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }
		
		//nodeA=NodeA
		public Assignment getNodeAAssignment_1() { return cNodeAAssignment_1; }
		
		//NodeA
		public RuleCall getNodeANodeAParserRuleCall_1_0() { return cNodeANodeAParserRuleCall_1_0; }
		
		//'and'
		public Keyword getAndKeyword_2() { return cAndKeyword_2; }
		
		//nodeB=NodeB
		public Assignment getNodeBAssignment_3() { return cNodeBAssignment_3; }
		
		//NodeB
		public RuleCall getNodeBNodeBParserRuleCall_3_0() { return cNodeBNodeBParserRuleCall_3_0; }
		
		//'with'
		public Keyword getWithKeyword_4() { return cWithKeyword_4; }
		
		//'linkID:'
		public Keyword getLinkIDKeyword_5() { return cLinkIDKeyword_5; }
		
		//linkID=STRING
		public Assignment getLinkIDAssignment_6() { return cLinkIDAssignment_6; }
		
		//STRING
		public RuleCall getLinkIDSTRINGTerminalRuleCall_6_0() { return cLinkIDSTRINGTerminalRuleCall_6_0; }
	}
	public class LinkIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.LinkID");
		private final Assignment cLinkIDAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLinkIDSTRINGTerminalRuleCall_0 = (RuleCall)cLinkIDAssignment.eContents().get(0);
		
		//LinkID:
		//	linkID=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//linkID=STRING
		public Assignment getLinkIDAssignment() { return cLinkIDAssignment; }
		
		//STRING
		public RuleCall getLinkIDSTRINGTerminalRuleCall_0() { return cLinkIDSTRINGTerminalRuleCall_0; }
	}
	public class NodeAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.NodeA");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEthIDTerminalRuleCall_2_0 = (RuleCall)cEthAssignment_2.eContents().get(0);
		
		//NodeA:
		//	name=ID '.' eth=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '.' eth=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//eth=ID
		public Assignment getEthAssignment_2() { return cEthAssignment_2; }
		
		//ID
		public RuleCall getEthIDTerminalRuleCall_2_0() { return cEthIDTerminalRuleCall_2_0; }
	}
	public class NodeBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.NetworkModelTest.NodeB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEthIDTerminalRuleCall_2_0 = (RuleCall)cEthAssignment_2.eContents().get(0);
		
		//NodeB:
		//	name=ID '.' eth=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '.' eth=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//eth=ID
		public Assignment getEthAssignment_2() { return cEthAssignment_2; }
		
		//ID
		public RuleCall getEthIDTerminalRuleCall_2_0() { return cEthIDTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final NodeElementElements pNodeElement;
	private final PackageDeclarationElements pPackageDeclaration;
	private final QualifiedNameElements pQualifiedName;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final ConfigElements pConfig;
	private final NodeElements pNode;
	private final NodeTypeElements pNodeType;
	private final BindingElements pBinding;
	private final LinkIDElements pLinkID;
	private final NodeAElements pNodeA;
	private final NodeBElements pNodeB;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NetworkModelTestGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNodeElement = new NodeElementElements();
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pConfig = new ConfigElements();
		this.pNode = new NodeElements();
		this.pNodeType = new NodeTypeElements();
		this.pBinding = new BindingElements();
		this.pLinkID = new LinkIDElements();
		this.pNodeA = new NodeAElements();
		this.pNodeB = new NodeBElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.diverse.NetworkModelTest".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=NodeElement*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NodeElement:
	//	PackageDeclaration | Import | Type;
	public NodeElementElements getNodeElementAccess() {
		return pNodeElement;
	}
	
	public ParserRule getNodeElementRule() {
		return getNodeElementAccess().getRule();
	}
	
	//PackageDeclaration:
	//	'package' name=QualifiedName '{'
	//	elements+=NodeElement*
	//	'}';
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Import:
	//	'import' importedNameSpace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//Type:
	//	DataType | Config;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//	'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Config:
	//	'config' name=ID ('extends' superType=[Config|QualifiedName])? '{'
	//	node+=Node+
	//	binding+=Binding+
	//	'}';
	public ConfigElements getConfigAccess() {
		return pConfig;
	}
	
	public ParserRule getConfigRule() {
		return getConfigAccess().getRule();
	}
	
	//Node:
	//	nodetype=NodeType name=ID '{' ('image:' image=STRING)?
	//	'name:' nodeName=STRING
	//	'nodeID:' nodeID=STRING ('eth0.IP:' nodeIP=STRING)?
	//	'}';
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//NodeType:
	//	nodetype=('Docker' | 'OVS' | 'EthSwitch' | 'Firefox' | 'UbuntuDesktop' | 'NAT' | 'Cloud');
	public NodeTypeElements getNodeTypeAccess() {
		return pNodeType;
	}
	
	public ParserRule getNodeTypeRule() {
		return getNodeTypeAccess().getRule();
	}
	
	//Binding:
	//	'bind' nodeA=NodeA 'and' nodeB=NodeB 'with' 'linkID:' linkID=STRING;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//LinkID:
	//	linkID=STRING;
	public LinkIDElements getLinkIDAccess() {
		return pLinkID;
	}
	
	public ParserRule getLinkIDRule() {
		return getLinkIDAccess().getRule();
	}
	
	//NodeA:
	//	name=ID '.' eth=ID;
	public NodeAElements getNodeAAccess() {
		return pNodeA;
	}
	
	public ParserRule getNodeARule() {
		return getNodeAAccess().getRule();
	}
	
	//NodeB:
	//	name=ID '.' eth=ID;
	public NodeBElements getNodeBAccess() {
		return pNodeB;
	}
	
	public ParserRule getNodeBRule() {
		return getNodeBAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
