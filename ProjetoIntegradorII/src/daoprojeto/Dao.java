package daoprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Dao {
    Connection conectar;
    
    private void conectar() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastrarjogadores", 
    "root", "");
    }
    public void cadastrarJogadores(String n, String t, String p) throws ClassNotFoundException, SQLException{
        conectar();
        PreparedStatement cmd = conectar.prepareStatement("insert into jogadores VALUES(?, ?, ?)");
        cmd.setString(1 , n);
        cmd.setString(2 , t);
        cmd.setString(3 , p);
        cmd.executeUpdate();
        
    }
    public int excluirJogadores(String nome) throws ClassNotFoundException, SQLException{
        conectar();
        PreparedStatement cmd = conectar.prepareStatement("DELETE FROM jogadores WHERE nome = ?");
        cmd.setString(1 , nome);
        int retorno = cmd.executeUpdate();
        return retorno;
    }
    public ResultSet buscarJogadores(String nome) throws ClassNotFoundException, SQLException{
        conectar();
        PreparedStatement cmd = conectar.prepareStatement("SELECT * from jogadores WHERE nome = ?");
        cmd.setString(1, nome);
        ResultSet jogador = cmd.executeQuery();
        return jogador;
    }
    public void alterarJogadores(String n, String t, String p) throws ClassNotFoundException, SQLException{
        conectar();
        PreparedStatement cmd = conectar.prepareStatement("UPDATE jogadores set posicao = ?, time = ? where nome = ?");
        cmd.setString(1, p);
        cmd.setString(2, t);
        cmd.setString(3, n);
        cmd.executeUpdate(); 
    }
    public ResultSet listarJogadores() throws ClassNotFoundException, SQLException{
        conectar();
        PreparedStatement cmd = conectar.prepareStatement("SELECT * from jogadores");
        ResultSet jogador = cmd.executeQuery();
        return jogador;
    }
       public ResultSet listarNome(String n, String t, String p) throws ClassNotFoundException, SQLException{
       conectar();
       PreparedStatement cmd = conectar.prepareStatement("SELECT * from jogadores WHERE nome like ? and time = ? and posicao = ?");
       cmd.setString(1, "%" + n + "%");
       cmd.setString(2,  t );
       cmd.setString(1, p);
       ResultSet jogador = cmd.executeQuery();
       return jogador;
    }
}
