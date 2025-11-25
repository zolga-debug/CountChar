package start;

public class UebungenArray {

	public static void main(String[] args) {
		
		        // Создаём зубчатый массив: 2 строки, длины пока не заданы
		        int[][] square = new int[2][];
		        
		        // Задаём длину каждой строки отдельно
		        square[0] = new int[5]; // первая строка из 5 элементов
		        square[1] = new int[3]; // вторая строка из 3 элементов

		        // Заполняем массив значениями
		        for (int i = 0; i < square.length; i++) {
		            for (int j = 0; j < square[i].length; j++) {
		                square[i][j] = (i + 1) * 10 + j;  // просто пример значений
		            }
		        }

		        // Выводим массив
		        for (int i = 0; i < square.length; i++) {
		            for (int j = 0; j < square[i].length; j++) {
		                System.out.print(square[i][j] + " ");
		            }
		            System.out.println(); // переход на новую строку после каждого ряда
		        }
		    }
		


	}


