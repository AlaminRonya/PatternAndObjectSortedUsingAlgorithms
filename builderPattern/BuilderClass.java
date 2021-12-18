package builderPattern;

import builderPattern.modul.Address;
import builderPattern.modul.Student;

public class BuilderClass {
    private final Student student;
    private final Address address;

    private BuilderClass(BuilderCreation builderCreation){
        this.student = builderCreation.student;
        this.address = builderCreation.address;

    }

    public static class BuilderCreation{
        private Student student;
        private Address address;
        public BuilderCreation student(Student student) {
            this.student =student;
            return this;
        }
        public BuilderCreation address(Address address) {
            this.address =address;
            return this;
        }
        public BuilderClass build() {
            return new BuilderClass(this);
        }

    }
    @Override
    public String toString() {
        return "BuilderClass{" +
                ( student==null ? "":"student=" + student )+
                ( address==null ? "":", address=" + address )+
                '}';
    }
}
