package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short INT_LITERAL = 6;
		static public final short TRUE = 7;
		static public final short FALSE = 8;
		static public final short RPAREN = 9;
		static public final short RCURLY = 10;
		static public final short VOID = 11;
		static public final short BOOLEAN = 12;
		static public final short INT = 13;
		static public final short LCURLY = 14;
		static public final short SEMICOLON = 15;
		static public final short RBRACKET = 16;
		static public final short IF = 17;
		static public final short WHILE = 18;
		static public final short BREAK = 19;
		static public final short RETURN = 20;
		static public final short EQL = 21;
		static public final short IMPORT = 22;
		static public final short PUBLIC = 23;
		static public final short COMMA = 24;
		static public final short PLUS = 25;
		static public final short TIMES = 26;
		static public final short DIV = 27;
		static public final short MOD = 28;
		static public final short TYPE = 29;
		static public final short MODULE = 30;
		static public final short ELSE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LT = 34;
		static public final short LEQ = 35;
		static public final short GT = 36;
		static public final short GEQ = 37;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pLLcbKLLKK$ju5r4SOKA9YPKO80W8Y4e8CZq44cKihQBP1qz86jT9ASCnI53MpFwtwaKq" +
		"qcvLDPfbb3cMp3PPbPfFcb9Mv##vzXyVrldVVyorNQzLxwpjxxxE$lSzuppc0reP6vE9ibA" +
		"4S5QX2DSv5Fcx0OEJWT4p4JUYEdeX5Bvo2Kt4QUgDRq14zWeuuCs14aYKY4Bz$aFmC2tyAB" +
		"i3bACLmLE8oZ88c#t4RRiSqnCbo#HDzaOg16EJ5Q#dW8UGOUUFWikKL8DJ3QyLOMrujhlBq" +
		"RpScsV7aLzpiuVs2EHwUh$cvs9YVHWopU0hHMRx5rNvYfejWj5Ta4Ixq4rDZwUdZED5OcKj" +
		"znYIgldbxqcqzPzbwycmzTRQU4RQUAm9aiumKC$Lnob#8n6naUNdTgtKIJaOpPk1MBtyWUr" +
		"n0HWpEm$bem5WveBG#YCSrk1RZCG7NuNglY1BBobhzGmFuZzVkwfupT48Okc01xN2SW0WuE" +
		"ODTS0OIb3sRSzQaPZ0QKR83$TmMz$vKVZ4BaSBeEv2CkKZ306GY6qFuDHQZ7kTW9EL5k1AN" +
		"O0nkb2Sm6RV8z$8TPk5EpEDAt8L5c8$5q7#jR3EHsPEOAuMdJohpfJDZ1h#kJ7vVMTnzsSR" +
		"gvxA5FEw5WlzanB$DTq132C#qCAvTPwvLRxLINVcrrr6FDdPwDozU3nFFSOoyK9uuThmQ#j" +
		"jvtNdos$5qgwDTpPQdsxvuzlFZonFE7Lpe9wOdTrgj3x#$66jFdMfb$CNyFptMaRh76Svw1" +
		"yzMgzUzMawkrp2UKr4#LzIV7HgG4QxU4x4UJT#vVNW#nV754y#xrnfX7Lkm$kErNMhEIdd2" +
		"b$4KT$7yri$SKZBBE8SXodOOS#QUmIhMElbtM#wC9NnL3IM$ccyftHl9Vmo$ncBEiqReqid" +
		"Th7kSrAEC3FewXL6FCTOhKlZZjmaiQJAEM9xSm0fYFR6EM0Ou#4KuCgctKQxHUUq0jF6isq" +
		"0vXPX4VGknYOv5bA9oBgSlr1nd1VtHn2Z5NqNTgUedCCysoiaqc5SRepZRbNyk$JifPz8ug" +
		"EgckQLZjRARB6rDfM#tukmd3b5PothTtaCPgtX9$lhSaG#xoCqXPgWuZbqh8cQfDWxu66y5" +
		"CKVfpKIznTz0B53nbTHRLVtYmFtHvgb#wMEPh$GZr5kKVpfpRlOHjvJrlOYDrEyXxbVjXr9" +
		"N#qDxW5X8t4SiCyNUhUI3nBsckQatSUA9E9ETxDq7Xza$e5td9jrgqlS5ceEZSoB2qaQcgk" +
		"$BDlALdc$okrJTI4jSjNqRZaOLm$s8lSnRnxf89G#hyKJOnVl8DzfYJ#pGjH4#nYWMVgp5R" +
		"ZPnTnnhFuBeRuiVtzBWysabFiQu1EedVyiUGxAKF#IG$0xBJmuQvJVojMoJh#HB#K8#Dsgs" +
		"6kLd7jx7yYdBJppsHyI7n0V45dbFDijAQfla7PPl4wyJhn0loFEoKfwJ5VAiF2DForEoqOX" +
		"$LpOOShsibfTabRmeBnlse$8OopPvM1uox4UCyadYDNbLribRibRUb3Ta3MlUDtoxZF87FQ" +
		"$ib9$b9$dHDBxjHhdFO##LtpWhHmpzC8i6llGwyOxG2F2U2E7zeX7W7UFme88tGW7h2rW$d" +
		"7TK9MDSh7VHpgHino0JifYh7LMqgyWjfrvkt5WQNwCEMsIJDvZ8OJlLv5OpDfVtqH3gUGP2" +
		"#7xL#DPm6CYWdKYfen$xfqD$WmnaVGsbBwJJbqvPf916Eusos8G4jf50cUG7oMohbhAMVIn" +
		"aZaBgAPIfH7$gEkh$0T6jW24=");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

    // turn off automated error recovery
    @Override
    protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
        super.recoverFromError(new Symbol(0), in);
    }

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN6,	// [0] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [1] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [2] Imports = 
			RETURN3,	// [3] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [4] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [5] Declarations = 
			Action.RETURN,	// [6] Declaration = FuncDeclaration
			Action.RETURN,	// [7] Declaration = FieldDeclaration
			Action.RETURN,	// [8] Declaration = TypeDeclaration
			RETURN9,	// [9] FuncDeclaration = AccessibilitySpecifier TypeName ID LPAREN ParameterList RPAREN LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [10] StatementList = Statement StatementList; returns 'StatementList' although none is marked
			Action.NONE,  	// [11] StatementList = 
			RETURN4,	// [12] FieldDeclaration = AccessibilitySpecifier TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [13] TypeDeclaration = AccessibilitySpecifier TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [14] AccessibilitySpecifier = PUBLIC
			Action.NONE,  	// [15] AccessibilitySpecifier = 
			Action.RETURN,	// [16] TypeName = PrimitiveType
			Action.RETURN,	// [17] TypeName = ArrayType
			Action.RETURN,	// [18] TypeName = ID
			Action.RETURN,	// [19] PrimitiveType = VOID
			Action.RETURN,	// [20] PrimitiveType = BOOLEAN
			Action.RETURN,	// [21] PrimitiveType = INT
			RETURN3,	// [22] ArrayType = PrimitiveType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [23] ArrayType = ArrayType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [24] ArrayType = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [25] ParameterList = NotEmptyParameterList
			Action.NONE,  	// [26] ParameterList = 
			RETURN3,	// [27] NotEmptyParameterList = Parameter COMMA NotEmptyParameterList; returns 'NotEmptyParameterList' although none is marked
			Action.RETURN,	// [28] NotEmptyParameterList = Parameter
			RETURN2,	// [29] Parameter = TypeName ID; returns 'ID' although none is marked
			Action.RETURN,	// [30] Statement = LocalVariableDeclaration
			Action.RETURN,	// [31] Statement = BlockStatement
			Action.RETURN,	// [32] Statement = IfStatement
			Action.RETURN,	// [33] Statement = WhileStatement
			Action.RETURN,	// [34] Statement = BreakStatement
			Action.RETURN,	// [35] Statement = ReturnStatement
			Action.RETURN,	// [36] Statement = ExpressionStatement
			RETURN3,	// [37] LocalVariableDeclaration = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [38] BlockStatement = LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN6,	// [39] IfStatement = IF LPAREN Expression RPAREN Statement IfTail; returns 'IfTail' although none is marked
			RETURN2,	// [40] IfTail = ELSE Statement; returns 'Statement' although none is marked
			Action.NONE,  	// [41] IfTail = 
			RETURN5,	// [42] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [43] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [44] ReturnStatement = RETURN SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [45] ReturnStatement = RETURN Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [46] ExpressionStatement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [47] Expression = Assignment
			Action.RETURN,	// [48] Expression = RHSExpression
			RETURN3,	// [49] Assignment = LHSExpression EQL Expression; returns 'Expression' although none is marked
			Action.RETURN,	// [50] LHSExpression = ID
			Action.RETURN,	// [51] LHSExpression = ArrayAccess
			RETURN4,	// [52] ArrayAccess = ID LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			RETURN4,	// [53] ArrayAccess = ArrayAccess LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [54] RHSExpression = ArithmeticExpression
			RETURN3,	// [55] RHSExpression = ArithmeticExpression ComparisonOperator ArithmeticExpression; returns 'ArithmeticExpression' although none is marked
			Action.RETURN,	// [56] ComparisonOperator = EQEQ
			Action.RETURN,	// [57] ComparisonOperator = NEQ
			Action.RETURN,	// [58] ComparisonOperator = LT
			Action.RETURN,	// [59] ComparisonOperator = LEQ
			Action.RETURN,	// [60] ComparisonOperator = GT
			Action.RETURN,	// [61] ComparisonOperator = GEQ
			new Action() {	// [62] ArithmeticExpression = ArithmeticExpression AdditiveOperator Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [63] ArithmeticExpression = Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [64] AdditiveOperator = PLUS
			Action.RETURN,	// [65] AdditiveOperator = MINUS
			new Action() {	// [66] Term = Term MultiplicativeOperator Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [67] Term = Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [68] MultiplicativeOperator = TIMES
			Action.RETURN,	// [69] MultiplicativeOperator = DIV
			Action.RETURN,	// [70] MultiplicativeOperator = MOD
			RETURN2,	// [71] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [72] Factor = PrimaryExpression
			Action.RETURN,	// [73] PrimaryExpression = LHSExpression
			Action.RETURN,	// [74] PrimaryExpression = FunctionCall
			Action.RETURN,	// [75] PrimaryExpression = ArrayExpression
			Action.RETURN,	// [76] PrimaryExpression = STRING_LITERAL
			Action.RETURN,	// [77] PrimaryExpression = INT_LITERAL
			Action.RETURN,	// [78] PrimaryExpression = Boolean
			Action.RETURN,	// [79] PrimaryExpression = ParenthesizedExpression
			RETURN4,	// [80] FunctionCall = ID LPAREN ExpressionList RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [81] ExpressionList = NotEmptyExpressionList
			Action.NONE,  	// [82] ExpressionList = 
			RETURN3,	// [83] NotEmptyExpressionList = Expression COMMA NotEmptyExpressionList; returns 'NotEmptyExpressionList' although none is marked
			Action.RETURN,	// [84] NotEmptyExpressionList = Expression
			RETURN3,	// [85] ArrayExpression = LBRACKET NotEmptyExpressionList RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [86] ParenthesizedExpression = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [87] Boolean = TRUE
			Action.RETURN	// [88] Boolean = FALSE
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}