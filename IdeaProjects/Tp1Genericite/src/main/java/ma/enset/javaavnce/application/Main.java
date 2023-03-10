package ma.enset.javaavnce.application;

import ma.enset.javaavnce.metier.MetierProduitImpl;
import ma.enset.javaavnce.metier.Produit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        Produit p1=new Produit(1001,"P1","MacPro",15000,"Verion....",20 );
        Produit p2=new Produit(1002,"P2","MacAir",12000,"Verion....",30 );
        Produit p3=new Produit(1003,"P3","IMac",20000,"Verion....",40 );
        Produit p4=new Produit(1004,"P4","Lenovo",10000,"Verion....",50 );
        Produit p5=new Produit(1005,"P5","Dell",11000,"Verion....",60 );


        MetierProduitImpl m1=new MetierProduitImpl();
        m1.add(p1);
        m1.add(p2);
        m1.add(p3);
        m1.add(p4);
        m1.add(p5);


        System.out.println("Hello user:\n");
        System.out.println("Afficher la liste des produits: Entrer '1' ");

        System.out.println("Rechercher un produit par son id: Entrer '2' ");

        System.out.println("Ajouter un nouveau produit dans la liste: Entrer '3' ");

        System.out.println("Supprimer un produit par id: Entrer '4' ");

        System.out.println("Quitter ce programme: Entrer '5' ");

        Scanner scan=new Scanner(System.in);
        String userInpute= scan.next();

        while (!userInpute.equals("quitter")){



            if (userInpute.equals("1")) {
                for (Produit o : m1.getAll()){ System.out.println(o.toString());}
                System.out.println("Saisir: 1 - 2 - 3 - 4 - 'Quitter'");
            } else if (userInpute.equals("2")){
                try {
                System.out.println("Rechercher un produit par son id: Entrer ID:");
                long userInpute2=scan.nextLong();

                    System.out.println(m1.findById(userInpute2).toString());
                }catch (Exception e){
                    System.out.println("Produit n'exist pas \n Saisir autre Id");
                }
                System.out.println("Saisir: 1 - 2 - 3 - 4 - 'Quitter'");

            }
            else if (userInpute.equals("3")){
                System.out.println("Ajouter un nouveau produit dans la liste:\n Saisir Id= ");
                long userInpute3=scan.nextLong();
                System.out.println("Ssisir Nom= ");
                String userInpute4= scan.next();
                System.out.println("Ssisir Marque= ");
                String userInpute5= scan.next();
                System.out.println("Ssisir Prix= ");
                double userInpute6= scan.nextDouble();
                System.out.println("Ssisir Description= ");
                String userInpute7= scan.next();
                System.out.println("Ssisir Quantite= ");
                int userInpute8= scan.nextInt();
                m1.add(new Produit(userInpute3,userInpute4,userInpute5,userInpute6,userInpute7,userInpute8));
                System.out.println("Saisir: 1 - 2 - 3 - 4 - 'Quitter'");
            }
            else if (userInpute.equals("4")){
                System.out.print("Supprimer produit dans la liste:\n Saisir Id= ");
                long userInpute3=scan.nextLong();
                m1.delete(userInpute3);
                System.out.println("Saisir: 1 - 2 - 3 - 4 - 'Quitter'");
            }else if (userInpute.equals("5")){
                System.out.println("Quitter ce programme: Saisir 'quitter' ");
            }


            userInpute= scan.next();

        }
       // m1.delete(1007L);


    }
}