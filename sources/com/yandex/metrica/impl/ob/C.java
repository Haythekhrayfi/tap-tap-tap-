package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class C implements C2097y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Y1<C1918r0>> f13744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C1918r0 f13745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2097y f13746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f13747d;

    public class a implements Y1<C1918r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13748a;

        public a(C c10, String str) {
            this.f13748a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Y1
        public void b(C1918r0 c1918r0) {
            c1918r0.b(this.f13748a);
        }
    }

    public C(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(interfaceExecutorC1966sn, Y.g().b());
    }

    public C(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2097y c2097y) {
        this.f13744a = new ArrayList();
        this.f13745b = null;
        this.f13747d = interfaceExecutorC1966sn;
        this.f13746c = c2097y;
    }

    public void a() {
        this.f13746c.a(this, C2097y.a.CREATED);
    }

    @Override // com.yandex.metrica.impl.ob.C2097y.b
    public void a(Activity activity, C2097y.a aVar) {
        Intent intent;
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
                intent = null;
            }
        } else {
            intent = null;
        }
        String dataString = intent != null ? intent.getDataString() : null;
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        a aVar2 = new a(this, dataString);
        synchronized (this) {
            C1918r0 c1918r0 = this.f13745b;
            if (c1918r0 == null) {
                this.f13744a.add(aVar2);
            } else {
                ((C1941rn) this.f13747d).execute(new B(this, aVar2, c1918r0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c A[LOOP:0: B:9:0x0016->B:11:0x001c, LOOP_END] */
    public void a(C1918r0 c1918r0) {
        ArrayList arrayList;
        Iterator it;
        synchronized (this) {
            this.f13745b = c1918r0;
            synchronized (this) {
                arrayList = new ArrayList(this.f13744a);
                this.f13744a.clear();
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((Y1) it.next()).b(c1918r0);
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            ((Y1) it.next()).b(c1918r0);
        }
    }
}
