public class Car {
    public Car(int length, int doors) throws Exception {
        if (length<7){
            throw new Exception("car must be at least 7");
        }
        if (doors<1){
            throw new Exception("doors must be at least 1");
        }
        if(doors>length){
            throw new Exception("doors must be less than length");
        }

    }
}
