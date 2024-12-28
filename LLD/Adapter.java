interface MediaPlayer{
    void play();
}

class AdvancedMediaPlayer{
    void AdvancedPlay(){
        System.out.println("Advanced player");
    }
}

class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer ap = new AdvancedMediaPlayer();
    public void play(){
        ap.AdvancedPlay();
    }
}

public class Adapter {
    public static void main(String args[]){
        MediaAdapter ma = new MediaAdapter();
        ma.play();
    }
}
