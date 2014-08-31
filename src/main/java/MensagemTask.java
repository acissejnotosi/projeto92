
import java.text.SimpleDateFormat;
import java.util.Date;
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
class MensagemTask extends TimerTask {
    private  boolean ativar=false;
    MensagemTask2 timer2= new MensagemTask2();
    private final Date currentTime = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");

    @Override
    public void run() {
        currentTime.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(currentTime));
        long min=(System.currentTimeMillis())/60000;
        
        if(min%2!=0)
        {
            timer2.run();
            
        }
     
    }
    
   
    
}
