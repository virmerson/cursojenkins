import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by Virmerson Bento dos Santos on 21/08/15.
 */
public class TestCalculadora {

    @Test
    public void testSomar (){
        Calculadora c = new Calculadora();
        int soma = c.calcularSoma(5, 5, 5);
        Assert.assertEquals(soma, 20);

    }
}
