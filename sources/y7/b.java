package y7;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    REGULAR,
    MEDIUM,
    BOLD,
    LIGHT;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38440a;

        static {
            int[] iArr = new int[b.values().length];
            f38440a = iArr;
            try {
                iArr[b.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38440a[b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38440a[b.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Typeface getTypeface(y7.a aVar) {
        int i10 = a.f38440a[ordinal()];
        if (i10 == 1) {
            return aVar.getBold();
        }
        if (i10 != 2) {
            return i10 != 3 ? aVar.getRegular() : aVar.getLight();
        }
        return aVar.getMedium();
    }
}
