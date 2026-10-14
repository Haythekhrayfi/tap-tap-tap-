package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yf implements ft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yt f26816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ut f26817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xn f26818c;

    public yf(yt ytVar) {
        this.f26816a = ytVar;
    }

    public final int a(cs0 cs0Var) throws IOException {
        ut utVar = this.f26817b;
        Objects.requireNonNull(utVar);
        xn xnVar = this.f26818c;
        Objects.requireNonNull(xnVar);
        return utVar.a(xnVar, cs0Var);
    }

    public final void a() {
        ut utVar = this.f26817b;
        if (utVar instanceof mf0) {
            ((mf0) utVar).a();
        }
    }

    public final void a(long j10, long j11) {
        ut utVar = this.f26817b;
        Objects.requireNonNull(utVar);
        utVar.a(j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    public final void a(lm lmVar, Uri uri, Map map, long j10, long j11, wt wtVar) throws IOException {
        xn xnVar = new xn(lmVar, j10, j11);
        this.f26818c = xnVar;
        if (this.f26817b != null) {
            return;
        }
        ut[] utVarArrA = this.f26816a.a(uri, map);
        if (utVarArrA.length == 1) {
            this.f26817b = utVarArrA[0];
        } else {
            for (ut utVar : utVarArrA) {
                try {
                    if (utVar.a(xnVar)) {
                        this.f26817b = utVar;
                        xnVar.c();
                        break;
                    }
                    boolean z10 = this.f26817b != null || xnVar.getPosition() == j10;
                    pa.b(z10);
                    xnVar.c();
                } catch (EOFException unused) {
                    if (this.f26817b != null || xnVar.getPosition() == j10) {
                    }
                } catch (Throwable th) {
                    pa.b(this.f26817b != null || xnVar.getPosition() == j10);
                    xnVar.c();
                    throw th;
                }
                pa.b(z10);
                xnVar.c();
            }
            if (this.f26817b == null) {
                StringBuilder sbA = v60.a("None of the available extractors (");
                int i10 = da1.f19803a;
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < utVarArrA.length; i11++) {
                    sb2.append(utVarArrA[i11].getClass().getSimpleName());
                    if (i11 < utVarArrA.length - 1) {
                        sb2.append(", ");
                    }
                }
                sbA.append(sb2.toString());
                sbA.append(") could read the stream.");
                String string = sbA.toString();
                Objects.requireNonNull(uri);
                throw new k91(string);
            }
        }
        this.f26817b.a(wtVar);
    }

    public final long b() {
        xn xnVar = this.f26818c;
        if (xnVar != null) {
            return xnVar.getPosition();
        }
        return -1L;
    }

    public final void c() {
        ut utVar = this.f26817b;
        if (utVar != null) {
            utVar.release();
            this.f26817b = null;
        }
        this.f26818c = null;
    }
}
