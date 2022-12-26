import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class a1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            words.add(br.readLine());
        }
        br.close();
        Set<Integer> arr = new HashSet<>();
        for(int i=0; i<words.size()-1;i++){
            for(int j=0;j<words.get(i).length();j++){
                if(words.get(i).charAt(j)!=words.get(i+1).charAt(j)){
                    arr.add(j);
                }
            }
        }
        sb.append(words.get(0));
        for(int i=0;i<arr.size();i++){
            AtomicInteger o = new AtomicInteger();
            arr.stream().forEach((a)-> o.set(a));
            sb.setCharAt(o.get(),'?');
        }
        System.out.print(sb);
    }
}
