public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstname, Boolean aware){
        this.firstname = firstname;
        this.aware = true;

    }

    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    // setters

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // instance method

    public String whoAmI() {
        if (!getAware()) {
            return "Je m'appelle " + getFirstName() + "et je ne suis pas aware";
        } else {
            return  "Je m'appelle " + getFirstName() + "et je suis aware";
        }
    }


}

