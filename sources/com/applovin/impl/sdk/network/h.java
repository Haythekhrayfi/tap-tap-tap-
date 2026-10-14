package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f10939a = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f10940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f10941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f10942d;

    public h(f fVar, o oVar) {
        super("PersistentPostbackQueueSaveTask", oVar);
        this.f10940b = new AtomicLong();
        this.f10942d = oVar.F();
        this.f10941c = fVar;
    }

    private void a(List<j> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().o());
            } catch (Throwable th) {
                if (y.a()) {
                    this.f10942d.b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
                this.f10534f.ag().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            u uVarS = this.f10534f.S();
            uVarS.a(byteArrayInputStream, uVarS.a("persistent_postback_cache.json", o.au()));
            if (y.a()) {
                this.f10942d.b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.f10942d.b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
            this.f10534f.ag().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
        }
    }

    public ArrayList<j> a(int i10) {
        ArrayList<j> arrayList = new ArrayList<>();
        try {
            u uVarS = this.f10534f.S();
            if (uVarS.b("persistent_postback_cache.json", o.au())) {
                String strA = uVarS.a(uVarS.a("persistent_postback_cache.json", o.au()));
                if (StringUtils.isValidString(strA)) {
                    JSONArray jSONArray = new JSONObject(strA).getJSONArray("pb");
                    if (y.a()) {
                        this.f10942d.b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int iIntValue = ((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dm)).intValue();
                    for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                        try {
                            j jVar = new j(jSONArray.getJSONObject(i11), this.f10534f);
                            if (jVar.l() < iIntValue) {
                                arrayList.add(jVar);
                            } else if (y.a()) {
                                this.f10942d.b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                            }
                        } catch (Throwable th) {
                            if (y.a()) {
                                this.f10942d.b("PersistentPostbackQueueSaveTask", "Unable to deserialize postback request from json", th);
                            }
                            this.f10534f.ag().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                        }
                    }
                    if (y.a()) {
                        this.f10942d.b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.f10942d.b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th2);
            }
            this.f10534f.ag().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
        }
        return arrayList;
    }

    public void a() {
        this.f10940b.set(System.currentTimeMillis());
        this.f10534f.G().a(this, r.b.POSTBACKS, f10939a);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f10941c.a() > this.f10940b.get()) {
            a(this.f10941c.b());
        }
        a();
    }
}
