package com.zipoapps.blytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28225a;

    public c(Context context) {
        this.f28225a = context.getSharedPreferences("com.zipoapps.blytics.counters.global", 0);
    }

    @Override // com.zipoapps.blytics.b
    public ka.a a(String str, String str2) {
        if (!this.f28225a.contains(ka.a.a(str, str2))) {
            return null;
        }
        return (ka.a) new Gson().b(this.f28225a.getString(ka.a.a(str, str2), null), ka.a.class);
    }

    @Override // com.zipoapps.blytics.b
    public void e(ka.a aVar) {
        this.f28225a.edit().putString(ka.a.a(aVar.f31957a, aVar.f31958b), new Gson().g(aVar)).apply();
    }
}
