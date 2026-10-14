package h3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f30571j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f30573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30580i;

    public interface a {
    }

    public static final class b implements a {
    }

    public j(long j10) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f30575d = j10;
        this.f30572a = mVar;
        this.f30573b = setUnmodifiableSet;
        this.f30574c = new b();
    }

    @Override // h3.d
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0L);
        } else if (i10 >= 20 || i10 == 15) {
            i(this.f30575d / 2);
        }
    }

    @Override // h3.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // h3.d
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapH = h(i10, i11, config);
        if (bitmapH != null) {
            return bitmapH;
        }
        if (config == null) {
            config = f30571j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h3.d
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((m) this.f30572a);
                if (b4.j.d(bitmap) <= this.f30575d && this.f30573b.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((m) this.f30572a);
                    int iD = b4.j.d(bitmap);
                    ((m) this.f30572a).f(bitmap);
                    Objects.requireNonNull(this.f30574c);
                    this.f30579h++;
                    this.f30576e += (long) iD;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f30572a).e(bitmap));
                    }
                    f();
                    i(this.f30575d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f30572a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f30573b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h3.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapH = h(i10, i11, config);
        if (bitmapH != null) {
            bitmapH.eraseColor(0);
            return bitmapH;
        }
        if (config == null) {
            config = f30571j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder sbA = defpackage.a.a("Hits=");
        sbA.append(this.f30577f);
        sbA.append(", misses=");
        sbA.append(this.f30578g);
        sbA.append(", puts=");
        sbA.append(this.f30579h);
        sbA.append(", evictions=");
        sbA.append(this.f30580i);
        sbA.append(", currentSize=");
        sbA.append(this.f30576e);
        sbA.append(", maxSize=");
        sbA.append(this.f30575d);
        sbA.append("\nStrategy=");
        sbA.append(this.f30572a);
        Log.v("LruBitmapPool", sbA.toString());
    }

    public final synchronized Bitmap h(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        bitmapB = ((m) this.f30572a).b(i10, i11, config != null ? config : f30571j);
        if (bitmapB == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing bitmap=");
                Objects.requireNonNull((m) this.f30572a);
                sb2.append(m.c(b4.j.c(i10, i11, config), config));
                Log.d("LruBitmapPool", sb2.toString());
            }
            this.f30578g++;
        } else {
            this.f30577f++;
            long j10 = this.f30576e;
            Objects.requireNonNull((m) this.f30572a);
            this.f30576e = j10 - ((long) b4.j.d(bitmapB));
            Objects.requireNonNull(this.f30574c);
            bitmapB.setHasAlpha(true);
            bitmapB.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Get bitmap=");
            Objects.requireNonNull((m) this.f30572a);
            sb3.append(m.c(b4.j.c(i10, i11, config), config));
            Log.v("LruBitmapPool", sb3.toString());
        }
        f();
        return bitmapB;
    }

    public final synchronized void i(long j10) {
        while (this.f30576e > j10) {
            m mVar = (m) this.f30572a;
            Bitmap bitmapC = mVar.f30587b.c();
            if (bitmapC != null) {
                mVar.a(Integer.valueOf(b4.j.d(bitmapC)), bitmapC);
            }
            if (bitmapC == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f30576e = 0L;
                return;
            }
            Objects.requireNonNull(this.f30574c);
            long j11 = this.f30576e;
            Objects.requireNonNull((m) this.f30572a);
            this.f30576e = j11 - ((long) b4.j.d(bitmapC));
            this.f30580i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f30572a).e(bitmapC));
            }
            f();
            bitmapC.recycle();
        }
    }

    public j(long j10, Set<Bitmap.Config> set) {
        m mVar = new m();
        this.f30575d = j10;
        this.f30572a = mVar;
        this.f30573b = set;
        this.f30574c = new b();
    }
}
