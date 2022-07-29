package hello.core.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonService singletonService = SingletonService.getInstance();

    }

}

class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){

    }
}
