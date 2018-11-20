package org.crown.emuns;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <p>
 * 用户状态枚举
 * </p>
 *
 * @author Caratacus
 */
public enum UserStatusEnum implements IEnum {

    NOMAL(0), DISABLE(1);

    @EnumValue
    private final int value;

    UserStatusEnum(final int value) {
        this.value = value;
    }

    @JsonValue
    public int value() {
        return this.value;
    }

    @Override
    public int getValue() {
        return value();
    }
}
