/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.outskirtslabs.beancount.parser;

import java.util.LinkedList;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.outskirtslabs.beancount.psi.BeancountTypes.*;
import static com.outskirtslabs.beancount.BeancountLexerUtil.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Beancount.flex</tt>
 */
public class _BeancountLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int sOPT = 2;
  public static final int sEVENT = 4;
  public static final int sDATE_ENTRY = 6;
  public static final int sOPEN = 8;
  public static final int sBALANCE = 10;
  public static final int sPRICE = 12;
  public static final int sCOMMODITY = 14;
  public static final int sMETA_LIST = 16;
  public static final int sPOSTING = 18;
  public static final int sACCOUNT = 20;
  public static final int sCUSTOM = 22;
  public static final int sPAD = 24;
  public static final int sQUERY = 26;
  public static final int sNOTE = 28;
  public static final int sDOCUMENT = 30;
  public static final int sINCLUDE = 32;
  public static final int sTXN = 34;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  3,  2,  3,  4,  5,  6,  7,  6,  7,  2,  3,  2,  3, 
     8,  9, 10, 11, 12, 13,  6,  7,  6,  7,  2,  3,  6,  7,  6,  7, 
     2,  3, 14, 15
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 8128 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\35\12\1\14\1\15\24\12"+
    "\1\16\1\12\1\17\1\12\1\20\1\21\1\22\1\23\1\24\22\12\1\25\32\12\1\26\4\12\1"+
    "\27\1\12\1\30\u03c3\12");

  /* The ZZ_CMAP_Y table has 1600 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\1\1\11\1\12\2\1\3\13\1\14\1\15\2\13"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\13\1\25\3\13\1\26\1\27\22\1\1\30\1\31"+
    "\1\32\1\33\1\1\1\34\1\35\1\13\1\36\3\11\3\1\2\13\1\37\3\13\1\40\6\13\1\32"+
    "\1\11\1\41\20\1\1\42\10\1\1\42\14\1\1\42\31\1\1\43\7\1\1\43\7\1\1\43\7\1\1"+
    "\43\7\1\1\43\7\1\1\43\7\1\1\43\7\1\1\43\7\1\1\43\7\1\1\43\6\1\1\42\7\1\1\42"+
    "\4\1\1\42\21\1\1\42\4\1\1\42\2\11\1\44\55\1\5\11\1\45\76\1\1\42\2\1\1\42\22"+
    "\1\1\43\10\1\1\42\12\1\2\42\13\1\1\42\5\1\1\42\10\1\2\42\32\1\11\13\1\46\6"+
    "\13\1\47\1\50\2\47\1\50\1\51\1\47\4\1\3\52\1\53\1\52\2\1\1\54\15\1\1\55\1"+
    "\56\1\57\1\60\1\61\1\1\1\11\1\1\1\62\62\1\1\63\1\11\163\1\2\11\1\64\3\1\1"+
    "\65\1\66\6\13\1\67\1\70\122\1\1\42\1\1\2\13\1\71\1\1\1\13\1\72\10\1\2\73\3"+
    "\13\1\74\1\75\1\76\1\77\1\100\21\1\1\42\2\1\1\42\14\1\1\42\1\1\1\42\5\1\1"+
    "\42\31\1\1\42\61\1\1\42\1\32\1\101\14\1\2\11\1\102\7\1\1\42\2\11\1\103\72"+
    "\1\3\11\1\104\72\1\1\43\10\1\1\42\3\1\1\43\11\1\1\42\21\1\1\42\25\1\1\42\7"+
    "\1\1\42\27\1\1\42\6\1\1\42\6\1\1\42\26\1\2\11\2\1\1\42\66\1\1\42\140\1\1\42"+
    "\16\1\1\42\12\1\1\11\1\105\1\1\1\106\1\107\1\1\1\47\1\11\1\110\1\111\1\112"+
    "\1\45\1\1\1\11\1\105\1\1\1\113\1\114\1\1\1\115\1\116\1\117\1\120\1\11\1\45"+
    "\1\1\1\11\1\105\1\1\1\106\1\107\1\1\1\47\1\11\1\110\1\120\1\11\1\45\1\1\1"+
    "\11\1\105\1\1\1\47\1\11\1\117\1\1\1\121\1\101\1\1\1\120\1\11\1\122\1\1\1\63"+
    "\1\64\2\1\1\11\1\123\1\1\1\124\3\125\20\1\2\11\1\110\2\1\1\42\75\1\1\11\1"+
    "\105\1\11\1\105\1\11\1\105\47\1");

  /* The ZZ_CMAP_A table has 1376 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\12\0\1\7\2\10\1\7\22\0\1\12\1\13\1\5\1\22\4\0\1\53\1\54\1\56\1\55\1\51\1"+
    "\3\1\2\1\20\12\1\1\21\1\11\4\0\1\52\32\16\1\0\1\6\1\0\1\23\1\17\1\0\1\34\1"+
    "\33\1\27\1\37\1\30\3\15\1\26\2\15\1\35\1\36\1\32\1\31\1\24\1\46\1\25\1\45"+
    "\1\40\1\44\1\42\1\15\1\43\1\41\1\15\1\47\1\0\1\50\7\0\1\10\12\0\27\14\1\0"+
    "\7\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1"+
    "\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\2\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\2\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1"+
    "\0\1\14\1\0\1\14\1\0\1\14\1\0\2\14\1\0\1\14\1\0\1\14\3\0\2\14\1\0\1\14\1\0"+
    "\2\14\1\0\3\14\2\0\4\14\1\0\2\14\1\0\3\14\3\0\2\14\1\0\2\14\1\0\1\14\1\0\1"+
    "\14\1\0\2\14\1\0\1\14\2\0\1\14\1\0\2\14\1\0\3\14\1\0\1\14\1\0\2\14\3\0\1\14"+
    "\7\0\1\14\2\0\1\14\2\0\1\14\2\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1"+
    "\0\1\14\1\0\1\14\1\0\1\14\2\0\1\14\2\0\1\14\2\0\1\14\1\0\3\14\1\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\1\14\7\0\2\14\1\0\2\14\2\0\1\14\1\0\4\14\1\0\1"+
    "\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\3\0\1\14\10\0\1\14\6\0\1"+
    "\14\1\0\3\14\1\0\1\14\1\0\2\14\1\0\21\14\1\0\11\14\23\0\1\14\2\0\3\14\3\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\1\14\5\0\1\14\2\0\1\14\1\0\2\14\2\0\4\14\11\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\2\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1"+
    "\14\1\0\1\14\2\0\7\14\11\0\12\4\14\0\12\4\6\14\1\0\1\14\5\0\1\14\2\0\6\14"+
    "\12\0\1\14\1\0\1\14\1\0\1\14\11\0\1\14\11\0\10\14\10\0\6\14\13\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\0\1\14\10\0\4\14\14\0\5\14\13\0\2\10\10\0\1\14\4\0\1\14\3"+
    "\0\3\14\2\0\3\14\2\0\1\14\3\0\5\14\6\0\1\14\1\0\1\14\1\0\1\14\1\0\4\14\2\0"+
    "\4\14\12\0\2\14\5\0\1\14\15\0\1\14\22\0\31\14\1\0\1\14\1\0\3\14\2\0\1\14\1"+
    "\0\1\14\1\0\1\14\1\0\4\14\1\0\1\14\2\0\1\14\10\0\3\14\1\0\1\14\10\0\1\14\1"+
    "\0\1\14\4\0\1\14\15\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1"+
    "\0\1\14\3\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\7\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\12\0\1\14\1\0\1\14\1\0"+
    "\2\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\4\0\1\14\1\0\1\14\2\0\1\14\1\0\1"+
    "\14\3\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\1\14\1\0\5\14\1\0\5\14\1\0\1\14\11\0\13\14\5\0\10\14\10\0\4"+
    "\14\14\0\3\14\15\0\12\14\12\0\32\14\2\0\2\14\32\0\1\14\1\0\2\14\2\0\1\14\2"+
    "\0\2\14\2\0\4\14\1\0\2\14\4\0\2\14\1\0\4\14\2\0\10\14\1\0\7\14\13\0\2\14\1"+
    "\0\4\14\1\0\5\14\1\0\1\14\3\0\7\14\33\0\4\14\2\0\23\14\13\0\11\14\21\0\1\14"+
    "\3\0\22\4");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\20\0\1\1\1\2\1\3\2\1\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\2\4\1\3\20\1\21\1\22\1\20"+
    "\1\22\1\23\11\20\2\24\1\25\1\20\1\26\1\27"+
    "\1\30\1\31\1\32\1\30\1\33\1\34\1\33\1\4"+
    "\1\35\1\22\2\2\1\0\1\36\1\0\1\37\2\0"+
    "\1\40\1\41\1\42\1\43\1\2\20\0\1\40\1\44"+
    "\1\45\1\46\1\2\1\0\1\36\1\2\1\0\1\47"+
    "\3\0\1\50\10\0\1\2\1\0\1\2\7\0\1\51"+
    "\1\52\3\0\1\2\4\0\1\53\2\0\1\54\2\0"+
    "\1\55\3\0\1\56\1\0\1\57\4\0\1\60\1\0"+
    "\1\61\4\0\1\62\2\0\1\63\1\64\1\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439"+
    "\0\u02f0\0\u02f0\0\u0468\0\u0497\0\u02f0\0\u04c6\0\u02f0\0\u02f0"+
    "\0\u02f0\0\u02f0\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u02f0"+
    "\0\u037d\0\u03ac\0\u05e0\0\u060f\0\u0439\0\u063e\0\u02f0\0\u066d"+
    "\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5"+
    "\0\u0814\0\u0843\0\u0872\0\u08a1\0\u02f0\0\u02f0\0\u08d0\0\u08ff"+
    "\0\u02f0\0\u092e\0\u02f0\0\u095d\0\u03ac\0\u098c\0\u02f0\0\u09bb"+
    "\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u03ac\0\u02f0\0\u0aa6\0\u0439"+
    "\0\u0439\0\u02f0\0\u02f0\0\u02f0\0\u0ad5\0\u0b04\0\u0553\0\u0b33"+
    "\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab"+
    "\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0843\0\u08a1\0\u098c"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0b33\0\u0edf"+
    "\0\u0f0e\0\u0f3d\0\u02f0\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"+
    "\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0"+
    "\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b\0\u02f0\0\u02f0\0\u12ba"+
    "\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u02f0"+
    "\0\u1432\0\u1461\0\u02f0\0\u1490\0\u14bf\0\u02f0\0\u14ee\0\u151d"+
    "\0\u154c\0\u02f0\0\u157b\0\u02f0\0\u15aa\0\u15d9\0\u1608\0\u1637"+
    "\0\u02f0\0\u1666\0\u02f0\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u02f0"+
    "\0\u1751\0\u1780\0\u02f0\0\u02f0\0\u02f0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\21\1\22\1\21\1\23\1\24\1\25\1\21\1\26"+
    "\1\21\1\27\4\21\1\30\1\21\1\31\1\21\1\32"+
    "\24\21\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\21\1\43\1\21\1\23\1\44\1\25\1\21"+
    "\1\26\1\21\1\27\1\45\3\21\1\30\1\21\1\31"+
    "\1\21\1\32\3\21\1\46\2\21\1\47\15\21\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\50"+
    "\1\22\1\50\1\23\1\51\1\52\1\50\1\53\2\50"+
    "\1\54\3\50\1\55\1\50\1\31\1\50\1\32\24\50"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\50\1\22\1\50\1\23\1\51\1\52\1\50\1\53"+
    "\2\50\1\56\3\50\1\55\1\50\1\31\1\50\1\32"+
    "\24\50\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\50\1\22\1\50\1\23\1\51\1\52\4\50"+
    "\1\54\1\57\2\50\1\55\1\50\1\31\1\50\1\32"+
    "\1\50\1\60\2\50\1\61\1\62\1\63\1\64\1\65"+
    "\3\50\1\66\1\67\5\50\1\70\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\57\1\50\1\22\1\50"+
    "\1\23\1\51\1\52\4\50\1\56\1\57\2\50\1\55"+
    "\1\50\1\31\1\50\1\32\1\50\1\60\2\50\1\61"+
    "\1\62\1\63\1\64\1\65\3\50\1\66\1\67\5\50"+
    "\1\70\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\57\1\50\1\22\1\50\1\23\1\51\1\52\1\50"+
    "\1\53\2\50\1\54\1\50\1\71\1\50\1\72\1\50"+
    "\1\31\1\50\1\32\24\50\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\50\1\22\1\50\1\23"+
    "\1\51\1\52\1\50\1\53\2\50\1\56\1\50\1\71"+
    "\1\50\1\72\1\50\1\31\1\50\1\32\24\50\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\50"+
    "\1\22\1\50\1\23\1\51\1\52\1\50\1\73\2\50"+
    "\1\54\2\50\1\74\1\55\1\50\1\31\1\75\1\32"+
    "\1\50\23\74\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\50\1\22\1\50\1\23\1\51\1\52"+
    "\1\50\1\73\2\50\1\56\2\50\1\74\1\55\1\50"+
    "\1\31\1\75\1\32\1\50\23\74\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\50\1\22\1\50"+
    "\1\23\1\51\1\52\1\50\1\76\2\50\1\54\3\50"+
    "\1\55\1\50\1\31\1\50\1\32\24\50\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\50\1\22"+
    "\1\50\1\23\1\51\1\52\1\50\1\76\2\50\1\56"+
    "\3\50\1\55\1\50\1\31\1\50\1\32\24\50\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\50"+
    "\1\22\1\50\1\23\1\51\1\52\1\50\1\76\2\50"+
    "\1\77\1\50\1\100\1\50\1\100\1\50\1\31\1\101"+
    "\1\32\24\50\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\50\1\22\1\50\1\23\1\51\1\52"+
    "\1\50\1\76\2\50\1\102\1\50\1\100\1\50\1\100"+
    "\1\50\1\31\1\101\1\32\24\50\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\103\3\104\1\103"+
    "\1\105\1\103\1\106\2\103\1\54\2\103\4\104\1\103"+
    "\1\32\1\107\23\104\11\103\3\104\1\103\1\105\1\103"+
    "\1\106\2\103\1\110\2\103\4\104\1\103\1\32\1\107"+
    "\23\104\10\103\60\0\1\111\1\112\1\0\1\113\53\0"+
    "\1\114\56\0\1\113\2\0\1\113\52\0\5\115\1\116"+
    "\1\117\50\115\7\0\1\26\47\0\7\27\2\0\46\27"+
    "\3\0\1\120\12\0\1\121\1\120\106\0\1\122\57\0"+
    "\1\123\60\0\1\124\5\0\1\125\1\112\1\0\1\126"+
    "\53\0\1\126\2\0\1\126\64\0\1\127\2\0\1\130"+
    "\6\0\23\130\42\0\1\131\50\0\1\132\41\0\1\53"+
    "\61\0\1\54\56\0\1\56\2\0\1\130\6\0\23\130"+
    "\35\0\1\133\6\0\1\134\53\0\1\135\12\0\1\136"+
    "\54\0\1\137\40\0\1\140\63\0\1\141\61\0\1\142"+
    "\53\0\1\143\70\0\1\144\57\0\1\145\13\0\1\71"+
    "\1\0\1\71\11\0\3\71\4\0\23\71\11\0\1\71"+
    "\1\0\1\72\11\0\1\71\1\146\1\72\4\0\23\71"+
    "\17\0\1\73\50\0\1\147\1\0\1\147\11\0\3\147"+
    "\4\0\23\147\22\0\1\77\45\0\1\100\1\0\1\100"+
    "\11\0\3\100\4\0\23\100\22\0\1\102\2\0\1\130"+
    "\6\0\23\130\11\0\3\104\11\0\4\104\3\0\23\104"+
    "\17\0\1\150\61\0\1\110\1\0\1\151\1\130\1\151"+
    "\5\0\23\130\11\0\1\152\1\112\1\0\1\153\53\0"+
    "\1\112\56\0\1\153\2\0\1\153\53\0\1\114\1\154"+
    "\54\0\7\115\2\0\46\115\1\0\1\155\1\112\1\0"+
    "\1\156\53\0\1\156\2\0\1\156\53\0\1\157\1\0"+
    "\1\157\11\0\3\157\4\0\23\157\37\0\1\160\67\0"+
    "\1\161\44\0\1\162\67\0\1\163\55\0\1\164\65\0"+
    "\1\165\41\0\1\166\56\0\1\167\66\0\1\170\53\0"+
    "\1\171\50\0\1\172\61\0\1\57\54\0\1\173\27\0"+
    "\1\151\1\0\1\151\11\0\3\151\4\0\23\151\11\0"+
    "\1\174\1\112\1\0\1\175\53\0\1\175\2\0\1\175"+
    "\53\0\1\154\56\0\1\176\1\112\1\0\1\177\53\0"+
    "\1\177\2\0\1\177\107\0\1\200\47\0\1\201\57\0"+
    "\1\202\65\0\1\203\60\0\1\204\50\0\1\205\56\0"+
    "\1\206\54\0\1\207\62\0\1\210\66\0\1\211\37\0"+
    "\1\212\32\0\1\213\1\112\1\214\56\0\1\214\54\0"+
    "\1\213\1\112\1\215\56\0\1\215\117\0\1\216\43\0"+
    "\1\217\55\0\1\220\57\0\1\221\56\0\1\222\65\0"+
    "\1\223\50\0\1\224\62\0\1\225\61\0\1\226\16\0"+
    "\1\213\1\112\55\0\1\227\2\0\1\227\53\0\1\230"+
    "\2\0\1\230\111\0\1\231\51\0\1\232\63\0\1\233"+
    "\55\0\1\234\47\0\1\235\57\0\1\236\27\0\1\237"+
    "\2\0\1\237\53\0\1\240\2\0\1\240\102\0\1\241"+
    "\54\0\1\242\60\0\1\243\60\0\1\244\27\0\1\245"+
    "\56\0\1\246\113\0\1\247\56\0\1\250\17\0\1\251"+
    "\2\0\1\251\53\0\1\252\2\0\1\252\113\0\1\253"+
    "\16\0\1\254\2\0\1\254\53\0\1\255\2\0\1\255"+
    "\52\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6063];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\20\0\1\11\7\1\2\11\2\1\1\11\1\1\4\11"+
    "\5\1\1\11\6\1\1\11\15\1\2\11\2\1\1\11"+
    "\1\1\1\11\3\1\1\11\3\1\1\0\1\1\1\0"+
    "\1\11\2\0\1\1\3\11\1\1\20\0\5\1\1\0"+
    "\2\1\1\0\1\1\3\0\1\11\10\0\1\1\1\0"+
    "\1\1\7\0\2\11\3\0\1\1\4\0\1\11\2\0"+
    "\1\11\2\0\1\11\3\0\1\11\1\0\1\11\4\0"+
    "\1\11\1\0\1\11\4\0\1\11\2\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _BeancountLexer() {
    this((java.io.Reader)null);
  }

  private final LinkedList<Integer> states = new LinkedList();

  private void yypushstate(int state) {
      states.addFirst(yystate());
        yylogstate(state);
  }

    private void yypopstate() {
      if(states.isEmpty()) {
        yylogstate(YYINITIAL);
      } else  {
        final int state = states.removeFirst();
        yylogstate(state);
      }
    }
    private void yylogstate(int state) {
//    System.out.println("   state is now "+ state);
    yybegin(state);
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _BeancountLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall though
        case '\u000C':  // fall though
        case '\u0085':  // fall though
        case '\u2028':  // fall though
        case '\u2029':  // fall though
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return SKIP;
            } 
            // fall through
          case 54: break;
          case 2: 
            { return NUMBER;
            } 
            // fall through
          case 55: break;
          case 3: 
            { return MINUS;
            } 
            // fall through
          case 56: break;
          case 4: 
            { return EOL;
            } 
            // fall through
          case 57: break;
          case 5: 
            { return COMMENT;
            } 
            // fall through
          case 58: break;
          case 6: 
            { return DIVIDE;
            } 
            // fall through
          case 59: break;
          case 7: 
            { return HASH;
            } 
            // fall through
          case 60: break;
          case 8: 
            { return LCURL;
            } 
            // fall through
          case 61: break;
          case 9: 
            { return RCURL;
            } 
            // fall through
          case 62: break;
          case 10: 
            { return COMMA;
            } 
            // fall through
          case 63: break;
          case 11: 
            { return AT;
            } 
            // fall through
          case 64: break;
          case 12: 
            { return LPAREN;
            } 
            // fall through
          case 65: break;
          case 13: 
            { return RPAREN;
            } 
            // fall through
          case 66: break;
          case 14: 
            { return PLUS;
            } 
            // fall through
          case 67: break;
          case 15: 
            { return ASTERISK;
            } 
            // fall through
          case 68: break;
          case 16: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 69: break;
          case 17: 
            { yylogstate(YYINITIAL); return EOL;
            } 
            // fall through
          case 70: break;
          case 18: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 71: break;
          case 19: 
            { yylogstate(sTXN); return TXN;
            } 
            // fall through
          case 72: break;
          case 20: 
            { yypushstate(sACCOUNT); return ACCOUNT_WORD;
            } 
            // fall through
          case 73: break;
          case 21: 
            { yypopstate(); return EOL;
            } 
            // fall through
          case 74: break;
          case 22: 
            { return META_KV_DELIMITER;
            } 
            // fall through
          case 75: break;
          case 23: 
            { yypushback(yylength()); yypopstate();
            } 
            // fall through
          case 76: break;
          case 24: 
            { yypopstate(); return WHITE_SPACE;
            } 
            // fall through
          case 77: break;
          case 25: 
            { return ACCOUNT_WORD;
            } 
            // fall through
          case 78: break;
          case 26: 
            { return COLON;
            } 
            // fall through
          case 79: break;
          case 27: 
            { /*this effectively detects the last posting line*/ yypushback(yylength()); yypopstate();
            } 
            // fall through
          case 80: break;
          case 28: 
            { return TAG_LINK_VALUE;
            } 
            // fall through
          case 81: break;
          case 29: 
            { return CARET;
            } 
            // fall through
          case 82: break;
          case 30: 
            { return NEGATIVE_NUMBER;
            } 
            // fall through
          case 83: break;
          case 31: 
            { return STRING;
            } 
            // fall through
          case 84: break;
          case 32: 
            { return CURRENCY;
            } 
            // fall through
          case 85: break;
          case 33: 
            { return LCURLCURL;
            } 
            // fall through
          case 86: break;
          case 34: 
            { return RCURLCURL;
            } 
            // fall through
          case 87: break;
          case 35: 
            { return ATAT;
            } 
            // fall through
          case 88: break;
          case 36: 
            { return META_KEY;
            } 
            // fall through
          case 89: break;
          case 37: 
            { yypopstate();  return EOL;
            } 
            // fall through
          case 90: break;
          case 38: 
            { yypushback(nonWsIndex(yytext())); yypushstate(sPOSTING); yypushstate(sACCOUNT); return INDENT;
            } 
            // fall through
          case 91: break;
          case 39: 
            { yypushback(nonWsIndex(yytext())); yypushstate(sMETA_LIST); return INDENT;
            } 
            // fall through
          case 92: break;
          case 40: 
            { yylogstate(sPAD); return PAD;
            } 
            // fall through
          case 93: break;
          case 41: 
            { yylogstate(sOPEN); return OPEN;
            } 
            // fall through
          case 94: break;
          case 42: 
            { yylogstate(sNOTE); return NOTE;
            } 
            // fall through
          case 95: break;
          case 43: 
            { yylogstate(sPRICE); return PRICE;
            } 
            // fall through
          case 96: break;
          case 44: 
            { yylogstate(sEVENT); return EVENT;
            } 
            // fall through
          case 97: break;
          case 45: 
            { yylogstate(sQUERY); return QUERY;
            } 
            // fall through
          case 98: break;
          case 46: 
            { yylogstate(sOPT); return OPTION;
            } 
            // fall through
          case 99: break;
          case 47: 
            { yylogstate(sCUSTOM); return CUSTOM;
            } 
            // fall through
          case 100: break;
          case 48: 
            { yylogstate(sINCLUDE); return INCLUDE;
            } 
            // fall through
          case 101: break;
          case 49: 
            { yylogstate(sBALANCE); return BALANCE;
            } 
            // fall through
          case 102: break;
          case 50: 
            { yylogstate(sDOCUMENT); return DOCUMENT;
            } 
            // fall through
          case 103: break;
          case 51: 
            { yylogstate(sCOMMODITY); return COMMODITY;
            } 
            // fall through
          case 104: break;
          case 52: 
            { return DATE;
            } 
            // fall through
          case 105: break;
          case 53: 
            { yylogstate(sDATE_ENTRY); return DATE;
            } 
            // fall through
          case 106: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
