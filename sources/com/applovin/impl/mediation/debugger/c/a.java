package com.applovin.impl.mediation.debugger.c;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0130a f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9533c;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0130a {
        void a(com.applovin.impl.mediation.debugger.a.b bVar, String str);

        void a(String str, String str2);
    }

    public a(o oVar, String str, InterfaceC0130a interfaceC0130a) {
        super("TaskFetchAppAdsContent", oVar);
        this.f9532b = str;
        this.f9531a = interfaceC0130a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri uri = Uri.parse(this.f9532b);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(uri.getAuthority()).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.c cVarA = com.applovin.impl.sdk.network.c.a(this.f10534f).b("GET").a(uriBuild.toString()).c(new Uri.Builder().scheme("http").authority(uri.getAuthority()).appendPath("app-ads.txt").build().toString()).a("").d(false).a();
        this.f9533c = uriBuild.toString();
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Looking up app-ads.txt at ");
            sbA.append(this.f9533c);
            yVar.b(str, sbA.toString());
        }
        this.f10534f.G().a((d) new x<String>(cVarA, this.f10534f) { // from class: com.applovin.impl.mediation.debugger.c.a.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str2, String str3) {
                if (y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
                }
                a.this.f9531a.a(com.applovin.impl.mediation.debugger.a.b.APPADSTXT_NOT_FOUND, a.this.f9533c);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(String str2, int i10) {
                if (TextUtils.isEmpty(str2)) {
                    if (y.a()) {
                        this.f10536h.e(this.f10535g, "No app-ads.txt found");
                    }
                    a.this.f9531a.a(com.applovin.impl.mediation.debugger.a.b.APPADSTXT_NOT_FOUND, a.this.f9533c);
                } else {
                    if (y.a()) {
                        this.f10536h.b(this.f10535g, "Found app-ads.txt");
                    }
                    a.this.f9531a.a(str2, a.this.f9533c);
                }
            }
        });
    }
}
