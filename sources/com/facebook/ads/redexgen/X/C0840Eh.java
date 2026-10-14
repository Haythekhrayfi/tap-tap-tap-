package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0840Eh {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final EU A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0839Eg> A03;

    public C0840Eh() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0840Eh(CopyOnWriteArrayList<C0839Eg> copyOnWriteArrayList, int i10, EU eu, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = eu;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long jA01 = C9C.A01(j10);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final C0840Eh A02(int i10, EU eu, long j10) {
        return new C0840Eh(this.A03, i10, eu, j10);
    }

    public final void A03() {
        HG.A04(this.A01 != null);
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new EX(this, listener));
        }
    }

    public final void A04() {
        HG.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new EY(this, listener));
        }
    }

    public final void A05() {
        HG.A04(this.A01 != null);
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new RunnableC0836Ed(this, listener));
        }
    }

    public final void A06(int i10, Format format, int i11, Object obj, long j10) {
        A0C(new C0842Ej(1, i10, format, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0843Ek interfaceC0843Ek) {
        HG.A03((handler == null || interfaceC0843Ek == null) ? false : true);
        this.A03.add(new C0839Eg(handler, interfaceC0843Ek));
    }

    public final void A08(C0841Ei c0841Ei, C0842Ej c0842Ej) {
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new RunnableC0834Eb(this, listener, c0841Ei, c0842Ej));
        }
    }

    public final void A09(C0841Ei c0841Ei, C0842Ej c0842Ej) {
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new RunnableC0833Ea(this, listener, c0841Ei, c0842Ej));
        }
    }

    public final void A0A(C0841Ei c0841Ei, C0842Ej c0842Ej) {
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new EZ(this, listener, c0841Ei, c0842Ej));
        }
    }

    public final void A0B(C0841Ei c0841Ei, C0842Ej c0842Ej, IOException iOException, boolean z10) {
        for (C0839Eg c0839Eg : this.A03) {
            A01(c0839Eg.A00, new RunnableC0835Ec(this, c0839Eg.A01, c0841Ei, c0842Ej, iOException, z10));
        }
    }

    public final void A0C(C0842Ej c0842Ej) {
        for (C0839Eg c0839Eg : this.A03) {
            InterfaceC0843Ek listener = c0839Eg.A01;
            A01(c0839Eg.A00, new RunnableC0838Ef(this, listener, c0842Ej));
        }
    }

    public final void A0D(InterfaceC0843Ek interfaceC0843Ek) {
        for (C0839Eg listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == interfaceC0843Ek) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0889Ge c0889Ge, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12) {
        A0A(new C0841Ei(c0889Ge, j12, 0L, 0L), new C0842Ej(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(C0889Ge c0889Ge, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new C0841Ei(c0889Ge, j12, j13, j14), new C0842Ej(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(C0889Ge c0889Ge, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new C0841Ei(c0889Ge, j12, j13, j14), new C0842Ej(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(C0889Ge c0889Ge, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new C0841Ei(c0889Ge, j12, j13, j14), new C0842Ej(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
