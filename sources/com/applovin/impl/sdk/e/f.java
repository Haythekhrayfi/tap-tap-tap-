package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.developer.filepicker.model.DialogConfigs;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends d implements com.applovin.impl.mediation.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.e f10538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.d.e f10539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f10540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExecutorService f10541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<com.applovin.impl.sdk.e.a> f10542e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AppLovinAdLoadListener f10544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.u f10545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Collection<Character> f10546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10547m;

    public interface a {
        void a(String str);
    }

    public f(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.o oVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, oVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f10538a = eVar;
        this.f10544j = appLovinAdLoadListener;
        this.f10545k = oVar.S();
        this.f10546l = l();
        this.f10539b = new com.applovin.impl.sdk.d.e();
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
            this.f10543i = StringUtils.isValidString(eVar.Q()) ? eVar.Q() : UUID.randomUUID().toString();
            r rVarG = oVar.G();
            StringBuilder sbA = defpackage.a.a("com.applovin.sdk.caching.");
            sbA.append(this.f10543i);
            this.f10540c = rVarG.a(sbA.toString(), ((Integer) oVar.a(com.applovin.impl.sdk.c.b.bI)).intValue());
            r rVarG2 = oVar.G();
            StringBuilder sbA2 = defpackage.a.a("com.applovin.sdk.caching.html.");
            sbA2.append(this.f10543i);
            this.f10541d = rVarG2.a(sbA2.toString(), ((Integer) oVar.a(com.applovin.impl.sdk.c.b.bJ)).intValue());
        }
    }

    private Uri a(String str, String str2) {
        StringBuilder sb2;
        String strReplace = str2.replace(DialogConfigs.DIRECTORY_SEPERATOR, "_");
        String strO = this.f10538a.O();
        if (StringUtils.isValidString(strO)) {
            strReplace = i.f.a(strO, strReplace);
        }
        File fileA = this.f10545k.a(strReplace, com.applovin.impl.sdk.o.au());
        if (fileA == null) {
            return null;
        }
        if (fileA.exists()) {
            this.f10539b.b(fileA.length());
            sb2 = new StringBuilder();
        } else {
            if (!this.f10545k.a(fileA, i.f.a(str, str2), Arrays.asList(str), this.f10539b)) {
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("file://");
        sb2.append(fileA.getAbsolutePath());
        return Uri.parse(sb2.toString());
    }

    private Collection<Character> l() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f10534f.a(com.applovin.impl.sdk.c.b.bB)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add(Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR));
        return hashSet;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching " + str + " image...");
        }
        return c(string);
    }

    public Uri a(String str, List<String> list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching video " + str + "...");
        }
        String strA = this.f10545k.a(f(), str, this.f10538a.O(), list, z10, this.f10539b);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Failed to cache video");
            }
            j();
            return null;
        }
        File fileA = this.f10545k.a(strA, f());
        if (fileA == null) {
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f10536h.e(this.f10535g, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile != null) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar = this.f10536h;
                String str2 = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Finish caching video for ad #");
                sbA.append(this.f10538a.getAdIdNumber());
                sbA.append(". Updating ad with cachedVideoFilename = ");
                sbA.append(strA);
                yVar.b(str2, sbA.toString());
            }
            return uriFromFile;
        }
        if (!com.applovin.impl.sdk.y.a()) {
            return null;
        }
        this.f10536h.e(this.f10535g, "Unable to create URI from cached video file = " + fileA);
        return null;
    }

    public b a(String str, List<String> list, final a aVar) {
        return new b(str, this.f10538a, list, this.f10539b, this.f10541d, this.f10534f, new b.a() { // from class: com.applovin.impl.sdk.e.f.4
            @Override // com.applovin.impl.sdk.e.b.a
            public void a(String str2, boolean z10) {
                if (z10) {
                    f.this.j();
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2);
                }
            }
        });
    }

    public c a(String str, c.a aVar) {
        return new c(str, this.f10538a, this.f10539b, this.f10534f, aVar);
    }

    public c a(String str, List<String> list, boolean z10, final c.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f10536h.b(this.f10535g, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching video " + str + "...");
        }
        return new c(str, this.f10538a, list, z10, this.f10539b, this.f10534f, new c.a() { // from class: com.applovin.impl.sdk.e.f.3
            @Override // com.applovin.impl.sdk.e.c.a
            public void a(Uri uri) {
                if (uri == null) {
                    com.applovin.impl.sdk.y yVar = f.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        f fVar = f.this;
                        fVar.f10536h.e(fVar.f10535g, "Failed to cache video");
                    }
                    f.this.j();
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = f.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    f fVar2 = f.this;
                    com.applovin.impl.sdk.y yVar3 = fVar2.f10536h;
                    String str2 = fVar2.f10535g;
                    StringBuilder sbA = defpackage.a.a("Finish caching video for ad #");
                    sbA.append(f.this.f10538a.getAdIdNumber());
                    sbA.append(". Updating ad with cachedVideoURL = ");
                    sbA.append(uri);
                    yVar3.b(str2, sbA.toString());
                }
                aVar.a(uri);
            }
        });
    }

    public String a(String str, List<String> list) {
        Throwable th;
        InputStream inputStreamA;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File fileA = this.f10545k.a(com.applovin.impl.sdk.utils.w.a(uri, this.f10538a.O(), this.f10534f), f());
                if (fileA != null && fileA.exists()) {
                    return this.f10545k.a(fileA);
                }
                try {
                    inputStreamA = this.f10545k.a(str, list, true, this.f10539b);
                    if (inputStreamA != null) {
                        try {
                            this.f10545k.b(inputStreamA, fileA);
                        } catch (Throwable th2) {
                            th = th2;
                            com.applovin.impl.sdk.utils.w.a((Closeable) inputStreamA, this.f10534f);
                            throw th;
                        }
                    }
                    com.applovin.impl.sdk.utils.w.a((Closeable) inputStreamA, this.f10534f);
                    return this.f10545k.a(fileA);
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamA = null;
                }
            } catch (Throwable th4) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, androidx.activity.j.a("Resource at ", str, " failed to load."), th4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00ed, please report this as an issue */
    public String a(String str, List<String> list, com.applovin.impl.sdk.ad.e eVar) {
        com.applovin.impl.sdk.y yVar;
        String str2;
        String str3;
        StringBuilder sbA;
        Uri uriA;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bC)).booleanValue()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean zShouldCancelHtmlCachingIfShown = eVar.shouldCancelHtmlCachingIfShown();
        boolean zAR = eVar.aR();
        List<String> listK = eVar.K();
        for (String str4 : list) {
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < sb2.length()) {
                if (b()) {
                    return str;
                }
                iIndexOf = sb2.indexOf(str4, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = sb2.length();
                int i11 = iIndexOf;
                while (!this.f10546l.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10536h.e(this.f10535g, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String strSubstring = sb2.substring(str4.length() + iIndexOf, i11);
                if (StringUtils.isValidString(strSubstring)) {
                    if (zShouldCancelHtmlCachingIfShown && eVar.hasShown()) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f10536h.b(this.f10535g, "Cancelling HTML caching due to ad being shown already");
                        }
                        this.f10539b.a();
                        return str;
                    }
                    if (zAR) {
                        if (!eVar.d().equals(str4 + strSubstring)) {
                            uriA = a(str4, strSubstring);
                            if (uriA != null) {
                                sb2.replace(iIndexOf, i11, uriA.toString());
                                eVar.b(uriA);
                                this.f10539b.b();
                            } else {
                                if (listK.contains(str4 + strSubstring)) {
                                    j();
                                    this.f10547m = true;
                                }
                                this.f10539b.c();
                            }
                        } else if (com.applovin.impl.sdk.y.a()) {
                            yVar = this.f10536h;
                            str2 = this.f10535g;
                            sbA = android.support.v4.media.c.a("Postponing caching for \"", strSubstring);
                            str3 = "\" video resource";
                            sbA.append(str3);
                            yVar.b(str2, sbA.toString());
                        }
                    } else {
                        uriA = a(str4, strSubstring);
                        if (uriA != null) {
                            sb2.replace(iIndexOf, i11, uriA.toString());
                            eVar.b(uriA);
                            this.f10539b.b();
                        } else {
                            if (listK.contains(str4 + strSubstring)) {
                                j();
                                this.f10547m = true;
                            }
                            this.f10539b.c();
                        }
                    }
                } else if (com.applovin.impl.sdk.y.a()) {
                    yVar = this.f10536h;
                    str2 = this.f10535g;
                    str3 = strSubstring;
                    sbA = defpackage.a.a("Skip caching of non-resource ");
                    sbA.append(str3);
                    yVar.b(str2, sbA.toString());
                }
                i10 = i11;
            }
        }
        return sb2.toString();
    }

    public List<Future<Boolean>> a(List<com.applovin.impl.sdk.e.a> list) {
        this.f10542e = list;
        return this.f10534f.G().a(list, this.f10540c);
    }

    public void a() {
        this.f10534f.ao().b(this);
        ExecutorService executorService = this.f10540c;
        if (executorService != null) {
            executorService.shutdown();
            this.f10540c = null;
        }
        ExecutorService executorService2 = this.f10541d;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f10541d = null;
        }
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.j().equalsIgnoreCase(this.f10538a.Q())) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Updating flag for timeout...");
            }
            c();
        }
        this.f10534f.ao().b(this);
    }

    public void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.f10539b, appLovinAdBase, this.f10534f);
    }

    public Uri b(String str) {
        return a(str, this.f10538a.L(), true);
    }

    public Uri b(String str, List<String> list, boolean z10) {
        try {
            String strA = this.f10545k.a(f(), str, this.f10538a.O(), list, z10, this.f10539b);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f10545k.a(strA, f());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10536h.e(this.f10535g, "Unable to extract Uri from image file");
                    }
                } else if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to retrieve File from cached image filename = " + strA);
                }
            }
            return null;
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f10536h.b(this.f10535g, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    public c b(String str, c.a aVar) {
        return a(str, this.f10538a.L(), true, aVar);
    }

    public boolean b() {
        return this.f10547m;
    }

    public Uri c(String str) {
        return b(str, this.f10538a.L(), true);
    }

    public void c() {
        this.f10547m = true;
        List<com.applovin.impl.sdk.e.a> list = this.f10542e;
        if (list != null && !list.isEmpty()) {
            Iterator<com.applovin.impl.sdk.e.a> it = this.f10542e.iterator();
            while (it.hasNext()) {
                it.next().a(true);
            }
        }
        ExecutorService executorService = this.f10540c;
        if (executorService != null) {
            executorService.shutdown();
            this.f10540c = null;
        }
        ExecutorService executorService2 = this.f10541d;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f10541d = null;
        }
    }

    public String d(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.applovin.impl.sdk.network.c cVarA = com.applovin.impl.sdk.network.c.a(this.f10534f).a(str).b("GET").a("").a(0).a();
        final AtomicReference atomicReference = new AtomicReference(null);
        this.f10534f.I().a(cVarA, new com.applovin.impl.sdk.network.b.a(), new com.applovin.impl.sdk.network.b.d<String>() { // from class: com.applovin.impl.sdk.e.f.5
            @Override // com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str2, String str3) {
                com.applovin.impl.sdk.y yVar = f.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    f fVar = f.this;
                    com.applovin.impl.sdk.y yVar2 = fVar.f10536h;
                    String str4 = fVar.f10535g;
                    StringBuilder sbA = defpackage.a.a("Failed to load resource from '");
                    sbA.append(str);
                    sbA.append("'");
                    yVar2.e(str4, sbA.toString());
                }
            }

            @Override // com.applovin.impl.sdk.network.b.d
            public void a(String str2, int i10) {
                atomicReference.set(str2);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f10539b.a(str2.length());
        }
        return str2;
    }

    public List<com.applovin.impl.sdk.e.a> h() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f10538a.aJ() != null) {
            arrayList.add(a(this.f10538a.aJ().toString(), new c.a() { // from class: com.applovin.impl.sdk.e.f.1
                @Override // com.applovin.impl.sdk.e.c.a
                public void a(Uri uri) {
                    f.this.f10538a.e(uri);
                    com.applovin.impl.sdk.y yVar = f.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        f fVar = f.this;
                        fVar.f10536h.b(fVar.f10535g, "Ad updated with muteImageUri = " + uri);
                    }
                }
            }));
        }
        if (this.f10538a.aK() != null) {
            arrayList.add(a(this.f10538a.aK().toString(), new c.a() { // from class: com.applovin.impl.sdk.e.f.2
                @Override // com.applovin.impl.sdk.e.c.a
                public void a(Uri uri) {
                    f.this.f10538a.f(uri);
                    com.applovin.impl.sdk.y yVar = f.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        f fVar = f.this;
                        fVar.f10536h.b(fVar.f10535g, "Ad updated with unmuteImageUri = " + uri);
                    }
                }
            }));
        }
        return arrayList;
    }

    public void i() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching mute images...");
        }
        Uri uriA = a(this.f10538a.aJ(), "mute");
        if (uriA != null) {
            this.f10538a.e(uriA);
        }
        Uri uriA2 = a(this.f10538a.aK(), "unmute");
        if (uriA2 != null) {
            this.f10538a.f(uriA2);
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Ad updated with muteImageFilename = ");
            sbA.append(this.f10538a.aJ());
            sbA.append(", unmuteImageFilename = ");
            sbA.append(this.f10538a.aK());
            yVar.b(str, sbA.toString());
        }
    }

    public void j() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10544j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f10544j = null;
        }
        c();
    }

    public void k() {
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Rendered new ad:");
            sbA.append(this.f10538a);
            yVar.b(str, sbA.toString());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.f.6
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f10544j != null) {
                    f.this.f10544j.adReceived(f.this.f10538a);
                    f.this.f10544j = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f10538a.P()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Subscribing to timeout events...");
            }
            this.f10534f.ao().a(this);
        }
    }
}
