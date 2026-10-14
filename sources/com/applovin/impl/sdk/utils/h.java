package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Point> f11210a = new HashMap(2);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11214d;

        /* JADX INFO: renamed from: com.applovin.impl.sdk.utils.h$a$a, reason: collision with other inner class name */
        public static class C0145a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f11215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f11216b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f11217c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f11218d;

            public C0145a a(int i10) {
                this.f11215a = i10;
                return this;
            }

            public a a() {
                return new a(this.f11215a, this.f11216b, this.f11217c, this.f11218d);
            }

            public C0145a b(int i10) {
                this.f11216b = i10;
                return this;
            }

            public C0145a c(int i10) {
                this.f11217c = i10;
                return this;
            }

            public C0145a d(int i10) {
                this.f11218d = i10;
                return this;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sbA.append(this.f11215a);
                sbA.append(", topRight=");
                sbA.append(this.f11216b);
                sbA.append(", bottomLeft=");
                sbA.append(this.f11217c);
                sbA.append(", bottomRight=");
                return android.support.v4.media.b.a(sbA, this.f11218d, ")");
            }
        }

        public a(int i10, int i11, int i12, int i13) {
            this.f11211a = i10;
            this.f11212b = i11;
            this.f11213c = i12;
            this.f11214d = i13;
        }

        public int a() {
            return this.f11211a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f11212b;
        }

        public int c() {
            return this.f11213c;
        }

        public int d() {
            return this.f11214d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && a() == aVar.a() && b() == aVar.b() && c() == aVar.c() && d() == aVar.d();
        }

        public int hashCode() {
            return d() + ((c() + ((b() + ((a() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("CompatibilityUtils.ScreenCornerRadii(topLeft=");
            sbA.append(a());
            sbA.append(", topRight=");
            sbA.append(b());
            sbA.append(", bottomLeft=");
            sbA.append(c());
            sbA.append(", bottomRight=");
            sbA.append(d());
            sbA.append(")");
            return sbA.toString();
        }
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static Point a(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        Map<Integer, Point> map = f11210a;
        if (map.containsKey(Integer.valueOf(orientation))) {
            return map.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (j()) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        map.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static a a(Context context, com.applovin.impl.sdk.o oVar) {
        a aVarA = null;
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.ez)).booleanValue() && k()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVarA = new a.C0145a().a(a(0, defaultDisplay)).b(a(1, defaultDisplay)).c(a(3, defaultDisplay)).d(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVarA;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static Point b(Context context) {
        Point point;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (j()) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            point = new Point(bounds.width(), bounds.height());
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 34;
    }
}
