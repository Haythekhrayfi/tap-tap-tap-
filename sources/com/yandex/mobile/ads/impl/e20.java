package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class e20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xw0 f20036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f20037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f20038c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, a> f20039d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f20040e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f20041f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mw0<?> f20042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f20043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private bi1 f20044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f20045d;

        public a(h20 h20Var, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.f20045d = arrayList;
            this.f20042a = h20Var;
            arrayList.add(cVar);
        }

        public final bi1 a() {
            return this.f20044c;
        }

        public final void a(bi1 bi1Var) {
            this.f20044c = bi1Var;
        }

        public final void a(c cVar) {
            this.f20045d.add(cVar);
        }

        public final boolean b(c cVar) {
            this.f20045d.remove(cVar);
            if (this.f20045d.size() != 0) {
                return false;
            }
            this.f20042a.a();
            return true;
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bitmap f20046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f20047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f20048c;

        public c(Bitmap bitmap, String str, d dVar) {
            this.f20046a = bitmap;
            this.f20048c = str;
            this.f20047b = dVar;
        }

        public final void a() {
            HashMap map;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.f20047b == null) {
                return;
            }
            a aVar = (a) e20.this.f20038c.get(this.f20048c);
            if (aVar == null) {
                a aVar2 = (a) e20.this.f20039d.get(this.f20048c);
                if (aVar2 == null) {
                    return;
                }
                aVar2.b(this);
                if (aVar2.f20045d.size() != 0) {
                    return;
                } else {
                    map = e20.this.f20039d;
                }
            } else if (!aVar.b(this)) {
                return;
            } else {
                map = e20.this.f20038c;
            }
            map.remove(this.f20048c);
        }

        public final Bitmap b() {
            return this.f20046a;
        }
    }

    public interface d extends gx0.a {
        void a(c cVar, boolean z10);
    }

    public e20(xw0 xw0Var, b bVar) {
        this.f20036a = xw0Var;
        this.f20037b = bVar;
    }

    public final c a(String str, d dVar) {
        return a(str, dVar, 0, 0);
    }

    public final c a(String str, d dVar, int i10, int i11) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        String strA = a(str, scaleType);
        Bitmap bitmapA = this.f20037b.a(strA);
        if (bitmapA != null) {
            c cVar = new c(bitmapA, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, strA, dVar);
        dVar.a(cVar2, true);
        a aVar = this.f20038c.get(strA);
        if (aVar == null) {
            aVar = this.f20039d.get(strA);
        }
        if (aVar != null) {
            aVar.a(cVar2);
        } else {
            h20 h20Var = new h20(str, new b20(this, strA), i10, i11, scaleType, Bitmap.Config.RGB_565, new c20(this, strA));
            this.f20036a.a(h20Var);
            this.f20038c.put(strA, new a(h20Var, cVar2));
        }
        return cVar2;
    }

    public String a(String str, ImageView.ScaleType scaleType) {
        throw null;
    }

    public final void a(String str, Bitmap bitmap) {
        this.f20037b.a(str, bitmap);
        a aVarRemove = this.f20038c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.f20043b = bitmap;
            this.f20039d.put(str, aVarRemove);
            if (this.f20041f == null) {
                d20 d20Var = new d20(this);
                this.f20041f = d20Var;
                this.f20040e.postDelayed(d20Var, 100);
            }
        }
    }

    public final void a(String str, bi1 bi1Var) {
        a aVarRemove = this.f20038c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.a(bi1Var);
            this.f20039d.put(str, aVarRemove);
            if (this.f20041f == null) {
                d20 d20Var = new d20(this);
                this.f20041f = d20Var;
                this.f20040e.postDelayed(d20Var, 100);
            }
        }
    }
}
