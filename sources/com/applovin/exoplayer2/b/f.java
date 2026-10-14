package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4436a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4437a = new a(-1, -1, -1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4441e;

        public a(int i10, int i11, int i12) {
            this.f4438b = i10;
            this.f4439c = i11;
            this.f4440d = i12;
            this.f4441e = ai.d(i12) ? ai.c(i12, i11) : -1;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AudioFormat[sampleRate=");
            sbA.append(this.f4438b);
            sbA.append(", channelCount=");
            sbA.append(this.f4439c);
            sbA.append(", encoding=");
            return h0.f.a(sbA, this.f4440d, ']');
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

    void b();

    ByteBuffer c();

    boolean d();

    void e();

    void f();
}
