package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.Xj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static <T extends com.applovin.exoplayer2.g> SparseArray<T> a(com.applovin.exoplayer2.g.a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        Xj.a aVar2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            aVar2.put(sparseArray.keyAt(i10), aVar.fromBundle(sparseArray.valueAt(i10)));
        }
        return aVar2;
    }

    public static <T extends com.applovin.exoplayer2.g> com.applovin.exoplayer2.common.a.s<T> a(com.applovin.exoplayer2.g.a<T> aVar, List<Bundle> list) {
        com.applovin.exoplayer2.common.a.s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarI.a(aVar.fromBundle((Bundle) a.b(list.get(i10))));
        }
        return aVarI.a();
    }

    public static <T extends com.applovin.exoplayer2.g> T a(com.applovin.exoplayer2.g.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) aVar.fromBundle(bundle);
    }

    public static <T extends com.applovin.exoplayer2.g> List<T> a(com.applovin.exoplayer2.g.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) ai.a(c.class.getClassLoader()));
        }
    }
}
