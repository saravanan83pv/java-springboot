package com.tutorial.teach.completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<String> task1 = ()-> new LibraryBook("ps",1000).call();
        Supplier<String> task2 = ()-> new LibraryBook("tesla",200).call();

        CompletableFuture<?> supply=CompletableFuture.supplyAsync(task1)
        .thenCombine(CompletableFuture.supplyAsync(task2), (result1 , result2)->result1+result2)
                .thenApply(data->data.toString());
                    //    .thenAccept(data -> System.out.println(data));
    }


}
