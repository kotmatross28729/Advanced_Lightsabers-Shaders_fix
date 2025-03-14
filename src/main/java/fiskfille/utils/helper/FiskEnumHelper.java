package fiskfille.utils.helper;

import net.minecraftforge.common.util.EnumHelper;

import fiskfille.utils.common.damage.IExtendedDamage.DamageType;
import fiskfille.utils.common.damage.IExtendedDamage.DamageTypeCallback;

public class FiskEnumHelper extends EnumHelper {

    private static Class[][] commonTypes = { { DamageType.class, DamageTypeCallback.class } };

    public static DamageType addDamageType(String name, DamageTypeCallback callback) {
        return addEnum(DamageType.class, name, callback);
    }

    public static DamageType addDamageType(String name) {
        return addDamageType(name, new DamageTypeCallback.Impl());
    }

    public static <T extends Enum<?>> T addEnum(Class<T> enumType, String enumName, Object... paramValues) {
        return addEnum(commonTypes, enumType, enumName, paramValues);
    }
}
