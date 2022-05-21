// ************************************************************************** //
//                                                                            //
//                                                        :::      ::::::::   //
//   BubbleSortingTraining13.java                       :+:      :+:    :+:   //
//                                                    +:+ +:+         +:+     //
//   By: Dmitriy <kapich1192@yandex.ru>             +#+  +:+       +#+        //
//                                                +#+#+#+#+#+   +#+           //
//   Created: 2022/05/21 10:41:48 by Dmitriy           #+#    #+#             //
//   Updated: 2022/05/21 10:51:53 by Dmitriy          ###   ########.fr       //
//                                                                            //
// ************************************************************************** //

package algoritms.bubbleSorting;

import java.util.*;

public class BubbleSortingTraining13{
	
	public static void main(String[] args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100);
		}
		numbers = bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	public static int[] bubbleSort(int[] array)
	{
		int temp;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i; j < array.length; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;
	}
}
