package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface eb0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ib0 f20138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f20139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yv f20140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f20141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f20142e;

        private a(ib0 ib0Var, MediaFormat mediaFormat, yv yvVar, Surface surface, MediaCrypto mediaCrypto) {
            this.f20138a = ib0Var;
            this.f20139b = mediaFormat;
            this.f20140c = yvVar;
            this.f20141d = surface;
            this.f20142e = mediaCrypto;
        }

        public static a a(ib0 ib0Var, MediaFormat mediaFormat, yv yvVar, MediaCrypto mediaCrypto) {
            return new a(ib0Var, mediaFormat, yvVar, null, mediaCrypto);
        }

        public static a a(ib0 ib0Var, MediaFormat mediaFormat, yv yvVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(ib0Var, mediaFormat, yvVar, surface, mediaCrypto);
        }
    }

    public interface b {
        eb0 a(a aVar) throws IOException;
    }

    public interface c {
        void a(long j10);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    void a();

    void a(int i10);

    void a(int i10, int i11, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, zl zlVar, long j10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    void a(boolean z10, int i10);

    MediaFormat b();

    ByteBuffer b(int i10);

    int c();

    ByteBuffer c(int i10);

    void flush();

    void release();
}
