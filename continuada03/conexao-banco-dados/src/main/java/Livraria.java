import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Livraria {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();

//        con.execute("CREATE DATABASE filme");
        con.execute("USE animoons");
//        con.execute("DROP TABLE IF EXISTS filme");
//
//        con.execute("""
//        CREATE TABLE filme(
//        id INT PRIMARY KEY AUTO_INCREMENT,
//        nome VARCHAR(45) NOT NULL,
//        ano_lancamento INT
//        )""");
//
//        con.update("INSERT INTO filme VALUES (null, 'Shrek',2004)");
//        con.update("INSERT INTO filme VALUES (null, 'Pearl',2022)");
//        con.update("INSERT INTO filme VALUES (null, 'Coraline',2005)");
//
//        List <Filme> filmesDoBanco = con.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));
//
//        System.out.println(filmesDoBanco);
//
//        Filme filmeNovo = new Filme();
//        filmeNovo.setNome("Tropa de Elite");
//        filmeNovo.setAnoLancamento(2008);
//
//        con.update("INSERT INTO filme VALUES (null, ?, ?)",filmeNovo.getNome(),filmeNovo.getAnoLancamento());
//
//        filmesDoBanco = con.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));
//
//        System.out.println(filmesDoBanco);

        List<Filme> usuarios = con.query("SELECT  FROM usuario", new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(usuarios);

            }
}
