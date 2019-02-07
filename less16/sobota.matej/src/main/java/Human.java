public class Human {
    private String meno;
    private String Priezvisko;
    public Date birth;


    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return Priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        Priezvisko = priezvisko;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "meno='" + meno + '\'' +
                ", Priezvisko='" + Priezvisko + '\'' +
                '}';
    }
}
