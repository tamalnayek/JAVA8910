package com.training.assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String first = "first.txt";
		String second = "second.txt";

		CompletableFuture<Void> file1 = CompletableFuture.runAsync(() -> {
			fileOpr(first);
		});

		CompletableFuture<Void> file2 = CompletableFuture.runAsync(() -> {
			fileOpr(second);
		});

		CompletableFuture<Void> fullContent = null;
		fullContent = CompletableFuture.allOf(file2);

		System.out.println(fullContent.get());

	}

	private static void fileOpr(String first) {
		try (Stream<String> stream = Files.lines(Paths.get(first))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
