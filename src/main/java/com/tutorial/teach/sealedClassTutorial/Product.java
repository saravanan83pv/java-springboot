package com.tutorial.teach.sealedClassTutorial;

import java.math.BigDecimal;

public sealed class Product permits OnlineProduct , StoreProduct, OmniChannelProduct {
    private int skuNumber;
    private String productName;
    private String desription;
    private int onHandQuantity;
    private boolean onlineAssorted;
    private BigDecimal basePrice;
}
