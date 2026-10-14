package com.applovin.impl.mediation.debugger.c;

import android.text.TextUtils;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9535a;

    public interface a {
        void a(com.applovin.impl.mediation.debugger.a.b bVar);

        void a(String str);
    }

    public b(o oVar, a aVar) {
        super("TaskFetchDeveloperUri", oVar);
        this.f9535a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f10534f.M() != null ? this.f10534f.L().B().d() : this.f10534f.K().h().get("package_name"));
        if (y.a()) {
            a0.a("Looking up developer URI for package name: ", strValueOf, this.f10536h, this.f10535g);
        }
        this.f10534f.G().a((d) new x<String>(com.applovin.impl.sdk.network.c.a(this.f10534f).b("GET").a("https://play.google.com/store/apps/details?id=" + strValueOf).a("").d(false).a(), this.f10534f) { // from class: com.applovin.impl.mediation.debugger.c.b.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, String str2) {
                if (y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to fetch developer URI due to: " + str + ", and received error code: " + i10);
                }
                b.this.f9535a.a(com.applovin.impl.mediation.debugger.a.b.DEVELOPER_URI_NOT_FOUND);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(String str, int i10) {
                if (TextUtils.isEmpty(str)) {
                    if (y.a()) {
                        this.f10536h.e(this.f10535g, "No developer URI found - response is empty");
                    }
                    b.this.f9535a.a(com.applovin.impl.mediation.debugger.a.b.DEVELOPER_URI_NOT_FOUND);
                }
                Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str);
                if (!matcher.find()) {
                    if (y.a()) {
                        this.f10536h.e(this.f10535g, "Unable to find developer URI from the Play Store listing metadata");
                    }
                    b.this.f9535a.a(com.applovin.impl.mediation.debugger.a.b.DEVELOPER_URI_NOT_FOUND);
                } else {
                    String strGroup = matcher.group();
                    if (y.a()) {
                        a0.a("Found developer URI: ", strGroup, this.f10536h, this.f10535g);
                    }
                    b.this.f9535a.a(strGroup);
                }
            }
        });
    }
}
