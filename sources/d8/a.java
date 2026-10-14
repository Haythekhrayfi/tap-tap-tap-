package d8;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8.d f28847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, j> f28848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f28849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f28850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i8.k f28851e;

    public a(q8.d dVar) {
        j0.i(dVar, "errorCollector");
        this.f28847a = dVar;
        this.f28848b = new LinkedHashMap();
        this.f28849c = new LinkedHashSet();
    }

    public final void a(j jVar) {
        String str = jVar.f28889a.f43581c;
        if (this.f28848b.containsKey(str)) {
            return;
        }
        this.f28848b.put(str, jVar);
    }

    public final j b(String str) {
        j0.i(str, FacebookMediationAdapter.KEY_ID);
        if (this.f28849c.contains(str)) {
            return this.f28848b.get(str);
        }
        return null;
    }

    public final void c(i8.k kVar) {
        if (j0.d(this.f28851e, kVar)) {
            for (j jVar : this.f28848b.values()) {
                jVar.f28893e = null;
                jVar.f28898j.h();
                jVar.f28897i = true;
            }
            Timer timer = this.f28850d;
            if (timer != null) {
                timer.cancel();
            }
            this.f28850d = null;
        }
    }
}
