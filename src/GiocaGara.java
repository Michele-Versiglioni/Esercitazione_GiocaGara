public class GiocaGara {
    public static void main(String[] args) {
        System.out.println("Gara Atletica");
        Atleta a1 = new Atleta(34, "Michele");
        Atleta a2 = new Atleta(12, "Alessandro");
        Thread ta2 = new Thread(a2);
        ta2.setPriority(Thread.MAX_PRIORITY);
        Thread ta1 = new Thread(a1);
        for (int i = 3; i > 0; i--) {
            System.out.println("Inizio in:" + i);
        }
        // System.out.println("Caratteristiche Main: "+ Thread.currentThread().getName()
        // +" - " + Thread.currentThread().getPriority());
        ta1.start();
        try {
            ta1.join();
        } catch (InterruptedException e) {
            System.err.println("Errore join");
        }
        ta2.start();
    }
}