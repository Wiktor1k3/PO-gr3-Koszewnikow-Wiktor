package com.company;

import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 1 + r.nextInt(100);
        System.out.println(n);
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = (int)Math.floor(Math.random()*(999-(-999)+1)-999);
            System.out.println(tab[i]);
        }

        //---------(a)------------
        int a =0, b=0;
        for(int i = 0; i<n; i++){
            if(tab[i]%2==0){
                a++;
            }
            else {
                b++;
            }
        }
        System.out.println("(A)\nLiczb nieparzystych: "+ b +"\nLiczb parzystych: "+a);

        //---------(b)------------
        int c=0, d=0, e=0;
        for(int i = 0; i<n; i++){
            if(tab[i]<0){
                c++;
            }
            if(tab[i]>0){
                d++;
            }
            if(tab[i]==0){
                e++;
            }
        }
        System.out.println("(B)\nUjemnych liczb: "+ c +"\nDodatnich liczb: "+d+"\nZer: "+e);

        //---------(c)------------
        int f=0,g=0;
        for(int i = 0; i<n; i++){
            if(tab[i]>f){
                f=tab[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(tab[i]==f){
                g++;
                }
        }
        System.out.println("(C)\nNajwiększa liczba: "+ f +"\nWstępuje razy: "+g);

        //---------(d)------------
        int h=0, k=0;
        for(int i = 0; i<n; i++){
            if(tab[i]<0){
                h+=tab[i];
            }
            if(tab[i]>0){
                k+=tab[i];
            }
        }
        System.out.println("(D)\nSuma ujemnych liczb: "+ h +"\nSuma dodatnich liczb: "+k);

        //---------(e)------------
        int l=0, m=0;
        for(int i = 0; i<n; i++){
            if(tab[i]<0){
                l=0;
            }
            if(tab[i]>0){
                l++;
            }
            if(l>m){
                m=l;
            }
        }
        System.out.println("(E)\nDługość najdłuższego fragmentu tab z dodatnimi liczbami:"+m);

        //---------(f)------------
        System.out.println("(F)");
        int [] tab2=new int[n];
        for(int i = 0; i<n; i++){
            if(tab[i]<0){
                tab2[i]=-1;
            }
            if(tab[i]>0){
                tab2[i]=1;
            }
            System.out.println(tab2[i]);
        }

        //---------(g)------------
        System.out.println("(G)");
        int lewy = r.nextInt(n-1)+1;
        int prawy = r.nextInt(n-1)+1;
        if(prawy < lewy) {
            int cos = lewy;
            lewy = prawy;
            prawy = cos;
        }
        System.out.println("prawy = "+ prawy + "\nlewy = "+lewy);
        for(int i = 0; i <=n-1; i++){
            for(int j = n-1; j>=0; j-- ){
                if(lewy-1 >= prawy-1)
                    break;
                if(j == prawy-1 && i == lewy-1){
                    int o = tab[lewy-1];
                    tab[lewy-1] = tab[prawy-1];
                    tab[prawy-1] = o;
                    lewy++;
                    prawy--;
                }
            }
        }


            for(int i = 0; i <=n-1; i++){
                System.out.println(tab[i]);
            }


        System.out.println(n);
    }
}
