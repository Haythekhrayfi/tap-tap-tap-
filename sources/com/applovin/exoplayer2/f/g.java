package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f6227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f6228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f6229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f6230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f6231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f6233g;

        private a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.f6227a = iVar;
            this.f6228b = mediaFormat;
            this.f6229c = vVar;
            this.f6230d = surface;
            this.f6231e = mediaCrypto;
            this.f6232f = i10;
            this.f6233g = z10;
        }

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, null, mediaCrypto, 0, false);
        }

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, surface, mediaCrypto, 0, false);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6234a = new m.b();

        g b(a aVar) throws IOException;
    }

    public interface c {
        void a(g gVar, long j10, long j11);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i10);

    void a(int i10, int i11, int i12, long j10, int i13);

    void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, boolean z10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    boolean a();

    int b();

    ByteBuffer b(int i10);

    MediaFormat c();

    void c(int i10);

    void d();

    void e();
}
