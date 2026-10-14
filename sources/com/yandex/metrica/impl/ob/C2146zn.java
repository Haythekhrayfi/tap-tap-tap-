package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2146zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2121yn f18053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Executor f18055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile C1941rn f18058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f18063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile Executor f18064l;

    public C2146zn() {
        this(new C2121yn());
    }

    public C2146zn(C2121yn c2121yn) {
        this.f18053a = c2121yn;
    }

    public InterfaceExecutorC1966sn a() {
        if (this.f18059g == null) {
            synchronized (this) {
                if (this.f18059g == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18059g = new C1941rn("YMM-CSE");
                }
            }
        }
        return this.f18059g;
    }

    public C2046vn a(Runnable runnable) {
        Objects.requireNonNull(this.f18053a);
        return ThreadFactoryC2071wn.a("YMM-HMSR", runnable);
    }

    public InterfaceExecutorC1966sn b() {
        if (this.f18062j == null) {
            synchronized (this) {
                if (this.f18062j == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18062j = new C1941rn("YMM-DE");
                }
            }
        }
        return this.f18062j;
    }

    public C2046vn b(Runnable runnable) {
        Objects.requireNonNull(this.f18053a);
        return ThreadFactoryC2071wn.a("YMM-IB", runnable);
    }

    public C1941rn c() {
        if (this.f18058f == null) {
            synchronized (this) {
                if (this.f18058f == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18058f = new C1941rn("YMM-UH-1");
                }
            }
        }
        return this.f18058f;
    }

    public InterfaceExecutorC1966sn d() {
        if (this.f18054b == null) {
            synchronized (this) {
                if (this.f18054b == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18054b = new C1941rn("YMM-MC");
                }
            }
        }
        return this.f18054b;
    }

    public InterfaceExecutorC1966sn e() {
        if (this.f18060h == null) {
            synchronized (this) {
                if (this.f18060h == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18060h = new C1941rn("YMM-CTH");
                }
            }
        }
        return this.f18060h;
    }

    public InterfaceExecutorC1966sn f() {
        if (this.f18056d == null) {
            synchronized (this) {
                if (this.f18056d == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18056d = new C1941rn("YMM-MSTE");
                }
            }
        }
        return this.f18056d;
    }

    public InterfaceExecutorC1966sn g() {
        if (this.f18063k == null) {
            synchronized (this) {
                if (this.f18063k == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18063k = new C1941rn("YMM-RTM");
                }
            }
        }
        return this.f18063k;
    }

    public InterfaceExecutorC1966sn h() {
        if (this.f18061i == null) {
            synchronized (this) {
                if (this.f18061i == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18061i = new C1941rn("YMM-SDCT");
                }
            }
        }
        return this.f18061i;
    }

    public Executor i() {
        if (this.f18055c == null) {
            synchronized (this) {
                if (this.f18055c == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18055c = new An();
                }
            }
        }
        return this.f18055c;
    }

    public InterfaceExecutorC1966sn j() {
        if (this.f18057e == null) {
            synchronized (this) {
                if (this.f18057e == null) {
                    Objects.requireNonNull(this.f18053a);
                    this.f18057e = new C1941rn("YMM-TP");
                }
            }
        }
        return this.f18057e;
    }

    public Executor k() {
        if (this.f18064l == null) {
            synchronized (this) {
                if (this.f18064l == null) {
                    C2121yn c2121yn = this.f18053a;
                    Objects.requireNonNull(c2121yn);
                    this.f18064l = new ExecutorC2096xn(c2121yn, new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.f18064l;
    }
}
