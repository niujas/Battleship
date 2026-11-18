//Jason N. Ship.java
public class Ship {
  int length;
  String name;
  int rowPos;
  int colPos;
  boolean isHorizontal;
  public Ship(int initialLength, String[] initialName, int r, int c, boolean h) {
    this.length = initialLength;
    this.name = initialName[0];
    this.rowPos = r;
    this.colPos = c;
    this.isHorizontal = h;
  }
    public String getName() {
      return name;
    }
    public int getRow() {
      return rowPos;
    }
    public int getCol() {
      return colPos;
    }
    public boolean getIsHorizontal() {
      return isHorizontal;
    }
    public int getLength() {
      return length;
    }
    public void setName(String newShip) {
      this.name = newShip;
    }
    public void setRow(int r) {
      this.rowPos = r;
    }
    public void setCol(int c) {
      this.colPos = c;
    }
    public void setIsHorizontal(boolean h) {
      this.isHorizontal = h;
    }
    public void setLength(int length) {
      this.length = length;
    }
    public String toString() {
      return name;
    }
}