package u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<x3.b> f35992a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x3.b> f35993b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35994c;

    public final boolean a(x3.b bVar, boolean z10) {
        boolean z11 = true;
        if (bVar == null) {
            return true;
        }
        boolean zRemove = this.f35992a.remove(bVar);
        if (!this.f35993b.remove(bVar) && !zRemove) {
            z11 = false;
        }
        if (z11) {
            bVar.clear();
            if (z10) {
                bVar.a();
            }
        }
        return z11;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f35992a.size() + ", isPaused=" + this.f35994c + "}";
    }
}
