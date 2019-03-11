import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		readTxtFile("input.txt");

	}
	public static void readTxtFile(String filePath){
        try {
                File input_file=new File(filePath);
                File output_file=new File("result.txt");
                if(input_file.isFile() && input_file.exists()){ //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(new FileInputStream(input_file));
                    OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(output_file));
                    BufferedReader bufferedReader = new BufferedReader(read);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    String text = null;
                    int sum = 0;
                    while((text = bufferedReader.readLine()) != null){
                    	text = text.toLowerCase();
                    	text.replaceAll("\r\n", "\n");
                        System.out.println(text+"  ����:"+ (text.length()) );
                        sum+=text.length();
                        bufferedWriter.write(text+"\r\n");
                        bufferedWriter.flush();
                    }
                    System.out.println("sum="+sum);
                   
                    
                    read.close();
                    writer.close();
                 }
                 else{
                	 System.out.println("�Ҳ���ָ�����ļ�");
                 }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
        }
     
    }


}
