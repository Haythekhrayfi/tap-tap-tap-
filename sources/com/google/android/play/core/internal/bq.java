package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class bq {
    public static <T> bp<T> a(Object obj, String str, Class<T> cls) {
        return new bp<>(obj, a(obj, str), cls);
    }

    public static <R, P0> R a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p10) {
        try {
            return cls2.cast(a((Class<?>) cls, "isDexOptNeeded", (Class<?>[]) new Class[]{cls3}).invoke(null, p10));
        } catch (Exception e10) {
            throw new br(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e10);
        }
    }

    public static <R, P0, P1> R a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p10, Class<P1> cls4, P1 p11) {
        try {
            return cls2.cast(a((Class<?>) cls, "optimizedPathFor", (Class<?>[]) new Class[]{cls3, cls4}).invoke(null, p10, p11));
        } catch (Exception e10) {
            throw new br(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e10);
        }
    }

    public static <R, P0> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p10) {
        try {
            return cls.cast(a(obj, str, (Class<?>[]) new Class[]{cls2}).invoke(obj, p10));
        } catch (Exception e10) {
            throw new br(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    public static <R, P0, P1, P2> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p10, Class<P1> cls3, P1 p11, Class<P2> cls4, P2 p12) {
        try {
            return cls.cast(a(obj, str, (Class<?>[]) new Class[]{cls2, cls3, cls4}).invoke(obj, p10, p11, p12));
        } catch (Exception e10) {
            throw new br(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    private static Field a(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new br(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new br(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    private static Method a(Object obj, String str, Class<?>... clsArr) {
        return a(obj.getClass(), str, clsArr);
    }

    public static void a(PackageManager packageManager, ComponentName componentName, int i10) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i10 | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i11 = 0;
                    loop0: while (true) {
                        if (i11 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i11];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                componentInfo = componentInfoArr2[i12];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i11++;
                    }
                    if (componentInfo != null && componentInfo.isEnabled()) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void a(ca caVar, InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i10 = dataInputStream.readInt();
        if (i10 != -771763713) {
            String strValueOf = String.valueOf(String.format("%x", Integer.valueOf(i10)));
            throw new bz(strValueOf.length() != 0 ? "Unexpected magic=".concat(strValueOf) : new String("Unexpected magic="));
        }
        int i11 = dataInputStream.read();
        if (i11 != 4) {
            throw new bz(com.google.android.gms.common.data.a.a(30, "Unexpected version=", i11));
        }
        long j11 = 0;
        while (true) {
            long j12 = j10 - j11;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        a(bArr, dataInputStream, outputStream, unsignedShort, j12);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        a(bArr, dataInputStream, outputStream, unsignedShort, j12);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        a(bArr, caVar, outputStream, unsignedShort2, unsignedShort, j12);
                        break;
                        break;
                    case BaseTransientBottomBar.ANIMATION_DURATION /* 250 */:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        a(bArr, caVar, outputStream, unsignedShort3, unsignedShort, j12);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        a(bArr, caVar, outputStream, unsignedShort4, unsignedShort, j12);
                        break;
                    case 252:
                        long j13 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        a(bArr, caVar, outputStream, j13, unsignedShort, j12);
                        break;
                        break;
                    case 253:
                        long j14 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        a(bArr, caVar, outputStream, j14, unsignedShort, j12);
                        break;
                    case 254:
                        long j15 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        a(bArr, caVar, outputStream, j15, unsignedShort, j12);
                        break;
                    case 255:
                        long j16 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        a(bArr, caVar, outputStream, j16, unsignedShort, j12);
                        break;
                    default:
                        a(bArr, dataInputStream, outputStream, unsignedShort, j12);
                        break;
                }
                j11 += (long) unsignedShort;
            } catch (Throwable th) {
                outputStream.flush();
                throw th;
            }
        }
    }

    public static <T> void a(T t10) {
        Objects.requireNonNull(t10);
    }

    public static <T> void a(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    private static void a(byte[] bArr, ca caVar, OutputStream outputStream, long j10, int i10, long j11) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j10 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j12 = i10;
        if (j12 > j11) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamB = new cb(caVar, j10, j12).b();
            while (i10 > 0) {
                try {
                    int iMin = Math.min(i10, Http2.INITIAL_MAX_FRAME_SIZE);
                    int i11 = 0;
                    while (i11 < iMin) {
                        int i12 = inputStreamB.read(bArr, i11, iMin - i11);
                        if (i12 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i11 += i12;
                        throw new IOException("patch underrun", e);
                    }
                    outputStream.write(bArr, 0, iMin);
                    i10 -= iMin;
                } catch (Throwable th) {
                    if (inputStreamB != null) {
                        try {
                            inputStreamB.close();
                        } catch (Throwable th2) {
                            ci.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
            if (inputStreamB != null) {
                inputStreamB.close();
            }
        } catch (EOFException e10) {
            throw new IOException("patch underrun", e10);
        }
    }

    private static void a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i10 > j10) {
            throw new IOException("Output length overrun");
        }
        while (i10 > 0) {
            try {
                int iMin = Math.min(i10, Http2.INITIAL_MAX_FRAME_SIZE);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i10 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static <T> bp b(Object obj, String str, Class<T> cls) {
        return new bp(obj, a(obj, str), cls, null);
    }

    public static <T> void b(T t10) {
        Objects.requireNonNull(t10, "Cannot return null from a non-@Nullable @Provides method");
    }
}
