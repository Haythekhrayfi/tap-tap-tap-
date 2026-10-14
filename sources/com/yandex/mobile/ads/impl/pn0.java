package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class pn0 extends ya<String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ux0 f24150a = new ux0();

    @Override // com.yandex.mobile.ads.impl.ya
    public final qa a(Object obj, String str) {
        String strA = (String) obj;
        if ("review_count".equals(str)) {
            try {
                strA = this.f24150a.a(strA);
            } catch (zi0 unused) {
            }
        }
        return new qa(str, "string", strA, null, false, false);
    }
}
