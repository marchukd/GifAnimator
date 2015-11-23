package core;

import javafx.scene.image.Image;

import java.util.List;

/**
 * Created by Dmytro on 23.11.2015.
 */
public class LightFilter implements SlidesMaker{
    private List<Image> slides;
    private SlidesMaker maker;
    public LightFilter(List<Image> slides) {
        this.slides = slides;
    }
    public LightFilter(SlidesMaker maker){
        this.maker = maker;
    }

    @Override
    public List<Image> doSlides() {
        slides = maker.doSlides();
        System.out.println("+LightFilter");
        return slides;
    }
}
