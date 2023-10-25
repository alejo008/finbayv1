package com.com.nttdata.ecommerce.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.*;
import com.co.nttdata.ecommerce.utilitarios.InventarioProducto;
import com.co.nttdata.ecommerce.utilitarios.ReporteFactura;
import com.co.nttdata.ecommerce.interfaces.*;

public class Main {
    static Cliente cli;
    static String metodoDePago;
    static String tipoIdentificacion;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventarioProducto ip = new InventarioProducto();
		ReporteFactura r = new ReporteFactura();
		//Crear 10 prodcutos
		//Añadir 6 al carrito de comprar
		//Crear la factura de ese carrito de compras
		
		 List<Producto> list = new ArrayList<>();
		 Scanner consola =  new Scanner(System.in);
		
		GestionCarritoDeComprasImpl gcdc = new GestionCarritoDeComprasImpl();
		GestionFacturaImpl gf = new GestionFacturaImpl();
		
		Factura f =new Factura();
		CarritoDeCompras cdc = new CarritoDeCompras();
		Cliente cl = new Cliente();
		Scanner teclado = new Scanner(System.in);
		//creacion de los 10 productos
	
		Producto Tvs1 = new Producto(1,"TvSamsung 1",20,150000,true,7000,19,"Tv Samsung","Full 4K",Marca.SAMSUNG,Categoria.TECNOLOGIA);
		Producto Tvs2 = new Producto(2,"TvLG 2",80,200000,true,70000,19,"Tv LG","Full 4K",Marca.LG,Categoria.TECNOLOGIA);
		Producto Tvs3 = new Producto(3,"TvHiunday 3",50,250000,false,7000,19,"Tv Hiunday","FULL HD",Marca.KIA,Categoria.TECNOLOGIA);
		Producto Tvs4 = new Producto(4,"TvSamsung 4",190,300000,true,7000,19,"Tv Samsung","Full 4K",Marca.SAMSUNG,Categoria.TECNOLOGIA);
		Producto Tvs5 = new Producto(5,"TvLG 5",1000,350000,true,70000,19,"Tv Lg","Full 4K",Marca.LG,Categoria.TECNOLOGIA);
		Producto Tvs6 = new Producto(6,"TvHiunday 6",70,125000,false,7000,19,"Tv Hiunday","Full 8K",Marca.KIA,Categoria.TECNOLOGIA);
		Producto Tvs7 = new Producto(7,"TvSamsung 7",98,100000,true,7000,19,"Tv Samsung","Full 8K",Marca.SAMSUNG,Categoria.TECNOLOGIA);
		Producto Tvs8 = new Producto(8,"TvLG 8",25,13,true,7000,19,"Tv Lg","FuLL 8K",Marca.LG,Categoria.TECNOLOGIA);
		Producto Tvs9 = new Producto(9,"TvHiunday 9",77777,700000,true,7000,19,"Tv Hiunday","ULTRA HD",Marca.KIA,Categoria.TECNOLOGIA);
		Producto Tvs10 = new Producto(10,"TvSamsung 10",55,110000,true,7000,19,"Tv Samsung","Full 8K ULTRA HD",Marca.SAMSUNG,Categoria.TECNOLOGIA);
		
