package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mn1 extends lm1 {
    public mn1(um1.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    @Override // com.yandex.mobile.ads.impl.um1, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        fm1 fm1VarA;
        if (!TextUtils.isEmpty(str) && (fm1VarA = fm1.a()) != null) {
            for (em1 em1Var : fm1VarA.b()) {
                if (this.f22735c.contains(em1Var.h())) {
                    em1Var.i().a(str, this.f22737e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        if (rm1.a(this.f22736d, ((tm1) this.f25704b).b())) {
            return null;
        }
        ((tm1) this.f25704b).a(this.f22736d);
        return this.f22736d.toString();
    }
}
