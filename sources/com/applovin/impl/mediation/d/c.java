package com.applovin.impl.mediation.d;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TreeMap<String, String> f9410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static JSONArray f9412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f9413d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f9410a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.NimbusMediationAdapter", "Nimbus");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.TaboolaMediationAdapter", "Taboola");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        f9411b = new ArrayList(treeMap.keySet());
    }

    public static r.b a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            return r.b.MEDIATION_INTERSTITIAL;
        }
        if (maxAdFormat == MaxAdFormat.APP_OPEN) {
            return r.b.MEDIATION_APP_OPEN;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            return r.b.MEDIATION_INCENTIVIZED;
        }
        return maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? r.b.MEDIATION_REWARDED_INTERSTITIAL : r.b.MEDIATION_BANNER;
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        if (i10 < 0) {
            try {
                i10 = AppLovinSdkUtils.pxToDp(context, h.b(context).x);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        int i11 = AdSize.FULL_WIDTH;
        Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = AdSize.class.getMethod("getWidth", new Class[0]);
        Method method3 = AdSize.class.getMethod("getHeight", new Class[0]);
        Object objInvoke = method.invoke(null, context, Integer.valueOf(i10));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, new Object[0])).intValue(), ((Integer) method3.invoke(objInvoke, new Object[0])).intValue());
    }

    public static JSONArray a(o oVar) {
        if (f9412c != null) {
            b(oVar);
            return f9412c;
        }
        f9412c = new JSONArray();
        for (String str : f9411b) {
            MaxAdapter maxAdapterB = b(str, oVar);
            if (maxAdapterB != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f9410a.get(str));
                    jSONObject.put(Action.CLASS_ATTRIBUTE, str);
                    jSONObject.put("sdk_version", maxAdapterB.getSdkVersion());
                    jSONObject.put("version", maxAdapterB.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f9413d) {
                    f9412c.put(jSONObject);
                }
            }
        }
        return f9412c;
    }

    public static JSONObject a(String str, o oVar) {
        JSONArray jSONArrayA = a(oVar);
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, Action.CLASS_ATTRIBUTE, null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean a(Object obj) {
        return (obj instanceof e) && StringUtils.isValidString(((e) obj).Q());
    }

    public static MaxAdapter b(String str, o oVar) {
        if (TextUtils.isEmpty(str)) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(oVar.aA());
            }
            oVar.F();
            if (y.a()) {
                oVar.F().e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    private static void b(o oVar) {
        MaxAdapter maxAdapterB;
        for (int i10 = 0; i10 < f9412c.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f9412c, i10, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, Action.CLASS_ATTRIBUTE, "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (maxAdapterB = b(string, oVar)) != null) {
                String sdkVersion = maxAdapterB.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f9413d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.mediation.a.a) && "APPLOVIN".equals(((com.applovin.impl.mediation.a.a) obj).ad());
    }
}
