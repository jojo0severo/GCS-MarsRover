public class Robot {

    public enum Direcao {N, S, L, O}

    ;
    private int x;
    private int y;
    private Direcao dir;
    private int maxX;
    private int maxY;

    public Robot(int x, int y, Direcao dir, int maxX, int maxY) {
        this.dir = dir;
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direcao getDir() {
        return dir;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(Direcao dir) {
        this.dir = dir;
    }

    public boolean anda(int pos) {
        if (dir.toString().equals("S")) {
            y = y - 1;
        } else if (dir.toString().equals("N")) {
            y = y + 1;

        } else if (dir.toString().equals("L")) {
            x = x + 1;
        } else if (dir.toString().equals("O")) {
            x = x - 1;
        }
        String coords = x + "" + y;
        for (String key : Programa.robos.keySet()) {
            if (key.equals(coords)) {
                return false;
            }
        }
        if (y < 0 || y > maxY) {
            return false;
        }

        if (x < 0 || x > maxX) {
            return false;
        }
        return true;
    }
}
