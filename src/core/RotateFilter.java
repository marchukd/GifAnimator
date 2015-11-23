package core;

import javafx.scene.image.Image;

import java.util.List;

public class RotateFilter implements SlidesMaker{
    private List<Image> slides;
    private SlidesMaker maker;
    public RotateFilter(List<Image> slides) {
        this.slides = slides;
    }
    public RotateFilter(SlidesMaker maker){
        this.maker = maker;
    }

    @Override
    public List<Image> doSlides() {
        slides = maker.doSlides();
        System.out.println("+RotateFilter");
        return slides;
    }
}
