package com.applovin.exoplayer2.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f6392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f6393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f6394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f6395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f6396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f6401j;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f6325a);
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.f6393b = (e) com.applovin.exoplayer2.l.a.b(eVar);
        this.f6394c = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f6392a = (c) com.applovin.exoplayer2.l.a.b(cVar);
        this.f6395d = new d();
        this.f6400i = -9223372036854775807L;
    }

    private void B() {
        if (this.f6397f || this.f6401j != null) {
            return;
        }
        this.f6395d.a();
        w wVarT = t();
        int iA = a(wVarT, this.f6395d, 0);
        if (iA != -4) {
            if (iA == -5) {
                this.f6399h = ((v) com.applovin.exoplayer2.l.a.b(wVarT.f8240b)).f8202p;
                return;
            }
            return;
        }
        if (this.f6395d.c()) {
            this.f6397f = true;
            return;
        }
        d dVar = this.f6395d;
        dVar.f6336f = this.f6399h;
        dVar.h();
        a aVarA = ((b) ai.a(this.f6396e)).a(this.f6395d);
        if (aVarA != null) {
            ArrayList arrayList = new ArrayList(aVarA.a());
            a(aVarA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f6401j = new a(arrayList);
            this.f6400i = this.f6395d.f4754d;
        }
    }

    private void a(a aVar) {
        Handler handler = this.f6394c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }

    private void a(a aVar, List<a.InterfaceC0092a> list) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            v vVarA = aVar.a(i10).a();
            if (vVarA == null || !this.f6392a.a(vVarA)) {
                list.add(aVar.a(i10));
            } else {
                b bVarB = this.f6392a.b(vVarA);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar.a(i10).b());
                this.f6395d.a();
                this.f6395d.f(bArr.length);
                ((ByteBuffer) ai.a(this.f6395d.f4752b)).put(bArr);
                this.f6395d.h();
                a aVarA = bVarB.a(this.f6395d);
                if (aVarA != null) {
                    a(aVarA, list);
                }
            }
        }
    }

    private void b(a aVar) {
        this.f6393b.a(aVar);
    }

    private boolean c(long j10) {
        boolean z10;
        a aVar = this.f6401j;
        if (aVar == null || this.f6400i > j10) {
            z10 = false;
        } else {
            a(aVar);
            this.f6401j = null;
            this.f6400i = -9223372036854775807L;
            z10 = true;
        }
        if (this.f6397f && this.f6401j == null) {
            this.f6398g = true;
        }
        return z10;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.f6398g;
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.f6392a.a(vVar)) {
            return as.b(vVar.E == 0 ? 4 : 2);
        }
        return as.b(0);
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) {
        boolean zC = true;
        while (zC) {
            B();
            zC = c(j10);
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        this.f6401j = null;
        this.f6400i = -9223372036854775807L;
        this.f6397f = false;
        this.f6398g = false;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f6396e = this.f6392a.b(vVarArr[0]);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((a) message.obj);
        return true;
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f6401j = null;
        this.f6400i = -9223372036854775807L;
        this.f6396e = null;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MetadataRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }
}
