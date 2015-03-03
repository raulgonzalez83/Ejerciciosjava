package edu.eetac.dsa.rgonzalez.sincronismo;

public class AppSynchronization {
    public static void main(String[] args) {
        String line = "Hola, Buenos días soy Raúl González Sanjuán y estoy cursando DSA.\n";
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new Producer(buffer, line), "producer");
        Thread consumer = new Thread(new Consumer(buffer), "consumer");

        consumer.start();
        producer.start();
    }
}
