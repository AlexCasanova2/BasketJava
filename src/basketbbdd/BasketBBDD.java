
package basketbbdd;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Equipo;
import model.Jugador;
import persistence.basketJDBC;


public class BasketBBDD {

    public static void main(String[] args) {
         basketJDBC gestor = new basketJDBC();
        try {
            
            
//             Conectamos con la bbdd
            gestor.conectar();
            
            System.out.println("Estableciendo la conexión con el servidor...");
            Equipo c = new Equipo("Lakers", "LA",LocalDate.of(1985,2,10));
            System.out.println("Insertando equipo...");
            gestor.insertarEquipo(c);
            System.out.println("Equipo dado de alta.");
            
            
            Jugador j = new Jugador(1,"Alex",LocalDate.of(1995, Month.NOVEMBER,15),23,42,54,"Base","Lakers");
            System.out.println("Insertando jugador...");
            gestor.insertarJugador(j);
            System.out.println("Jugador dado de alta");
            System.out.println(j);
            
            
            Jugador consulta = gestor.obtenerJugadorPorNombre("Alex");
            System.out.println(consulta);
            
            
            int cont=1;
            List <Jugador> resul = new ArrayList<>();
            resul =gestor.ListJugadorCanastas();
            
            for(int i =0;i< resul.size();i++){
                System.out.println(cont + " - " + resul.get(i));
                cont++;
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error con la BBDD: " + ex.getMessage());
        } finally {
            try {
                gestor.desconectar();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("Error al desconectar "+ex.getMessage());
            }
        } 
        }  
    }