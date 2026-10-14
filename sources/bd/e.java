package bd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e extends d {
    public static final float a(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final float b(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final long c(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final float d(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + CoreConstants.DOT);
    }

    public static final int e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + CoreConstants.DOT);
    }

    public static final int f(c cVar, zc.c cVar2) {
        j0.i(cVar2, "random");
        try {
            return h9.d.k(cVar2, cVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final a g(a aVar, int i10) {
        j0.i(aVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        j0.i(numValueOf, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + CoreConstants.DOT);
        }
        a.C0063a c0063a = a.f3514f;
        int i11 = aVar.f3515c;
        int i12 = aVar.f3516d;
        if (aVar.f3517e <= 0) {
            i10 = -i10;
        }
        Objects.requireNonNull(c0063a);
        return new a(i11, i12, i10);
    }

    public static final c h(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new c(i10, i11 - 1);
        }
        Objects.requireNonNull(c.f3522g);
        return c.f3523h;
    }
}
