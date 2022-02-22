
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Feb 14 19:05:43 CST 2022
//----------------------------------------------------

package scaner_01;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Feb 14 19:05:43 CST 2022
  */
public class sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public sintax() {super();}

  /** Constructor which sets the default scanner. */
  public sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\002\000\002\002\004\000\002\002\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\005\000\004\144\004\001\002\000\004\146\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\005\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$sintax$actions {
  private final sintax parser;

  /** Constructor */
  CUP$sintax$actions(sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$sintax$do_action(
    int                        CUP$sintax$act_num,
    java_cup.runtime.lr_parser CUP$sintax$parser,
    java.util.Stack            CUP$sintax$stack,
    int                        CUP$sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintax$result;

      /* select the action based on the action number */
      switch (CUP$sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LLAVEA_ LLAVEC_ 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintax$stack.elementAt(CUP$sintax$top-1)).value;
		RESULT = start_val;
              CUP$sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintax$parser.done_parsing();
          return CUP$sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

