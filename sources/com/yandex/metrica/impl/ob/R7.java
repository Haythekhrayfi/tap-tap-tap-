package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<S7> f14853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final J7 f14854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private S7 f14857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L0 f14858h;

    public R7(Context context, U3 u10) {
        this(context, U2.a(21) ? Arrays.asList(new C1703i8(context, u10), new W7()) : Collections.singletonList(new W7()), new L0(), new J7());
    }

    public R7(Context context, List<S7> list, L0 l10, J7 j10) {
        this.f14852b = context;
        this.f14853c = list;
        this.f14858h = l10;
        this.f14854d = j10;
    }

    private synchronized void a() {
        S7 next;
        if (!this.f14856f) {
            synchronized (this) {
                Iterator<S7> it = this.f14853c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    J7 j10 = this.f14854d;
                    String strC = next.c();
                    Objects.requireNonNull(j10);
                    System.loadLibrary(strC);
                    break;
                }
                this.f14857g = next;
                if (next != null) {
                    try {
                        next.a(false);
                    } catch (Throwable unused) {
                    }
                    this.f14851a = this.f14858h.b(this.f14852b, this.f14857g.a());
                }
            }
        }
        this.f14856f = true;
    }

    public void a(String str) {
        S7 s10 = this.f14857g;
        if (s10 != null) {
            s10.a(str);
        }
    }

    public synchronized void a(boolean z10, String str, String str2) {
        String str3;
        try {
            if (z10) {
                synchronized (this) {
                    try {
                        a();
                        synchronized (this) {
                            S7 s10 = this.f14857g;
                            if ((s10 != null) && (str3 = this.f14851a) != null && !this.f14855e) {
                                s10.a(str, str3, str2);
                                this.f14855e = true;
                            }
                        }
                    } catch (Throwable unused) {
                        this.f14855e = false;
                    }
                }
            }
            synchronized (this) {
                try {
                    synchronized (this) {
                        S7 s11 = this.f14857g;
                        if ((s11 != null) && this.f14855e) {
                            s11.b();
                        }
                        this.f14855e = false;
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
