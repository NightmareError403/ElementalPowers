package com.projectkorra.projectkorra.ability.legacy;

import com.projectkorra.projectkorra.ability.Ability;
import com.projectkorra.projectkorra.ability.info.AbilityInfo;
import com.projectkorra.projectkorra.configuration.configs.abilities.AbilityConfig;
import org.bukkit.entity.Player;

public abstract class SandAbility<Info extends AbilityInfo, C extends AbilityConfig> extends EarthAbility<Info, C> implements SubAbility {

	public SandAbility(final Player player) {
		super(player);
	}

	@Override
	public Class<? extends Ability> getParentAbility() {
		return EarthAbility.class;
	}
}