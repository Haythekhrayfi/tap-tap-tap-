package x1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f37409a;

    public static class a extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37410b;

        public a(int i10) {
            super(i10);
            this.f37410b = i10;
        }

        @Override // x1.m
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f37410b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // x1.m
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f37410b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // x1.m
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f37410b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // x1.m
        public void f(String str, String str2, Throwable... thArr) {
            if (this.f37410b <= 2) {
                if (thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // x1.m
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f37410b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public m(int i10) {
    }

    public static synchronized m c() {
        if (f37409a == null) {
            f37409a = new a(3);
        }
        return f37409a;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);
}
