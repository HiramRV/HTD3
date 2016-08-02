/**
 *RandomXTest, Esta clase hace la prueba unitaria de la clase RandomX
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-08-01
*/

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class RandomXTest {
    
    public RandomXTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RandomX method, of class RandomX.
     */
   

    /**
     * Test of getCantRandom method, of class RandomX.
     */
    @Test
    public void testGetCantRandom() {
        System.out.println("getCantRandom");
        RandomX instance = null;
        int expResult = 0;
        int result = instance.getCantRandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCantRandom method, of class RandomX.
     */
    @Test
    public void testSetCantRandom() {
        System.out.println("setCantRandom");
        int cantRandom = 0;
        RandomX instance = null;
        instance.setCantRandom(cantRandom);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CrearArchivo method, of class RandomX.
     */
    @Test
    public void testCrearArchivo() {
        System.out.println("CrearArchivo");
        String Ruta = "";
        RandomX instance = null;
        instance.CrearArchivo(Ruta);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of LeerArchivo method, of class RandomX.
     */
    @Test
    public void testLeerArchivo() {
        System.out.println("LeerArchivo");
        String RutaArchivo = "";
        RandomX instance = null;
        Object[] expResult = null;
        Object[] result = instance.LeerArchivo(RutaArchivo);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
