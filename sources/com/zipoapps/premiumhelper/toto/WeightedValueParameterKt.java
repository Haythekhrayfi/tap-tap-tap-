package com.zipoapps.premiumhelper.toto;

import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class WeightedValueParameterKt {
    public static final List<WeightedValueParameter> asWeightedParamsList(Map<String, ? extends Map<String, Integer>> map) {
        j0.i(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Map<String, Integer>> entry : map.entrySet()) {
            arrayList.add(new WeightedValueParameter(entry.getKey(), entry.getValue()));
        }
        return t.H(arrayList);
    }
}
