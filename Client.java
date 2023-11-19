public class Client {
    public int serialNumber;
    public String username;
    public String carteIdentité;

    public Client(int serialNumber, String username, String carteIdentité) {
        this.serialNumber = serialNumber;
        this.username = username;
        this.carteIdentité = carteIdentité;
    }

    public void afficherinfo() {
        System.out.println("Serial number: " + serialNumber);
        System.out.println("User name: " + username);
        System.out.println("Carte d'identité: " + carteIdentité);
    }
}


