package nested.local;

public class Out {

    private class SimIn implements L {
        @Override
        public boolean add(String s) {
            return false;
        }
    }

    SimIn create() {
        return new SimIn();
    }

    L create(boolean b) {
        if (b) {
            class Insade implements L {
                @Override
                public boolean add(String s) {
                    return false;
                }
            }
            return new Insade();
        }
        return null;
    }
}
