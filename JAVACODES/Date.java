import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Date{
	public static void main(String args[]){
	
		LocalDate date = LocalDate.parse("2017-02-03");
		System.out.println(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		System.out.println(formatter.format(date));
	}
}