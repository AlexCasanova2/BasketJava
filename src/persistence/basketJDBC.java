package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Equipo;
import model.EstadisticasDTO;
import model.Jugador;

public class basketJDBC {

    private Connection conexion;

    public void modificarCanastasAsistenciasRebotes(Jugador j) throws SQLException {
        String update = "update jugador set canastas=?,asistencias=?,rebotes=? where nombre=?";
        PreparedStatement ps = conexion.prepareStatement(update);
        ps.setString(1, j.getNombre());
        ps.setInt(2, j.getCanastas());
        ps.setInt(3, j.getAsistencias());
        ps.setInt(4, j.getRebotes());
        ps.executeUpdate();
        ps.close();
    }

    public void modificarEquipoJugador(Equipo c, Jugador j) throws SQLException {
        String update = "update from jugador set equipo=? where nombre=?";
        PreparedStatement ps = conexion.prepareStatement(update);
        ps.executeUpdate();
        ps.close();
    }

    public void borrarJugador(Jugador j) throws SQLException {
        String delete = "delete from jugador where nombre =?";
        PreparedStatement ps = conexion.prepareStatement(delete);
        ps.setString(1, j.getNombre());
        ps.executeUpdate();
        ps.close();
    }

    public Jugador obtenerJugadorPorNombre(String nombre) throws SQLException {
        Jugador j = new Jugador();
        conectar();
        String select = "select * from jugador where nombre =?";
        PreparedStatement ps = conexion.prepareStatement(select);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));

        }
        rs.close();
        ps.close();
        return j;
    }

    public List<Jugador> selectJugadorPorNombre(String nombre) throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String query = "select * from jugador where nombre like '%" + nombre + "%'";
        Statement ps = conexion.createStatement();
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;

    }

    public List<Jugador> selectJugadorCanastasMayorQue(String nombre, int canastas) throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String query = "select * from jugador where canastas >= = ?";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;
    }

    public List<Jugador> selectJugadorAsistenciasBetween() throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String query = "select * from jugador where asistencias between =? and =?";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;
    }

    public List<Jugador> selectJugadorByPosicion(String nombre, String posicion) throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String query = "select * from jugador where posicion like '%" + posicion + "%'";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimientos").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;

    }

    public List<Jugador> selectJugadorFecha(String nombre, LocalDate nacimiento) throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String query = "select * from jugador where nacimiento <= ?";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }

        rs.close();
        ps.close();
        return jugador;
    }

    public List<EstadisticasDTO> selectJugadorGroupBy(String nombre, String posicion) throws SQLException {
        List<EstadisticasDTO> estadisticas = new ArrayList<>();
        conectar();
        String query = "select posicion, AVG(canastas),AVG(asistencias),AVG(rebotes)+"
                + "MAX(canastas),MAX(asistencias),MAX(rebotes)+"
                + "MIN(canastas),MIN(asistencias),MIN(rebotes)";
        Statement ps = conexion.createStatement();
        ResultSet rs = ps.executeQuery(query);

        while (rs.next()) {
            EstadisticasDTO e = new EstadisticasDTO();
            e.setPosicion("posicion");
            e.setAVGcanastas(rs.getDouble(2));
            e.setAVGasitencias(rs.getDouble(3));
            e.setAVGrebotes(rs.getDouble(4));
            e.setMAXcanastas(rs.getInt(5));
            e.setMAXasistencias(rs.getInt(6));
            e.setMAXrebotes(rs.getInt(7));
            e.setMINcanastas(rs.getInt(8));
            e.setMINasistencias(rs.getInt(9));
            e.setMINrebotes(rs.getInt(10));
            estadisticas.add(e);
        }
        rs.close();
        ps.close();
        return estadisticas;
    }

    public List<Jugador> ListJugadorCanastas() throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String select = "select nombre, canastas from jugador order by canastas desc";
        Statement ps = conexion.createStatement();
        ResultSet rs = ps.executeQuery(select);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setCanastas(rs.getInt("canastas"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;
    }

    public List<Equipo> ListEquipoLocalidad(String ciudad) throws SQLException {
        List<Equipo> equipo = new ArrayList<>();
        conectar();
        String select = "select * from equipo where ciudad '%" + ciudad + "%'";
        Statement ps = conexion.createStatement();
        ResultSet rs = ps.executeQuery(select);

        while (rs.next()) {
            Equipo c = new Equipo();
            c.setNombre(rs.getString("nombre"));
            c.setCiudad(rs.getString("ciudad"));
            c.setCreacion(rs.getDate("nacimiento").toLocalDate());
            equipo.add(c);
        }
        rs.close();
        ps.close();
        return equipo;
    }

    public List<Jugador> JugadoresDeUnEquipo(String equipo, String posicion) throws SQLException {
        List<Jugador> jugador = new ArrayList<>();
        conectar();
        String select = "select * from jugador where posicion = '" + posicion + "'";
        Statement ps = conexion.createStatement();
        ResultSet rs = ps.executeQuery(select);

        while (rs.next()) {
            Jugador j = new Jugador();
            j.setNombre(rs.getString("nombre"));
            j.setNacimiento(rs.getDate("nacimiento").toLocalDate());
            j.setCanastas(rs.getInt("canastas"));
            j.setAsistencias(rs.getInt("asistencias"));
            j.setRebotes(rs.getInt("rebotes"));
            j.setPosicion(rs.getString("posicion"));
            j.setEquipo(rs.getString("equipo"));
            jugador.add(j);
        }
        rs.close();
        ps.close();
        return jugador;
    }

    public void insertarEquipo(Equipo c) throws SQLException {
        String insert = "insert into equipo values(?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getCiudad());
        ps.setDate(3, java.sql.Date.valueOf(c.getCreacion()));
        ps.executeUpdate();
        ps.close();
    }

    public void insertarJugador(Jugador c) throws SQLException {
        String insert = "insert into jugador values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getNombre());
        ps.setDate(3, java.sql.Date.valueOf(c.getNacimiento()));
        ps.setInt(4, c.getCanastas());
        ps.setInt(5, c.getAsistencias());
        ps.setInt(6, c.getRebotes());
        ps.setString(7, c.getPosicion());
        ps.setString(8, c.getEquipo());
        ps.executeUpdate();
        ps.close();
    }

    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/basket";
        String usr = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, usr, pass);
    }

    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
