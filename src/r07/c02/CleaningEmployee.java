package r07.c02;

import r07.examples.e03.Detergent;

public class CleaningEmployee extends Detergent {

    @Override
    public void scrub() {
        append(" CleaningEmployee.scrub()");
        super.scrub();
    }

    public void sterilize(){
        append( " sterilize()");
    }

    public static void main(String[] args) {
        CleaningEmployee cleaningEmployee = new CleaningEmployee();
        cleaningEmployee.scrub();
        System.out.println(cleaningEmployee);
        cleaningEmployee.sterilize();
        System.out.println(cleaningEmployee);
        Detergent detergent = new Detergent();
        detergent.scrub();
        System.out.println(detergent);
    }
}
