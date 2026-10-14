package q8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jc.w;
import uc.p;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<p<List<? extends Throwable>, List<? extends Throwable>, w>> f34807a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f34808b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Throwable> f34809c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Throwable> f34810d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Throwable> f34811e = new ArrayList();

    public void a(Throwable th) {
        this.f34808b.add(th);
        c();
    }

    public void b(Throwable th) {
        this.f34811e.add(th);
        c();
    }

    public final void c() {
        this.f34810d.clear();
        this.f34810d.addAll(this.f34809c);
        this.f34810d.addAll(this.f34808b);
        Iterator<T> it = this.f34807a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(this.f34810d, this.f34811e);
        }
    }
}
