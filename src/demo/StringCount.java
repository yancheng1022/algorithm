package demo;


import java.io.*;


/**
 * @Author yc
 * @Date 2018/10/24 16:13
 * 写一个函数：根据文件名，和指定字符串。查找文件中指定字符串的个数。
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
