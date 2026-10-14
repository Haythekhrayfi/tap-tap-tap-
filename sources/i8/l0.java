package i8;

import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Integer> f31383a = new q.a();

    public final int a(String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.f31383a;
        Integer numValueOf = map.get(str);
        if (numValueOf == null) {
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            numValueOf = Integer.valueOf(p0.e0.e.a());
            map.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
