package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.exoplayer2.c.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6236b;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Throwable th, i iVar) {
        StringBuilder sbA = defpackage.a.a("Decoder failed: ");
        sbA.append(iVar == null ? null : iVar.f6237a);
        super(sbA.toString(), th);
        this.f6235a = iVar;
        this.f6236b = ai.f7595a >= 21 ? a(th) : null;
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
