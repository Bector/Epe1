package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GestionBD {
    public List a=new ArrayList();
    public List b=new ArrayList();
    public List c=new ArrayList();
    public List d=new ArrayList();
    public List e=new ArrayList();
    public List f=new ArrayList();
    
    //------MOSTRAR--------
    public String recuperarProfesor(){
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        ResultSet resultados=null;
        try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, password);
          sentencia = conexion.createStatement();
          String sql = "select * from profesor";
          resultados=sentencia.executeQuery(sql);
          while(resultados.next()){
                int rut=resultados.getInt("rut");
                String nombres=resultados.getString("nombre");
                String apellidos=resultados.getString("apellidos");
                String direccion=resultados.getString("direccion");
                String correo=resultados.getString("correo");
                
                a.add(rut);
                b.add(nombres);
                c.add(apellidos);
                d.add(direccion);
                e.add(correo);
                
          }
          sentencia.close();
          conexion.close();
                    
        }catch(Exception e){
          return "Error!"+ e.getMessage();
        }
        return "Datos capturados!!";
    }
    public String recuperarAsignatura(){
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        ResultSet resultados=null;
        try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, password);
          sentencia = conexion.createStatement();
          String sql = "select * from asignatura";
          resultados=sentencia.executeQuery(sql);
          while(resultados.next()){
                int cod_asignatura=resultados.getInt("cod_asignatura");
                String nombre=resultados.getString("nombre");
                int rut_profesor=resultados.getInt("rut_profesor");
                
                a.add(cod_asignatura);
                b.add(nombre);
                c.add(rut_profesor);
                
                
          }
          sentencia.close();
          conexion.close();
                    
        }catch(Exception e){
          return "Error!"+ e.getMessage();
        }
        return "Datos capturados!!";
    }
    public String recuperarEstudiante(){
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        ResultSet resultados=null;
        try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, password);
          sentencia = conexion.createStatement();
          String sql = "select * from estudiante";
          resultados=sentencia.executeQuery(sql);
          while(resultados.next()){
                int rut=resultados.getInt("rut");
                String nombres=resultados.getString("nombre");
                String apellidos=resultados.getString("apellidos");
                String direccion=resultados.getString("direccion");
                String cod_curso=resultados.getString("cod_curso");
                
                a.add(rut);
                b.add(nombres);
                c.add(apellidos);
                d.add(direccion);
                e.add(cod_curso);
                
          }
          sentencia.close();
          conexion.close();
                    
        }catch(Exception e){
          return "Error!"+ e.getMessage();
        }
        return "Datos capturados!!";
    }
    public String recuperarCurso(){
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        ResultSet resultados=null;
        try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, password);
          sentencia = conexion.createStatement();
          String sql = "select * from estudiante";
          resultados=sentencia.executeQuery(sql);
          while(resultados.next()){
                int cod_curso=resultados.getInt("cod_curso");
                String curso=resultados.getString("curso");
                String nivel=resultados.getString("nivel");
                String letra=resultados.getString("letra");
                String jornada=resultados.getString("jornada");
                
                a.add(cod_curso);
                b.add(curso);
                c.add(nivel);
                d.add(letra);
                e.add(jornada);
                
          }
          sentencia.close();
          conexion.close();
                    
        }catch(Exception e){
          return "Error!"+ e.getMessage();
        }
        return "Datos capturados!!";
    }
    //---------------------
    
    
    public String ingresarProf(int rut, String nombres, String apellidos, String direccion, String correo){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="INSERT INTO profesor (rut, nombre, apellidos, direccion, correo)"+
                    "VALUES("+rut+",'"+nombres+"','"+apellidos+"','"+direccion+"','"+correo+"');";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos ingresados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String ingresarAsig(String nombre, int rut){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="INSERT INTO asignatura (nombre, rut_profesor)"+
                    "VALUES('"+nombre+"',"+rut+");";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos ingresados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String ingresarCurso(String curso, String nivel, String letra, String jornada){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="INSERT INTO curso (curso, nivel, letra, jornada)"+
                    "VALUES('"+curso+"','"+nivel+"','"+letra+"','"+jornada+"');";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos ingresados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String ingresarEst(int rut, String nombres, String apellidos, String direccion, String cod_curso){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="INSERT INTO estudiante (RUT, nombre, apellidos, direccion, cod_curso)"+
                    "VALUES("+rut+",'"+nombres+"','"+apellidos+"','"+direccion+"','"+cod_curso+"');";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos ingresados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    
    public String eliminarProf(int rut){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="delete from profesor where rut = "+rut+";";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos eliminados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    
    }
    
        public String eliminarEst(int rut){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="delete from estudiante where rut = "+rut+";";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos eliminados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    
    }
        
                public String eliminarCurso(int cod_curso){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="delete from curso where cod_curso = "+cod_curso+";";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos eliminados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    
    }
                
        public String eliminarAsig(int cod_asignatura){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="delete from asignatura where cod_asignatura = "+cod_asignatura+";";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos eliminados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    
    }
        public String modificarProf(String dato, String da, String dn){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="UPDATE profesor set "+dato+"='"+dn+"' where "+dato+"='"+da+"'";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos modificados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String modificarAsig(String dato, String da, String dn){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="UPDATE asignatura set "+dato+"='"+dn+"' where "+dato+"='"+da+"'";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos modificados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String modificarCurso(String dato, String da, String dn){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="UPDATE curso set "+dato+"='"+dn+"' where "+dato+"='"+da+"'";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos modificados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
    public String modificarEst(String dato, String da, String dn){
        Connection conexion=null;
        Statement sentencia=null;
        String nombreBD="colegio";
        String url="jdbc:postgresql://localhost:5432/"+nombreBD;
        String usuario="postgres";
        String password="root";
        try{
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(url, usuario, password);
            sentencia=conexion.createStatement();
            String SQL="UPDATE estudiante set "+dato+"='"+dn+"' where "+dato+"='"+da+"'";
            sentencia.executeUpdate(SQL);
            sentencia.close();
            conexion.close();
            return "Datos modificados con exito";
        }catch(Exception e){
            return "Error: "+e.getMessage();
        }
    }
}
