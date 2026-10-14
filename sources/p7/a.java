package p7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f34465c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34466d;

    @Override // p7.d, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        Iterator<T> it = this.f34465c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).close();
        }
        this.f34465c.clear();
        this.f34466d = true;
    }
}
