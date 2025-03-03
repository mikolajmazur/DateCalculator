// Generated from DateCalculator.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateCalculatorLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "WhiteSpace", "LiczbaNaturalna", "Cyfra", 
		"Liczba", "Add", "Subtract", "MiesiacDlugiLiczbowo", "MiesiacKrotkiLiczbowo", 
		"LutyLiczbowo", "MiesiacDlugiSlownie", "MiesiacKrotkiSlownie", "LutySlownie", 
		"DzienDoKazdegoMiesiaca", "DniDoKrotkiegoMiesiaca", "DniDoDlugiegoMiesiaca", 
		"Rok", "DataDMRMyslnik", "DataDMRKropka", "DataMDRSlash", "DataDMMMMR", 
		"Godzina", "Godzina12", "MinutaLubSekunda", "CzasStd", "CzasAmPm", "PrzedzialCzasuDwukropki", 
		"PrzedzialCzasuJava", "DataCzasISO", "DataCzasDMMMMR", "DataCzasDMRKropka", 
		"DataCzasMDRSlash"
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


	public DateCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u019d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\3\4\3\5\6\5"+
		"S\n\5\r\5\16\5T\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\b\3\b\3\t\3\t\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\5\n"+
		"s\n\n\3\13\5\13v\n\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\5\f\u0080"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00db\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\5\20"+
		"\u00ea\n\20\3\21\3\21\3\21\5\21\u00ef\n\21\3\22\3\22\3\22\5\22\u00f4\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0107\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0118\n\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0129"+
		"\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u013a\n\27\3\27\3\27\3\27\3\30\5\30\u0140\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u0149\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0152\n\31\3\32\5\32\u0155\n\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0168"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u0177\n\36\3\36\3\36\3\36\3\36\5\36\u017d\n\36\3\36\3\36\3\36\5"+
		"\36\u0182\n\36\3\36\3\36\3\36\5\36\u0187\n\36\5\36\u0189\n\36\3\36\5\36"+
		"\u018c\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\2\2#\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35=\36?\37A C!\3\2\6\3\2\63;\3\2\62;\6\2\63\63\65\65\67\679:\5\2\66"+
		"\6688;;\u01ca\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7K\3\2\2"+
		"\2\tR\3\2\2\2\13\\\3\2\2\2\rb\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23r\3\2"+
		"\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u00b3\3\2\2\2\33\u00da\3\2\2\2\35\u00dc"+
		"\3\2\2\2\37\u00e9\3\2\2\2!\u00ee\3\2\2\2#\u00f3\3\2\2\2%\u00f5\3\2\2\2"+
		"\'\u0106\3\2\2\2)\u0117\3\2\2\2+\u0128\3\2\2\2-\u0139\3\2\2\2/\u0148\3"+
		"\2\2\2\61\u0151\3\2\2\2\63\u0154\3\2\2\2\65\u0158\3\2\2\2\67\u015e\3\2"+
		"\2\29\u0169\3\2\2\2;\u0172\3\2\2\2=\u018d\3\2\2\2?\u0191\3\2\2\2A\u0195"+
		"\3\2\2\2C\u0199\3\2\2\2EF\7\"\2\2F\4\3\2\2\2GH\7\13\2\2H\6\3\2\2\2IL\5"+
		"\3\2\2JL\5\5\3\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3"+
		"\2\2\2OP\b\4\2\2P\b\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2UY\3\2\2\2VX\t\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"\n\3\2\2\2[Y\3\2\2\2\\]\4\62;\2]\f\3\2\2\2^c\5\t\5\2_c\7\62\2\2`a\7\62"+
		"\2\2ac\7\62\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2c\16\3\2\2\2de\7-\2\2e\20"+
		"\3\2\2\2fg\7/\2\2g\22\3\2\2\2hj\7\62\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2"+
		"ks\t\4\2\2lm\7\63\2\2mq\7\62\2\2no\7\63\2\2oq\7\64\2\2pl\3\2\2\2pn\3\2"+
		"\2\2qs\3\2\2\2ri\3\2\2\2rp\3\2\2\2s\24\3\2\2\2tv\7\62\2\2ut\3\2\2\2uv"+
		"\3\2\2\2vw\3\2\2\2w{\t\5\2\2xy\7\63\2\2y{\7\63\2\2zu\3\2\2\2zx\3\2\2\2"+
		"{\26\3\2\2\2|}\7\62\2\2}\u0080\7\64\2\2~\u0080\7\64\2\2\177|\3\2\2\2\177"+
		"~\3\2\2\2\u0080\30\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7{\2\2\u0084\u0085\7e\2\2\u0085\u0086\7|\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u00b4\7c\2\2\u0089\u008a\7o\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7t\2\2\u008c\u008d\7e\2\2\u008d\u00b4\7c\2\2\u008e"+
		"\u008f\7o\2\2\u008f\u0090\7c\2\2\u0090\u0091\7l\2\2\u0091\u00b4\7c\2\2"+
		"\u0092\u0093\7n\2\2\u0093\u0094\7k\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7e\2\2\u0096\u00b4\7c\2\2\u0097\u0098\7u\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7r\2\2\u009c\u009d\7p\2\2"+
		"\u009d\u009e\7k\2\2\u009e\u00b4\7c\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7\u013b\2\2\u00a2\u00a3\7\u0161\2\2\u00a3\u00a4\7"+
		"f\2\2\u00a4\u00a5\7|\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7m\2\2\u00ab"+
		"\u00b4\7c\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7w\2\2"+
		"\u00af\u00b0\7f\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b4"+
		"\7c\2\2\u00b3\u0081\3\2\2\2\u00b3\u0089\3\2\2\2\u00b3\u008e\3\2\2\2\u00b3"+
		"\u0092\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00ac\3\2"+
		"\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00db\7c\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7|\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c3\u00db\7c\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7|\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7\u013b\2\2\u00c9\u00ca\7"+
		"\u203c\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7k\2\2\u00cc\u00db\7c\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7\u013b\2\2\u00d0\u00d1\7"+
		"\u0161\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7|\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7k\2\2"+
		"\u00d8\u00d9\7m\2\2\u00d9\u00db\7c\2\2\u00da\u00b5\3\2\2\2\u00da\u00bd"+
		"\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00cd\3\2\2\2\u00db\34\3\2\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7i\2\2\u00e1\u00e2\7q\2\2\u00e2\36\3\2\2\2\u00e3\u00e5\7"+
		"\62\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ea\4\63;\2\u00e7\u00e8\4\63\64\2\u00e8\u00ea\4\62;\2\u00e9\u00e4\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00ea \3\2\2\2\u00eb\u00ef\5\37\20\2\u00ec"+
		"\u00ed\7\65\2\2\u00ed\u00ef\7\62\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3"+
		"\2\2\2\u00ef\"\3\2\2\2\u00f0\u00f4\5!\21\2\u00f1\u00f2\7\65\2\2\u00f2"+
		"\u00f4\7\63\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4$\3\2\2\2"+
		"\u00f5\u00f6\5\13\6\2\u00f6\u00f7\5\13\6\2\u00f7\u00f8\5\13\6\2\u00f8"+
		"\u00f9\5\13\6\2\u00f9&\3\2\2\2\u00fa\u00fb\5!\21\2\u00fb\u00fc\7/\2\2"+
		"\u00fc\u00fd\5\25\13\2\u00fd\u0107\3\2\2\2\u00fe\u00ff\5#\22\2\u00ff\u0100"+
		"\7/\2\2\u0100\u0101\5\23\n\2\u0101\u0107\3\2\2\2\u0102\u0103\5\37\20\2"+
		"\u0103\u0104\7/\2\2\u0104\u0105\5\27\f\2\u0105\u0107\3\2\2\2\u0106\u00fa"+
		"\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0102\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7/\2\2\u0109\u010a\5%\23\2\u010a(\3\2\2\2\u010b\u010c\5!\21\2\u010c"+
		"\u010d\7\60\2\2\u010d\u010e\5\25\13\2\u010e\u0118\3\2\2\2\u010f\u0110"+
		"\5#\22\2\u0110\u0111\7\60\2\2\u0111\u0112\5\23\n\2\u0112\u0118\3\2\2\2"+
		"\u0113\u0114\5\37\20\2\u0114\u0115\7\60\2\2\u0115\u0116\5\27\f\2\u0116"+
		"\u0118\3\2\2\2\u0117\u010b\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0113\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\60\2\2\u011a\u011b\5%\23\2\u011b"+
		"*\3\2\2\2\u011c\u011d\5\25\13\2\u011d\u011e\7\61\2\2\u011e\u011f\5!\21"+
		"\2\u011f\u0129\3\2\2\2\u0120\u0121\5\23\n\2\u0121\u0122\7\61\2\2\u0122"+
		"\u0123\5#\22\2\u0123\u0129\3\2\2\2\u0124\u0125\5\27\f\2\u0125\u0126\7"+
		"\61\2\2\u0126\u0127\5\37\20\2\u0127\u0129\3\2\2\2\u0128\u011c\3\2\2\2"+
		"\u0128\u0120\3\2\2\2\u0128\u0124\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\7\61\2\2\u012b\u012c\5%\23\2\u012c,\3\2\2\2\u012d\u012e\5!\21\2\u012e"+
		"\u012f\7\"\2\2\u012f\u0130\5\33\16\2\u0130\u013a\3\2\2\2\u0131\u0132\5"+
		"#\22\2\u0132\u0133\7\"\2\2\u0133\u0134\5\31\r\2\u0134\u013a\3\2\2\2\u0135"+
		"\u0136\5\37\20\2\u0136\u0137\7\"\2\2\u0137\u0138\5\35\17\2\u0138\u013a"+
		"\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\"\2\2\u013c\u013d\5%\23\2\u013d.\3\2\2\2"+
		"\u013e\u0140\7\62\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0149\4\63;\2\u0142\u0143\7\63\2\2\u0143\u0149\4\62;\2"+
		"\u0144\u0145\7\64\2\2\u0145\u0149\4\62\65\2\u0146\u0147\7\62\2\2\u0147"+
		"\u0149\7\62\2\2\u0148\u013f\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0144\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0149\60\3\2\2\2\u014a\u0152\4\63;\2\u014b"+
		"\u014c\7\63\2\2\u014c\u0152\7\62\2\2\u014d\u014e\7\63\2\2\u014e\u0152"+
		"\7\63\2\2\u014f\u0150\7\63\2\2\u0150\u0152\7\64\2\2\u0151\u014a\3\2\2"+
		"\2\u0151\u014b\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152\62"+
		"\3\2\2\2\u0153\u0155\4\62\67\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0157\4\62;\2\u0157\64\3\2\2\2\u0158\u0159"+
		"\5/\30\2\u0159\u015a\7<\2\2\u015a\u015b\5\63\32\2\u015b\u015c\7<\2\2\u015c"+
		"\u015d\5\63\32\2\u015d\66\3\2\2\2\u015e\u015f\5\61\31\2\u015f\u0160\7"+
		"<\2\2\u0160\u0161\5\63\32\2\u0161\u0162\7<\2\2\u0162\u0167\5\63\32\2\u0163"+
		"\u0164\7C\2\2\u0164\u0168\7O\2\2\u0165\u0166\7R\2\2\u0166\u0168\7O\2\2"+
		"\u0167\u0163\3\2\2\2\u0167\u0165\3\2\2\2\u01688\3\2\2\2\u0169\u016a\7"+
		"V\2\2\u016a\u016b\7<\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5\r\7\2\u016d"+
		"\u016e\7<\2\2\u016e\u016f\5\r\7\2\u016f\u0170\7<\2\2\u0170\u0171\5\r\7"+
		"\2\u0171:\3\2\2\2\u0172\u018b\7R\2\2\u0173\u0174\5\t\5\2\u0174\u0175\7"+
		"F\2\2\u0175\u0177\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0188\3\2\2\2\u0178\u017c\7V\2\2\u0179\u017a\5\t\5\2\u017a\u017b\7J\2"+
		"\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181"+
		"\3\2\2\2\u017e\u017f\5\t\5\2\u017f\u0180\7O\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186\3\2\2\2\u0183\u0184\5\t"+
		"\5\2\u0184\u0185\7U\2\2\u0185\u0187\3\2\2\2\u0186\u0183\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0178\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u018c\7\62\2\2\u018b\u0176\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c<\3\2\2\2\u018d\u018e\5\'\24\2\u018e\u018f\7V\2\2"+
		"\u018f\u0190\5\65\33\2\u0190>\3\2\2\2\u0191\u0192\5-\27\2\u0192\u0193"+
		"\7\"\2\2\u0193\u0194\5\65\33\2\u0194@\3\2\2\2\u0195\u0196\5)\25\2\u0196"+
		"\u0197\7\"\2\2\u0197\u0198\5\67\34\2\u0198B\3\2\2\2\u0199\u019a\5+\26"+
		"\2\u019a\u019b\7\"\2\2\u019b\u019c\5\67\34\2\u019cD\3\2\2\2#\2KMTYbip"+
		"ruz\177\u00b3\u00da\u00e4\u00e9\u00ee\u00f3\u0106\u0117\u0128\u0139\u013f"+
		"\u0148\u0151\u0154\u0167\u0176\u017c\u0181\u0186\u0188\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}