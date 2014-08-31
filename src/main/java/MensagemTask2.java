
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jessica
 */
public class MensagemTask2 extends TimerTask {

    private boolean ativar = false;

    @Override
    public void run() {
        if (ativar) {
            System.out.println("Esperando...");
            
        }
    }
    
     public void setAtivar(boolean ativar)
    {
        this.ativar=ativar;
    }

}
