package world.vanillyn.render.screen.bangboo;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.container.FlowLayout;
import world.vanillyn.BangbooMod;

public class ManageBangboo extends BaseUIModelScreen<FlowLayout> {
    public ManageBangboo() {
        super(FlowLayout.class, DataSource.asset(BangbooMod.id("screen/manage_bangboo.xml")));
    }

    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent.childById(ButtonComponent.class, "Remove Bangboo!").onPress(button -> {
            System.out.println("click");
        });
    }
}
