package i8;

import android.graphics.Typeface;
import y9.p2;
import y9.q2;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.a f31329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.a f31330b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31331a;

        static {
            int[] iArr = new int[p2.values().length];
            iArr[p2.DISPLAY.ordinal()] = 1;
            f31331a = iArr;
        }
    }

    public e0(y7.a aVar, y7.a aVar2) {
        fd.j0.i(aVar, "regularTypefaceProvider");
        fd.j0.i(aVar2, "displayTypefaceProvider");
        this.f31329a = aVar;
        this.f31330b = aVar2;
    }

    public Typeface a(p2 p2Var, q2 q2Var) {
        fd.j0.i(p2Var, "fontFamily");
        fd.j0.i(q2Var, "fontWeight");
        return l8.b.D(q2Var, a.f31331a[p2Var.ordinal()] == 1 ? this.f31330b : this.f31329a);
    }
}
