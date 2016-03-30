package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CollectionTest {
	//List<Integer> arreglo =new ArrayList<Integer>();
	List<Integer> arreglo;
	//@Test(expected=NullPointerException.class)//probar que fallo 
	//public void probarCollectionTest(){
		//arreglo.get(0);//probar que no se inicializo		
	//}
	@BeforeClass
	public static void inicializarClase(){
		System.out.println("Inicia a nivel clase");
		
	}
	
	@Before
	public void inicializar(){
		System.out.println("Inicializar");
		arreglo=new ArrayList<Integer>();
		
	}
	@Test(expected=IndexOutOfBoundsException.class)//IN control+espacion
	public  void probarExcepcion(){
		arreglo.get(0);//probar que no se inicializo		
		
		
	}
	@After
	public void finalizar(){
		System.out.println("se termino el metodo");
		
	}

}
