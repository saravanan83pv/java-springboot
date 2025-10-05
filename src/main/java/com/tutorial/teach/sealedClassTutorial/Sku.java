package com.tutorial.teach.sealedClassTutorial;

public sealed interface Sku permits OnlineProduct{
    public String printSkuType();
}
