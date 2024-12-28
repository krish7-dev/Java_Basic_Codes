interface MediaPlayer {
    void play();    
}

class AdvancedMediaPlayer{
    public void AdvancedPlay(){
        System.out.println("Advanced player Play");
    }
}

class Adapter implements MediaPlayer{

    private AdvancedMediaPlayer amp;

    public Adapter(){
        this.amp = new AdvancedMediaPlayer();
    }

    public void play(){
        amp.AdvancedPlay();
    }
}

public class mainPlayer{
    public static void main(String args[]){
        MediaPlayer mp = new Adapter();
        mp.play();
    }
}
