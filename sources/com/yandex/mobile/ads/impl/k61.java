package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k61 extends me implements Handler.Callback {
    private int A;
    private long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f22265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j61 f22266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k51 f22267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zv f22268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f22271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f22272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private yv f22273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private i51 f22274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l51 f22275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m51 f22276y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m51 f22277z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(j61 j61Var, Looper looper) {
        super(3);
        k51 k51Var = k51.f22256a;
        this.f22266o = (j61) pa.a(j61Var);
        this.f22265n = looper == null ? null : da1.a(looper, (Handler.Callback) this);
        this.f22267p = k51Var;
        this.f22268q = new zv();
        this.B = -9223372036854775807L;
    }

    private long y() {
        if (this.A == -1) {
            return RecyclerView.FOREVER_NS;
        }
        Objects.requireNonNull(this.f22276y);
        return this.A >= this.f22276y.a() ? RecyclerView.FOREVER_NS : this.f22276y.a(this.A);
    }

    private void z() {
        this.f22275x = null;
        this.A = -1;
        m51 m51Var = this.f22276y;
        if (m51Var != null) {
            m51Var.h();
            this.f22276y = null;
        }
        m51 m51Var2 = this.f22277z;
        if (m51Var2 != null) {
            m51Var2.h();
            this.f22277z = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qv0
    public final int a(yv yvVar) {
        if (((k51.a) this.f22267p).b(yvVar)) {
            return qv0.a(yvVar.E == 0 ? 4 : 2);
        }
        return qv0.a(te0.c(yvVar.f27115l) ? 1 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(long j10, long j11) throws zm {
        boolean z10;
        if (k()) {
            long j12 = this.B;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                z();
                this.f22270s = true;
            }
        }
        if (this.f22270s) {
            return;
        }
        if (this.f22277z == null) {
            i51 i51Var = this.f22274w;
            Objects.requireNonNull(i51Var);
            i51Var.a(j10);
            try {
                i51 i51Var2 = this.f22274w;
                Objects.requireNonNull(i51Var2);
                this.f22277z = i51Var2.a();
            } catch (j51 e10) {
                StringBuilder sbA = v60.a("Subtitle decoding failed. streamFormat=");
                sbA.append(this.f22273v);
                p90.a("TextRenderer", sbA.toString(), e10);
                List<am> listEmptyList = Collections.emptyList();
                Handler handler = this.f22265n;
                if (handler != null) {
                    handler.obtainMessage(0, listEmptyList).sendToTarget();
                } else {
                    this.f22266o.onCues(listEmptyList);
                    this.f22266o.a(new cm(listEmptyList));
                }
                z();
                i51 i51Var3 = this.f22274w;
                Objects.requireNonNull(i51Var3);
                i51Var3.release();
                this.f22274w = null;
                this.f22272u = 0;
                this.f22271t = true;
                k51 k51Var = this.f22267p;
                yv yvVar = this.f22273v;
                Objects.requireNonNull(yvVar);
                this.f22274w = ((k51.a) k51Var).a(yvVar);
                return;
            }
        }
        if (c() != 2) {
            return;
        }
        if (this.f22276y != null) {
            long jY = y();
            z10 = false;
            while (jY <= j10) {
                this.A++;
                jY = y();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        m51 m51Var = this.f22277z;
        if (m51Var != null) {
            if (m51Var.f()) {
                if (!z10 && y() == RecyclerView.FOREVER_NS) {
                    int i10 = this.f22272u;
                    z();
                    if (i10 == 2) {
                        i51 i51Var4 = this.f22274w;
                        Objects.requireNonNull(i51Var4);
                        i51Var4.release();
                        this.f22274w = null;
                        this.f22272u = 0;
                        this.f22271t = true;
                        k51 k51Var2 = this.f22267p;
                        yv yvVar2 = this.f22273v;
                        Objects.requireNonNull(yvVar2);
                        this.f22274w = ((k51.a) k51Var2).a(yvVar2);
                    } else {
                        this.f22270s = true;
                    }
                }
            } else if (m51Var.f19295b <= j10) {
                m51 m51Var2 = this.f22276y;
                if (m51Var2 != null) {
                    m51Var2.h();
                }
                this.A = m51Var.a(j10);
                this.f22276y = m51Var;
                this.f22277z = null;
                z10 = true;
            }
        }
        if (z10) {
            Objects.requireNonNull(this.f22276y);
            List<am> listB = this.f22276y.b(j10);
            Handler handler2 = this.f22265n;
            if (handler2 != null) {
                handler2.obtainMessage(0, listB).sendToTarget();
            } else {
                this.f22266o.onCues(listB);
                this.f22266o.a(new cm(listB));
            }
        }
        if (this.f22272u == 2) {
            return;
        }
        while (!this.f22269r) {
            try {
                l51 l51VarB = this.f22275x;
                if (l51VarB == null) {
                    i51 i51Var5 = this.f22274w;
                    Objects.requireNonNull(i51Var5);
                    l51VarB = i51Var5.b();
                    if (l51VarB == null) {
                        return;
                    } else {
                        this.f22275x = l51VarB;
                    }
                }
                if (this.f22272u == 1) {
                    l51VarB.d(4);
                    i51 i51Var6 = this.f22274w;
                    Objects.requireNonNull(i51Var6);
                    i51Var6.a(l51VarB);
                    this.f22275x = null;
                    this.f22272u = 2;
                    return;
                }
                int iA = a(this.f22268q, l51VarB, 0);
                if (iA == -4) {
                    if (l51VarB.f()) {
                        this.f22269r = true;
                        this.f22271t = false;
                    } else {
                        yv yvVar3 = this.f22268q.f27433b;
                        if (yvVar3 == null) {
                            return;
                        }
                        l51VarB.f22626i = yvVar3.f27119p;
                        l51VarB.h();
                        this.f22271t &= !l51VarB.g();
                    }
                    if (!this.f22271t) {
                        i51 i51Var7 = this.f22274w;
                        Objects.requireNonNull(i51Var7);
                        i51Var7.a(l51VarB);
                        this.f22275x = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (j51 e11) {
                StringBuilder sbA2 = v60.a("Subtitle decoding failed. streamFormat=");
                sbA2.append(this.f22273v);
                p90.a("TextRenderer", sbA2.toString(), e11);
                List<am> listEmptyList2 = Collections.emptyList();
                Handler handler3 = this.f22265n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, listEmptyList2).sendToTarget();
                } else {
                    this.f22266o.onCues(listEmptyList2);
                    this.f22266o.a(new cm(listEmptyList2));
                }
                z();
                i51 i51Var8 = this.f22274w;
                Objects.requireNonNull(i51Var8);
                i51Var8.release();
                this.f22274w = null;
                this.f22272u = 0;
                this.f22271t = true;
                k51 k51Var3 = this.f22267p;
                yv yvVar4 = this.f22273v;
                Objects.requireNonNull(yvVar4);
                this.f22274w = ((k51.a) k51Var3).a(yvVar4);
                return;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(long j10, boolean z10) {
        List<am> listEmptyList = Collections.emptyList();
        Handler handler = this.f22265n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f22266o.onCues(listEmptyList);
            this.f22266o.a(new cm(listEmptyList));
        }
        this.f22269r = false;
        this.f22270s = false;
        this.B = -9223372036854775807L;
        int i10 = this.f22272u;
        z();
        if (i10 == 0) {
            i51 i51Var = this.f22274w;
            Objects.requireNonNull(i51Var);
            i51Var.flush();
            return;
        }
        i51 i51Var2 = this.f22274w;
        Objects.requireNonNull(i51Var2);
        i51Var2.release();
        this.f22274w = null;
        this.f22272u = 0;
        this.f22271t = true;
        k51 k51Var = this.f22267p;
        yv yvVar = this.f22273v;
        Objects.requireNonNull(yvVar);
        this.f22274w = ((k51.a) k51Var).a(yvVar);
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(yv[] yvVarArr, long j10, long j11) {
        yv yvVar = yvVarArr[0];
        this.f22273v = yvVar;
        if (this.f22274w != null) {
            this.f22272u = 1;
            return;
        }
        this.f22271t = true;
        k51 k51Var = this.f22267p;
        Objects.requireNonNull(yvVar);
        this.f22274w = ((k51.a) k51Var).a(yvVar);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean a() {
        return this.f22270s;
    }

    public final void c(long j10) {
        pa.b(k());
        this.B = j10;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.pv0, com.yandex.mobile.ads.impl.qv0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<am> list = (List) message.obj;
        this.f22266o.onCues(list);
        this.f22266o.a(new cm(list));
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void u() {
        this.f22273v = null;
        this.B = -9223372036854775807L;
        List<am> listEmptyList = Collections.emptyList();
        Handler handler = this.f22265n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f22266o.onCues(listEmptyList);
            this.f22266o.a(new cm(listEmptyList));
        }
        z();
        i51 i51Var = this.f22274w;
        Objects.requireNonNull(i51Var);
        i51Var.release();
        this.f22274w = null;
        this.f22272u = 0;
    }
}
