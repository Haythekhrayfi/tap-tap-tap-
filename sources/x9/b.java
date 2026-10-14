package x9;

import fd.j0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<h<String, String>, String> f37575a = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f37576b = Collections.synchronizedMap(new LinkedHashMap());

    @Override // x9.a
    public String a(String str, String str2) {
        return this.f37575a.get(new h(str, str2));
    }

    @Override // x9.a
    public void b(String str, String str2, String str3) {
        Map<h<String, String>, String> map = this.f37575a;
        j0.h(map, "states");
        map.put(new h<>(str, str2), str3);
    }

    @Override // x9.a
    public void c(String str, String str2) {
        j0.i(str, "cardId");
        j0.i(str2, "state");
        Map<String, String> map = this.f37576b;
        j0.h(map, "rootStates");
        map.put(str, str2);
    }

    @Override // x9.a
    public String d(String str) {
        j0.i(str, "cardId");
        return this.f37576b.get(str);
    }
}
