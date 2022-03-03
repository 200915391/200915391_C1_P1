/* The following code was generated by JFlex 1.4.3 on 3/03/22 02:26 AM */

package scaner_01;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/03/22 02:26 AM from the specification file
 * <tt>src/scaner_01/lexicocup.flex</tt>
 */
public class LexicoCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3, 97,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 
    19, 20, 21, 22, 23, 24, 25, 26, 27,  1, 28, 29, 30, 31, 32, 33, 
    34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 
    50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 
    66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
    82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
    "\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
    "\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
    "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
    "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127"+
    "\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137"+
    "\1\140\1\141\1\142\1\0\1\143\1\144\1\145\1\0"+
    "\1\3\1\146\1\147\1\150\1\142\1\0\1\3\1\151"+
    "\1\152";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
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
    "\0\0\0\142\0\304\0\u0126\0\u0188\0\142\0\142\0\142"+
    "\0\142\0\u01ea\0\142\0\142\0\142\0\142\0\142\0\142"+
    "\0\u0188\0\u024c\0\142\0\u02ae\0\304\0\304\0\304\0\304"+
    "\0\304\0\304\0\304\0\304\0\304\0\142\0\142\0\u0310"+
    "\0\142\0\142\0\142\0\142\0\u0126\0\u0126\0\u0372\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\142\0\u03d4"+
    "\0\142\0\142\0\u0126\0\142\0\u0126\0\u0126\0\u0126\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126"+
    "\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\u0126\0\142\0\142"+
    "\0\142\0\142\0\304\0\u0436\0\142\0\142\0\u0498\0\u04fa"+
    "\0\u055c\0\142\0\142\0\142\0\u0436\0\u05be\0\u0620\0\u04fa"+
    "\0\u0126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
    "\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
    "\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111"+
    "\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
    "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
    "\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
    "\1\142\1\5\143\0\1\143\17\0\1\144\1\0\11\143"+
    "\107\0\2\4\20\0\11\4\7\0\32\4\4\0\1\4"+
    "\1\0\32\4\10\0\1\5\13\0\1\5\121\0\1\5"+
    "\10\0\1\145\171\0\1\146\123\0\1\147\123\0\1\150"+
    "\136\0\2\4\20\0\11\4\7\0\16\4\1\151\13\4"+
    "\4\0\1\4\1\0\32\4\12\0\1\152\4\0\1\153"+
    "\105\0\1\154\22\0\1\155\21\0\11\155\106\0\141\147"+
    "\1\0\4\150\1\156\135\150\1\0\2\4\20\0\11\4"+
    "\7\0\15\4\1\157\14\4\4\0\1\4\1\0\32\4"+
    "\5\0\4\150\1\156\33\150\1\160\101\150\1\0\2\4"+
    "\20\0\11\4\7\0\11\4\1\161\20\4\4\0\1\4"+
    "\1\0\32\4\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1666];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\4\11\1\1\6\11\2\1\1\11"+
    "\12\1\2\11\1\1\4\11\32\1\1\11\1\1\2\11"+
    "\1\1\1\11\32\1\4\11\1\1\1\0\2\11\1\1"+
    "\1\0\1\1\3\11\1\1\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 25: 
          { return new Symbol(sym.CINCO_, yychar, yyline, yytext());
          }
        case 107: break;
        case 84: 
          { return new Symbol(sym.LETRAQMIN_, yychar, yyline, yytext());
          }
        case 108: break;
        case 42: 
          { return new Symbol(sym.LETRAGMAY_, yychar, yyline, yytext());
          }
        case 109: break;
        case 19: 
          { return new Symbol(sym.BARRA_, yychar, yyline, yytext());
          }
        case 110: break;
        case 66: 
          { return new Symbol(sym.GUIONBAJO_, yychar, yyline, yytext());
          }
        case 111: break;
        case 65: 
          { return new Symbol(sym.ACENTOCIRCUNFLEJO_, yychar, yyline, yytext());
          }
        case 112: break;
        case 89: 
          { return new Symbol(sym.LETRAVMIN_, yychar, yyline, yytext());
          }
        case 113: break;
        case 32: 
          { return new Symbol(sym.IGUAL_, yychar, yyline, yytext());
          }
        case 114: break;
        case 47: 
          { return new Symbol(sym.LETRALMAY_, yychar, yyline, yytext());
          }
        case 115: break;
        case 28: 
          { return new Symbol(sym.OCHO_, yychar, yyline, yytext());
          }
        case 116: break;
        case 60: 
          { return new Symbol(sym.LETRAYMAY_, yychar, yyline, yytext());
          }
        case 117: break;
        case 64: 
          { return new Symbol(sym.CORCHECERRADO_, yychar, yyline, yytext());
          }
        case 118: break;
        case 52: 
          { return new Symbol(sym.LETRAQMAY_, yychar, yyline, yytext());
          }
        case 119: break;
        case 102: 
          { return new Symbol(sym.COMILLADOBLETEXTO_, yychar, yyline, yytext());
          }
        case 120: break;
        case 71: 
          { return new Symbol(sym.LETRADMIN_, yychar, yyline, yytext());
          }
        case 121: break;
        case 35: 
          { return new Symbol(sym.ARROBA_, yychar, yyline, yytext());
          }
        case 122: break;
        case 76: 
          { return new Symbol(sym.LETRAIMIN_, yychar, yyline, yytext());
          }
        case 123: break;
        case 8: 
          { return new Symbol(sym.DOLAR_, yychar, yyline, yytext());
          }
        case 124: break;
        case 33: 
          { return new Symbol(sym.MAYORQUE_, yychar, yyline, yytext());
          }
        case 125: break;
        case 81: 
          { return new Symbol(sym.LETRANMIN_, yychar, yyline, yytext());
          }
        case 126: break;
        case 39: 
          { return new Symbol(sym.LETRADMAY_, yychar, yyline, yytext());
          }
        case 127: break;
        case 13: 
          { return new Symbol(sym.PARENTESISCERRADO_, yychar, yyline, yytext());
          }
        case 128: break;
        case 62: 
          { return new Symbol(sym.CORCHETEABIERTO_, yychar, yyline, yytext());
          }
        case 129: break;
        case 98: 
          { return new Symbol(sym.NUMEROCOMPUESTO_, yychar, yyline, yytext());
          }
        case 130: break;
        case 86: 
          { return new Symbol(sym.LETRASMIN_, yychar, yyline, yytext());
          }
        case 131: break;
        case 44: 
          { return new Symbol(sym.LETRAIMAY_, yychar, yyline, yytext());
          }
        case 132: break;
        case 4: 
          { /*Ignore*/
          }
        case 133: break;
        case 57: 
          { return new Symbol(sym.LETRAVMAY_, yychar, yyline, yytext());
          }
        case 134: break;
        case 91: 
          { return new Symbol(sym.LETRAXMIN_, yychar, yyline, yytext());
          }
        case 135: break;
        case 49: 
          { return new Symbol(sym.LETRANMAY_, yychar, yyline, yytext());
          }
        case 136: break;
        case 10: 
          { return new Symbol(sym.AMPERSAND_, yychar, yyline, yytext());
          }
        case 137: break;
        case 94: 
          { return new Symbol(sym.LLAVEA_, yychar, yyline, yytext());
          }
        case 138: break;
        case 68: 
          { return new Symbol(sym.LETRAAMIN_, yychar, yyline, yytext());
          }
        case 139: break;
        case 54: 
          { return new Symbol(sym.LETRASMAY_, yychar, yyline, yytext());
          }
        case 140: break;
        case 73: 
          { return new Symbol(sym.LETRAFMIN_, yychar, yyline, yytext());
          }
        case 141: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 142: break;
        case 15: 
          { return new Symbol(sym.MAS_, yychar, yyline, yytext());
          }
        case 143: break;
        case 99: 
          { return new Symbol(sym.SEPARADOR_, yychar, yyline, yytext());
          }
        case 144: break;
        case 78: 
          { return new Symbol(sym.LETRAKMIN_, yychar, yyline, yytext());
          }
        case 145: break;
        case 36: 
          { return new Symbol(sym.LETRAAMAY_, yychar, yyline, yytext());
          }
        case 146: break;
        case 83: 
          { return new Symbol(sym.LETRAPMIN_, yychar, yyline, yytext());
          }
        case 147: break;
        case 21: 
          { return new Symbol(sym.UNO_, yychar, yyline, yytext());
          }
        case 148: break;
        case 41: 
          { return new Symbol(sym.LETRAFMAY_, yychar, yyline, yytext());
          }
        case 149: break;
        case 27: 
          { return new Symbol(sym.SIETE_, yychar, yyline, yytext());
          }
        case 150: break;
        case 88: 
          { return new Symbol(sym.LETRAUMIN_, yychar, yyline, yytext());
          }
        case 151: break;
        case 46: 
          { return new Symbol(sym.LETRAKMAY_, yychar, yyline, yytext());
          }
        case 152: break;
        case 59: 
          { return new Symbol(sym.LETRAXMAY_, yychar, yyline, yytext());
          }
        case 153: break;
        case 2: 
          { return new Symbol(sym.NUEVE_, yychar, yyline, yytext());
          }
        case 154: break;
        case 93: 
          { return new Symbol(sym.LETRAZMIN_, yychar, yyline, yytext());
          }
        case 155: break;
        case 51: 
          { return new Symbol(sym.LETRAPMAY_, yychar, yyline, yytext());
          }
        case 156: break;
        case 16: 
          { return new Symbol(sym.COMA_, yychar, yyline, yytext());
          }
        case 157: break;
        case 70: 
          { return new Symbol(sym.LETRACMIN_, yychar, yyline, yytext());
          }
        case 158: break;
        case 56: 
          { return new Symbol(sym.LETRAUMAY_, yychar, yyline, yytext());
          }
        case 159: break;
        case 11: 
          { return new Symbol(sym.COMILLASIMPLE_, yychar, yyline, yytext());
          }
        case 160: break;
        case 12: 
          { return new Symbol(sym.PARENTESISABIERTO_, yychar, yyline, yytext());
          }
        case 161: break;
        case 75: 
          { return new Symbol(sym.LETRAHMIN_, yychar, yyline, yytext());
          }
        case 162: break;
        case 30: 
          { return new Symbol(sym.PUNTOYCOMA_, yychar, yyline, yytext());
          }
        case 163: break;
        case 7: 
          { return new Symbol(sym.NUMERAL_, yychar, yyline, yytext());
          }
        case 164: break;
        case 80: 
          { return new Symbol(sym.LETRAMMIN_, yychar, yyline, yytext());
          }
        case 165: break;
        case 18: 
          { return new Symbol(sym.PUNTO_, yychar, yyline, yytext());
          }
        case 166: break;
        case 38: 
          { return new Symbol(sym.LETRACMAY_, yychar, yyline, yytext());
          }
        case 167: break;
        case 100: 
          { return new Symbol(sym.ASIGNACIONCONJUNTO_, yychar, yyline, yytext());
          }
        case 168: break;
        case 97: 
          { return new Symbol(sym.TILDE_, yychar, yyline, yytext());
          }
        case 169: break;
        case 85: 
          { return new Symbol(sym.LETRARMIN_, yychar, yyline, yytext());
          }
        case 170: break;
        case 43: 
          { return new Symbol(sym.LETRAHMAY_, yychar, yyline, yytext());
          }
        case 171: break;
        case 101: 
          { return new Symbol(sym.COMENTUNILINEA_, yychar, yyline, yytext());
          }
        case 172: break;
        case 24: 
          { return new Symbol(sym.CUATRO_, yychar, yyline, yytext());
          }
        case 173: break;
        case 63: 
          { return new Symbol(sym.BARRAINVERTIDA_, yychar, yyline, yytext());
          }
        case 174: break;
        case 29: 
          { return new Symbol(sym.DOSPUNTOS_, yychar, yyline, yytext());
          }
        case 175: break;
        case 26: 
          { return new Symbol(sym.SEIS_, yychar, yyline, yytext());
          }
        case 176: break;
        case 67: 
          { return new Symbol(sym.ACENTOGRAVE_, yychar, yyline, yytext());
          }
        case 177: break;
        case 90: 
          { return new Symbol(sym.LETRAWMIN_, yychar, yyline, yytext());
          }
        case 178: break;
        case 48: 
          { return new Symbol(sym.LETRAMMAY_, yychar, yyline, yytext());
          }
        case 179: break;
        case 61: 
          { return new Symbol(sym.LETRAZMAY_, yychar, yyline, yytext());
          }
        case 180: break;
        case 20: 
          { return new Symbol(sym.CERO_, yychar, yyline, yytext());
          }
        case 181: break;
        case 103: 
          { return new Symbol(sym.COMILLASIMPLETEXTO_, yychar, yyline, yytext());
          }
        case 182: break;
        case 53: 
          { return new Symbol(sym.LETRARMAY_, yychar, yyline, yytext());
          }
        case 183: break;
        case 3: 
          { return new Symbol(sym.IDENTIFICADOR_, yychar, yyline, yytext());
          }
        case 184: break;
        case 23: 
          { return new Symbol(sym.TRES_, yychar, yyline, yytext());
          }
        case 185: break;
        case 72: 
          { return new Symbol(sym.LETRAEMIN_, yychar, yyline, yytext());
          }
        case 186: break;
        case 31: 
          { return new Symbol(sym.MENORQUE_, yychar, yyline, yytext());
          }
        case 187: break;
        case 17: 
          { return new Symbol(sym.MENOS_, yychar, yyline, yytext());
          }
        case 188: break;
        case 105: 
          { return new Symbol(sym.COMENTMULTILINEA_, yychar, yyline, yytext());
          }
        case 189: break;
        case 77: 
          { return new Symbol(sym.LETRAJMIN_, yychar, yyline, yytext());
          }
        case 190: break;
        case 22: 
          { return new Symbol(sym.DOS_, yychar, yyline, yytext());
          }
        case 191: break;
        case 82: 
          { return new Symbol(sym.LETRAOMIN_, yychar, yyline, yytext());
          }
        case 192: break;
        case 40: 
          { return new Symbol(sym.LETRAEMAY_, yychar, yyline, yytext());
          }
        case 193: break;
        case 6: 
          { return new Symbol(sym.COMILLADOBLE_, yychar, yyline, yytext());
          }
        case 194: break;
        case 96: 
          { return new Symbol(sym.LLAVEC_, yychar, yyline, yytext());
          }
        case 195: break;
        case 104: 
          { return new Symbol(sym.SALTODELINEATEXTO_, yychar, yyline, yytext());
          }
        case 196: break;
        case 87: 
          { return new Symbol(sym.LETRATMIN_, yychar, yyline, yytext());
          }
        case 197: break;
        case 5: 
          { return new Symbol(sym.ADMIRACION_, yychar, yyline, yytext());
          }
        case 198: break;
        case 45: 
          { return new Symbol(sym.LETRAJMAY_, yychar, yyline, yytext());
          }
        case 199: break;
        case 58: 
          { return new Symbol(sym.LETRAWMAY_, yychar, yyline, yytext());
          }
        case 200: break;
        case 106: 
          { return new Symbol(sym.CONJUNTO_, yychar, yyline, yytext());
          }
        case 201: break;
        case 92: 
          { return new Symbol(sym.LETRAYMIN_, yychar, yyline, yytext());
          }
        case 202: break;
        case 9: 
          { return new Symbol(sym.PORCENTAJE_, yychar, yyline, yytext());
          }
        case 203: break;
        case 50: 
          { return new Symbol(sym.LETRAOMAY_, yychar, yyline, yytext());
          }
        case 204: break;
        case 69: 
          { return new Symbol(sym.LETRABMIN_, yychar, yyline, yytext());
          }
        case 205: break;
        case 55: 
          { return new Symbol(sym.LETRATMAY_, yychar, yyline, yytext());
          }
        case 206: break;
        case 95: 
          { return new Symbol(sym.BARRAVERTICAL_, yychar, yyline, yytext());
          }
        case 207: break;
        case 74: 
          { return new Symbol(sym.LETRAGMIN_, yychar, yyline, yytext());
          }
        case 208: break;
        case 34: 
          { return new Symbol(sym.INTERROGACION_, yychar, yyline, yytext());
          }
        case 209: break;
        case 79: 
          { return new Symbol(sym.LETRALMIN_, yychar, yyline, yytext());
          }
        case 210: break;
        case 37: 
          { return new Symbol(sym.LETRABMAY_, yychar, yyline, yytext());
          }
        case 211: break;
        case 14: 
          { return new Symbol(sym.ASTERISCO_, yychar, yyline, yytext());
          }
        case 212: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
