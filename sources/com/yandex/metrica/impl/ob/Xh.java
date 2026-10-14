package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2 f15514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wh f15515b;

    public Xh(Wh wh) {
        this(wh, new R2());
    }

    public Xh(Wh wh, R2 r10) {
        this.f15515b = wh;
        this.f15514a = r10;
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String strA = this.f15515b.a();
        if (TextUtils.isEmpty(strA)) {
            return jSONObject;
        }
        try {
            return new JSONObject(strA);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public long a(int i10) {
        return a().optLong(String.valueOf(i10));
    }

    public void a(int i10, long j10) {
        JSONObject jSONObjectA = a();
        try {
            jSONObjectA.put(String.valueOf(i10), j10);
        } catch (Throwable unused) {
        }
        this.f15515b.a(jSONObjectA.toString());
    }

    public void a(long j10) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA = a();
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.f15514a.b(jSONObjectA.optLong(next), j10, i.f.a("last socket open on ", next))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObjectA.remove((String) it.next());
        }
        this.f15515b.a(jSONObjectA.toString());
    }
}
