package com.tutorial.teach.sealedClassesTutorial;


import com.tutorial.teach.sealedClassTutorial.OmniChannelProduct;
import com.tutorial.teach.sealedClassTutorial.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ProductTest {
    @Test
    public void  validateOmniChannelProductTest(){
        var omniChannelProductObj = new OmniChannelProduct();
        assertInstanceOf( Product.class,omniChannelProductObj);
    }
}
