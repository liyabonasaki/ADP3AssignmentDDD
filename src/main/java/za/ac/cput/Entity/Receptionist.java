package za.ac.cput.Entity;

public class Receptionist {
    private int recID,recUsername,recPassword,recName,recGender,recAge,recContactNumber,recAddress;

    private Receptionist(builder builder) {
        this.recID = builder.recID;
        this.recUsername = builder.recUsername;
        this.recPassword = builder.recPassword;
        this.recName = builder.recName;
        this.recGender = builder.recGender;
        this.recAge = builder.recAge;
        this.recContactNumber = builder.recContactNumber;
        this.recAddress = builder.recAddress;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "recID=" + recID +
                ", recUsername=" + recUsername +
                ", recPassword=" + recPassword +
                ", recName=" + recName +
                ", recGender=" + recGender +
                ", recAge=" + recAge +
                ", recContactNumber=" + recContactNumber +
                ", recAddress=" + recAddress +
                '}';
    }

    public static class builder extends Doctor.Builder {
        private int recID,recUsername,recPassword,recName,recGender,recAge,recContactNumber,recAddress;

        public builder setRecID(int recID) {
            this.recID = recID;
            return this;

        }

        public builder setRecUsername(int recUsername) {
            this.recUsername = recUsername;

            return this;
        }

        public builder setRecPassword(int recPassword) {
            this.recPassword = recPassword;

            return this;
        }

        public builder setRecName(int recName) {
            this.recName = recName;

            return this;
        }

        public builder setRecGender(int recGender) {
            this.recGender = recGender;

            return this;
        }

        public builder setRecAge(int recAge) {
            this.recAge = recAge;

            return this;
        }

        public builder setRecContactNumber(int recContactNumber) {
            this.recContactNumber = recContactNumber;

            return this;
        }

        public builder setRecAddress(int recAddress) {
            this.recAddress = recAddress;

            return this;
        }


        public Receptionist Build(){
             return new Receptionist(this);

        }
        private Doctor.Builder copy(Receptionist receptionist){
            this.recID = recID;
            this.recUsername = recUsername;
            this.recPassword = recPassword;
            this.recName = recName;
            this.recAge = recAge;
            this.recGender = recGender;
            this.recAddress = recAddress;
            this.recContactNumber = recContactNumber;
            return this;
        }
    }
}
