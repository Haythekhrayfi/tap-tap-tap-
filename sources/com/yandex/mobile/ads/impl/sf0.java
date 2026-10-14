package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class sf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kp0 f25071a;

    public sf0(kp0 kp0Var) {
        this.f25071a = kp0Var;
    }

    private void a(String str) {
        String str2 = String.format("window.mraidbridge.%s", str);
        this.f25071a.loadUrl("javascript: " + str2);
        x60.e("Injecting Javascript into MRAID WebView:\n\t%s", str2);
    }

    public final void a() {
        a("notifyReadyEvent();");
    }

    public final void a(int i10) {
        StringBuilder sbA = v60.a("nativeCallComplete(");
        sbA.append(JSONObject.quote(eg0.a(i10)));
        sbA.append(")");
        a(sbA.toString());
    }

    public final void a(int i10, String str) {
        StringBuilder sbA = v60.a("notifyErrorEvent(");
        sbA.append(JSONObject.quote(eg0.a(i10)));
        sbA.append(", ");
        sbA.append(JSONObject.quote(str));
        sbA.append(")");
        a(sbA.toString());
    }

    public final void a(p70... p70VarArr) {
        if (p70VarArr.length > 0) {
            StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
            int length = p70VarArr.length;
            int i10 = 0;
            String str = "";
            while (i10 < length) {
                p70 p70Var = p70VarArr[i10];
                sb2.append(str);
                sb2.append(p70Var.a());
                i10++;
                str = ", ";
            }
            sb2.append("})");
            a(sb2.toString());
        }
    }

    public final void b(String str) {
        this.f25071a.a(str);
    }
}
