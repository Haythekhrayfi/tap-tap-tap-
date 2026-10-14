package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mw0<T> implements Comparable<mw0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ci1.a f23156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f23160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private gx0.a f23161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f23162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private xw0 f23163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private lo f23167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private eg.a f23168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f23169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f23170o;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f23171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f23172c;

        public a(String str, long j10) {
            this.f23171b = str;
            this.f23172c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mw0.this.f23156a.a(this.f23171b, this.f23172c);
            mw0.this.f23156a.a(mw0.this.toString());
        }
    }

    public interface b {
    }

    public mw0(int i10, String str, gx0.a aVar) {
        this.f23156a = ci1.a.f19512c ? new ci1.a() : null;
        this.f23160e = new Object();
        this.f23164i = true;
        this.f23165j = false;
        this.f23166k = false;
        this.f23168m = null;
        this.f23157b = i10;
        this.f23158c = str;
        this.f23161f = aVar;
        a(new lo());
        this.f23159d = b(str);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public static String c() {
        return fn1.a("application/x-www-form-urlencoded; charset=", "UTF-8");
    }

    public abstract gx0<T> a(wm0 wm0Var);

    public void a() {
        synchronized (this.f23160e) {
            this.f23165j = true;
            this.f23161f = null;
        }
    }

    public final void a(int i10) {
        xw0 xw0Var = this.f23163h;
        if (xw0Var != null) {
            xw0Var.a(this, i10);
        }
    }

    public final void a(bi1 bi1Var) {
        gx0.a aVar;
        synchronized (this.f23160e) {
            aVar = this.f23161f;
        }
        if (aVar != null) {
            aVar.a(bi1Var);
        }
    }

    public final void a(eg.a aVar) {
        this.f23168m = aVar;
    }

    public final void a(gx0<?> gx0Var) {
        b bVar;
        synchronized (this.f23160e) {
            bVar = this.f23170o;
        }
        if (bVar != null) {
            ((ni1) bVar).a(this, gx0Var);
        }
    }

    public final void a(lo loVar) {
        this.f23167l = loVar;
    }

    public final void a(b bVar) {
        synchronized (this.f23160e) {
            this.f23170o = bVar;
        }
    }

    public final void a(xw0 xw0Var) {
        this.f23163h = xw0Var;
    }

    public abstract void a(T t10);

    public final void a(String str) {
        if (ci1.a.f19512c) {
            this.f23156a.a(str, Thread.currentThread().getId());
        }
    }

    public bi1 b(bi1 bi1Var) {
        return bi1Var;
    }

    public final void b(int i10) {
        this.f23162g = Integer.valueOf(i10);
    }

    public final void b(Object obj) {
        this.f23169n = obj;
    }

    public byte[] b() throws fc {
        return null;
    }

    public final void c(String str) {
        xw0 xw0Var = this.f23163h;
        if (xw0Var != null) {
            xw0Var.b(this);
        }
        if (ci1.a.f19512c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.f23156a.a(str, id2);
                this.f23156a.a(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mw0 mw0Var = (mw0) obj;
        int iH = h();
        int iH2 = mw0Var.h();
        return iH == iH2 ? this.f23162g.intValue() - mw0Var.f23162g.intValue() : a6.a(iH2) - a6.a(iH);
    }

    public final eg.a d() {
        return this.f23168m;
    }

    public final String e() {
        String strM = m();
        int i10 = this.f23157b;
        if (i10 == 0 || i10 == -1) {
            return strM;
        }
        return Integer.toString(i10) + CoreConstants.DASH_CHAR + strM;
    }

    public Map<String, String> f() throws fc {
        return Collections.emptyMap();
    }

    public final int g() {
        return this.f23157b;
    }

    public int h() {
        return 2;
    }

    public final lo i() {
        return this.f23167l;
    }

    public final Object j() {
        return this.f23169n;
    }

    public final int k() {
        return this.f23167l.b();
    }

    public final int l() {
        return this.f23159d;
    }

    public String m() {
        return this.f23158c;
    }

    public final boolean n() {
        boolean z10;
        synchronized (this.f23160e) {
            z10 = this.f23166k;
        }
        return z10;
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f23160e) {
            z10 = this.f23165j;
        }
        return z10;
    }

    public final void p() {
        synchronized (this.f23160e) {
            this.f23166k = true;
        }
    }

    public final void q() {
        b bVar;
        synchronized (this.f23160e) {
            bVar = this.f23170o;
        }
        if (bVar != null) {
            ((ni1) bVar).b(this);
        }
    }

    public final void r() {
        this.f23164i = false;
    }

    public final boolean s() {
        return this.f23164i;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("0x");
        sbA.append(Integer.toHexString(this.f23159d));
        String string = sbA.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o() ? "[X] " : "[ ] ");
        sb2.append(m());
        sb2.append(" ");
        sb2.append(string);
        sb2.append(" ");
        sb2.append(ow0.a(h()));
        sb2.append(" ");
        sb2.append(this.f23162g);
        return sb2.toString();
    }
}
