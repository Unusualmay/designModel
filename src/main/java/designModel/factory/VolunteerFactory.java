package designModel.factory;

public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
