//Takes in one argument which is your picture
//it then displays it if you want you wish to save it.
import java.awt.Color;

public class ReversePicture {
	public static void main (String [] args) {
		Picture pic = new Picture(args[0]);

	// get the picture's dimensions

		int width  = pic.width();
		int height = pic.height();

		Picture reverse = new Picture(width, height);

        for (int x = 0; x < height; x++) {
        	for (int y = 0; y < (width / 2); y++) {

		    // get the color of the current pixel
		        Color left  = pic.get(y, x);
		        Color right = pic.get(width - 1 - y, x);
		    // get the red, green, and blue portions of this color

		        int r = left.getRed();
		        int b = left.getBlue();
		        int g = left.getGreen();

		        int r2 = right.getRed();
		        int b2 = right.getBlue();
		        int g2 = right.getGreen();

		    // give each of the corresponding pixels
		    // the appropriate color 

		        reverse.set(y, x, new Color(r2, g2, b2));
		        reverse.set(width - 1 - y, x, new Color(r, g, b));
		    }
		}
		reverse.show();
	}
}