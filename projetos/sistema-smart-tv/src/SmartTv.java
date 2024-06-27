public class SmartTv {
  boolean powerState = false;
  int channel = 1;
  int volume = 25;

  public void buttonPower() {
    if (powerState == false) {
      powerState = true;
    } else {
      powerState = false;
    }
  }

  public void increaseVolume() {
    if (powerState == true) {
      volume++;
    } else {
      System.out.println("A TV está desligada.");
    }
  }

  public void decreaseVolume() {
    if (powerState == true) {
      volume--;
    } else {
      System.out.println("A TV está desligada.");
    }
  }

  public void increaseChannel() {
    if (powerState == true) {
      channel++;
    } else {
      System.out.println("A TV está desligada.");
    }
  }

  public void decreaseChannel() {
    if (powerState == true) {
      if (channel > 1) {
        channel--;
      } else {
        System.out.println("Canal 1 atingido.");
      }
    } else {
      System.out.println("A TV está desligada.");
    }

  }

  public void changeChannel(int newChannel) {
    if (powerState == true) {
      channel = newChannel;
    } else {
      System.out.println("A TV está desligada.");
    }
  }
}
