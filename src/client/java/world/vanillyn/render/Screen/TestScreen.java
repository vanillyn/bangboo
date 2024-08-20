package world.vanillyn.render.Screen;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;


public class TestScreen extends BaseOwoScreen<FlowLayout> {

    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }

    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent.surface(Surface.VANILLA_TRANSLUCENT).alignment(HorizontalAlignment.CENTER, VerticalAlignment.CENTER);
        rootComponent.child(
                Containers.verticalFlow(Sizing.content(), Sizing.content())
                        .child(Components.button(Text.literal("meow"), button -> {
                            System.out.println("warning, button is clicked");
                        }))
                        .padding(Insets.of(10))
                        .surface(Surface.PANEL)
                        .alignment(HorizontalAlignment.CENTER, VerticalAlignment.CENTER)
        );
    }
}
