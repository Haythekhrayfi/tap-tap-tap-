package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f30469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor<?> f30470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f30471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f30472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f30473f;

    public static boolean f(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        g();
        try {
            return ((Boolean) f30471d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void g() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f30473f) {
            return;
        }
        f30473f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f30470c = constructor;
        f30469b = cls;
        f30471d = method2;
        f30472e = method;
    }

    @Override // h0.p
    public Typeface a(Context context, g0.e.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        g();
        try {
            Object objNewInstance = f30470c.newInstance(new Object[0]);
            for (g0.e.d dVar : cVar.f29664a) {
                File fileC = q.c(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    if (!q.a(fileC, resources, dVar.f29670f)) {
                        fileC.delete();
                        return null;
                    }
                    boolean zF = f(objNewInstance, fileC.getPath(), dVar.f29666b, dVar.f29667c);
                    fileC.delete();
                    if (!zF) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    fileC.delete();
                    return null;
                } catch (Throwable th) {
                    fileC.delete();
                    throw th;
                }
            }
            g();
            try {
                Object objNewInstance2 = Array.newInstance(f30469b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f30472e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // h0.p
    public Typeface b(Context context, CancellationSignal cancellationSignal, m0.m[] mVarArr, int i10) {
        File file;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(e(mVarArr, i10).f33157a, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ErrnoException unused) {
            }
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceC = c(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceC;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
