package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f10737b;

    public l(o oVar) {
        this.f10736a = oVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(o.au());
        this.f10737b = appLovinCommunicator;
        if (oVar.e() || !((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue()) {
            return;
        }
        appLovinCommunicator.a(oVar);
        appLovinCommunicator.subscribe(this, com.applovin.impl.communicator.c.f8968a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0096  */
    /* JADX WARN: Code duplicated, block: B:16:0x009b  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00af  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00b6, please report this as an issue */
    private Bundle b(com.applovin.impl.mediation.a.a aVar) {
        String networkName;
        String str;
        View viewI;
        com.applovin.impl.mediation.a.d dVar;
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString(FacebookMediationAdapter.KEY_ID, aVar.j());
        bundle.putString("network_name", aVar.ac());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.x());
        bundle.putString("ad_format", aVar.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", aVar.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", aVar.k(), bundle);
        BundleUtils.putStringIfValid("dsp_name", aVar.getDspName(), bundle);
        if (aVar.u()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", aVar.t().getLabel(), bundle);
        }
        if (!aVar.s()) {
            if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(aVar.ac())) {
                networkName = aVar.getNetworkName();
                str = "custom_sdk_network_name";
            }
            bundle.putAll(JsonUtils.toBundle(aVar.f()));
            if (aVar instanceof com.applovin.impl.mediation.a.e) {
                viewI = null;
                if (aVar instanceof com.applovin.impl.mediation.a.b) {
                    viewI = ((com.applovin.impl.mediation.a.b) aVar).w();
                } else if (aVar instanceof com.applovin.impl.mediation.a.d) {
                    dVar = (com.applovin.impl.mediation.a.d) aVar;
                    if (!dVar.L()) {
                        viewI = dVar.I();
                    }
                }
                if (viewI != null) {
                    str2 = viewI.getClass().getName() + '@' + Integer.toHexString(viewI.hashCode());
                } else {
                    str2 = "N/A";
                }
                bundle.putString("ad_view", str2);
            }
            return bundle;
        }
        networkName = aVar.getNetworkName();
        str = "custom_js_network_name";
        bundle.putString(str, networkName);
        bundle.putAll(JsonUtils.toBundle(aVar.f()));
        if (aVar instanceof com.applovin.impl.mediation.a.e) {
            viewI = null;
            if (aVar instanceof com.applovin.impl.mediation.a.b) {
                viewI = ((com.applovin.impl.mediation.a.b) aVar).w();
            } else if (aVar instanceof com.applovin.impl.mediation.a.d) {
                dVar = (com.applovin.impl.mediation.a.d) aVar;
                if (!dVar.L()) {
                    viewI = dVar.I();
                }
            }
            if (viewI != null) {
                str2 = viewI.getClass().getName() + '@' + Integer.toHexString(viewI.hashCode());
            } else {
                str2 = "N/A";
            }
            bundle.putString("ad_view", str2);
        }
        return bundle;
    }

    public void a() {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber(str) && !this.f10736a.e()) {
            this.f10737b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("max_revenue_events")) {
            Bundle bundleB = b(aVar);
            bundleB.putAll(JsonUtils.toBundle(aVar.h()));
            bundleB.putString("country_code", this.f10736a.aD().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f10736a.az().getName(), bundleB);
            a(bundleB, "max_revenue_events");
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("max_ad_events")) {
            Bundle bundleB = b(aVar);
            bundleB.putString("type", str);
            this.f10736a.F();
            if (y.a()) {
                this.f10736a.F().b("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleB);
            }
            a(bundleB, "max_ad_events");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a(String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("live_network_updated")) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "live_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("live_network", str);
            a(bundle, "live_network_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("user_info")) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString(FacebookMediationAdapter.KEY_ID, str);
            bundle.putString(ImagesContract.URL, str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("safedk_init")) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10736a.ax());
            bundle.putString("applovin_random_token", this.f10736a.s());
            bundle.putString("compass_random_token", this.f10736a.r());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(o.au()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(com.applovin.impl.mediation.d.c.a(this.f10736a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f10736a.q());
            bundle2.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings")));
            this.f10736a.F();
            if (y.a()) {
                this.f10736a.F().b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle bundleB = b(aVar);
            bundleB.putString("callback_name", str);
            a(bundleB, "ad_callback_blocked_after_hidden");
        }
    }

    public void b(String str) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("test_mode_network_updated")) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "test_mode_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("test_mode_network", str);
            a(bundle, "test_mode_network_updated");
        }
    }

    public void b(String str, String str2) {
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue() && this.f10737b.hasSubscriber("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public boolean c(String str) {
        return com.applovin.impl.communicator.c.f8968a.contains(str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        Map<String, Object> mapH;
        Map<String, Object> mapD;
        if (((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.f10378ha)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString(FacebookMediationAdapter.KEY_ID, "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10736a.ax());
                }
                this.f10736a.ai().a(new com.applovin.impl.sdk.network.j.a().c(messageData.getString(ImagesContract.URL)).d(messageData.getString("backup_url")).a(stringMap).c(map2).b(stringMap2).a(((Boolean) this.f10736a.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()).a(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f10736a.v().addCustomQueryParams(com.applovin.impl.sdk.utils.w.a(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f10736a.v().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f10736a.am().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f10736a.a(com.applovin.impl.sdk.c.b.dN)).longValue();
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f10736a.a(com.applovin.impl.sdk.c.b.dO)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f10736a.a(com.applovin.impl.sdk.c.b.dP)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j10 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f10736a.M() != null ? this.f10736a.M().a(null, false, false) : this.f10736a.K().a(null, false, false))));
                }
                i10 = i10;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f10736a.M() != null) {
                        mapH = this.f10736a.M().e();
                        mapD = this.f10736a.M().b();
                    } else {
                        mapH = this.f10736a.K().h();
                        mapD = this.f10736a.K().d();
                    }
                    if (mapD.containsKey("idfv") && mapD.containsKey("idfv_scope")) {
                        String str = (String) mapD.get("idfv");
                        int iIntValue = ((Integer) mapD.get("idfv_scope")).intValue();
                        mapD.remove("idfv");
                        mapD.remove("idfv_scope");
                        mapH.put("idfv", str);
                        mapH.put("idfv_scope", Integer.valueOf(iIntValue));
                    }
                    mapH.put("server_installed_at", this.f10736a.a(com.applovin.impl.sdk.c.b.am));
                    mapH.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10736a.ax());
                    map.put("app", mapH);
                    map.put("device", mapD);
                } else {
                    i10 = i10;
                }
            }
            this.f10736a.G().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.c.a(this.f10736a).a(messageData2.getString(ImagesContract.URL)).c(messageData2.getString("backup_url")).a(stringMap3).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).b((int) millis).a(i10).c((int) j10).a(new JSONObject()).d(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f10736a), com.applovin.impl.sdk.e.r.b.MAIN);
        }
    }
}
