import java.util.Calendar;

public class Person {
    private String meno;
    private String priezvisko;
    private String ulica;
    private String cisloDomu;
    private String mesto;
    private String rodneCislo;

    public Person(String meno, String priezvisko, String ulica, String mesto, String cisloDomu, String rodneCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.ulica = ulica;
        this.cisloDomu = cisloDomu;
        this.mesto = mesto;
        this.rodneCislo = rodneCislo;
    }

    public Person(String[] input) {
        if (input != null) {
            if (input.length > 0) {
                this.meno = input[0];
            }
            if (input.length > 1) {
                this.priezvisko = input[1];
            }
            if (input.length > 2) {
                this.ulica = input[2];
            }
            if (input.length > 3) {
                this.cisloDomu = input[3];
            }
            if (input.length > 4) {
                this.mesto = input[4];
            }
            if (input.length > 0) {
                this.rodneCislo = input[5];
            }
        }
    }

    public boolean isStudent (){
        String rok = Character.toString(rodneCislo.charAt(0));
        rok += Character.toString(rodneCislo.charAt(1));
        int year = Integer.parseInt(rok);

        if (year <= 99 && year >= 95){
            return true;
        }
        else{
            return false;
        }

    }

    public String getSex (){
        if((Character.getNumericValue(rodneCislo.charAt(2)) == 5) || (Character.getNumericValue(rodneCislo.charAt(2)) == 6)){
            return "Female";
        }
        else{
            return "Male";
        }
    }

    public int  getAge() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR) - 2000;
        int personyear = Integer.parseInt(rodneCislo.substring(0, 2));

        // If year of person between 00 and 19 (current year)
        if (personyear >= 0 && personyear <= year) {
            return year - personyear;
        }
        // If year of person below 00 (99, 98 ...)
        else {
            return year + (100 - personyear);
        }
    }


    @Override
    public String toString() {
        return meno + ',' + priezvisko + ',' + ulica + ',' + cisloDomu + ',' +  mesto + ',' + rodneCislo + ',' + getAge() + ',' + getSex();
    }
}
