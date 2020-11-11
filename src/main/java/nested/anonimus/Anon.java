package nested.anonimus;

public class Anon {
    An create() {
        return new An() {
            @Override
            public boolean add(String str) {
                return false;
            }
        };
    }
}
