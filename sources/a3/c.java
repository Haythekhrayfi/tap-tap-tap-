package a3;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import g3.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l3.s;
import l3.u;
import l3.v;
import l3.x;
import o3.n;
import o3.t;
import o3.w;

/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile c f11k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f12l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3.d f13c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3.h f14d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f15e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f16f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h3.b f17g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u3.j f18h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u3.c f19i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<j> f20j = new ArrayList();

    public c(Context context, l lVar, i3.h hVar, h3.d dVar, h3.b bVar, u3.j jVar, u3.c cVar, int i10, x3.e eVar, Map<Class<?>, k<?, ?>> map, List<x3.d<Object>> list, boolean z10) {
        f fVar = f.NORMAL;
        this.f13c = dVar;
        this.f17g = bVar;
        this.f14d = hVar;
        this.f18h = jVar;
        this.f19i = cVar;
        new k3.a(hVar, dVar, (com.bumptech.glide.load.b) eVar.f37441s.c(o3.k.f33910f));
        Resources resources = context.getResources();
        h hVar2 = new h();
        this.f16f = hVar2;
        o3.i iVar = new o3.i();
        w3.b bVar2 = hVar2.f52g;
        synchronized (bVar2) {
            bVar2.f37092a.add(iVar);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            n nVar = new n();
            w3.b bVar3 = hVar2.f52g;
            synchronized (bVar3) {
                bVar3.f37092a.add(nVar);
            }
        }
        List<ImageHeaderParser> listE = hVar2.e();
        o3.k kVar = new o3.k(listE, resources.getDisplayMetrics(), dVar, bVar);
        s3.a aVar = new s3.a(context, listE, dVar, bVar);
        w wVar = new w(dVar, new w.f());
        o3.f fVar2 = new o3.f(kVar);
        t tVar = new t(kVar, bVar);
        q3.d dVar2 = new q3.d(context);
        s.c cVar2 = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar4 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        o3.c cVar3 = new o3.c(bVar);
        t3.a aVar3 = new t3.a();
        t3.d dVar4 = new t3.d();
        ContentResolver contentResolver = context.getContentResolver();
        hVar2.a(ByteBuffer.class, new l3.c());
        hVar2.a(InputStream.class, new l3.t(bVar));
        hVar2.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar2);
        hVar2.d("Bitmap", InputStream.class, Bitmap.class, tVar);
        hVar2.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, wVar);
        hVar2.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new w(dVar, new w.c(null)));
        v.a<?> aVar4 = v.a.f32200a;
        hVar2.c(Bitmap.class, Bitmap.class, aVar4);
        hVar2.d("Bitmap", Bitmap.class, Bitmap.class, new o3.v());
        hVar2.b(Bitmap.class, cVar3);
        hVar2.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new o3.a(resources, fVar2));
        hVar2.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new o3.a(resources, tVar));
        hVar2.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new o3.a(resources, wVar));
        hVar2.b(BitmapDrawable.class, new o3.b(dVar, cVar3));
        hVar2.d("Gif", InputStream.class, s3.c.class, new s3.j(listE, aVar, bVar));
        hVar2.d("Gif", ByteBuffer.class, s3.c.class, aVar);
        hVar2.b(s3.c.class, new s3.d());
        hVar2.c(c3.a.class, c3.a.class, aVar4);
        hVar2.d("Bitmap", c3.a.class, Bitmap.class, new s3.h(dVar));
        hVar2.d("legacy_append", Uri.class, Drawable.class, dVar2);
        hVar2.d("legacy_append", Uri.class, Bitmap.class, new o3.s(dVar2, dVar));
        hVar2.g(new p3.a.C0384a());
        hVar2.c(File.class, ByteBuffer.class, new l3.d.b());
        hVar2.c(File.class, InputStream.class, new l3.f.e());
        hVar2.d("legacy_append", File.class, File.class, new r3.a());
        hVar2.c(File.class, ParcelFileDescriptor.class, new l3.f.b());
        hVar2.c(File.class, File.class, aVar4);
        hVar2.g(new e3.k.a(bVar));
        Class cls = Integer.TYPE;
        hVar2.c(cls, InputStream.class, cVar2);
        hVar2.c(cls, ParcelFileDescriptor.class, bVar4);
        hVar2.c(Integer.class, InputStream.class, cVar2);
        hVar2.c(Integer.class, ParcelFileDescriptor.class, bVar4);
        hVar2.c(Integer.class, Uri.class, dVar3);
        hVar2.c(cls, AssetFileDescriptor.class, aVar2);
        hVar2.c(Integer.class, AssetFileDescriptor.class, aVar2);
        hVar2.c(cls, Uri.class, dVar3);
        hVar2.c(String.class, InputStream.class, new l3.e.c());
        hVar2.c(Uri.class, InputStream.class, new l3.e.c());
        hVar2.c(String.class, InputStream.class, new u.c());
        hVar2.c(String.class, ParcelFileDescriptor.class, new u.b());
        hVar2.c(String.class, AssetFileDescriptor.class, new u.a());
        hVar2.c(Uri.class, InputStream.class, new m3.b.a());
        hVar2.c(Uri.class, InputStream.class, new l3.a.c(context.getAssets()));
        hVar2.c(Uri.class, ParcelFileDescriptor.class, new l3.a.b(context.getAssets()));
        hVar2.c(Uri.class, InputStream.class, new m3.c.a(context));
        hVar2.c(Uri.class, InputStream.class, new m3.d.a(context));
        hVar2.c(Uri.class, InputStream.class, new l3.w.d(contentResolver));
        hVar2.c(Uri.class, ParcelFileDescriptor.class, new l3.w.b(contentResolver));
        hVar2.c(Uri.class, AssetFileDescriptor.class, new l3.w.a(contentResolver));
        hVar2.c(Uri.class, InputStream.class, new x.a());
        hVar2.c(URL.class, InputStream.class, new m3.e.a());
        hVar2.c(Uri.class, File.class, new l3.k.a(context));
        hVar2.c(l3.g.class, InputStream.class, new m3.a.C0354a());
        hVar2.c(byte[].class, ByteBuffer.class, new l3.b.a());
        hVar2.c(byte[].class, InputStream.class, new l3.b.d());
        hVar2.c(Uri.class, Uri.class, aVar4);
        hVar2.c(Drawable.class, Drawable.class, aVar4);
        hVar2.d("legacy_append", Drawable.class, Drawable.class, new q3.e());
        hVar2.h(Bitmap.class, BitmapDrawable.class, new t3.b(resources));
        hVar2.h(Bitmap.class, byte[].class, aVar3);
        hVar2.h(Drawable.class, byte[].class, new t3.c(dVar, aVar3, dVar4));
        hVar2.h(s3.c.class, byte[].class, dVar4);
        this.f15e = new e(context, bVar, hVar2, new y3.e(), eVar, map, list, lVar, z10, i10);
    }

    public static void a(Context context) {
        a aVar;
        if (f12l) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f12l = true;
        d dVar = new d();
        Context applicationContext = context.getApplicationContext();
        try {
            aVar = (a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            aVar = null;
        } catch (IllegalAccessException e10) {
            c(e10);
            throw null;
        } catch (InstantiationException e11) {
            c(e11);
            throw null;
        } catch (NoSuchMethodException e12) {
            c(e12);
            throw null;
        } catch (InvocationTargetException e13) {
            c(e13);
            throw null;
        }
        Collections.emptyList();
        v3.e eVar = new v3.e(applicationContext);
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList<v3.c> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = eVar.f36668a.getPackageManager().getApplicationInfo(eVar.f36668a.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(v3.e.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (aVar != null && !aVar.c().isEmpty()) {
                Set<Class<?>> setC = aVar.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v3.c cVar = (v3.c) it.next();
                    if (setC.contains(cVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (v3.c cVar2 : arrayList) {
                    StringBuilder sbA = defpackage.a.a("Discovered GlideModule from manifest: ");
                    sbA.append(cVar2.getClass());
                    Log.d("Glide", sbA.toString());
                }
            }
            dVar.f33m = null;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((v3.c) it2.next()).b(applicationContext, dVar);
            }
            if (dVar.f26f == null) {
                int iA = j3.a.a();
                dVar.f26f = new j3.a(new ThreadPoolExecutor(iA, iA, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new j3.a.ThreadFactoryC0319a("source", j3.a.b.f31707a, false)));
            }
            if (dVar.f27g == null) {
                dVar.f27g = new j3.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new j3.a.ThreadFactoryC0319a("disk-cache", j3.a.b.f31707a, true)));
            }
            if (dVar.f34n == null) {
                dVar.f34n = j3.a.b();
            }
            if (dVar.f29i == null) {
                dVar.f29i = new i3.i(new i3.i.a(applicationContext));
            }
            if (dVar.f30j == null) {
                dVar.f30j = new u3.e();
            }
            if (dVar.f23c == null) {
                int i10 = dVar.f29i.f31230a;
                if (i10 > 0) {
                    dVar.f23c = new h3.j(i10);
                } else {
                    dVar.f23c = new h3.e();
                }
            }
            if (dVar.f24d == null) {
                dVar.f24d = new h3.i(dVar.f29i.f31233d);
            }
            if (dVar.f25e == null) {
                dVar.f25e = new i3.g(dVar.f29i.f31231b);
            }
            if (dVar.f28h == null) {
                dVar.f28h = new i3.f(applicationContext);
            }
            if (dVar.f22b == null) {
                dVar.f22b = new l(dVar.f25e, dVar.f28h, dVar.f27g, dVar.f26f, new j3.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, j3.a.f31699d, TimeUnit.MILLISECONDS, new SynchronousQueue(), new j3.a.ThreadFactoryC0319a("source-unlimited", j3.a.b.f31707a, false))), j3.a.b(), false);
            }
            List<x3.d<Object>> list = dVar.f35o;
            dVar.f35o = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            u3.j jVar = new u3.j(dVar.f33m);
            l lVar = dVar.f22b;
            i3.h hVar = dVar.f25e;
            h3.d dVar2 = dVar.f23c;
            h3.b bVar = dVar.f24d;
            u3.c cVar3 = dVar.f30j;
            int i11 = dVar.f31k;
            x3.e eVar2 = dVar.f32l;
            eVar2.f37444v = true;
            c cVar4 = new c(applicationContext, lVar, hVar, dVar2, bVar, jVar, cVar3, i11, eVar2, dVar.f21a, dVar.f35o, false);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((v3.c) it3.next()).a(applicationContext, cVar4, cVar4.f16f);
            }
            applicationContext.registerComponentCallbacks(cVar4);
            f11k = cVar4;
            f12l = false;
        } catch (PackageManager.NameNotFoundException e14) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e14);
        }
    }

    public static c b(Context context) {
        if (f11k == null) {
            synchronized (c.class) {
                if (f11k == null) {
                    a(context);
                }
            }
        }
        return f11k;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static j d(androidx.fragment.app.n nVar) {
        return b(nVar).f18h.b(nVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b4.j.a();
        ((b4.g) this.f14d).e(0L);
        this.f13c.b();
        this.f17g.b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        long j10;
        b4.j.a();
        i3.g gVar = (i3.g) this.f14d;
        Objects.requireNonNull(gVar);
        if (i10 >= 40) {
            gVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (gVar) {
                j10 = gVar.f3301b;
            }
            gVar.e(j10 / 2);
        }
        this.f13c.a(i10);
        this.f17g.a(i10);
    }
}
