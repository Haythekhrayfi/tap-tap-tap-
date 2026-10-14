package c8;

import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Map<String, String>> f3639a = new LinkedHashMap();

    public final void a(String str, String str2, String str3) {
        j0.i(str3, "stateId");
        synchronized (this.f3639a) {
            Map<String, Map<String, String>> map = this.f3639a;
            Map<String, String> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(str2, str3);
        }
    }
}
