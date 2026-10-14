package com.applovin.impl.sdk.c;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.c.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b<T> implements Comparable {
    public static final b<Boolean> aA;
    public static final b<Boolean> aB;
    public static final b<Boolean> aC;
    public static final b<Boolean> aD;
    public static final b<Boolean> aE;
    public static final b<Boolean> aF;
    public static final b<String> aG;
    public static final b<Boolean> aH;
    public static final b<String> aI;
    public static final b<Boolean> aJ;
    public static final b<Long> aK;
    public static final b<Boolean> aL;
    public static final b<Boolean> aM;
    public static final b<Boolean> aN;
    public static final b<Boolean> aO;
    public static final b<Long> aP;
    public static final b<Long> aQ;
    public static final b<Long> aR;
    public static final b<Long> aS;
    public static final b<Long> aT;
    public static final b<Long> aU;
    public static final b<String> aV;
    public static final b<String> aW;
    public static final b<String> aX;
    public static final b<String> aY;
    public static final b<Long> aZ;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public static final b<Boolean> f10343ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static final b<String> f10344ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public static final b<Boolean> f10345ae;
    public static final b<Boolean> af;
    public static final b<String> ag;
    public static final b<Long> ah;
    public static final b<Boolean> ai;
    public static final b<String> aj;
    public static final b<String> ak;
    public static final b<String> al;
    public static final b<String> am;
    public static final b<Boolean> an;
    public static final b<Boolean> ao;
    public static final b<Boolean> ap;
    public static final b<Boolean> aq;
    public static final b<Long> ar;
    public static final b<Integer> as;
    public static final b<Integer> at;
    public static final b<Boolean> au;
    public static final b<Integer> av;
    public static final b<Integer> aw;
    public static final b<Integer> ax;
    public static final b<Boolean> ay;
    public static final b<Boolean> az;
    public static final b<Integer> bA;
    public static final b<String> bB;
    public static final b<Boolean> bC;
    public static final b<Boolean> bD;
    public static final b<String> bE;
    public static final b<String> bF;
    public static final b<Integer> bG;
    public static final b<Boolean> bH;
    public static final b<Integer> bI;
    public static final b<Integer> bJ;
    public static final b<Boolean> bK;
    public static final b<Integer> bL;
    public static final b<Integer> bM;
    public static final b<Boolean> bN;
    public static final b<String> bO;
    public static final b<String> bP;
    public static final b<String> bQ;
    public static final b<String> bR;
    public static final b<Boolean> bS;
    public static final b<String> bT;
    public static final b<String> bU;
    public static final b<String> bV;
    public static final b<String> bW;
    public static final b<Integer> bX;
    public static final b<Integer> bY;
    public static final b<Boolean> bZ;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    public static final b<Integer> f10347ba;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public static final b<Integer> f10348bb;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    public static final b<Integer> f10349bc;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    public static final b<Integer> f10350bd;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    public static final b<String> f10351be;
    public static final b<String> bf;
    public static final b<String> bg;
    public static final b<String> bh;
    public static final b<String> bi;
    public static final b<String> bj;
    public static final b<String> bk;
    public static final b<String> bl;
    public static final b<String> bm;
    public static final b<String> bn;
    public static final b<String> bo;
    public static final b<String> bp;
    public static final b<String> bq;
    public static final b<String> br;
    public static final b<String> bs;
    public static final b<Boolean> bt;
    public static final b<Integer> bu;
    public static final b<Integer> bv;
    public static final b<Long> bw;
    public static final b<Boolean> bx;
    public static final b<Boolean> by;
    public static final b<Long> bz;
    public static final b<Integer> cA;
    public static final b<Integer> cB;
    public static final b<Integer> cC;
    public static final b<Integer> cD;
    public static final b<Integer> cE;
    public static final b<Integer> cF;
    public static final b<Integer> cG;
    public static final b<Integer> cH;
    public static final b<Boolean> cI;
    public static final b<Long> cJ;
    public static final b<Long> cK;
    public static final b<Boolean> cL;
    public static final b<Boolean> cM;
    public static final b<Boolean> cN;
    public static final b<Boolean> cO;
    public static final b<Boolean> cP;
    public static final b<Boolean> cQ;
    public static final b<Boolean> cR;
    public static final b<Integer> cS;
    public static final b<Integer> cT;
    public static final b<Integer> cU;
    public static final b<Long> cV;
    public static final b<Integer> cW;
    public static final b<Integer> cX;
    public static final b<Integer> cY;
    public static final b<Boolean> cZ;

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    public static final b<Long> f10352ca;

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    public static final b<Integer> f10353cb;

    /* JADX INFO: renamed from: cc, reason: collision with root package name */
    public static final b<Integer> f10354cc;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public static final b<Integer> f10355cd;

    /* JADX INFO: renamed from: ce, reason: collision with root package name */
    public static final b<Integer> f10356ce;
    public static final b<Integer> cf;
    public static final b<Integer> cg;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final b<Integer> f10357ch;
    public static final b<Integer> ci;
    public static final b<Float> cj;
    public static final b<Long> ck;
    public static final b<Long> cl;
    public static final b<Integer> cm;
    public static final b<Integer> cn;
    public static final b<Integer> co;
    public static final b<Boolean> cp;
    public static final b<Integer> cq;
    public static final b<Boolean> cr;
    public static final b<String> cs;
    public static final b<String> ct;
    public static final b<String> cu;
    public static final b<Integer> cv;
    public static final b<Boolean> cw;
    public static final b<Long> cx;
    public static final b<Long> cy;
    public static final b<Boolean> cz;
    public static final b<Boolean> dA;
    public static final b<Boolean> dB;
    public static final b<Integer> dC;
    public static final b<Integer> dD;
    public static final b<Integer> dE;
    public static final b<Integer> dF;
    public static final b<Boolean> dG;
    public static final b<Boolean> dH;
    public static final b<Integer> dI;
    public static final b<Integer> dJ;
    public static final b<Boolean> dK;
    public static final b<Boolean> dL;
    public static final b<Boolean> dM;
    public static final b<Long> dN;
    public static final b<Integer> dO;
    public static final b<Long> dP;
    public static final b<Long> dQ;
    public static final b<Long> dR;
    public static final b<Boolean> dS;
    public static final b<Boolean> dT;
    public static final b<Long> dU;
    public static final b<Integer> dV;
    public static final b<Boolean> dW;
    public static final b<Long> dX;
    public static final b<Long> dY;
    public static final b<Boolean> dZ;

    /* JADX INFO: renamed from: da, reason: collision with root package name */
    public static final b<Long> f10358da;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    public static final b<Boolean> f10359db;

    /* JADX INFO: renamed from: dc, reason: collision with root package name */
    public static final b<Boolean> f10360dc;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final b<Boolean> f10361dd;

    /* JADX INFO: renamed from: de, reason: collision with root package name */
    public static final b<Boolean> f10362de;
    public static final b<Long> df;
    public static final b<Boolean> dg;
    public static final b<Integer> dh;
    public static final b<Integer> di;
    public static final b<Boolean> dj;
    public static final b<Integer> dk;
    public static final b<Integer> dl;
    public static final b<Integer> dm;
    public static final b<Boolean> dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final b<Integer> f0do;
    public static final b<Integer> dp;
    public static final b<Boolean> dq;
    public static final b<Boolean> dr;
    public static final b<Boolean> ds;
    public static final b<Boolean> dt;
    public static final b<Integer> du;
    public static final b<Integer> dv;
    public static final b<Integer> dw;
    public static final b<Boolean> dx;
    public static final b<Integer> dy;
    public static final b<Integer> dz;
    public static final b<Boolean> eA;
    public static final b<Float> eB;
    public static final b<Boolean> eC;
    public static final b<Boolean> eD;
    public static final b<Boolean> eE;
    public static final b<Boolean> eF;
    public static final b<Float> eG;
    public static final b<Integer> eH;
    public static final b<Boolean> eI;
    public static final b<Boolean> eJ;
    public static final b<Long> eK;
    public static final b<Integer> eL;
    public static final b<String> eM;
    public static final b<Integer> eN;
    public static final b<Integer> eO;
    public static final b<Integer> eP;
    public static final b<Integer> eQ;
    public static final b<Integer> eR;
    public static final b<Integer> eS;
    public static final b<Integer> eT;
    public static final b<Boolean> eU;
    public static final b<Long> eV;
    public static final b<Integer> eW;
    public static final b<Boolean> eX;
    public static final b<Boolean> eY;
    public static final b<Integer> eZ;

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    public static final b<Boolean> f10363ea;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final b<Boolean> f10364eb;

    /* JADX INFO: renamed from: ec, reason: collision with root package name */
    public static final b<Boolean> f10365ec;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    public static final b<Boolean> f10366ed;

    /* JADX INFO: renamed from: ee, reason: collision with root package name */
    public static final b<Boolean> f10367ee;
    public static final b<Boolean> ef;
    public static final b<Boolean> eg;
    public static final b<Boolean> eh;
    public static final b<Boolean> ei;
    public static final b<Boolean> ej;
    public static final b<Boolean> ek;
    public static final b<Boolean> el;
    public static final b<Boolean> em;
    public static final b<Boolean> en;
    public static final b<String> eo;
    public static final b<Boolean> ep;
    public static final b<Boolean> eq;
    public static final b<Boolean> er;
    public static final b<Boolean> es;
    public static final b<Boolean> et;
    public static final b<Boolean> eu;
    public static final b<Boolean> ev;
    public static final b<Boolean> ew;
    public static final b<Boolean> ex;
    public static final b<Boolean> ey;
    public static final b<Boolean> ez;
    public static final b<Integer> fA;
    public static final b<Boolean> fB;
    public static final b<Integer> fC;
    public static final b<Integer> fD;
    public static final b<Integer> fE;
    public static final b<Integer> fF;
    public static final b<Integer> fG;
    public static final b<Integer> fH;
    public static final b<Integer> fI;
    public static final b<Integer> fJ;
    public static final b<Integer> fK;
    public static final b<Boolean> fL;
    public static final b<Boolean> fM;
    public static final b<Boolean> fN;
    public static final b<Boolean> fO;
    public static final b<Boolean> fP;
    public static final b<Boolean> fQ;
    public static final b<Boolean> fR;
    public static final b<Boolean> fS;
    public static final b<Long> fT;
    public static final b<Long> fU;
    public static final b<Integer> fV;
    public static final b<Boolean> fW;
    public static final b<Boolean> fX;
    public static final b<Boolean> fY;
    public static final b<Boolean> fZ;

    /* JADX INFO: renamed from: fa, reason: collision with root package name */
    public static final b<Integer> f10368fa;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final b<Integer> f10369fb;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public static final b<Boolean> f10370fc;

    /* JADX INFO: renamed from: fd, reason: collision with root package name */
    public static final b<String> f10371fd;

    /* JADX INFO: renamed from: fe, reason: collision with root package name */
    public static final b<String> f10372fe;
    public static final b<Integer> ff;
    public static final b<Integer> fg;
    public static final b<String> fh;
    public static final b<String> fi;
    public static final b<Boolean> fj;
    public static final b<Integer> fk;
    public static final b<Integer> fl;
    public static final b<Integer> fm;
    public static final b<Integer> fn;
    public static final b<Integer> fo;
    public static final b<Integer> fp;
    public static final b<Integer> fq;
    public static final b<Integer> fr;
    public static final b<Integer> fs;
    public static final b<Float> ft;
    public static final b<Boolean> fu;
    public static final b<Boolean> fv;
    public static final b<Integer> fw;
    public static final b<Boolean> fx;
    public static final b<Integer> fy;
    public static final b<Boolean> fz;
    public static final b<Boolean> gA;
    public static final b<Boolean> gB;
    public static final b<Boolean> gC;
    public static final b<Boolean> gD;
    public static final b<Integer> gE;
    public static final b<Integer> gF;
    public static final b<Boolean> gG;
    public static final b<Boolean> gH;
    public static final b<Boolean> gI;
    public static final b<Boolean> gJ;
    public static final b<Boolean> gK;
    public static final b<Boolean> gL;
    public static final b<Boolean> gM;
    public static final b<Boolean> gN;
    public static final b<Boolean> gO;
    public static final b<Boolean> gP;
    public static final b<Long> gQ;
    public static final b<String> gR;
    public static final b<Boolean> gS;
    public static final b<String> gT;
    public static final b<String> gU;
    public static final b<String> gV;
    public static final b<String> gW;
    public static final b<Integer> gX;
    public static final b<String> gY;
    public static final b<String> gZ;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    public static final b<Boolean> f10373ga;

    /* JADX INFO: renamed from: gb, reason: collision with root package name */
    public static final b<Boolean> f10374gb;

    /* JADX INFO: renamed from: gc, reason: collision with root package name */
    public static final b<Boolean> f10375gc;

    /* JADX INFO: renamed from: gd, reason: collision with root package name */
    public static final b<Boolean> f10376gd;

    /* JADX INFO: renamed from: ge, reason: collision with root package name */
    public static final b<Boolean> f10377ge;
    public static final b<Boolean> gf;
    public static final b<Boolean> gg;
    public static final b<Boolean> gh;
    public static final b<Boolean> gi;
    public static final b<Boolean> gj;
    public static final b<Boolean> gk;
    public static final b<Boolean> gl;
    public static final b<Boolean> gm;
    public static final b<Boolean> gn;
    public static final b<Boolean> go;
    public static final b<Boolean> gp;
    public static final b<Boolean> gq;
    public static final b<Long> gr;
    public static final b<Long> gs;
    public static final b<Long> gt;
    public static final b<Boolean> gu;
    public static final b<Boolean> gv;
    public static final b<Long> gw;
    public static final b<Long> gx;
    public static final b<Integer> gy;
    public static final b<Integer> gz;

    /* JADX INFO: renamed from: ha, reason: collision with root package name */
    public static final b<Boolean> f10378ha;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f10380d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<?> f10342a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, b<?>> f10346b = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f10343ac = a("is_disabled", bool);
        f10344ad = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f10345ae = a("rss", bool2);
        af = a("rssoitf", bool);
        ag = a("device_token", "");
        ah = a("publisher_id", 0L);
        ai = a("is_verbose_logging", bool);
        aj = a("sc", "");
        ak = a("sc2", "");
        al = a("sc3", "");
        am = a("server_installed_at", "");
        an = a("track_network_response_codes", bool);
        ao = a("submit_network_response_codes", bool);
        ap = a("clear_network_response_codes_on_request", bool2);
        aq = a("clear_completion_callback_on_failure", bool);
        ar = a("sicd_ms", 0L);
        as = a("logcat_max_line_size", 1000);
        at = a("stps", 2);
        au = a("exception_handler_enabled", bool2);
        av = a("network_thread_count", 2);
        aw = a("aei", -1);
        ax = a("mei", -1);
        ay = a("gwe", bool);
        az = a("bdae", bool);
        aA = a("tewllm", bool2);
        aB = a("lisvib", bool);
        aC = a("ah_cvc", bool2);
        aD = a("ah_cdde", bool2);
        aE = a("ah_crut", bool2);
        aF = a("init_omsdk", bool2);
        aG = a("omsdk_partner_name", "applovin");
        aH = a("publisher_can_show_consent_dialog", bool2);
        aI = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
        aJ = a("consent_dialog_immersive_mode_on", bool);
        aK = a("consent_dialog_show_from_alert_delay_ms", 450L);
        aL = a("alert_consent_for_dialog_rejected", bool);
        aM = a("alert_consent_for_dialog_closed", bool);
        aN = a("alert_consent_for_dialog_closed_with_back_button", bool);
        aO = a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aP = f.a(timeUnit, 5L, "alert_consent_after_init_interval_ms");
        aQ = f.a(timeUnit, 30L, "alert_consent_after_dialog_rejection_interval_ms");
        aR = f.a(timeUnit, 5L, "alert_consent_after_dialog_close_interval_ms");
        aS = f.a(timeUnit, 5L, "alert_consent_after_dialog_close_with_back_button_interval_ms");
        aT = f.a(timeUnit, 10L, "alert_consent_after_cancel_interval_ms");
        aU = f.a(timeUnit, 5L, "alert_consent_reschedule_interval_ms");
        aV = a("text_alert_consent_title", "Make this App Better and Stay Free!");
        aW = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
        aX = a("text_alert_consent_yes_option", "I Agree");
        aY = a("text_alert_consent_no_option", "Cancel");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        aZ = f.a(timeUnit2, 1L, "ttc_max_click_duration_ms");
        f10347ba = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f10348bb = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f10349bc = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f10350bd = a("ttc_edge_buffer_dp", 0);
        f10351be = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        bf = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        bg = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        bh = a("adserver_endpoint", "https://a.applovin.com/");
        bi = a("adserver_backup_endpoint", "https://a.applvn.com/");
        bj = a("api_endpoint", "https://d.applovin.com/");
        bk = a("api_backup_endpoint", "https://d.applvn.com/");
        bl = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        bm = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        bn = a("fetch_variables_endpoint", "https://ms.applovin.com/");
        bo = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
        bp = a("token_type_prefixes_r", "4!");
        bq = a("token_type_prefixes_arj", "json_v3!");
        br = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        bs = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        bt = a("persist_super_properties", bool2);
        bu = a("super_property_string_max_length", 1024);
        bv = a("super_property_url_max_length", 1024);
        bw = f.a(timeUnit, 10L, "cached_advertising_info_ttl_ms");
        bx = a("use_per_format_cache_queues", bool2);
        by = a("cache_cleanup_enabled", bool);
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        bz = a("cache_file_ttl_seconds", Long.valueOf(timeUnit3.toSeconds(1L)));
        bA = a("cache_max_size_mb", -1);
        bB = a("precache_delimiters", ")]',");
        bC = a("ad_resource_caching_enabled", bool2);
        bD = a("fail_ad_load_on_failed_video_cache", bool2);
        bE = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        bF = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        bG = a("resource_max_filename_length", 255);
        bH = a("ccrc", bool);
        bI = a("mcct", 3);
        bJ = a("mchct", 3);
        bK = a("saewib", bool);
        bL = a("vr_retry_count_v1", 1);
        bM = a("cr_retry_count_v1", 1);
        bN = a("incent_warning_enabled", bool);
        bO = a("text_incent_warning_title", "Attention!");
        bP = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        bQ = a("text_incent_warning_close_option", "Close");
        bR = a("text_incent_warning_continue_option", "Keep Watching");
        bS = a("incent_nonvideo_warning_enabled", bool);
        bT = a("text_incent_nonvideo_warning_title", "Attention!");
        bU = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
        bV = a("text_incent_nonvideo_warning_close_option", "Close");
        bW = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
        bX = a("close_button_touch_area", 0);
        bY = a("close_button_outside_touch_area", 0);
        bZ = a("creative_debugger_enabled", bool2);
        f10352ca = f.a(timeUnit2, 1L, "viewability_adview_imp_delay_ms");
        f10353cb = a("viewability_adview_banner_min_width", 320);
        f10354cc = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f10355cd = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f10356ce = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        cf = a("viewability_adview_leader_min_width", 728);
        cg = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f10357ch = a("viewability_adview_native_min_width", 0);
        ci = a("viewability_adview_native_min_height", 0);
        cj = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        ck = f.a(timeUnit2, 1L, "viewability_timer_min_visible_ms");
        cl = a("viewability_timer_interval_ms", 100L);
        cm = a("expandable_close_button_size", 27);
        cn = a("expandable_h_close_button_margin", 10);
        co = a("expandable_t_close_button_margin", 10);
        cp = a("expandable_lhs_close_button", bool);
        cq = a("expandable_close_button_touch_area", 0);
        cr = a("iaad", bool);
        cs = a("js_tag_schemes", "applovin,mopub");
        ct = a("js_tag_load_success_hosts", "load,load_succeeded");
        cu = a("js_tag_load_failure_hosts", "failLoad,load_failed");
        cv = a("auxiliary_operations_threads", 1);
        cw = a("sutwfat", bool);
        cx = f.a(timeUnit2, 10L, "fullscreen_ad_pending_display_state_timeout_ms");
        cy = f.a(timeUnit, 2L, "fullscreen_ad_showing_state_timeout_ms");
        cz = a("lhs_close_button_video", bool);
        cA = a("close_button_right_margin_video", 4);
        cB = a("close_button_size_video", 30);
        cC = a("close_button_top_margin_video", 8);
        cD = a("video_countdown_clock_margin", 10);
        cE = a("video_countdown_clock_gravity", 83);
        cF = a("countdown_clock_size", 32);
        cG = a("countdown_clock_stroke_size", 4);
        cH = a("countdown_clock_text_size", 28);
        cI = a("draw_countdown_clock", bool2);
        cJ = a("inter_display_delay", 200L);
        cK = a("maximum_close_button_delay_seconds", 999L);
        cL = a("respect_close_button", bool2);
        cM = a("lhs_skip_button", bool2);
        cN = a("mute_controls_enabled", bool);
        cO = a("allow_user_muting", bool2);
        cP = a("mute_videos", bool);
        cQ = a("show_mute_by_default", bool);
        cR = a("mute_with_user_settings", bool2);
        cS = a("mute_button_size", 32);
        cT = a("mute_button_margin", 10);
        cU = a("mute_button_gravity", 85);
        cV = a("progress_bar_step", 25L);
        cW = a("progress_bar_scale", 10000);
        cX = a("progress_bar_vertical_padding", -8);
        cY = a("vs_buffer_indicator_size", 50);
        cZ = a("video_zero_length_as_computed", bool);
        f10358da = a("set_poststitial_muted_initial_delay_ms", 500L);
        f10359db = a("fasuic", bool2);
        f10360dc = a("ssfwif", bool);
        f10361dd = a("fsahrpg", bool2);
        f10362de = a("eaafrwsoa", bool2);
        df = a("postitial_progress_bar_step_ms", 25L);
        dg = a("postitial_progress_bar_on_bottom", bool2);
        dh = a("postitial_progress_bar_vertical_padding", -8);
        di = a("postitial_progress_bar_scale", 10000);
        dj = a("sutfaa", bool2);
        dk = a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        dl = a("submit_postback_retries", 4);
        dm = a("max_postback_attempts", 3);
        dn = a("fppopq", bool);
        f0do = a("max_persisted_postbacks", 100);
        dp = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit2.toMillis(7L)));
        dq = a("uppmv2", bool);
        dr = a("sossp", bool);
        ds = a("spp", bool2);
        dt = a("retry_on_all_errors", bool);
        du = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        dv = a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        dw = a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20L)));
        dx = a("force_ssl", bool);
        dy = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        dz = a("fetch_ad_retry_count_v1", 1);
        dA = a("faer", bool);
        dB = a("faroae", bool);
        dC = a("submit_data_retry_count_v1", 1);
        dD = a("response_buffer_size", 16000);
        dE = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        dF = a("fetch_basic_settings_retry_count", 3);
        dG = a("fetch_basic_settings_on_reconnect", bool);
        dH = a("skip_fetch_basic_settings_if_not_connected", bool);
        dI = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2L)));
        dJ = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(5L)));
        dK = a("idflrwbe", bool);
        dL = a("falawpr", bool);
        dM = a("sort_query_parameters", bool);
        dN = f.a(timeUnit2, 10L, "communicator_request_timeout_ms");
        dO = a("communicator_request_retry_count", 3);
        dP = f.a(timeUnit2, 2L, "communicator_request_retry_delay_ms");
        dQ = a("rfbsd_ms", -1L);
        dR = a("ehkpd_ms", 500L);
        dS = a("rironc", bool);
        dT = a("rroncbd", bool);
        dU = f.a(timeUnit2, 5L, "wverc_ms");
        dV = a("ad_session_minutes", 60);
        dW = a("session_tracking_cooldown_on_event_fire", bool2);
        dX = a("session_tracking_resumed_cooldown_minutes", 90L);
        dY = a("session_tracking_paused_cooldown_minutes", 90L);
        dZ = a("dc_v2", bool);
        f10363ea = a("dce", bool2);
        f10364eb = a("qq", bool);
        f10365ec = a("qq1", bool2);
        f10366ed = a("qq2", bool2);
        f10367ee = a("qq3", bool2);
        ef = a("qq4", bool2);
        eg = a("qq5", bool2);
        eh = a("qq6", bool2);
        ei = a("qq7", bool2);
        ej = a("qq8", bool2);
        ek = a("qq9", bool);
        el = a("qq10", bool2);
        em = a("qq11", bool2);
        en = a("pui", bool2);
        eo = a("plugin_version", "");
        ep = a("hgn", bool);
        eq = a("cso", bool);
        er = a("cfs", bool);
        es = a("cmi", bool);
        et = a("crat", bool);
        eu = a("cvs", bool);
        ev = a("caf", bool);
        ew = a("cf", bool);
        ex = a("cmtl", bool2);
        ey = a("cnr", bool);
        ez = a("ccr", bool);
        eA = a("adr", bool);
        eB = a("volume_normalization_factor", Float.valueOf(6.6666665f));
        eC = a("system_user_agent_collection_enabled", bool);
        eD = a(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED, bool);
        eE = a("collect_device_angle", bool);
        eF = a("collect_device_movement", bool);
        eG = a("movement_degradation", Float.valueOf(0.75f));
        eH = a("device_sensor_period_ms", Integer.valueOf(BaseTransientBottomBar.ANIMATION_DURATION));
        eI = a("dte", bool2);
        eJ = a("idcw", bool);
        eK = a("anr_debug_thread_refresh_time_ms", -1L);
        eL = a("fetch_basic_settings_delay_ms", Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        eM = a("mpa", "{\"com.google.ads\":\"admob\",\"com.appodeal.ads\":\"appodeal\",\"com.fyber.fairbid\":\"fyber\",\"com.ironsource.adapters\":\"ironsource\"}");
        eN = a("mpsl", 10);
        eO = a("dcttl_1_seconds", 5);
        eP = a("dcttl_2_seconds", 30);
        eQ = a("dcttl_3_seconds", Integer.valueOf((int) timeUnit.toSeconds(1L)));
        eR = a("dcttl_4_seconds", Integer.valueOf((int) timeUnit.toSeconds(30L)));
        eS = a("dcttl_5_seconds", Integer.valueOf((int) TimeUnit.HOURS.toSeconds(1L)));
        eT = a("dcttl_6_seconds", Integer.valueOf((int) timeUnit3.toSeconds(1L)));
        eU = a("cclia", bool2);
        eV = a("lccdm", 10L);
        eW = a("lmfd", 2);
        eX = a("is_track_ad_info", bool2);
        eY = a("submit_ad_stats_enabled", bool);
        eZ = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f10368fa = a("submit_ad_stats_retry_count", 1);
        f10369fb = a("submit_ad_stats_max_count", 500);
        f10370fc = a("asdm", bool);
        f10371fd = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        f10372fe = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        ff = a("vast_max_response_length", 640000);
        fg = a("vast_max_wrapper_depth", 5);
        fh = a("vast_unsupported_video_extensions", "ogv,flv");
        fi = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        fj = a("vast_validate_with_extension_if_no_video_type", bool2);
        fk = a("vast_video_selection_policy", Integer.valueOf(n.a.MEDIUM.ordinal()));
        fl = a("vast_wrapper_resolution_retry_count_v1", 1);
        fm = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        fn = a("vast_industry_icon_max_size", 20);
        fo = a("vast_industry_icon_margin", 12);
        fp = a("vast_industry_icon_gravity", 85);
        fq = a("vast_native_mute_button_size", 24);
        fr = a("vast_native_play_pause_button_size", 24);
        fs = a("vast_native_video_widget_padding", 6);
        ft = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        fu = a("vast_native_video_widgets_enabled", bool2);
        fv = a("vast_replay_video_upon_completion", bool2);
        fw = a("vast_replay_icon_size", 64);
        fx = a("ree", bool2);
        r.a aVar = r.a.DEFAULT;
        fy = a("ree_t", Integer.valueOf(aVar.a()));
        fz = a("btee", bool2);
        fA = a("btet", Integer.valueOf(aVar.a()));
        fB = a("reetoa", bool);
        fC = a("reet_msfs", Integer.valueOf(aVar.a()));
        fD = a("reet_msma", Integer.valueOf(aVar.a()));
        fE = a("reet_msmd", Integer.valueOf(aVar.a()));
        fF = a("reet_msfv", Integer.valueOf(aVar.a()));
        fG = a("reet_asfp", Integer.valueOf(aVar.a()));
        fH = a("reet_asfg", Integer.valueOf(aVar.a()));
        fI = a("reet_aset", Integer.valueOf(aVar.a()));
        fJ = a("reet_esdi", Integer.valueOf(aVar.a()));
        fK = a("reet_esrp", Integer.valueOf(aVar.a()));
        fL = a("apdra", bool);
        fM = a("apdrfs", bool);
        fN = a("apdrma", bool);
        fO = a("apdrmd", bool);
        fP = a("apdrfa", bool);
        fQ = a("apdrev", bool);
        fR = a("apdrdi", bool);
        fS = a("apdrrp", bool);
        fT = a("server_timestamp_ms", 0L);
        fU = a("device_timestamp_ms", 0L);
        fV = a("gzip_min_length", 0);
        fW = a("gzip_encoding_default", bool);
        fX = a("fetch_settings_gzip", bool);
        fY = a("device_init_gzip", bool);
        fZ = a("fetch_ad_gzip", bool);
        f10373ga = a("event_tracking_gzip", bool);
        f10374gb = a("reward_postback_gzip", bool);
        f10375gc = a("force_rerender", bool);
        f10376gd = a("daostr", bool);
        f10377ge = a("tctlaa", bool);
        gf = a("rwvdv", bool);
        gg = a("handle_render_process_gone", bool2);
        gh = a("rworpg", bool2);
        gi = a("fdadaomr", bool2);
        gj = a("teorpc", bool);
        gk = a("rmpibt", bool);
        gl = a("spbcioa", bool);
        gm = a("set_webview_render_process_client", bool);
        gn = a("disable_webview_hardware_acceleration", bool);
        go = a("dsaovcf", bool);
        gp = a("daoar", bool);
        gq = a("anr_detection_enabled", bool);
        gr = a("anr_trigger_millis", 4000L);
        gs = a("anr_touch_millis", 3000L);
        gt = a("anr_check_millis", 3000L);
        gu = a("uobid", bool2);
        gv = a("bvde", bool);
        gw = a("bvdidm", 1000L);
        gx = a("bvdim", 4000L);
        gy = a("bvdrs", 10);
        gz = a("bvdct", 230);
        gA = a("bvad", bool);
        gB = a("bvebb", bool2);
        gC = a("bvscb", bool2);
        gD = a("apsobt", bool2);
        gE = a("tmtp", 1);
        gF = a("ntp", 5);
        gG = a("uwtm", bool);
        gH = a("dwvvb", bool);
        gI = a("paiobt", bool);
        gJ = a("ej8left", Boolean.valueOf(w.b(1)));
        gK = a("ej8mrft", Boolean.valueOf(w.b(1)));
        gL = a("ej8dmft", Boolean.valueOf(w.b(1)));
        gM = a("ej8fk", bool);
        gN = a("stcpc", bool2);
        gO = a("stcic", bool2);
        gP = a("unltrwb", bool);
        gQ = a("tdi_ms", -1L);
        gR = a("tdp", "pool,Char,AdWo,csj,vng,FAN,Fyb,Thr");
        gS = a("enais", bool);
        gT = a("config_consent_dialog_state", AppLovinMediationProvider.UNKNOWN);
        gU = a("country_code", "");
        gV = a("consent_flow_doc_url", "https://dash.applovin.com/documentation/mediation/android/getting-started/integration#enabling-max-built-in-consent-flow");
        gW = a("consent_flow_unity_doc_url", "https://dash.applovin.com/documentation/mediation/unity/getting-started/integration#max-built-in-consent-flow");
        gX = a("cfadtml", 20);
        gY = a("cfdpu_advertising", "https://corp.aarki.com/privacy,https://www.adcolony.com/consumer-privacy/,https://www.adikteev.com/privacy-policy-eng,https://advertising.amazon.com/resources/ad-policy/eu-data-protection-and-privacy,https://www.appier.com/privacy-policy/,https://www.appnexus.com/en/company/privacy-policy,https://www.beeswax.com/privacy.html,https://bidease.com/privacy-policy,https://www.bigabid.com/Legal/,https://www.pangleglobal.com/privacy,https://answers.chartboost.com/en-us/articles/200780269,https://clearpier.com/privacy-policy/,https://www.criteo.com/privacy/,https://dataseat.com/privacy-policy,https://nend.net/privacy/sdkpolicy,https://www.fyber.com/services-privacy-statement/,https://privacy-policy.cyberagent.ai/,https://policies.google.com/privacy,https://www.inmobi.com/privacy-policy/,https://www.is.com/privacy-policy/,https://www.jampp.com/privacy-policy-terms-and-conditions,https://www.lifestreet.com/privacy/,https://liftoff.io/privacy-policy/,https://terms2.line.me/creators_privacy_policy,https://www.linkedin.com/legal/privacy-policy?src=or-search&veh=www.google.comLiqui,https://loopme.com/end-user-privacy-policy/,https://mediasmart.io/privacy-policy/,https://www.facebook.com/privacy/explanation/,https://www.mintegral.com/en/privacy/#privacy-Services,https://www.moloco.com/privacy-policy,https://www.motiv-i.com/en/privacy/,https://ogury.com/privacy-policy/,https://persona.ly/privacy_dsp,https://www.opera.com/privacy,https://pubmatic.com/legal/privacy/,https://kayzen.io/data-privacy-policy,https://www.remerge.io/privacy-policy.html,https://revx.io/privacy-policy,https://www.rtbhouse.com/privacy-center/services-privacy-policy/,https://simpli.fi/simpli-fi-services-privacy-policy/,https://www.smaato.com/privacy/,https://smadex.com/end-user-privacy-policy,https://snap.com/en-US/privacy/privacy-policy,https://www.stackadapt.com/privacy,https://www.start.io/policy/privacy-policy-site/,https://www.tapjoy.com/legal/general/privacy-policy/,https://taurusx.com/privacy-policy.html,https://rubiconproject.com/privacy-policy/,https://www.thetradedesk.com/general/privacy-policy,https://appreciate.mobi/page.html#!/end-user-privacy-policy,https://twitter.com/privacy,https://uni-corn.net/privacy.html,https://unity3d.com/legal/privacy-policy,https://www.valassis.com/legal/privacy-policy/,https://pubnative.net/privacy-notice/,https://vungle.com/privacy/,https://wildlifestudios.com/policy-center/privacy-policy/wildlife-studios-privacy-policy/,https://www.groundtruth.com/privacy-policy/,https://yandex.com/legal/confidential/,https://www.youappi.com/privacy-policy");
        gZ = a("cfdpu_analytics", "https://www.adjust.com/terms/privacy-policy/,https://www.appsflyer.com/legal/privacy-policy/,https://branch.io/policies/privacy-policy/");
        f10378ha = a("communicator_enabled", bool2);
    }

    public b(String str, T t10) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f10379c = str;
        this.f10380d = t10;
    }

    public static <T> b<T> a(String str, T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        if (!f10342a.contains(t10.getClass())) {
            StringBuilder sbA = defpackage.a.a("Unsupported value type: ");
            sbA.append(t10.getClass());
            throw new IllegalArgumentException(sbA.toString());
        }
        b<T> bVar = new b<>(str, t10);
        Map<String, b<?>> map = f10346b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(i.f.a("Setting has already been used: ", str));
        }
        map.put(str, bVar);
        return bVar;
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(f10346b.values());
    }

    public T a(Object obj) {
        return (T) this.f10380d.getClass().cast(obj);
    }

    public String a() {
        return this.f10379c;
    }

    public T b() {
        return this.f10380d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof b)) {
            return 0;
        }
        return this.f10379c.compareTo(((b) obj).a());
    }
}
