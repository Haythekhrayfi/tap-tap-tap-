package dd;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Iterable<Object>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f28949c;

    public l(g gVar) {
        this.f28949c = gVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f28949c.iterator();
    }
}
