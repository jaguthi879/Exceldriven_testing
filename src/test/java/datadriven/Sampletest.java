package datadriven;

import java.io.IOException;
import java.util.ArrayList;

public class Sampletest {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Datadriven d=new Datadriven();
	ArrayList data=d.getdata("Delete profile");
	
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

}
}