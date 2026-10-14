package com.yandex.mobile.ads.exo.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ie0;
import com.yandex.mobile.ads.impl.je0;
import com.yandex.mobile.ads.impl.ke0;
import com.yandex.mobile.ads.impl.le0;
import com.yandex.mobile.ads.impl.me;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.qv0;
import com.yandex.mobile.ads.impl.r11;
import com.yandex.mobile.ads.impl.yv;
import com.yandex.mobile.ads.impl.zv;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends me implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final je0 f18521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final le0 f18522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f18523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ke0 f18524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ie0 f18525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f18529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Metadata f18530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(le0 le0Var, Looper looper) {
        super(5);
        je0 je0Var = je0.f22027a;
        this.f18522o = (le0) pa.a(le0Var);
        this.f18523p = looper == null ? null : da1.a(looper, (Handler.Callback) this);
        this.f18521n = (je0) pa.a(je0Var);
        this.f18524q = new ke0();
        this.f18529v = -9223372036854775807L;
    }

    private void a(Metadata metadata, ArrayList arrayList) {
        for (int i10 = 0; i10 < metadata.c(); i10++) {
            yv yvVarA = metadata.a(i10).a();
            if (yvVarA == null || !this.f18521n.a(yvVarA)) {
                arrayList.add(metadata.a(i10));
            } else {
                r11 r11VarB = this.f18521n.b(yvVarA);
                byte[] bArrB = metadata.a(i10).b();
                Objects.requireNonNull(bArrB);
                this.f18524q.b();
                this.f18524q.e(bArrB.length);
                ByteBuffer byteBuffer = this.f18524q.f19004c;
                int i11 = da1.f19803a;
                byteBuffer.put(bArrB);
                this.f18524q.h();
                Metadata metadataA = r11VarB.a(this.f18524q);
                if (metadataA != null) {
                    a(metadataA, arrayList);
                }
            }
        }
    }

    private boolean c(long j10) {
        Metadata metadata = this.f18530w;
        boolean z10 = false;
        if (metadata != null && this.f18529v <= j10) {
            Handler handler = this.f18523p;
            if (handler != null) {
                handler.obtainMessage(0, metadata).sendToTarget();
            } else {
                this.f18522o.a(metadata);
            }
            this.f18530w = null;
            this.f18529v = -9223372036854775807L;
            z10 = true;
        }
        if (this.f18526s && this.f18530w == null) {
            this.f18527t = true;
        }
        return z10;
    }

    @Override // com.yandex.mobile.ads.impl.qv0
    public final int a(yv yvVar) {
        if (this.f18521n.a(yvVar)) {
            return qv0.a(yvVar.E == 0 ? 4 : 2);
        }
        return qv0.a(0);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(long j10, long j11) {
        boolean zC = true;
        while (zC) {
            if (!this.f18526s && this.f18530w == null) {
                this.f18524q.b();
                zv zvVarQ = q();
                int iA = a(zvVarQ, this.f18524q, 0);
                if (iA == -4) {
                    if (this.f18524q.f()) {
                        this.f18526s = true;
                    } else {
                        ke0 ke0Var = this.f18524q;
                        ke0Var.f22396i = this.f18528u;
                        ke0Var.h();
                        ie0 ie0Var = this.f18525r;
                        int i10 = da1.f19803a;
                        Metadata metadataA = ie0Var.a(this.f18524q);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.c());
                            a(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f18530w = new Metadata(arrayList);
                                this.f18529v = this.f18524q.f19006e;
                            }
                        }
                    }
                } else if (iA == -5) {
                    yv yvVar = zvVarQ.f27433b;
                    Objects.requireNonNull(yvVar);
                    this.f18528u = yvVar.f27119p;
                }
            }
            zC = c(j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(long j10, boolean z10) {
        this.f18530w = null;
        this.f18529v = -9223372036854775807L;
        this.f18526s = false;
        this.f18527t = false;
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(yv[] yvVarArr, long j10, long j11) {
        this.f18525r = this.f18521n.b(yvVarArr[0]);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean a() {
        return this.f18527t;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.pv0, com.yandex.mobile.ads.impl.qv0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f18522o.a((Metadata) message.obj);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void u() {
        this.f18530w = null;
        this.f18529v = -9223372036854775807L;
        this.f18525r = null;
    }
}
