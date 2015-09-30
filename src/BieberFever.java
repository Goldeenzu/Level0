import java.io.IOException;


public class BieberFever {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int c = 0; c <5; c++) {
	for (int i = 0; i <2; i++) {
	for (int b = 0; b <3; b++) {
		Runtime.getRuntime().exec("say " + "baby").waitFor();
	}
	if (i == 0){
	Runtime.getRuntime().exec("say " + "oh").waitFor();
	}
	if (i == 1){
		Runtime.getRuntime().exec("say " + "no").waitFor();
	}
	}

Runtime.getRuntime().exec("say " + "I thought you'd always be mine").waitFor();
}
}
}


