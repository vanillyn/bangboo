package world.vanillyn.render.Screen;

import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.LabelComponent;
import io.wispforest.owo.ui.container.FlowLayout;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.bangboo.Bangboo;
import world.vanillyn.entity.data.BangbooEntityData;
import world.vanillyn.entity.data.bangboo.BangbooComponents;
import world.vanillyn.net.BangbooChannel;

import java.util.Optional;


public class TestScreen extends BaseUIModelScreen<FlowLayout> {

    Bangboo bangboo;
    String bangbooName;
    Item core;
    PlayerEntity player;

    public TestScreen(Bangboo bangboo, PlayerEntity player) {

        super(FlowLayout.class, DataSource.asset(BangbooMod.id("meow")));
        this.bangboo = bangboo;
        this.bangbooName = bangboo.getType().getName().getString();
        this.core = bangboo.type().coreItem();
        this.player = player;
    }

    //this is another example on how to read buttons and write stuff into the text! the id's come from the xml
    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent.childById(ButtonComponent.class, "pickup").onPress(button -> {
            BangbooChannel.SCREEN_CHANNEL.clientHandle().send(new BangbooChannel.DropBangboo(bangboo.getUuid()));
            close();
        });
        rootComponent.childById(LabelComponent.class, "hp").text(Text.of(String.valueOf(bangboo.getMaxHealth())));
    }
}