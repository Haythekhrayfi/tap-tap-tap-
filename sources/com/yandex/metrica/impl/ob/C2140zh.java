package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2140zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceExecutorC1966sn f18027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q9<Eh> f18028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f18029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1530ba f18030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Qd f18031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Nm f18032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rd f18033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f18034h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zh$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2115yh f18035a;

        public a(C2115yh c2115yh) {
            this.f18035a = c2115yh;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2140zh c2140zh = C2140zh.this;
            C2140zh.a(c2140zh, this.f18035a, c2140zh.f18034h);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zh$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Ih f18037a;

        public b() {
            this(new Ih());
        }

        public b(Ih ih) {
            this.f18037a = ih;
        }

        public List<Hh> a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (U2.a(bArr)) {
                return arrayList;
            }
            try {
                return this.f18037a.a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }
    }

    public C2140zh(Context context, String str, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(null, Ma.b.a(Eh.class).a(context), new b(), new Qd(), interfaceExecutorC1966sn, new C1530ba(), new Nm(), new Rd(context));
    }

    public C2140zh(String str, Q9 q10, b bVar, Qd qd2, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1530ba c1530ba, Nm nm, Rd rd2) {
        this.f18034h = str;
        this.f18028b = q10;
        this.f18029c = bVar;
        this.f18031e = qd2;
        this.f18027a = interfaceExecutorC1966sn;
        this.f18030d = c1530ba;
        this.f18032f = nm;
        this.f18033g = rd2;
    }

    public static void a(C2140zh c2140zh, C2115yh c2115yh, String str) {
        if (!c2140zh.f18033g.a() || str == null) {
            return;
        }
        c2140zh.f18031e.a(str, new Ah(c2140zh, (Eh) c2140zh.f18028b.b(), c2115yh));
    }

    public void a(Qi qi) {
        if (qi != null) {
            this.f18034h = qi.L();
        }
    }

    public void a(C2115yh c2115yh) {
        ((C1941rn) this.f18027a).execute(new a(c2115yh));
    }

    public boolean b(Qi qi) {
        String str = this.f18034h;
        String strL = qi.L();
        if (str == null) {
            return strL != null;
        }
        return !str.equals(strL);
    }
}
