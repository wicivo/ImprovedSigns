package com.craftycorvid.improvedSigns.loot.condition;

import com.mojang.serialization.Codec;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LootConditionTypes
{
    public static final LootConditionType SIGN_TEXT = new LootConditionType(Codec.unit(SignTextLootCondition.builder().build()));

    public static void register()
    {
        Registry.register(Registries.LOOT_CONDITION_TYPE, new Identifier("sign_text"), SIGN_TEXT);
    }
}
