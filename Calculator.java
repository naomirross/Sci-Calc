import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JTextField inputDisplay = new JTextField();
	private JTextField outputDisplay = new JTextField();
	private String userInput = "";
	private String strDisplay = "";
	private double num1 = 0;
	private double num2 = 0;
	private double result = 0;
	private char operation = ' ';//operation like X, -, + etc
	
	//gen buttons
	private JButton bClear = new JButton("C");
	private JButton bOne = new JButton("1");
	private JButton bTwo = new JButton("2");
	private JButton bThree = new JButton("3");
	private JButton bFour = new JButton("4");
	private JButton bFive = new JButton("5");
	private JButton bSix = new JButton("6");
	private JButton bSeven = new JButton("7");
	private JButton bEight = new JButton("8");
	private JButton bNine = new JButton("9");
	private JButton bZero = new JButton("0");
	private JButton bDecimal = new JButton(".");
	private JButton bMultiply = new JButton("\u00D7"); //unicodes for symbols
	private JButton bDivide = new JButton("\u00F7");
	private JButton bPlus = new JButton("+");
	private JButton bMinus = new JButton("\u02D7");
	private JButton bEqual = new JButton("=");
	private JButton bXSquared = new JButton("x\u00B2");
	private JButton bXCubed = new JButton("x\u00B3");
	private JButton bSquareRoot = new JButton("\u221A");
	private JButton bPercent = new JButton("%");
	private JButton bMod = new JButton("Mod");
	private JButton bOneOverN = new JButton("1/n");
	private JButton bPlusOrMinus = new JButton("\u00B1");
	
	//scientific buttons
	private JButton bSin = new JButton("sin");
	private JButton bCos = new JButton("cos");
	private JButton bTan = new JButton("tan");
	private JButton bLog = new JButton("log");
	private JButton bLn = new JButton("ln");
	private JButton bAsin = new JButton("asin");
	private JButton bAcos = new JButton("acos");
	private JButton bAtan = new JButton("atan");
	private JButton bTenToNPower = new JButton("10^n");
	private JButton bAbs = new JButton("absolute");
	private JButton bSinH = new JButton("sinh");
	private JButton bCosH = new JButton("cosh");
	private JButton bTanH = new JButton("tanh");
	private JButton bExit = new JButton("EXIT");
	
	public Calculator() {		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();		
		
		this.setLayout(gbl);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.25;
		
		//input field
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 6;
		gbc.gridheight = 1;
		inputDisplay.setEditable(false);
		this.add(inputDisplay,gbc);
		//output field
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 6;
		gbc.gridheight = 1;
		outputDisplay.setEditable(false);
		this.add(outputDisplay,gbc);
		
		//gen calc
		gbc.gridx = 5;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		bClear.addActionListener(this);
		this.add(bClear,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bSeven,gbc);
		bSeven.addActionListener(this);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bEight,gbc);
		bEight.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;		
		this.add(bNine,gbc);
		bNine.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bMultiply,gbc);
		bMultiply.addActionListener(this);
		
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bDivide,gbc);
		bDivide.addActionListener(this);
		
		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bXSquared,gbc);
		bXSquared.addActionListener(this);
		//2nd row
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bFour,gbc);
		bFour.addActionListener(this);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bFive,gbc);
		bFive.addActionListener(this);

		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bSix,gbc);
		bSix.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bPlus,gbc);
		bPlus.addActionListener(this);
		
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bMinus,gbc);
		bMinus.addActionListener(this);
		
		gbc.gridx = 5;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bXCubed,gbc);
		bXCubed.addActionListener(this);
		//3rd row
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bOne,gbc);
		bOne.addActionListener(this);

		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bTwo,gbc);
		bTwo.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bThree,gbc);
		bThree.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		this.add(bEqual,gbc);
		bEqual.addActionListener(this);
		
		gbc.gridx = 5;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bMod,gbc);
		bMod.addActionListener(this);
		//4th row
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;;
		this.add(bZero,gbc);
		bZero.addActionListener(this);

		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bDecimal,gbc);
		bDecimal.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bPlusOrMinus,gbc);
		bPlusOrMinus.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bOneOverN,gbc);
		bOneOverN.addActionListener(this);
		
		gbc.gridx = 4;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bPercent,gbc);
		bPercent.addActionListener(this);
		
		gbc.gridx = 5;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bSquareRoot,gbc);
		bSquareRoot.addActionListener(this);
		
		
		//sci buttons
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.insets = new Insets(12,2,2,2);
		this.add(bSin,gbc);
		bSin.addActionListener(this);
		
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bCos,gbc);
		bCos.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bTan,gbc);
		bTan.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bLog,gbc);
		bLog.addActionListener(this);
		
		gbc.gridx = 4;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bLn,gbc);
		bLn.addActionListener(this);
		//2nd row
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bAsin,gbc);
		bAsin.addActionListener(this);
		
		gbc.gridx = 1;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bAcos,gbc);
		bAcos.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bAtan,gbc);
		bAtan.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bTenToNPower,gbc);
		bTenToNPower.addActionListener(this);
		
		gbc.gridx = 4;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bAbs,gbc);
		bAbs.addActionListener(this);
		//3rd row
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bSinH,gbc);
		bSinH.addActionListener(this);
		
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bCosH,gbc);
		bCosH.addActionListener(this);
		
		gbc.gridx = 2;
		gbc.gridy = 10;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(bTanH,gbc);
		bTanH.addActionListener(this);
		
		gbc.gridx = 3;
		gbc.gridy = 10;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		this.add(bExit,gbc);
		bExit.addActionListener(this);
		
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setSize(500,600);
		calc.setTitle("Scientific Calculator");
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//gen buttons
	if (e.getSource() == bZero) {
		strDisplay += "0";
		userInput += "0";
		inputDisplay.setText(strDisplay);
			
	} else if (e.getSource() == bOne) {
		if(operation == '=') {
		strDisplay = "1";
		userInput = "1";
		} else {
			strDisplay += "1";
			userInput += "1";
		}
		inputDisplay.setText(strDisplay);
		
	} else if (e.getSource() == bTwo) {
		if(operation == '=') {
			strDisplay = "2";
			userInput = "2";
			} else {
				strDisplay += "2";
				userInput += "2";
			}
			inputDisplay.setText(strDisplay);
			
	} else if (e.getSource() == bThree) {
		if(operation == '=') {
			strDisplay = "3";
			userInput = "3";
			} else {
				strDisplay += "3";
				userInput += "3";
			}
			inputDisplay.setText(strDisplay);
			
	} else if (e.getSource() == bFour) {
		if(operation == '=') {
			strDisplay = "4";
			userInput = "4";
			} else {
				strDisplay += "4";
				userInput += "4";
			}
			inputDisplay.setText(strDisplay);
			
	} else if (e.getSource() == bFive) {
		if(operation == '=') {
			strDisplay = "5";
			userInput = "5";
			} else {
				strDisplay += "5";
				userInput += "5";
			}
			inputDisplay.setText(strDisplay);
			
	}else if (e.getSource() == bSix) {
		if(operation == '=') {
			strDisplay = "6";
			userInput = "6";
			} else {
				strDisplay += "6";
				userInput += "6";
			}
			inputDisplay.setText(strDisplay);

	} else if (e.getSource() == bSeven) {
		if(operation == '=') {
			strDisplay = "7";
			userInput = "7";
			} else {
				strDisplay += "7";
				userInput += "7";
			}
			inputDisplay.setText(strDisplay);
					
	} else if (e.getSource() == bEight) {
		if(operation == '=') {
			strDisplay = "8";
			userInput = "8";
			} else {
				strDisplay += "8";
				userInput += "8";
			}
			inputDisplay.setText(strDisplay);
			
	} else if (e.getSource() == bNine) {
		if(operation == '=') {
			strDisplay = "9";
			userInput = "9";
			} else {
				strDisplay += "9";
				userInput += "9";
			}
			inputDisplay.setText(strDisplay);
			
	}  else if (e.getSource() == bDecimal) { // a number can only have one decimal
		if(strDisplay.equals("")) {
			strDisplay += "0.";
			userInput += "0.";
			inputDisplay.setText(strDisplay);
			
		} if(!strDisplay.contains(".")) {
			strDisplay += ".";
			userInput += ".";
			inputDisplay.setText(strDisplay);
		}
		
	} else if (e.getSource() == bPlusOrMinus && !strDisplay.equals("")) { //if input isn't empty 
		Double temp = Double.valueOf(strDisplay);
		
		if(temp >= 0) { // if positive add negative
			strDisplay = "-" + strDisplay;
			userInput = strDisplay;
			inputDisplay.setText(userInput);
			
		} else { //if negative remove symbol to make positive
			strDisplay = strDisplay.replace("-", "");
			userInput = strDisplay;
			inputDisplay.setText(userInput);
		}
	//operations
	} else if (e.getSource() == bPlus && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay += " + ";
		inputDisplay.setText(strDisplay);
		userInput = ""; //clear input for second number
		operation = '+';
		
	} else if (e.getSource() == bMinus && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay += " - ";
		inputDisplay.setText(strDisplay);
		userInput = "";
		operation = '-';
		
	} else if (e.getSource() == bMultiply && !strDisplay.equals("")) { 
		num1 = Double.valueOf(userInput);
		strDisplay += " * ";
		inputDisplay.setText(strDisplay);
		userInput = "";
		operation = '*';
		
	} else if (e.getSource() == bDivide && !strDisplay.equals("")) { 
		num1 = Double.valueOf(userInput);
		strDisplay += " / ";
		inputDisplay.setText(strDisplay);
		userInput = "";
		operation = '/';
		
	} else if (e.getSource() == bXSquared && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay += "^2";
		inputDisplay.setText(strDisplay);
		result = Math.pow(num1, 2);
		outputDisplay.setText(String.valueOf(result));
		operation = '='; 
		num1 = result; //for multiexpression problems
		userInput = String.valueOf(result);
		strDisplay = userInput;
		
	} else if (e.getSource() == bXCubed && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		userInput += "^3";
		operation = '=';
		result = Math.pow(num1, 3);
		inputDisplay.setText(String.valueOf(result));
		outputDisplay.setText(String.valueOf(result));
		num1 = result;
		userInput = String.valueOf(result);
		strDisplay = userInput;
	//equal
	} else if (e.getSource() == bEqual && !strDisplay.equals("")) {
		num2 = Double.valueOf(userInput);
		result = num2;
		switch(operation) {
		case('+'): 
			result = num1 + num2;
			break;
		case('-'):
			result = num1 - num2;
			break;
		case('*'):
			result = num1 * num2;
			break;
		case('/'):
			result = num1 / num2;
			break;
		case('m'):
			result = num1 % num2;
			break;
		}
		outputDisplay.setText(String.valueOf(result));
		num1 = result; 
		strDisplay = String.valueOf(num1);
		userInput = String.valueOf(num1);
		num2 = 0;
		operation = '=';
		
	} else if (e.getSource() == bMod && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay += " mod ";
		inputDisplay.setText(strDisplay);
		userInput = "";
		operation = 'm';
		
	} else if (e.getSource() == bSquareRoot && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "\u221A" + strDisplay;
		inputDisplay.setText(strDisplay);
		userInput = "";
		operation = '=';
		result = Math.sqrt(num1);
		outputDisplay.setText(String.valueOf(result));	
		num1 = result;
		userInput = String.valueOf(result);
	//updated % to divide inputted number by 100
	} else if (e.getSource() == bPercent && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = num1/100;
		operation = '=';
		strDisplay = String.valueOf(result);
		inputDisplay.setText(strDisplay);
		num1 = result;
		userInput = String.valueOf(num1);
		
		
	} else if (e.getSource() == bOneOverN && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "1/"+num1;
		inputDisplay.setText(strDisplay);
		operation = '=';
		result = 1/num1;
		outputDisplay.setText(String.valueOf(result));
		num1 = result;
		userInput = String.valueOf(num1);
	//sci buttons
	} else if (e.getSource() == bSin && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.sin(Math.toRadians(num1));
		strDisplay = "sin(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bCos && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.cos(Math.toRadians(num1));
		strDisplay = "cos(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bTan && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.tan(Math.toRadians(num1));
		strDisplay = "tan(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bSinH && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.sinh(Math.toRadians(num1));
		strDisplay = "sinh(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bCosH && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.cosh(Math.toRadians(num1));
		strDisplay = "cosh(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bTanH && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.tanh(Math.toRadians(num1));
		strDisplay = "tanh(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bAsin && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.asin(Math.toRadians(num1));
		strDisplay = "asin(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bAcos && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.acos(Math.toRadians(num1));
		strDisplay = "acos(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bAtan && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		result = Math.atan(Math.toRadians(num1));
		strDisplay = "atan(" + strDisplay + ")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		outputDisplay.setText(String.valueOf(result));
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bLn && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "ln" + strDisplay;
		inputDisplay.setText(strDisplay);
		operation = '=';
		result = Math.log(num1);
		outputDisplay.setText(String.valueOf(result));	
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bLog && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "log(" + strDisplay +")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		result = Math.log10(num1);
		outputDisplay.setText(String.valueOf(result));	
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bTenToNPower && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "10^" + strDisplay;
		inputDisplay.setText(strDisplay);
		operation = '=';
		result = Math.pow(10,num1);
		outputDisplay.setText(String.valueOf(result));	
		userInput = String.valueOf(result);
		num1 = result;
		
	} else if (e.getSource() == bAbs && !strDisplay.equals("")) {
		num1 = Double.valueOf(userInput);
		strDisplay = "abs(" + strDisplay +")";
		inputDisplay.setText(strDisplay);
		operation = '=';
		result = Math.abs(num1);
		outputDisplay.setText(String.valueOf(result));	
		userInput = String.valueOf(result);
		num1 = result;
	
	} else if (e.getSource() == bClear) {
		num1 = 0;
		num2 = 0;
		result = 0;
		strDisplay = "";
		userInput = "";
		inputDisplay.setText("0");
		outputDisplay.setText("0");
		operation = ' ';
		
	} else if(e.getSource() == bExit) {
		System.exit(0);
	}

}
}