public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("invalid birth year");
        }

        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("invalid height : set default to 170");
            this.height = 170;
        }

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("invalid weight : set default to 70");
            this.weight = 70;
        }

    }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getBirthYear() {
            return this.birthYear;
        }

        public double getHeight() {
            return this.height;
        }

        public double getWeight() {
            return this.weight;
        }

        public String getBloodGroup() {
            return this.bloodGroup;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    public int getAge(int currentYear) {
            if (currentYear>=birthYear) {
                return currentYear - birthYear;
            } else {
                return 0;
            }
        }

    public void displayDetails(int currentYear) {
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + getAge(currentYear));
            System.out.println("Patient Height (cm): " + height);
            System.out.println("Patient Weight (kg): " + weight);
            System.out.println("Patient BloodGroup: " + bloodGroup);
            System.out.println("Patient PhoneNumber: " + phoneNumber);
            System.out.println("Patient BMI: " + getBMI());
        }

    public double getBMI() {
        if (height > 0 && weight > 0) {
            double heightInMeters = height / 100;
            return weight / (heightInMeters * heightInMeters);
        } else {
            return 0.0;
        }
    }

    }
