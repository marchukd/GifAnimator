package core;

public class Main {

    public static void main(String[] args) {
        new GifAnimator().makeGif(
                new RotateFilter(
                        new LightFilter(
                                new VideoSlidesMaker(
                                        new Video()
                                )
                        )
                )
        );
    }
}
