package io.github.mutantfrogs.sandbox.block;

import io.github.mutantfrogs.sandbox.Sandbox;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

import java.util.Random;

public class CryingObsidianBlock extends TemplateBlock {
    public CryingObsidianBlock(Identifier identifier) {
        super(identifier, Material.STONE);
    }

    public int getDroppedItemId(int blockMeta, Random random) {
        return Sandbox.cryingObsidianBlock.id;
    }
}
