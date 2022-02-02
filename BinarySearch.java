package misClases;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		/*algoritmo Busqueda Binaria
		 * Author Nordevelop
		 * 
		 */
		int[] nums = {2, 3,5,8,12, 15, 17, 27, 29, 45};
        int target = 17;
        System.out.println("Array completo: "+Arrays.toString(nums));
        System.out.print("Elemento del Array a buscar:  "+target+" "+" :"+"fue encontrado en la posicion: ");
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int primero = 0;
        int ultimo = nums.length - 1;

        while (primero <= ultimo) {
            int mid = primero + (ultimo - primero) / 2;

            if (nums[mid] > target)         
                ultimo = mid - 1;     				  		      
            else if (nums[mid] < target)
                primero = mid + 1;
            else
                return mid;
        }
        return -1;
		
		


	}

}
