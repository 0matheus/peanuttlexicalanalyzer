/* The following code was generated by JFlex 1.6.1 */

package peanuttlexicalanalyzer;
import static peanuttlexicalanalyzer.PeanuttToken.*;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/mathe/Documents/NetBeansProjects/PeanuttLexicalAnalyzer/src/peanuttlexicalanalyzer/PeanuttLexical.pen</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\1\57\1\57\1\57\22\0\1\3\1\30\1\41"+
    "\1\0\1\40\2\0\1\54\1\32\1\33\1\34\1\35\1\31\1\36"+
    "\1\27\1\37\1\1\11\2\1\25\1\45\1\46\1\26\1\47\2\0"+
    "\1\24\1\44\2\24\1\22\12\24\1\42\1\24\1\16\1\4\3\24"+
    "\1\21\3\24\4\0\1\23\1\0\1\15\1\24\1\52\1\20\1\17"+
    "\1\12\1\11\1\53\1\7\2\24\1\13\1\24\1\10\1\14\2\24"+
    "\1\6\1\50\1\5\1\43\1\24\1\51\3\24\1\55\1\23\1\56"+
    "\7\0\1\57\u1fa2\0\1\57\1\57\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\11\4\1\5\1\6\1\7"+
    "\3\6\1\10\1\11\1\12\1\13\1\1\1\14\1\4"+
    "\1\15\1\16\1\17\2\4\1\20\1\21\1\22\1\0"+
    "\4\5\1\23\10\5\1\24\1\25\1\26\2\0\1\27"+
    "\1\0\1\30\1\5\1\31\1\32\2\5\2\33\4\5"+
    "\1\34\1\5\1\35\4\5\2\0\4\5\1\36\1\37"+
    "\2\5\1\40\1\5\1\0\4\5\1\41\1\5\1\0"+
    "\2\5\1\42\1\43\2\0\1\5\1\44\1\0\1\5"+
    "\1\45\4\5\1\46\3\5\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[115];
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
    "\0\0\0\60\0\140\0\220\0\60\0\300\0\360\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0120\0\u0270"+
    "\0\60\0\60\0\u02a0\0\u02d0\0\60\0\60\0\60\0\60"+
    "\0\u0300\0\u0330\0\u0360\0\60\0\u0390\0\u03c0\0\u03f0\0\u0420"+
    "\0\60\0\60\0\60\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510"+
    "\0\u0120\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\60\0\60\0\60\0\u06c0\0\u0300\0\60\0\u0330"+
    "\0\60\0\u06f0\0\60\0\60\0\u0720\0\u0750\0\60\0\u0780"+
    "\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0120\0\u0870\0\u0120\0\u08a0"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20"+
    "\0\u0a50\0\u0120\0\u0120\0\u0a80\0\u0ab0\0\u0120\0\u0ae0\0\u0b10"+
    "\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0120\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0c90\0\u0120\0\u0120\0\u0cc0\0\u0cf0\0\u0d20\0\u0120\0\u0d50"+
    "\0\u0d80\0\60\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0120\0\u0e70"+
    "\0\u0ea0\0\u0ed0\0\u0120";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[115];
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
    "\2\10\1\12\3\10\1\13\1\14\1\10\1\15\1\16"+
    "\1\17\1\10\1\20\1\21\1\22\1\23\1\22\1\24"+
    "\1\22\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\2\10\1\34\1\35\1\36\1\37\1\40\2\10\1\41"+
    "\1\42\1\43\112\0\1\44\27\0\2\4\26\0\1\44"+
    "\27\0\2\17\1\0\1\17\1\45\17\17\15\0\3\17"+
    "\3\0\4\17\5\0\2\17\1\0\2\17\1\46\16\17"+
    "\15\0\3\17\3\0\3\17\1\47\5\0\2\17\1\0"+
    "\21\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\4\17\1\50\1\17\1\51\12\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\7\17\1\52\1\53\1\54"+
    "\7\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\13\17\1\55\5\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\4\17\1\56\2\17\1\57\11\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\17\1\0\2\17\1\60"+
    "\16\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\4\17\1\61\14\17\15\0\3\17\3\0\4\17\31\0"+
    "\1\62\1\63\57\0\1\64\63\0\1\65\25\0\40\66"+
    "\1\67\17\66\41\70\1\71\16\70\1\0\2\17\1\0"+
    "\13\17\1\72\5\17\15\0\3\17\3\0\4\17\32\0"+
    "\1\73\57\0\1\74\32\0\2\17\1\0\21\17\15\0"+
    "\3\17\3\0\1\17\1\75\2\17\5\0\2\17\1\0"+
    "\21\17\15\0\3\17\3\0\3\17\1\76\5\0\1\77"+
    "\1\100\56\0\2\17\1\0\2\17\1\101\6\17\1\102"+
    "\7\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\21\17\15\0\1\17\1\103\1\17\3\0\4\17\5\0"+
    "\2\17\1\0\13\17\1\104\5\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\1\17\1\105\17\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\17\1\0\10\17\1\106"+
    "\10\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\2\17\1\107\16\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\7\17\1\110\11\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\11\17\1\61\7\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\17\1\0\14\17\1\111"+
    "\4\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\21\17\15\0\3\17\3\0\1\112\3\17\5\0\2\17"+
    "\1\0\3\17\1\113\15\17\15\0\3\17\3\0\4\17"+
    "\5\0\2\17\1\0\14\17\1\105\4\17\15\0\3\17"+
    "\3\0\4\17\5\0\1\114\1\115\56\0\2\17\1\0"+
    "\11\17\1\116\7\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\3\17\1\117\15\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\3\17\1\120\15\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\100\56\0\2\17\1\0"+
    "\3\17\1\121\15\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\2\17\1\50\16\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\13\17\1\122\5\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\17\1\0\4\17\1\123"+
    "\14\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\11\17\1\50\7\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\21\17\15\0\3\17\3\0\1\103\3\17"+
    "\5\0\2\17\1\0\3\17\1\124\2\17\1\125\12\17"+
    "\15\0\3\17\3\0\4\17\5\0\2\17\1\0\13\17"+
    "\1\126\5\17\15\0\3\17\3\0\4\17\5\0\2\17"+
    "\1\0\1\17\1\127\17\17\15\0\3\17\3\0\4\17"+
    "\40\0\1\130\24\0\2\115\31\0\1\130\24\0\2\17"+
    "\1\0\4\17\1\131\14\17\15\0\3\17\3\0\4\17"+
    "\5\0\2\17\1\0\1\17\1\132\17\17\15\0\3\17"+
    "\3\0\4\17\5\0\2\17\1\0\7\17\1\133\11\17"+
    "\15\0\3\17\3\0\4\17\5\0\2\17\1\0\4\17"+
    "\1\134\14\17\15\0\3\17\3\0\4\17\5\0\2\17"+
    "\1\0\6\17\1\135\12\17\15\0\3\17\3\0\4\17"+
    "\5\0\2\17\1\0\10\17\1\136\10\17\15\0\3\17"+
    "\3\0\4\17\5\0\2\17\1\0\13\17\1\105\5\17"+
    "\15\0\3\17\3\0\4\17\40\0\1\137\24\0\2\17"+
    "\1\0\21\17\15\0\1\17\1\140\1\17\3\0\4\17"+
    "\5\0\2\17\1\0\21\17\15\0\3\17\3\0\2\17"+
    "\1\141\1\17\5\0\2\17\1\0\13\17\1\142\5\17"+
    "\15\0\3\17\3\0\4\17\5\0\2\17\1\0\5\17"+
    "\1\105\13\17\15\0\3\17\3\0\4\17\5\0\2\17"+
    "\1\0\2\17\1\143\16\17\15\0\3\17\3\0\4\17"+
    "\5\0\1\144\1\145\56\0\2\17\1\0\1\17\1\146"+
    "\17\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\21\17\15\0\3\17\3\0\3\17\1\147\37\0\1\150"+
    "\25\0\2\145\30\0\1\150\25\0\2\17\1\0\1\17"+
    "\1\151\17\17\15\0\3\17\3\0\4\17\37\0\1\152"+
    "\25\0\2\17\1\0\16\17\1\153\2\17\15\0\2\17"+
    "\1\154\3\0\4\17\5\0\2\17\1\0\4\17\1\155"+
    "\14\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\13\17\1\156\5\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\14\17\1\157\4\17\15\0\3\17\3\0"+
    "\4\17\5\0\2\17\1\0\5\17\1\160\13\17\15\0"+
    "\3\17\3\0\4\17\5\0\2\17\1\0\5\17\1\161"+
    "\13\17\15\0\3\17\3\0\4\17\5\0\2\17\1\0"+
    "\3\17\1\162\15\17\15\0\3\17\3\0\4\17\5\0"+
    "\2\17\1\0\4\17\1\163\14\17\15\0\3\17\3\0"+
    "\4\17\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3840];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\13\1\2\11\2\1\4\11"+
    "\3\1\1\11\4\1\3\11\1\0\15\1\3\11\2\0"+
    "\1\11\1\0\1\11\1\1\2\11\2\1\1\11\14\1"+
    "\2\0\12\1\1\0\6\1\1\0\4\1\2\0\2\1"+
    "\1\0\1\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[115];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public PeanuttToken yylex() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return ERROR;
            }
          case 40: break;
          case 2: 
            { lexeme = "line: "+yyline+" column: "+yycolumn+" "+yytext(); return INTEIRO;
            }
          case 41: break;
          case 3: 
            { /**/
            }
          case 42: break;
          case 4: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return CARACTER;
            }
          case 43: break;
          case 5: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SET_OF_CARACTERS;
            }
          case 44: break;
          case 6: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SIMBOLO;
            }
          case 45: break;
          case 7: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return IGUAL;
            }
          case 46: break;
          case 8: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return MULT;
            }
          case 47: break;
          case 9: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SOMA;
            }
          case 48: break;
          case 10: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return MENOS;
            }
          case 49: break;
          case 11: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return DIV;
            }
          case 50: break;
          case 12: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return DOUBLEQUOTE;
            }
          case 51: break;
          case 13: 
            { 
            }
          case 52: break;
          case 14: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return LESSTHEN;
            }
          case 53: break;
          case 15: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return GREATERTHEN;
            }
          case 54: break;
          case 16: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SINGLEQUOTE;
            }
          case 55: break;
          case 17: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return OBLOCK;
            }
          case 56: break;
          case 18: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return CBLOCK;
            }
          case 57: break;
          case 19: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return IF;
            }
          case 58: break;
          case 20: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SEPARATOR;
            }
          case 59: break;
          case 21: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return RECEBE;
            }
          case 60: break;
          case 22: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return DIFF;
            }
          case 61: break;
          case 23: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return COMENTARIO;
            }
          case 62: break;
          case 24: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return STRING;
            }
          case 63: break;
          case 25: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return LESSTHENEQUALS;
            }
          case 64: break;
          case 26: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return GREATERTHENEQUALS;
            }
          case 65: break;
          case 27: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return REAL;
            }
          case 66: break;
          case 28: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return PALAVRA_RESERVADA;
            }
          case 67: break;
          case 29: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return FOR;
            }
          case 68: break;
          case 30: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return BOOLEAN;
            }
          case 69: break;
          case 31: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return THEN;
            }
          case 70: break;
          case 32: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return ELSE;
            }
          case 71: break;
          case 33: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return ENDIF;
            }
          case 72: break;
          case 34: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return WHILE;
            }
          case 73: break;
          case 35: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return ENDFOR;
            }
          case 74: break;
          case 36: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return SWITCH;
            }
          case 75: break;
          case 37: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return MODULO;
            }
          case 76: break;
          case 38: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return END_CODE;
            }
          case 77: break;
          case 39: 
            { lexeme =  yytext()+ " line "+yyline+" column "+yycolumn; return CODE;
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
