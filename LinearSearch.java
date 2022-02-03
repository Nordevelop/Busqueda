package misClases;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		/*Author Nordevelop
		 * Busqueda lineal 
		 * 
		 */
		 int[] nums = {32,13,2, 12, 15, 11, 7, 19, 45};
	        int target = 15;
	        System.out.println("El Array completo"+Arrays.toString(nums));
	        System.out.print("Elemento del Array a buscar:  "+target+" "+" :"+"fue encontrado en la posicion: ");
	        System.out.println(search(nums, target));

	    }

	    static int search(int[] nums, int target) {	 //metodo de busqueda
	        for (int i = 0; i < nums.length; i++) {  //correr un ciclo for dentro del Array ||_||_||_||_||_||(nums)
	            if (nums[i] == target) {
	                return i;
	            }
	        } //fin ciclo for
	        return -1;
		

	}//fin metodo search()

}  //fin clase LinealSearch
