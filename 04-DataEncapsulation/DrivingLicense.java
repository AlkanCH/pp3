public class DrivingLicense{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String category;
    
    public String display() {
        return "DrivingLicense [name=" + getName() + ", surname=" + getSurname() + ", address=" + getAddress() + ", postalCode="
                + getPostalCode() + ", city=" + getCity() + ", licenseNumber=" + getLicenseNumber() + ", yearOfIssue=" + getYearOfIssue()
                + ", category=" + getCategory() + "]";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue>=1980 && yearOfIssue<=2023){
            this.yearOfIssue = yearOfIssue;
        }    
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

}