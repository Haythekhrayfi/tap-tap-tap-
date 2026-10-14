package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1916qm<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f17187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Y1<T>> f17189c = new ArrayList();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qm$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y1 f17190a;

        public a(Y1 y10) {
            this.f17190a = y10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1916qm.this) {
                Object obj = C1916qm.this.f17187a;
                if (obj == null) {
                    C1916qm.this.f17189c.add(this.f17190a);
                } else {
                    this.f17190a.b(obj);
                }
            }
        }
    }

    public C1916qm(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f17188b = interfaceExecutorC1966sn;
    }

    public void a(Y1<T> y10) {
        ((C1941rn) this.f17188b).execute(new a(y10));
    }

    public synchronized void a(T t10) {
        this.f17187a = t10;
        Iterator<Y1<T>> it = this.f17189c.iterator();
        while (it.hasNext()) {
            it.next().b(t10);
        }
        this.f17189c.clear();
    }
}
