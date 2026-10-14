package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f12902l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f12903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12904b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f12906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12907e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12913k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f12905c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12908f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12909g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12910h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f12904b = adSessionConfiguration;
        this.f12903a = adSessionContext;
        d(null);
        this.f12907e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12907e.i();
        c.c().a(this);
        this.f12907e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f12911i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f12902l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f12905c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.f12912j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f12906d.clear();
            }
        }
    }

    private void d(View view) {
        this.f12906d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f12913k.onPossibleObstructionsDetected(this.f12910h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f12912j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f12909g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f12905c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f12906d.get();
    }

    public List<e> d() {
        return this.f12905c;
    }

    public boolean e() {
        return this.f12913k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12909g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f12908f && !this.f12909g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f12909g) {
            return;
        }
        this.f12906d.clear();
        removeAllFriendlyObstructions();
        this.f12909g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f12907e = null;
        this.f12913k = null;
    }

    public boolean g() {
        return this.f12909g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f12910h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f12907e;
    }

    public boolean h() {
        return this.f12904b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f12904b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f12908f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f12911i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f12912j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f12909g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f12909g) {
            return;
        }
        this.f12905c.clear();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12909g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f12905c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12913k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f12908f) {
            return;
        }
        this.f12908f = true;
        c.c().c(this);
        this.f12907e.a(h.c().b());
        this.f12907e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f12907e.a(this, this.f12903a);
    }
}
