package world.vanillyn.render.Screen;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.LabelComponent;
import io.wispforest.owo.ui.container.FlowLayout;
import net.minecraft.text.Text;
import world.vanillyn.BangbooMod;
import net.minecraft.text.Text;


public class TestScreen extends BaseUIModelScreen<FlowLayout> {
//predefine name out of the scope of the function
 String name;
    public TestScreen(String bangbooName) {

        super(FlowLayout.class, DataSource.asset(BangbooMod.id("meow")));
        //after the super function was made we can easily overwrite the function outside with the data we moved with it, in this example i wrote the name of the entity! but it could be rly anything.
        name = bangbooName;

    }

    //this is another example on how to read buttons and write stuff into the text! the id's come from the xml
    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent.childById(ButtonComponent.class, "pickup").onPress(button -> {
            rootComponent.childById(LabelComponent.class, "atk").text(Text.of(name));
        });
    }
}