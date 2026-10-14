package m8;

import y9.t;
import y9.t2;
import y9.u;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f33306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f33307c;

    static {
        int[] iArr = new int[t2.h.values().length];
        iArr[t2.h.START.ordinal()] = 1;
        iArr[t2.h.CENTER.ordinal()] = 2;
        iArr[t2.h.END.ordinal()] = 3;
        f33305a = iArr;
        int[] iArr2 = new int[t.values().length];
        iArr2[t.LEFT.ordinal()] = 1;
        iArr2[t.CENTER.ordinal()] = 2;
        iArr2[t.RIGHT.ordinal()] = 3;
        f33306b = iArr2;
        int[] iArr3 = new int[u.values().length];
        iArr3[u.TOP.ordinal()] = 1;
        iArr3[u.BASELINE.ordinal()] = 2;
        iArr3[u.CENTER.ordinal()] = 3;
        iArr3[u.BOTTOM.ordinal()] = 4;
        f33307c = iArr3;
    }
}
