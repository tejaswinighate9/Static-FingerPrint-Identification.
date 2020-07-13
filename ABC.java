import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.Scanner;

class ABCs{
public static void main(String args[]){


try {

String file1 = "sp.png";
String file2 = "sp.png";

Image pic1= Toolkit.getDefaultToolkit().getImage(file1);
Image pic2= Toolkit.getDefaultToolkit().getImage(file2);
try {

PixelGrabber grab11 = new PixelGrabber(pic1, 0, 0, -1, -1,false);
PixelGrabber grab21 = new PixelGrabber(pic2, 0, 0, -1, -1,false);
int array1[]= null;

if (grab11.grabPixels()) 
{
int width = grab11.getWidth();
int height = grab11.getHeight();
array1= new int[width * height];
array1= (int[]) grab11.getPixels();
}

int[] array2 = null;

if (grab21.grabPixels()) 
{
int width = grab21.getWidth();
int height = grab21.getHeight();
array2 = new int[width * height];
array2 = (int[]) grab21.getPixels();
}

System.out.println("Pixels equal: "+ java.util.Arrays.equals(array1, array2 ));

} catch (InterruptedException e1) {
e1.printStackTrace();
}

} catch (Throwable t) {
// report error
System.out.println("Fail - " + t.getMessage());
}
}
}

