package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, l0> f2242a = new HashMap<>();

    public final void a() {
        Iterator<l0> it = this.f2242a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f2242a.clear();
    }
}
