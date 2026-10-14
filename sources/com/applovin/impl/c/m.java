package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateFormat f8929a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f8930b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j10, Uri uri, f fVar, com.applovin.impl.sdk.o oVar) {
        if (!URLUtil.isValidUrl(str)) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
        try {
            String string = Integer.toString(fVar.a());
            String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
            if (j10 >= 0) {
                strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j10));
            }
            if (uri != null) {
                strReplace = strReplace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastUtils", "Unable to replace macros in URL string " + str, th);
            }
            oVar.ag().a("VastUtils", th);
            return null;
        }
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(f8930b.nextInt(89999999) + 10000000);
    }

    private static String a(long j10) {
        if (j10 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j10);
        long minutes = timeUnit.toMinutes(j10);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
    }

    public static String a(e eVar) {
        aa aaVarC;
        if (eVar == null) {
            throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
        }
        List<aa> listB = eVar.b();
        int size = eVar.b().size();
        if (size <= 0 || (aaVarC = listB.get(size - 1).c("VASTAdTagURI")) == null) {
            return null;
        }
        return aaVarC.c();
    }

    public static String a(aa aaVar, String str, String str2) {
        aa aaVarB = aaVar.b(str);
        if (aaVarB != null) {
            String strC = aaVarB.c();
            if (StringUtils.isValidString(strC)) {
                return strC;
            }
        }
        return str2;
    }

    private static Set<k> a(e eVar, com.applovin.impl.sdk.o oVar) {
        if (eVar == null) {
            return null;
        }
        List<aa> listB = eVar.b();
        Set<k> hashSet = new HashSet<>(listB.size());
        for (aa aaVar : listB) {
            aa aaVarC = aaVar.c("Wrapper");
            if (aaVarC == null) {
                aaVarC = aaVar.c("InLine");
            }
            hashSet = a(hashSet, aaVarC != null ? aaVarC.a("Error") : aaVar.a("Error"), eVar, oVar);
        }
        oVar.F();
        if (y.a()) {
            y yVarF = oVar.F();
            StringBuilder sbA = defpackage.a.a("Retrieved ");
            sbA.append(hashSet.size());
            sbA.append(" top level error trackers: ");
            sbA.append(hashSet);
            yVarF.b("VastUtils", sbA.toString());
        }
        return hashSet;
    }

    private static Set<k> a(Set<k> set, List<aa> list, e eVar, com.applovin.impl.sdk.o oVar) {
        if (list != null) {
            Iterator<aa> it = list.iterator();
            while (it.hasNext()) {
                k kVarA = k.a(it.next(), eVar, oVar);
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }
        return set;
    }

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i10, com.applovin.impl.sdk.o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
        a(a(eVar, oVar), fVar, oVar);
    }

    public static void a(aa aaVar, Map<String, Set<k>> map, e eVar, com.applovin.impl.sdk.o oVar) {
        List<aa> listA;
        if (oVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (aaVar == null) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        aa aaVarB = aaVar.b("TrackingEvents");
        if (aaVarB == null || (listA = aaVarB.a("Tracking")) == null) {
            return;
        }
        for (aa aaVar2 : listA) {
            String str = aaVar2.b().get("event");
            if (StringUtils.isValidString(str)) {
                k kVarA = k.a(aaVar2, eVar, oVar);
                if (kVarA != null) {
                    Set<k> set = map.get(str);
                    if (set != null) {
                        set.add(kVarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                oVar.F();
                if (y.a()) {
                    oVar.F().e("VastUtils", "Could not find event for tracking node = " + aaVar2);
                }
            }
        }
    }

    public static void a(List<aa> list, Set<k> set, e eVar, com.applovin.impl.sdk.o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            oVar.F();
            if (y.a()) {
                oVar.F().e("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator<aa> it = list.iterator();
        while (it.hasNext()) {
            k kVarA = k.a(it.next(), eVar, oVar);
            if (kVarA != null) {
                set.add(kVarA);
            }
        }
    }

    public static void a(Set<k> set, long j10, Uri uri, f fVar, com.applovin.impl.sdk.o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator<k> it = set.iterator();
        while (it.hasNext()) {
            Uri uriA = a(it.next().b(), j10, uri, fVar, oVar);
            if (uriA != null) {
                oVar.ai().a(com.applovin.impl.sdk.network.j.p().c(uriA.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(Set<k> set, f fVar, com.applovin.impl.sdk.o oVar) {
        a(set, -1L, (Uri) null, fVar, oVar);
    }

    public static void a(Set<k> set, com.applovin.impl.sdk.o oVar) {
        a(set, -1L, (Uri) null, f.UNSPECIFIED, oVar);
    }

    public static boolean a(aa aaVar) {
        if (aaVar != null) {
            return aaVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = f8929a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean b(a aVar) {
        n nVarAT;
        List<o> listA;
        return (aVar == null || (nVarAT = aVar.aT()) == null || (listA = nVarAT.a()) == null || listA.isEmpty()) ? false : true;
    }

    public static boolean b(aa aaVar) {
        if (aaVar != null) {
            return aaVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        d dVarAV;
        i iVarB;
        if (aVar == null || (dVarAV = aVar.aV()) == null || (iVarB = dVarAV.b()) == null) {
            return false;
        }
        return iVarB.b() != null || StringUtils.isValidString(iVarB.c());
    }
}
