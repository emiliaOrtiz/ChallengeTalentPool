
/*Write a program that takes as input two arguments:
1) an array of integers, and
2) an integer target
Return the indices of two numbers in the array that add up to the target.
You can assume that each input has exactly one solution, and you may not use the same array element twice.
Sample Input: nums = [1,4,3,9,4], target = 8
Output: [1,4]
Explanation: Because nums[1] + nums[4] == 8, we return [1, 4].
Please share Github URL with the solution proposed */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;



public class Main {

  public static void main(String[] args) {

    List<Integer> numeros=Arrays.asList(1,4,3,9,4);

    System.out.println("----------INDICE DE LA SUMA QUE EQUIVALE AL TARGET ENVIADO POR PARAMETRO-------------");
    System.out.println("Array con los indices:"+buscarIndex(numeros, 4));
    
  }
  

  public static<T> List<T> reverseList(List<T> list)//metodo para revertir lista
    {
        List<T> reverse = new ArrayList<>(list.size());
 
        ListIterator<T> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            reverse.add(itr.previous());
        }
 
        return reverse;
    }
  public static List<Integer> buscarIndex(List<Integer>numeros,int tg){  //Metodo para devolver indice de la suma de dos numeros que sumen un target
  
    List<Integer> index=new ArrayList<>();
    List<Integer> reverse = reverseList(numeros);
    int suma=0;
    
            for(int i=0;i<=numeros.size()-1;i++){
                for(int x=0;x<=reverse.size()-1;x++){

                    if(suma==tg){
                        index.add(i); 
                    }
                    suma=numeros.get(i)+reverse.get(x);
                }
            }
        System.out.println(index);
        return index;
    }
    
}