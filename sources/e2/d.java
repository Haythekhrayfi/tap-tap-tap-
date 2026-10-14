package e2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28979f = m.e("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.a f28980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28982c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<c2.a<T>> f28983d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f28984e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f28985c;

        public a(List list) {
            this.f28985c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f28985c.iterator();
            while (it.hasNext()) {
                ((c2.a) it.next()).a(d.this.f28984e);
            }
        }
    }

    public d(Context context, j2.a aVar) {
        this.f28981b = context.getApplicationContext();
        this.f28980a = aVar;
    }

    public abstract T a();

    public void b(c2.a<T> aVar) {
        synchronized (this.f28982c) {
            if (this.f28983d.remove(aVar) && this.f28983d.isEmpty()) {
                e();
            }
        }
    }

    public void c(T t10) {
        synchronized (this.f28982c) {
            T t11 = this.f28984e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f28984e = t10;
                ((j2.b) this.f28980a).f31697c.execute(new a(new ArrayList(this.f28983d)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
