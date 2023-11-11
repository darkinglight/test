import java.io.*;  
  
public class File {  
    public static void main(String[] args) {  
        try {  
            FileWriter fw = new FileWriter("filename.csv", true); // 第二个参数为true表示追加内容
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 1000_000; i++) {
                bw.write("column1,column2,column3");
                bw.newLine(); // 可选操作，在文本末尾添加一个新行
            }
            bw.close();
            System.out.println("Content appended to file successfully.");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
