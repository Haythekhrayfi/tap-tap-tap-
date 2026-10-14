package l9;

import android.view.View;
import fd.j0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, f<? extends View>> f33033a = new ConcurrentHashMap<>();

    @Override // l9.g
    public <T extends View> void a(String str, f<T> fVar, int i10) {
        this.f33033a.put(str, fVar);
    }

    @Override // l9.g
    public <T extends View> T b(String str) {
        j0.i(str, "tag");
        ConcurrentHashMap<String, f<? extends View>> concurrentHashMap = this.f33033a;
        j0.i(concurrentHashMap, "<this>");
        f<? extends View> fVar = concurrentHashMap.get(str);
        if (fVar != null) {
            return (T) fVar.a();
        }
        throw new NoSuchElementException((String) null);
    }
}
