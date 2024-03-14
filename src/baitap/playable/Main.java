package baitap.playable;

public class Main
{
    public static void main(String[] args)
    {
        Playable videoPlayer = new VideoPlayer();
        Playable audioPlayer = new AudioPlayer();
        videoPlayer.Play();
        audioPlayer.Play();
    }
}
