package com.applovin.exoplayer2.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f7135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f7136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f7137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f7138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v f7143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f7144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f7145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k f7146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f7147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7149o;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f7073a);
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.f7136b = (l) com.applovin.exoplayer2.l.a.b(lVar);
        this.f7135a = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f7137c = iVar;
        this.f7138d = new w();
        this.f7149o = -9223372036854775807L;
    }

    private void B() {
        this.f7145k = null;
        this.f7148n = -1;
        k kVar = this.f7146l;
        if (kVar != null) {
            kVar.f();
            this.f7146l = null;
        }
        k kVar2 = this.f7147m;
        if (kVar2 != null) {
            kVar2.f();
            this.f7147m = null;
        }
    }

    private void C() {
        B();
        ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).d();
        this.f7144j = null;
        this.f7142h = 0;
    }

    private void D() {
        this.f7141g = true;
        this.f7144j = this.f7137c.b((v) com.applovin.exoplayer2.l.a.b(this.f7143i));
    }

    private void E() {
        C();
        D();
    }

    private long F() {
        if (this.f7148n == -1) {
            return RecyclerView.FOREVER_NS;
        }
        com.applovin.exoplayer2.l.a.b(this.f7146l);
        return this.f7148n >= this.f7146l.f_() ? RecyclerView.FOREVER_NS : this.f7146l.a(this.f7148n);
    }

    private void G() {
        a(Collections.emptyList());
    }

    private void a(h hVar) {
        StringBuilder sbA = defpackage.a.a("Subtitle decoding failed. streamFormat=");
        sbA.append(this.f7143i);
        q.c("TextRenderer", sbA.toString(), hVar);
        G();
        E();
    }

    private void a(List<a> list) {
        Handler handler = this.f7135a;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void b(List<a> list) {
        this.f7136b.a(list);
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.f7140f;
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.f7137c.a(vVar)) {
            return as.b(vVar.E == 0 ? 4 : 2);
        }
        return as.b(u.c(vVar.f8198l) ? 1 : 0);
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) throws com.applovin.exoplayer2.c.f {
        boolean z10;
        if (j()) {
            long j12 = this.f7149o;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                B();
                this.f7140f = true;
            }
        }
        if (this.f7140f) {
            return;
        }
        if (this.f7147m == null) {
            ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).a(j10);
            try {
                this.f7147m = ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).b();
            } catch (h e10) {
                a(e10);
                return;
            }
        }
        if (d_() != 2) {
            return;
        }
        if (this.f7146l != null) {
            long jF = F();
            z10 = false;
            while (jF <= j10) {
                this.f7148n++;
                jF = F();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k kVar = this.f7147m;
        if (kVar != null) {
            if (kVar.c()) {
                if (!z10 && F() == RecyclerView.FOREVER_NS) {
                    if (this.f7142h == 2) {
                        E();
                    } else {
                        B();
                        this.f7140f = true;
                    }
                }
            } else if (((com.applovin.exoplayer2.c.i) kVar).f4765a <= j10) {
                k kVar2 = this.f7146l;
                if (kVar2 != null) {
                    kVar2.f();
                }
                this.f7148n = kVar.a(j10);
                this.f7146l = kVar;
                this.f7147m = null;
                z10 = true;
            }
        }
        if (z10) {
            com.applovin.exoplayer2.l.a.b(this.f7146l);
            a(this.f7146l.b(j10));
        }
        if (this.f7142h == 2) {
            return;
        }
        while (!this.f7139e) {
            try {
                j jVarA = this.f7145k;
                if (jVarA == null) {
                    jVarA = ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).a();
                    if (jVarA == null) {
                        return;
                    } else {
                        this.f7145k = jVarA;
                    }
                }
                if (this.f7142h == 1) {
                    jVarA.a_(4);
                    ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).a(jVarA);
                    this.f7145k = null;
                    this.f7142h = 2;
                    return;
                }
                int iA = a(this.f7138d, jVarA, 0);
                if (iA == -4) {
                    if (jVarA.c()) {
                        this.f7139e = true;
                        this.f7141g = false;
                    } else {
                        v vVar = this.f7138d.f8240b;
                        if (vVar == null) {
                            return;
                        }
                        jVarA.f7132f = vVar.f8202p;
                        jVarA.h();
                        this.f7141g &= !jVarA.d();
                    }
                    if (!this.f7141g) {
                        ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).a(jVarA);
                        this.f7145k = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (h e11) {
                a(e11);
                return;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        G();
        this.f7139e = false;
        this.f7140f = false;
        this.f7149o = -9223372036854775807L;
        if (this.f7142h != 0) {
            E();
        } else {
            B();
            ((g) com.applovin.exoplayer2.l.a.b(this.f7144j)).c();
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f7143i = vVarArr[0];
        if (this.f7144j != null) {
            this.f7142h = 1;
        } else {
            D();
        }
    }

    public void c(long j10) {
        com.applovin.exoplayer2.l.a.b(j());
        this.f7149o = j10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((List<a>) message.obj);
        return true;
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f7143i = null;
        this.f7149o = -9223372036854775807L;
        G();
        C();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "TextRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }
}
