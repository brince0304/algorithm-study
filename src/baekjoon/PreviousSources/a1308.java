import javax.print.attribute.DateTimeSyntax;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.Timer;

public class a1308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Dyear= Integer.parseInt(st.nextToken());
        int Dmonth= Integer.parseInt(st.nextToken());
        int Dday = Integer.parseInt(st.nextToken());
        int count =0;
        while(year!=Dyear && month!=Dmonth && day!=Dday){
            day++;
            count++;
            if(year%4==0&&year%100!=0&&year%400==0){
                if(month>12){
                    month=1;
                    day=1;
                    year++;
                }
                if(month<8){
                    if(month%2!=0){
                        if(day>31){
                            month++;
                            day=1;
                        }
                    }
                    if(month!=2 && month%2==0){
                        if(day>30){
                            month++;
                            day=1;
                        }
                    }
                    if(month==2 && day>29){
                        day=1;
                        month++;
                    }
                }
                if(month>7){
                    if(month%2==0){
                        if(day>31){
                            month++;
                            day=1;
                        }
                    }
                    if(month%2!=0){
                        if(day>30){
                            month++;
                            day=1;
                        }
                    }

                }
            }
            else{
                if(month>12){
                    month=1;
                    day=1;
                    year++;
                }
                if(month<8){
                    if(month%2!=0){
                        if(day>31){
                            month++;
                            day=1;
                        }
                    }
                    if(month!=2 && month%2==0){
                        if(day>30){
                            month++;
                            day=1;
                        }
                    }
                    if(month==2 && day>28){
                        day=1;
                        month++;
                    }
                }
                if(month>7){
                    if(month%2==0){
                        if(day>31){
                            month++;
                            day=1;
                        }
                    }
                    if(month%2!=0){
                        if(day>30){
                            month++;
                            day=1;
                        }
                    }

                }
            }

        }
        System.out.print(count);


    }
}
