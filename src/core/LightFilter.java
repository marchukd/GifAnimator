package core;

import javafx.scene.image.Image;

import java.util.List;

public class LightFilter extends AbstractSlidesMaker {
    LightFilter(AbstractSlidesMaker maker){
        this.maker = maker;
    }
    @Override
    public List<Image> doSlides() {
        List<Image> slides = maker.doSlides();
        System.out.println("AddLightFilter");
        return slides;
    }
}
