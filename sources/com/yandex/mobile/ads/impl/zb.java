package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public interface zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f27269a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f27270e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27274d;

        public a(int i10, int i11, int i12) {
            this.f27271a = i10;
            this.f27272b = i11;
            this.f27273c = i12;
            this.f27274d = da1.e(i12) ? da1.b(i12, i11) : -1;
        }

        public final String toString() {
            StringBuilder sbA = v60.a("AudioFormat[sampleRate=");
            sbA.append(this.f27271a);
            sbA.append(", channelCount=");
            sbA.append(this.f27272b);
            sbA.append(", encoding=");
            return h0.f.a(sbA, this.f27273c, ']');
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    ByteBuffer b();

    void c();

    boolean d();

    void flush();

    void reset();
}
