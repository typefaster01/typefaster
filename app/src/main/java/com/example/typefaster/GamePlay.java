package com.example.typefaster;
import java.util.ArrayList;
import java.util.Scanner;


public class GamePlay {

    String[] soal = new String[20];
    int counter = 0;
    int index = 0;
    long start = 0;
    long end = 0;
    int word1 = 0;
    String jawaban = "";
    ArrayList<Long> leaderboardWaktu = new ArrayList<Long>();
    ArrayList<String> leaderboardNama = new ArrayList<String>();

    public void masukSoal() {
        soal[0] = "Life is like a piano, white and black. If God play it, all will be a beautiful melody.";
        soal[1] = "Nothing is impossible. Anything can happen as long as we believe.";
        soal[2] = "Your biggest weakness is when you give up and your greatest power is when you try one more time.";
        soal[3] = "No one has the ability to do something perfect. But each person is given a lot of opportunity to do something right.";
        soal[4] = "Our life is very difficult, but there are millions of more difficult life out there.";
        soal[5] = "Not all the things that you worry could happen in your life. Stop worrying about something, because worries make you more afraid to do everything.";
        soal[6] = "Enjoy difficulties. Because of the difficulties behind it must be easy.";
        soal[7] = "The strongest people are not those always win, but they were still going when they crashed.";
        soal[8] = "Coming together is a beginning. Keeping together is progress. Working together is success.";
        soal[9] = "A strong hope can make your dreams come true.";
        soal[10] = "Dream about something and make the dream come true, because this world would not exist if there were dreamed.";
        soal[11] = "Life is not just happy yourself, but share your happiness to those around us because it will increase happiness when shared.";
        soal[12] = "When youâ€™re able to forgive & smile to the person who hurt you, thatâ€™s when you make sure that you are better than him.";
        soal[13] = "In life, there will be things that come up by itself. But there will be things that also need to struggle to get it.";
        soal[14] = "You are responsible for your life. You can not continue to blame others for the mistakes in your life. Life is really about continuing life itself.";
        soal[15] = "Never blame others in your life. People either make you happy, make you a bad person to learn and remember the person who makes the best";
        soal[16] = "Always do your best, and let God do next.";
        soal[17] = "Work like you do not need money, Love like you'll never get hurt, and dance like no one is looking.";
        soal[18] = "If you are not able to be the best, be different.";
        soal[19] = "Good people will not be harmed by God. If it happens only test God for patience.";

    }

    public String randomSoal() {
        index = (int) (Math.random() * 19);
        String soalFinal = soal[index];

        return soalFinal;
    }

    public void stopwatchstart() {
        start = System.currentTimeMillis();
    }

    public long stopwatchend() {
        long finalTime = System.currentTimeMillis();
        end = (long) ((finalTime - start) / 1000.0);
        return end;
    }

    public void checkJawaban() {
        if (jawaban.length() == soal[index].length()) {
            for (int i = 0; i < jawaban.length(); i++) {
                if (jawaban.charAt(i) != soal[index].charAt(i)) {
                    jawabanSalah();
                    break;
                }

            }
            jawabanBenar();

        } else {
            jawabanSalah();
        }

    }

    public void jawabanBenar() {
        String[] word = soal[index].split(" ");
        word1 = word.length;
        long WPM = (int)(word1 / ((double)stopwatchend() / 60));
        System.out.println("Selamat anda benar!!!");
        System.out.println("Waktumu : "  + stopwatchend());
        System.out.println("Kecepatanmu : " + WPM + " WPM");
        Scanner x = new Scanner(System.in);
        System.out.println("masukan nama : ");
        String nama = x.nextLine();
        counter++;
        leaderboardNama.add(nama);
        leaderboardWaktu.add(WPM);
        System.out.println("");
//        menu();
    }

    public void jawabanSalah() {
        System.out.println("Jawaban anda salah!!!");
        System.out.println("");
//        menu();
    }

    public void balikMenu() {
        System.out.println("Kembali ke menu (Y/N)? ");
        Scanner x = new Scanner(System.in);
        String Pilih = x.nextLine();
        if (Pilih.equalsIgnoreCase("Y")) {
//            menu();

        } else {

        }

    }

    public void leaderboard() {
        System.out.println("Top 5 Player");
        long temp = 0;
        String temp1 = "";
        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if(leaderboardWaktu.get(j) > leaderboardWaktu.get(i)){
                    temp = leaderboardWaktu.get(i);
                    leaderboardWaktu.set(i, leaderboardWaktu.get(j));
                    leaderboardWaktu.set(j, temp);
                    temp1 = leaderboardNama.get(i);
                    leaderboardNama.set(i, leaderboardNama.get(j));
                    leaderboardNama.set(j, temp1);
                }
            }
        }
        for (int i = 0; i <= counter - 1; i++)
        {
            if(i == 5)
                break;
            System.out.print(i + 1 + ". ");
            System.out.print(leaderboardNama.get(i) + " ");
            System.out.println(leaderboardWaktu.get(i) + " WPM");
            System.out.println("");
        }
//        menu();
    }

//   public void menu() {
//
//        System.out.println("1.Mulai game");
//        System.out.println("2.Leaderboard");
//        System.out.println("3.Exit");
//        System.out.println("Pilih menu : ");
//        Scanner x = new Scanner(System.in);
//        int pilih = x.nextInt();
//        if (pilih == 1) {
//            masukSoal();
//            randomSoal();
//            stopwatchstart();
//            System.out.println("Soalmu = ");
//            System.out.println(soal[index]);
//            System.out.println("Ketik Jawabanmu = ");
//            Scanner y = new Scanner(System.in);
//            jawaban = y.nextLine();
//            System.out.println("");
//            checkJawaban();
//
//
//        } else if (pilih == 2) {
//            leaderboard();
//
//        } else {
//
//        }
//
//    }

//    public static void main(String[] args) {
//        System.out.println("KECEPATAN MENGETIK");
//        GamePlay p = new GamePlay();
//        p.menu();
//    }
//
//}
