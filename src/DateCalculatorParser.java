// Generated from DateCalculator.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, LiczbaNaturalna=2, Cyfra=3, Liczba=4, Add=5, Subtract=6, 
		MiesiacDlugiLiczbowo=7, MiesiacKrotkiLiczbowo=8, LutyLiczbowo=9, MiesiacDlugiSlownie=10, 
		MiesiacKrotkiSlownie=11, LutySlownie=12, DzienDoKazdegoMiesiaca=13, DniDoKrotkiegoMiesiaca=14, 
		DniDoDlugiegoMiesiaca=15, Rok=16, DataDMRMyslnik=17, DataDMRKropka=18, 
		DataMDRSlash=19, DataDMMMMR=20, Godzina=21, Godzina12=22, MinutaLubSekunda=23, 
		CzasStd=24, CzasAmPm=25, PrzedzialCzasuDwukropki=26, PrzedzialCzasuJava=27, 
		DataCzasISO=28, DataCzasDMMMMR=29, DataCzasDMRKropka=30, DataCzasMDRSlash=31;
	public static final int
		RULE_data = 0, RULE_dataCzas = 1, RULE_przedzialCzasu = 2, RULE_operation2 = 3, 
		RULE_expression = 4;
	public static final String[] ruleNames = {
		"data", "dataCzas", "przedzialCzasu", "operation2", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'+'", "'-'", null, null, null, null, null, 
		"'lutego'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "LiczbaNaturalna", "Cyfra", "Liczba", "Add", "Subtract", 
		"MiesiacDlugiLiczbowo", "MiesiacKrotkiLiczbowo", "LutyLiczbowo", "MiesiacDlugiSlownie", 
		"MiesiacKrotkiSlownie", "LutySlownie", "DzienDoKazdegoMiesiaca", "DniDoKrotkiegoMiesiaca", 
		"DniDoDlugiegoMiesiaca", "Rok", "DataDMRMyslnik", "DataDMRKropka", "DataMDRSlash", 
		"DataDMMMMR", "Godzina", "Godzina12", "MinutaLubSekunda", "CzasStd", "CzasAmPm", 
		"PrzedzialCzasuDwukropki", "PrzedzialCzasuJava", "DataCzasISO", "DataCzasDMMMMR", 
		"DataCzasDMRKropka", "DataCzasMDRSlash"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DateCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DataContext extends ParserRuleContext {
		public Token format;
		public TerminalNode DataDMRMyslnik() { return getToken(DateCalculatorParser.DataDMRMyslnik, 0); }
		public TerminalNode DataDMRKropka() { return getToken(DateCalculatorParser.DataDMRKropka, 0); }
		public TerminalNode DataMDRSlash() { return getToken(DateCalculatorParser.DataMDRSlash, 0); }
		public TerminalNode DataDMMMMR() { return getToken(DateCalculatorParser.DataDMMMMR, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateCalculatorVisitor ) return ((DateCalculatorVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((DataContext)_localctx).format = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DataDMRMyslnik) | (1L << DataDMRKropka) | (1L << DataMDRSlash) | (1L << DataDMMMMR))) != 0)) ) {
				((DataContext)_localctx).format = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataCzasContext extends ParserRuleContext {
		public Token format;
		public TerminalNode DataCzasISO() { return getToken(DateCalculatorParser.DataCzasISO, 0); }
		public TerminalNode DataCzasDMMMMR() { return getToken(DateCalculatorParser.DataCzasDMMMMR, 0); }
		public TerminalNode DataCzasDMRKropka() { return getToken(DateCalculatorParser.DataCzasDMRKropka, 0); }
		public TerminalNode DataCzasMDRSlash() { return getToken(DateCalculatorParser.DataCzasMDRSlash, 0); }
		public DataCzasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCzas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).enterDataCzas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).exitDataCzas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateCalculatorVisitor ) return ((DateCalculatorVisitor<? extends T>)visitor).visitDataCzas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCzasContext dataCzas() throws RecognitionException {
		DataCzasContext _localctx = new DataCzasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataCzas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((DataCzasContext)_localctx).format = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DataCzasISO) | (1L << DataCzasDMMMMR) | (1L << DataCzasDMRKropka) | (1L << DataCzasMDRSlash))) != 0)) ) {
				((DataCzasContext)_localctx).format = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrzedzialCzasuContext extends ParserRuleContext {
		public Token format;
		public TerminalNode PrzedzialCzasuJava() { return getToken(DateCalculatorParser.PrzedzialCzasuJava, 0); }
		public TerminalNode PrzedzialCzasuDwukropki() { return getToken(DateCalculatorParser.PrzedzialCzasuDwukropki, 0); }
		public PrzedzialCzasuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przedzialCzasu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).enterPrzedzialCzasu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).exitPrzedzialCzasu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateCalculatorVisitor ) return ((DateCalculatorVisitor<? extends T>)visitor).visitPrzedzialCzasu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzedzialCzasuContext przedzialCzasu() throws RecognitionException {
		PrzedzialCzasuContext _localctx = new PrzedzialCzasuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_przedzialCzasu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((PrzedzialCzasuContext)_localctx).format = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PrzedzialCzasuDwukropki || _la==PrzedzialCzasuJava) ) {
				((PrzedzialCzasuContext)_localctx).format = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operation2Context extends ParserRuleContext {
		public Token op;
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<DataCzasContext> dataCzas() {
			return getRuleContexts(DataCzasContext.class);
		}
		public DataCzasContext dataCzas(int i) {
			return getRuleContext(DataCzasContext.class,i);
		}
		public List<PrzedzialCzasuContext> przedzialCzasu() {
			return getRuleContexts(PrzedzialCzasuContext.class);
		}
		public PrzedzialCzasuContext przedzialCzasu(int i) {
			return getRuleContext(PrzedzialCzasuContext.class,i);
		}
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public Operation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).enterOperation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).exitOperation2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateCalculatorVisitor ) return ((DateCalculatorVisitor<? extends T>)visitor).visitOperation2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation2Context operation2() throws RecognitionException {
		Operation2Context _localctx = new Operation2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation2);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DataDMRMyslnik:
				case DataDMRKropka:
				case DataMDRSlash:
				case DataDMMMMR:
					{
					setState(16);
					data();
					}
					break;
				case DataCzasISO:
				case DataCzasDMMMMR:
				case DataCzasDMRKropka:
				case DataCzasMDRSlash:
					{
					setState(17);
					dataCzas();
					}
					break;
				case PrzedzialCzasuDwukropki:
				case PrzedzialCzasuJava:
					{
					setState(18);
					przedzialCzasu();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(21);
				((Operation2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Subtract) ) {
					((Operation2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(22);
					przedzialCzasu();
					}
					break;
				case 2:
					{
					setState(23);
					operation2();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DataDMRMyslnik:
				case DataDMRKropka:
				case DataMDRSlash:
				case DataDMMMMR:
					{
					setState(26);
					data();
					}
					break;
				case DataCzasISO:
				case DataCzasDMMMMR:
				case DataCzasDMRKropka:
				case DataCzasMDRSlash:
					{
					setState(27);
					dataCzas();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30);
				((Operation2Context)_localctx).op = match(Subtract);
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(31);
					data();
					}
					break;
				case 2:
					{
					setState(32);
					dataCzas();
					}
					break;
				case 3:
					{
					setState(33);
					operation2();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(36);
				przedzialCzasu();
				}
				setState(37);
				((Operation2Context)_localctx).op = match(Add);
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(38);
					data();
					}
					break;
				case 2:
					{
					setState(39);
					dataCzas();
					}
					break;
				case 3:
					{
					setState(40);
					przedzialCzasu();
					}
					break;
				case 4:
					{
					setState(41);
					operation2();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public DataCzasContext dataCzas() {
			return getRuleContext(DataCzasContext.class,0);
		}
		public PrzedzialCzasuContext przedzialCzasu() {
			return getRuleContext(PrzedzialCzasuContext.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateCalculatorListener ) ((DateCalculatorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateCalculatorVisitor ) return ((DateCalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				dataCzas();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				przedzialCzasu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				operation2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\67\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5\26"+
		"\n\5\3\5\3\5\3\5\5\5\33\n\5\3\5\3\5\5\5\37\n\5\3\5\3\5\3\5\3\5\5\5%\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\5\5/\n\5\3\6\3\6\3\6\3\6\5\6\65\n"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\6\3\2\23\26\3\2\36!\3\2\34\35\3\2\7\b?\2\f\3"+
		"\2\2\2\4\16\3\2\2\2\6\20\3\2\2\2\b.\3\2\2\2\n\64\3\2\2\2\f\r\t\2\2\2\r"+
		"\3\3\2\2\2\16\17\t\3\2\2\17\5\3\2\2\2\20\21\t\4\2\2\21\7\3\2\2\2\22\26"+
		"\5\2\2\2\23\26\5\4\3\2\24\26\5\6\4\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\32\t\5\2\2\30\33\5\6\4\2\31\33\5\b\5\2\32\30"+
		"\3\2\2\2\32\31\3\2\2\2\33/\3\2\2\2\34\37\5\2\2\2\35\37\5\4\3\2\36\34\3"+
		"\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 $\7\b\2\2!%\5\2\2\2\"%\5\4\3\2#%\5\b"+
		"\5\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%/\3\2\2\2&\'\5\6\4\2\',\7\7\2\2(-"+
		"\5\2\2\2)-\5\4\3\2*-\5\6\4\2+-\5\b\5\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,"+
		"+\3\2\2\2-/\3\2\2\2.\25\3\2\2\2.\36\3\2\2\2.&\3\2\2\2/\t\3\2\2\2\60\65"+
		"\5\2\2\2\61\65\5\4\3\2\62\65\5\6\4\2\63\65\5\b\5\2\64\60\3\2\2\2\64\61"+
		"\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\13\3\2\2\2\t\25\32\36$,.\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}