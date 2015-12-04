package core;

import java.util.List;

public class RotateFilter extends AbstractSlidesMaker {
    RotateFilter(AbstractSlidesMaker maker) {
        super(maker);
    }

    @Override
    public List<core.Image> doSlides() {
        super.doSlides();
        for (int i = 0; i < slides.size(); i++) {
            slides.get(i).title += " +AddRotate90dgr";
        }
        return slides;
    }
}
