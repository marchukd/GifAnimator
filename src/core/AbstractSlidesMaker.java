package core;

import java.util.List;

public abstract class AbstractSlidesMaker implements SlidesFilter {
    protected SlidesFilter maker;
    protected List<Image> slides;

    public AbstractSlidesMaker(AbstractSlidesMaker maker) {
        this.maker = maker;
    }

    public AbstractSlidesMaker() {

    }

    public List<Image> doSlides() {
        slides = maker.doSlides();
        return slides;
    }
}
