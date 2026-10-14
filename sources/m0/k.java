package m0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q.f<String, Typeface> f33149a = new q.f<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f33150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f33151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q.h<String, ArrayList<o0.a<a>>> f33152d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f33153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33154b;

        public a(int i10) {
            this.f33153a = null;
            this.f33154b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f33153a = typeface;
            this.f33154b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f33150b = threadPoolExecutor;
        f33151c = new Object();
        f33152d = new q.h<>();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[EDGE_INSN: B:23:0x0035->B:28:0x003e BREAK  A[LOOP:0: B:19:0x002b->B:25:0x0039]] */
    public static a a(String str, Context context, f fVar, int i10) {
        int i11;
        Typeface typeface = f33149a.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            l lVarA = e.a(context, fVar, null);
            int i12 = lVarA.f33155a;
            int i13 = 1;
            if (i12 == 0) {
                m[] mVarArr = lVarA.f33156b;
                if (mVarArr == null || mVarArr.length == 0) {
                    i11 = i13;
                    break;
                }
                int length = mVarArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i13 = 0;
                        i11 = i13;
                        break;
                    }
                    int i15 = mVarArr[i14].f33161e;
                    if (i15 != 0) {
                        if (i15 >= 0) {
                            i11 = i15;
                            break;
                        }
                        i11 = -3;
                        break;
                    }
                    i14++;
                }
            } else {
                if (i12 != 1) {
                    i11 = -3;
                    break;
                }
                i11 = -2;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface typefaceB = h0.j.f30466a.b(context, null, lVarA.f33156b, i10);
            if (typefaceB == null) {
                return new a(-3);
            }
            f33149a.put(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
