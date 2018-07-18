import java.util.Scanner;

public class TestOdcinek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj 2 punkty");
        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();
        double x2= scanner.nextDouble();
        double y2= scanner.nextDouble();

        Point punkt1=new Point(x1,y1);
        Point punkt2=new Point(x2,y2);
        System.out.println("podaj 2 punkty");
         x1= scanner.nextDouble();
         y1= scanner.nextDouble();
         x2= scanner.nextDouble();
         y2= scanner.nextDouble();
        Point punkt3=new Point(x1,y1);
        Point punkt4=new Point(x2,y2);

        Line odcinek1=new Line(punkt1,punkt2);
        Line odcinek2=new Line(punkt3,punkt4);

        Porownanie porownanie=new Porownanie(odcinek1,odcinek2);
        Line dluzszyOdcinek= porownanie.porownaj();
        System.out.println("poczatek: "+ dluzszyOdcinek.getP1().getX()+","+dluzszyOdcinek.getP1().getY());
        System.out.println("koniec: "+ dluzszyOdcinek.getP2().getX()+","+dluzszyOdcinek.getP2().getY());
        System.out.println("dlugosc: "+ dluzszyOdcinek.dlugosc());
    }
}

