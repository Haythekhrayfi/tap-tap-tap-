package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2101y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f17886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f17888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f17889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.metrica.billing_interface.a f17890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1992u f17891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1967t f17892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E f17893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2076x3 f17894i;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y3$a */
    public class a implements E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.E.b
        public void a(E.a aVar) {
            C2101y3.a(C2101y3.this, aVar);
        }
    }

    public C2101y3(Context context, Executor executor, Executor executor2, com.yandex.metrica.billing_interface.a aVar, InterfaceC1992u interfaceC1992u, InterfaceC1967t interfaceC1967t, E e10, C2076x3 c2076x3) {
        this.f17887b = context;
        this.f17888c = executor;
        this.f17889d = executor2;
        this.f17890e = aVar;
        this.f17891f = interfaceC1992u;
        this.f17892g = interfaceC1967t;
        this.f17893h = e10;
        this.f17894i = c2076x3;
    }

    public static void a(C2101y3 c2101y3, E.a aVar) {
        Objects.requireNonNull(c2101y3);
        if (aVar == E.a.VISIBLE) {
            try {
                r rVar = c2101y3.f17886a;
                if (rVar != null) {
                    rVar.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void a(Qi qi) {
        r rVar;
        synchronized (this) {
            rVar = this.f17886a;
        }
        if (rVar != null) {
            rVar.a(qi.c());
        }
    }

    public void a(Qi qi, Boolean bool) {
        r rVarA;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                rVarA = this.f17894i.a(this.f17887b, this.f17888c, this.f17889d, this.f17890e, this.f17891f, this.f17892g);
                this.f17886a = rVarA;
            }
            rVarA.a(qi.c());
            if (this.f17893h.a(new a()) == E.a.VISIBLE) {
                try {
                    r rVar = this.f17886a;
                    if (rVar != null) {
                        rVar.b();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
