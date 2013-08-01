package za.co.entelect.challenge;

public class Rectangle {
  
  private int top;
  private int right;
  private int bottom;
  private int left;

  public Rectangle(int top, int right, int bottom, int left) {
    this.top = top;
    this.right = right;
    this.bottom = bottom;
    this.left = left;
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

  public int getRight() {
    return right;
  }

  public void setRight(int right) {
    this.right = right;
  }

  public int getBottom() {
    return bottom;
  }

  public void setBottom(int bottom) {
    this.bottom = bottom;
  }

  public int getLeft() {
    return left;
  }

  public void setLeft(int left) {
    this.left = left;
  }

  public void translate(int x, int y) {
    top += y;
    right += x;
    bottom += y;
    left += x;
  }
  
  public boolean intersects(Rectangle o) {
    return getLeft() <= o.getRight() && getRight() >= o.getLeft() &&
      getTop() <= o.getBottom() && getBottom() >= o.getTop();
  }

  public boolean contains(int x, int y) {
    return getLeft() <= x && getRight() >= x &&
      getTop() <= y && getBottom() >= y;
  }
}
