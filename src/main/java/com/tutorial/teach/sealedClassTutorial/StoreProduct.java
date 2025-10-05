package com.tutorial.teach.sealedClassTutorial;

public sealed class StoreProduct extends Product permits RegionalStore, ZoneStore {
}
