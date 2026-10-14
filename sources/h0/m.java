package h0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f30478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor<?> f30479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f30480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f30481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f30482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f30483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f30484m;

    public m() throws NoSuchMethodException {
        Method methodP;
        Method method;
        Constructor<?> constructor;
        Method methodN;
        Method methodO;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodN = n(cls2);
            methodO = o(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodP = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder sbA = defpackage.a.a("Unable to collect necessary methods for class ");
            sbA.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sbA.toString(), e10);
            methodP = null;
            method = null;
            constructor = null;
            methodN = null;
            methodO = null;
            method2 = null;
        }
        this.f30478g = cls;
        this.f30479h = constructor;
        this.f30480i = methodN;
        this.f30481j = methodO;
        this.f30482k = method2;
        this.f30483l = method;
        this.f30484m = methodP;
    }

    private Object m() {
        try {
            return this.f30479h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // h0.k, h0.p
    public Typeface a(Context context, g0.e.c cVar, Resources resources, int i10) {
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        for (g0.e.d dVar : cVar.f29664a) {
            if (!i(context, objM, dVar.f29665a, dVar.f29669e, dVar.f29666b, dVar.f29667c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f29668d))) {
                h(objM);
                return null;
            }
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // h0.k, h0.p
    public Typeface b(Context context, CancellationSignal cancellationSignal, m0.m[] mVarArr, int i10) {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            m0.m mVarE = e(mVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mVarE.f33157a, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(mVarE.f33159c).setItalic(mVarE.f33160d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (m0.m mVar : mVarArr) {
            if (mVar.f33161e == 0) {
                Uri uri = mVar.f33157a;
                if (!map.containsKey(uri)) {
                    map.put(uri, q.d(context, cancellationSignal, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM = m();
        if (objM == null) {
            return null;
        }
        int length = mVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            m0.m mVar2 = mVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(mVar2.f33157a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f30481j.invoke(objM, byteBuffer, Integer.valueOf(mVar2.f33158b), null, Integer.valueOf(mVar2.f33159c), Integer.valueOf(mVar2.f33160d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    h(objM);
                    return null;
                }
                z10 = true;
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            h(objM);
            return null;
        }
        if (k(objM) && (typefaceJ = j(objM)) != null) {
            return Typeface.create(typefaceJ, i10);
        }
        return null;
    }

    @Override // h0.p
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!i(context, objM, str, 0, -1, -1, null)) {
            h(objM);
            return null;
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    public final void h(Object obj) {
        try {
            this.f30483l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f30480i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f30478g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f30484m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f30482k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f30480i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f30480i != null;
    }

    public Method n(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
