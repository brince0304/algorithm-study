import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class a4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Integer> map = new HashMap<>();
        int count =0;
        while(true){
            String tree = br.readLine();
            if(tree==null || tree.length()==0){
                break;}
                map.put(tree, map.getOrDefault(tree, 0) + 1);
                count++;
            }
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(Object key : array){
            String key0 = key.toString();
            double avg = map.get(key0);
            avg = avg/count*100;
            sb.append(key+" "+String.format("%.4f",avg)+"\n");
        }
        bw.write(sb+"\n");
        bw.flush();
        bw.close();
    }
}
