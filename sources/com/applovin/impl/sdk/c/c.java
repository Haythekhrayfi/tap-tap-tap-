package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f10383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f10384d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10385e = new Object();

    public c(o oVar) {
        this.f10381a = oVar;
        Context contextAu = o.au();
        this.f10382b = contextAu;
        this.f10383c = contextAu.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        b();
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        StringBuilder sbA = defpackage.a.a("SDK Error: unknown value type: ");
        sbA.append(obj.getClass());
        throw new RuntimeException(sbA.toString());
    }

    private String e() {
        StringBuilder sbA = defpackage.a.a("com.applovin.sdk.");
        sbA.append(w.a(this.f10381a.ax()));
        sbA.append(".");
        return sbA.toString();
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f10385e) {
            Iterator<b<?>> it = b.c().iterator();
            while (it.hasNext()) {
                b<T> bVar2 = (b) it.next();
                if (bVar2.a().equals(str)) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    public <T> T a(b<T> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f10385e) {
            Object obj = this.f10384d.get(bVar.a());
            if (obj == null) {
                return bVar.b();
            }
            return bVar.a(obj);
        }
    }

    public void a() {
        String strE = e();
        synchronized (this.f10385e) {
            SharedPreferences.Editor editorEdit = this.f10383c.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.f10384d.get(bVar.a());
                if (obj != null) {
                    this.f10381a.a(strE + bVar.a(), obj, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.f10385e) {
            this.f10384d.put(bVar.a(), obj);
        }
    }

    public void a(JSONObject jSONObject) {
        s sVarAg;
        String str;
        String str2;
        synchronized (this.f10385e) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> bVarA = a(next, (b) null);
                        if (bVarA != null) {
                            this.f10384d.put(bVarA.a(), a(next, jSONObject, bVarA.b()));
                            if (bVarA == b.fT) {
                                this.f10384d.put(b.fU.a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        y.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        sVarAg = this.f10381a.ag();
                        str = "SettingsManager";
                        str2 = "loadSettings";
                        sVarAg.a(str, str2, e);
                    } catch (Throwable th) {
                        e = th;
                        y.c("SettingsManager", "Unable to convert setting object ", e);
                        sVarAg = this.f10381a.ag();
                        str = "SettingsManager";
                        str2 = "loadSettings";
                        sVarAg.a(str, str2, e);
                    }
                }
            }
        }
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public void b() {
        String strE = e();
        synchronized (this.f10385e) {
            for (b<?> bVar : b.c()) {
                try {
                    Object objA = this.f10381a.a(strE + bVar.a(), null, bVar.b().getClass(), this.f10383c);
                    if (objA != null) {
                        this.f10384d.put(bVar.a(), objA);
                    }
                } catch (Throwable th) {
                    y.c("SettingsManager", "Unable to load \"" + bVar.a() + "\"", th);
                    this.f10381a.ag().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator<String> it = b(bVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString(it.next()));
        }
        return arrayList;
    }

    public void c() {
        synchronized (this.f10385e) {
            this.f10384d.clear();
        }
        this.f10381a.a(this.f10383c);
    }

    public boolean d() {
        return this.f10381a.ay().isVerboseLoggingEnabled() || ((Boolean) a(b.ai)).booleanValue();
    }
}
