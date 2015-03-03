package edu.eetac.dsa.rgonzalez.Tree;

public class Tree {
	public Tree(){
		System.out.println("Un árbol");
	}
	
	public Tree(String tipo){
		System.out.println("Un " + tipo);
		
	}
	public Tree (int altura){
		System.out.println ("Un árbol de " + altura + " metros");
	
	}
	
	public Tree (int altura, String tipo){
		System.out.println ("Un "+ tipo + " de " + altura + " metros");
	}
public static void main (String args[]){
	Tree Tree1 = new Tree (4);
	Tree Tree2 = new Tree ("Roble");
	Tree Tree3 = new Tree ();
	Tree Tree4 = new Tree (5, "Pino");
}
}
