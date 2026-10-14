package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import fd.j0;
import java.util.Iterator;
import java.util.Map;
import kc.t;
import zc.c;

/* JADX INFO: loaded from: classes3.dex */
public final class WeightedValueParameter {
    private final String name;
    private final Map<String, Integer> weighted_values;

    public WeightedValueParameter(String str, Map<String, Integer> map) {
        j0.i(str, "name");
        j0.i(map, "weighted_values");
        this.name = str;
        this.weighted_values = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightedValueParameter copy$default(WeightedValueParameter weightedValueParameter, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = weightedValueParameter.name;
        }
        if ((i10 & 2) != 0) {
            map = weightedValueParameter.weighted_values;
        }
        return weightedValueParameter.copy(str, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, Integer> component2() {
        return this.weighted_values;
    }

    public final WeightedValueParameter copy(String str, Map<String, Integer> map) {
        j0.i(str, "name");
        j0.i(map, "weighted_values");
        return new WeightedValueParameter(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeightedValueParameter)) {
            return false;
        }
        WeightedValueParameter weightedValueParameter = (WeightedValueParameter) obj;
        return j0.d(this.name, weightedValueParameter.name) && j0.d(this.weighted_values, weightedValueParameter.weighted_values);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Integer> getWeighted_values() {
        return this.weighted_values;
    }

    public final int hash() {
        return this.weighted_values.hashCode();
    }

    public int hashCode() {
        return this.weighted_values.hashCode() + (this.name.hashCode() * 31);
    }

    public final String pickRandomValue() {
        Object key;
        if (this.weighted_values.size() != 1) {
            c.a aVar = c.f45275c;
            Iterator<T> it = this.weighted_values.values().iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue += ((Number) it.next()).intValue();
            }
            int iD = aVar.d(0, iIntValue);
            for (Map.Entry<String, Integer> entry : this.weighted_values.entrySet()) {
                iD -= entry.getValue().intValue();
                if (iD < 0) {
                    key = entry.getKey();
                }
            }
            throw new IllegalStateException("Should never get here!");
        }
        key = t.q(this.weighted_values.keySet());
        return (String) key;
    }

    public String toString() {
        StringBuilder sbA = a.a("WeightedValueParameter(name=");
        sbA.append(this.name);
        sbA.append(", weighted_values=");
        sbA.append(this.weighted_values);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
