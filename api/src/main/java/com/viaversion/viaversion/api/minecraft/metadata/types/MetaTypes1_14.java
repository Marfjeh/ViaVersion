/*
 * This file is part of ViaVersion - https://github.com/ViaVersion/ViaVersion
 * Copyright (C) 2016-2021 ViaVersion and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.viaversion.viaversion.api.minecraft.metadata.types;

import com.viaversion.viaversion.api.minecraft.metadata.MetaType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.minecraft.ParticleType;

public final class MetaTypes1_14 implements MetaTypes {

    private final MetaType[] values = new MetaType[19];
    public final MetaType byteType = add(0, Type.BYTE);
    public final MetaType varIntType = add(1, Type.VAR_INT);
    public final MetaType floatType = add(2, Type.FLOAT);
    public final MetaType stringType = add(3, Type.STRING);
    public final MetaType componentType = add(4, Type.COMPONENT);
    public final MetaType optionalComponentType = add(5, Type.OPTIONAL_COMPONENT);
    public final MetaType itemType = add(6, Type.FLAT_VAR_INT_ITEM);
    public final MetaType booleanType = add(7, Type.BOOLEAN);
    public final MetaType rotationType = add(8, Type.ROTATION);
    public final MetaType positionType = add(9, Type.POSITION1_14);
    public final MetaType optionalPositionType = add(10, Type.OPTIONAL_POSITION_1_14);
    public final MetaType directionType = add(11, Type.VAR_INT);
    public final MetaType optionalUUIDType = add(12, Type.OPTIONAL_UUID);
    public final MetaType blockStateType = add(13, Type.VAR_INT);
    public final MetaType nbtType = add(14, Type.NBT);
    public final MetaType particleType;
    public final MetaType villagerDatatType = add(16, Type.VILLAGER_DATA);
    public final MetaType optionalVarIntType = add(17, Type.OPTIONAL_VAR_INT);
    public final MetaType poseType = add(18, Type.VAR_INT);

    public MetaTypes1_14(final ParticleType particleType) {
        this.particleType = add(15, particleType);
    }

    @Override
    public MetaType byId(final int id) {
        return values[id];
    }

    @Override
    public MetaType[] values() {
        return values;
    }

    private MetaType add(final int typeId, final Type type) {
        final MetaType metaType = MetaType.create(typeId, type);
        values[typeId] = metaType;
        return metaType;
    }
}