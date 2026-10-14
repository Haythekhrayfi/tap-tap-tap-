package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f10943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f10945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10946d;

    public i(g gVar, o oVar) {
        super("PersistentPostbackQueueSaveTaskV2", oVar);
        this.f10945c = new AtomicBoolean();
        this.f10946d = false;
        this.f10943a = gVar;
        this.f10944b = oVar.F();
    }

    private void a(List<j> list) {
        if (!(this.f10946d && list.isEmpty()) && this.f10945c.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            for (j jVar : list) {
                try {
                    jSONArray.put(jVar.o());
                } catch (Throwable th) {
                    y.c("PersistentPostbackQueueSaveTaskV2", "Unable to serialize postback to JSON: " + jVar, th);
                    this.f10534f.ag().a("PersistentPostbackQueueSaveTaskV2", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                u uVarS = this.f10534f.S();
                uVarS.a(byteArrayInputStream, uVarS.a("persistent_postback_cache.json", o.au()));
                if (y.a()) {
                    this.f10944b.b("PersistentPostbackQueueSaveTaskV2", "Exported postback queue to disk.");
                }
            } catch (Throwable th2) {
                y.c("PersistentPostbackQueueSaveTaskV2", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f10534f.ag().a("PersistentPostbackQueueSaveTaskV2", "serializePostbackQueue", th2);
            }
            this.f10945c.set(false);
        }
    }

    public List<j> a(int i10) {
        ArrayList arrayList = new ArrayList();
        u uVarS = this.f10534f.S();
        if (!uVarS.b("persistent_postback_cache.json", o.au())) {
            y.j("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file does not exist.");
            return arrayList;
        }
        String strA = uVarS.a(uVarS.a("persistent_postback_cache.json", o.au()));
        if (TextUtils.isEmpty(strA)) {
            y.j("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file has no content.");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(strA).getJSONArray("pb");
            if (y.a()) {
                this.f10944b.b("PersistentPostbackQueueSaveTaskV2", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dm);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    j jVar = new j(jSONArray.getJSONObject(i11), this.f10534f);
                    if (jVar.l() < num.intValue()) {
                        arrayList.add(jVar);
                    } else {
                        y.j("PersistentPostbackQueueSaveTaskV2", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                    }
                } catch (Throwable th) {
                    y.c("PersistentPostbackQueueSaveTaskV2", "Unable to deserialize postback from json", th);
                    this.f10534f.ag().a("PersistentPostbackQueueSaveTaskV2", "deserializePostback", th);
                }
            }
            if (y.a()) {
                this.f10944b.b("PersistentPostbackQueueSaveTaskV2", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            y.c("PersistentPostbackQueueSaveTaskV2", "Failed to load postback queue", th2);
            this.f10534f.ag().a("PersistentPostbackQueueSaveTaskV2", "deserializePostbackQueue", th2);
        }
        this.f10946d = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f10943a.a());
    }
}
