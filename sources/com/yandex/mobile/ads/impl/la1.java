package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class la1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hw0 f22654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22655c;

    public enum a {
        f22656b("success"),
        f22657c("application_inactive"),
        f22658d("inconsistent_asset_value"),
        f22659e("no_ad_view"),
        f22660f("no_visible_ads"),
        f22661g("no_visible_required_assets"),
        f22662h("not_added_to_hierarchy"),
        f22663i("not_visible_for_percent"),
        f22664j("required_asset_can_not_be_visible"),
        f22665k("required_asset_is_not_subview"),
        f22666l("superview_hidden"),
        f22667m("too_small"),
        f22668n("visible_area_too_small");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22670a;

        a(String str) {
            this.f22670a = str;
        }

        public final String a() {
            return this.f22670a;
        }
    }

    public la1(a aVar, hw0 hw0Var) {
        this.f22653a = aVar;
        this.f22654b = hw0Var;
    }

    public final String a() {
        return this.f22655c;
    }

    public final void a(String str) {
        this.f22655c = str;
    }

    public final fw0.b b() {
        return this.f22654b.a();
    }

    public final fw0.b c() {
        return this.f22654b.a(this.f22653a);
    }

    public final fw0.b d() {
        return this.f22654b.b();
    }

    public final a e() {
        return this.f22653a;
    }
}
