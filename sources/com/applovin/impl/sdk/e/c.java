package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f10525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f10526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f10528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f10530k;

    public interface a {
        void a(Uri uri);
    }

    public c(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.d.e eVar2, com.applovin.impl.sdk.o oVar, a aVar) {
        this(str, eVar, eVar.L(), true, eVar2, oVar, aVar);
    }

    public c(String str, com.applovin.impl.sdk.ad.e eVar, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar2, com.applovin.impl.sdk.o oVar, a aVar) {
        super("AsyncTaskCacheResource", oVar);
        this.f10524e = str;
        this.f10525f = eVar;
        this.f10526g = list;
        this.f10527h = z10;
        this.f10528i = eVar2;
        this.f10529j = oVar;
        this.f10530k = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f10500d.get() || (aVar = this.f10530k) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws Exception {
        if (this.f10500d.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f10529j.S().a(a(), this.f10524e, this.f10525f.O(), this.f10526g, this.f10527h, this.f10528i);
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10500d.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f10529j.S().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10499c.e(this.f10498b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10500d.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10499c.e(this.f10498b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10500d.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }
}
