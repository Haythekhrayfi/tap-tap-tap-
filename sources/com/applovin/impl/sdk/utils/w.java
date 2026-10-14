package com.applovin.impl.sdk.utils;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f11387b = {" second ago", " minute ago", " hour ago", " day ago", " week ago", " month ago"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f11388c = {" seconds ago", " minutes ago", " hours ago", " days ago", " weeks ago", " months ago"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f11389d = {"s", "m", "h", "d", "w", "mth"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f11390e = {60, 60, 24, 7, 4, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final DecimalFormat f11391f = new DecimalFormat();

    public static double a(long j10) {
        return j10 / 1000.0d;
    }

    public static double a(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Failed to parse double from String: " + str, th);
            return d10;
        }
    }

    public static float a(float f10) {
        return f10 * 1000.0f;
    }

    public static int a(int i10) {
        return i10 * 1024;
    }

    public static int a(JSONObject jSONObject) {
        int i10 = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i10 < 0 || i10 > 100) {
            return 95;
        }
        return i10;
    }

    public static long a(com.applovin.impl.sdk.o oVar) {
        long jLongValue = ((Long) oVar.a(com.applovin.impl.sdk.c.b.fT)).longValue();
        long jLongValue2 = ((Long) oVar.a(com.applovin.impl.sdk.c.b.fU)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : (jLongValue - jLongValue2) + jCurrentTimeMillis;
    }

    public static long a(byte[] bArr, int i10) {
        int i11 = i10 + 8;
        if (bArr.length < i11) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j10 = 0;
        while (i10 < i11) {
            j10 |= (((long) bArr[i10]) & 255) << (i10 * 8);
            i10++;
        }
        return j10;
    }

    public static Activity a(View view, com.applovin.impl.sdk.o oVar) {
        if (view == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 1000) {
            i10++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().b("Utils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static View a(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static WebView a(Context context, String str) {
        return a(context, str, false);
    }

    public static WebView a(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (z10) {
                webView.setWebViewClient(new com.applovin.impl.sdk.ab());
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static com.applovin.impl.sdk.ad.d a(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.o oVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.f fVar = (com.applovin.impl.sdk.ad.f) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = oVar.v().dequeueAd(fVar.getAdZone());
        oVar.F();
        if (com.applovin.impl.sdk.y.a()) {
            oVar.F().b("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd == null) {
            return fVar.a();
        }
        fVar.a(appLovinAdDequeueAd);
        ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(fVar);
        return appLovinAdDequeueAd;
    }

    public static Object a(Object obj, com.applovin.impl.sdk.o oVar) {
        int iIntValue;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                map2.put(key instanceof String ? (String) key : String.valueOf(key), a(entry.getValue(), oVar));
            }
            return map2;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next(), oVar));
            }
            return arrayList;
        }
        if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        }
        String strValueOf = String.valueOf(obj);
        if (obj instanceof String) {
            iIntValue = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.bu)).intValue();
            if (iIntValue <= 0 || strValueOf.length() <= iIntValue) {
                return strValueOf;
            }
        } else if (!(obj instanceof Uri) || (iIntValue = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.bv)).intValue()) <= 0 || strValueOf.length() <= iIntValue) {
            return strValueOf;
        }
        return strValueOf.substring(0, iIntValue);
    }

    public static String a(double d10, int i10) {
        DecimalFormat decimalFormat = f11391f;
        decimalFormat.setMaximumFractionDigits(i10);
        return decimalFormat.format(d10);
    }

    public static String a(int i10, Context context, com.applovin.impl.sdk.o oVar) {
        if (i10 == 0) {
            return "";
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e10) {
                if (oVar != null) {
                    oVar.F();
                    if (com.applovin.impl.sdk.y.a()) {
                        oVar.F().b("Utils", "Opening raw resource file threw exception", e10);
                    }
                }
                return "";
            } finally {
                a((Closeable) inputStreamOpenRawResource, oVar);
            }
        } catch (Throwable th) {
            if (oVar != null) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().b("Utils", "Failed to retrieve resource " + i10, th);
                }
            }
            return "";
        }
    }

    public static String a(long j10, boolean z10) {
        String[] strArr = z10 ? f11387b : f11389d;
        String[] strArr2 = z10 ? f11388c : f11389d;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int[] iArr = f11390e;
            if (jCurrentTimeMillis < iArr[i10]) {
                if (jCurrentTimeMillis <= 0) {
                    return z10 ? "just now" : "now";
                }
                return jCurrentTimeMillis == 1 ? String.format("%d%s", Long.valueOf(jCurrentTimeMillis), strArr[i10]) : String.format("%d%s", Long.valueOf(jCurrentTimeMillis), strArr2[i10]);
            }
            jCurrentTimeMillis /= (long) iArr[i10];
        }
        return z10 ? "just now" : "now";
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.o oVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) oVar.a(com.applovin.impl.sdk.c.b.bG);
        int length = StringUtils.emptyIfNull(str).length() + StringUtils.emptyIfNull(strEncodeUriString).length();
        if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(strEncodeUriString) && StringUtils.isValidString(str)) ? i.f.a(str, strEncodeUriString) : strEncodeUriString;
    }

    public static String a(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).j();
        }
        if (com.applovin.impl.mediation.d.c.a(obj)) {
            return ((com.applovin.impl.sdk.ad.e) obj).Q();
        }
        return null;
    }

    public static String a(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static String a(Map<String, String> map, boolean z10) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.w.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(String str, String str2) {
                    return str.compareToIgnoreCase(str2);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            String value = entry.getValue();
            if (value instanceof String) {
                String str = value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb2.append((Object) entry.getKey());
            sb2.append('=');
            sb2.append((Object) value);
        }
        return sb2.toString();
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List<com.applovin.impl.sdk.d.a> a(String str, JSONObject jSONObject, String str2, String str3, com.applovin.impl.sdk.o oVar) {
        return a(str, jSONObject, str2, null, str3, oVar);
    }

    public static List<com.applovin.impl.sdk.d.a> a(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, com.applovin.impl.sdk.o oVar) {
        return a(str, jSONObject, str2, map, str3, null, false, oVar);
    }

    public static List<com.applovin.impl.sdk.d.a> a(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.o oVar) {
        if (map == null) {
            map = new HashMap<>(1);
        }
        Map<String, String> map3 = map;
        map3.put("{CLCODE}", str2);
        return a(str, jSONObject, map3, str3, map2, z10, oVar);
    }

    public static List<com.applovin.impl.sdk.d.a> a(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.o oVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new com.applovin.impl.sdk.d.a(str2, null, map2, z10));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject2.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(strOptString)) {
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new com.applovin.impl.sdk.d.a(strReplace, strOptString, map2, z10));
                    }
                } catch (Throwable th) {
                    oVar.F();
                    if (com.applovin.impl.sdk.y.a()) {
                        oVar.F().b("Utils", "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<Class> a(List<String> list, com.applovin.impl.sdk.o oVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().e("Utils", "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static List<Uri> a(boolean z10, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.o oVar, Context context) {
        if (eVar instanceof com.applovin.impl.c.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(eVar.B())) {
            if (!oVar.S().b(uri.getLastPathSegment(), context)) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().e("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z10) {
            Uri uriH = eVar.h();
            if (!oVar.S().b(uriH.getLastPathSegment(), context)) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().e("Utils", "Cached video missing: " + uriH);
                }
                arrayList.add(uriH);
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field fieldA = a(appLovinSdkSettings.getClass(), "metaData");
            if (fieldA != null) {
                fieldA.setAccessible(true);
            }
            return (Map) fieldA.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, String> a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    public static Map<String, String> a(Map<String, String> map, com.applovin.impl.sdk.o oVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.o oVar) {
        if (activity == null) {
            activity = oVar.at();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, oVar.ax());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb2.append(y.q.a("\nFailed to load ", str, " from ", name, ":\n"));
                sb2.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb2.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            StringBuilder sbA = androidx.activity.result.c.a("Failed to load ", str, " with error ");
            sbA.append(maxError.getCode());
            sbA.append(": ");
            sbA.append(maxError.getMessage());
            sb2.append(sbA.toString());
        }
        a("", sb2.toString(), context);
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.o oVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (oVar != null) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().b("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.w.2
            @Override // java.lang.Runnable
            public void run() {
                Toast toastMakeText = Toast.makeText(context, str, 0);
                toastMakeText.setMargin(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.1f);
                toastMakeText.show();
            }
        });
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sbA = androidx.activity.result.c.a("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            sbA.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sbA.append("\"\n..SDK KEY: \"");
            sbA.append(oVar.ax());
            sbA.append("\"\n..PACKAGE NAME: \"");
            sbA.append(com.applovin.impl.sdk.o.au().getPackageName());
            sbA.append("\"\n..Reason: ");
            sbA.append(object);
            sbA.append("\n**************************************************\n");
            String string = sbA.toString();
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().e("AppLovinSdk", string);
            }
        }
    }

    public static void a(String str, String str2) {
        if (str == null || str.length() <= a(8)) {
            return;
        }
        StringBuilder sbA = defpackage.a.a("Provided custom data parameter longer than supported (");
        sbA.append(str.length());
        sbA.append(" bytes, ");
        sbA.append(a(8));
        sbA.append(" maximum)");
        com.applovin.impl.sdk.y.h(str2, sbA.toString());
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.o oVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (oVar != null) {
                oVar.F();
                if (com.applovin.impl.sdk.y.a()) {
                    oVar.F().b("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static boolean a() {
        Context contextAu = com.applovin.impl.sdk.o.au();
        if (contextAu != null) {
            return e.a(contextAu).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean a(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static boolean a(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.o.au();
        }
        if (context != null) {
            return e.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean a(Context context, com.applovin.impl.sdk.o oVar) {
        String str = oVar.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.RUN_IN_RELEASE_MODE);
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean a(View view, Activity activity) {
        View rootView;
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                rootView = window.getDecorView();
            } else {
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    rootView = viewFindViewById.getRootView();
                }
            }
            return a(view, rootView);
        }
        return false;
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (a(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER || appLovinAdSize == AppLovinAdSize.CROSS_PROMO;
    }

    public static boolean a(Object obj, List<String> list, com.applovin.impl.sdk.o oVar) {
        if (list == null) {
            return false;
        }
        Iterator<Class> it = a(list, oVar).iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(obj)) {
                if (!(obj instanceof Map)) {
                    if (!(obj instanceof List)) {
                        return true;
                    }
                    Iterator it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        if (!a(it2.next(), list, oVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!(entry.getKey() instanceof String)) {
                        oVar.F();
                        if (com.applovin.impl.sdk.y.a()) {
                            oVar.F().b("Utils", "Invalid key type used. Map keys should be of type String.");
                        }
                        return false;
                    }
                    if (!a(entry.getValue(), list, oVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
        oVar.F();
        if (com.applovin.impl.sdk.y.a()) {
            oVar.F().b("Utils", "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static boolean a(String str, List<String> list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    public static boolean a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (b(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static int b(String str, String str2) {
        try {
            int iCompareTo = VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str)).compareTo(VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str2)));
            if (iCompareTo == 0) {
                return iCompareTo;
            }
            return iCompareTo > 0 ? 1 : -1;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static long b(float f10) {
        return c(a(f10));
    }

    public static long b(long j10) {
        return j10 * 8;
    }

    public static String b(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0).activityInfo.name;
    }

    public static String b(Class cls, String str) {
        try {
            Field fieldA = a(cls, str);
            fieldA.setAccessible(true);
            return (String) fieldA.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.o oVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String strAx = oVar.ax();
            String strAx2 = ((AppLovinAdBase) appLovinAd).getSdk().ax();
            if (strAx.equals(strAx2)) {
                return;
            }
            com.applovin.impl.sdk.y.j("AppLovinAd", "Ad was loaded from sdk with key: " + strAx2 + ", but is being rendered from sdk with key: " + strAx);
            oVar.J().a(com.applovin.impl.sdk.d.f.f10476n);
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean b(int i10) {
        return i10 > 0 && i10 <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= i10;
    }

    public static boolean b(com.applovin.impl.sdk.o oVar) {
        if (!h.c()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            oVar.F();
            if (!com.applovin.impl.sdk.y.a()) {
                return false;
            }
            oVar.F().a("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(List<String> list) {
        Context contextAu = com.applovin.impl.sdk.o.au();
        if (contextAu != null) {
            return list.contains(contextAu.getPackageName());
        }
        com.applovin.impl.sdk.y.j("Utils", "Failed to check whether or not app is member of package names");
        return false;
    }

    public static byte[] b(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static double c(long j10) {
        return j10 / 1024.0d;
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(String str, String str2) {
        return Integer.compare(str.length(), str2.length());
    }

    private static long c(float f10) {
        return Math.round(f10);
    }

    public static long c(String str) {
        if (!StringUtils.isValidString(str)) {
            return RecyclerView.FOREVER_NS;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return RecyclerView.FOREVER_NS;
        }
    }

    public static boolean c() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean c(com.applovin.impl.sdk.o oVar) {
        return ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cR)).booleanValue() ? oVar.ay().isMuted() : ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cP)).booleanValue();
    }

    public static byte[] c(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0 || !a(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2);
            if (i10 <= 0) {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
        }
    }

    public static double d(long j10) {
        return c(b(j10));
    }

    public static int d(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.y.j("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static long d(byte[] bArr) {
        return a(bArr, 0);
    }

    public static boolean d() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static boolean d(Context context) {
        return e.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean d(com.applovin.impl.sdk.o oVar) {
        String str = oVar.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static int e(Context context) {
        h.b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static void e(com.applovin.impl.sdk.o oVar) {
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gM)).booleanValue()) {
            return;
        }
        List listAsList = Arrays.asList("1", "12", "123", "1234");
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gJ)).booleanValue() && ((Boolean) oVar.b(com.applovin.impl.sdk.c.d.U, Boolean.TRUE)).booleanValue()) {
            try {
                Collections.sort(listAsList, m0.d.f33128g);
            } catch (Throwable th) {
                HashMap map = new HashMap();
                map.put("source", com.applovin.impl.sdk.c.b.gJ.a());
                map.put("details", th.toString());
                oVar.ag().a(com.applovin.impl.sdk.s.a.JAVA_8_EXCEPTION, map);
                oVar.a(com.applovin.impl.sdk.c.d.U, Boolean.FALSE);
            }
        }
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gK)).booleanValue() && ((Boolean) oVar.b(com.applovin.impl.sdk.c.d.V, Boolean.TRUE)).booleanValue()) {
            try {
                Collections.sort(listAsList, com.applovin.exoplayer2.j.l.f7311f);
            } catch (Throwable th2) {
                HashMap map2 = new HashMap();
                map2.put("source", com.applovin.impl.sdk.c.b.gK.a());
                map2.put("details", th2.toString());
                oVar.ag().a(com.applovin.impl.sdk.s.a.JAVA_8_EXCEPTION, map2);
                oVar.a(com.applovin.impl.sdk.c.d.V, Boolean.FALSE);
            }
        }
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gL)).booleanValue() && ((Boolean) oVar.b(com.applovin.impl.sdk.c.d.W, Boolean.TRUE)).booleanValue()) {
            try {
                new m(3).b();
            } catch (Throwable th3) {
                HashMap map3 = new HashMap();
                map3.put("source", com.applovin.impl.sdk.c.b.gL.a());
                map3.put("details", th3.toString());
                oVar.ag().a(com.applovin.impl.sdk.s.a.JAVA_8_EXCEPTION, map3);
                oVar.a(com.applovin.impl.sdk.c.d.W, Boolean.FALSE);
            }
        }
    }

    public static String f() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static boolean f(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static int g() {
        return 2015001;
    }

    public static boolean g(Context context) {
        if (f11386a == null) {
            f11386a = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f11386a.booleanValue();
    }

    public static boolean h() {
        try {
            String str = AppLovinSdk.VERSION;
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static void i() {
    }

    public static void j() {
    }

    public static void k() {
        com.applovin.impl.sdk.y.f("AppLovinSdk", "Java version 8 supported.");
    }
}
