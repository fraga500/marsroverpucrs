import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RoverTeste {
	
	Rover rover;
	@Before
	public void beforeEachMethod() {
		GridSize size = new GridSize(5,5);
		Posicao  pos = new Posicao(0, 0,size);
		Direcao  pos = Direcao.EAST;

		rover = new Rover(x, y, Direcao);

		@Test
	public void test1() {
		String navigation = "f";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 1);
		assertEquals(rover.getdirecao(), Direcao.EAST);

		@Test
	public void test2() {
		String navigation = "ff";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 2);
		assertEquals(rover.getdirecao(), Direcao.EAST);

		@Test
	public void test3() {
		String navigation = "b";
		RoverTeste.traverse(rover, navigation);
		assertEquals(rover.getCurrentPosition().getXPos(), 0);
		assertEquals(rover.getCurrentPosition().getYPos(), 5);
		assertEquals(rover.getdirecao(), Direcao.EAST);