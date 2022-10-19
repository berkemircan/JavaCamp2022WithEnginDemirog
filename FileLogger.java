package Logging;

public class FileLogger implements Logger {

	
	public void log(String Data) {

		System.out.println("Dosyaya Loglandı : " +   Data);
	}

}
