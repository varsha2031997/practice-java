import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Patient {
    String name;
    String Severity;
    LocalTime arrivalTime;

    Patient(String name, String Severity, LocalTime arrivalTime) {
        this.name = name;
        this.Severity = Severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "name='" + name + '\'' +
                ", Severity='" + Severity + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

}

class PatientPriorityque implements Comparator<Patient>
{

    @Override
    public int compare(Patient o1, Patient o2) {
        int severityCompare = o1.Severity.compareTo(o2.Severity);
        if(severityCompare == 0)
        {
            return o1.arrivalTime.compareTo(o2.arrivalTime);
        }
        return severityCompare;
    }
}
class HospitalQue
{

    public static void main(String[] args) {

        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("varsha","cardiacpatient",LocalTime.of(10,30,07)));
        patientList.add(new Patient("harsha", "phisioteraphy", LocalTime.of(12, 30, 07)));
        patientList.add(new Patient("zeenath","gyanicpatient",LocalTime.of(13,30,07)));
        patientList.add(new Patient("Win", "gyanicpatient", LocalTime.of(9, 30, 07)));

        Collections.sort(patientList,new PatientPriorityque());

        for(Patient patient: patientList)
        {
            System.out.println(patient);
        }

    }


}
