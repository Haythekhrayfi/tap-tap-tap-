package o3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d3.d<com.bumptech.glide.load.b> f33910f = d3.d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.DEFAULT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d3.d<Boolean> f33911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d3.d<Boolean> f33912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f33913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f33914j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.d f33915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f33916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3.b f33917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f33918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f33919e;

    public class a implements b {
        @Override // o3.k.b
        public void a(h3.d dVar, Bitmap bitmap) {
        }

        @Override // o3.k.b
        public void b() {
        }
    }

    public interface b {
        void a(h3.d dVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        d3.d<j> dVar = j.f33909f;
        Boolean bool = Boolean.FALSE;
        f33911g = d3.d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f33912h = d3.d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f33913i = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = b4.j.f3307a;
        f33914j = new ArrayDeque(0);
    }

    public k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, h3.d dVar, h3.b bVar) {
        if (p.f33925d == null) {
            synchronized (p.class) {
                if (p.f33925d == null) {
                    p.f33925d = new p();
                }
            }
        }
        this.f33919e = p.f33925d;
        this.f33918d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f33916b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f33915a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f33917c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, o3.k.b r8, h3.d r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto Lc
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto Lf
        Lc:
            r8.b()
        Lf:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = o3.u.f33943b
            r4.lock()
            r5 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r5, r7)     // Catch: java.lang.Throwable -> L2a java.lang.IllegalArgumentException -> L2c
            r4.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L29
            r6.reset()
        L29:
            return r8
        L2a:
            r6 = move-exception
            goto L57
        L2c:
            r4 = move-exception
            java.io.IOException r1 = g(r4, r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L2a
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L3d
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L2a
        L3d:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L56
            r6.reset()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            r9.d(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            r7.inBitmap = r5     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            android.graphics.Bitmap r6 = c(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L55
            java.util.concurrent.locks.Lock r7 = o3.u.f33943b
            r7.unlock()
            return r6
        L55:
            throw r1     // Catch: java.lang.Throwable -> L2a
        L56:
            throw r1     // Catch: java.lang.Throwable -> L2a
        L57:
            java.util.concurrent.locks.Lock r7 = o3.u.f33943b
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.k.c(java.io.InputStream, android.graphics.BitmapFactory$Options, o3.k$b, h3.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sbA = defpackage.a.a(" (");
        sbA.append(bitmap.getAllocationByteCount());
        sbA.append(")");
        String string = sbA.toString();
        StringBuilder sbA2 = defpackage.a.a("[");
        sbA2.append(bitmap.getWidth());
        sbA2.append("x");
        sbA2.append(bitmap.getHeight());
        sbA2.append("] ");
        sbA2.append(bitmap.getConfig());
        sbA2.append(string);
        return sbA2.toString();
    }

    public static int e(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] f(InputStream inputStream, BitmapFactory.Options options, b bVar, h3.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        c(inputStream, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static IOException g(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder sbA = androidx.recyclerview.widget.o.a("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        sbA.append(str);
        sbA.append(", inBitmap: ");
        sbA.append(d(options.inBitmap));
        return new IOException(sbA.toString(), illegalArgumentException);
    }

    public static void h(BitmapFactory.Options options) {
        i(options);
        Queue<BitmapFactory.Options> queue = f33914j;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(options);
        }
    }

    public static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int j(double d10) {
        return (int) (d10 + 0.5d);
    }

    public g3.u<Bitmap> a(InputStream inputStream, int i10, int i11, d3.e eVar, b bVar) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        u1.a.e(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f33917c.d(65536, byte[].class);
        synchronized (k.class) {
            Queue<BitmapFactory.Options> queue = f33914j;
            synchronized (queue) {
                options = (BitmapFactory.Options) ((ArrayDeque) queue).poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                i(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) eVar.c(f33910f);
        j jVar = (j) eVar.c(j.f33909f);
        boolean zBooleanValue = ((Boolean) eVar.c(f33911g)).booleanValue();
        d3.d<Boolean> dVar = f33912h;
        try {
            return d.c(b(inputStream, options2, jVar, bVar2, eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f33915a);
        } finally {
            h(options2);
            this.f33917c.put(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [h3.d] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v0, types: [o3.k$b] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(InputStream inputStream, BitmapFactory.Options options, j jVar, com.bumptech.glide.load.b bVar, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        char c10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        Bitmap.Config config;
        boolean zHasAlpha;
        boolean z17;
        int iFloor;
        int iFloor2;
        int i13 = b4.f.f3299b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int[] iArrF = f(inputStream, options, bVar2, this.f33915a);
        boolean z18 = false;
        int i14 = iArrF[0];
        int i15 = iArrF[1];
        String str = options.outMimeType;
        if (i14 != -1 && i15 != -1) {
            z18 = z10;
        }
        int iA = com.bumptech.glide.load.d.a(this.f33918d, inputStream, this.f33917c);
        switch (iA) {
            case 3:
            case 4:
                c10 = 180;
                break;
            case 5:
            case 6:
                c10 = 'Z';
                break;
            case 7:
            case 8:
                c10 = 270;
                break;
            default:
                c10 = 0;
                break;
        }
        switch (iA) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        int i16 = i10 == Integer.MIN_VALUE ? i14 : i10;
        int i17 = i11 == Integer.MIN_VALUE ? i15 : i11;
        ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.d.b(this.f33918d, inputStream, this.f33917c);
        h3.d dVar = this.f33915a;
        if (i14 <= 0 || i15 <= 0) {
            z13 = z18;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeB + " with target [" + i16 + "x" + i17 + "]");
            }
        } else {
            z13 = z18;
            float fB = (c10 == 'Z' || c10 == 270) ? jVar.b(i15, i14, i16, i17) : jVar.b(i14, i15, i16, i17);
            if (fB <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot scale with factor: ");
                sb2.append(fB);
                sb2.append(" from: ");
                sb2.append(jVar);
                sb2.append(", source: [");
                v1.b.a(sb2, i14, "x", i15, "], target: [");
                sb2.append(i16);
                sb2.append("x");
                sb2.append(i17);
                sb2.append("]");
                throw new IllegalArgumentException(sb2.toString());
            }
            j.g gVarA = jVar.a(i14, i15, i16, i17);
            if (gVarA == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f10 = i14;
            float f11 = i15;
            int i18 = i16;
            int i19 = i17;
            int iJ = i14 / j(fB * f10);
            int iJ2 = i15 / j(fB * f11);
            j.g gVar = j.g.MEMORY;
            int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iJ, iJ2) : Math.min(iJ, iJ2)));
            if (gVarA == gVar && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeB == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f10 / fMin);
                iFloor2 = (int) Math.ceil(f11 / fMin);
                int i20 = iMax / 8;
                if (i20 > 0) {
                    iFloor /= i20;
                    iFloor2 /= i20;
                }
            } else if (imageTypeB == ImageHeaderParser.ImageType.PNG || imageTypeB == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = iMax;
                iFloor = (int) Math.floor(f10 / f12);
                iFloor2 = (int) Math.floor(f11 / f12);
            } else if (imageTypeB == ImageHeaderParser.ImageType.WEBP || imageTypeB == ImageHeaderParser.ImageType.WEBP_A) {
                float f13 = iMax;
                iFloor = Math.round(f10 / f13);
                iFloor2 = Math.round(f11 / f13);
            } else if (i14 % iMax == 0 && i15 % iMax == 0) {
                iFloor = i14 / iMax;
                iFloor2 = i15 / iMax;
            } else {
                int[] iArrF2 = f(inputStream, options, bVar2, dVar);
                iFloor = iArrF2[0];
                iFloor2 = iArrF2[1];
            }
            i16 = i18;
            i17 = i19;
            double dB = jVar.b(iFloor, iFloor2, i16, i17);
            int iE = e(dB);
            int iJ3 = j(((double) iE) * dB);
            int i21 = iMax;
            int i22 = iFloor2;
            options.inTargetDensity = j((dB / ((double) (iJ3 / iE))) * ((double) iJ3));
            int iE2 = e(dB);
            options.inDensity = iE2;
            int i23 = options.inTargetDensity;
            if (i23 > 0 && iE2 > 0 && i23 != iE2) {
                options.inScaled = true;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbA = androidx.recyclerview.widget.o.a("Calculate scaling, source: [", i14, "x", i15, "], target: [");
                v1.b.a(sbA, i16, "x", i17, "], power of two scaled: [");
                v1.b.a(sbA, iFloor, "x", i22, "], exact scale factor: ");
                sbA.append(fB);
                sbA.append(", power of 2 sample size: ");
                sbA.append(i21);
                sbA.append(", adjusted scale factor: ");
                sbA.append(dB);
                sbA.append(", target density: ");
                sbA.append(options.inTargetDensity);
                sbA.append(", density: ");
                sbA.append(options.inDensity);
                Log.v("Downsampler", sbA.toString());
            }
        }
        p pVar = this.f33919e;
        Objects.requireNonNull(pVar);
        if (!z13 || Build.VERSION.SDK_INT < 26 || z12) {
            z14 = false;
            z15 = false;
        } else {
            if (i16 < 128 || i17 < 128) {
                z14 = false;
            } else {
                synchronized (pVar) {
                    int i24 = pVar.f33926a + 1;
                    pVar.f33926a = i24;
                    if (i24 >= 50) {
                        pVar.f33926a = 0;
                        int length = p.f33924c.list().length;
                        pVar.f33927b = length < 700;
                        if (!pVar.f33927b && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
                        }
                    }
                    z17 = pVar.f33927b;
                }
                if (z17) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (z14) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                z15 = false;
                options.inMutable = false;
            } else {
                z15 = false;
            }
        }
        if (z14) {
            z16 = true;
        } else if (bVar != com.bumptech.glide.load.b.PREFER_ARGB_8888) {
            try {
                zHasAlpha = com.bumptech.glide.load.d.b(this.f33918d, inputStream, this.f33917c).hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                }
                zHasAlpha = z15;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z16 = true;
                options.inDither = true;
            } else {
                z16 = true;
            }
        } else {
            z16 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        int i25 = Build.VERSION.SDK_INT;
        int i26 = options.inSampleSize;
        if (i14 < 0 || i15 < 0 || !z11) {
            int i27 = options.inTargetDensity;
            float f14 = (i27 <= 0 || (i12 = options.inDensity) <= 0 || i27 == i12) ? z15 : z16 ? i27 / options.inDensity : 1.0f;
            float f15 = i26;
            int iCeil = (int) Math.ceil(i14 / f15);
            int iCeil2 = (int) Math.ceil(i15 / f15);
            int iRound = Math.round(iCeil * f14);
            int iRound2 = Math.round(iCeil2 * f14);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbA2 = androidx.recyclerview.widget.o.a("Calculated target [", iRound, "x", iRound2, "] for source [");
                v1.b.a(sbA2, i14, "x", i15, "], sampleSize: ");
                sbA2.append(i26);
                sbA2.append(", targetDensity: ");
                sbA2.append(options.inTargetDensity);
                sbA2.append(", density: ");
                sbA2.append(options.inDensity);
                sbA2.append(", density multiplier: ");
                sbA2.append(f14);
                Log.v("Downsampler", sbA2.toString());
            }
            i16 = iRound;
            i17 = iRound2;
        }
        ?? r10 = 0;
        if (i16 > 0 && i17 > 0) {
            h3.d dVar2 = this.f33915a;
            if (i25 < 26) {
                config = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = dVar2.c(i16, i17, config);
        }
        ?? C = c(inputStream, options, bVar2, this.f33915a);
        bVar2.a(this.f33915a, C);
        if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder sbA3 = defpackage.a.a("Decoded ");
            sbA3.append(d(C));
            sbA3.append(" from [");
            sbA3.append(i14);
            sbA3.append("x");
            sbA3.append(i15);
            v.e.a(sbA3, "] ", str, " with inBitmap ");
            sbA3.append(d(options.inBitmap));
            sbA3.append(" for [");
            sbA3.append(i10);
            sbA3.append("x");
            sbA3.append(i11);
            sbA3.append("], sample size: ");
            sbA3.append(options.inSampleSize);
            sbA3.append(", density: ");
            sbA3.append(options.inDensity);
            sbA3.append(", target density: ");
            sbA3.append(options.inTargetDensity);
            sbA3.append(", thread: ");
            sbA3.append(Thread.currentThread().getName());
            sbA3.append(", duration: ");
            sbA3.append(b4.f.a(jElapsedRealtimeNanos));
            Log.v("Downsampler", sbA3.toString());
        }
        if (C != 0) {
            C.setDensity(this.f33916b.densityDpi);
            h3.d dVar3 = this.f33915a;
            switch (iA) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    z15 = z16;
                    break;
            }
            if (z15) {
                Matrix matrix = new Matrix();
                switch (iA) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, C.getWidth(), C.getHeight());
                matrix.mapRect(rectF);
                Bitmap bitmapE = dVar3.e(Math.round(rectF.width()), Math.round(rectF.height()), u.c(C));
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapE.setHasAlpha(C.hasAlpha());
                u.a(C, bitmapE, matrix);
                r10 = bitmapE;
            } else {
                r10 = C;
            }
            if (!C.equals(r10)) {
                this.f33915a.d(C);
            }
        }
        return r10;
    }
}
