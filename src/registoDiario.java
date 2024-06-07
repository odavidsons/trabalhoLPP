import java.util.ArrayList;
import java.util.Date;

public class registoDiario {
    private Date date;
    private ArrayList<Object> registeredItems;

    public registoDiario(Date date, ArrayList<Object> registeredItems) {
        this.date = date;
        this.registeredItems = registeredItems;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Object> getRegisteredItems() {
        return registeredItems;
    }

    public void setRegisteredItems(ArrayList<Object> registeredItems) {
        this.registeredItems = registeredItems;
    }
    
    @Override
    public String toString() {
	return date.toString() + " | " + registeredItems;
    }
}
