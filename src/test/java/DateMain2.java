import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar cal = Calendar.getInstance();
		// 不加下面2行，就是取当前时间前一个月的第一天及最后一天
		cal.set(Calendar.YEAR,2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		long preTime = cal.getTime().getTime();
		long curTime = System.currentTimeMillis();
		
		for(int i=1;preTime <= curTime;i++){
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime().getTime()));
			cal.add(Calendar.DATE, i);
			preTime = cal.getTime().getTime();
		}
		
		
		
	}

}
