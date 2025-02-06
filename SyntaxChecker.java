// Name - Joshua Vento-Jones

import java.util.Stack;
import static java.lang.System.*;
import java.util.HashMap;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;
	
	private HashMap<Character, Character> checkSymbols; // Used a HashMap to set up key/value pairs for the beginning/ending symbols

	// No-argument constructor sets exp to be blank. Will automatically turn out correct as there are no symbols, thus there are no inappropriate openings/closings.
	public SyntaxChecker()
	{
		setExpression("");
		setUpMap();
	}

	// @param s to set the exp variable to, to be split up by characters to check for correct openings and closing symbols.
	public SyntaxChecker(String s)
	{
		setExpression(s);
		setUpMap();
	}
	
	// @ param s to set exp variable to, expression to be analyzed.
	// Creates Stack symbols and pushes every character in exp to it.
	public void setExpression(String s)
	{
		exp = s;
		symbols = new Stack<Character>();
		for(int i = 0; i<s.length(); i++) {
			symbols.push(s.charAt(i));
		}
	}

	// @return true if there are no extra symbols that don't coincide with the beginning/ending symbols. False if there are repeats and openings/closings do not match.
	// Runs through symbols, if a symbol is an opening symbol, it checks to see if it's closing symbol (the value) is there. Otherwise returns false.
	// If there are no opening/closing symbols left after the for loop, returns whether or not the tempStack is empty (meaning that all opening symbols had a closing symbol).
	// Ensure setUpMap() has been run and that symbols is instantiated before running.
	public boolean checkExpression()
	{
		Stack<Character> tempStack = new Stack<Character>();
		for(char ch : symbols) {
			if(checkSymbols.containsKey(ch)){
				tempStack.push(ch);

			}
			else if(checkSymbols.containsValue(ch)){
				if(tempStack.isEmpty() || checkSymbols.get(tempStack.pop()) != ch){
					return false;
				}
			}
		}
		return tempStack.isEmpty();
	}

	// @return a run of the checkExpression() saying whether or not the symbol usage was correct (true) or false (incorrect).
	public String toString() {
		if(!checkExpression()){
			return exp + " is incorrect.";
		}
		return exp + " is correct.";
	}

	// Puts in key/value pairs in checkSymbols based on the opening/closing symbols given in the lab.
	public void setUpMap(){
		checkSymbols = new HashMap();
		checkSymbols.put('(',')');
		checkSymbols.put('{', '}');
		checkSymbols.put('<','>');
		checkSymbols.put('[',']');
	}
}
