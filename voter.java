public class voter {
    private int voterID;
    private String Name;
    private int Age;

    public voter(int voterID , String Name , int Age) throws MyException{
        if(Age<18){
            throw new MyException("Age is not valid");
        }
        this.Age= Age;
        this.Name = Name;
        this.Age = Age;

    }
    // Getter methods (optional)
    public int getVoterId() {
        return voterID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

        @Override
        public String toString() {
            return "Voter{" +
                    "voterId='" + voterID + '\'' +
                    ", name='" + Name + '\'' +
                    ", age=" + Age + '\'' ;
        }
    }



