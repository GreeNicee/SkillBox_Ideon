import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {//20181015_210510
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd_HHmmSS");
        System.out.println(date.format(new Date()));
    }
}
