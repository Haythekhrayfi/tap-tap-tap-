package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f9693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f9694b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f9695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<c> f9696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<c> f9697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<c> f9698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SpannedString f9699h;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public b(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(context);
        this.f9693a = bVar;
        if (bVar.a() == com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f9699h = new SpannedString(spannableString);
        } else {
            this.f9699h = new SpannedString("");
        }
        this.f9694b = c();
        this.f9695d = a(bVar.r());
        this.f9696e = h();
        this.f9697f = b(bVar.s());
        this.f9698g = i();
        notifyDataSetChanged();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private c a(com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b enumC0129b) {
        c.a aVarP = c.p();
        if (enumC0129b == com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b.READY) {
            aVarP.a(this.f9751c);
        }
        return aVarP.a("Test Mode").b(enumC0129b.a()).b(enumC0129b.b()).c("Restart Required").d(enumC0129b.c()).a(true).a();
    }

    private c a(String str, String str2, boolean z10, boolean z11) {
        return c.a(z10 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(str).b(z10 ? null : this.f9699h).c("Instructions").d(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : b(z11)).c(z10 ? g.a(R.color.applovin_sdk_checkmarkColor, this.f9751c) : d(z11)).a(!z10).a();
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.c.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.c cVar : list) {
                arrayList.add(a(cVar.a(), cVar.b(), cVar.c(), true));
            }
        }
        return arrayList;
    }

    private int b(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.b.c.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.a aVar : list) {
                arrayList.add(a(aVar.a(), aVar.b(), aVar.c(), true));
            }
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f9751c);
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private List<c> c() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        CollectionUtils.addObjectIfExists(g(), arrayList);
        return arrayList;
    }

    private int d(boolean z10) {
        return g.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f9751c);
    }

    private c d() {
        c.a aVarB = c.p().a("SDK").b(this.f9693a.j());
        if (TextUtils.isEmpty(this.f9693a.j())) {
            aVarB.a(a(this.f9693a.d())).c(c(this.f9693a.d()));
        }
        return aVarB.a();
    }

    private String e(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
            return "Failure";
        }
        return MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private c f() {
        c.a aVarB = c.p().a("Adapter").b(this.f9693a.k());
        if (TextUtils.isEmpty(this.f9693a.k())) {
            aVarB.a(a(this.f9693a.e())).c(c(this.f9693a.e()));
        }
        return aVarB.a();
    }

    private c g() {
        if (this.f9693a.u()) {
            return null;
        }
        return c.p().a("Initialization Status").b(e(this.f9693a.b())).a(false).a();
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f9693a.t()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration", o.aw(), true));
        }
        return arrayList;
    }

    private List<c> i() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f9693a.w())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.f9693a.w()).a());
        }
        if (this.f9693a.c() == com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f9693a.n() != null) {
            arrayList.add(c(this.f9693a.n()));
        }
        if (this.f9693a.x()) {
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.f9751c) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f9751c), false));
        }
        arrayList.add(a(this.f9693a.c()));
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        List<c> list;
        if (i10 == a.INTEGRATIONS.ordinal()) {
            list = this.f9694b;
        } else if (i10 == a.PERMISSIONS.ordinal()) {
            list = this.f9695d;
        } else if (i10 == a.CONFIGURATION.ordinal()) {
            list = this.f9696e;
        } else {
            list = i10 == a.DEPENDENCIES.ordinal() ? this.f9697f : this.f9698g;
        }
        return list.size();
    }

    public com.applovin.impl.mediation.debugger.b.c.b a() {
        return this.f9693a;
    }

    public boolean a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return aVar.a() == a.TEST_ADS.ordinal() && aVar.b() == this.f9698g.size() - 1;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public c b(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new e("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new e("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new e("CONFIGURATION");
        }
        return i10 == a.DEPENDENCIES.ordinal() ? new e("DEPENDENCIES") : new e("TEST ADS");
    }

    public void b() {
        this.f9694b = c();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<c> c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f9694b;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f9695d;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f9696e;
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f9697f : this.f9698g;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return a.COUNT.ordinal();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
