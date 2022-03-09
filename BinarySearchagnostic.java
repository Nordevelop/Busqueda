package misClases;

import java.util.Arrays;

import java.util.*;

public class BinarySearchagnostic {

	public static void main(String[] args) {
		/*Busqueda Binaria Agnostica
		 * Author Nordevelop
		 * 
		 */
	int[] nums1 = {-1, 2, 4, 6, 7, 8, 12, 15, 19, 32, 45, 67, 99};
        int[] nums2 = {99, 67, 45, 32, 19, 15, 12, 8, 7, 6, 4, 2, -1};
        int target = 15;
        System.out.println(" primer  Array: "+Arrays.toString(nums1));
        System.out.println("Segund Array : "+Arrays.toString(nums2));
        System.out.print("Elemento del Primer Array a buscar:  "+target+" "+" :"+"fue encontrado en la posicion: ");
        System.out.println(search(nums1, target));
        System.out.print("Elemento del Segundo Array a buscar:  "+target+" "+" :"+"fue encontrado en la posicion: ");
        System.out.println(search(nums2, target));
    }

    static int search(int[] arr, int target) {
        int primero = 0;
        int ultimo = arr.length - 1;

        boolean isAscending = arr[primero] < arr[ultimo];

        while (primero <= ultimo) {
            int medio = primero + (ultimo - primero) / 2;

            if (target == arr[medio])
                return medio;

            if (isAscending) {
                if (target < arr[medio]) {
                    ultimo = medio - 1;
                } else {
                    primero = medio + 1;
                }
            } else {
                if (target < arr[medio]) {
                    primero = medio + 1;
                } else {
                    ultimo = medio - 1;
                }
            }
        }
        return -1;

	}

}
