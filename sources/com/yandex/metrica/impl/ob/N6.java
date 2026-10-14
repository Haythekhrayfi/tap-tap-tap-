package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class N6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L6 f14531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M6 f14532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f14533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I6 f14534e;

    public class a implements L6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O6 f14535a;

        public a(O6 o10) {
            this.f14535a = o10;
        }
    }

    public static class b {
    }

    public N6(Context context, L6 l10, M6 m10, b bVar, I6 i10) {
        this.f14530a = context;
        this.f14531b = l10;
        this.f14532c = m10;
        this.f14533d = bVar;
        this.f14534e = i10;
    }

    public N6(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, H6 h10) {
        this(context, interfaceExecutorC1966sn, h10, new M6(context));
    }

    private N6(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, H6 h10, M6 m10) {
        this(context, new L6(interfaceExecutorC1966sn, h10), m10, new b(), new I6());
    }

    private void a(Qi qi) {
        if (qi.W() != null) {
            boolean z10 = qi.W().f13905b;
            Long lA = this.f14534e.a(qi.W().f13906c);
            if (!qi.f().f17344i || lA == null || lA.longValue() <= 0) {
                this.f14531b.a();
            } else {
                this.f14531b.a(lA.longValue(), z10);
            }
        }
    }

    public void a() {
        b bVar = this.f14533d;
        Context context = this.f14530a;
        Objects.requireNonNull(bVar);
        a(new Qi.b(context).a());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    public void a(O6 o10) {
        b bVar = this.f14533d;
        Context context = this.f14530a;
        Objects.requireNonNull(bVar);
        Qi qiA = new Qi.b(context).a();
        if (qiA.W() != null) {
            long j10 = qiA.W().f13904a;
            if (j10 > 0) {
                this.f14532c.a(this.f14530a.getPackageName());
                this.f14531b.a(j10, new a(o10));
            } else if (o10 != null) {
                o10.a();
            }
        } else if (o10 != null) {
            o10.a();
        }
        a(qiA);
    }
}
