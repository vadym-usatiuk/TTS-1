public class SolutionTask4 {

//    Create a Custom Class (anything you want - car, phone, holiday, etc.).
//
//    Requirements:
//
//    Minimum 3 private instance variables
//    An empty constructor
//    A constructor that uses only 2 of your 3 variables
//    A constructor that uses all 3 of your instance variables
//    Get methods for all 3 of your instance variables
//    Set methods for all 3 of your instance variables
//    A method that returns a Boolean
//    A method that returns a String
//    Submit a link to your GitHub repository

    class Car {

        //Minimum 3 private instance variables
        private String model;
        private String maker;
        private boolean islightWeight;

        //An empty constructor
        Car() {
        }

        //A constructor that uses only 2 of your 3 variables
        Car(String maker, boolean light) {
            this.maker = maker;
            this.islightWeight = islightWeight;
        }

        //A constructor that uses all 3 of your instance variables
        Car(String model, String maker, boolean lightWeight) {
            this.model = model;
            this.maker = maker;
            this.islightWeight = islightWeight;
        }

        //Get methods for all 3 of your instance variables
        public String getModel() {
            return model;
        }

        public String getMaker() {
            return maker;
        }

        //A method that returns a Boolean
        public boolean getIslightWeight() {
            return islightWeight;
        }

        //Set methods for all 3 of your instance variables
        public void setModel(String model) {
            this.model = model;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public void setIslightWeight(boolean islightWeight) {
            this.islightWeight = islightWeight;
        }

        //A method that returns a String
        public String getCarInfo() {
            return " Model of car: " + model + " Car maker: " + maker + " Is that light car? " + islightWeight;
        }
    }
}
