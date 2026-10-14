package com.yandex.metrica.impl.ob;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1990tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BigInteger f17488a = BigInteger.valueOf(RecyclerView.FOREVER_NS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BigInteger f17489b = BigInteger.valueOf(Long.MIN_VALUE);

    public static final jc.h a(BigDecimal bigDecimal) {
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        fd.j0.h(bigIntegerUnscaledValue, "value.unscaledValue()");
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(f17488a) <= 0 && bigIntegerUnscaledValue.compareTo(f17489b) >= 0) {
                return new jc.h(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            fd.j0.h(bigIntegerUnscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i10++;
        }
    }
}
