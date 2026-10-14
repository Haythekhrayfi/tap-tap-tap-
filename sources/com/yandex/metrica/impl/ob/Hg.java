package com.yandex.metrica.impl.ob;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class Hg implements Callable<Fg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ig f14147a;

    public Hg(Ig ig) {
        this.f14147a = ig;
    }

    @Override // java.util.concurrent.Callable
    public Fg call() throws Exception {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f14147a.f14217a.getContentResolver();
        Ig ig = this.f14147a;
        ig.f14218b = contentResolver.query(uri, null, null, new String[]{ig.f14217a.getPackageName()}, null);
        if (this.f14147a.f14218b != null && this.f14147a.f14218b.moveToFirst()) {
            String string = this.f14147a.f14218b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new Fg(string, this.f14147a.f14218b.getLong(1), this.f14147a.f14218b.getLong(2), Fg.a.HMS);
            }
        }
        return null;
    }
}
