public class SolutionTask3 {

//    Create a Pet Class with the following instance variables:
//
//    name (PRIVATE)
//    age (PRIVATE)
//    location (PRIVATE)
//    type (PRIVATE)
//    two constructors
//    empty
//    all attributes
//    Code to be able to access the following (Get Methods):
//    name
//            age
//    type
//    Code to be able to change (Set Methods):
//    name
//            age
//    location

    class Pet {
        private String name;
        private int age;
        private String location;
        private boolean type;

        //First constructor
        Pet() {
            // constructor is empty
        }

        //Second constructor
        Pet(String name, int age, String location, boolean type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean type() {
            return type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setType(boolean type) {
            this.type = type;
        }
    }
}
