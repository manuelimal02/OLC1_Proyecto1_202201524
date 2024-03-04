// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/AnalizadoresLexicoSintactico/lexico.jflex

package AnalizadoresLexicoSintactico;
import java.util.LinkedList;
import dataforge.Token;
import java_cup.runtime.Symbol;
import dataforge.ErrorLexico;

//------------------------------------------------------------------------------

@SuppressWarnings("fallthrough")
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\5\0\1\10\1\11\2\0\1\12\1\13\1\14"+
    "\1\0\12\15\1\16\1\17\1\20\1\21\1\22\1\0"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\31\1\36\1\37\1\40\1\41"+
    "\1\42\1\31\1\43\1\44\1\45\1\46\1\47\1\31"+
    "\1\50\1\51\1\31\1\52\1\0\1\53\3\0\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\31\1\36\1\37\1\40\1\41\1\42\1\31"+
    "\1\43\1\44\1\45\1\46\1\47\1\31\1\50\1\51"+
    "\1\31\12\0\1\3\252\0\2\54\115\0\1\55\u01a8\0"+
    "\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\16\17\1\20\1\21\1\1\1\0\2\2\1\0\1\22"+
    "\1\0\5\17\1\0\5\17\1\0\6\17\1\0\4\17"+
    "\1\0\1\17\1\0\1\23\1\24\3\17\1\25\1\17"+
    "\1\25\1\17\1\26\3\17\1\0\1\17\1\27\1\17"+
    "\1\30\1\31\1\32\1\30\2\17\1\0\2\33\1\34"+
    "\1\17\1\0\1\17\1\35\1\34\1\36\2\17\1\0"+
    "\1\17\1\37\1\40\1\0\1\41\2\17\1\0\2\17"+
    "\1\0\1\42\2\17\1\0\1\17\1\0\3\17\1\0"+
    "\1\17\1\0\2\17\1\0\1\43\2\44\1\45\1\17"+
    "\1\45\1\17\1\0\1\17\1\46\1\17\1\0\1\47"+
    "\1\0\4\17\1\0\1\17\1\0\1\17\2\50\2\51"+
    "\2\52\1\0\2\17\1\0\1\17\1\0\1\17\1\0"+
    "\2\53\1\54\1\55\1\56\1\55\1\56\1\0\1\57"+
    "\1\17\1\0\2\60\1\17\2\0\2\61\2\62\1\0"+
    "\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\56\0\212\0\270\0\56\0\56"+
    "\0\346\0\56\0\u0114\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\u0142\0\346\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228"+
    "\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\56"+
    "\0\56\0\u0398\0\212\0\56\0\u03c6\0\270\0\56\0\u03f4"+
    "\0\u0422\0\u0450\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564"+
    "\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4"+
    "\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816\0\u0844"+
    "\0\u0872\0\u08a0\0\u03f4\0\346\0\u08ce\0\u08fc\0\u092a\0\346"+
    "\0\u0958\0\56\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c"+
    "\0\u0a9a\0\346\0\u0ac8\0\346\0\u0af6\0\346\0\56\0\u0b24"+
    "\0\u0b52\0\u0b80\0\346\0\56\0\346\0\u0bae\0\u0bdc\0\u0c0a"+
    "\0\346\0\56\0\346\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\346"+
    "\0\346\0\u0cf0\0\346\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6"+
    "\0\u0e04\0\346\0\u0e32\0\u0e60\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18"+
    "\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe\0\u102c\0\u105a\0\u1088"+
    "\0\346\0\u10b6\0\u10e4\0\346\0\u1112\0\56\0\u1140\0\u116e"+
    "\0\u119c\0\346\0\u11ca\0\u11f8\0\346\0\u1226\0\u1254\0\u1282"+
    "\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396\0\u13c4\0\u13f2"+
    "\0\346\0\56\0\346\0\56\0\u1420\0\u144e\0\u147c\0\u14aa"+
    "\0\u14d8\0\u1506\0\u1534\0\u1562\0\346\0\56\0\346\0\346"+
    "\0\346\0\56\0\56\0\u1590\0\346\0\u15be\0\u15ec\0\346"+
    "\0\56\0\u161a\0\u1648\0\u1676\0\346\0\56\0\346\0\56"+
    "\0\u16a4\0\56";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\2\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\23\1\27\1\30\2\23\1\31\1\32\2\23\1\33"+
    "\1\34\1\35\1\36\1\23\1\37\2\23\1\40\1\41"+
    "\1\2\1\42\57\0\1\3\2\0\2\3\50\0\2\43"+
    "\1\44\1\0\1\45\51\43\2\46\1\0\1\46\1\0"+
    "\2\46\1\47\46\46\12\0\1\23\11\0\26\23\20\0"+
    "\1\50\1\13\52\0\1\23\11\0\17\23\1\51\6\23"+
    "\16\0\1\23\11\0\7\23\1\52\5\23\1\53\10\23"+
    "\16\0\1\23\11\0\10\23\1\54\4\23\1\55\10\23"+
    "\2\0\1\56\13\0\1\23\11\0\11\23\1\57\2\23"+
    "\1\60\7\23\1\61\1\23\16\0\1\23\11\0\17\23"+
    "\1\62\6\23\16\0\1\23\11\0\10\23\1\63\15\23"+
    "\2\0\1\64\13\0\1\23\11\0\1\65\25\23\16\0"+
    "\1\23\11\0\1\66\3\23\1\67\3\23\1\70\4\23"+
    "\1\71\4\23\1\72\3\23\2\0\1\73\13\0\1\23"+
    "\11\0\17\23\1\74\6\23\16\0\1\23\11\0\4\23"+
    "\1\75\21\23\16\0\1\23\11\0\22\23\1\76\3\23"+
    "\16\0\1\23\11\0\10\23\1\77\15\23\2\0\1\100"+
    "\13\0\1\23\11\0\1\101\25\23\52\0\1\102\11\0"+
    "\1\44\70\0\1\103\52\0\1\23\11\0\17\23\1\104"+
    "\6\23\16\0\1\23\11\0\1\105\25\23\16\0\1\23"+
    "\11\0\12\23\1\106\1\23\1\107\11\23\16\0\1\23"+
    "\11\0\23\23\1\110\2\23\16\0\1\23\11\0\22\23"+
    "\1\111\3\23\53\0\1\112\20\0\1\23\11\0\4\23"+
    "\1\113\21\23\16\0\1\23\11\0\3\23\1\114\22\23"+
    "\16\0\1\23\11\0\4\23\1\115\21\23\16\0\1\23"+
    "\11\0\1\116\25\23\16\0\1\23\11\0\20\23\1\117"+
    "\5\23\3\0\1\120\44\0\1\120\10\0\1\120\12\0"+
    "\1\23\11\0\1\23\1\121\24\23\16\0\1\23\11\0"+
    "\24\23\1\122\1\23\16\0\1\23\11\0\3\23\1\123"+
    "\22\23\16\0\1\23\11\0\14\23\1\124\11\23\16\0"+
    "\1\23\11\0\3\23\1\125\22\23\16\0\1\23\11\0"+
    "\12\23\1\126\13\23\44\0\1\127\27\0\1\23\11\0"+
    "\10\23\1\130\4\23\1\131\10\23\2\0\1\132\13\0"+
    "\1\23\11\0\20\23\1\133\5\23\3\0\1\134\12\0"+
    "\1\23\11\0\13\23\1\135\12\23\16\0\1\23\11\0"+
    "\21\23\1\136\4\23\51\0\1\137\22\0\1\23\11\0"+
    "\12\23\1\140\4\23\1\141\6\23\43\0\1\142\30\0"+
    "\1\23\11\0\17\23\1\143\6\23\16\0\1\23\11\0"+
    "\22\23\1\144\3\23\16\0\1\23\11\0\20\23\1\145"+
    "\5\23\3\0\1\146\12\0\1\23\11\0\1\23\1\147"+
    "\24\23\16\0\1\23\11\0\24\23\1\150\1\151\11\0"+
    "\1\152\4\0\1\23\11\0\26\23\16\0\1\23\11\0"+
    "\2\23\1\153\23\23\16\0\1\23\11\0\16\23\1\154"+
    "\7\23\16\0\1\23\11\0\21\23\1\155\4\23\51\0"+
    "\1\156\22\0\1\23\11\0\4\23\1\157\21\23\16\0"+
    "\1\23\11\0\10\23\1\160\15\23\2\0\1\161\13\0"+
    "\1\23\11\0\1\162\25\23\16\0\1\23\11\0\14\23"+
    "\1\163\11\23\16\0\1\23\11\0\6\23\1\164\17\23"+
    "\44\0\1\165\27\0\1\23\11\0\22\23\1\166\3\23"+
    "\52\0\1\167\21\0\1\23\11\0\22\23\1\170\3\23"+
    "\16\0\1\23\11\0\13\23\1\171\12\23\16\0\1\23"+
    "\11\0\15\23\1\172\10\23\45\0\1\173\26\0\1\23"+
    "\11\0\12\23\1\174\13\23\46\0\1\175\25\0\1\23"+
    "\11\0\7\23\1\176\16\23\16\0\1\23\11\0\15\23"+
    "\1\177\10\23\45\0\1\200\26\0\1\23\11\0\12\23"+
    "\1\201\13\23\16\0\1\23\11\0\1\202\25\23\30\0"+
    "\1\203\43\0\1\23\11\0\21\23\1\204\4\23\16\0"+
    "\1\23\11\0\17\23\1\205\6\23\51\0\1\206\22\0"+
    "\1\23\11\0\12\23\1\207\13\23\42\0\1\210\31\0"+
    "\1\23\11\0\4\23\1\211\21\23\16\0\1\23\11\0"+
    "\14\23\1\212\11\23\16\0\1\23\11\0\12\23\1\213"+
    "\13\23\42\0\1\214\31\0\1\23\11\0\4\23\1\215"+
    "\21\23\47\0\1\216\24\0\1\23\11\0\1\23\1\217"+
    "\10\23\1\220\3\23\1\221\7\23\16\0\1\23\11\0"+
    "\6\23\1\222\17\23\36\0\1\223\35\0\1\23\11\0"+
    "\14\23\1\224\11\23\44\0\1\225\27\0\1\23\11\0"+
    "\1\226\25\23\16\0\1\23\11\0\15\23\1\227\10\23"+
    "\45\0\1\230\26\0\1\23\11\0\20\23\1\231\5\23"+
    "\3\0\1\232\12\0\1\23\11\0\4\23\1\233\21\23"+
    "\34\0\1\234\66\0\1\235\26\0\1\23\11\0\1\236"+
    "\25\23\16\0\1\23\11\0\10\23\1\237\15\23\2\0"+
    "\1\240\13\0\1\23\11\0\10\23\1\241\15\23\2\0"+
    "\1\242\13\0\1\23\11\0\17\23\1\243\6\23\47\0"+
    "\1\244\24\0\1\23\11\0\1\245\25\23\30\0\1\246"+
    "\43\0\1\23\11\0\13\23\1\247\12\23\16\0\1\23"+
    "\11\0\24\23\1\250\1\251\54\0\1\252\1\253\36\0"+
    "\1\254\35\0\1\23\11\0\17\23\1\255\6\23\16\0"+
    "\1\23\11\0\14\23\1\256\11\23\44\0\1\257\27\0"+
    "\1\23\11\0\4\23\1\260\21\23\34\0\1\261\37\0"+
    "\1\23\11\0\1\262\25\23\30\0\1\263\74\0\1\264"+
    "\24\0\1\23\11\0\4\23\1\265\21\23\34\0\1\266"+
    "\37\0\1\23\11\0\13\23\1\267\12\23\43\0\1\270"+
    "\42\0\1\271\70\0\1\272\16\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5842];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\2\11\1\1\1\11"+
    "\1\1\6\11\16\1\2\11\1\1\1\0\1\11\1\1"+
    "\1\0\1\11\1\0\5\1\1\0\5\1\1\0\6\1"+
    "\1\0\4\1\1\0\1\1\1\0\7\1\1\11\5\1"+
    "\1\0\6\1\1\11\2\1\1\0\1\1\1\11\2\1"+
    "\1\0\2\1\1\11\3\1\1\0\3\1\1\0\3\1"+
    "\1\0\2\1\1\0\3\1\1\0\1\1\1\0\3\1"+
    "\1\0\1\1\1\0\2\1\1\0\5\1\1\11\1\1"+
    "\1\0\3\1\1\0\1\1\1\0\4\1\1\0\1\1"+
    "\1\0\4\1\1\11\1\1\1\11\1\0\2\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\11\3\1\2\11"+
    "\1\0\2\1\1\0\1\1\1\11\1\1\2\0\1\1"+
    "\1\11\1\1\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
