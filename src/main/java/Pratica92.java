
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.io.IOException;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica92 {

    private static final long HORA_CHEIA = 60000; // 60s
    private static final long INTERVALO_CHEIO = 60000; // 60s
    private static final SimpleDateFormat sdf = new SimpleDateFormat("'Hora atual:' HH:mm:ss");
    
    public static void main(String[] args) throws IOException {
        System.out.println("Execução iniciada");

        System.out.println(sdf.format(new Date()));

        MensagemTask2 esperandoMensagem= new MensagemTask2();
        System.out.println("Execução iniciada");
        Timer timer = new Timer("hora-cheia-timer");
        long data = new Date().getTime();
        System.out.println(sdf.format(data));
        long dataminuto = data / 1000 * 60 * 60;
        if (dataminuto % 2 != 0) {
            System.out.println("Esperando...");

        }
        long atraso = HORA_CHEIA - new Date().getTime() % HORA_CHEIA;

        timer.scheduleAtFixedRate(new MensagemTask(esperandoMensagem), atraso, INTERVALO_CHEIO);
        timer.scheduleAtFixedRate(new MensagemTask2(), 10, INTERVALO_CHEIO);

        System.out.println("Pressione Enter para terminar...");
        System.in.read();
        timer.cancel();

        System.out.println("Execução finalizada");
        System.out.println(sdf.format(new Date()));
    }
}
