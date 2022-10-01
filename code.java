import java.io.*;
public class print {

	public static void main(String[] args)throws IOException {
		FileInputStream s=new FileInputStream("C:\\Users\\hp\\Desktop\\print java.txt");
		int i=s.read();
		while(i!=-1) {
			char h=(char)i;
			char r=(char)s.read();
			char sh=(char)s.read();
			if(h=='/'&&r=='/') {
				while(sh!='\n') {
					System.out.print(sh);
					sh=(char)s.read();
				}
				System.out.print(sh);
			}
			else
			{
				while(sh!='/');{
					sh=(char)s.read();
			}}
			i=s.read();
		}

	}

}
