package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class AssetPackManagerFactory {
    public static synchronized AssetPackManager getInstance(Context context) {
        return db.a(context).a();
    }
}
