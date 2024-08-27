package world.vanillyn.data.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;

public class Ether extends DamageSource {
    public final RegistryEntry<DamageType> type;
    public final Entity attacker;
    public Ether(RegistryEntry<DamageType> type, Entity attacker) {
        super(type);
        this.type = type;
        this.attacker = attacker;
    }

    @Override
    public String getName() {
        return "ether";
    }

    @Override
    public Text getDeathMessage(LivingEntity killed) {
        String key = "death.attack.bangboo" + this.getName();

        if (this.getAttacker() == null && this.getSource() == null) {
            ;
            return Text.translatable(killed + key);
        } else if (this.getAttacker() == null && this.getSource() != null) {
            String key2 = key + ".block";
            return Text.translatable(killed + key2);
        } else if (this.getAttacker() != null && this.getSource() == null) {
            String key2 = key + ".player";
            return Text.translatable(killed + key2 + this.getAttacker());
        }
        return Text.translatable(killed + key);
    }
}
