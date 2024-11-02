package java21.features.pattern_matching;

import java21.features.pattern_matching.models.CloudStorage;
import java21.features.pattern_matching.models.SftpStorage;
import java21.features.pattern_matching.models.Storage;

public class Main {
  public static void main(String[] args) {
    var cloudStorage = new CloudStorage();
    var sftpStorage = new SftpStorage();

    uploadFile(cloudStorage);
    uploadFile(sftpStorage);
  }

  private static void uploadFile(Storage storage) {
    // NEW: pattern matching in switch statement
    switch (storage) {
      case SftpStorage sftpStorage -> sftpStorage.save();
      case CloudStorage cloudStorage -> cloudStorage.save();
      default -> throw new IllegalArgumentException("Invalid storage type");
    }
  }
}
