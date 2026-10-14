package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f30474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f30475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f30476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f30477e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f30475c = constructor;
        f30474b = cls;
        f30476d = method2;
        f30477e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f30476d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f30474b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f30477e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // h0.p
    public Typeface a(Context context, g0.e.c cVar, Resources resources, int i10) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f30475c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (g0.e.d dVar : cVar.f29664a) {
            int i11 = dVar.f29670f;
            File fileC = q.c(context);
            if (fileC == null) {
                map = null;
            } else {
                try {
                    if (q.a(fileC, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileC);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileC.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileC.delete();
                        map = null;
                    }
                } catch (Throwable th3) {
                    fileC.delete();
                    throw th3;
                }
            }
            if (map == null || !f(objNewInstance, map, dVar.f29669e, dVar.f29666b, dVar.f29667c)) {
                return null;
            }
        }
        return g(objNewInstance);
    }

    @Override // h0.p
    public Typeface b(Context context, CancellationSignal cancellationSignal, m0.m[] mVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f30475c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        q.h hVar = new q.h();
        for (m0.m mVar : mVarArr) {
            Uri uri = mVar.f33157a;
            ByteBuffer byteBufferD = (ByteBuffer) hVar.get(uri);
            if (byteBufferD == null) {
                byteBufferD = q.d(context, cancellationSignal, uri);
                hVar.put(uri, byteBufferD);
            }
            if (byteBufferD == null || !f(objNewInstance, byteBufferD, mVar.f33158b, mVar.f33159c, mVar.f33160d)) {
                return null;
            }
        }
        Typeface typefaceG = g(objNewInstance);
        if (typefaceG == null) {
            return null;
        }
        return Typeface.create(typefaceG, i10);
    }
}
