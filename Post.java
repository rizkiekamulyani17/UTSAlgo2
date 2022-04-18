package Model;


import java.util.ArrayList;
import java.util.Scanner;

public class Post {
    public String username;
    public int like;
    public int jmlcommen;
    public String commen;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getJmlcommen() {
        return jmlcommen;
    }

    public void setJmlcommen(int jmlcommen) {
        this.jmlcommen = jmlcommen;
    }

    public String getCommen() {
        return commen;
    }

    public void setCommen(String commen) {
        this.commen = commen;
        System.out.println("Komennya"+ this.commen );
    }

    public Post (String usrnm, int lke, int jmlcomen){
        this.username = usrnm;
        this.like = lke;
        this.jmlcommen = jmlcomen;
    }


    public Post(String usrnme, String coment){
        this.username = usrnme;
        this.commen = coment;
    }

    public int likeNambah(int like){
        like = like+1;
        return like;
    }

    public int comenNambah(int comen){
        comen = comen+1;
        return comen;
    }
    public void Kirimpesan(){Scanner input = new Scanner(System.in);
        System.out.println("");

        System.out.println("Masukan Penerima ");
        String penerima = input.nextLine();
        System.out.println(penerima);

        System.out.println("Masukan Pengirim ");
        String pengirim = input.nextLine();
        System.out.println(pengirim);
        System.out.println("Masukan Isipesan ");
        String isipesan = input.nextLine();
        System.out.println(isipesan);

        System.out.println("Penerima " + penerima);
        System.out.println("Pengirim" + pengirim);
        System.out.println("Isi Pesan " + isipesan);}





}

