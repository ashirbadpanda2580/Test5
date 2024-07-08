class Facebook {
    void Call() {
        System.out.println("call through facebook");
    }

    void messagesSend() {
        System.out.println("send message in facebook");
    }

    void story() {
        System.out.println("story on facebook");
    }
}

class Facebook001 extends Facebook {
    @Override
    void Call() {
        System.out.println("Making an internet call");
    }
}

class Facebook002 extends Facebook {
    @Override
    void messagesSend() {
        System.out.println("sending message through facebook002 with ai generated text");
    }

    @Override
    void story() {
        System.out.println("Sharing emoji story in facebook002");
    }
}

public class Que3 {
    public static void main(String[] args) {
        Facebook f1 = new Facebook001();
        Facebook f2 = new Facebook002();

        System.out.println("Version Facebook001");
        System.out.println("       ==============");
        f1.Call();
        f1.messagesSend();
        f1.story();

        System.out.println("-------------------------------");
        System.out.println("Version Facebook002");
        System.out.println("        ===============");
        f2.messagesSend();
        f2.story();
        f2.Call();
    }
}
