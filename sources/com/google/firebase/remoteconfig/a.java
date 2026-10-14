package com.google.firebase.remoteconfig;

import android.content.Context;
import h6.g;
import h6.j;
import i6.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v4.c;
import y5.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f12664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f12665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f12666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f12667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f12668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f12669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f12670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f12671i;

    public a(Context context, u4.d dVar, b bVar, c cVar, Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2, com.google.firebase.remoteconfig.internal.a aVar3, com.google.firebase.remoteconfig.internal.c cVar2, d dVar2, com.google.firebase.remoteconfig.internal.d dVar3) {
        this.f12671i = bVar;
        this.f12663a = cVar;
        this.f12664b = executor;
        this.f12665c = aVar;
        this.f12666d = aVar2;
        this.f12667e = aVar3;
        this.f12668f = cVar2;
        this.f12669g = dVar2;
        this.f12670h = dVar3;
    }

    public static a b() {
        u4.d dVarB = u4.d.b();
        dVarB.a();
        return ((j) dVarB.f36014d.a(j.class)).c();
    }

    public static List<Map<String, String>> c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public Map<String, g> a() {
        d dVar = this.f12669g;
        Objects.requireNonNull(dVar);
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(d.d(dVar.f31286c));
        hashSet.addAll(d.d(dVar.f31287d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, dVar.g(str));
        }
        return map;
    }
}
