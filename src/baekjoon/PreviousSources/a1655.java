import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class a1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            queue.add(Integer.valueOf(br.readLine()));
            printMiddleElement(queue);
        }
    }

    public static void printMiddleElement(PriorityQueue<Integer> queue) {
        PriorityQueue<Integer> tmp = queue;
        if (queue.size() == 1 || queue.size()==2) {
            System.out.println(tmp.peek());
        }
        if(queue.size()%3==0 && queue.size()%2!=0){
            int tp = 0;
           for(int i=0; i<queue.size()/2;i++){
               tp = tmp.peek();
           }
            System.out.println(tp);
        }
        if(queue.size()%3!=0 && queue.size()%2==0){
            int tp =0;
            for(int i=0; i<queue.size()/2-1;i++){
                tp = tmp.peek();
            }
            System.out.println(tp);
        }
    }
}
