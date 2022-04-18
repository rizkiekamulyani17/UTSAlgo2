import Model.Post;

import java.util.ArrayList;
import java.util.Scanner;

public class Instagram {

    private static void PrintCommen(){

    }

    public static void comen(){
        String inptUsername;
        String inptKomen;

        ArrayList<Post> komentarAll = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Username : ");
        inptUsername = input.nextLine();
        System.out.println("Masukan Komenmu : ");
        inptKomen = input.nextLine();

        Post komen = new Post(inptUsername,inptKomen);
        komentarAll.add(komen);
    }

    public static void main(String[] args) {
        ArrayList<Post> postingan = new ArrayList<>();

        Post Rizki = new Post("Rizki",21,0);
        postingan.add(Rizki);

        System.out.println();
        System.out.println(Rizki.getUsername());
        System.out.println("---------------------");
        System.out.println();
        System.out.println();
        System.out.println("Postingan Rizki");
        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println(Rizki.getLike()+" suka");
        System.out.println(Rizki.getJmlcommen()+" commen");
        System.out.println();

        char pilihMenu = 0;
        int loop = 0;
        while(pilihMenu != 4){
            int likeSekarang = Rizki.getLike();
            int jumlahkomenSekarang = Rizki.getJmlcommen();

            Scanner pilihanmenu = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Like postingan ini");
            System.out.println("2. Komentari postingan ini");
            System.out.println("3. Lihat komentar");
            System.out.println("4. Pesan ");
            System.out.println("5. keluar");
            System.out.print("Pilihan Anda : ");
            pilihMenu = pilihanmenu.next().charAt(0);

            switch (pilihMenu) {
                case '1' -> {  likeSekarang = Rizki.likeNambah(likeSekarang);
                    System.out.println();
                    System.out.println(Rizki.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Rizki");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(Rizki.getJmlcommen()+" commen");
                    System.out.println();
                }

                case '2' -> {comen();
                    jumlahkomenSekarang = Rizki.comenNambah(jumlahkomenSekarang);
                    System.out.println();
                    System.out.println(Rizki.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Rizki");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(jumlahkomenSekarang+" commen");
                    System.out.println();
                }

                case '3' -> {
                    System.out.println();
                    System.out.println(Rizki.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Rizki");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(jumlahkomenSekarang+" commen");
                    System.out.println();
                    PrintCommen();

                }case '4'->{
                    Post p = new Post("KIKI",2,3);
                    p.Kirimpesan();

                }case '5'->{
                    System.exit(5);
                }

                default -> {

                }
            }

            loop++;

        }


    }
}
