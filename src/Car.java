class Car {
    public Body body;
    public Chassis chassis;

    public Car(int length, int doors) throws Exception {
        if (length < 7) throw new Exception("Car too short");
        if (doors < 1) throw new Exception("At least 1 door required");

        int maxDoors = (length - 3) / 2; // positions utilisables
        if (doors > maxDoors) throw new Exception("Too many doors");

        this.body = new Body(length, doors);
        this.chassis = new Chassis(length);
    }
}
