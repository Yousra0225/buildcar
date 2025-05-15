public class Body {
    public String component;

    public Body(int length, int doors) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        for (int i = 0; i < length - 2; i++) sb.append("_");
        sb.append("\n|");

        char[] line = new char[length - 2];
        for (int i = 0; i < line.length; i++) line[i] = ' ';
        line[line.length - 1] = '\\';

        // Placer les portes
        int[] positions = new int[doors];
        int left = 0, right = (length - 4) / 2;
        boolean leftTurn = true;
        for (int i = 0; i < doors; i++) {
            positions[i] = leftTurn ? left++ : right--;
            leftTurn = !leftTurn;
        }
        for (int i = 0; i < doors; i++) {
            int pos = 1 + positions[i] * 2;
            if (pos + 1 < line.length) {
                line[pos] = '[';
                line[pos + 1] = ']';
            }
        }

        sb.append(new String(line)).append("\n");
        this.component = sb.toString();
    }
}
