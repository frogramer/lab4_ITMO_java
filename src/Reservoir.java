public abstract class Reservoir {
    protected int waverage = 0;
    static int random(){
        int res = (int) (Math.random() * 5);
        return res;
    }
    protected interface Guards
    {
        final static int DEFAULT_HAIRY = 0;
        public int getHairy();
    }
}
