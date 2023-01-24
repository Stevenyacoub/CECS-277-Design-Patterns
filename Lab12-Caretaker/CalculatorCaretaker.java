import java.util.ArrayList;
import java.util.List;

/** Caretaker class 
 * 
 */
public class CalculatorCaretaker {
    List<MementoCalc> list = new ArrayList<MementoCalc>();
    
    /**Adds mementoCalc object to list
    * @param m mementoCalc object
    */
    public void add(MementoCalc m){
        list.add(m);
    }
    
    /**Returns last mementoCalc object
    * @return mementoCalc object
    */
    public MementoCalc getLast() {
        return list.get(list.size());
    }
}

