public class ContactNumber {
    private String mobileNumber;
    private String homeNumber;
    private String primaryNumber;

    public ContactNumber(String mobileNumber, String homeNumber, String primaryNumber) {
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.primaryNumber = primaryNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }
}
