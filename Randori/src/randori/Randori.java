
package randori;

import java.util.ArrayList;
import java.util.ListIterator;


/**
 * Votre but dans ce kata est d'implémenter une méthode "difference" qui va soustraire une liste à une autre

    La méthode doit retirer toutes les valeurs de la liste A présente dans la liste B

difference([1,2],[1]) == [2]

    Si une valeur est présente dans b toutes les occurrences doivent êtres retirées

difference([1,2,2,2,3],[2]) == [1,3]

 * @author simoccjavmonp06
 *
 */

public class Randori {
	public static ArrayList<Integer> difference(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("coucou");
		/* l'iterateur est en réalité un curseur il commence en position -1 0 de ma list est bouge en
		 * fonction de .next(il passe de -1 0 a 0 1 ou .previous  a chaque foi qu'il passe au travers 
		 * d'un element il renvois cet element */
		for (ListIterator<Integer> iter1 = list1.listIterator(); iter1.hasNext();) {
			int element1 = iter1.next();/* je fais avance mon iterateur d'une case il exprime donc 
			 la valeur de cette case et je la stock dans une variable*/
			for (ListIterator<Integer> iter2 = list2.listIterator(); iter2.hasNext();) {/* seconde boucle
			avec un iterateur pour parcourir ma seconde liste*/
				
				int element2 = iter2.next();/*je fait avance mon iterateur d'une case il exprime donc 
				 la valeur de cette case et je la stock dans une variable*/
				if (element1 == element2){
					/* ici je lui fait comparer ma valeur contenu dans la premiere case au valeur de la 
					 * seconde case de ma liste si je trouve une correspondance je supprime
					 * la valeur dans trouver par iter1 */
					iter1.remove();/* iter.remove supprime l'element qu'il a traverser*/
				}
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();

		ArrayList<Integer> list2=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list2.add(2);
		list2.add(1);
		//System.out.println(list2);
		
		
		System.out.println(difference(list, list2));
	}

}

