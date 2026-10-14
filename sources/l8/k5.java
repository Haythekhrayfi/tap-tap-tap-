package l8;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class k5 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32535a;

        static {
            int[] iArr = new int[y9.v.e.values().length];
            iArr[y9.v.e.TRANSLATE.ordinal()] = 1;
            iArr[y9.v.e.SCALE.ordinal()] = 2;
            iArr[y9.v.e.NO_ANIMATION.ordinal()] = 3;
            f32535a = iArr;
        }
    }

    public static final r1.l a(y9.v vVar, boolean z10, v9.d dVar) {
        v9.b<Double> bVar;
        Double dB;
        v9.b<Double> bVar2;
        v9.b<Double> bVar3;
        v9.b<Double> bVar4;
        v9.b<Double> bVar5;
        int i10 = a.f32535a[vVar.f43392e.b(dVar).ordinal()];
        Double dB2 = null;
        dB = null;
        Double dB3 = null;
        r1.l jVar = null;
        dB = null;
        Double dB4 = null;
        dB2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                dB4 = z10 ? bVar4.b(dVar) : bVar4.b(dVar);
                Float fC = c(dB4);
                jVar = new j8.f(fC != null ? fC.floatValue() : 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 6, null);
            } else if (i10 != 3) {
                dB3 = z10 ? bVar5.b(dVar) : bVar5.b(dVar);
                Float fB = b(dB3);
                j8.d dVar2 = new j8.d(fB != null ? fB.floatValue() : 1.0f);
                dVar2.setMode(z10 ? 1 : 2);
                jVar = dVar2;
            }
        } else {
            Float fD = (!z10 ? (bVar = vVar.f43389b) == null || (dB = bVar.b(dVar)) == null : (bVar3 = vVar.f43394g) == null || (dB = bVar3.b(dVar)) == null) ? d(dB) : null;
            if (!z10 ? (bVar2 = vVar.f43394g) != null : (bVar2 = vVar.f43389b) != null) {
                dB2 = bVar2.b(dVar);
            }
            Float fD2 = d(dB2);
            jVar = new j8.j(fD == null ? -1.0f : fD.floatValue(), fD2 == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : fD2.floatValue());
        }
        return jVar;
    }

    public static final Float b(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(bd.e.d((float) d10.doubleValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f));
    }

    public static final Float c(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(bd.e.a((float) d10.doubleValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
    }

    public static final Float d(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(bd.e.d((float) d10.doubleValue(), -1.0f, 1.0f));
    }
}
