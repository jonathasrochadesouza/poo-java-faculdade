package aulas.a09;

import java.util.Arrays;

public class LoteriaApp {

	public static void main(String[] args) {

		Aposta a1 = new Aposta("eu", 6);
		Aposta a2 = new Aposta("tu", 9);
		Aposta a3 = new Aposta("ele", 8);
		Aposta a4 = new Aposta("nós", 12);
		Aposta a5 = new Aposta("vós", 15);

		int[] v6 = { 8, 26, 1, 44, 43, 50 };
		int[] v7 = { 18, 32, 41, 4, 54, 25, 60 };
		int[] v8 = { 58, 42, 14, 24, 55, 20, 10, 11 };

		Aposta a6 = new Aposta("eles", v6);
		Aposta a7 = new Aposta("ela", v7);
		Aposta a8 = new Aposta("elas", v8);

		System.out.println(Arrays.toString(a1.getNumeros()));
		System.out.println(Arrays.toString(a2.getNumeros()));
		System.out.println(Arrays.toString(a3.getNumeros()));
		System.out.println(Arrays.toString(a4.getNumeros()));
		System.out.println(Arrays.toString(a5.getNumeros()));
		System.out.println(Arrays.toString(a6.getNumeros()));
		System.out.println(Arrays.toString(a7.getNumeros()));
		System.out.println(Arrays.toString(a8.getNumeros()));

	}

}
