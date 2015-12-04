package core;

import javafx.scene.image.Image;

import java.util.List;

public abstract class AbstractSlidesMaker implements SlidesMaker {
    protected SlidesMaker maker;

    public AbstractSlidesMaker(AbstractSlidesMaker maker) {
        this.maker = maker;
    }

    public AbstractSlidesMaker() {

    }

    abstract public List<Image> doSlides();
}
