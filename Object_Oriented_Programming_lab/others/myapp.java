import java.awt.*;
import java.applet.*;
public class myapp extends Applet
{
public void init()
{
System.out.println("Applet initialized");

}
public void start()
{
System.out.println("Applet Started");
}
public void stop(){
System.out.println("Applet Stoped");
}
public void paint(Graphics g){
System.out.println("Painting");
}
public void destroy(){
System.out.println("Destroyed");
}
}