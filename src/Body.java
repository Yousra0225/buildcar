class Body {
    public String component;

    public Body(int length, int doors) {
        String firstLine = " " + "_".repeat(length - 2) + "\n";

        char[] secondLine = new char[length - 1];
        secondLine[0] = '|';
        for (int i = 1; i < length - 2; i++) secondLine[i] = ' ';
        secondLine[length - 2] = '\\';
        secondLine[length - 1 - 1] = '\n';
        int[] doorPositions = new int[(length - 3)];
        int front = 0, rear = doorPositions.length - 1;
        boolean addFront = true;

        for (int i = 0; i < doors; i++) {
            int pos = addFront ? front++ : rear--;
            doorPositions[i] = pos;
            addFront = !addFront;
        }

        for (int i = 0; i < doors; i++) {
            int pos = 1 + doorPositions[i];
            secondLine[pos] = '[';
            secondLine[pos + 1] = ']';
        }

        this.component = firstLine + new String(secondLine);
    }
}
