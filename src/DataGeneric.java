public class DataGeneric {
    private data T;
    public DataGeneric(String T) {
        this.T = new data(T);
    }
    public void printData(){
        System.out.printf("Data yang tersimpan adalah: %s",this.T.dat);
    }

    public static void main(String[] args) {
        DataGeneric x = new DataGeneric("1302204076");
        x.printData();
    }
}
