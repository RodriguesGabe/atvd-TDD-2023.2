import org.junit.Test;
import static org.junit.Assert.*;

public class SaudacaoTest {

    @Test
    public void req01() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Joao!", saudacao.saudacao("Joao"));
    }

    @Test
    public void req02() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, meu amigo!", saudacao.saudacao((String) null));
    }

    @Test
    public void req03() {
        Saudacao saudacao = new Saudacao();
        assertEquals("OLÁ, JOSE!", saudacao.saudacao("JOSE"));
    }

    @Test
    public void req04() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Maria e Laura!", saudacao.saudacao("Maria", "Laura"));
    }

    @Test
    public void req05() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Ana, Bruno e Carlos!", saudacao.saudacao("Ana", "Bruno", "Carlos"));
    }

    @Test
    public void req06() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Ana, Carlos e OLÁ, BRUNO!", saudacao.saudacao("Ana", "BRUNO", "Carlos"));
    }

    @Test
    public void req07() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Joao, Marcos e Daiane!", saudacao.saudacao("Joao", "Marcos, Daiane"));
    }

    @Test
    public void req08() {
        Saudacao saudacao = new Saudacao();
        assertEquals("Olá, Joao e Marcos, Daiane!", saudacao.saudacao("Joao", "\"Marcos, Daiane\""));
    }
}
