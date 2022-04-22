package programacioni.actividad1;

import java.util.Scanner;

/**
 * 
 * @author Tomás Serpez
 *
*/
/*
 * Materia: Programación 1
 * Actividad 1
 * 1er Cuatrimestre - 2022
 * 
 * ENTRADA:
 *  nombre, servidor,storage,endpoint,router,switch,accesspoint
 * 
 * PROCESO:
 * routerCant = routerCant + router
 * switchCant = switchCant + switch
 * accessPointCant = accessPointCant + accessPoint
 * servidoresCant = servidoresCant + servidor
 * storageCant = sotrageCant + storage
 * endPointCant = endPointCant + endPoint
 * 
 * cantidadTotal = routerCant + switchCant + accessPointCant + servidoresCant + storageCant + endPointCant
 * valorTotal = (routerCant * 7424.5)+
 *              (switchCant*2300)+
 *              (accessPointCant * 10900.5)+
 *              (servidoresCant * 160589)+
 *              (storageCant * 507996)+
 *              (endPointsCant * 62000)
 * 
 * SALIDA
 * cantidadTotal, valorTotal
 * 
 */
public class ProgramacionIActividad1 {

    /**
     * @param args the command line arguments
     */
    
    //Definimos las variables a utilizar, en este caso hacemos uso de variables globales para poder accederlas cross a todo el código
    
    public static String nombre = "";
    
    //Telecomunicaciones
    public static int routerCant = 0;
    public static int switchCant = 0;
    public static int accessPointCant = 0;
    
    //Infraestructura
    public static int servidoresCant = 0;
    public static int storageCant = 0;
    public static int endPointsCant = 0;
    
    //Resumen
    public static int valorTotal = 0;
    public static int cantidadTotal = 0;
    
