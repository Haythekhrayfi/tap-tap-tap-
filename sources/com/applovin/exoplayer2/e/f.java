package com.applovin.exoplayer2.e;

import android.net.Uri;
import com.applovin.exoplayer2.e.i.ac;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f5414b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor<? extends h> f5415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5424l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5426n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5425m = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5427o = 112800;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f5415c = constructor;
    }

    private void a(int i10, List<h> list) {
        h aVar;
        switch (i10) {
            case 0:
                aVar = new com.applovin.exoplayer2.e.i.a();
                break;
            case 1:
                aVar = new com.applovin.exoplayer2.e.i.c();
                break;
            case 2:
                aVar = new com.applovin.exoplayer2.e.i.e((this.f5417e ? 2 : 0) | ((this.f5418f | (this.f5416d ? 1 : 0)) == true ? 1 : 0));
                break;
            case 3:
                aVar = new com.applovin.exoplayer2.e.a.a((this.f5417e ? 2 : 0) | this.f5419g | (this.f5416d ? 1 : 0));
                break;
            case 4:
                Constructor<? extends h> constructor = f5415c;
                if (constructor == null) {
                    aVar = new com.applovin.exoplayer2.e.b.b(this.f5420h);
                    break;
                } else {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f5420h)));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                }
                break;
            case 5:
                aVar = new com.applovin.exoplayer2.e.c.b();
                break;
            case 6:
                aVar = new com.applovin.exoplayer2.e.e.d(this.f5421i);
                break;
            case 7:
                aVar = new com.applovin.exoplayer2.e.f.d((this.f5417e ? 2 : 0) | this.f5424l | (this.f5416d ? 1 : 0));
                break;
            case 8:
                list.add(new com.applovin.exoplayer2.e.g.e(this.f5423k));
                aVar = new com.applovin.exoplayer2.e.g.g(this.f5422j);
                break;
            case 9:
                aVar = new com.applovin.exoplayer2.e.h.c();
                break;
            case 10:
                aVar = new com.applovin.exoplayer2.e.i.w();
                break;
            case 11:
                aVar = new ac(this.f5425m, this.f5426n, this.f5427o);
                break;
            case 12:
                aVar = new com.applovin.exoplayer2.e.j.a();
                break;
            case 13:
            default:
                return;
            case 14:
                aVar = new com.applovin.exoplayer2.e.d.a();
                break;
        }
        list.add(aVar);
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iA = com.applovin.exoplayer2.l.l.a(map);
        if (iA != -1) {
            a(iA, arrayList);
        }
        int iA2 = com.applovin.exoplayer2.l.l.a(uri);
        if (iA2 != -1 && iA2 != iA) {
            a(iA2, arrayList);
        }
        for (int i10 : f5414b) {
            if (i10 != iA && i10 != iA2) {
                a(i10, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }
}
