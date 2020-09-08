package Game;

public class CreateArrays {
    private int sizeX, sizeY; //size of grid
    private boolean brackets, comma; //has brackets? and has commas?
    private String filler; //what to fill grid with
    private String[] fillerArray;

    public CreateArrays() {
        sizeX = 1;
        sizeY = 1;
        brackets = false;
        comma = false;
        filler = "0";
    }
    public CreateArrays(int x, int y, boolean brack, boolean com, String fill) {
        sizeX = x;
        sizeY = y;
        brackets = brack;
        comma = com;
        filler = fill;
        fillerArray = new String[sizeX];
        for(int i = 0; i < sizeX; i++) {
            fillerArray[i] = filler;
        }
    }
    public CreateArrays(int x, int y, boolean brack, boolean com, String[] fill) {
        sizeX = x;
        sizeY = y;
        brackets = brack;
        comma = com;
        fillerArray = new String[sizeX];
        for(int i = 0; i < sizeX; i++) {
            fillerArray[i] = fill[i];
        }
    }
    public void buildArray() {
        while(sizeY > 0) { //while there are still rows
            for(int i = 0; i < sizeX; i++) { //go through each column
                if(brackets && i == 0) {
                    System.out.print("[ ");
                }

                if(comma) {
                    if(i == sizeX-1) {
                        System.out.print(fillerArray[i]);
                    }
                    else {
                        System.out.print(fillerArray[i] + ", ");
                    }
                }
                else {
                    System.out.print(fillerArray[i] + " ");
                }
                if(brackets && i == sizeX-1) {
                    System.out.print(" ]");
                }
            }
            if(sizeX <= 0 && brackets) {
                System.out.println("[ ]");

            }
            sizeY--;
            System.out.println();
        }
    }
}