		list.add(Tvs1);
		list.add(Tvs2);
		list.add(Tvs3);
		list.add(Tvs4);
		list.add(Tvs5);
		list.add(Tvs6);
		list.add(Tvs7);
		list.add(Tvs8);
		list.add(Tvs9);
		list.add(Tvs10);
		
			
	
	
		f = gf.pagar(null, cdc);
		int opcion = 0;
		do {
			System.out.println("\n");
			System.out.println("Menu ECOMMERCE Electromedellín");
			System.out.println("1. Registrar Usuario");
			System.out.println("2. Mostrar Registro Usuario ");
			System.out.println("3. Ingreso Login");
			System.out.println("4. Agregar productos");
			System.out.println("5. AgregarProductos.txt");
			System.out.println("6. mostrar productos txt");
			System.out.println("7. Buardar archivo txt");
			System.out.println("8. Imprimir archivo txt");
			System.out.println("9. Salida");
			
			System.out.println("Ingrese la opcion");
		
			System.out.println();
			System.out.println();
			opcion = consola.nextInt();
			GestionLogin gl = new GestionLoginImpl();
			switch (opcion) {
			case 1:
				
				Ciudades ciudad = null;
				System.out.println("Resgitro de Usuario");
				System.out.println("😉-----------------------------🐱‍💻");
				System.out.println("Ingrese el Nombre del Usuario: ");
				String nombreUsuario =teclado.next();
				
				System.out.println("Ingrese la contraseña:");
				String contrasenia = teclado.next();
				
				System.out.println("Escoja la Ciudad:" +"\n"+"1-Guajira no Principal"+"\n"+"2-Medellín-Principal");
				String cd= teclado.next();
				if (cd == "1") {
					System.out.println("La ciudad es "+Ciudades.MEDELLIN + ", es ciudad no Principal");
					ciudad = Ciudades.MEDELLIN;
				}else if (cd == "2") {
					System.out.println("La ciudad es " + Ciudades.GUAJIRA +", es ciudad Principal");
					ciudad = Ciudades.GUAJIRA;
				}
				
				System.out.println("Escoja el tipo de identificacion: "+"\n"+" 1 cc"+"\n"+"2- TI"+"\n"+"3- CEx" );
				int tipo = teclado.nextInt();
				if (tipo == 1) {
					tipoIdentificacion = "CC";
				}else if (tipo == 2) {
					tipoIdentificacion = "TI";
				}else if (tipo == 3) {
					tipoIdentificacion = "CEx";
				}
				
				System.out.println("Ingrese el numero de Identificacion: ");
				String numeroIdentificacion = teclado.next();
				
				System.out.println("Ingrese el Numero de Telefono: ");
				String telefono = teclado.next();
				
				System.out.println("Ingrese la Direccion: ");
				String direccion = teclado.next();
				
				System.out.println("Escoja el Metodo de Pago: "+"\n"+"1- Contado"+"\n"+"2- Efectico"+"\n"+"3- Tarjetas Debito o Credito");
				int mdp = teclado.nextInt();
				if (mdp==1) {
					 metodoDePago = "Contado";
				}else if (mdp==2) {
					metodoDePago ="Efectivo";
				}else if (mdp == 3) {
					metodoDePago =" Tarjetas Debito o Credito";
				}
				
				System.out.println("Escoja el estado true o false: ");
				boolean estado = teclado.nextBoolean();
				
				
				
				cli= (Cliente)gl.registrar(nombreUsuario, contrasenia, ciudad, tipoIdentificacion, numeroIdentificacion,telefono,direccion,estado, metodoDePago);
				break;
			case 2:
				
				System.out.println("Los datos de Usuario registrados son: ");
				System.out.println("El nombre Usuario es: " + cli.getNombreUsuario());
				System.out.println("La contraseña es: "+ cli.getContrasenia());
				System.out.println("La Ciudad es: "+cli.getCiudad());
				System.out.println("El tipo de identificacion es: "+cli.getTipoIdentificacion());
				System.out.println("EL numero de Identificacion es: "+ cli.getNumeroIdentificacion());
				System.out.println("El numero de Telefono es: " + cli.getTelefono());
				System.out.println("La direccion es: "+ cli.getDireccion());
				System.out.println("EL estado es: " + cli.isEstado());
				System.out.println("El metodo de pago es  "+ cli.getMetodoDePago());
				System.out.println("Usuario creado");	
				
				break;
				
			case 3 :
				System.out.println("Ingrese el nombre del Usuario: ");
				String nusu = teclado.next();
				
				System.out.println("Ingrese la contraseña: ");
				String contra = teclado.next();
				
			    gl.ingreso(nusu, contra);		
				break;
				
			case 4:
				cdc = gcdc.añadirAlCarrito(cdc, list);
				cdc.setProductos(list);
				
				System.out.println("Los productos añadidos son: ");
				cdc.getProductos().forEach((
						p -> System.out.println("\n"+
								p.getIdProducto()+" "+ 
								p.getNombre()+" "+
								p.getCantidadDiponible()+" "+
								p.getPrecio()+" "+
								p.isDescuento()+" "+
								p.getValorDescuento()+" "+
								p.getIva()+" "+
								p.getDescripcion()+" "+
								p.getImg()+" "+
								p.getMarca()+" "+
								p.getCategoria())));
				break;
				
			case 5:
				ip.traerProductos(cdc);
				break;
			case 6:
				
				ip.mostrarProductos();
				break;
			case 7:
				r.escribirArchivo(cl, cdc, f);
				break;
				
			case 8:
				r.leerArchivo();
				break;
					
			case 9:
				gl.logout();
				break;

			default:
				
				break;
			}
			}while(opcion != 9);
		
 	}	
	
  
	
}


