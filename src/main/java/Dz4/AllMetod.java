package Dz4;

public class AllMetod extends Throwable {
    public static class BezID extends Exception {
        public String getMEssege(){
            return "Атрибута ID нет";}
    }
    public static class BezTagName extends Exception{
        public String getMEssege(){
            return "Атрибута TagName нет";}
    }
    public static class BezClass extends Exception {
        public String getMEssege(){
            return "Атрибута Class нет";
        }
    }
    public static class BezName extends Exception{
        public String getMEssege(){
            return "Атрибута Name нет";}
    }

    public static class BezText extends Exception{
        public String getMEssege(){
            return "Атрибута Text нет";}
    }
}
