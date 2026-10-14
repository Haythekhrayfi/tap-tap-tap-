package i8;

import android.graphics.NinePatch;
import android.graphics.Paint;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f31480a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Paint f31481b = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<a, NinePatch> f31482c = new LinkedHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f31483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f31484b;

        public a(float[] fArr, float f10) {
            fd.j0.i(fArr, "radii");
            this.f31483a = fArr;
            this.f31484b = f10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.f31484b == aVar.f31484b) && Arrays.equals(this.f31483a, aVar.f31483a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.f31484b) + (Arrays.hashCode(this.f31483a) * 31);
        }
    }
}
