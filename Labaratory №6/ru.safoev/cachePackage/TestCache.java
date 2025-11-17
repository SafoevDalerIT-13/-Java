package ru.safoev.cachePackage;

@Cache({"clientData","sessionData","applicationData"})
public class TestCache {
  private String userName;
  private int clientId;

  public TestCache() {
    this.userName = null;
    this.clientId = 0;
  }

  public TestCache(String userName, int clientId) {
    this.userName = userName;
    this.clientId = clientId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getClientId() {
    return clientId;
  }

  public void setClientId(int clientId) {
    this.clientId = clientId;
  }
}

