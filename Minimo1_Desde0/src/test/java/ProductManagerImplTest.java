import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerImplTest {
    ProductManagerImpl scenario;

    @Before
    public void setUp() {

        scenario = ProductManagerImpl.getInstance();
        scenario.addProduct(new Product("agua", 1, 10));

    }

    @After
    public void tearDown() {
        scenario.productsList.clear();

    }

    @Test
    public void getProducts(){
        Assert.assertEquals(1,scenario.getProductsByPrice());
        scenario.getProductsList();


    }
}