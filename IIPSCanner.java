/*We have used interface before implementing the class so that we can add more NoSQL databases or any fast lookup service*/

public interface IIPScanner {

    boolean isFraudIP(String ipAddresses);

}
