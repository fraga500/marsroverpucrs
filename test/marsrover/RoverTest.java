/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PedroFranceschinideF
 */
public class RoverTest {
    
     public RoverTest() {
    }
    
    
    @Before
    public void position() {
    Posicao p = new Posicao(new Mapa.Coordenadas(1), new Mapa.Coordenadas(2), marsrover.Mapa.Direcao.N);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testePosition() {
        
    }
}
