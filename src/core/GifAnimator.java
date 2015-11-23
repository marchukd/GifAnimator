package core;

/**
 * Created by Dmytro on 23.11.2015.
 */
final public class GifAnimator {
    SlidesMaker maker;

    void makeGif(SlidesMaker maker) {
        this.maker = maker;
        maker.doSlides();
    }

}