/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package givinganarrayabunchofvaluesatonce;

/**
 *
 * @author kendrabooker
 */
public class GivingAnArrayABunchOfValuesAtOnce {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };
                int arr[] = {23, 45,1, 8, 3};
		System.out.print("The first array is filled with the following values:\n\t");
                
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
                
                System.out.print("The second array is filled with the following values:\n\t");
                for(int i=0; i <arr.length; i++){
                
                    System.out.print(arr[i] + " ");
                    
                }
                System.out.println();
	}
    
}
