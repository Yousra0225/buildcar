public class Chassis {
    public String component;

    public Chassis(int length) {
        StringBuilder sb = new StringBuilder();
        sb.append("-");

        int wheels = (length - 1) / 4 + 1;
        for (int i = 1; i < length - 1; i++) {
            if (i % 2 == 1 && wheels > 0) {
                sb.append("o");
                wheels--;
            } else {
                sb.append("-");
            }
        }
        sb.append("'");

        this.component = sb.toString();
    }
}
