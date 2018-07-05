package designModel.Builder;

public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb) {
        this.pb =pb;
    }
    public void createPerson() {
        pb.buildHead();
        pb.bulidBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
