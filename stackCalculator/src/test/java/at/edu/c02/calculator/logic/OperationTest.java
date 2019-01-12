package at.edu.c02.calculator.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.logic.operations.Add;
import at.edu.c02.calculator.logic.operations.Div;
import at.edu.c02.calculator.logic.operations.Mul;
import at.edu.c02.calculator.logic.operations.Sub;

public class OperationTest {

	@Test
	public void testAdd() throws CalculatorException {
		
		//setup
		MathOperation add = new Add();
		
		//execute
		double result = add.calculate(1, 2);
		
		//verify
		assertEquals(3, result, 0.0001);
	}
	
	@Test
	public void testMul() throws CalculatorException {
		
		//setup
		MathOperation mul = new Mul();
		
		//execute
		double result = mul.calculate(2,2);
		
		//verify
		assertEquals(4, result, 0.0001);
		
	}

	@Test
	public void testDiv() throws CalculatorException {
		
		//setup
		MathOperation div = new Div();
		
		//execute
		double result = div.calculate(10,5);
		
		//verify
		assertEquals(2, result, 0.0001);
		
	}

	
	@Test
	public void testSub() throws CalculatorException {
		
		//setup
		MathOperation sub = new Sub();
		
		//execute
		double result = sub.calculate(12,5);
		
		//verify
		assertEquals(7, result, 0.0001);
		
	}
}
