package gb.homework.models;

public class UserData {
    private String fullName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public UserData(String fullName, String dateOfBirth, String phoneNumber, String gender) {
        if (fullName == null || dateOfBirth == null || phoneNumber == null || gender == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены.");
        }
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public UserData() {}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
