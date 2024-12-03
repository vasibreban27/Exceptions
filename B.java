public class B extends A{
    public void method() throws LevelTwoException{
        throw new LevelTwoException("Exception at level two : B");
    }
}
