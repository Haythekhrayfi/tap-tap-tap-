package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.c.a f10563j;

    public h(com.applovin.impl.c.a aVar, com.applovin.impl.sdk.o oVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, oVar, appLovinAdLoadListener);
        this.f10563j = aVar;
    }

    private void o() {
        com.applovin.impl.sdk.y yVar;
        String str;
        String str2;
        com.applovin.impl.sdk.y yVar2;
        String str3;
        String str4;
        com.applovin.impl.sdk.y yVar3;
        String str5;
        String strA;
        if (b()) {
            return;
        }
        if (this.f10563j.bb()) {
            com.applovin.impl.c.d dVarAV = this.f10563j.aV();
            if (dVarAV != null) {
                com.applovin.impl.c.i iVarB = dVarAV.b();
                if (iVarB != null) {
                    Uri uriB = iVarB.b();
                    String string = uriB != null ? uriB.toString() : "";
                    String strC = iVarB.c();
                    if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strC)) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f10536h.d(this.f10535g, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (iVarB.a() == com.applovin.impl.c.i.a.STATIC) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f10536h.b(this.f10535g, "Caching static companion ad at " + string + "...");
                        }
                        Uri uriB2 = b(string, Collections.emptyList(), false);
                        if (uriB2 != null) {
                            iVarB.a(uriB2);
                        } else {
                            if (!com.applovin.impl.sdk.y.a()) {
                                return;
                            }
                            yVar2 = this.f10536h;
                            str3 = this.f10535g;
                            str4 = "Failed to cache static companion ad";
                        }
                    } else if (iVarB.a() == com.applovin.impl.c.i.a.HTML) {
                        if (StringUtils.isValidString(string)) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f10536h.b(this.f10535g, "Begin caching HTML companion ad. Fetching from " + string + "...");
                            }
                            strC = d(string);
                            if (!StringUtils.isValidString(strC)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f10536h.e(this.f10535g, "Unable to load companion ad resources from " + string);
                                    return;
                                }
                                return;
                            }
                            if (com.applovin.impl.sdk.y.a()) {
                                yVar3 = this.f10536h;
                                str5 = this.f10535g;
                                strA = "HTML fetched. Caching HTML now...";
                                yVar3.b(str5, strA);
                            }
                        } else if (com.applovin.impl.sdk.y.a()) {
                            yVar3 = this.f10536h;
                            str5 = this.f10535g;
                            strA = i.f.a("Caching provided HTML for companion ad. No fetch required. HTML: ", strC);
                            yVar3.b(str5, strA);
                        }
                        iVarB.a(a(strC, Collections.emptyList(), this.f10563j));
                    } else {
                        if (iVarB.a() != com.applovin.impl.c.i.a.IFRAME || !com.applovin.impl.sdk.y.a()) {
                            return;
                        }
                        yVar = this.f10536h;
                        str = this.f10535g;
                        str2 = "Skip caching of iFrame resource...";
                    }
                    this.f10563j.a(true);
                    return;
                }
                if (!com.applovin.impl.sdk.y.a()) {
                    return;
                }
                yVar2 = this.f10536h;
                str3 = this.f10535g;
                str4 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                yVar2.e(str3, str4);
                return;
            }
            if (!com.applovin.impl.sdk.y.a()) {
                return;
            }
            yVar = this.f10536h;
            str = this.f10535g;
            str2 = "No companion ad provided. Skipping...";
        } else {
            if (!com.applovin.impl.sdk.y.a()) {
                return;
            }
            yVar = this.f10536h;
            str = this.f10535g;
            str2 = "Companion ad caching disabled. Skipping...";
        }
        yVar.b(str, str2);
    }

    private void p() {
        com.applovin.impl.c.o oVarAU;
        Uri uriB;
        if (b()) {
            return;
        }
        if (!this.f10563j.bc()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f10563j.aT() == null || (oVarAU = this.f10563j.aU()) == null || (uriB = oVarAU.b()) == null) {
            return;
        }
        Uri uriA = a(uriB.toString(), Collections.emptyList(), false);
        if (uriA != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Video file successfully cached into: " + uriA);
            }
            oVarAU.a(uriA);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.e(this.f10535g, "Failed to cache video file: " + oVarAU);
        }
    }

    private void q() {
        String strAZ;
        com.applovin.impl.sdk.y yVar;
        String str;
        String string;
        if (b()) {
            return;
        }
        if (this.f10563j.ba() != null) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar2 = this.f10536h;
                String str2 = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Begin caching HTML template. Fetching from ");
                sbA.append(this.f10563j.ba());
                sbA.append("...");
                yVar2.b(str2, sbA.toString());
            }
            strAZ = a(this.f10563j.ba().toString(), this.f10563j.L());
        } else {
            strAZ = this.f10563j.aZ();
        }
        if (StringUtils.isValidString(strAZ)) {
            String strA = a(strAZ, this.f10563j.L(), ((f) this).f10538a);
            if (this.f10563j.q() && this.f10563j.isOpenMeasurementEnabled()) {
                strA = this.f10534f.ad().a(strA);
            }
            this.f10563j.a(strA);
            if (!com.applovin.impl.sdk.y.a()) {
                return;
            }
            yVar = this.f10536h;
            str = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("Finish caching HTML template ");
            sbA2.append(this.f10563j.aZ());
            sbA2.append(" for ad #");
            sbA2.append(this.f10563j.getAdIdNumber());
            string = sbA2.toString();
        } else {
            if (!com.applovin.impl.sdk.y.a()) {
                return;
            }
            yVar = this.f10536h;
            str = this.f10535g;
            string = "Unable to load HTML template";
        }
        yVar.b(str, string);
    }

    private void r() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching play & pause images...");
        }
        Uri uriA = a(((f) this).f10538a.aH(), "play");
        if (uriA != null) {
            ((f) this).f10538a.c(uriA);
        }
        Uri uriA2 = a(((f) this).f10538a.aI(), "pause");
        if (uriA2 != null) {
            ((f) this).f10538a.d(uriA2);
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Ad updated with playImageFilename = ");
            sbA.append(((f) this).f10538a.aH());
            sbA.append(", pauseImageFilename = ");
            sbA.append(((f) this).f10538a.aI());
            yVar.b(str, sbA.toString());
        }
    }

    private a s() {
        List<String> listEmptyList;
        f.a aVar;
        if (!this.f10563j.bb()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        com.applovin.impl.c.d dVarAV = this.f10563j.aV();
        if (dVarAV == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "No companion ad provided. Skipping...");
            }
            return null;
        }
        final com.applovin.impl.c.i iVarB = dVarAV.b();
        if (iVarB == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriB = iVarB.b();
        String string = uriB != null ? uriB.toString() : "";
        String strC = iVarB.c();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strC)) {
            if (iVarB.a() == com.applovin.impl.c.i.a.STATIC) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.b(this.f10535g, "Caching static companion ad at " + string + "...");
                }
                return new c(string, this.f10563j, Collections.emptyList(), false, ((f) this).f10539b, this.f10534f, new c.a() { // from class: com.applovin.impl.sdk.e.h.3
                    @Override // com.applovin.impl.sdk.e.c.a
                    public void a(Uri uri) {
                        if (uri != null) {
                            iVarB.a(uri);
                            h.this.f10563j.a(true);
                            return;
                        }
                        com.applovin.impl.sdk.y yVar = h.this.f10536h;
                        if (com.applovin.impl.sdk.y.a()) {
                            h hVar = h.this;
                            hVar.f10536h.e(hVar.f10535g, "Failed to cache static companion ad");
                        }
                    }
                });
            }
            if (iVarB.a() == com.applovin.impl.c.i.a.HTML) {
                if (StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10536h.b(this.f10535g, "Begin caching HTML companion ad. Fetching from " + string + "...");
                    }
                    strC = d(string);
                    if (StringUtils.isValidString(strC)) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f10536h.b(this.f10535g, "HTML fetched. Caching HTML now...");
                        }
                        listEmptyList = Collections.emptyList();
                        aVar = new f.a() { // from class: com.applovin.impl.sdk.e.h.4
                            @Override // com.applovin.impl.sdk.e.f.a
                            public void a(String str) {
                                iVarB.a(str);
                                h.this.f10563j.a(true);
                            }
                        };
                    } else if (com.applovin.impl.sdk.y.a()) {
                        this.f10536h.e(this.f10535g, "Unable to load companion ad resources from " + string);
                    }
                } else {
                    if (com.applovin.impl.sdk.y.a()) {
                        a0.a("Caching provided HTML for companion ad. No fetch required. HTML: ", strC, this.f10536h, this.f10535g);
                    }
                    listEmptyList = Collections.emptyList();
                    aVar = new f.a() { // from class: com.applovin.impl.sdk.e.h.5
                        @Override // com.applovin.impl.sdk.e.f.a
                        public void a(String str) {
                            iVarB.a(str);
                            h.this.f10563j.a(true);
                        }
                    };
                }
                return a(strC, listEmptyList, aVar);
            }
            if (iVarB.a() == com.applovin.impl.c.i.a.IFRAME && com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.d(this.f10535g, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.e.f
    public void j() {
        this.f10563j.o().e();
        super.j();
    }

    @Override // com.applovin.impl.sdk.e.f
    public void k() {
        this.f10563j.o().c();
        super.k();
    }

    public List<c> l() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching play & pause images...");
        }
        ArrayList arrayList = new ArrayList();
        if (((f) this).f10538a.aH() != null) {
            arrayList.add(a(((f) this).f10538a.aH().toString(), new c.a() { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.e.c.a
                public void a(Uri uri) {
                    ((f) h.this).f10538a.c(uri);
                    com.applovin.impl.sdk.y yVar = h.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        h hVar = h.this;
                        hVar.f10536h.b(hVar.f10535g, "Ad updated with playImageUri = " + uri);
                    }
                }
            }));
        }
        if (((f) this).f10538a.aI() != null) {
            arrayList.add(a(((f) this).f10538a.aI().toString(), new c.a() { // from class: com.applovin.impl.sdk.e.h.2
                @Override // com.applovin.impl.sdk.e.c.a
                public void a(Uri uri) {
                    ((f) h.this).f10538a.d(uri);
                    com.applovin.impl.sdk.y yVar = h.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        h hVar = h.this;
                        hVar.f10536h.b(hVar.f10535g, "Ad updated with pauseImageUri = " + uri);
                    }
                }
            }));
        }
        return arrayList;
    }

    public c m() {
        final com.applovin.impl.c.o oVarAU;
        Uri uriB;
        if (!this.f10563j.bc()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f10563j.aT() == null || (oVarAU = this.f10563j.aU()) == null || (uriB = oVarAU.b()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching video file " + oVarAU + " creative...");
        }
        return a(uriB.toString(), Collections.emptyList(), false, new c.a() { // from class: com.applovin.impl.sdk.e.h.6
            @Override // com.applovin.impl.sdk.e.c.a
            public void a(Uri uri) {
                if (uri == null) {
                    com.applovin.impl.sdk.y yVar = h.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        h hVar = h.this;
                        com.applovin.impl.sdk.y yVar2 = hVar.f10536h;
                        String str = hVar.f10535g;
                        StringBuilder sbA = defpackage.a.a("Failed to cache video file: ");
                        sbA.append(oVarAU);
                        yVar2.e(str, sbA.toString());
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar3 = h.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    h hVar2 = h.this;
                    hVar2.f10536h.b(hVar2.f10535g, "Video file successfully cached into: " + uri);
                }
                oVarAU.a(uri);
            }
        });
    }

    public b n() {
        if (!TextUtils.isEmpty(this.f10563j.aZ())) {
            return a(this.f10563j.aZ(), this.f10563j.L(), new f.a() { // from class: com.applovin.impl.sdk.e.h.7
                @Override // com.applovin.impl.sdk.e.f.a
                public void a(String str) {
                    if (h.this.f10563j.q() && h.this.f10563j.isOpenMeasurementEnabled()) {
                        str = h.this.f10534f.ad().a(str);
                    }
                    h.this.f10563j.a(str);
                    com.applovin.impl.sdk.y yVar = h.this.f10536h;
                    if (com.applovin.impl.sdk.y.a()) {
                        h hVar = h.this;
                        com.applovin.impl.sdk.y yVar2 = hVar.f10536h;
                        String str2 = hVar.f10535g;
                        StringBuilder sbA = defpackage.a.a("Finish caching HTML template ");
                        sbA.append(h.this.f10563j.aZ());
                        sbA.append(" for ad #");
                        sbA.append(h.this.f10563j.getAdIdNumber());
                        yVar2.b(str2, sbA.toString());
                    }
                }
            });
        }
        if (!com.applovin.impl.sdk.y.a()) {
            return null;
        }
        this.f10536h.b(this.f10535g, "Unable to load HTML template");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6 A[PHI: r0
  0x00e6: PHI (r0v31 com.applovin.impl.sdk.e.a) = (r0v30 com.applovin.impl.sdk.e.a), (r0v32 com.applovin.impl.sdk.e.a) binds: [B:42:0x00e4, B:33:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.applovin.impl.sdk.e.f, java.lang.Runnable
    public void run() {
        a aVarN;
        super.run();
        boolean zF = this.f10563j.f();
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Begin caching for VAST ");
            sbA.append(zF ? "streaming " : "");
            sbA.append("ad #");
            sbA.append(((f) this).f10538a.getAdIdNumber());
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        if (!zF) {
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l());
                arrayList.addAll(h());
                a aVarS = s();
                if (aVarS != null) {
                    arrayList.add(aVarS);
                }
                c cVarM = m();
                if (cVarM != null) {
                    arrayList.add(cVarM);
                }
                b bVarN = n();
                if (bVarN != null) {
                    arrayList.add(bVarN);
                }
                a(arrayList);
            } else {
                i();
                r();
                o();
                p();
                q();
            }
            k();
        } else if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(h());
            arrayList2.addAll(l());
            a(arrayList2);
            if (this.f10563j.m()) {
                k();
                ArrayList arrayList3 = new ArrayList();
                a aVarS2 = s();
                if (aVarS2 != null) {
                    arrayList3.add(aVarS2);
                }
                b bVarN2 = n();
                if (bVarN2 != null) {
                    arrayList3.add(bVarN2);
                }
                c cVarM2 = m();
                if (cVarM2 != null) {
                    arrayList3.add(cVarM2);
                }
                a(arrayList3);
            } else {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (this.f10563j.l() == com.applovin.impl.c.a.b.COMPANION_AD) {
                    a aVarS3 = s();
                    if (aVarS3 != null) {
                        arrayList4.add(aVarS3);
                    }
                    b bVarN3 = n();
                    if (bVarN3 != null) {
                        arrayList4.add(bVarN3);
                    }
                    a(arrayList4);
                    k();
                    aVarN = m();
                    if (aVarN != null) {
                        arrayList5.add(aVarN);
                    }
                } else {
                    c cVarM3 = m();
                    if (cVarM3 != null) {
                        arrayList4.add(cVarM3);
                    }
                    a(arrayList4);
                    k();
                    a aVarS4 = s();
                    if (aVarS4 != null) {
                        arrayList5.add(aVarS4);
                    }
                    aVarN = n();
                    if (aVarN != null) {
                        arrayList5.add(aVarN);
                    }
                }
                a(arrayList5);
            }
        } else {
            i();
            r();
            if (this.f10563j.m()) {
                k();
            }
            com.applovin.impl.c.a.b bVarL = this.f10563j.l();
            com.applovin.impl.c.a.b bVar = com.applovin.impl.c.a.b.COMPANION_AD;
            if (bVarL == bVar) {
                o();
                q();
            } else {
                p();
            }
            if (!this.f10563j.m()) {
                k();
            }
            if (this.f10563j.l() == bVar) {
                p();
            } else {
                o();
                q();
            }
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar2 = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("Finished caching VAST ad #");
            sbA2.append(this.f10563j.getAdIdNumber());
            yVar2.b(str2, sbA2.toString());
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f10563j.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f10563j, this.f10534f);
        com.applovin.impl.sdk.d.d.a(jCurrentTimeMillis, this.f10563j, this.f10534f);
        a(this.f10563j);
        this.f10563j.b();
        a();
    }
}
