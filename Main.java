
public class Main {
    public static void main(String[] args) {
        CalendarLucru C1 = new CalendarLucru();
        Lucrator l1 = new Lucrator("Gigel",C1);
        try{
            l1.lucreaza("Luni");
            l1.lucreaza("Marte");
            l1.lucreaza("Sambata");
        }catch(ExceptieZiNelucratoare e )
        {
            System.out.println(e.getMessage());
        }
        finally{
            try{
                l1.lucreaza("Sambata");
            }catch(ExceptieZiNelucratoare e )
            {
                System.out.println(e.getMessage());
            }
        }

        //problema 6.2 din lab
        try
        {
            Zi ziuaTest = null;
            ziuaTest.getNume();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        //pb 6.3 din lab
        Zi[] ziuaTest2 = new Zi[5];
        try{
            System.out.println(ziuaTest2[100].getNume());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        //pb 6.4 lab
        try{
            throw new Exception("\nNu stiu ce sa scriu");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se executa oricum!");
        }

        //pt problema 6.6 din lab
        try{
            g testG = new g("ABD",24);
            f testF = new f(testG);
            testF.apeleazaG();
        }catch(ExceptieNoua e )
        {
            System.out.println(e.getMessage());
        }

        //pb 6.7
        A obj = new C();
        try
        {
            obj.method();
        }catch(LevelOneException e)
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}