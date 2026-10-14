package h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, g0.e.c> f30485a = new ConcurrentHashMap<>();

    public Typeface a(Context context, g0.e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, m0.m[] mVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File fileC = q.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (q.b(fileC, inputStream)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileC = q.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (q.a(fileC, resources, i10)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public m0.m e(m0.m[] mVarArr, int i10) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        m0.m mVar = null;
        int i12 = Integer.MAX_VALUE;
        for (m0.m mVar2 : mVarArr) {
            int iAbs = (Math.abs(mVar2.f33159c - i11) * 2) + (mVar2.f33160d == z10 ? 0 : 1);
            if (mVar == null || i12 > iAbs) {
                mVar = mVar2;
                i12 = iAbs;
            }
        }
        return mVar;
    }
}
