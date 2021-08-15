package tn.esprit.spring.entity;

public class Agreement {
    private Classification agreement;

    public Classification getAgreement() {
        return agreement;
    }

    public void setAgreement(Classification agreement) {
        this.agreement = agreement;
    }

    public Agreement(Classification agreement) {
        this.agreement = agreement;
    }
    public Agreement() {
        super();
    }

}
