import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RoverTeste {
	
	Rover rover;
	@Before
	public void beforeEachMethod() {
		GridSize size = new GridSize(100,100);
		Position pos = new Position(0, 0,size);
		Direction pos = direcao.EAST;

		rover = new Rover(x, y, direcao);

		@Test
	public void test1() {
		String navigation = "f";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 1);
		assertEquals(rover.getdirecao(), direcao.EAST);

		@Test
	public void test2() {
		String navigation = "ff";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 2);
		assertEquals(rover.getdirecao(), direcao.EAST);

		@Test
	public void test3() {
		String navigation = "b";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 99);
		assertEquals(rover.getdirecao(), direcao.EAST);