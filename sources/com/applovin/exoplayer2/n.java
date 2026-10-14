package com.applovin.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n implements au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7897a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7900d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7907k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7898b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7899c = 5000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.f.k f7901e = com.applovin.exoplayer2.f.k.f6284a;

    public n(Context context) {
        this.f7897a = context;
    }

    public com.applovin.exoplayer2.b.h a(Context context, boolean z10, boolean z11, boolean z12) {
        return new com.applovin.exoplayer2.b.n(com.applovin.exoplayer2.b.e.a(context), new com.applovin.exoplayer2.b.n.c(new com.applovin.exoplayer2.b.f[0]), z10, z11, z12 ? 1 : 0);
    }

    public void a(Context context, int i10, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, com.applovin.exoplayer2.m.n nVar, long j10, ArrayList<ar> arrayList) {
        int i11;
        int i12;
        com.applovin.exoplayer2.m.h hVar = new com.applovin.exoplayer2.m.h(context, kVar, j10, z10, handler, nVar, 50);
        hVar.a(this.f7902f);
        hVar.b(this.f7903g);
        hVar.c(this.f7904h);
        arrayList.add(hVar);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, nVar, 50));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating AV1 extension", e12);
        }
    }

    public void a(Context context, int i10, com.applovin.exoplayer2.f.k kVar, boolean z10, com.applovin.exoplayer2.b.h hVar, Handler handler, com.applovin.exoplayer2.b.g gVar, ArrayList<ar> arrayList) {
        int i11;
        int i12;
        com.applovin.exoplayer2.b.q qVar = new com.applovin.exoplayer2.b.q(context, kVar, z10, handler, gVar, hVar);
        qVar.a(this.f7902f);
        qVar.b(this.f7903g);
        qVar.c(this.f7904h);
        arrayList.add(qVar);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating Opus extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (ar) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i12, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating FLAC extension", e12);
        }
    }

    public void a(Context context, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.m.a.b());
    }

    public void a(Context context, Handler handler, int i10, ArrayList<ar> arrayList) {
    }

    public void a(Context context, com.applovin.exoplayer2.g.e eVar, Looper looper, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.g.f(eVar, looper));
    }

    public void a(Context context, com.applovin.exoplayer2.i.l lVar, Looper looper, int i10, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.i.m(lVar, looper));
    }

    @Override // com.applovin.exoplayer2.au
    public ar[] a(Handler handler, com.applovin.exoplayer2.m.n nVar, com.applovin.exoplayer2.b.g gVar, com.applovin.exoplayer2.i.l lVar, com.applovin.exoplayer2.g.e eVar) {
        ArrayList<ar> arrayList = new ArrayList<>();
        a(this.f7897a, this.f7898b, this.f7901e, this.f7900d, handler, nVar, this.f7899c, arrayList);
        com.applovin.exoplayer2.b.h hVarA = a(this.f7897a, this.f7905i, this.f7906j, this.f7907k);
        if (hVarA != null) {
            a(this.f7897a, this.f7898b, this.f7901e, this.f7900d, hVarA, handler, gVar, arrayList);
        }
        a(this.f7897a, lVar, handler.getLooper(), this.f7898b, arrayList);
        a(this.f7897a, eVar, handler.getLooper(), this.f7898b, arrayList);
        a(this.f7897a, this.f7898b, arrayList);
        a(this.f7897a, handler, this.f7898b, arrayList);
        return (ar[]) arrayList.toArray(new ar[0]);
    }
}
