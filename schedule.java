import java.text.SimpleDateFormat;
import java.util.Date;
public class schedule {
public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
}
}
