package views;

public class Utills {
    
    public final static void clearConsole()
{
    try
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
}
}
