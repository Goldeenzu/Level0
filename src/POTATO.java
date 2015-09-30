import java.io.IOException;


public class POTATO {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int i = 0; i <8; i++) {
			Runtime.getRuntime().exec("say " + i + "potato").waitFor();
		}
		Runtime.getRuntime().exec("say " + "more").waitFor();
	}
}

