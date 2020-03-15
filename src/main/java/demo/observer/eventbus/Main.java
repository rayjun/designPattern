package demo.observer.eventbus;

public class Main {


    @Subscribe
    public void receiverMessage(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Main());
        eventBus.post("Hello ray");

    }

}
