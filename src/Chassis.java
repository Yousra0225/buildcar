class Chassis {
    public String component;
    public Chassis(int length) {
        StringBuilder chassisLine = new StringBuilder();

        chassisLine.append("-");
        int axleCount = 2;
        int extra = length - 7;

        if (length >= 12) {
            axleCount += (length - 12) / 2 + 1;
        }
        boolean rear = true;
        int left = 0, right = 0;
        int[] positions = new int[axleCount];
        positions[0] = 1; positions[1] = 3;

        int pos = 5;
        for (int i = 2; i < axleCount; i++) {
            positions[i] = pos;
            pos += 2;
        }

        for (int i = 0; i < length; i++) {
            if (contains(positions, i)) {
                chassisLine.append("o");
            } else if (i == length - 1) {
                chassisLine.append("'");
            } else {
                chassisLine.append("-");
            }
        }

        this.component = chassisLine.toString();
    }

    /**
     * method to check if an array contains a value
     * @param arr the array to check
     * @param value the value to check for
     * @return true if the array contains the value, false otherwise
     */
    private boolean contains(int[] arr, int value) {
        for (int a : arr) if (a == value) return true;
        return false;
    }
}
