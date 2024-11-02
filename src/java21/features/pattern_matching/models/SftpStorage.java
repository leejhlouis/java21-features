package java21.features.pattern_matching.models;

public class SftpStorage implements Storage {
  @Override
  public void save() {
    System.out.println("Saving to SFTP");
  }
}
