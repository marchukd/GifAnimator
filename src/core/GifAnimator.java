package core;

import java.util.List;

final public class GifAnimator {
    void makeGif(SlidesFilter maker) {
        List<Image> slides = maker.doSlides();
        for (Image item : slides) {
            System.out.println(item.title);
        }
    }

}