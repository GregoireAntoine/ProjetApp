
package projetfinal;
//Fenetre Fenetre = new Fenetre();
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.lang.Object;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class projet
{
    // fonction principale
    public static void main(String[] args)
    {
        //fenetre
        JFrame fen= new JFrame("test de culture");
        fen.setSize(800,600);
        JPanel pan=new JPanel();
        fen.setContentPane(pan);
        fen.setLayout(null);
        // le bouton 1
        JButton bu1 = new JButton("vrai");
        bu1.setBounds(250,350,60,40);
        JButton fo1 = new JButton("faux");
        fo1.setBounds(450,350,60,40);
        // bouton 2
        JButton bu2 = new JButton("vrai");
        bu2.setBounds(250,350,60,40);
        JButton fo2 = new JButton("faux");
        fo2.setBounds(450,350,60,40);
        //bouton3
        JButton bu3= new JButton("vrai");
        bu3.setBounds(250,350,60,40);
        JButton fo3 = new JButton("faux");
        fo3.setBounds(450,350,60,40);
        //bouton4
        JButton bu4= new JButton("vrai");
        bu4.setBounds(250,350,60,40);
        JButton fo4 = new JButton("faux");
        fo4.setBounds(450,350,60,40);
        //boutoN5
        JButton bu5= new JButton("vrai");
        bu5.setBounds(250,350,60,40);
        JButton fo5 = new JButton("faux");
        fo5.setBounds(450,350,60,40);
        //bouton6
        JButton bu6= new JButton("vrai");
        bu6.setBounds(250,350,60,40);
        JButton fo6 = new JButton("faux");
        fo6.setBounds(450,350,60,40);
        //bouton7
        JButton bu7= new JButton("vrai");
        bu7.setBounds(250,350,60,40);
        JButton fo7 = new JButton("faux");
        fo7.setBounds(450,350,60,40);
        //bouton8
        JButton bu8= new JButton("vrai");
        bu8.setBounds(250,350,60,40);
        JButton fo8 = new JButton("faux");
        fo8.setBounds(450,350,60,40);
        //bouton9
        JButton bu9= new JButton("vrai");
        bu9.setBounds(250,350,60,40);
        JButton fo9 = new JButton("faux");
        fo9.setBounds(450,350,60,40);
        //bouton10
        JButton bu10= new JButton("vrai");
        bu10.setBounds(250,350,60,40);
        JButton fo10 = new JButton("faux");
        fo10.setBounds(450,350,60,40);
        // contour de boutons
        JLabel contour = new JLabel("****************");
        contour.setBounds(4420,322,100,40);
        fen.getContentPane().add(contour);
        JLabel contour1 = new JLabel("****************");
        contour1.setBounds(4420,378,100,40);
        fen.getContentPane().add(contour1);
        ////////////////////////Les boutons ok//////////////////////////////////////////////////////////////////////////////////////:
        JButton ok1 = new JButton("d'accord");
        ok1.setBounds(350,300,100,40);
        JButton ok2 = new JButton("d'accord");
        ok2.setBounds(350,300,100,40);
        JButton ok10 = new JButton("d'accord");
        ok10.setBounds(350,300,100,40);
        JButton ok3 = new JButton("d'accord");
        ok3.setBounds(350,300,100,40);
        JButton ok4 = new JButton("d'accord");
        ok4.setBounds(350,300,100,40);
        JButton ok5 = new JButton("d'accord");
        ok5.setBounds(350,300,100,40);
        JButton ok6 = new JButton("d'accord");
        ok6.setBounds(350,300,100,40);
        JButton ok7 = new JButton("d'accord");
        ok7.setBounds(350,300,100,40);
        JButton ok8 = new JButton("d'accord");
        ok8.setBounds(350,300,100,40);
        JButton ok9 = new JButton("d'accord");
        ok9.setBounds(350,300,100,40);
        JButton okdem = new JButton("démarrer");
        okdem.setBounds(350,300,100,40);
        JButton ok50 = new JButton("d'accord");
        ok50.setBounds(350,250,160,40);
        //phrase de démarrage
        JLabel demarrage = new JLabel("bienvenue, cliquez pour commencer le test de culture général.");
        demarrage.setBounds(210,100,600,70);
        fen.getContentPane().add(demarrage);
        fen.getContentPane().add(okdem);
        //////////////////////////////////////////rep question//////////////////////////////////////////////////////////////////////////::
        //tableau de reponse
        String tab[][]=
        {
            
            {"  1) Le sang compte pour environ 2% du poids du corps humain","faux le sang représente 6 à 7 % du corps humain et non pas seulement 2% ","F","f"},
            
            {"2) Les fossiles ont contribué à renforcer la croyance dans la théorie de l’évolution","Vrai ceux ci on grandement aider dans notre comprhension de l'évolution","V","v"},
            
            {"3) Le grand-père de Charles Darwin a aidé à jeter les bases de la théorie de l’évolution","C'est vrai c'est son grand père paternel qui l'aurait mit sur cette voie","V","v"},
            
            {"4) Les baleines ont toujours été des mammifères marins","Faux, il y a 50 millions d'années c'était des amphibiens tels une grenouille","F","f"},
            
            {"5) La bibliothèque d’Alexandrie, en Égypte, a été fondée par les Grecs.","Vrai,Pitolémée décida de faire d’Alexandrie la capitale culturelle du monde hellénistique","V","v"},
            
            {"6) La phrase « heureusement, mon téléviseur était encore sur la garantie » est juste","faux il faut dire est sous garantie car ça correspondt a une faute de français","F","f"},
            
            {"7) il est correct de dire : le petit caniche de mon voisin aboie sans arrêt","faux il faut dire jappe, aboyer c'est pour les grands chiens tel les ","F","f"},
            
            {"8) L’estampie est une gravure médiévale, ancêtre du timbre","faux, c'est une mode danse en virvoltant apparue au 13ème siècle","F","f"},
            
            {"9) Liechtenstein est la capitale du Liechtenstein","faux sa capital est Vaduz même si beaucoup de gens font la faute.","F","f"},
            
            {"10) Le port de Marseille a été fondé par les Grecs vers 600 av. J.-C.","Vrai elle à été fondée par les Grecs d'ailleurs marseille vient de Massalia ","V","v"}
        };
        // enregistrement des reponse dans les JLabels
        JLabel rep1 = new JLabel(tab[0][1]);
        JLabel rep2 = new JLabel(tab[1][1]);
        JLabel rep3 = new JLabel(tab[2][1]);
        JLabel rep4 = new JLabel(tab[3][1]);
        JLabel rep5 = new JLabel(tab[4][1]);
        JLabel rep6 = new JLabel(tab[5][1]);
        JLabel rep7 = new JLabel(tab[6][1]);
        JLabel rep8 = new JLabel(tab[7][1]);
        JLabel rep9 = new JLabel(tab[8][1]);
        JLabel rep10 = new JLabel(tab[9][1]);
        // enregistrement des valeur de la reussite dans JLabels
        JLabel r1 = new JLabel("Vrai");
        JLabel r2 = new JLabel("Vrai");
        JLabel r3 = new JLabel("Vrai");
        JLabel r4 = new JLabel("Vrai");
        JLabel r5 = new JLabel("Vrai");
        JLabel r6 = new JLabel("Vrai");
        JLabel r7 = new JLabel("Vrai");
        JLabel r8 = new JLabel("Vrai");
        JLabel r9 = new JLabel("Vrai");
        JLabel r10 = new JLabel("Vrai");
        // enregistrement des valeur de l'eched dans JLabels
        JLabel f1 = new JLabel("Faux");
        JLabel f2 = new JLabel("Faux");
        JLabel f3 = new JLabel("Faux");
        JLabel f4 = new JLabel("Faux");
        JLabel f5 = new JLabel("Faux");
        JLabel f6 = new JLabel("Faux");
        JLabel f7 = new JLabel("Faux");
        JLabel f8 = new JLabel("Faux");
        JLabel f9 = new JLabel("Faux");
        JLabel f10 = new JLabel("Faux");
        // enregistrement des valeur dans JLabels
        JLabel q1 = new JLabel("Q1 :");
        JLabel q2 = new JLabel("Q2 :");
        JLabel q3 = new JLabel("Q3 :");
        JLabel q4 = new JLabel("Q4 :");
        JLabel q5 = new JLabel("Q5 :");
        JLabel q6 = new JLabel("Q6 :");
        JLabel q7 = new JLabel("Q7 :");
        JLabel q8 = new JLabel("Q8 :");
        JLabel q9 = new JLabel("Q9 :");
        JLabel q10 = new JLabel("Q10 :");
        // la partie console
        int score=0;
        for(int i=0;i<tab.length;i++)
        {
            System.out.print(tab[i][0]+"\n");
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            System.out.println("V ou F\n");
            char t= tab[i][3].charAt(0);
            char s= tab[i][2].charAt(0);
            char j = myObj.next().charAt(0) ; // Read user input
            System.out.print(j);
            char v ='v';
            if(t==j || s==j)
            
            {
                System.out.print("\n");
                System.out.print("bravo, "+ tab[i][1]);
                System.out.print("\n");
                System.out.print("\n");
                score++;
            }
            else
            {
                System.out.print("\n");
                System.out.print("perdu \n");
                System.out.print("'"+ tab[i][1]+"'");
                System.out.print("\n");
                System.out.print("\n");
            }
            if(i==9)
            {
                System.out.print("tu as terminer avec "+score+" bonnes réponses ");
            }
        }
        //fin partie console
        // question 1
        JLabel jLabel1 = new JLabel();
        jLabel1.setText(tab[0][0]);
        jLabel1.setBounds(200,220,600,70);
        // question 2
        JLabel jLabel2 = new JLabel();
        jLabel2.setText(tab[1][0]);
        jLabel2.setBounds(200,220,600,70);
        // question 3
        JLabel jLabel3 = new JLabel();
        jLabel3.setText(tab[2][0]);
        jLabel3.setBounds(200,220,600,70);
        // question 4
        JLabel jLabel4 = new JLabel();
        jLabel4.setText(tab[3][0]);
        jLabel4.setBounds(200,220,600,70);
        // question 5
        JLabel jLabel5 = new JLabel();
        jLabel5.setText(tab[4][0]);
        jLabel5.setBounds(200,200,600,70);
        // question 6
        JLabel jLabel6= new JLabel();
        jLabel6.setText(tab[5][0]);
        jLabel6.setBounds(200,220,600,70);
        // question 7
        JLabel jLabel7 = new JLabel();
        jLabel7.setText(tab[6][0]);
        jLabel7.setBounds(200,220,600,70);
        // question 8
        JLabel jLabel8 = new JLabel();
        jLabel8.setText(tab[7][0]);
        jLabel8.setBounds(200,220,600,70);
        // question 9
        JLabel jLabel9 = new JLabel();
        jLabel9.setText(tab[8][0]);
        jLabel9.setBounds(200,220,600,70);
        // question 10
        JLabel jLabel10 = new JLabel();
        jLabel10.setText(tab[9][0]);
        jLabel10.setBounds(200,220,600,70);
        // MESSAGE DE FIN
        JLabel JLABELFINAL = new JLabel();
        JLABELFINAL.setText("VOUS AVEZ TERMINER LE QUIZ BRAVO");
        JLABELFINAL.setBounds(270,200,600,10);
        fen.setVisible(true);
        // bouton démarrage
        okdem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel1);
                fen.getContentPane().add(bu1);
                fen.getContentPane().add(fo1);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                okdem.setBounds(27500,20000,600,40);
                demarrage.setBounds(25000,350,60,40);
            };
        });
        // bouton vrai question 1//////////////////////////////////////////////////////////////////////////////////////
        bu1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep1);
                fen.getContentPane().add(ok1);
                rep1.setBounds(200,200,600,70);
                jLabel1.setBounds(27500,20000,600,40);
                bu1.setBounds(25000,350,60,40);
                fo1.setBounds(25000,350,60,40);
                f1.setBounds(320,215,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
            };
        });
        // bouton faux question 1
        fo1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep1);
                fen.getContentPane().add(ok1);
                r1.setBounds(320,215,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep1.setBounds(200,200,600,70);
                jLabel1.setBounds(27500,20000,600,40);
                bu1.setBounds(25000,350,60,40);
                fo1.setBounds(25000,350,60,40);
        };  });
        ///////bouton 1 ok/////////////////////////
        ok1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel2);
                fen.getContentPane().add(bu2);
                fen.getContentPane().add(fo2);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep1.setBounds(27500,20000,600,40);
                ok1.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 2 ///////////////////////////////////////////////////////////////////////////////////////////
        bu2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep2);
                fen.getContentPane().add(ok2);
                r2.setBounds(320,240,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep2.setBounds(200,200,600,70);
                jLabel2.setBounds(27500,20000,600,40);
                bu2.setBounds(25000,350,60,40);
                fo2.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 2
        fo2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep2);
                fen.getContentPane().add(ok2);
                f2.setBounds(320,240,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep2.setBounds(200,200,600,70);
                jLabel2.setBounds(27500,20000,600,40);
                bu2.setBounds(25000,350,60,40);
                fo2.setBounds(25000,350,60,40);
        };  });
        ok2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel3);
                fen.getContentPane().add(bu3);
                fen.getContentPane().add(fo3);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep2.setBounds(27500,20000,600,40);
                ok2.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 3 ////////////////////////////////////////////////////////////////////////////////////////////
        bu3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep3);
                fen.getContentPane().add(ok3);
                r3.setBounds(320,265,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep3.setBounds(200,200,600,70);
                jLabel3.setBounds(27500,20000,600,40);
                bu3.setBounds(25000,350,60,40);
                fo3.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 3
        fo3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep3);
                fen.getContentPane().add(ok3);
                f3.setBounds(320,265,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep3.setBounds(200,200,600,70);
                jLabel3.setBounds(27500,20000,600,40);
                bu3.setBounds(25000,350,60,40);
                fo3.setBounds(25000,350,60,40);
        };  });
        ok3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel4);
                fen.getContentPane().add(bu4);
                fen.getContentPane().add(fo4);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep3.setBounds(27500,20000,600,40);
                ok3.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 4 ////////////////////////////////////////////////////////////////////////////////////////////
        bu4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep4);
                fen.getContentPane().add(ok4);
                f4.setBounds(320,290,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep4.setBounds(200,200,600,70);
                jLabel4.setBounds(27500,20000,600,40);
                bu4.setBounds(25000,350,60,40);
                fo4.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 4
        fo4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep4);
                fen.getContentPane().add(ok4);
                r4.setBounds(320,290,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep4.setBounds(200,200,600,70);
                jLabel4.setBounds(27500,20000,600,40);
                bu4.setBounds(25000,350,60,40);
                fo4.setBounds(25000,350,60,40);
        };  });
        ok4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel5);
                fen.getContentPane().add(bu5);
                fen.getContentPane().add(fo5);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep4.setBounds(27500,20000,600,40);
                ok4.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 5 ////////////////////////////////////////////////////////////////////////////////////////////
        bu5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep5);
                fen.getContentPane().add(ok5);
                r5.setBounds(320,315,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep5.setBounds(200,200,600,70);
                jLabel5.setBounds(27500,20000,600,40);
                bu5.setBounds(25000,350,60,40);
                fo5.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 5
        fo5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep5);
                fen.getContentPane().add(ok5);
                f5.setBounds(320,315,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep5.setBounds(200,200,600,70);
                jLabel5.setBounds(27500,20000,600,40);
                bu5.setBounds(25000,350,60,40);
                fo5.setBounds(25000,350,60,40);
        };  });
        ok5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel6);
                fen.getContentPane().add(bu6);
                fen.getContentPane().add(fo6);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep5.setBounds(27500,20000,600,40);
                ok5.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 6 ////////////////////////////////////////////////////////////////////////////////////////////
        bu6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep6);
                fen.getContentPane().add(ok6);
                f6.setBounds(440,215,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep6.setBounds(200,200,600,70);
                jLabel6.setBounds(27500,20000,600,40);
                bu6.setBounds(25000,350,60,40);
                fo6.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 6
        fo6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep6);
                fen.getContentPane().add(ok6);
                r6.setBounds(440,215,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep6.setBounds(200,200,600,70);
                jLabel6.setBounds(27500,20000,600,40);
                bu6.setBounds(25000,350,60,40);
                fo6.setBounds(25000,350,60,40);
        };  });
        ok6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel7);
                fen.getContentPane().add(bu7);
                fen.getContentPane().add(fo7);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep6.setBounds(27500,20000,600,40);
                ok6.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 7 ////////////////////////////////////////////////////////////////////////////////////////////
        bu7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep7);
                fen.getContentPane().add(ok7);
                f7.setBounds(440,240,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep7.setBounds(200,200,600,70);
                jLabel7.setBounds(27500,20000,600,40);
                bu7.setBounds(25000,350,60,40);
                fo7.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 7
        fo7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep7);
                fen.getContentPane().add(ok7);
                r7.setBounds(440,240,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep7.setBounds(200,200,600,70);
                jLabel7.setBounds(27500,20000,600,40);
                bu7.setBounds(25000,350,60,40);
                fo7.setBounds(25000,350,60,40);
        };  });
        ok7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel8);
                fen.getContentPane().add(bu8);
                fen.getContentPane().add(fo8);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep7.setBounds(27500,20000,600,40);
                ok7.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 8 ////////////////////////////////////////////////////////////////////////////////////////////
        bu8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep8);
                fen.getContentPane().add(ok8);
                f8.setBounds(440,265,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep8.setBounds(200,200,600,70);
                jLabel8.setBounds(27500,20000,600,40);
                bu8.setBounds(25000,350,60,40);
                fo8.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 8
        fo8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep8);
                fen.getContentPane().add(ok8);
                r8.setBounds(440,265,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep8.setBounds(200,200,600,70);
                jLabel8.setBounds(27500,20000,600,40);
                bu8.setBounds(25000,350,60,40);
                fo8.setBounds(25000,350,60,40);
        };  });
        ok8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel9);
                fen.getContentPane().add(fo9);
                fen.getContentPane().add(bu9);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep9.setBounds(200,200,600,40);
                rep8.setBounds(27500,20000,600,40);
                ok8.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 9 ////////////////////////////////////////////////////////////////////////////////////////////
        bu9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep9);
                fen.getContentPane().add(ok9);
                f9.setBounds(440,290,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep9.setBounds(200,200,600,70);
                jLabel9.setBounds(27500,20000,600,40);
                bu9.setBounds(25000,350,60,40);
                fo9.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 9
        fo9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep9);
                fen.getContentPane().add(ok9);
                r9.setBounds(440,290,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep9.setBounds(200,200,600,70);
                jLabel9.setBounds(27500,20000,600,40);
                bu9.setBounds(25000,350,60,40);
                fo9.setBounds(25000,350,60,40);
        };  });
        ok9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(jLabel10);
                fen.getContentPane().add(bu10);
                fen.getContentPane().add(fo10);
                contour.setBounds(440,322,100,40);
                contour1.setBounds(240,322,100,40);
                rep9.setBounds(27500,20000,600,40);
                ok9.setBounds(25000,350,60,40);
        };  });
        // bouton vrai question 10 ////////////////////////////////////////////////////////////////////////////////////////////
        bu10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep10);
                fen.getContentPane().add(ok10);
                r10.setBounds(440,315,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep10.setBounds(200,200,600,40);
                jLabel10.setBounds(27500,20000,600,40);
                bu10.setBounds(25000,350,60,40);
                fo10.setBounds(25000,350,60,40);
            };
        });
        // bouton faux question 10
        fo10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fen.getContentPane().add(rep10);
                fen.getContentPane().add(ok10);
                f10.setBounds(440,315,30,15);
                contour.setBounds(27500,20000,600,40);
                contour1.setBounds(27500,20000,600,40);
                rep10.setBounds(200,200,600,40);
                jLabel10.setBounds(27500,20000,600,40);
                bu10.setBounds(25000,350,60,40);
                fo10.setBounds(25000,350,60,40);
        };  });
        ok10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                q1.setBounds(290,215,30,15);
                q2.setBounds(290,240,30,15);
                q3.setBounds(290,265,30,15);
                q4.setBounds(290,290,30,15);
                q5.setBounds(290,315,30,15);
                q6.setBounds(410,215,30,15);
                q7.setBounds(410,240,30,15);
                q8.setBounds(410,265,30,15);
                q9.setBounds(410,290,30,15);
                q10.setBounds(410,315,35,15);
                fen.getContentPane().add(q1);
                fen.getContentPane().add(q2);
                fen.getContentPane().add(q4);
                fen.getContentPane().add(q3);
                fen.getContentPane().add(q5);
                fen.getContentPane().add(q6);
                fen.getContentPane().add(q7);
                fen.getContentPane().add(q8);
                fen.getContentPane().add(q9);
                fen.getContentPane().add(q10);
                fen.getContentPane().add(r1);
                fen.getContentPane().add(r2);
                fen.getContentPane().add(r3);
                fen.getContentPane().add(r4);
                fen.getContentPane().add(r5);
                fen.getContentPane().add(r6);
                fen.getContentPane().add(r7);
                fen.getContentPane().add(r8);
                fen.getContentPane().add(r9);
                fen.getContentPane().add(r10);
                fen.getContentPane().add(f1);
                fen.getContentPane().add(f2);
                fen.getContentPane().add(f3);
                fen.getContentPane().add(f4);
                fen.getContentPane().add(f5);
                fen.getContentPane().add(f6);
                fen.getContentPane().add(f7);
                fen.getContentPane().add(f8);
                fen.getContentPane().add(f9);
                fen.getContentPane().add(f10);
                fen.getContentPane().add(JLABELFINAL);
                fen.getContentPane().add(JLABELFINAL);
                fen.getContentPane().add(JLABELFINAL);
                rep10.setBounds(27500,20000,600,40);
                ok10.setBounds(25000,350,60,40);
        };  });
    }
}
