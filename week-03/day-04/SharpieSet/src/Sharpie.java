public class Sharpie {

    String color;
    float width;
     static float inkAmount;


    Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    void use() {
        this.inkAmount -= 10;
    }
}