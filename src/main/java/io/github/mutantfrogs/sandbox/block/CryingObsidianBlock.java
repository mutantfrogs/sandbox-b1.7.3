package io.github.mutantfrogs.sandbox.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class CryingObsidianBlock extends TemplateBlock {
    public CryingObsidianBlock(Identifier identifier) {
        super(identifier, Material.METAL);
    }
}
