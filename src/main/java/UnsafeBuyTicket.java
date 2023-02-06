
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(10);
        new Thread(ticket, "我").start();
        new Thread(ticket, "你").start();
        new Thread(ticket, "黄牛").start();

    }
}

class Ticket implements Runnable {

    private int num;

    boolean flag = true;

    public Ticket(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (flag) {
            buy();

        }

    }

    private void buy() {
        if (num <= 0) {
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName() + "拿到" + num--);
    }


}

