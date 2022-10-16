public class Main {

    //  use separate class to test the code

    public void main(String[] args) {
        AreaManager areaManager = new AreaManager();
        int calculateArea = 0;

        areaManager.calculateArea(10);
        areaManager.calculateArea(10, 12);


    }

    class AreaManager {
    }

    int lenWid = 0;
    int lenLen = 0;

    void calculateArea(double len, double wid) {
        System.out.println(lenWid);
    }

    void calculateArea(double len) {

        System.out.println(lenLen);

    }

    void calculateVolume(double len, double height, double wid) {

        System.out.println(lenWid * height);


    }

    ;
}

