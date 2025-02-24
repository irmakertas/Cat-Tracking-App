package CatTrackingApplication;

public class Health {
    private boolean vaccinationStatus;
    private String lastVetVisit;

    public Health(boolean vaccinationStatus, String lastVetVisit) {
        this.vaccinationStatus = vaccinationStatus;
        this.lastVetVisit = lastVetVisit;
    }

    public void showHealthStatus(){
        System.out.println("Vaccination Status: " + vaccinationStatus);
        System.out.println("Last Vet Visit: " + lastVetVisit);
    }
}
