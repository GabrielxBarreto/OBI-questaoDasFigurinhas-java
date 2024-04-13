import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList listaDeFigs(int figsCompradas){
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer>listaDeFigs = new ArrayList<Integer>();
        
        for (int i = 0; i < figsCompradas; i++) {
            System.out.println("Digite a figurinha de número: "+ (i+1));
            listaDeFigs.add(scan.nextInt());
            
        }
       listaDeFigs.add(listaDeFigs.size(),0);
        
        return listaDeFigs;

    }
    public static int compararRepetidas(ArrayList listaDeFigs){
        
        int  repetidas = 0;
        for (int i = 0; i < listaDeFigs.size(); i++) { 
            System.out.println(listaDeFigs);
            for (int j = 1; j <listaDeFigs.size(); j++) {
                System.out.println(listaDeFigs);
                if(listaDeFigs.get(i).equals(listaDeFigs.get(j))&&i!=j){
                    
                    repetidas++;
                    listaDeFigs.remove(i);
                    j--;
                }
            }
        }
        return repetidas;
        }
        
       
    

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a quantidade de de figurinhas comportadas no álbum? (total de espaços) ");
        
        int totalAlbum = scan.nextInt();
        System.out.println("Quantas figurinhas você comprou?");

        int figsCompradas = scan.nextInt();
        ArrayList<Integer> arr = listaDeFigs(figsCompradas);

        int repetidas = compararRepetidas(arr);
        int nRepetidas = figsCompradas - repetidas;
        int espacos = totalAlbum - nRepetidas;
        System.out.println("Quantidade de Figurinhas compradas "+figsCompradas);
        System.out.println("Quantidade de armazenamento do album "+totalAlbum);
        System.out.println("Total de repetidas "+repetidas);
        System.out.println("Total de Figurinhas não repetidas "+nRepetidas);
        System.out.println("Total de espaços "+espacos);
    }
}
