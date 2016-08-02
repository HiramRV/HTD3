/**
*SortsTest, Esta clase hace la prueba unitaria de la clase Sorts 
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
public class SortsTest {
    
    public SortsTest() {
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
     * Test of SelectionSort method, of class Sorts.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("SelectionSort");
        Object[] array = null;
        int n = 0;
        Sorts instance = new Sorts();
        Object[] expResult = null;
        Object[] result = instance.SelectionSort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of InsertionSort method, of class Sorts.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("InsertionSort");
        Object[] array = null;
        int n = 0;
        Sorts instance = new Sorts();
        Object[] expResult = null;
        Object[] result = instance.InsertionSort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of MergeSort method, of class Sorts.
     */
   

    /**
     * Test of QuickSort method, of class Sorts.
     */
  

    /**
     * Test of GetDatos method, of class Sorts.
     */
    @Test
    public void testGetDatos() {
        System.out.println("GetDatos");
        Sorts instance = new Sorts();
        Object[] expResult = null;
        Object[] result = instance.GetDatos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of SetDatos method, of class Sorts.
     */
    @Test
    public void testSetDatos() {
        System.out.println("SetDatos");
        Object[] datos = null;
        Sorts instance = new Sorts();
        instance.SetDatos(datos);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of MergeSort method, of class Sorts.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        Object[] array = null;
        Sorts instance = new Sorts();
        Object[] expResult = null;
        Object[] result = instance.MergeSort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of QuickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        Object[] array = null;
        Sorts instance = new Sorts();
        Object[] expResult = null;
        Object[] result = instance.QuickSort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