    //Scanner para poder leer información ingresada atravez de la consola
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        while(nombre == ""){
            System.out.print("Ingrese el nombre de su empresa: ");
            nombre = scanner.nextLine();
            if( nombre == "" )
            {
                System.out.println("Ingrese un nombre valido.");
            }
        }
        menu();
    }
    //Definimos por cada procedimiento necesario, su función correspondiente para tener un código ordenado
    
    //La función que se encargará del menú
    public static void menu()
    {
        //Definimos el scanner que usaremos para leer los inputs del teclado
        
        //Mostramos el menu en pantalla
        System.out.println("**************************************************************");
        System.out.println("*            Bienvenido "+nombre+" a la tienda Insyso        *");
        System.out.println("**************************************************************");
        System.out.println("A. Infraestructura");
        System.out.println("B. Telecomunicaciónes");
        System.out.println("C. Resumen");
        System.out.println("D. Pagar");
        System.out.println("AnyKey. Salir");

        System.out.print("Seleccione que desea hacer: ");
        // Leemos la opcion ingresada:
        String opcion = scanner.nextLine();
        
        switch(opcion.toUpperCase()){
            case "A":
                infraestructura();
                break;
            case "B":
                telecomunicaciones();
                break;
            case "C":
                resumen();
                break;
            case "D":
                pagar();
                break;
            default:
                System.exit(0);
                break;
                
        }
    }
    
    
    //La función que se encargará de la parte de infraestructura
    public static void infraestructura()
    {
        System.out.println("**************************************************************");
        System.out.println("Sección de Infraestructura");
        System.out.println("**************************************************************");
        System.out.println("A. Servidores (Max 10)\n"
                        + "B. Storage (Max 5)\n"
                        + "C. EndPoint (Max 7)\n"
                        + "AnyKey. Volver atras");
        System.out.print("¿Qué desea comprar? ");
        String opcion = scanner.nextLine();
        switch(opcion.toUpperCase())
        {
            case "A":
                if(servidoresCant < 10 && servidoresCant >= 0)
                {
                    System.out.print("Cuantos servidores desea comprar?");
                    try{
                        int servidores = Integer.parseInt(scanner.nextLine());
                        if((servidores + servidoresCant) > 10 || servidores <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de servidores.");                            
                        }
                        else
                        {
                            servidoresCant += servidores;
                            
                        }
                        infraestructura();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        infraestructura();
                    }
                    
                }
                break;
            case "B":
                if(storageCant < 5 && storageCant >= 0)
                {
                    System.out.print("Cuantos servidores de storage desea comprar?");
                    try{
                        int storage = Integer.parseInt(scanner.nextLine());
                        if((storage + storageCant) > 5 || storage <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de storage.");                            
                        }
                        else
                        {
                            storageCant += storage;
                            
                        }
                        infraestructura();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        infraestructura();
                    }
                    
                }
                break;
            case "C":
                if(storageCant < 7 && storageCant >= 0)
                {
                    System.out.print("Cuantos EndPoints desea comprar?");
                    try{
                        int endPoint = Integer.parseInt(scanner.nextLine());
                        if((endPoint + endPointsCant) > 7 || endPoint <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de End Points.");                            
                        }
                        else
                        {
                            endPointsCant += endPoint;
                            
                        }
                        infraestructura();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        infraestructura();
                    }
                    
                }
                break;
            default:
                menu();
                break;
        }
        
        
    }
    //La función que se encargará de la parte de telecomunicaciones
    public static void telecomunicaciones()
    {
        System.out.println("**************************************************************");
        System.out.println("Sección de Telecomunicaciones");
                System.out.println("A. Routers (Max 3)\n"
                                + "B. Switches (Max 5)\n"
                                + "C. Access Points (Max 4)\n"
                                + "AnyKey. Volver atras");
        System.out.print("¿Qué desea comprar? ");
        String opcion = scanner.nextLine();
        switch(opcion.toUpperCase())
        {
            case "A":
                if(routerCant < 3 && routerCant >= 0)
                {
                    System.out.print("Cuantos routers desea comprar?");
                    try{
                        int router = Integer.parseInt(scanner.nextLine());
                        if((router + routerCant) > 10 || router <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de routers.");                            
                        }
                        else
                        {
                            routerCant += router;
                            
                        }
                        telecomunicaciones();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        telecomunicaciones();
                    }
                    
                }
                break;
            case "B":
                if(switchCant < 5 && switchCant >= 0)
                {
                    System.out.print("Cuantos Switches de storage desea comprar?");
                    try{
                        int switches = Integer.parseInt(scanner.nextLine());
                        if((switches + switchCant) > 5 || switches <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de switches.");                            
                        }
                        else
                        {
                            switchCant += switches;
                            
                        }
                        telecomunicaciones();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        telecomunicaciones();
                    }
                    
                }
                break;
            case "C":
                if(accessPointCant < 4 && accessPointCant >= 0)
                {
                    System.out.print("Cuantos AP desea comprar?");
                    try{
                        int accessPoint = Integer.parseInt(scanner.nextLine());
                        if((accessPoint + accessPointCant) > 4 || accessPoint <= 0)
                        {
                            System.out.println("No puede comprar esa cantidad de APs.");                            
                        }
                        else
                        {
                            accessPointCant += accessPoint;
                            
                        }
                        telecomunicaciones();
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Ingrese un numero valido.");
                        telecomunicaciones();
                    }
                    
                }
                break;
            default:
                menu();
                break;
        }
    }

    
    //La función que se encargará de la parte del resumen de pago, así como del método con el que se abonará
    public static void resumen()
    {
        System.out.println("**************************************************************");
        System.out.println("Resumen de compra de "+nombre);
        System.out.println("**************************************************************");
        System.out.println("Telecomunicaciones\n");
        System.out.println("Routers: "+routerCant);
        System.out.println("Switches: "+switchCant);
        System.out.println("AccessPoints: "+accessPointCant);
        System.out.println("**************************************************************");
        System.out.println("Infraestructura\n");
        System.out.println("Servidores: "+servidoresCant);
        System.out.println("Storage: "+storageCant);
        System.out.println("End Points: "+endPointsCant);
        menu();
    }
    
    public static void pagar()
    {
        double valorCuotaTotal = 0.0;
        double valorCuota = 0.0;
        
        double valorTotal = Math.round((routerCant * 7424.5)+
                            (switchCant*2300)+
                            (accessPointCant * 10900.5)+
                            (servidoresCant * 160589)+
                            (storageCant * 507996)+
                            (endPointsCant * 62000)
                );
        System.out.println("**************************************************************");
        System.out.println("Menú de pago para "+nombre);
        System.out.println("**************************************************************");
        System.out.println("El valor a abonar es de: $"+valorTotal);
        System.out.println("\nCómo desea pagar?\n"
                        + "A. Efectivo/Debito (10% descuento)\n"
                        + "B.Credito(3 cuotas 15% interes o 6 cuotas 20% interes)\n"
                        + "AnyKey. Volver al menú principal");
        String opcion = scanner.nextLine();
        switch(opcion.toUpperCase())
        {
            case "A":
                System.out.println("Desea pagar con\n"
                                + "A. Efectivo\n"
                                + "B. Debito\n"
                                + "AnyKey. Volver al menú anterior");
                opcion = scanner.nextLine();
                switch(opcion.toUpperCase())
                {
                    case "A":
                        System.out.println("El valor a abonar con descuento es de: " + Math.round(valorTotal * 0.9) 
                                        + "\nIngrese con cuanto va a abonar: ");
                        try
                        {
                            double valor = Integer.parseInt(scanner.nextLine());
                            if (valor > 0 && valor >= valorTotal)
                            {
                                System.out.println("Se ha realizado un pago de $" + Math.round(valorTotal * 0.9));
                            }
                            else
                            {
                                System.out.println("Ingrese un valor valido.");
                                pagar();
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Ingrese un valor valido.");
                            pagar();
                        }
                        break;
                    case "B":
                        System.out.println("Se ha realizado un pago de $" + Math.round(valorTotal * 0.9));
                        break;
                    default:
                        pagar();
                        break;
                }
                break;
            case "B":
                System.out.println("Ingrese la cantidad de cuotas con las que desea pagar.\n"
                                + "A. 3 Cuotas (15% de interes)\n"
                                + "B. 6 Cuotas (20% de interes)\n"
                                + "AnyKey. Volver al menú anterior");
                opcion = scanner.nextLine();
                switch(opcion.toUpperCase())
                {
                    case "A":
                        valorCuotaTotal = Math.round(valorTotal * 1.15);
                        valorCuota = Math.round(valorCuotaTotal / 3);
                        System.out.println("El valor total a pagar es de: $" + Math.round(valorCuotaTotal) +
                                           "\nEl valor de cada cuota es de $" + Math.round(valorCuota));
                        break;
                    case "B":
                        valorCuotaTotal = Math.round(valorTotal * 1.20);
                        valorCuota = Math.round(valorCuotaTotal / 6);
                        System.out.println("El valor total a pagar es de: $" + Math.round(valorCuotaTotal) +
                                           "\nEl valor de cada cuota es de $" + Math.round(valorCuota));
                        break;
                    default:
                        pagar();
                        break;
                }
                break;
            default:
                menu();
                break;
        }
    } 
}