public LinkedList<ErrorLexico> lexicalErrors;
public LinkedList<Token> tokens;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
  lexicalErrors = new LinkedList<>();
tokens = new LinkedList<>();
yyline = 1;
yycolumn = 1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { lexicalErrors.add(new ErrorLexico("Lexico", yytext(), yyline, yycolumn));
            }
          // fall through
          case 52: break;
          case 2:
            { 
            }
          // fall through
          case 53: break;
          case 3:
            { yycolumn+=1;
            }
          // fall through
          case 54: break;
          case 4:
            { tokens.add(new Token("PARENTESIS_IZQUIERDO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PARENTESIS_IZQUIERDO, yyline, yycolumn, yytext());
            }
          // fall through
          case 55: break;
          case 5:
            { tokens.add(new Token("PARENTESIS_DERECHO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PARENTESIS_DERECHO, yyline, yycolumn, yytext());
            }
          // fall through
          case 56: break;
          case 6:
            { tokens.add(new Token("COMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 57: break;
          case 7:
            { tokens.add(new Token("MENOS", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MENOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 58: break;
          case 8:
            { tokens.add(new Token("ENTERO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ENTERO, yyline, yycolumn, yytext());
            }
          // fall through
          case 59: break;
          case 9:
            { tokens.add(new Token("DOS_PUNTOS", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 60: break;
          case 10:
            { tokens.add(new Token("PUNTO_COMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PUNTO_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 61: break;
          case 11:
            { tokens.add(new Token("MENOR_QUE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MENOR_QUE, yyline, yycolumn, yytext());
            }
          // fall through
          case 62: break;
          case 12:
            { tokens.add(new Token("IGUAL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 63: break;
          case 13:
            { tokens.add(new Token("MAYOR_QUE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MAYOR_QUE, yyline, yycolumn, yytext());
            }
          // fall through
          case 64: break;
          case 14:
            { tokens.add(new Token("ARROBA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARROBA, yyline, yycolumn, yytext());
            }
          // fall through
          case 65: break;
          case 15:
            { tokens.add(new Token("EXPRESION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EXPRESION, yyline, yycolumn, yytext());
            }
          // fall through
          case 66: break;
          case 16:
            { tokens.add(new Token("CORCHETE_IZQUIERDO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CORCHETE_IZQUIERDO, yyline, yycolumn, yytext());
            }
          // fall through
          case 67: break;
          case 17:
            { tokens.add(new Token("CORCHETE_DERECHO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CORCHETE_DERECHO, yyline, yycolumn, yytext());
            }
          // fall through
          case 68: break;
          case 18:
            { tokens.add(new Token("CADENA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
            }
          // fall through
          case 69: break;
          case 19:
            { tokens.add(new Token("DECIMAL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 20:
            { tokens.add(new Token("ARRAY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARRAY, yyline, yycolumn, yytext());
            }
          // fall through
          case 71: break;
          case 21:
            { tokens.add(new Token("DIVISION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 22:
            { tokens.add(new Token("END", yytext(), yyline, yycolumn));
                    return new Symbol(sym.END, yyline, yycolumn, yytext());
            }
          // fall through
          case 73: break;
          case 23:
            { tokens.add(new Token("MAXIMO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MAXIMO, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 24:
            { tokens.add(new Token("MINIMO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MINIMO, yyline, yycolumn, yytext());
            }
          // fall through
          case 75: break;
          case 25:
            { tokens.add(new Token("MODULO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MODULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 26:
            { tokens.add(new Token("MULTIPLICACION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MULTIPLICACION, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 27:
            { tokens.add(new Token("RESTA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
            }
          // fall through
          case 78: break;
          case 28:
            { tokens.add(new Token("SUMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 79: break;
          case 29:
            { tokens.add(new Token("VAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 80: break;
          case 30:
            { tokens.add(new Token("CHAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CHAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 81: break;
          case 31:
            { tokens.add(new Token("EJEX", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EJEX, yyline, yycolumn, yytext());
            }
          // fall through
          case 82: break;
          case 32:
            { tokens.add(new Token("EJEY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EJEY, yyline, yycolumn, yytext());
            }
          // fall through
          case 83: break;
          case 33:
            { tokens.add(new Token("EXEC", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EXEC, yyline, yycolumn, yytext());
            }
          // fall through
          case 84: break;
          case 34:
            { tokens.add(new Token("MODA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MODA, yyline, yycolumn, yytext());
            }
          // fall through
          case 85: break;
          case 35:
            { tokens.add(new Token("LABEL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.LABEL, yyline, yycolumn, yytext());
            }
          // fall through
          case 86: break;
          case 36:
            { tokens.add(new Token("MEDIA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MEDIA, yyline, yycolumn, yytext());
            }
          // fall through
          case 87: break;
          case 37:
            { tokens.add(new Token("PRINT", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
            }
          // fall through
          case 88: break;
          case 38:
            { tokens.add(new Token("COLUMN", yytext(), yyline, yycolumn));
                    return new Symbol(sym.COLUMN, yyline, yycolumn, yytext());
            }
          // fall through
          case 89: break;
          case 39:
            { tokens.add(new Token("DOUBLE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 90: break;
          case 40:
            { tokens.add(new Token("TITULO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 91: break;
          case 41:
            { tokens.add(new Token("VALUES", yytext(), yyline, yycolumn));
                    return new Symbol(sym.VALUES, yyline, yycolumn, yytext());
            }
          // fall through
          case 92: break;
          case 42:
            { tokens.add(new Token("CONSOLE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 93: break;
          case 43:
            { tokens.add(new Token("MEDIANA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MEDIANA, yyline, yycolumn, yytext());
            }
          // fall through
          case 94: break;
          case 44:
            { tokens.add(new Token("PROGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 95: break;
          case 45:
            { tokens.add(new Token("TITULOX", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULOX, yyline, yycolumn, yytext());
            }
          // fall through
          case 96: break;
          case 46:
            { tokens.add(new Token("TITULOY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULOY, yyline, yycolumn, yytext());
            }
          // fall through
          case 97: break;
          case 47:
            { tokens.add(new Token("GRAPHBAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.GRAPHBAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 98: break;
          case 48:
            { tokens.add(new Token("GRAPHPIE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.GRAPHPIE, yyline, yycolumn, yytext());
            }
          // fall through
          case 99: break;
          case 49:
            { tokens.add(new Token("GRAPHLINE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.GRAPHLINE, yyline, yycolumn, yytext());
            }
          // fall through
          case 100: break;
          case 50:
            { tokens.add(new Token("HISTOGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.HISTOGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 101: break;
          case 51:
            { tokens.add(new Token("END PROGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.END_PROGRAM, yyline, yycolumn, yytext());
            }
          // fall through
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
