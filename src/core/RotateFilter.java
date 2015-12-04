package core;

import javafx.scene.image.Image;

import java.util.List;

public class RotateFilter extends AbstractSlidesMaker {
    RotateFilter(AbstractSlidesMaker maker) {
        super(maker);
    }

    @Override
    public List<Image> doSlides() {
        List<Image> slides = maker.doSlides();
        System.out.println("AddRotate");
        return slides;
    }
}
