package h6;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Clock f30937j = DefaultClock.getInstance();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Random f30938k = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, com.google.firebase.remoteconfig.a> f30939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f30941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f30942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y5.b f30943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v4.c f30944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x5.b<y4.a> f30945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f30947i;

    public j(Context context, u4.d dVar, y5.b bVar, v4.c cVar, x5.b<y4.a> bVar2) {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f30939a = new HashMap();
        this.f30947i = new HashMap();
        this.f30940b = context;
        this.f30941c = executorServiceNewCachedThreadPool;
        this.f30942d = dVar;
        this.f30943e = bVar;
        this.f30944f = cVar;
        this.f30945g = bVar2;
        dVar.a();
        this.f30946h = dVar.f36013c.f36025b;
        Tasks.call(executorServiceNewCachedThreadPool, new i(this));
    }

    public static boolean e(u4.d dVar) {
        dVar.a();
        return dVar.f36012b.equals("[DEFAULT]");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public synchronized com.google.firebase.remoteconfig.a a(u4.d dVar, String str, y5.b bVar, v4.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2, com.google.firebase.remoteconfig.internal.a aVar3, com.google.firebase.remoteconfig.internal.c cVar2, i6.d dVar2, com.google.firebase.remoteconfig.internal.d dVar3) {
        boolean z10;
        v4.c cVar3;
        if (!this.f30939a.containsKey(str)) {
            Context context = this.f30940b;
            if (str.equals("firebase")) {
                dVar.a();
                z10 = dVar.f36012b.equals("[DEFAULT]");
                if (z10) {
                    cVar3 = cVar;
                } else {
                    cVar3 = null;
                }
                com.google.firebase.remoteconfig.a aVar4 = new com.google.firebase.remoteconfig.a(context, dVar, bVar, cVar3, executor, aVar, aVar2, aVar3, cVar2, dVar2, dVar3);
                aVar2.b();
                aVar3.b();
                aVar.b();
                this.f30939a.put(str, aVar4);
            }
            if (z10) {
                cVar3 = cVar;
            } else {
                cVar3 = null;
            }
            com.google.firebase.remoteconfig.a aVar5 = new com.google.firebase.remoteconfig.a(context, dVar, bVar, cVar3, executor, aVar, aVar2, aVar3, cVar2, dVar2, dVar3);
            aVar2.b();
            aVar3.b();
            aVar.b();
            this.f30939a.put(str, aVar5);
        }
        return this.f30939a.get(str);
    }

    public final com.google.firebase.remoteconfig.internal.a b(String str, String str2) {
        i6.e eVar;
        com.google.firebase.remoteconfig.internal.a aVar;
        String str3 = String.format("%s_%s_%s_%s.json", "frc", this.f30946h, str, str2);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f30940b;
        Map<String, i6.e> map = i6.e.f31288c;
        synchronized (i6.e.class) {
            Map<String, i6.e> map2 = i6.e.f31288c;
            if (!((HashMap) map2).containsKey(str3)) {
                ((HashMap) map2).put(str3, new i6.e(context, str3));
            }
            eVar = (i6.e) ((HashMap) map2).get(str3);
        }
        Map<String, com.google.firebase.remoteconfig.internal.a> map3 = com.google.firebase.remoteconfig.internal.a.f12680d;
        synchronized (com.google.firebase.remoteconfig.internal.a.class) {
            String str4 = eVar.f31290b;
            Map<String, com.google.firebase.remoteconfig.internal.a> map4 = com.google.firebase.remoteconfig.internal.a.f12680d;
            if (!((HashMap) map4).containsKey(str4)) {
                ((HashMap) map4).put(str4, new com.google.firebase.remoteconfig.internal.a(executorServiceNewCachedThreadPool, eVar));
            }
            aVar = (com.google.firebase.remoteconfig.internal.a) ((HashMap) map4).get(str4);
        }
        return aVar;
    }

    public com.google.firebase.remoteconfig.a c() {
        com.google.firebase.remoteconfig.a aVarA;
        synchronized (this) {
            com.google.firebase.remoteconfig.internal.a aVarB = b("firebase", "fetch");
            com.google.firebase.remoteconfig.internal.a aVarB2 = b("firebase", "activate");
            com.google.firebase.remoteconfig.internal.a aVarB3 = b("firebase", "defaults");
            com.google.firebase.remoteconfig.internal.d dVar = new com.google.firebase.remoteconfig.internal.d(this.f30940b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f30946h, "firebase", "settings"), 0));
            i6.d dVar2 = new i6.d(this.f30941c, aVarB2, aVarB3);
            u4.d dVar3 = this.f30942d;
            x5.b<y4.a> bVar = this.f30945g;
            dVar3.a();
            final i6.g gVar = dVar3.f36012b.equals("[DEFAULT]") ? new i6.g(bVar) : null;
            if (gVar != null) {
                BiConsumer<String, com.google.firebase.remoteconfig.internal.b> biConsumer = new BiConsumer() { // from class: h6.h
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject jSONObjectOptJSONObject;
                        i6.g gVar2 = gVar;
                        String str = (String) obj;
                        com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) obj2;
                        y4.a aVar = gVar2.f31293a.get();
                        if (aVar == null) {
                            return;
                        }
                        JSONObject jSONObject = bVar2.f12691e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = bVar2.f12688b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (gVar2.f31294b) {
                                if (!strOptString.equals(gVar2.f31294b.get(str))) {
                                    gVar2.f31294b.put(str, strOptString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", jSONObject2.optString(str));
                                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                    aVar.b("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", strOptString);
                                    aVar.b("fp", "_fpc", bundle2);
                                }
                            }
                        }
                    }
                };
                synchronized (dVar2.f31284a) {
                    dVar2.f31284a.add(biConsumer);
                }
            }
            aVarA = a(this.f30942d, "firebase", this.f30943e, this.f30944f, this.f30941c, aVarB, aVarB2, aVarB3, d("firebase", aVarB, dVar), dVar2, dVar);
        }
        return aVarA;
    }

    public synchronized com.google.firebase.remoteconfig.internal.c d(String str, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.d dVar) {
        y5.b bVar;
        x5.b bVar2;
        ExecutorService executorService;
        Clock clock;
        Random random;
        String str2;
        u4.d dVar2;
        bVar = this.f30943e;
        bVar2 = e(this.f30942d) ? this.f30945g : a5.i.f100d;
        executorService = this.f30941c;
        clock = f30937j;
        random = f30938k;
        u4.d dVar3 = this.f30942d;
        dVar3.a();
        str2 = dVar3.f36013c.f36024a;
        dVar2 = this.f30942d;
        dVar2.a();
        return new com.google.firebase.remoteconfig.internal.c(bVar, bVar2, executorService, clock, random, aVar, new ConfigFetchHttpClient(this.f30940b, dVar2.f36013c.f36025b, str2, str, dVar.f12708a.getLong("fetch_timeout_in_seconds", 60L), dVar.f12708a.getLong("fetch_timeout_in_seconds", 60L)), dVar, this.f30947i);
    }
}
