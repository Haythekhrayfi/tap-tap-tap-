package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J4 f13788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<C4, E4> f13789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Zm<a, C4> f13790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f13791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f13792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G4 f13793g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Integer f13795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f13796c;

        public a(String str, Integer num, String str2) {
            this.f13794a = str;
            this.f13795b = num;
            this.f13796c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f13794a.equals(aVar.f13794a)) {
                return false;
            }
            Integer num = this.f13795b;
            if (num == null ? aVar.f13795b != null : !num.equals(aVar.f13795b)) {
                return false;
            }
            String str = this.f13796c;
            String str2 = aVar.f13796c;
            if (str != null) {
                return str.equals(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            int iHashCode = this.f13794a.hashCode() * 31;
            Integer num = this.f13795b;
            int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f13796c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public D4(Context context, J4 j10) {
        this(context, j10, new G4());
    }

    public D4(Context context, J4 j10, G4 g10) {
        this.f13787a = new Object();
        this.f13789c = new HashMap<>();
        this.f13790d = new Zm<>();
        this.f13792f = 0;
        this.f13791e = context.getApplicationContext();
        this.f13788b = j10;
        this.f13793g = g10;
    }

    public E4 a(C4 c10, X3 x10) {
        E4 e4A;
        synchronized (this.f13787a) {
            e4A = this.f13789c.get(c10);
            if (e4A == null) {
                e4A = this.f13793g.a(c10).a(this.f13791e, this.f13788b, c10, x10);
                this.f13789c.put(c10, e4A);
                this.f13790d.a(new a(c10.b(), c10.c(), c10.d()), c10);
                this.f13792f++;
            }
        }
        return e4A;
    }

    public void a(String str, int i10, String str2) {
        Integer numValueOf = Integer.valueOf(i10);
        synchronized (this.f13787a) {
            Collection<C4> collectionB = this.f13790d.b(new a(str, numValueOf, str2));
            if (!U2.b(collectionB)) {
                this.f13792f -= collectionB.size();
                ArrayList arrayList = new ArrayList(collectionB.size());
                Iterator<C4> it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f13789c.remove(it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((E4) it2.next()).a();
                }
            }
        }
    }
}
