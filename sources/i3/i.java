package i3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f31232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31233d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f31234i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f31235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActivityManager f31236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f31237c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f31239e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f31238d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f31240f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f31241g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f31242h = 4194304;

        static {
            f31234i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f31239e = f31234i;
            this.f31235a = context;
            this.f31236b = (ActivityManager) context.getSystemService("activity");
            this.f31237c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f31236b.isLowRamDevice()) {
                return;
            }
            this.f31239e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f31243a;

        public b(DisplayMetrics displayMetrics) {
            this.f31243a = displayMetrics;
        }
    }

    public interface c {
    }

    public i(a aVar) {
        this.f31232c = aVar.f31235a;
        int i10 = aVar.f31236b.isLowRamDevice() ? aVar.f31242h / 2 : aVar.f31242h;
        this.f31233d = i10;
        ActivityManager activityManager = aVar.f31236b;
        int iRound = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? aVar.f31241g : aVar.f31240f));
        DisplayMetrics displayMetrics = ((b) aVar.f31237c).f31243a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(aVar.f31239e * f10);
        int iRound3 = Math.round(f10 * aVar.f31238d);
        int i11 = iRound - i10;
        int i12 = iRound3 + iRound2;
        if (i12 <= i11) {
            this.f31231b = iRound3;
            this.f31230a = iRound2;
        } else {
            float f11 = i11;
            float f12 = aVar.f31239e;
            float f13 = aVar.f31238d;
            float f14 = f11 / (f12 + f13);
            this.f31231b = Math.round(f13 * f14);
            this.f31230a = Math.round(f14 * aVar.f31239e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sbA = defpackage.a.a("Calculation complete, Calculated memory cache size: ");
            sbA.append(a(this.f31231b));
            sbA.append(", pool size: ");
            sbA.append(a(this.f31230a));
            sbA.append(", byte array size: ");
            sbA.append(a(i10));
            sbA.append(", memory class limited? ");
            sbA.append(i12 > iRound);
            sbA.append(", max size: ");
            sbA.append(a(iRound));
            sbA.append(", memoryClass: ");
            sbA.append(aVar.f31236b.getMemoryClass());
            sbA.append(", isLowMemoryDevice: ");
            sbA.append(aVar.f31236b.isLowRamDevice());
            Log.d("MemorySizeCalculator", sbA.toString());
        }
    }

    public final String a(int i10) {
        return Formatter.formatFileSize(this.f31232c, i10);
    }
}
