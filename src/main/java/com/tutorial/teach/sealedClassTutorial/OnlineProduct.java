package com.tutorial.teach.sealedClassTutorial;

public non-sealed class OnlineProduct extends Product implements Sku  {
    @Override
    public String printSkuType() {
        return "ONLINE SKU";
    }
}
