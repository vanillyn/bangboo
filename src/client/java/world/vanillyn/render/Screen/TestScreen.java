package world.vanillyn.render.Screen;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.container.FlowLayout;
import world.vanillyn.BangbooMod;


public class TestScreen extends BaseUIModelScreen<FlowLayout> {

    public TestScreen() {
        super(FlowLayout.class, DataSource.asset(BangbooMod.id("meow")));

    }


    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent.childById(ButtonComponent.class, "the-button").onPress(button -> {
            System.out.println("click");
        });
    }
}