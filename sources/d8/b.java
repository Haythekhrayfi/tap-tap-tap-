package d8;

import fd.j0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.j f28852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.e f28853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, a> f28854c;

    public b(p7.j jVar, q8.e eVar) {
        j0.i(jVar, "divActionHandler");
        j0.i(eVar, "errorCollectors");
        this.f28852a = jVar;
        this.f28853b = eVar;
        this.f28854c = Collections.synchronizedMap(new LinkedHashMap());
    }
}
