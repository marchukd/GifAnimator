package core;

import javafx.scene.image.Image;

import java.util.List;

public abstract class AbstractSlidesMaker implements SlidesMaker {
    protected SlidesMaker maker;

    abstract public List<Image> doSlides();
}
