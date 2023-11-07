public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setName("jaCK") ;
        dl.setSurname("Harkness");
        dl.setAddress("Szlak 14/7");
        dl.setPostalCode("32-065");
        dl.setCity("Krakow");
        dl.setLicenseNumber("4822");
        dl.setYearOfIssue(2021);
        dl.setCategory("B");

        System.out.println(dl.display());
    }
}
