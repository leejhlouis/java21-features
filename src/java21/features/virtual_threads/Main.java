package java21.features.virtual_threads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    /*
        Virtual threads are not tied to OS threads. WHen running a blocking I/O operation, virtual threads are suspended
      (until operation is done) and the OS thread is free to perform for other virtual threads.
    */
    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      IntStream.range(0, 99999).forEach(i -> {
        executor.submit(() -> {
          Thread.sleep(Duration.ofSeconds(1));
          System.out.println(i);
          return i;
        });
      });
    }
  }
}
