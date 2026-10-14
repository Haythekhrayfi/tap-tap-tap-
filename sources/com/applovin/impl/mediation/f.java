package com.applovin.impl.mediation;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f9854c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, g> f9852a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9855d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f9856e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<String> f9857f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9858g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<a> f9859h = new HashSet();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f9862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f9863d;

        public a(String str, String str2, com.applovin.impl.mediation.a.a aVar, o oVar) {
            this.f9860a = str;
            this.f9861b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f9863d = jSONObject;
            JsonUtils.putString(jSONObject, Action.CLASS_ATTRIBUTE, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (aVar == null) {
                this.f9862c = null;
            } else {
                this.f9862c = aVar.getFormat();
                JsonUtils.putString(jSONObject, "format", aVar.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f9863d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9860a.equals(aVar.f9860a) || !this.f9861b.equals(aVar.f9861b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f9862c;
            MaxAdFormat maxAdFormat2 = aVar.f9862c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iA = l1.e.a(this.f9861b, this.f9860a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f9862c;
            return iA + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("DisabledAdapterInfo{className='");
            l1.c.a(sbA, this.f9860a, CoreConstants.SINGLE_QUOTE_CHAR, ", operationTag='");
            l1.c.a(sbA, this.f9861b, CoreConstants.SINGLE_QUOTE_CHAR, ", format=");
            sbA.append(this.f9862c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public f(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9853b = oVar;
        this.f9854c = oVar.F();
    }

    private g a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls, boolean z10) {
        try {
            return new g(fVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f9853b.aA()), z10, this.f9853b);
        } catch (Throwable th) {
            y.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            y.j("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public g a(com.applovin.impl.mediation.a.f fVar) {
        return a(fVar, false);
    }

    public g a(com.applovin.impl.mediation.a.f fVar, boolean z10) {
        Class<? extends MaxAdapter> clsA;
        g gVar;
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter spec specified");
        }
        String strAc = fVar.ac();
        String strAb = fVar.ab();
        if (TextUtils.isEmpty(strAc)) {
            if (y.a()) {
                this.f9854c.e("MediationAdapterManager", "No adapter name provided for " + strAb + ", not loading the adapter ");
            }
            return null;
        }
        if (TextUtils.isEmpty(strAb)) {
            if (y.a()) {
                this.f9854c.e("MediationAdapterManager", "Unable to find default className for '" + strAc + "'");
            }
            return null;
        }
        if (z10 && (gVar = this.f9852a.get(strAb)) != null) {
            return gVar;
        }
        synchronized (this.f9855d) {
            if (this.f9857f.contains(strAb)) {
                if (y.a()) {
                    this.f9854c.b("MediationAdapterManager", "Not attempting to load " + strAc + " due to prior errors");
                }
                return null;
            }
            if (this.f9856e.containsKey(strAb)) {
                clsA = this.f9856e.get(strAb);
            } else {
                clsA = a(strAb);
                if (clsA == null) {
                    this.f9857f.add(strAb);
                    return null;
                }
            }
            g gVarA = a(fVar, clsA, z10);
            if (gVarA == null) {
                if (y.a()) {
                    this.f9854c.e("MediationAdapterManager", "Failed to load " + strAc);
                }
                this.f9857f.add(strAb);
                return null;
            }
            if (y.a()) {
                this.f9854c.b("MediationAdapterManager", "Loaded " + strAc);
            }
            this.f9856e.put(strAb, clsA);
            if (z10) {
                this.f9852a.put(fVar.ab(), gVarA);
            }
            return gVarA;
        }
    }

    public Collection<String> a() {
        Set setUnmodifiableSet;
        synchronized (this.f9855d) {
            HashSet hashSet = new HashSet(this.f9856e.size());
            Iterator<Class<? extends MaxAdapter>> it = this.f9856e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f9858g) {
            this.f9853b.F();
            if (y.a()) {
                this.f9853b.F().e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f9859h.add(new a(str, str2, aVar, this.f9853b));
        }
    }

    public Collection<String> b() {
        Set setUnmodifiableSet;
        synchronized (this.f9855d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f9857f);
        }
        return setUnmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f9858g) {
            arrayList = new ArrayList(this.f9859h.size());
            Iterator<a> it = this.f9859h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }
}
