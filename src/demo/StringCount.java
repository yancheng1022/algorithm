package demo;


import java.io.*;


/**
 * @Author yc
 * @Date 2018/10/24 16:13
 * дһ�������������ļ�������ָ���ַ����������ļ���ָ���ַ����ĸ�����
 */
public class StringCount {

    public static void main(String[] args) throws IOException {
        int count = funCount("E:\\a.txt", "java");
        System.out.println(count);
    }

    public static int funCount(String name,String str) throws IOException {
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = fr.readLine()) !=null){
            sb.append(line);
        }
        int count = 0;
        int begin = 0;
        while ((begin = sb.indexOf(str)) != -1){
            sb.delete(begin,begin+str.length());
            count++;
        }
        return count;

    }
}
