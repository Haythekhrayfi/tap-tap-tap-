package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2072x implements C2097y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f17813a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17814b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f17815a;

        public a(Activity activity) {
            this.f17815a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2072x.this.a(this.f17815a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x$b */
    public interface b {
        void a(Activity activity);
    }

    public C2072x(C2097y c2097y, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f17814b = interfaceExecutorC1966sn;
        c2097y.a(this, new C2097y.a[0]);
    }

    public void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f17813a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // com.yandex.metrica.impl.ob.C2097y.b
    public void a(Activity activity, C2097y.a aVar) {
        ((C1941rn) this.f17814b).execute(new a(activity));
    }

    public synchronized void a(b bVar) {
        this.f17813a.add(bVar);
    }
}
