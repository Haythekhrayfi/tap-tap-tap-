package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.metrica.impl.ob.B2;
import com.yandex.metrica.impl.ob.C1645g0;
import com.yandex.metrica.impl.ob.C1670h0;
import com.yandex.metrica.impl.ob.Ee;
import com.yandex.metrica.impl.ob.Fe;
import com.yandex.metrica.impl.ob.N3;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.O3;

/* JADX INFO: loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13464c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UriMatcher f13465d = new UriMatcher(-1);

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        B2.b("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f13464c = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b A[PHI: r0 r6
  0x006b: PHI (r0v8 android.content.Context) = (r0v6 android.content.Context), (r0v12 android.content.Context) binds: [B:24:0x0069, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r6v3 com.yandex.metrica.impl.ob.h0) = (r6v2 com.yandex.metrica.impl.ob.h0), (r6v4 com.yandex.metrica.impl.ob.h0) binds: [B:24:0x0069, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        C1670h0 c1670h0;
        Context applicationContext;
        synchronized (this) {
            if (this.f13464c) {
                return null;
            }
            if (contentValues != null) {
                int iMatch = this.f13465d.match(uri);
                if (iMatch == 1) {
                    c1670h0 = new C1670h0(new Ee(), new Fe(), new O0(), "preload info");
                    Context context = getContext();
                    applicationContext = context == null ? null : context.getApplicationContext();
                    if (applicationContext != null) {
                        c1670h0.a(applicationContext, contentValues);
                    }
                } else if (iMatch != 2) {
                    B2.b("Bad content provider uri: %s", uri);
                } else {
                    c1670h0 = new C1670h0(new N3(), new O3(), new O0(), "clids");
                    Context context2 = getContext();
                    applicationContext = context2 == null ? null : context2.getApplicationContext();
                    if (applicationContext != null) {
                        c1670h0.a(applicationContext, contentValues);
                    }
                }
            }
            C1645g0.a();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String strA = i.f.a(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f13465d.addURI(strA, "preloadinfo", 1);
        this.f13465d.addURI(strA, "clids", 2);
        C1645g0.a(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        B2.b("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        B2.b("Updating is not supported", new Object[0]);
        return -1;
    }
}
