package net.bernhardbmx.bbclient.client;

public class ClientSpeedData {
    private static int playerSpeed;

    public static void set(int speed) {
        ClientSpeedData.playerSpeed = speed;
    }

    public static int getPlayerSpeed() {
        return playerSpeed;
    }
}
