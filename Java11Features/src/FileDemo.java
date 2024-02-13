import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eco = "E:\\Simplilearn\\Backend_fsd\\Java\\Java11Features\\src\\Economies";
		Path path = Path.of(eco);
		
		try {
			String ecocont = Files.readString(path);
			System.out.println(ecocont);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String addContent = "India's impressive growth provides immense potential for it to become super power";
		
		try {
			Files.writeString(Path.of("E:\\Simplilearn\\Backend_fsd\\Java\\Java11Features\\src\\Economies"), addContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
