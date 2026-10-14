package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.j;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.impl.ef0;
import com.yandex.mobile.ads.impl.ma;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.p60;
import com.yandex.mobile.ads.impl.s90;
import com.yandex.mobile.ads.impl.u6;
import com.yandex.mobile.ads.impl.u90;
import com.yandex.mobile.ads.impl.we0;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        j0.i(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        j0.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        j0.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        if (u6.a(context)) {
            ef0.a aVarA = ef0.a(context, BuildConfigFieldProvider.isInternalOrAutotestBuild());
            if (aVarA instanceof ef0.a.b) {
                o60.a(p60.a((ef0.a.b) aVarA), new Object[0]);
            } else if (aVarA instanceof ef0.a.C0206a) {
                o60.b(j.a("Yandex Mobile Ads ", BuildConfigFieldProvider.getVersion(), " integrated successfully"), new Object[0]);
            }
            new we0(BuildConfigFieldProvider.isInternalOrAutotestBuild()).a();
        }
        u90 u90Var = new u90();
        Boolean boolA = u90.a(context);
        if (boolA != null) {
            MobileAds.setAgeRestrictedUser(boolA.booleanValue());
        }
        new ma(new s90(), u90Var).a(context);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        j0.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        j0.i(uri, "uri");
        return 0;
    }
}
