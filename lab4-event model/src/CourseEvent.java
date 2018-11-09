
import java.util.Date;
import java.util.EventObject;

public class CourseEvent extends EventObject{
	private Date midtermDate;

	public CourseEvent(Object arg0, Date date) {
		super(arg0);
		midtermDate=date;
		// TODO Auto-generated constructor stub
	}

	public Date getMidtermDate() {
		return midtermDate;
	}


}
