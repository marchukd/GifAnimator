package core;


import java.util.List;

public class LightFilter extends AbstractSlidesMaker {
    LightFilter(AbstractSlidesMaker maker) {
        super(maker);
    }

    @Override
    public List<core.Image> doSlides() {
        super.doSlides();
        for (int i = 0; i < slides.size(); i++) {
            slides.get(i).title += " +AddLightFilter";
        }
        return slides;
    }
}
